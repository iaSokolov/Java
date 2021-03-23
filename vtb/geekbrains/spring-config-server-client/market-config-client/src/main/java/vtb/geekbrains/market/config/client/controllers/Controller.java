package vtb.geekbrains.market.config.client.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vtb.geekbrains.market.config.client.repositories.ProductRepo;

@RestController
public class Controller {
    @Autowired
    private ProductRepo productRepo;

    @GetMapping("/test")
    public String test() {
        return productRepo.findAll().toString();
    }
}

