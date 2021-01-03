package vtb.geekbrains;

public class JumpTest implements Testing {
    private int value;

    public JumpTest(int _value) {
        this.value = _value;
    }

    @Override
    public int getValue() {
        return this.value;
    }

    @Override
    public Type getType() {
        return Type.Jump;
    }
}
