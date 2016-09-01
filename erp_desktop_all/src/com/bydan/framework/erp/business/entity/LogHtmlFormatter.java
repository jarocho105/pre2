package com.bydan.framework.erp.business.entity;

import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class LogHtmlFormatter extends Formatter {
	private Boolean isEsPar=false;
    
	// This method is called for every log records
    public String format(LogRecord rec) {
        StringBuffer buf = new StringBuffer(1000);
                
        if(this.isEsPar) {
        	this.isEsPar=false;
        	buf.append("<tr style=\"background-color: rgb(204, 204, 255);\">\n");
        } else {
        	this.isEsPar=true;
        	buf.append("<tr>\n");
        }
       
        buf.append("<td>\n");

        // Bold any levels >= WARNING
        if (rec.getLevel().intValue() >= Level.WARNING.intValue()) {
            buf.append("<b>");
            buf.append(rec.getLevel());
            buf.append("</b>");
        } else {
            buf.append(rec.getLevel());
        }
        
        buf.append("</td>\n");
        
        /*
        buf.append("<td>\n");
        buf.append(' ');
        buf.append(rec.getMillis());
        buf.append("</td>\n");
		*/
		 
        //buf.append("<td style=\"color: white; background-color: rgb(102, 102, 204);\">\n");
        buf.append(formatMessage(rec));
        
        buf.append("</tr>\n");

        return buf.toString();
    }

   
    // This method is called just after the handler using this
    // formatter is created
    public String getHead(Handler h) {
    	StringBuffer buf = new StringBuffer(1000);
    	buf.append("<html><head></head><body>"+(new Date())+"\n");
    	
    	 buf.append("<table width=\"100%\" border=\"0\""+
    	 "cellpadding=\"0\" cellspacing=\"0\">\n");
    	 
    	 buf.append("<tr style=\"color: white; font-weight: bold;background-color: rgb(102, 102, 204);\">\n");
    	 
    	 buf.append("<td>\n");
         buf.append("LEVEL\n");
         buf.append("</td>\n");
         
         buf.append("<td>\n");
         buf.append("NUM\n");
         buf.append("</td>\n");
         
         buf.append("<td>\n");
         buf.append("FILE\n");
         buf.append("</td>\n");
         
         buf.append("<td>\n");
         buf.append("LINE NUM\n");
         buf.append("</td>\n");
         
         buf.append("<td>\n");
         buf.append("METHOD\n");
         buf.append("</td>\n");
         
         buf.append("<td>\n");
         buf.append("PATH\n");
         buf.append("</td>\n");
         
         buf.append("</tr>\n");
         
        return buf.toString();
    }

    // This method is called just after the handler using this
    // formatter is closed
    public String getTail(Handler h) {
    	StringBuffer buf = new StringBuffer(1000);
        
    	buf.append("</table>\n");
    	buf.append("</body></html>\n");
    	   	
    	return buf.toString();
    }
}
