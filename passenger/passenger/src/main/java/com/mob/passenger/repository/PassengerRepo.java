package com.mob.passenger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mob.passenger.entity.Passenger;



public interface PassengerRepo extends JpaRepository<Passenger, Long> {



}
