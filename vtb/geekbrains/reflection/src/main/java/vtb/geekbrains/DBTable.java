package vtb.geekbrains;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DBTable {
    private Table table;
    private List<Column> columns;

    public DBTable(Object object) {
        this.table = object.getClass().getAnnotation(Table.class);
        this.columns = Arrays.stream(object.getClass().getDeclaredFields())
                .map(field -> field.getAnnotation(Column.class))
                .filter(column -> column != null)
                .collect(Collectors.toList());
        if (!this.tableExist(this.table.title())) {
            this.createTable();
        }
    }

    public boolean tableExist(String tableName) {
        boolean tableExist = false;
        try {
            Statement statement = BD.getInstance().getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT name FROM  sqlite_master WHERE type ='table' AND name NOT LIKE 'sqlite_%';");
            while (result.next()) {
                String name  = result.getString("name");
                if (name.equals(tableName)) {
                    tableExist = true;
                }
            }
            result.close();
            statement.close();
        } catch (SQLException e) {
            System.out.println(String.format("При выполнении запроса произошла ошибка: %s", e.getMessage()));
        }
        return tableExist;
    }

    public void createTable() {
        try {
            Statement statement = BD.getInstance().getConnection().createStatement();
            ResultSet result = statement.executeQuery("CREATE TABLE ComixTable (\n" +
                    "    comixName     STRING PRIMARY KEY,\n" +
                    "    comixCategory STRING\n" +
                    ");\n");
            result.close();
            statement.close();
        } catch (SQLException e) {
            System.out.println(String.format("При выполнении запроса произошла ошибка: %s", e.getMessage()));
        }
    }
}
