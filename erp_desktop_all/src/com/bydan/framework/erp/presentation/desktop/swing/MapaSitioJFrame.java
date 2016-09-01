package com.bydan.framework.erp.presentation.desktop.swing;

import javax.imageio.ImageIO;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NameClassPair;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;

import org.apache.log4j.Logger;

import javax.swing.UIManager.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;




//import com.bydan.erp.service.ejb.interfaces.TipoProfeciaImplementable;
//import com.bydan.erp.util.TipoProfeciaConstantesFunciones;
import com.bydan.framework.ConstantesCommon;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.framework.erp.util.ConnexionType;
import com.bydan.framework.erp.util.Constantes;
import com.bydan.framework.erp.util.Constantes2;
import com.bydan.framework.erp.util.Funciones;
import com.bydan.framework.erp.util.Funciones2;
import com.bydan.framework.erp.util.PaginaTipo;
import com.bydan.framework.erp.util.ParameterDbType;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;
import com.bydan.framework.erp.business.logic.QueryWhereSelectParameters;
import com.bydan.framework.global.seguridad.updates.entity.ActualizacionUpdate;
import com.bydan.framework.global.seguridad.updates.entity.AnioUpdate;
import com.bydan.framework.global.seguridad.updates.entity.MesUpdate;
import com.bydan.framework.global.seguridad.updates.entity.ProcesoUpdate;
import com.bydan.framework.global.seguridad.updates.entity.QueryUpdate;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.AccionBeanSwingJInternalFrame;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.PerfilJInternalFrame;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.SistemaBeanSwingJInternalFrame;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.SistemaJInternalFrame;
//import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.ModuloDefaultListCellRenderer;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.PerfilSessionBean;
//import com.bydan.erp.seguridad.service.ejb.interfaces.*;

import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.ClienteBeanSwingJInternalFrame;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.AsientoContableBeanSwingJInternalFrame;

import java.awt.event.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Properties;
import java.util.Set;
//import org.jboss.ejb.client.naming.*;

@SuppressWarnings({ "unused", "serial" })
public class MapaSitioJFrame extends JFrameMe implements Runnable {
	/*
	protected static SistemaImplementable sistemaImplementable=SistemaConstantesFunciones.getSistemaImplementableEjbReference(SistemaConstantesFunciones.SREMOTEEJBNAME_RMI);//LoginJFrame.lookupRemoteStatelessCalculator2();//
	
	protected static ModuloImplementable moduloImplementable=ModuloConstantesFunciones.getModuloImplementableEjbReference(ModuloConstantesFunciones.SREMOTEEJBNAME_RMI);//LoginJFrame.lookupRemoteStatelessCalculator2();//
	//public static ModuloImplementableHome moduloImplementableHome= ModuloConstantesFunciones.getModuloImplementableHomeEjbReference(ModuloConstantesFunciones.SLOCALEJBNAME_JBOSS81);
	
	protected static OpcionImplementable opcionImplementable=OpcionConstantesFunciones.getOpcionImplementableEjbReference(OpcionConstantesFunciones.SREMOTEEJBNAME_RMI);//LoginJFrame.lookupRemoteStatelessCalculator2();//
	//public static OpcionImplementableHome opcionImplementableHome= OpcionConstantesFunciones.getOpcionImplementableHomeEjbReference(OpcionConstantesFunciones.SLOCALEJBNAME_JBOSS81);

	protected static GrupoOpcionImplementable grupoOpcionImplementable=GrupoOpcionConstantesFunciones.getGrupoOpcionImplementableEjbReference(GrupoOpcionConstantesFunciones.SREMOTEEJBNAME_RMI);//LoginJFrame.lookupRemoteStatelessCalculator2();//
	//public static GrupoOpcionImplementableHome grupoOpcionImplementableHome= GrupoOpcionConstantesFunciones.getGrupoOpcionImplementableHomeEjbReference(GrupoOpcionConstantesFunciones.SLOCALEJBNAME_JBOSS81);

	//protected static SistemaImplementable sistemaImplementable=SistemaConstantesFunciones.getSistemaImplementableEjbReference(SistemaConstantesFunciones.SREMOTEEJBNAME_RMI);//LoginJFrame.lookupRemoteStatelessCalculator();//
	//protected static SistemaImplementableHome sistemaImplementableHome= SistemaConstantesFunciones.getSistemaImplementableHomeEjbReference(SistemaConstantesFunciones.SLOCALEJBNAME_RMI);
	
	
	protected static ParametroGeneralSgImplementable parametroGeneralSgImplementable=ParametroGeneralSgConstantesFunciones.getParametroGeneralSgImplementableEjbReference(ParametroGeneralSgConstantesFunciones.SREMOTEEJBNAME_RMI);
	//protected static ParametroGeneralSgImplementableHome parametroGeneralSgImplementableHome= ParametroGeneralSgConstantesFunciones.getParametroGeneralSgImplementableHomeEjbReference(ParametroGeneralSgConstantesFunciones.SLOCALEJBNAME_RMI);
	
	protected static ParametroGeneralUsuarioImplementable parametroGeneralUsuarioImplementable=ParametroGeneralUsuarioConstantesFunciones.getParametroGeneralUsuarioImplementableEjbReference(ParametroGeneralUsuarioConstantesFunciones.SREMOTEEJBNAME_RMI);
	//protected static ParametroGeneralUsuarioImplementableHome parametroGeneralUsuarioImplementableHome= ParametroGeneralUsuarioConstantesFunciones.getParametroGeneralUsuarioImplementableHomeEjbReference(ParametroGeneralUsuarioConstantesFunciones.SLOCALEJBNAME);
	
	protected static ResumenUsuarioImplementable resumenUsuarioImplementable=ResumenUsuarioConstantesFunciones.getResumenUsuarioImplementableEjbReference(ResumenUsuarioConstantesFunciones.SREMOTEEJBNAME_RMI);//LoginJFrame.lookupRemoteStatelessCalculator2();//
	//protected static ResumenUsuarioImplementableHome resumenUsuarioImplementableHome=ResumenUsuarioConstantesFunciones.getResumenUsuarioImplementableHomeEjbReference(ResumenUsuarioConstantesFunciones.SREMOTEEJBNAME_RMI);//LoginJFrame.lookupRemoteStatelessCalculator2();//
	
	protected static UsuarioImplementable usuarioImplementable=UsuarioConstantesFunciones.getUsuarioImplementableEjbReference(UsuarioConstantesFunciones.SREMOTEEJBNAME_RMI);//LoginJFrame.lookupRemoteStatelessCalculator2();//
	//protected static UsuarioImplementableHome usuarioImplementableHome=UsuarioConstantesFunciones.getUsuarioImplementableHomeEjbReference(UsuarioConstantesFunciones.SREMOTEEJBNAME_RMI);//LoginJFrame.lookupRemoteStatelessCalculator2();//

	protected static UpdateImplementable updateImplementable=UpdateConstantesFunciones.getUpdateImplementableEjbReference(UpdateConstantesFunciones.SREMOTEEJBNAME_RMI);//LoginJFrame.lookupRemoteStatelessCalculator();//
	//protected static UpdateImplementableHome updateImplementableHome= UpdateConstantesFunciones.getUpdateImplementableHomeEjbReference(UpdateConstantesFunciones.SLOCALEJBNAME_RMI);
	*/
	
	public String sTipo="";
	public MapaSitioJFrame mapaSitioJFrame=null;
	
	protected ModuloLogicAdditional sistemaLogicAdditional;
	protected UsuarioLogicAdditional usuarioLogicAdditional;
	protected UsuarioLogic usuarioLogic;
	protected ResumenUsuarioLogic resumenUsuarioLogic;
	protected ParametroGeneralSgLogic parametroGeneralSgLogic;
	protected ParametroGeneralSg parametroGeneralSg;
	protected ParametroGeneralUsuarioLogic parametroGeneralUsuarioLogic;
	protected ParametroGeneralUsuario parametroGeneralUsuario;
	protected Usuario usuarioActual;
	protected ResumenUsuario resumenUsuarioActual;
	
	protected DatosCliente datosCliente;
	
	private JButton jButtonAceptar;
    private JButton jButtonCancelar;
    private JLabel jLabelUsuario;
    private JLabel jLabelModulo;
    @SuppressWarnings("rawtypes")
	public JComboBox jComboBoxModulo;
    private JTextField jTextFieldUsuario;
    
    private JPanel jContentPane;
    private JPanel jPanelParametros;
    private JPanel jPanelArbol;
    private JScrollPane JScrollPaneArbol;// = new JScrollPane(tree);
    private JTree jTree;
    private DefaultMutableTreeNode defaultMutableTreeNode;
    private DefaultTreeModel defaultTreeModel;
    
    protected JMenuBar jmenuBarLogin;
    protected JMenu jmenuLogin;
    protected JMenuItem jMenuItemAceptar;
    protected JMenuItem jMenuItemCancelar;
    protected JMenuItem jMenuItemCerrarSesion;
    
    private static Logger logger = Logger.getLogger(MapaSitioJFrame.class);  
	
    //static final int xOffset = 10, yOffset = 35;
    public static Boolean CON_CARGAR_MEMORIA_INICIAL=true; 
    
    public List<Modulo> modulosForeignKey=new ArrayList<Modulo>();

    public MapaSitioJFrame(MapaSitioJFrame mapaSitioJFrame,String sTipo) throws Exception {
    	this.sTipo=sTipo;
    	this.mapaSitioJFrame=mapaSitioJFrame;
    }
    
	public List<Modulo> getmodulosForeignKey() {
		return modulosForeignKey;
	}

	public void setmodulosForeignKey(List<Modulo> modulosForeignKey) {
		this.modulosForeignKey = modulosForeignKey;
	}
	
	public List<Opcion> opcionsModulo=new ArrayList<Opcion>();

	public List<Opcion> getopcionsModulo() {
		return opcionsModulo;
	}

	public void setopcionsModulo(List<Opcion> opcionsModulo) {
		this.opcionsModulo = opcionsModulo;
	}
	
	public List<GrupoOpcion> grupoOpcionsModulo=new ArrayList<GrupoOpcion>();

	public List<GrupoOpcion> getgrupoOpcionsModulo() {
		return grupoOpcionsModulo;
	}

	public void setgrupoOpcionsModulo(List<GrupoOpcion> grupoOpcionsModulo) {
		this.grupoOpcionsModulo = grupoOpcionsModulo;
	}
	/*
    @SuppressWarnings({ "unchecked", "rawtypes" })
	private static SistemaImplementable lookupRemoteStatelessCalculator() {
        final Hashtable jndiProperties = new Hashtable();
        jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
        SistemaImplementable sistemaImplementable=null;
        try {
        final Context context = new InitialContext(jndiProperties);
        
	      // The JNDI lookup name for a stateless session bean has the syntax of:
	      // ejb:<appName>/<moduleName>/<distinctName>/<beanName>!<viewClassName>
	      //
	      // <appName> The application name is the name of the EAR that the EJB is deployed in 
	      //           (without the .ear).  If the EJB JAR is not deployed in an EAR then this is
	      //           blank.  The app name can also be specified in the EAR's application.xml
	      //           
	      // <moduleName> By the default the module name is the name of the EJB JAR file (without the
	      //              .jar suffix).  The module name might be overridden in the ejb-jar.xml
	      //
	      // <distinctName> : AS7 allows each deployment to have an (optional) distinct name. 
	      //                  This example does not use this so leave it blank.
	      //
	      // <beanName>     : The name of the session been to be invoked.
	      //
	      // <viewClassName>: The fully qualified classname of the remote interface.  Must include
	      //                  the whole package name.

        	// let's do the lookup
        String sClassName=SistemaImplementable.class.getName();
       
        sistemaImplementable=(SistemaImplementable) context.lookup("ejb:/erp_ejb/SistemaHomeRemoteAdditional!" + sClassName);
        //sistemaImplementable=(SistemaImplementable) context.lookup("java:global/erp_ejb/SistemaHomeRemoteAdditional!com.bydan.erp.seguridad.service.ejb.interfaces.SistemaImplementable");
        //java:app/erp_ejb/SistemaHomeRemoteAdditional!com.bydan.erp.seguridad.service.ejb.interfaces.SistemaImplementable

        } catch(Exception e) {
        	e.printStackTrace();
        }
      
      return sistemaImplementable;
    }
    */
    /*
    @SuppressWarnings({ "rawtypes", "unchecked" })
	private static SistemaImplementable lookupRemoteStatelessCalculator2() {
    	
    	final Hashtable jndiProperties = new Hashtable();
        
        jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
        SistemaImplementable sistemaImplementable=null;
        try {
        final Context context = new InitialContext(jndiProperties);
                  
        String sClassName=SistemaImplementable.class.getName();
       
        sistemaImplementable=(SistemaImplementable) context.lookup("ejb:/erp_ejb/SistemaHomeRemote!" + sClassName);
        	
       
        Object sistemas=sistemaImplementable.getEntities("", new DatosCliente());
        
        //sistemaImplementable=(SistemaImplementable) context.lookup("java:global/erp_ejb/SistemaHomeRemoteAdditional!com.bydan.erp.seguridad.service.ejb.interfaces.SistemaImplementable");
        //java:app/erp_ejb/SistemaHomeRemoteAdditional!com.bydan.erp.seguridad.service.ejb.interfaces.SistemaImplementable

        } catch(Exception e) {
        	e.printStackTrace();
        }
      
      return sistemaImplementable;
    }
    */
    
    public MapaSitioJFrame() throws Exception {
    	try {
    		/*
    		long start = System.currentTimeMillis();  
    		EntityManagerFactory JPAENTITYMANAGERFACTORY=null;
    		
    		if(Constantes.CONNEXIONTYPE.equals(ConnexionType.HIBERNATE)) {
    			JPAENTITYMANAGERFACTORY=Persistence.createEntityManagerFactory("PersistenceUnitSeguridad");
    		}
    		
    		double diff = (double)System.currentTimeMillis() - start;  
    	    System.out.println("time (ms): " + diff);  
    	    */
    		
    		datosCliente=new DatosCliente();
    		sistemaLogicAdditional=new ModuloLogicAdditional();
    		usuarioLogicAdditional=new UsuarioLogicAdditional();    		    	
    		usuarioLogic=new UsuarioLogic();
    		parametroGeneralSgLogic=new ParametroGeneralSgLogic();
    		parametroGeneralUsuarioLogic=new ParametroGeneralUsuarioLogic();
    		resumenUsuarioLogic=new ResumenUsuarioLogic();
    		
    		this.initComponents();
    		
    		this.cargarForeignKeys();
    		
    		if(Constantes.ISDEVELOPING) {    			    			
    			JRootPane rootPane = this.getRootPane();
    			rootPane.setDefaultButton(this.jButtonAceptar);
    			
    		}
    		
    		this.cargarParametroGeneral();
    		
    		//ESTE PASO DEMORA EN CARGAR
    		//MapaSitioJFrame.CargarObjetosRendimientoCritico("TIPO1");
    		
    		//this.cargarMenus();
    		
    		//this.CargarObjetosRendimientoCritico(new Usuario(),parametroGeneralSg,parametroGeneralUsuario);
    		
    		if(Constantes.ISDEVELOPING) {
    			System.out.println("***** FIN MAPA SITIO INICIALIZACION*****");
    		}
    	} catch(Exception e) {
    		try {
				FuncionesSwing.manageException(this, e,logger);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
    	}
    }

    public static void CargarObjetosRendimientoCritico(String sTipo) {
    	/*
    	if(sTipo.equals("TIPO1")) {
    		
    		MainJFrameSeguridad.AUX_TEMP="CARGADO";
    		MainJFrameContabilidad.AUX_TEMP="CARGADO";
    		
    		MainJFrameActivosFijos.AUX_TEMP="CARGADO";
    		MainJFrameCartera.AUX_TEMP="CARGADO";
    		MainJFrameCuentasPorPagar.AUX_TEMP="CARGADO";
    		MainJFrameCuentasPorCobrar.AUX_TEMP="CARGADO";    		
    		
    		
    	} else if(sTipo.equals("TIPO2")) {
    		
    		MainJFrameFacturacion.AUX_TEMP="CARGADO";
    		MainJFrameComisiones.AUX_TEMP="CARGADO";
    		MainJFrameInventario.AUX_TEMP="CARGADO";
    		
    		MainJFrameNomina.AUX_TEMP="CARGADO";
    		MainJFrameImportaciones.AUX_TEMP="CARGADO";
    		MainJFrameTesoreria.AUX_TEMP="CARGADO";
    		
    		MainJFrameProduccion.AUX_TEMP="CARGADO";
    		MainJFramePuntoVenta.AUX_TEMP="CARGADO";
    		
    	}
    	*/
    }
    
    public static void CargarObjetosRendimientoCriticoPorModulo(Modulo moduloUsuarioSeleccionado,Opcion opcionActual,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,JDesktopPane desktop) throws Exception {
    	/*
    	if(moduloUsuarioSeleccionado.getId().equals(1L)) {
    		MainJFrameContabilidad.AUX_TEMP="CARGADO";
    		LoginJFrame.CargarObjetosRendimientoCriticoModuloContabilidad(opcionActual,usuarioActual,parametroGeneralSg,parametroGeneralUsuario,moduloActual,desktop);
    	}
    	*/
    	
    	int id_modulo=moduloUsuarioSeleccionado.getId().intValue();
    	
    	switch(id_modulo) {
	    	 case 1://CONTA 
	    		 MainJFrameContabilidad.AUX_TEMP="CARGADO";
	     		 MapaSitioJFrame.CargarObjetosRendimientoCriticoModuloContabilidad(opcionActual,usuarioActual,resumenUsuarioActual,parametroGeneralSg,parametroGeneralUsuario,moduloActual,desktop);
	    	    break;
	    	    
	    	 case 2: //SEGURIDAD
	    		 MainJFrameSeguridad.AUX_TEMP="CARGADO";
	    	     break;
	    	     
	    	 case 3: // PUNTO VENTA
	    		 MainJFramePuntoVenta.AUX_TEMP="CARGADO";
	    	     break;
	    	     
	    	 case 5: //INVENTARIO 
	    		 MainJFrameInventario.AUX_TEMP="CARGADO";
	    	     break;
	    	     
	    	 case 6: //FACTURACION 
	    		 MainJFrameFacturacion.AUX_TEMP="CARGADO";
	    		 break;
	    		 
	    	 case 8://NOMINA 
	    		 MainJFrameNomina.AUX_TEMP="CARGADO";
	    	     break;
	    	     
	    	 case 9://TESORERIA 
	    		 MainJFrameTesoreria.AUX_TEMP="CARGADO";
	    	     break;
	    	     
	    	 case 11://ACTIVOS FIJOS 
	    		 MainJFrameActivosFijos.AUX_TEMP="CARGADO";
	    	     break;
	    	     
	    	 case 14://CUENTAS POR COBRAR
	    		 MainJFrameCuentasPorCobrar.AUX_TEMP="CARGADO";
	    		 MapaSitioJFrame.CargarObjetosRendimientoCriticoModuloCuentasPorCobrar(opcionActual,usuarioActual,resumenUsuarioActual,parametroGeneralSg,parametroGeneralUsuario,moduloActual,desktop);
	    	     break;
	    	     
	    	 case 15://CUENTAS POR PAGAR
	    		 MainJFrameCuentasPorPagar.AUX_TEMP="CARGADO";
	    		 MapaSitioJFrame.CargarObjetosRendimientoCriticoModuloCuentasPorPagar(opcionActual,usuarioActual,resumenUsuarioActual,parametroGeneralSg,parametroGeneralUsuario,moduloActual,desktop);
	    	     break;
	    	     
	    	 case 16://COMISIONES
	    		 MainJFrameComisiones.AUX_TEMP="CARGADO";
	    	     break;

	    	 case 17://PRODUCCION
	    		 MainJFrameProduccion.AUX_TEMP="CARGADO";
	    	     break;
	    	     
	    	 case 18://SRI
	    		 //MainJFrameSri.AUX_TEMP="CARGADO";
	    	     break;
	    	     
	    	 case 19://PROYECTOS
	    		 //MainJFrameProyectos.AUX_TEMP="CARGADO";
	    	     break;

	    	 case 20://IMPORTACIONES
	    		 MainJFrameImportaciones.AUX_TEMP="CARGADO";
	    	     break;
	    	     
	    	 case 21://GERENCIAL
	    		 //MainJFrameGerencial.AUX_TEMP="CARGADO";
	    	     break;
	    	     
	    	 default: 
	    	     
	    	     break;
    	}
    }       
    
    public static void CargarObjetosRendimientoCriticoModuloContabilidad(Opcion opcionActual,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,JDesktopPane desktop) throws Exception {
    	if(AsientoContableBeanSwingJInternalFrame.CON_CARGAR_MEMORIA_INICIAL) {
    		AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame=new AsientoContableBeanSwingJInternalFrame(false,false,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.BUSQUEDA,true,false,true,false);//true,true)
    		AsientoContableBeanSwingJInternalFrame.CON_CARGAR_MEMORIA_INICIAL=false;
    	}
    }
    
    public static void CargarObjetosRendimientoCriticoModuloCuentasPorCobrar(Opcion opcionActual,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,JDesktopPane desktop) throws Exception {
    	/*
    	if(AsientoContableBeanSwingJInternalFrame.CON_CARGAR_MEMORIA_INICIAL) {
    		AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame=new AsientoContableBeanSwingJInternalFrame(false,false,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,true,false,true,false);//true,true)
    		AsientoContableBeanSwingJInternalFrame.CON_CARGAR_MEMORIA_INICIAL=false;
    	}
    	*/
    	
    	if(ClienteBeanSwingJInternalFrame.CON_CARGAR_MEMORIA_INICIAL) {
    		ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(false,false,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.BUSQUEDA,true,false,true,false);//true,true)
    		ClienteBeanSwingJInternalFrame.CON_CARGAR_MEMORIA_INICIAL=false;
    	}
    }
    
    public static void CargarObjetosRendimientoCriticoModuloCuentasPorPagar(Opcion opcionActual,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,JDesktopPane desktop) throws Exception {
    	/*
    	if(AsientoContableBeanSwingJInternalFrame.CON_CARGAR_MEMORIA_INICIAL) {
    		AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame=new AsientoContableBeanSwingJInternalFrame(false,false,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,true,false,true,false);//true,true)
    		AsientoContableBeanSwingJInternalFrame.CON_CARGAR_MEMORIA_INICIAL=false;
    	}
    	*/
    	
    	if(ClienteBeanSwingJInternalFrame.CON_CARGAR_MEMORIA_INICIAL) {
    		ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(false,false,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.BUSQUEDA,true,false,true,false);//true,true)
    		ClienteBeanSwingJInternalFrame.CON_CARGAR_MEMORIA_INICIAL=false;
    	}
    }
    
    public static void CargarObjetosRendimientoCritico(Opcion opcionActual,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,JDesktopPane desktop) throws Exception {
    	AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame=new AsientoContableBeanSwingJInternalFrame(false,false,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.BUSQUEDA,true,false,true,false);//true,true)
    }
    
    public void cargarParametroGeneral() throws Exception {
    	this.cargarDatosCliente();
    	
    	/*
    	String finalQuery=SeguridadSql.GetWhereParametroGeneralActivo(this.parametroGeneralSgLogic.getConnexionType(), this.parametroGeneralSgLogic.getParameterDbType());
		
    	if(Constantes.ISUSAEJBLOGICLAYER) {	
			this.parametroGeneralSgLogic.setDatosCliente(this.datosCliente);
						
						
			this.parametroGeneralSgLogic.getEntityWithConnection(finalQuery);
			
			if(this.parametroGeneralSgLogic.getParametroGeneralSg()!=null && this.parametroGeneralSgLogic.getParametroGeneralSg().getId()>0) {
				this.parametroGeneralSg=this.parametroGeneralSgLogic.getParametroGeneralSg();
				//System.out.println(this.parametroGeneralSgLogic.getParametroGeneralSg().getnombre_empresa());
			} else {
				this.parametroGeneralSg= new ParametroGeneralSg();
			}
			
    		
			//Usuario usuario=this.usuarioLogicAdditional.validarUsuario(sUsuario, sPassword);
			
			//if(usuario.getId()>0) {
			//	isValidado=true;//usuarioLogicAdditional.validarUsuarioSeguridad(strNombreUsuario, strClaveUsuario);
			//}
			
		} else if(Constantes.ISUSAEJBREMOTE) {
			this.parametroGeneralSg=MapaSitioJFrame.parametroGeneralSgImplementable.getEntity(finalQuery,this.datosCliente);
		
		} else if(Constantes.ISUSAEJBHOME) {
			this.parametroGeneralSg=MapaSitioJFrame.parametroGeneralSgImplementableHome.getEntity(finalQuery,this.datosCliente);				
		}
    	*/
    	
    	//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,new Modulo(),new Usuario()));
    	
    	this.setTitle("Mapa del Sistema");
    			
    	//LoginJFrame.SetLookAndFeel(Integer.parseInt(this.parametroGeneralSg.getid_tipo_visual().toString()));
    }
    
    public void cargarParametroGeneralUsuario(Long lIdUsuario) throws Exception {
    	this.cargarDatosCliente();
    	
    	
    	if(Constantes.ISUSAEJBLOGICLAYER) {	
			this.parametroGeneralUsuarioLogic.setDatosCliente(this.datosCliente);
						
						
			this.parametroGeneralUsuarioLogic.getEntityWithConnection(lIdUsuario);
			
			if(this.parametroGeneralUsuarioLogic.getParametroGeneralUsuario()!=null && this.parametroGeneralUsuarioLogic.getParametroGeneralUsuario().getId()>0) {
				this.parametroGeneralUsuario=this.parametroGeneralUsuarioLogic.getParametroGeneralUsuario();
				//System.out.println(this.parametroGeneralUsuarioLogic.getParametroGeneralUsuario().getnombre_empresa());
			} else {
				this.parametroGeneralUsuario= new ParametroGeneralUsuario();
			}
			
    		/*
			Usuario usuario=this.usuarioLogicAdditional.validarUsuario(sUsuario, sPassword);
			
			if(usuario.getId()>0) {
				isValidado=true;//usuarioLogicAdditional.validarUsuarioSeguridad(strNombreUsuario, strClaveUsuario);
			}
			*/
		} else if(Constantes.ISUSAEJBREMOTE) {
			//this.parametroGeneralUsuario=MapaSitioJFrame.parametroGeneralUsuarioImplementable.getEntity(lIdUsuario,this.datosCliente);
		
		} else if(Constantes.ISUSAEJBHOME) {
			//this.parametroGeneralUsuario=MapaSitioJFrame.parametroGeneralUsuarioImplementableHome.getEntity(lIdUsuario,this.datosCliente);				
		}
    	
    	//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralUsuario,new Modulo(),new Usuario()));
    	
    	MapaSitioJFrame.SetLookAndFeel(Integer.parseInt(this.parametroGeneralUsuario.getid_tipo_visual().toString()));
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

	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessLogin(true);
			
			if(sTipo.equals("AceptarLogin")) {
				jButtonAceptarActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarLogin")) {
				jButtonCancelarActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarSesionLogin")) {
				jButtonCerrarSesionActionPerformed(evt,true);
			}
  		} catch(Exception e) {
  			e.printStackTrace();
  			
  		} finally {
      		this.finishProcessLogin(true);
      	}
    }
	
	public void jButtonActionPerformedGeneral(String sTipo,java.awt.event.ActionEvent evt) { 	  
		try {
			this.startProcessLogin(true);
			
			if(sTipo.equals("AceptarLogin")) {
				jButtonAceptarActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarLogin")) {
				jButtonCancelarActionPerformed(evt);
				
			}
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
      		this.finishProcessLogin(true);
      	}
    }
	
	private void initComponents() {
    	  
    	//int intX=Toolkit.getDefaultToolkit().getScreenSize().width/2-this.getWidth();
    	//int intY=Toolkit.getDefaultToolkit().getScreenSize().height/2-this.getHeight();    			
    	 
    	String sUsuarioDefault="";
    	String sPasswordDefault="";
    	
    	if(Constantes.ISDEVELOPING) {
    		sUsuarioDefault="ADMIN";
    		sPasswordDefault="123456";
    	}
    	//this.setTitle("Login");
    	//Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();		
		//this.setSize((screenSize.width-xOffset*3)/2,screenSize.height-yOffset*3);
		
		//this.setSize(new Dimension(300,150));
		
    	//this.setSize(new Dimension(375,175));
    	this.setSize(new Dimension(800,700));
    	
    	
    	int intX=Toolkit.getDefaultToolkit().getScreenSize().width/2-this.getWidth()/2;
    	int intY=Toolkit.getDefaultToolkit().getScreenSize().height/2-this.getHeight()/2;
    	
    	//this.setLocation(intX, intY);
    	this.setLocation(intX, 20);
    	
    	
		this.setIconImage(FuncionesSwing.getImagenBackground("login.gif"));//Constantes2.S_ICON_IMAGE		
		
    	this.jLabelUsuario = new JLabelMe();
    	this.jLabelModulo = new JLabelMe();
    	this.jComboBoxModulo= new JComboBoxMe();
    	this.jTextFieldUsuario = new JTextFieldMe();
    	this.jButtonAceptar = new JButtonMe();
    	this.jButtonCancelar = new JButtonMe();
    	
    	
		
		
    	this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Mapa del Sistema");

        this.jLabelUsuario.setText("Usuario");
        this.jLabelModulo.setText("Modulo");
        
        this.jTextFieldUsuario.setText(sUsuarioDefault);
        this.jTextFieldUsuario.setMinimumSize(new Dimension(100,20));
		this.jTextFieldUsuario.setMaximumSize(new Dimension(100,20));
		this.jTextFieldUsuario.setPreferredSize(new Dimension(100,20));
		
		this.jComboBoxModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL));
		this.jComboBoxModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL));
		this.jComboBoxModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL));

		
		String sMapKey = "CTRL_1";
		InputMap inputMap =null;
		
        this.jButtonAceptar.setText("Aceptar");
        this.jButtonAceptar.setToolTipText("Aceptar"+FuncionesSwing.getKeyMensaje("ACEPTAR"));
        FuncionesSwing.addImagenButtonGeneral(this.jButtonAceptar,"ok","ACEPTAR");
        
        this.jButtonAceptar.addActionListener(new ButtonJFrameMeActionListener(this,"AceptarLogin"));
        
        /*
        this.jButtonAceptar.addActionListener (
        	new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                try {
						jButtonAceptarActionPerformed(evt);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            }
	        }
        );
		*/
        
        inputMap = this.jButtonAceptar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACEPTAR") , FuncionesSwing.getMaskKey("ACEPTAR")), sMapKey);
	
		this.jButtonAceptar.getActionMap().put(sMapKey, new ButtonJFrameMeAbstractAction(this,"AceptarLogin"));
		
        /*
        sMapKey = "F5";
		inputMap = this.jButtonAceptar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		//inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_1 , KeyEvent.CTRL_MASK), sMapKey);
		inputMap.put(KeyStroke.getKeyStroke("F5"), sMapKey);
		
		this.jButtonAceptar.getActionMap().put(sMapKey, new AbstractAction() {
		  private static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
		    	try {
					jButtonAceptarActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		});
		*/
		
        this.jButtonCancelar.setText("Cancelar");
        this.jButtonCancelar.setToolTipText("Cancelar"+FuncionesSwing.getKeyMensaje("CANCELAR_GLOBAL"));
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelar,"cerrar","CANCELAR");
        
        this.jButtonCancelar.addActionListener(new ButtonJFrameMeActionListener(this,"CancelarLogin"));
        
        
        inputMap = this.jButtonCancelar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR_GLOBAL") , FuncionesSwing.getMaskKey("CANCELAR_GLOBAL")), sMapKey);
	
		this.jButtonCancelar.getActionMap().put(sMapKey, new ButtonJFrameMeAbstractAction(this,"CancelarLogin"));
		
        
		
        this.jContentPane = new JPanelMe("fondo_formulario",true);//fondo_formulario        
        this.jPanelParametros = new JPanelMe("fondo_content",true);  
        this.jPanelArbol = new JPanelMe("fondo_content",true);
        
        this.jPanelParametros.setBorder(javax.swing.BorderFactory.createTitledBorder("Mapa"));
        this.jPanelParametros.setToolTipText("Mapa");
        this.jPanelParametros.setName("Mapa"); 
        
        this.jPanelArbol.setBorder(javax.swing.BorderFactory.createTitledBorder("Arbol"));
        this.jPanelArbol.setToolTipText("Arbol");
        this.jPanelArbol.setName("Arbol"); 
        
        this.jContentPane.setLayout(new GridBagLayout());
        this.jPanelParametros.setLayout(new GridBagLayout());
        this.jPanelArbol.setLayout(new GridBagLayout());

        this.defaultMutableTreeNode = new DefaultMutableTreeNode("OPCIONES");
        this.defaultTreeModel = new DefaultTreeModel(this.defaultMutableTreeNode);
        this.jTree = new JTree(this.defaultTreeModel);
        
    	//this.jTree = new JTree(defaultMutableTreeNode);
    	
    	
    	this.JScrollPaneArbol = new JScrollPane(jTree);
    	
    	this.JScrollPaneArbol.setMinimumSize(new Dimension(this.getWidth(),this.getHeight()-(this.getHeight()/4)));
		this.JScrollPaneArbol.setMaximumSize(new Dimension(this.getWidth(),this.getHeight()-(this.getHeight()/4)));
		this.JScrollPaneArbol.setPreferredSize(new Dimension(this.getWidth(),this.getHeight()-(this.getHeight()/4)));
		
       // GridBagLayout gridaBagLayout= new GridBagLayout();
        
		
        /*
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridx = 0;			
		this.jPanelParametros.add(this.jLabelUsuario, gridBagConstraints);
		*/
		
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridx = 0;			
		this.jPanelParametros.add(this.jLabelModulo, gridBagConstraints);
		
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridx = 1;			
		this.jPanelParametros.add(this.jComboBoxModulo, gridBagConstraints);
		
		//this.jPanelParametros.add(this.jTextFieldUsuario, gridBagConstraints);
		
        
		/*
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.gridx = 0;			
		this.jPanelParametros.add(this.jLabelPassword, gridBagConstraints);
		
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.gridx = 1;			
		this.jPanelParametros.add(this.jPasswordFieldPassword, gridBagConstraints);
		*/
		
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.gridx = 0;			
		this.jPanelParametros.add(this.jButtonAceptar, gridBagConstraints);
		
		
		/*
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.gridx = 1;			
		this.jPanelParametros.add(this.jButtonCerrarSesion, gridBagConstraints);
		*/
		
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.gridx = 1;			
		this.jPanelParametros.add(this.jButtonCancelar, gridBagConstraints);
		
		
		
        gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridy =0;		
		gridBagConstraints.gridx = 0;
		this.jContentPane.add(this.jPanelParametros, gridBagConstraints);
				
		
		
    	
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridy =1;		
		gridBagConstraints.gridx = 0;
		//this.jContentPane.add(this.jPanelArbol, gridBagConstraints);
		this.jContentPane.add(this.JScrollPaneArbol, gridBagConstraints);
		
		this.setContentPane(this.jContentPane);
						 				
    }

	@SuppressWarnings("unchecked")
	private void cargarForeignKeys() throws Exception {
		this.cargarCombosModulosForeignKeyLista("");
		
		this.jComboBoxModulo.removeAllItems();

		for(Modulo modulo:this.modulosForeignKey) {
			this.jComboBoxModulo.addItem(modulo);
		}
		

		//this.jComboBoxModulo.setRenderer(new ModuloDefaultListCellRenderer());
	}
	
	public void cargarCombosModulosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.modulosForeignKey=new ArrayList<Modulo>();

			ModuloLogic moduloLogic=new ModuloLogic();

			moduloLogic.getModuloDataAccess().setIsForForeingKeyData(true);

			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				moduloLogic.getTodosModulosWithConnection(sFinalQuery,new Pagination());
				this.modulosForeignKey=moduloLogic.getModulos();
				
			} else if(Constantes.ISUSAEJBREMOTE) {
				//this.modulosForeignKey=moduloImplementable.getTodosModulosWithConnection(sFinalQuery,new Pagination(),datosCliente);
				
			} else if(Constantes.ISUSAEJBHOME) {
				//this.modulosForeignKey=moduloImplementableHome.getTodosModulosWithConnection(sFinalQuery,new Pagination(),datosCliente);
			}
			//ARCHITECTURE
			
		}
		catch(Exception e)
		{
			throw e;
		}
	}
	
	public void cargarCombosOpcionsModulo(String sFinalQuery)throws Exception
	{
		try
		{
			this.opcionsModulo=new ArrayList<Opcion>();

			OpcionLogic opcionLogic=new OpcionLogic();

			//opcionLogic.getOpcionDataAccess().setIsForForeingKeyData(true);

			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionLogic.getTodosOpcionsWithConnection(sFinalQuery,new Pagination());
				this.opcionsModulo=opcionLogic.getOpcions();
				
			} else if(Constantes.ISUSAEJBREMOTE) {
				//this.opcionsModulo=opcionImplementable.getTodosOpcionsWithConnection(sFinalQuery,new Pagination(),datosCliente);
				
			} else if(Constantes.ISUSAEJBHOME) {
				//this.opcionsModulo=opcionImplementableHome.getTodosOpcionsWithConnection(sFinalQuery,new Pagination(),datosCliente);
			}
			//ARCHITECTURE
			
		}
		catch(Exception e)
		{
			throw e;
		}
	}
	
	public void cargarCombosGrupoOpcionsModulo(String sFinalQuery)throws Exception
	{
		try
		{
			this.grupoOpcionsModulo=new ArrayList<GrupoOpcion>();

			GrupoOpcionLogic grupoOpcionLogic=new GrupoOpcionLogic();

			//grupoOpcionLogic.getGrupoOpcionDataAccess().setIsForForeingKeyData(true);

			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				grupoOpcionLogic.getTodosGrupoOpcionsWithConnection(sFinalQuery,new Pagination());
				this.grupoOpcionsModulo=grupoOpcionLogic.getGrupoOpcions();
				
			} else if(Constantes.ISUSAEJBREMOTE) {
				//this.grupoOpcionsModulo=grupoOpcionImplementable.getTodosGrupoOpcionsWithConnection(sFinalQuery,new Pagination(),datosCliente);
				
			} else if(Constantes.ISUSAEJBHOME) {
				//this.grupoOpcionsModulo=grupoOpcionImplementableHome.getTodosGrupoOpcionsWithConnection(sFinalQuery,new Pagination(),datosCliente);
			}
			//ARCHITECTURE
			
		}
		catch(Exception e)
		{
			throw e;
		}
	}
	
    private void cargarDatosCliente() {
    	this.datosCliente.setIdUsuario(17L);
		this.datosCliente.setsIPPC("0.0.0.0");
		this.datosCliente.setsNamePC("x");
		this.datosCliente.setsUsuarioPC("u");
    }
    
    public void startProcessLogin(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoVisual ,this.jPanelParametrosReportesTipoVisual, this.jScrollPanelDatosTipoVisual,this.jPanelPaginacionTipoVisual, this.jScrollPanelDatosEdicionTipoVisual, this.jPanelAccionesTipoVisual,this.jPanelAccionesFormularioTipoVisual,this.jmenuBarLogin,this.jmenuBarDetalleTipoVisual,this.jTtoolBarTipoVisual,this.jTtoolBarDetalleTipoVisual);		
		
		//final JPanel jPanelParametros=this.jPanelParametros; 
		
		//FuncionesSwing.enableDisableComponents(jPanelParametros,false,1,2);
		
		this.habilitarDeshabilitarControlesLogin(false);
		
		startProcess();//this.
		
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
						FuncionesSwing.enableDisableComponents(jPanelParametros,false,1,2);
						
						startProcess();//this.
						
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
    
    public void finishProcessLogin(Boolean conSplash) {		
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoVisual ,this.jPanelParametrosReportesTipoVisual, this.jScrollPanelDatosTipoVisual,this.jPanelPaginacionTipoVisual, this.jScrollPanelDatosEdicionTipoVisual, this.jPanelAccionesTipoVisual,this.jPanelAccionesFormularioTipoVisual,this.jmenuBarLogin,this.jmenuBarDetalleTipoVisual,this.jTtoolBarTipoVisual,this.jTtoolBarDetalleTipoVisual);		
		
		//final JPanel jPanelParametros=this.jPanelParametros; 
		
		if(conSplash) {
			/*
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
			    		  //FuncionesSwing.enableDisableComponents(jPanelParametros,true,1,2);		
			    		  habilitarDeshabilitarControlesLogin(true);
			    		  
			    		  finishProcess();//this.
			    		  
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
			*/
			
			try {
				SwingUtilities.invokeLater(new MapaSitioJFrame(this,"finishProcess"));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}				
	}
    
    public void run() {
		try {
    
			if(this.sTipo.equals("finishProcess")) {
				
				this.mapaSitioJFrame.habilitarDeshabilitarControlesLogin(true);
	    		  
				this.mapaSitioJFrame.finishProcess();
				
				
			} else if(this.sTipo.equals("main")) {
				
				MapaSitioJFrame mapaSitioJFrame=new MapaSitioJFrame();
				
				mapaSitioJFrame.setVisible(true);
				
			} else if(this.sTipo.equals("Thread")) {
				MapaSitioJFrame.CargarObjetosRendimientoCritico(new Opcion(),this.mapaSitioJFrame.usuarioActual,this.mapaSitioJFrame.resumenUsuarioActual,this.mapaSitioJFrame.parametroGeneralSg,this.mapaSitioJFrame.parametroGeneralUsuario,new Modulo(),new JDesktopPane());        		
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
	public void clearTree() {
    	this.defaultMutableTreeNode.removeAllChildren();
        this.defaultTreeModel.reload();
    }
    
    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
    	try {
    		
    		//this.startProcessLogin(true);
    		
    		String sFinalQuery="";
    		Boolean esErrorIngreso=false;
    		
    		   		
    		this.cargarDatosCliente();
    		
    		//this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));	
			
	    	String sUsuario=this.jTextFieldUsuario.getText();
	    	String sPassword="123456";
	    	
	    	
	    	
	    	
	    	//this.defaultMutableTreeNode = new DefaultMutableTreeNode("OPCIONES");
	    	//this.jTree = new JTree(defaultMutableTreeNode);
	    	
	    	//this.defaultMutableTreeNode.removeAllChildren();
	    	
	    	/*
	    	for (int i = 0; i < this.jTree.getRowCount(); i++) {
	    		this.jTree.removeAll();
	    	}
	    	*/
	    	
	    	
	    	this.clearTree();
	    	
	    	
	    	//OpcionImplementable opcionImplementable=OpcionConstantesFunciones.getOpcionImplementableEjbReference(OpcionConstantesFunciones.SREMOTEEJBNAME_RMI);
	    	
	    	//Set<Opcion> opciones=opcionImplementable.getTodosOpcionsWithConnection("", new Pagination(), new DatosCliente());
	    	Boolean isValidado=false;
	    	
	    	Modulo moduloLocal=(Modulo)jComboBoxModulo.getSelectedItem();
	    	
	    	sFinalQuery=" where id_modulo="+moduloLocal.getId();
	    	
	    	this.cargarCombosOpcionsModulo(sFinalQuery);
	    	
	    	for(Opcion opcionLocal:this.opcionsModulo) {
	    		//System.out.println(opcionLocal.getnombre());
	    	}
	    	
	    	ArrayList<Opcion> opcionesUsuarioPadres=new ArrayList<Opcion>(MainJFrame.getMenuOpcionesPadrePrimerNivel(new ArrayList<Opcion>(this.opcionsModulo)));
	         
	    	String sLabelGrupoOpcion="";
	    	
	    	
	    	
	    	
	    	
	    	sFinalQuery=" where id_modulo="+moduloLocal.getId();
	    	
	    	this.cargarCombosGrupoOpcionsModulo(sFinalQuery);
	    		    		    	
	    	
	    	for(GrupoOpcion grupoOpcion:this.grupoOpcionsModulo) {  
	        	sLabelGrupoOpcion=grupoOpcion.getnombre_principal();
	        	 
	        	if(Constantes.ISDEVELOPING) {
	        		sLabelGrupoOpcion=grupoOpcion.getId()+"_"+sLabelGrupoOpcion;
	        	}
	        	
	        	//menu = new JMenu(sLabelGrupoOpcion);	        	
	        	this.getMenuOpcionesHijos(this.defaultMutableTreeNode,grupoOpcion,this.opcionsModulo);	        	 
	        	//menuBar.add(menu);
	        }
	    	
	    	
	    	for (int i = 0; i < this.jTree.getRowCount(); i++) {
	    		this.jTree.expandRow(i);
	    	}
	    	
	    	
	    	/*
	    	if(Constantes.ISUSAEJBLOGICLAYER) {	
				//isValidado=sistemaLogicAdditional.validarUsuario(sUsuario,sPassword);				
	    		this.usuarioLogicAdditional.setDatosCliente(this.datosCliente);
	    		this.usuarioActual=this.usuarioLogicAdditional.validarUsuario(sUsuario, sPassword);
				
	    		
				//if(this.usuarioActual.getId()>0) {
				//	isValidado=true;//usuarioLogicAdditional.validarUsuarioSeguridad(strNombreUsuario, strClaveUsuario);
				//}
				
			} else if(Constantes.ISUSAEJBREMOTE) {
				//isValidado=this.sistemaImplementable.validarUsuario(sUsuario,sPassword);
				this.usuarioActual=MapaSitioJFrame.sistemaImplementable.validarUsuarioConUsuario(sUsuario,sPassword);
			
			} else if(Constantes.ISUSAEJBHOME) {
				//isValidado=this.sistemaImplementableHome.validarUsuario(sUsuario,sPassword);
				this.usuarioActual=MapaSitioJFrame.sistemaImplementableHome.validarUsuarioConUsuario(sUsuario,sPassword);	
			}
	    	
	    	if(this.usuarioActual!=null && this.usuarioActual.getId()>0) {
				isValidado=true;//usuarioLogicAdditional.validarUsuarioSeguridad(strNombreUsuario, strClaveUsuario);
			}
	    	*/	 
	    	
    	} catch(Exception e) {
    		FuncionesSwing.manageException(this, e,logger);
    	
    	}  finally {
      		//this.finishProcessLogin(true);
      	}
    }
    
    private void getMenuOpcionesHijos(DefaultMutableTreeNode defaultMutableTreeNode,GrupoOpcion grupoOpcion,List<Opcion> opcionsModulo) throws Exception {
        DefaultMutableTreeNode defaultMutableTreeNodeGrupoOpcion = null;
         
        
        defaultMutableTreeNodeGrupoOpcion = new DefaultMutableTreeNode(grupoOpcion.getnombre_principal());
        defaultMutableTreeNode.add(defaultMutableTreeNodeGrupoOpcion);
        
        this.getMenuOpcionesHijosGrupoOpcion(defaultMutableTreeNodeGrupoOpcion,grupoOpcion,opcionsModulo);
    }
    
    
    public void getMenuOpcionesHijosGrupoOpcion(DefaultMutableTreeNode defaultMutableTreeNodePadre,GrupoOpcion grupo_opcionUsuario,List<Opcion> opcionesUsuario) throws Exception {		
		try	{					
			JMenuItem menuItemHijo= null;
			JMenu menuHijo= null;
			String sMenuLabel="";
			DefaultMutableTreeNode defaultMutableTreeNodeHijo = null;
		       
			ArrayList<Opcion> opcionesHijosDesdeGrupoOpcion=new ArrayList<Opcion>();
			ArrayList<Opcion> opcionesHijosDesdeOpcion=new ArrayList<Opcion>();
			
			//opcionesHijos=sistemaLogicAdditional.getOpcionesHijos(opcionPadre,bigIdSistema,strPerfiles);
			
			opcionesHijosDesdeGrupoOpcion=MainJFrame.getMenuOpcionesHijoDesdeGrupoOpcion(grupo_opcionUsuario,new ArrayList<Opcion>(opcionesUsuario));
			
				if(opcionesHijosDesdeGrupoOpcion.size()>0) {
					
					for(Opcion opcionHijo:opcionesHijosDesdeGrupoOpcion) {	
						
						if(opcionHijo.getid_opcion()==null || (opcionHijo.getid_opcion()!=null && opcionHijo.getid_opcion()<=0)) {
							opcionesHijosDesdeOpcion=MainJFrame.getMenuOpcionesHijoDesdeOpcion(opcionHijo,opcionesHijosDesdeGrupoOpcion);
							
							sMenuLabel=opcionHijo.getnombre();	
							
							if(Constantes.ISDEVELOPING) {
								sMenuLabel=opcionHijo.getId()+"_"+sMenuLabel+"("+opcionHijo.getpaquete_original()+"."+opcionHijo.getnombre_clase()+")";
							}
							
							
							if(opcionesHijosDesdeOpcion.size()<=0) {								
								defaultMutableTreeNodeHijo = new DefaultMutableTreeNode(sMenuLabel);
								
								defaultMutableTreeNodePadre.add(defaultMutableTreeNodeHijo);
								 
								//menuItemHijo= new JMenuItem(sMenuLabel);																																								
								//menuPadre.add(menuItemHijo);
								
							} else {
								
								defaultMutableTreeNodeHijo = new DefaultMutableTreeNode(sMenuLabel);
								
								//menuHijo = new JMenu(sMenuLabel);
								
								
								this.getMenuOpcionesHijos(defaultMutableTreeNodeHijo,opcionHijo,opcionesHijosDesdeOpcion,opcionesHijosDesdeGrupoOpcion);
								
								
								defaultMutableTreeNodePadre.add(defaultMutableTreeNodeHijo);
								
								//menuPadre.add(menuHijo);
							}        	
						}
					}	
				}
			} catch(Exception e) {
				throw e;
			}				
	}
    
    public void getMenuOpcionesHijos(DefaultMutableTreeNode defaultMutableTreeNodePadre,Opcion opcionUsuarioPadre,ArrayList<Opcion> opcionesHijosDesdeOpcion,ArrayList<Opcion> opcionesUsuario) throws Exception {		
		try	{					
			JMenuItem menuItemHijo= null;
			JMenu menuHijo= null;
			String sMenuLabel="";
			DefaultMutableTreeNode defaultMutableTreeNodeHijo = null;
			
			ArrayList<Opcion> opcionesHijosHijosDesdeOpcion=new ArrayList<Opcion>();
							
			//opcionesHijos=sistemaLogicAdditional.getOpcionesHijos(opcionPadre,bigIdSistema,strPerfiles)			
			//opcionesHijos=this.getMenuOpcionesHijoDesdeOpcion(opcionUsuarioPadre,opcionesUsuario);
			
				if(opcionesHijosDesdeOpcion.size()>0) {
					
					for(Opcion opcionHijo:opcionesHijosDesdeOpcion) {	
						opcionesHijosHijosDesdeOpcion=MainJFrame.getMenuOpcionesHijoDesdeOpcion(opcionHijo,opcionesUsuario);
						
						sMenuLabel=opcionHijo.getnombre();							
						if(Constantes.ISDEVELOPING) {
							sMenuLabel=opcionHijo.getId()+"_"+sMenuLabel+"("+opcionHijo.getpaquete_original()+"."+opcionHijo.getnombre_clase()+")";
						}
						
						if(opcionesHijosHijosDesdeOpcion.size()<=0) {
							defaultMutableTreeNodeHijo = new DefaultMutableTreeNode(sMenuLabel);
							
							//menuItemHijo= new JMenuItem(sMenuLabel);					
											
							//this.getMenuOpcionesHijos(menuItemHijo,opcionHijo,opcionesUsuario);
								
							defaultMutableTreeNodePadre.add(defaultMutableTreeNodeHijo);
							//menuPadre.add(menuItemHijo);
							
						} else {
							defaultMutableTreeNodeHijo = new DefaultMutableTreeNode(sMenuLabel);
							//menuHijo = new JMenu(sMenuLabel);
							
							this.getMenuOpcionesHijos(defaultMutableTreeNodeHijo,opcionHijo,opcionesHijosHijosDesdeOpcion,opcionesUsuario);
							
							defaultMutableTreeNodePadre.add(defaultMutableTreeNodeHijo);
							//menuPadre.add(menuHijo);
						}
					}	
				}
			} catch(Exception e) {
				throw e;
			}				
	}
    
    public static void actualizarUpdates(String sTipoAnio,String sTipoMes,String sTipoDia,String sNumeroProceso,ProcesoUpdate procesoUpdate,DatosCliente datosCliente) throws Exception {
		Update update=new Update();
		List<Update> updates=new ArrayList<Update>();
		
		UpdateDetalle updateDetalle=new UpdateDetalle();
		List<UpdateDetalle> updatesDetalles=new ArrayList<UpdateDetalle>();
		
		UpdateLogicAdditional updateLogicAdditional=new UpdateLogicAdditional();
		
		updateLogicAdditional.setDatosCliente(datosCliente);
		
		Long idUpdate=0L;
		Long idUpdateDetalle=0L;
		Integer iContadorUpdate=1;
		
		String sAnio="";
		String sMes="";
		String sNumeroArchivoSql="";
		String sCodigoSql="";
		Date dateFechaArchivo=new Date();
		
		for(AnioUpdate anioUpdate:procesoUpdate.getAniosupdates()) {
			for(MesUpdate mesUpdate:anioUpdate.getMesessupdates()) {
				iContadorUpdate=1;
				
				for(ActualizacionUpdate actualizacionUpdate:mesUpdate.getActualizacionesUpdates()) {
					
					update=new Update();
					
					sAnio=anioUpdate.getAnioString();
					sMes=mesUpdate.getMesString();
					sNumeroArchivoSql=actualizacionUpdate.getNumeroArchivoSql();
					
					//SE CONSTRUYE POR CONTROL
					sCodigoSql=ActualizacionUpdate.getCodigoSql(sAnio,sMes,sNumeroArchivoSql);
					
					
					idUpdate=MapaSitioJFrame.getIdProceso(sCodigoSql,iContadorUpdate);//ProcesoUpdate.CODIGO_SQL
										
					update.setId(idUpdate);
					update.setcodigo_proceso(ProcesoUpdate.CODIGO_PROCESO);
					update.setid_anio(new Long(anioUpdate.getAnio()));
					update.setid_mes(new Long(mesUpdate.getMes()));
										
					update.setorden(actualizacionUpdate.getOrden());
					update.setcodigo(sCodigoSql);//actualizacionUpdate.getCodigo());
					
					if(actualizacionUpdate.getQueryTotal().length()>250) { 
						update.setquery_resumen(actualizacionUpdate.getQueryTotal().substring(0,249));
					} else {
						update.setquery_resumen(actualizacionUpdate.getQueryTotal());
					}
					
					update.setdescripcion("PROCESO "+actualizacionUpdate.getCodigo());
					
					dateFechaArchivo=MapaSitioJFrame.getFecha(anioUpdate,mesUpdate,actualizacionUpdate);
					
					update.setfecha_archivo(dateFechaArchivo);
					
					updatesDetalles=new ArrayList<UpdateDetalle>();
					
					for(QueryUpdate queryUpdate:actualizacionUpdate.getQuerysUpdates()) {
						updateDetalle=new UpdateDetalle();
						
						idUpdateDetalle=MapaSitioJFrame.getIdProcesoDetalle(sCodigoSql,iContadorUpdate,queryUpdate.getOrden());//ProcesoUpdate.CODIGO_SQL
						
						updateDetalle.setId(idUpdateDetalle);
						updateDetalle.setid_update(update.getId());
						updateDetalle.setid_anio(update.getid_anio());
						updateDetalle.setid_mes(update.getid_mes());
						updateDetalle.setcodigo(queryUpdate.getCodigo());
						
						if(queryUpdate.getQuery().length()>100) { 
							updateDetalle.setquery_resumen(queryUpdate.getQuery().substring(0,99));
						} else {
							updateDetalle.setquery_resumen(queryUpdate.getQuery());
						}
						
						updateDetalle.setdescripcion("PROCESO "+queryUpdate.getCodigo());
						updateDetalle.setorden(queryUpdate.getOrden());
						updateDetalle.setsDescripcionGeneralEntityReporte1(queryUpdate.getQuery());
						updateDetalle.setfecha_archivo(dateFechaArchivo);
						
						updatesDetalles.add(updateDetalle);
					}
					
					//SE AGREGA DETALLES UPDATE A UPDATE ACTUAL
					update.setUpdateDetalles(updatesDetalles);
					
					//ADICIONA UPDATE
					updates.add(update);
					
					iContadorUpdate++;
				}
			}
		}
		
		UpdateParameterReturnGeneral updateParameterGeneral=new UpdateParameterReturnGeneral();
		UpdateParameterReturnGeneral  updateReturnGeneral =new UpdateParameterReturnGeneral ();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			updateReturnGeneral=updateLogicAdditional.procesarUpdates(updates,ProcesoUpdate.ES_ANUAL,ProcesoUpdate.ES_MENSUAL,ProcesoUpdate.ES_ACTIVAR_REINTENTAR, ProcesoUpdate.ES_DESACTIVAR_TODO,updateParameterGeneral);
			
		} else if(Constantes.ISUSAEJBREMOTE) {
			//updateReturnGeneral=updateImplementable.procesarUpdates(updates,ProcesoUpdate.ES_ANUAL,ProcesoUpdate.ES_MENSUAL,ProcesoUpdate.ES_ACTIVAR_REINTENTAR, ProcesoUpdate.ES_DESACTIVAR_TODO,updateParameterGeneral,datosCliente);
			
		} else if(Constantes.ISUSAEJBHOME) {
			//updateReturnGeneral=updateImplementableHome.procesarUpdates(updates,ProcesoUpdate.ES_ANUAL,ProcesoUpdate.ES_MENSUAL, ProcesoUpdate.ES_ACTIVAR_REINTENTAR,ProcesoUpdate.ES_DESACTIVAR_TODO,updateParameterGeneral,datosCliente);
		}	
	}
    
    public static Date getFecha(AnioUpdate anioUpdate,MesUpdate mesUpdate,ActualizacionUpdate actualizacionUpdate) throws Exception {
    	Date dateFechaArchivo=new Date();
    	
    	String sCodigoArchivo=actualizacionUpdate.getCodigoArchivo();
    	String sDia=MapaSitioJFrame.getDiaFromCodigoArchivo(sCodigoArchivo);
    	String sFecha=anioUpdate.getAnioString()+"-"+mesUpdate.getMesString()+"-"+sDia;
		
    	dateFechaArchivo=Funciones2.getDatePostgresString(sFecha);
		
    	return dateFechaArchivo;
    }
    
    public static String getDiaFromCodigoArchivo(String sCodigoArchivo) {
    	String sDia="";
    	
    	sCodigoArchivo=sCodigoArchivo.replace(".sql", "");
    	
    	sDia=sCodigoArchivo.split("_")[1];
    	
    	return sDia;
    }
    
    public static String getIdProcesoString(String sCodigoProceso) {
    	String sIdProceso="";
    	
    	sIdProceso=sCodigoProceso;
    	
    	sIdProceso=sIdProceso.replace("-", "");
    	sIdProceso=sIdProceso.replace("_", "");
    	sIdProceso=sIdProceso.replace(":", "");
    	sIdProceso=sIdProceso.replace(" ", "");
    	
    	
    	return sIdProceso;
    }
    
    public static Long getIdProceso(String sCodigoSql,Integer idContadorUpdate) {
    	Long idProceso=0L;
    	String sIdProceso="";
    	String sIdProcesoFinal="";
    	
    	
    	sIdProceso=MapaSitioJFrame.getIdProcesoString(sCodigoSql);
    	
    	sIdProcesoFinal=sIdProceso+idContadorUpdate;
    	
    	idProceso=Long.parseLong(sIdProcesoFinal);
    	
    	return idProceso;
    }
    
    public static Long getIdProcesoDetalle(String sCodigoSql,Integer idContadorUpdate,Integer iContadorDetalle) {
    	Long idProcesoDetalle=0L;
    	String sIdProceso="";
    	String sIdProcesoDetalleFinal="";
    	
    	sIdProceso=MapaSitioJFrame.getIdProcesoString(sCodigoSql);
    	
    	sIdProcesoDetalleFinal=sIdProceso+idContadorUpdate;
    	sIdProcesoDetalleFinal=sIdProcesoDetalleFinal+iContadorDetalle;
    	
    	idProcesoDetalle=Long.parseLong(sIdProcesoDetalleFinal);
    	
    	return idProcesoDetalle;
    }
    
    private void CargarObjetosRendimientoCriticoThread(Usuario usuarioActual, ResumenUsuario resumenUsuarioActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario) {
    	//ESTE PASO CARGA LOS OBJETOS EN MEMORIA 
    	
    	final Usuario usuarioFinal=usuarioActual;
    	final ResumenUsuario resumenUsuarioFinal=resumenUsuarioActual;
    	final ParametroGeneralSg parametroGeneralSgFinal=parametroGeneralSg;
    	final ParametroGeneralUsuario parametroGeneralUsuarioFinal=parametroGeneralUsuario;
    	
    	try {
    		
			if(MapaSitioJFrame.CON_CARGAR_MEMORIA_INICIAL) {
				/*
	    		Thread thread_contabilidad = new Thread(new Runnable() {
	    		        @Override
	    		        public void run() {
	    		        	try {
								//LoginJFrame.CargarObjetosRendimientoCritico(new Opcion(),usuarioActual,parametroGeneralSg,parametroGeneralUsuario,new Modulo(),new JDesktopPane());
	    		        		MapaSitioJFrame.CargarObjetosRendimientoCritico(new Opcion(),usuarioFinal,resumenUsuarioFinal,parametroGeneralSgFinal,parametroGeneralUsuarioFinal,new Modulo(),new JDesktopPane());
	    		        		
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
	    		        }
	    		 });
	    		 */
	    		 
				//new MapaSitioJFrame(null,"main")
				
				Thread thread_contabilidad;
				
				thread_contabilidad = new Thread(new MapaSitioJFrame(this,"Thread"));
				
				
	    		thread_contabilidad.start();
	    		
	    		MapaSitioJFrame.CON_CARGAR_MEMORIA_INICIAL=false;		    		  				    			
			}
			
    	} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    }
    
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
    	try {
    		//quit();
    		this.setVisible(false);
    		
	    } catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
    }
    
    private void jButtonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt,Boolean conMensajeConfirmacion) throws Exception {
    	try {
    		String sFinalQuery="";
    		Boolean esErrorIngreso=false;
    		
    		//this.startProcessLogin(true);
    		
    		this.cargarDatosCliente();
    		
    		
    		//this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));	
			
	    	String sUsuario=this.jTextFieldUsuario.getText();
	    	String sPassword="";//new String(this.jPasswordFieldPassword.getPassword());
	    	
	    	
	    	//OpcionImplementable opcionImplementable=OpcionConstantesFunciones.getOpcionImplementableEjbReference(OpcionConstantesFunciones.SREMOTEEJBNAME_RMI);
	    	
	    	//Set<Opcion> opciones=opcionImplementable.getTodosOpcionsWithConnection("", new Pagination(), new DatosCliente());
	    	Boolean isValidado=false;
	    	
	    	//EntityManagerFactory JPAENTITYMANAGERFACTORY= Persistence.createEntityManagerFactory("PersistenceUnitSeguridad");
	    	
	    	if(Constantes.ISUSAEJBLOGICLAYER) {	
				//isValidado=sistemaLogicAdditional.validarUsuario(sUsuario,sPassword);				
	    		this.usuarioLogicAdditional.setDatosCliente(this.datosCliente);
	    		this.usuarioActual=this.usuarioLogicAdditional.validarUsuarioWithConnection(sUsuario, sPassword);
				
	    		/*
				if(this.usuarioActual.getId()>0) {
					isValidado=true;//usuarioLogicAdditional.validarUsuarioSeguridad(strNombreUsuario, strClaveUsuario);
				}
				*/
			} else if(Constantes.ISUSAEJBREMOTE) {
				//isValidado=this.sistemaImplementable.validarUsuario(sUsuario,sPassword);
				//this.usuarioActual=MapaSitioJFrame.sistemaImplementable.validarUsuarioConUsuario(sUsuario,sPassword);
			
			} else if(Constantes.ISUSAEJBHOME) {
				//isValidado=this.sistemaImplementableHome.validarUsuario(sUsuario,sPassword);
				//this.usuarioActual=MapaSitioJFrame.sistemaImplementableHome.validarUsuarioConUsuario(sUsuario,sPassword);	
			}
	    	
	    	if(this.usuarioActual!=null && this.usuarioActual.getId()>0) {
				isValidado=true;//usuarioLogicAdditional.validarUsuarioSeguridad(strNombreUsuario, strClaveUsuario);
			}
	    	
	    	if(isValidado) {  
	    		
	    		if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.resumenUsuarioLogic.setDatosCliente(this.datosCliente);
		    		this.resumenUsuarioLogic.getEntityWithConnection(this.usuarioActual.getId());
		    		this.resumenUsuarioActual=this.resumenUsuarioLogic.getResumenUsuario();
		    		
				} else if(Constantes.ISUSAEJBREMOTE) {
					//this.resumenUsuarioActual=MapaSitioJFrame.resumenUsuarioImplementable.getEntity(this.usuarioActual.getId(), this.datosCliente);
				
				} else if(Constantes.ISUSAEJBHOME) {
					//this.resumenUsuarioActual=MapaSitioJFrame.resumenUsuarioImplementableHome.getEntity(this.usuarioActual.getId(),this.datosCliente);	
				}
	    		
	    		if(this.resumenUsuarioActual!=null && this.resumenUsuarioActual.getId()>0) {
	    			//this.resumenUsuarioActual.setnumero_ingresos(this.resumenUsuarioActual.getnumero_ingresos()+1);
	    			//this.resumenUsuarioActual.setnumero_intentos(this.resumenUsuarioActual.getnumero_intentos()+1);
	    			
	    			/*
	    			if(this.resumenUsuarioActual.getnumero_ingreso_actual()<=0) {
	    				this.resumenUsuarioActual.setnumero_ingreso_actual(this.resumenUsuarioActual.getnumero_ingreso_actual()+1);
	    				
	    				this.resumenUsuarioActual.setfecha_ultimo_ingreso(new Date());
	    				this.resumenUsuarioActual.setfecha_ultimo_intento(new Date());
	    				
	    			} else {
	    				this.resumenUsuarioActual.setnumero_error_ingreso(this.resumenUsuarioActual.getnumero_error_ingreso()+1);
	    				this.resumenUsuarioActual.setfecha_ultimo_error_ingreso(new Date());
	    				
	    				esErrorIngreso=true;	    				
	    			}
	    			*/
	    			
	    			this.resumenUsuarioActual.setnumero_reinicios(this.resumenUsuarioActual.getnumero_reinicios()+1);
	    			this.resumenUsuarioActual.setnumero_ingreso_actual(0L);
	    			
	    		} else {
	    			this.resumenUsuarioActual=new ResumenUsuario();
	    			
	    			this.resumenUsuarioActual.setid_usuario(this.usuarioActual.getId());
	    			//this.resumenUsuarioActual.setnumero_ingresos(this.resumenUsuarioActual.getnumero_ingresos()+1);
	    			//this.resumenUsuarioActual.setnumero_intentos(this.resumenUsuarioActual.getnumero_intentos()+1);
	    			this.resumenUsuarioActual.setnumero_reinicios(this.resumenUsuarioActual.getnumero_reinicios()+1);
	    			this.resumenUsuarioActual.setnumero_ingreso_actual(0L);    				
    				//this.resumenUsuarioActual.setfecha_ultimo_ingreso(new Date());
    				//this.resumenUsuarioActual.setfecha_ultimo_intento(new Date());    				
	    		}
	    		
	    		
	    		if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.resumenUsuarioLogic.setResumenUsuario(this.resumenUsuarioActual);
		    		this.resumenUsuarioLogic.saveResumenUsuarioWithConnection();
		    		
				} else if(Constantes.ISUSAEJBREMOTE) {
					//MapaSitioJFrame.resumenUsuarioImplementable.saveResumenUsuarioWithConnection(this.resumenUsuarioActual, this.datosCliente);
				
				} else if(Constantes.ISUSAEJBHOME) {
					//MapaSitioJFrame.resumenUsuarioImplementableHome.saveResumenUsuarioWithConnection(this.resumenUsuarioActual, this.datosCliente);	
				}
	    		
	    		/*
	    		if(esErrorIngreso) {
	    			throw new Exception("YA SE ENCUENTRA EN USO ESTE USUARIO EN EL SISTEMA, CIERRE LA SESSION DEL USUARIO PARA INTENTAR DE NUEVO");
	    		}
	    		*/	
	    		
	    		if(conMensajeConfirmacion) {
	    			JOptionPane.showMessageDialog(this,"CIERRE DE SESSION CORRECTO","ERROR",JOptionPane.INFORMATION_MESSAGE);
	    		}
	    		
	    	} else {	    			    		    		
	    		JOptionPane.showMessageDialog(this,"USUARIO O PASSWORD INCORRECTO","ERROR",JOptionPane.ERROR_MESSAGE);
	    	}
    		
    		
	    } catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		
	    } finally {
	    	//this.finishProcessLogin(true);
	    	
	    	//this.setCursor(cursor);	
		}
    }
    
    protected void quit() {
        System.exit(0);
    }
    
    protected static void SetLookAndFeel(int iTipo) {
    	try {
			//int iTipo=Integer.parseInt(lTipo.toString());
			
    		switch(iTipo) { 
    			case 1: UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
    			break;

    			case 2: UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    			break;

    			case 3: UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
    			break; 

    			case 4: UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
    			break; 
    			
    			case 5:
		    			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		    		        if ("Nimbus".equals(info.getName())) {
		    		        	System.out.println(info.getClassName());
		    		            UIManager.setLookAndFeel(info.getClassName());
		    		            break;
		    		        }
		    		    }
    			break; 
    			
    			default: UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");

    		};
    		
    		
    	} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
    		e1.printStackTrace();
		}
    }
    
    protected void habilitarDeshabilitarControlesLogin(Boolean esHabilitar) {
        this.jTextFieldUsuario.setEnabled(esHabilitar);
        this.jButtonAceptar.setEnabled(esHabilitar);
        this.jButtonCancelar.setEnabled(esHabilitar);
     }
    
    public static void main(String args[]) {
    	//LoginJFrame.SetLookAndFeel(1L);
    	 
    	/*
        java.awt.EventQueue.invokeLater (
        	new Runnable() {
	            public void run() {
	                //new LoginJFrame().setVisible(true);
	            	try {
						//new SistemaBeanSwingJInternalFrame().setVisible(true);
	            		new MapaSitioJFrame().setVisible(true);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            }
        	}
       );
       */
       
    	try {
    		java.awt.EventQueue.invokeLater(new MapaSitioJFrame(null,"main"));
    		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}      
    } 
}