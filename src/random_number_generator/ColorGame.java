package random_number_generator;

import java.util.Random;
import java.util.Scanner;

public class ColorGame {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	public static final String ANSI_BOLD = "\u001B[1m";

	public static void main(String[] args) {

		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		boolean cont = false;
		int money = 35;
		do {
			
			int perBet = 5;
			int winningRate = 3;
			String[] Colors = {"Red","Green","Yellow","Blue","Purple","Cyan"};
			
			int[] userInput = { 1, 2 ,5};
			int r = random.nextInt(6);
			rollRoulette(r);
			
			boolean win = false;
			for(int i : userInput) {
				if(i == r) {
					win = true;
				}
			}
			
			if(userInput.length == 1) {
				System.out.println("Your bet is: " + userInput[0]);
			}
			else {
				System.out.print("Your bets are: ");
				for(int i: userInput) {
					System.out.print(Colors[i] + " ");
				}
				System.out.println();
			}
			
			if(win) {
				money += (winningRate * perBet);
				System.out.println("You win! " + money);
			} else {
				money -= (perBet * userInput.length);
				System.out.println("You lose! " + money);
			}
			
			if(money < 15) {
				System.out.println("Out of money");
				cont = false;
			}
			else {
				System.out.println("Continue playing? Y/N");
				cont = scan.next().toLowerCase().equals("y") ? true : false;
			}
			
		}while(cont);
		
		System.out.println("Game ended!");
		scan.close();
	}
	
	protected static void rollRoulette(int random) {
		switch (random) {
		case 0:
			System.out.println("WINNING COLOR IS:" + ANSI_BOLD + ANSI_RED + " RED " + ANSI_RESET);
			break;
		case 1:
			System.out.println("WINNING COLOR IS:" + ANSI_BOLD + ANSI_GREEN + " GREEN " + ANSI_RESET);
			break;
		case 2:
			System.out.println("WINNING COLOR IS:" + ANSI_BOLD + ANSI_YELLOW + " YELLOW " + ANSI_RESET);
			break;
		case 3:
			System.out.println("WINNING COLOR IS:" + ANSI_BOLD + ANSI_BLUE + " BLUE " + ANSI_RESET);
			break;
		case 4:
			System.out.println("WINNING COLOR IS:" + ANSI_BOLD + ANSI_PURPLE + " PURPLE " + ANSI_RESET);
			break;
		case 5:
			System.out.println("WINNING COLOR IS:" + ANSI_BOLD + ANSI_CYAN + " CYAN " + ANSI_RESET);
			break;
		}
	}
}
