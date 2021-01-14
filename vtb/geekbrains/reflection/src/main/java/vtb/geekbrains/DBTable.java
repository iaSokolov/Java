package vtb.geekbrains;

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
    }
}
