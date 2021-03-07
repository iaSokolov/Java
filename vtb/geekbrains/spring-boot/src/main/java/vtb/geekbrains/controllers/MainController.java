package vtb.geekbrains.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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
    public String getProduct(Model model, @RequestParam(name = "search", required = false) String search) {
        List<Product> productList = null;

        if (search == null || search.isEmpty()) {
            productList = productService.getListProduct();
        } else {
            productList = new ArrayList<>();
            Product product = productService.findByTitle(search);
            if (product != null) {
                productList.add(product);
            }
        }
        model.addAttribute("productList", productList);
        model.addAttribute("search", search);
        return "product";
    }

    @GetMapping("/product/{id}")
    public String getProduct(Model model, @PathVariable(value = "id") int productId) {
        Product product = productService.findById(productId);
        model.addAttribute("product", product);
        return "productView";
    }

    @PostMapping(value = "/product/edit", params ="action=save")
    public String saveProduct(Product _product){
        Product product = productService.findById(_product.getId());
        if (product != null) {
            product.setTitle(_product.getTitle());
            product.setCost(_product.getCost());
        }
        return  "redirect:/product";
    }

    @PostMapping(value = "/product/edit", params ="action=delete")
    public String deleteProduct(@ModelAttribute Product product){
        productService.deleteProduct(product.getId());
        return  "redirect:/product";
    }
}
