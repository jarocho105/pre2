package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.net.URL;

import javax.swing.JDesktopPane;

import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.framework.erp.util.Constantes2;

@SuppressWarnings("unused")
public class JDesktopPaneMe extends JDesktopPane{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String sNombreImagen="background.jpg";
	private Image image=null;
	public Constantes2 constantes2=null;
	
	public JDesktopPaneMe() {
		super();						
		
		image=FuncionesSwing.getImagenBackground(this.sNombreImagen);
		
		constantes2=new Constantes2();
		
		//this.setBackground(Color.BLACK);
	}
	
	 @Override
	 public void paintComponent(Graphics g) {
	    super.paintComponent(g);
	    Graphics2D graphics2D = (Graphics2D) g;
	    graphics2D.drawImage(image, 0, 0, getSize().width, getSize().height, this);
	 }
}
