package dataBASE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =

		DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "admin");

		Statement stm = con.createStatement();
		stm.execute("update eproduct set price=2500.00 where name='Tablet'");
		ResultSet result = stm.executeQuery("select * from eproduct");
		while(result.next()) {
		System.out.println(result.getInt("ID"));
		System.out.println(result.getString("name"));
		System.out.println(result.getFloat("price"));
		}
		// TODO Auto-generated method stub

	}

}