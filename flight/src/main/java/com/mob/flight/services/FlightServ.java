package com.mob.flight.services;

import java.util.List;

import com.mob.flight.dto.FlightDto;


public interface FlightServ {

	List<FlightDto> getAllFlight();
	FlightDto getFlightById(long flightId);
	FlightDto addFlight(FlightDto flightDto);
	void updateFlight(FlightDto flightDto);
    
}
