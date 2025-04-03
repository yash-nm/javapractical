package practical.question4.RideSharingSystem;

public class Bike implements Vehicle {

	@Override
	public double calculateFare(double distance) {
		// TODO Auto-generated method stub
		
		double fare = distance * 5;
		
		return fare;
	}

}
