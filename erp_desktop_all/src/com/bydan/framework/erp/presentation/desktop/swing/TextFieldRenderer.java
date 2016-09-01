package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.Color;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.EventObject;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.event.CellEditorListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

import org.jdesktop.beansbinding.Converter;

import com.bydan.framework.erp.util.Constantes2;
import com.bydan.framework.erp.util.Funciones2;

@SuppressWarnings("unused")
public class TextFieldRenderer extends DefaultTableCellRenderer implements TableCellRenderer{	
	/**
	 * 
	 */	
	private static final long serialVersionUID = 1L;
	/*
	protected JTextField jtextField = new JTextField();
	protected String sLabel=""; 	
	protected Boolean conRowLabel=false;
	*/
	protected String sToolTip="";
	protected Border borderResaltar=null;
	protected Boolean conEnabled=true;
	protected Integer iTotalRow=0;
	
	public JInternalFrameBase jInternalFrameBase;
	protected Boolean conHotKeys=false;
	protected String sNombreHotKeyAbstractAction="";
	protected String sTipoBusqueda="NINGUNO";
	
	public TextFieldRenderer() {
		/*
		this.jtextField = new JTextField();
		this.sLabel="";
		*/
		this.sToolTip="";
		this.iTotalRow=0;
		this.conEnabled=true;
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public TextFieldRenderer(Border borderResaltar,Boolean conEnabled,Integer iTotalRow) {
		/*
		this.jtextField = new JTextField();
		this.sLabel="";
		*/
		this.borderResaltar=borderResaltar;
		this.sToolTip="";
		this.iTotalRow=iTotalRow;
		this.conEnabled=conEnabled;
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}
		
	public TextFieldRenderer(Border borderResaltar,Boolean conEnabled) {
		/*
		this.jtextField = new JTextField();
		this.sLabel="";
		*/
		this.borderResaltar=borderResaltar;
		this.sToolTip="";
		this.iTotalRow=0;
		this.conEnabled=conEnabled;
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public TextFieldRenderer(Border borderResaltar,Boolean conEnabled,Integer iTotalRow,JInternalFrameBase jInternalFrameBase,Boolean conHotKeys,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		/*
		this.jtextField = new JTextField();
		this.sLabel="";
		*/
		this.borderResaltar=borderResaltar;
		this.sToolTip="";
		this.iTotalRow=iTotalRow;
		this.conEnabled=conEnabled;
		
		this.conHotKeys=conHotKeys;
		this.sNombreHotKeyAbstractAction=sNombreHotKeyAbstractAction;
		this.sTipoBusqueda=sTipoBusqueda;
		this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public TextFieldRenderer(Border borderResaltar,Boolean conEnabled,JInternalFrameBase jInternalFrameBase,Boolean conHotKeys,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {//,Integer iTotalRow
		/*
		this.jtextField = new JTextField();
		this.sLabel="";
		*/
		this.borderResaltar=borderResaltar;
		this.sToolTip="";
		this.iTotalRow=0;//iTotalRow;
		this.conEnabled=conEnabled;
		
		this.conHotKeys=conHotKeys;
		this.sNombreHotKeyAbstractAction=sNombreHotKeyAbstractAction;
		this.sTipoBusqueda=sTipoBusqueda;
		this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public TextFieldRenderer(Border borderResaltar) {
		this(borderResaltar,true);
	}
	
	public TextFieldRenderer(String sLabel,Boolean conEnabled) {
		/*
		this.jtextField = new JTextField();
		this.sLabel=sLabel;
		*/
		this.sToolTip="";
		this.conEnabled=conEnabled;
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public TextFieldRenderer(String sLabel) {
		this(sLabel,true);
	}
	
	public TextFieldRenderer(Boolean conRowLabel,Boolean conEnabled) {
		/*
		this.jtextField = new JTextField();
		this.sLabel="";				
		this.conRowLabel=conRowLabel;
		*/
		this.sToolTip="";
		this.iTotalRow=0;
		this.conEnabled=conEnabled;
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public TextFieldRenderer(Boolean conRowLabel) {
		this(conRowLabel,true);
	}
	
	public TextFieldRenderer(Boolean conRowLabel,String sToolTip,Boolean conEnabled) {
		/*
		this.jtextField = new JTextField();
		this.sLabel="";		
		this.conRowLabel=conRowLabel;
		*/
		this.sToolTip=sToolTip;
		this.conEnabled=conEnabled;
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public TextFieldRenderer(Boolean conRowLabel,String sToolTip) {
		this(conRowLabel,sToolTip,true);
	}
	
	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		Component component=super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

		
		if(this.sToolTip!="") {
	    	this.setToolTipText(this.sToolTip);
	    }
		
		if(this.borderResaltar!=null) {
			this.setBorder(this.borderResaltar);
		}
		
		this.setOpaque(true);
		
		//if(row!=(this.iTotalRow-1)) {
		if((this.jInternalFrameBase.conTotales && row != table.getRowCount()-1) || !this.jInternalFrameBase.conTotales) {
			this.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2()); //Funciones2.getColorFilaTabla1()
		} else {
	    	this.setBackground(Funciones2.getColorFilaTablaTotales());
		}
		
		
	    /*
	    if(isSelected) {
	    	this.setForeground(Color.BLUE);
		}
	    */
	    
		/*
		this.jtextField = new JTextField();
		
	    if (value != null) {
	    	String string_value=(String)value;
	    		    
	    	if(string_value!="") {
	    		this.jtextField.setText(string_value);
	    	} else {
	    		this.jtextField.setText(string_value);
	    	}	    	
	    }
	    
	    this.jtextField.setHorizontalAlignment(JCheckBox.CENTER);//CENTER
	    
	    this.jtextField.setOpaque(true);
	    this.jtextField.setBackground(row % 2 == 0 ? Funciones2.getColorFilaTabla1() : Funciones2.getColorFilaTabla2());
	    	    	  
	    if(this.sLabel!="") {
	    	this.jtextField.setText(this.sLabel);
	    } else {
	    	if(this.conRowLabel) {
	    		Integer iRowLabel=(row+1);
	    		
	    		this.jtextField.setText(iRowLabel.toString());
	    		
	    		this.jtextField.setHorizontalAlignment(JCheckBox.LEFT);
	    	}
	    }
	    
	    if(this.sToolTip!="") {
	    	this.jtextField.setToolTipText(this.sToolTip+"-"+(row+1));
	    }
	    
	    return this.jtextField;
	    
	    */
		

		if(this.conHotKeys) {
			//ES JLabel NO TextField
			this.jInternalFrameBase.setHotKeysJLabelGenerico(this,this.jInternalFrameBase,this.sNombreHotKeyAbstractAction,this.sTipoBusqueda);
		}
		
	    this.setEnabled(this.conEnabled);

	    
	    if(this.jInternalFrameBase!=null) {
			if(this.jInternalFrameBase.getConTipoTamanioTodo()) {
				FuncionesSwing.setBoldLabel(this, this.jInternalFrameBase.getsTipoTamanioGeneralTabla(),true,false,this.jInternalFrameBase);
			}
		}
	    
	    if(isSelected) {
			this.setForeground(FuncionesSwing.getColorSelectedForeground());
		}
	    
	    
		return this;
	}
	

	public Boolean getConEnabled() {
		return conEnabled;
	}

	public void setConEnabled(Boolean conEnabled) {
		this.conEnabled = conEnabled;
	}
}