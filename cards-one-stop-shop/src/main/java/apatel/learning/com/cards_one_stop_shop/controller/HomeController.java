package apatel.learning.com.cards_one_stop_shop.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"/", "/home"})
    public String home(Model model, Authentication auth) {
        model.addAttribute("loggedInUser", auth.getName());
        model.addAttribute("isAdmin", auth.getAuthorities().contains(new SimpleGrantedAuthority("ROLE_ADMIN")));
        return "home";
    }
}

