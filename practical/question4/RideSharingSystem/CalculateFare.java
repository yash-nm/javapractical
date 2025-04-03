package practical.question4.RideSharingSystem;

public class CalculateFare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		Bike b = new Bike();
		System.out.println("Car fare for 10Km distance is "+c.calculateFare(10));
		System.out.println("Bike fare for 10Km distance is "+b.calculateFare(10));
	}

}
