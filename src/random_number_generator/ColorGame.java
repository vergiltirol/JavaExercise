package random_number_generator;

import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ColorGame {
	public static final String ANSI_RESET = "\u001B[0m";
//	public static final String ANSI_RED = "\u001B[31m";
//	public static final String ANSI_GREEN = "\u001B[32m";
//	public static final String ANSI_YELLOW = "\u001B[33m";
//	public static final String ANSI_BLUE = "\u001B[34m";
//	public static final String ANSI_PURPLE = "\u001B[35m";
//	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_BOLD = "\u001B[1m";

	public static final String[] COLOR_WHEEL = { "\u001B[31m", "\u001B[32m", "\u001B[33m", "\u001B[34m", "\u001B[35m",
			"\u001B[36m" };
	public static final String[] COLORS = { "red", "green", "yellow", "blue", "purple", "cyan" };

	public static void main(String[] args) {

		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		boolean cont = false;
		int money = 35;
		do {
			showColorMenu();
			int perBet = 5;
			int winningRate = 3;

			List<Integer> userInput = new ArrayList<>();
			
			boolean addMoreColor = false;
			do {
				System.out.println("Enter bet color: ");
				String color = scan.next();
				
				userInput.add(getIndexOfColors(color));
				
				System.out.println("Bet more colors? Y/N");
				addMoreColor = scan.next().toLowerCase().equals("y") ? true : false;
			}while(addMoreColor);
			
			int r = 0; //random.nextInt(6);
			roulette(r);

			int winCount = 0;
			for (int i : userInput) {
				if (i == r) {
					winCount++;
				}
			}
			
			
			if (userInput.size() == 1) {
				System.out.println("Your bet is: " + COLORS[userInput.get(0)].toUpperCase());
			} else {
				System.out.print("Your bets are: ");
				for (int i : userInput) {
					System.out.print(COLORS[i].toUpperCase() + " ");
				}
				System.out.println();
			}
			
			
			int winnings = 0;
			if (winCount > 0) {
				winnings = (winningRate * perBet) * winCount;
				money += winnings;
				System.out.format("You win! P%d \n" + "your total money: %d ", winnings, money);
			} else {
				winnings = (perBet * userInput.size());
				money -= (perBet * userInput.size());
				System.out.format("You lose! P%d \n" + "your total money: P%d ", winnings, money);
			}

			if (money < 15) {
				System.out.println("Out of money");
				cont = false;
			} else {
				System.out.println("Continue playing? Y/N");
				cont = scan.next().toLowerCase().equals("y") ? true : false;
			}
			
//			System.out.println("Continue playing? Y/N");
//			cont = scan.next().toLowerCase().equals("y") ? true : false;

		} while (cont);

		System.out.println("Game ended!");
		scan.close();
	}

	protected static void showColorMenu() {
		System.out.println("Choose from the colors:");
		int i = 0;
		for(String c: COLORS) {
			System.out.print("\t" + COLOR_WHEEL[i] + c.toUpperCase() + ANSI_RESET);
			i++;
		}
		System.out.println();
	}

	protected static int checkSameColor(int[] n) {
		int counter = 0;
		for (int i = 1; i < n.length; i++) {
			if(n[i-1] == n[i]) {
				counter++;
			}
		}
		return counter;
	}

	protected static void roulette(int r) {
		System.out.println("WINNING COLOR IS: " + ANSI_BOLD + COLOR_WHEEL[r] + COLORS[r].toUpperCase() + ANSI_RESET);

	}
	
	protected static int getIndexOfColors(String input) {
		List<String> ab = Arrays.asList(COLORS);
		return ab.indexOf(input);
	}
	

}
