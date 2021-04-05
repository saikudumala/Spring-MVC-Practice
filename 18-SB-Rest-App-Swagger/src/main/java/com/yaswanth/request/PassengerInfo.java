package com.yaswanth.request;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassengerInfo {

	private String fname;
	private String lname;
	private String fromDestination;
	private String toDestination;
	
}
