package vtb.geekbrains;

import java.util.Arrays;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        try {
            Comix comix = new Comix("Супермен идет на помощь", "Супергерои");

            DBTable table = new DBTable(comix);
        } catch (Exception e) {
        }
    }
}

