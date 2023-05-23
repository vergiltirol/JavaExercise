package internal_training_exercises.Pizza;

import java.util.Scanner;

public class Exercise4 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			boolean cont = false;
			do {
			showMenu();
			int choice = scanner.nextInt();
			switch(choice) {
			case 1:
				Pepperoni pepperoni = new Pepperoni();
				pepperoni.showPizzaDetails();
				break;
			case 2:
				Hawaiian hawaiian = new Hawaiian();
				hawaiian.showPizzaDetails();
				break;
			case 3:
				Buffalo buffalo = new Buffalo();
				buffalo.showPizzaDetails();
				break;
			case 4:
				AllMeat allMeat = new AllMeat();
				allMeat.showPizzaDetails();
				break;
				default:
					System.out.println("Invalid choice");
					break;
			}
			System.out.println("Would you like to choose another? Y/N");
			cont = scanner.next().toLowerCase().equals("y") ? true : false;
			}while(cont);
		}
		catch (Exception e){
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			scanner.close();
		}
	}
	
	private static void showMenu() {
		System.out.println("Menu: \n"
				+ "1. Pepperoni \n"
				+ "2. Hawaiian \n"
				+ "3. Buffalo \n"
				+ "4. All Meat");
	}

}
