package vtb.geekbrains;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //получить наиболее часто встречающееся слово в массиве
        String word = Arrays.asList("Майя", "Марк", "Инна", "Майя", "Инна", "Инна")
                .stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet()
                .stream()
                .max((o1, o2) -> o1.getValue() - o2.getValue() > 0 ? 1 : -1).get().getKey();
        System.out.println(word);
    }
}


