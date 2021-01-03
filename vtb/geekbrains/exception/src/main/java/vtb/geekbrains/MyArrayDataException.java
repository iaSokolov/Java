package vtb.geekbrains;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(int column, int line) {
        this.column = column;
        this.line = line;
    }

    private int column;
    public int getColumn() {
        return column;
    }

    private int line;
    public int getLine() {
        return line;
    }
}