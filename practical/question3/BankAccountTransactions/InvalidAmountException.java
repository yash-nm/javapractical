package practical.question3.BankAccountTransactions;

public class InvalidAmountException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8470688212820914175L;

	InvalidAmountException()
	{
		super("Invalid Amount.");
	}
}
