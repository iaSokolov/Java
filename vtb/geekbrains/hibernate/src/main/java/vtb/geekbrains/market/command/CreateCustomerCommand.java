package vtb.geekbrains.market.command;

import org.hibernate.resource.transaction.spi.TransactionStatus;
import vtb.geekbrains.market.Customer;
import vtb.geekbrains.market.MarketApp;

public class CreateCustomerCommand implements Command {
    @Override
    public void exec(String params) {
        if (params.length() != 0) {
            if (!MarketApp.factory.getCurrentSession().getTransaction().getStatus().equals(TransactionStatus.ACTIVE)) {
                MarketApp.factory.getCurrentSession().beginTransaction();
            }
            Customer customer = new Customer(params);
            MarketApp.factory.getCurrentSession().save(customer);

            System.out.println("создан клиент: " + customer.toString());
        } else {
            System.out.println("параметр указаны не корректно");
        }
    }
}