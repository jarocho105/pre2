package com.bydan.framework.erp.presentation.desktop.swing;

import javax.swing.JMenuBar;

import com.bydan.framework.erp.util.Constantes2;

public class JMenuBarMe extends JMenuBar{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JMenuBarMe() {
		super();
		
		//SIZE VARIANT
		this.putClientProperty(Constantes2.S_NAME_VARIANT, Constantes2.S_SIZE_VARIANT);
	}
}
