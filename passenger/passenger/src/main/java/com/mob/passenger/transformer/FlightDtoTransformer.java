package com.mob.passenger.transformer;

import com.mob.passenger.dto.FlightDto;
import com.mob.passenger.entity.Flight;

public class FlightDtoTransformer {

	public static Flight getFlightDtoToFlight(FlightDto a)
	{
		Flight b=new Flight();		
		b.setBookedSeat(a.getBookedSeat());
		b.setDest(a.getDest());
		b.setEndtime(a.getEndtime());
		b.setFare(a.getFare());
		b.setHops(a.getHops());
		b.setId(a.getId());
		b.setSrc(a.getSrc());
		b.setStarttime(a.getStarttime());
		b.setTotalSeats(a.getTotalSeats());
		return b;
	}
	
	public static FlightDto getFlightToFlightDto(Flight a)
	{
		FlightDto b=new FlightDto();		
		b.setBookedSeat(a.getBookedSeat());
		b.setDest(a.getDest());
		b.setEndtime(a.getEndtime());
		b.setFare(a.getFare());
		b.setHops(a.getHops());
		b.setId(a.getId());
		b.setSrc(a.getSrc());
		b.setStarttime(a.getStarttime());
		b.setTotalSeats(a.getTotalSeats());
		return b;
	}
}
