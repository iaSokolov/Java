package vtb.geekbrains.application;

import lombok.Getter;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@Getter
public class Cart {
    private List<Product> listProduct;

    @PostConstruct
    public void postConstruct() {
        this.listProduct = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.listProduct.add(product);
    }
}
