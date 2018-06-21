package com.model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.maveric.model.GetterClass;

public class FlightDatabase {
	
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/flightdb";
	//Database Credentials
	private final String USER = "Denesh1";
	private final String PASS = "Alliswell7";
	int result1;

public  int addflight(GetterClass Modelobj) {
   Connection conn=null;
   Statement stmt=null;
   try {
	   Class.forName(JDBC_DRIVER);
	 //  getting connection
	   conn=DriverManager.getConnection(DB_URL, USER, PASS);
	   //creating Statement
	   stmt=conn.createStatement();
	   String Flightname = Modelobj.getFlightName();
		String Seats = Modelobj.getSeats();
		String Fare = Modelobj.getFare();
		String Source = Modelobj.getSource();
		String Aname = Modelobj.getAircraftname();
		String query = "INSERT INTO passangerdetails(FlightName,Source,fare,Seats,AircraftName)VALUES('"+Flightname+"','"+Source+"','"+Fare+"','"+Seats+"','"+Aname+"')";
	 System.out.println(query);
	  result1= stmt.executeUpdate(query);
	   System.out.println(result1);
   }catch(Exception e){
	  System.out.println(e.getMessage());
   }finally {
	   try {
	   conn.close();
	   stmt.close();
	   
	   }catch(Exception e) {
		   e.printStackTrace();
		   
	   }
   }
return result1;
   }

}


