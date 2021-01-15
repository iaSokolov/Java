package vtb.geekbrains;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Table(title="ComixTable")
public class Comix {
    @Column(name = "comixName", key = true)
    private String name;

    @Column(name = "comixCategory")
    private String category;

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public Comix(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public void save() {
        try {
            PreparedStatement statement = BD.getInstance()
                    .getConnection()
                    .prepareStatement("INSERT INTO ComixTable (comixName, comixCategory) VALUES (?, ?);");
            statement.setString(1, this.name);
            statement.setString(2, this.category);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            System.out.println(String.format("При выполнении запроса произошла ошибка: %s", e.getMessage()));
        }
    }
}


