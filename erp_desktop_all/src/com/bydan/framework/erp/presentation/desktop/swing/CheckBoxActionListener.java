package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxActionListener implements ActionListener {
	JInternalFrameBase jInternalFrameBase=null;
	String sTipo="";
	
	public CheckBoxActionListener(JInternalFrameBase jInternalFrameBase,String sTipo) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
	}
	
	public void actionPerformed(ActionEvent evt) {
		try {
			//recargarFormCiudadPais(jComboBoxid_paisFK_IdPaisCiudad,"FK_IdPais");
			this.jInternalFrameBase.jCheckBoxActionPerformedGeneral(this.sTipo,evt);
		} catch (Exception e1) { 
			e1.printStackTrace();
		}
	}
}
