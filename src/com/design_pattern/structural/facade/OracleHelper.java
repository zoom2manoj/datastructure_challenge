package com.design_pattern.structural.facade;

import java.sql.Connection;

public class OracleHelper {

	
	public static Connection getOracleHelperConnection(){
		return null;
	}
	
	public  void getPDFReport(String tableName, Connection conn){
		System.out.println("Oracle PDF report generated");
	}
	
	public  void getHTMLReport(String tableName, Connection conn){
		System.out.println("Oracle HTML report generated");
	}
}
