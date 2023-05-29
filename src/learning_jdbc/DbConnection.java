package learning_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author v.tirol
 * Setting up connection to database
 */
public class DbConnection {
	private final String url;
	private final Properties properties;

	public DbConnection(String host, String dbName, String username, String password) {
		this.url = "jdbc:postgresql://" + host + "/" + dbName;
		this.properties = new Properties();
		this.properties.setProperty("user", username);
		this.properties.setProperty("password", password);
	}

	public Connection getConnection() throws SQLException {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (Exception e) {

		}
		return DriverManager.getConnection(this.url, this.properties);
	}

}
