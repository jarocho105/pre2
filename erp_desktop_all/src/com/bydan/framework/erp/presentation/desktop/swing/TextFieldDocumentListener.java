package com.bydan.framework.erp.presentation.desktop.swing;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class TextFieldDocumentListener implements DocumentListener {
	JInternalFrameBase jInternalFrameBase=null;
	JTextField jTextField=null;
	
	String sTipo="";
	
	public TextFieldDocumentListener(JInternalFrameBase jInternalFrameBase,JTextField jTextField,String sTipo) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.jTextField=jTextField;
		this.sTipo=sTipo;
	}
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	@Override 
	public void changedUpdate(DocumentEvent e) {
		this.jInternalFrameBase.jTextFieldChangedUpdateGeneral(this.sTipo,this.jTextField,e);
	}
	
	//CUANDO SE QUITA ALGUN CARACTER
	@Override
	public void removeUpdate(DocumentEvent e) {
		this.jInternalFrameBase.jTextFieldRemoveUpdateGeneral(this.sTipo,this.jTextField,e);
	}
	
	//CUANDO SE INGRESA ALGUN CARACTER
	@Override
	public void insertUpdate(DocumentEvent e) {
		this.jInternalFrameBase.jTextFieldInsertUpdateGeneral(this.sTipo,this.jTextField,e);
	}
}
