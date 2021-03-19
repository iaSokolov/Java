package vtb.geekbrains.controllers;

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

@Getter
@Setter
@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/product")
    public String getProduct(Model model,
                             @RequestParam(name = "search", required = false) String search,
                             @RequestParam(name = "page", required = false) String page) {

        List<Product> productList = null;
        if (page != null && !page.isEmpty()) {
            productList = this.productService.getPageProduct(Integer.valueOf(page) - 1, 5);
        } else {
            productList = this.productService.getPageProduct(0, 5);
        }


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

        ArrayList<Page> listPage = new ArrayList<>();
        Integer pageNumber;
        long countProduct = this.productService.getCount();
        int pages = (int) (countProduct / 5);
        if (countProduct % 5 > 0) {
            pages++;
        }
        for (pageNumber = 1; pageNumber <= pages; pageNumber++) {
            listPage.add(new Page(pageNumber));
        }
        model.addAttribute("pages", listPage);
        return "product";
    }

    @GetMapping("/product/new")
    public String getProductCreate(Model model) {
        Product product = this.productService.getNew();
        model.addAttribute("product", product);
        return "productCreate";
    }

    @PostMapping(value = "/product/new", params = "action=create")
    public String postProductCreate(Product product) {
        this.productService.save(product);
        return "redirect:/product";
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
    @GetMapping("/product/{id}")
    public String getProduct(Model model, @PathVariable(value = "id") Long productId) {
        Product product = this.productService.getById(productId);
        model.addAttribute("product", product);
        return "productEdit";
    }

    @PostMapping(value = "/product/edit", params = "action=save")
    public String saveProduct(Product product) {
        this.productService.save(product);
        return "redirect:/product";
    }

    @PostMapping(value = "/product/edit", params = "action=delete")
    public String deleteProduct(@ModelAttribute Product product) {
        this.productService.delete(product);
        return "redirect:/product";
    }
}
