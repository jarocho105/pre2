package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.event.ItemListener;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

@SuppressWarnings("unused")
public class InternalFrameInternalFrameAdapter extends InternalFrameAdapter { //implements InternalFrameAdapter
	JInternalFrameBase jInternalFrameBase=null;
	String sTipo="";
	
	public InternalFrameInternalFrameAdapter(JInternalFrameBase jInternalFrameBase,String sTipo) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
	}
	
	public void internalFrameClosing(InternalFrameEvent evt) {          	
     	try {
     		this.jInternalFrameBase.internalFrameClosingInternalFrameGeneral(this.sTipo,evt);
		} catch (Exception e) {
			e.printStackTrace();
		}
     }
}
