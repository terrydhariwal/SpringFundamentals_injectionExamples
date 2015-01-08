package com.terrydhariwal.service;

import com.terrydhariwal.model.Customer;
import com.terrydhariwal.repository.CustomerRepository;
import com.terrydhariwal.repository.HibernateCustomerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service //our business logic tier or services tier (not a web services) - tier where our business logic should be contained
@Service("customerService") //the name is the same as the interface (but starting with lower case)
public class CustomerServiceImpl implements CustomerService {

    //@Autowired //Member based injection - uses reflection under the hood
    private CustomerRepository customerRepository;

    public CustomerServiceImpl(){}

    public CustomerRepository getCustomerRepository() {
        return customerRepository;
    }

    @Autowired //constructor injection
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println("we are using constructor injection");
        this.customerRepository = customerRepository;
    }

    //@Autowired //Using setter based injection
    // (requires the default no-args constructor to work,
    // so if you've defined any other arg based constructor, then you'll
    // need to explicity define the default no-arg constructor for this
    // to work.
    // as a rule of thumb I define it anyway
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("we are using setter injection");
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
