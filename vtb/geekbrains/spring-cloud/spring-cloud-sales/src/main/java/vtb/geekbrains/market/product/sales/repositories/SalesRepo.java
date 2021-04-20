package vtb.geekbrains.market.product.sales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vtb.geekbrains.market.product.sales.models.Sales;

@Repository
public interface SalesRepo extends JpaRepository<Sales, Sales.Id> {

}