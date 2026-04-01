package org.example.springdatajpa.repository;

import org.example.springdatajpa.entity.FlightBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FlightBookingRepository extends JpaRepository<FlightBooking, Long> {
    public Optional<FlightBooking> findByBookingId(long id);
}
