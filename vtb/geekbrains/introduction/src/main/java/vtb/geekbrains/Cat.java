package vtb.geekbrains;

public class Cat extends Animals {
    private static int maxRun, maxSwim;

    static {
        maxRun = 200;
        maxSwim = 0;
    }

    @Override
    public String swim(int x) {
        return "Cat no swim";
    }

    @Override
    public String run(int x) {
        if (x > Cat.maxRun) {
            return String.format("Cat run %d", Cat.maxRun);
        } else {
            return String.format("Cat run %d", x);
        }
    }
}



