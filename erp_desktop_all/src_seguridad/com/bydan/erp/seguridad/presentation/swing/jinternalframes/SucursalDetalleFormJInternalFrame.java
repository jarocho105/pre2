/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;



import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.SucursalConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.*;
import com.bydan.framework.erp.util.*;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.*;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;


import javax.swing.*;
import java.awt.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.TableColumn;

import com.toedter.calendar.JDateChooser;


@SuppressWarnings("unused")
public class SucursalDetalleFormJInternalFrame extends SucursalBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleSucursal;
	
	protected JMenuBar jmenuBarDetalleSucursal;
	
	protected JMenu jmenuDetalleSucursal;
	protected JMenu jmenuDetalleArchivoSucursal;
	protected JMenu jmenuDetalleAccionesSucursal;
	protected JMenu jmenuDetalleDatosSucursal;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSucursal;	
	protected GridBagConstraints gridBagConstraintsSucursal;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected SucursalBeanSwingJInternalFrameAdditional jInternalFrameDetalleSucursal;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";
	
	public SucursalSessionBean sucursalSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;	
	
	public SucursalLogic sucursalLogic;
	
	public JScrollPane jScrollPanelDatosSucursal;
	public JScrollPane jScrollPanelDatosEdicionSucursal;
	public JScrollPane jScrollPanelDatosGeneralSucursal;
	
	protected JPanel jPanelCamposSucursal;    
	protected JPanel jPanelCamposOcultosSucursal;    	
	protected JPanel jPanelAccionesSucursal;
	protected JPanel jPanelAccionesFormularioSucursal;
    
	
	
	protected Integer iXPanelCamposSucursal=0;
	protected Integer iYPanelCamposSucursal=0;
	
	protected Integer iXPanelCamposOcultosSucursal=0;
	protected Integer iYPanelCamposOcultosSucursal=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoSucursal;
	public JButton jButtonModificarSucursal;
	public JButton jButtonActualizarSucursal;
    public JButton jButtonEliminarSucursal;
	public JButton jButtonCancelarSucursal;
    public JButton jButtonGuardarCambiosSucursal;
	public JButton jButtonGuardarCambiosTablaSucursal;
	protected JButton jButtonCerrarSucursal;
	
	
	protected JButton jButtonProcesarInformacionSucursal;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoSucursal;
	protected JCheckBox jCheckBoxPostAccionSinCerrarSucursal;
	protected JCheckBox jCheckBoxPostAccionSinMensajeSucursal;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSucursal;
	protected JButton jButtonModificarToolBarSucursal;
	protected JButton jButtonActualizarToolBarSucursal;
    protected JButton jButtonEliminarToolBarSucursal;
	protected JButton jButtonCancelarToolBarSucursal;
    protected JButton jButtonGuardarCambiosToolBarSucursal;
	protected JButton jButtonGuardarCambiosTablaToolBarSucursal;
	protected JButton jButtonMostrarOcultarTablaToolBarSucursal;
	protected JButton jButtonCerrarToolBarSucursal;
	
	protected JButton jButtonProcesarInformacionToolBarSucursal;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSucursal;
	protected JMenuItem jMenuItemModificarSucursal;
	protected JMenuItem jMenuItemActualizarSucursal;
    protected JMenuItem jMenuItemEliminarSucursal;
	protected JMenuItem jMenuItemCancelarSucursal;
    protected JMenuItem jMenuItemGuardarCambiosSucursal;
	protected JMenuItem jMenuItemGuardarCambiosTablaSucursal;
	protected JMenuItem jMenuItemCerrarSucursal;
	protected JMenuItem jMenuItemDetalleCerrarSucursal;
	protected JMenuItem jMenuItemDetalleMostarOcultarSucursal;
	
	protected JMenuItem jMenuItemProcesarInformacionSucursal;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSucursal;
	protected JMenuItem jMenuItemMostrarOcultarSucursal;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSucursal;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSucursal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSucursal;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioSucursal;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidSucursal;
	public JLabel jLabelIdSucursal;
	public JLabel jLabelidSucursal;
	public JButton jButtonidSucursalBusqueda= new JButtonMe();

	public JPanel jPanelcodigoSucursal;
	public JLabel jLabelcodigoSucursal;
	public JTextField jTextFieldcodigoSucursal;
	public JButton jButtoncodigoSucursalBusqueda= new JButtonMe();

	public JPanel jPanelnumeroSucursal;
	public JLabel jLabelnumeroSucursal;
	public JTextField jTextFieldnumeroSucursal;
	public JButton jButtonnumeroSucursalBusqueda= new JButtonMe();

	public JPanel jPanelnombreSucursal;
	public JLabel jLabelnombreSucursal;
	public JTextArea jTextAreanombreSucursal;
	public JScrollPane jscrollPanenombreSucursal;
	public JButton jButtonnombreSucursalBusqueda= new JButtonMe();

	public JPanel jPaneldireccionSucursal;
	public JLabel jLabeldireccionSucursal;
	public JTextArea jTextAreadireccionSucursal;
	public JScrollPane jscrollPanedireccionSucursal;
	public JButton jButtondireccionSucursalBusqueda= new JButtonMe();

	public JPanel jPanelrucSucursal;
	public JLabel jLabelrucSucursal;
	public JTextField jTextFieldrucSucursal;
	public JButton jButtonrucSucursalBusqueda= new JButtonMe();

	public JPanel jPaneltelefonoSucursal;
	public JLabel jLabeltelefonoSucursal;
	public JTextField jTextFieldtelefonoSucursal;
	public JButton jButtontelefonoSucursalBusqueda= new JButtonMe();

	public JPanel jPanelfaxSucursal;
	public JLabel jLabelfaxSucursal;
	public JTextField jTextFieldfaxSucursal;
	public JButton jButtonfaxSucursalBusqueda= new JButtonMe();

	public JPanel jPanelmailSucursal;
	public JLabel jLabelmailSucursal;
	public JTextField jTextFieldmailSucursal;
	public JButton jButtonmailSucursalBusqueda= new JButtonMe();

	public JPanel jPanelresponsableSucursal;
	public JLabel jLabelresponsableSucursal;
	public JTextArea jTextArearesponsableSucursal;
	public JScrollPane jscrollPaneresponsableSucursal;
	public JButton jButtonresponsableSucursalBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionSucursal;
	public JLabel jLabeldescripcionSucursal;
	public JTextArea jTextAreadescripcionSucursal;
	public JScrollPane jscrollPanedescripcionSucursal;
	public JButton jButtondescripcionSucursalBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaSucursal;
	public JLabel jLabelid_empresaSucursal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaSucursal;
	public JButton jButtonid_empresaSucursal= new JButtonMe();
	public JButton jButtonid_empresaSucursalUpdate= new JButtonMe();
	public JButton jButtonid_empresaSucursalBusqueda= new JButtonMe();

	public JPanel jPanelid_paisSucursal;
	public JLabel jLabelid_paisSucursal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisSucursal;
	public JButton jButtonid_paisSucursal= new JButtonMe();
	public JButton jButtonid_paisSucursalUpdate= new JButtonMe();
	public JButton jButtonid_paisSucursalBusqueda= new JButtonMe();

	public JPanel jPanelid_ciudadSucursal;
	public JLabel jLabelid_ciudadSucursal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadSucursal;
	public JButton jButtonid_ciudadSucursal= new JButtonMe();
	public JButton jButtonid_ciudadSucursalUpdate= new JButtonMe();
	public JButton jButtonid_ciudadSucursalBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesSucursal;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=true;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=858;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public SucursalDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposSucursal=new JPanel();
				this.jPanelAccionesFormularioSucursal=new JPanel();
				this.jmenuBarDetalleSucursal=new JMenuBar();
				this.jTtoolBarDetalleSucursal=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SucursalDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Sucursal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public SucursalDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Sucursal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SucursalDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Sucursal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SucursalDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Sucursal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SucursalDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Sucursal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}

			this.initialize(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Clase Padre Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }		

	public JInternalFrameBase getJInternalFrameParent() {
		return jInternalFrameParent;
	}

	public void setJInternalFrameParent(JInternalFrameBase internalFrameParent)	{
		jInternalFrameParent = internalFrameParent;
	}
	
	
	public JButton getjButtonActualizarToolBarSucursal() {
		return this.jButtonActualizarToolBarSucursal;
	}
	
	public JButton getjButtonEliminarToolBarSucursal() {
		return this.jButtonEliminarToolBarSucursal;
	}
	
	public JButton getjButtonCancelarToolBarSucursal() {
		return this.jButtonCancelarToolBarSucursal;
	}		
	
	public JButton getjButtonProcesarInformacionSucursal() {
		return this.jButtonProcesarInformacionSucursal;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSucursal)	{
		this.jButtonProcesarInformacionSucursal = jButtonProcesarInformacionSucursal;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSucursal() {
		return this.jComboBoxTiposAccionesSucursal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSucursal(
			JComboBox jComboBoxTiposRelacionesSucursal) {
		this.jComboBoxTiposRelacionesSucursal = jComboBoxTiposRelacionesSucursal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSucursal(
			JComboBox jComboBoxTiposAccionesSucursal) {
		this.jComboBoxTiposAccionesSucursal = jComboBoxTiposAccionesSucursal;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioSucursal() {
		return this.jComboBoxTiposAccionesFormularioSucursal;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioSucursal(
			JComboBox jComboBoxTiposAccionesFormularioSucursal) {
		this.jComboBoxTiposAccionesFormularioSucursal = jComboBoxTiposAccionesFormularioSucursal;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.sucursalSessionBean=new SucursalSessionBean();
		
		this.sucursalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.sucursalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.sucursalSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SucursalJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SucursalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SucursalJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Sucursal MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.sucursalSessionBean.getEsGuardarRelacionado()) {
			this.setResizable(true);
			this.setClosable(true);
			this.setMaximizable(true);
			this.iconable=true;
			
			setLocation(xOffset*openFrameCount, yOffset*openFrameCount);
			
			if(Constantes.CON_VARIAS_VENTANAS) {
				openFrameCount++;
				
				if(openFrameCount==Constantes.INUM_MAX_VENTANAS) {
					openFrameCount=0;
				}
			}
		}				
	
		SucursalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleSucursal= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarSucursal=new JButtonMe();
				this.jButtonModificarToolBarSucursal=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarSucursal,this.jTtoolBarDetalleSucursal,
							"actualizar","actualizar","Actualizar"+" "+SucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarSucursal,this.jTtoolBarDetalleSucursal,
							"eliminar","eliminar","Eliminar"+" "+SucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarSucursal,this.jTtoolBarDetalleSucursal,
							"cancelar","cancelar","Cancelar"+" "+SucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarSucursal,this.jTtoolBarDetalleSucursal,
							"guardarcambios","guardarcambios","Guardar"+" "+SucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarSucursal,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarSucursal,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarSucursal,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleSucursal=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleSucursal=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoSucursal=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesSucursal=new JMenuMe("Acciones");
		this.jmenuDetalleDatosSucursal=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSucursal= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSucursal.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSucursal,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarSucursal= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarSucursal.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarSucursal,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarSucursal= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarSucursal.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarSucursal,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarSucursal= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarSucursal.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarSucursal,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarSucursal= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarSucursal.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarSucursal,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosSucursal= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSucursal.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSucursal,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSucursal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSucursal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSucursal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarSucursal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarSucursal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarSucursal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSucursal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSucursal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSucursal,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSucursal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSucursal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSucursal,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSucursal, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoSucursal.add(this.jMenuItemDetalleCerrarSucursal);
		
		this.jmenuDetalleAccionesSucursal.add(this.jMenuItemActualizarSucursal);
		this.jmenuDetalleAccionesSucursal.add(this.jMenuItemEliminarSucursal);
		this.jmenuDetalleAccionesSucursal.add(this.jMenuItemCancelarSucursal);		
		
		//this.jmenuDetalleDatosSucursal.add(this.jMenuItemDetalleAbrirOrderBySucursal);				
		this.jmenuDetalleDatosSucursal.add(this.jMenuItemDetalleMostarOcultarSucursal);				
				
		//this.jmenuDetalleAccionesSucursal.add(this.jMenuItemGuardarCambiosSucursal);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleSucursal.add(this.jmenuDetalleArchivoSucursal);		
		this.jmenuBarDetalleSucursal.add(this.jmenuDetalleAccionesSucursal);		
		this.jmenuBarDetalleSucursal.add(this.jmenuDetalleDatosSucursal);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleSucursal);				
	}
	
	
	public void inicializarElementosCamposSucursal() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdSucursal = new JLabelMe();
		jLabelIdSucursal.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidSucursal = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidSucursal.setToolTipText(SucursalConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutSucursal= new GridBagLayout();

		this.jPanelidSucursal.setLayout(this.gridaBagLayoutSucursal);

		jLabelidSucursal = new JLabel();
		jLabelidSucursal.setText("Id");

		jLabelidSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoSucursal = new JLabelMe();
		this.jLabelcodigoSucursal.setText(""+SucursalConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoSucursal.setToolTipText("Codigo");
		this.jLabelcodigoSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoSucursal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoSucursal.setToolTipText(SucursalConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutSucursal = new GridBagLayout();
		this.jPanelcodigoSucursal.setLayout(this.gridaBagLayoutSucursal);


		jTextFieldcodigoSucursal= new JTextFieldMe();

		jTextFieldcodigoSucursal.setEnabled(false);
		jTextFieldcodigoSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoSucursalBusqueda= new JButtonMe();
		this.jButtoncodigoSucursalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoSucursalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoSucursalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoSucursalBusqueda.setText("U");
		this.jButtoncodigoSucursalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoSucursalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoSucursalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoSucursalBusqueda"));

		if(this.sucursalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoSucursalBusqueda.setVisible(false);		}


					
		this.jLabelnumeroSucursal = new JLabelMe();
		this.jLabelnumeroSucursal.setText(""+SucursalConstantesFunciones.LABEL_NUMERO+" : *");
		this.jLabelnumeroSucursal.setToolTipText("Numero");
		this.jLabelnumeroSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumeroSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumeroSucursal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumeroSucursal.setToolTipText(SucursalConstantesFunciones.LABEL_NUMERO);
		this.gridaBagLayoutSucursal = new GridBagLayout();
		this.jPanelnumeroSucursal.setLayout(this.gridaBagLayoutSucursal);


		jTextFieldnumeroSucursal= new JTextFieldMe();

		jTextFieldnumeroSucursal.setEnabled(false);
		jTextFieldnumeroSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumeroSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumeroSucursalBusqueda= new JButtonMe();
		this.jButtonnumeroSucursalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroSucursalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroSucursalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumeroSucursalBusqueda.setText("U");
		this.jButtonnumeroSucursalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumeroSucursalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumeroSucursalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumeroSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumeroSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numeroSucursalBusqueda"));

		if(this.sucursalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumeroSucursalBusqueda.setVisible(false);		}


					
		this.jLabelnombreSucursal = new JLabelMe();
		this.jLabelnombreSucursal.setText(""+SucursalConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreSucursal.setToolTipText("Nombre");
		this.jLabelnombreSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreSucursal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreSucursal.setToolTipText(SucursalConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutSucursal = new GridBagLayout();
		this.jPanelnombreSucursal.setLayout(this.gridaBagLayoutSucursal);


		jTextAreanombreSucursal= new JTextAreaMe();
		jTextAreanombreSucursal.setEnabled(false);
		jTextAreanombreSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreSucursal.setLineWrap(true);
		jTextAreanombreSucursal.setWrapStyleWord(true);
		jTextAreanombreSucursal.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreSucursal.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreSucursal = new JScrollPane(jTextAreanombreSucursal);
		jscrollPanenombreSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreSucursalBusqueda= new JButtonMe();
		this.jButtonnombreSucursalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreSucursalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreSucursalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreSucursalBusqueda.setText("U");
		this.jButtonnombreSucursalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreSucursalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreSucursalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreSucursalBusqueda"));

		if(this.sucursalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreSucursalBusqueda.setVisible(false);		}


					
		this.jLabeldireccionSucursal = new JLabelMe();
		this.jLabeldireccionSucursal.setText(""+SucursalConstantesFunciones.LABEL_DIRECCION+" : *");
		this.jLabeldireccionSucursal.setToolTipText("Direccion");
		this.jLabeldireccionSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccionSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccionSucursal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccionSucursal.setToolTipText(SucursalConstantesFunciones.LABEL_DIRECCION);
		this.gridaBagLayoutSucursal = new GridBagLayout();
		this.jPaneldireccionSucursal.setLayout(this.gridaBagLayoutSucursal);


		jTextAreadireccionSucursal= new JTextAreaMe();
		jTextAreadireccionSucursal.setEnabled(false);
		jTextAreadireccionSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionSucursal.setLineWrap(true);
		jTextAreadireccionSucursal.setWrapStyleWord(true);
		jTextAreadireccionSucursal.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccionSucursal.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadireccionSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccionSucursal = new JScrollPane(jTextAreadireccionSucursal);
		jscrollPanedireccionSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccionSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccionSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondireccionSucursalBusqueda= new JButtonMe();
		this.jButtondireccionSucursalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionSucursalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionSucursalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccionSucursalBusqueda.setText("U");
		this.jButtondireccionSucursalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccionSucursalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccionSucursalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccionSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccionSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccionSucursalBusqueda"));

		if(this.sucursalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccionSucursalBusqueda.setVisible(false);		}


					
		this.jLabelrucSucursal = new JLabelMe();
		this.jLabelrucSucursal.setText(""+SucursalConstantesFunciones.LABEL_RUC+" : *");
		this.jLabelrucSucursal.setToolTipText("Ruc");
		this.jLabelrucSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucSucursal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucSucursal.setToolTipText(SucursalConstantesFunciones.LABEL_RUC);
		this.gridaBagLayoutSucursal = new GridBagLayout();
		this.jPanelrucSucursal.setLayout(this.gridaBagLayoutSucursal);


		jTextFieldrucSucursal= new JTextFieldMe();

		jTextFieldrucSucursal.setEnabled(false);
		jTextFieldrucSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucSucursalBusqueda= new JButtonMe();
		this.jButtonrucSucursalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucSucursalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucSucursalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucSucursalBusqueda.setText("U");
		this.jButtonrucSucursalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucSucursalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucSucursalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucSucursalBusqueda"));

		if(this.sucursalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucSucursalBusqueda.setVisible(false);		}


					
		this.jLabeltelefonoSucursal = new JLabelMe();
		this.jLabeltelefonoSucursal.setText(""+SucursalConstantesFunciones.LABEL_TELEFONO+" : *");
		this.jLabeltelefonoSucursal.setToolTipText("Telefono");
		this.jLabeltelefonoSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonoSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonoSucursal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonoSucursal.setToolTipText(SucursalConstantesFunciones.LABEL_TELEFONO);
		this.gridaBagLayoutSucursal = new GridBagLayout();
		this.jPaneltelefonoSucursal.setLayout(this.gridaBagLayoutSucursal);


		jTextFieldtelefonoSucursal= new JTextFieldMe();

		jTextFieldtelefonoSucursal.setEnabled(false);
		jTextFieldtelefonoSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtelefonoSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontelefonoSucursalBusqueda= new JButtonMe();
		this.jButtontelefonoSucursalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoSucursalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoSucursalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonoSucursalBusqueda.setText("U");
		this.jButtontelefonoSucursalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonoSucursalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonoSucursalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtelefonoSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtelefonoSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonoSucursalBusqueda"));

		if(this.sucursalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonoSucursalBusqueda.setVisible(false);		}


					
		this.jLabelfaxSucursal = new JLabelMe();
		this.jLabelfaxSucursal.setText(""+SucursalConstantesFunciones.LABEL_FAX+" :");
		this.jLabelfaxSucursal.setToolTipText("Fax");
		this.jLabelfaxSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfaxSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfaxSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfaxSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfaxSucursal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfaxSucursal.setToolTipText(SucursalConstantesFunciones.LABEL_FAX);
		this.gridaBagLayoutSucursal = new GridBagLayout();
		this.jPanelfaxSucursal.setLayout(this.gridaBagLayoutSucursal);


		jTextFieldfaxSucursal= new JTextFieldMe();

		jTextFieldfaxSucursal.setEnabled(false);
		jTextFieldfaxSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfaxSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfaxSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfaxSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonfaxSucursalBusqueda= new JButtonMe();
		this.jButtonfaxSucursalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfaxSucursalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfaxSucursalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfaxSucursalBusqueda.setText("U");
		this.jButtonfaxSucursalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfaxSucursalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfaxSucursalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfaxSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfaxSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"faxSucursalBusqueda"));

		if(this.sucursalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfaxSucursalBusqueda.setVisible(false);		}


					
		this.jLabelmailSucursal = new JLabelMe();
		this.jLabelmailSucursal.setText(""+SucursalConstantesFunciones.LABEL_MAIL+" : *");
		this.jLabelmailSucursal.setToolTipText("Mail");
		this.jLabelmailSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmailSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmailSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmailSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmailSucursal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmailSucursal.setToolTipText(SucursalConstantesFunciones.LABEL_MAIL);
		this.gridaBagLayoutSucursal = new GridBagLayout();
		this.jPanelmailSucursal.setLayout(this.gridaBagLayoutSucursal);


		jTextFieldmailSucursal= new JTextFieldMe();

		jTextFieldmailSucursal.setEnabled(false);
		jTextFieldmailSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmailSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmailSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmailSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonmailSucursalBusqueda= new JButtonMe();
		this.jButtonmailSucursalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmailSucursalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmailSucursalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmailSucursalBusqueda.setText("U");
		this.jButtonmailSucursalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmailSucursalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmailSucursalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmailSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmailSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"mailSucursalBusqueda"));

		if(this.sucursalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmailSucursalBusqueda.setVisible(false);		}


					
		this.jLabelresponsableSucursal = new JLabelMe();
		this.jLabelresponsableSucursal.setText(""+SucursalConstantesFunciones.LABEL_RESPONSABLE+" : *");
		this.jLabelresponsableSucursal.setToolTipText("Responsable");
		this.jLabelresponsableSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelresponsableSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelresponsableSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelresponsableSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelresponsableSucursal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelresponsableSucursal.setToolTipText(SucursalConstantesFunciones.LABEL_RESPONSABLE);
		this.gridaBagLayoutSucursal = new GridBagLayout();
		this.jPanelresponsableSucursal.setLayout(this.gridaBagLayoutSucursal);


		jTextArearesponsableSucursal= new JTextAreaMe();
		jTextArearesponsableSucursal.setEnabled(false);
		jTextArearesponsableSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearesponsableSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearesponsableSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearesponsableSucursal.setLineWrap(true);
		jTextArearesponsableSucursal.setWrapStyleWord(true);
		jTextArearesponsableSucursal.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextArearesponsableSucursal.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextArearesponsableSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneresponsableSucursal = new JScrollPane(jTextArearesponsableSucursal);
		jscrollPaneresponsableSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneresponsableSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneresponsableSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonresponsableSucursalBusqueda= new JButtonMe();
		this.jButtonresponsableSucursalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonresponsableSucursalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonresponsableSucursalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonresponsableSucursalBusqueda.setText("U");
		this.jButtonresponsableSucursalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonresponsableSucursalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonresponsableSucursalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextArearesponsableSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextArearesponsableSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"responsableSucursalBusqueda"));

		if(this.sucursalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonresponsableSucursalBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionSucursal = new JLabelMe();
		this.jLabeldescripcionSucursal.setText(""+SucursalConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionSucursal.setToolTipText("Descripcion");
		this.jLabeldescripcionSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionSucursal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionSucursal.setToolTipText(SucursalConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutSucursal = new GridBagLayout();
		this.jPaneldescripcionSucursal.setLayout(this.gridaBagLayoutSucursal);


		jTextAreadescripcionSucursal= new JTextAreaMe();
		jTextAreadescripcionSucursal.setEnabled(false);
		jTextAreadescripcionSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionSucursal.setLineWrap(true);
		jTextAreadescripcionSucursal.setWrapStyleWord(true);
		jTextAreadescripcionSucursal.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionSucursal.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionSucursal = new JScrollPane(jTextAreadescripcionSucursal);
		jscrollPanedescripcionSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionSucursalBusqueda= new JButtonMe();
		this.jButtondescripcionSucursalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionSucursalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionSucursalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionSucursalBusqueda.setText("U");
		this.jButtondescripcionSucursalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionSucursalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionSucursalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionSucursalBusqueda"));

		if(this.sucursalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionSucursalBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysSucursal() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaSucursal = new JLabelMe();
		this.jLabelid_empresaSucursal.setText(""+SucursalConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaSucursal.setToolTipText("Empresa");
		this.jLabelid_empresaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaSucursal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaSucursal.setToolTipText(SucursalConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutSucursal = new GridBagLayout();
		this.jPanelid_empresaSucursal.setLayout(this.gridaBagLayoutSucursal);


		jComboBoxid_empresaSucursal= new JComboBoxMe();
		jComboBoxid_empresaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empresaSucursal= new JButtonMe();
		this.jButtonid_empresaSucursal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSucursal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSucursal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSucursal.setText("Buscar");
		this.jButtonid_empresaSucursal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaSucursal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSucursal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSucursal"));

		this.jButtonid_empresaSucursalBusqueda= new JButtonMe();
		this.jButtonid_empresaSucursalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSucursalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSucursalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSucursalBusqueda.setText("U");
		this.jButtonid_empresaSucursalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaSucursalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSucursalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSucursalBusqueda"));

		if(this.sucursalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaSucursalBusqueda.setVisible(false);		}

		this.jButtonid_empresaSucursalUpdate= new JButtonMe();
		this.jButtonid_empresaSucursalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSucursalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSucursalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSucursalUpdate.setText("U");
		this.jButtonid_empresaSucursalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaSucursalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSucursalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSucursalUpdate"));



					
		this.jLabelid_paisSucursal = new JLabelMe();
		this.jLabelid_paisSucursal.setText(""+SucursalConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisSucursal.setToolTipText("Pais");
		this.jLabelid_paisSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisSucursal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisSucursal.setToolTipText(SucursalConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutSucursal = new GridBagLayout();
		this.jPanelid_paisSucursal.setLayout(this.gridaBagLayoutSucursal);


		jComboBoxid_paisSucursal= new JComboBoxMe();
		jComboBoxid_paisSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisSucursal= new JButtonMe();
		this.jButtonid_paisSucursal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisSucursal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisSucursal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisSucursal.setText("Buscar");
		this.jButtonid_paisSucursal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisSucursal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisSucursal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisSucursal"));

		this.jButtonid_paisSucursalBusqueda= new JButtonMe();
		this.jButtonid_paisSucursalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisSucursalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisSucursalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisSucursalBusqueda.setText("U");
		this.jButtonid_paisSucursalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisSucursalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisSucursalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisSucursalBusqueda"));

		if(this.sucursalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisSucursalBusqueda.setVisible(false);		}

		this.jButtonid_paisSucursalUpdate= new JButtonMe();
		this.jButtonid_paisSucursalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisSucursalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisSucursalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisSucursalUpdate.setText("U");
		this.jButtonid_paisSucursalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisSucursalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisSucursalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisSucursalUpdate"));



					
		this.jLabelid_ciudadSucursal = new JLabelMe();
		this.jLabelid_ciudadSucursal.setText(""+SucursalConstantesFunciones.LABEL_IDCIUDAD+" : *");
		this.jLabelid_ciudadSucursal.setToolTipText("Ciudad");
		this.jLabelid_ciudadSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ciudadSucursal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ciudadSucursal.setToolTipText(SucursalConstantesFunciones.LABEL_IDCIUDAD);
		this.gridaBagLayoutSucursal = new GridBagLayout();
		this.jPanelid_ciudadSucursal.setLayout(this.gridaBagLayoutSucursal);


		jComboBoxid_ciudadSucursal= new JComboBoxMe();
		jComboBoxid_ciudadSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ciudadSucursal= new JButtonMe();
		this.jButtonid_ciudadSucursal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadSucursal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadSucursal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadSucursal.setText("Buscar");
		this.jButtonid_ciudadSucursal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ciudadSucursal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadSucursal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ciudadSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadSucursal"));

		this.jButtonid_ciudadSucursalBusqueda= new JButtonMe();
		this.jButtonid_ciudadSucursalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadSucursalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadSucursalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadSucursalBusqueda.setText("U");
		this.jButtonid_ciudadSucursalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ciudadSucursalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadSucursalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ciudadSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadSucursalBusqueda"));

		if(this.sucursalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ciudadSucursalBusqueda.setVisible(false);		}

		this.jButtonid_ciudadSucursalUpdate= new JButtonMe();
		this.jButtonid_ciudadSucursalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadSucursalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadSucursalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadSucursalUpdate.setText("U");
		this.jButtonid_ciudadSucursalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ciudadSucursalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadSucursalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ciudadSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadSucursalUpdate"));



	}
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) {
		//System.out.println("TRANSFIERE EL MANEJO AL PADRE O FORM PRINCIPAL");
		
		jInternalFrameParent.jButtonActionPerformedTecladoGeneral(sTipo,evt);
	}
	
	//JPanel
	//@SuppressWarnings({"unchecked" })//"rawtypes"
	public JScrollPane getJContentPane(int iWidth,int iHeight,JDesktopPane jDesktopPane,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {	
		//PARA TABLA PARAMETROS
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		this.jContentPane = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
				
		this.usuarioActual=usuarioActual;
		this.resumenUsuarioActual=resumenUsuarioActual;
		this.opcionActual=opcionActual;
		
		this.moduloActual=moduloActual;		
		this.parametroGeneralSg=parametroGeneralSg;		
		this.parametroGeneralUsuario=parametroGeneralUsuario;	
		
		this.jDesktopPane=jDesktopPane;
				
		this.conFuncionalidadRelaciones=parametroGeneralUsuario.getcon_guardar_relaciones();
		
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		//this.jInternalFrameDetalleSucursal = new SucursalBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Sucursal DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSucursal= new GridBagLayout();
		

		
		String sToolTipSucursal="";
		sToolTipSucursal=SucursalConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSucursal+="(Seguridad.Sucursal)";
		}
		
		if(!this.sucursalSessionBean.getEsGuardarRelacionado()) {
			sToolTipSucursal+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoSucursal = new JButtonMe();
		this.jButtonModificarSucursal = new JButtonMe();
        this.jButtonActualizarSucursal = new JButtonMe();
        this.jButtonEliminarSucursal = new JButtonMe();
        this.jButtonCancelarSucursal = new JButtonMe();
        this.jButtonGuardarCambiosSucursal = new JButtonMe();
		this.jButtonGuardarCambiosTablaSucursal = new JButtonMe();
		this.jButtonCerrarSucursal = new JButtonMe();
		
		this.jScrollPanelDatosSucursal = new JScrollPane();   
        this.jScrollPanelDatosEdicionSucursal = new JScrollPane();
		this.jScrollPanelDatosGeneralSucursal = new JScrollPane();
				
		
		
		this.jPanelCamposSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Sucursal";
		
		if(!this.sucursalSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sucursales" + this.sPath));
		} else {
			this.jScrollPanelDatosSucursal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposSucursal.setName("jPanelCamposSucursal"); 

		this.jPanelCamposOcultosSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosSucursal.setName("jPanelCamposOcultosSucursal"); 

        this.jPanelAccionesSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSucursal.setToolTipText("Acciones");
        this.jPanelAccionesSucursal.setName("Acciones"); 

		this.jPanelAccionesFormularioSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioSucursal.setToolTipText("Acciones");
        this.jPanelAccionesFormularioSucursal.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSucursal, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoSucursal.setText("Nuevo");
		this.jButtonModificarSucursal.setText("Editar");
        this.jButtonActualizarSucursal.setText("Actualizar");
        this.jButtonEliminarSucursal.setText("Eliminar");
        this.jButtonCancelarSucursal.setText("Cancelar");
        this.jButtonGuardarCambiosSucursal.setText("Guardar");
		this.jButtonGuardarCambiosTablaSucursal.setText("Guardar");
		this.jButtonCerrarSucursal.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSucursal,"nuevo_button","Nuevo",this.sucursalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarSucursal,"modificar_button","Editar",this.sucursalSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarSucursal,"actualizar_button","Actualizar",this.sucursalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarSucursal,"eliminar_button","Eliminar",this.sucursalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarSucursal,"cancelar_button","Cancelar",this.sucursalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosSucursal,"guardarcambios_button","Guardar",this.sucursalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSucursal,"guardarcambiostabla_button","Guardar",this.sucursalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSucursal,"cerrar_button","Salir",this.sucursalSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoSucursal.setToolTipText("Nuevo"+" "+SucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarSucursal.setToolTipText("Editar"+" "+SucursalConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarSucursal.setToolTipText("Actualizar"+" "+SucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarSucursal.setToolTipText("Eliminar)"+" "+SucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarSucursal.setToolTipText("Cancelar"+" "+SucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosSucursal.setToolTipText("Guardar"+" "+SucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaSucursal.setToolTipText("Guardar"+" "+SucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSucursal.setToolTipText("Salir"+" "+SucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
		//HOT KEYS
		/*
		N->Nuevo
		N->Alt + Nuevo Relaciones (ANTES R)
		A->Actualizar
		E->Eliminar
		S->Cerrar
		C->->Mayus + Cancelar (ANTES Q->Quit)
		G->Guardar Cambios
		D->Duplicar
		C->Alt + Cop?ar
		O->Orden
		N->Nuevo Tabla
		R->Recargar Informacion Inicial (ANTES I)
		Alt + Pag.Down->Siguientes
		Alt + Pag.Up->Anteriores
		
		NO UTILIZADOS
		M->Modificar
		
		*/
		String sMapKey = "";
		InputMap inputMap =null;
		
		//NUEVO
		sMapKey = "NuevoSucursal";
		inputMap = this.jButtonNuevoSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSucursal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSucursal"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarSucursal";
		inputMap = this.jButtonActualizarSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarSucursal"));
		
		//ELIMINAR
		sMapKey = "EliminarSucursal";
		inputMap = this.jButtonEliminarSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarSucursal"));
		
		//CANCELAR	
		sMapKey = "CancelarSucursal";
		inputMap = this.jButtonCancelarSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarSucursal"));
		
		//CERRAR		
		sMapKey = "CerrarSucursal";
		inputMap = this.jButtonCerrarSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSucursal"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSucursal";
		inputMap = this.jButtonGuardarCambiosTablaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSucursal"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoSucursal = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoSucursal.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoSucursal.setToolTipText("Nuevo Sucursal");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarSucursal = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarSucursal.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarSucursal.setToolTipText("Sin Cerrar Ventana Sucursal");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeSucursal = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeSucursal.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeSucursal.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeSucursal, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesSucursal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSucursal.setText("Accion");
		this.jComboBoxTiposAccionesSucursal.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioSucursal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioSucursal.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioSucursal.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesSucursal = new JLabelMe();
		
		this.jLabelAccionesSucursal.setText("Acciones");		
		this.jLabelAccionesSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposSucursal();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysSucursal();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesSucursal=new JTabbedPane();
		this.jTabbedPaneRelacionesSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesSucursal,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesSucursal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSucursal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSucursal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioSucursal.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSucursal.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSucursal.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioSucursal, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposSucursal = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosSucursal = new GridBagLayout();
		
		this.jPanelCamposSucursal.setLayout(gridaBagLayoutCamposSucursal);
		this.jPanelCamposOcultosSucursal.setLayout(gridaBagLayoutCamposOcultosSucursal);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSucursal.gridy = 0;
	this.gridBagConstraintsSucursal.gridx = 0;
	this.gridBagConstraintsSucursal.ipadx = 0;
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidSucursal.add(jLabelIdSucursal, this.gridBagConstraintsSucursal);



	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSucursal.gridy = 0;
	this.gridBagConstraintsSucursal.gridx = 1;
	this.gridBagConstraintsSucursal.ipadx = 0;
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidSucursal.add(jLabelidSucursal, this.gridBagConstraintsSucursal);


	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSucursal.gridy = 0;
	this.gridBagConstraintsSucursal.gridx = 0;
	this.gridBagConstraintsSucursal.ipadx = 0;
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaSucursal.add(jLabelid_empresaSucursal, this.gridBagConstraintsSucursal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSucursal = new GridBagConstraints();
		//this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSucursal.gridy = 0;
		this.gridBagConstraintsSucursal.gridx = 2;
		this.gridBagConstraintsSucursal.ipadx = 0;
		this.gridBagConstraintsSucursal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSucursal.add(jButtonid_empresaSucursalBusqueda, this.gridBagConstraintsSucursal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSucursal = new GridBagConstraints();
		//this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSucursal.gridy = 0;
		this.gridBagConstraintsSucursal.gridx = 3;
		this.gridBagConstraintsSucursal.ipadx = 0;
		this.gridBagConstraintsSucursal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSucursal.add(jButtonid_empresaSucursalUpdate, this.gridBagConstraintsSucursal);
	}

	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSucursal.gridy = 0;
	this.gridBagConstraintsSucursal.gridx = 1;
	this.gridBagConstraintsSucursal.ipadx = 0;
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaSucursal.add(jComboBoxid_empresaSucursal, this.gridBagConstraintsSucursal);


	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSucursal.gridy = 0;
	this.gridBagConstraintsSucursal.gridx = 0;
	this.gridBagConstraintsSucursal.ipadx = 0;
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisSucursal.add(jLabelid_paisSucursal, this.gridBagConstraintsSucursal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSucursal = new GridBagConstraints();
		//this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSucursal.gridy = 0;
		this.gridBagConstraintsSucursal.gridx = 2;
		this.gridBagConstraintsSucursal.ipadx = 0;
		this.gridBagConstraintsSucursal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisSucursal.add(jButtonid_paisSucursalBusqueda, this.gridBagConstraintsSucursal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSucursal = new GridBagConstraints();
		//this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSucursal.gridy = 0;
		this.gridBagConstraintsSucursal.gridx = 3;
		this.gridBagConstraintsSucursal.ipadx = 0;
		this.gridBagConstraintsSucursal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisSucursal.add(jButtonid_paisSucursalUpdate, this.gridBagConstraintsSucursal);
	}

	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSucursal.gridy = 0;
	this.gridBagConstraintsSucursal.gridx = 1;
	this.gridBagConstraintsSucursal.ipadx = 0;
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisSucursal.add(jComboBoxid_paisSucursal, this.gridBagConstraintsSucursal);


	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSucursal.gridy = 0;
	this.gridBagConstraintsSucursal.gridx = 0;
	this.gridBagConstraintsSucursal.ipadx = 0;
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ciudadSucursal.add(jLabelid_ciudadSucursal, this.gridBagConstraintsSucursal);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsSucursal = new GridBagConstraints();
	//this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSucursal.gridy = 0;
	this.gridBagConstraintsSucursal.gridx = 2;
	this.gridBagConstraintsSucursal.ipadx = 0;
	this.gridBagConstraintsSucursal.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_ciudadSucursal.add(jButtonid_ciudadSucursal, this.gridBagConstraintsSucursal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSucursal = new GridBagConstraints();
		//this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSucursal.gridy = 0;
		this.gridBagConstraintsSucursal.gridx = 3;
		this.gridBagConstraintsSucursal.ipadx = 0;
		this.gridBagConstraintsSucursal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadSucursal.add(jButtonid_ciudadSucursalBusqueda, this.gridBagConstraintsSucursal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSucursal = new GridBagConstraints();
		//this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSucursal.gridy = 0;
		this.gridBagConstraintsSucursal.gridx = 4;
		this.gridBagConstraintsSucursal.ipadx = 0;
		this.gridBagConstraintsSucursal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadSucursal.add(jButtonid_ciudadSucursalUpdate, this.gridBagConstraintsSucursal);
	}

	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSucursal.gridy = 0;
	this.gridBagConstraintsSucursal.gridx = 1;
	this.gridBagConstraintsSucursal.ipadx = 0;
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ciudadSucursal.add(jComboBoxid_ciudadSucursal, this.gridBagConstraintsSucursal);


	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSucursal.gridy = 0;
	this.gridBagConstraintsSucursal.gridx = 0;
	this.gridBagConstraintsSucursal.ipadx = 0;
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoSucursal.add(jLabelcodigoSucursal, this.gridBagConstraintsSucursal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSucursal = new GridBagConstraints();
		//this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSucursal.gridy = 0;
		this.gridBagConstraintsSucursal.gridx = 2;
		this.gridBagConstraintsSucursal.ipadx = 0;
		this.gridBagConstraintsSucursal.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoSucursal.add(jButtoncodigoSucursalBusqueda, this.gridBagConstraintsSucursal);
	}

	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSucursal.gridy = 0;
	this.gridBagConstraintsSucursal.gridx = 1;
	this.gridBagConstraintsSucursal.ipadx = 0;
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoSucursal.add(jTextFieldcodigoSucursal, this.gridBagConstraintsSucursal);


	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSucursal.gridy = 0;
	this.gridBagConstraintsSucursal.gridx = 0;
	this.gridBagConstraintsSucursal.ipadx = 0;
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumeroSucursal.add(jLabelnumeroSucursal, this.gridBagConstraintsSucursal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSucursal = new GridBagConstraints();
		//this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSucursal.gridy = 0;
		this.gridBagConstraintsSucursal.gridx = 2;
		this.gridBagConstraintsSucursal.ipadx = 0;
		this.gridBagConstraintsSucursal.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumeroSucursal.add(jButtonnumeroSucursalBusqueda, this.gridBagConstraintsSucursal);
	}

	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSucursal.gridy = 0;
	this.gridBagConstraintsSucursal.gridx = 1;
	this.gridBagConstraintsSucursal.ipadx = 0;
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumeroSucursal.add(jTextFieldnumeroSucursal, this.gridBagConstraintsSucursal);


	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSucursal.gridy = 0;
	this.gridBagConstraintsSucursal.gridx = 0;
	this.gridBagConstraintsSucursal.ipadx = 0;
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreSucursal.add(jLabelnombreSucursal, this.gridBagConstraintsSucursal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSucursal = new GridBagConstraints();
		//this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSucursal.gridy = 0;
		this.gridBagConstraintsSucursal.gridx = 2;
		this.gridBagConstraintsSucursal.ipadx = 0;
		this.gridBagConstraintsSucursal.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreSucursal.add(jButtonnombreSucursalBusqueda, this.gridBagConstraintsSucursal);
	}

	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSucursal.gridy = 0;
	this.gridBagConstraintsSucursal.gridx = 1;
	this.gridBagConstraintsSucursal.ipadx = 0;
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreSucursal.add(jscrollPanenombreSucursal, this.gridBagConstraintsSucursal);


	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSucursal.gridy = 0;
	this.gridBagConstraintsSucursal.gridx = 0;
	this.gridBagConstraintsSucursal.ipadx = 0;
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccionSucursal.add(jLabeldireccionSucursal, this.gridBagConstraintsSucursal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSucursal = new GridBagConstraints();
		//this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSucursal.gridy = 0;
		this.gridBagConstraintsSucursal.gridx = 2;
		this.gridBagConstraintsSucursal.ipadx = 0;
		this.gridBagConstraintsSucursal.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccionSucursal.add(jButtondireccionSucursalBusqueda, this.gridBagConstraintsSucursal);
	}

	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSucursal.gridy = 0;
	this.gridBagConstraintsSucursal.gridx = 1;
	this.gridBagConstraintsSucursal.ipadx = 0;
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccionSucursal.add(jscrollPanedireccionSucursal, this.gridBagConstraintsSucursal);


	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSucursal.gridy = 0;
	this.gridBagConstraintsSucursal.gridx = 0;
	this.gridBagConstraintsSucursal.ipadx = 0;
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrucSucursal.add(jLabelrucSucursal, this.gridBagConstraintsSucursal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSucursal = new GridBagConstraints();
		//this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSucursal.gridy = 0;
		this.gridBagConstraintsSucursal.gridx = 2;
		this.gridBagConstraintsSucursal.ipadx = 0;
		this.gridBagConstraintsSucursal.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucSucursal.add(jButtonrucSucursalBusqueda, this.gridBagConstraintsSucursal);
	}

	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSucursal.gridy = 0;
	this.gridBagConstraintsSucursal.gridx = 1;
	this.gridBagConstraintsSucursal.ipadx = 0;
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrucSucursal.add(jTextFieldrucSucursal, this.gridBagConstraintsSucursal);


	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSucursal.gridy = 0;
	this.gridBagConstraintsSucursal.gridx = 0;
	this.gridBagConstraintsSucursal.ipadx = 0;
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonoSucursal.add(jLabeltelefonoSucursal, this.gridBagConstraintsSucursal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSucursal = new GridBagConstraints();
		//this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSucursal.gridy = 0;
		this.gridBagConstraintsSucursal.gridx = 2;
		this.gridBagConstraintsSucursal.ipadx = 0;
		this.gridBagConstraintsSucursal.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonoSucursal.add(jButtontelefonoSucursalBusqueda, this.gridBagConstraintsSucursal);
	}

	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSucursal.gridy = 0;
	this.gridBagConstraintsSucursal.gridx = 1;
	this.gridBagConstraintsSucursal.ipadx = 0;
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonoSucursal.add(jTextFieldtelefonoSucursal, this.gridBagConstraintsSucursal);


	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSucursal.gridy = 0;
	this.gridBagConstraintsSucursal.gridx = 0;
	this.gridBagConstraintsSucursal.ipadx = 0;
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfaxSucursal.add(jLabelfaxSucursal, this.gridBagConstraintsSucursal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSucursal = new GridBagConstraints();
		//this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSucursal.gridy = 0;
		this.gridBagConstraintsSucursal.gridx = 2;
		this.gridBagConstraintsSucursal.ipadx = 0;
		this.gridBagConstraintsSucursal.insets = new Insets(0, 0, 0, 0);
		this.jPanelfaxSucursal.add(jButtonfaxSucursalBusqueda, this.gridBagConstraintsSucursal);
	}

	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSucursal.gridy = 0;
	this.gridBagConstraintsSucursal.gridx = 1;
	this.gridBagConstraintsSucursal.ipadx = 0;
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfaxSucursal.add(jTextFieldfaxSucursal, this.gridBagConstraintsSucursal);


	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSucursal.gridy = 0;
	this.gridBagConstraintsSucursal.gridx = 0;
	this.gridBagConstraintsSucursal.ipadx = 0;
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmailSucursal.add(jLabelmailSucursal, this.gridBagConstraintsSucursal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSucursal = new GridBagConstraints();
		//this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSucursal.gridy = 0;
		this.gridBagConstraintsSucursal.gridx = 2;
		this.gridBagConstraintsSucursal.ipadx = 0;
		this.gridBagConstraintsSucursal.insets = new Insets(0, 0, 0, 0);
		this.jPanelmailSucursal.add(jButtonmailSucursalBusqueda, this.gridBagConstraintsSucursal);
	}

	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSucursal.gridy = 0;
	this.gridBagConstraintsSucursal.gridx = 1;
	this.gridBagConstraintsSucursal.ipadx = 0;
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmailSucursal.add(jTextFieldmailSucursal, this.gridBagConstraintsSucursal);


	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSucursal.gridy = 0;
	this.gridBagConstraintsSucursal.gridx = 0;
	this.gridBagConstraintsSucursal.ipadx = 0;
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelresponsableSucursal.add(jLabelresponsableSucursal, this.gridBagConstraintsSucursal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSucursal = new GridBagConstraints();
		//this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSucursal.gridy = 0;
		this.gridBagConstraintsSucursal.gridx = 2;
		this.gridBagConstraintsSucursal.ipadx = 0;
		this.gridBagConstraintsSucursal.insets = new Insets(0, 0, 0, 0);
		this.jPanelresponsableSucursal.add(jButtonresponsableSucursalBusqueda, this.gridBagConstraintsSucursal);
	}

	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSucursal.gridy = 0;
	this.gridBagConstraintsSucursal.gridx = 1;
	this.gridBagConstraintsSucursal.ipadx = 0;
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelresponsableSucursal.add(jscrollPaneresponsableSucursal, this.gridBagConstraintsSucursal);


	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSucursal.gridy = 0;
	this.gridBagConstraintsSucursal.gridx = 0;
	this.gridBagConstraintsSucursal.ipadx = 0;
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionSucursal.add(jLabeldescripcionSucursal, this.gridBagConstraintsSucursal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSucursal = new GridBagConstraints();
		//this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSucursal.gridy = 0;
		this.gridBagConstraintsSucursal.gridx = 2;
		this.gridBagConstraintsSucursal.ipadx = 0;
		this.gridBagConstraintsSucursal.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionSucursal.add(jButtondescripcionSucursalBusqueda, this.gridBagConstraintsSucursal);
	}

	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSucursal.gridy = 0;
	this.gridBagConstraintsSucursal.gridx = 1;
	this.gridBagConstraintsSucursal.ipadx = 0;
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionSucursal.add(jscrollPanedescripcionSucursal, this.gridBagConstraintsSucursal);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSucursal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSucursal.gridy = iYPanelCamposSucursal;
	this.gridBagConstraintsSucursal.gridx = iXPanelCamposSucursal++;
	this.gridBagConstraintsSucursal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSucursal.add(this.jPanelidSucursal, this.gridBagConstraintsSucursal);



	if(iXPanelCamposSucursal % 2==0) {
		iXPanelCamposSucursal=0;
		iYPanelCamposSucursal++;
	}
	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSucursal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSucursal.gridy = iYPanelCamposSucursal;
	this.gridBagConstraintsSucursal.gridx = iXPanelCamposSucursal++;
	this.gridBagConstraintsSucursal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSucursal.add(this.jPanelid_empresaSucursal, this.gridBagConstraintsSucursal);



	if(iXPanelCamposSucursal % 2==0) {
		iXPanelCamposSucursal=0;
		iYPanelCamposSucursal++;
	}
	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSucursal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSucursal.gridy = iYPanelCamposSucursal;
	this.gridBagConstraintsSucursal.gridx = iXPanelCamposSucursal++;
	this.gridBagConstraintsSucursal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSucursal.add(this.jPanelid_paisSucursal, this.gridBagConstraintsSucursal);



	if(iXPanelCamposSucursal % 2==0) {
		iXPanelCamposSucursal=0;
		iYPanelCamposSucursal++;
	}
	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSucursal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSucursal.gridy = iYPanelCamposSucursal;
	this.gridBagConstraintsSucursal.gridx = iXPanelCamposSucursal++;
	this.gridBagConstraintsSucursal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSucursal.add(this.jPanelid_ciudadSucursal, this.gridBagConstraintsSucursal);



	if(iXPanelCamposSucursal % 2==0) {
		iXPanelCamposSucursal=0;
		iYPanelCamposSucursal++;
	}
	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSucursal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSucursal.gridy = iYPanelCamposSucursal;
	this.gridBagConstraintsSucursal.gridx = iXPanelCamposSucursal++;
	this.gridBagConstraintsSucursal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSucursal.add(this.jPanelcodigoSucursal, this.gridBagConstraintsSucursal);



	if(iXPanelCamposSucursal % 2==0) {
		iXPanelCamposSucursal=0;
		iYPanelCamposSucursal++;
	}
	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSucursal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSucursal.gridy = iYPanelCamposSucursal;
	this.gridBagConstraintsSucursal.gridx = iXPanelCamposSucursal++;
	this.gridBagConstraintsSucursal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSucursal.add(this.jPanelnumeroSucursal, this.gridBagConstraintsSucursal);



	if(iXPanelCamposSucursal % 2==0) {
		iXPanelCamposSucursal=0;
		iYPanelCamposSucursal++;
	}
	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSucursal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSucursal.gridy = iYPanelCamposSucursal;
	this.gridBagConstraintsSucursal.gridx = iXPanelCamposSucursal++;
	this.gridBagConstraintsSucursal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSucursal.add(this.jPanelnombreSucursal, this.gridBagConstraintsSucursal);



	if(iXPanelCamposSucursal % 2==0) {
		iXPanelCamposSucursal=0;
		iYPanelCamposSucursal++;
	}
	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSucursal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSucursal.gridy = iYPanelCamposSucursal;
	this.gridBagConstraintsSucursal.gridx = iXPanelCamposSucursal++;
	this.gridBagConstraintsSucursal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSucursal.add(this.jPaneldireccionSucursal, this.gridBagConstraintsSucursal);



	if(iXPanelCamposSucursal % 2==0) {
		iXPanelCamposSucursal=0;
		iYPanelCamposSucursal++;
	}
	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSucursal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSucursal.gridy = iYPanelCamposSucursal;
	this.gridBagConstraintsSucursal.gridx = iXPanelCamposSucursal++;
	this.gridBagConstraintsSucursal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSucursal.add(this.jPanelrucSucursal, this.gridBagConstraintsSucursal);



	if(iXPanelCamposSucursal % 2==0) {
		iXPanelCamposSucursal=0;
		iYPanelCamposSucursal++;
	}
	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSucursal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSucursal.gridy = iYPanelCamposSucursal;
	this.gridBagConstraintsSucursal.gridx = iXPanelCamposSucursal++;
	this.gridBagConstraintsSucursal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSucursal.add(this.jPaneltelefonoSucursal, this.gridBagConstraintsSucursal);



	if(iXPanelCamposSucursal % 2==0) {
		iXPanelCamposSucursal=0;
		iYPanelCamposSucursal++;
	}
	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSucursal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSucursal.gridy = iYPanelCamposSucursal;
	this.gridBagConstraintsSucursal.gridx = iXPanelCamposSucursal++;
	this.gridBagConstraintsSucursal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSucursal.add(this.jPanelfaxSucursal, this.gridBagConstraintsSucursal);



	if(iXPanelCamposSucursal % 2==0) {
		iXPanelCamposSucursal=0;
		iYPanelCamposSucursal++;
	}
	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSucursal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSucursal.gridy = iYPanelCamposSucursal;
	this.gridBagConstraintsSucursal.gridx = iXPanelCamposSucursal++;
	this.gridBagConstraintsSucursal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSucursal.add(this.jPanelmailSucursal, this.gridBagConstraintsSucursal);



	if(iXPanelCamposSucursal % 2==0) {
		iXPanelCamposSucursal=0;
		iYPanelCamposSucursal++;
	}
	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSucursal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSucursal.gridy = iYPanelCamposSucursal;
	this.gridBagConstraintsSucursal.gridx = iXPanelCamposSucursal++;
	this.gridBagConstraintsSucursal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSucursal.add(this.jPanelresponsableSucursal, this.gridBagConstraintsSucursal);



	if(iXPanelCamposSucursal % 2==0) {
		iXPanelCamposSucursal=0;
		iYPanelCamposSucursal++;
	}
	this.gridBagConstraintsSucursal = new GridBagConstraints();
	this.gridBagConstraintsSucursal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSucursal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSucursal.gridy = iYPanelCamposSucursal;
	this.gridBagConstraintsSucursal.gridx = iXPanelCamposSucursal++;
	this.gridBagConstraintsSucursal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSucursal.add(this.jPaneldescripcionSucursal, this.gridBagConstraintsSucursal);



	if(iXPanelCamposSucursal % 2==0) {
		iXPanelCamposSucursal=0;
		iYPanelCamposSucursal++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
				
		//SUBPANELES EN PANEL
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
			 		
			
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesSucursal= new GridBagLayout();
		this.jPanelAccionesSucursal.setLayout(gridaBagLayoutAccionesSucursal);
		
		GridBagLayout gridaBagLayoutAccionesFormularioSucursal= new GridBagLayout();
		this.jPanelAccionesFormularioSucursal.setLayout(gridaBagLayoutAccionesFormularioSucursal);
		
		this.gridBagConstraintsSucursal = new GridBagConstraints();
		this.gridBagConstraintsSucursal.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSucursal.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSucursal.add(this.jComboBoxTiposAccionesFormularioSucursal, this.gridBagConstraintsSucursal);

		this.gridBagConstraintsSucursal = new GridBagConstraints();
		this.gridBagConstraintsSucursal.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSucursal.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSucursal.add(this.jCheckBoxPostAccionNuevoSucursal, this.gridBagConstraintsSucursal);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.sucursalSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsSucursal = new GridBagConstraints();
			this.gridBagConstraintsSucursal.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSucursal.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSucursal.add(this.jCheckBoxPostAccionSinCerrarSucursal, this.gridBagConstraintsSucursal);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.sucursalSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.sucursalSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsSucursal = new GridBagConstraints();
			this.gridBagConstraintsSucursal.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSucursal.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSucursal.add(this.jCheckBoxPostAccionSinMensajeSucursal, this.gridBagConstraintsSucursal);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsSucursal = new GridBagConstraints();
		this.gridBagConstraintsSucursal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSucursal.gridy = 0;
		this.gridBagConstraintsSucursal.gridx = iPosXAccion++;
			
		this.jPanelAccionesSucursal.add(this.jButtonModificarSucursal, this.gridBagConstraintsSucursal);							

		this.gridBagConstraintsSucursal = new GridBagConstraints();
		this.gridBagConstraintsSucursal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSucursal.gridy = 0;
		this.gridBagConstraintsSucursal.gridx =iPosXAccion++;
			
		this.jPanelAccionesSucursal.add(this.jButtonEliminarSucursal, this.gridBagConstraintsSucursal);
		
			
		this.gridBagConstraintsSucursal = new GridBagConstraints();
		this.gridBagConstraintsSucursal.gridy = 0;		
		this.gridBagConstraintsSucursal.gridx = iPosXAccion++;
		
		this.jPanelAccionesSucursal.add(this.jButtonActualizarSucursal, this.gridBagConstraintsSucursal);


		this.gridBagConstraintsSucursal = new GridBagConstraints();
		this.gridBagConstraintsSucursal.gridy = 0;		
		this.gridBagConstraintsSucursal.gridx = iPosXAccion++;
		
		this.jPanelAccionesSucursal.add(this.jButtonGuardarCambiosSucursal, this.gridBagConstraintsSucursal);	
		
		this.gridBagConstraintsSucursal = new GridBagConstraints();
		this.gridBagConstraintsSucursal.gridy = 0;		
		this.gridBagConstraintsSucursal.gridx =iPosXAccion++;
		
		this.jPanelAccionesSucursal.add(this.jButtonCancelarSucursal, this.gridBagConstraintsSucursal);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSucursal = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSucursal);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.sucursalSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSucursal = new GridBagConstraints();						
			this.gridBagConstraintsSucursal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSucursal.gridx = 0;		
			//this.gridBagConstraintsSucursal.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSucursal.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSucursal.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsSucursal = new GridBagConstraints();
		this.gridBagConstraintsSucursal.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSucursal.gridx =0;
		this.gridBagConstraintsSucursal.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSucursal.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSucursal, this.gridBagConstraintsSucursal);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(SucursalJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleSucursal = new SucursalBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Sucursal DATOS");
			
			this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	        //this.setjInternalFrameParent(this);
	        
			iHeightFormularioMaximo=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	        
	        if(iHeightFormulario>iHeightFormularioMaximo) {
	        	iHeightFormulario=iHeightFormularioMaximo;
	        }
			
			iWidthFormularioMaximo=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
	        
			if(iWidthFormulario>iWidthFormularioMaximo) {
	        	iWidthFormulario=iWidthFormularioMaximo;
	        }
			
	        //this.setTitle("[FOR] - Sucursal DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Sucursal Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			SucursalModel sucursalModel=new SucursalModel(this);
			
			//SI USARA CLASE INTERNA
			//SucursalModel.SucursalFocusTraversalPolicy sucursalFocusTraversalPolicy = sucursalModel.new SucursalFocusTraversalPolicy(this);
			
			//sucursalFocusTraversalPolicy.setsucursalJInternalFrame(this);
			
			this.setFocusTraversalPolicy(sucursalModel);
			
			
			this.jContentPaneDetalleSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleSucursal = new GridBagLayout();	
			this.jContentPaneDetalleSucursal.setLayout(gridaBagLayoutDetalleSucursal);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSucursal = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsSucursal = new GridBagConstraints();
				this.gridBagConstraintsSucursal.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsSucursal.gridx = 0;
					
				
				this.jContentPaneDetalleSucursal.add(jTtoolBarDetalleSucursal, gridBagConstraintsSucursal);								
				
}
			
			this.jScrollPanelDatosEdicionSucursal=   new JScrollPane(jContentPaneDetalleSucursal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSucursal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSucursal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSucursal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralSucursal=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSucursal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSucursal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSucursal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSucursal = new GridBagConstraints();
			
			
	        this.gridBagConstraintsSucursal.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsSucursal.gridx = 0;
	        
			this.jContentPaneDetalleSucursal.add(jPanelCamposSucursal, gridBagConstraintsSucursal);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=false;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& sucursalSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.sucursalSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsSucursal= new GridBagConstraints();
						this.gridBagConstraintsSucursal.gridy = iGridyRelaciones++;
						this.gridBagConstraintsSucursal.gridx = 0;
						this.jContentPaneDetalleSucursal.add(this.jTabbedPaneRelacionesSucursal, this.gridBagConstraintsSucursal);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesSucursal.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosSucursal.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsSucursal = new GridBagConstraints();
					this.gridBagConstraintsSucursal.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsSucursal.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsSucursal.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsSucursal.gridx = 0;
					
				
					this.jContentPaneDetalleSucursal.add(jPanelCamposOcultosSucursal, gridBagConstraintsSucursal);
				
					this.jPanelCamposOcultosSucursal.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsSucursal = new GridBagConstraints();
			this.gridBagConstraintsSucursal.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsSucursal.gridx = 0;
	        this.gridBagConstraintsSucursal.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleSucursal.add(this.jPanelAccionesFormularioSucursal, this.gridBagConstraintsSucursal);							
			
			
			
			this.gridBagConstraintsSucursal = new GridBagConstraints();
	        this.gridBagConstraintsSucursal.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsSucursal.gridx = 0;
	        
			
			this.jContentPaneDetalleSucursal.add(this.jPanelAccionesSucursal, this.gridBagConstraintsSucursal);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionSucursal);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionSucursal=   new JScrollPane(this.jPanelCamposSucursal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSucursal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSucursal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSucursal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsSucursal = new GridBagConstraints();
			this.gridBagConstraintsSucursal.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsSucursal.gridx = 0;
			this.gridBagConstraintsSucursal.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsSucursal.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsSucursal.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionSucursal, this.gridBagConstraintsSucursal);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsSucursal = new GridBagConstraints();
			this.gridBagConstraintsSucursal.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSucursal.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioSucursal, this.gridBagConstraintsSucursal);			
			
			this.gridBagConstraintsSucursal = new GridBagConstraints();
			this.gridBagConstraintsSucursal.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSucursal.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesSucursal, this.gridBagConstraintsSucursal);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsSucursal = new GridBagConstraints();
		this.gridBagConstraintsSucursal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSucursal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSucursal, this.gridBagConstraintsSucursal);
			
			
		this.gridBagConstraintsSucursal = new GridBagConstraints();
		this.gridBagConstraintsSucursal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSucursal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSucursal, this.gridBagConstraintsSucursal);
		
			
		this.gridBagConstraintsSucursal = new GridBagConstraints();
		this.gridBagConstraintsSucursal.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSucursal.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSucursal, this.gridBagConstraintsSucursal);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralSucursal;//jContentPane;
		
		return jScrollPanelDatosEdicionSucursal;
    } 
	
	
	
	
	
	
	
	
	
	/*
	case "CONTROL_BUSQUEDA":
		sKeyName="F3";
	case "CONTROL_BUSCAR":
		sKeyName="F4";
	case "CONTROL_ARBOL":
		sKeyName="F5";
	case "CONTROL_ACTUALIZAR":
		sKeyName="F6";
	sKeyName="N";					
	*/
}
