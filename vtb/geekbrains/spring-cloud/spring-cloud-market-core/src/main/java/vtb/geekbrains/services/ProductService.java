package vtb.geekbrains.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vtb.geekbrains.clients.ProductClient;
import vtb.geekbrains.models.Product;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductClient productClient;

    public List<Product> getAllProduct() {
        return this.productClient.getAllProduct();
    }
}
