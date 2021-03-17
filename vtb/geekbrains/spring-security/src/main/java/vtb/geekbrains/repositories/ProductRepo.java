package vtb.geekbrains.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vtb.geekbrains.models.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
    //Product findByTitle(String title);
}


