package com.bydan.framework.erp.presentation.desktop.swing;

import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.framework.erp.util.Constantes;
import com.bydan.framework.erp.util.Constantes2;
import com.bydan.framework.erp.util.ConstantesSwing;
import com.bydan.framework.erp.util.Funciones;
import com.bydan.framework.erp.util.Funciones2;
import com.bydan.framework.erp.util.PaginaTipo;
import com.bydan.erp.seguridad.business.entity.GrupoOpcion;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.logic.ModuloLogic;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;
import com.bydan.erp.seguridad.business.logic.OpcionLogic;

/*
import com.bydan.erp.seguridad.service.ejb.interfaces.ModuloImplementable;
//import com.bydan.erp.seguridad.service.ejb.interfaces.ModuloImplementableHome;
import com.bydan.erp.seguridad.service.ejb.interfaces.SistemaImplementable;
//import com.bydan.erp.seguridad.service.ejb.interfaces.SistemaImplementableHome;

import com.bydan.erp.seguridad.service.ejb.interfaces.OpcionImplementable;
//import com.bydan.erp.seguridad.service.ejb.interfaces.OpcionImplementableHome;
*/

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.report.ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrame;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.report.ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrame;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.report.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.report.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.report.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.util.report.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.tesoreria.util.report.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.util.report.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.activosfijos.util.report.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.produccion.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.puntoventa.util.report.*;

import javax.swing.*;

import org.apache.log4j.Logger;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;



@SuppressWarnings("unused")
public class MainJFrame extends JFrameMe implements ActionListener,Runnable
{
	/*
	protected static SistemaImplementable sistemaImplementable=SistemaConstantesFunciones.getSistemaImplementableEjbReference(SistemaConstantesFunciones.SREMOTEEJBNAME_RMI);
	//protected static SistemaImplementableHome sistemaImplementableHome= SistemaConstantesFunciones.getSistemaImplementableHomeEjbReference(SistemaConstantesFunciones.SREMOTEEJBNAME_RMI_RMI);
	
	protected static OpcionImplementable opcionImplementable=OpcionConstantesFunciones.getOpcionImplementableEjbReference(OpcionConstantesFunciones.SREMOTEEJBNAME_RMI);
	//protected static OpcionImplementableHome opcionImplementableHome= OpcionConstantesFunciones.getOpcionImplementableHomeEjbReference(OpcionConstantesFunciones.SREMOTEEJBNAME);
	
	protected static ModuloImplementable moduloImplementable=ModuloConstantesFunciones.getModuloImplementableEjbReference(ModuloConstantesFunciones.SREMOTEEJBNAME_RMI);
	//protected static ModuloImplementableHome moduloImplementableHome= ModuloConstantesFunciones.getModuloImplementableHomeEjbReference(ModuloConstantesFunciones.SREMOTEEJBNAME);
	 */
	
	protected SistemaLogicAdditional sistemaLogicAdditional;
	protected OpcionLogic opcionLogic;
	protected ModuloLogic moduloLogic;
	
	protected Usuario usuarioActual=null;
	protected ResumenUsuario resumenUsuarioActual;
	protected ParametroGeneralSg parametroGeneralSg=null;
	protected ParametroGeneralUsuario parametroGeneralUsuario=null;	
	protected Modulo moduloActual=null;
	protected Constantes2 constantes2=null;
	
	protected JDesktopPaneMe desktop;
	protected DatosCliente datosCliente=new DatosCliente();
	public JInternalFrameBase JInternalFrameBaseAuxiliar=null;
	public MainJFrame mainJFrame=null;
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Opcion> opcionesUsuario=null;	
    Dimension screenSize ;
    int inset ;
    
    private static Logger logger = Logger.getLogger(MainJFrame.class);  
    public String sTipo="";
    
    private void cargarDatosCliente() {
    	this.datosCliente.setIdUsuario(17L);
		this.datosCliente.setsIPPC("0.0.0.0");
		this.datosCliente.setsNamePC("x");
		this.datosCliente.setsUsuarioPC("u");
   }
    
    public MainJFrame() throws Exception {
    	
    }
    
    public MainJFrame(MainJFrame mainJFrame,String sTipo) throws Exception {
    	this.mainJFrame=mainJFrame;
    	this.sTipo=sTipo;
    }

    public MainJFrame(Usuario usuario,ResumenUsuario resumenUsuario,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,String sTipo,JDesktopPaneMe desktop,Constantes2 constantes2) throws Exception
    {
    	super("InternalFrameDemo");
	       
		try {
				this.setCursor(ConstantesSwing.CURSOR_DEFECTO);
				
			 	this.usuarioActual=usuario;
			 	this.resumenUsuarioActual=resumenUsuario;
		        this.parametroGeneralSg=parametroGeneralSg;
		        this.parametroGeneralUsuario=parametroGeneralUsuario;
		        this.moduloActual=moduloActual;
		        this.constantes2=constantes2;
		        
				sistemaLogicAdditional=new SistemaLogicAdditional();
				opcionLogic=new OpcionLogic();
				moduloLogic=new ModuloLogic();
				
				this.cargarDatosCliente();
				
				//String sTitulo=this.parametroGeneralSg.getnombre_sistema()+" VERSION "+this.parametroGeneralSg.getversion_sistema()+ " MODULO "+this.moduloActual.getnombre();
		    	
				String sTitulo=Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual);
				
		        this.setTitle(sTitulo);
		       
		        this.setIconImage(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE));
		        
		        opcionesUsuario=new ArrayList<Opcion>();
		        //Make the big window be indented 50 pixels from each edge
		        //of the screen.
		        inset = 10;
		        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		        //setBounds(inset, inset,screenSize.width  - inset*2,screenSize.height - inset*2);
		        setBounds(inset, inset,screenSize.width-inset*2,screenSize.height-inset*4 );
		        
		        this.JInternalFrameBaseAuxiliar=new JInternalFrameBase();
	    		
	    		this.JInternalFrameBaseAuxiliar.setParametroGeneralUsuario(this.parametroGeneralUsuario);
	    		
	    		this.JInternalFrameBaseAuxiliar.setsTipoTamanioGeneral(FuncionesSwing.getTipoTamanioGeneral(this.JInternalFrameBaseAuxiliar,this.parametroGeneralUsuario,false,false));
	    		this.JInternalFrameBaseAuxiliar.setsTipoTamanioGeneralTabla(FuncionesSwing.getTipoTamanioGeneralTabla(this.JInternalFrameBaseAuxiliar,this.parametroGeneralUsuario,false,false));
	    		this.JInternalFrameBaseAuxiliar.setConTipoTamanioTodo(FuncionesSwing.getConTipoTamanioTodo(this.JInternalFrameBaseAuxiliar,this.parametroGeneralUsuario,false,false));
	    		
	    		
		        //Set up the GUI.
		        //desktop = new JDesktopPaneMe(); //a specialized layered pane
		        
	    		this.desktop=desktop;
	    		this.setContentPane(desktop);
		        		        
		        
		        this.setJMenuBar(this.createMenuBar(sTipo));
		
		        //this.habilitarDeshabilitarControlesMainMenu(false);
		        
		        //Make dragging a little faster but perhaps uglier.
		        this.desktop.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
		        
		        SwingUtilities.updateComponentTreeUI(this);
		        
		        if(!sTipo.equals("") && !sTipo.equals("NORMAL")) {
		        	this.abrirVentanaAutomatico(sTipo);
		        }
		        
		        if(Constantes.ISDEVELOPING) {
	    			System.out.println("***** FIN MENU MODULO ACTUAL INICIALIZAR *****");
	    		}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e);
		}
    }

    protected Opcion cargarVariablesAutomatico(String sTipo) throws Exception{
    	Long idOpcionActual=0L;
				
		//OPCION ACTUAL
		Opcion opcionActual=new Opcion();
		
		if(sTipo.equals("EMPRESA_SUCURSAL")) {
			idOpcionActual=629L;
			
		} else if(sTipo.equals("EJERCICIO_PERIODO")) {
			idOpcionActual=630L;
			
		} else if(sTipo.equals("PARAMETROS_GENERALES")) {
			idOpcionActual=186L;
		}
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			opcionLogic.getEntityWithConnection(idOpcionActual);	
			opcionActual=opcionLogic.getOpcion();			
				
		} else if(Constantes.ISUSAEJBREMOTE) {
			//opcionActual=opcionImplementable.getEntity(idOpcionActual,this.datosCliente);
			
		} else if(Constantes.ISUSAEJBHOME) {
			//opcionActual=opcionImplementableHome.getEntity(idOpcionActual,this.datosCliente);		
		}
		
		
		//MODULO AUXILIAR
		Long idModuloActual=11L;
		
		//OPCION ACTUAL
		
		if(sTipo.equals("EMPRESA_SUCURSAL")) {
			idModuloActual=11L;
			
		} else if(sTipo.equals("EJERCICIO_PERIODO")) {
			idModuloActual=11L;
			
		} else if(sTipo.equals("PARAMETROS_GENERALES")) {
			idModuloActual=11L;
		}
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			moduloLogic.getEntityWithConnection(idModuloActual);	
			moduloActual=moduloLogic.getModulo();			
				
		} else if(Constantes.ISUSAEJBREMOTE) {
			//moduloActual=moduloImplementable.getEntity(idModuloActual,this.datosCliente);
			
		} else if(Constantes.ISUSAEJBHOME) {
			//moduloActual=moduloImplementableHome.getEntity(idModuloActual,this.datosCliente);		
		}
		
		return opcionActual;
    }
    
    protected void abrirVentanaAutomatico(String sTipo) throws Exception{
    	JInternalFrameBase jinternalFrame=new JInternalFrameBase();
    	//Opcion opcionActual=new Opcion();
    	
    	
    	Opcion opcionActual=this.cargarVariablesAutomatico(sTipo);
    	
    	if(sTipo.equals("EMPRESA_SUCURSAL")) {
    		ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrame procesocambiarempresasucursalBeanSwingJInternalFrame=null;	    		
    		
    		procesocambiarempresasucursalBeanSwingJInternalFrame=new ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =procesocambiarempresasucursalBeanSwingJInternalFrame;
			
    		//System.out.println("EMPRESA_SUCURSAL");
    		
    		
    		
    	} else if(sTipo.equals("EJERCICIO_PERIODO")) {
    		ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrame procesocambiarejercicioperiodoBeanSwingJInternalFrame=null;
    		
    		procesocambiarejercicioperiodoBeanSwingJInternalFrame=new ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =procesocambiarejercicioperiodoBeanSwingJInternalFrame;
			
    		//System.out.println("EJERCICIO_PERIODO");
    		
    		
    		
    	} else if(sTipo.equals("PARAMETROS_GENERALES")) {
    		ParametroGeneralUsuarioBeanSwingJInternalFrame parametroGeneralUsuarioBeanSwingJInternalFrame=null;
    		
    		parametroGeneralUsuarioBeanSwingJInternalFrame=new ParametroGeneralUsuarioBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		parametroGeneralUsuarioBeanSwingJInternalFrame.jTabbedPaneBusquedasParametroGeneralUsuario.setVisible(false);
    		
    		String sAccionBusqueda="Query";
    		parametroGeneralUsuarioBeanSwingJInternalFrame.sFinalQueryGeneral=" where id="+this.parametroGeneralUsuario.getid_usuario();
    		parametroGeneralUsuarioBeanSwingJInternalFrame.procesarBusqueda(sAccionBusqueda);
    		parametroGeneralUsuarioBeanSwingJInternalFrame.setsAccionBusqueda(sAccionBusqueda);    		
    		parametroGeneralUsuarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroGeneralUsuario();
    		
			jinternalFrame =parametroGeneralUsuarioBeanSwingJInternalFrame;
			
    		//System.out.println("EJERCICIO_PERIODO");
    		
    		
    		
    	} 
    	
    	if(!Constantes.CON_VARIAS_VENTANAS) {
			MainJFrame.cerrarJInternalFramesExistentes(desktop,jinternalFrame);
		}
		
		//SwingUtilities.updateComponentTreeUI(jinternalFrame);
		
		 jinternalFrame.setAutoscrolls(true);
		
	    //frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
		 jinternalFrame.setVisible(true); //necessary as of 1.3
    	
        desktop.add(jinternalFrame);
               			
        jinternalFrame.setSelected(true);
    }
    
    protected JMenuBar createMenuBar(String sTipo) throws Exception
    {
        JMenuBar menuBar = new JMenuBarMe();
        
        JMenu menu = new JMenu("Global");
        FuncionesSwing.setBoldMenu(menu, this.JInternalFrameBaseAuxiliar.getsTipoTamanioGeneral(),false,true,this.JInternalFrameBaseAuxiliar);
		
        menuBar.add(menu);
        
        JMenuItem menuItem=null;
                
        
        menuItem = new JMenuItem("Calculadora");
        FuncionesSwing.setBoldMenuItem(menuItem, this.JInternalFrameBaseAuxiliar.getsTipoTamanioGeneral(),false,true,this.JInternalFrameBaseAuxiliar);
		
        //menuItem.setMnemonic(KeyEvent.VK_S);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.SHIFT_MASK));
        menuItem.setActionCommand("GLOBAL-CALCULADORA");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        
        menuItem = new JMenuItem("Excel");
        FuncionesSwing.setBoldMenuItem(menuItem, this.JInternalFrameBaseAuxiliar.getsTipoTamanioGeneral(),false,true,this.JInternalFrameBaseAuxiliar);
        
        //menuItem.setMnemonic(KeyEvent.VK_S);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.SHIFT_MASK));
        menuItem.setActionCommand("GLOBAL-EXCEL");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        
        menuItem = new JMenuItem("Word");
        FuncionesSwing.setBoldMenuItem(menuItem, this.JInternalFrameBaseAuxiliar.getsTipoTamanioGeneral(),false,true,this.JInternalFrameBaseAuxiliar);
        
        //menuItem.setMnemonic(KeyEvent.VK_S);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.SHIFT_MASK));
        menuItem.setActionCommand("GLOBAL-WORD");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        
        menuItem = new JMenuItem("Notepad");
        FuncionesSwing.setBoldMenuItem(menuItem, this.JInternalFrameBaseAuxiliar.getsTipoTamanioGeneral(),false,true,this.JInternalFrameBaseAuxiliar);
        
        //menuItem.setMnemonic(KeyEvent.VK_S);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.SHIFT_MASK));
        menuItem.setActionCommand("GLOBAL-NOTEPAD");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        
        menuItem = new JMenuItem("Reinicializar");
        FuncionesSwing.setBoldMenuItem(menuItem, this.JInternalFrameBaseAuxiliar.getsTipoTamanioGeneral(),false,true,this.JInternalFrameBaseAuxiliar);
        
        //menuItem.setMnemonic(KeyEvent.VK_S);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.SHIFT_MASK));
        menuItem.setActionCommand("GLOBAL-REINICIALIZAR");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        
        
        if(sTipo.equals("EMPRESA_SUCURSAL")) {
        	menuItem = new JMenuItem("CAMBIAR EMPRESA SUCURSAL");
        	FuncionesSwing.setBoldMenuItem(menuItem, this.JInternalFrameBaseAuxiliar.getsTipoTamanioGeneral(),false,true,this.JInternalFrameBaseAuxiliar);
        	
            //menuItem.setMnemonic(KeyEvent.VK_S);
            //menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
            menuItem.setActionCommand("GLOBAL-EMPRESA_SUCURSAL");
            menuItem.addActionListener(this);
            menu.add(menuItem);        	
        }
        
        if(sTipo.equals("EJERCICIO_PERIODO")) {
        	menuItem = new JMenuItem("CAMBIAR EJERCICIO PERIODO");
        	FuncionesSwing.setBoldMenuItem(menuItem, this.JInternalFrameBaseAuxiliar.getsTipoTamanioGeneral(),false,true,this.JInternalFrameBaseAuxiliar);
        	
            //menuItem.setMnemonic(KeyEvent.VK_S);
            //menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
            menuItem.setActionCommand("GLOBAL-EJERCICIO_PERIODO");
            menuItem.addActionListener(this);
            menu.add(menuItem);        	
        }
               
        
        menuItem = new JMenuItem("Salir");
        FuncionesSwing.setBoldMenuItem(menuItem, this.JInternalFrameBaseAuxiliar.getsTipoTamanioGeneral(),false,true,this.JInternalFrameBaseAuxiliar);
        
        //menuItem.setMnemonic(KeyEvent.VK_S);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
        menuItem.setActionCommand("GLOBAL-SALIR");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        
              
        /*
        JMenu menu = new JMenu("Test Swing Tipo Noticias");
        menu.setMnemonic(KeyEvent.VK_D);
        menuBar.add(menu);
        
        //Set up the first menu item.
        JMenuItem menuItem = new JMenuItem(" de Tipo de Noticias");
        menuItem.setMnemonic(KeyEvent.VK_N);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.ALT_MASK));
        menuItem.setActionCommand("TipoNoticia");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        */
        
        ArrayList<Opcion> opcionesUsuario=new ArrayList<Opcion>();
        ArrayList<GrupoOpcion> grupo_opcions=new ArrayList<GrupoOpcion>();
        SistemaParameterReturnGeneral sistemaReturnGeneral=new SistemaParameterReturnGeneral();
        
        if(Constantes.ISUSAEJBLOGICLAYER) {	
			//opcionesUsuario=new ArrayList<Opcion>(sistemaLogicAdditional.getOpcionesUsuario(usuarioActual, Constantes.LIDMODULOACTUAL));				
			//grupo_opcions=new ArrayList<GrupoOpcion>(sistemaLogicAdditional.getGrupoOpcionsUsuario(usuarioActual, Constantes.LIDMODULOACTUAL));
			
        	sistemaReturnGeneral=sistemaLogicAdditional.getGrupoOpcionsYOpcionsUsuario(usuarioActual,Constantes.LIDMODULOACTUAL);
        	
        	opcionesUsuario=new ArrayList<Opcion>(sistemaReturnGeneral.getOpcions());
        	grupo_opcions=new ArrayList<GrupoOpcion>(sistemaReturnGeneral.getGrupoopcions());
        	
		} else if(Constantes.ISUSAEJBREMOTE) {
			//opcionesUsuario=new ArrayList<Opcion>(sistemaImplementable.getOpcionesUsuario(usuarioActual, Constantes.LIDMODULOACTUAL));
		
		} else if(Constantes.ISUSAEJBHOME) {
			//opcionesUsuario=new ArrayList<Opcion>(sistemaImplementableHome.getOpcionesUsuario(usuarioActual, Constantes.LIDMODULOACTUAL));		
		}
        
        for(Opcion opcion:opcionesUsuario) {
        	if(Constantes2.ISDEVELOPING2) {
        		System.out.println("ID="+opcion.getId()+" IDOPCION="+opcion.getid_opcion()+" NOMBRE="+opcion.getnombre());
        	}
     	}
        
        ArrayList<Opcion> opcionesUsuarioPadres=new ArrayList<Opcion>(MainJFrame.getMenuOpcionesPadrePrimerNivel(opcionesUsuario));
        
        //PRIMERA VERSION DEL MENU
        /*
        for(Opcion opcionUsuarioPadre:opcionesUsuarioPadres) {       	
        		menu = new JMenu(opcionUsuarioPadre.getnombre());
	            //menu.setMnemonic(KeyEvent.VK_D);
	           
	            this.getMenuOpcionesHijos(menu,opcionUsuarioPadre,opcionesUsuario);      
	            
	            menuBar.add(menu);
		           
        }
        */
        
        String sLabelGrupoOpcion="";
        
        for(GrupoOpcion grupoOpcion:grupo_opcions) {  
        	sLabelGrupoOpcion=grupoOpcion.getnombre_principal();
        	 
        	if(Constantes.ISDEVELOPING) {
        		sLabelGrupoOpcion=grupoOpcion.getId()+"_"+sLabelGrupoOpcion;
        	}
        	
        	menu = new JMenu(sLabelGrupoOpcion);
        	FuncionesSwing.setBoldMenuItem(menu, this.JInternalFrameBaseAuxiliar.getsTipoTamanioGeneral(),false,true,this.JInternalFrameBaseAuxiliar);
        	
        	this.getMenuOpcionesHijos(menu,grupoOpcion,opcionesUsuario);
        	 
        	menuBar.add(menu);
        }
        
        /*
        //Set up the lone menu.
        JMenu menu = new JMenu("Test Swing Seguridad");
        menu.setMnemonic(KeyEvent.VK_D);
        menuBar.add(menu);

        //Set up the first menu item.
        JMenuItem menuItem = new JMenuItem(" de Sistema");
        menuItem.setMnemonic(KeyEvent.VK_N);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.ALT_MASK));
        menuItem.setActionCommand("Sistema");
        menuItem.addActionListener(this);
        menu.add(menuItem);

        //Set up the second menu item.
        menuItem = new JMenuItem(" de Usuario");
        menuItem.setMnemonic(KeyEvent.VK_Q);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.ALT_MASK));
        menuItem.setActionCommand("Usuario");
        menuItem.addActionListener(this);
        menu.add(menuItem);
           
        */
        
        //if(!Constantes.ISDEVELOPING) {
        	if(this.parametroGeneralUsuario.getcon_precargar_ventanas()) {
        		 ArrayList<Opcion> opcionesUsuarioPrecargar=new ArrayList<Opcion>();
        	     //sistemaReturnGeneral=new SistemaReturnGeneral();
        	        
        	     if(Constantes.ISUSAEJBLOGICLAYER) {	
        			//opcionesUsuario=new ArrayList<Opcion>(sistemaLogicAdditional.getOpcionesUsuario(usuarioActual, Constantes.LIDMODULOACTUAL));				
        			//grupo_opcions=new ArrayList<GrupoOpcion>(sistemaLogicAdditional.getGrupoOpcionsUsuario(usuarioActual, Constantes.LIDMODULOACTUAL));
        				
        	        //sistemaReturnGeneral=sistemaLogicAdditional.getGrupoOpcionsYOpcionsUsuario(usuarioActual,Constantes.LIDMODULOACTUAL);
        	        	
        	    	if(!this.parametroGeneralUsuario.getcon_precargar_por_usuario()) {
        	    		opcionesUsuarioPrecargar=new ArrayList<Opcion>(sistemaLogicAdditional.getOpcionesUsuario(usuarioActual,Constantes.LIDMODULOACTUAL,true,true,false));
        	    	} else {
        	    		opcionesUsuarioPrecargar=new ArrayList<Opcion>(sistemaLogicAdditional.getOpcionesUsuario(usuarioActual,Constantes.LIDMODULOACTUAL,true,true,true));
        	    	}
        	    	
        	    	this.precargarVentanas(opcionesUsuarioPrecargar,Constantes.LIDMODULOACTUAL);        	    		        	    	
        	    	
        	    	
        	        //opcionesUsuario=new ArrayList<Opcion>(sistemaReturnGeneral.getOpcions());
        	        //grupo_opcions=new ArrayList<GrupoOpcion>(sistemaReturnGeneral.getGrupoopcions());
        	        	
        		} else if(Constantes.ISUSAEJBREMOTE) {
        			//FALTA
        			//opcionesUsuario=new ArrayList<Opcion>(sistemaImplementable.getOpcionesUsuario(usuarioActual, Constantes.LIDMODULOACTUAL));
        			
        		} else if(Constantes.ISUSAEJBHOME) {
        			//FALTA
        			//opcionesUsuario=new ArrayList<Opcion>(sistemaImplementableHome.getOpcionesUsuario(usuarioActual, Constantes.LIDMODULOACTUAL));		
        		}
        	}
        //}
        
        return menuBar;
    }

    public void precargarVentanas(ArrayList<Opcion> opcionesUsuarioPrecargar,Long idModuloActual) throws Exception {
    	Integer iIdModuloActual=idModuloActual.intValue();
    	
    	for(Opcion opcionRecargar:opcionesUsuarioPrecargar) {  
    		switch(iIdModuloActual) {
    			case 11: 
    				if(!Constantes2.CON_PRECARGAR_RECARGADO_ACTIVOSFIJOS) {
    					MainJFrameActivosFijos.getJInternalFrameBaseMenu(opcionRecargar.getpaquete(), opcionRecargar.getnombre_clase(), opcionRecargar, this.usuarioActual, this.resumenUsuarioActual, this.parametroGeneralSg, this.parametroGeneralUsuario, this.moduloActual, this.desktop, true);
    					
    					Constantes2.CON_PRECARGAR_RECARGADO_ACTIVOSFIJOS=true;
    				}
    				break;    				
    			
    			case 140:
    				if(!Constantes2.CON_PRECARGAR_RECARGADO_CARTERA) {        				
    					MainJFrameCartera.getJInternalFrameBaseMenu(opcionRecargar.getpaquete(), opcionRecargar.getnombre_clase(), opcionRecargar, this.usuarioActual, this.resumenUsuarioActual, this.parametroGeneralSg, this.parametroGeneralUsuario, this.moduloActual, this.desktop, true);
    					
    					Constantes2.CON_PRECARGAR_RECARGADO_CARTERA=true;
    				}
    				
    				break;
    			
    			case 16:
    				if(!Constantes2.CON_PRECARGAR_RECARGADO_COMISIONES) {        				        				
    					MainJFrameComisiones.getJInternalFrameBaseMenu(opcionRecargar.getpaquete(), opcionRecargar.getnombre_clase(), opcionRecargar, this.usuarioActual, this.resumenUsuarioActual, this.parametroGeneralSg, this.parametroGeneralUsuario, this.moduloActual, this.desktop, true);
    					
    					Constantes2.CON_PRECARGAR_RECARGADO_COMISIONES=true;
    				}
    				
    				break;
    			
    			case 1:
    				if(!Constantes2.CON_PRECARGAR_RECARGADO_CONTABILIDAD) {        				        				        				
    					MainJFrameContabilidad.getJInternalFrameBaseMenu(opcionRecargar.getpaquete(), opcionRecargar.getnombre_clase(), opcionRecargar, this.usuarioActual, this.resumenUsuarioActual, this.parametroGeneralSg, this.parametroGeneralUsuario, this.moduloActual, this.desktop, true);

    					Constantes2.CON_PRECARGAR_RECARGADO_CONTABILIDAD=true;
    				}
    				
    				break;
    				
    			case 14:
    				if(!Constantes2.CON_PRECARGAR_RECARGADO_CUENTASPORCOBRAR) {        				        				        				
    					MainJFrameCuentasPorCobrar.getJInternalFrameBaseMenu(opcionRecargar.getpaquete(), opcionRecargar.getnombre_clase(), opcionRecargar, this.usuarioActual, this.resumenUsuarioActual, this.parametroGeneralSg, this.parametroGeneralUsuario, this.moduloActual, this.desktop, true);

    					Constantes2.CON_PRECARGAR_RECARGADO_CUENTASPORCOBRAR=true;
    				}
    				
    				break;
    				
    			case 15:
    				if(!Constantes2.CON_PRECARGAR_RECARGADO_CUENTASPORPAGAR) {
    					MainJFrameCuentasPorPagar.getJInternalFrameBaseMenu(opcionRecargar.getpaquete(), opcionRecargar.getnombre_clase(), opcionRecargar, this.usuarioActual, this.resumenUsuarioActual, this.parametroGeneralSg, this.parametroGeneralUsuario, this.moduloActual, this.desktop, true);

    					Constantes2.CON_PRECARGAR_RECARGADO_CUENTASPORPAGAR=true;
    				}
    				
    				break;
    			
    			case 6:
    				if(!Constantes2.CON_PRECARGAR_RECARGADO_FACTURACION) {
    					MainJFrameFacturacion.getJInternalFrameBaseMenu(opcionRecargar.getpaquete(), opcionRecargar.getnombre_clase(), opcionRecargar, this.usuarioActual, this.resumenUsuarioActual, this.parametroGeneralSg, this.parametroGeneralUsuario, this.moduloActual, this.desktop, true);

    					Constantes2.CON_PRECARGAR_RECARGADO_FACTURACION=true;
    				}
    				
    				break;
	    		
    			case 20:
    				if(!Constantes2.CON_PRECARGAR_RECARGADO_IMPORTACIONES) {        				
    					MainJFrameImportaciones.getJInternalFrameBaseMenu(opcionRecargar.getpaquete(), opcionRecargar.getnombre_clase(), opcionRecargar, this.usuarioActual, this.resumenUsuarioActual, this.parametroGeneralSg, this.parametroGeneralUsuario, this.moduloActual, this.desktop, true);

    					Constantes2.CON_PRECARGAR_RECARGADO_IMPORTACIONES=true;
    				}
    				
    				break;
    				
    			case 5:
    				if(!Constantes2.CON_PRECARGAR_RECARGADO_INVENTARIO) {
    					MainJFrameInventario.getJInternalFrameBaseMenu(opcionRecargar.getpaquete(), opcionRecargar.getnombre_clase(), opcionRecargar, this.usuarioActual, this.resumenUsuarioActual, this.parametroGeneralSg, this.parametroGeneralUsuario, this.moduloActual, this.desktop, true);

    					Constantes2.CON_PRECARGAR_RECARGADO_INVENTARIO=true;
    				}
    				
    				break;
	    		
    			case 8:
    				if(!Constantes2.CON_PRECARGAR_RECARGADO_NOMINA) {
    					MainJFrameNomina.getJInternalFrameBaseMenu(opcionRecargar.getpaquete(), opcionRecargar.getnombre_clase(), opcionRecargar, this.usuarioActual, this.resumenUsuarioActual, this.parametroGeneralSg, this.parametroGeneralUsuario, this.moduloActual, this.desktop, true);

    					Constantes2.CON_PRECARGAR_RECARGADO_NOMINA=true;
    				}
    				
    				break;
    				
    			case 17:
    				if(!Constantes2.CON_PRECARGAR_RECARGADO_PRODUCCION) {        				
    					MainJFrameProduccion.getJInternalFrameBaseMenu(opcionRecargar.getpaquete(), opcionRecargar.getnombre_clase(), opcionRecargar, this.usuarioActual, this.resumenUsuarioActual, this.parametroGeneralSg, this.parametroGeneralUsuario, this.moduloActual, this.desktop, true);

    					Constantes2.CON_PRECARGAR_RECARGADO_PRODUCCION=true;
    				}
    				
    				break;
    			
    			case 3:
    				if(!Constantes2.CON_PRECARGAR_RECARGADO_PUNTOVENTA) {
    					MainJFramePuntoVenta.getJInternalFrameBaseMenu(opcionRecargar.getpaquete(), opcionRecargar.getnombre_clase(), opcionRecargar, this.usuarioActual, this.resumenUsuarioActual, this.parametroGeneralSg, this.parametroGeneralUsuario, this.moduloActual, this.desktop, true);

    					Constantes2.CON_PRECARGAR_RECARGADO_PUNTOVENTA=true;
    				}
    				
    				break;
    				
    			case 2:
    				if(!Constantes2.CON_PRECARGAR_RECARGADO_SEGURIDAD) {
    					MainJFrameSeguridad.getJInternalFrameBaseMenu(opcionRecargar.getpaquete(), opcionRecargar.getnombre_clase(), opcionRecargar, this.usuarioActual, this.resumenUsuarioActual, this.parametroGeneralSg, this.parametroGeneralUsuario, this.moduloActual, this.desktop, true);

    					Constantes2.CON_PRECARGAR_RECARGADO_SEGURIDAD=true;
    				}
    				
    				break;
    				
    			case 18:
    				if(!Constantes2.CON_PRECARGAR_RECARGADO_SRI) {
    					MainJFrameSris.getJInternalFrameBaseMenu(opcionRecargar.getpaquete(), opcionRecargar.getnombre_clase(), opcionRecargar, this.usuarioActual, this.resumenUsuarioActual, this.parametroGeneralSg, this.parametroGeneralUsuario, this.moduloActual, this.desktop, true);

    					Constantes2.CON_PRECARGAR_RECARGADO_SRI=true;
    				}
    				
    				break;
	    		
    			case 9:
    				if(!Constantes2.CON_PRECARGAR_RECARGADO_TESORERIA) {
    					MainJFrameTesoreria.getJInternalFrameBaseMenu(opcionRecargar.getpaquete(), opcionRecargar.getnombre_clase(), opcionRecargar, this.usuarioActual, this.resumenUsuarioActual, this.parametroGeneralSg, this.parametroGeneralUsuario, this.moduloActual, this.desktop, true);

    					Constantes2.CON_PRECARGAR_RECARGADO_TESORERIA=true;
    				}
    				
    				break;
    		} 
    	}    	
    }
    
    
    public static ArrayList<Opcion> getMenuOpcionesPadrePrimerNivel(ArrayList<Opcion> opcionesUsuario) throws Exception	{		
    	ArrayList<Opcion> opcionesPadre=new ArrayList<Opcion>();
    	try	{
			
    		for(Opcion opcion:opcionesUsuario) {
    			if(opcion.getid_opcion()==null||opcion.getid_opcion()<=0){
    				opcionesPadre.add(opcion);
    			}
    		}
    		
		} catch(Exception e) {
			throw e;
		}
		
		return opcionesPadre;
    }
    
    public void getMenuOpcionesHijos0(JMenu menuPadre,Opcion opcionUsuarioPadre,ArrayList<Opcion> opcionesUsuario) throws Exception {		
		try	{					
			JMenuItem menuItemHijo= null;
			
			ArrayList<Opcion> opcionesHijos=new ArrayList<Opcion>();
							
			//opcionesHijos=sistemaLogicAdditional.getOpcionesHijos(opcionPadre,bigIdSistema,strPerfiles);
			
			opcionesHijos=MainJFrame.getMenuOpcionesHijoDesdeOpcion(opcionUsuarioPadre,opcionesUsuario);
			
				if(opcionesHijos.size()>0) {
					
					for(Opcion opcionHijo:opcionesHijos) {	
						menuItemHijo= new JMenuItem(opcionHijo.getnombre());
						
						menuItemHijo.putClientProperty("opcionActual", opcionHijo);
						menuItemHijo.setActionCommand(this.getActionCommand(opcionHijo));
						menuItemHijo.addActionListener(this);
						
						menuPadre.add(menuItemHijo);
			        					
					}	
				}
			} catch(Exception e) {
				throw e;
			}				
	}
    
    public int getTeclaMascara0(Opcion opcion) {
    	int iTeclaMascara= InputEvent.CTRL_MASK;
    	
    	if(opcion.getid_tipo_tecla_mascara().equals(2L)) {
    		iTeclaMascara= InputEvent.ALT_MASK;
    		
    	} else if(opcion.getid_tipo_tecla_mascara().equals(3L)) {
    		iTeclaMascara= InputEvent.SHIFT_MASK;
    		
    	}  else if(opcion.getid_tipo_tecla_mascara().equals(4L)) {
      		iTeclaMascara= InputEvent.CTRL_MASK | InputEvent.ALT_MASK;
      		
      	}  else if(opcion.getid_tipo_tecla_mascara().equals(5L)) {
      		iTeclaMascara= InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK;
      	}
    	
    	return iTeclaMascara;
    }
    
    public static ArrayList<Opcion> getMenuOpcionesHijoDesdeOpcion(Opcion opcionPadre,ArrayList<Opcion> opcionesUsuario) throws Exception	{		
    	ArrayList<Opcion> opcionesHijo=new ArrayList<Opcion>();
    	try	{
			
    		for(Opcion opcion:opcionesUsuario) {
    			if(opcion.getid_opcion()!=null && opcion.getid_opcion().equals(opcionPadre.getId())){
    				opcionesHijo.add(opcion);
    			}
    		}
    		
		} catch(Exception e) {
			throw e;
		}
		
		return opcionesHijo;
    }
    
    public void getMenuOpcionesHijos(JMenu menuPadre,GrupoOpcion grupo_opcionUsuario,ArrayList<Opcion> opcionesUsuario) throws Exception {		
		try	{					
			JMenuItem menuItemHijo= null;
			JMenu menuHijo= null;
			KeyStroke keyStroke =null;
			String sMenuLabel="";
			
			ArrayList<Opcion> opcionesHijosDesdeGrupoOpcion=new ArrayList<Opcion>();
			ArrayList<Opcion> opcionesHijosDesdeOpcion=new ArrayList<Opcion>();
			
			//opcionesHijos=sistemaLogicAdditional.getOpcionesHijos(opcionPadre,bigIdSistema,strPerfiles);
			
			opcionesHijosDesdeGrupoOpcion=MainJFrame.getMenuOpcionesHijoDesdeGrupoOpcion(grupo_opcionUsuario,opcionesUsuario);
			
				if(opcionesHijosDesdeGrupoOpcion.size()>0) {
					
					for(Opcion opcionHijo:opcionesHijosDesdeGrupoOpcion) {	
						if(opcionHijo.getid_opcion()==null || (opcionHijo.getid_opcion()!=null && opcionHijo.getid_opcion()<=0)) {
							opcionesHijosDesdeOpcion=MainJFrame.getMenuOpcionesHijoDesdeOpcion(opcionHijo,opcionesHijosDesdeGrupoOpcion);
							
							sMenuLabel=opcionHijo.getnombre();							
							if(Constantes.ISDEVELOPING) {
								sMenuLabel=opcionHijo.getId()+"_"+sMenuLabel+"("+opcionHijo.getpaquete_original()+"."+opcionHijo.getnombre_clase()+")";
							}
							
							if(opcionesHijosDesdeOpcion.size()<=0) {
								menuItemHijo= new JMenuItem(sMenuLabel);																
								FuncionesSwing.setBoldMenuItem(menuItemHijo, this.JInternalFrameBaseAuxiliar.getsTipoTamanioGeneral(),false,true,this.JInternalFrameBaseAuxiliar);
								
								menuItemHijo.putClientProperty("opcionActual", opcionHijo);
								menuItemHijo.setActionCommand(this.getActionCommand(opcionHijo));
								menuItemHijo.addActionListener(this);
								
								if(MainMenuJFrame.verificarTeclaMascaraGlobal(opcionHijo.getid_tipo_tecla_mascara(),opcionHijo.gettecla())) {
									if(opcionHijo.gettecla()!=null && !opcionHijo.gettecla().trim().equals("")) {
										keyStroke = KeyStroke.getKeyStroke(opcionHijo.gettecla().charAt(0),MainMenuJFrame.getTeclaMascara(opcionHijo.getid_tipo_tecla_mascara()));
										menuItemHijo.setAccelerator(keyStroke);
									}
								} else {
									JOptionPane.showMessageDialog(this,"OPCION "+opcionHijo.getnombre()+" INTENTA USAR COMBINACION DE TECLAS YA USADO GLOBALMENTE,USE OTRA","ERP",JOptionPane.ERROR_MESSAGE);
								}
								
								menuPadre.add(menuItemHijo);
								
							} else {
								menuHijo = new JMenu(sMenuLabel);
								FuncionesSwing.setBoldMenu(menuHijo, this.JInternalFrameBaseAuxiliar.getsTipoTamanioGeneral(),false,true,this.JInternalFrameBaseAuxiliar);
								
								this.getMenuOpcionesHijos(menuHijo,opcionHijo,opcionesHijosDesdeOpcion,opcionesHijosDesdeGrupoOpcion);
								
								menuPadre.add(menuHijo);
							}        	
						}
					}	
				}
			} catch(Exception e) {
				throw e;
			}				
	}
    
    public void getMenuOpcionesHijos(JMenu menuPadre,Opcion opcionUsuarioPadre,ArrayList<Opcion> opcionesHijosDesdeOpcion,ArrayList<Opcion> opcionesUsuario) throws Exception {		
		try	{					
			JMenuItem menuItemHijo= null;
			JMenu menuHijo= null;
			KeyStroke keyStroke=null;
			String sMenuLabel="";
			
			ArrayList<Opcion> opcionesHijosHijosDesdeOpcion=new ArrayList<Opcion>();
							
			//opcionesHijos=sistemaLogicAdditional.getOpcionesHijos(opcionPadre,bigIdSistema,strPerfiles);
			
			//opcionesHijos=this.getMenuOpcionesHijoDesdeOpcion(opcionUsuarioPadre,opcionesUsuario);
			
				if(opcionesHijosDesdeOpcion.size()>0) {
					
					for(Opcion opcionHijo:opcionesHijosDesdeOpcion) {	
						opcionesHijosHijosDesdeOpcion=MainJFrame.getMenuOpcionesHijoDesdeOpcion(opcionHijo,opcionesUsuario);
						
						sMenuLabel=opcionHijo.getnombre();							
						if(Constantes.ISDEVELOPING) {
							sMenuLabel=opcionHijo.getId()+"_"+sMenuLabel+"("+opcionHijo.getpaquete_original()+"."+opcionHijo.getnombre_clase()+")";
						}
						
						if(opcionesHijosHijosDesdeOpcion.size()<=0) {
							menuItemHijo= new JMenuItem(sMenuLabel);	
							FuncionesSwing.setBoldMenuItem(menuItemHijo, this.JInternalFrameBaseAuxiliar.getsTipoTamanioGeneral(),false,true,this.JInternalFrameBaseAuxiliar);
							
							menuItemHijo.putClientProperty("opcionActual", opcionHijo);
							menuItemHijo.setActionCommand(this.getActionCommand(opcionHijo));
							menuItemHijo.addActionListener(this);						
				        					
							//this.getMenuOpcionesHijos(menuItemHijo,opcionHijo,opcionesUsuario);
							
							if(MainMenuJFrame.verificarTeclaMascaraGlobal(opcionHijo.getid_tipo_tecla_mascara(),opcionHijo.gettecla())) {
								if(opcionHijo.gettecla()!=null && !opcionHijo.gettecla().trim().equals("")) {
									keyStroke = KeyStroke.getKeyStroke(opcionHijo.gettecla().charAt(0),MainMenuJFrame.getTeclaMascara(opcionHijo.getid_tipo_tecla_mascara()));
									menuItemHijo.setAccelerator(keyStroke);
								}
							} else {
								JOptionPane.showMessageDialog(this,"OPCION "+opcionHijo.getnombre()+" INTENTA USAR COMBINACION DE TECLAS YA USADO GLOBALMENTE,USE OTRA","ERP",JOptionPane.ERROR_MESSAGE);
							}
							
							menuPadre.add(menuItemHijo);
							
						} else {
							menuHijo = new JMenu(sMenuLabel);
							FuncionesSwing.setBoldMenu(menuHijo, this.JInternalFrameBaseAuxiliar.getsTipoTamanioGeneral(),false,true,this.JInternalFrameBaseAuxiliar);
							
							this.getMenuOpcionesHijos(menuHijo,opcionHijo,opcionesHijosHijosDesdeOpcion,opcionesUsuario);
							
							menuPadre.add(menuHijo);
						}
					}	
				}
			} catch(Exception e) {
				throw e;
			}				
	}
    
    public static ArrayList<Opcion> getMenuOpcionesHijoDesdeGrupoOpcion(GrupoOpcion grupo_opcion,ArrayList<Opcion> opcionesUsuario) throws Exception	{		
    	ArrayList<Opcion> opcionesHijo=new ArrayList<Opcion>();
    	try	{
			
    		for(Opcion opcion:opcionesUsuario) {
    			if(/*opcion.getid_opcion()==null &&*/ opcion.getid_grupo_opcion()!=null&&opcion.getid_grupo_opcion().equals(grupo_opcion.getId())){
    				opcionesHijo.add(opcion);
    			}
    		}
    		
		} catch(Exception e) {
			throw e;
		}
		
		return opcionesHijo;
    }
    
   
    
    public String getActionCommand(Opcion opcionHijo) {
    	String sActionCommand="";
    	
    	sActionCommand=opcionHijo.getpaquete()+"-"+opcionHijo.getnombre_clase().trim()+"-"+opcionHijo.getId();
    			
    	return sActionCommand;
    }
    
    public void setPruebaInternalFrame()
	{
		
		// Se construye el panel que ira dentro del JInternalFrame
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		p.add (new JLabel("Una etiqueta"));
		p.add (new JTextField(10));
		
		// Se construye el JInternalFrame
		JInternalFrame internal = new JInternalFrame("Un Internal Frame");
		internal.add(p);
		
		// Es importante darle tamaño -pack()- al JInternalFrame,
		// porque si no, tendrá tamaño 0,0 y no lo veremos.
		internal.pack();
		
		// Por defecto el JInternalFrame no es redimensionable ni
		// tiene el botón de cerrar, así que se lo ponemos.
		internal.setResizable(true);
		internal.setClosable(true);
		
		// Se mete el internal en el JDesktopPane
		desktop.add(internal);
		
		
		
		// Se visualiza el JInternalFrame 
		internal.setVisible(true);
	}
    
    //React to menu selections.
    public void actionPerformed(ActionEvent e) {
    	try {
    		this.startProcessMainMenu(true);
    		
    		JMenuItem jMenuItem=null;
    		Opcion opcionActual=null;
    		
    		    		    		
    		//ImageIcon imageIcon= new ImageIcon(AuxiliarImagenes.class.getResource("wait.gif"));	      		
    		//setPruebaInternalFrame();
    	    
    	/*	
        if ("TipoNoticia.jsp".equals(e.getActionCommand())
        	||"TipoProfecia.jsp".equals(e.getActionCommand())
        	||"ParametroGeneral.jsp".equals(e.getActionCommand())
        	||"Noticia.jsp".equals(e.getActionCommand())
        	||"Profecia.jsp".equals(e.getActionCommand())
        	||"GrupoContacto.jsp".equals(e.getActionCommand())
        	||"GrupoMail.jsp".equals(e.getActionCommand())
        	||"Intervalo.jsp".equals(e.getActionCommand())
        	||"CssTitulo.jsp".equals(e.getActionCommand())
        	||"CssResumen.jsp".equals(e.getActionCommand())
        	||"CssFrase.jsp".equals(e.getActionCommand())
        	||"CssBackground.jsp".equals(e.getActionCommand())
        	||"SALIR".equals(e.getActionCommand())
        	)
        { //new
        */
    		if(e.getSource().getClass().equals(JMenuItem.class)) {
    			jMenuItem=(JMenuItem)e.getSource();
    			opcionActual=(Opcion)jMenuItem.getClientProperty("opcionActual");
    		}
    		    		    		
           this.createFrame(e.getActionCommand(),opcionActual);
    		
    		
        /*} else
        { //quit
            quit();
        } 
        */     
    	} catch(Exception ex) {
    		ex.printStackTrace();
    		FuncionesSwing.manageException2(this, ex,logger,"MODULOS");	
    		
    	} finally {
    		this.finishProcessMainMenu(true);
    	}
        
    }
    
    public void startProcessMainMenu(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoVisual ,this.jPanelParametrosReportesTipoVisual, this.jScrollPanelDatosTipoVisual,this.jPanelPaginacionTipoVisual, this.jScrollPanelDatosEdicionTipoVisual, this.jPanelAccionesTipoVisual,this.jPanelAccionesFormularioTipoVisual,this.jmenuBarLogin,this.jmenuBarDetalleTipoVisual,this.jTtoolBarTipoVisual,this.jTtoolBarDetalleTipoVisual);		
		//CURSOR MANUAL
		//this.cursor=this.getCursor();
		
		//this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
		
    	if(Constantes2.CON_PROCESO_HILO) {
    		Thread threadRunnableProcess;
			ProcessMainRunnable processRunnable;
			
			processRunnable=new ProcessMainRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(this.desktop);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			//processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.mainJFrame=this;
			
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();					
			threadRunnableProcess.start();
			
			//SwingUtilities.invokeLater(processRunnable);
			
			//JOptionPane.showMessageDialog(this, "INIT");			
			
			
			
    	} else {
    		//final JDesktopPane jDesktopFinal=this.desktop; 
    		habilitarDeshabilitarControlesMainMenu(false);
    		
    		startProcess();
    	}
    
    	//final JMenuBar jMenuBarFinal=this.getJMenuBar();
		
		//FuncionesSwing.enableDisableComponents(jDesktopFinal,false,1,2);
		//FuncionesSwing.enableDisableComponents(jMenuBarFinal,false,1,2);
				
		
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
						//FuncionesSwing.enableDisableComponents(jPanelMenuFinal,false,1,2);
						
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
		
    	//final JDesktopPane jDesktopFinal=this.desktop;
    	//final JMenuBar jMenuBarFinal=this.getJMenuBar();
		
    	if(Constantes2.CON_PROCESO_HILO) {
    		
    		Thread threadRunnableProcess;
			ProcessMainRunnable processRunnable;
			
			processRunnable=new ProcessMainRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(this.desktop);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			//processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.mainJFrame=this;
			
			threadRunnableProcess=new Thread(processRunnable);//.start();					
			threadRunnableProcess.start();
			
			//SwingUtilities.invokeLater(processRunnable);
			
			//JOptionPane.showMessageDialog(this, "fin");			
			//this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			
			
    	} else {
			if(conSplash) {
				try {
					SwingUtilities.invokeLater(new MainJFrame(this,"Proceso"));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
    	}
    	
		//this.setCursor(this.cursor);
	}
    
    public void run() {
  	  	try {
  	  		if(this.sTipo.equals("Proceso")) {
	  		  	//FuncionesSwing.enableDisableComponents(jDesktopFinal,true,1,2);		
	  		  	this.mainJFrame.habilitarDeshabilitarControlesMainMenu(true);
	  		  
	  		  	//FuncionesSwing.enableDisableComponents(jMenuBarFinal,true,1,2);
	  		 
	  		 	//PIERDE FOCO PRINCIPAL
	  			this.mainJFrame.finishProcess();//this.
	  			
  	  		} else if(this.sTipo.equals("MainJFrame")){
  	  			MainJFrame.createAndShowGUI();
  	  		}
  		  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    protected void habilitarDeshabilitarControlesMainMenu(Boolean esHabilitar) {
    	this.getJMenuBar().setEnabled(esHabilitar);
    	
    	for(Component component:this.getJMenuBar().getComponents()) {
    		component.setEnabled(esHabilitar);
    	}
    }
    
    //Create a new internal frame.
    protected void createFrame(String strPaquetePantalla,Opcion opcionActualMenuItem)
    {
    	JInternalFrameBase jinternalFrame=new JInternalFrameBase();
    	//Cursor cursor=this.getCursor();
    	
    	try
    	{
    		//this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));	
    		
    		String[] arrayPaquetePantalla = strPaquetePantalla.split("-");
    		String strPaquete="NONE";
    		String strPantalla="NONE";
    		Long idOpcionActual=0L;
    		
    		if(arrayPaquetePantalla.length>0) {
    			strPaquete=arrayPaquetePantalla[0];
    			
    			if(arrayPaquetePantalla.length>1) {
    				strPantalla=arrayPaquetePantalla[1];
    			}
    			
    			if(arrayPaquetePantalla.length>2) {
    				idOpcionActual=Long.parseLong(arrayPaquetePantalla[2]);
    			}
    		}
    		
    		if(Constantes.ISDEVELOPING) {
    			System.out.println("Modulo:"+strPaquete+",Opcion:"+strPantalla);
    		}
    		
    		//OPCION ACTUAL
    		Opcion opcionActual=new Opcion();
    		
    		if(opcionActualMenuItem==null) {
	    		if(Constantes.ISUSAEJBLOGICLAYER) {
	    			opcionLogic.getEntityWithConnection(idOpcionActual);	
	    			opcionActual=opcionLogic.getOpcion();			
	    				
	    		} else if(Constantes.ISUSAEJBREMOTE) {
	    			//opcionActual=opcionImplementable.getEntity(idOpcionActual,this.datosCliente);
	    			
	    		} else if(Constantes.ISUSAEJBHOME) {
	    			//opcionActual=opcionImplementableHome.getEntity(idOpcionActual,this.datosCliente);		
	    		}
    		} else {
    			opcionActual=opcionActualMenuItem;
    		}
    		
    		long start_time=0;
    		long end_time=0;
    		
    		if(Constantes2.ISDEVELOPING2) {
    			start_time = System.currentTimeMillis();
    		}
    		
    		/*
    		MainJFrameActiCuentasCoPa mainJFrameActiCuentasCoPa=new MainJFrameActiCuentasCoPa();
    		MainJFrameFactuInvenComi mainJFrameFactuInvenComi=new MainJFrameFactuInvenComi();
    		MainJFrameNomiImpoTeso mainJFrameNomiImpoTeso=new MainJFrameNomiImpoTeso();
    		MainJFrameProduPunVen mainJFrameProduPunVen=new MainJFrameProduPunVen();
    		MainJFrameSeguContaActi mainJFrameSeguContaActi=new MainJFrameSeguContaActi();
    		*/
    		  
    		/*
    		MainJFrameActiCuentasCoPa.usuarioActual=this.usuarioActual;
    		MainJFrameActiCuentasCoPa.parametroGeneralSg=this.parametroGeneralSg;
    		MainJFrameActiCuentasCoPa.parametroGeneralUsuario=this.parametroGeneralUsuario;	
    		MainJFrameActiCuentasCoPa.moduloActual=this.moduloActual;
    		MainJFrameActiCuentasCoPa.desktop=this.desktop;
    		   		
    		MainJFrameFactuInvenComi.usuarioActual=this.usuarioActual;
    		MainJFrameFactuInvenComi.parametroGeneralSg=this.parametroGeneralSg;
    		MainJFrameFactuInvenComi.parametroGeneralUsuario=this.parametroGeneralUsuario;	
    		MainJFrameFactuInvenComi.moduloActual=this.moduloActual;
    		MainJFrameFactuInvenComi.desktop=this.desktop;
    	
    		MainJFrameNomiImpoTeso.usuarioActual=this.usuarioActual;
    		MainJFrameNomiImpoTeso.parametroGeneralSg=this.parametroGeneralSg;
    		MainJFrameNomiImpoTeso.parametroGeneralUsuario=this.parametroGeneralUsuario;	
    		MainJFrameNomiImpoTeso.moduloActual=this.moduloActual;
    		MainJFrameNomiImpoTeso.desktop=this.desktop;
    	  		
    		MainJFrameProduPunVen.usuarioActual=this.usuarioActual;
    		MainJFrameProduPunVen.parametroGeneralSg=this.parametroGeneralSg;
    		MainJFrameProduPunVen.parametroGeneralUsuario=this.parametroGeneralUsuario;	
    		MainJFrameProduPunVen.moduloActual=this.moduloActual;
    		MainJFrameProduPunVen.desktop=this.desktop;
    		
    		
    		MainJFrameSeguContaActi.usuarioActual=this.usuarioActual;
    		MainJFrameSeguContaActi.parametroGeneralSg=this.parametroGeneralSg;
    		MainJFrameSeguContaActi.parametroGeneralUsuario=this.parametroGeneralUsuario;	
    		MainJFrameSeguContaActi.moduloActual=this.moduloActual;
    		MainJFrameSeguContaActi.desktop=this.desktop;
    	    */
    		
    		this.desktop.constantes2=this.constantes2;
    		
    		
    		if(strPaquete.equals(Constantes.SMODULO_ACTIVOS_FIJOS)) {    			
    			jinternalFrame=MainJFrameActivosFijos.getJInternalFrameBaseMenu(strPaquete,strPantalla,opcionActual
    													,this.usuarioActual,this.resumenUsuarioActual,this.parametroGeneralSg,this.parametroGeneralUsuario,this.moduloActual,this.desktop,false);
    			
    		} else if(strPaquete.equals(Constantes.SMODULO_CARTERA)) {    			
        			jinternalFrame=MainJFrameCartera.getJInternalFrameBaseMenu(strPaquete,strPantalla,opcionActual
        													,this.usuarioActual,this.resumenUsuarioActual,this.parametroGeneralSg,this.parametroGeneralUsuario,this.moduloActual,this.desktop,false);
        			
        	} else if(strPaquete.equals(Constantes.SMODULO_CUENTAS_PORPAGAR)) {    			
        			jinternalFrame=MainJFrameCuentasPorPagar.getJInternalFrameBaseMenu(strPaquete,strPantalla,opcionActual
        													,this.usuarioActual,this.resumenUsuarioActual,this.parametroGeneralSg,this.parametroGeneralUsuario,this.moduloActual,this.desktop,false);
        			
        	} else if(strPaquete.equals(Constantes.SMODULO_CUENTAS_PORCOBRAR)) {    			
        			jinternalFrame=MainJFrameCuentasPorCobrar.getJInternalFrameBaseMenu(strPaquete,strPantalla,opcionActual
        													,this.usuarioActual,this.resumenUsuarioActual,this.parametroGeneralSg,this.parametroGeneralUsuario,this.moduloActual,this.desktop,false);
        			
        	} else if(strPaquete.equals(Constantes.SMODULO_FACTURACION)) {   			
    			jinternalFrame=MainJFrameFacturacion.getJInternalFrameBaseMenu(strPaquete,strPantalla,opcionActual
    													,this.usuarioActual,this.resumenUsuarioActual,this.parametroGeneralSg,this.parametroGeneralUsuario,this.moduloActual,this.desktop,false);
    			
    		} else if(strPaquete.equals(Constantes.SMODULO_INVENTARIO)) {   			
    			jinternalFrame=MainJFrameInventario.getJInternalFrameBaseMenu(strPaquete,strPantalla,opcionActual
    													,this.usuarioActual,this.resumenUsuarioActual,this.parametroGeneralSg,this.parametroGeneralUsuario,this.moduloActual,this.desktop,false);
    			
    		} else if(strPaquete.equals(Constantes.SMODULO_COMISIONES)) {   			
    			jinternalFrame=MainJFrameComisiones.getJInternalFrameBaseMenu(strPaquete,strPantalla,opcionActual
    													,this.usuarioActual,this.resumenUsuarioActual,this.parametroGeneralSg,this.parametroGeneralUsuario,this.moduloActual,this.desktop,false);
    			
    		} else if(strPaquete.equals(Constantes.SMODULO_NOMINA)) {   			
    			jinternalFrame=MainJFrameNomina.getJInternalFrameBaseMenu(strPaquete,strPantalla,opcionActual
    												,this.usuarioActual,this.resumenUsuarioActual,this.parametroGeneralSg,this.parametroGeneralUsuario,this.moduloActual,this.desktop,false);
    			
    		} else if(strPaquete.equals(Constantes.SMODULO_IMPORTACIONES)
        			) {   			
    			jinternalFrame=MainJFrameImportaciones.getJInternalFrameBaseMenu(strPaquete,strPantalla,opcionActual
    												,this.usuarioActual,this.resumenUsuarioActual,this.parametroGeneralSg,this.parametroGeneralUsuario,this.moduloActual,this.desktop,false);
    			
    		} else if(strPaquete.equals(Constantes.SMODULO_TESORERIA)) {   			
    			jinternalFrame=MainJFrameTesoreria.getJInternalFrameBaseMenu(strPaquete,strPantalla,opcionActual
    												,this.usuarioActual,this.resumenUsuarioActual,this.parametroGeneralSg,this.parametroGeneralUsuario,this.moduloActual,this.desktop,false);
    			
    		} else if(strPaquete.equals(Constantes.SMODULO_PRODUCCION)
        			) {   			
    			jinternalFrame=MainJFrameProduccion.getJInternalFrameBaseMenu(strPaquete,strPantalla,opcionActual
    												,this.usuarioActual,this.resumenUsuarioActual,this.parametroGeneralSg,this.parametroGeneralUsuario,this.moduloActual,this.desktop,false);
    		
    		} else if(strPaquete.equals(Constantes.SMODULO_PUNTO_VENTA)
        			) {   			
    			jinternalFrame=MainJFramePuntoVenta.getJInternalFrameBaseMenu(strPaquete,strPantalla,opcionActual
    												,this.usuarioActual,this.resumenUsuarioActual,this.parametroGeneralSg,this.parametroGeneralUsuario,this.moduloActual,this.desktop,false);
    		
    		} else if(strPaquete.equals(Constantes.SMODULO_SEGURIDAD)) {
    			
    			jinternalFrame=MainJFrameSeguridad.getJInternalFrameBaseMenu(strPaquete,strPantalla,opcionActual
    													,this.usuarioActual,this.resumenUsuarioActual,this.parametroGeneralSg,this.parametroGeneralUsuario,this.moduloActual,this.desktop,false);
    		
    		} else if(strPaquete.equals(Constantes.SMODULO_CONTABILIDAD)) {
    			
    			jinternalFrame=MainJFrameContabilidad.getJInternalFrameBaseMenu(strPaquete,strPantalla,opcionActual
    													,this.usuarioActual,this.resumenUsuarioActual,this.parametroGeneralSg,this.parametroGeneralUsuario,this.moduloActual,this.desktop,false);
    		
    		} else if(strPaquete.equals(Constantes.SMODULO_SRI)) {
    			
    			jinternalFrame=MainJFrameSris.getJInternalFrameBaseMenu(strPaquete,strPantalla,opcionActual
    													,this.usuarioActual,this.resumenUsuarioActual,this.parametroGeneralSg,this.parametroGeneralUsuario,this.moduloActual,this.desktop,false);
    		}
    		    		
    		//IGUAL SE DEBE IGUALAR AL CREAR FRAME, OSEA ESTO DUPLICA    		
    		//jinternalFrame.constantes2=this.constantes2;
    		
    		String sPathExe="";
    		String sPathFile="";
    		
    		if(strPantalla.equals("SALIR")) {
    		//if(strPaquete.equals("SALIR")) {
	    		//quit();
	    		this.dispose();
	    		
	    	} else if(strPantalla.equals("CALCULADORA")) {
	    		Runtime.getRuntime().exec("calc");
	    		
	    	} else if(strPantalla.equals("EXCEL")) {
	    		sPathExe=getPathOffice("EXCEL");
	    		sPathFile=getPathFileActual();
	    		
	    		//System.out.println(sPathExe+"->File="+sPathFile);
	    		
	    		if(this.permiteAbrirArchivo("EXCEL",sPathFile)) {
	    			Process process = new ProcessBuilder(sPathExe,sPathFile).start();
	    		} else {
	    			JOptionPane.showMessageDialog(this,"EXCEL NO PUEDE ABRIR EL ARCHIVO:"+sPathFile,"ERP",JOptionPane.ERROR_MESSAGE);
	    		}
	    			    		
	    		//Runtime.getRuntime().exec(sPathExe);
	    		
	    	} else if(strPantalla.equals("WORD")) {	    		
	    		sPathExe=getPathOffice("WORD");
	    		sPathFile=getPathFileActual();
	    		
	    		//System.out.println(sPathExe+"->File="+sPathFile);
	    		
	    		if(this.permiteAbrirArchivo("WORD",sPathFile)) {
	    			Process process = new ProcessBuilder(sPathExe,sPathFile).start();
	    		} else {
	    			JOptionPane.showMessageDialog(this,"WORD NO PUEDE ABRIR EL ARCHIVO:"+sPathFile,"ERP",JOptionPane.ERROR_MESSAGE);
	    		}
	    			    			    		
	    		//Runtime.getRuntime().exec(sPathExe,"\"");	   
	    		
	    	}  else if(strPantalla.equals("NOTEPAD")) {
	    		sPathFile=getPathFileActual();
	    		
	    		//System.out.println("notepad"+"->File="+sPathFile);
	    		
	    		if(this.permiteAbrirArchivo("NOTEPAD",sPathFile)) {
	    			Process process = new ProcessBuilder("notepad",sPathFile).start();
	    		} else {
	    			JOptionPane.showMessageDialog(this,"NOTEPAD NO PUEDE ABRIR EL ARCHIVO:"+sPathFile,"ERP",JOptionPane.ERROR_MESSAGE);
	    		}
	    		
	    		//Runtime.getRuntime().exec("notepad");
	    		
	    	} else if(strPantalla.equals("EMPRESA_SUCURSAL")) {
	    		opcionActual=this.cargarVariablesAutomatico(strPantalla);
	    		
	    		ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrame procesocambiarempresasucursalBeanSwingJInternalFrame=null;	    		
	    		
	    		procesocambiarempresasucursalBeanSwingJInternalFrame=new ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =procesocambiarempresasucursalBeanSwingJInternalFrame;
				
	    		//System.out.println("EMPRESA_SUCURSAL");
	    		
	    		
	    		
	    	} else if(strPantalla.equals("EJERCICIO_PERIODO")) {
	    		opcionActual=this.cargarVariablesAutomatico(strPantalla);
	    		
	    		ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrame procesocambiarejercicioperiodoBeanSwingJInternalFrame=null;
	    		
	    		procesocambiarejercicioperiodoBeanSwingJInternalFrame=new ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =procesocambiarejercicioperiodoBeanSwingJInternalFrame;
				
	    		//System.out.println("EJERCICIO_PERIODO");
	    		
	    		
	    		
	    	} else if(strPantalla.equals("REINICIALIZAR")) {
	    		Constantes2.S_PATH_ULTIMO_ARCHIVO="";
	    	}
    		
    		
    		if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(desktop,jinternalFrame);
    		}
    		
    		
    		//OPTIMIZAR MEMORIA
    		System.gc();
    		
    		
    		//SwingUtilities.updateComponentTreeUI(jinternalFrame);
    		
    		//jinternalFrame.pack();
    		jinternalFrame.setAutoscrolls(true);
    		
		    //frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
    		 jinternalFrame.setVisible(true); //necessary as of 1.3
	    	
	        desktop.add(jinternalFrame);
	               			
	        jinternalFrame.setSelected(true);
	        
	        if(Constantes2.ISDEVELOPING2) {
	        	end_time = System.currentTimeMillis();		
	        	Funciones2.getMensajeTiempoEjecucion(start_time,end_time,"Carga Ventana",false);	        	
	        }
	        
    		
	        //JOptionPane.showMessageDialog(this,"CARGADO",Constantes.SERROR,JOptionPane.INFORMATION_MESSAGE);
		      
    		/*
    		SistemaBeanSwingJInternalFrame frame1;
    		UsuarioBeanSwingJInternalFrame frame2;
    		PerfilBeanSwingJInternalFrame frame3;
    		OpcionBeanSwingJInternalFrame frame4;
        	PerfilUsuarioBeanSwingJInternalFrame frame5;
        	PerfilOpcionBeanSwingJInternalFrame frame6;
        	
	    	if(strPantalla.equals("Sistema"))
	    	{
	    		frame1=new SistemaBeanSwingJInternalFrame(true,true);
	    		frame1.setJDesktopPane(desktop);
	    		frame =frame1;
	    	}
	    	else if(strPantalla.equals("Usuario"))
	    	{
	    		frame2=new UsuarioBeanSwingJInternalFrame(true,true);
	    		frame2.setJDesktopPane(desktop);
	    		frame =frame2;
	    	}
	    	else if(strPantalla.equals("Perfil"))
	    	{
	    		frame3=new PerfilBeanSwingJInternalFrame(true,true);
	    		frame3.setJDesktopPane(desktop);
	    		frame =frame3;
	    	}
	    	else if(strPantalla.equals("Opcion"))
	    	{
	    		frame4=new OpcionBeanSwingJInternalFrame(true,true);
	    		frame4.setJDesktopPane(desktop);
	    		frame =frame4;
	    	}
	    	else if(strPantalla.equals("PerfilUsuario"))
	    	{
	    		frame5=new PerfilUsuarioBeanSwingJInternalFrame(true,true);
	    		frame5.setJDesktopPane(desktop);
	    		frame =frame5;
	    	}
	    	else if(strPantalla.equals("PerfilOpcion"))
	    	{
	    		frame6=new PerfilOpcionBeanSwingJInternalFrame(true,true);
	    		frame6.setJDesktopPane(desktop);
	    		frame =frame6;
	    	}
	    
	    	
	    	frame.setAutoscrolls(true);
		    //frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
	    	frame.setVisible(true); //necessary as of 1.3
	    	
	        desktop.add(frame);
	        
	        frame.setSelected(true);
    		 */
    		
    	} catch(Exception e) {
			FuncionesSwing.manageException(this, e);
			
		}  finally {
    		//this.setCursor(cursor);	
    	}
    }
	
    public Boolean permiteAbrirArchivo(String sType,String sPathFile) {
    	Boolean permite=false;
    	
    	if(!sPathFile.equals("")) {
	    	if(sType.equals("WORD"))  {
	    		if(sPathFile.contains(".doc") || sPathFile.contains(".docx") || sPathFile.contains(".txt")) {
	    			permite=true;
	    		}
	    		
	    	} else if(sType.equals("EXCEL"))  {
	    		if(sPathFile.contains(".xls") || sPathFile.contains(".xlsx") || sPathFile.contains(".txt")) {
	    			permite=true;
	    		}
	    		
	    	} else if(sType.equals("NOTEPAD"))  {
	    		if(sPathFile.contains(".txt")) {
	    			permite=true;
	    		}
	    	}
	    	
    	} else {
    		permite=true;
    	}
    	
    	return permite;
    }
    
    public String getPathFileActual() {
    	String sPathFile="";
    	
    	if(!Constantes2.S_PATH_ULTIMO_ARCHIVO.equals("")) {
    		sPathFile="\""+Constantes2.S_PATH_ULTIMO_ARCHIVO+"\"";//\"
    	}
    	
    	return sPathFile;
    }
    
    public String getPathOffice(String sType) {
    	String sPathOffice="";
    	Boolean existe86=false;
    	
    	try {
    		sPathOffice=System.getenv("ProgramFiles(X86)");
    		 existe86=true;
    		 
    	} catch (Exception e) {
    		sPathOffice=System.getenv("ProgramFiles");
    	}
    	
    	if(existe86) {
    		sPathOffice+="\\Microsoft Office\\Office14\\";
    		
    	} else {
    		sPathOffice+="\\Microsoft Office\\Office14\\";
    	}
    	
    	
    	if(sType.equals("WORD"))  {
    		sPathOffice+="winword.exe";
    		
    	} else if(sType.equals("EXCEL"))  {
    		sPathOffice+="excel.exe";
    	}
    	
    	sPathOffice="\""+sPathOffice+"\"";
    	
    	return sPathOffice;    	
    }
    
    public static void cerrarJInternalFramesExistentes(JDesktopPane jDesktopPane,JInternalFrameBase jInternalFrameBase) {
    	JInternalFrameBase jInternalFrameBaseExistente=new JInternalFrameBase();
        
    	if(Constantes2.ISDEVELOPING2) {
    		System.out.println("Numero de Ventanas en uso="+jDesktopPane.getComponents().length);
    	}
    	
    	for(Component componentExistente : jDesktopPane.getComponents()) {
    		if(jInternalFrameBase!=null && componentExistente.getClass().equals(jInternalFrameBase.getClass())) {//&& jInternalFrameBase.getjInternalFrameParent()==null
    			jInternalFrameBaseExistente=(JInternalFrameBase)componentExistente;
    			jInternalFrameBaseExistente.setVisible(false);    			
    			jInternalFrameBaseExistente.dispose();
    			jInternalFrameBaseExistente=null;
    		}
        }       
    }
    
    public static void cerrarJInternalFramesExistentes(JDesktopPane jDesktopPane,JInternalFrame jInternalFrame) {
    	JInternalFrame jInternalFrameExistente=new JInternalFrame();
       
    	if(Constantes2.ISDEVELOPING2) {
    		System.out.println("Numero de Ventanas en uso="+jDesktopPane.getComponents().length);
    	}
    	
    	for(Component componentExistente : jDesktopPane.getComponents()) {
    		if(componentExistente.getClass().equals(jInternalFrame.getClass())) {//&& jInternalFrameBase.getjInternalFrameParent()==null
    			jInternalFrameExistente=(JInternalFrame)componentExistente;
    			jInternalFrameExistente.setVisible(false);    			
    			jInternalFrameExistente.dispose();
    			jInternalFrameExistente=null;
    		}
        }       
    }
    
    //Quit the application.
    protected void quit() {
        System.exit(0);
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     * @throws Exception 
     */
    private static void createAndShowGUI() throws Exception
    {
        //Make sure we have nice window decorations.
        JFrame.setDefaultLookAndFeelDecorated(true);

        //Create and set up the window.
        MainJFrame frame = new MainJFrame(new Usuario(),new ResumenUsuario(),new ParametroGeneralSg(),new ParametroGeneralUsuario(),new Modulo(),"NORMAL",new JDesktopPaneMe(),new Constantes2());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Display the window.
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
    	/*
        javax.swing.SwingUtilities.invokeLater
        (
            new Runnable()
            {
                public void run()
                {
                    try {
						createAndShowGUI();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                }
            }
        );
        */
    	
        try {
			SwingUtilities.invokeLater(new MainJFrame(null,"MainJFrame"));
		
        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}

