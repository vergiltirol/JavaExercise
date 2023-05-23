package internal_training_exercises;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		try {
			boolean cont = true;
			do {
				double mass, density, volume;
				System.out.println("Which one would you like to calculate? \n" 
				+ "A. Density \nB. Mass \nC. Volume");
				String choice = scanner.next();

				switch (choice.toLowerCase()) {
				case "a":
					System.out.println("Enter value of mass:");
					mass = scanner.nextDouble();
					System.out.println("Enter value of volume:");
					volume = scanner.nextDouble();
					System.out.println("value of Density: " + getDensity(mass, volume));
					if(getDensity(mass, volume) >= 1) {
						System.out.println("It will float.");
					}
					else{
						System.out.println("It won't float.");
					}
					break;
				case "b":
					System.out.println("Enter value of density:");
					density = scanner.nextDouble();
					System.out.println("Enter value of volume:");
					volume = scanner.nextDouble();
					System.out.println("value of Mass: " + getMass(density, volume));
					break;
				case "c":
					System.out.println("Enter value of density:");
					density = scanner.nextDouble();
					System.out.println("Enter value of mass:");
					mass = scanner.nextDouble();
					System.out.println("value of Volume: " + getVolume(density, mass));
					break;
				default:
					System.out.println("Invalid input");
					break;
				}

				System.out.println();
				System.out.println("Would you like to continue? Y/N");
				choice = scanner.next();
				if (choice.toLowerCase().equals("n")) {
					cont = false;
					System.out.println("");
				}
				else {
					cont = true;
				}

			} while (cont);
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		} finally {
			scanner.close();
		}

	}

	public static double getDensity(double mass, double volume) {
		return mass / volume;
	}

	public static double getMass(double density, double volume) {
		return density * volume;
	}

	public static double getVolume(double density, double mass) {
		return mass / density;
	}

}
