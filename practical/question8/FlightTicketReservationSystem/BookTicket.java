package practical.question8.FlightTicketReservationSystem;

public class BookTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlightTicket f = new FlightTicket("YASH" , 1111 , "Japan" , 75000);
		
		System.out.println("---------------------------------------");
		System.out.println("\t Welcome to ITV Airways");
		System.out.println("---------------------------------------");
		
		System.out.println("Passenger Name:\t\t"+ f.getPassengerName());
		System.out.println("Flight Number:\t\t"+f.getFlightNumber());
		System.out.println("Destination:\t\t"+f.getDestination());
		System.out.println("Price:\t\t\t"+f.getPrice());
		System.out.println("\t Happy Journey!");
		System.out.println("---------------------------------------");
		
	}

}
