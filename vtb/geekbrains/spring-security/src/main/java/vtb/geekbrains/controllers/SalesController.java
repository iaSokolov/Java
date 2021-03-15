package vtb.geekbrains.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/sales")
public class SalesController {
    @GetMapping
    public String getSales() {
        return "sales";
    }
}
