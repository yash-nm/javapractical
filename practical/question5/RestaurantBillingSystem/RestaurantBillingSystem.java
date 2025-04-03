package practical.question5.RestaurantBillingSystem;

import java.util.Scanner;

public class RestaurantBillingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\t Welcome!");
		System.out.println("---------------------------");
		System.out.println("\tTodays Menu ");
		System.out.println("---------------------------");
		System.out.print(" 1. Masala Dosa\t\t\t100 \n 2. Veg Thali\t\t\t150 \n 3. Paneer Masala and Roti\t250 \n");
		
		System.out.println("\nEnter no of items to be ordered: ");
		byte items = sc.nextByte();
		double totalprice=0;
		double discountamount=0;
		
		
		try
		{
			int ordernumber=1;
			String bill[] = new String[items];
			
			while(items>0)
			{
				System.out.println("Enter Order item "+ordernumber);
				byte order = sc.nextByte();
				short quantity=0;
				
				switch(order)
				{
				case 1: 
						System.out.println("Enter Quantity: ");
						quantity 	= sc.nextShort();
						totalprice 	= totalprice + 100 * quantity;
						bill[ordernumber-1] = "Masala Dosa\t\t\t100*"+quantity+"= "+(quantity*100);
						break;
				case 2:
						System.out.println("Enter Quantity: ");
						quantity 	= sc.nextShort();
						totalprice 	= totalprice + 150*quantity;
						bill[ordernumber-1] = "Veg Thali\t\t\t150*"+quantity+"= "+(quantity*150);
						break;
				case 3:
						System.out.println("Enter Quantity: ");
						quantity 	= sc.nextShort();
						totalprice 	= totalprice + 250 * quantity;
						bill[ordernumber-1] = "Paneer Masala and Roti\t\t250*"+quantity+"= "+(quantity*250);
						break;
				default:
						System.out.println("Order Item not available; please try again...");
						break;
				}
				
				items--;
				ordernumber++;
			}
			
			if(totalprice>1000)
			{
				discountamount = 0.1*totalprice;
				totalprice = totalprice - discountamount;
			}
			
			System.out.println("----\t----\t----\t----\t----\t----");
			for(int i=0; i<bill.length;i++)
			{
				System.out.println(bill[i]);
			}
			System.out.println("\t\t-------------------------------");
			System.out.println("Discounted Amount\t\t\t"+discountamount);
			System.out.println("Total Amount\t\t\t\t"+totalprice);
			sc.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getLocalizedMessage());
		}
	}

}
