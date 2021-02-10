package vtb.geekbrains.market;

import vtb.geekbrains.market.command.CommandFactory;

import java.util.Scanner;

public class Terminal {
    public Terminal() {

    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        String line, commandName, commandParams;
        String[] commandInput;

        while (true) {
            System.out.print("введите команду:");
            line = scanner.nextLine();
            commandInput = line.split(" ");
            commandName = commandInput[0];
            commandParams = "";
            if (commandInput.length > 1) {
                commandParams = commandInput[1];
            }
            if (commandName.toLowerCase().equals("exit")) {
                break;
            } else {
                CommandFactory.getCommand(commandName).exec(commandParams);
            }
        }
    }
}
