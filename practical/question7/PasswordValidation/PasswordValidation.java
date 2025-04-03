package practical.question7.PasswordValidation;

import java.util.Scanner;

public class PasswordValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		try
		{
			while(true)
			{
				System.out.println("---------------------------");
				System.out.println("\tWelcome!");
				System.out.println("---------------------------");
				
				System.out.print(" Enter Username: ");
				String username = sc.nextLine();
				System.out.print(" Enter Password: ");
				String password = sc.nextLine();
				if(username.isBlank())
				{
					System.out.println("Username cannot be empty; please try again...");
					System.exit(0);
				}
				else if(password.isBlank())
				{
					sc.close();
					throw new NullPointerException("Password cannot be empty.");
					
				}
				else if(username.toLowerCase().equals("yash") && password.equals("12345"))
				{
					System.out.println("Hello Yash!");
					System.out.println("Welcome to IT Vedant.");
					System.exit(0);
				}
				else
				{
					System.out.println("Username or Password is incorrect; please try again...");
				}
			}
			
			//sc.close(); 
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getLocalizedMessage());
		}
	}
}
