package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

import com.bydan.framework.erp.util.Constantes2;

public class JPanelMe extends JPanel { //JPanelLazyMe { 
	  
	 
	private static final long serialVersionUID = 1L;
	private Boolean conRepeatImage=true;
	private Image image=null;
	private String sPathImagen=null;
	protected Boolean conEnabled=true;
	
	public JPanelMe(Boolean conEnabled) {
		super();
		this.conEnabled=conEnabled;
		this.setEnabled(this.conEnabled);
		
	}
	
	public JPanelMe() {
		this(true);
				
	}
	
	public JPanelMe(String sPathImagen,Boolean conRepeatImage,Boolean conEnabled) {
		super();
		
		this.sPathImagen=sPathImagen;
		this.conRepeatImage=conRepeatImage;
		this.conEnabled=conEnabled;
		this.setEnabled(this.conEnabled);
		
	}
	
	public JPanelMe(String sPathImagen,Boolean conRepeatImage) {
		this(sPathImagen,conRepeatImage,true);
	}
	
	 //BYDAN_CAMBIAR_NOMBRE (PARA WINDOWS BUILDER VISUALIZAR)
	//@Override
	//public void paintComponent0(Graphics g) {
	@Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        
        if(!Constantes2.CON_WEB_EXPRESS_VERSION2) {
	        //BYDAN_COMENTAR (PARA WINDOWS BUILDER VISUALIZAR)
        	       	
	        image=FuncionesSwing.getImagenFondo(this.sPathImagen);
	        
	        if(image!=null) {
		        if (conRepeatImage) {
		            int iw = image.getWidth(this);
		            int ih = image.getHeight(this);
		            
		            if (iw > 0 && ih > 0) {
		                for (int x = 0; x < getWidth(); x += iw) {
		                    for (int y = 0; y < getHeight(); y += ih) {
		                        g.drawImage(image, x, y, iw, ih, this);
		                    }
		                }
		            }
		            
		        } else {
		            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
		        }
	        }
	        
        }
        
        
    }
	
	public Boolean getConEnabled() {
		return conEnabled;
	}

	public void setConEnabled(Boolean conEnabled) {
		this.conEnabled = conEnabled;
	}	
}
