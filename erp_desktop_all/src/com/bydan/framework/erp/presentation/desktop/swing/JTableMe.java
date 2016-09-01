package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.Component;

import javax.swing.JTable;

import com.bydan.framework.erp.util.Constantes2;

@SuppressWarnings("unused")
public class JTableMe extends JTable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected Boolean conEnabled=true;
	
	public JTableMe(Boolean conEnabled) {
		super();
		
		this.conEnabled=conEnabled;
		this.setEnabled(this.conEnabled);
		
		//this.setBackground(FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR));
		
		//SIZE VARIANT
		this.putClientProperty(Constantes2.S_NAME_VARIANT, Constantes2.S_SIZE_VARIANT);
		//this.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
	}
	
	@Override
	public void changeSelection(int row, int column, boolean toggle, boolean extend) {
		//System.out.println("CHANGE SELECTION");
		
	    super.changeSelection(row, column, toggle, extend);
	 
	    //PARA QUE OBTENGA EL FOCUS AUTOMATICAMENTE
	    /*
	    if (editCellAt(row, column)) {
	        Component editor = getEditorComponent();
	        editor.requestFocusInWindow();
	    }
	    */
	}
	
	public JTableMe() {
		this(true);
	}
	
	public Boolean getConEnabled() {
		return conEnabled;
	}

	public void setConEnabled(Boolean conEnabled) {
		this.conEnabled = conEnabled;
	}
}
