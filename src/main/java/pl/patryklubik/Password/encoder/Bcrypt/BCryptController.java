package pl.patryklubik.Password.encoder.Bcrypt;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Create by Patryk Łubik on 30.06.2021.
 */

@Controller
@RequestMapping("/")
public class BCryptController {

    private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(10);

    @GetMapping()
    public String encrypt(Model model) {

        return "encrypt";
    }

    @PostMapping()
    public String hashPassword(Model model, String password) {

        model.addAttribute("hash", passwordEncoder.encode(password));
        return "encrypt";
    }
}
