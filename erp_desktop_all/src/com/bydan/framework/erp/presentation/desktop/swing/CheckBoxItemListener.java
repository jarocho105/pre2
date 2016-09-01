package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxItemListener implements ItemListener{
	JInternalFrameBase jInternalFrameBase=null;
	String sTipo="";
	
	public CheckBoxItemListener(JInternalFrameBase jInternalFrameBase,String sTipo) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
	}
	
	public void itemStateChanged(ItemEvent evt) {
		try {
			this.jInternalFrameBase.jCheckBoxItemListenerGeneral(this.sTipo,evt);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
