package vtb.geekbrains.controllers;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vtb.geekbrains.models.Product;
import vtb.geekbrains.services.ProductService;

import java.util.List;

@Getter
@Setter
@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/product")
    public String getProduct(Model model, @RequestParam(name = "search", required = false) String search) {
        List<Product> productList = this.productService.getAllProduct();

//        if (search == null || search.isEmpty()) {
//            productList = productService.getListProduct();
//        } else {
//            productList = new ArrayList<>();
//            Product product = productService.findByTitle(search);
//            if (product != null) {
//                productList.add(product);
//            }
//        }
        model.addAttribute("productList", productList);
        //model.addAttribute("search", search);
        return "product";
    }
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
//    public String getProduct(Model model, @PathVariable(value = "id") int productId) {
//        Product product = productService.findById(productId);
//        model.addAttribute("product", product);
//        return "productEdit";
//    }
//
//    @PostMapping(value = "/product/edit", params = "action=save")
//    public String saveProduct(Product product) {
//        productService.edit(product);
//        return "redirect:/product";
//    }
//
//    @PostMapping(value = "/product/edit", params = "action=delete")
//    public String deleteProduct(@ModelAttribute Product product) {
//        productService.deleteProduct(product.getId());
//        return "redirect:/product";
//    }
}
