package com.yaswanth.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yaswanth.request.PassengerInfo;
import com.yaswanth.response.TicketInfo;

@RestController
public class TicketBookingController {
	@PostMapping("/book-ticket")
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo passengerDetails){
		TicketInfo ticket= new TicketInfo();
		ticket.setPassengerName(passengerDetails.getFname()+passengerDetails.getLname());
		ticket.setFrom(passengerDetails.getFromDestination());
		ticket.setTo(passengerDetails.getToDestination());
		ticket.setDate("05/04/2021");
		return new ResponseEntity<>(ticket,HttpStatus.CREATED);
	}
	@GetMapping("/yourTickets")
	public List<TicketInfo> ticketsList(){
		TicketInfo ticket1 = new TicketInfo("Yaswanth","Banglore","Coimabatore","05/04/2021");
		TicketInfo ticket2 = new TicketInfo("Yaswanth","Banglore","Chennai","05/04/2021");
		TicketInfo ticket3 = new TicketInfo("Yaswanth","Banglore","Kurnool","05/04/2021");
		List<TicketInfo> yourTickets = new ArrayList<TicketInfo>();
		yourTickets.add(ticket1);
		yourTickets.add(ticket2);
		yourTickets.add(ticket3);
		return yourTickets;
	}
	

}
