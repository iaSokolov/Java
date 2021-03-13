package vtb.geekbrains.services;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.resource.transaction.spi.TransactionStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vtb.geekbrains.market.MarketApp;
import vtb.geekbrains.market.Product;

import java.util.List;

@Component
@Getter
@Setter
public class ProductService {
    @Autowired
    private MarketApp marketApp;

    public List<Product> getProducts() {
        List<Product> products;
        if (!this.marketApp.factory.getCurrentSession().getTransaction().getStatus().equals(TransactionStatus.ACTIVE)) {
            this.marketApp.factory.getCurrentSession().beginTransaction();
        }
        products = this.marketApp.factory.getCurrentSession().createQuery("from Product").getResultList();
        return products;
    }
}
