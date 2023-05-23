package internal_training_exercises.Pizza;

public class Pepperoni {
	private String name;
	private String description;
	private double price;
	private String ingredients;
	private double discount;
	
	
	public Pepperoni() {
		this.name = "Pepperoni Pizza";
		this.description = "Pizza with Pepperoni";
		this.price = 145;
		this.ingredients = "1 cup plus 2 tablespoons water \n"
				+ "\t\t2 tablespoons grated Parmesan cheese \n"
				+ "\t\t2 tablespoons olive oil \n"
				+ "\t\t1-1/2 teaspoons Italian seasoning \n"
				+ "\t\t1 teaspoon sugar \n"
				+ "\t\t1 teaspoon salt \n"
				+ "\t\t3 cups all-purpose flour \n"
				+ "\t\t2-1/2 teaspoons active dry yeast \n"
				+ "\t\t1 tablespoon cornmeal";
		this.discount = 5;
	}
	
	public void showPizzaDetails() {
		System.out.println("Pizza name: \t" + name);
		System.out.println("Description: \t" + description);
		System.out.println("Price: \t\t" + price);
		System.out.println("Ingredients: \t" + ingredients);
		System.out.println("Discount: \t" + discount + "%");
	}
	
	

}
