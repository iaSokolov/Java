package vtb.geekbrains;

public class RunTest implements Testing{
    private  int value;

    public RunTest(int _value){
        this.value = _value;
    }

    @Override
    public int getValue() {
        return this.value;
    }

    @Override
    public Type getType() {
        return Type.Run;
    }
}
