package learning_jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class JdbcExercises {
	
	private final static String DB_HOST = "localhost:5432";
	private final static String DB_NAME = "JavaExercise";
	private final static String DB_USERNAME = "postgres";
	private final static String DB_PASSWORD = "password";
	
	public static void main(String[] args) {
		DbConnection dbCon = new DbConnection(DB_HOST, DB_NAME, DB_USERNAME, DB_PASSWORD);

		try {
			Connection connection = dbCon.getConnection();
			OrderDao orderDao = new OrderDao(connection);
//			Order order = orderDao.getByCode("ABC2");
//			showTableHeader();
//			System.out.println(order);
			
			List<Order> orders = orderDao.getByRegion("East");
			showTableHeader();
			for(Order or : orders){
				System.out.println(or);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private static void showTableHeader() {
		System.out.println(String.format("%7s %7s %7s %7s %7s %7s %7s %7s ","CODE", "ORDER DATE", "REGION", 
				"REP", "ITEM", "UNITS", "UNIT COST", "TOTAL"));
	}
}
