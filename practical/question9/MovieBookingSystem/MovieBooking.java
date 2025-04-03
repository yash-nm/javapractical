package practical.question9.MovieBookingSystem;

import java.util.Scanner;

public class MovieBooking {

	Scanner sc = new Scanner(System.in);
	
	MovieBooking()
	{
		System.out.println("----------------------------------");
		System.out.println("\tWelcome to ITVR");
		System.out.println("----------------------------------");
		System.out.println("1.Chaava \t  11:30 PM \n2.Sikander \t  01:00 PM ");
		System.out.println("----------------------------------");
	}
	
	void bookTicket()
	{
		System.out.println("select your movie:");
		short input = sc.nextShort();
		if(input==1)
		{	
			System.out.println("__________________________________");
			System.out.println("Movie Name:\t Chaava");
			System.out.println("----------------------------------");
			System.out.println("Time:\t\t 11:30PM");
			System.out.println("----------------------------------");
			System.out.println("Seats:\t\t 01");
			System.out.println("----------------------------------");
			System.out.println("__________________________________");
		}
		else if(input==2)
		{
			System.out.println("__________________________________");
			System.out.println("Movie Name:\t Sikander");
			System.out.println("----------------------------------");
			System.out.println("Time:\t\t 01:00PM");
			System.out.println("----------------------------------");
			System.out.println("Seats:\t\t 01");
			System.out.println("----------------------------------");
			System.out.println("__________________________________");
		}
	}
	
	void bookTicket(int seats)
	{
		System.out.println("select your movie:");
		short input = sc.nextShort();
		if(input==1)
		{	
			System.out.println("----------------------------------");
			System.out.println("Movie Name: Chaava");
			System.out.println("Time:\t\t 11:30PM");
			System.out.println("----------------------------------");
			System.out.println("Seats:\t\t "+seats);
			System.out.println("----------------------------------");
		}
		else if(input==2)
		{
			System.out.println("__________________________________");
			System.out.println("Movie Name:\t Sikander");
			System.out.println("----------------------------------");
			System.out.println("Time:\t\t 01:00PM");
			System.out.println("----------------------------------");
			System.out.println("Seats:\t\t "+seats);
			System.out.println("----------------------------------");
			System.out.println("__________________________________");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MovieBooking m = new MovieBooking();
		m.bookTicket();
		m.bookTicket(4);
	}

}
