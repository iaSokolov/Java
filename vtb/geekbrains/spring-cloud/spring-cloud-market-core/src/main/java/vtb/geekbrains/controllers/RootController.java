package vtb.geekbrains.controllers;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Getter
@Setter
public class RootController {
    @GetMapping("/")
    public String getIndex() {
        return "index";
    }
}
