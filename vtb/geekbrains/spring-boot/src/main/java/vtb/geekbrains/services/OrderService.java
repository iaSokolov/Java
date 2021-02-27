package vtb.geekbrains.services;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vtb.geekbrains.entities.Cart;
import vtb.geekbrains.entities.Product;

@Component
@Getter
public class OrderService {
    @Autowired
    Cart cart;

    public void sale() {
        double amount = 0;
        for (Product product: this.cart.getListProduct()) {
            System.out.println(product.toString());
            amount += product.getCost().doubleValue();
        }
        System.out.println(String.format("Итого: %f руб.", amount));
    }
}