package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class AbstractActionGeneral extends AbstractAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MigrationJFrame migrationJFrame=null;
	public String sTipo="";
	
	public AbstractActionGeneral(MigrationJFrame migrationJFrame,String sTipo) {
		this.migrationJFrame=migrationJFrame;
		this.sTipo=sTipo;
	}
	
	public void actionPerformed(ActionEvent evt) {
    	try {
    		if(this.sTipo.equals("jButtonAceptarActionPerformedMigrationJFrame")) {
    			this.migrationJFrame.jButtonAceptarActionPerformed(evt);
    			
    		} else if(this.sTipo.equals("jButtonCancelarActionPerformedMigrationJFrame")) {
    			this.migrationJFrame.jButtonCancelarActionPerformed(evt);
    		} 
    		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
