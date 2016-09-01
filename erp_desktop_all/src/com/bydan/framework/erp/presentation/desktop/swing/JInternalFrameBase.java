package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.MouseEvent;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.DocumentEvent;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.ListSelectionEvent;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.util.Constantes2;
import com.bydan.framework.erp.util.ConstantesSwing;
import com.bydan.framework.erp.util.ControlTipo;
import com.bydan.framework.erp.util.EventoGlobalTipo;
import com.bydan.framework.erp.util.EventoSubTipo;
import com.bydan.framework.erp.util.EventoTipo;
import com.bydan.framework.erp.util.PaginaTipo;
import com.toedter.calendar.JDateChooser;

@SuppressWarnings("unused")
public class JInternalFrameBase extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String sIp;	    
	protected JDesktopPane jDesktopPane;//Me
	protected JPanel jPanelProgressProcess;
	//protected JProgressBar jProgressBar;
	public SplashScreenJInternalFrame splashScreenJInternalFrame;
	public Boolean estaCerradoSplashScreen=false;
	
	public JInternalFrameBase jInternalFrameParent;
	public JInternalFrameBase jInternalFrameAuxiliar;
	protected Usuario usuarioActual=null;	
	protected ResumenUsuario resumenUsuarioActual=null;
	protected ParametroGeneralSg parametroGeneralSg=null;
	protected ParametroGeneralUsuario parametroGeneralUsuario=null;
	protected Modulo moduloActual=null;
	protected Opcion opcionActual=null;
	public String sTipoBusqueda;
	public String sTipoProceso;
	public Long idActual=0L;		
	public Boolean esUsoDesdeHijo=false;
	public PaginaTipo paginaTipo=PaginaTipo.PRINCIPAL;
	public String sPathImagen=Constantes2.S_FONDOBORDE_IMAGE;
	public String sPath="";
	public Cursor cursor=this.getCursor();
	public String sTipoTamanioGeneral="NORMAL";
	public String sTipoTamanioGeneralTabla="NORMAL";
	public Boolean conTipoTamanioManual=false;
	public Boolean conTipoTamanioTodo=false;
	public Boolean conTotales=false;
	public Boolean estaModoSeleccionar=false;
	public Boolean estaModoNuevo=false;
	public Boolean estaModoNuevoGuardarCambios=false;//NUEVO TABLA
	public Boolean estaModoDuplicar=false;
	public Boolean estaModoCopiar=false;
	public Boolean estaModoEliminarGuardarCambios=false; //
	public Boolean estaModoGuardarCambios=false; 
	public Constantes2 constantes2=null;
	
	public JInternalFrameBase getjInternalFrameParent() {
		return jInternalFrameParent;
	}

	public void setjInternalFrameParent(JInternalFrameBase jInternalFrameParent) {
		this.jInternalFrameParent = jInternalFrameParent;
	}

	public JInternalFrameBase getjInternalFrameAuxiliar() {
		return jInternalFrameAuxiliar;
	}

	public void setjInternalFrameAuxiliar(JInternalFrameBase jInternalFrameAuxiliar) {
		this.jInternalFrameAuxiliar = jInternalFrameAuxiliar;
	}
	
	public JDesktopPane getJDesktopPane() {
		return this.jDesktopPane;
	}

	public void setJDesktopPane(JDesktopPane desktopPane) {//Me
		this.jDesktopPane = desktopPane;
	}
	
	public JInternalFrameBase(Usuario usuario, String sIp) {
		super();
		try {
			this.constructorBase("",usuario,sIp);						
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e);
		}
	}				
	
	public JInternalFrameBase(PaginaTipo paginaTipo,JDesktopPane jdesktopPane){ //Me
		super();
		
		try {
			this.jDesktopPane=jdesktopPane;
			this.constructorBase("",new Usuario(),"",paginaTipo);
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e);
		}
	}
	
	
	public JInternalFrameBase(PaginaTipo paginaTipo){
		super();
		
		try {
			this.constructorBase("",new Usuario(),"",paginaTipo);
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e);
		}
	}
	
	
	public JInternalFrameBase(){
		super();
		
		try {
			this.constructorBase("",new Usuario(),"");
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e);
		}
	}
	
	public JInternalFrameBase(String sTitle){
		super();
		
		try {
			this.constructorBase(sTitle,new Usuario(),"");
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e);
		}
	}
	
	public void constructorBase(String sTitle,Usuario usuario, String sIp,PaginaTipo paginaTipo) throws Exception {
		this.constructorBase(sTitle,usuario,new ResumenUsuario(), sIp,paginaTipo);
	}
	
	public void constructorBase(String sTitle,Usuario usuario, String sIp) throws Exception {
		this.constructorBase(sTitle,usuario,new ResumenUsuario(), sIp,PaginaTipo.PRINCIPAL);
	}
	
	public void constructorBase(String sTitle,Usuario usuario,ResumenUsuario resumenUsuario, String sIp,PaginaTipo paginaTipo) throws Exception {
		
		this.setCursor(ConstantesSwing.CURSOR_DEFECTO);
		
		this.usuarioActual = usuario;
		this.resumenUsuarioActual = resumenUsuario;
		this.parametroGeneralSg=new ParametroGeneralSg();
		this.parametroGeneralUsuario=new ParametroGeneralUsuario();
		this.moduloActual=new Modulo();
		this.opcionActual=new Opcion();
		this.sIp = sIp;
		this.idActual=0L;
		this.esUsoDesdeHijo=false;
		this.jPanelProgressProcess=new JPanel();  
		this.initializeJProgressBar();		
		this.setTitle(sTitle);
		this.paginaTipo=paginaTipo;//PaginaTipo.PRINCIPAL;
		this.sPathImagen=this.getPathImagen(paginaTipo);//Constantes2.S_FONDOBORDE_IMAGE;
		this.sPath="";
		//this.setForeground(Color.WHITE);	
		
		this.sTipoTamanioGeneral="NORMAL";
		this.sTipoTamanioGeneralTabla="NORMAL";
		this.conTipoTamanioManual=false;
		this.conTipoTamanioTodo=false;
		this.constantes2=new Constantes2();
	}
	
	public String getPathImagen(PaginaTipo paginaTipo) {
		String sPathImagen="";
		
		//verde,blanco,rojo,amarillo
		
		if(paginaTipo!=null) {
			if(paginaTipo.equals(PaginaTipo.PRINCIPAL)) {
				sPathImagen=Constantes2.S_FONDOBORDE_IMAGE;
				
			} else if(paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
				sPathImagen=Constantes2.S_FONDOBORDE_IMAGE+"_verde";
				
			} else if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				sPathImagen=Constantes2.S_FONDOBORDE_IMAGE+"_amarillo";
				
			} else if(paginaTipo.equals(PaginaTipo.AUXILIAR)) {
				sPathImagen=Constantes2.S_FONDOBORDE_IMAGE+"_rojo";
				
			} else {
				sPathImagen=Constantes2.S_FONDOBORDE_IMAGE;
			}
			
			//DEBE HEREDAR DEL PADRE
			/*
			else if(paginaTipo.equals(PaginaTipo.FORMULARIO)) {
				sPathImagen=Constantes2.S_FONDOBORDE_IMAGE+"_amarillo";
			}
			*/ 
		}
		
		return sPathImagen;
	}
	
	private Boolean conRepeatImage=true;
	private Image image=null;
	//private String sPathImagen="fondo_cabecera";//"fondo_titulo";
	
	@Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        image=FuncionesSwing.getImagenFondo(this.sPathImagen);//this.sPathImagen
        
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
	
	public Long getIdActual() {
		return idActual;
	}

	public void setIdActual(Long idActual) {
		this.idActual = idActual;
	}	
	
	public Boolean getEsUsoDesdeHijo() {
		return esUsoDesdeHijo;
	}

	public void setEsUsoDesdeHijo(Boolean esUsoDesdeHijo) {
		this.esUsoDesdeHijo = esUsoDesdeHijo;
	}

	public Usuario getUsuarioActual() {
		return usuarioActual;
	}

	public void setUsuarioActual(Usuario usuarioActual) {
		this.usuarioActual = usuarioActual;
	}

	
	public ParametroGeneralSg getParametroGeneralSg() {
		return parametroGeneralSg;
	}

	public void setParametroGeneralSg(ParametroGeneralSg parametroGeneralSg) {
		this.parametroGeneralSg = parametroGeneralSg;
	}

	
	public ParametroGeneralUsuario getParametroGeneralUsuario() {
		return parametroGeneralUsuario;
	}

	public void setParametroGeneralUsuario(
			ParametroGeneralUsuario parametroGeneralUsuario) {
		this.parametroGeneralUsuario = parametroGeneralUsuario;
	}

	public Modulo getModuloActual() {
		return moduloActual;
	}

	public void setModuloActual(Modulo moduloActual) {
		this.moduloActual = moduloActual;
	}

	
	public Opcion getOpcionActual() {
		return opcionActual;
	}

	public void setOpcionActual(Opcion opcionActual) {
		this.opcionActual = opcionActual;
	}

	
	
	public String getsPathImagen() {
		return sPathImagen;
	}

	public void setsPathImagen(String sPathImagen) {
		this.sPathImagen = sPathImagen;
	}

	public String getsPath() {
		return sPath;
	}

	public void setsPath(String sPath) {
		this.sPath= sPath;
	}
	
	public String getsTipoTamanioGeneral() {
		return sTipoTamanioGeneral;
	}

	public void setsTipoTamanioGeneral(String sTipoTamanioGeneral) {
		this.sTipoTamanioGeneral = sTipoTamanioGeneral;
	}

	public String getsTipoTamanioGeneralTabla() {
		return sTipoTamanioGeneralTabla;
	}

	public void setsTipoTamanioGeneralTabla(String sTipoTamanioGeneralTabla) {
		this.sTipoTamanioGeneralTabla = sTipoTamanioGeneralTabla;
	}
	
	public Boolean getConTipoTamanioManual() {
		return conTipoTamanioManual;
	}

	public void setConTipoTamanioManual(Boolean conTipoTamanioManual) {
		this.conTipoTamanioManual = conTipoTamanioManual;
	}

	public Boolean getConTipoTamanioTodo() {
		return conTipoTamanioTodo;
	}

	public void setConTipoTamanioTodo(Boolean conTipoTamanioTodo) {
		this.conTipoTamanioTodo = conTipoTamanioTodo;
	}

	public void initializeJProgressBar() throws PropertyVetoException{
		this.splashScreenJInternalFrame=new SplashScreenJInternalFrame();
		this.jPanelProgressProcess.setVisible(false);
		
		//this.splashScreenJInternalFrame.setVisible(true);
        //this.splashScreenJInternalFrame.setSelected(true);
		
		if(this.jDesktopPane!=null) {
			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.splashScreenJInternalFrame);
			
			this.jDesktopPane.add(this.splashScreenJInternalFrame);
			this.splashScreenJInternalFrame.setVisible(false);
	        this.splashScreenJInternalFrame.setSelected(false);
	        
			this.estaCerradoSplashScreen=true;
		}
		
		/*
		this.jProgressBar = new JProgressBar(0, 100);
		this.jProgressBar.setValue(0);
		this.jProgressBar.setStringPainted(true);
		
		this.jProgressBar.setMinimumSize(new Dimension(100,25));
		this.jProgressBar.setMaximumSize(new Dimension(100,25));
		this.jProgressBar.setPreferredSize(new Dimension(100,25));
		*/
	}
	
	
	public void setJProgressBarToJPanel(){
		/*
		GridBagLayout gridaBagLayoutJProgress = new GridBagLayout();
	
		this.jPanelProgressProcess.setLayout(gridaBagLayoutJProgress);
		
		GridBagConstraints gridBagConstraintsJProgress = new GridBagConstraints();
		gridBagConstraintsJProgress.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsJProgress.gridy = 0;
		gridBagConstraintsJProgress.gridx = 0;
		gridBagConstraintsJProgress.ipadx= 100;
		gridBagConstraintsJProgress.ipady= 20;
		
		this.jPanelProgressProcess.setVisible(false);
		this.jPanelProgressProcess.add(jProgressBar, gridBagConstraintsJProgress);
		*/
	}
	
	
	
	
	public void startProcess()throws Exception{
		
		try {
			
			this.cursor=this.getCursor();
			
			//this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
			
			this.setCursor(ConstantesSwing.CURSOR_PROCESANDO);
			//this.setCursor(FuncionesSwing.getCursorProcesando());  
			
			
			if(!this.estaCerradoSplashScreen) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.splashScreenJInternalFrame);
				
				this.jDesktopPane.add(this.splashScreenJInternalFrame);				
		        
				this.estaCerradoSplashScreen=true;
			}
			
			//System.out.println("antes cursor"+new Date(System.currentTimeMillis()));			
			
			this.splashScreenJInternalFrame.setVisible(true);
	        this.splashScreenJInternalFrame.setSelected(true);
	        
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
	        this.splashScreenJInternalFrame.startProcess();
	        
			//this.startProcessJProgressBar();
			//System.out.println("despues start progress"+new Date(System.currentTimeMillis()));			
			
			//this.finishProcessJProgressBar();	
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void startProcessJProgressBar() throws Exception{
		
		
		this.splashScreenJInternalFrame.startProcess();
		/*
		this.jPanelProgressProcess.setVisible(true);
		this.jProgressBar.setVisible(true);		
		this.jProgressBar.setString("Procesando...");
		this.jProgressBar.setIndeterminate(true);
		*/
						//this.jProgressBar.setValue(this.jProgressBar.getMinimum());		
	}

	public void finishProcess()throws Exception{
		
		try {
				
			this.splashScreenJInternalFrame.setVisible(false);
	        this.splashScreenJInternalFrame.setSelected(false);
	        
			//this.startProcessJProgressBar();
			
	        //LLAMADA DIRECTA
	        this.splashScreenJInternalFrame.finishProcess();
	        
			//this.finishProcessJProgressBar();
			
			
			//PARA DEPUTAR
			/*
			this.splashScreenJInternalFrame.setVisible(true);
	        this.splashScreenJInternalFrame.setSelected(true);	        	        
	        this.splashScreenJInternalFrame.jProgressBar.setVisible(true);
	        this.splashScreenJInternalFrame.getjLabelImagen().setVisible(true);
	        */
			
			//this.splashScreenJInternalFrame.jProgressBar.setString("PROCESANDO");	
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
			
		}  finally {
			this.setCursor(ConstantesSwing.CURSOR_DEFECTO);
			
			//this.setCursor(FuncionesSwing.getCursorDefecto());  
			//this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			
			//this.setCursor(this.cursor);
		}
	}
	
	
	
	public void finishProcessJProgressBar() throws Exception{
		this.splashScreenJInternalFrame.finishProcess();
		/*
		this.jPanelProgressProcess.setVisible(false);
		this.jProgressBar.setVisible(false);		
		this.jProgressBar.setString(null);		
		this.jProgressBar.setIndeterminate(false);
		*/ 
					//this.jProgressBar.setValue(this.jProgressBar.getMaximum());
	}
	
	public static void enableDisablePanels(Boolean isEnable,JTabbedPane jTabbedPaneBusquedas,JPanel jPanelParametrosReportes,JScrollPane jScrollPaneTablaDatos,JPanel jPanelPaginacion,JScrollPane jScrollPaneDatosEdicion,JPanel jPanelAcciones){
		
		if(jTabbedPaneBusquedas!=null) {
			jTabbedPaneBusquedas.setEnabled(isEnable);
			FuncionesSwing.enableDisableComponents(jTabbedPaneBusquedas,isEnable,1,2);
		}
		
		jPanelParametrosReportes.setEnabled(isEnable);
		FuncionesSwing.enableDisableComponents(jPanelParametrosReportes,isEnable,1,2);
		
		jScrollPaneTablaDatos.setEnabled(isEnable);
		FuncionesSwing.enableDisableComponents(jScrollPaneTablaDatos,isEnable,1,2);
		
		jPanelPaginacion.setEnabled(isEnable);
		FuncionesSwing.enableDisableComponents(jPanelPaginacion,isEnable,1,2);
		
		jScrollPaneDatosEdicion.setEnabled(isEnable);
		FuncionesSwing.enableDisableComponents(jScrollPaneDatosEdicion,isEnable,1,2);
		
		jPanelAcciones.setEnabled(isEnable);
		FuncionesSwing.enableDisableComponents(jPanelAcciones,isEnable,1,2);						
	}
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}

	public String getsTipoBusqueda() {
		return sTipoBusqueda;
	}

	public void setsTipoBusqueda(String sTipoBusqueda) {
		this.sTipoBusqueda = sTipoBusqueda;
	}
	
	
	public String getsTipoProceso() {
		return sTipoProceso;
	}

	public void setsTipoProceso(String sTipoProceso) {
		this.sTipoProceso = sTipoProceso;
	}

	
	public PaginaTipo getPaginaTipo() {
		return paginaTipo;
	}

	public void setPaginaTipo(PaginaTipo paginaTipo) {
		this.paginaTipo = paginaTipo;
	}

	public void procesarBusqueda(String sAccionBusqueda) throws Exception {
		
	}
	
	public void buscarPorId(Long idActual) throws Exception {
		
	}
	
	//USADO EN IdTableCell
	public Boolean esParaBusquedaForeignKey=false;
	
	public void jButtonIdActionPerformed(java.awt.event.ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar) { 
		
	}
	//USADO EN IdTableCell
	
	//USADO EN CLASES AUXILIARES
	public void procesoActualizarFilaTotales() {
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		
	}

	public void jButtonRelacionActionPerformed(String sTipo,java.awt.event.ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado) {
		
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		String sDescripcion="";
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		Color color=Color.WHITE;
		
		return color;
	}
	
	public void jButtonActionPerformedGeneral(String sTipo,java.awt.event.ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jTextFieldActionPerformedGeneral(String sTipo,java.awt.event.ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,java.awt.event.ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	//NO EXISTE, NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,java.awt.event.ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,java.awt.event.ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jDateChooserActionPerformedGeneral(String sTipo,java.awt.event.ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,java.awt.event.ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,java.awt.event.ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jComboBoxActionPerformedGeneral(String sTipo,java.awt.event.ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jComboBoxItemStateChangedGeneral(String sTipo,java.awt.event.ItemEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	//USADO EN CLASES AUXILIARES	
	public void actualizarObjetoPadreFk(String sTipo) throws Exception {
		
	}
	
	
	//PARA EVENTOS CONTROLES TABLA
	@SuppressWarnings("rawtypes")
	public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
	
	}
	
	public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
	
	}
	
	public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		
	}
	
	public void setHotKeysJLabelGenerico(JLabel lLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		
	}
	
	public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		
	}
	
	public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		
	}

	public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		
	}
	
	public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
			Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
			Object evt,GeneralEntityParameterGeneral generalEntityParameterGeneral,Object otro) 
	{		
		try {
			
			
			
		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 
		
	}
}
