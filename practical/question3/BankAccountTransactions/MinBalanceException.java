package practical.question3.BankAccountTransactions;

public class MinBalanceException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -221043100790728611L;

	MinBalanceException()
	{
		super("Minimum 500 balance is required to be maintained.");
	}
}
