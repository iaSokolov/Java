package vtb.geekbrains;

public class Cat implements Movable {
    private static int maxLength = 10;
    private static int maxHeight = 10;

    public boolean run(int length) {
        if (length > maxLength) {
            System.out.printf("Кошка не смогла пробежать %s\n", length);
            return false;
        } else {
            System.out.printf("Кошка пробежала %s\n", length);
            return true;
        }
    }

    public boolean jump(int height) {
        if (height > maxHeight) {
            System.out.printf("Кошка не смогла перепрыгнуть %s\n", height);
            return false;
        } else {
            System.out.printf("Кошка препрыгнула %s\n", height);
            return true;
        }
    }

    @Override
    public boolean test(Testing _test) {

        switch (_test.getType()) {
            case Run:
                return this.run(_test.getValue());

            case Jump:
                return this.jump(_test.getValue());

            default:
                return false;
        }
    }
}
