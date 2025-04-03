package practical.question10.OnlineCourseRegistration;

import java.util.InputMismatchException;

public class InvalidInputException extends InputMismatchException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7650170777023723907L;

	InvalidInputException()
	{
		super("Invalid input.");
	}
}
