package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.event.ActionListener;

public class ButtonJFrameMeActionListener implements ActionListener {
	JFrameMe jFrameMe=null;
	String sTipo="";
	
	public ButtonJFrameMeActionListener(JFrameMe jFrameMe,String sTipo) {
		this.jFrameMe=jFrameMe;
		this.sTipo=sTipo;
	}
	
	public void actionPerformed(java.awt.event.ActionEvent evt) { 	  
		try {
			jFrameMe.jButtonActionPerformedGeneral(this.sTipo,evt);
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
}
