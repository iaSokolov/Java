package vtb.geekbrains;
public class Application {
    public static void main(String[] args) {
        Animals[] animals = {new Cat(), new Dog()};
        for (Animals animal : animals) {
            System.out.println(animal.run(300));
            System.out.println(animal.swim(150));
        }
    }
}