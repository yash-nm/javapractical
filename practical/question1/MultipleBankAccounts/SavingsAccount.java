package practical.question1.MultipleBankAccounts;

public class SavingsAccount implements BankAccount{

	double balanceamount;
	
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
				if(withdrawamount>0)
				{
					balanceamount = balanceamount - withdrawamount;
					withdrawn = true;
				}
			}
		}
		catch(InvalidAmountException e)
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
