package vtb.geekbrains.services;

import lombok.Getter;
import org.springframework.stereotype.Component;
import vtb.geekbrains.entities.Product;
import vtb.geekbrains.entities.SearchProduct;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Getter
public class ProductService {
    private List<Product> listProduct;

    public void printAll() {
        for (Product product : this.listProduct) {
            System.out.println(product.toString());
        }
    }

    public void deleteProduct(int productId) {
        Product product = findById(productId);
        if (product != null) {
            this.listProduct.remove(product);
        }
    }

    public Product findById(int productId) {
        Product product = this.listProduct
                .stream()
                .filter(item -> item.getId() == productId)
                .findFirst()
                .orElse(null);
        return product;
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

    public List<Product> search(SearchProduct searchParameters) {
        return this.listProduct
                .stream()
                .filter(item ->
                        item.getCost().compareTo(searchParameters.getMinCost()) >= 0 &&
                        item.getCost().compareTo(searchParameters.getMaxCost()) <= 0)
                .collect(Collectors.toList());
    }

    public void edit(Product _product) {
        Product product = this.findById(_product.getId());
        if (product != null) {
            product.setTitle(_product.getTitle());
            product.setCost(_product.getCost());
        }
    }
}
