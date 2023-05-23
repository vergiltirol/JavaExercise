package internal_training_exercises;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise5{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		try {
			List<Grocery> groceries = new ArrayList<>(Arrays.asList(Grocery.initGroceryList()));
			List<Grocery> purchased = new ArrayList<>();
			Grocery.showGroceryList(groceries);

			Boolean cont = false;
			do {

				System.out.println("Enter item to be purchased: ");
				String p = scan.next();
				System.out.println("Enter amount: ");
				int a = scan.nextInt();

				purchased
						.add(groceries.stream().filter((c) -> c.groceryName.toLowerCase().equals(p.toLowerCase()))
								.map(x -> new Grocery(x.groceryName, x.price, x.discount, a,
										((x.price * a) - ((x.price * a) * x.discount))))
								.collect(Collectors.toList()).get(0));

				System.out.println("Would you like to purchase more? Y/N");
				cont = scan.next().toLowerCase().equals("y") ? true : false;
			} while (cont);

			Grocery.showPurchasedItems(purchased);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			scan.close();
		}
	}

}






