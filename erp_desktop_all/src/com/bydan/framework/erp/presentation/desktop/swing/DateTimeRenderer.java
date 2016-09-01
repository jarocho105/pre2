package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.Color;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.EventObject;

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

@SuppressWarnings({ "unused", "serial" })
public class DateTimeRenderer extends DefaultTableCellRenderer implements TableCellRenderer{	
	JLabel renderer = new JLabel();
	protected Border borderResaltar=null;
	protected Boolean conEnabled=true;
	protected Integer iTotalRow=0;
	
	public JInternalFrameBase jInternalFrameBase;
	protected Boolean conHotKeys=false;
	protected String sNombreHotKeyAbstractAction="";
	protected String sTipoBusqueda="NINGUNO";
	
	public DateTimeRenderer() {
		this.renderer = new JLabel();
		this.iTotalRow=0;
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}

	public DateTimeRenderer(Boolean conEnabled) {
		this.renderer = new JLabel();
		this.iTotalRow=0;
		this.conEnabled=conEnabled;
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public DateTimeRenderer(Border borderResaltar,Boolean conEnabled) {
		this.borderResaltar=borderResaltar;
		this.renderer = new JLabel();
		this.iTotalRow=0;
		this.conEnabled=conEnabled;
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}

	public DateTimeRenderer(Border borderResaltar,Boolean conEnabled,Integer iTotalRow) {
		this.borderResaltar=borderResaltar;
		this.renderer = new JLabel();
		this.iTotalRow=iTotalRow;
		this.conEnabled=conEnabled;
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public DateTimeRenderer(Border borderResaltar) {
		this(borderResaltar,true);
	}
	
	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		//Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		
		this.renderer = new JLabel();
		
	    if (value != null) {
	    	Date date=(Date)value;
	    	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//("yyyy-MM-dd");
	    	
	    	this.renderer.setText(dateFormat.format(date));
	    }
	    
	    if(this.borderResaltar!=null) {
	    	this.renderer.setBorder(this.borderResaltar);
		}
	    
	    this.renderer.setOpaque(true);
	    
	    //if(row!=(this.iTotalRow-1)) {
	    if((this.jInternalFrameBase.conTotales && row != table.getRowCount()-1) || !this.jInternalFrameBase.conTotales) {
	    	this.renderer.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2());//Funciones2.getColorFilaTabla1()
	    } else {
	    	this.renderer.setBackground(Funciones2.getColorFilaTablaTotales());
		}
	    
	    if(isSelected) {
	    	this.renderer.setForeground(FuncionesSwing.getColorSelectedForeground());
		}
	    
	    //component.setBackground(row % 2 == 0 ? Funciones2.getColorFilaTabla1() : Funciones2.getColorFilaTabla2());
	    
	    this.renderer.setEnabled(this.conEnabled);
	    
	    if(this.jInternalFrameBase!=null) {
			if(this.jInternalFrameBase.getConTipoTamanioTodo()) {
				FuncionesSwing.setBoldLabel(this.renderer, this.jInternalFrameBase.getsTipoTamanioGeneralTabla(),true,false,this.jInternalFrameBase);
			}
		}
	    
	    return this.renderer;
	  }
}