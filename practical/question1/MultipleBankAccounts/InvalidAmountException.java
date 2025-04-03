package practical.question1.MultipleBankAccounts;

public class InvalidAmountException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAmountException()
	{
		super("Insufficient Funds");
	}
}
