package vtb.geekbrains.market.config.client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vtb.geekbrains.market.config.client.models.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {
}
