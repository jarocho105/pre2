package com.bydan.framework.erp.presentation.desktop.swing;

import javax.swing.*;

import java.awt.*;

import javax.swing.*;

import java.awt.*;

import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.framework.erp.util.Constantes;
import com.bydan.framework.erp.util.Constantes2;

@SuppressWarnings("unused")
public class SplashScreenJFrame extends JFrame implements Runnable {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BorderLayout borderLayout = new BorderLayout();
	private JLabel jLabelImagen = new JLabel();
	
	private GridBagLayout gridaBagLayoutSplash = new GridBagLayout();
	private JPanel jPanelSplash = new JPanelMe();
	private GridBagConstraints gridBagConstraintsSplash;
	
	public JProgressBar jProgressBar = new JProgressBar();
	private ImageIcon imageIcon;
	private Boolean isIndeterminate=true;
	private Boolean esMostrarGif=true;
	private Integer iNumeroEjecusionDemora=1;
	
	private static int MAX=100;
	private static int NUMERO_EJECUSION=1;
	//private static int RAZON_TAM_GIF=2;
	
	private static int WIDTH=300;
	private static int HEIGHT=210;
	
	private static int WIDTH_GIF=175;
	private static int HEIGHT_GIF=175;
	
	private int iWidthFinal=0;
	private int iHeightFinal=0;
	
	public int theValueProgress = 0;
	public String theMessage = "";
    public SplashScreenJFrame splashScreenJFrame=null;
    
	public SplashScreenJFrame(SplashScreenJFrame splashScreenJFrame,int theValueProgress,String theMessage) {
		this.theValueProgress=theValueProgress;
		this.theMessage=theMessage;
		this.splashScreenJFrame=splashScreenJFrame;
	}
	
	public SplashScreenJFrame() {	  
		this(true,true, SplashScreenJFrame.NUMERO_EJECUSION);
	}
	
	public SplashScreenJFrame(Boolean isIndeterminate,Boolean esMostrarGif) {	  
		this(isIndeterminate,esMostrarGif, SplashScreenJFrame.NUMERO_EJECUSION);
	}
	
	public SplashScreenJFrame(Boolean isIndeterminate,Boolean esMostrarGif,Integer iNumeroEjecusionDemora) {	
		this.setResizable(true);
		//this.setClosable(true);
		//this.setMaximizable(false);
		this.setBackground(Color.WHITE);   
		
		this.isIndeterminate=isIndeterminate;
		this.esMostrarGif=esMostrarGif;
		this.iNumeroEjecusionDemora=iNumeroEjecusionDemora;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		  
		this.setTitle("PROCESANDO......");
		
		if(!this.esMostrarGif) {
			this.iWidthFinal=SplashScreenJFrame.WIDTH;
			this.iHeightFinal=SplashScreenJFrame.HEIGHT;
		} else {
			this.iWidthFinal=SplashScreenJFrame.WIDTH_GIF;
			this.iHeightFinal=SplashScreenJFrame.HEIGHT_GIF;
			
			//this.iWidthFinal=SplashScreenJInternalFrame.WIDTH/SplashScreenJInternalFrame.RAZON_TAM_GIF;
			//this.iHeightFinal=SplashScreenJInternalFrame.HEIGHT/SplashScreenJInternalFrame.RAZON_TAM_GIF;
		}
		
		int iWidthLocation=(screenSize.width/2 - this.iWidthFinal);
		int iHeightLocation=(screenSize.height/2 - this.iHeightFinal);
		
		this.setSize(this.iWidthFinal,this.iHeightFinal);		
		this.setLocation(iWidthLocation,iHeightLocation);	  		  	
	            
	    try {
	    	this.initialize(isIndeterminate);
	    	   	   	
	    }
	    catch(Exception ex) {
	      ex.printStackTrace();
	    }
  }

  void initialize(Boolean isIndeterminate) throws Exception {
	ImageIcon imageIcon= new ImageIcon(AuxiliarImagenes.class.getResource("wait.gif"));	  
		
	//Image image = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
	//imageIcon.setImage(image);
		
	this.imageIcon = imageIcon;
	this.jLabelImagen.setIcon(this.imageIcon);
	    	    
	if(!this.esMostrarGif) {
		this.initializeJProgressBar(isIndeterminate);
	}
	  
	this.getJContentPane();

    //this.pack();
  }

  public void getJContentPane() {
	  	int iGridX=0;
	  	int iGridY=0;
	  	
	    this.gridaBagLayoutSplash = new GridBagLayout();
	    
	    this.jPanelSplash = new JPanel();
	    //this.jPanelSplash.setBorder(javax.swing.BorderFactory.createTitledBorder("PROCESANDO"));
	    this.jPanelSplash.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
	    
	    this.jPanelSplash.setBackground(Color.WHITE);
		this.jPanelSplash.setName("jPanelSplash"); 
		
		this.jPanelSplash.setMinimumSize(new Dimension(this.iWidthFinal,this.iHeightFinal));
		this.jPanelSplash.setMaximumSize(new Dimension(this.iWidthFinal,this.iHeightFinal));
		this.jPanelSplash.setPreferredSize(new Dimension(this.iWidthFinal,this.iHeightFinal));
		
		
		this.jPanelSplash.setLayout(this.gridaBagLayoutSplash);
			

		if(!this.esMostrarGif) {
			this.gridBagConstraintsSplash = new GridBagConstraints();
			this.gridBagConstraintsSplash.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsSplash.gridy = iGridY++;		
			this.gridBagConstraintsSplash.gridx = iGridX;
				
			this.jPanelSplash.add(this.jProgressBar, this.gridBagConstraintsSplash);
		
		} else {
			this.gridBagConstraintsSplash = new GridBagConstraints();
			this.gridBagConstraintsSplash.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsSplash.gridy = iGridY++;		
			this.gridBagConstraintsSplash.gridx = iGridX;
				
			this.jPanelSplash.add(this.jLabelImagen, this.gridBagConstraintsSplash);
		}
		
		//return this.jPanelSplash;
		
				
				
		this.setContentPane(new JPanel());
		
		GridBagLayout gridaBagLayoutSplashPrincipal = new GridBagLayout();
		this.getContentPane().setLayout(gridaBagLayoutSplashPrincipal);
			
		this.gridBagConstraintsSplash = new GridBagConstraints();
		this.gridBagConstraintsSplash.gridy =0;
		this.gridBagConstraintsSplash.gridx =0;
		this.gridBagConstraintsSplash.fill = GridBagConstraints.BOTH;
		
		this.getContentPane().add(this.jPanelSplash, this.gridBagConstraintsSplash);
  }	
	
  
  public void initializeJProgressBar(Boolean isIndeterminate){
		this.jProgressBar = new JProgressBar(0, SplashScreenJFrame.MAX);
		this.jProgressBar.setValue(0);
		this.jProgressBar.setStringPainted(true);
		
		this.jProgressBar.setMinimumSize(new Dimension(300,50));
		this.jProgressBar.setMaximumSize(new Dimension(300,50));
		this.jProgressBar.setPreferredSize(new Dimension(300,50));
		
		this.jProgressBar.setIndeterminate(isIndeterminate);
		
		if(isIndeterminate) {
			this.jProgressBar.setStringPainted(false);
		} else {
			this.jProgressBar.setStringPainted(true);
		}
  }
  
  public void setProgressMax(int maxProgress) {
	  this.jProgressBar.setMaximum(maxProgress);
  }

	
	
	public void startProcess()throws Exception{
		
		try {
			//System.out.println("antes cursor"+new Date(System.currentTimeMillis()));
			//this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));	
			//this.setVisible(true);
			
			if(!this.isIndeterminate) {
				if(!this.esMostrarGif) {
					for (int iCountGeneral = 0; iCountGeneral < this.iNumeroEjecusionDemora; iCountGeneral++) {
						this.executeAuxProgress();
						
						this.setProgress("Ejecutanto " + 0, 0);
				    }
				}
			}
			
			//System.out.println("despues cursor"+new Date(System.currentTimeMillis()));
			
			//System.out.println("antes start progress"+new Date(System.currentTimeMillis()));			
			/*
			SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	            	startProcessJProgressBar(); 
	            }
	        });
			*/
			this.startProcessJProgressBar();
			//System.out.println("despues start progress"+new Date(System.currentTimeMillis()));			
			
			//this.finishProcessJProgressBar();	
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void startProcessJProgressBar(){
		  //this.jProgressBar.setString("PROCESANDO...");
		if(!this.esMostrarGif) {
		  this.jProgressBar.setVisible(true);
		} else {
			this.jLabelImagen.setVisible(true);
		}
					  //this.jProgressBar.setIndeterminate(true);
					  //this.jProgressBar.setValue(this.jProgressBar.getMinimum());		
	  }
	
	public void finishProcess()throws Exception{
		
		try {
			
			//this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			//this.setVisible(false);
			
			//this.startProcessJProgressBar();
			
			this.finishProcessJProgressBar();
			
			
			
			/*
			SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	            	finishProcessJProgressBar();
	            }
	        });
	        */
		} catch(Exception e) {
			throw e;
		}
	}
	
	 
		
	  public void finishProcessJProgressBar(){
		  if(!this.esMostrarGif) {
			this.jProgressBar.setVisible(false);
		  } else {
			  this.jLabelImagen.setVisible(false);
		  }
			//this.jProgressBar.setString(null);		
						//this.jProgressBar.setIndeterminate(false); 
						//this.jProgressBar.setValue(this.jProgressBar.getMaximum());
	  }
	  
  public void setValueProgress(int valueProgress) {
	if(!this.esMostrarGif) {
	    final int theValueProgress = valueProgress;
	    
	    /*
	    SwingUtilities.invokeLater(new Runnable() {
	      public void run() {
	        jProgressBar.setValue(theValueProgress);
	      }
	    });	    	     
	    */
	    
	    SwingUtilities.invokeLater(new SplashScreenJFrame(this,valueProgress,""));
	}
  }

  public void setProgress(String message, int valueProgress) {
	if(!this.esMostrarGif) {
	    final int theValueProgress = valueProgress;
	    final String theMessage = message;
	    
	    this.setValueProgress(valueProgress);
	    
	    /*
	    SwingUtilities.invokeLater(new Runnable() {
	      public void run() {
	        jProgressBar.setValue(theValueProgress);
	        setMessage(theMessage);
	      }
	    });
	    */
	    
	    /*
	    public int theValueProgress = 0;
		public String theMessage = "";  	      
	    */
	    
	    SwingUtilities.invokeLater(new SplashScreenJFrame(this,valueProgress,message));
	}
  }

  public void run() {
	  try {
		
		  splashScreenJFrame.jProgressBar.setValue(theValueProgress);
		  splashScreenJFrame.setMessage(theMessage);
	        
	  } catch (Exception e) {
		  // TODO Auto-generated catch block
		  e.printStackTrace();
	  }
  }
  
  private void setMessage(String message) {
	if(!this.esMostrarGif) {
	    if (message==null) {
	    	message = "";
	    	this.jProgressBar.setStringPainted(false);
	      
	    } else {
	    	this.jProgressBar.setStringPainted(true);
	    }
	    
	    this.jProgressBar.setString(message);
	}
  }
  
  /*
  public void setVisibleScreen(boolean b) {
    final boolean boo = b;
    
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        setVisible(boo);
      }
    });
  }
   */
  
  public void executeAuxProgress() {
	  if(!this.esMostrarGif) {
	    // SIMULANDO PROCESO
	    for (int iCount = 0; iCount <= 100; iCount++) {
	      for (long jCount=0; jCount<50000; ++jCount) {
	        String sCountProceso = " " + (jCount + iCount);
	      }
	      // run either of these two -- not both
	      this.setProgress("Ejecutanto " + iCount, iCount);  // progress bar with a message
	      //screen.setProgress(i);           // progress bar with no message
	    }
	  }
  }

  private Image image=null;
  private Boolean conRepeatImage=true;
  
 
  public void paintComponent(Graphics g) {
     // super.paintComponent(g);
      
      String sPathImagen=Constantes2.S_FONDOBORDE_IMAGE+"_verde";
      
      image=FuncionesSwing.getImagenFondo(sPathImagen);//this.sPathImagen
      
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
  
	public JLabel getjLabelImagen() {
		return jLabelImagen;
	}
	
	public void setjLabelImagen(JLabel jLabelImagen) {
		this.jLabelImagen = jLabelImagen;
	}
	
	public JProgressBar getjProgressBar() {
		return jProgressBar;
	}
	
	public void setjProgressBar(JProgressBar jProgressBar) {
		this.jProgressBar = jProgressBar;
	}
	
	public ImageIcon getImageIcon() {
		return imageIcon;
	}
	
	public void setImageIcon(ImageIcon imageIcon) {
		this.imageIcon = imageIcon;
	}
	
	public Boolean getIsIndeterminate() {
		return isIndeterminate;
	}
	
	public void setIsIndeterminate(Boolean isIndeterminate) {
		this.isIndeterminate = isIndeterminate;
	}

	public Integer getiNumeroEjecusionDemora() {
		return iNumeroEjecusionDemora;
	}

	public void setiNumeroEjecusionDemora(Integer iNumeroEjecusionDemora) {
		this.iNumeroEjecusionDemora = iNumeroEjecusionDemora;
	}

	public JPanel getjPanelSplash() {
		return jPanelSplash;
	}

	public void setjPanelSplash(JPanel jPanelSplash) {
		this.jPanelSplash = jPanelSplash;
	}

	public Boolean getEsMostrarGif() {
		return esMostrarGif;
	}

	public void setEsMostrarGif(Boolean esMostrarGif) {
		this.esMostrarGif = esMostrarGif;
	}	
}