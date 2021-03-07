package vtb.geekbrains.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vtb.geekbrains.entities.Product;
import vtb.geekbrains.services.ProductService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {
    @Autowired
    ProductService productService;


    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/product")
    public String getProduct(Model model, @RequestParam(name = "search") String search ) {

        List<Product> productList = null;

        if (search.isEmpty()) {
            productList = productService.getListProduct();
        } else {
            productList = new ArrayList<>();
            Product product = productService.findByTitle(search);
            if (product != null) {
                productList.add(product);
            }
        }
        model.addAttribute ( "productList", productList);
        model.addAttribute ( "search", search);
        return "product";
    }
}
