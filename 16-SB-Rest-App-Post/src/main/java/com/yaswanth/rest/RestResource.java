package com.yaswanth.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yaswanth.request.PassengerInfo;
import com.yaswanth.response.TicketInfo;

@RestController
public class RestResource {
	@PostMapping(value="/book-ticket",consumes= {"application/json"},produces= {"application/json"})
	public TicketInfo bookTicket(@RequestBody PassengerInfo passengerData) {
		
		System.out.println(passengerData.toString());
		TicketInfo TicketBooked = new TicketInfo();
		TicketBooked.setPassengerName(passengerData.getName());
		TicketBooked.setReservedSeat("1A");
		TicketBooked.setTicketCost(450.00);
		return TicketBooked;
	}

}
