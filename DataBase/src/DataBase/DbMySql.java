package DataBase;

import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class DbMySql {
	
	private final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; 
	private final String DB_URL = "jdbc:mysql://localhost:3306/final_db";
	private String userName = "root";
	private String password = "1234";
	
	private Connection connection;
	private CallableStatement statement;

	public DbMySql() throws Exception
	{
		 Class.forName(JDBC_DRIVER);
		 connection = (Connection) DriverManager.getConnection(DB_URL, userName, password);
		
	}
	
	/**
	 * Call the Stored Procedure at The DataBase
	 * @param sql Stored Procedure Name
	 * @throws SQLException
	 */
	public void CallStoredProcedure(String sql) throws SQLException
	{
		statement = (CallableStatement) connection.prepareCall(sql);
	}
	
	/**
	 * Declare of the string parameter 
	 * @param param parameter name
	 * @param value insert value to database
	 * @throws SQLException
	 */
	public void AddString(String param, String value) throws SQLException
	{
		
		statement.setString(param, value);
//		statement.registerOutParameter(2, java.sql.Types.INTEGER);
	}
	
	/**
	 * Declare integer type parameter 
	 * @param param parameter name
	 * @param value insert value to database 
	 * @throws SQLException
	 */
	public void AddInt(String param, int value) throws SQLException
	{
		statement.setInt(param, value);
	}
	
	
	/**
	 * Declare boolean type parameter 
	 * @param param parameter name
	 * @param value insert value to database
	 * @throws SQLException
	 */
	public void AddBoolean(String param, boolean value) throws SQLException
	{
		statement.setBoolean(param, value);
	}
	
	/**
	 * Declare boolean type parameter 
	 * @param param parameter name
	 * @param value insert value to database
	 * @throws SQLException
	 */
	public void AddDateTime(String param, Date value) throws SQLException
	{
		statement.setDate(param, value);
	}
	
	/**
	 * Execute the Stored Procedure
	 * @throws SQLException
	 */
	public void Execut() throws SQLException
	{
		statement.execute();
		
	}
	
//	public void After() throws Exception
//	{
//		id = statement.getInt(2);
//		System.out.println("ID: " + id);
//		connection.close();
//	}
	
}
