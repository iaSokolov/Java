package vtb.geekbrains.market.controllers;

import org.springframework.web.bind.annotation.*;
import vtb.geekbrains.market.models.Product;
import vtb.geekbrains.market.services.ProductService;

import java.util.List;

@RestController
public class ProductController {
    final
    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/product")
    public List<Product> getProductSet() {
        List<Product> productList = this.productService.getEntitySet();
        return productList;
    }

    @GetMapping("/product/{id}")
    public Product getProductEntity(@PathVariable(value = "id") Long productId) {
        return this.productService.getEntity(productId);
    }

    @PostMapping("/product")
    public void createProductEntity(@RequestBody Product product) {
        this.productService.createEntity(product);
    }

    @DeleteMapping("/product")
    public void deleteProductEntity(@RequestBody Product product) {
        this.productService.deleteEntity(product);
    }
}