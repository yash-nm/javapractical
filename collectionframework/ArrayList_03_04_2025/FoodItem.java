package collectionframework.ArrayList_03_04_2025;

public class FoodItem {
		
	private String itemid, name;  
	private float price;

	public FoodItem(String itemid, String name, float price) {
		
		this.itemid = itemid;
		this.name = name;
		this.price = price;
	}

	public String getItemid() {
		return itemid;
	}

	public void setItemid(String itemid) {
		this.itemid = itemid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "FoodItem [itemid=" + itemid + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
