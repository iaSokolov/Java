package vtb.geekbrains.hibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HibernateApp {
    public static void main(String[] args) {
        //        AsciiTable at = new AsciiTable();
        //        at.addRule();
        //        at.addRow("Column 1", "Column 2");
        //        System.out.println(at.render());

        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = null;
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/single", "postgres", "admin");

            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO comix (comix_name) VALUES ('новое значение');");
            statement.close();

            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
