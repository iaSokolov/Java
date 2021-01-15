package vtb.geekbrains;

import java.sql.*;

public class App {
    public static void main(String[] args) {
        try {
            BD dataBase = BD.getInstance();
            try {
                dataBase.connect();
                createComix();
            } catch (SQLException e) {
                System.out.println(String.format("При выполнении запроса произошла ошибка: %s", e.getMessage()));
            }
            finally {
                try {
                    dataBase.disconnect();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void createComix() {
        Comix comix = new Comix("Супермен идет на помощь", "Супергерои");
        DBTable table = new DBTable(comix);
        comix.save();
    }
}