package vtb.geekbrains;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class BD {
    private static BD instance;

    private Connection connection;

    public void connect() throws SQLException {
        if (this.connection == null) {
            this.connection = DriverManager.getConnection("jdbc:sqlite:/Users/user/java_project/GitHub/vtb/geekbrains/reflection/reflection.db");
        }
    }

    public void disconnect() throws SQLException {
        if (this.connection != null) {
            this.connection.close();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    private BD() throws RuntimeException {
        try {
            Class.forName("org.sqlite.JDBC");
        }
        catch (ClassNotFoundException ex) {
            new RuntimeException("База данных не поддерживается");
        }
    }

    public static BD getInstance() throws RuntimeException {
        if (instance == null) {
            instance = new BD();
        }
        return instance;
    }
}