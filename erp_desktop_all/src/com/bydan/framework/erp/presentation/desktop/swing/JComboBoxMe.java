package com.bydan.framework.erp.presentation.desktop.swing;

//import java.awt.Color;

import java.awt.Dimension;
import java.util.Vector;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;

import com.bydan.framework.erp.util.Constantes2;

//@SuppressWarnings("unused")
@SuppressWarnings({"rawtypes", "unchecked" })
public class JComboBoxMe extends JComboBox<Object>{
	private static final long serialVersionUID = 1L;
	protected Boolean conEnabled=true;		
	private boolean layingOut = false;
	private Integer iRazonAnchoExtra=1; 
	
	public JComboBoxMe(Boolean conEnabled) {
		super();
		
		this.conEnabled=conEnabled;
		this.setEnabled(this.conEnabled);				
		
		this.iRazonAnchoExtra=2;
		
		//SIZE VARIANT
		this.putClientProperty(Constantes2.S_NAME_VARIANT, Constantes2.S_SIZE_VARIANT);
		
		FuncionesSwing.adjustPopupWidthComboBox(this);
		
		//this.setBackground(FuncionesSwing.getColorTextFields("azul"));
		//this.setBackground(new Color(220,240,247));		
		
		//ESTO SI VALE, LO ANTERIOR NO NOSE
		//this.setBackground(Color.YELLOW);		
		
		this.setBackground(FuncionesSwing.getColorTextFields("azul"));
		
		//this.setRenderer(new ComboBoxRender());
	}
	
	public JComboBoxMe(Integer iRazonAnchoExtra) {		
		this(true);
		
		this.iRazonAnchoExtra=iRazonAnchoExtra;
		
	}
	
	public JComboBoxMe() {
		this(true);
	}
	
	public JComboBoxMe(final Object items[]){ 
		super(items); 
	} 
		
	public JComboBoxMe(Vector items) { 
		super(items); 
	} 
		
	public JComboBoxMe(ComboBoxModel aModel) { 
		super(aModel); 
	} 
	 
	public Boolean getConEnabled() {
		return conEnabled;
	}

	public void setConEnabled(Boolean conEnabled) {
		this.conEnabled = conEnabled;
	}		 
	 
    public void doLayout(){ 
        try { 
            this.layingOut = true; 
            
            super.doLayout(); 
            
        } finally{ 
        	this.layingOut = false; 
        } 
    } 
 
    public Dimension getSize(){ 
        Dimension dimensionSize = super.getSize(); 
        
        if(!this.layingOut) { 
        	dimensionSize.width = Math.max(dimensionSize.width * this.iRazonAnchoExtra, this.getPreferredSize().width * this.iRazonAnchoExtra);
        }
        
        return dimensionSize; 
    } 
}
