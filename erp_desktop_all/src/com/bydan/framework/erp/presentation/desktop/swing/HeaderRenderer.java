package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.Color;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.EventObject;

import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.CellEditorListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

import org.jdesktop.beansbinding.Converter;

import com.bydan.framework.erp.util.Funciones2;

@SuppressWarnings("unused")
public class HeaderRenderer extends DefaultTableCellRenderer implements TableCellRenderer{	
	/**
	 * 
	 */	
	private static final long serialVersionUID = 1L;
	protected String sToolTip="";
	protected Boolean conEnabled=true;
	
	public HeaderRenderer() {
		this.sToolTip="";
		this.conEnabled=true;
	}

	public HeaderRenderer(Boolean conEnabled) {
		this.sToolTip="";
		this.conEnabled=conEnabled;
	}			
	
	public HeaderRenderer(String sToolTip,Boolean conEnabled) {
		this.sToolTip=sToolTip;
		this.conEnabled=conEnabled;
	}	
	
	public HeaderRenderer(String sToolTip) {
		this(sToolTip,true);
	}	
	
	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		Component component=super.getTableCellRendererComponent(table, value, isSelected, hasFocus,row, column); 
	    
		if (component instanceof JComponent) {
            JComponent jcomponent = (JComponent) component;
             
            if(this.sToolTip!="") {
            	jcomponent.setToolTipText(this.sToolTip);
            }
    	}
		
		//this.jcomponent.setEnabled(this.conEnabled);
		
	    return component;
	  }
	
	public Boolean getConEnabled() {
		return conEnabled;
	}

	public void setConEnabled(Boolean conEnabled) {
		this.conEnabled = conEnabled;
	}
}