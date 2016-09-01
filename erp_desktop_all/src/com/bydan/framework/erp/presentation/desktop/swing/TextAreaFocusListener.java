package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class TextAreaFocusListener extends FocusAdapter {
	JInternalFrameBase jInternalFrameBase=null;
	String sTipo="";
	
	public TextAreaFocusListener(JInternalFrameBase jInternalFrameBase,String sTipo) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
	}
	
	@Override 
    public  void focusLost ( FocusEvent e )  { 
		this.jInternalFrameBase.jTextAreaFocusLostGeneral(this.sTipo,e);
    } 
	
	@Override 
    public  void focusGained ( FocusEvent e )  { 
		this.jInternalFrameBase.jTextAreaFocusGainedGeneral(this.sTipo,e);
    } 
}
