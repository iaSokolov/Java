package vtb.geekbrains.market.config.client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vtb.geekbrains.market.config.client.models.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

}