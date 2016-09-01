package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;

import com.bydan.erp.seguridad.business.entity.Modulo;

@SuppressWarnings("unused")
public class ButtonModuloJFrameMeAbstractAction extends AbstractAction { // implements ActionListener
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JFrameMe jFrameMe=null;
	String sTipo="";
	Modulo modulo=null;
	
	public ButtonModuloJFrameMeAbstractAction(JFrameMe jFrameMe,Modulo modulo) {
		this.jFrameMe=jFrameMe;
		this.modulo=modulo;
	}
	
	public ButtonModuloJFrameMeAbstractAction(JFrameMe jFrameMe,String sTipo) {
		this.jFrameMe=jFrameMe;
		this.sTipo=sTipo;
	}
	
	public void actionPerformed(ActionEvent evt) {
	    try {
	    	this.jFrameMe.jButtonActionPerformedTecladoGeneral(this.modulo,evt);
	    
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
	}
}
