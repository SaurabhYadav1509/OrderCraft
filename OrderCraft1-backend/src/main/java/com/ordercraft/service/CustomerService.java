package com.ordercraft.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ordercraft.entity.Customer;
import com.ordercraft.repository.CustomerRepository;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer updateCustomer(Long id, Customer updatedCustomer) {
        Optional<Customer> optionalCustomer = customerRepository.findById(id);

        if (optionalCustomer.isPresent()) {
            Customer customer = optionalCustomer.get();

            customer.setCustomerName(updatedCustomer.getCustomerName());
            customer.setEmail(updatedCustomer.getEmail());
            customer.setPhone(updatedCustomer.getPhone());
            customer.setCompanyName(updatedCustomer.getCompanyName());

            return customerRepository.save(customer);
        }

        return null;
    }

    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}