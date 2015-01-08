package com.terrydhariwal.repository;

import com.terrydhariwal.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll() {
        //hard coded stub
        List<Customer> customers = new ArrayList<Customer>();
        Customer customer = new Customer();
        customer.setFirstName("Terry");
        customer.setLastName("Dhariwal");
        customers.add(customer);
        return customers;
    }
}
