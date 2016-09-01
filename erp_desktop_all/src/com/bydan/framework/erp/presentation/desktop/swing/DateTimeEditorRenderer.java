package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.Component;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.EventObject;

import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.border.Border;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

import org.jdesktop.beansbinding.Converter;

import com.bydan.framework.erp.util.Funciones;
import com.bydan.framework.erp.util.Funciones2;
import com.toedter.calendar.JDateChooser;

@SuppressWarnings("unused")
public class DateTimeEditorRenderer extends DefaultCellEditor  {
	private static final long serialVersionUID = 1L;
	
	protected Boolean conEnabled=true;
	protected Border borderResaltar=null;
	//JTextField editor = new JTextField();
	JPanelDateTimeMe jSpinnerHoraAsientoContable=new JPanelDateTimeMe();
	
	public JInternalFrameBase jInternalFrameBase;
	protected Boolean conHotKeys=false;
	protected String sNombreHotKeyAbstractAction="";
	protected String sTipoBusqueda="NINGUNO";
	
	public DateTimeEditorRenderer(Border borderResaltar,Boolean conEnabled) {
		super(new JTextField());
		
		//this.editor = new JTextField();
		this.jSpinnerHoraAsientoContable=new JPanelDateTimeMe();		
		this.jSpinnerHoraAsientoContable.setValue(new Timestamp((new Date()).getTime()));
		
		this.conEnabled=conEnabled;
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public DateTimeEditorRenderer() {
		super(new JTextField());
		
		//this.editor = new JTextField();
		this.jSpinnerHoraAsientoContable=new JPanelDateTimeMe();				
		this.jSpinnerHoraAsientoContable.setValue(new Timestamp((new Date()).getTime()));
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public DateTimeEditorRenderer(Boolean conEnabled) {
		super(new JTextField());
		
		this.conEnabled=conEnabled;
		
		this.jSpinnerHoraAsientoContable=new JPanelDateTimeMe();
		this.jSpinnerHoraAsientoContable.setValue(new Timestamp((new Date()).getTime()));
		
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
		    	//Time time=(Time)value;
		    	//String sTime=time.toString();
		    	//Date date=(Date)value;
		    	//DateFormat dateFormat = new SimpleDateFormat("HH-mm-ss");		    	
		    	//this.editor.setText(dateFormat.format(date));
		    	
		    	//this.jSpinnerHoraAsientoContable.setDateFormatString("yyyy-MM-dd");
		    	
		    	this.jSpinnerHoraAsientoContable.setValue((Timestamp)value);
		    }
		   		    
		   
		//return editor;
		
		this.jSpinnerHoraAsientoContable.setEnabled(this.conEnabled);
		
		if(this.borderResaltar!=null) {
		   	this.jSpinnerHoraAsientoContable.setBorder(this.borderResaltar);
		}
		
		this.jSpinnerHoraAsientoContable.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		
		if(this.jInternalFrameBase!=null) {
			if(this.jInternalFrameBase.getConTipoTamanioTodo()) {
				FuncionesSwing.setBoldHora(this.jSpinnerHoraAsientoContable.getjSpinnerHora(), this.jInternalFrameBase.getsTipoTamanioGeneralTabla(),true,false,this.jInternalFrameBase);
			}
		}
		
		return this.jSpinnerHoraAsientoContable;
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
		Timestamp timestamp_value=null;
		//String sValue=this.jSpinnerHoraAsientoContable.getValue().toString();
		
	    try {
	    	timestamp_value=this.jSpinnerHoraAsientoContable.getValue();
	    	
	    	//value=Funciones2.getDatePostgresString(editor.getText());
	    	/*
	    	JFormattedTextField jFormattedTextFieldEditor=(JFormattedTextField)this.jSpinnerHoraAsientoContable.jSpinnerHora.getEditor().getComponent(0);
	    	
	    	if(!jFormattedTextFieldEditor.getText().equals("")) {
	    		sValue=jFormattedTextFieldEditor.getText();
	    	} else {
	    		sValue=(new Time(((Date)this.jSpinnerHoraAsientoContable.getValue()).getTime())).toString();
	    	}
	    	
	    	//System.out.println("ANTES-getCellEditorValue="+jFormattedTextFieldEditor.getText());
	    	
	    	//ESTO NO ES EL EDITOR
	    	//time_value=new Time(((Date)this.jSpinnerHoraAsientoContable.getValue()).getTime());
	    	
	    	//VALOR DESDE EDITOR
	    	time_value=new Time(((Date)this.jSpinnerHoraAsientoContable.getValue()).getTime());
	    			
	    	time_value=Time.valueOf(sValue);
	    	*/
	    	//System.out.println("DESPUES-getCellEditorValue="+time_value);
	    	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    //System.out.println("VALUE");
	    
	    return timestamp_value;
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