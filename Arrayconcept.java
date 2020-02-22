package com.ios;
 
import java.sql.*;

public class Arrayconcept {
	public static void main(String args[]) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/pubg";
		String uname="root";
		String pass="saro1295@";
		String query="select* from player";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement sr=con.createStatement();
		ResultSet rs=sr.executeQuery(query);
		while(rs.next())
		{
		String userdata=rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" : "+rs.getInt(4);
		System.out.println(userdata);
		}
		
		sr.close();
		con.close();
		}

}
