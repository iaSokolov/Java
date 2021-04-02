package vtb.geekbrains.market.sales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vtb.geekbrains.market.sales.models.Sales;

@Repository
public interface SalesRepo extends JpaRepository<Sales, Sales.Id> {

}