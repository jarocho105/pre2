package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.Component;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;


//import com.bydan.erp.seguridad.util.BimestreConstantesFunciones;
import com.bydan.framework.erp.util.Constantes2;
import com.bydan.framework.erp.util.Funciones2;

public class IdTableCell extends DefaultCellEditor implements TableCellRenderer {
	private static final long serialVersionUID = 1L;
	
	JButton jButtonId;
	Object valor;
	JInternalFrameBase jInternalFrameBase=null;
	String sLabelButton="";
	String sToolTipButton="";
	Boolean esRelaciones=false;
	Boolean esRelacionado=false;
	Boolean esEliminar=false;
	protected Boolean conEnabled=true;
	protected Integer iTotalRow=0;
	
	public IdTableCell(JInternalFrameBase jInternalFrameBase,Boolean esRelaciones,Boolean esEliminar,Integer iTotalRow) {
		this(jInternalFrameBase,esRelaciones,esEliminar,true,iTotalRow,false);
	}
	
	public IdTableCell(JInternalFrameBase jInternalFrameBase,Boolean esRelaciones,Boolean esEliminar,Boolean esRelacionado,Integer iTotalRow) {
		this(jInternalFrameBase,esRelaciones,esEliminar,true,iTotalRow,esRelacionado);
	}
	
	public IdTableCell(JInternalFrameBase jInternalFrameBase,Boolean esRelaciones,Boolean esEliminar) {
		this(jInternalFrameBase,esRelaciones,esEliminar,true,0,false);
	}
	
	public IdTableCell(JInternalFrameBase jInternalFrameBase,Boolean esRelaciones,Boolean esEliminar,Boolean esRelacionado) {
		this(jInternalFrameBase,esRelaciones,esEliminar,true,0,esRelacionado);
	}
	
	public IdTableCell() {
		super(new JCheckBoxMe());	
		this.iTotalRow=0;
	}
	
	public IdTableCell(Boolean conEnabled) {
		super(new JCheckBoxMe());
		this.iTotalRow=0;
		this.conEnabled=conEnabled;
	}
	
	public IdTableCell(JInternalFrameBase jInternalFrameBase,Boolean esRelaciones,Boolean esEliminar,Boolean conEnabled,Integer iTotalRow,Boolean esRelacionado) {
		super(new JCheckBoxMe());
		
		this.jInternalFrameBase=jInternalFrameBase;
		this.esRelaciones=esRelaciones;
		this.esRelacionado=esRelacionado;
		this.esEliminar=esEliminar;
		this.conEnabled=conEnabled;
		this.iTotalRow=iTotalRow;
		
		if(!this.esEliminar) {
			if(!this.esRelaciones) {
				if(!this.jInternalFrameBase.esParaBusquedaForeignKey) {
					this.sLabelButton="Editar";
				} else {
					this.sLabelButton="Seleccionar";
				}
			} else {
				this.sLabelButton="Editar Rel";
			}
			
			this.sToolTipButton=this.sLabelButton;
			
		} else {
			this.sLabelButton="El";
			this.sToolTipButton="ELIMINAR";
		}
	}
	
	public Component getTableCellRendererComponent(JTable table,Object value,boolean isSelected,boolean hasFocus,final int row,final int column) {
		this.jButtonId =new JButtonMe(this.sLabelButton+"-"+(row+1));
		this.jButtonId.setToolTipText(this.sToolTipButton+" "+"-"+(row+1));//+BimestreConstantesFunciones.SCLASSWEBTITULO
		
		final Boolean esRelaciones=this.esRelaciones;
		final Boolean esEliminar=this.esEliminar;
		
		/*
		this.jButtonId.addActionListener (
			new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					jInternalFrameBase.jButtonIdActionPerformed(evt,row,esRelaciones,esEliminar);
				}
			}
		);
		*/
		
		this.jButtonId.addActionListener(new ButtonActionListener(this.jInternalFrameBase,"IdTableCell","",row,esRelaciones,esEliminar));
		
		
		if(this.esEliminar) {
			FuncionesSwing.addImagenButtonGeneral(this.jButtonId,"eliminar_button",this.sLabelButton,this.esRelacionado);
		} else {
			FuncionesSwing.addImagenButtonGeneral(this.jButtonId,"seleccionar_button",this.sLabelButton,this.esRelacionado);
		}
		
		this.jButtonId.setOpaque(true);
		
		//if(row!=(this.iTotalRow-1)) {
		if((this.jInternalFrameBase.conTotales && row != table.getRowCount()-1) || !this.jInternalFrameBase.conTotales) {
			this.jButtonId.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2());
		} else {
			this.jButtonId =new JButtonMe("TOTALES-"+(row+1));
			this.jButtonId.setBackground(Funciones2.getColorFilaTablaTotales());
		}
						
		this.jButtonId.setEnabled(this.conEnabled);
		
		if(this.jInternalFrameBase!=null) {
			if(this.jInternalFrameBase.getConTipoTamanioTodo()) {
				FuncionesSwing.setBoldButton(this.jButtonId, this.jInternalFrameBase.getsTipoTamanioGeneralTabla(),true,false,this.jInternalFrameBase);
			}
		}
		
		if(isSelected) {
			this.jButtonId.setForeground(FuncionesSwing.getColorSelectedForeground());
		}
		
		return jButtonId;
	}

	public Component getTableCellEditorComponent(JTable table,Object value,boolean isSelected,final int row,int column) {
		jButtonId=new JButtonMe(this.sLabelButton+"-"+(row+1));
		jButtonId.setToolTipText(this.sToolTipButton+" "+"-"+(row+1));//+BimestreConstantesFunciones.SCLASSWEBTITULO
		
		final Boolean esRelaciones=this.esRelaciones;
		final Boolean esEliminar=this.esEliminar;
		
		/*
		jButtonId.addActionListener (
			new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					jInternalFrameBase.jButtonIdActionPerformed(evt,row,esRelaciones,esEliminar);
				}
			}
		);
		*/
		
		this.jButtonId.addActionListener(new ButtonActionListener(this.jInternalFrameBase,"IdTableCell","",row,esRelaciones,esEliminar));
		
		if(this.esEliminar) {
			FuncionesSwing.addImagenButtonGeneral(this.jButtonId,"eliminar_button",this.sLabelButton);
		} else {
			FuncionesSwing.addImagenButtonGeneral(this.jButtonId,"seleccionar_button",this.sLabelButton);
		}
		
		valor=value;
		
		this.jButtonId.setEnabled(this.conEnabled);
		
		if(this.jInternalFrameBase!=null) {
			if(this.jInternalFrameBase.getConTipoTamanioTodo()) {
				FuncionesSwing.setBoldButton(this.jButtonId, this.jInternalFrameBase.getsTipoTamanioGeneralTabla(),true,false,this.jInternalFrameBase);
			}
		}
		
		return jButtonId;
	}

	public Object getCellEditorValue() {
		return valor;
	}				
	
	public boolean stopCellEditing() {
		fireEditingStopped();
		
		return true;
	}
}
