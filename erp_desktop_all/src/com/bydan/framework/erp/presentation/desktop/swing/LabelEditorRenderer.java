package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.Color;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.EventObject;

import javax.swing.DefaultCellEditor;
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
public class LabelEditorRenderer extends DefaultCellEditor {	
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
	protected JLabel jLabel = new JLabel();
	
	public JInternalFrameBase jInternalFrameBase;
	protected Boolean conHotKeys=false;
	protected String sNombreHotKeyAbstractAction="";
	protected String sTipoBusqueda="NINGUNO";
	
	public LabelEditorRenderer() {
		super(new JCheckBox());
		/*
		this.jtextField = new JTextField();
		this.sLabel="";
		*/
		this.sToolTip="";
		this.conEnabled=true;
		this.jLabel = new JLabel();
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}

	public LabelEditorRenderer(Border borderResaltar,Boolean conEnabled) {
		super(new JCheckBox());
		/*
		this.jtextField = new JTextField();
		this.sLabel="";
		*/
		this.borderResaltar=borderResaltar;
		this.sToolTip="";
		this.conEnabled=conEnabled;
		this.jLabel = new JLabel();
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public LabelEditorRenderer(Border borderResaltar) {
		this(borderResaltar,true);
	}
	
	public LabelEditorRenderer(String sLabel,Boolean conEnabled) {
		super(new JCheckBox());
		/*
		this.jtextField = new JTextField();
		this.sLabel=sLabel;
		*/
		this.sToolTip="";
		this.conEnabled=conEnabled;
		this.jLabel = new JLabel();
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public LabelEditorRenderer(String sLabel) {
		this(sLabel,true);
	}
	
	public LabelEditorRenderer(Boolean conRowLabel,Boolean conEnabled) {
		super(new JCheckBox());
		/*
		this.jtextField = new JTextField();
		this.sLabel="";				
		this.conRowLabel=conRowLabel;
		*/
		this.sToolTip="";
		this.conEnabled=conEnabled;
		this.jLabel = new JLabel();
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public LabelEditorRenderer(Boolean conRowLabel) {
		this(conRowLabel,true);
	}
	
	public LabelEditorRenderer(Boolean conRowLabel,String sToolTip,Boolean conEnabled) {
		super(new JCheckBox());
		/*
		this.jtextField = new JTextField();
		this.sLabel="";		
		this.conRowLabel=conRowLabel;
		*/
		this.sToolTip=sToolTip;
		this.conEnabled=conEnabled;
		this.jLabel = new JLabel();
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public LabelEditorRenderer(Boolean conRowLabel,String sToolTip) {
		this(conRowLabel,sToolTip,true);
	}
	
	@Override
	public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
		//Component component=super.getTableCellEditorComponent(table, value, isSelected, row, column);		
		//this.jcheckBox=((JCheckBox)component);
		
		this.jLabel = new JLabel();
		  
		if (value != null) {		    			    		
		   	String sValue=(String)value;
    		    
		   	this.jLabel.setText(sValue);		    
		}
		   		    		
		this.jLabel.setHorizontalAlignment(JLabel.CENTER);
		    				
		if(this.sToolTip!="") {
		   	this.jLabel.setToolTipText(this.sToolTip+"-"+(row+1));
		}
		 
		this.jLabel.setEnabled(this.conEnabled);
		
		
		if(this.jInternalFrameBase!=null) {
			if(this.jInternalFrameBase.getConTipoTamanioTodo()) {
				FuncionesSwing.setBoldLabel(this.jLabel, this.jInternalFrameBase.getsTipoTamanioGeneralTabla(),true,false,this.jInternalFrameBase);
			}
		}
		 
		return this.jLabel;
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
		
	    try {
	    	value=this.jLabel.getText();
	    	
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
	
	
	/*
	@Override
	public void cancelCellEditing() {
		
	}
	*/
}