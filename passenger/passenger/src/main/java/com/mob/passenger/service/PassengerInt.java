package com.mob.passenger.service;

import java.util.List;

import com.mob.passenger.dto.PassengerDto;



public interface PassengerInt {

	List<PassengerDto> getAllPassenger();
	PassengerDto getPassengerById(long passengerId);
	boolean addPassenger(PassengerDto passengerDto);
	void updatePassenger(PassengerDto passengerDto);
    
}
