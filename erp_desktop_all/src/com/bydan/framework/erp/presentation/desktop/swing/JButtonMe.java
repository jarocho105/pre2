package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.Font;

import javax.swing.JButton;

import com.bydan.framework.erp.util.Constantes2;


public class JButtonMe extends JButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected Boolean conEnabled=true;
	
	public JButtonMe(Boolean conEnabled) {
		super();
		
		this.conEnabled=conEnabled;
		this.setEnabled(this.conEnabled);
		
		//FONT
		Font font=new Font(this.getFont().getName(),Font.BOLD,this.getFont().getSize());  		  
		this.setFont(font); 
		
		//SIZE VARIANT
		this.putClientProperty(Constantes2.S_NAME_VARIANT, Constantes2.S_SIZE_VARIANT);				
	}
	
	public JButtonMe() {
		this(true);
	}
	
	public JButtonMe(String sText,Boolean conEnabled) {
		super(sText);
		
		this.conEnabled=conEnabled;
		this.setEnabled(this.conEnabled);
		
		//FONT
		Font font=new Font(this.getFont().getName(),Font.BOLD,this.getFont().getSize());  		  
		this.setFont(font); 
		
		//SIZE VARIANT
		this.putClientProperty(Constantes2.S_NAME_VARIANT, Constantes2.S_SIZE_VARIANT);				
	}
	
	public JButtonMe(String sText) {
		this(sText,true);
	}
	
	public Boolean getConEnabled() {
		return conEnabled;
	}

	public void setConEnabled(Boolean conEnabled) {
		this.conEnabled = conEnabled;
	}
}
