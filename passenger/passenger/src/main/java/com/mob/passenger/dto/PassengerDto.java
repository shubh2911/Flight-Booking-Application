package com.mob.passenger.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class PassengerDto {

	@Id
	private Long id;
	
	@NotNull
	private String name;
	
	@NotNull
	private String bookingdate;
	

	@NotNull
	private String bookingtime;

	@NotNull
	private long flightid;

	public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getBookingdate() {
			return bookingdate;
		}

		public void setBookingdate(String bookingdate) {
			this.bookingdate = bookingdate;
		}

		public String getBookingtime() {
			return bookingtime;
		}

		public void setBookingtime(String bookingtime) {
			this.bookingtime = bookingtime;
		}

		public long getFlightid() {
			return flightid;
		}

		public void setFlightid(long flightid) {
			this.flightid = flightid;
		}

		@Override
		public String toString() {
			return "Passenger Details [name=" + name + ", bookingdate=" + bookingdate + ", bookingtime=" + bookingtime + "]";
		}
	
		
		

}

