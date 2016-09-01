package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import org.apache.log4j.Logger;

import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.framework.erp.util.Constantes;
import com.bydan.framework.erp.util.Constantes2;
import com.bydan.framework.erp.util.Funciones2;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;

@SuppressWarnings("unused")
public class FuncionesSwing {
	public static void manageNormalError(Object container,String sMensaje,Logger logger) throws Exception {		
		try {
			//e.printStackTrace();
			logger.error("Exception:" + sMensaje);
			
			JOptionPane.showMessageDialog((Container)container,sMensaje,"OK",JOptionPane.ERROR_MESSAGE);
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void manageNormalInfo(Object container,String sMensaje,Logger logger) throws Exception {		
		try {
			//e.printStackTrace();
			//logger.error("Exception:" + sMensaje);
			
			JOptionPane.showMessageDialog((Container)container,sMensaje,Constantes.SERROR,JOptionPane.INFORMATION_MESSAGE);
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void manageException(Object container,Exception e,Logger logger) throws Exception {		
		try {
			e.printStackTrace();
			logger.error("Exception:" + e.getMessage());
			
			JOptionPane.showMessageDialog((Container)container,e.getMessage(),Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
			
		} catch(Exception ex) {
			throw ex;
		}
	}
	
	//AUXILIAR PORQUE SE UTILIZA EN WEB
	public static void manageException(Object container,Exception e,Logger logger,String strNameWeb) throws Exception {		
		try {
			FuncionesSwing.manageException(container, e,logger);			
		} catch(Exception exc) {
			throw exc;
		}
	}
	
	public static void manageException2(Object container,Exception e,Logger logger,String strNameWeb){		
		try {
			FuncionesSwing.manageException(container, e,logger);			
		} catch(Exception exc) {
			System.out.print(e.getStackTrace());
		}
	}
	
	public static void manageException(Container container,Exception e) {
		e.printStackTrace();
		JOptionPane.showMessageDialog(container,e.getMessage(),Constantes.SERROR,JOptionPane.ERROR_MESSAGE);		
	}	
	
	/*
	EN UN FORMULARIO LOS LABELS INDICAN INVALIDES, Y SU MENSAJE APARECE EN CADA UNO COMO TOOLTIP 
	*/
	
	public static void mostrarCampoMensajeInvalido(Boolean esValido,JComponent jComponent,String sMensaje) throws Exception {
		//COLOR CAMPO
		
		if(!esValido) {
			jComponent.setForeground(Color.RED);
			jComponent.setToolTipText(sMensaje);
			//mostrarPopupMensajeInvalido(jComponent,sMensaje);
		} else {
			jComponent.setForeground(Color.BLACK);
			//jComponent.setToolTipText("");
		}
		
	}
	
	public static JButton getButtonToolBarGeneral(JButton jbutton,JToolBar jToolBar,String sNombreImagen,String sActionCommand,String sToolTip,String sAltText) {
		return FuncionesSwing.getButtonToolBarGeneral(jbutton,jToolBar,sNombreImagen,sActionCommand,sToolTip,sAltText,false);
	}
	
	public static JButton getButtonToolBarGeneral(JButton jbutton,JToolBar jToolBar,String sNombreImagen,String sActionCommand,String sToolTip,String sAltText,Boolean paraForzarUbicarSwingDesarrollo) {
		if(!paraForzarUbicarSwingDesarrollo) {
			String sImagenLocation = sNombreImagen + ".gif";
	        
			URL urlImagen = AuxiliarImagenes.class.getResource(sImagenLocation);
	       
			jbutton = new JButton();
	        jbutton.setActionCommand(sActionCommand);
	        jbutton.setToolTipText(sToolTip);
	        //jbutton.addActionListener(this);
	
	        if (urlImagen != null) {        
	        	ImageIcon imageIcon=new ImageIcon(urlImagen, sAltText);
	        	
	        	Image image = imageIcon.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
	        	imageIcon.setImage(image);
	        			
	        	jbutton.setIcon(imageIcon);
	        	//jbutton.setText(sAltText);
	        	
	        } else {                                     
	        	jbutton.setText(sAltText);
	        	
	        	if(Constantes.ISDEVELOPING) {
	        		System.err.println("Path Imagen No Encontrada:"+ sImagenLocation);
	        	}
	        }
	        
	        
	        if(jToolBar!=null) {
	        	jToolBar.add(jbutton);
	        }
			
		} else {
			jbutton = new JButton(sNombreImagen);
		}
		
        return jbutton;
	}
	
	public static void addImagenButtonGeneral(JButton jbutton,String sNombreImagen,String sAltText) {
		FuncionesSwing.addImagenButtonGeneral(jbutton,sNombreImagen,sAltText,false);
	}
	
	public static void addImagenButtonGeneral(JButton jbutton,String sNombreImagen,String sAltText,Boolean esRelacionado) {
		String sImagenLocation = sNombreImagen + ".gif";
        
		if(!Constantes2.CON_WEB_EXPRESS_VERSION2) {
			URL urlImagen = AuxiliarImagenes.class.getResource(sImagenLocation);
	       
			jbutton.setBackground(Color.WHITE);
			
			if(esRelacionado) {
				Border borderResaltar=Funciones2.getBorderResaltar(null,"BUTTON");
				jbutton.setBorder(borderResaltar);
			}
			
	        if (urlImagen != null) {                     
	        	jbutton.setIcon(new ImageIcon(urlImagen));
	        	//jbutton.setText(sAltText);
	        	
	        } else {      
	        	jbutton.setText(sAltText);
	        	
	        	if(Constantes.ISDEVELOPING) {
	        		System.err.println("Path Imagen No Encontrada:"+ sImagenLocation);
	        	}
	        }
		} 
	}
	
	public static void addImagenMenuItemGeneral(JMenuItem jMenuItem,String sNombreImagen,String sAltText) {
		String sImagenLocation = sNombreImagen + ".gif";
        
		URL urlImagen = AuxiliarImagenes.class.getResource(sImagenLocation);
       
        if (urlImagen != null) {                     
        	jMenuItem.setIcon(new ImageIcon(urlImagen));
        	//jbutton.setText(sAltText);
        	
        } else {      
        	jMenuItem.setText(sAltText);
        	
        	if(Constantes.ISDEVELOPING) {
        		System.err.println("Path Imagen No Encontrada:"+ sImagenLocation);
        	}
        }        
	}
	
	public static Image getImagenFondo(String sNombreImagen) {
		String sImagenLocation = sNombreImagen + ".gif";
        
		URL urlImagen = AuxiliarImagenes.class.getResource(sImagenLocation);
	       
		Image image=null;
		try {
			image = ImageIO.read(urlImagen);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//URL urlImagen = AuxiliarImagenes.class.getResource(sImagenLocation);
       
		
		return image;
            
	}	
	
	public static Image getImagenBackground(String sNombreImagen) {
		String sImagenLocation = sNombreImagen;
        
		URL urlImagen = AuxiliarImagenes.class.getResource(sImagenLocation);
	       
		Image image=null;
		try {
			image = ImageIO.read(urlImagen);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//URL urlImagen = AuxiliarImagenes.class.getResource(sImagenLocation);
       
		
		return image;
            
	}			
	
	public static void setFormatoLabelTituloGrupo(JLabel jLabel) {		
		FuncionesSwing.setFormatoLabelTituloGrupo(jLabel,false,false,null);
	}
	
	public static void setFormatoLabelTituloGrupo(JLabel jLabel,Boolean paraTabla,Boolean paraVentanaPrincipal,JInternalFrameBase jInternalFrameBase) {		 
		Font newLabelFont=new Font(jLabel.getFont().getName(),Font.BOLD,jLabel.getFont().getSize());  
		  
		//Set JLabel font using new created font  
		jLabel.setFont(newLabelFont);  
		jLabel.setForeground(Color.BLUE);
	}
	
	public static Boolean puedeCambiarFormato(JInternalFrameBase jInternalFrameBase,Boolean paraTabla,Boolean paraVentanaPrincipal) {
		Boolean puede=true;
		
		if(jInternalFrameBase==null || (jInternalFrameBase!=null && jInternalFrameBase.getsTipoTamanioGeneral().equals("NINGUNO"))) {
			puede=false;
		}
		
		return puede;
	}
	
	public static Boolean puedeCambiarFormato(JInternalFrameBase jInternalFrameBase,Boolean paraTabla,Boolean paraVentanaPrincipal,String sTipo) {
		Boolean puede=true;
		
		if(jInternalFrameBase==null || sTipo.equals("NINGUNO") || sTipo.equals("NORMAL") 
				|| (jInternalFrameBase!=null && jInternalFrameBase.getsTipoTamanioGeneral().equals("NINGUNO"))
				|| (jInternalFrameBase!=null && jInternalFrameBase.getsTipoTamanioGeneral().equals("NORMAL"))
		) {
			puede=false;
		}
		
		return puede;
	}
	
	public static void setBoldLabel(JLabel jLabel) {
		FuncionesSwing.setBoldLabel(jLabel,false,false,null);
	}
	
	public static void setBoldLabel(JLabel jLabel,Boolean paraTabla,Boolean paraVentanaPrincipal,JInternalFrameBase jInternalFrameBase) {		
		
		if(puedeCambiarFormato(jInternalFrameBase,paraTabla,paraVentanaPrincipal)) {	
			
		int iSize=0;		
		Font font=null;
		String sTipoFuente="";
		int iStyle=Font.PLAIN;
		Color colorBackGroud=jLabel.getBackground();			  		
			
		if(!paraTabla) {
			iStyle=Font.BOLD;
		} else {
			iStyle=Font.PLAIN;
			//return;
		}
		
		
		if(jInternalFrameBase!=null && !jInternalFrameBase.getConTipoTamanioManual()) {

			if(jInternalFrameBase.getsTipoTamanioGeneral().equals("NORMAL")) {
				jLabel.putClientProperty("JComponent.sizeVariant", "regular");
				
			} else if(jInternalFrameBase.getsTipoTamanioGeneral().equals("MEDIO")) {
				jLabel.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(jInternalFrameBase.getsTipoTamanioGeneral().equals("PEQUENO")) {
				jLabel.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(jInternalFrameBase.getsTipoTamanioGeneral().equals("GRANDE")) {
				jLabel.putClientProperty("JComponent.sizeVariant", "large");
				
			} else if(jInternalFrameBase.getsTipoTamanioGeneral().equals("MINIMO")) {
				jLabel.putClientProperty("JComponent.sizeVariant", "mini");
				
			} else if(jInternalFrameBase.getsTipoTamanioGeneral().equals("MAXIMO")) {
				jLabel.putClientProperty("JComponent.sizeVariant", "large");				
			}
			
			//jLabel.setFont(newLabelFont);  
			
			if(!jInternalFrameBase.getsTipoTamanioGeneral().equals("NINGUNO")) {
				
				jLabel.updateUI();
				
				//PONER NEGRILLAS A LABEL YA MODIFICADO
				iSize=jLabel.getFont().getSize();	
				sTipoFuente=FuncionesSwing.getTipoFuente(jLabel.getFont().getName(),jInternalFrameBase,null);
						
				font=new Font(sTipoFuente,iStyle,iSize);			
				jLabel.setFont(font);  
				jLabel.setBackground(colorBackGroud);
			}
			
		} else {
											  
			//System.out.println(jLabel.getFont().getSize());
			
			//Set JLabel font using new created font
			
			iSize=jLabel.getFont().getSize();
			sTipoFuente=FuncionesSwing.getTipoFuente(jLabel.getFont().getName(),jInternalFrameBase,null);
			
			font=new Font(sTipoFuente,iStyle,iSize); 
			
			
			jLabel.setFont(font);  
			jLabel.setBackground(colorBackGroud);
			
			//Border borderResaltar=Funciones2.getBorderResaltar(null,"PARAMETRO");
			
			//jLabel.setBorder(borderResaltar);
		}
		
		}
	}
	
	public static void setBoldLabel(JLabel jLabel,String sTipo) {	
		FuncionesSwing.setBoldLabel(jLabel,sTipo,false,false,null);
	}
	
	public static void setBoldLabel(JLabel jLabel,String sTipo,Boolean paraTabla,Boolean paraVentanaPrincipal,JInternalFrameBase jInternalFrameBase) {
		
		if(puedeCambiarFormato(jInternalFrameBase,paraTabla,paraVentanaPrincipal,sTipo)) {
					
		//SOLO FUNCIONA MANUAL PARA LABELS
		int iSize=0;//jLabel.getFont().getSize();
		Font font=null;
		String sTipoFuente="";
		Color colorBackGroud=jLabel.getBackground();
		
		int iStyle=Font.PLAIN;
  				
		if(!paraTabla) {
			iStyle=Font.BOLD;
		} else {
			iStyle=Font.PLAIN;
			//return;
		}
		
		
		if(jInternalFrameBase!=null && !jInternalFrameBase.getConTipoTamanioManual()) {
			if(sTipo.equals("NORMAL")) {
				jLabel.putClientProperty("JComponent.sizeVariant", "regular");
				
			} else if(sTipo.equals("MEDIO")) {
				jLabel.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(sTipo.equals("PEQUENO")) {
				jLabel.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(sTipo.equals("GRANDE")) {
				jLabel.putClientProperty("JComponent.sizeVariant", "large");
				
			} else if(sTipo.equals("MINIMO")) {
				jLabel.putClientProperty("JComponent.sizeVariant", "mini");
				
			} else if(sTipo.equals("MAXIMO")) {
				jLabel.putClientProperty("JComponent.sizeVariant", "large");
			}
			
			
			if(!sTipo.equals("NINGUNO")) {
				jLabel.updateUI();
				
				//PONER NEGRILLAS A LABEL YA MODIFICADO
				iSize=jLabel.getFont().getSize();			
				sTipoFuente=FuncionesSwing.getTipoFuente(jLabel.getFont().getName(),jInternalFrameBase,null);
				
				font=new Font(sTipoFuente,iStyle,iSize);			
				jLabel.setFont(font); 
				jLabel.setBackground(colorBackGroud);
			}
			
		} else {
		
			iSize=jLabel.getFont().getSize();
			
			
			//System.out.println(iSize);
			
			
			if(sTipo.equals("NORMAL")) {
				iSize=12;
				
			} else {
				
				if(sTipo.equals("MINIMO")) {		
					iSize=8;
					
				} else if(sTipo.equals("MEDIO")) {			
					iSize=11;
					
				} else if(sTipo.equals("GRANDE")) {
					iSize=20;
				}
			}
			
			sTipoFuente=FuncionesSwing.getTipoFuente(jLabel.getFont().getName(),jInternalFrameBase,null);
			
			font=new Font(sTipoFuente,iStyle,iSize);  
			
			//Set JLabel font using new created font  
			jLabel.setFont(font);  
			jLabel.setBackground(colorBackGroud);
			
			//Border borderResaltar=Funciones2.getBorderResaltar(null,"PARAMETRO");
			
			//jLabel.setBorder(borderResaltar);
		}
		
		}
	}
	
	public static void setBoldLabelTable(JTable jTable) {		
		FuncionesSwing.setBoldLabelTable(jTable,false,false,null);
	}
	
	public static void setBoldLabelTable(JTable jTable,Boolean paraTabla,Boolean paraVentanaPrincipal,JInternalFrameBase jInternalFrameBase) {
		
		if(puedeCambiarFormato(jInternalFrameBase,paraTabla,paraVentanaPrincipal)) {
		
		int iSize=0;//jLabel.getFont().getSize();
		Font font=null;
		String sTipoFuente="";
		
		int iStyle=Font.PLAIN;
  		
		
		if(!paraTabla) {
			iStyle=Font.BOLD;
		} else {
			iStyle=Font.PLAIN;
		}
		
		if(jInternalFrameBase!=null && !jInternalFrameBase.getConTipoTamanioManual()) {
			
			if(jInternalFrameBase.getsTipoTamanioGeneral().equals("NORMAL")) {
				jTable.putClientProperty("JComponent.sizeVariant", "regular");
				
			} else if(jInternalFrameBase.getsTipoTamanioGeneral().equals("MEDIO")) {
				jTable.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(jInternalFrameBase.getsTipoTamanioGeneral().equals("PEQUENO")) {
				jTable.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(jInternalFrameBase.getsTipoTamanioGeneral().equals("GRANDE")) {
				jTable.putClientProperty("JComponent.sizeVariant", "large");
				
			} else if(jInternalFrameBase.getsTipoTamanioGeneral().equals("MINIMO")) {
				jTable.putClientProperty("JComponent.sizeVariant", "mini");
				
			} else if(jInternalFrameBase.getsTipoTamanioGeneral().equals("MAXIMO")) {
				jTable.putClientProperty("JComponent.sizeVariant", "large");
			}
			
			if(!jInternalFrameBase.getsTipoTamanioGeneral().equals("NINGUNO")) {
				jTable.updateUI();
				
				iSize=jTable.getFont().getSize();	
				sTipoFuente=FuncionesSwing.getTipoFuente(jTable.getFont().getName(),jInternalFrameBase,null);
						
				font=new Font(sTipoFuente,iStyle,iSize);			
				jTable.setFont(font); 								
			}
			
		} else {
			iSize=jTable.getFont().getSize();	
			sTipoFuente=FuncionesSwing.getTipoFuente(jTable.getFont().getName(),jInternalFrameBase,null);
					
			font=new Font(sTipoFuente,iStyle,iSize);			
			jTable.setFont(font); 
			
			
			//jTable.getTableHeader().setFont(newLabelFont);
			
			//jTable.getTableHeader().setFont(new Font("SansSerif", Font.ITALIC, 40));
			 
			//Set JLabel font using new created font  
			//jLabel.setFont(newLabelFont);  
		}
		
		}
	}
	

	
	public static void setBoldTextField(JTextField jTextField,String sTipo) {		
		FuncionesSwing.setBoldTextField(jTextField,sTipo,false,false,null);
	}
	
	public static void setBoldTextField(JTextField jTextField,String sTipo,Boolean paraTabla,Boolean paraVentanaPrincipal,JInternalFrameBase jInternalFrameBase) {
		
		if(puedeCambiarFormato(jInternalFrameBase,paraTabla,paraVentanaPrincipal,sTipo)) {
		
		int iSize=0;//jLabel.getFont().getSize();
		Font font=null;
		String sTipoFuente="";
		
		int iStyle=Font.PLAIN;
  		
		/*
		if(!paraTabla) {
			iStyle=Font.BOLD;
		} else {
			iStyle=Font.PLAIN;
		}
		*/
		
		iStyle=Font.PLAIN;
		
		if(jInternalFrameBase!=null && !jInternalFrameBase.getConTipoTamanioManual()) {
			
			if(sTipo.equals("NORMAL")) {
				jTextField.putClientProperty("JComponent.sizeVariant", "regular");
				
			} else if(sTipo.equals("MEDIO")) {
				jTextField.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(sTipo.equals("PEQUENO")) {
				jTextField.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(sTipo.equals("GRANDE")) {
				jTextField.putClientProperty("JComponent.sizeVariant", "large");
				
			} else if(sTipo.equals("MINIMO")) {
				jTextField.putClientProperty("JComponent.sizeVariant", "mini");
				
			} else if(sTipo.equals("MAXIMO")) {
				jTextField.putClientProperty("JComponent.sizeVariant", "large");
			}
			
			
			if(!sTipo.equals("NINGUNO")) {
				
				jTextField.updateUI();
				
				iSize=jTextField.getFont().getSize();	
				sTipoFuente=FuncionesSwing.getTipoFuente(jTextField.getFont().getName(),jInternalFrameBase,null);
						
				font=new Font(sTipoFuente,iStyle,iSize);			
				jTextField.setFont(font); 								
			}			
			
		} else {
			
			iSize=jTextField.getFont().getSize();
			
			if(sTipo.equals("NORMAL")) {
				iSize=12;
				
			} else {
	
				if(sTipo.equals("MINIMO")) {		
					iSize=8;
					
				} else if(sTipo.equals("MEDIO")) {			
					iSize=10;
					
					jTextField.setMinimumSize(new Dimension((int)jTextField.getMinimumSize().getWidth(),20));
					jTextField.setMaximumSize(new Dimension((int)jTextField.getMaximumSize().getWidth(),20));
					jTextField.setPreferredSize(new Dimension((int)jTextField.getPreferredSize().getWidth(),20));
	
				} else if(sTipo.equals("GRANDE")) {
					iSize=20;
				}
			}
			
			
			//iSize=jTextField.getFont().getSize();	
			sTipoFuente=FuncionesSwing.getTipoFuente(jTextField.getFont().getName(),jInternalFrameBase,null);
					
			font=new Font(sTipoFuente,iStyle,iSize);			
			jTextField.setFont(font); 
		}
		
		}
	}
	
	public static void setBoldTextArea(JTextArea jTextArea,String sTipo) {		
		FuncionesSwing.setBoldTextArea(jTextArea,sTipo,false,false,null);
	}
	
	public static void setBoldTextArea(JTextArea jTextArea,String sTipo,Boolean paraTabla,Boolean paraVentanaPrincipal,JInternalFrameBase jInternalFrameBase) {
		if(puedeCambiarFormato(jInternalFrameBase,paraTabla,paraVentanaPrincipal,sTipo)) {
		
		int iSize=0;//jLabel.getFont().getSize();
		Font font=null;
		String sTipoFuente="";
		
		int iStyle=Font.PLAIN;
  		
		/*
		if(!paraTabla) {
			iStyle=Font.BOLD;
		} else {
			iStyle=Font.PLAIN;
		}
		*/
		
		iStyle=Font.PLAIN;
		
		if(jInternalFrameBase!=null && !jInternalFrameBase.getConTipoTamanioManual()) {
			
			if(sTipo.equals("NORMAL")) {
				jTextArea.putClientProperty("JComponent.sizeVariant", "regular");
				
			} else if(sTipo.equals("MEDIO")) {
				jTextArea.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(sTipo.equals("PEQUENO")) {
				jTextArea.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(sTipo.equals("GRANDE")) {
				jTextArea.putClientProperty("JComponent.sizeVariant", "large");
				
			} else if(sTipo.equals("MINIMO")) {
				jTextArea.putClientProperty("JComponent.sizeVariant", "mini");
				
			} else if(sTipo.equals("MAXIMO")) {
				jTextArea.putClientProperty("JComponent.sizeVariant", "large");
			}
			
			
			if(!sTipo.equals("NINGUNO")) {
				
				jTextArea.updateUI();
				
				iSize=jTextArea.getFont().getSize();	
				sTipoFuente=FuncionesSwing.getTipoFuente(jTextArea.getFont().getName(),jInternalFrameBase,null);
						
				font=new Font(sTipoFuente,iStyle,iSize);			
				jTextArea.setFont(font);							
			}	
			
		} else {
			
			iSize=jTextArea.getFont().getSize();	
			sTipoFuente=FuncionesSwing.getTipoFuente(jTextArea.getFont().getName(),jInternalFrameBase,null);
					
			font=new Font(sTipoFuente,iStyle,iSize);			
			jTextArea.setFont(font);
			
		}
		
		}
	}

	public static void setBoldCheckBox(JCheckBox jCheckBox,String sTipo) {		
		FuncionesSwing.setBoldCheckBox(jCheckBox,sTipo,false,false,null);
	}
	
	public static void setBoldCheckBox(JCheckBox jCheckBox,String sTipo,Boolean paraTabla,Boolean paraVentanaPrincipal,JInternalFrameBase jInternalFrameBase) {
		if(puedeCambiarFormato(jInternalFrameBase,paraTabla,paraVentanaPrincipal,sTipo)) {
		
		int iSize=0;//jLabel.getFont().getSize();
		Font font=null;
		String sTipoFuente="";
		
		int iStyle=Font.PLAIN;
  		
		/*
		if(!paraTabla) {
			iStyle=Font.BOLD;
		} else {
			iStyle=Font.PLAIN;
		}
		*/
		
		iStyle=Font.PLAIN;
		
		if(jInternalFrameBase!=null && !jInternalFrameBase.getConTipoTamanioManual()) {
			
			if(sTipo.equals("NORMAL")) {
				jCheckBox.putClientProperty("JComponent.sizeVariant", "regular");
				
			} else if(sTipo.equals("MEDIO")) {
				jCheckBox.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(sTipo.equals("PEQUENO")) {
				jCheckBox.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(sTipo.equals("GRANDE")) {
				jCheckBox.putClientProperty("JComponent.sizeVariant", "large");
				
			} else if(sTipo.equals("MINIMO")) {
				jCheckBox.putClientProperty("JComponent.sizeVariant", "mini");
				
			} else if(sTipo.equals("MAXIMO")) {
				jCheckBox.putClientProperty("JComponent.sizeVariant", "large");
			}
			
			
			if(!sTipo.equals("NINGUNO")) {
				
				jCheckBox.updateUI();
				
				iSize=jCheckBox.getFont().getSize();	
				sTipoFuente=FuncionesSwing.getTipoFuente(jCheckBox.getFont().getName(),jInternalFrameBase,null);
						
				font=new Font(sTipoFuente,iStyle,iSize);			
				jCheckBox.setFont(font);								
			}
		} else {
			iSize=jCheckBox.getFont().getSize();
			
			if(sTipo.equals("NORMAL")) {
				iSize=12;
				
			} else {
	
				if(sTipo.equals("MINIMO")) {		
					iSize=8;
					
				} else if(sTipo.equals("MEDIO")) {			
					iSize=8;
					
					jCheckBox.setMinimumSize(new Dimension(20,15));
					jCheckBox.setMaximumSize(new Dimension(20,15));
					jCheckBox.setPreferredSize(new Dimension(20,15));
	
					//jCheckBox.setBounds(0,0,15,15);
					  
				} else if(sTipo.equals("GRANDE")) {
					iSize=20;
				}
			}
			
			
			//iSize=jCheckBox.getFont().getSize();	
			sTipoFuente=FuncionesSwing.getTipoFuente(jCheckBox.getFont().getName(),jInternalFrameBase,null);
					
			font=new Font(sTipoFuente,iStyle,iSize);			
			jCheckBox.setFont(font);
		}
		
		}
	}

	public static void setBoldComboBox(JComboBox<?> jComboBox,String sTipo) {		
		FuncionesSwing.setBoldComboBox(jComboBox,sTipo,false,false,null);
	}
	
	public static void setBoldComboBox(JComboBox<?> jComboBox,String sTipo,Boolean paraTabla,Boolean paraVentanaPrincipal,JInternalFrameBase jInternalFrameBase) {
		if(puedeCambiarFormato(jInternalFrameBase,paraTabla,paraVentanaPrincipal,sTipo)) {
		
		int iSize=0;//jLabel.getFont().getSize();
		Font font=null;
		String sTipoFuente="";
		
		int iStyle=Font.PLAIN;
  		
		/*-
		if(!paraTabla) {
			iStyle=Font.BOLD;
		} else {
			iStyle=Font.PLAIN;
		}
		*/
		
		iStyle=Font.PLAIN;
		
		if(jInternalFrameBase!=null && !jInternalFrameBase.getConTipoTamanioManual()) {
			
			if(sTipo.equals("NORMAL")) {
				jComboBox.putClientProperty("JComponent.sizeVariant", "regular");
				
			} else if(sTipo.equals("MEDIO")) {
				jComboBox.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(sTipo.equals("PEQUENO")) {
				jComboBox.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(sTipo.equals("GRANDE")) {
				jComboBox.putClientProperty("JComponent.sizeVariant", "large");
				
			} else if(sTipo.equals("MINIMO")) {
				jComboBox.putClientProperty("JComponent.sizeVariant", "mini");
				
			} else if(sTipo.equals("MAXIMO")) {
				jComboBox.putClientProperty("JComponent.sizeVariant", "large");
			}
			
			
			if(!sTipo.equals("NINGUNO")) {
				
				jComboBox.updateUI();
				
				iSize=jComboBox.getFont().getSize();	
				sTipoFuente=FuncionesSwing.getTipoFuente(jComboBox.getFont().getName(),jInternalFrameBase,null);
						
				font=new Font(sTipoFuente,iStyle,iSize);			
				jComboBox.setFont(font);								
			}
		} else {
			iSize=jComboBox.getFont().getSize();
			
			if(sTipo.equals("NORMAL")) {
				iSize=12;
				
			} else {
	
				if(sTipo.equals("MINIMO")) {		
					iSize=8;
					
				} else if(sTipo.equals("MEDIO")) {			
					iSize=10;
					
					jComboBox.setMinimumSize(new Dimension((int)jComboBox.getMinimumSize().getWidth(),17));
					jComboBox.setMaximumSize(new Dimension((int)jComboBox.getMaximumSize().getWidth(),17));
					jComboBox.setPreferredSize(new Dimension((int)jComboBox.getPreferredSize().getWidth(),17));
	
				} else if(sTipo.equals("GRANDE")) {
					iSize=20;
				}
			}
			
			
			//iSize=jComboBox.getFont().getSize();	
			sTipoFuente=FuncionesSwing.getTipoFuente(jComboBox.getFont().getName(),jInternalFrameBase,null);
					
			font=new Font(sTipoFuente,iStyle,iSize);			
			jComboBox.setFont(font);
		}
		
		}
	}

	public static void setBoldButton(JButton jButton,String sTipo) {		
		FuncionesSwing.setBoldButton(jButton,sTipo,false,false,null);
	}
	
	public static void setBoldButton(JButton jButton,String sTipo,Boolean paraTabla,Boolean paraVentanaPrincipal,JInternalFrameBase jInternalFrameBase) {
		
		if(puedeCambiarFormato(jInternalFrameBase,paraTabla,paraVentanaPrincipal,sTipo)) {
		
		int iSize=0;//jLabel.getFont().getSize();
		Font font=null;
		String sTipoFuente="";
		
		int iStyle=Font.PLAIN;
  		
		/*
		if(!paraTabla) {
			iStyle=Font.BOLD;
		} else {
			iStyle=Font.PLAIN;
		}
		*/
		
		iStyle=Font.PLAIN;
		
		if(jInternalFrameBase!=null && !jInternalFrameBase.getConTipoTamanioManual()) {
			
			if(sTipo.equals("NORMAL")) {
				jButton.putClientProperty("JComponent.sizeVariant", "regular");
				
			} else if(sTipo.equals("MEDIO")) {
				jButton.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(sTipo.equals("PEQUENO")) {
				jButton.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(sTipo.equals("GRANDE")) {
				jButton.putClientProperty("JComponent.sizeVariant", "large");
				
			} else if(sTipo.equals("MINIMO")) {
				jButton.putClientProperty("JComponent.sizeVariant", "mini");
				
			} else if(sTipo.equals("MAXIMO")) {
				jButton.putClientProperty("JComponent.sizeVariant", "large");
			}
			
			
			if(!sTipo.equals("NINGUNO")) {
				
				jButton.updateUI();
				
				iSize=jButton.getFont().getSize();
				
				if(sTipo.equals("MAXIMO")) {
					if(iSize<=12) {
						iSize=14;
					}
					
				} else if(sTipo.equals("MINIMO")) {
					if(iSize>=12) {
						iSize=9;
					}
				}
				
				sTipoFuente=FuncionesSwing.getTipoFuente(jButton.getFont().getName(),jInternalFrameBase,null);
						
				font=new Font(sTipoFuente,iStyle,iSize);			
				jButton.setFont(font);				
				
			}
		} else {
			iSize=jButton.getFont().getSize();
			
			if(sTipo.equals("NORMAL")) {
				iSize=12;
				
			} else {
	
				if(sTipo.equals("MINIMO")) {		
					iSize=8;
					
				} else if(sTipo.equals("MEDIO")) {			
					iSize=12;
					
					jButton.setMinimumSize(new Dimension((int)jButton.getMinimumSize().getWidth(),24));
					jButton.setMaximumSize(new Dimension((int)jButton.getMaximumSize().getWidth(),24));
					jButton.setPreferredSize(new Dimension((int)jButton.getPreferredSize().getWidth(),24));
	
				} else if(sTipo.equals("GRANDE")) {
					iSize=20;
				}
			}
			
			
			//iSize=jButton.getFont().getSize();	
			sTipoFuente=FuncionesSwing.getTipoFuente(jButton.getFont().getName(),jInternalFrameBase,null);
					
			font=new Font(sTipoFuente,iStyle,iSize);			
			jButton.setFont(font);
		}
		
		}
	}
	
	public static void setBoldButtonToolBar(JButton jButton,String sTipo) {		
		FuncionesSwing.setBoldButtonToolBar(jButton,sTipo,false,false,null);
	}
	
	public static void setBoldButtonToolBar(JButton jButton,String sTipo,Boolean paraTabla,Boolean paraVentanaPrincipal,JInternalFrameBase jInternalFrameBase) {
		
		if(puedeCambiarFormato(jInternalFrameBase,paraTabla,paraVentanaPrincipal,sTipo)) {
		
		int iSize=0;//jLabel.getFont().getSize();
		Font font=null;
		String sTipoFuente="";
		
		int iStyle=Font.PLAIN;
  		
		
		if(!paraTabla) {
			iStyle=Font.BOLD;
		} else {
			iStyle=Font.PLAIN;
		}
		
		if(jInternalFrameBase!=null && !jInternalFrameBase.getConTipoTamanioManual()) {
			
			if(sTipo.equals("NORMAL")) {
				jButton.putClientProperty("JComponent.sizeVariant", "regular");
				
			} else if(sTipo.equals("MEDIO")) {
				jButton.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(sTipo.equals("PEQUENO")) {
				jButton.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(sTipo.equals("GRANDE")) {
				jButton.putClientProperty("JComponent.sizeVariant", "large");
				
			} else if(sTipo.equals("MINIMO")) {
				jButton.putClientProperty("JComponent.sizeVariant", "mini");
				
			} else if(sTipo.equals("MAXIMO")) {
				jButton.putClientProperty("JComponent.sizeVariant", "large");
			}
			
			
			if(!sTipo.equals("NINGUNO")) {
				
				jButton.updateUI();
				
				iSize=jButton.getFont().getSize();	
				sTipoFuente=FuncionesSwing.getTipoFuente(jButton.getFont().getName(),jInternalFrameBase,null);
						
				font=new Font(sTipoFuente,iStyle,iSize);			
				jButton.setFont(font);
								
			}
			
		} else {
			iSize=jButton.getFont().getSize();
			
			if(sTipo.equals("NORMAL")) {
				iSize=12;
				
			} else {
	
				if(sTipo.equals("MINIMO")) {		
					iSize=8;
					
				} else if(sTipo.equals("MEDIO")) {			
					iSize=11;
					
					//System.out.println(jButton.getMinimumSize().getWidth());
					//System.out.println(jButton.getMinimumSize().getHeight());
					
					int iWidth=30;
					int iHeight=20;
					
					jButton.setMinimumSize(new Dimension(iWidth,iHeight));
					jButton.setMaximumSize(new Dimension(iWidth,iHeight));
					jButton.setPreferredSize(new Dimension(iWidth,iHeight));
	
				} else if(sTipo.equals("GRANDE")) {
					iSize=20;
				}
			}
			
			
			//iSize=jButton.getFont().getSize();	
			sTipoFuente=FuncionesSwing.getTipoFuente(jButton.getFont().getName(),jInternalFrameBase,null);
					
			font=new Font(sTipoFuente,iStyle,iSize);			
			jButton.setFont(font);
		}
		
		}
	}
	
	public static void setBoldTabbedPane(JTabbedPane jTabbedPane,String sTipo) {		
		FuncionesSwing.setBoldTabbedPane(jTabbedPane,sTipo,false,false,null);
	}
	
	public static void setBoldTabbedPane(JTabbedPane jTabbedPane,String sTipo,Boolean paraTabla,Boolean paraVentanaPrincipal,JInternalFrameBase jInternalFrameBase) {
		
		if(puedeCambiarFormato(jInternalFrameBase,paraTabla,paraVentanaPrincipal,sTipo)) {
					
		int iSize=0;//jLabel.getFont().getSize();
		Font font=null;
		String sTipoFuente="";
		
		int iStyle=Font.PLAIN;
  		
		
		if(!paraTabla) {
			iStyle=Font.BOLD;
		} else {
			iStyle=Font.PLAIN;
		}
		
		if(jInternalFrameBase!=null && !jInternalFrameBase.getConTipoTamanioManual()) {
			
			if(sTipo.equals("NORMAL")) {
				jTabbedPane.putClientProperty("JComponent.sizeVariant", "regular");
				
			} else if(sTipo.equals("MEDIO")) {
				jTabbedPane.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(sTipo.equals("PEQUENO")) {
				jTabbedPane.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(sTipo.equals("GRANDE")) {
				jTabbedPane.putClientProperty("JComponent.sizeVariant", "large");
				
			} else if(sTipo.equals("MINIMO")) {
				jTabbedPane.putClientProperty("JComponent.sizeVariant", "mini");
				
			} else if(sTipo.equals("MAXIMO")) {
				jTabbedPane.putClientProperty("JComponent.sizeVariant", "large");
			}
			
			
			if(!sTipo.equals("NINGUNO")) {
				
				jTabbedPane.updateUI();
				
				iSize=jTabbedPane.getFont().getSize();	
				sTipoFuente=FuncionesSwing.getTipoFuente(jTabbedPane.getFont().getName(),jInternalFrameBase,null);
						
				font=new Font(sTipoFuente,iStyle,iSize);			
				jTabbedPane.setFont(font);
							
				
				//jTabbedPane.setBackground(Color.RED);
				//jTabbedPane.setForeground(Color.RED);
				
				if(jTabbedPane.getBorder().getClass().equals(TitledBorder.class)) {					
					((javax.swing.border.TitledBorder)jTabbedPane.getBorder()).setTitleFont(font);
					((javax.swing.border.TitledBorder)jTabbedPane.getBorder()).setTitleColor(Color.BLUE);
				}
				
				/*
				for( int i = 0; i < jTabbedPane.getComponentCount(); i++)
			    {
					jTabbedPane.setForegroundAt(i, Color.RED);
					jTabbedPane.setBackgroundAt(i, Color.BLACK);
			    }
				*/	
			}
			
		} else {
			iSize=jTabbedPane.getFont().getSize();
			
			if(sTipo.equals("NORMAL")) {
				iSize=12;
				
			} else {
	
				if(sTipo.equals("MINIMO")) {		
					iSize=8;
					
				} else if(sTipo.equals("MEDIO")) {			
					iSize=12;
					
					//System.out.println(jButton.getMinimumSize().getWidth());
					//System.out.println(jButton.getMinimumSize().getHeight());
													
					/*
					int iWidth=30;
					int iHeight=20;
					jTabbedPane.setMinimumSize(new Dimension(iWidth,iHeight));
					jTabbedPane.setMaximumSize(new Dimension(iWidth,iHeight));
					jTabbedPane.setPreferredSize(new Dimension(iWidth,iHeight));
					*/
	
				} else if(sTipo.equals("GRANDE")) {
					iSize=20;
				}
			}
			
			
			//iSize=jTabbedPane.getFont().getSize();	
			sTipoFuente=FuncionesSwing.getTipoFuente(jTabbedPane.getFont().getName(),jInternalFrameBase,null);
					
			font=new Font(sTipoFuente,iStyle,iSize);			
			jTabbedPane.setFont(font);
		}
		
		}
	}

	public static void setBoldToolBar(JToolBar jToolBar,String sTipo) {		
		FuncionesSwing.setBoldToolBar(jToolBar,sTipo,false,false,null);
	}
	
	public static void setBoldToolBar(JToolBar jToolBar,String sTipo,Boolean paraTabla,Boolean paraVentanaPrincipal,JInternalFrameBase jInternalFrameBase) {
		
		if(puedeCambiarFormato(jInternalFrameBase,paraTabla,paraVentanaPrincipal,sTipo)) {
					
		int iSize=0;//jLabel.getFont().getSize();
		Font font=null;
		String sTipoFuente="";
		
		int iStyle=Font.PLAIN;
  		
		
		if(!paraTabla) {
			iStyle=Font.BOLD;
		} else {
			iStyle=Font.PLAIN;
		}
		
		if(jInternalFrameBase!=null && !jInternalFrameBase.getConTipoTamanioManual()) {
			if(sTipo.equals("NORMAL")) {
				jToolBar.putClientProperty("JComponent.sizeVariant", "regular");
				
			} else if(sTipo.equals("MEDIO")) {
				jToolBar.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(sTipo.equals("PEQUENO")) {
				jToolBar.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(sTipo.equals("GRANDE")) {
				jToolBar.putClientProperty("JComponent.sizeVariant", "large");
				
			} else if(sTipo.equals("MINIMO")) {
				jToolBar.putClientProperty("JComponent.sizeVariant", "mini");
				
			} else if(sTipo.equals("MAXIMO")) {
				jToolBar.putClientProperty("JComponent.sizeVariant", "large");
			}
			
			
			if(!sTipo.equals("NINGUNO")) {
				
				jToolBar.updateUI();
				
				iSize=jToolBar.getFont().getSize();	
				sTipoFuente=FuncionesSwing.getTipoFuente(jToolBar.getFont().getName(),jInternalFrameBase,null);
						
				font=new Font(sTipoFuente,iStyle,iSize);			
				jToolBar.setFont(font);
							
			}
			
		} else {
			iSize=jToolBar.getFont().getSize();	
			sTipoFuente=FuncionesSwing.getTipoFuente(jToolBar.getFont().getName(),jInternalFrameBase,null);
					
			font=new Font(sTipoFuente,iStyle,iSize);			
			jToolBar.setFont(font);
		}
		
		}
	}

	public static void setBoldMenuBar(JMenuBar jMenuBar,String sTipo) {		
		FuncionesSwing.setBoldMenuBar(jMenuBar,sTipo,false,false,null);
	}
	
	public static void setBoldMenuBar(JMenuBar jMenuBar,String sTipo,Boolean paraTabla,Boolean paraVentanaPrincipal,JInternalFrameBase jInternalFrameBase) {
		
		if(puedeCambiarFormato(jInternalFrameBase,paraTabla,paraVentanaPrincipal,sTipo)) {
		
		int iSize=0;//jLabel.getFont().getSize();
		Font font=null;
		String sTipoFuente="";
		
		int iStyle=Font.PLAIN;
  		
		/*
		if(!paraTabla) {
			iStyle=Font.BOLD;
		} else {
			iStyle=Font.PLAIN;
		}
		*/
		
		if(jInternalFrameBase!=null && !jInternalFrameBase.getConTipoTamanioManual()) {
			/*
			if(sTipo.equals("NORMAL")) {
				jMenuBar.putClientProperty("JComponent.sizeVariant", "regular");
				
			} else if(sTipo.equals("MEDIO")) {
				jMenuBar.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(sTipo.equals("PEQUENO")) {
				jMenuBar.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(sTipo.equals("GRANDE")) {
				jMenuBar.putClientProperty("JComponent.sizeVariant", "large");
				
			} else if(sTipo.equals("MINIMO")) {
				jMenuBar.putClientProperty("JComponent.sizeVariant", "mini");
				
			} else if(sTipo.equals("MAXIMO")) {
				jMenuBar.putClientProperty("JComponent.sizeVariant", "large");
			}
			*/
			
			if(sTipo.equals("GRANDE")) {
				jMenuBar.putClientProperty("JComponent.sizeVariant", "large");
				
			} else if(sTipo.equals("MAXIMO")) {
				jMenuBar.putClientProperty("JComponent.sizeVariant", "large");
				
			} else if(sTipo.equals("GRANDE")) {
				jMenuBar.putClientProperty("JComponent.sizeVariant", "large");
				
			} 
			
			if(!sTipo.equals("NINGUNO")) {
				
				jMenuBar.updateUI();
				
				iSize=jMenuBar.getFont().getSize();	
				sTipoFuente=FuncionesSwing.getTipoFuente(jMenuBar.getFont().getName(),jInternalFrameBase,null);
						
				font=new Font(sTipoFuente,iStyle,iSize);			
				jMenuBar.setFont(font);
								
			}
			
		} else {
			
			iSize=jMenuBar.getFont().getSize();	
			sTipoFuente=FuncionesSwing.getTipoFuente(jMenuBar.getFont().getName(),jInternalFrameBase,null);
					
			font=new Font(sTipoFuente,iStyle,iSize);			
			jMenuBar.setFont(font);
			
		}
		
		}
	}

	public static void setBoldMenu(JMenu jMenu,String sTipo) {		
		FuncionesSwing.setBoldMenu(jMenu,sTipo,false,false,null);
	}
	
	public static void setBoldMenu(JMenu jMenu,String sTipo,Boolean paraTabla,Boolean paraVentanaPrincipal,JInternalFrameBase jInternalFrameBase) {
		
		if(puedeCambiarFormato(jInternalFrameBase,paraTabla,paraVentanaPrincipal,sTipo)) {
		
		int iSize=0;//jLabel.getFont().getSize();
		Font font=null;
		String sTipoFuente="";
		
		int iStyle=Font.PLAIN;
  		
		/*
		if(!paraTabla) {
			iStyle=Font.BOLD;
		} else {
			iStyle=Font.PLAIN;
		}
		*/
		
		if(jInternalFrameBase!=null && !jInternalFrameBase.getConTipoTamanioManual()) {
			/*
			if(sTipo.equals("NORMAL")) {
				jMenu.putClientProperty("JComponent.sizeVariant", "regular");
				
			} else if(sTipo.equals("MEDIO")) {
				jMenu.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(sTipo.equals("PEQUENO")) {
				jMenu.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(sTipo.equals("GRANDE")) {
				jMenu.putClientProperty("JComponent.sizeVariant", "large");
				
			} else if(sTipo.equals("MINIMO")) {
				jMenu.putClientProperty("JComponent.sizeVariant", "mini");
				
			} else if(sTipo.equals("MAXIMO")) {
				jMenu.putClientProperty("JComponent.sizeVariant", "large");
			}
			*/
			
			if(sTipo.equals("GRANDE")) {
				jMenu.putClientProperty("JComponent.sizeVariant", "large");
				
			} else if(sTipo.equals("MAXIMO")) {
				jMenu.putClientProperty("JComponent.sizeVariant", "large");
				
			} else if(sTipo.equals("MINIMO")) {
				jMenu.putClientProperty("JComponent.sizeVariant", "mini");
				
			} 
			
			if(!sTipo.equals("NINGUNO")) {
				
				jMenu.updateUI();
				
				iSize=jMenu.getFont().getSize();	
				sTipoFuente=FuncionesSwing.getTipoFuente(jMenu.getFont().getName(),jInternalFrameBase,null);
						
				font=new Font(sTipoFuente,iStyle,iSize);			
				jMenu.setFont(font);
							
			}
			
		} else {
			
			iSize=jMenu.getFont().getSize();	
			sTipoFuente=FuncionesSwing.getTipoFuente(jMenu.getFont().getName(),jInternalFrameBase,null);
					
			font=new Font(sTipoFuente,iStyle,iSize);			
			jMenu.setFont(font);
			
		}
		
		}
	}

	public static void setBoldMenuItem(JMenuItem jMenuItem,String sTipo) {		
		FuncionesSwing.setBoldMenuItem(jMenuItem,sTipo,false,false,null);
	}
	
	public static void setBoldMenuItem(JMenuItem jMenuItem,String sTipo,Boolean paraTabla,Boolean paraVentanaPrincipal,JInternalFrameBase jInternalFrameBase) {
		if(puedeCambiarFormato(jInternalFrameBase,paraTabla,paraVentanaPrincipal,sTipo)) {
		
		int iSize=0;//jLabel.getFont().getSize();
		Font font=null;
		String sTipoFuente="";
		
		int iStyle=Font.PLAIN;
  		
		/*
		if(!paraTabla) {
			iStyle=Font.BOLD;
		} else {
			iStyle=Font.PLAIN;
		}
		*/
		
		if(jInternalFrameBase!=null && !jInternalFrameBase.getConTipoTamanioManual()) {
			/*
			if(sTipo.equals("NORMAL")) {
				jMenuItem.putClientProperty("JComponent.sizeVariant", "regular");
				
			} else if(sTipo.equals("MEDIO")) {
				jMenuItem.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(sTipo.equals("PEQUENO")) {
				jMenuItem.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(sTipo.equals("GRANDE")) {
				jMenuItem.putClientProperty("JComponent.sizeVariant", "large");
				
			} else if(sTipo.equals("MINIMO")) {
				jMenuItem.putClientProperty("JComponent.sizeVariant", "mini");
				
			} else if(sTipo.equals("MAXIMO")) {
				jMenuItem.putClientProperty("JComponent.sizeVariant", "large");
			}
			*/
			
			if(sTipo.equals("GRANDE")) {
				jMenuItem.putClientProperty("JComponent.sizeVariant", "large");
				
			} else if(sTipo.equals("MAXIMO")) {
				jMenuItem.putClientProperty("JComponent.sizeVariant", "large");
				
			} else if(sTipo.equals("MINIMO")) {
				jMenuItem.putClientProperty("JComponent.sizeVariant", "mini");
				
			} 
			
			if(!sTipo.equals("NINGUNO")) {
				
				jMenuItem.updateUI();
				
				iSize=jMenuItem.getFont().getSize();	
				sTipoFuente=FuncionesSwing.getTipoFuente(jMenuItem.getFont().getName(),jInternalFrameBase,null);
						
				font=new Font(sTipoFuente,iStyle,iSize);			
				jMenuItem.setFont(font);
							
			}
			
		} else {
			
			iSize=jMenuItem.getFont().getSize();	
			sTipoFuente=FuncionesSwing.getTipoFuente(jMenuItem.getFont().getName(),jInternalFrameBase,null);
					
			font=new Font(sTipoFuente,iStyle,iSize);			
			jMenuItem.setFont(font);
			
		}
		
		}
	}

	public static void setBoldPanel(JPanel jPanel,String sTipo) {		
		FuncionesSwing.setBoldPanel(jPanel,sTipo,false,false,null);
	}
	
	public static void setBoldPanel(JPanel jPanel,String sTipo,Boolean paraTabla,Boolean paraVentanaPrincipal,JInternalFrameBase jInternalFrameBase) {
		
		if(puedeCambiarFormato(jInternalFrameBase,paraTabla,paraVentanaPrincipal,sTipo)) {
		
		int iSize=0;//jLabel.getFont().getSize();
		Font font=null;
		String sTipoFuente="";
		
		int iStyle=Font.PLAIN;
  		
		
		if(!paraTabla) {
			iStyle=Font.BOLD;
		} else {
			iStyle=Font.PLAIN;
		}
		
		if(jInternalFrameBase!=null && !jInternalFrameBase.getConTipoTamanioManual()) {
			if(sTipo.equals("NORMAL")) {
				jPanel.putClientProperty("JComponent.sizeVariant", "regular");
				
			} else if(sTipo.equals("MEDIO")) {
				jPanel.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(sTipo.equals("PEQUENO")) {
				jPanel.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(sTipo.equals("GRANDE")) {
				jPanel.putClientProperty("JComponent.sizeVariant", "large");
				
			} else if(sTipo.equals("MINIMO")) {
				jPanel.putClientProperty("JComponent.sizeVariant", "mini");
				
			} else if(sTipo.equals("MAXIMO")) {
				jPanel.putClientProperty("JComponent.sizeVariant", "large");
			}
			
			
			if(!sTipo.equals("NINGUNO")) {
				
				jPanel.updateUI();
				
				iSize=jPanel.getFont().getSize();	
				sTipoFuente=FuncionesSwing.getTipoFuente(jPanel.getFont().getName(),jInternalFrameBase,null);
						
				font=new Font(sTipoFuente,iStyle,iSize);			
				jPanel.setFont(font);
				//jPanel.setForeground(Color.BLUE);
				
				if(jPanel.getBorder()!= null && jPanel.getBorder().getClass().equals(TitledBorder.class)) {					
					((javax.swing.border.TitledBorder)jPanel.getBorder()).setTitleFont(font);
					((javax.swing.border.TitledBorder)jPanel.getBorder()).setTitleColor(Color.BLUE);
				}
				
			}
			
		} else {
			iSize=jPanel.getFont().getSize();
			
			if(sTipo.equals("NORMAL")) {
				iSize=12;
				
			} else {
	
				if(sTipo.equals("MINIMO")) {		
					iSize=8;
					
				} else if(sTipo.equals("MEDIO")) {			
					iSize=11;
					
					//jPanel.setMinimumSize(new Dimension((int)jPanel.getMinimumSize().getWidth(),24));
					//jPanel.setMaximumSize(new Dimension((int)jPanel.getMaximumSize().getWidth(),24));
					//jPanel.setPreferredSize(new Dimension((int)jPanel.getPreferredSize().getWidth(),24));
	
				} else if(sTipo.equals("GRANDE")) {
					iSize=20;
				}
			}
			
			
			//iSize=jPanel.getFont().getSize();	
			sTipoFuente=FuncionesSwing.getTipoFuente(jPanel.getFont().getName(),jInternalFrameBase,null);
					
			font=new Font(sTipoFuente,iStyle,iSize);			
			jPanel.setFont(font);
			jPanel.setForeground(Color.BLUE);
		}
		
		}
	}

	public static void setBoldScrollPanel(JScrollPane jScrollPane,String sTipo) {		
		FuncionesSwing.setBoldScrollPanel(jScrollPane,sTipo,false,false,null);
	}
	
	public static void setBoldScrollPanel(JScrollPane jScrollPane,String sTipo,Boolean paraTabla,Boolean paraVentanaPrincipal,JInternalFrameBase jInternalFrameBase) {
		
		if(puedeCambiarFormato(jInternalFrameBase,paraTabla,paraVentanaPrincipal,sTipo)) {
		
		int iSize=0;//jLabel.getFont().getSize();
		Font font=null;
		String sTipoFuente="";
		
		int iStyle=Font.PLAIN;
  		
		
		if(!paraTabla) {
			iStyle=Font.BOLD;
		} else {
			iStyle=Font.PLAIN;
		}
		
		if(jInternalFrameBase!=null && !jInternalFrameBase.getConTipoTamanioManual()) {
			if(sTipo.equals("NORMAL")) {
				jScrollPane.putClientProperty("JComponent.sizeVariant", "regular");
				
			} else if(sTipo.equals("MEDIO")) {
				jScrollPane.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(sTipo.equals("PEQUENO")) {
				jScrollPane.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(sTipo.equals("GRANDE")) {
				jScrollPane.putClientProperty("JComponent.sizeVariant", "large");
				
			} else if(sTipo.equals("MINIMO")) {
				jScrollPane.putClientProperty("JComponent.sizeVariant", "mini");
				
			} else if(sTipo.equals("MAXIMO")) {
				jScrollPane.putClientProperty("JComponent.sizeVariant", "large");
			}
			
			
			if(!sTipo.equals("NINGUNO")) {
				
				jScrollPane.updateUI();
				
				iSize=jScrollPane.getFont().getSize();	
				sTipoFuente=FuncionesSwing.getTipoFuente(jScrollPane.getFont().getName(),jInternalFrameBase,null);
						
				font=new Font(sTipoFuente,iStyle,iSize);			
				jScrollPane.setFont(font);				
				//jScrollPane.setForeground(Color.BLUE);
				
				if(jScrollPane.getBorder()!=null && jScrollPane.getBorder().getClass().equals(TitledBorder.class)) {					
					((javax.swing.border.TitledBorder)jScrollPane.getBorder()).setTitleFont(font);
					((javax.swing.border.TitledBorder)jScrollPane.getBorder()).setTitleColor(Color.BLUE);
				}
			}
			
		} else {
			iSize=jScrollPane.getFont().getSize();
			
			if(sTipo.equals("NORMAL")) {
				iSize=12;
				
			} else {
	
				if(sTipo.equals("MINIMO")) {		
					iSize=8;
					
				} else if(sTipo.equals("MEDIO")) {			
					iSize=11;
					
					//jPanel.setMinimumSize(new Dimension((int)jPanel.getMinimumSize().getWidth(),24));
					//jPanel.setMaximumSize(new Dimension((int)jPanel.getMaximumSize().getWidth(),24));
					//jPanel.setPreferredSize(new Dimension((int)jPanel.getPreferredSize().getWidth(),24));
	
				} else if(sTipo.equals("GRANDE")) {
					iSize=20;
				}
			}
			
			
			//iSize=jScrollPane.getFont().getSize();	
			sTipoFuente=FuncionesSwing.getTipoFuente(jScrollPane.getFont().getName(),jInternalFrameBase,null);
					
			font=new Font(sTipoFuente,iStyle,iSize);			
			jScrollPane.setFont(font);
		}
		
		}
	}
	
	public static void setBoldTable(JTable jtable,String sTipo) {		
		FuncionesSwing.setBoldTable(jtable,sTipo,false,false,null);
	}
	
	public static void setBoldTable(JTable jtable,String sTipo,Boolean paraTabla,Boolean paraVentanaPrincipal,JInternalFrameBase jInternalFrameBase) {
		
		if(puedeCambiarFormato(jInternalFrameBase,paraTabla,paraVentanaPrincipal,sTipo)) {
		
		int iSize=0;//jLabel.getFont().getSize();
		Font font=null;
		String sTipoFuente="";
		
		int iStyle=Font.PLAIN;
  		
		
		if(!paraTabla) {
			iStyle=Font.BOLD;
		} else {
			iStyle=Font.PLAIN;
		}
		
		if(jInternalFrameBase!=null && !jInternalFrameBase.getConTipoTamanioManual()) {
			if(sTipo.equals("NORMAL")) {
				jtable.putClientProperty("JComponent.sizeVariant", "regular");
				
			} else if(sTipo.equals("MEDIO")) {
				jtable.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(sTipo.equals("PEQUENO")) {
				jtable.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(sTipo.equals("GRANDE")) {
				jtable.putClientProperty("JComponent.sizeVariant", "large");
				
			} else if(sTipo.equals("MINIMO")) {
				jtable.putClientProperty("JComponent.sizeVariant", "mini");
				
			} else if(sTipo.equals("MAXIMO")) {
				jtable.putClientProperty("JComponent.sizeVariant", "large");
			}
			
			
			if(!sTipo.equals("NINGUNO")) {
				
				jtable.updateUI();
				
				iSize=jtable.getFont().getSize();	
				sTipoFuente=FuncionesSwing.getTipoFuente(jtable.getFont().getName(),jInternalFrameBase,null);
						
				font=new Font(sTipoFuente,iStyle,iSize);			
				jtable.setFont(font);
								
			}
			
		} else {
			iSize=jtable.getFont().getSize();
			
			if(sTipo.equals("NORMAL")) {
				iSize=12;
				
			} else {
	
				if(sTipo.equals("MINIMO")) {		
					iSize=8;
					
				} else if(sTipo.equals("MEDIO")) {			
					iSize=10;
					
					/*
					jtable.setMinimumSize(new Dimension((int)jtable.getMinimumSize().getWidth(),20));
					jtable.setMaximumSize(new Dimension((int)jtable.getMaximumSize().getWidth(),20));
					jtable.setPreferredSize(new Dimension((int)jtable.getPreferredSize().getWidth(),20));
					*/
				} else if(sTipo.equals("GRANDE")) {
					iSize=20;
				}
			}
			
			
			//iSize=jtable.getFont().getSize();	
			sTipoFuente=FuncionesSwing.getTipoFuente(jtable.getFont().getName(),jInternalFrameBase,null);
					
			font=new Font(sTipoFuente,iStyle,iSize);			
			jtable.setFont(font);
			
			jtable.getTableHeader().setFont(font);
		}	
		
		}
	}
	
	public static void setBoldFile(JFileChooser jFileChooser,String sTipo) {		
		FuncionesSwing.setBoldFile(jFileChooser,sTipo,false,false,null);
	}
	
	public static void setBoldFile(JFileChooser jFileChooser,String sTipo,Boolean paraTabla,Boolean paraVentanaPrincipal,JInternalFrameBase jInternalFrameBase) {
	
		if(puedeCambiarFormato(jInternalFrameBase,paraTabla,paraVentanaPrincipal,sTipo)) {
		
		int iSize=0;//jLabel.getFont().getSize();
		Font font=null;
		String sTipoFuente="";
		
		int iStyle=Font.PLAIN;
  		
		
		if(!paraTabla) {
			iStyle=Font.BOLD;
		} else {
			iStyle=Font.PLAIN;
		}
		
		if(jInternalFrameBase!=null && !jInternalFrameBase.getConTipoTamanioManual()) {
			if(sTipo.equals("NORMAL")) {
				jFileChooser.putClientProperty("JComponent.sizeVariant", "regular");
				
			} else if(sTipo.equals("MEDIO")) {
				jFileChooser.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(sTipo.equals("PEQUENO")) {
				jFileChooser.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(sTipo.equals("GRANDE")) {
				jFileChooser.putClientProperty("JComponent.sizeVariant", "large");
				
			} else if(sTipo.equals("MINIMO")) {
				jFileChooser.putClientProperty("JComponent.sizeVariant", "mini");
				
			} else if(sTipo.equals("MAXIMO")) {
				jFileChooser.putClientProperty("JComponent.sizeVariant", "large");
			}
			
			
			if(!sTipo.equals("NINGUNO")) {
				
				jFileChooser.updateUI();
				
				iSize=jFileChooser.getFont().getSize();	
				sTipoFuente=FuncionesSwing.getTipoFuente(jFileChooser.getFont().getName(),jInternalFrameBase,null);
						
				font=new Font(sTipoFuente,iStyle,iSize);			
				jFileChooser.setFont(font);
								
			}
			
		} else {
			
			iSize=jFileChooser.getFont().getSize();	
			sTipoFuente=FuncionesSwing.getTipoFuente(jFileChooser.getFont().getName(),jInternalFrameBase,null);
					
			font=new Font(sTipoFuente,iStyle,iSize);			
			jFileChooser.setFont(font);
			
		}
		
		}
	}
	
	public static void setBoldDate(JDateChooser jDateChooser,String sTipo)  {		
		FuncionesSwing.setBoldDate(jDateChooser,sTipo,false,false,null);
	}
	
	public static void setBoldDate(JDateChooser jDateChooser,String sTipo,Boolean paraTabla,Boolean paraVentanaPrincipal,JInternalFrameBase jInternalFrameBase) {
		
		if(puedeCambiarFormato(jInternalFrameBase,paraTabla,paraVentanaPrincipal,sTipo)) {
		
		int iSize=0;//jLabel.getFont().getSize();
		Font font=null;
		String sTipoFuente="";
		
		int iStyle=Font.PLAIN;
  		
		
		if(!paraTabla) {
			iStyle=Font.BOLD;
		} else {
			iStyle=Font.PLAIN;
		}
		
		if(jInternalFrameBase!=null && !jInternalFrameBase.getConTipoTamanioManual()) {
			if(sTipo.equals("NORMAL")) {
				jDateChooser.putClientProperty("JComponent.sizeVariant", "regular");
				
			} else if(sTipo.equals("MEDIO")) {
				jDateChooser.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(sTipo.equals("PEQUENO")) {
				jDateChooser.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(sTipo.equals("GRANDE")) {
				jDateChooser.putClientProperty("JComponent.sizeVariant", "large");
				
			} else if(sTipo.equals("MINIMO")) {
				jDateChooser.putClientProperty("JComponent.sizeVariant", "mini");
				
			} else if(sTipo.equals("MAXIMO")) {
				jDateChooser.putClientProperty("JComponent.sizeVariant", "large");
			}
			
			
			if(!sTipo.equals("NINGUNO")) {
				
				jDateChooser.updateUI();
				
				iSize=jDateChooser.getFont().getSize();	
				sTipoFuente=FuncionesSwing.getTipoFuente(jDateChooser.getFont().getName(),jInternalFrameBase,null);
						
				font=new Font(sTipoFuente,iStyle,iSize);			
				jDateChooser.setFont(font);
								
			}
			
		} else {
			
			iSize=jDateChooser.getFont().getSize();	
			sTipoFuente=FuncionesSwing.getTipoFuente(jDateChooser.getFont().getName(),jInternalFrameBase,null);
					
			font=new Font(sTipoFuente,iStyle,iSize);			
			jDateChooser.setFont(font);
			
		}
		
		}
	}

	public static void setBoldHora(JSpinner jSpinner,String sTipo)  {		
		FuncionesSwing.setBoldHora(jSpinner,sTipo,false,false,null);
	}
	
	public static void setBoldHora(JSpinner jSpinner,String sTipo,Boolean paraTabla,Boolean paraVentanaPrincipal,JInternalFrameBase jInternalFrameBase) {
		
		if(puedeCambiarFormato(jInternalFrameBase,paraTabla,paraVentanaPrincipal,sTipo)) {
		
		int iSize=0;//jLabel.getFont().getSize();
		Font font=null;
		String sTipoFuente="";
		
		int iStyle=Font.PLAIN;
  		
		
		if(!paraTabla) {
			iStyle=Font.BOLD;
		} else {
			iStyle=Font.PLAIN;
		}
		
		if(jInternalFrameBase!=null && !jInternalFrameBase.getConTipoTamanioManual()) {
			if(sTipo.equals("NORMAL")) {
				jSpinner.putClientProperty("JComponent.sizeVariant", "regular");
				
			} else if(sTipo.equals("MEDIO")) {
				jSpinner.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(sTipo.equals("PEQUENO")) {
				jSpinner.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(sTipo.equals("GRANDE")) {
				jSpinner.putClientProperty("JComponent.sizeVariant", "large");
				
			} else if(sTipo.equals("MINIMO")) {
				jSpinner.putClientProperty("JComponent.sizeVariant", "mini");
				
			} else if(sTipo.equals("MAXIMO")) {
				jSpinner.putClientProperty("JComponent.sizeVariant", "large");
			}
			
			
			if(!sTipo.equals("NINGUNO")) {
				
				jSpinner.updateUI();
				
				iSize=jSpinner.getFont().getSize();	
				sTipoFuente=FuncionesSwing.getTipoFuente(jSpinner.getFont().getName(),jInternalFrameBase,null);
						
				font=new Font(sTipoFuente,iStyle,iSize);			
				jSpinner.setFont(font);
								
			}
			
		} else {
			
			iSize=jSpinner.getFont().getSize();	
			sTipoFuente=FuncionesSwing.getTipoFuente(jSpinner.getFont().getName(),jInternalFrameBase,null);
					
			font=new Font(sTipoFuente,iStyle,iSize);			
			jSpinner.setFont(font);
			
		}
		
		}
	}

	public static void setBoldInternalFrama(JInternalFrameBase jInternalFrameBase,String sTipo,Boolean paraTabla,Boolean paraVentanaPrincipal) {
	
		if(puedeCambiarFormato(jInternalFrameBase,paraTabla,paraVentanaPrincipal,sTipo)) {
		
		int iSize=0;//jLabel.getFont().getSize();
		Font font=null;
		String sTipoFuente="";
		
		int iStyle=Font.PLAIN;
  		
		
		if(!paraTabla) {
			iStyle=Font.BOLD;
		} else {
			iStyle=Font.PLAIN;
		}
		
		if(true/*&& !jInternalFrameBase.getConTipoTamanioManual()*/) {
			/*
			if(sTipo.equals("NORMAL")) {
				jInternalFrameBase.putClientProperty("JComponent.sizeVariant", "regular");
				
			} else if(sTipo.equals("MEDIO")) {
				jInternalFrameBase.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(sTipo.equals("PEQUENO")) {
				jInternalFrameBase.putClientProperty("JComponent.sizeVariant", "small");
				
			} else if(sTipo.equals("GRANDE")) {
				jInternalFrameBase.putClientProperty("JComponent.sizeVariant", "large");
				
			} else if(sTipo.equals("MINIMO")) {
				jInternalFrameBase.putClientProperty("JComponent.sizeVariant", "mini");
				
			} else if(sTipo.equals("MAXIMO")) {
				jInternalFrameBase.putClientProperty("JComponent.sizeVariant", "large");
			}
			*/
			
			if(!sTipo.equals("NINGUNO")) {
				
				jInternalFrameBase.updateUI();
				
				iSize=jInternalFrameBase.getFont().getSize();	
				sTipoFuente=FuncionesSwing.getTipoFuente(jInternalFrameBase.getFont().getName(),jInternalFrameBase,null);
						
				font=new Font(sTipoFuente,iStyle,iSize);			
				jInternalFrameBase.setFont(font);
								
				if(jInternalFrameBase.getBorder().getClass().equals(TitledBorder.class)) {					
					((javax.swing.border.TitledBorder)jInternalFrameBase.getBorder()).setTitleFont(font);
				}
				
			}
			
		} else {
			iSize=jInternalFrameBase.getFont().getSize();
			
			if(sTipo.equals("NORMAL")) {
				iSize=12;
				
			} else {
	
				if(sTipo.equals("MINIMO")) {		
					iSize=8;
					
				} else if(sTipo.equals("MEDIO")) {			
					iSize=11;
					
					//jPanel.setMinimumSize(new Dimension((int)jPanel.getMinimumSize().getWidth(),24));
					//jPanel.setMaximumSize(new Dimension((int)jPanel.getMaximumSize().getWidth(),24));
					//jPanel.setPreferredSize(new Dimension((int)jPanel.getPreferredSize().getWidth(),24));
	
				} else if(sTipo.equals("GRANDE")) {
					iSize=20;
				}
			}
			
			
			//iSize=jPanel.getFont().getSize();	
			sTipoFuente=FuncionesSwing.getTipoFuente(jInternalFrameBase.getFont().getName(),jInternalFrameBase,null);
					
			font=new Font(sTipoFuente,iStyle,iSize);			
			jInternalFrameBase.setFont(font);
		}
		
		}
	}
	
	public static Color getColorTextFields(String sType) {
		Color color=new Color(255,255,224);
		
		switch (sType) {
		
			case "amarillo":
				color=new Color(255,255,224);
				break;
				
			case "blanco":
				color=new Color(255,255,255);
				break;
				
			case "azul":
				//color=new Color(240,248,255);
				//color=new Color(172,209,233);
				color=new Color(220,240,247);
				
				break;
				
			case "negro":
				color=new Color(211,211,211);
				break;
				
			default:
				color=new Color(255,255,224);
				break;
		}
		return color;
	}
	
	public static String getFondoImagen(Long idTipoFondo) {
		String sNombreImagenFondo="fondo_formulario";
		Integer iIdTipoFondo=idTipoFondo.intValue();
		
		switch(iIdTipoFondo) {
			case 1:
				sNombreImagenFondo="fondo_formulario";
				break;
				
			case 2:
				sNombreImagenFondo="fondo_cabecera";
				break;
			
			case 3:
				sNombreImagenFondo="fondo_titulo";
				break;
			
			case 4:
				sNombreImagenFondo="fondo_contenido";
				break;
			default:
				sNombreImagenFondo="fondo_formulario";
				break;			
		}
		
		return sNombreImagenFondo;
	}
	
	public static String getFondoControl(Long idTipoFondo) {
		String sNombreImagenFondo="amarillo";
		Integer iIdTipoFondo=idTipoFondo.intValue();
		
		switch(iIdTipoFondo) {
			case 1:
				sNombreImagenFondo="amarillo";
				break;
				
			case 2:
				sNombreImagenFondo="blanco";
				break;
			
			case 3:
				sNombreImagenFondo="azul";
				break;
			
			case 4:
				sNombreImagenFondo="negro";
				break;
			default:
				sNombreImagenFondo="amarillo";
				break;			
		}
		
		return sNombreImagenFondo;
	}
	
	public static String getTipoTamanioControl(Long idTipoFondo) {
		String sNombreImagenFondo="regular";
		Integer iIdTipoFondo=idTipoFondo.intValue();
		
		switch(iIdTipoFondo) {
			case 1:
				sNombreImagenFondo="amarillo";
				break;
				
			case 2:
				sNombreImagenFondo="large";
				break;
			
			case 3:
				sNombreImagenFondo="small";
				break;
			
			case 4:
				sNombreImagenFondo="mini";
				break;
			default:
				sNombreImagenFondo="regular";
				break;			
		}
		
		return sNombreImagenFondo;
	}
	
	public static Color getColorSelectedForeground() {
		Color color=Color.BLUE;
		
		return color;	
	}
	
	public static Color getColorSelectedBackground() {
		Color color=Color.WHITE;
		
		return color;	
	}
	
	public static int getColorSelectedBackground(String sTipoMensaje) {
		int iTipoMensaje=JOptionPane.INFORMATION_MESSAGE;
		
		switch(sTipoMensaje) {
			case "INFO":
				iTipoMensaje=JOptionPane.INFORMATION_MESSAGE;
				break;
				
			case "ERROR":
				iTipoMensaje=JOptionPane.ERROR_MESSAGE;
				break;
				
			case "ADVER":
				iTipoMensaje=JOptionPane.WARNING_MESSAGE;
				break;
		}
		
		return iTipoMensaje;	
	}
	
	@SuppressWarnings({ "rawtypes"})
	public static void adjustPopupWidthComboBox(JComboBox jComboBox) {
		 
		 //if (jComboBox.getItemCount() == 0) return;
		 
	     Object objectChild = jComboBox.getUI().getAccessibleChild(jComboBox, 0);
	     
	     if (!(objectChild instanceof JPopupMenu)) {
	        return;
	     }
	     
	     JPopupMenu jpopupMenu = (JPopupMenu) objectChild;
	     
	     JScrollPane scrollPane = (JScrollPane) jpopupMenu.getComponent(0);
	     
	     scrollPane.setHorizontalScrollBar(new JScrollBar(JScrollBar.HORIZONTAL));
	     scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	}
	
	public static int getValorProporcion(Integer iValorInicial,Integer iPorcentajeProporcion) {
		Double dValorProporcion=iValorInicial.doubleValue();
		Double dFactorPorcentaje=(iPorcentajeProporcion.doubleValue() / 100.0); 
		
		dValorProporcion=iValorInicial * dFactorPorcentaje;
		
		Integer iValorProporcionFinal=dValorProporcion.intValue();
		
		return iValorProporcionFinal;
	}
	
	public static Color getColorGeneral(Long id_color_general) {
		Color color=Color.WHITE;
		Integer iColorGeneral=id_color_general.intValue();
		
		switch(iColorGeneral) {
			case 1:
				color=Color.YELLOW;
				break;
				
			case 2:
				color=Color.BLUE;
				break;
				
			case 3:
				color=Color.RED;
				break;
				
			case 4:
				color=Color.WHITE;
				break;
			
			case 5:
				color=Color.BLACK;
				break;
				
			case 6:
				color=Color.GREEN;
				break;
				
			default:
				color=Color.YELLOW;
				break;			
		}
		
		return color;
	}
	
	 public static byte[] getBytesFromFile( File file) {
	   	FileInputStream fileInputStream=null;
	 
	      
	        byte[] bFile = new byte[(int) file.length()];
	 
	        try {
	            //convert file into array of bytes
		    fileInputStream = new FileInputStream(file);
		    fileInputStream.read(bFile);
		    fileInputStream.close();
	 
		    /*
		    for (int i = 0; i < bFile.length; i++) {
		       	System.out.print((char)bFile[i]);
	        }
	        */
	 
		    //System.out.println("Done");
	        }catch(Exception e){
	        	e.printStackTrace();
	        }
	        
	        return bFile;
	    }
	 
	 public static BufferedImage getImageFromBytes(byte[] bytes){  
		 BufferedImage bufferedImage=null;
	        try {
	            InputStream inputStream = new ByteArrayInputStream(bytes);
	            bufferedImage = ImageIO.read(inputStream);
	        } catch (IOException ex) {
	            System.out.println(ex.getMessage());
	        }
	        return bufferedImage;
	}
	 
	 public static void enableDisablePanels(Boolean isEnable,JTabbedPane jTabbedPaneBusquedas,JPanel jPanelParametrosReportes,JTable jTableDatos,/*JScrollPane jScrollPaneTablaDatos,*/JPanel jPanelCampos,JPanel jPanelPaginacion,/*JScrollPane jScrollPaneDatosEdicion,*/JPanel jPanelAcciones
			 ,JPanel jPanelAccionesFormulario,JMenuBar jMenuBarPrincipal,JMenuBar jMenuBarDetalle,JToolBar jToolBarPrincipal,JToolBar jToolBarDetalle){
		 	
		 JScrollPane jScrollPaneTablaDatos=null;
		 JScrollPane jScrollPaneDatosEdicion=null;
		 
		 FuncionesSwing.enableDisablePanels(isEnable, jTabbedPaneBusquedas, jPanelParametrosReportes, jTableDatos,jScrollPaneTablaDatos, jPanelCampos, jPanelPaginacion, jScrollPaneDatosEdicion, jPanelAcciones, jPanelAccionesFormulario, jMenuBarPrincipal, jMenuBarDetalle, jToolBarPrincipal, jToolBarDetalle);
	 }
	 
	 public static void enableDisablePanels(Boolean isEnable,JTabbedPane jTabbedPaneBusquedas,JPanel jPanelParametrosReportes,JScrollPane jScrollPaneTablaDatos,JPanel jPanelPaginacion,JScrollPane jScrollPaneDatosEdicion,JPanel jPanelAcciones
			 ,JPanel jPanelAccionesFormulario,JMenuBar jMenuBarPrincipal,JMenuBar jMenuBarDetalle,JToolBar jToolBarPrincipal,JToolBar jToolBarDetalle){
		 	
		 JPanel jPanelCampos=null;
		 JTable jTableDatos=null;
		 
		 FuncionesSwing.enableDisablePanels(isEnable, jTabbedPaneBusquedas, jPanelParametrosReportes, jTableDatos,jScrollPaneTablaDatos, jPanelCampos, jPanelPaginacion, jScrollPaneDatosEdicion, jPanelAcciones, jPanelAccionesFormulario, jMenuBarPrincipal, jMenuBarDetalle, jToolBarPrincipal, jToolBarDetalle);
	 }
	 
	 public static void enableDisablePanels(Boolean isEnable,JTabbedPane jTabbedPaneBusquedas,JPanel jPanelParametrosReportes,JTable jTableDatos,JScrollPane jScrollPaneTablaDatos,JPanel jPanelCampos,JPanel jPanelPaginacion,JScrollPane jScrollPaneDatosEdicion,JPanel jPanelAcciones
			 ,JPanel jPanelAccionesFormulario,JMenuBar jMenuBarPrincipal,JMenuBar jMenuBarDetalle,JToolBar jToolBarPrincipal,JToolBar jToolBarDetalle){
			
		 														
			if(jPanelCampos!=null) {
				jPanelCampos.setEnabled(isEnable);
				//FuncionesSwing.enableDisableComponents(jPanelCampos,isEnable,1,5);
			}																																																								
			
		 	
		 	if(jTabbedPaneBusquedas!=null) {
				jTabbedPaneBusquedas.setEnabled(isEnable);
				FuncionesSwing.enableDisableComponents(jTabbedPaneBusquedas,isEnable,1,1);
			}
		 
		 	if(jPanelParametrosReportes!=null) {
				jPanelParametrosReportes.setEnabled(isEnable);
				FuncionesSwing.enableDisableComponents(jPanelParametrosReportes,isEnable,1,3);//,3
			}		
		 	
		 	if(jTableDatos!=null) {
		 		jTableDatos.setEnabled(isEnable);
		 		//FuncionesSwing.enableDisableComponents(jTableDatos,isEnable,1,5);
		 	}
		 	
		 	if(false && jScrollPaneDatosEdicion!=null) {
				jScrollPaneDatosEdicion.setEnabled(isEnable);
				FuncionesSwing.enableDisableComponents(jScrollPaneDatosEdicion,isEnable,1,1);
			}
		 	
		 	if(false && jScrollPaneTablaDatos!=null) {
				jScrollPaneTablaDatos.setEnabled(isEnable);
				FuncionesSwing.enableDisableComponents(jScrollPaneTablaDatos,isEnable,1,1);
			}
				
		 
		 	//NOTA: AQUI ESTAN BOTONOS ACCIONES MAS PAGINACION
		 	if(jPanelPaginacion!=null) {
				jPanelPaginacion.setEnabled(isEnable);
				FuncionesSwing.enableDisableComponents(jPanelPaginacion,isEnable,1,1);
			}
		 
		 	if(jPanelAcciones!=null) {
				jPanelAcciones.setEnabled(isEnable);
				FuncionesSwing.enableDisableComponents(jPanelAcciones,isEnable,1,1);						
			}	
		 	
			if(jPanelAccionesFormulario!=null) {
				jPanelAccionesFormulario.setEnabled(isEnable);
				FuncionesSwing.enableDisableComponents(jPanelAccionesFormulario,isEnable,1,1);						
			}		
			
		 	if(jMenuBarPrincipal!=null) {
				jMenuBarPrincipal.setEnabled(isEnable);
				FuncionesSwing.enableDisableComponents(jMenuBarPrincipal,isEnable,1,1);
			}
			
			if(jMenuBarDetalle!=null) {
				jMenuBarDetalle.setEnabled(isEnable);
				FuncionesSwing.enableDisableComponents(jMenuBarDetalle,isEnable,1,1);
			}	
			
		 	if(jToolBarPrincipal!=null) {
				jToolBarPrincipal.setEnabled(isEnable);
				FuncionesSwing.enableDisableComponents(jToolBarPrincipal,isEnable,1,1);
			}
			
			if(jToolBarDetalle!=null) {
				jToolBarDetalle.setEnabled(isEnable);
				FuncionesSwing.enableDisableComponents(jToolBarDetalle,isEnable,1,1);
			}
	}
	 
	 public static void enableDisableComponents(Container container, boolean enable,Integer iNivel,Integer iNivelMaximo) {
	        Component[] components = container.getComponents();
	        for (Component component : components) {
	            component.setEnabled(enable);
	            
	            if(iNivel<=iNivelMaximo) {	            		            	
	            	if (component instanceof Container) {
	            		iNivel++;
		            	//System.out.println("NIVEL="+iNivel);
	            		
	            		enableDisableComponents((Container)component, enable,iNivel,iNivelMaximo);
	            	}
	            }
	            
	        }
	    }
	 
	 public static int getMaskKey(String sTipo){  
		int iMaskKey=KeyEvent.CTRL_MASK;
		
		//sTipo.equals("ANTERIORES") || sTipo.equals("SIGUIENTES") || 
		
		if(sTipo.equals("NUEVO_RELACIONES") || sTipo.equals("COPIAR") || sTipo.equals("CERRAR")
				|| sTipo.equals("ACEPTAR") || sTipo.equals("CANCELAR_GLOBAL") || sTipo.equals("CERRAR_SESION")
				|| sTipo.equals("IR_LOGIN") || sTipo.equals("CAMBIAR_EMPRESA_SUCURSAL") || sTipo.equals("CAMBIAR_EJERCICIO_PERIODO") 
				|| sTipo.equals("ACTUALIZAR_VISUAL") || sTipo.equals("CAMBIAR_PARAMETROS_GENERALES")) 
		{
			iMaskKey=KeyEvent.ALT_MASK;
		
		} else if(sTipo.equals("NUEVO_TABLA") || sTipo.equals("CANCELAR")) {
			iMaskKey=KeyEvent.SHIFT_MASK;
		}
		
		return iMaskKey;
	}
	 
	public static int getKeyEvent(String sTipo){  
			int iKeyEvent=KeyEvent.VK_N;
			
			switch(sTipo) {
				case "NUEVO":
					iKeyEvent=KeyEvent.VK_N;
					break;
					
				case "DUPLICAR":
					iKeyEvent=KeyEvent.VK_D;
					break;
					
				case "COPIAR":
					iKeyEvent=KeyEvent.VK_C;
					break;
					
				case "NUEVO_RELACIONES":
					iKeyEvent=KeyEvent.VK_N;
					break;
					
				case "MODIFICAR":
					iKeyEvent=KeyEvent.VK_M;
					break;
					
				case "ACTUALIZAR":
					iKeyEvent=KeyEvent.VK_A;
					break;
					
				case "ELIMINAR":
					iKeyEvent=KeyEvent.VK_E;
					break;
					
				case "CANCELAR":
					iKeyEvent=KeyEvent.VK_C;
					break;
					
				case "CERRAR":
					iKeyEvent=KeyEvent.VK_S;
					break;
					
				case "GUARDAR_CAMBIOS":
					iKeyEvent=KeyEvent.VK_G;
					break;
					
				case "ORDEN":
					iKeyEvent=KeyEvent.VK_O;
					break;
					
				case "NUEVO_TABLA":
					iKeyEvent=KeyEvent.VK_N;
					break;
					
				case "RECARGAR":
					iKeyEvent=KeyEvent.VK_R;
					break;
					
				case "SIGUIENTES":
					//iKeyEvent=KeyEvent.VK_PAGE_DOWN;
					iKeyEvent=KeyEvent.VK_RIGHT;
					break;
					
				case "ANTERIORES":
					//iKeyEvent=KeyEvent.VK_PAGE_UP;
					iKeyEvent=KeyEvent.VK_LEFT;
					break;
					
				case "ACEPTAR":
					//iKeyEvent=KeyEvent.VK_O;
					iKeyEvent=KeyEvent.VK_A;
					
					break;
					
				case "CANCELAR_GLOBAL":
					//iKeyEvent=KeyEvent.VK_Q;
					iKeyEvent=KeyEvent.VK_C;
					
					break;
					
				case "CERRAR_SESION":
					//iKeyEvent=KeyEvent.VK_P;
					iKeyEvent=KeyEvent.VK_S;
					
					break;
					
				case "IR_LOGIN":				
					iKeyEvent=KeyEvent.VK_L;
					break;
					
				case "CAMBIAR_EMPRESA_SUCURSAL":				
					iKeyEvent=KeyEvent.VK_E;
					break;
					
				case "CAMBIAR_EJERCICIO_PERIODO":				
					iKeyEvent=KeyEvent.VK_P;
					break;
					
				case "CAMBIAR_PARAMETROS_GENERALES":				
					iKeyEvent=KeyEvent.VK_G;
					break;
					
				case "ACTUALIZAR_VISUAL":				
					iKeyEvent=KeyEvent.VK_V;
					break;
					
				default:
					iKeyEvent=KeyEvent.VK_N;
				break;
					
			}
			
			return iKeyEvent;
	}
	
	public static String getKeyMensaje(String sTipo){  
		String sKeyEvent=" (Crtl + N)";
		String sKey="N";
		String sMask="Crtl";
		
		switch(sTipo) {
			case "NUEVO":
				sKey="N";
				break;
				
			case "DUPLICAR":
				sKey="D";
				break;
				
			case "COPIAR":
				sMask="Alt";
				sKey="C";
				break;
				
			case "NUEVO_RELACIONES":
				sMask="Alt";
				sKey="N";
				break;
				
			case "MODIFICAR":
				sKey="M";
				break;
				
			case "ACTUALIZAR":
				sKey="A";
				break;
				
			case "ELIMINAR":
				sKey="E";
				break;
				
			case "CANCELAR":
				sMask="Mayus";
				sKey="C";
				break;
				
			case "CERRAR":
				sMask="Alt";
				sKey="S";
				break;
				
			case "GUARDAR_CAMBIOS":
				sKey="G";
				break;
				
			case "ORDEN":
				sKey="O";
				break;
				
			case "NUEVO_TABLA":
				sMask="Mayus";
				sKey="N";
				break;
				
			case "RECARGAR":
				sKey="R";
				break;
				
			case "SIGUIENTES":
				//sMask="Alt";
				//sKey="Pag.Down";
				sKey="Flecha Derecha >";
				
				break;
				
			case "ANTERIORES":
				//sMask="Alt";
				//sKey="Pag.Up";
				sKey="Flecha Izquierda <";
				break;
					
			case "ACEPTAR":				
				//sKey="O";
				sKey="A";
				sMask="Alt";
				break;
				
			case "CANCELAR_GLOBAL":
				sKey="C";
				//sKey="Q";
				sMask="Alt";
				break;
				
			case "CERRAR_SESION":				
				sKey="S";
				sMask="Alt";
				break;
				
			case "IR_LOGIN":				
				sMask="Alt";
				sKey="L";
				break;
				
			case "CAMBIAR_EMPRESA_SUCURSAL":				
				sMask="Alt";
				sKey="E";
				break;
				
			case "CAMBIAR_EJERCICIO_PERIODO":	
				sMask="Alt";
				sKey="P";
				break;
				
			case "CAMBIAR_PARAMETROS_GENERALES":	
				sMask="Alt";
				sKey="G";
				break;
				
			case "ACTUALIZAR_VISUAL":	
				sMask="Alt";
				sKey="V";
				break;
				
			default:
				sKey="N";
			break;
				
		}
		
		sKeyEvent=" ("+sMask+" + "+sKey+")";
		
		return sKeyEvent;
	}
	
	public static int getTipoFocusedKeyEvent(String sTipo){  
		int iTipoFocused=JComponent.WHEN_IN_FOCUSED_WINDOW;
		
		if(sTipo.equals("NORMAL")) {
			iTipoFocused=JComponent.WHEN_IN_FOCUSED_WINDOW;
			//iTipoFocused=JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT;
		}
		
		return iTipoFocused;
	}
	
	public static String getKeyNameControl(String sTipo){  
		String sKeyName="F4";
		
		switch(sTipo) {
			case "CONTROL_BUSQUEDA":
				sKeyName="F3";
				break;
			
			case "CONTROL_BUSCAR":
				sKeyName="F4";
				break;							
				
			case "CONTROL_ARBOL":
				sKeyName="F5";
				break;
				
			case "CONTROL_ACTUALIZAR":
				sKeyName="F6";
				break;
				
			default:
				sKeyName="N";
			break;
				
		}
		
		
		return sKeyName;
	}
	
	public static KeyStroke getKeyStrokeControl(String sTipo){  
		KeyStroke keyStroke=KeyStroke.getKeyStroke(KeyEvent.VK_F3 , 0);
		
		switch(sTipo) {
		case "CONTROL_BUSQUEDA":
			keyStroke=KeyStroke.getKeyStroke(KeyEvent.VK_F3 , 0);
			break;
			
		case "CONTROL_BUSCAR":
			keyStroke=KeyStroke.getKeyStroke(KeyEvent.VK_F4 , 0);
			break;					
			
		case "CONTROL_ARBOL":
			keyStroke=KeyStroke.getKeyStroke(KeyEvent.VK_F5 , 0);
			break;
			
		case "CONTROL_ACTUALIZAR":
			keyStroke=KeyStroke.getKeyStroke(KeyEvent.VK_F6 , 0);
			break;
			
		default:
			keyStroke=KeyStroke.getKeyStroke(KeyEvent.VK_F3 , 0);
		break;
			
	}
		
		return keyStroke;
	}
	
	public static void addDateListener(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreCampo){
		Component[] components=jDateChooser.getComponents();
		
		JTextFieldDateEditor jTextFieldDateEditor=(JTextFieldDateEditor)components[1];
		
		jTextFieldDateEditor.addFocusListener(new FormattedTextFieldFocusListener(jInternalFrameBase,sNombreCampo));
		
		jTextFieldDateEditor.addActionListener (new FormattedTextFieldActionListener(jInternalFrameBase,sNombreCampo));
		
	}
	
	public static String getTipoTamanioGeneral(JInternalFrameBase JInternalFrameBase,ParametroGeneralUsuario parametroGeneralUsuario,Boolean esRelaciones,Boolean esRelacionado) {
		String sTamanioGeneral="NINGUNO";
		
		if(Constantes2.CON_WEB_EXPRESS_VERSION2) {
			return sTamanioGeneral;
		}
		
		if(parametroGeneralUsuario!=null) {
			if(!parametroGeneralUsuario.getcon_tamanio_control_manual() && parametroGeneralUsuario.getid_tipo_tamanio_control_normal()!=null) {
				if(parametroGeneralUsuario.getid_tipo_tamanio_control_normal().equals(1L)) {
					sTamanioGeneral="NORMAL";
					
				} else if(parametroGeneralUsuario.getid_tipo_tamanio_control_normal().equals(2L)) {
					sTamanioGeneral="MEDIO";
					
				} else if(parametroGeneralUsuario.getid_tipo_tamanio_control_normal().equals(3L)) {
					sTamanioGeneral="PEQUENO";
					
				} else if(parametroGeneralUsuario.getid_tipo_tamanio_control_normal().equals(4L)) {
					sTamanioGeneral="GRANDE";
					
				} else if(parametroGeneralUsuario.getid_tipo_tamanio_control_normal().equals(5L)) {
					sTamanioGeneral="MINIMO";
					
				}  else if(parametroGeneralUsuario.getid_tipo_tamanio_control_normal().equals(6L)) {
					sTamanioGeneral="MAXIMO";
				}
				
			} else {
				//TABLA NORMAL
				if(!esRelaciones && !esRelacionado && parametroGeneralUsuario.getid_tipo_tamanio_control_normal()!=null) {
					
					if(parametroGeneralUsuario.getid_tipo_tamanio_control_normal().equals(1L)) {
						sTamanioGeneral="NORMAL";
						
					} else if(parametroGeneralUsuario.getid_tipo_tamanio_control_normal().equals(2L)) {
						sTamanioGeneral="MEDIO";
						
					} else if(parametroGeneralUsuario.getid_tipo_tamanio_control_normal().equals(3L)) {
						sTamanioGeneral="PEQUENO";
						
					} else if(parametroGeneralUsuario.getid_tipo_tamanio_control_normal().equals(4L)) {
						sTamanioGeneral="GRANDE";
						
					} else if(parametroGeneralUsuario.getid_tipo_tamanio_control_normal().equals(5L)) {
						sTamanioGeneral="MINIMO";
						
					}  else if(parametroGeneralUsuario.getid_tipo_tamanio_control_normal().equals(6L)) {
						sTamanioGeneral="MAXIMO";
					}
					
				} else if(esRelaciones && parametroGeneralUsuario.getid_tipo_tamanio_control_relacion()!=null) {
					
					if(parametroGeneralUsuario.getid_tipo_tamanio_control_relacion().equals(1L)) {
						sTamanioGeneral="NORMAL";
						
					} else if(parametroGeneralUsuario.getid_tipo_tamanio_control_relacion().equals(2L)) {
						sTamanioGeneral="MEDIO";
						
					} else if(parametroGeneralUsuario.getid_tipo_tamanio_control_relacion().equals(3L)) {
						sTamanioGeneral="PEQUENO";
						
					} else if(parametroGeneralUsuario.getid_tipo_tamanio_control_relacion().equals(4L)) {
						sTamanioGeneral="GRANDE";
						
					} else if(parametroGeneralUsuario.getid_tipo_tamanio_control_relacion().equals(5L)) {
						sTamanioGeneral="MINIMO";
						
					}  else if(parametroGeneralUsuario.getid_tipo_tamanio_control_relacion().equals(6L)) {
						sTamanioGeneral="MAXIMO";
					}
				}
			}
		}
		
		return sTamanioGeneral;
	}
	
	public static String getTipoTamanioGeneralTabla(JInternalFrameBase JInternalFrameBase,ParametroGeneralUsuario parametroGeneralUsuario,Boolean esRelaciones,Boolean esRelacionado) {
		String sTamanioGeneral="NINGUNO";
		
		if(Constantes2.CON_WEB_EXPRESS_VERSION2) {
			return sTamanioGeneral;
		}
		
		if(parametroGeneralUsuario!=null) {
			if(!parametroGeneralUsuario.getcon_tamanio_control_manual() && parametroGeneralUsuario.getid_tipo_tamanio_control_normal()!=null) {
				
				if(parametroGeneralUsuario.getid_tipo_tamanio_control_normal().equals(1L)) {
					sTamanioGeneral="NORMAL";
					
				} else if(parametroGeneralUsuario.getid_tipo_tamanio_control_normal().equals(2L)) {
					sTamanioGeneral="MEDIO";
					
				} else if(parametroGeneralUsuario.getid_tipo_tamanio_control_normal().equals(3L)) {
					sTamanioGeneral="PEQUENO";
					
				} else if(parametroGeneralUsuario.getid_tipo_tamanio_control_normal().equals(4L)) {
					sTamanioGeneral="GRANDE";
					
				} else if(parametroGeneralUsuario.getid_tipo_tamanio_control_normal().equals(5L)) {
					sTamanioGeneral="MINIMO";
					
				}  else if(parametroGeneralUsuario.getid_tipo_tamanio_control_normal().equals(6L)) {
					sTamanioGeneral="MAXIMO";
				}
				
			} else {
				//TABLA NORMAL
				if(!esRelaciones && !esRelacionado && parametroGeneralUsuario.getid_tipo_tamanio_control_normal()!=null) {
					if(parametroGeneralUsuario.getid_tipo_tamanio_control_normal().equals(1L)) {
						sTamanioGeneral="NORMAL";
						
					} else if(parametroGeneralUsuario.getid_tipo_tamanio_control_normal().equals(2L)) {
						sTamanioGeneral="MEDIO";
						
					} else if(parametroGeneralUsuario.getid_tipo_tamanio_control_normal().equals(3L)) {
						sTamanioGeneral="PEQUENO";
						
					} else if(parametroGeneralUsuario.getid_tipo_tamanio_control_normal().equals(4L)) {
						sTamanioGeneral="GRANDE";
						
					} else if(parametroGeneralUsuario.getid_tipo_tamanio_control_normal().equals(5L)) {
						sTamanioGeneral="MINIMO";
						
					}  else if(parametroGeneralUsuario.getid_tipo_tamanio_control_normal().equals(6L)) {
						sTamanioGeneral="MAXIMO";
					}
					
				} else if(esRelaciones && parametroGeneralUsuario.getid_tipo_tamanio_control_relacion()!=null) {
					
					if(parametroGeneralUsuario.getid_tipo_tamanio_control_relacion().equals(1L)) {
						sTamanioGeneral="NORMAL";
						
					} else if(parametroGeneralUsuario.getid_tipo_tamanio_control_relacion().equals(2L)) {
						sTamanioGeneral="MEDIO";
						
					} else if(parametroGeneralUsuario.getid_tipo_tamanio_control_relacion().equals(3L)) {
						sTamanioGeneral="PEQUENO";
						
					} else if(parametroGeneralUsuario.getid_tipo_tamanio_control_relacion().equals(4L)) {
						sTamanioGeneral="GRANDE";
						
					} else if(parametroGeneralUsuario.getid_tipo_tamanio_control_relacion().equals(5L)) {
						sTamanioGeneral="MINIMO";
						
					}  else if(parametroGeneralUsuario.getid_tipo_tamanio_control_relacion().equals(6L)) {
						sTamanioGeneral="MAXIMO";
					}
				}
			}
		}
		
		return sTamanioGeneral;
	}
	
	public static Boolean getConTipoTamanioManual(JInternalFrameBase JInternalFrameBase,ParametroGeneralUsuario parametroGeneralUsuario,Boolean esRelaciones,Boolean esRelacionado) {
		Boolean conTipoTamanioManual=false;
		
		if(Constantes2.CON_WEB_EXPRESS_VERSION2) {
			return conTipoTamanioManual;
		}
		
		if(parametroGeneralUsuario!=null) {
			if(parametroGeneralUsuario.getcon_tamanio_control_manual()) {
				conTipoTamanioManual=true;
			}
		}
		
		return conTipoTamanioManual;
	}
	
	public static Boolean getConTipoTamanioTodo(JInternalFrameBase JInternalFrameBase,ParametroGeneralUsuario parametroGeneralUsuario,Boolean esRelaciones,Boolean esRelacionado) {
		Boolean conTipoTamanioTodo=false;
		
		if(Constantes2.CON_WEB_EXPRESS_VERSION2) {
			return conTipoTamanioTodo;
		}
		
		if(!esRelaciones && !esRelacionado) {
			conTipoTamanioTodo=true;
			
		} else if(esRelaciones) {
			if(parametroGeneralUsuario.getcon_tamanio_control_todo_relacion()) {
				conTipoTamanioTodo=true;
			}
			
		} else if(esRelacionado) {
			conTipoTamanioTodo=true;
		}
		
		
		return conTipoTamanioTodo;
	}
	
	public static String getTipoFuente(String sTipoFuenteDefecto,JInternalFrameBase JInternalFrameBase,ParametroGeneralUsuario parametroGeneralUsuario) {
		String sTipoFuente=sTipoFuenteDefecto;
		
		
		if(parametroGeneralUsuario!=null) {
			sTipoFuente=FuncionesSwing.getTipoFuenteDesdeParametroUsuario(sTipoFuenteDefecto, parametroGeneralUsuario);			
			
		} else {
			if(JInternalFrameBase!=null && JInternalFrameBase.getParametroGeneralUsuario()!=null) {
				sTipoFuente=FuncionesSwing.getTipoFuenteDesdeParametroUsuario(sTipoFuenteDefecto, JInternalFrameBase.getParametroGeneralUsuario());
			}
		}
		
		
		return sTipoFuente;
	}
	
	public static String getTipoFuenteDesdeParametroUsuario(String sTipoFuenteDefecto,ParametroGeneralUsuario parametroGeneralUsuario) {
		String sTipoFuente=sTipoFuenteDefecto;
		Integer iTipoFuente=parametroGeneralUsuario.getid_tipo_fuente().intValue();
		
		switch(iTipoFuente) {
			case 1:
				sTipoFuente="Times New Roman";//"Times New Roman";
				break;
			
			case 2:
				sTipoFuente="Serif";//"Serif";Comic Sans MS
				break;
				
			case 3:
				sTipoFuente="Sans Serif";//"Sans Serif";
				break;
				
			case 4:
				sTipoFuente="Arial";//"Arial";
				break;							
				
			case 5:
				sTipoFuente="Verdana";//"Arial";
				break;	
				
			case 6:
				sTipoFuente="Comic Sans MS";//"Arial";
				break;	
				
			default:
				sTipoFuente=sTipoFuenteDefecto;
		}
		
		return sTipoFuente;
	}
	
	public static Cursor getCursorDefecto() {
		Cursor cursorDefecto =new Cursor(Cursor.DEFAULT_CURSOR);
				
		try {
			Toolkit toolkit = Toolkit.getDefaultToolkit();	    	
			
			InputStream inputStream = AuxiliarImagenes.class.getResourceAsStream("lapiz_cursor.gif");	    		
			Image image = ImageIO.read(inputStream);
			
			Point hotSpot = new Point(0,0);
			
			cursorDefecto = toolkit.createCustomCursor(image, hotSpot, "Pencil"); 
		
		} catch(Exception e) {
			cursorDefecto =new Cursor(Cursor.DEFAULT_CURSOR);
		}
		
		return cursorDefecto;
	}
	
	public static Cursor getCursorProcesando() {
		Cursor cursorDefecto =new Cursor(Cursor.WAIT_CURSOR);
		
		try {
			Toolkit toolkit = Toolkit.getDefaultToolkit();	    	
			
			InputStream inputStream = AuxiliarImagenes.class.getResourceAsStream("wait_cursor.gif");	    		
			Image image = ImageIO.read(inputStream);
			
			Point hotSpot = new Point(0,0);
			
			cursorDefecto = toolkit.createCustomCursor(image, hotSpot, "Pencil"); 
			
		} catch(Exception e) {
			cursorDefecto =new Cursor(Cursor.WAIT_CURSOR);
		}
		
		return cursorDefecto;
	}
}
