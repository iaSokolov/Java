package vtb.geekbrains.market.product.sales.services;

import org.springframework.stereotype.Service;
import vtb.geekbrains.market.product.sales.models.Sales;
import vtb.geekbrains.market.product.sales.repositories.SalesRepo;

import java.util.List;

@Service
public class SalesService {
    final
    SalesRepo salesRepo;

    public SalesService(SalesRepo salesRepo) {
        this.salesRepo = salesRepo;
    }

    public List<Sales> getEntitySet() {
        return this.salesRepo.findAll();
    }

    public Sales getEntity(Sales.Id id) {
        return this.salesRepo.findById(id).orElse(null);
    }

    public void createEntity(Sales product) {
        this.salesRepo.save(product);
    }

    public void deleteEntity(Sales product) {
        this.salesRepo.delete(product);
    }
}
