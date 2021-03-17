package vtb.geekbrains.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
