package com.terrydhariwal.repository;

import com.terrydhariwal.model.Customer;

import java.util.List;

/**
 * Created by Terry on 07/01/15.
 */
public interface CustomerRepository {
    List<Customer> findAll();
}
