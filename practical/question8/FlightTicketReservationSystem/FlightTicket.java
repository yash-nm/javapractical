package practical.question8.FlightTicketReservationSystem;

public class FlightTicket {
	
	private String 	passengerName; 
	private int 	flightNumber;
	private String 	destination; 
	private double 	price;
	
	
	public FlightTicket(String passengerName, int flightNumber, String destination, double price) {
		
		this.passengerName = passengerName;
		this.flightNumber = flightNumber;
		this.destination = destination;
		this.price = price;
	}
	
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
