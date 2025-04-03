package practical.question6.TrafficSignalSystem;

import java.util.Scanner;

public class TrafficSignalSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide an input: ");
		String userinput = sc.next();
		
		if(userinput.toLowerCase().equals("red"))
		{
			System.out.println("Stop");
		}
		else if(userinput.toLowerCase().equals("yellow"))
		{
			System.out.println("Slow down");
		}
		else if(userinput.toLowerCase().equals("green"))
		{
			System.out.println("Go");
		}
		else
		{
			System.out.println("Provide a valid input.");
		}
		sc.close();
	}

}
