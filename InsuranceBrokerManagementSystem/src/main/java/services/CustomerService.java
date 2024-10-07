package services;

import crud.service.CrudService1;
import models.Customer;

import java.io.IOException;
import java.util.List;

public class CustomerService {
    private final CrudService1 crudService = new CrudService1();

    // Add new customer
    public void addCustomer(Customer customer) throws IOException {
        crudService.add(customer);
    }

    // Get all customers
    public List<Object> getAllCustomers() throws IOException {
        return crudService.getAll(new Customer());
    }

    // Get customer by ID
    public Customer getCustomerById(String id) throws IOException {
        return (Customer) crudService.getById(id, new Customer());
    }

    // Update customer
    public void updateCustomer(String id, Customer updatedCustomer) throws IOException {
        crudService.update(id, updatedCustomer, new Customer());
    }

    // Delete customer
    public void deleteCustomer(String id) throws IOException {
        crudService.delete(id, new Customer());
    }
}
