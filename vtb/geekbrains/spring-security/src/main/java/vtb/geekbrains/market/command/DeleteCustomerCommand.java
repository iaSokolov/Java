package vtb.geekbrains.market.command;

public class DeleteCustomerCommand implements Command {
    @Override
    public void exec(String params) {
//        if (!params.isEmpty()) {
//            if (!MarketApp.factory.getCurrentSession().getTransaction().getStatus().equals(TransactionStatus.ACTIVE)) {
//                MarketApp.factory.getCurrentSession().beginTransaction();
//            }
//            Customer customer = MarketApp.factory.getCurrentSession().get(Customer.class, Integer.valueOf(params));
//            if (customer == null) {
//                System.out.println("клиент не найден");
//            } else {
//                MarketApp.factory.getCurrentSession().delete(customer);
//                System.out.println("клиент удален");
//            }
//        }
//        else {
//            System.out.println("параметр указаны не корректно");
//        }
    }
}
