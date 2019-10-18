package com.mob.flight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mob.flight.dto.FlightDto;
import com.mob.flight.services.FlightServ;
@Controller
@RequestMapping("flight")
public class FLightController {

	@Autowired
	private FlightServ service;
	
	@PostMapping("flights")
	public ResponseEntity<FlightDto> createFLight(@RequestBody FlightDto flightDto){
		FlightDto flightDto1 = service.addFlight(flightDto);
		return new ResponseEntity<FlightDto>(flightDto1, HttpStatus.OK);
		
	}
	
	@PostMapping("flights/update")
	public void updateFlight(@RequestBody FlightDto FlightDto){
	    service.updateFlight(FlightDto);
		
	}
	@GetMapping("flights")
	public ResponseEntity<List<FlightDto>> getAllFlightDto(){
		
		List<FlightDto> flights = service.getAllFlight();
		return new ResponseEntity<List<FlightDto>>(flights, HttpStatus.OK);
		
	}
	
	@GetMapping("flights/{flightId}")
	public ResponseEntity<FlightDto> getFlightDtoById(@PathVariable("flightId") Long flightId){
		FlightDto flight = service.getFlightById(flightId);
		return new ResponseEntity<FlightDto>(flight, HttpStatus.OK);
	}
	

	
}
