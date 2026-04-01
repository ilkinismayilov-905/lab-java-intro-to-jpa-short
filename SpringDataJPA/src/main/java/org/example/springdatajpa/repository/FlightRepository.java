package org.example.springdatajpa.repository;

import org.example.springdatajpa.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    public Optional<Flight> findByFlightNumber(String number);

}
