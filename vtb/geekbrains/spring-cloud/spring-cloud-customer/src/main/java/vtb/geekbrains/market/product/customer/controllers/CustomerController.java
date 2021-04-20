package vtb.geekbrains.market.customer.controllers;

import org.springframework.web.bind.annotation.*;
import vtb.geekbrains.market.customer.models.Customer;
import vtb.geekbrains.market.customer.services.CustomerService;

import java.util.List;

@RestController
public class CustomerController {
    final
    CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customer")
    public List<Customer> getCustomerSet() {
        List<Customer> customerList = this.customerService.getEntitySet();
        return customerList;
    }

    @GetMapping("/customer/{id}")
    public Customer getCustomerEntity(@PathVariable(value = "id") Long customerId) {
        return this.customerService.getEntity(customerId);
    }

    @PostMapping("/customer")
    public void createCustomerEntity(@RequestBody Customer customer) {
        this.customerService.createEntity(customer);
    }

    @DeleteMapping("/customer")
    public void deleteCustomerEntity(@RequestBody Customer customer) {
        this.customerService.deleteEntity(customer);
    }
}