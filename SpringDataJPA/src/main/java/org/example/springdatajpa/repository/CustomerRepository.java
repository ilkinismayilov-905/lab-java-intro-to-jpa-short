package org.example.springdatajpa.repository;

import org.example.springdatajpa.entity.Customer;
import org.example.springdatajpa.enums.CustomerStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    public Optional<Customer> findByCustomerName(String customerName);
    List<Customer> findByCustomerStatus(CustomerStatus status);
}
