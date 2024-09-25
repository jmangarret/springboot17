package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class FlightController {

    @Autowired
    FlightService flightService;

    @GetMapping("/airline")
    Optional<Flight> getFlight(@PathVariable Long id ){
        return flightService.getFlight(id);
    }

    @PostMapping("/airline")
    Optional<Flight> saveFlight(@RequestBody Flight flight){
        return flightService.saveFlight(flight);
    }
}
