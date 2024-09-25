package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FlightService {

    @Autowired
    FlightRepository flightRepository;

    public Optional<Flight> getFlight(Long id) {
        try {
            return flightRepository.findById(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Optional<Flight> saveFlight(Flight flight) {
        try {
            return Optional.of(flightRepository.save(flight));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
