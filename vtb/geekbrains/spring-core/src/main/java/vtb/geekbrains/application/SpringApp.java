package vtb.geekbrains.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import vtb.geekbrains.config.ConfigApp;

import java.math.BigDecimal;

public class SpringApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);

        Cart cart = context.getBean(Cart.class);
        cart.addProduct(new Product(11, "new Item 11", BigDecimal.valueOf(11)) );

        OrderService service = context.getBean(OrderService.class);
        service.sale();

        System.out.println("end-of-program");
    }
}
