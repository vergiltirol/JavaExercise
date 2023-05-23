package internal_training_exercises;

import java.util.Scanner;

public class TestResults {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		try {

//			System.out.println(
//					"Which one would you like to calculate? \n" 
//			+ "A. Pythagorean Theorem \nB. Area of Triangle \n");
//			String choice = scanner.next();
//
//			
//			
//			Exercise1 ex;
//			int a,b;
//			switch (choice.toUpperCase()) {
//			case "A":
//				System.out.println("Enter the value of A: ");
//				a = scanner.nextInt();
//				System.out.println("Enter the value of B: ");
//				b = scanner.nextInt();
//				ex = new Exercise1(a, b);
//				System.out.println(ex.solvePythagoreanTheorem());
//				break;
//			case "B":
//				System.out.println("Enter the value of base of the triangle: ");
//				a = scanner.nextInt();
//				System.out.println("Enter the value of height of the triangle: ");
//				b = scanner.nextInt();
//				ex = new Exercise1(a, b);
//				System.out.println(ex.areaOfTriangle());
//				break;
//			default:
//				System.out.println("Invalid choice");
//				break;
//			}

//			Exercise2 ex2 = new Exercise2();
//			System.out.println("Enter number of sequences: ");
//			int sequence = scanner.nextInt();
//			ex2.getFibonacciSequence(sequence);

//			Exercise3 ex3 = new Exercise3();
//			System.out.println("Which one would you like to calculate? \n" 
//			+"A. Density \nB. Mass \nC. Volume");
//			String choice = scanner.next();
//	
//			switch (choice.toUpperCase()) {
//			case "A":
//				System.out.println("Density is: " + ex3.getDensity(3, 2));
//				break;
//			case "B":
//				System.out.println("Mass is: " + ex3.getMass(200, 500) + " kg");
//				break;
//			case "C":
//				System.out.println("Volume is: " + ex3.getVolume(100, 200));
//				break;
//			default:
//				System.out.println("Invalid choice");
//				break;
//			}
		}
		catch(Exception ex) {
			System.out.println("Error found: " + ex.getMessage());
		}

		scanner.close();
	}

}
