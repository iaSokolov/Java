package vtb.geekbrains.market.command;

import de.vandermeer.asciitable.AsciiTable;
import org.hibernate.resource.transaction.spi.TransactionStatus;
import vtb.geekbrains.market.Customer;
import vtb.geekbrains.market.MarketApp;
import vtb.geekbrains.market.Product;

import java.util.List;

public class ReportProductCommand implements Command {
    @Override
    public void exec(String params) {
//        if (!MarketApp.factory.getCurrentSession().getTransaction().getStatus().equals(TransactionStatus.ACTIVE)) {
//            MarketApp.factory.getCurrentSession().beginTransaction();
//        }
//        AsciiTable at = new AsciiTable();
//        at.addRule();
//        at.addRow("id", "name");
//        at.addRule();
//
//        List<Object[]> queryResult = MarketApp
//                .factory
//                .getCurrentSession()
//                .createQuery("from Product as p inner join p.customer as c where c.name = :name ")
//                .setParameter("name", params)
//                .getResultList();
//
//        for (Object[] aRow : queryResult) {
//            for (Object item : aRow) {
//                if (item instanceof Product) {
//                    at.addRow(((Product) item).getId(), ((Product) item).getName());
//                    at.addRule();
//                }
//            }
//        }
//        String rend = at.render();
//        System.out.println(rend);
    }
}