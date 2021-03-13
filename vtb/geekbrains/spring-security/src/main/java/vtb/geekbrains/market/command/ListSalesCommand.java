package vtb.geekbrains.market.command;

public class ListSalesCommand implements Command {
    @Override
    public void exec(String params) {
//        if (!MarketApp.factory.getCurrentSession().getTransaction().getStatus().equals(TransactionStatus.ACTIVE)) {
//            MarketApp.factory.getCurrentSession().beginTransaction();
//        }
//        AsciiTable at = new AsciiTable();
//        at.addRule();
//        at.addRow("client id", "client name", "product id", "product name", "price");
//        at.addRule();
//
//        List<Sale> sales = MarketApp.factory.getCurrentSession().createQuery("from Sale").getResultList();
//        for (Sale sale : sales) {
//            at.addRow(sale.getCustomer().getId(), sale.getCustomer().getName(), sale.getProduct().getId(), sale.getProduct().getName(), sale.getAmount());
//            at.addRule();
//        }
//        String rend = at.render();
//        System.out.println(rend);
    }
}
