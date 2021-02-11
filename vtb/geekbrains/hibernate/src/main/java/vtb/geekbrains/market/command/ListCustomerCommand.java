package vtb.geekbrains.market.command;

import de.vandermeer.asciitable.AsciiTable;
import org.hibernate.resource.transaction.spi.TransactionStatus;
import vtb.geekbrains.market.Customer;
import vtb.geekbrains.market.MarketApp;

import java.util.List;

public class ListCustomerCommand implements Command {
    @Override
    public void exec(String params) {
        if (!MarketApp.factory.getCurrentSession().getTransaction().getStatus().equals(TransactionStatus.ACTIVE)) {
            MarketApp.factory.getCurrentSession().beginTransaction();
        }
        AsciiTable at = new AsciiTable();
        at.addRule();
        at.addRow("id", "name");
        at.addRule();
        List<Customer> customers = MarketApp.factory.getCurrentSession().createQuery("from Customer").getResultList();
        for (Customer customer : customers) {
            at.addRow(customer.getId(), customer.getName());
            at.addRule();
        }
        String rend = at.render();
        System.out.println(rend);
    }
}
