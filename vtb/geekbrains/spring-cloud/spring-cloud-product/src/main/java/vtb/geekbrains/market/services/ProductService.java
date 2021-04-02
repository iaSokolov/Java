package vtb.geekbrains.market.services;

import org.springframework.stereotype.Service;
import vtb.geekbrains.market.models.Product;
import vtb.geekbrains.market.repositories.ProductRepo;

import java.util.List;

@Service
public class ProductService {
    final
    ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public List<Product> getEntitySet() {
        return this.productRepo.findAll();
    }

    public Product getEntity(Long productId) {
        return this.productRepo.findById(productId).orElse(null);
    }

    public void createEntity(Product product) {
        this.productRepo.save(product);
    }

    public void deleteEntity(Product product) {
        this.productRepo.delete(product);
    }
}
