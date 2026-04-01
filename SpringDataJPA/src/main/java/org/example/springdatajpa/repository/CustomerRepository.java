package org.example.springdatajpa.repository;

import org.example.springdatajpa.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    public Optional<Customer> findByCustomerName(String customerName);
}
