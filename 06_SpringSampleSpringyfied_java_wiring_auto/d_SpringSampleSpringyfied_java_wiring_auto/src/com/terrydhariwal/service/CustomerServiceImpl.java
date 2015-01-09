package com.terrydhariwal.service;

import com.terrydhariwal.model.Customer;
import com.terrydhariwal.repository.CustomerRepository;
import com.terrydhariwal.repository.HibernateCustomerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    @Autowired //member injection - reflection
    private CustomerRepository customerRepository;

    @Autowired //setter injection
    public void setCustomerRepository(CustomerRepository customerRepository) {
        if (this.customerRepository != null) { //if at this point customerRepository is not null, then this is member injection done in the default constructor
            System.out.println("already used member injection (reflection), customerRepository = " + customerRepository);
        }
        else {
            this.customerRepository = customerRepository;
            System.out.println("using setter injection " + "customerRepository = " + customerRepository);
        }
    }

    public CustomerServiceImpl(){
        System.out.println("In default constructor, after this constructor returns, customerRepository will be member injected (reflection), at the moment customerRepository is " + customerRepository);
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
