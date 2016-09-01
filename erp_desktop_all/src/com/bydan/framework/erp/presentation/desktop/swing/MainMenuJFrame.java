package com.bydan.framework.erp.presentation.desktop.swing;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;

import org.apache.log4j.Logger;



//import com.bydan.erp.service.ejb.interfaces.TipoProfeciaImplementable;
//import com.bydan.erp.util.TipoProfeciaConstantesFunciones;
import com.bydan.framework.ConstantesCommon;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.framework.erp.util.Constantes;
import com.bydan.framework.erp.util.Constantes2;
import com.bydan.framework.erp.util.ConstantesSwing;
import com.bydan.framework.erp.util.Funciones;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.business.logic.ResumenUsuarioLogic;
import com.bydan.erp.seguridad.business.logic.ResumenUsuarioLogicAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;
import com.bydan.erp.seguridad.business.logic.UsuarioLogicAdditional;
//import com.bydan.erp.seguridad.service.ejb.interfaces.OpcionImplementable;
//import com.bydan.erp.seguridad.service.ejb.interfaces.ResumenUsuarioImplementable;
//import com.bydan.erp.seguridad.service.ejb.interfaces.ResumenUsuarioImplementableHome;
//import com.bydan.erp.seguridad.service.ejb.interfaces.SistemaImplementable;
//import com.bydan.erp.seguridad.service.ejb.interfaces.SistemaImplementableHome;
import com.bydan.erp.seguridad.util.OpcionConstantesFunciones;
import com.bydan.erp.seguridad.util.ResumenUsuarioConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.TipoVisualConstantesFunciones;

import java.awt.event.*;
import java.awt.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Set;

@SuppressWarnings("unused")
public class MainMenuJFrame extends JFrameMe implements Runnable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//protected static SistemaImplementable sistemaImplementable=SistemaConstantesFunciones.getSistemaImplementableEjbReference(SistemaConstantesFunciones.SREMOTEEJBNAME_RMI);
	//protected static SistemaImplementableHome sistemaImplementableHome= SistemaConstantesFunciones.getSistemaImplementableHomeEjbReference(SistemaConstantesFunciones.SLOCALEJBNAME_RMI);
		
	//protected static ResumenUsuarioImplementable resumenUsuarioImplementable=ResumenUsuarioConstantesFunciones.getResumenUsuarioImplementableEjbReference(ResumenUsuarioConstantesFunciones.SREMOTEEJBNAME_RMI);//LoginJFrame.lookupRemoteStatelessCalculator2();//
	//protected static ResumenUsuarioImplementableHome resumenUsuarioImplementableHome=ResumenUsuarioConstantesFunciones.getResumenUsuarioImplementableHomeEjbReference(ResumenUsuarioConstantesFunciones.SREMOTEEJBNAME);//LoginJFrame.lookupRemoteStatelessCalculator2();//
	
	protected SistemaLogicAdditional sistemaLogicAdditional;
	protected UsuarioLogicAdditional usuarioLogicAdditional;	
	protected ResumenUsuarioLogic resumenUsuarioLogic;
	protected ResumenUsuarioLogicAdditional resumenUsuarioLogicAdditional;
	
	protected DatosCliente datosCliente;
	protected Usuario usuarioActual=null;
	protected ParametroGeneralSg parametroGeneralSg=null;
	protected ParametroGeneralUsuario parametroGeneralUsuario=null;
	protected ResumenUsuario resumenUsuarioActual;
	protected Constantes2 constantes2=null;
	protected Modulo moduloUsuario=null;
	
	protected LoginJFrame loginJFrame;
	protected MapaSitioJFrame mapaSitioJFrame;
	protected MemoriaSitioJFrame memoriaSitioJFrame;
	private JButton jButtonMenu;
    private JLabel jLabelMenu;
   
    private JButton jButtonMenuCambiarEmpresaSucursal;
    private JButton jButtonMenuCambiarEjercicioPeriodo;
    private JButton jButtonMenuCambiarParametrosGenerales;
    private JButton jButtonMenuVisual;
    private JButton jButtonLogin1;
    private JButton jButtonLogin2;
    private JButton jButtonMapa;
    private JButton jButtonMemoria;
    
    private JPanel jContentPane;
    private JPanel jPanelMenu;
    private JPanel jPanelMenuAcciones;
    
    static final int xOffset = 10, yOffset = 10;
    
    private static Logger logger = Logger.getLogger(MainMenuJFrame.class);  
    
    protected JMenuBar jmenuBarPrincipal;
    
    protected JMenu jmenuAcciones;
    protected JMenu jmenuModulos;
    
    protected JMenuItem jMenuItemLogin;
    protected JMenuItem jMenuItemEmpresaSucursal;
    protected JMenuItem jMenuItemEjercicioPeriodo;
    protected JMenuItem jMenuItemParametrosGenerales;
    protected JMenuItem jMenuItemVisual;
    
    protected JMenuItem jMenuItemModulo;
    
    public JInternalFrameBase JInternalFrameBaseAuxiliar=null;
    
    public JDesktopPaneMe desktop;
    
    public MainMenuJFrame mainMenuJFrame;
    public String sTipo="";
    public String sTipoFinal="";
    
    public MainMenuJFrame(MainMenuJFrame mainMenuJFrame,String sTipo) throws Exception {
    	this.mainMenuJFrame=mainMenuJFrame;
    	this.sTipo=sTipo;
    }
    
    public void cargarMenusModulo(Modulo moduloUsuario) {
  		//PRINCIPAL
  		//this.jmenuModulos=new JMenuMe("MODULOS");
  		//PRINCIPAL_FIN
  		
  		//moduloUsuario.gettecla().charAt(0)
    	
    	//this.jMenuItemModulo= new JMenuItem(moduloUsuario.getnombre().trim() + FuncionesSwing.getKeyMensaje(moduloUsuario.getcodigo().trim()));
    	
    	this.jMenuItemModulo= new JMenuItem(moduloUsuario.getnombre().trim() + MainMenuJFrame.getStringTeclaMascara(moduloUsuario.getid_tipo_tecla_mascara(),moduloUsuario.gettecla()));//" (Ctrl + "+moduloUsuario.gettecla().charAt(0)+")");
    	
	  	this.jMenuItemModulo.setActionCommand(moduloUsuario.getcodigo().trim());
	  	this.jMenuItemModulo.setName(moduloUsuario.getId().toString());
	  	
	  	FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModulo,moduloUsuario.getcodigo().replace(" ", "").toLowerCase().trim(),moduloUsuario.getnombre().trim());
	  	FuncionesSwing.setBoldMenuItem(this.jMenuItemModulo, this.JInternalFrameBaseAuxiliar.getsTipoTamanioGeneral(),false,true,this.JInternalFrameBaseAuxiliar);
	  	
	  	this.jMenuItemModulo.addActionListener (new ButtonModuloJFrameMeActionListener(this,moduloUsuario));
	  		
	  	this.jmenuModulos.add(this.jMenuItemModulo);
    	
  		
  		
  		//PRINCIPAL
  		
  		//this.jmenuAcciones.add(this.jMenuItemLogin);
  		
  		
  		
  		//PRINCIPAL_FIN
  		
  		//PRINCIPAL
  		//this.jmenuBarPrincipal.add(this.jmenuModulos);		
  		//PRINCIPAL_FIN  	
  			
  	}
    
    public void cargarMenus() {
		this.jmenuBarPrincipal=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuAcciones=new JMenuMe("ACCIONES");
		this.jmenuModulos=new JMenuMe("MODULOS");
		
		FuncionesSwing.setBoldMenu(this.jmenuAcciones, this.JInternalFrameBaseAuxiliar.getsTipoTamanioGeneral(),false,true,this.JInternalFrameBaseAuxiliar);
		FuncionesSwing.setBoldMenu(this.jmenuModulos, this.JInternalFrameBaseAuxiliar.getsTipoTamanioGeneral(),false,true,this.JInternalFrameBaseAuxiliar);
		//PRINCIPAL_FIN
		
					
		this.jMenuItemLogin= new JMenuItem("Ir Login" + FuncionesSwing.getKeyMensaje("IR_LOGIN"));
		this.jMenuItemLogin.setActionCommand("IR_LOGIN");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemLogin,"login","Ir Login");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemLogin, this.JInternalFrameBaseAuxiliar.getsTipoTamanioGeneral(),false,true,this.JInternalFrameBaseAuxiliar);
		
		this.jMenuItemLogin.addActionListener (new ButtonJFrameMeActionListener(this,"IrLogin"));
		
		
		this.jMenuItemEmpresaSucursal= new JMenuItem("Actualizar Empresa Sucursal" + FuncionesSwing.getKeyMensaje("CAMBIAR_EMPRESA_SUCURSAL"));
		this.jMenuItemEmpresaSucursal.setActionCommand("CAMBIAR_EMPRESA_SUCURSAL");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEmpresaSucursal,"empresa_sucursal","Actualizar Empresa Sucursal");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEmpresaSucursal, this.JInternalFrameBaseAuxiliar.getsTipoTamanioGeneral(),false,true,this.JInternalFrameBaseAuxiliar);
		
		this.jMenuItemEmpresaSucursal.addActionListener (new ButtonJFrameMeActionListener(this,"CambiarEmpresaSucursal"));
		
		
		this.jMenuItemEjercicioPeriodo= new JMenuItem("Actualizar Ejercicio Periodo" + FuncionesSwing.getKeyMensaje("CAMBIAR_EJERCICIO_PERIODO"));
		this.jMenuItemEjercicioPeriodo.setActionCommand("CAMBIAR_EJERCICIO_PERIODO");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEjercicioPeriodo,"ejercicio_periodo","Actualizar Ejercicio Periodo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEjercicioPeriodo, this.JInternalFrameBaseAuxiliar.getsTipoTamanioGeneral(),false,true,this.JInternalFrameBaseAuxiliar);
		
		this.jMenuItemEjercicioPeriodo.addActionListener (new ButtonJFrameMeActionListener(this,"CambiarEjercicioPeriodo"));
		
		
		this.jMenuItemParametrosGenerales= new JMenuItem("Actualizar Parametros Generales" + FuncionesSwing.getKeyMensaje("CAMBIAR_PARAMETROS_GENERALES"));
		this.jMenuItemParametrosGenerales.setActionCommand("CAMBIAR_PARAMETROS_GENERALES");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemParametrosGenerales,"parametros_generales","Actualizar Parametros Generales");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemParametrosGenerales, this.JInternalFrameBaseAuxiliar.getsTipoTamanioGeneral(),false,true,this.JInternalFrameBaseAuxiliar);
		
		this.jMenuItemParametrosGenerales.addActionListener (new ButtonJFrameMeActionListener(this,"CambiarParametrosGenerales"));
	
		
		this.jMenuItemVisual= new JMenuItem("Actualizar Visual" + FuncionesSwing.getKeyMensaje("ACTUALIZAR_VISUAL"));
		this.jMenuItemVisual.setActionCommand("ACTUALIZAR_VISUAL");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVisual,"visual","Actualizar Visual");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVisual, this.JInternalFrameBaseAuxiliar.getsTipoTamanioGeneral(),false,true,this.JInternalFrameBaseAuxiliar);
		
		this.jMenuItemVisual.addActionListener (new ButtonJFrameMeActionListener(this,"ActualizarVisual"));
		
		//PRINCIPAL
		
		this.jmenuAcciones.add(this.jMenuItemLogin);
		this.jmenuAcciones.add(this.jMenuItemEmpresaSucursal);
		this.jmenuAcciones.add(this.jMenuItemEjercicioPeriodo);		
		this.jmenuAcciones.add(this.jMenuItemParametrosGenerales);
		this.jmenuAcciones.add(this.jMenuItemVisual);
		
		
		//PRINCIPAL_FIN
		
		//PRINCIPAL
		this.jmenuBarPrincipal.add(this.jmenuAcciones);	
		this.jmenuBarPrincipal.add(this.jmenuModulos);
		//PRINCIPAL_FIN
		
		
		
		
		//AGREGA MENU A PANTALLA
		this.setJMenuBar(this.jmenuBarPrincipal);
		
			
	}
    
    public MainMenuJFrame(LoginJFrame loginJFrame,Usuario usuario,ResumenUsuario resumenUsuario,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,JDesktopPaneMe desktop,Constantes2 constantes2) throws Exception{
    	try {
    		//EntityManagerFactory JPAENTITYMANAGERFACTORY= Persistence.createEntityManagerFactory("PersistenceUnitSeguridad");
    		
    		this.setCursor(ConstantesSwing.CURSOR_DEFECTO);
    		
    		this.loginJFrame=loginJFrame;
    		this.desktop=desktop;
    		this.mapaSitioJFrame=new MapaSitioJFrame();
    		this.memoriaSitioJFrame=new MemoriaSitioJFrame();	System.out.println("Nueva Memoria");
    		this.datosCliente=new DatosCliente();
    		this.sistemaLogicAdditional=new SistemaLogicAdditional();
    		this.usuarioLogicAdditional=new UsuarioLogicAdditional();
    		this.usuarioActual=usuario;
    		this.resumenUsuarioActual=resumenUsuario;
    		
    		this.parametroGeneralSg=parametroGeneralSg;
    		this.parametroGeneralUsuario=parametroGeneralUsuario;	
    		
    		this.constantes2=constantes2;
    		
    		this.resumenUsuarioLogic=new ResumenUsuarioLogic();
    		this.resumenUsuarioLogicAdditional=new ResumenUsuarioLogicAdditional();
    		
    		this.JInternalFrameBaseAuxiliar=new JInternalFrameBase();
    		
    		this.JInternalFrameBaseAuxiliar.setParametroGeneralUsuario(this.parametroGeneralUsuario);
    		
    		this.JInternalFrameBaseAuxiliar.setsTipoTamanioGeneral(FuncionesSwing.getTipoTamanioGeneral(this.JInternalFrameBaseAuxiliar,this.parametroGeneralUsuario,false,false));
    		this.JInternalFrameBaseAuxiliar.setsTipoTamanioGeneralTabla(FuncionesSwing.getTipoTamanioGeneralTabla(this.JInternalFrameBaseAuxiliar,this.parametroGeneralUsuario,false,false));
    		this.JInternalFrameBaseAuxiliar.setConTipoTamanioTodo(FuncionesSwing.getConTipoTamanioTodo(this.JInternalFrameBaseAuxiliar,this.parametroGeneralUsuario,false,false));
    		
    		
    		this.cargarMenus();
    		
    		this.initComponents();    		    		
    		
    		SwingUtilities.updateComponentTreeUI(this);
    		    		
    		if(Constantes.ISDEVELOPING) {
    			System.out.println("***** FIN MENU MODULOS *****");
    		}
    		//this.habilitarDeshabilitarControlesMainMenu(false);
    		
    	} catch(Exception e) {
    		FuncionesSwing.manageException(this, e);
    	}
    }

      private void initComponents() throws Exception {
    	//String sTitulo="MODULOS "+this.parametroGeneralSg.getnombre_sistema()+" VERSION "+this.parametroGeneralSg.getversion_sistema();
    	String sTitulo=Funciones.GetTituloSistema(this.parametroGeneralSg,new Modulo(),this.usuarioActual);
		
    	//int intX=Toolkit.getDefaultToolkit().getScreenSize().width/3-this.getWidth();
    	int intX=Toolkit.getDefaultToolkit().getScreenSize().width/5-this.getWidth();
    	int intY=5;//Toolkit.getDefaultToolkit().getScreenSize().height/12-this.getHeight();
    	
    	//this.setLocation(intX, intY);
    	this.setLocation(intX, intY);
    	
    	this.setTitle(sTitulo);
    	
    	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();		
		//this.setSize((screenSize.width-xOffset*3)/2,screenSize.height-yOffset*5);
    	this.setSize((screenSize.width/3)*2,screenSize.height-yOffset*5);
    	
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle(sTitulo);
        
        
        this.setIconImage(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE));
        
    	//this.jLabelMenu = new JLabel();
    	//this.jLabelMenu.setText("Menu"); 
    	 
        Boolean conPanelAcciones=true;
        JPanel jPanelGeneral=null;
              
        this.jContentPane = new JPanelMe("fondo_content",true);//fondo_formulario        
        this.jPanelMenu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
          
        this.jPanelMenu.setBorder(javax.swing.BorderFactory.createTitledBorder("MODULOS"/*sTitulo*/));
        this.jPanelMenu.setToolTipText(sTitulo);
        this.jPanelMenu.setName("MODULOS"); 
        
        FuncionesSwing.setBoldPanel(this.jPanelMenu, this.JInternalFrameBaseAuxiliar.getsTipoTamanioGeneral(),false,true,this.JInternalFrameBaseAuxiliar);
        
        
        this.jPanelMenuAcciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        
        this.jPanelMenuAcciones.setBorder(javax.swing.BorderFactory.createTitledBorder("ACCIONES"/*sTitulo*/));
        this.jPanelMenuAcciones.setToolTipText("ACCIONES");
        this.jPanelMenuAcciones.setName("ACCIONES"); 
       		
        FuncionesSwing.setBoldPanel(this.jPanelMenuAcciones, this.JInternalFrameBaseAuxiliar.getsTipoTamanioGeneral(),false,true,this.JInternalFrameBaseAuxiliar);
        
        
        this.jContentPane.setLayout(new GridBagLayout());
        this.jPanelMenu.setLayout(new GridBagLayout());
        this.jPanelMenuAcciones.setLayout(new GridBagLayout());
        
       // GridBagLayout gridaBagLayout= new GridBagLayout();
        
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        int iGridY=0;
        
        String sMapKey = "CTRL_1";
		InputMap inputMap =null;
		
        //AGREGO LABEL	
        /*		
		gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridx = 0;
		
		this.jPanelMenu.add(this.jLabelMenu, gridBagConstraints);
		*/
        
		
        this.jButtonLogin1 = new JButtonMe();   
		this.jButtonLogin1.setName("IR A LOGIN");
        this.jButtonLogin1.setText("IR A LOGIN");
        FuncionesSwing.addImagenButtonGeneral(this.jButtonLogin1,"login","IR A LOGIN");            	
        FuncionesSwing.setBoldButton(this.jButtonLogin1, this.JInternalFrameBaseAuxiliar.getsTipoTamanioGeneral(),false,true,this.JInternalFrameBaseAuxiliar);
        
        this.jButtonLogin1.setToolTipText("IR LOGIN "+FuncionesSwing.getKeyMensaje("IR_LOGIN"));
        
        this.jButtonLogin1.addActionListener(new ButtonJFrameMeActionListener(this,"IrLogin"));
        
        inputMap = this.jButtonLogin1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("IR_LOGIN") , FuncionesSwing.getMaskKey("IR_LOGIN")), sMapKey);	
		this.jButtonLogin1.getActionMap().put(sMapKey, new ButtonJFrameMeAbstractAction(this,"IrLogin"));
		
		
		
		
		//MAPA
		this.jButtonMapa = new JButtonMe();   
		this.jButtonMapa.setName("MAPA DEL SISTEMA");
        this.jButtonMapa.setText("MAPA DEL SISTEMA");
        FuncionesSwing.addImagenButtonGeneral(this.jButtonMapa,"login","MAPA DEL SISTEMA");            	
        FuncionesSwing.setBoldButton(this.jButtonMapa, this.JInternalFrameBaseAuxiliar.getsTipoTamanioGeneral(),false,true,this.JInternalFrameBaseAuxiliar);
        
        this.jButtonMapa.setToolTipText("MAPA DEL SISTEMA "+FuncionesSwing.getKeyMensaje("MAPA_SISTEMA"));
        
        this.jButtonMapa.addActionListener(new ButtonJFrameMeActionListener(this,"MapaSistema"));
        
        inputMap = this.jButtonMapa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MAPA_SISTEMA") , FuncionesSwing.getMaskKey("MAPA_SISTEMA")), sMapKey);	
		this.jButtonMapa.getActionMap().put(sMapKey, new ButtonJFrameMeAbstractAction(this,"MapaSistema"));
		//MAPA
		
		
		
		//MEMORIA
		this.jButtonMemoria = new JButtonMe();   
		this.jButtonMemoria.setName("MEMORIA DEL SISTEMA");
        this.jButtonMemoria.setText("MEMORIA DEL SISTEMA");
        FuncionesSwing.addImagenButtonGeneral(this.jButtonMemoria,"login","MEMORIA DEL SISTEMA");            	
        FuncionesSwing.setBoldButton(this.jButtonMemoria, this.JInternalFrameBaseAuxiliar.getsTipoTamanioGeneral(),false,true,this.JInternalFrameBaseAuxiliar);
        
        this.jButtonMemoria.setToolTipText("MEMORIA DEL SISTEMA "+FuncionesSwing.getKeyMensaje("MEMORIA_SISTEMA"));
        
        this.jButtonMemoria.addActionListener(new ButtonJFrameMeActionListener(this,"MemoriaSistema"));
        
        inputMap = this.jButtonMemoria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MEMORIA_SISTEMA") , FuncionesSwing.getMaskKey("MEMORIA_SISTEMA")), sMapKey);	
		this.jButtonMemoria.getActionMap().put(sMapKey, new ButtonJFrameMeAbstractAction(this,"MemoriaSistema"));
		//MEMORIA

		
		
		
        /*
        this.jButtonLogin1.addActionListener (
	        	new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                try {
		                	jButtonIrLoginActionPerformed(evt);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		            }
		        }
	    );
        */
        
        gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints.gridy = iGridY++;
		gridBagConstraints.gridx = 0;
		
		
		if(!conPanelAcciones) {
			this.jPanelMenu.add(this.jButtonLogin1, gridBagConstraints);
		} else {
			this.jPanelMenuAcciones.add(this.jButtonLogin1, gridBagConstraints);
		}
		
		
		
		//MAPA
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints.gridy = iGridY++;
		gridBagConstraints.gridx = 0;
			
			
		if(!conPanelAcciones) {
			this.jPanelMenu.add(this.jButtonMapa, gridBagConstraints);
		} else {
			this.jPanelMenuAcciones.add(this.jButtonMapa, gridBagConstraints);
		}
		//MAPA
		
		
		
		//MAPA
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints.gridy = iGridY++;
		gridBagConstraints.gridx = 0;
			
			
		if(!conPanelAcciones) {
			this.jPanelMenu.add(this.jButtonMemoria, gridBagConstraints);
		} else {
			this.jPanelMenuAcciones.add(this.jButtonMemoria, gridBagConstraints);
		}
		//MAPA

		
		
		//ACTUALIZAR EMPRESA SUCURSAL
		this.jButtonMenuCambiarEmpresaSucursal = new JButtonMe();   
		this.jButtonMenuCambiarEmpresaSucursal.setName("CAMBIAR EMPRESA SUCURSAL");
        this.jButtonMenuCambiarEmpresaSucursal.setText("CAMBIAR EMPRESA SUCURSAL");
        FuncionesSwing.addImagenButtonGeneral(this.jButtonMenuCambiarEmpresaSucursal,"empresa_sucursal","ACTUALIZAR EMPRESA SUCURSAL");            	
        FuncionesSwing.setBoldButton(this.jButtonMenuCambiarEmpresaSucursal, this.JInternalFrameBaseAuxiliar.getsTipoTamanioGeneral(),false,true,this.JInternalFrameBaseAuxiliar);
        
        this.jButtonMenuCambiarEmpresaSucursal.setToolTipText("CAMBIAR EMPRESA SUCURSAL "+FuncionesSwing.getKeyMensaje("CAMBIAR_EMPRESA_SUCURSAL"));
        
        this.jButtonMenuCambiarEmpresaSucursal.addActionListener(new ButtonJFrameMeActionListener(this,"CambiarEmpresaSucursal"));
        
        inputMap = this.jButtonMenuCambiarEmpresaSucursal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CAMBIAR_EMPRESA_SUCURSAL") , FuncionesSwing.getMaskKey("CAMBIAR_EMPRESA_SUCURSAL")), sMapKey);	
		this.jButtonMenuCambiarEmpresaSucursal.getActionMap().put(sMapKey, new ButtonJFrameMeAbstractAction(this,"CambiarEmpresaSucursal"));
		
        /*
        this.jButtonMenuCambiarEmpresaSucursal.addActionListener (
	        	new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                try {
		                	jButtonCambiarEmpresaSucursalActionPerformed(evt);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		            }
		        }
	    );
        */
        
        gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints.gridy = iGridY++;
		gridBagConstraints.gridx = 0;
		
		
		if(!conPanelAcciones) {
			this.jPanelMenu.add(this.jButtonMenuCambiarEmpresaSucursal, gridBagConstraints);
		} else {
			this.jPanelMenuAcciones.add(this.jButtonMenuCambiarEmpresaSucursal, gridBagConstraints);
		}
		
		
		
		
		//ACTUALIZAR EJERCICIO PERIODO
		this.jButtonMenuCambiarEjercicioPeriodo = new JButtonMe();   
		this.jButtonMenuCambiarEjercicioPeriodo.setName("CAMBIAR EJERCICIO PERIODO");
        this.jButtonMenuCambiarEjercicioPeriodo.setText("CAMBIAR EJERCICIO PERIODO");
        FuncionesSwing.addImagenButtonGeneral(this.jButtonMenuCambiarEjercicioPeriodo,"ejercicio_periodo","ACTUALIZAR EJERCICIO PERIODO");            	
        FuncionesSwing.setBoldButton(this.jButtonMenuCambiarEjercicioPeriodo, this.JInternalFrameBaseAuxiliar.getsTipoTamanioGeneral(),false,true,this.JInternalFrameBaseAuxiliar);
        
        this.jButtonMenuCambiarEjercicioPeriodo.setToolTipText("CAMBIAR EJERCICIO PERIODO "+FuncionesSwing.getKeyMensaje("CAMBIAR_EJERCICIO_PERIODO"));
        
        this.jButtonMenuCambiarEjercicioPeriodo.addActionListener(new ButtonJFrameMeActionListener(this,"CambiarEjercicioPeriodo"));
        
        
        inputMap = this.jButtonMenuCambiarEjercicioPeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CAMBIAR_EJERCICIO_PERIODO") , FuncionesSwing.getMaskKey("CAMBIAR_EJERCICIO_PERIODO")), sMapKey);	
		this.jButtonMenuCambiarEjercicioPeriodo.getActionMap().put(sMapKey, new ButtonJFrameMeAbstractAction(this,"CambiarEjercicioPeriodo"));
		
		
        /*
        this.jButtonMenuCambiarEjercicioPeriodo.addActionListener (
	        	new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                try {
		                	jButtonCambiarEjercicioPeriodoActionPerformed(evt);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		            }
		        }
	    );
        */
        
        gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints.gridy = iGridY++;
		gridBagConstraints.gridx = 0;
		
		
		if(!conPanelAcciones) {
			this.jPanelMenu.add(this.jButtonMenuCambiarEjercicioPeriodo, gridBagConstraints);
		} else {
			this.jPanelMenuAcciones.add(this.jButtonMenuCambiarEjercicioPeriodo, gridBagConstraints);
		}
		
		
		
				
		
		
		
		//ACTUALIZAR PARAMETROS GENERALES
		this.jButtonMenuCambiarParametrosGenerales = new JButtonMe();   
		this.jButtonMenuCambiarParametrosGenerales.setName("CAMBIAR PARAMETROS GENERALES");
        this.jButtonMenuCambiarParametrosGenerales.setText("CAMBIAR PARAMETROS GENERALES");
        FuncionesSwing.addImagenButtonGeneral(this.jButtonMenuCambiarParametrosGenerales,"parametros_generales","ACTUALIZAR PARAMETROS GENERALES");            	
        FuncionesSwing.setBoldButton(this.jButtonMenuCambiarParametrosGenerales, this.JInternalFrameBaseAuxiliar.getsTipoTamanioGeneral(),false,true,this.JInternalFrameBaseAuxiliar);
    	
        
        this.jButtonMenuCambiarParametrosGenerales.setToolTipText("CAMBIAR PARAMETROS GENERALES "+FuncionesSwing.getKeyMensaje("CAMBIAR_PARAMETROS_GENERALES"));
        
        this.jButtonMenuCambiarParametrosGenerales.addActionListener(new ButtonJFrameMeActionListener(this,"CambiarParametrosGenerales"));
        
        
        inputMap = this.jButtonMenuCambiarParametrosGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CAMBIAR_PARAMETROS_GENERALES") , FuncionesSwing.getMaskKey("CAMBIAR_PARAMETROS_GENERALES")), sMapKey);	
		this.jButtonMenuCambiarParametrosGenerales.getActionMap().put(sMapKey, new ButtonJFrameMeAbstractAction(this,"CambiarEjercicioPeriodo"));
		
		
        /*
        this.jButtonMenuCambiarEjercicioPeriodo.addActionListener (
	        	new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                try {
		                	jButtonCambiarEjercicioPeriodoActionPerformed(evt);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		            }
		        }
	    );
        */
        
        gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints.gridy = iGridY++;
		gridBagConstraints.gridx = 0;
		
		
		if(!conPanelAcciones) {
			this.jPanelMenu.add(this.jButtonMenuCambiarParametrosGenerales, gridBagConstraints);
		} else {
			this.jPanelMenuAcciones.add(this.jButtonMenuCambiarParametrosGenerales, gridBagConstraints);
		}
		
		
		
				
				
				//AGREGO BOTON VISUAL
				this.jButtonMenuVisual = new JButton();   
				this.jButtonMenuVisual.setName("ACTUALIZAR_VISUAL");
		        this.jButtonMenuVisual.setText("ACTUALIZAR VISUAL");
		        FuncionesSwing.addImagenButtonGeneral(this.jButtonMenuVisual,"visual","ACTUALIZAR_VISUAL");
		        FuncionesSwing.setBoldButton(this.jButtonMenuVisual, this.JInternalFrameBaseAuxiliar.getsTipoTamanioGeneral(),false,true,this.JInternalFrameBaseAuxiliar);
		        
		        this.jButtonMenuVisual.setToolTipText("ACTUALIZAR VISUAL"+FuncionesSwing.getKeyMensaje("ACTUALIZAR_VISUAL"));
		        
		        this.jButtonMenuVisual.addActionListener(new ButtonJFrameMeActionListener(this,"ActualizarVisual"));
		       
		        
		        inputMap = this.jButtonMenuVisual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
				inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR_VISUAL") , FuncionesSwing.getMaskKey("ACTUALIZAR_VISUAL")), sMapKey);	
				this.jButtonMenuVisual.getActionMap().put(sMapKey, new ButtonJFrameMeAbstractAction(this,"ActualizarVisual"));
				
				
		        /*
		        this.jButtonMenuVisual.addActionListener (
			        	new java.awt.event.ActionListener() {
				            public void actionPerformed(java.awt.event.ActionEvent evt) {
				                try {
				                	jButtonCambiarVisualActionPerformed(evt);
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
				            }
				        }
			    );
		        */
		        
		        
		        gridBagConstraints = new GridBagConstraints();
				gridBagConstraints.fill = GridBagConstraints.VERTICAL;
				gridBagConstraints.gridy = iGridY++;
				gridBagConstraints.gridx = 0;
				
				if(!conPanelAcciones) {
					this.jPanelMenu.add(this.jButtonMenuVisual, gridBagConstraints);
				} else {
					this.jPanelMenuAcciones.add(this.jButtonMenuVisual, gridBagConstraints);
				}
				
				
				
				
		ArrayList<Modulo> modulosUsuario=new ArrayList<Modulo>();
		 
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			modulosUsuario=new ArrayList<Modulo>(sistemaLogicAdditional.getModulosUsuario(usuarioActual, Constantes.LIDSISTEMAACTUAL));				
			
		} else if(Constantes.ISUSAEJBREMOTE) {
			//modulosUsuario=new ArrayList<Modulo>(sistemaImplementable.getModulosUsuario(usuarioActual, Constantes.LIDSISTEMAACTUAL));
		
		} else if(Constantes.ISUSAEJBHOME) {
			//modulosUsuario=new ArrayList<Modulo>(sistemaImplementableHome.getModulosUsuario(usuarioActual, Constantes.LIDSISTEMAACTUAL));		
		}
		
		//LUEGO DE LABEL Y BOTON VIENE 2
		//int iContador=3;
		//int iGridY=3;
		String sModuloLabel="";
		
		if(conPanelAcciones) {
			iGridY=0;
		}
		
		for(Modulo moduloUsuario:modulosUsuario) {	
			sModuloLabel=moduloUsuario.getnombre();
			
			if(Constantes.ISDEVELOPING) {
				sModuloLabel=moduloUsuario.getId()+"_"+sModuloLabel;
			}
			
			this.jButtonMenu = new JButtonMe();   
			this.jButtonMenu.setName(""+moduloUsuario.getId());
	        this.jButtonMenu.setText(sModuloLabel);
	        this.jButtonMenu.setToolTipText(sModuloLabel+MainMenuJFrame.getStringTeclaMascara(moduloUsuario.getid_tipo_tecla_mascara(),moduloUsuario.gettecla()));
	        this.jButtonMenu.setBackground(Color.WHITE);
	        
	        String sImagenLocation = moduloUsuario.getcodigo().replace(" ", "").toLowerCase().trim() + ".gif";
	        
	        URL urlImagen = AuxiliarImagenes.class.getResource(sImagenLocation);
	        
	        if (urlImagen != null) {                     
	        	this.jButtonMenu.setIcon(new ImageIcon(urlImagen));
	        	//jbutton.setText(sAltText);	        	
	        } else {     
	        	if(Constantes.ISDEVELOPING) {
	        		System.err.println("Path Imagen No Encontrada:"+ sImagenLocation);
	        	}
	        } 
	        
	        FuncionesSwing.setBoldButton(this.jButtonMenu, this.JInternalFrameBaseAuxiliar.getsTipoTamanioGeneral(),false,true,this.JInternalFrameBaseAuxiliar);
	        
	        final Modulo moduloUsuarioFinal=moduloUsuario;
	        
	        
	        this.jButtonMenu.addActionListener(new ButtonModuloJFrameMeActionListener(this,moduloUsuario));
	        
	        /*
	        this.jButtonMenu.addActionListener (
	        	new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                try {
							jButtonMenuActionPerformed(evt,moduloUsuarioFinal);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		            }
		        }
	        );
	        */
	        
	        
	        if(!moduloUsuario.gettecla().equals("")) {		       
		        //if(moduloUsuario.gettecla().equals("S")) {	        	 	
		        	if(moduloUsuario.gettecla()!=null && !moduloUsuario.gettecla().trim().equals("")) {
		        		sMapKey=moduloUsuario.getId().toString();
				        inputMap = this.jButtonMenu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
						//inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_2 , KeyEvent.CTRL_MASK), sMapKey);
				        
				        //inputMap.put(KeyStroke.getKeyStroke(moduloUsuario.gettecla().charAt(0),InputEvent.CTRL_MASK), sMapKey);
				        
			        	inputMap.put(KeyStroke.getKeyStroke(moduloUsuario.gettecla().charAt(0),MainMenuJFrame.getTeclaMascara(moduloUsuario.getid_tipo_tecla_mascara())), sMapKey);
			        
			        	//inputMap.put(KeyEvent.VK_1,InputEvent.CTRL_MASK), sMapKey);
			        	
			        	this.jButtonMenu.getActionMap().put(sMapKey,new ButtonModuloJFrameMeAbstractAction(this,moduloUsuario));
		        	}
		        //}
		        
		        /*
				this.jButtonMenu.getActionMap().put(sMapKey, new AbstractAction() {
				  private static final long serialVersionUID = 1L;
					public void actionPerformed(ActionEvent evt) {
				    	try {
				    		jButtonMenuActionPerformed(evt,moduloUsuarioFinal);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				    }
				});
				*/				
	        }
			
	        
	        this.cargarMenusModulo(moduloUsuario);
	        		
			gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.fill = GridBagConstraints.VERTICAL;
			gridBagConstraints.gridy = iGridY++;
			gridBagConstraints.gridx = 0;
			
			this.jPanelMenu.add(this.jButtonMenu, gridBagConstraints);
		}
		
		
		
		
		this.jButtonLogin2 = new JButtonMe();   
			this.jButtonLogin2.setName("IR A LOGIN");
	        this.jButtonLogin2.setText("IR A LOGIN");
	        FuncionesSwing.addImagenButtonGeneral(this.jButtonLogin2,"login","IR A LOGIN");
	        
	        this.jButtonLogin2.setToolTipText("IR A LOGIN"+FuncionesSwing.getKeyMensaje("IR_LOGIN"));
	        
	        this.jButtonLogin2.addActionListener(new ButtonJFrameMeActionListener(this,"IrLogin"));
	       
	        
	        /*
	        this.jButtonLogin2.addActionListener (
		        	new java.awt.event.ActionListener() {
			            public void actionPerformed(java.awt.event.ActionEvent evt) {
			                try {
			                	jButtonIrLoginActionPerformed(evt);
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
			            }
			        }
		    );
	        */
	        
	        
		//BUTTON LOGIN 2
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints.gridy = iGridY++;
		gridBagConstraints.gridx = 0;
						
		if(!conPanelAcciones) {
			this.jPanelMenu.add(this.jButtonLogin2, gridBagConstraints);
		}
		
			
		/*
		this.jPanelMenu.setSize(600,this.jPanelMenu.getHeight());
	    this.jPanelMenu.setSize(600,this.jPanelMenu.getHeight());
	    this.jPanelMenu.setSize(600,this.jPanelMenu.getHeight());
	    */
		
	        
		//PANEL PRINCIPAL		
		
	    gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridy =0;		
		gridBagConstraints.gridx = 0;
		//gridBagConstraints.fill = GridBagConstraints.BOTH;
		this.jContentPane.add(this.jPanelMenu, gridBagConstraints);
		
		if(conPanelAcciones) {
			gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridy =0;		
			gridBagConstraints.gridx = 1;
			gridBagConstraints.anchor = GridBagConstraints.CENTER;//.SOUTHEAST;CENTER
			//gridBagConstraints.fill = GridBagConstraints.BOTH;
			this.jContentPane.add(this.jPanelMenuAcciones, gridBagConstraints);
		}	
		
		this.setContentPane(this.jContentPane);
		
		/*
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAceptar)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jButtonCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUsuario)
                            .addComponent(jLabelPassword))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldUsuario, GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordFieldPassword, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelUsuario)
                    .addComponent(jTextFieldUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword)
                    .addComponent(jPasswordFieldPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptar)
                    .addComponent(jButtonCancelar))
                .addContainerGap())
        );

        pack();
        */            	
    }
      
      public static int getTeclaMascara(Long idTipoTeclaMascara) {
        	int iTeclaMascara= InputEvent.CTRL_MASK;
        	
        	if(idTipoTeclaMascara.equals(2L)) {
        		iTeclaMascara= InputEvent.ALT_MASK;
        		
        	} else if(idTipoTeclaMascara.equals(3L)) {
        		iTeclaMascara= InputEvent.SHIFT_MASK;
        		
        	} else if(idTipoTeclaMascara.equals(4L)) {
        		iTeclaMascara= InputEvent.CTRL_MASK | InputEvent.ALT_MASK;
        		
        	} else if(idTipoTeclaMascara.equals(5L)) {
        		iTeclaMascara= InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK;
        	}
        	
        	return iTeclaMascara;
        }      
      
      public static String getStringTeclaMascara(Long idTipoTeclaMascara,String sTecla) {
      	String sTeclaMascara= "Ctrl";
      	
      	if(idTipoTeclaMascara.equals(2L)) {
      		sTeclaMascara= "Alt";
      		
      	} else if(idTipoTeclaMascara.equals(3L)) {
      		sTeclaMascara= "Mayus";
      		
      	} else if(idTipoTeclaMascara.equals(4L)) {
      		sTeclaMascara= "Ctrl + Alt";
      		
      	} else if(idTipoTeclaMascara.equals(4L)) {
      		sTeclaMascara= "Ctrl + Mayus";
      	}
      	
      	if(sTecla!=null && !sTecla.trim().equals("")) {
      		sTeclaMascara=" ("+sTeclaMascara+" + "+sTecla+")";
      	
      	} else {
      		sTeclaMascara="";
      	}
      	
      	return sTeclaMascara;
      }
      
      public static Boolean verificarTeclaMascaraGlobal(Long idTipoTeclaMascara,String sTecla) {
          Boolean verificado=true;
          
          //||
          
          if(sTecla!=null && !sTecla.equals("")) {
	          if((idTipoTeclaMascara.equals(1L) && sTecla.equals("N"))	||	(idTipoTeclaMascara.equals(3L) && sTecla.equals("N"))      //NUEVO, NUEVO TABLA
	        		  || (idTipoTeclaMascara.equals(1L) && sTecla.equals("G")) || (idTipoTeclaMascara.equals(1L) && sTecla.equals("D"))// GUARDAR, DUPLICAR
	        		  || (idTipoTeclaMascara.equals(2L) && sTecla.equals("C")) || (idTipoTeclaMascara.equals(1L) && sTecla.equals("R"))//COPIAR, RECARGAR
	        		  || (idTipoTeclaMascara.equals(1L) && sTecla.equals("O")) || (idTipoTeclaMascara.equals(2L) && sTecla.equals("S"))//ORDEN, SALIR 
	        		  || (idTipoTeclaMascara.equals(3L) && sTecla.equals("C")) || (idTipoTeclaMascara.equals(1L) && sTecla.equals("E"))//CANCELAR,ELIMINAR
	        		  || (idTipoTeclaMascara.equals(1L) && sTecla.equals("A"))														   //ACTUALIZAR
	        		  ) {
	        	  //CREO SI SE PUEDE REPETIR COMBINACIONES
	        	  //SE COMENTA	
	        	  //verificado=false;  
	          }
          }
          
          return verificado;
      }
      
      public void jButtonActionPerformedTecladoGeneral(Modulo modulo,ActionEvent evt) { 	  
			try {
				this.startProcessMainMenu(true);
				
				jButtonMenuActionPerformed(evt,modulo);
				
	  		} catch(Exception e) {
	  			e.printStackTrace();
	  			FuncionesSwing.manageException2(this, e,logger,"MODULOS");		  			
	  		} finally {
	  			this.finishProcessMainMenu(true);				
	  		}
	    }
      
      
      public void jButtonModuloActionPerformedGeneral(Modulo modulo,java.awt.event.ActionEvent evt) { 	  
			try {
				this.startProcessMainMenu(true);
				
				jButtonMenuActionPerformed(evt,modulo);
				
	  		} catch(Exception e) {
	  			e.printStackTrace();
	  			FuncionesSwing.manageException2(this, e,logger,"MODULOS");		
	  			
	  		} finally {
	  			this.finishProcessMainMenu(true);				
	  		}
	  }
      
      public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
  		try {
  			this.startProcessMainMenu(true);
  			
  			if(sTipo.equals("IrLogin")) {
  				jButtonIrLoginActionPerformed(evt);
  				
  			} else if(sTipo.equals("MapaSistema")) {
  				jButtonMapaSistemaActionPerformed(evt);
  				
  			} else if(sTipo.equals("MemoriaSistema")) {
  				jButtonMemoriaSistemaActionPerformed(evt);
  				
  			} else if(sTipo.equals("CambiarEmpresaSucursal")) {
  				jButtonCambiarEmpresaSucursalActionPerformed(evt);
  				
  			} else if(sTipo.equals("CambiarEjercicioPeriodo")) {
  				jButtonCambiarEjercicioPeriodoActionPerformed(evt);
  				
  			} else if(sTipo.equals("CambiarParametrosGenerales")) {
  				jButtonCambiarParametrosGeneralesActionPerformed(evt);
  				
  			} else if(sTipo.equals("ActualizarVisual")) {
  				jButtonCambiarVisualActionPerformed(evt);
  				
  			} else if(sTipo.equals("Cancelar")) {
  				jButtonCancelarActionPerformed(evt);
  				
  			}
  			
    	} catch(Exception e) {
    		e.printStackTrace();
    		FuncionesSwing.manageException2(this, e,logger,"MODULOS");		
  			
  		} finally {
  			this.finishProcessMainMenu(true);				
  		}
      }
  	
  	public void jButtonActionPerformedGeneral(String sTipo,java.awt.event.ActionEvent evt) { 	  
  		try {
  			
  			this.startProcessMainMenu(true);
  			
  			if(sTipo.equals("IrLogin")) {
  				jButtonIrLoginActionPerformed(evt);
  				
  			} else if(sTipo.equals("MapaSistema")) {
  				jButtonMapaSistemaActionPerformed(evt);
  				
  			} else if(sTipo.equals("MemoriaSistema")) {
  				jButtonMemoriaSistemaActionPerformed(evt);
  				
  			} else if(sTipo.equals("CambiarEmpresaSucursal")) {
  				jButtonCambiarEmpresaSucursalActionPerformed(evt);
  				
  			} else if(sTipo.equals("CambiarEjercicioPeriodo")) {
  				jButtonCambiarEjercicioPeriodoActionPerformed(evt);
  				
  			} else if(sTipo.equals("CambiarParametrosGenerales")) {
  				jButtonCambiarParametrosGeneralesActionPerformed(evt);
  				
  			} else if(sTipo.equals("ActualizarVisual")) {
  				jButtonCambiarVisualActionPerformed(evt);
  				
  			} else if(sTipo.equals("Cancelar")) {
  				jButtonCancelarActionPerformed(evt);
  				
  			}
  			
    	} catch(Exception e) {
    		e.printStackTrace();
    		FuncionesSwing.manageException2(this, e,logger,"MODULOS");		
  			
  		} finally {
  			this.finishProcessMainMenu(true);				
  		}
    }
  	
  	
    private void jButtonCambiarVisualActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
    	//Cursor cursor=this.getCursor();
    	
      	try {
      		//this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));	
      		
      		LoginJFrame loginJFrame=new LoginJFrame();
      		loginJFrame.cargarParametroGeneralUsuario(this.usuarioActual.getId());
      		
      		this.parametroGeneralUsuario=loginJFrame.getParametroGeneralUsuario();
      		
      		LoginJFrame.SetLookAndFeel(Integer.parseInt(this.parametroGeneralUsuario.getid_tipo_visual().toString()));
      		
      	} catch(Exception e) {
      		throw e;
    		//FuncionesSwing.manageException(this, e);
    	
      	}   finally {
	    	//this.setCursor(cursor);	
		}
    }
    
    private void jButtonCambiarEmpresaSucursalActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
    	//Cursor cursor=this.getCursor();
    	
    	try {
    		//this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));	
    		
    		this.abrirVentanaAuxiliar(evt,"EMPRESA_SUCURSAL");
    		
    	} catch(Exception e) {
    		throw e;
    		//FuncionesSwing.manageException(this, e);
    	
    	}  finally {
	    	//this.setCursor(cursor);	
		}
    }
    
    private void jButtonCambiarEjercicioPeriodoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
    	//Cursor cursor=this.getCursor();
    	
      	try {
      		//this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));	
      		
      		this.abrirVentanaAuxiliar(evt,"EJERCICIO_PERIODO");
      		
      	} catch(Exception e) {
      		throw e;
    		//FuncionesSwing.manageException(this, e);
    	
      	}  finally {
	    	//this.setCursor(cursor);	
		}
    }
    
    private void jButtonCambiarParametrosGeneralesActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
    	//Cursor cursor=this.getCursor();
    	
      	try {
      		//this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));	
      		
      		this.abrirVentanaAuxiliar(evt,"PARAMETROS_GENERALES");
      		
      	} catch(Exception e) {
      		throw e;
    		//FuncionesSwing.manageException(this, e);
    	
      	}  finally {
	    	//this.setCursor(cursor);	
		}
    }
    
    private void abrirVentanaAuxiliar(java.awt.event.ActionEvent evt,String sTipo) throws Exception {
    	try {
    		
    		//System.out.println(com.bydan.framework.erp.util.Constantes.PROVIDER_URL);
    		//System.out.println(com.bydan.framework.erp.util.Constantes.PROVIDER_URL);
    		JButton jButton=new JButton();
    		JMenuItem jMenuItem=new JMenuItem(); 		
    		String sIdModulo="";
    		
    		if(evt.getSource().getClass().equals(JButton.class)) {
    			jButton=(JButton)evt.getSource();
    			sIdModulo=jButton.getName();
    		
    		} else if(evt.getSource().getClass().equals(JMenuItem.class)) {
    			jMenuItem=(JMenuItem)evt.getSource();
    			sIdModulo=jMenuItem.getName();
    		}
    		
    		
    		this.datosCliente.setIdUsuario(17L);
    		this.datosCliente.setsIPPC("0.0.0.0");
    		this.datosCliente.setsNamePC("x");
    		this.datosCliente.setsUsuarioPC("u");
    		
    		//TipoProfeciaImplementable tipoprofeciaImplementable= TipoProfeciaConstantesFunciones.getTipoProfeciaImplementableEjbReference(TipoProfeciaConstantesFunciones.SREMOTEEJBNAME);

    		//this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));	
			
	    	
	    	
	    	//OpcionImplementable opcionImplementable=OpcionConstantesFunciones.getOpcionImplementableEjbReference(OpcionConstantesFunciones.SREMOTEEJBNAME);
	    	
	    	//Set<Opcion> opciones=opcionImplementable.getTodosOpcionsWithConnection("", new Pagination(), new DatosCliente());
	    	/*
    		Boolean isValidado=true;
	    		    	
	    	if(Constantes.ISUSAEJBLOGICLAYER) {	
				
			} else if(Constantes.ISUSAEJBREMOTE) {
				
			
			} else if(Constantes.ISUSAEJBHOME) {
							
			}
	    	*/
    		
	    	//JOptionPane.showMessageDialog(this,"BOTON-"+jButton.getName(),"ERROR",JOptionPane.ERROR_MESSAGE);
	    	
	    	Constantes.LIDMODULOACTUAL=-1L;//Long.parseLong(jButton.getName());
	    	
	    	//if(isValidado) {   
	    			    		
	    	final Modulo moduloUsuarioFinal=new Modulo();//moduloUsuario;
	    	final String sTipoFinal=sTipo;
	    	
	    	
	    	this.sTipoFinal=sTipoFinal;
	    	
	    	this.loginJFrame.CargarObjetosRendimientoCriticoPorModulo(moduloUsuarioFinal,new Opcion(),usuarioActual,resumenUsuarioActual,parametroGeneralSg,parametroGeneralUsuario,moduloUsuarioFinal, new JDesktopPane());
	    	
	    	//this.finishProcessMainMenu(true);
	    	
	    	//final Cursor cursorFinal=this.cursor;
	    	
	    	/*
		    	java.awt.EventQueue.invokeLater (
		        	new Runnable()  {
			            public void run() {			            	
			                try {
			                	//setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));				            		
								new MainJFrame(usuarioActual,resumenUsuarioActual,parametroGeneralSg,parametroGeneralUsuario,moduloUsuarioFinal,sTipoFinal,desktop,constantes2).setVisible(true);
								
								//setCursor(cursorFinal);
								
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
			            }
		        	}
		       );
		    */ 	
		    	
		   	java.awt.EventQueue.invokeLater(new MainMenuJFrame(this,"abrirVentanaAuxiliar"));
		    
		    	
		    	//this.dispose();
		    
		    /*
	    	} else {
	    		JOptionPane.showMessageDialog(this,"USUARIO O PASSWORD INCORRECTO","ERROR",JOptionPane.ERROR_MESSAGE);
	    	}
	    	*/
	    	
    	} catch(Exception e) {
    		throw e;
    		//FuncionesSwing.manageException(this, e);
    	}
    }
    
    private void jButtonIrLoginActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
    	//Cursor cursor=this.getCursor();
    	
      	try {
      		//this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));	
      		
      		this.cerrarSesionUsuarioActual();
      		
      		this.loginJFrame.setVisible(true);      		      		
      		
      		this.dispose();
      		
      	} catch(Exception e) {
      		throw e;
      		
    		//FuncionesSwing.manageException(this, e);
    		
    	}  finally {
	    	//this.setCursor(cursor);	
		}
    }
    
    
    private void jButtonMapaSistemaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
    	//Cursor cursor=this.getCursor();
    	
      	try {
      		//this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));	
      		
      		//this.cerrarSesionUsuarioActual();
      		
      		//this.mapaSitioJFrame=new MapaSitioJFrame();
      		
      		this.mapaSitioJFrame.setVisible(true);      		      		
      		
      		//this.dispose();
      		
      	} catch(Exception e) {
      		throw e;
      		
    		//FuncionesSwing.manageException(this, e);
    		
    	}  finally {
	    	//this.setCursor(cursor);	
		}
    }
    
    private void jButtonMemoriaSistemaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
    	//Cursor cursor=this.getCursor();
    	
      	try {
      		//this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));	
      		
      		//this.cerrarSesionUsuarioActual();
      		
      		//this.mapaSitioJFrame=new MapaSitioJFrame();
      		
      		this.memoriaSitioJFrame.setVisible(true);      		      		
      		
      		//this.dispose();
      		
      	} catch(Exception e) {
      		throw e;
      		
    		//FuncionesSwing.manageException(this, e);
    		
    	}  finally {
	    	//this.setCursor(cursor);	
		}
    }
    
    private void cargarDatosCliente() {
    	this.datosCliente.setIdUsuario(17L);
		this.datosCliente.setsIPPC("0.0.0.0");
		this.datosCliente.setsNamePC("x");
		this.datosCliente.setsUsuarioPC("u");
    }
    
    private void cerrarSesionUsuarioActual() throws Exception {
    	try {
    		String sFinalQuery="";
    		Boolean esErrorIngreso=false;
    			
    		this.cargarDatosCliente();
    		
    		
    		if(Constantes.ISUSAEJBLOGICLAYER) {	
				this.resumenUsuarioLogicAdditional.setDatosCliente(this.datosCliente);
				 this.resumenUsuarioLogicAdditional.cerrarSesionUsuarioWithConnection(this.usuarioActual.getId());
				
	    	} else if(Constantes.ISUSAEJBREMOTE) {
				//FALTA
			
			} else if(Constantes.ISUSAEJBHOME) {
				//FALTA	
			}
    		
    		
    		//this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));	
			
	    	
    		/*
    			sFinalQuery=" where id_usuario="+this.usuarioActual.getId();
    		
    			if(Constantes.ISUSAEJBLOGICLAYER) {	    				    				
					this.resumenUsuarioLogic.setDatosCliente(this.datosCliente);
		    		this.resumenUsuarioLogic.getEntityWithConnection(sFinalQuery);
		    		this.resumenUsuarioActual=this.resumenUsuarioLogic.getResumenUsuario();
		    		
				} else if(Constantes.ISUSAEJBREMOTE) {
					this.resumenUsuarioActual=resumenUsuarioImplementable.getEntity(sFinalQuery, this.datosCliente);
				
				} else if(Constantes.ISUSAEJBHOME) {
					this.resumenUsuarioActual=resumenUsuarioImplementableHome.getEntity(sFinalQuery,this.datosCliente);	
				}
	    		
	    		if(this.resumenUsuarioActual!=null && this.resumenUsuarioActual.getId()>0) {
	    			//this.resumenUsuarioActual.setnumero_ingresos(this.resumenUsuarioActual.getnumero_ingresos()+1);
	    			//this.resumenUsuarioActual.setnumero_intentos(this.resumenUsuarioActual.getnumero_intentos()+1);
	    			
	    			
//	    			if(this.resumenUsuarioActual.getnumero_ingreso_actual()<=0) {
//	    				this.resumenUsuarioActual.setnumero_ingreso_actual(this.resumenUsuarioActual.getnumero_ingreso_actual()+1);
//	    				
//	    				this.resumenUsuarioActual.setfecha_ultimo_ingreso(new Date());
//	    				this.resumenUsuarioActual.setfecha_ultimo_intento(new Date());
//	    				
//	    			} else {
//	    				this.resumenUsuarioActual.setnumero_error_ingreso(this.resumenUsuarioActual.getnumero_error_ingreso()+1);
//	    				this.resumenUsuarioActual.setfecha_ultimo_error_ingreso(new Date());
//	    				
//	    				esErrorIngreso=true;	    				
//	    			}
	    			
	    			
	    			this.resumenUsuarioActual.setnumero_cierres(this.resumenUsuarioActual.getnumero_cierres()+1);
	    			this.resumenUsuarioActual.setnumero_ingreso_actual(0L);
	    			
	    		} else {
	    			this.resumenUsuarioActual=new ResumenUsuario();
	    			
	    			this.resumenUsuarioActual.setid_usuario(this.usuarioActual.getId());
	    			//this.resumenUsuarioActual.setnumero_ingresos(this.resumenUsuarioActual.getnumero_ingresos()+1);
	    			//this.resumenUsuarioActual.setnumero_intentos(this.resumenUsuarioActual.getnumero_intentos()+1);
	    			this.resumenUsuarioActual.setnumero_cierres(this.resumenUsuarioActual.getnumero_cierres()+1);
	    			this.resumenUsuarioActual.setnumero_ingreso_actual(0L);    				
    				//this.resumenUsuarioActual.setfecha_ultimo_ingreso(new Date());
    				//this.resumenUsuarioActual.setfecha_ultimo_intento(new Date());    				
	    		}
	    		
	    		
	    		if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.resumenUsuarioLogic.setResumenUsuario(this.resumenUsuarioActual);
		    		this.resumenUsuarioLogic.saveResumenUsuarioWithConnection();
		    		
				} else if(Constantes.ISUSAEJBREMOTE) {
					resumenUsuarioImplementable.saveResumenUsuarioWithConnection(this.resumenUsuarioActual, this.datosCliente);
				
				} else if(Constantes.ISUSAEJBHOME) {
					resumenUsuarioImplementableHome.saveResumenUsuarioWithConnection(this.resumenUsuarioActual, this.datosCliente);	
				}
	    		*/
	    		
	    		/*
	    		if(esErrorIngreso) {
	    			throw new Exception("YA SE ENCUENTRA EN USO ESTE USUARIO EN EL SISTEMA, CIERRE LA SESSION DEL USUARIO PARA INTENTAR DE NUEVO");
	    		}
	    		*/	
	    			    			
	    		//JOptionPane.showMessageDialog(this,"CIERRE DE SESSION CORRECTO","ERROR",JOptionPane.INFORMATION_MESSAGE);
	    		
	    		
	    } catch(Exception e) {
	    	throw e;
			//FuncionesSwing.manageException(this, e,logger);
		}
    }
    
    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt,Modulo moduloUsuario) throws Exception {
    	Cursor cursor=this.getCursor();
    	
    	try {
    		
    		//System.out.println(com.bydan.framework.erp.util.Constantes.PROVIDER_URL);
    		//System.out.println(com.bydan.framework.erp.util.Constantes.PROVIDER_URL);
    		
    		JButton jButton=new JButton(); 
    		JMenuItem jMenuItem=new JMenuItem(); 		
    		String sIdModulo="";
    		
    		if(evt.getSource().getClass().equals(JButton.class) || evt.getSource().getClass().equals(JButtonMe.class) ) {
    			jButton=(JButton)evt.getSource();
    			sIdModulo=jButton.getName();
    		
    		} else if(evt.getSource().getClass().equals(JMenuItem.class)) {
    			jMenuItem=(JMenuItem)evt.getSource();
    			sIdModulo=jMenuItem.getName();
    		}
    		
    		
    		this.datosCliente.setIdUsuario(17L);
    		this.datosCliente.setsIPPC("0.0.0.0");
    		this.datosCliente.setsNamePC("x");
    		this.datosCliente.setsUsuarioPC("u");
    		
    		//TipoProfeciaImplementable tipoprofeciaImplementable= TipoProfeciaConstantesFunciones.getTipoProfeciaImplementableEjbReference(TipoProfeciaConstantesFunciones.SREMOTEEJBNAME);

    		//this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));	
			
	    	
	    	
	    	//OpcionImplementable opcionImplementable=OpcionConstantesFunciones.getOpcionImplementableEjbReference(OpcionConstantesFunciones.SREMOTEEJBNAME);
	    	
	    	//Set<Opcion> opciones=opcionImplementable.getTodosOpcionsWithConnection("", new Pagination(), new DatosCliente());
	    	/*
    		Boolean isValidado=true;
	    		    	
	    	if(Constantes.ISUSAEJBLOGICLAYER) {	
				
			} else if(Constantes.ISUSAEJBREMOTE) {
				
			
			} else if(Constantes.ISUSAEJBHOME) {
							
			}
	    	*/
    		
	    	//JOptionPane.showMessageDialog(this,"BOTON-"+jButton.getName(),"ERROR",JOptionPane.ERROR_MESSAGE);
	    	
	    	Constantes.LIDMODULOACTUAL=Long.parseLong(sIdModulo);//Long.parseLong(jButton.getName());
	    	
	    	//if(isValidado) {   
	    			    		
	    	this.moduloUsuario=moduloUsuario;
	    	
	    	final Modulo moduloUsuarioFinal=moduloUsuario;
	    	
	    	this.loginJFrame.CargarObjetosRendimientoCriticoPorModulo(moduloUsuarioFinal,new Opcion(),usuarioActual,resumenUsuarioActual,parametroGeneralSg,parametroGeneralUsuario,moduloUsuarioFinal, new JDesktopPane());
	    	
	    	/*
		    	java.awt.EventQueue.invokeLater (
		        	new Runnable()  {
			            public void run() {			            	
			                try {
			                	//setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));				            		
								new MainJFrame(usuarioActual,resumenUsuarioActual,parametroGeneralSg,parametroGeneralUsuario,moduloUsuarioFinal,"NORMAL",desktop,constantes2).setVisible(true);
								
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
			            }
		        	}
		       );
		     */	
		    
	    	java.awt.EventQueue.invokeLater(new MainMenuJFrame(this,"MainJFrame"));
	    			
		    	//this.dispose();
		    
		    /*
	    	} else {
	    		JOptionPane.showMessageDialog(this,"USUARIO O PASSWORD INCORRECTO","ERROR",JOptionPane.ERROR_MESSAGE);
	    	}
	    	*/
	    	
    	} catch(Exception e) {
    		throw e;
    		//FuncionesSwing.manageException(this, e);
    	
    	} finally {
    		//this.setCursor(cursor);	
    	}
    }        
    
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {
    	try {
	    	quit();
	    	
	    } catch(Exception e) {
			FuncionesSwing.manageException(this, e);
		}
    }
    
    protected void quit() {
        System.exit(0);
    }
    
    public static void main(String args[]) {
    	/*
        java.awt.EventQueue.invokeLater (
        	new Runnable() {
	            public void run() {
	                try {
						new LoginJFrame().setVisible(true);
						
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            }
        	}
       );
       */
        
        try {
			
        	java.awt.EventQueue.invokeLater(new MainMenuJFrame(null,"main"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }

	public Usuario getUsuarioActual() {
		return usuarioActual;
	}

	public void setUsuarioActual(Usuario usuarioActual) {
		this.usuarioActual = usuarioActual;
	} 
    
	public void startProcessMainMenu(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoVisual ,this.jPanelParametrosReportesTipoVisual, this.jScrollPanelDatosTipoVisual,this.jPanelPaginacionTipoVisual, this.jScrollPanelDatosEdicionTipoVisual, this.jPanelAccionesTipoVisual,this.jPanelAccionesFormularioTipoVisual,this.jmenuBarLogin,this.jmenuBarDetalleTipoVisual,this.jTtoolBarTipoVisual,this.jTtoolBarDetalleTipoVisual);		
		//CURSOR MANUAL
		//this.cursor=this.getCursor();
		
		//this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
		
		//final JPanel jPanelMenuFinal=this.jPanelMenu; 
		//final JPanel jPanelMenuAccionesFinal=this.jPanelMenuAcciones; 
		
		//FuncionesSwing.enableDisableComponents(jPanelMenuFinal,false,1,2);
		//FuncionesSwing.enableDisableComponents(jPanelMenuAccionesFinal,false,1,2);
		
		this.habilitarDeshabilitarControlesMainMenu(false);
		
		startProcess();
		
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
						//FuncionesSwing.enableDisableComponents(jPanelMenuFinal,false,1,2);
						//FuncionesSwing.enableDisableComponents(jPanelMenuAccionesFinal,false,1,2);
						
						//PIERDE FOCO PRINCIPAL
						//startProcess();//this.
						
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
    
    public void finishProcessMainMenu(Boolean conSplash) {		
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoVisual ,this.jPanelParametrosReportesTipoVisual, this.jScrollPanelDatosTipoVisual,this.jPanelPaginacionTipoVisual, this.jScrollPanelDatosEdicionTipoVisual, this.jPanelAccionesTipoVisual,this.jPanelAccionesFormularioTipoVisual,this.jmenuBarLogin,this.jmenuBarDetalleTipoVisual,this.jTtoolBarTipoVisual,this.jTtoolBarDetalleTipoVisual);		
		
    	//final JPanel jPanelMenuFinal=this.jPanelMenu; 
		//final JPanel jPanelMenuAccionesFinal=this.jPanelMenuAcciones; 
		
		
		if(conSplash) {
			/*
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
			    		 //FuncionesSwing.enableDisableComponents(jPanelMenuFinal,true,1,2);		
			    		 //FuncionesSwing.enableDisableComponents(jPanelMenuAccionesFinal,true,1,2);	
			    		  
			    		 habilitarDeshabilitarControlesMainMenu(true);
			    		  
			    		 //PIERDE FOCO PRINCIPAL
			    		 finishProcess();//this.
			    		  
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
			*/
			
			try {
				
				SwingUtilities.invokeLater(new MainMenuJFrame(this,"finishProcessMainMenu"));
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//this.setCursor(this.cursor);
	}
    
    public void run() {
		try {
			
			if(this.sTipo.equals("finishProcessMainMenu")) {
				
				this.mainMenuJFrame.habilitarDeshabilitarControlesMainMenu(true);
				this.mainMenuJFrame.finishProcess();
				
				
			} else if(this.sTipo.equals("main")) {
				
				LoginJFrame loginJFrame=new LoginJFrame();
				
				loginJFrame.setVisible(true);
				
				
			} else if(this.sTipo.equals("MainJFrame")) {
				
				MainJFrame mainJFrame=new MainJFrame(this.mainMenuJFrame.usuarioActual,this.mainMenuJFrame.resumenUsuarioActual,this.mainMenuJFrame.parametroGeneralSg,this.mainMenuJFrame.parametroGeneralUsuario,this.mainMenuJFrame.moduloUsuario,"NORMAL",this.mainMenuJFrame.desktop,this.mainMenuJFrame.constantes2);
				mainJFrame.setVisible(true);
				
			} else if(this.sTipo.equals("abrirVentanaAuxiliar")) {
				MainJFrame mainJFrame=new MainJFrame(this.mainMenuJFrame.usuarioActual,this.mainMenuJFrame.resumenUsuarioActual,this.mainMenuJFrame.parametroGeneralSg,this.mainMenuJFrame.parametroGeneralUsuario,this.mainMenuJFrame.moduloUsuario,this.mainMenuJFrame.sTipoFinal,this.mainMenuJFrame.desktop,this.mainMenuJFrame.constantes2);

				mainJFrame.setVisible(true);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
    protected void habilitarDeshabilitarControlesMainMenu(Boolean esHabilitar) {
      this.jmenuBarPrincipal.setEnabled(esHabilitar);
      this.jmenuAcciones.setEnabled(esHabilitar);
      this.jmenuModulos.setEnabled(esHabilitar);
      
      this.jButtonLogin1.setEnabled(esHabilitar);
      this.jButtonLogin2.setEnabled(esHabilitar);
      this.jButtonMapa.setEnabled(esHabilitar);
      this.jButtonMemoria.setEnabled(esHabilitar);
      this.jButtonMenuCambiarEjercicioPeriodo.setEnabled(esHabilitar);
      this.jButtonMenuCambiarEmpresaSucursal.setEnabled(esHabilitar);
      this.jButtonMenuVisual.setEnabled(esHabilitar);
      
      this.jMenuItemLogin.setEnabled(esHabilitar);
      this.jMenuItemEmpresaSucursal.setEnabled(esHabilitar);
      this.jMenuItemEjercicioPeriodo.setEnabled(esHabilitar);
      this.jMenuItemVisual.setEnabled(esHabilitar);
      
      this.jPanelMenu.setEnabled(esHabilitar);
      
      for(Component component:this.jPanelMenu.getComponents()) {
    	  component.setEnabled(esHabilitar);
      }
    }
}