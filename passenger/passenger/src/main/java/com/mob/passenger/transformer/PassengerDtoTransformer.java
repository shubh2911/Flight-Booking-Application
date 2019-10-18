package com.mob.passenger.transformer;

import com.mob.passenger.dto.PassengerDto;
import com.mob.passenger.entity.Passenger;

public class PassengerDtoTransformer {

	static public Passenger getPassengerDtoToPassenger(PassengerDto p)
	{
		Passenger q=new Passenger();
		q.setBookingdate(p.getBookingdate());
		q.setBookingtime(p.getBookingtime());
		q.setFlightid(p.getFlightid());
		q.setId(p.getFlightid());
		q.setName(p.getName());
		return q;
	}
	
	static public Passenger getPassengerDtoToPassenger1(PassengerDto p)
	{
		Passenger q=new Passenger();
		q.setBookingdate(p.getBookingdate());
		q.setBookingtime(p.getBookingtime());
		q.setFlightid(p.getFlightid());
		
		q.setName(p.getName());
		return q;
	}
	
	static public PassengerDto getPassengerToPassengerDto(Passenger p)
	{
		PassengerDto q=new PassengerDto();
		q.setBookingdate(p.getBookingdate());
		q.setBookingtime(p.getBookingtime());
		q.setFlightid(p.getFlightid());
		q.setId(p.getId());
		q.setName(p.getName());
		return q;
	}
}
