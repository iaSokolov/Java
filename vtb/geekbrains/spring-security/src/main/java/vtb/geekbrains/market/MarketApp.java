package vtb.geekbrains.market;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;
import vtb.geekbrains.entity.Customer;
import vtb.geekbrains.entity.Product;
import vtb.geekbrains.entity.Sale;

import javax.annotation.PostConstruct;

@Component
public class MarketApp {
    public SessionFactory factory;

    public MarketApp() {
    }

    @PostConstruct
    public void init() throws Exception {
        this.factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Product.class)
                .addAnnotatedClass(Customer.class)
                .addAnnotatedClass(Sale.class)
                .buildSessionFactory();
    }

    public void finall() {
        if (this.factory != null) {
            this.factory.getCurrentSession().close();
            this.factory.close();
        }
    }
}
