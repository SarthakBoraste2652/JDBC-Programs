package org.sarthakab.jdbc;

//step 1: import the package
import java.sql.*;

public class Student {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		/*
		 * Seven Steps for JDBC:-
		 * 1)
		 * 2)
		 * 3)
		 * 4) create statement
		 * 5) execute statement
		 * 6) process the result
		 * 7) close the connection
		 */
		
//		step 2: Load & register	-->Optional bCause By default handled
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded successfully..!!");
		
		//step 3 : Create connection
		String url = "jdbc:mysql://localhost:3306/sarthak";
		String uname = "root";
		String pass = "Sarthak@16";
		
		Connection con = DriverManager.getConnection(url, uname, pass);
		System.out.println("Connection established successfully..!!");
		
		
		//step 4: create statement
		Statement st = con.createStatement();
		
		//step 5: execute statement
		ResultSet rs = st.executeQuery("select * from student");
		
		//step 6: process result
		while(rs.next()) {
			System.out.print(rs.getInt(1)+" - ");
			System.out.print(rs.getString(2)+" - ");
			System.out.println(rs.getInt(3));
		}
		
		/*
//		rs.next();
		
//		System.out.println(rs.getString("name"));
		*/
		//step 7: close the connection
		con.close();
		System.out.println("Connection closed...!!!");
	}

}