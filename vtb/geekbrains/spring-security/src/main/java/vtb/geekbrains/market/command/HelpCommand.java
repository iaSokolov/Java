package vtb.geekbrains.market.command;

import de.vandermeer.asciitable.AsciiTable;

public class HelpCommand implements Command {
    @Override
    public void exec(String params) {
        AsciiTable at = new AsciiTable();

        at.addRule();
        at.addRow("команда", "описание");
        at.addRule();

        at.addRow("lp", "вывести товары");
        at.addRule();

        at.addRow("cp", "создать товар");
        at.addRule();

        at.addRow("mp", "изменить товар");
        at.addRule();

        at.addRow("dp", "удалить товар");
        at.addRule();

        at.addRow("lc", "вывести клиентов");
        at.addRule();

        at.addRow("cc", "создать клиента");
        at.addRule();

        at.addRow("dc", "удалить клиента");
        at.addRule();

        at.addRow("ls", "вывести продажи");
        at.addRule();

        at.addRow("sale", "завести продажу");
        at.addRule();

        at.addRow("rc", "вывести клиентов, купивших определенный товар");
        at.addRule();

        at.addRow("rp", "вывести продукты, купленные определенным покупателем");
        at.addRule();

        at.addRow("save", "сохранить изменения");
        at.addRule();

        at.addRow("exit", "завершить работу приложения");
        at.addRule();

        String rend = at.render();
        System.out.println(rend);
    }
}
