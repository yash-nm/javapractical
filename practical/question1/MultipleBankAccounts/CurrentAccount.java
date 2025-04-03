package practical.question1.MultipleBankAccounts;

public class CurrentAccount implements BankAccount {

	double balanceamount;
	short dailylimit=3;
	
	@Override
	public void deposit(double depositamount) {
		// TODO Auto-generated method stub
		balanceamount = balanceamount + depositamount;
	}

	@Override
	public boolean withdraw(double withdrawamount) {
		// TODO Auto-generated method stub
		boolean withdrawn =false;
		try
		{
			if(withdrawamount > balanceamount)
			{
				throw new InvalidAmountException();	
			}
			else
			{
				if(dailylimit>0)
				{
					balanceamount = balanceamount - withdrawamount;
					dailylimit--;
					withdrawn = true;
				}
				else
				{
					// Exceptions are thrown, Because functions can't directly display message
					throw new DailyWithdrawalLimitException();
				}
			}
		}
		catch(InvalidAmountException | DailyWithdrawalLimitException e)
		{
			System.out.println(e.getMessage());
		}
		return withdrawn;
	}

	@Override
	public double viewbalance() {
		// TODO Auto-generated method stub
		return balanceamount;
	}

		
		
}
