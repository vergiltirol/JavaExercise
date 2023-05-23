package internal_training_exercises;

import java.util.List;

public class Grocery {
		protected String groceryName;
		protected double discount;
		protected double price;
		protected int quantity;
		protected double amount;

		public Grocery() {
		};

		public Grocery(String groceryName, double price, double discount) {
			this.groceryName = groceryName;
			this.discount = discount;
			this.price = price;
		}

		public Grocery(String groceryName, double price, double discount, int quantity, double amount) {
			this.groceryName = groceryName;
			this.discount = discount;
			this.price = price;
			this.quantity = quantity;
			this.amount = amount;
		}
		
		public static Grocery[] initGroceryList() {
			Grocery[] groceriesArr = { 
					new Grocery("Apple", 20, 0.02), 
					new Grocery("Grapes", 30, 0.03),
					new Grocery("Sardines", 20, 0.02), 
					new Grocery("Singkamas", 21, 0.06), 
					new Grocery("Talong", 80, 0.00),
					new Grocery("Sigarilyas", 32, 0.01), 
					new Grocery("Mani", 69, 0.08),
					new Grocery("Sitaw", 10, 0.1),
					new Grocery("Bataw", 70, 0.09), 
					new Grocery("Patani", 22, 0.2),
					new Grocery("Kalabasa", 44, 0.00), };

			return groceriesArr;
		}
		
		public static void showGroceryList(List<Grocery> items) {
			int i = 1;
			System.out.println("---------------------------------------------------------");
			System.out.printf("%1s %10s %10s %10s", " ", "Grocery Name", "Price", "Discount");
			System.out.println();
			System.out.println("---------------------------------------------------------");
			for (Grocery x : items) {
				System.out.format("%1s %10s %10s %10s", i, x.groceryName, x.price, x.discount * 100 + "%");
				System.out.println();
				i++;
			}
			System.out.println("---------------------------------------------------------");
		}

		public static void showPurchasedItems(List<Grocery> items) {
			int i = 1;
			System.out.println("-------------------------------------------------------------------");
			System.out.printf("%1s %10s %10s %10s %10s %10s", " ", "Grocery Name", "Price", "Discount", "Quantity",
					"Amount");
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------");
			for (Grocery x : items) {
				System.out.format("%1s %10s %10s %10s %10s %10s", i, x.groceryName, x.price, x.discount * 100 + "%", x.quantity,
						x.amount);
				System.out.println();
				i++;
			}
			System.out.println("-------------------------------------------------------------------");
			
			double totalAmount = items.stream().map(amount -> amount.amount).reduce(0d, (a, x) -> a + x);
			System.out.println("Total: " + totalAmount);
		}

	}