package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.Component;
import java.sql.Time;
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
public class TimeEditorRenderer extends DefaultCellEditor  {
	private static final long serialVersionUID = 1L;
	
	protected Boolean conEnabled=true;
	protected Border borderResaltar=null;
	//JTextField editor = new JTextField();
	JSpinner jSpinnerHoraAsientoContable=new JSpinner(new SpinnerDateModel());
	JSpinner.DateEditor timeEditorhora_atencionNovedad = new JSpinner.DateEditor(jSpinnerHoraAsientoContable, "HH:mm:ss");
	
	public JInternalFrameBase jInternalFrameBase;
	protected Boolean conHotKeys=false;
	protected String sNombreHotKeyAbstractAction="";
	protected String sTipoBusqueda="NINGUNO";
	protected Boolean conEditorDobleClic=false;
	protected Integer iTotalRow=0;
	
	public TimeEditorRenderer(Border borderResaltar,Boolean conEnabled) {
		super(new JTextField());
		
		//this.editor = new JTextField();
		this.jSpinnerHoraAsientoContable=new JSpinner(new SpinnerDateModel());
		this.timeEditorhora_atencionNovedad = new JSpinner.DateEditor(jSpinnerHoraAsientoContable, "HH:mm:ss");
		
		this.jSpinnerHoraAsientoContable.setEditor(this.timeEditorhora_atencionNovedad);
		this.jSpinnerHoraAsientoContable.setValue(new Date());
		
		this.conEnabled=conEnabled;
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public TimeEditorRenderer() {
		super(new JTextField());
		
		//this.editor = new JTextField();
		this.jSpinnerHoraAsientoContable=new JSpinner(new SpinnerDateModel());
		this.timeEditorhora_atencionNovedad = new JSpinner.DateEditor(jSpinnerHoraAsientoContable, "HH:mm:ss");
		
		this.jSpinnerHoraAsientoContable.setEditor(this.timeEditorhora_atencionNovedad);
		this.jSpinnerHoraAsientoContable.setValue(new Date());
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public TimeEditorRenderer(Boolean conEnabled) {
		super(new JTextField());
		
		this.conEnabled=conEnabled;
		
		this.jSpinnerHoraAsientoContable=new JSpinner(new SpinnerDateModel());
		this.timeEditorhora_atencionNovedad = new JSpinner.DateEditor(jSpinnerHoraAsientoContable, "HH:mm:ss");
		
		this.jSpinnerHoraAsientoContable.setEditor(this.timeEditorhora_atencionNovedad);
		this.jSpinnerHoraAsientoContable.setValue(new Date());
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public TimeEditorRenderer(Border borderResaltar,Boolean conEnabled,JInternalFrameBase jInternalFrameBase,Boolean conHotKeys,String sNombreHotKeyAbstractAction,String sTipoBusqueda,Boolean conEditorDobleClic) {
		super(new JTextField());
		
		this.borderResaltar=borderResaltar;
		this.conEnabled=conEnabled;
		this.jInternalFrameBase=jInternalFrameBase;
		this.conHotKeys=conHotKeys;
		this.sNombreHotKeyAbstractAction=sNombreHotKeyAbstractAction;
		this.sTipoBusqueda=sTipoBusqueda;
		this.conEditorDobleClic=conEditorDobleClic;
	}
	
	public TimeEditorRenderer(Border borderResaltar,Boolean conEnabled,Integer iTotalRow,JInternalFrameBase jInternalFrameBase,Boolean conHotKeys,String sNombreHotKeyAbstractAction,String sTipoBusqueda,Boolean conEditorDobleClic) {
		super(new JTextField());
		
		this.borderResaltar=borderResaltar;
		this.conEnabled=conEnabled;
		this.iTotalRow=iTotalRow;
		this.jInternalFrameBase=jInternalFrameBase;
		this.conHotKeys=conHotKeys;
		this.sNombreHotKeyAbstractAction=sNombreHotKeyAbstractAction;
		this.sTipoBusqueda=sTipoBusqueda;
		this.conEditorDobleClic=conEditorDobleClic;
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
		    	
		    	this.jSpinnerHoraAsientoContable.setValue(value);
		    }
		   		    
		   
		//return editor;
		
		this.jSpinnerHoraAsientoContable.setEnabled(this.conEnabled);
		
		if(this.borderResaltar!=null) {
		   	this.jSpinnerHoraAsientoContable.setBorder(this.borderResaltar);
		}
		
		this.jSpinnerHoraAsientoContable.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		
		
		if(this.jInternalFrameBase!=null) {
			if(this.jInternalFrameBase.getConTipoTamanioTodo()) {
				FuncionesSwing.setBoldHora(this.jSpinnerHoraAsientoContable, this.jInternalFrameBase.getsTipoTamanioGeneralTabla(),true,false,this.jInternalFrameBase);
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
		Time time_value=new Time((new Date()).getTime());
		String sValue=this.jSpinnerHoraAsientoContable.getValue().toString();
		
	    try {
	    	//value=Funciones2.getDatePostgresString(editor.getText());
	    	JFormattedTextField jFormattedTextFieldEditor=(JFormattedTextField)this.jSpinnerHoraAsientoContable.getEditor().getComponent(0);
	    	
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
	    	
	    	//System.out.println("DESPUES-getCellEditorValue="+time_value);
	    	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    //System.out.println("VALUE");
	    
	    return time_value;
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