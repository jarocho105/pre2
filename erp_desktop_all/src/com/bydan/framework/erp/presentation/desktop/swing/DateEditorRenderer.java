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
public class DateEditorRenderer extends DefaultCellEditor  {
	private static final long serialVersionUID = 1L;
	
	protected Boolean conEnabled=true;
	protected Border borderResaltar=null;
	//JTextField editor = new JTextField();
	JDateChooser jDateChooserfechaAsientoContable=new JDateChooser();
	
	public JInternalFrameBase jInternalFrameBase;
	protected Boolean conHotKeys=false;
	protected String sNombreHotKeyAbstractAction="";
	protected String sTipoBusqueda="NINGUNO";
	
	public DateEditorRenderer(Border borderResaltar,Boolean conEnabled) {
		super(new JTextField());
		
		//this.editor = new JTextField();
		this.jDateChooserfechaAsientoContable=new JDateChooser();
		this.conEnabled=conEnabled;
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public DateEditorRenderer(Border borderResaltar,Boolean conEnabled,JInternalFrameBase jInternalFrameBase,Boolean conHotKeys,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		super(new JTextField());
		
		//this.editor = new JTextField();
		this.jDateChooserfechaAsientoContable=new JDateChooser();
		this.conEnabled=conEnabled;
		
		this.conHotKeys=conHotKeys;
		this.sNombreHotKeyAbstractAction=sNombreHotKeyAbstractAction;
		this.sTipoBusqueda=sTipoBusqueda;
		this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public DateEditorRenderer() {
		super(new JTextField());
		
		//this.editor = new JTextField();
		this.jDateChooserfechaAsientoContable=new JDateChooser();
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public DateEditorRenderer(Boolean conEnabled) {
		super(new JTextField());
		
		this.conEnabled=conEnabled;
		
		this.jDateChooserfechaAsientoContable=new JDateChooser();
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}
	
	@Override
	public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
		Component component=super.getTableCellEditorComponent(table, value, isSelected, row, column);
		
		//editor=((JTextField)component);
		//this.editor = new JTextField();
		  
		    if (value != null) {
		    	Date date=(Date)value;
		    	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		    	
		    	//this.editor.setText(dateFormat.format(date));
		    	
		    	this.jDateChooserfechaAsientoContable.setDateFormatString("yyyy-MM-dd");
		    	this.jDateChooserfechaAsientoContable.setDate(date);
		    }
		   		    
		   
		//return editor;
		
		this.jDateChooserfechaAsientoContable.setEnabled(this.conEnabled);
		
		if(this.borderResaltar!=null) {
		   	this.jDateChooserfechaAsientoContable.setBorder(this.borderResaltar);
		}
		
		this.jDateChooserfechaAsientoContable.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		
		
		if(this.conHotKeys) {
			this.jInternalFrameBase.setHotKeysJDateChooserGenerico(this.jDateChooserfechaAsientoContable,this.jInternalFrameBase,this.sNombreHotKeyAbstractAction,this.sTipoBusqueda);
		}
		
		if(this.jInternalFrameBase!=null) {
			if(this.jInternalFrameBase.getConTipoTamanioTodo()) {
				FuncionesSwing.setBoldDate(this.jDateChooserfechaAsientoContable, this.jInternalFrameBase.getsTipoTamanioGeneralTabla(),true,false,this.jInternalFrameBase);
			}
		}
		
		return this.jDateChooserfechaAsientoContable;
   }
	
	
	@Override
	public boolean stopCellEditing() {
		//System.out.println("STOP="+this.editor.getText());
		
		fireEditingStopped();
		return true;
		
		//return super.stopCellEditing();
	}
	
	
	@Override
	public Object getCellEditorValue() {
		Object value=new Object();
		
	    try {
	    	//value=Funciones2.getDatePostgresString(editor.getText());
	    	value=this.jDateChooserfechaAsientoContable.getDate();
	    	
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