package com.bydan.framework.erp.presentation.desktop.swing;

import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class TextAreaDocumentListener implements DocumentListener {
	JInternalFrameBase jInternalFrameBase=null;
	JTextArea jTextArea=null;
	String sTipo="";
	
	public TextAreaDocumentListener(JInternalFrameBase jInternalFrameBase,JTextArea jTextArea,String sTipo) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.jTextArea=jTextArea;
		this.sTipo=sTipo;
	}
	
	@Override 
	public void changedUpdate(DocumentEvent e) {
		this.jInternalFrameBase.jTextAreaChangedUpdateGeneral(this.sTipo,this.jTextArea,e);
	}
	
	@Override
	public void removeUpdate(DocumentEvent e) {
		this.jInternalFrameBase.jTextAreaRemoveUpdateGeneral(this.sTipo,this.jTextArea,e);
	}
	
	@Override
	public void insertUpdate(DocumentEvent e) {
		this.jInternalFrameBase.jTextAreaInsertUpdateGeneral(this.sTipo,this.jTextArea,e);
	}
}
