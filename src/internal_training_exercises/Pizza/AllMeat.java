package internal_training_exercises.Pizza;

public class AllMeat {
	private String name;
	private String description;
	private double price;
	private String ingredients;
	private double discount;
	
	
	public AllMeat() {
		this.name = "All Meat Pizza";
		this.description = "All meat Pizza";
		this.price = 180;
		this.ingredients = "Ham \n"
				+ "\t\tSalami \n"
				+ "\t\tHungarian Sausage \n"
				+ "\t\tPork pepperoni \n"
				+ "\t\tBeef pepperoni \n"
				+ "\t\tBacon \n"
				+ "\t\tGround beef \n"
				+ "\t\tOnions \n"
				+ "\t\tRed and Green Bell pepper";
		this.discount = 4;
	}
	
	public void showPizzaDetails() {
		System.out.println("Pizza name: \t" + name);
		System.out.println("Description: \t" + description);
		System.out.println("Price: \t\t" + price);
		System.out.println("Ingredients: \t" + ingredients);
		System.out.println("Discount: \t" + discount + "%");
	}
}
