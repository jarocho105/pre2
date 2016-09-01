package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//NO EXISTE O NO ES APLICABLE PARA TEXTAREA
//NO EXISTE SE SUPONE
public class TextAreaActionListener implements ActionListener {
	JInternalFrameBase jInternalFrameBase=null;
	String sTipo="";
	
	public TextAreaActionListener(JInternalFrameBase jInternalFrameBase,String sTipo) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		this.jInternalFrameBase.jTextAreaActionPerformedGeneral(this.sTipo,e);
	}
}
