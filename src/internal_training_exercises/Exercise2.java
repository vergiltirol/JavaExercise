package internal_training_exercises;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		try {
			boolean cont = true;
			do {

				int range;
				System.out.println("Enter the range:");

				range = scanner.nextInt();
				getFibonacciSequence(range);

				System.out.println();
				System.out.println("Would you like to continue? Y/N");
				String choice = scanner.next();
				if (choice.toLowerCase().equals("n")) {
					cont = false;
					System.out.println("");
				}
				else {
					cont = true;
				}

			} while (cont);
		} catch (NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		} finally {
			scanner.close();
		}

	}

	public static void getFibonacciSequence(int range) {
		int[] b = new int[range];
		b[0] = 1;
		b[1] = 2;
		System.out.print(b[0] + " " + b[1]);
		for (int i = 2; i < range; i++) {
			b[i] = b[i - 1] + b[i - 2];
			System.out.print(" " + b[i]);
		}
	}
}
