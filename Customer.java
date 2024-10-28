package Rest;
import java.util.HashMap;

public class Customer extends Restaurant_Owner implements GST {
	HashMap<String, Integer> order;
	HashMap<String, Integer> ratings; // New HashMap to store ratings for food items
	
	Customer() {
		order = new HashMap<>();
		ratings = new HashMap<>(); // Initialize ratings HashMap
	}
	
	void displayMenu() {
		super.displayMenu();
	}
	
	void displayOrder() {
		if (order.isEmpty()) {
			System.out.println("No Items In Order.");
		} else {
			System.out.println("-------------------------------------");
			System.out.println("FOOD \t QUANTITY \t PRICE \t TOTAL");
			System.out.println("-------------------------------------");
			for (String food : order.keySet()) {
				System.out.println(food + "\t" + order.get(food) + "\t" + menu.get(food) + "\t" 
					+ menu.get(food) * order.get(food));
			}
			System.out.println("-------------------------------------\n");
		}
	}
	
	boolean orderFood(String food, int quantity) {
		if (!menu.containsKey(food)) return false;
		order.put(food, quantity);
		return true;
	}
	
	void rating(String item, int rate) {
		if (!order.containsKey(item)) {
			System.out.println("Please order the item first to give a rating.");
			return;
		}

		if (rate < 1 || rate > 5) {
			System.out.println("Rating should be between 1 and 5.");
		} else {
			ratings.put(item, rate); // Store the rating in the HashMap
			System.out.println("Thank you for rating " + item + " with " + rate + " stars.");
		}
	}
	
	boolean removeFood(String food) {
		if (!order.containsKey(food)) return false;
		order.remove(food);
		return true;
	}
	
	boolean update(String food, int quantity) {
		if (order.containsKey(food)) {
			order.put(food, quantity);
			return true;
		}
		return false;
	}
	
	double totalBill() {
		double amount = 0;
		for (String food : order.keySet()) {
			amount += menu.get(food) * order.get(food);
		}
		double discountAmount = (Restaurant_Owner.getDiscount() * amount) / 100;
		double discountedTotal = amount - discountAmount;
		double tax = GST_Tax_Percent * discountedTotal / 100;
		return discountedTotal + tax;
	}
}
