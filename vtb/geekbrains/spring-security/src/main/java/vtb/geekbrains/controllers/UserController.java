package vtb.geekbrains.controllers;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vtb.geekbrains.services.SaleService;

@Controller
@RequestMapping(value = "/sales")
public class SalesController {
    @Autowired
    SaleService saleService;

    @GetMapping
    public String getSales(Model model) {
        model.addAttribute("sales", this.saleService.getAll());
        return "sales";
    }
}
