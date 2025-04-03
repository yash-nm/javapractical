package practical.question10.OnlineCourseRegistration;



import java.util.InputMismatchException;
import java.util.Scanner;

public class OnlineCourseRegistration {
	
	OnlineCourseRegistration()
	{
		System.out.println("----------------------------------------");
		System.out.println("\t Welcome To IT Vedant!");
		System.out.println("----------------------------------------");
		System.out.println("\t List Of Courses");
		System.out.println("----------------------------------------");
		System.out.println(" 1. Java FullStack Developement \n 2. Python FullStack Developement \n 3. Data Science");
		System.out.println("----------------------------------------");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		try
		{
			@SuppressWarnings("unused")
			OnlineCourseRegistration reg = new OnlineCourseRegistration();
			System.out.println("Enter your Age: ");
			short age = sc.nextShort();
			if(age<10)
			{
				sc.close();
				throw new InvalidAgeException();
			}
			else if(age>10)
			{
				System.out.println("Enter Course Number: ");
				short coursenumber = sc.nextShort();
				sc.close();
				
				if(coursenumber==1)
				{
					System.out.println("Java Fullstack Developement Selected.");
				}
				else if(coursenumber==2)
				{
					System.out.println("Python FullStack Developement Selected.");
				}
				else if(coursenumber==3)
				{
					System.out.println("Data Science Selected.");
				}
				else if (coursenumber>3)
				{
					throw new ArrayIndexOutOfBoundsException("Invalid Course Number.");
				}
				else
				{
					throw new InvalidInputException();
				}
			}
			else
			{
				sc.close();
				throw new InputMismatchException("Invalid input");
			}
			
		}
		catch(InvalidAgeException  | ArrayIndexOutOfBoundsException | InputMismatchException | NullPointerException e )
		{
			System.out.println(e.getMessage());
		}
	}

}
