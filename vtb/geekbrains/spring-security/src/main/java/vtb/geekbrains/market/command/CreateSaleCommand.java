package vtb.geekbrains.market.command;

import org.hibernate.resource.transaction.spi.TransactionStatus;
import vtb.geekbrains.market.Customer;
import vtb.geekbrains.market.MarketApp;
import vtb.geekbrains.market.Product;
import vtb.geekbrains.market.Sale;

public class CreateSaleCommand implements Command {
    @Override
    public void exec(String params) {
//        if (params.length() != 0) {
//            String[] args = params.split(",");
//            if (args.length == 2) {
//                if (!MarketApp.factory.getCurrentSession().getTransaction().getStatus().equals(TransactionStatus.ACTIVE)) {
//                    MarketApp.factory.getCurrentSession().beginTransaction();
//                }
//                Customer customer = MarketApp.factory.getCurrentSession().get(Customer.class, Integer.valueOf(args[0]));
//                Product product = MarketApp.factory.getCurrentSession().get(Product.class, Integer.valueOf(args[1]));
//                if (customer != null && product != null) {
//
//                    Sale sale = new Sale();
//                    sale.setProduct(product);
//                    sale.setCustomer(customer);
//                    sale.setAmount(product.getPrice());
//
//                    MarketApp.factory.getCurrentSession().save(sale);
//
//                    System.out.println("содана продажа: " + customer.toString() + " | " + product.toString());
//                } else {
//                    if (customer == null) {
//                        System.out.println("Не найден клиент с id=" + args[0]);
//                    }
//                    if (product == null) {
//                        System.out.println("Не найден продукт с id=" + args[1]);
//                    }
//                }
//            } else {
//                System.out.println("параметр указаны не корректно");
//            }
//        } else {
//            System.out.println("параметр указаны не корректно");
//        }
    }
}