package vtb;

import de.vandermeer.asciitable.AsciiTable;

public class geekbrains {
    public static void main(String[] args) {
        AsciiTable at = new AsciiTable();
        at.addRule();
        at.addRow("Column 1", "Column 2");
        System.out.println(at.render());
    }
}
