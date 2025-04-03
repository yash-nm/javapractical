package practical.question3.BankAccountTransactions;

public class InsufficientFundsException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3860857089399848242L;

	InsufficientFundsException()
	{
		super("Insufficient Funds.");
	}
}
