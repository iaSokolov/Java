package vtb.geekbrains.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vtb.geekbrains.models.Customer;

import vtb.geekbrains.repositories.CustomerRepo;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    public List<Customer> getAllCustomer() {
        return this.customerRepo.findAll();
    }
}
