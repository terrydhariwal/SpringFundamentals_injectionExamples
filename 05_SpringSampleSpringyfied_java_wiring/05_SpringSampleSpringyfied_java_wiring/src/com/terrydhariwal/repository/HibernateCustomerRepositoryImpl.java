package com.terrydhariwal.repository;

import com.terrydhariwal.model.Customer;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Value("${someProperty}")
    private String someValue;

    @Override
    public List<Customer> findAll() {
        //hard coded stub
        List<Customer> customers = new ArrayList<Customer>();
        Customer customer = new Customer();
        //customer.setFirstName("Terry");
        customer.setFirstName(someValue);
        customer.setLastName("Dhariwal");
        customers.add(customer);
        return customers;
    }
}
