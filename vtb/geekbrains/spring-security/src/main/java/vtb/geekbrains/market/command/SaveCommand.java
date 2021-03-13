package vtb.geekbrains.market.command;

import org.hibernate.resource.transaction.spi.TransactionStatus;
import vtb.geekbrains.market.MarketApp;

public class SaveCommand implements Command {
    @Override
    public void exec(String params) {
//        if (MarketApp.factory.getCurrentSession().getTransaction().getStatus().equals(TransactionStatus.ACTIVE)) {
//            MarketApp.factory.getCurrentSession().getTransaction().commit();
//            System.out.println("Данные успешно сохранены");
//        } else {
//            System.out.println("нет активной транзакции для сохранения");
//        }
    }
}
