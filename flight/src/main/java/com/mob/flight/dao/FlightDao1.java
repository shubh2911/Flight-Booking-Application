package com.mob.flight.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mob.flight.dto.FlightDto;
import com.mob.flight.repository.FlightRepository;
import com.mob.flight.transformer.FlightDtoTransformer;


@Transactional
@Repository
public class FlightDao1 implements FlightDao {

	@Autowired
	private FlightRepository resp;

	
	@Override
	public List<FlightDto> getAllFlight() {
		// TODO Auto-generated method stub
		List<FlightDto> list = new ArrayList<>();
		resp.findAll().forEach(e -> list.add(FlightDtoTransformer.getFlightToFlightDto(e)));
		return list;
	
	}

	@Override
	public FlightDto getFlightById(long flightId) {
		// TODO Auto-generated method stub
	
		return FlightDtoTransformer.getFlightToFlightDto(resp.findById(flightId).get());
	}

	
	@Override
	public void updateFlight(FlightDto flightDto) {
		// TODO Auto-generated method stub
		resp.save(FlightDtoTransformer.getFlightDtoToFlight(flightDto));
	}
	@Override
	public FlightDto addFlight(FlightDto flightDto) {
		// TODO Auto-generated method stub
		return FlightDtoTransformer.getFlightToFlightDto(resp.save(FlightDtoTransformer.getFlightDtoToFlight(flightDto)));
	}


}
