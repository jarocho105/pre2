package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;

@SuppressWarnings("unused")
public class ButtonJFrameMeAbstractAction extends AbstractAction { // implements ActionListener
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JFrameMe jFrameMe=null;
	String sTipo="";
	
	public ButtonJFrameMeAbstractAction(JFrameMe jFrameMe,String sTipo) {
		this.jFrameMe=jFrameMe;
		this.sTipo=sTipo;
	}
	
	public void actionPerformed(ActionEvent evt) {
	    try {
	    	this.jFrameMe.jButtonActionPerformedTecladoGeneral(this.sTipo,evt);
	    
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
	}
}
