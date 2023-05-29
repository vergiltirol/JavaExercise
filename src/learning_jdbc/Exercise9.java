package learning_jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {
		OrderDao orderDao = null;
		try {
			
			// set DB connection
			var db = DbCred.getDbCredentials();
			DbConnection dbCon = new DbConnection(db.get(0), db.get(1), db.get(2), db.get(3));
			Connection connection = dbCon.getConnection();
			orderDao = new OrderDao(connection);
		} catch (SQLException e) {
			System.out.println("Connection to server timeout. Error: " + e.getMessage());
		}

		Scanner scanner = new Scanner(System.in);

		try {
			boolean cont = false;
			do {
				System.out.println("Enter code: ");
				String code = scanner.next();
				System.out.println("Enter new unit cost: ");
				double unitCost = scanner.nextDouble();
				Order order = orderDao.update(code, unitCost);
				
				

				if (order.getId() == 0) {
					System.out.println("No results found.");
				} else {
					showTableHeader();
					System.out.println(order);
				}

				System.out.println("\n");
				System.out.println("Would you like to try again? Y/N");
				cont = scanner.next().toLowerCase().equals("y") ? true : false;
			} while (cont);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
			System.out.println("Session ended.");
		}
	}

	private static void showTableHeader() {
		System.out.println();
		System.out.println(String.format("%7s %7s %7s %7s %7s %7s %7s %7s ", "CODE", "ORDER DATE", "REGION", "REP",
				"ITEM", "UNITS", "UNIT COST", "TOTAL"));
	}

}
