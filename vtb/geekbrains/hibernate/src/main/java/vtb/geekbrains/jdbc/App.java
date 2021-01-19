package vtb.geekbrains.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) {
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
