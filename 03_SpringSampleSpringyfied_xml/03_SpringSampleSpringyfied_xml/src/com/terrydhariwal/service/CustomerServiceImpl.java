package com.terrydhariwal.service;

import com.terrydhariwal.model.Customer;
import com.terrydhariwal.repository.CustomerRepository;
import com.terrydhariwal.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(){}

    //without the above explicitly defined no-args constructor,
    // we enforce a contract that ONLY allows CustomerServiceImpl instantiation
    // with a CustomerRepository argument
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println("wired by constructor injection");
        this.customerRepository = customerRepository;
    }

    public CustomerRepository getCustomerRepository() {
        return customerRepository;
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
