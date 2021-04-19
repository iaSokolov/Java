package vtb.geekbrains.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import vtb.geekbrains.configuration.FeignClientConfiguration;
import vtb.geekbrains.models.Product;

import java.util.List;

@FeignClient(name = "product", configuration = FeignClientConfiguration.class)
public interface ProductClient {
    @GetMapping("/product")
    public List<Product> getAll();

    @GetMapping("/product/{id}")
    public Product getById(@PathVariable(value = "id") Long productId);

    @PostMapping("/product")
    public Product save(Product product);

    @DeleteMapping("/product")
    void delete(Product product);
}



