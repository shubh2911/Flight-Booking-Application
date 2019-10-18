package com.mob.passenger.dao;

import java.util.List;

import com.mob.passenger.dto.PassengerDto;

public interface PassengerDao {
	List<PassengerDto> getAllPassenger();
	PassengerDto getPassengerById(long passengerId);
	boolean addPassenger(PassengerDto passengerDto);
	void updatePassenger(PassengerDto passengerDto);
    
}
