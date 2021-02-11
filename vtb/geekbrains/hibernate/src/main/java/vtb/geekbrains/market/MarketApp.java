package vtb.geekbrains.market;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MarketApp {
    public static SessionFactory factory;
    public static void main(String[] args) {
        try {
            factory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Product.class)
                    .addAnnotatedClass(Customer.class)
                    .addAnnotatedClass(Sale.class)
                    .buildSessionFactory();

            new Terminal().input();
        } catch (Exception ex) {
            System.out.println("ошибка: " + ex.getMessage());
        } finally {
            factory.getCurrentSession().close();
            factory.close();
        }
    }
}
