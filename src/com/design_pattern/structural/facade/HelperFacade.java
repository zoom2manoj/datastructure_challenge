package com.design_pattern.structural.facade;

import java.sql.Connection;

public class HelperFacade {
	
	public static void generateReport(DBTypes dbtype, ReportTypes reportType, String tableName){
		
		Connection conn =  null;
		switch (dbtype) {
		case MYSQL:
			conn = MySqlHelper.getMySqlConnection();
			MySqlHelper msql = new MySqlHelper();
			switch (reportType) {
			case PDF:
				msql.getPDFReport(tableName, conn);
				break;

			default:
				msql.getHTMLReport(tableName, conn);
				break;
			}
			break;

		default:
			conn =  OracleHelper.getOracleHelperConnection();
			OracleHelper orc = new OracleHelper();
			switch (reportType) {
			case PDF:
				orc.getPDFReport(tableName, conn);
				break;

			default:
				orc.getHTMLReport(tableName, conn);
				break;
			}
			break;
		}
	}

	public static enum DBTypes{
		MYSQL,ORACLE;
	}
	
	public static enum ReportTypes{
		HTML,PDF;
	}
}
