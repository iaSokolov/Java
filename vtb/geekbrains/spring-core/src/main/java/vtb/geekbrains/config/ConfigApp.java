package vtb.geekbrains.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import vtb.geekbrains.application.Product;

@Configuration
@ComponentScan("vtb.geekbrains.application")
public class ConfigApp {
//    @Bean
//    public Product product() {
//        Product product = new Product();
//        return product;
//    }
}
