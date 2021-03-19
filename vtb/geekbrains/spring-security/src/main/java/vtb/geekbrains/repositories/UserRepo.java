package vtb.geekbrains.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vtb.geekbrains.models.Sale;

@Repository
public interface SaleRepo extends JpaRepository<Sale, Sale.Id> {
}