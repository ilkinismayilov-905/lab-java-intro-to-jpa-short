package org.example.springdatajpa.repository;

import org.example.springdatajpa.entity.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    public Optional<Customer> findByCustomerName(String customerName);
}
