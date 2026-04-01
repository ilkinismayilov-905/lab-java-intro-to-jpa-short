package org.example.springdatajpa.config;

import org.example.springdatajpa.entity.Customer;
import org.example.springdatajpa.entity.Flight;
import org.example.springdatajpa.entity.FlightBooking;
import org.example.springdatajpa.enums.CustomerStatus;
import org.example.springdatajpa.repository.CustomerRepository;
import org.example.springdatajpa.repository.FlightBookingRepository;
import org.example.springdatajpa.repository.FlightRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadData(CustomerRepository customerRepo,
                               FlightRepository flightRepo,
                               FlightBookingRepository bookingRepo) {
        return args -> {

            Customer c1 = new Customer("John Doe", CustomerStatus.GOLD, 50000);
            Customer c2 = new Customer("Jane Smith", CustomerStatus.SILVER, 30000);
            Customer c3 = new Customer("Michael Brown", CustomerStatus.NONE, 20000);

            customerRepo.save(c1);
            customerRepo.save(c2);
            customerRepo.save(c3);

            Flight f1 = new Flight("AA101", "Boeing 737", 150, 1000);
            Flight f2 = new Flight("BA202", "Airbus A320", 180, 2000);
            Flight f3 = new Flight("LH303", "Boeing 777", 250, 3500);

            flightRepo.save(f1);
            flightRepo.save(f2);
            flightRepo.save(f3);

            FlightBooking b1 = new FlightBooking(c1.getCustomerId(), f1.getFlightId());
            FlightBooking b2 = new FlightBooking(c2.getCustomerId(), f2.getFlightId());
            FlightBooking b3 = new FlightBooking(c3.getCustomerId(), f3.getFlightId());

            bookingRepo.save(b1);
            bookingRepo.save(b2);
            bookingRepo.save(b3);
        };
    }
}
