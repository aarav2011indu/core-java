package dataBASE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
		// TODO Auto-generated method stub
		public static void main1(String[] args) throws SQLException, ClassNotFoundException {
			// TODO Auto-generated method stub
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "admin");

			Statement stm = con.createStatement();
			stm.executeUpdate( "INSERT into eproduct(name ,price, date_added) values ('lenovo', 20000.00 ,now()");;
		// TODO Auto-generated method stub
					ResultSet result = stm.executeQuery("select * from eproduct");
					while(result.next()) {
						System.out.println(result.getInt("ID"));
						System.out.println(result.getString("name"));
					
						
						}		

	}

}
