package learning_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class OrderDao extends Order {
	
	private final Connection connection;
	private final static String GET_BY_CODE = "SELECT * FROM get_orders_by_code(?)";
	private final static String GET_BY_REGION = "SELECT * FROM filter_orders_by_region(?)";
	private final static String UPDATE = "UPDATE orders SET unitcost = ?, total = (units * ?) WHERE code = ?";
	
	public OrderDao(Connection connection) {
		this.connection = connection;
	}
	
	
	/**
	 * @param code
	 * @return Order
	 */
	public Order getByCode(String code) {
		Order order = new Order();
		try(PreparedStatement statement = this.connection.prepareStatement(GET_BY_CODE);){
			statement.setString(1, code);
			ResultSet resultSet = statement.executeQuery();
			
			while(resultSet.next()) {
				order.setId(resultSet.getInt(1));
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
	
	
	/**
	 * @param region
	 * @return List of order
	 */
	public List<Order> getByRegion(String region) {
		List<Order> orders = new ArrayList<>();
		
		
		try(PreparedStatement statement = this.connection.prepareStatement(GET_BY_REGION);){
			statement.setString(1, region);
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

	/**
	 * Update order item
	 * @param code
	 * @param unitCost
	 * @return Updated Order 
	 */
	public Order update(String code, double unitCost) {
//        try{
//            this.connection.setAutoCommit(false);
//        }catch(SQLException e){
//            e.printStackTrace();
//            throw new RuntimeException(e);
//        }
		try(PreparedStatement statement = this.connection.prepareStatement(UPDATE);){
			statement.setDouble(1, unitCost);
			statement.setDouble(2, unitCost);
			statement.setString(3, code);
			statement.execute();
			//this.connection.commit();
		}catch(SQLException e) {
//			try {
//				this.connection.rollback();
//			}catch(SQLException sqle) {
//				e.printStackTrace();
//			}
		}
		return this.getByCode(code);
	}
	
	
}
