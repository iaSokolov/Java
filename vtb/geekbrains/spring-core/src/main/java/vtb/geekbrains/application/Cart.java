package vtb.geekbrains.application;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Cart {
    @Autowired
    ProductService productService;

    public void addProduct(Product product) {
        productService.getListProduct().add(product);
    }
}
