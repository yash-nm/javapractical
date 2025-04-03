package practical.question1.MultipleBankAccounts;

import java.util.Scanner;

public class BankOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingsAccount savingsacc = new SavingsAccount();
		CurrentAccount currentacc = new CurrentAccount();
		
		System.out.println("Select your account type: ");
		System.out.println("1. Savings ");
		System.out.println("2. Current ");
		System.out.println("3. Exit ");
		Scanner sc = new Scanner(System.in);
		
		try
		{
			byte input = sc.nextByte();
			
			if(input==1)
			{
				while(true)
				{
					System.out.println("------------------------------");
					System.out.println("  Please select an operation ");
					System.out.println("------------------------------");
					System.out.print("\n 1. View Account Balance \n 2. Deposit Amount \n 3. Withdraw Amount \n 4. Exit ");
					System.out.println("\n------------------------------");
					
					input = sc.nextByte();
//					View Balance					
					if(input==1)
					{
						System.out.println("Account Balance: "+ savingsacc.viewbalance());
					}
//					Deposit Amount
					else if(input==2)
					{
						System.out.println("Enter amount to be deposited: ");
						double amount = sc.nextDouble();
						savingsacc.deposit(amount);
						System.out.println("Amount deposited successfully.");
					}
//					Withdraw Amount
					else if(input==3)
					{
						System.out.println("Enter amount to be withdrawn: ");
						double amount = sc.nextDouble();
						if(savingsacc.withdraw(amount))
						{
							System.out.println("Amount withdrawn successfully.");
						}
					}
//					Log Off
					else if(input == 4)
					{
						System.out.println("Logging off...");
						System.exit(0);
					}
					else
					{
						System.out.println("Invalid input! please try again...");
					}
					System.out.println("\n");
				}
			}
			else if(input==2)
			{
				while(true)
				{
					System.out.println("------------------------------");
					System.out.println("  Please select an operation ");
					System.out.println("------------------------------");
					System.out.print("\n 1. View Account Balance \n 2. Deposit Amount \n 3. Withdraw Amount \n 4. Exit ");
					System.out.println("\n------------------------------");
					
					input = sc.nextByte();
					if(input==1)
					{
						System.out.println("Account Balance: "+ currentacc.viewbalance());
					}
					else if(input==2)
					{
						System.out.println("Enter amount to be deposited: ");
						double amount = sc.nextDouble();
						currentacc.deposit(amount);
						System.out.println("Amount deposited successfully.");
					}
					else if(input==3)
					{
						System.out.println("Daily Withdrawl limit left: "+ currentacc.dailylimit);
						System.out.println("Enter amount to be withdrawn: ");
						double amount = sc.nextDouble();
						if(currentacc.withdraw(amount))
						{
							System.out.println("Amount withdrawn successfully.");
						}
					}
					else if(input == 4)
					{
						System.out.println("Logging off...");
						System.exit(0);
					}
					else
					{
						System.out.println("Invalid input! please try again...");
					}
					System.out.println("\n");
				}
			}
			else if(input == 3)
			{
				System.out.println("Logging off...");
				System.exit(0);
			}
			else
			{
				System.out.println("Invalid input.");
				System.out.println("Logging off...");
				System.exit(0);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
