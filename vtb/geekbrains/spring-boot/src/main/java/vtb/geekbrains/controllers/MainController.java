package vtb.geekbrains.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/product")
    public String getProduct() {
        return "product";
    }
}
