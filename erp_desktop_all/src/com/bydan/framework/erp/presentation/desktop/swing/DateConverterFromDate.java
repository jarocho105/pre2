package com.bydan.framework.erp.presentation.desktop.swing;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.jdesktop.beansbinding.Converter;

@SuppressWarnings({ "unused", "hiding" })
public class DateConverterFromDate<Date, String> extends Converter<Date,String> {
	 DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	  
	 	@SuppressWarnings("unchecked")
		public String convertForward(Date value) {		
			//System.out.println("convertForward->"+value);
			String sValue=(String)"2013-01-01";
			
			
			try {
				sValue=(String)dateFormat.format(value);	
			} catch(Exception e) {
				e.printStackTrace();
				throw e;
			}
			
		    return sValue;
		}
	 
	public Date convertReverse(String value) {		   
		try {	    	  
			//System.out.println("convertReverse->"+value);
			@SuppressWarnings("unchecked")	  
		    Date dValue=(Date) dateFormat.parse(value.toString());	    	  	    	 
		    	  
		    return dValue;
		         
		} catch (Exception e) {
			return null;
		}
	}	
	 
	
}