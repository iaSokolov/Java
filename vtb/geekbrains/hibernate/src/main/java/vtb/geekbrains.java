package vtb;

import de.vandermeer.asciitable.AsciiTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class geekbrains {
    public static void main(String[] args) {
//        AsciiTable at = new AsciiTable();
//        at.addRule();
//        at.addRow("Column 1", "Column 2");
//        System.out.println(at.render());

        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = null;
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/single","postgres", "admin");
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
