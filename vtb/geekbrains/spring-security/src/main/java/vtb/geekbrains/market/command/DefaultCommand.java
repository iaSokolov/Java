package vtb.geekbrains.market.command;

public class DefaultCommand implements Command {
    public DefaultCommand() {
    }

    @Override
    public void exec(String params) {
        System.out.println("команды не существует");
    }
}
