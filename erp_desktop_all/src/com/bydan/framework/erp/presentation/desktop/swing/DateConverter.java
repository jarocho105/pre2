package com.bydan.framework.erp.presentation.desktop.swing;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.jdesktop.beansbinding.Converter;

@SuppressWarnings("hiding")
public class DateConverter<String, Date> extends Converter<String,Date> {
	 DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	  
	
	public Date convertForward(String value) {		
		try {	    	  
			//System.out.println("convertReverse->"+value);
			@SuppressWarnings("unchecked")	  
			//Date dValue=(Date)value;//dateFormat.parse(value.toString());	    	  	    	 
			Date dValue=(Date)dateFormat.parse(value.toString());	 
			
		    return dValue;
		         
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}				
	}	
	 	
	@SuppressWarnings("unchecked")
	public String convertReverse(Date value) {		
		//System.out.println("convertForward->"+value);
		String sValue=(String)"2013-01-01";
		
		try {
			//sValue=(String)value;//dateFormat.format(value);				
			sValue=(String)dateFormat.format(value);
		} catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
	    return sValue;
	}
}