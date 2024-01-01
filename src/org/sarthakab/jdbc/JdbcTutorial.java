package org.sarthakab.jdbc;

import java.sql.*;

public class JdbcTutorial {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String uname = "root";
		String pass= "Sarthak@16" ;
		
		Connection con = DriverManager.getConnection(url, uname, pass);
		System.out.println("Connection established");
		String sql = "update student set sname = ? where rno = ?";
		System.out.println(sql);
		PreparedStatement st = con.prepareStatement(sql); 
		/*
		 * use preparedstatement due to following reasons
		 * 1) to avoid overwhelming confusion of quotes
		 * 2) to avoid sqlinjection attack
		 * 3) to use neat and clean code
		 * */
		
		/*
		st.setInt(1, 5);
		
		st.setString(2, "Abhi");
		
		st.setDouble(3, 90.40);
		*/
		st.setString(1, "Ananya");
		st.setInt(2, 4);
		boolean rs = st.execute();
		
		
		con.close();
		System.out.println("Connection closed");
	}
}
