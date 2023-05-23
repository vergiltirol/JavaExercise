package internal_training_exercises.Pizza;

public class Hawaiian {
	private String name;
	private String description;
	private double price;
	private String ingredients;
	private double discount;
	
	
	public Hawaiian() {
		this.name = "Hawaiian Pizza";
		this.description = "Hawaiian pizza is a pizza originating in Canada, and is traditionally topped with pineapple, tomato sauce, cheese, and either ham or bacon";
		this.price = 135;
		this.ingredients = "Ham \n"
				+ "\t\tBacon \n"
				+ "\t\tPineapple tidbits \n"
				+ "\t\tMushroom \n"
				+ "\t\tOnions \n"
				+ "\t\tGreen Bell pepper";
		this.discount = 1;
	}
	
	public void showPizzaDetails() {
		System.out.println("Pizza name: \t" + name);
		System.out.println("Description: \t" + description);
		System.out.println("Price: \t\t" + price);
		System.out.println("Ingredients: \t" + ingredients);
		System.out.println("Discount: \t" + discount + "%");
	}
}
