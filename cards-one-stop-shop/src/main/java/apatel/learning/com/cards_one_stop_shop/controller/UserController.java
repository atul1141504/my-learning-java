package apatel.learning.com.cards_one_stop_shop.controller;

import apatel.learning.com.cards_one_stop_shop.entity.UserMgmt;
import apatel.learning.com.cards_one_stop_shop.service.UserMgmtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    private static final List<String> ROLES = Arrays.asList("ADMIN", "NORMAL");

    @Autowired
    private UserMgmtService userMgmtService;

    // — List / search users ——————————————————————————————————————————————————
    @GetMapping
    public String listUsers(
            @RequestParam(required = false) String userId,
            @RequestParam(required = false) String userName,
            @RequestParam(required = false) String reset,
            Model model,
            Authentication auth) {

        if (reset != null) {
            return "redirect:/users";
        }

        String filterUserId = userId != null ? userId.trim() : "";
        String filterUserName = userName != null ? userName.trim() : "";

        model.addAttribute("users", userMgmtService.search(filterUserId, filterUserName));
        model.addAttribute("filterUserId", filterUserId);
        model.addAttribute("filterUserName", filterUserName);
        model.addAttribute("loggedInUser", auth.getName());
        
        return "users/list";
    }

    // — Show Add form ————————————————————————————————————————————————————————
    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("user", new UserMgmt());
        model.addAttribute("roles", ROLES);
        model.addAttribute("isNew", true);
        return "users/form";
    }

    // — Show Edit form ———————————————————————————————————————————————————————
    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Long id, Model model, RedirectAttributes ra) {
        UserMgmt user = userMgmtService.getById(id);
        if (user == null) {
            ra.addFlashAttribute("errorMsg", "User not found.");
            return "redirect:/users";
        }

        model.addAttribute("user", user);
        model.addAttribute("roles", ROLES);
        model.addAttribute("isNew", false);
        return "users/form";
    }

    // — Save (add or update) —————————————————————————————————————————————————
    @PostMapping("/save")
    public String save(
            @ModelAttribute UserMgmt user,
            @RequestParam(required = false) String rawPassword,
            @RequestParam(defaultValue = "false") boolean isNew,
            RedirectAttributes ra) {

        // Duplicate username check on add
        if (isNew && userMgmtService.existsByUserName(user.getUserName())) {
            ra.addFlashAttribute("errorMsg", "Username '" + user.getUserName() + "' already exists.");
            ra.addFlashAttribute("user", user);
            ra.addFlashAttribute("roles", ROLES);
            ra.addFlashAttribute("isNew", true);
            return "redirect:/users/add";
        }

        // On add, password is required
        if (isNew && (rawPassword == null || rawPassword.isBlank())) {
            ra.addFlashAttribute("errorMsg", "Password is required for new users.");
            ra.addFlashAttribute("user", user);
            ra.addFlashAttribute("roles", ROLES);
            ra.addFlashAttribute("isNew", true);
            return "redirect:/users/add";
        }

        // On edit without new password, keep existing hash
        if (!isNew && (rawPassword == null || rawPassword.isBlank())) {
            UserMgmt existing = userMgmtService.getById(user.getUserId());
            if (existing != null) {
                user.setUserPassword(existing.getUserPassword());
            }
        }

        userMgmtService.save(user, rawPassword);
        ra.addFlashAttribute("successMsg", isNew ? "User added successfully." : "User updated successfully.");
        return "redirect:/users";
    }

    // — Delete ———————————————————————————————————————————————————————————————
    @PostMapping("/delete/{id}")
    public String delete(@PathVariable Long id, Authentication auth, RedirectAttributes ra) {
        UserMgmt user = userMgmtService.getById(id);
        if (user == null) {
            ra.addFlashAttribute("errorMsg", "User not found.");
            return "redirect:/users";
        }

        // Prevent deleting the currently logged-in user
        if (user.getUserName().equals(auth.getName())) {
            ra.addFlashAttribute("errorMsg", "You cannot delete your own account.");
            return "redirect:/users";
        }

        userMgmtService.deleteById(id);
        ra.addFlashAttribute("successMsg", "User '" + user.getUserName() + "' deleted.");
        return "redirect:/users";
    }
}

