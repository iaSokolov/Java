package vtb.geekbrains;

public class Dog extends Animals {
    static final private int maxRun = 500;
    static final private int maxSwim = 10;

    @Override
    public String swim(int x) {
        if (x > Dog.maxRun) {
            return String.format("Dog swim %d", Dog.maxRun);
        } else {
            return String.format("Dog swim %d", x);
        }
    }

    @Override
    public String run(int x) {
        if (x > Dog.maxSwim) {
            return String.format("Dog run %d", Dog.maxSwim);
        } else {
            return String.format("Dog run %d", x);
        }
    }
}
