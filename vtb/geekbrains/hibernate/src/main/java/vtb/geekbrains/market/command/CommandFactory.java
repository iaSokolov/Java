package vtb.geekbrains.market.command;

public class CommandFactory {
    public static Command getCommand(String in) {
        Command command = null;
        switch (in) {
            case "help":
                command = new HelpCommand();
                break;

            case "dc":
                command = new DeleteCustomerCommand();
                break;

            case "cp":
                command = new CreateProductCommand();
                break;

            case "cc":
                command = new CreateCustomerCommand();
                break;

            case "lc":
                command = new ListCustomerCommand();
                break;

            case "ls":
                command = new ListSalesCommand();
                break;

            case "sale":
                command = new CreateSaleCommand();
                break;

            case "dp":
                command = new DeleteProductCommand();
                break;

            case "save":
                command = new SaveCommand();
                break;

            case "lp":
                command = new ListProductCommand();
                break;

            case "rc":
                command = new ReportCustomerCommand();
                break;

            case "rp":
                command = new ReportProductCommand();
                break;

            default:
                command = new DefaultCommand();
                break;
        }
        return command;
    }
}
