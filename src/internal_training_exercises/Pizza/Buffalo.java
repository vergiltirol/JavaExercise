package internal_training_exercises.Pizza;

public class Buffalo {
	private String name;
	private String description;
	private double price;
	private String ingredients;
	private double discount;
	
	
	public Buffalo() {
		this.name = "Buffalo Pizza";
		this.description = "Buffalo-style Pizza";
		this.price = 155;
		this.ingredients = "Minced chicken \n"
				+ "\t\tPineapple \n"
				+ "\t\t2 tablespoons olive oil \n"
				+ "\t\tOnions \n"
				+ "\t\tRed Bell pepper \n"
				+ "\t\tAP buffalo sauce \n";
		this.discount = 2;
	}
	
	public void showPizzaDetails() {
		System.out.println("Pizza name: \t" + name);
		System.out.println("Description: \t" + description);
		System.out.println("Price: \t\t" + price);
		System.out.println("Ingredients: \t" + ingredients);
		System.out.println("Discount: \t" + discount + "%");
	}
}
