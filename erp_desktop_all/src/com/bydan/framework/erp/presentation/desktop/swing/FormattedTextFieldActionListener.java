package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormattedTextFieldActionListener implements ActionListener {
	JInternalFrameBase jInternalFrameBase=null;
	String sTipo="";
	
	public FormattedTextFieldActionListener(JInternalFrameBase jInternalFrameBase,String sTipo) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		this.jInternalFrameBase.jFormattedTextFieldActionPerformedGeneral(this.sTipo,e);
	}
}
