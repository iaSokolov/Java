package vtb.geekbrains.services;

import lombok.Getter;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vtb.geekbrains.dao.ProductDao;

import vtb.geekbrains.entity.Product;

import java.util.List;

@Component
@Getter
@Setter
public class ProductService {
    private ProductDao productDao;

    @Autowired
    public ProductService(ProductDao productDao) {
        this.productDao = productDao;
    }

    public List<Product> getAllProduct() {
        return this.productDao.getAllProduct();
    }
}
