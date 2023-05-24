package internal_training_exercises.Pizza;

public class AllMeat extends Pizza {
	private static String name = "All Meat Pizza";
	private static String description = "All meat Pizza";
	private static double price = 180;
	private static String ingredients = "Ham \n" + "\t\tSalami \n" + "\t\tHungarian Sausage \n" + "\t\tPork pepperoni \n"
			+ "\t\tBeef pepperoni \n" + "\t\tBacon \n" + "\t\tGround beef \n" + "\t\tOnions \n"
			+ "\t\tRed and Green Bell pepper";
	private static double discount = 4;

	public AllMeat() {
		super(name, description, price, ingredients, discount);
	}
}
