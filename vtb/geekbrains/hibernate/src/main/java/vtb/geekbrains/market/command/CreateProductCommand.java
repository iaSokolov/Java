package vtb.geekbrains.market.command;

import vtb.geekbrains.market.MarketApp;
import vtb.geekbrains.market.Product;

public class CreateProductCommand implements Command {
    @Override
    public void exec(String params) {
        if (params.length() != 0) {
            MarketApp.factory.getCurrentSession().beginTransaction();
            Product product = new Product(params);
            MarketApp.factory.getCurrentSession().save(product);
            MarketApp.factory.getCurrentSession().getTransaction().commit();

            System.out.println("создан продукт: " + product.toString());
        } else {
            System.out.println("параметр указаны не корректно");
        }
    }
}
