package internal_training_exercises.Pizza;

public class Hawaiian extends Pizza {
	private static String name = "Hawaiian Pizza";
	private static String description = "Hawaiian pizza is a pizza originating in Canada, and is traditionally topped with pineapple, tomato sauce, cheese, and either ham or bacon";
	private static double price = 135;
	private static String ingredients = "Ham \n" + "\t\tBacon \n" + "\t\tPineapple tidbits \n" + "\t\tMushroom \n" + "\t\tOnions \n"
			+ "\t\tGreen Bell pepper";
	private static double discount = 1;

	public Hawaiian() {
		super(name, description, price, ingredients, discount);
	}
}
