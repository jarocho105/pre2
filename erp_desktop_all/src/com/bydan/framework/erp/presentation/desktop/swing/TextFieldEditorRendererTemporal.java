package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.EventObject;

import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

import org.jdesktop.beansbinding.Converter;

import com.bydan.framework.erp.util.Funciones;
import com.bydan.framework.erp.util.Funciones2;
import com.toedter.calendar.JDateChooser;

@SuppressWarnings("unused")
public class TextFieldEditorRendererTemporal extends DefaultCellEditor  {
	private static final long serialVersionUID = 1L;
	
	/*
	protected JCheckBox jcheckBox = new JCheckBox();
	protected String sLabel=""; 
	protected Boolean conRowLabel=false;
	*/
	protected String sToolTip="";
	protected Boolean conEnabled=true;
	
	public TextFieldEditorRendererTemporal() {
		super(new JTextField());	
		/*
		super(new JCheckBox());		
		this.jcheckBox = new JCheckBox();
		this.sLabel="";
		*/
		this.sToolTip="";
		this.conEnabled=true;
	}
	
	public TextFieldEditorRendererTemporal(String sLabel) {
		super(new JTextField());	
		/*
		super(new JCheckBox());		
		this.jcheckBox = new JCheckBox();
		this.sLabel=sLabel;
		*/
		this.sToolTip="";
		this.conEnabled=true;
	}
	
	public TextFieldEditorRendererTemporal(Boolean conRowLabel) {
		super(new JTextField());
		/*
		this.jcheckBox = new JCheckBox();
		this.sLabel="";		
		this.conRowLabel=conRowLabel;
		*/
		this.sToolTip="";
		this.conEnabled=true;
	}
	
	public TextFieldEditorRendererTemporal(Boolean conRowLabel,String sToolTip) {
		super(new JTextField());
		/*
		this.jcheckBox = new JCheckBox();
		this.sLabel="";		
		this.conRowLabel=conRowLabel;
		*/
		this.sToolTip=sToolTip;
		this.conEnabled=true;
	}
	
	@Override
	public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
		Component component=super.getTableCellEditorComponent(table, value, isSelected, row, column);
		
		JComponent jcomponent=(JComponent)component;
		
		//this.jcheckBox=((JCheckBox)component);
		
		if(this.sToolTip!="") {
			jcomponent.setToolTipText(this.sToolTip+"-"+(row+1));
		}
		
		//this.component.setEnabled(this.conEnabled);
		
		return component;
		
		/*
		this.jcheckBox = new JCheckBox();
		  
		    if (value != null) {		    			    		
		    	Boolean boolean_value=(Boolean)value;
    		    
		    	if(boolean_value) {
		    		this.jcheckBox.setSelected(true);
		    	} else {
		    		this.jcheckBox.setSelected(false);
		    	}	
		    }
		   		    		
		this.jcheckBox.setHorizontalAlignment(JCheckBox.CENTER);
		    
		if(this.sLabel!="") {
	    	this.jcheckBox.setText(this.sLabel);
	    	
	    } else {
	    	if(this.conRowLabel) {
	    		Integer iRowLabel=(row+1);
	    		
	    		this.jcheckBox.setText(iRowLabel.toString());
	    		
	    		this.jcheckBox.setHorizontalAlignment(JCheckBox.LEFT);
	    	}
	    }
		
		if(this.sToolTip!="") {
		   	this.jcheckBox.setToolTipText(this.sToolTip+"-"+(row+1));
		}
		 
		return this.jcheckBox;
		*/
   }
	
	
	@Override
	public boolean stopCellEditing() {
		//System.out.println("STOP="+this.editor.getText());
		
		fireEditingStopped();
		
		return true;	
	}
	
	
	@Override
	public Object getCellEditorValue() {
		Object value=new Object();
		Component component=null;
		
	    try {
	    	component=this.getComponent();
	    	
	    	if(component instanceof JTextField) {
	    		value=((JTextField)component).getText();
	    	}
	    	//value=this.jcheckBox.isSelected();
	    	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    //System.out.println("VALUE");
	    
	    return value;
	}
	
	public Boolean getConEnabled() {
		return conEnabled;
	}

	public void setConEnabled(Boolean conEnabled) {
		this.conEnabled = conEnabled;
	}
	
}