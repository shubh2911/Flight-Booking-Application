package com.mob.flight.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mob.flight.dao.FlightDao;
import com.mob.flight.dto.FlightDto;

@Service
public class FlightServe implements FlightServ {

	@Autowired
	private FlightDao dao;
	
	@Override
	public List<FlightDto> getAllFlight() {
		// TODO Auto-generated method stub
		return dao.getAllFlight();
	}

	@Override
	public FlightDto getFlightById(long flightId) {
		// TODO Auto-generated method stub
		return dao.getFlightById(flightId);
	}

	@Override
	public FlightDto addFlight(FlightDto flightDto) {
		// TODO Auto-generated method stub
		return dao.addFlight(flightDto);
	}

	@Override
	public void updateFlight(FlightDto flightDto) {
		// TODO Auto-generated method stub
         dao.updateFlight(flightDto);
	}

}
