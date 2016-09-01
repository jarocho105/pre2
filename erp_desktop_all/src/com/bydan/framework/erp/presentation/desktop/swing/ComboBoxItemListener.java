package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ComboBoxItemListener implements ItemListener {
	JInternalFrameBase jInternalFrameBase=null;
	String sTipo="";
	
	public ComboBoxItemListener(JInternalFrameBase jInternalFrameBase,String sTipo) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
	}
	
	public void itemStateChanged(ItemEvent evt) {
		try {
			//recargarFormCiudadPais(jComboBoxid_paisFK_IdPaisCiudad,"FK_IdPais");
			this.jInternalFrameBase.jComboBoxItemStateChangedGeneral(this.sTipo,evt);
		} catch (Exception e1) { 
			e1.printStackTrace();
		}
	}
}
