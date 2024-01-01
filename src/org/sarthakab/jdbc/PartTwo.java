package org.sarthakab.jdbc;
//step 1: import the packages
import java.sql.*;

public class PartTwo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//step 2 : load class
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
		
		//step 3 : get connection
		String url = "jdbc:mysql://localhost:3306/sarthak";
		String uname= "root";
		String pass = "Sarthak@16";
		Connection con = DriverManager.getConnection(url, uname, pass);
		System.out.println("Connection established success");
		
		//step 4: create statement
		Statement st = con.createStatement();
		
		//step 5: execute statement
		
		/*
//		 * a) read data
		String queryOne = "select * from users";
		ResultSet rs = st.executeQuery(queryOne);
		
		//step 6 : process the result
		while(rs.next()) {
			System.out.print(rs.getInt(1)+" ");
			System.out.print(rs.getString(2)+" ");
			System.out.print(rs.getString(3)+" ");
			System.out.print(rs.getString(4)+" ");
			System.out.println(rs.getInt(5));
		}
		*/
		/*
		 //b)insert data
		String queryTwo = "insert into flower values(2, 'Hibiscus', 'Reddish', 'Sweet')";
		st.execute(queryTwo);
		*/
		
		//c) update data
		/*
		String queryThree = "update flower set Name ='shevanti' where Roll = 2";
		boolean status = st.execute(queryThree); //returns false for operations except read
		
		if(!status) {
			System.out.println("Record updated successfully..!!");
		}
		else
			System.out.println("Unable to update..!!");
		*/
		
		//d)delete the record
		String queryFour = "delete from flower where name ='rose'";
		boolean flag = st.execute(queryFour);
		
		if(!flag) {
			System.out.println("Record deleted success");
		}
		else
			System.out.println("Unable to delete");
		//step 7 : close the connection
		con.close();
		System.out.println("Connection close successfully...!!!");
	}
}
