package vtb.geekbrains.market;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class MarketApp {
    public static SessionFactory factory;
    public static Session session;

    public static void main(String[] args) {
        try {
            factory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Product.class)
                    .addAnnotatedClass(Customer.class)
                    .buildSessionFactory();

            session = factory.getCurrentSession();

            new Terminal().input();

//            session.beginTransaction();
//
//            Product product1 = new Product("item 1");
//            session.save(product1);
//
//            Product product2 = new Product("item 2");
//            session.save(product2);
//            session.getTransaction().commit();
//
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Customer customer = new Customer("cust 1");
//            customer.setProduct(Arrays.asList(product1, product2));
//            session.save(customer);
//
//            session.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("ошибка:" + ex.getMessage());
        } finally {
            factory.close();
            session.close();
        }
    }
}
