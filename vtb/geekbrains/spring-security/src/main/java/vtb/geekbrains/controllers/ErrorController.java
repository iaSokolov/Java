package vtb.geekbrains.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {
    @GetMapping
    public String getError() {
        return "error";
    }
}
