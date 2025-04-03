package practical.question3.BankAccountTransactions;

import java.util.Scanner;

public class BankOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount sac = new SavingsAccount();
		
		Scanner sc = new Scanner(System.in);
		 
		try
		{
			while(true)
			{
				System.out.println("\tWelcome!");
				
				System.out.println("-------------------------");
				System.out.println("Select an option");
				System.out.println("-------------------------");
				System.out.println(" 1. View Balance \n 2. Deposit \n 3. Withdraw \n 4. Exit");
				
				byte input = sc.nextByte();
				
				if(input==1)
				{
					System.out.println("Account Balance: "+sac.checkBalance());
				}
				else if(input==2)
				{
					System.out.println("Enter an amount to be deposited: ");
					double amount = sc.nextDouble();
					if(sac.deposit(amount))
					{
						System.out.println("Amount deposited successfully.");
					}
					else
					{
						System.out.println("Unable to deposite the amount; please try again...");
					}
				}
				else if(input==3)
				{
					System.out.println("Available Balance Amount: "+sac.getBalanceamount());
					System.out.println("-------------------------------");
					System.out.println("Enter an amount to be withdrawn: ");
					double amount = sc.nextDouble();
					if(sac.withdraw(amount))
					{
						System.out.println("Amount has be withdrawn successfully.");
					}
					else
					{
						System.out.println("Unable to withdraw amount; please try again...");
					}
				}
				else if(input==4)
				{
					System.out.println("Logging off...");
					System.exit(0);
					sc.close();
				}
				else
				{
					System.out.println("Invalid input; please try again...");
				}
				System.out.println();
			}
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getLocalizedMessage());
		}
		
		
	}

}
