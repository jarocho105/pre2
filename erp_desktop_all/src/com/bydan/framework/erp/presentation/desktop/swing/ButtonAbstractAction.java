package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;

@SuppressWarnings("unused")
public class ButtonAbstractAction extends AbstractAction { // implements ActionListener
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JInternalFrameBase jInternalFrameBase=null;
	String sTipo="";
	
	public ButtonAbstractAction(JInternalFrameBase jInternalFrameBase,String sTipo) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
	}
	
	public void actionPerformed(ActionEvent evt) {
	    try {
	    	this.jInternalFrameBase.jButtonActionPerformedTecladoGeneral(this.sTipo,evt);
	    
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
	}
}
