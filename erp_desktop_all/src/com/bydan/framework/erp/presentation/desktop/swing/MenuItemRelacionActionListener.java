package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.event.ActionListener;

public class MenuItemRelacionActionListener implements ActionListener {
	JInternalFrameBase jInternalFrameBase=null;
	String sTipo="";
	
	public MenuItemRelacionActionListener(JInternalFrameBase jInternalFrameBase,String sTipo) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
	}
	
	public void actionPerformed(java.awt.event.ActionEvent evt) {
		this.jInternalFrameBase.jButtonRelacionActionPerformedGeneral(this.sTipo,evt);
		//jmenuItemActionPerformed(evt);
		//int row=jTableDatosPerfil.getSelectedRow();
		//jButtonPerfilUsuarioActionPerformed(evt,row,true,false);
	}
}

