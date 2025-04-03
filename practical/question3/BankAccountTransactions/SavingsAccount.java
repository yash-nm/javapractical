package practical.question3.BankAccountTransactions;

public class SavingsAccount extends BankAccount {

	SavingsAccount()
	{
		super.setBalanceamount(500);
	}
	
	boolean withdraw(double withdrawamount)
	{
		boolean withdrawal = false;
		 double amounttocheck = super.getBalanceamount() - withdrawamount;
		
		 try
		 {
			 if(amounttocheck>=500)
			{
				super.withdraw(withdrawamount);
				withdrawal = true;
			}
			 else
			{
				throw new MinBalanceException();
			} 
		 }
		 catch(MinBalanceException e)
		 {
			 System.out.println(e.getLocalizedMessage());
		 }
		return withdrawal;
	}
}
