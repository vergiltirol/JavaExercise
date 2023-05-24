package internal_training_exercises.Pizza;

public class Pizza {
	private String name;
	private String description;
	private double price;
	private String ingredients;
	private double discount;
	
	public Pizza(String name, String description, double price, String ingredients, double discount) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.ingredients = ingredients;
		this.discount = discount;
	}
	
	
	public String toString() {
		return "Pizza name: \t" + name + "\n" +
		"Description: \t" + description+ "\n" +
		"Price: \t\t" + price+ "\n" +
		"Ingredients: \t" + ingredients+ "\n" +
		"Discount: \t" + discount + "%";
	}
	

}
