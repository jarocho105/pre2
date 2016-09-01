package com.bydan.framework.erp.presentation.desktop.swing;

import javax.swing.JMenu;

public class JMenuMe extends JMenu{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected Boolean conEnabled=true;
	
	public JMenuMe(Boolean conEnabled) {
		super();
		this.conEnabled=conEnabled;
		this.setEnabled(this.conEnabled);
	}
	
	public JMenuMe() {
		this(true);
	}
	
	public JMenuMe(String sName,Boolean conEnabled) {
		super(sName);
		this.conEnabled=conEnabled;
		this.setEnabled(this.conEnabled);
	}
	
	public JMenuMe(String sName) {
		this(sName,true);
	}
	
	public Boolean getConEnabled() {
		return conEnabled;
	}

	public void setConEnabled(Boolean conEnabled) {
		this.conEnabled = conEnabled;
	}
}
