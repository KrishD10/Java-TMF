package Rest;
import java.util.*;
public class Restaurant_Owner {
	private static float discount;
	static HashMap<String,Float> menu;
	Restaurant_Owner()
	{
		menu=new HashMap<String,Float>();
		discount = 0.0f; 
	}
	boolean authorize(String username,String password)
	{
		return username.equals("Restaurant") && password.equals("Rest123");
	}
	
	boolean addItem(String food,float price) {
		
		if(menu.containsKey(food)) {
			return false;
		}
		else {
			menu.put(food, price);
			return true;
		}
	}
	boolean deleteItem(String food)
	{
		if(menu.containsKey(food))
		{
			menu.remove(food);
			return true;
		}
		else {
			return false;
		}
	}
	boolean update(String food,float price)
	{
		if(menu.containsKey(food)) {
			//deleteItem(food);
			addItem(food,price);
			return true;
		}else
		{
			return false;
		}
		 
	}
	void displayMenu() {
		if(menu.isEmpty()) {
			System.out.println("Menu is Empty");
		}
		Set<String> foodNames=new HashSet<String>();
		foodNames=menu.keySet();
		System.out.println("-------------------------------------");
		System.out.println("FOOD \t PRICE");
		System.out.println("-------------------------------------");
		
		for(String food: foodNames) {
			System.out.println(food + "\t" + menu.get(food));   //menu.get returns values i.e price
		}
		System.out.println("-------------------------------------");
		
	}
	public static void setDiscount(float discountvalue) {
        discount = discountvalue;
    }

    public static float getDiscount() {
        return discount;
    }
}
