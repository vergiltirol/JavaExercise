package learning_jdbc;

import java.util.ArrayList;
import java.util.List;


public class DbCred {
	private final static String DB_HOST = "localhost:5432";
	private final static String DB_NAME = "JavaExercise";
	private final static String DB_USERNAME = "postgres";
	private final static String DB_PASSWORD = "password";
	
	public static List<String> getDbCredentials(){
		List<String> credentials = new ArrayList<>();
		
		credentials.add(DB_HOST);
		credentials.add(DB_NAME);
		credentials.add(DB_USERNAME);
		credentials.add(DB_PASSWORD);
		
		return credentials;
		
	}

}
