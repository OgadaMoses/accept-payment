package roots_pay.accept_payment.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//the class handles the login logic for the payment site - mogada: 24th Dec 2024. 
@Controller
public class LoginController {
    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }
}
