package practical.question10.OnlineCourseRegistration;

public class InvalidAgeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5679665111244032464L;

	InvalidAgeException()
	{
		super("You are not eligible.");
	}
}
