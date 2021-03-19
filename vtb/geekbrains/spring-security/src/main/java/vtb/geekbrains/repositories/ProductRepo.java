package vtb.geekbrains.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import vtb.geekbrains.models.Product;

@Repository
public interface ProductRepo extends PagingAndSortingRepository<Product, Long> {

}


