package com.terrydhariwal.repository;

import com.terrydhariwal.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
