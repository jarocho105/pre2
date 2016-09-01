package com.bydan.framework.erp.presentation.desktop.swing;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TableListSelectionListener implements ListSelectionListener {
	JInternalFrameBase jInternalFrameBase=null;
	String sTipo="";
	
	public TableListSelectionListener(JInternalFrameBase jInternalFrameBase,String sTipo) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
	}
	
	public void valueChanged(ListSelectionEvent evt) {
		//BYDAN_DESHABILITADO
    	//try {jTableDatosPerfilListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
		this.jInternalFrameBase.tableValueChangedGeneral(this.sTipo,evt);
    }
}
