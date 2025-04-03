package collectionframework.ArrayList_03_04_2025;

import java.util.ArrayList;
import java.util.List;

public class OrderFoodItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<FoodItem> list = new ArrayList<FoodItem>();
		
		list.add(new FoodItem("1","Frankie",45));
		list.add(new FoodItem("2","Pizza",455));
		list.add(new FoodItem("3","Fries",79));
		
		System.out.println("List : "+list);
		
		for(FoodItem item:list)
		{
			System.out.println(item);
		}
		
	}

}
