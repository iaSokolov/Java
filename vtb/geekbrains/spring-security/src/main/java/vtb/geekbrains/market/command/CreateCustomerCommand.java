package vtb.geekbrains.market.command;

import org.hibernate.resource.transaction.spi.TransactionStatus;
import org.springframework.beans.factory.annotation.Autowired;
import vtb.geekbrains.entity.Customer;
import vtb.geekbrains.market.MarketApp;

public class CreateCustomerCommand implements Command {
    private MarketApp marketApp;

    public void setMarketApp(@Autowired MarketApp marketApp) {
        this.marketApp = marketApp;
    }

    @Override
    public void exec(String params) {
        if (params.length() != 0) {
            if (!marketApp.factory.getCurrentSession().getTransaction().getStatus().equals(TransactionStatus.ACTIVE)) {
                marketApp.factory.getCurrentSession().beginTransaction();
            }
            Customer customer = new Customer(params);
            marketApp.factory.getCurrentSession().save(customer);

            System.out.println("создан клиент: " + customer.toString());
        } else {
            System.out.println("параметр указаны не корректно");
        }
    }
}