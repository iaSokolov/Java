package vtb.geekbrains.market.command;

public class ListCustomerCommand implements Command {
    @Override
    public void exec(String params) {
//        if (!MarketApp.factory.getCurrentSession().getTransaction().getStatus().equals(TransactionStatus.ACTIVE)) {
//            MarketApp.factory.getCurrentSession().beginTransaction();
//        }
//        AsciiTable at = new AsciiTable();
//        at.addRule();
//        at.addRow("id", "name");
//        at.addRule();
//        List<Customer> customers = MarketApp.factory.getCurrentSession().createQuery("from Customer").getResultList();
//        for (Customer customer : customers) {
//            at.addRow(customer.getId(), customer.getName());
//            at.addRule();
//        }
//        String rend = at.render();
//        System.out.println(rend);
    }
}
