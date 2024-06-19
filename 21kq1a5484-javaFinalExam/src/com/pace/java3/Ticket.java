package com.pace.java3;

import java.util.ArrayList;

public class Ticket {
	long phnNumber;
	String source;
	String destination;
	float price;
	
	ArrayList<Ticket>ticketList = new ArrayList<Ticket>();
	
	public Ticket(long phnNumber, String source, String destination, float price) {
		super();
		this.phnNumber = phnNumber;
		this.source = source;
		this.destination = destination;
		this.price = price;
	}
	

	public long getPhnNumber() {
		return phnNumber;
	}


	public void setPhnNumber(long phnNumber) {
		this.phnNumber = phnNumber;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}

	public void addTicket(Ticket ticket) {
		ticketList.add(ticket);
	}
	
	public void showTicketsBooked() {
		for(Ticket ele : ticketList) {
			System.out.println("Ticket Details");
			System.out.println("Phone number: "+ele.getPhnNumber());
			System.out.println("Source: "+ele.getSource());
			System.out.println("Destination: "+ele.getDestination());
			System.out.println("Price: "+ele.getPrice());
		}
	}
	
	public void ticketCount() {
		int tickets = 0;
		for(Ticket count : ticketList) {
			tickets = tickets +1;
			System.out.println("Ticket Count: "+tickets);
		}
	}
	

}
