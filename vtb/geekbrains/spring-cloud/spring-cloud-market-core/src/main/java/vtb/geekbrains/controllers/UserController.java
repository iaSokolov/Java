package vtb.geekbrains.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vtb.geekbrains.models.Authority;
import vtb.geekbrains.models.Role;
import vtb.geekbrains.models.User;
import vtb.geekbrains.repositories.AuthoritiesRepo;
import vtb.geekbrains.repositories.RoleRepo;
import vtb.geekbrains.services.UserService;

import java.util.List;

@Controller
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    AuthoritiesRepo authoritiesRepo;

    @Autowired
    RoleRepo roleRepo;

    @GetMapping
    public String getSales(Model model) {
        List<Authority> authorityList = authoritiesRepo.findAll();

        List<User> users = this.userService.getAll();

        List<Role> roles = this.roleRepo.findAll();

        model.addAttribute("users", this.userService.getAll());
        return "users";
    }
}
