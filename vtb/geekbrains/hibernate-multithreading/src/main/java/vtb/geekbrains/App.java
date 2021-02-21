package vtb.geekbrains;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class App {
    public static SessionFactory factory;

    public static void main(String[] args) {
        try {
            factory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .buildSessionFactory();

            factory.getCurrentSession().beginTransaction();
            String request = Files.lines(Paths.get("factory.sql")).collect(Collectors.joining(" "));
            factory.getCurrentSession().createNativeQuery(request).executeUpdate();
            factory.getCurrentSession().getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("ошибка: " + ex.getMessage());
        } finally {
            if (factory != null) {
                factory.getCurrentSession().close();
                factory.close();
            }
        }
    }
}
