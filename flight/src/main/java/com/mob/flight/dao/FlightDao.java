package com.mob.flight.dao;

import java.util.List;

import com.mob.flight.dto.FlightDto;

public interface FlightDao {

	List<FlightDto> getAllFlight();
	FlightDto getFlightById(long flightId);
	FlightDto addFlight(FlightDto flightDto);
	void updateFlight(FlightDto flightDto);
}
