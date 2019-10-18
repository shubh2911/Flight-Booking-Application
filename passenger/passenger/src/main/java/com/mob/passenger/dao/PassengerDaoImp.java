package com.mob.passenger.dao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.mob.passenger.dto.PassengerDto;
import com.mob.passenger.entity.Flight;
import com.mob.passenger.repository.PassengerRepo;
import com.mob.passenger.transformer.FlightDtoTransformer;
import com.mob.passenger.transformer.PassengerDtoTransformer;


@Transactional
@Repository
public class PassengerDaoImp implements PassengerDao {

	@Autowired
	private PassengerRepo resp;

	@Autowired
    private RestTemplate restTemplate;
    
	
	@Override
	public boolean addPassenger(PassengerDto passengerDto) {
		// TODO Auto-generated method stub
		try {
		Flight flight = restTemplate.getForObject("http://localhost:8080/flight/flights/" + passengerDto.getFlightid(),Flight.class);
        if(flight == null)
        {return false;}
		if(flight.getTotalSeats()-flight.getBookedSeat()<1)
		{return false;}
		flight.setBookedSeat(flight.getBookedSeat()+1);
		/*DateTimeFormatter dtf=DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalDateTime now=LocalDateTime.now();
		DateTimeFormatter bookingdate=DateTimeFormatter.ofPattern("yyyy/MM/dd");
		passengerDto.setBookingdate((bookingdate.format(now)).toString());
		passengerDto.setBookingtime((dtf.format(now)).toString());*/
		
		resp.save(PassengerDtoTransformer.getPassengerDtoToPassenger1(passengerDto));
		restTemplate.postForObject("http://localhost:8080/flight/flights/update", FlightDtoTransformer.getFlightToFlightDto(flight), Flight.class);
		return true;
		} catch(Exception e)
		{return false;}
}

	
	@Override
	public PassengerDto getPassengerById(long passengerId) {
		// TODO Auto-generated method stub
		return PassengerDtoTransformer.getPassengerToPassengerDto(resp.findById(passengerId).get());
	}
	
	@Override
	public List<PassengerDto> getAllPassenger() {
		// TODO Auto-generated method stub
		List<PassengerDto> list = new ArrayList<>();
		resp.findAll().forEach(e -> list.add(PassengerDtoTransformer.getPassengerToPassengerDto(e)));
		return list;
	
	}
	
	@Override
	public void updatePassenger(PassengerDto passengerDto) {
		// TODO Auto-generated method stub
		resp.save(PassengerDtoTransformer.getPassengerDtoToPassenger(passengerDto));
	}

}
