package com.bydan.framework.erp.presentation.desktop.swing;

import javax.swing.JPasswordField;

import com.bydan.framework.erp.util.Constantes2;

public class JPasswordFieldMe extends JPasswordField{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected Boolean conEnabled=true;
	
	public JPasswordFieldMe(Boolean conEnabled) {
		super();
		this.conEnabled=conEnabled;
		this.setEnabled(this.conEnabled);
		
		this.setBackground(FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR));
		
		//SIZE VARIANT
		this.putClientProperty(Constantes2.S_NAME_VARIANT, Constantes2.S_SIZE_VARIANT);
	}
	
	public JPasswordFieldMe() {
		this(true);
	}
	
	public Boolean getConEnabled() {
		return conEnabled;
	}

	public void setConEnabled(Boolean conEnabled) {
		this.conEnabled = conEnabled;
	}
}
