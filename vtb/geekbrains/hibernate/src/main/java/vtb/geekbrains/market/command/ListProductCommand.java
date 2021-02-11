package vtb.geekbrains.market.command;

import de.vandermeer.asciitable.AsciiTable;
import org.hibernate.resource.transaction.spi.TransactionStatus;
import vtb.geekbrains.market.MarketApp;
import vtb.geekbrains.market.Product;

import java.util.List;

public class ListProductCommand implements Command {
    @Override
    public void exec(String params) {
        if (!MarketApp.factory.getCurrentSession().getTransaction().getStatus().equals(TransactionStatus.ACTIVE)) {
            MarketApp.factory.getCurrentSession().beginTransaction();
        }
        AsciiTable at = new AsciiTable();
        at.addRule();
        at.addRow("id", "name", "price");
        at.addRule();
        List<Product> products = MarketApp.factory.getCurrentSession().createQuery("from Product").getResultList();
        for (Product product : products) {
            at.addRow(product.getId(), product.getName(), product.getPrice());
            at.addRule();
        }
        String rend = at.render();
        System.out.println(rend);
    }
}
