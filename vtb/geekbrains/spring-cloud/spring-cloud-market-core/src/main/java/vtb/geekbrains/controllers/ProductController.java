package vtb.geekbrains.controllers;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vtb.geekbrains.models.Page;
import vtb.geekbrains.models.Product;
import vtb.geekbrains.services.ProductService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/product")
    public String getProduct(Model model,
                             @RequestParam(name = "search", required = false) String search,
                             @RequestParam(name = "page", required = false) String page) {



        model.addAttribute("productList", productService.getAllProduct());
        return "product";
    }

//    @GetMapping("/product/new")
//    public String getProductCreate(Model model) {
//        Product product = this.productService.getNew();
//        model.addAttribute("product", product);
//        return "productCreate";
//    }
//
//    @PostMapping(value = "/product/new", params = "action=create")
//    public String postProductCreate(Product product) {
//        this.productService.save(product);
//        return "redirect:/product";
//    }

    //
//    @GetMapping("/searchProduct")
//    public String getSearchProduct(Model model) {
//        model.addAttribute("search", new SearchProduct());
//        return "searchProduct";
//    }
//
//    @PostMapping("/searchProduct")
//    public String postSearchProduct(Model model, @ModelAttribute SearchProduct search) {
//        model.addAttribute("search", search);
//        model.addAttribute("productList", productService.search(search));
//        return "searchProduct";
//    }
//
//    @GetMapping("/product/{id}")
//    public String getProduct(Model model, @PathVariable(value = "id") Long productId) {
//        Product product = this.productService.getById(productId);
//        model.addAttribute("product", product);
//        return "productEdit";
//    }
//
//    @PostMapping(value = "/product/edit", params = "action=save")
//    public String saveProduct(Product product) {
//        this.productService.save(product);
//        return "redirect:/product";
//    }
//
//    @PostMapping(value = "/product/edit", params = "action=delete")
//    public String deleteProduct(@ModelAttribute Product product) {
//        this.productService.delete(product);
//        return "redirect:/product";
//    }
}
