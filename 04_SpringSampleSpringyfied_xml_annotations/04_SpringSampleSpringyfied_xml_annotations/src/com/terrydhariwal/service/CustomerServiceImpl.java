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

    @Autowired //Member based injection - uses reflection under the hood
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
