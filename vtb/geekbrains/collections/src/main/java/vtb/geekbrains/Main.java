package vtb.geekbrains;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = {
                "Генератор", "случайных", "слов", "Генератор", "рандомных", "слов", "Все",
                "слова", "Существительные", "Города", "Имена", "Украинские", "слова",
                "Количество", "слов", "Шаблон"};

        HashSet<String> setWord = new HashSet<>(); //для подсчета уникального количества слов
        HashMap<String, Integer> countMap = new HashMap<>(); // для подсчета количества повторений

        for (String word : words) {
            setWord.add(word);

            Integer count = countMap.getOrDefault(word, 0);
            countMap.put(word, ++count);
        }

        System.out.println("Уникальные слова:");
        Iterator<String> setIterator = setWord.iterator();
        while(setIterator.hasNext()) {
            System.out.println(setIterator.next());
        }

        System.out.println("");
        System.out.println("Количество повторений:");
        Iterator<Map.Entry<String, Integer>> mapIterator = countMap.entrySet().iterator();
        while(mapIterator.hasNext()) {
            Map.Entry<String, Integer> entry = mapIterator.next();
            System.out.println(String.format("%s - %d", entry.getKey(), entry.getValue()));
        }

        PhoneBook pb = new PhoneBook();
        pb.add("Иванов", "123");
        pb.add("Петров", "456");
        pb.add("Иванов", "789");

        System.out.println("");
        System.out.println("Телефонный справочник:");
        System.out.println(String.format("%s - %s", "Иванов", pb.get("Иванов").toString()));
        System.out.println(String.format("%s - %s", "Петров", pb.get("Петров").toString()));
    }
}
