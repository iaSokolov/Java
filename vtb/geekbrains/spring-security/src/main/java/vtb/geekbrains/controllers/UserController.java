package vtb.geekbrains.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vtb.geekbrains.services.UserService;

@Controller
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public String getSales(Model model) {
        model.addAttribute("users", this.userService.getAll());
        return "users";
    }
}
