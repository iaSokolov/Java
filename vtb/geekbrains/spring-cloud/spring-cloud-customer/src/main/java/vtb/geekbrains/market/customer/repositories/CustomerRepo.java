package vtb.geekbrains.market.customer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vtb.geekbrains.market.customer.models.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {

}