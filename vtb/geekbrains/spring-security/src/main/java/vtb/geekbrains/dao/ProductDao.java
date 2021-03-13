package vtb.geekbrains.dao;

import org.hibernate.resource.transaction.spi.TransactionStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vtb.geekbrains.entity.Product;
import vtb.geekbrains.market.MarketApp;

import java.util.List;

@Component
public class ProductDao {
    private MarketApp marketApp;

    @Autowired
    public ProductDao(MarketApp marketApp) {
        this.marketApp = marketApp;
    }

    public List<Product> getAllProduct() {
        List<Product> products;
        if (!this.marketApp.factory.getCurrentSession().getTransaction().getStatus().equals(TransactionStatus.ACTIVE)) {
            this.marketApp.factory.getCurrentSession().beginTransaction();
        }
        products = this.marketApp.factory.getCurrentSession().createQuery("from Product").getResultList();
        this.marketApp.factory.getCurrentSession().getTransaction().commit();
        return products;
    }
}
