package vtb.geekbrains;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] sArray = new String[]{"1", "2", "3"};
        Integer[] iArray = new Integer[]{1, 2, 3};

        swap(sArray, 1, 2);
        System.out.println(sArray.toString());

        swap(iArray, 1, 2);
        System.out.println(iArray.toString());

        ArrayList<Integer> newList = getListArray(iArray);
        System.out.println(newList);

        Box<Apple> appleBox1 = new Box<>();
        appleBox1.getList().add(new Apple());
        appleBox1.getList().add(new Apple());
        appleBox1.getList().add(new Apple());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.getList().add(new Apple());
        appleBox2.getList().add(new Apple());

        appleBox1.intersperse(appleBox2);

        Box<Orange> boxOrange = new Box<>();
        boxOrange.getList().add(new Orange());
        boxOrange.getList().add(new Orange());
        boxOrange.getList().add(new Orange());

        System.out.printf("Weight appleBox1: %f\n", appleBox1.getWeight());
        System.out.printf("Weight appleBox2: %f\n", appleBox2.getWeight());
        System.out.printf("Weight boxOrange: %f\n", boxOrange.getWeight());
        System.out.printf("Compare: %s\n", appleBox1.compare(boxOrange));
    }

    public static <T> void swap(T[] array, int i, int j) {
        T value = array[i];
        array[i] = array[j];
        array[j] = value;
    }

    public static <T> ArrayList<T> getListArray(T[] array) {
        ArrayList<T> list = new ArrayList<>();
        for (T item : array) {
            list.add(item);
        }
        return list;
    }
}

