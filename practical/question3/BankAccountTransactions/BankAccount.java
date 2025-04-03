package practical.question3.BankAccountTransactions;

public class BankAccount {
	
	private double balanceamount;

public double getBalanceamount() {
		return balanceamount;
	}

	public void setBalanceamount(double balanceamount) {
		this.balanceamount = balanceamount;
	}

	//	Deposit Funds
	boolean deposit(double depositamount)
	{
		boolean deposited = false;
		try
		{
			if(depositamount<0)
			{
				throw new InvalidAmountException();
			}
			else
			{
				balanceamount 	= balanceamount + depositamount;
				deposited 		= true;
			}
		}
		catch(InvalidAmountException e)
		{
			System.out.println(e.getLocalizedMessage());
		}
		return deposited;
	}
	
//	Withdraw Funds	
	boolean withdraw(double withdrawamount)
	{
		boolean withdrawal = false;
		try
		{
			if(withdrawamount>balanceamount)
			{
				throw new InsufficientFundsException();
			}
			else
			{
				balanceamount = balanceamount - withdrawamount;
				withdrawal = true;
			}
		}
		catch(InsufficientFundsException e)
		{
			System.out.println(e.getMessage());
		}
		
		return withdrawal;
	}
	
//	Check Balance Funds	
	double checkBalance()
	{
		return balanceamount;
	}
}
