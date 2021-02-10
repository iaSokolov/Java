package vtb.geekbrains.market.command;

public class CommandFactory {
    public static Command getCommand(String in) {
        Command command = null;
        switch (in) {
            case "/cp":
                command = new CreateProductCommand();
                break;

            case "/cc":
                command = new CreateCustomerCommand();
                break;

            case "/sale":
                command = new CreateSaleCommand();
                break;

            default:
                command = new DefaultCommand();
                break;
        }
        return command;
    }
}
