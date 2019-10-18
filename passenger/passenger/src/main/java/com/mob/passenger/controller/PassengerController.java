package com.mob.passenger.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.mob.passenger.dto.PassengerDto;
import com.mob.passenger.entity.Flight;
import com.mob.passenger.service.PassengerInt;

@Controller
@RequestMapping("passenger")
public class PassengerController {

	@Autowired
    private RestTemplate restTemplate;
    
	
	@Autowired
	private PassengerInt service;
	
	@PostMapping("passenger")
	public ResponseEntity<String> createPassengert(@RequestBody PassengerDto PassengerDto){
		boolean b = service.addPassenger(PassengerDto);
		if(b){
			String responseContent = "Passenger  Added successfully";
			return new ResponseEntity<String>(responseContent,HttpStatus.OK);
		}else
		{
			String error = "";
			return new ResponseEntity<String>(error,HttpStatus.OK);
		}
		
		
	}
	
	@PostMapping("passenger/update")
	public void updateFlight(@RequestBody PassengerDto PassengerDto){
		boolean b = service.addPassenger(PassengerDto);	
			}
	
	
	@GetMapping("passenger")
	public ResponseEntity<List<PassengerDto>> getAllPassengerDto(){
		
		List<PassengerDto> passenger = service.getAllPassenger();
		return new ResponseEntity<List<PassengerDto>>(passenger, HttpStatus.OK);
		
	}
	
	@GetMapping("passenger/{passengerId}")
	public ResponseEntity<String> getPassengerDtoById(@PathVariable("passengerId") Long passengerId){
		PassengerDto passenger = service.getPassengerById(passengerId);
		Flight flight = restTemplate.getForObject("http://localhost:8080/flight/flights/" + passenger.getFlightid(),Flight.class);
		String data=flight.toString()+" "+passenger.toString();
		return new ResponseEntity<String>(data, HttpStatus.OK);
	}
	


}
