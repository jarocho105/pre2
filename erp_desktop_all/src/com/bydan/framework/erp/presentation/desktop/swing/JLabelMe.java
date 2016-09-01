package com.bydan.framework.erp.presentation.desktop.swing;

import javax.swing.JLabel;

import com.bydan.framework.erp.util.Constantes2;

public class JLabelMe extends JLabel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected Boolean conEnabled=true;
	
	public JLabelMe(Boolean conEnabled) {
		super();
		
		this.conEnabled=conEnabled;
		this.setEnabled(this.conEnabled);
		
		//SIZE VARIANT
		this.putClientProperty(Constantes2.S_NAME_VARIANT, Constantes2.S_SIZE_VARIANT);
	}
	
	public JLabelMe() {
		this(true);
	}
	
	public JLabelMe(String sText) {
		this(true);
		this.setText(sText);
	}
	
	public Boolean getConEnabled() {
		return conEnabled;
	}

	public void setConEnabled(Boolean conEnabled) {
		this.conEnabled = conEnabled;
	}
}
