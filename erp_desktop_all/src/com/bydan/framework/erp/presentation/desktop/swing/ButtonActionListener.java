package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.event.ActionListener;

public class ButtonActionListener implements ActionListener {
	public JInternalFrameBase jInternalFrameBase=null;
	public String sTipo="";
	public String sSubTipo="";
	public int row=0;
	
	public Boolean esRelaciones=false;
	public Boolean esEliminar=false;
	
	public ButtonActionListener(JInternalFrameBase jInternalFrameBase,String sTipo) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
	}
	
	public ButtonActionListener(JInternalFrameBase jInternalFrameBase,String sTipo,String sSubTipo,int row,Boolean esRelaciones,Boolean esEliminar) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
		this.sSubTipo=sSubTipo;
		this.row=row;
		this.esRelaciones=esRelaciones;
		this.esEliminar=esEliminar;
	}
	
	public ButtonActionListener(JInternalFrameBase jInternalFrameBase,String sTipo,String sSubTipo,int row) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
		this.sSubTipo=sSubTipo;
		this.row=row;
	}
	
	public void actionPerformed(java.awt.event.ActionEvent evt) { 	  
		try {
			if(!this.sTipo.equals("TableCell") && !this.sTipo.equals("IdTableCell")) {
				//Para Botones Normales (Recargar Informacion, Ver,etc)
				jInternalFrameBase.jButtonActionPerformedGeneral(this.sTipo,evt);
				
			} else if(this.sTipo.equals("IdTableCell")) {
				//Para Boton Seleccionar Fila Actual de la Tabla (Normal o Relaciones)
				this.jInternalFrameBase.jButtonIdActionPerformed(evt,this.row,this.esRelaciones,this.esEliminar);
			
			} else if(this.sTipo.equals("TableCell")) {
				//Para Botones de Fila Actual de la Tabla, al final, para Tablas Relacionadas
				this.jInternalFrameBase.jButtonRelacionActionPerformed(this.sSubTipo,evt,this.row,true,false);			
			}
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
}
