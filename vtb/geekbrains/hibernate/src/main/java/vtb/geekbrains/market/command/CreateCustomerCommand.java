package vtb.geekbrains.market.command;

import vtb.geekbrains.market.Customer;
import vtb.geekbrains.market.MarketApp;
import vtb.geekbrains.market.Product;

public class CreateCustomerCommand implements Command {
    @Override
    public void exec(String params) {
        if (params.length() != 0) {
            MarketApp.factory.getCurrentSession().beginTransaction();
            Customer customer = new Customer(params);
            MarketApp.factory.getCurrentSession().save(customer);
            MarketApp.factory.getCurrentSession().getTransaction().commit();

            System.out.println("создан клиент: " + customer.toString());
        } else {
            System.out.println("параметр указаны не корректно");
        }
    }
}