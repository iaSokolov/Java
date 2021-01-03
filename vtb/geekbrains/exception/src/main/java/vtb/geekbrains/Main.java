package vtb.geekbrains;

public class Main {
    public static void main(String[] args) {
        System.out.println("start-of-program");
        String[][] array = {{"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1ы", "2", "3", "4"},
                {"1", "2", "3", "4"}};
        try {
            printArray(array);
        } catch (MyArraySizeException e) {
            System.out.println("Некорректно указана длина массива");
        } /*catch (Exception e) {
            System.out.println(String.format("Произошла ошибка при обработке массива:%s", e.getMessage()));
        }*/ catch (MyArrayDataException e) {
            System.out.println(String.format("Некорректное значение в элементе массива [%d][%d]", e.getLine(), e.getColumn()));
        }
        System.out.println("end-of-program");
    }

    public static void printArray(String[][] _array) throws MyArraySizeException, MyArrayDataException {
        if (_array.length != 4) {
            throw new MyArraySizeException(String.format("Размер массива равен %d", _array.length));
        } else {
            for (int i = 0; i < _array.length; i++) {
                if (_array[i].length != 4) {
                    throw new MyArraySizeException(String.format("Размер массива равен %d", _array[i].length));
                }
            }
        }

        for (int i = 0; i < _array.length; i++) {
            for (int j = 0; j < _array.length; j++) {
                try {
                    Integer.valueOf(_array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(j, i);

                }
            }
        }
    }
}
