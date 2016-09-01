package com.bydan.framework.erp.presentation.desktop.swing;

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
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

import org.jdesktop.beansbinding.Converter;

import com.bydan.framework.erp.util.Funciones;
import com.bydan.framework.erp.util.Funciones2;
import com.toedter.calendar.JDateChooser;

@SuppressWarnings("unused")
public class BooleanEditorRenderer extends DefaultCellEditor  {
	private static final long serialVersionUID = 1L;
	
	protected JCheckBox jcheckBox = new JCheckBox();
	protected String sLabel=""; 
	protected Boolean conRowLabel=false;
	protected String sToolTip="";
	protected Boolean conEnabled=true;
	protected Border borderResaltar=null;
	protected Integer iTotalRow=0;
	
	public JInternalFrameBase jInternalFrameBase;
	protected Boolean conHotKeys=false;
	protected String sNombreHotKeyAbstractAction="";
	protected String sTipoBusqueda="NINGUNO";
	
	
	public BooleanEditorRenderer() {
		super(new JCheckBox());
		
		this.jcheckBox = new JCheckBox();
		this.sLabel="";
		this.sToolTip="";
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public BooleanEditorRenderer(Border borderResaltar,Boolean conEnabled) {
		super(new JCheckBox());
		
		this.jcheckBox = new JCheckBox();
		this.borderResaltar=borderResaltar;
		this.sToolTip="";
		this.conEnabled=conEnabled;
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public BooleanEditorRenderer(Border borderResaltar,Boolean conEnabled,JInternalFrameBase jInternalFrameBase,Boolean conHotKeys,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {//Integer iTotalRow,
		super(new JCheckBox());
		
		this.jcheckBox = new JCheckBox();
		this.borderResaltar=borderResaltar;
		this.sToolTip="";
		this.conEnabled=conEnabled;
		this.iTotalRow=0;//iTotalRow;
		
		this.conHotKeys=conHotKeys;
		this.sNombreHotKeyAbstractAction=sNombreHotKeyAbstractAction;
		this.sTipoBusqueda=sTipoBusqueda;
		this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public BooleanEditorRenderer(String sLabel,Boolean conEnabled) {
		super(new JCheckBox());
		
		this.jcheckBox = new JCheckBox();
		this.sLabel=sLabel;
		this.sToolTip="";
		this.conEnabled=conEnabled;
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public BooleanEditorRenderer(String sLabel) {
		this(sLabel,true);				
	}
	
	public BooleanEditorRenderer(Boolean conRowLabel,Boolean conEnabled) {
		super(new JCheckBox());
		
		this.jcheckBox = new JCheckBox();
		this.sLabel="";
		this.sToolTip="";
		this.conRowLabel=conRowLabel;		
		this.conEnabled=conEnabled;
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public BooleanEditorRenderer(Boolean conRowLabel) {
		this(conRowLabel,true);				
	}
	
	public BooleanEditorRenderer(Boolean conRowLabel,String sToolTip) {
		this(conRowLabel,sToolTip,true);				
	}
	
	public BooleanEditorRenderer(Boolean conRowLabel,String sToolTip,Boolean conEnabled) {
		super(new JCheckBox());
		
		this.jcheckBox = new JCheckBox();
		this.sLabel="";
		this.sToolTip=sToolTip;
		this.conRowLabel=conRowLabel;		
		this.conEnabled=conEnabled;
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public BooleanEditorRenderer(Boolean conRowLabel,String sToolTip,Border borderResaltar) {
		super(new JCheckBox());
		
		this.jcheckBox = new JCheckBox();
		this.sLabel="";
		this.sToolTip=sToolTip;
		this.conRowLabel=conRowLabel;		
		this.borderResaltar=borderResaltar;
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public BooleanEditorRenderer(Boolean conRowLabel,String sToolTip,Border borderResaltar,Boolean conHotKeys,String sNombreHotKeyAbstractAction,String sTipoBusqueda,JInternalFrameBase jInternalFrameBase) {
		super(new JCheckBox());
		
		this.jcheckBox = new JCheckBox();
		this.sLabel="";
		this.sToolTip=sToolTip;
		this.conRowLabel=conRowLabel;		
		this.borderResaltar=borderResaltar;
		
		this.conHotKeys=conHotKeys;
		this.sNombreHotKeyAbstractAction=sNombreHotKeyAbstractAction;
		this.sTipoBusqueda=sTipoBusqueda;
		this.jInternalFrameBase=jInternalFrameBase;
	}
	
	@Override
	public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
		//Component component=super.getTableCellEditorComponent(table, value, isSelected, row, column);		
		//this.jcheckBox=((JCheckBox)component);
		
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
		 
		this.jcheckBox.setEnabled(this.conEnabled);
		
		
		if(this.conHotKeys) {
			this.jInternalFrameBase.setHotKeysJCheckBoxGenerico(this.jcheckBox,this.jInternalFrameBase,this.sNombreHotKeyAbstractAction,this.sTipoBusqueda);
		}
		
		if(this.jInternalFrameBase!=null) {
			if(this.jInternalFrameBase.getConTipoTamanioTodo()) {
				FuncionesSwing.setBoldCheckBox(this.jcheckBox, this.jInternalFrameBase.getsTipoTamanioGeneralTabla(),true,false,this.jInternalFrameBase);
			}
		}
		
		return this.jcheckBox;
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
	    	value=this.jcheckBox.isSelected();
	    	
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