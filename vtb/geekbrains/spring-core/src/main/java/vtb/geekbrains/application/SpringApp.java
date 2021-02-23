package vtb.geekbrains.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import vtb.geekbrains.config.ConfigApp;

import java.math.BigDecimal;

public class SpringApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);

        ProductService productService = context.getBean(ProductService.class);
        Cart cart = context.getBean(Cart.class);
        OrderService service = context.getBean(OrderService.class);

        cart.addProduct(productService.findByTitle("Item 1"));
        service.sale();

        System.out.println("end-of-program");
    }
}
