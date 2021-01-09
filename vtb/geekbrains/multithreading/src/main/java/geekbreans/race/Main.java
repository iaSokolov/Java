package geekbreans.race;

import java.util.concurrent.Semaphore;

public class Main {
    public static final java.util.concurrent.Semaphore Semaphore = new Semaphore(1, true);
    public static final int CARS_COUNT = 4;

    public static void main(String[] args) {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        Race race = new Race(CARS_COUNT, new Road(60), new Tunnel(), new Road(40));
        Car[] cars = new Car[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
        }

        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
        for (Car car : cars) {
            new Thread(car).start();
        }
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");*/

        String a1, b1;
        a1 = new String("String 1");
        b1 = "String 2";
        swap(a1,b1);
        System.out.println(a1);
        System.out.println(b1);
    }

    static void swap(String a, String b) {
        String c = a;
        a.toUpperCase();
        b = c;
    }
}