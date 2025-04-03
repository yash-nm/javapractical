package practical.question4.RideSharingSystem;

public class Car implements Vehicle{

	@Override
	public double calculateFare(double distance) {
		// 10rupee/Km
		
		double fare = distance * 10;
		
		return fare;
	}

}
