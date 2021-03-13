package vtb.geekbrains.application;

import lombok.Getter;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
@Getter
public class ProductService {
    private List<Product> listProduct;

    public void printAll() {
        for (Product product : this.listProduct) {
            System.out.println(product.toString());
        }
    }

    public Product findByTitle(String title) {
        Product product = this.listProduct
                .stream()
                .filter(item -> item.getTitle().equals(title))
                .findFirst()
                .orElse(null);
        return product;
    }

    @PostConstruct
    public void postConstruct() {
        this.listProduct = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            this.listProduct.add(new Product(i, String.format("Item %s", i), BigDecimal.valueOf(i)));
        }
    }
}
