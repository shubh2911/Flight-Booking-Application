package com.mob.passenger.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="flight")
public class Flight {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@NotNull
	private String src;
	
	@NotNull
	private String dest;
	

	@NotNull
	private String hops;

	@NotNull
	private String starttime;
	

	@NotNull
	private String endtime;
	
	@NotNull
	private int totalSeats;
	
	@NotNull
	private int fare;
	
	@NotNull
	private int bookedSeat;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public String getHops() {
		return hops;
	}

	public void setHops(String hops) {
		this.hops = hops;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	public int getBookedSeat() {
		return bookedSeat;
	}

	public void setBookedSeat(int bookedSeat) {
		this.bookedSeat = bookedSeat;
	}

	@Override
	public String toString() {
		return "Flight [src=" + src + ", dest=" + dest + ", hops=" + hops + ", starttime=" + starttime + ", endtime="
				+ endtime + ", fare=" + fare + "]";
	}
	
	
}
