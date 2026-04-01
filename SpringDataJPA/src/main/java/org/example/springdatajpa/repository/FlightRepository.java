package org.example.springdatajpa.repository;

import org.example.springdatajpa.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    public Optional<Flight> findByFlightNumber(String number);
}
