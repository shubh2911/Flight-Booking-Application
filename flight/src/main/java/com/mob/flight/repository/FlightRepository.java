package com.mob.flight.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mob.flight.entity.Flight;


public interface FlightRepository extends JpaRepository<Flight, Long> {

}
