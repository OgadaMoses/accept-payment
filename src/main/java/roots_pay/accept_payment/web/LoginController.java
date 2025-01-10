package roots_pay.accept_payment.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

// The class handles the login logic for the payment site - mogada: 24th Dec 2024.
@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginPage() {
        return "login"; 
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        // Hardcoded credentials for test: mogada 10-01-2025
        String correctUsername = "admin";
        String correctPassword = "1234";

        if (username.equals(correctUsername) && password.equals(correctPassword)) {          
            return "redirect:/home"; 
        } else {
            // If the credentials are incorrect, show an error message
            model.addAttribute("errorMessage", "Invalid username or password.");
            return "login"; // Reload the login page with the error message
        }
    }
}
