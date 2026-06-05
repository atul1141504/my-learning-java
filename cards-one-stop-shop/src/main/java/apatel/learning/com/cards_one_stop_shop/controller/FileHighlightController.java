package apatel.learning.com.cards_one_stop_shop.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * Controller for the File Highlighter feature.
 *
 * Highlighting rules (1-based column positions):
 * - If columns 2-4 contain "I -" -> highlight columns 1-60 with green
 * - If columns 63-65 contain "D -" -> highlight columns 63-121 with light red
 */
@Controller
@RequestMapping("/file-highlight")
public class FileHighlightController {

    @GetMapping
    public String showPage(Model model, Authentication auth) {
        addCommonAttributes(model, auth);
        return "file-highlight";
    }

    @PostMapping("/process")
    public String processFile(@RequestParam("file") MultipartFile file,
                              Model model,
                              Authentication auth) {
        
        if (file == null || file.isEmpty()) {
            model.addAttribute("errorMsg", "Please select a file before clicking Process.");
            return "file-highlight";
        }

        List<String> processedLines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(file.getInputStream(), StandardCharsets.UTF_8))) {

            String rawLine;
            while ((rawLine = reader.readLine()) != null) {
                processedLines.add(buildHighlightedHtml(rawLine));
            }

        } catch (IOException e) {
            model.addAttribute("errorMsg", "Failed to read the uploaded file: " + e.getMessage());
            return "file-highlight";
        }

        model.addAttribute("processedLines", processedLines);
        model.addAttribute("fileName", file.getOriginalFilename());
        return "file-highlight";
    }

    // — Helper's —————————————————————————————————————————————————————————————

    /**
     * Applies highlight rules to one line. All content is HTML-escaped before
     * insertion so no XSS is possible from file content.
     *
     * Rules (1-based column positions):
     *
     * NEW - no pipe at col 61:
     * a. cols 2-4 = "I -" -> cols 1-85 green
     * b. cols 2-4 = "D -" -> cols 1-85 green
     *
     * ORIGINAL - pipe '|' present at col 61;
     * c. cols 2-4 = "I -" -> cols 1-60 green
     * d. cols 63-65 = "D -" -> cols 63-121 light-red
     */
    private String buildHighlightedHtml(String line) {
        // col 61 = 0-based index 60
        boolean hasPipeAtCol61 = line.length() >= 61 && line.charAt(60) == '|';

        // cols 2-4 = 0-based substring(1, 4)
        boolean startsWithI = line.length() >= 4 && "I -".equals(line.substring(1, 4));
        boolean startsWithD = line.length() >= 4 && "D -".equals(line.substring(1, 4));

        StringBuilder sb = new StringBuilder();

        if (!hasPipeAtCol61 && startsWithI) {
            // — No pipe + 'I -' at cols 2-4 -> cols 1-85 green —
            String seg1 = safeSubstring(line, 0, 85);       // cols 1-85
            String seg2 = safeSubstring(line, 85, 135);     // cols 86-135

            if (!seg1.isEmpty()) {
                sb.append("<span class=\"hl-green\">").append(escapeHtml(seg1)).append("</span>");
            }
            sb.append(escapeHtml(seg2));

        } else if (!hasPipeAtCol61 && startsWithD) {
            // — No pipe + 'D -' at cols 2-4 -> cols 1-85 light red —
            String seg1 = safeSubstring(line, 0, 85);       // cols 1-85
            String seg2 = safeSubstring(line, 85, 135);     // cols 86-135

            if (!seg1.isEmpty()) {
                sb.append("<span class=\"hl-red\">").append(escapeHtml(seg1)).append("</span>");
            }
            sb.append(escapeHtml(seg2));

        } else {
            // — ORIGINAL rules: pipe present (or no matching prefix) —
            boolean highlightGreen = startsWithI;
            boolean highlightRed = line.length() >= 65
                    && "D -".equals(line.substring(62, 65));

            // Segment 1 - cols 1-60 (idx 0-59)
            String seg1 = safeSubstring(line, 0, 60);
            if (!seg1.isEmpty()) {
                if (highlightGreen) {
                    sb.append("<span class=\"hl-green\">").append(escapeHtml(seg1)).append("</span>");
                } else {
                    sb.append(escapeHtml(seg1));
                }
            }

            // Segment 2 - cols 61-62 (idx 60-61, never highlighted)
            String seg2 = safeSubstring(line, 60, 62);
            sb.append(escapeHtml(seg2));

            // Segment 3 - cols 63-121 (idx 62-120)
            String seg3 = safeSubstring(line, 62, 121);
            if (!seg3.isEmpty()) {
                if (highlightRed) {
                    sb.append("<span class=\"hl-red\">").append(escapeHtml(seg3)).append("</span>");
                } else {
                    sb.append(escapeHtml(seg3));
                }
            }

            // Segment 4 - cols 122-135 (idx 121-134, never highlighted)
            String seg4 = safeSubstring(line, 121, 135);
            sb.append(escapeHtml(seg4));
        }

        return sb.toString();
    }

    /**
     * Returns a substring clamped to the actual string length; never throws.
     */
    private String safeSubstring(String s, int start, int end) {
        if (start >= s.length()) return "";
        return s.substring(start, Math.min(end, s.length()));
    }

    /**
     * Minimal HTML escaping to prevent XSS from file content.
     */
    private String escapeHtml(String s) {
        if (s == null || s.isEmpty()) return s == null ? "" : s;
        return s.replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;")
                .replace("\"", "&quot;");
    }

    private void addCommonAttributes(Model model, Authentication auth) {
        model.addAttribute("loggedInUser", auth.getName());
        model.addAttribute("isAdmin", auth.getAuthorities()
                .contains(new SimpleGrantedAuthority("ROLE_ADMIN")));
    }
}

