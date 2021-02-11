package vtb.geekbrains.market.command;

import org.hibernate.resource.transaction.spi.TransactionStatus;
import vtb.geekbrains.market.MarketApp;
import vtb.geekbrains.market.Product;

public class DeleteProductCommand implements Command {
    @Override
    public void exec(String params) {
        if (!params.isEmpty()) {
            if (!MarketApp.factory.getCurrentSession().getTransaction().getStatus().equals(TransactionStatus.ACTIVE)) {
                MarketApp.factory.getCurrentSession().beginTransaction();
            }
            Product product = MarketApp.factory.getCurrentSession().get(Product.class, Integer.valueOf(params));
            if (product == null) {
                System.out.println("продукт не найден");
            } else {
                MarketApp.factory.getCurrentSession().delete(product);
                System.out.println("продукт удален");
            }
        }
        else {
            System.out.println("параметр указаны не корректно");
        }
    }
}
