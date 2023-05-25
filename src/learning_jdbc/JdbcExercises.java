package learning_jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class JdbcExercises {

	private final static String DB_HOST = "localhost:5432";
	private final static String DB_NAME = "JavaExercise";
	private final static String DB_USERNAME = "postgres";
	private final static String DB_PASSWORD = "password";

	public static void main(String[] args) {
		// set DB connection
		DbConnection dbCon = new DbConnection(DB_HOST, DB_NAME, DB_USERNAME, DB_PASSWORD);

		Scanner scanner = new Scanner(System.in);

		try {
			Connection connection = dbCon.getConnection();
			OrderDao orderDao = new OrderDao(connection);
			Order order;
			String code, region;
			double unitCost;
			boolean cont = false;
			do {

				// Show exercise menu
				showMenu();

				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					// Exercise 7
					// Search by code
					System.out.println("Enter code: ");
					code = scanner.next();
					order = orderDao.getByCode(code);
					showTableHeader();
					System.out.println(order);
					break;
				case 2:
					// Exercise 8
					// Filter data by region
					System.out.println("Enter region: ");
					region = scanner.next();
					List<Order> orders = orderDao.getByRegion(region.toLowerCase());
					showTableHeader();
					for (Order or : orders) {
						System.out.println(or);
					}
					break;
				case 3:
					// Exercise 9
					// Update data
					System.out.println("Enter code: ");
					code = scanner.next();
					System.out.println("Enter new unit cost: ");
					unitCost = scanner.nextDouble();
					order = orderDao.update(code, unitCost);
					showTableHeader();
					System.out.println(order);
					break;
				default:
					System.out.println("Invalid input");
					break;
				}

				System.out.println("\n");
				System.out.println("Would you like to try again? Y/N");
				cont = scanner.next().toLowerCase().equals("y") ? true : false;
			} while (cont);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			scanner.close();
			System.out.println("Session Ended!");
		}
	}

	/**
	 * Show table header
	 */
	private static void showTableHeader() {
		System.out.println();
		System.out.println(String.format("%7s %7s %7s %7s %7s %7s %7s %7s ", "CODE", "ORDER DATE", "REGION", "REP",
				"ITEM", "UNITS", "UNIT COST", "TOTAL"));
	}

	/**
	 * Show Menu
	 */
	private static void showMenu() {
		System.out.println("1. Search By Code \n2. Filter by region \n3. Update Data");
	}
}
