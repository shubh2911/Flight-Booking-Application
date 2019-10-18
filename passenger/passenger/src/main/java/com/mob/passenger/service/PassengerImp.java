package com.mob.passenger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mob.passenger.dao.PassengerDao;
import com.mob.passenger.dto.PassengerDto;

@Service
public class PassengerImp implements PassengerInt {

	
	@Autowired
	private PassengerDao dao;
	
	@Override
	public List<PassengerDto> getAllPassenger() {
		// TODO Auto-generated method stub
		return dao.getAllPassenger();
	}

	@Override
	public PassengerDto getPassengerById(long passengerId) {
		// TODO Auto-generated method stub
		return dao.getPassengerById(passengerId);
	}

	@Override
	public boolean addPassenger(PassengerDto passengerDto) {
		// TODO Auto-generated method stub
		return dao.addPassenger(passengerDto);
	}

	@Override
	public void updatePassenger(PassengerDto passengerDto) {
		// TODO Auto-generated method stub

		dao.addPassenger(passengerDto);
	}

}
