package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class TextFieldFocusListener extends FocusAdapter {
	JInternalFrameBase jInternalFrameBase=null;
	String sTipo="";
	
	public TextFieldFocusListener(JInternalFrameBase jInternalFrameBase,String sTipo) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
	}
	
	@Override 
    public  void focusLost ( FocusEvent e )  { 
		this.jInternalFrameBase.jTextFieldFocusLostGeneral(this.sTipo,e);
    } 
	
	@Override
	public void focusGained(FocusEvent e) {
		this.jInternalFrameBase.jTextFieldFocusGainedGeneral(this.sTipo,e);								
    }
}
