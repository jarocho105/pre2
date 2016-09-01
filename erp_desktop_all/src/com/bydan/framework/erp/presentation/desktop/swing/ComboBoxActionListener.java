package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxActionListener implements ActionListener {
	JInternalFrameBase jInternalFrameBase=null;
	String sTipo="";
	
	public ComboBoxActionListener(JInternalFrameBase jInternalFrameBase,String sTipo) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
	}
	
	public void actionPerformed(ActionEvent evt) {
		try {
			//recargarFormCiudadPais(jComboBoxid_paisFK_IdPaisCiudad,"FK_IdPais");
			this.jInternalFrameBase.jComboBoxActionPerformedGeneral(this.sTipo,evt);
		} catch (Exception e1) { 
			e1.printStackTrace();
		}
	}
}
