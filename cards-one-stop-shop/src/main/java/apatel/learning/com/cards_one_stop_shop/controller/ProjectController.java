package apatel.learning.com.cards_one_stop_shop.controller;

import apatel.learning.com.cards_one_stop_shop.entity.ProjectData;
import apatel.learning.com.cards_one_stop_shop.service.ProjectDataService;
import apatel.learning.com.cards_one_stop_shop.service.UserMgmtService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.Year;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/projects")
public class ProjectController {

    private static final List<String> PLATFORMS = Arrays.asList(
            "NA-Cons", "NA-Cons & Comm", "INT-Cons", "INT-Cons & Comm", "All TS2 Platforms"
    );

    private static final List<String> STATUSES = Arrays.asList(
            "Analysis", "SWT", "Design", "Development & UT", "DWT", "TR",
            "DWT & TR", "DvWT", "Q-Testing", "V-Testing", "CTV Received",
            "Completed", "On Hold", "Cancelled", "Reassigned"
    );

    @Autowired
    private ProjectDataService projectDataService;

    @Autowired
    private UserMgmtService userMgmtService;

    @GetMapping
    public String listProjects(
            @RequestParam(required = false) String projectId,
            @RequestParam(required = false) String projectDescription,
            @RequestParam(required = false) String fromYear,
            @RequestParam(required = false) String toYear,
            @RequestParam(required = false) String month,
            @RequestParam(required = false) String status,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(required = false) String filtered,
            @RequestParam(required = false) String reset,
            HttpSession session,
            Model model,
            Authentication auth) {

        if (reset != null) {
            session.removeAttribute("filter_projectId");
            session.removeAttribute("filter_projectDescription");
            session.removeAttribute("filter_fromYear");
            session.removeAttribute("filter_toYear");
            session.removeAttribute("filter_month");
            session.removeAttribute("filter_status");
            return "redirect:/projects";
        }

        if (filtered != null) {
            // Explicit Search form submission – save current filter values to session
            session.setAttribute("filter_projectId", projectId != null ? projectId : "");
            session.setAttribute("filter_projectDescription", projectDescription != null ? projectDescription : "");
            session.setAttribute("filter_fromYear", fromYear != null ? fromYear : "");
            session.setAttribute("filter_toYear", toYear != null ? toYear : "");
            session.setAttribute("filter_month", month != null ? month : "");
            session.setAttribute("filter_status", status != null ? status : "");
        } else {
            // Navigation (edit/add/save redirect) – restore from session if available
            String sessId = (String) session.getAttribute("filter_projectId");
            if (sessId != null) {
                projectId = sessId;
                projectDescription = (String) session.getAttribute("filter_projectDescription");
                fromYear = (String) session.getAttribute("filter_fromYear");
                toYear = (String) session.getAttribute("filter_toYear");
                month = (String) session.getAttribute("filter_month");
                status = (String) session.getAttribute("filter_status");
            } else {
                projectId = projectId != null ? projectId : "";
                projectDescription = projectDescription != null ? projectDescription : "";
                fromYear = fromYear != null ? fromYear : "";
                toYear = toYear != null ? toYear : "";
                month = month != null ? month : "";
                status = status != null ? status : "";
            }
        }

        Page<ProjectData> projectPage = projectDataService.getProjects(
                projectId, projectDescription, fromYear, toYear, month, status, page);

        int currentYear = Year.now().getValue();
        List<Integer> years = IntStream.rangeClosed(2000, currentYear + 5)
                .boxed()
                .collect(Collectors.toList());

        List<String[]> months = Arrays.asList(
                new String[]{"JAN", "Jan"}, new String[]{"FEB", "Feb"}, new String[]{"MAR", "Mar"},
                new String[]{"APR", "Apr"}, new String[]{"MAY", "May"}, new String[]{"JUN", "Jun"},
                new String[]{"JUL", "Jul"}, new String[]{"AUG", "Aug"}, new String[]{"SEP", "Sep"},
                new String[]{"OCT", "Oct"}, new String[]{"NOV", "Nov"}, new String[]{"DEC", "Dec"}
        );

        model.addAttribute("projects", projectPage.getContent());
        model.addAttribute("totalPages", projectPage.getTotalPages());
        model.addAttribute("currentPage", page);
        model.addAttribute("projectId", projectId);
        model.addAttribute("projectDescription", projectDescription);
        model.addAttribute("fromYear", fromYear);
        model.addAttribute("toYear", toYear);
        model.addAttribute("month", month);
        model.addAttribute("status", status);
        model.addAttribute("statuses", STATUSES);
        model.addAttribute("years", years);
        model.addAttribute("months", months);
        model.addAttribute("loggedInUser", auth.getName());
        model.addAttribute("isAdmin", auth.getAuthorities().contains(new SimpleGrantedAuthority("ROLE_ADMIN")));
        
        return "projects/list";
    }

    @GetMapping("/add")
    public String addForm(Model model, Authentication auth) {
        model.addAttribute("project", new ProjectData());
        addFormData(model, auth);
        return "projects/form";
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable String id, Model model, Authentication auth) {
        ProjectData project = projectDataService.getById(id);
        if (project == null) return "redirect:/projects";
        
        if (!isAuthorizedToEdit(project, auth)) {
            return "redirect:/projects?accessDenied=true";
        }
        
        model.addAttribute("project", project);
        addFormData(model, auth);
        return "projects/form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute ProjectData project, Authentication auth) {
        boolean isAdmin = auth.getAuthorities().contains(new SimpleGrantedAuthority("ROLE_ADMIN"));
        
        if (!isAdmin) {
            String pid = project.getProjectId();
            if (pid != null && !pid.isBlank()) {
                // Edit case: fetch fresh from DB and verify ownership
                ProjectData existing = projectDataService.getById(pid);
                if (existing != null && !isAuthorizedToEdit(existing, auth)) {
                    return "redirect:/projects?accessDenied=true";
                }
                if (existing != null) {
                    // Preserve the original assignedTo – non-admin cannot change it
                    project.setAssignedTo(existing.getAssignedTo());
                } else {
                    // New project: assign to the logged-in user
                    project.setAssignedTo(auth.getName());
                }
            } else {
                project.setAssignedTo(auth.getName());
            }
        }
        
        projectDataService.save(project);
        return "redirect:/projects";
    }

    private boolean isAuthorizedToEdit(ProjectData project, Authentication auth) {
        boolean isAdmin = auth.getAuthorities().contains(new SimpleGrantedAuthority("ROLE_ADMIN"));
        if (isAdmin) return true;
        
        String assignedTo = project.getAssignedTo();
        return assignedTo != null && !assignedTo.isBlank() && assignedTo.equals(auth.getName());
    }

    private void addFormData(Model model, Authentication auth) {
        boolean isAdmin = auth.getAuthorities().contains(new SimpleGrantedAuthority("ROLE_ADMIN"));
        model.addAttribute("platforms", PLATFORMS);
        model.addAttribute("statuses", STATUSES);
        model.addAttribute("isAdmin", isAdmin);
        
        if (isAdmin) {
            model.addAttribute("users", userMgmtService.getAllUsers());
        } else {
            model.addAttribute("currentUserName", auth.getName());
        }
    }
}

