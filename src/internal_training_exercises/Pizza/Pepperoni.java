package internal_training_exercises.Pizza;

public class Pepperoni extends Pizza {
	private static String name = "Pepperoni Pizza";
	private static String description = "Pizza with Pepperoni";
	private static double price = 145;
	private static String ingredients = "1 cup plus 2 tablespoons water \n"
			+ "\t\t2 tablespoons grated Parmesan cheese \n"
			+ "\t\t2 tablespoons olive oil \n"
			+ "\t\t1-1/2 teaspoons Italian seasoning \n"
			+ "\t\t1 teaspoon sugar \n"
			+ "\t\t1 teaspoon salt \n"
			+ "\t\t3 cups all-purpose flour \n"
			+ "\t\t2-1/2 teaspoons active dry yeast \n"
			+ "\t\t1 tablespoon cornmeal";
	private static double discount = 5;
	
	
	public Pepperoni() {
		super(name, description, price, ingredients, discount);
	}
	
	

}
