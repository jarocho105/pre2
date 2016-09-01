package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.event.ActionListener;

import com.bydan.erp.seguridad.business.entity.Modulo;

public class ButtonModuloJFrameMeActionListener implements ActionListener {
	JFrameMe jFrameMe=null;
	String sTipo="";
	Modulo modulo=null;
	
	public ButtonModuloJFrameMeActionListener(JFrameMe jFrameMe,Modulo modulo) {
		this.jFrameMe=jFrameMe;
		this.modulo=modulo;
	}
	
	public ButtonModuloJFrameMeActionListener(JFrameMe jFrameMe,String sTipo,Modulo modulo) {
		this.jFrameMe=jFrameMe;
		this.sTipo=sTipo;
		this.modulo=modulo;
	}
	
	public void actionPerformed(java.awt.event.ActionEvent evt) { 	  
		try {
			jFrameMe.jButtonModuloActionPerformedGeneral(this.modulo,evt);
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
}
