package vtb.geekbrains;

public class Main {
    public static void main(String[] args) {
        Movable[] objects = {new Cat(), new Human(), new Robot()};
        Testing[] testings = {new RunTest(10), new JumpTest(50)};

        for (Movable object: objects) {
            for (Testing test: testings ) {
                object.test(test);
            }
        }
    }
}
