package vtb.geekbrains.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import vtb.geekbrains.models.Product;
import vtb.geekbrains.repositories.ProductRepo;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAllProduct() {
        return this.productRepo.findAll();
    }

    public Product getById(Long productId) {
        return this.productRepo.findById(productId).orElse(null);
    }

    @Transactional
    public void save(Product product) {
        this.productRepo.save(product);
    }

    @Transactional
    public void delete(Product product) {
        this.productRepo.delete(product);
    }
}
