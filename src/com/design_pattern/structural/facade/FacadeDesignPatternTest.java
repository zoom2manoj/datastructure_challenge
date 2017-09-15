package com.design_pattern.structural.facade;

import java.sql.Connection;

public class FacadeDesignPatternTest {

	
	public static void main(String[] arg){
		
		String tableName = "Employee";
		
		
		// without face Pattern//
		
		Connection conn = MySqlHelper.getMySqlConnection();
		MySqlHelper mySql = new MySqlHelper();
		mySql.getHTMLReport(tableName, conn);
		
		Connection orConn = OracleHelper.getOracleHelperConnection();
		OracleHelper orHelper = new OracleHelper();
		orHelper.getPDFReport(tableName, orConn);
		
		System.out.println("\n \n ");
		
		
		//= with Facade Pattern ==/
		HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
		HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
		
		
	}
}
