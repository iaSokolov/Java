package vtb.geekbrains.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import vtb.geekbrains.models.Product;
import vtb.geekbrains.models.Sale;

import java.util.List;

@FeignClient("sales")
public interface SalesClient {
    @GetMapping("/sales")
    public List<Sale> getAll();

    @GetMapping("/sale")
    public Sale getById(@RequestParam(name = "product_id") Long product_id,
                        @RequestParam(name = "customer_id") Long customer_id);

    @PostMapping("/sale")
    public Sale save(Sale sale);

    @DeleteMapping("/sale")
    void delete(Sale sale);
}



