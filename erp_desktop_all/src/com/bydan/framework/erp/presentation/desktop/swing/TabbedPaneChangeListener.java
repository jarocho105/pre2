package com.bydan.framework.erp.presentation.desktop.swing;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TabbedPaneChangeListener implements ChangeListener {
	JInternalFrameBase jInternalFrameBase=null;
	String sTipo="";
	
	public TabbedPaneChangeListener(JInternalFrameBase jInternalFrameBase,String sTipo) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
	}
	
	 public void stateChanged(ChangeEvent evt) {	  
		try {
			jInternalFrameBase.jTabbedPaneChangeListenerGeneral(this.sTipo,evt);
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
}
