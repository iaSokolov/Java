package vtb.geekbrains.market.command;

import org.hibernate.resource.transaction.spi.TransactionStatus;
import vtb.geekbrains.market.MarketApp;
import vtb.geekbrains.market.Product;

import java.math.BigDecimal;

public class CreateProductCommand implements Command {
    @Override
    public void exec(String params) {
//        if (params.length() != 0) {
//            if (!MarketApp.factory.getCurrentSession().getTransaction().getStatus().equals(TransactionStatus.ACTIVE)) {
//                MarketApp.factory.getCurrentSession().beginTransaction();
//            }
//            String[] parameters = params.split(",");
//            if (parameters.length == 2) {
//                Product product = new Product(parameters[0], new BigDecimal(parameters[1]));
//                MarketApp.factory.getCurrentSession().save(product);
//                System.out.println("создан продукт: " + product.toString());
//            } else {
//                System.out.println("параметр указаны не корректно");
//            }
//        } else {
//            System.out.println("параметр указаны не корректно");
//        }
    }
}
