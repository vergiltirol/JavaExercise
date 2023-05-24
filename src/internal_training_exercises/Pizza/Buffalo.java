package internal_training_exercises.Pizza;

public class Buffalo extends Pizza {
	private static String name = "Buffalo Pizza";
	private static String description = "Buffalo-style Pizza";
	private static double price = 155;
	private static String ingredients = "Minced chicken \n"
			+ "\t\tPineapple \n"
			+ "\t\t2 tablespoons olive oil \n"
			+ "\t\tOnions \n"
			+ "\t\tRed Bell pepper \n"
			+ "\t\tAP buffalo sauce \n";
	private static double discount = 2;
	
	
	public Buffalo() {
		super(name, description, price, ingredients, discount);
	}
}
