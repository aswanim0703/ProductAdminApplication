package com.maveric.Servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maveric.model.GetterClass;
import com.maveric.service.Implimentation;
import com.model.DAO.FlightDatabase;

import jdk.internal.dynalink.linker.LinkerServices.Implementation;

/**
 * Servlet implementation class Airlines
 */
@WebServlet("/Airlines")
public class Airlines extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Airlines() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		System.out.println("Enterd in to the servlet");
		GetterClass Modelobj= new GetterClass();
		Modelobj.setSource(request.getParameter("Source"));
		Modelobj.setFare(request.getParameter("fare"));
		Modelobj.setAircraftname(request.getParameter("Aircraftname"));
		Modelobj.setFlightName(request.getParameter("flightName"));
		Modelobj.setSeats(request.getParameter("Seats"));
		
		
		Implimentation impobj = new Implimentation();
		boolean aa;
		aa = impobj.display(Modelobj);
		if (aa==true) {
			System.out.println("Enterd to Implimentation class");
			FlightDatabase Dabobj =new FlightDatabase();
				Dabobj.addflight(Modelobj);

	
		} else {
			response.sendRedirect("https:/www.makemytrip.com");
		}
		
		
		
		
	}

}
