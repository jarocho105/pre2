package com.bydan.framework.erp.util;

public class FuncionesSql {
	public static String getOrderSqlFromFinalQuery(String sFinalQuery,String sSelectQuery) throws Exception {
		String sOrderQuery="";
		
		try {
			
			if(!sSelectQuery.contains("order")) {
				if(sFinalQuery.contains("order")) {
					sOrderQuery=sFinalQuery.substring(sFinalQuery.lastIndexOf("order"));
					sOrderQuery=" "+sOrderQuery;
				}
			}
		} catch(Exception exc) {
			throw exc;
		}
		
		return sOrderQuery;
	}
}
