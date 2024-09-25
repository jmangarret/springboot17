package com.example.demo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface FlightRepository extends JpaRepository<Flight, Long> {

    
}
