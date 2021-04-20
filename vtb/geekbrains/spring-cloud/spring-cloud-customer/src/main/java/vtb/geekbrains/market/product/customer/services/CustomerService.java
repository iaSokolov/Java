package vtb.geekbrains.market.product.customer.services;

import org.springframework.stereotype.Service;
import vtb.geekbrains.market.product.customer.models.Customer;
import vtb.geekbrains.market.product.customer.repositories.CustomerRepo;

import java.util.List;

@Service
public class CustomerService {
    final
    CustomerRepo customerRepo;

    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public List<Customer> getEntitySet() {
        return this.customerRepo.findAll();
    }

    public Customer getEntity(Long id) {
        return this.customerRepo.findById(id).orElse(null);
    }

    public void createEntity(Customer product) {
        this.customerRepo.save(product);
    }

    public void deleteEntity(Customer product) {
        this.customerRepo.delete(product);
    }
}
