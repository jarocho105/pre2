package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.Font;

import javax.swing.JCheckBox;

import com.bydan.framework.erp.util.Constantes2;

public class JCheckBoxMe extends JCheckBox{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected Boolean conEnabled=true;
	
	public JCheckBoxMe(Boolean conEnabled) {
		super();
		
		this.conEnabled=conEnabled;
		this.setEnabled(this.conEnabled);
		
		this.setBackground(FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR));
		
		//FONT
		Font font=new Font(this.getFont().getName(),Font.BOLD,this.getFont().getSize());  		  
		this.setFont(font); 
		
		//SIZE VARIANT
		this.putClientProperty(Constantes2.S_NAME_VARIANT, Constantes2.S_SIZE_VARIANT);
	}
	
	public JCheckBoxMe() {
		this(true);
	}
	
	public Boolean getConEnabled() {
		return conEnabled;
	}

	public void setConEnabled(Boolean conEnabled) {
		this.conEnabled = conEnabled;
	}
}
