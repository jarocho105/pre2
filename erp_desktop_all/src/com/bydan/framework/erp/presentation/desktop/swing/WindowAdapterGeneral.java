package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapterGeneral extends WindowAdapter {
	public MemoriaSitioJFrame memoriaSitioJFrame;
	public String sTipo="";
	
	public WindowAdapterGeneral(MemoriaSitioJFrame memoriaSitioJFrame,String sTipo) {
		this.memoriaSitioJFrame=memoriaSitioJFrame;
		this.sTipo=sTipo;
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		
		if(this.sTipo.equals("MemoriaSitioJFrame")) {
			memoriaSitioJFrame.cargarMemoria();		
		}
	}
	
	@Override
	public void windowClosed(WindowEvent e) {
		
		//System.out.println("Ventana Cerrada");
	}
}
