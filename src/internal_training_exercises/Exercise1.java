package internal_training_exercises;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		try {
			boolean cont = true;
			do {
				System.out.println(
						"Which one would you like to calculate? \n" 
				+ "A. Pythagorean Theorem (Hypotenuse) \nB. Area of Triangle \n");
				String choice = scanner.next();
				
				switch(choice.toLowerCase()) {
				case "a":
					double a,b;
					System.out.println("Enter value of A:");
					a = scanner.nextDouble();
					System.out.println("Enter value of B:");
					b = scanner.nextDouble();
					solvePythagoreanTheorem(a,b);
					break;
				case "b":
					double base, height;
					System.out.println("Enter value of A:");
					base = scanner.nextDouble();
					System.out.println("Enter value of B:");
					height = scanner.nextDouble();
					System.out.println(areaOfTriangle(base,height));
					break;
					default:
						System.out.println("Invalid input");
						break;
				}
				
				System.out.println();
				System.out.println("Would you like to continue? Y/N");
				choice = scanner.next();
				if(choice.toLowerCase().equals("n")) {
					cont = false;
					System.out.println("");
				}
				else {
					cont = true;
				}
				
			}while(cont);
		}
		catch(Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		finally {
			scanner.close();
		}

	}

	public static void solvePythagoreanTheorem(double a, double b) {
		System.out.format("%.2f", Math.sqrt((a * a) + (b * b))); //Math.sqrt((a * a) + (b * b))
	}

	public static double areaOfTriangle(double base, double height) {
		return (base * base) / 2;
	}

}
