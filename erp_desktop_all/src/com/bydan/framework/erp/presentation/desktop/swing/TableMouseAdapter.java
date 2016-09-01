package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class TableMouseAdapter extends MouseAdapter { //implements MouseAdapter
	JInternalFrameBase jInternalFrameBase=null;
	String sTipo="";
	
	public TableMouseAdapter(JInternalFrameBase jInternalFrameBase,String sTipo) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
	}
	
	public void mouseClicked(MouseEvent evt) {
		if (evt.getClickCount() == 2) {
			//this.jInternalFrameBase.jButtonIdActionPerformed(null,jTableDatosPerfil.getSelectedRow(),false,false);
		}
	}
}
