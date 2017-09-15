package com.design_pattern.structural.facade;

import java.sql.Connection;

public class MySqlHelper {

	public static Connection getMySqlConnection(){
		return null;
	}
	
	// return PDF report using connection object
	public  void getPDFReport(String tableName, Connection conn){
		System.out.println("MYSQl PDF report generated");
	}
	
	// return HTML report using connection object
	public  void getHTMLReport(String tableName, Connection conn){
		System.out.println("MYSQl HTML report generated");
	}
	
}
