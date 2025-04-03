package practical.question1.MultipleBankAccounts;

public class DailyWithdrawalLimitException extends Exception{
	
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	DailyWithdrawalLimitException()
	{
		super("Daily Withdrawal limit exceeded!");
	}
}
