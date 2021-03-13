package vtb.geekbrains.market.command;

public class ReportCustomerCommand implements Command {
    @Override
    public void exec(String params) {
//        if (!MarketApp.factory.getCurrentSession().getTransaction().getStatus().equals(TransactionStatus.ACTIVE)) {
//            MarketApp.factory.getCurrentSession().beginTransaction();
//        }
//        AsciiTable at = new AsciiTable();
//        at.addRule();
//        at.addRow("id", "name");
//        at.addRule();
//
//        List<Object[]> queryResult = MarketApp
//                .factory
//                .getCurrentSession()
//                .createQuery("from Customer as c inner join c.product as p where p.name = :name ")
//                .setParameter("name", params)
//                .getResultList();
//
//        for (Object[] aRow : queryResult) {
//            for (Object item : aRow) {
//                if (item instanceof Customer) {
//                    at.addRow(((Customer) item).getId(), ((Customer) item).getName());
//                    at.addRule();
//                }
//            }
//        }
//        String rend = at.render();
//        System.out.println(rend);
    }
}
