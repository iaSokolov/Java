package vtb.geekbrains.market.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vtb.geekbrains.market.models.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

}