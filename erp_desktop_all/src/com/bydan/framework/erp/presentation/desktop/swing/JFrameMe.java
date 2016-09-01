package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.beans.PropertyVetoException;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.framework.erp.util.ConstantesSwing;

@SuppressWarnings("unused")
public class JFrameMe extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public SplashScreenJFrame splashScreenJFrame;
	public Boolean estaCerradoSplashScreen=false;
	public Cursor cursor=this.getCursor();
			
		public JFrameMe() throws Exception {
			super();				
			
			this.initializeJProgressBar();
		}
	
		public JFrameMe(String sTitle) throws Exception {
			super(sTitle);
			
			this.initializeJProgressBar();
		}
	
		public void initializeJProgressBar() throws Exception{
			this.splashScreenJFrame=new SplashScreenJFrame();
			//this.jPanelProgressProcess.setVisible(false);
			
					//this.splashScreenJFrame.setVisible(true);
			        //this.splashScreenJFrame.setSelected(true);
			
			//if(this.jDesktopPane!=null) {
			//	MainJFrame.cerrarJFramesExistentes(this.jDesktopPane,this.splashScreenJFrame);
				
			//	this.jDesktopPane.add(this.splashScreenJFrame);
				
				this.splashScreenJFrame.setVisible(false);
		        //this.splashScreenJFrame.setSelected(false);
		        
			//	this.estaCerradoSplashScreen=true;
			//}
			
			/*
			this.jProgressBar = new JProgressBar(0, 100);
			this.jProgressBar.setValue(0);
			this.jProgressBar.setStringPainted(true);
			
			this.jProgressBar.setMinimumSize(new Dimension(100,25));
			this.jProgressBar.setMaximumSize(new Dimension(100,25));
			this.jProgressBar.setPreferredSize(new Dimension(100,25));
			*/
		}
		
		public void startProcess()throws Exception{			
			
			try {
				
				//this.cursor=this.getCursor();								
				
				/*
				Toolkit toolkit = Toolkit.getDefaultToolkit();	    			    		
	    		InputStream inputStream = AuxiliarImagenes.class.getResourceAsStream("wait.gif");	    		
	    		Image image = ImageIO.read(inputStream);	    		    
	    		Point hotSpot = new Point(0,0);
	    		
	    		Cursor cursorImage = toolkit.createCustomCursor(image, hotSpot, "Pencil");  
	    		*/
				
	    		//this.setCursor(FuncionesSwing.getCursorProcesando());  
	    		
				this.setCursor(ConstantesSwing.CURSOR_PROCESANDO);
				
				//this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
				
				if(!this.estaCerradoSplashScreen) {
					//MainJFrame.cerrarJFramesExistentes(this.jDesktopPane,this.splashScreenJFrame);
					
					//this.jDesktopPane.add(this.splashScreenJFrame);				
			        
					this.estaCerradoSplashScreen=true;
				}
				
				//System.out.println("antes cursor"+new Date(System.currentTimeMillis()));				
				
				this.splashScreenJFrame.setVisible(true);
		        //this.splashScreenJFrame.setSelected(true);
		        
						//System.out.println("despues cursor"+new Date(System.currentTimeMillis()));
						
						//System.out.println("antes start progress"+new Date(System.currentTimeMillis()));			
						/*
						SwingUtilities.invokeLater(new Runnable() {
				            public void run() {
				            	startProcessJProgressBar(); 
				            }
				        });
						*/
		        
		        //LLAMADA DIRECTA
		        this.splashScreenJFrame.startProcess();
		        
				//this.startProcessJProgressBar();
				//System.out.println("despues start progress"+new Date(System.currentTimeMillis()));			
				
				//this.finishProcessJProgressBar();	
			} catch(Exception e) {
				throw e;
			}
		}
		
		public void startProcessJProgressBar() throws Exception{
			
			
			this.splashScreenJFrame.startProcess();
			/*
			this.jPanelProgressProcess.setVisible(true);
			this.jProgressBar.setVisible(true);		
			this.jProgressBar.setString("Procesando...");
			this.jProgressBar.setIndeterminate(true);
			*/
							//this.jProgressBar.setValue(this.jProgressBar.getMinimum());		
		}

		//@SuppressWarnings("deprecation")
		public void finishProcess()throws Exception{
			
			try {
				//this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
					
				this.splashScreenJFrame.setVisible(false);
		        //this.splashScreenJFrame.setSelected(false);
		        
				//this.startProcessJProgressBar();
				
		        //LLAMADA DIRECTA
		        this.splashScreenJFrame.finishProcess();
		        
				//this.finishProcessJProgressBar();
				
				
				//PARA DEPUTAR
				/*
				this.splashScreenJFrame.setVisible(true);
		        this.splashScreenJFrame.setSelected(true);	        	        
		        this.splashScreenJFrame.jProgressBar.setVisible(true);
		        this.splashScreenJFrame.getjLabelImagen().setVisible(true);
		        */
				
				//this.splashScreenJFrame.jProgressBar.setString("PROCESANDO");	
				//PARA DEPUTAR
				
				
				/*
				SwingUtilities.invokeLater(new Runnable() {
		            public void run() {
		            	finishProcessJProgressBar();
		            }
		        });
		        */
			} catch(Exception e) {
				throw e;
				
			} finally {
				this.setCursor(ConstantesSwing.CURSOR_DEFECTO);
				
				//this.setCursor(ConstantesSwing.CURSOR_DEFECTO);
				
				//this.setCursor(FuncionesSwing.getCursorDefecto());  
				
				//this.setCursor(this.cursor);
				//this.setCursor(Cursor.DEFAULT_CURSOR);
			}
		}
		
		
		
		public void finishProcessJProgressBar() throws Exception{
			this.splashScreenJFrame.finishProcess();
			/*
			this.jPanelProgressProcess.setVisible(false);
			this.jProgressBar.setVisible(false);		
			this.jProgressBar.setString(null);		
			this.jProgressBar.setIndeterminate(false);
			*/ 
						//this.jProgressBar.setValue(this.jProgressBar.getMaximum());
		}
		
		/*
		private Boolean conRepeatImage=true;
		private Image image=null;
		private String sPathImagen="fondo_cabecera";//"fondo_titulo";
		
		@Override
	    public void paintComponents(Graphics g) {
	        super.paintComponents(g);
	        
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
	    */
		
		public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
			try {
				
	  		} catch(Exception e) {
	  			e.printStackTrace();
	  		}
	    }
		
		public void jButtonActionPerformedTecladoGeneral(Modulo modulo,ActionEvent evt) { 	  
			try {
				
	  		} catch(Exception e) {
	  			e.printStackTrace();
	  		}
	    }
		
		public void jButtonActionPerformedGeneral(String sTipo,java.awt.event.ActionEvent evt) { 	  
			try {
				
	  		} catch(Exception e) {
	  			e.printStackTrace();
	  		}
	    }
		
		
		public void jButtonModuloActionPerformedGeneral(Modulo modulo,java.awt.event.ActionEvent evt) { 	  
			try {
				
	  		} catch(Exception e) {
	  			e.printStackTrace();
	  		}
	    }
}
