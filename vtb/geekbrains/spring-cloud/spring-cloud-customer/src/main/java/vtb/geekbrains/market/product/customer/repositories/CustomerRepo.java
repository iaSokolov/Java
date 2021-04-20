package vtb.geekbrains.market.product.customer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vtb.geekbrains.market.product.customer.models.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {

}