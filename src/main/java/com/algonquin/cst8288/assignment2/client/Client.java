package com.algonquin.cst8288.assignment2.client;
import com.algonquin.cst8288.assignment2.database.DBConnection;
import java.sql.SQLException;


public class Client {
	
	public static void main(String[] args) throws SQLException {
            //Singleton
            DBConnection dbcon = new DBConnection();
            dbcon.stablishConnection();
             DBConnection dbcon2 = new DBConnection();
             dbcon2.stablishConnection();
           
	}
}
