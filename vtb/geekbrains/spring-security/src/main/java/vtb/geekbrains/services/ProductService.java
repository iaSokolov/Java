package vtb.geekbrains.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import vtb.geekbrains.models.Product;
import vtb.geekbrains.repositories.ProductRepo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

    public List<Product> getPageProduct(int pageNumber, int size) {
        List<Product> productList = new ArrayList<>();
        Pageable page = PageRequest.of(pageNumber, size);
        for (Product product : this.productRepo.findAll(page)) {
            productList.add(product);
        }
        return productList;
    }

    public List<Product> getAllProduct() {
        List<Product> productList = new ArrayList<>();
        for (Product product : this.productRepo.findAll()) {
            productList.add(product);
        }
        return productList;
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

    public long getCount() {
        return this.productRepo.count();
    }

    public Product getNew() {
        return new Product("", BigDecimal.valueOf(0));
    }
}
