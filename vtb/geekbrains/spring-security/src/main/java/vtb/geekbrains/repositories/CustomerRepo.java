package vtb.geekbrains.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vtb.geekbrains.models.Customer;
import vtb.geekbrains.models.Sale;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {
}