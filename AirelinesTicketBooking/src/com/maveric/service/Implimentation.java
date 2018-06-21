package com.maveric.service;

import java.sql.SQLException;

import com.maveric.model.GetterClass;
import com.model.DAO.FlightDatabase;

public class Implimentation {
	
	public  boolean display(GetterClass Modelobj){
		if (Modelobj.getAircraftname().equalsIgnoreCase("boeing"))
		{	FlightDatabase dobj= new FlightDatabase();
			 int u=dobj.addflight(Modelobj);
			if(u>0) {
			return true; 
			}
			else {
				return false;
			}
			
		} else {
			
			return false;

		}
	}
	
	
}
