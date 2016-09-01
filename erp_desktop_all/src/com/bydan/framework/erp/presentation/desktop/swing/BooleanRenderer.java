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
public class BooleanRenderer extends DefaultTableCellRenderer implements TableCellRenderer{	
	/**
	 * 
	 */	
	private static final long serialVersionUID = 1L;
	protected JCheckBox jcheckBox = new JCheckBox();
	protected String sLabel=""; 	
	protected Boolean conRowLabel=false;
	protected String sToolTip="";
	protected Border borderResaltar=null;
	protected Boolean conEnabled=true;
	protected Integer iTotalRow=0;
	
	public JInternalFrameBase jInternalFrameBase;
	protected Boolean conHotKeys=false;
	protected String sNombreHotKeyAbstractAction="";
	protected String sTipoBusqueda="NINGUNO";
	
	public BooleanRenderer() {
		this.jcheckBox = new JCheckBox();
		this.sLabel="";
		this.sToolTip="";
		this.iTotalRow=0;
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public BooleanRenderer(Border borderResaltar,Boolean conEnabled,Integer iTotalRow) {
		this.borderResaltar=borderResaltar;
		this.jcheckBox = new JCheckBox();
		this.sLabel="";
		this.sToolTip="";
		this.iTotalRow=iTotalRow;
		this.conEnabled=conEnabled;
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public BooleanRenderer(Border borderResaltar,Boolean conEnabled,Integer iTotalRow,JInternalFrameBase jInternalFrameBase,Boolean conHotKeys,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		this.borderResaltar=borderResaltar;
		this.jcheckBox = new JCheckBox();
		this.sLabel="";
		this.sToolTip="";
		this.iTotalRow=iTotalRow;
		this.conEnabled=conEnabled;
		
		this.conHotKeys=conHotKeys;
		this.sNombreHotKeyAbstractAction=sNombreHotKeyAbstractAction;
		this.sTipoBusqueda=sTipoBusqueda;
		this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public BooleanRenderer(Border borderResaltar,Boolean conEnabled) {
		this.borderResaltar=borderResaltar;
		this.jcheckBox = new JCheckBox();
		this.sLabel="";
		this.sToolTip="";
		this.iTotalRow=0;
		this.conEnabled=conEnabled;
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}

	public BooleanRenderer(Border borderResaltar) {
		this(borderResaltar,true);
	}
	
	public BooleanRenderer(String sLabel,Boolean conEnabled) {
		this.jcheckBox = new JCheckBox();
		this.sLabel=sLabel;
		this.sToolTip="";
		this.iTotalRow=0;
		this.conEnabled=conEnabled;
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public BooleanRenderer(String sLabel) {
		this(sLabel,true);
	}
	
	public BooleanRenderer(Boolean conRowLabel,Boolean conEnabled) {
		this.jcheckBox = new JCheckBox();
		this.sLabel="";
		this.sToolTip="";
		this.iTotalRow=0;
		this.conRowLabel=conRowLabel;
		this.conEnabled=conEnabled;
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public BooleanRenderer(Boolean conRowLabel) {
		this(conRowLabel,true);
	}
	
	public BooleanRenderer(Boolean conRowLabel,String sToolTip,Boolean conEnabled) {
		this.jcheckBox = new JCheckBox();
		this.sLabel="";
		this.iTotalRow=0;
		this.sToolTip=sToolTip;
		this.conRowLabel=conRowLabel;
		this.conEnabled=conEnabled;
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public BooleanRenderer(Boolean conRowLabel,String sToolTip) {
		this(conRowLabel,sToolTip,true);
	}
	
	public BooleanRenderer(Boolean conRowLabel,String sToolTip,Border borderResaltar,Boolean conEnabled) {
		this.borderResaltar=borderResaltar;
		this.jcheckBox = new JCheckBox();
		this.sLabel="";
		this.iTotalRow=0;
		this.sToolTip=sToolTip;
		this.conRowLabel=conRowLabel;
		this.conEnabled=conEnabled;
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}
	
		   //BooleanRenderer(Boolean conRowLabel,String sToolTip,Border borderResaltar)
	public BooleanRenderer(Boolean conRowLabel,String sToolTip,Border borderResaltar,Boolean conEnabled,Boolean conHotKeys,String sNombreHotKeyAbstractAction,String sTipoBusqueda,JInternalFrameBase jInternalFrameBase) {
		this.borderResaltar=borderResaltar;
		this.jcheckBox = new JCheckBox();
		this.sLabel="";
		this.iTotalRow=0;
		this.sToolTip=sToolTip;
		this.conRowLabel=conRowLabel;
		this.conEnabled=conEnabled;
		
		this.conHotKeys=conHotKeys;
		this.sNombreHotKeyAbstractAction=sNombreHotKeyAbstractAction;
		this.sTipoBusqueda=sTipoBusqueda;
		this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public BooleanRenderer(Boolean conRowLabel,String sToolTip,Border borderResaltar,Integer iTotalRow,Boolean conEnabled,Boolean conHotKeys,String sNombreHotKeyAbstractAction,String sTipoBusqueda,JInternalFrameBase jInternalFrameBase) {
		this.borderResaltar=borderResaltar;
		this.jcheckBox = new JCheckBox();
		this.sLabel="";
		this.iTotalRow=iTotalRow;
		this.sToolTip=sToolTip;
		this.conRowLabel=conRowLabel;
		this.conEnabled=conEnabled;
		
		this.conHotKeys=conHotKeys;
		this.sNombreHotKeyAbstractAction=sNombreHotKeyAbstractAction;
		this.sTipoBusqueda=sTipoBusqueda;
		this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public BooleanRenderer(Boolean conRowLabel,String sToolTip,Border borderResaltar) {
		this(conRowLabel,sToolTip,borderResaltar,true);
	}
	
	public BooleanRenderer(Boolean conRowLabel,String sToolTip,Border borderResaltar,Boolean conEnabled,Integer iTotalRow) {
		this.borderResaltar=borderResaltar;
		this.jcheckBox = new JCheckBox();
		this.sLabel="";
		this.iTotalRow=iTotalRow;
		this.sToolTip=sToolTip;
		this.conRowLabel=conRowLabel;
		this.conEnabled=conEnabled;
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public BooleanRenderer(Boolean conRowLabel,String sToolTip,Border borderResaltar,Integer iTotalRow) {
		this(conRowLabel,sToolTip,borderResaltar,true,iTotalRow);
	}
	
	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		this.jcheckBox = new JCheckBox();				
		
	    if (value != null) {
	    	Boolean boolean_value=(Boolean)value;
	    		    
	    	if(boolean_value) {
	    		this.jcheckBox.setSelected(true);
	    	} else {
	    		this.jcheckBox.setSelected(false);
	    	}	    	
	    }
	    
	    this.jcheckBox.setHorizontalAlignment(JCheckBox.CENTER);//CENTER
	    
	    if(this.borderResaltar!=null) {
	    	this.jcheckBox.setBorderPainted(true);
			this.jcheckBox.setBorder(this.borderResaltar);
		}
	    	   	    
	    //this.jcheckBox.setBorderPainted(true);
	    //this.jcheckBox.setBorder(Funciones2.getBorderResaltar());	    
	    	    
	    
	    
	    this.jcheckBox.setOpaque(true);
	    
	    //if(row!=(this.iTotalRow-1)) {
	    if(this.jInternalFrameBase==null) {
	    	this.jInternalFrameBase=new JInternalFrameBase();
	    }
	    
	    if((this.jInternalFrameBase.conTotales && row != table.getRowCount()-1) || !this.jInternalFrameBase.conTotales) {
	    	this.jcheckBox.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR)  : Funciones2.getColorFilaTabla2());//Funciones2.getColorFilaTabla1()
	    } else {
	    	this.jcheckBox.setBackground(Funciones2.getColorFilaTablaTotales());
		}
	    
	    if(isSelected) {
	    	this.jcheckBox.setForeground(FuncionesSwing.getColorSelectedForeground());
		}
	    
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
	    
	    this.jcheckBox.setEnabled(this.conEnabled);
	    
	    
	    if(this.jInternalFrameBase!=null) {
	    	if(this.jInternalFrameBase.getConTipoTamanioTodo()) {
	    		FuncionesSwing.setBoldCheckBox(this.jcheckBox, this.jInternalFrameBase.getsTipoTamanioGeneralTabla(),true,false,this.jInternalFrameBase);
	    	}
	    }
	    
	    
	    if(isSelected) {
			this.jcheckBox.setForeground(FuncionesSwing.getColorSelectedForeground());
		}
	    
	    return this.jcheckBox;
	}
	
	public Boolean getConEnabled() {
		return conEnabled;
	}

	public void setConEnabled(Boolean conEnabled) {
		this.conEnabled = conEnabled;
	}
}