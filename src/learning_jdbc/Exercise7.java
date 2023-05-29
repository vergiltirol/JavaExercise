package learning_jdbc;

import java.sql.Connection;
import java.util.Scanner;
import java.sql.SQLException;

public class Exercise7 {
	
	public static void main(String[] args){
		OrderDao orderDao = null;
		try {
			
			// set DB connection
			var db = DbCred.getDbCredentials();
			DbConnection dbCon = new DbConnection(db.get(0), db.get(1), db.get(2), db.get(3));
			Connection connection = dbCon.getConnection();
			orderDao = new OrderDao(connection);
		} catch(SQLException e) {
			System.out.println("Connection to server timeout. Error: " + e.getMessage());
		}
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			boolean cont = false;
			do {
				System.out.println("Enter code: ");
				String code = scanner.next();
				Order order = orderDao.getByCode(code);
				
				
				//check if query has results
				if(order.getId() == 0) {
					System.out.println("No result found.");
				}
				else {
					showTableHeader();
					System.out.println(order);
					
				}
				
				
				System.out.println("\n");
				System.out.println("Would you like to try again? Y/N");
				cont = scanner.next().toLowerCase().equals("y") ? true : false;
			} while(cont);
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
