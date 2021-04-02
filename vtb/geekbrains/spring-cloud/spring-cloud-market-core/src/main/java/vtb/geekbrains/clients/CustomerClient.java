package vtb.geekbrains.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import vtb.geekbrains.models.Product;

import java.util.List;

@FeignClient("product")
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



