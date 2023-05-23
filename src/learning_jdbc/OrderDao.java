package learning_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDao extends Order {
	
	private final Connection connection;
	private final static String GET_BY_CODE = "SELECT * FROM \"Orders\" where \"Code\" = ?"; 
	private final static String GET_BY_REGION = "SELECT * FROM \"Orders\" where \"Region\" = ?"; 
	
	public OrderDao(Connection connection) {
		this.connection = connection;
	}
	
	public Order getByCode(String Code) {
		Order order = new Order();
		try(PreparedStatement statement = this.connection.prepareStatement(GET_BY_CODE);){
			statement.setString(1, Code);
			ResultSet resultSet = statement.executeQuery();
			
			while(resultSet.next()) {
				order.setCode(resultSet.getString(2));
				order.setOrderDate(resultSet.getString(3));
				order.setRegion(resultSet.getString(4));
				order.setRep(resultSet.getString(5));
				order.setItem(resultSet.getString(6));
				order.setUnits(resultSet.getInt(7));
				order.setUnitCost(resultSet.getDouble(8));
				order.setTotal(resultSet.getDouble(9));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return order;
	}
	
	public List<Order> getByRegion(String Region){
		List<Order> orders = new ArrayList<>();
		
		
		try(PreparedStatement statement = this.connection.prepareStatement(GET_BY_REGION);){
			statement.setString(1, Region);
			ResultSet resultSet = statement.executeQuery();
			while(resultSet.next()) {
				Order order = new Order();
				order.setCode(resultSet.getString(2));
				order.setOrderDate(resultSet.getString(3));
				order.setRegion(resultSet.getString(4));
				order.setRep(resultSet.getString(5));
				order.setItem(resultSet.getString(6));
				order.setUnits(resultSet.getInt(7));
				order.setUnitCost(resultSet.getDouble(8));
				order.setTotal(resultSet.getDouble(9));
				orders.add(order);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return orders;
		
	}
}
