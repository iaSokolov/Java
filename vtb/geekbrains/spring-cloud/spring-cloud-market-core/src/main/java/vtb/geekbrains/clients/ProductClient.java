package vtb.geekbrains.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import vtb.geekbrains.models.Product;

import java.util.List;

@FeignClient("product-service")
public interface ProductClient {
    @GetMapping("/product")
    public List<Product> getAllProduct();
}
