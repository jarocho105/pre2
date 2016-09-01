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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.report.*;
import com.bydan.erp.cartera.util.report.CobrarClientesPorRegionConstantesFunciones;

import com.bydan.erp.cartera.business.logic.report.*;
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
public class CobrarClientesPorRegionDetalleFormJInternalFrame extends CobrarClientesPorRegionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCobrarClientesPorRegion;
	
	protected JMenuBar jmenuBarDetalleCobrarClientesPorRegion;
	
	protected JMenu jmenuDetalleCobrarClientesPorRegion;
	protected JMenu jmenuDetalleArchivoCobrarClientesPorRegion;
	protected JMenu jmenuDetalleAccionesCobrarClientesPorRegion;
	protected JMenu jmenuDetalleDatosCobrarClientesPorRegion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCobrarClientesPorRegion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCobrarClientesPorRegion;	
	protected GridBagConstraints gridBagConstraintsCobrarClientesPorRegion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CobrarClientesPorRegionBeanSwingJInternalFrameAdditional jInternalFrameDetalleCobrarClientesPorRegion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected RegionBeanSwingJInternalFrame regionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_region="";

	protected ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_provincia="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";
	
	public CobrarClientesPorRegionSessionBean cobrarclientesporregionSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public PaisSessionBean paisSessionBean;
	public RegionSessionBean regionSessionBean;
	public ProvinciaSessionBean provinciaSessionBean;
	public CiudadSessionBean ciudadSessionBean;	
	
	public CobrarClientesPorRegionLogic cobrarclientesporregionLogic;
	
	public JScrollPane jScrollPanelDatosCobrarClientesPorRegion;
	public JScrollPane jScrollPanelDatosEdicionCobrarClientesPorRegion;
	public JScrollPane jScrollPanelDatosGeneralCobrarClientesPorRegion;
	
	protected JPanel jPanelCamposCobrarClientesPorRegion;    
	protected JPanel jPanelCamposOcultosCobrarClientesPorRegion;    	
	protected JPanel jPanelAccionesCobrarClientesPorRegion;
	protected JPanel jPanelAccionesFormularioCobrarClientesPorRegion;
    
	
	
	protected Integer iXPanelCamposCobrarClientesPorRegion=0;
	protected Integer iYPanelCamposCobrarClientesPorRegion=0;
	
	protected Integer iXPanelCamposOcultosCobrarClientesPorRegion=0;
	protected Integer iYPanelCamposOcultosCobrarClientesPorRegion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCobrarClientesPorRegion;
	public JButton jButtonModificarCobrarClientesPorRegion;
	public JButton jButtonActualizarCobrarClientesPorRegion;
    public JButton jButtonEliminarCobrarClientesPorRegion;
	public JButton jButtonCancelarCobrarClientesPorRegion;
    public JButton jButtonGuardarCambiosCobrarClientesPorRegion;
	public JButton jButtonGuardarCambiosTablaCobrarClientesPorRegion;
	protected JButton jButtonCerrarCobrarClientesPorRegion;
	
	
	protected JButton jButtonProcesarInformacionCobrarClientesPorRegion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCobrarClientesPorRegion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCobrarClientesPorRegion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCobrarClientesPorRegion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCobrarClientesPorRegion;
	protected JButton jButtonModificarToolBarCobrarClientesPorRegion;
	protected JButton jButtonActualizarToolBarCobrarClientesPorRegion;
    protected JButton jButtonEliminarToolBarCobrarClientesPorRegion;
	protected JButton jButtonCancelarToolBarCobrarClientesPorRegion;
    protected JButton jButtonGuardarCambiosToolBarCobrarClientesPorRegion;
	protected JButton jButtonGuardarCambiosTablaToolBarCobrarClientesPorRegion;
	protected JButton jButtonMostrarOcultarTablaToolBarCobrarClientesPorRegion;
	protected JButton jButtonCerrarToolBarCobrarClientesPorRegion;
	
	protected JButton jButtonProcesarInformacionToolBarCobrarClientesPorRegion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCobrarClientesPorRegion;
	protected JMenuItem jMenuItemModificarCobrarClientesPorRegion;
	protected JMenuItem jMenuItemActualizarCobrarClientesPorRegion;
    protected JMenuItem jMenuItemEliminarCobrarClientesPorRegion;
	protected JMenuItem jMenuItemCancelarCobrarClientesPorRegion;
    protected JMenuItem jMenuItemGuardarCambiosCobrarClientesPorRegion;
	protected JMenuItem jMenuItemGuardarCambiosTablaCobrarClientesPorRegion;
	protected JMenuItem jMenuItemCerrarCobrarClientesPorRegion;
	protected JMenuItem jMenuItemDetalleCerrarCobrarClientesPorRegion;
	protected JMenuItem jMenuItemDetalleMostarOcultarCobrarClientesPorRegion;
	
	protected JMenuItem jMenuItemProcesarInformacionCobrarClientesPorRegion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCobrarClientesPorRegion;
	protected JMenuItem jMenuItemMostrarOcultarCobrarClientesPorRegion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCobrarClientesPorRegion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCobrarClientesPorRegion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCobrarClientesPorRegion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCobrarClientesPorRegion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCobrarClientesPorRegion;
	public JLabel jLabelIdCobrarClientesPorRegion;
	public JLabel jLabelidCobrarClientesPorRegion;
	public JButton jButtonidCobrarClientesPorRegionBusqueda= new JButtonMe();

	public JPanel jPanelnombre_regionCobrarClientesPorRegion;
	public JLabel jLabelnombre_regionCobrarClientesPorRegion;
	public JTextArea jTextAreanombre_regionCobrarClientesPorRegion;
	public JScrollPane jscrollPanenombre_regionCobrarClientesPorRegion;
	public JButton jButtonnombre_regionCobrarClientesPorRegionBusqueda= new JButtonMe();

	public JPanel jPanelnombre_provinciaCobrarClientesPorRegion;
	public JLabel jLabelnombre_provinciaCobrarClientesPorRegion;
	public JTextArea jTextAreanombre_provinciaCobrarClientesPorRegion;
	public JScrollPane jscrollPanenombre_provinciaCobrarClientesPorRegion;
	public JButton jButtonnombre_provinciaCobrarClientesPorRegionBusqueda= new JButtonMe();

	public JPanel jPanelnombre_ciudadCobrarClientesPorRegion;
	public JLabel jLabelnombre_ciudadCobrarClientesPorRegion;
	public JTextArea jTextAreanombre_ciudadCobrarClientesPorRegion;
	public JScrollPane jscrollPanenombre_ciudadCobrarClientesPorRegion;
	public JButton jButtonnombre_ciudadCobrarClientesPorRegionBusqueda= new JButtonMe();

	public JPanel jPanelnombre_zonaCobrarClientesPorRegion;
	public JLabel jLabelnombre_zonaCobrarClientesPorRegion;
	public JTextField jTextFieldnombre_zonaCobrarClientesPorRegion;
	public JButton jButtonnombre_zonaCobrarClientesPorRegionBusqueda= new JButtonMe();

	public JPanel jPanelnombre_rutaCobrarClientesPorRegion;
	public JLabel jLabelnombre_rutaCobrarClientesPorRegion;
	public JTextArea jTextAreanombre_rutaCobrarClientesPorRegion;
	public JScrollPane jscrollPanenombre_rutaCobrarClientesPorRegion;
	public JButton jButtonnombre_rutaCobrarClientesPorRegionBusqueda= new JButtonMe();

	public JPanel jPanelnombre_vendedorCobrarClientesPorRegion;
	public JLabel jLabelnombre_vendedorCobrarClientesPorRegion;
	public JTextArea jTextAreanombre_vendedorCobrarClientesPorRegion;
	public JScrollPane jscrollPanenombre_vendedorCobrarClientesPorRegion;
	public JButton jButtonnombre_vendedorCobrarClientesPorRegionBusqueda= new JButtonMe();

	public JPanel jPanelcodigoCobrarClientesPorRegion;
	public JLabel jLabelcodigoCobrarClientesPorRegion;
	public JTextField jTextFieldcodigoCobrarClientesPorRegion;
	public JButton jButtoncodigoCobrarClientesPorRegionBusqueda= new JButtonMe();

	public JPanel jPanelnombreCobrarClientesPorRegion;
	public JLabel jLabelnombreCobrarClientesPorRegion;
	public JTextArea jTextAreanombreCobrarClientesPorRegion;
	public JScrollPane jscrollPanenombreCobrarClientesPorRegion;
	public JButton jButtonnombreCobrarClientesPorRegionBusqueda= new JButtonMe();

	public JPanel jPanelapellidoCobrarClientesPorRegion;
	public JLabel jLabelapellidoCobrarClientesPorRegion;
	public JTextArea jTextAreaapellidoCobrarClientesPorRegion;
	public JScrollPane jscrollPaneapellidoCobrarClientesPorRegion;
	public JButton jButtonapellidoCobrarClientesPorRegionBusqueda= new JButtonMe();

	public JPanel jPaneldireccion_direccionCobrarClientesPorRegion;
	public JLabel jLabeldireccion_direccionCobrarClientesPorRegion;
	public JTextArea jTextAreadireccion_direccionCobrarClientesPorRegion;
	public JScrollPane jscrollPanedireccion_direccionCobrarClientesPorRegion;
	public JButton jButtondireccion_direccionCobrarClientesPorRegionBusqueda= new JButtonMe();

	public JPanel jPaneltelefono_telefonoCobrarClientesPorRegion;
	public JLabel jLabeltelefono_telefonoCobrarClientesPorRegion;
	public JTextArea jTextAreatelefono_telefonoCobrarClientesPorRegion;
	public JScrollPane jscrollPanetelefono_telefonoCobrarClientesPorRegion;
	public JButton jButtontelefono_telefonoCobrarClientesPorRegionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCobrarClientesPorRegion;
	public JLabel jLabelid_empresaCobrarClientesPorRegion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCobrarClientesPorRegion;
	public JButton jButtonid_empresaCobrarClientesPorRegion= new JButtonMe();
	public JButton jButtonid_empresaCobrarClientesPorRegionUpdate= new JButtonMe();
	public JButton jButtonid_empresaCobrarClientesPorRegionBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalCobrarClientesPorRegion;
	public JLabel jLabelid_sucursalCobrarClientesPorRegion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalCobrarClientesPorRegion;
	public JButton jButtonid_sucursalCobrarClientesPorRegion= new JButtonMe();
	public JButton jButtonid_sucursalCobrarClientesPorRegionUpdate= new JButtonMe();
	public JButton jButtonid_sucursalCobrarClientesPorRegionBusqueda= new JButtonMe();

	public JPanel jPanelid_paisCobrarClientesPorRegion;
	public JLabel jLabelid_paisCobrarClientesPorRegion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisCobrarClientesPorRegion;
	public JButton jButtonid_paisCobrarClientesPorRegion= new JButtonMe();
	public JButton jButtonid_paisCobrarClientesPorRegionUpdate= new JButtonMe();
	public JButton jButtonid_paisCobrarClientesPorRegionBusqueda= new JButtonMe();

	public JPanel jPanelid_regionCobrarClientesPorRegion;
	public JLabel jLabelid_regionCobrarClientesPorRegion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_regionCobrarClientesPorRegion;
	public JButton jButtonid_regionCobrarClientesPorRegion= new JButtonMe();
	public JButton jButtonid_regionCobrarClientesPorRegionUpdate= new JButtonMe();
	public JButton jButtonid_regionCobrarClientesPorRegionBusqueda= new JButtonMe();

	public JPanel jPanelid_provinciaCobrarClientesPorRegion;
	public JLabel jLabelid_provinciaCobrarClientesPorRegion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_provinciaCobrarClientesPorRegion;
	public JButton jButtonid_provinciaCobrarClientesPorRegion= new JButtonMe();
	public JButton jButtonid_provinciaCobrarClientesPorRegionUpdate= new JButtonMe();
	public JButton jButtonid_provinciaCobrarClientesPorRegionBusqueda= new JButtonMe();

	public JPanel jPanelid_ciudadCobrarClientesPorRegion;
	public JLabel jLabelid_ciudadCobrarClientesPorRegion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadCobrarClientesPorRegion;
	public JButton jButtonid_ciudadCobrarClientesPorRegion= new JButtonMe();
	public JButton jButtonid_ciudadCobrarClientesPorRegionUpdate= new JButtonMe();
	public JButton jButtonid_ciudadCobrarClientesPorRegionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCobrarClientesPorRegion;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
	public int iHeightFormulario=946;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CobrarClientesPorRegionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCobrarClientesPorRegion=new JPanel();
				this.jPanelAccionesFormularioCobrarClientesPorRegion=new JPanel();
				this.jmenuBarDetalleCobrarClientesPorRegion=new JMenuBar();
				this.jTtoolBarDetalleCobrarClientesPorRegion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesPorRegionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CobrarClientesPorRegion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CobrarClientesPorRegionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CobrarClientesPorRegion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesPorRegionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarClientesPorRegion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesPorRegionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarClientesPorRegion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesPorRegionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CobrarClientesPorRegion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCobrarClientesPorRegion() {
		return this.jButtonActualizarToolBarCobrarClientesPorRegion;
	}
	
	public JButton getjButtonEliminarToolBarCobrarClientesPorRegion() {
		return this.jButtonEliminarToolBarCobrarClientesPorRegion;
	}
	
	public JButton getjButtonCancelarToolBarCobrarClientesPorRegion() {
		return this.jButtonCancelarToolBarCobrarClientesPorRegion;
	}		
	
	public JButton getjButtonProcesarInformacionCobrarClientesPorRegion() {
		return this.jButtonProcesarInformacionCobrarClientesPorRegion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCobrarClientesPorRegion)	{
		this.jButtonProcesarInformacionCobrarClientesPorRegion = jButtonProcesarInformacionCobrarClientesPorRegion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCobrarClientesPorRegion() {
		return this.jComboBoxTiposAccionesCobrarClientesPorRegion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCobrarClientesPorRegion(
			JComboBox jComboBoxTiposRelacionesCobrarClientesPorRegion) {
		this.jComboBoxTiposRelacionesCobrarClientesPorRegion = jComboBoxTiposRelacionesCobrarClientesPorRegion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCobrarClientesPorRegion(
			JComboBox jComboBoxTiposAccionesCobrarClientesPorRegion) {
		this.jComboBoxTiposAccionesCobrarClientesPorRegion = jComboBoxTiposAccionesCobrarClientesPorRegion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCobrarClientesPorRegion() {
		return this.jComboBoxTiposAccionesFormularioCobrarClientesPorRegion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCobrarClientesPorRegion(
			JComboBox jComboBoxTiposAccionesFormularioCobrarClientesPorRegion) {
		this.jComboBoxTiposAccionesFormularioCobrarClientesPorRegion = jComboBoxTiposAccionesFormularioCobrarClientesPorRegion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cobrarclientesporregionSessionBean=new CobrarClientesPorRegionSessionBean();
		
		this.cobrarclientesporregionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarclientesporregionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CobrarClientesPorRegionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CobrarClientesPorRegionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CobrarClientesPorRegionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cobrar Clientes Por Region MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()) {
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
	
		CobrarClientesPorRegionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCobrarClientesPorRegion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCobrarClientesPorRegion=new JButtonMe();
				this.jButtonModificarToolBarCobrarClientesPorRegion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCobrarClientesPorRegion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCobrarClientesPorRegion,this.jTtoolBarDetalleCobrarClientesPorRegion,
							"actualizar","actualizar","Actualizar"+" "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCobrarClientesPorRegion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCobrarClientesPorRegion,this.jTtoolBarDetalleCobrarClientesPorRegion,
							"eliminar","eliminar","Eliminar"+" "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCobrarClientesPorRegion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCobrarClientesPorRegion,this.jTtoolBarDetalleCobrarClientesPorRegion,
							"cancelar","cancelar","Cancelar"+" "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCobrarClientesPorRegion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCobrarClientesPorRegion,this.jTtoolBarDetalleCobrarClientesPorRegion,
							"guardarcambios","guardarcambios","Guardar"+" "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCobrarClientesPorRegion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCobrarClientesPorRegion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCobrarClientesPorRegion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCobrarClientesPorRegion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCobrarClientesPorRegion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCobrarClientesPorRegion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCobrarClientesPorRegion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCobrarClientesPorRegion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCobrarClientesPorRegion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCobrarClientesPorRegion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCobrarClientesPorRegion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCobrarClientesPorRegion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCobrarClientesPorRegion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCobrarClientesPorRegion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCobrarClientesPorRegion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCobrarClientesPorRegion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCobrarClientesPorRegion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCobrarClientesPorRegion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCobrarClientesPorRegion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCobrarClientesPorRegion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCobrarClientesPorRegion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCobrarClientesPorRegion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCobrarClientesPorRegion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCobrarClientesPorRegion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCobrarClientesPorRegion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCobrarClientesPorRegion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCobrarClientesPorRegion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCobrarClientesPorRegion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCobrarClientesPorRegion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCobrarClientesPorRegion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCobrarClientesPorRegion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCobrarClientesPorRegion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCobrarClientesPorRegion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCobrarClientesPorRegion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCobrarClientesPorRegion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCobrarClientesPorRegion.add(this.jMenuItemDetalleCerrarCobrarClientesPorRegion);
		
		this.jmenuDetalleAccionesCobrarClientesPorRegion.add(this.jMenuItemActualizarCobrarClientesPorRegion);
		this.jmenuDetalleAccionesCobrarClientesPorRegion.add(this.jMenuItemEliminarCobrarClientesPorRegion);
		this.jmenuDetalleAccionesCobrarClientesPorRegion.add(this.jMenuItemCancelarCobrarClientesPorRegion);		
		
		//this.jmenuDetalleDatosCobrarClientesPorRegion.add(this.jMenuItemDetalleAbrirOrderByCobrarClientesPorRegion);				
		this.jmenuDetalleDatosCobrarClientesPorRegion.add(this.jMenuItemDetalleMostarOcultarCobrarClientesPorRegion);				
				
		//this.jmenuDetalleAccionesCobrarClientesPorRegion.add(this.jMenuItemGuardarCambiosCobrarClientesPorRegion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCobrarClientesPorRegion.add(this.jmenuDetalleArchivoCobrarClientesPorRegion);		
		this.jmenuBarDetalleCobrarClientesPorRegion.add(this.jmenuDetalleAccionesCobrarClientesPorRegion);		
		this.jmenuBarDetalleCobrarClientesPorRegion.add(this.jmenuDetalleDatosCobrarClientesPorRegion);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCobrarClientesPorRegion);				
	}
	
	
	public void inicializarElementosCamposCobrarClientesPorRegion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCobrarClientesPorRegion = new JLabelMe();
		jLabelIdCobrarClientesPorRegion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCobrarClientesPorRegion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCobrarClientesPorRegion.setToolTipText(CobrarClientesPorRegionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCobrarClientesPorRegion= new GridBagLayout();

		this.jPanelidCobrarClientesPorRegion.setLayout(this.gridaBagLayoutCobrarClientesPorRegion);

		jLabelidCobrarClientesPorRegion = new JLabel();
		jLabelidCobrarClientesPorRegion.setText("Id");

		jLabelidCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombre_regionCobrarClientesPorRegion = new JLabelMe();
		this.jLabelnombre_regionCobrarClientesPorRegion.setText(""+CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREREGION+" : *");
		this.jLabelnombre_regionCobrarClientesPorRegion.setToolTipText("Nombre Region");
		this.jLabelnombre_regionCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_regionCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_regionCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_regionCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_regionCobrarClientesPorRegion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_regionCobrarClientesPorRegion.setToolTipText(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREREGION);
		this.gridaBagLayoutCobrarClientesPorRegion = new GridBagLayout();
		this.jPanelnombre_regionCobrarClientesPorRegion.setLayout(this.gridaBagLayoutCobrarClientesPorRegion);


		jTextAreanombre_regionCobrarClientesPorRegion= new JTextAreaMe();
		jTextAreanombre_regionCobrarClientesPorRegion.setEnabled(false);
		jTextAreanombre_regionCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_regionCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_regionCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_regionCobrarClientesPorRegion.setLineWrap(true);
		jTextAreanombre_regionCobrarClientesPorRegion.setWrapStyleWord(true);
		jTextAreanombre_regionCobrarClientesPorRegion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_regionCobrarClientesPorRegion.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_regionCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_regionCobrarClientesPorRegion = new JScrollPane(jTextAreanombre_regionCobrarClientesPorRegion);
		jscrollPanenombre_regionCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_regionCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_regionCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombre_regionCobrarClientesPorRegionBusqueda= new JButtonMe();
		this.jButtonnombre_regionCobrarClientesPorRegionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_regionCobrarClientesPorRegionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_regionCobrarClientesPorRegionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_regionCobrarClientesPorRegionBusqueda.setText("U");
		this.jButtonnombre_regionCobrarClientesPorRegionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_regionCobrarClientesPorRegionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_regionCobrarClientesPorRegionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_regionCobrarClientesPorRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_regionCobrarClientesPorRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_regionCobrarClientesPorRegionBusqueda"));

		if(this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_regionCobrarClientesPorRegionBusqueda.setVisible(false);		}


					
		this.jLabelnombre_provinciaCobrarClientesPorRegion = new JLabelMe();
		this.jLabelnombre_provinciaCobrarClientesPorRegion.setText(""+CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREPROVINCIA+" : *");
		this.jLabelnombre_provinciaCobrarClientesPorRegion.setToolTipText("Nombre Provincia");
		this.jLabelnombre_provinciaCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_provinciaCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_provinciaCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_provinciaCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_provinciaCobrarClientesPorRegion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_provinciaCobrarClientesPorRegion.setToolTipText(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREPROVINCIA);
		this.gridaBagLayoutCobrarClientesPorRegion = new GridBagLayout();
		this.jPanelnombre_provinciaCobrarClientesPorRegion.setLayout(this.gridaBagLayoutCobrarClientesPorRegion);


		jTextAreanombre_provinciaCobrarClientesPorRegion= new JTextAreaMe();
		jTextAreanombre_provinciaCobrarClientesPorRegion.setEnabled(false);
		jTextAreanombre_provinciaCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_provinciaCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_provinciaCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_provinciaCobrarClientesPorRegion.setLineWrap(true);
		jTextAreanombre_provinciaCobrarClientesPorRegion.setWrapStyleWord(true);
		jTextAreanombre_provinciaCobrarClientesPorRegion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_provinciaCobrarClientesPorRegion.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_provinciaCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_provinciaCobrarClientesPorRegion = new JScrollPane(jTextAreanombre_provinciaCobrarClientesPorRegion);
		jscrollPanenombre_provinciaCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_provinciaCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_provinciaCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombre_provinciaCobrarClientesPorRegionBusqueda= new JButtonMe();
		this.jButtonnombre_provinciaCobrarClientesPorRegionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_provinciaCobrarClientesPorRegionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_provinciaCobrarClientesPorRegionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_provinciaCobrarClientesPorRegionBusqueda.setText("U");
		this.jButtonnombre_provinciaCobrarClientesPorRegionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_provinciaCobrarClientesPorRegionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_provinciaCobrarClientesPorRegionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_provinciaCobrarClientesPorRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_provinciaCobrarClientesPorRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_provinciaCobrarClientesPorRegionBusqueda"));

		if(this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_provinciaCobrarClientesPorRegionBusqueda.setVisible(false);		}


					
		this.jLabelnombre_ciudadCobrarClientesPorRegion = new JLabelMe();
		this.jLabelnombre_ciudadCobrarClientesPorRegion.setText(""+CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRECIUDAD+" : *");
		this.jLabelnombre_ciudadCobrarClientesPorRegion.setToolTipText("Nombre Ciudad");
		this.jLabelnombre_ciudadCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_ciudadCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_ciudadCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_ciudadCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_ciudadCobrarClientesPorRegion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_ciudadCobrarClientesPorRegion.setToolTipText(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRECIUDAD);
		this.gridaBagLayoutCobrarClientesPorRegion = new GridBagLayout();
		this.jPanelnombre_ciudadCobrarClientesPorRegion.setLayout(this.gridaBagLayoutCobrarClientesPorRegion);


		jTextAreanombre_ciudadCobrarClientesPorRegion= new JTextAreaMe();
		jTextAreanombre_ciudadCobrarClientesPorRegion.setEnabled(false);
		jTextAreanombre_ciudadCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_ciudadCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_ciudadCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_ciudadCobrarClientesPorRegion.setLineWrap(true);
		jTextAreanombre_ciudadCobrarClientesPorRegion.setWrapStyleWord(true);
		jTextAreanombre_ciudadCobrarClientesPorRegion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_ciudadCobrarClientesPorRegion.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_ciudadCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_ciudadCobrarClientesPorRegion = new JScrollPane(jTextAreanombre_ciudadCobrarClientesPorRegion);
		jscrollPanenombre_ciudadCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_ciudadCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_ciudadCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombre_ciudadCobrarClientesPorRegionBusqueda= new JButtonMe();
		this.jButtonnombre_ciudadCobrarClientesPorRegionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_ciudadCobrarClientesPorRegionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_ciudadCobrarClientesPorRegionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_ciudadCobrarClientesPorRegionBusqueda.setText("U");
		this.jButtonnombre_ciudadCobrarClientesPorRegionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_ciudadCobrarClientesPorRegionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_ciudadCobrarClientesPorRegionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_ciudadCobrarClientesPorRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_ciudadCobrarClientesPorRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_ciudadCobrarClientesPorRegionBusqueda"));

		if(this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_ciudadCobrarClientesPorRegionBusqueda.setVisible(false);		}


					
		this.jLabelnombre_zonaCobrarClientesPorRegion = new JLabelMe();
		this.jLabelnombre_zonaCobrarClientesPorRegion.setText(""+CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREZONA+" : *");
		this.jLabelnombre_zonaCobrarClientesPorRegion.setToolTipText("Nombre Zona");
		this.jLabelnombre_zonaCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_zonaCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_zonaCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_zonaCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_zonaCobrarClientesPorRegion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_zonaCobrarClientesPorRegion.setToolTipText(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREZONA);
		this.gridaBagLayoutCobrarClientesPorRegion = new GridBagLayout();
		this.jPanelnombre_zonaCobrarClientesPorRegion.setLayout(this.gridaBagLayoutCobrarClientesPorRegion);


		jTextFieldnombre_zonaCobrarClientesPorRegion= new JTextFieldMe();

		jTextFieldnombre_zonaCobrarClientesPorRegion.setEnabled(false);
		jTextFieldnombre_zonaCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_zonaCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_zonaCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_zonaCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_zonaCobrarClientesPorRegionBusqueda= new JButtonMe();
		this.jButtonnombre_zonaCobrarClientesPorRegionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_zonaCobrarClientesPorRegionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_zonaCobrarClientesPorRegionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_zonaCobrarClientesPorRegionBusqueda.setText("U");
		this.jButtonnombre_zonaCobrarClientesPorRegionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_zonaCobrarClientesPorRegionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_zonaCobrarClientesPorRegionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_zonaCobrarClientesPorRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_zonaCobrarClientesPorRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_zonaCobrarClientesPorRegionBusqueda"));

		if(this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_zonaCobrarClientesPorRegionBusqueda.setVisible(false);		}


					
		this.jLabelnombre_rutaCobrarClientesPorRegion = new JLabelMe();
		this.jLabelnombre_rutaCobrarClientesPorRegion.setText(""+CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRERUTA+" : *");
		this.jLabelnombre_rutaCobrarClientesPorRegion.setToolTipText("Nombre Ruta");
		this.jLabelnombre_rutaCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_rutaCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_rutaCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_rutaCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_rutaCobrarClientesPorRegion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_rutaCobrarClientesPorRegion.setToolTipText(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRERUTA);
		this.gridaBagLayoutCobrarClientesPorRegion = new GridBagLayout();
		this.jPanelnombre_rutaCobrarClientesPorRegion.setLayout(this.gridaBagLayoutCobrarClientesPorRegion);


		jTextAreanombre_rutaCobrarClientesPorRegion= new JTextAreaMe();
		jTextAreanombre_rutaCobrarClientesPorRegion.setEnabled(false);
		jTextAreanombre_rutaCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_rutaCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_rutaCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_rutaCobrarClientesPorRegion.setLineWrap(true);
		jTextAreanombre_rutaCobrarClientesPorRegion.setWrapStyleWord(true);
		jTextAreanombre_rutaCobrarClientesPorRegion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_rutaCobrarClientesPorRegion.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_rutaCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_rutaCobrarClientesPorRegion = new JScrollPane(jTextAreanombre_rutaCobrarClientesPorRegion);
		jscrollPanenombre_rutaCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_rutaCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_rutaCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_rutaCobrarClientesPorRegionBusqueda= new JButtonMe();
		this.jButtonnombre_rutaCobrarClientesPorRegionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_rutaCobrarClientesPorRegionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_rutaCobrarClientesPorRegionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_rutaCobrarClientesPorRegionBusqueda.setText("U");
		this.jButtonnombre_rutaCobrarClientesPorRegionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_rutaCobrarClientesPorRegionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_rutaCobrarClientesPorRegionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_rutaCobrarClientesPorRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_rutaCobrarClientesPorRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_rutaCobrarClientesPorRegionBusqueda"));

		if(this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_rutaCobrarClientesPorRegionBusqueda.setVisible(false);		}


					
		this.jLabelnombre_vendedorCobrarClientesPorRegion = new JLabelMe();
		this.jLabelnombre_vendedorCobrarClientesPorRegion.setText(""+CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREVENDEDOR+" : *");
		this.jLabelnombre_vendedorCobrarClientesPorRegion.setToolTipText("Nombre Vendedor");
		this.jLabelnombre_vendedorCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_vendedorCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_vendedorCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_vendedorCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_vendedorCobrarClientesPorRegion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_vendedorCobrarClientesPorRegion.setToolTipText(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREVENDEDOR);
		this.gridaBagLayoutCobrarClientesPorRegion = new GridBagLayout();
		this.jPanelnombre_vendedorCobrarClientesPorRegion.setLayout(this.gridaBagLayoutCobrarClientesPorRegion);


		jTextAreanombre_vendedorCobrarClientesPorRegion= new JTextAreaMe();
		jTextAreanombre_vendedorCobrarClientesPorRegion.setEnabled(false);
		jTextAreanombre_vendedorCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_vendedorCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_vendedorCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_vendedorCobrarClientesPorRegion.setLineWrap(true);
		jTextAreanombre_vendedorCobrarClientesPorRegion.setWrapStyleWord(true);
		jTextAreanombre_vendedorCobrarClientesPorRegion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_vendedorCobrarClientesPorRegion.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_vendedorCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_vendedorCobrarClientesPorRegion = new JScrollPane(jTextAreanombre_vendedorCobrarClientesPorRegion);
		jscrollPanenombre_vendedorCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_vendedorCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_vendedorCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_vendedorCobrarClientesPorRegionBusqueda= new JButtonMe();
		this.jButtonnombre_vendedorCobrarClientesPorRegionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_vendedorCobrarClientesPorRegionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_vendedorCobrarClientesPorRegionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_vendedorCobrarClientesPorRegionBusqueda.setText("U");
		this.jButtonnombre_vendedorCobrarClientesPorRegionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_vendedorCobrarClientesPorRegionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_vendedorCobrarClientesPorRegionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_vendedorCobrarClientesPorRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_vendedorCobrarClientesPorRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_vendedorCobrarClientesPorRegionBusqueda"));

		if(this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_vendedorCobrarClientesPorRegionBusqueda.setVisible(false);		}


					
		this.jLabelcodigoCobrarClientesPorRegion = new JLabelMe();
		this.jLabelcodigoCobrarClientesPorRegion.setText(""+CobrarClientesPorRegionConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoCobrarClientesPorRegion.setToolTipText("Codigo");
		this.jLabelcodigoCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoCobrarClientesPorRegion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoCobrarClientesPorRegion.setToolTipText(CobrarClientesPorRegionConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutCobrarClientesPorRegion = new GridBagLayout();
		this.jPanelcodigoCobrarClientesPorRegion.setLayout(this.gridaBagLayoutCobrarClientesPorRegion);


		jTextFieldcodigoCobrarClientesPorRegion= new JTextFieldMe();

		jTextFieldcodigoCobrarClientesPorRegion.setEnabled(false);
		jTextFieldcodigoCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoCobrarClientesPorRegionBusqueda= new JButtonMe();
		this.jButtoncodigoCobrarClientesPorRegionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCobrarClientesPorRegionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCobrarClientesPorRegionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoCobrarClientesPorRegionBusqueda.setText("U");
		this.jButtoncodigoCobrarClientesPorRegionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoCobrarClientesPorRegionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoCobrarClientesPorRegionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoCobrarClientesPorRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoCobrarClientesPorRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoCobrarClientesPorRegionBusqueda"));

		if(this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoCobrarClientesPorRegionBusqueda.setVisible(false);		}


					
		this.jLabelnombreCobrarClientesPorRegion = new JLabelMe();
		this.jLabelnombreCobrarClientesPorRegion.setText(""+CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreCobrarClientesPorRegion.setToolTipText("Nombre");
		this.jLabelnombreCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreCobrarClientesPorRegion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreCobrarClientesPorRegion.setToolTipText(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutCobrarClientesPorRegion = new GridBagLayout();
		this.jPanelnombreCobrarClientesPorRegion.setLayout(this.gridaBagLayoutCobrarClientesPorRegion);


		jTextAreanombreCobrarClientesPorRegion= new JTextAreaMe();
		jTextAreanombreCobrarClientesPorRegion.setEnabled(false);
		jTextAreanombreCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCobrarClientesPorRegion.setLineWrap(true);
		jTextAreanombreCobrarClientesPorRegion.setWrapStyleWord(true);
		jTextAreanombreCobrarClientesPorRegion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreCobrarClientesPorRegion.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreCobrarClientesPorRegion = new JScrollPane(jTextAreanombreCobrarClientesPorRegion);
		jscrollPanenombreCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreCobrarClientesPorRegionBusqueda= new JButtonMe();
		this.jButtonnombreCobrarClientesPorRegionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCobrarClientesPorRegionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCobrarClientesPorRegionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreCobrarClientesPorRegionBusqueda.setText("U");
		this.jButtonnombreCobrarClientesPorRegionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreCobrarClientesPorRegionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreCobrarClientesPorRegionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreCobrarClientesPorRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreCobrarClientesPorRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreCobrarClientesPorRegionBusqueda"));

		if(this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreCobrarClientesPorRegionBusqueda.setVisible(false);		}


					
		this.jLabelapellidoCobrarClientesPorRegion = new JLabelMe();
		this.jLabelapellidoCobrarClientesPorRegion.setText(""+CobrarClientesPorRegionConstantesFunciones.LABEL_APELLIDO+" : *");
		this.jLabelapellidoCobrarClientesPorRegion.setToolTipText("Apello");
		this.jLabelapellidoCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelapellidoCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelapellidoCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelapellidoCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelapellidoCobrarClientesPorRegion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelapellidoCobrarClientesPorRegion.setToolTipText(CobrarClientesPorRegionConstantesFunciones.LABEL_APELLIDO);
		this.gridaBagLayoutCobrarClientesPorRegion = new GridBagLayout();
		this.jPanelapellidoCobrarClientesPorRegion.setLayout(this.gridaBagLayoutCobrarClientesPorRegion);


		jTextAreaapellidoCobrarClientesPorRegion= new JTextAreaMe();
		jTextAreaapellidoCobrarClientesPorRegion.setEnabled(false);
		jTextAreaapellidoCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoCobrarClientesPorRegion.setLineWrap(true);
		jTextAreaapellidoCobrarClientesPorRegion.setWrapStyleWord(true);
		jTextAreaapellidoCobrarClientesPorRegion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaapellidoCobrarClientesPorRegion.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaapellidoCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneapellidoCobrarClientesPorRegion = new JScrollPane(jTextAreaapellidoCobrarClientesPorRegion);
		jscrollPaneapellidoCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidoCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidoCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonapellidoCobrarClientesPorRegionBusqueda= new JButtonMe();
		this.jButtonapellidoCobrarClientesPorRegionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidoCobrarClientesPorRegionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidoCobrarClientesPorRegionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonapellidoCobrarClientesPorRegionBusqueda.setText("U");
		this.jButtonapellidoCobrarClientesPorRegionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonapellidoCobrarClientesPorRegionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonapellidoCobrarClientesPorRegionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaapellidoCobrarClientesPorRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaapellidoCobrarClientesPorRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"apellidoCobrarClientesPorRegionBusqueda"));

		if(this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonapellidoCobrarClientesPorRegionBusqueda.setVisible(false);		}


					
		this.jLabeldireccion_direccionCobrarClientesPorRegion = new JLabelMe();
		this.jLabeldireccion_direccionCobrarClientesPorRegion.setText(""+CobrarClientesPorRegionConstantesFunciones.LABEL_DIRECCIONDIRECCION+" : *");
		this.jLabeldireccion_direccionCobrarClientesPorRegion.setToolTipText("Direccion Direccion");
		this.jLabeldireccion_direccionCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldireccion_direccionCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldireccion_direccionCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccion_direccionCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccion_direccionCobrarClientesPorRegion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccion_direccionCobrarClientesPorRegion.setToolTipText(CobrarClientesPorRegionConstantesFunciones.LABEL_DIRECCIONDIRECCION);
		this.gridaBagLayoutCobrarClientesPorRegion = new GridBagLayout();
		this.jPaneldireccion_direccionCobrarClientesPorRegion.setLayout(this.gridaBagLayoutCobrarClientesPorRegion);


		jTextAreadireccion_direccionCobrarClientesPorRegion= new JTextAreaMe();
		jTextAreadireccion_direccionCobrarClientesPorRegion.setEnabled(false);
		jTextAreadireccion_direccionCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_direccionCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_direccionCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_direccionCobrarClientesPorRegion.setLineWrap(true);
		jTextAreadireccion_direccionCobrarClientesPorRegion.setWrapStyleWord(true);
		jTextAreadireccion_direccionCobrarClientesPorRegion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccion_direccionCobrarClientesPorRegion.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadireccion_direccionCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccion_direccionCobrarClientesPorRegion = new JScrollPane(jTextAreadireccion_direccionCobrarClientesPorRegion);
		jscrollPanedireccion_direccionCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccion_direccionCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccion_direccionCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondireccion_direccionCobrarClientesPorRegionBusqueda= new JButtonMe();
		this.jButtondireccion_direccionCobrarClientesPorRegionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccion_direccionCobrarClientesPorRegionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccion_direccionCobrarClientesPorRegionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccion_direccionCobrarClientesPorRegionBusqueda.setText("U");
		this.jButtondireccion_direccionCobrarClientesPorRegionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccion_direccionCobrarClientesPorRegionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccion_direccionCobrarClientesPorRegionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccion_direccionCobrarClientesPorRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccion_direccionCobrarClientesPorRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccion_direccionCobrarClientesPorRegionBusqueda"));

		if(this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccion_direccionCobrarClientesPorRegionBusqueda.setVisible(false);		}


					
		this.jLabeltelefono_telefonoCobrarClientesPorRegion = new JLabelMe();
		this.jLabeltelefono_telefonoCobrarClientesPorRegion.setText(""+CobrarClientesPorRegionConstantesFunciones.LABEL_TELEFONOTELEFONO+" : *");
		this.jLabeltelefono_telefonoCobrarClientesPorRegion.setToolTipText("Telefono Telefono");
		this.jLabeltelefono_telefonoCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltelefono_telefonoCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltelefono_telefonoCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefono_telefonoCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefono_telefonoCobrarClientesPorRegion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefono_telefonoCobrarClientesPorRegion.setToolTipText(CobrarClientesPorRegionConstantesFunciones.LABEL_TELEFONOTELEFONO);
		this.gridaBagLayoutCobrarClientesPorRegion = new GridBagLayout();
		this.jPaneltelefono_telefonoCobrarClientesPorRegion.setLayout(this.gridaBagLayoutCobrarClientesPorRegion);


		jTextAreatelefono_telefonoCobrarClientesPorRegion= new JTextAreaMe();
		jTextAreatelefono_telefonoCobrarClientesPorRegion.setEnabled(false);
		jTextAreatelefono_telefonoCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_telefonoCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_telefonoCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_telefonoCobrarClientesPorRegion.setLineWrap(true);
		jTextAreatelefono_telefonoCobrarClientesPorRegion.setWrapStyleWord(true);
		jTextAreatelefono_telefonoCobrarClientesPorRegion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatelefono_telefonoCobrarClientesPorRegion.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreatelefono_telefonoCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetelefono_telefonoCobrarClientesPorRegion = new JScrollPane(jTextAreatelefono_telefonoCobrarClientesPorRegion);
		jscrollPanetelefono_telefonoCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetelefono_telefonoCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetelefono_telefonoCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtontelefono_telefonoCobrarClientesPorRegionBusqueda= new JButtonMe();
		this.jButtontelefono_telefonoCobrarClientesPorRegionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_telefonoCobrarClientesPorRegionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_telefonoCobrarClientesPorRegionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefono_telefonoCobrarClientesPorRegionBusqueda.setText("U");
		this.jButtontelefono_telefonoCobrarClientesPorRegionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefono_telefonoCobrarClientesPorRegionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefono_telefonoCobrarClientesPorRegionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatelefono_telefonoCobrarClientesPorRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatelefono_telefonoCobrarClientesPorRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefono_telefonoCobrarClientesPorRegionBusqueda"));

		if(this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefono_telefonoCobrarClientesPorRegionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCobrarClientesPorRegion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCobrarClientesPorRegion = new JLabelMe();
		this.jLabelid_empresaCobrarClientesPorRegion.setText(""+CobrarClientesPorRegionConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCobrarClientesPorRegion.setToolTipText("Empresa");
		this.jLabelid_empresaCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCobrarClientesPorRegion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCobrarClientesPorRegion.setToolTipText(CobrarClientesPorRegionConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCobrarClientesPorRegion = new GridBagLayout();
		this.jPanelid_empresaCobrarClientesPorRegion.setLayout(this.gridaBagLayoutCobrarClientesPorRegion);


		jComboBoxid_empresaCobrarClientesPorRegion= new JComboBoxMe();
		jComboBoxid_empresaCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCobrarClientesPorRegion.setEnabled(false);

		this.jButtonid_empresaCobrarClientesPorRegion= new JButtonMe();
		this.jButtonid_empresaCobrarClientesPorRegion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarClientesPorRegion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarClientesPorRegion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarClientesPorRegion.setText("Buscar");
		this.jButtonid_empresaCobrarClientesPorRegion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCobrarClientesPorRegion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarClientesPorRegion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCobrarClientesPorRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarClientesPorRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarClientesPorRegion"));

		this.jButtonid_empresaCobrarClientesPorRegionBusqueda= new JButtonMe();
		this.jButtonid_empresaCobrarClientesPorRegionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarClientesPorRegionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarClientesPorRegionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCobrarClientesPorRegionBusqueda.setText("U");
		this.jButtonid_empresaCobrarClientesPorRegionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCobrarClientesPorRegionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarClientesPorRegionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCobrarClientesPorRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarClientesPorRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarClientesPorRegionBusqueda"));

		if(this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCobrarClientesPorRegionBusqueda.setVisible(false);		}

		this.jButtonid_empresaCobrarClientesPorRegionUpdate= new JButtonMe();
		this.jButtonid_empresaCobrarClientesPorRegionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarClientesPorRegionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarClientesPorRegionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCobrarClientesPorRegionUpdate.setText("U");
		this.jButtonid_empresaCobrarClientesPorRegionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCobrarClientesPorRegionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarClientesPorRegionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCobrarClientesPorRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarClientesPorRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarClientesPorRegionUpdate"));



					
		this.jLabelid_sucursalCobrarClientesPorRegion = new JLabelMe();
		this.jLabelid_sucursalCobrarClientesPorRegion.setText(""+CobrarClientesPorRegionConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalCobrarClientesPorRegion.setToolTipText("Sucursal");
		this.jLabelid_sucursalCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalCobrarClientesPorRegion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalCobrarClientesPorRegion.setToolTipText(CobrarClientesPorRegionConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutCobrarClientesPorRegion = new GridBagLayout();
		this.jPanelid_sucursalCobrarClientesPorRegion.setLayout(this.gridaBagLayoutCobrarClientesPorRegion);


		jComboBoxid_sucursalCobrarClientesPorRegion= new JComboBoxMe();
		jComboBoxid_sucursalCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalCobrarClientesPorRegion.setEnabled(false);

		this.jButtonid_sucursalCobrarClientesPorRegion= new JButtonMe();
		this.jButtonid_sucursalCobrarClientesPorRegion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCobrarClientesPorRegion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCobrarClientesPorRegion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCobrarClientesPorRegion.setText("Buscar");
		this.jButtonid_sucursalCobrarClientesPorRegion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalCobrarClientesPorRegion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCobrarClientesPorRegion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalCobrarClientesPorRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCobrarClientesPorRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCobrarClientesPorRegion"));

		this.jButtonid_sucursalCobrarClientesPorRegionBusqueda= new JButtonMe();
		this.jButtonid_sucursalCobrarClientesPorRegionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCobrarClientesPorRegionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCobrarClientesPorRegionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCobrarClientesPorRegionBusqueda.setText("U");
		this.jButtonid_sucursalCobrarClientesPorRegionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalCobrarClientesPorRegionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCobrarClientesPorRegionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalCobrarClientesPorRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCobrarClientesPorRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCobrarClientesPorRegionBusqueda"));

		if(this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalCobrarClientesPorRegionBusqueda.setVisible(false);		}

		this.jButtonid_sucursalCobrarClientesPorRegionUpdate= new JButtonMe();
		this.jButtonid_sucursalCobrarClientesPorRegionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCobrarClientesPorRegionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCobrarClientesPorRegionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCobrarClientesPorRegionUpdate.setText("U");
		this.jButtonid_sucursalCobrarClientesPorRegionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalCobrarClientesPorRegionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCobrarClientesPorRegionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalCobrarClientesPorRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCobrarClientesPorRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCobrarClientesPorRegionUpdate"));



					
		this.jLabelid_paisCobrarClientesPorRegion = new JLabelMe();
		this.jLabelid_paisCobrarClientesPorRegion.setText(""+CobrarClientesPorRegionConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisCobrarClientesPorRegion.setToolTipText("Pais");
		this.jLabelid_paisCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisCobrarClientesPorRegion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisCobrarClientesPorRegion.setToolTipText(CobrarClientesPorRegionConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutCobrarClientesPorRegion = new GridBagLayout();
		this.jPanelid_paisCobrarClientesPorRegion.setLayout(this.gridaBagLayoutCobrarClientesPorRegion);


		jComboBoxid_paisCobrarClientesPorRegion= new JComboBoxMe();
		jComboBoxid_paisCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisCobrarClientesPorRegion= new JButtonMe();
		this.jButtonid_paisCobrarClientesPorRegion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisCobrarClientesPorRegion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisCobrarClientesPorRegion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisCobrarClientesPorRegion.setText("Buscar");
		this.jButtonid_paisCobrarClientesPorRegion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisCobrarClientesPorRegion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisCobrarClientesPorRegion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisCobrarClientesPorRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisCobrarClientesPorRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisCobrarClientesPorRegion"));

		this.jButtonid_paisCobrarClientesPorRegionBusqueda= new JButtonMe();
		this.jButtonid_paisCobrarClientesPorRegionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisCobrarClientesPorRegionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisCobrarClientesPorRegionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisCobrarClientesPorRegionBusqueda.setText("U");
		this.jButtonid_paisCobrarClientesPorRegionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisCobrarClientesPorRegionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisCobrarClientesPorRegionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisCobrarClientesPorRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisCobrarClientesPorRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisCobrarClientesPorRegionBusqueda"));

		if(this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisCobrarClientesPorRegionBusqueda.setVisible(false);		}

		this.jButtonid_paisCobrarClientesPorRegionUpdate= new JButtonMe();
		this.jButtonid_paisCobrarClientesPorRegionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisCobrarClientesPorRegionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisCobrarClientesPorRegionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisCobrarClientesPorRegionUpdate.setText("U");
		this.jButtonid_paisCobrarClientesPorRegionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisCobrarClientesPorRegionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisCobrarClientesPorRegionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisCobrarClientesPorRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisCobrarClientesPorRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisCobrarClientesPorRegionUpdate"));



					
		this.jLabelid_regionCobrarClientesPorRegion = new JLabelMe();
		this.jLabelid_regionCobrarClientesPorRegion.setText(""+CobrarClientesPorRegionConstantesFunciones.LABEL_IDREGION+" : *");
		this.jLabelid_regionCobrarClientesPorRegion.setToolTipText("Region");
		this.jLabelid_regionCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_regionCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_regionCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_regionCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_regionCobrarClientesPorRegion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_regionCobrarClientesPorRegion.setToolTipText(CobrarClientesPorRegionConstantesFunciones.LABEL_IDREGION);
		this.gridaBagLayoutCobrarClientesPorRegion = new GridBagLayout();
		this.jPanelid_regionCobrarClientesPorRegion.setLayout(this.gridaBagLayoutCobrarClientesPorRegion);


		jComboBoxid_regionCobrarClientesPorRegion= new JComboBoxMe();
		jComboBoxid_regionCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_regionCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_regionCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_regionCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_regionCobrarClientesPorRegion= new JButtonMe();
		this.jButtonid_regionCobrarClientesPorRegion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_regionCobrarClientesPorRegion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_regionCobrarClientesPorRegion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_regionCobrarClientesPorRegion.setText("Buscar");
		this.jButtonid_regionCobrarClientesPorRegion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_regionCobrarClientesPorRegion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_regionCobrarClientesPorRegion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_regionCobrarClientesPorRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_regionCobrarClientesPorRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_regionCobrarClientesPorRegion"));

		this.jButtonid_regionCobrarClientesPorRegionBusqueda= new JButtonMe();
		this.jButtonid_regionCobrarClientesPorRegionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_regionCobrarClientesPorRegionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_regionCobrarClientesPorRegionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_regionCobrarClientesPorRegionBusqueda.setText("U");
		this.jButtonid_regionCobrarClientesPorRegionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_regionCobrarClientesPorRegionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_regionCobrarClientesPorRegionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_regionCobrarClientesPorRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_regionCobrarClientesPorRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_regionCobrarClientesPorRegionBusqueda"));

		if(this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_regionCobrarClientesPorRegionBusqueda.setVisible(false);		}

		this.jButtonid_regionCobrarClientesPorRegionUpdate= new JButtonMe();
		this.jButtonid_regionCobrarClientesPorRegionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_regionCobrarClientesPorRegionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_regionCobrarClientesPorRegionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_regionCobrarClientesPorRegionUpdate.setText("U");
		this.jButtonid_regionCobrarClientesPorRegionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_regionCobrarClientesPorRegionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_regionCobrarClientesPorRegionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_regionCobrarClientesPorRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_regionCobrarClientesPorRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_regionCobrarClientesPorRegionUpdate"));



					
		this.jLabelid_provinciaCobrarClientesPorRegion = new JLabelMe();
		this.jLabelid_provinciaCobrarClientesPorRegion.setText(""+CobrarClientesPorRegionConstantesFunciones.LABEL_IDPROVINCIA+" : *");
		this.jLabelid_provinciaCobrarClientesPorRegion.setToolTipText("Provincia");
		this.jLabelid_provinciaCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_provinciaCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_provinciaCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_provinciaCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_provinciaCobrarClientesPorRegion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_provinciaCobrarClientesPorRegion.setToolTipText(CobrarClientesPorRegionConstantesFunciones.LABEL_IDPROVINCIA);
		this.gridaBagLayoutCobrarClientesPorRegion = new GridBagLayout();
		this.jPanelid_provinciaCobrarClientesPorRegion.setLayout(this.gridaBagLayoutCobrarClientesPorRegion);


		jComboBoxid_provinciaCobrarClientesPorRegion= new JComboBoxMe();
		jComboBoxid_provinciaCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_provinciaCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_provinciaCobrarClientesPorRegion= new JButtonMe();
		this.jButtonid_provinciaCobrarClientesPorRegion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_provinciaCobrarClientesPorRegion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_provinciaCobrarClientesPorRegion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_provinciaCobrarClientesPorRegion.setText("Buscar");
		this.jButtonid_provinciaCobrarClientesPorRegion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_provinciaCobrarClientesPorRegion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_provinciaCobrarClientesPorRegion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_provinciaCobrarClientesPorRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_provinciaCobrarClientesPorRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provinciaCobrarClientesPorRegion"));

		this.jButtonid_provinciaCobrarClientesPorRegionBusqueda= new JButtonMe();
		this.jButtonid_provinciaCobrarClientesPorRegionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaCobrarClientesPorRegionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaCobrarClientesPorRegionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_provinciaCobrarClientesPorRegionBusqueda.setText("U");
		this.jButtonid_provinciaCobrarClientesPorRegionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_provinciaCobrarClientesPorRegionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_provinciaCobrarClientesPorRegionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_provinciaCobrarClientesPorRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_provinciaCobrarClientesPorRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provinciaCobrarClientesPorRegionBusqueda"));

		if(this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_provinciaCobrarClientesPorRegionBusqueda.setVisible(false);		}

		this.jButtonid_provinciaCobrarClientesPorRegionUpdate= new JButtonMe();
		this.jButtonid_provinciaCobrarClientesPorRegionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaCobrarClientesPorRegionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaCobrarClientesPorRegionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_provinciaCobrarClientesPorRegionUpdate.setText("U");
		this.jButtonid_provinciaCobrarClientesPorRegionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_provinciaCobrarClientesPorRegionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_provinciaCobrarClientesPorRegionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_provinciaCobrarClientesPorRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_provinciaCobrarClientesPorRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provinciaCobrarClientesPorRegionUpdate"));



					
		this.jLabelid_ciudadCobrarClientesPorRegion = new JLabelMe();
		this.jLabelid_ciudadCobrarClientesPorRegion.setText(""+CobrarClientesPorRegionConstantesFunciones.LABEL_IDCIUDAD+" : *");
		this.jLabelid_ciudadCobrarClientesPorRegion.setToolTipText("Ciudad");
		this.jLabelid_ciudadCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ciudadCobrarClientesPorRegion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ciudadCobrarClientesPorRegion.setToolTipText(CobrarClientesPorRegionConstantesFunciones.LABEL_IDCIUDAD);
		this.gridaBagLayoutCobrarClientesPorRegion = new GridBagLayout();
		this.jPanelid_ciudadCobrarClientesPorRegion.setLayout(this.gridaBagLayoutCobrarClientesPorRegion);


		jComboBoxid_ciudadCobrarClientesPorRegion= new JComboBoxMe();
		jComboBoxid_ciudadCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ciudadCobrarClientesPorRegion= new JButtonMe();
		this.jButtonid_ciudadCobrarClientesPorRegion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadCobrarClientesPorRegion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadCobrarClientesPorRegion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadCobrarClientesPorRegion.setText("Buscar");
		this.jButtonid_ciudadCobrarClientesPorRegion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ciudadCobrarClientesPorRegion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadCobrarClientesPorRegion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ciudadCobrarClientesPorRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadCobrarClientesPorRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadCobrarClientesPorRegion"));

		this.jButtonid_ciudadCobrarClientesPorRegionBusqueda= new JButtonMe();
		this.jButtonid_ciudadCobrarClientesPorRegionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadCobrarClientesPorRegionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadCobrarClientesPorRegionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadCobrarClientesPorRegionBusqueda.setText("U");
		this.jButtonid_ciudadCobrarClientesPorRegionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ciudadCobrarClientesPorRegionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadCobrarClientesPorRegionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ciudadCobrarClientesPorRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadCobrarClientesPorRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadCobrarClientesPorRegionBusqueda"));

		if(this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ciudadCobrarClientesPorRegionBusqueda.setVisible(false);		}

		this.jButtonid_ciudadCobrarClientesPorRegionUpdate= new JButtonMe();
		this.jButtonid_ciudadCobrarClientesPorRegionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadCobrarClientesPorRegionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadCobrarClientesPorRegionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadCobrarClientesPorRegionUpdate.setText("U");
		this.jButtonid_ciudadCobrarClientesPorRegionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ciudadCobrarClientesPorRegionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadCobrarClientesPorRegionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ciudadCobrarClientesPorRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadCobrarClientesPorRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadCobrarClientesPorRegionUpdate"));



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
		//this.jInternalFrameDetalleCobrarClientesPorRegion = new CobrarClientesPorRegionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cobrar Clientes Por Region DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCobrarClientesPorRegion= new GridBagLayout();
		

		
		String sToolTipCobrarClientesPorRegion="";
		sToolTipCobrarClientesPorRegion=CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCobrarClientesPorRegion+="(Cartera.CobrarClientesPorRegion)";
		}
		
		if(!this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()) {
			sToolTipCobrarClientesPorRegion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCobrarClientesPorRegion = new JButtonMe();
		this.jButtonModificarCobrarClientesPorRegion = new JButtonMe();
        this.jButtonActualizarCobrarClientesPorRegion = new JButtonMe();
        this.jButtonEliminarCobrarClientesPorRegion = new JButtonMe();
        this.jButtonCancelarCobrarClientesPorRegion = new JButtonMe();
        this.jButtonGuardarCambiosCobrarClientesPorRegion = new JButtonMe();
		this.jButtonGuardarCambiosTablaCobrarClientesPorRegion = new JButtonMe();
		this.jButtonCerrarCobrarClientesPorRegion = new JButtonMe();
		
		this.jScrollPanelDatosCobrarClientesPorRegion = new JScrollPane();   
        this.jScrollPanelDatosEdicionCobrarClientesPorRegion = new JScrollPane();
		this.jScrollPanelDatosGeneralCobrarClientesPorRegion = new JScrollPane();
				
		
		
		this.jPanelCamposCobrarClientesPorRegion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCobrarClientesPorRegion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCobrarClientesPorRegion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCobrarClientesPorRegion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cobrar Clientes Por Region";
		
		if(!this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCobrarClientesPorRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Clientes Por Regiones" + this.sPath));
		} else {
			this.jScrollPanelDatosCobrarClientesPorRegion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCobrarClientesPorRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCobrarClientesPorRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCobrarClientesPorRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCobrarClientesPorRegion.setName("jPanelCamposCobrarClientesPorRegion"); 

		this.jPanelCamposOcultosCobrarClientesPorRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCobrarClientesPorRegion.setName("jPanelCamposOcultosCobrarClientesPorRegion"); 

        this.jPanelAccionesCobrarClientesPorRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCobrarClientesPorRegion.setToolTipText("Acciones");
        this.jPanelAccionesCobrarClientesPorRegion.setName("Acciones"); 

		this.jPanelAccionesFormularioCobrarClientesPorRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCobrarClientesPorRegion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCobrarClientesPorRegion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCobrarClientesPorRegion.setText("Nuevo");
		this.jButtonModificarCobrarClientesPorRegion.setText("Editar");
        this.jButtonActualizarCobrarClientesPorRegion.setText("Actualizar");
        this.jButtonEliminarCobrarClientesPorRegion.setText("Eliminar");
        this.jButtonCancelarCobrarClientesPorRegion.setText("Cancelar");
        this.jButtonGuardarCambiosCobrarClientesPorRegion.setText("Guardar");
		this.jButtonGuardarCambiosTablaCobrarClientesPorRegion.setText("Guardar");
		this.jButtonCerrarCobrarClientesPorRegion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCobrarClientesPorRegion,"nuevo_button","Nuevo",this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCobrarClientesPorRegion,"modificar_button","Editar",this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCobrarClientesPorRegion,"actualizar_button","Actualizar",this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCobrarClientesPorRegion,"eliminar_button","Eliminar",this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCobrarClientesPorRegion,"cancelar_button","Cancelar",this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCobrarClientesPorRegion,"guardarcambios_button","Guardar",this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCobrarClientesPorRegion,"guardarcambiostabla_button","Guardar",this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCobrarClientesPorRegion,"cerrar_button","Salir",this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCobrarClientesPorRegion.setToolTipText("Nuevo"+" "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCobrarClientesPorRegion.setToolTipText("Editar"+" "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCobrarClientesPorRegion.setToolTipText("Actualizar"+" "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCobrarClientesPorRegion.setToolTipText("Eliminar)"+" "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCobrarClientesPorRegion.setToolTipText("Cancelar"+" "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCobrarClientesPorRegion.setToolTipText("Guardar"+" "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCobrarClientesPorRegion.setToolTipText("Guardar"+" "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCobrarClientesPorRegion.setToolTipText("Salir"+" "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCobrarClientesPorRegion";
		inputMap = this.jButtonNuevoCobrarClientesPorRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCobrarClientesPorRegion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCobrarClientesPorRegion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCobrarClientesPorRegion";
		inputMap = this.jButtonActualizarCobrarClientesPorRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCobrarClientesPorRegion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCobrarClientesPorRegion"));
		
		//ELIMINAR
		sMapKey = "EliminarCobrarClientesPorRegion";
		inputMap = this.jButtonEliminarCobrarClientesPorRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCobrarClientesPorRegion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCobrarClientesPorRegion"));
		
		//CANCELAR	
		sMapKey = "CancelarCobrarClientesPorRegion";
		inputMap = this.jButtonCancelarCobrarClientesPorRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCobrarClientesPorRegion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCobrarClientesPorRegion"));
		
		//CERRAR		
		sMapKey = "CerrarCobrarClientesPorRegion";
		inputMap = this.jButtonCerrarCobrarClientesPorRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCobrarClientesPorRegion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCobrarClientesPorRegion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCobrarClientesPorRegion";
		inputMap = this.jButtonGuardarCambiosTablaCobrarClientesPorRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCobrarClientesPorRegion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCobrarClientesPorRegion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCobrarClientesPorRegion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCobrarClientesPorRegion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCobrarClientesPorRegion.setToolTipText("Nuevo CobrarClientesPorRegion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCobrarClientesPorRegion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCobrarClientesPorRegion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCobrarClientesPorRegion.setToolTipText("Sin Cerrar Ventana CobrarClientesPorRegion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCobrarClientesPorRegion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCobrarClientesPorRegion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCobrarClientesPorRegion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCobrarClientesPorRegion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCobrarClientesPorRegion.setText("Accion");
		this.jComboBoxTiposAccionesCobrarClientesPorRegion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCobrarClientesPorRegion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCobrarClientesPorRegion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCobrarClientesPorRegion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCobrarClientesPorRegion = new JLabelMe();
		
		this.jLabelAccionesCobrarClientesPorRegion.setText("Acciones");		
		this.jLabelAccionesCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCobrarClientesPorRegion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCobrarClientesPorRegion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCobrarClientesPorRegion=new JTabbedPane();
		this.jTabbedPaneRelacionesCobrarClientesPorRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCobrarClientesPorRegion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarClientesPorRegion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarClientesPorRegion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCobrarClientesPorRegion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCobrarClientesPorRegion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCobrarClientesPorRegion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCobrarClientesPorRegion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCobrarClientesPorRegion = new GridBagLayout();
		
		this.jPanelCamposCobrarClientesPorRegion.setLayout(gridaBagLayoutCamposCobrarClientesPorRegion);
		this.jPanelCamposOcultosCobrarClientesPorRegion.setLayout(gridaBagLayoutCamposOcultosCobrarClientesPorRegion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCobrarClientesPorRegion.add(jLabelIdCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);



	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = 1;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCobrarClientesPorRegion.add(jLabelidCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);


	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCobrarClientesPorRegion.add(jLabelid_empresaCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = 2;
		this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCobrarClientesPorRegion.add(jButtonid_empresaCobrarClientesPorRegionBusqueda, this.gridBagConstraintsCobrarClientesPorRegion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = 3;
		this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCobrarClientesPorRegion.add(jButtonid_empresaCobrarClientesPorRegionUpdate, this.gridBagConstraintsCobrarClientesPorRegion);
	}

	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = 1;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCobrarClientesPorRegion.add(jComboBoxid_empresaCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);


	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalCobrarClientesPorRegion.add(jLabelid_sucursalCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = 2;
		this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCobrarClientesPorRegion.add(jButtonid_sucursalCobrarClientesPorRegionBusqueda, this.gridBagConstraintsCobrarClientesPorRegion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = 3;
		this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCobrarClientesPorRegion.add(jButtonid_sucursalCobrarClientesPorRegionUpdate, this.gridBagConstraintsCobrarClientesPorRegion);
	}

	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = 1;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalCobrarClientesPorRegion.add(jComboBoxid_sucursalCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);


	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisCobrarClientesPorRegion.add(jLabelid_paisCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = 2;
		this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisCobrarClientesPorRegion.add(jButtonid_paisCobrarClientesPorRegionBusqueda, this.gridBagConstraintsCobrarClientesPorRegion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = 3;
		this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisCobrarClientesPorRegion.add(jButtonid_paisCobrarClientesPorRegionUpdate, this.gridBagConstraintsCobrarClientesPorRegion);
	}

	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = 1;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisCobrarClientesPorRegion.add(jComboBoxid_paisCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);


	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_regionCobrarClientesPorRegion.add(jLabelid_regionCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = 2;
		this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_regionCobrarClientesPorRegion.add(jButtonid_regionCobrarClientesPorRegionBusqueda, this.gridBagConstraintsCobrarClientesPorRegion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = 3;
		this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_regionCobrarClientesPorRegion.add(jButtonid_regionCobrarClientesPorRegionUpdate, this.gridBagConstraintsCobrarClientesPorRegion);
	}

	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = 1;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_regionCobrarClientesPorRegion.add(jComboBoxid_regionCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);


	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_provinciaCobrarClientesPorRegion.add(jLabelid_provinciaCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = 2;
		this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_provinciaCobrarClientesPorRegion.add(jButtonid_provinciaCobrarClientesPorRegionBusqueda, this.gridBagConstraintsCobrarClientesPorRegion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = 3;
		this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_provinciaCobrarClientesPorRegion.add(jButtonid_provinciaCobrarClientesPorRegionUpdate, this.gridBagConstraintsCobrarClientesPorRegion);
	}

	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = 1;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_provinciaCobrarClientesPorRegion.add(jComboBoxid_provinciaCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);


	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ciudadCobrarClientesPorRegion.add(jLabelid_ciudadCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = 2;
		this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadCobrarClientesPorRegion.add(jButtonid_ciudadCobrarClientesPorRegionBusqueda, this.gridBagConstraintsCobrarClientesPorRegion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = 3;
		this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadCobrarClientesPorRegion.add(jButtonid_ciudadCobrarClientesPorRegionUpdate, this.gridBagConstraintsCobrarClientesPorRegion);
	}

	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = 1;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ciudadCobrarClientesPorRegion.add(jComboBoxid_ciudadCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);


	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_regionCobrarClientesPorRegion.add(jLabelnombre_regionCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = 2;
		this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_regionCobrarClientesPorRegion.add(jButtonnombre_regionCobrarClientesPorRegionBusqueda, this.gridBagConstraintsCobrarClientesPorRegion);
	}

	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = 1;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_regionCobrarClientesPorRegion.add(jscrollPanenombre_regionCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);


	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_provinciaCobrarClientesPorRegion.add(jLabelnombre_provinciaCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = 2;
		this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_provinciaCobrarClientesPorRegion.add(jButtonnombre_provinciaCobrarClientesPorRegionBusqueda, this.gridBagConstraintsCobrarClientesPorRegion);
	}

	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = 1;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_provinciaCobrarClientesPorRegion.add(jscrollPanenombre_provinciaCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);


	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_ciudadCobrarClientesPorRegion.add(jLabelnombre_ciudadCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = 2;
		this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_ciudadCobrarClientesPorRegion.add(jButtonnombre_ciudadCobrarClientesPorRegionBusqueda, this.gridBagConstraintsCobrarClientesPorRegion);
	}

	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = 1;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_ciudadCobrarClientesPorRegion.add(jscrollPanenombre_ciudadCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);


	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_zonaCobrarClientesPorRegion.add(jLabelnombre_zonaCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = 2;
		this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_zonaCobrarClientesPorRegion.add(jButtonnombre_zonaCobrarClientesPorRegionBusqueda, this.gridBagConstraintsCobrarClientesPorRegion);
	}

	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = 1;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_zonaCobrarClientesPorRegion.add(jTextFieldnombre_zonaCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);


	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_rutaCobrarClientesPorRegion.add(jLabelnombre_rutaCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = 2;
		this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_rutaCobrarClientesPorRegion.add(jButtonnombre_rutaCobrarClientesPorRegionBusqueda, this.gridBagConstraintsCobrarClientesPorRegion);
	}

	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = 1;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_rutaCobrarClientesPorRegion.add(jscrollPanenombre_rutaCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);


	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_vendedorCobrarClientesPorRegion.add(jLabelnombre_vendedorCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = 2;
		this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_vendedorCobrarClientesPorRegion.add(jButtonnombre_vendedorCobrarClientesPorRegionBusqueda, this.gridBagConstraintsCobrarClientesPorRegion);
	}

	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = 1;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_vendedorCobrarClientesPorRegion.add(jscrollPanenombre_vendedorCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);


	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoCobrarClientesPorRegion.add(jLabelcodigoCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = 2;
		this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoCobrarClientesPorRegion.add(jButtoncodigoCobrarClientesPorRegionBusqueda, this.gridBagConstraintsCobrarClientesPorRegion);
	}

	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = 1;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoCobrarClientesPorRegion.add(jTextFieldcodigoCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);


	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreCobrarClientesPorRegion.add(jLabelnombreCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = 2;
		this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreCobrarClientesPorRegion.add(jButtonnombreCobrarClientesPorRegionBusqueda, this.gridBagConstraintsCobrarClientesPorRegion);
	}

	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = 1;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreCobrarClientesPorRegion.add(jscrollPanenombreCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);


	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelapellidoCobrarClientesPorRegion.add(jLabelapellidoCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = 2;
		this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(0, 0, 0, 0);
		this.jPanelapellidoCobrarClientesPorRegion.add(jButtonapellidoCobrarClientesPorRegionBusqueda, this.gridBagConstraintsCobrarClientesPorRegion);
	}

	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = 1;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelapellidoCobrarClientesPorRegion.add(jscrollPaneapellidoCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);


	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccion_direccionCobrarClientesPorRegion.add(jLabeldireccion_direccionCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = 2;
		this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccion_direccionCobrarClientesPorRegion.add(jButtondireccion_direccionCobrarClientesPorRegionBusqueda, this.gridBagConstraintsCobrarClientesPorRegion);
	}

	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = 1;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccion_direccionCobrarClientesPorRegion.add(jscrollPanedireccion_direccionCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);


	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefono_telefonoCobrarClientesPorRegion.add(jLabeltelefono_telefonoCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = 2;
		this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefono_telefonoCobrarClientesPorRegion.add(jButtontelefono_telefonoCobrarClientesPorRegionBusqueda, this.gridBagConstraintsCobrarClientesPorRegion);
	}

	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = 1;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefono_telefonoCobrarClientesPorRegion.add(jscrollPanetelefono_telefonoCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = iYPanelCamposCobrarClientesPorRegion;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = iXPanelCamposCobrarClientesPorRegion++;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesPorRegion.add(this.jPanelidCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);



	if(iXPanelCamposCobrarClientesPorRegion % 2==0) {
		iXPanelCamposCobrarClientesPorRegion=0;
		iYPanelCamposCobrarClientesPorRegion++;
	}
	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = iYPanelCamposCobrarClientesPorRegion;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = iXPanelCamposCobrarClientesPorRegion++;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesPorRegion.add(this.jPanelid_paisCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);



	if(iXPanelCamposCobrarClientesPorRegion % 2==0) {
		iXPanelCamposCobrarClientesPorRegion=0;
		iYPanelCamposCobrarClientesPorRegion++;
	}
	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = iYPanelCamposCobrarClientesPorRegion;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = iXPanelCamposCobrarClientesPorRegion++;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesPorRegion.add(this.jPanelid_regionCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);



	if(iXPanelCamposCobrarClientesPorRegion % 2==0) {
		iXPanelCamposCobrarClientesPorRegion=0;
		iYPanelCamposCobrarClientesPorRegion++;
	}
	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = iYPanelCamposCobrarClientesPorRegion;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = iXPanelCamposCobrarClientesPorRegion++;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesPorRegion.add(this.jPanelid_provinciaCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);



	if(iXPanelCamposCobrarClientesPorRegion % 2==0) {
		iXPanelCamposCobrarClientesPorRegion=0;
		iYPanelCamposCobrarClientesPorRegion++;
	}
	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = iYPanelCamposCobrarClientesPorRegion;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = iXPanelCamposCobrarClientesPorRegion++;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesPorRegion.add(this.jPanelid_ciudadCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);



	if(iXPanelCamposCobrarClientesPorRegion % 2==0) {
		iXPanelCamposCobrarClientesPorRegion=0;
		iYPanelCamposCobrarClientesPorRegion++;
	}
	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = iYPanelCamposCobrarClientesPorRegion;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = iXPanelCamposCobrarClientesPorRegion++;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesPorRegion.add(this.jPanelnombre_regionCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);



	if(iXPanelCamposCobrarClientesPorRegion % 2==0) {
		iXPanelCamposCobrarClientesPorRegion=0;
		iYPanelCamposCobrarClientesPorRegion++;
	}
	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = iYPanelCamposCobrarClientesPorRegion;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = iXPanelCamposCobrarClientesPorRegion++;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesPorRegion.add(this.jPanelnombre_provinciaCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);



	if(iXPanelCamposCobrarClientesPorRegion % 2==0) {
		iXPanelCamposCobrarClientesPorRegion=0;
		iYPanelCamposCobrarClientesPorRegion++;
	}
	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = iYPanelCamposCobrarClientesPorRegion;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = iXPanelCamposCobrarClientesPorRegion++;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesPorRegion.add(this.jPanelnombre_ciudadCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);



	if(iXPanelCamposCobrarClientesPorRegion % 2==0) {
		iXPanelCamposCobrarClientesPorRegion=0;
		iYPanelCamposCobrarClientesPorRegion++;
	}
	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = iYPanelCamposCobrarClientesPorRegion;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = iXPanelCamposCobrarClientesPorRegion++;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesPorRegion.add(this.jPanelnombre_zonaCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);



	if(iXPanelCamposCobrarClientesPorRegion % 2==0) {
		iXPanelCamposCobrarClientesPorRegion=0;
		iYPanelCamposCobrarClientesPorRegion++;
	}
	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = iYPanelCamposCobrarClientesPorRegion;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = iXPanelCamposCobrarClientesPorRegion++;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesPorRegion.add(this.jPanelnombre_rutaCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);



	if(iXPanelCamposCobrarClientesPorRegion % 2==0) {
		iXPanelCamposCobrarClientesPorRegion=0;
		iYPanelCamposCobrarClientesPorRegion++;
	}
	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = iYPanelCamposCobrarClientesPorRegion;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = iXPanelCamposCobrarClientesPorRegion++;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesPorRegion.add(this.jPanelnombre_vendedorCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);



	if(iXPanelCamposCobrarClientesPorRegion % 2==0) {
		iXPanelCamposCobrarClientesPorRegion=0;
		iYPanelCamposCobrarClientesPorRegion++;
	}
	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = iYPanelCamposCobrarClientesPorRegion;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = iXPanelCamposCobrarClientesPorRegion++;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesPorRegion.add(this.jPanelcodigoCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);



	if(iXPanelCamposCobrarClientesPorRegion % 2==0) {
		iXPanelCamposCobrarClientesPorRegion=0;
		iYPanelCamposCobrarClientesPorRegion++;
	}
	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = iYPanelCamposCobrarClientesPorRegion;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = iXPanelCamposCobrarClientesPorRegion++;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesPorRegion.add(this.jPanelnombreCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);



	if(iXPanelCamposCobrarClientesPorRegion % 2==0) {
		iXPanelCamposCobrarClientesPorRegion=0;
		iYPanelCamposCobrarClientesPorRegion++;
	}
	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = iYPanelCamposCobrarClientesPorRegion;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = iXPanelCamposCobrarClientesPorRegion++;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesPorRegion.add(this.jPanelapellidoCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);



	if(iXPanelCamposCobrarClientesPorRegion % 2==0) {
		iXPanelCamposCobrarClientesPorRegion=0;
		iYPanelCamposCobrarClientesPorRegion++;
	}
	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = iYPanelCamposCobrarClientesPorRegion;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = iXPanelCamposCobrarClientesPorRegion++;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesPorRegion.add(this.jPaneldireccion_direccionCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);



	if(iXPanelCamposCobrarClientesPorRegion % 2==0) {
		iXPanelCamposCobrarClientesPorRegion=0;
		iYPanelCamposCobrarClientesPorRegion++;
	}
	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = iYPanelCamposCobrarClientesPorRegion;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = iXPanelCamposCobrarClientesPorRegion++;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesPorRegion.add(this.jPaneltelefono_telefonoCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);



	if(iXPanelCamposCobrarClientesPorRegion % 2==0) {
		iXPanelCamposCobrarClientesPorRegion=0;
		iYPanelCamposCobrarClientesPorRegion++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = iYPanelCamposOcultosCobrarClientesPorRegion;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = iXPanelCamposOcultosCobrarClientesPorRegion++;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCobrarClientesPorRegion.add(this.jPanelid_empresaCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);



	if(iXPanelCamposOcultosCobrarClientesPorRegion % 2==0) {
		iXPanelCamposOcultosCobrarClientesPorRegion=0;
		iYPanelCamposOcultosCobrarClientesPorRegion++;
	}
	this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesPorRegion.gridy = iYPanelCamposOcultosCobrarClientesPorRegion;
	this.gridBagConstraintsCobrarClientesPorRegion.gridx = iXPanelCamposOcultosCobrarClientesPorRegion++;
	this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesPorRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCobrarClientesPorRegion.add(this.jPanelid_sucursalCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);



	if(iXPanelCamposOcultosCobrarClientesPorRegion % 2==0) {
		iXPanelCamposOcultosCobrarClientesPorRegion=0;
		iYPanelCamposOcultosCobrarClientesPorRegion++;
	}
		
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
			
		GridBagLayout gridaBagLayoutAccionesCobrarClientesPorRegion= new GridBagLayout();
		this.jPanelAccionesCobrarClientesPorRegion.setLayout(gridaBagLayoutAccionesCobrarClientesPorRegion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCobrarClientesPorRegion= new GridBagLayout();
		this.jPanelAccionesFormularioCobrarClientesPorRegion.setLayout(gridaBagLayoutAccionesFormularioCobrarClientesPorRegion);
		
		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCobrarClientesPorRegion.add(this.jComboBoxTiposAccionesFormularioCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = iPosXAccion++;
			
		this.jPanelAccionesCobrarClientesPorRegion.add(this.jButtonModificarCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);							

		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx =iPosXAccion++;
			
		this.jPanelAccionesCobrarClientesPorRegion.add(this.jButtonEliminarCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
		
			
		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;		
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = iPosXAccion++;
		
		this.jPanelAccionesCobrarClientesPorRegion.add(this.jButtonActualizarCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);


		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;		
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = iPosXAccion++;
		
		this.jPanelAccionesCobrarClientesPorRegion.add(this.jButtonGuardarCambiosCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);	
		
		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;		
		this.gridBagConstraintsCobrarClientesPorRegion.gridx =iPosXAccion++;
		
		this.jPanelAccionesCobrarClientesPorRegion.add(this.jButtonCancelarCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCobrarClientesPorRegion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCobrarClientesPorRegion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();						
			this.gridBagConstraintsCobrarClientesPorRegion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;		
			//this.gridBagConstraintsCobrarClientesPorRegion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesPorRegion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx =0;
		this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCobrarClientesPorRegion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CobrarClientesPorRegionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCobrarClientesPorRegion = new CobrarClientesPorRegionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cobrar Clientes Por Region DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cobrar Clientes Por Region DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cobrar Clientes Por Region Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CobrarClientesPorRegionModel cobrarclientesporregionModel=new CobrarClientesPorRegionModel(this);
			
			//SI USARA CLASE INTERNA
			//CobrarClientesPorRegionModel.CobrarClientesPorRegionFocusTraversalPolicy cobrarclientesporregionFocusTraversalPolicy = cobrarclientesporregionModel.new CobrarClientesPorRegionFocusTraversalPolicy(this);
			
			//cobrarclientesporregionFocusTraversalPolicy.setcobrarclientesporregionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cobrarclientesporregionModel);
			
			
			this.jContentPaneDetalleCobrarClientesPorRegion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCobrarClientesPorRegion = new GridBagLayout();	
			this.jContentPaneDetalleCobrarClientesPorRegion.setLayout(gridaBagLayoutDetalleCobrarClientesPorRegion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCobrarClientesPorRegion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
				this.gridBagConstraintsCobrarClientesPorRegion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
					
				
				this.jContentPaneDetalleCobrarClientesPorRegion.add(jTtoolBarDetalleCobrarClientesPorRegion, gridBagConstraintsCobrarClientesPorRegion);								
				
}
			
			this.jScrollPanelDatosEdicionCobrarClientesPorRegion=   new JScrollPane(jContentPaneDetalleCobrarClientesPorRegion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCobrarClientesPorRegion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarClientesPorRegion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarClientesPorRegion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCobrarClientesPorRegion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCobrarClientesPorRegion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarClientesPorRegion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarClientesPorRegion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCobrarClientesPorRegion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
	        
			this.jContentPaneDetalleCobrarClientesPorRegion.add(jPanelCamposCobrarClientesPorRegion, gridBagConstraintsCobrarClientesPorRegion);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
				
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						//&& cobrarclientesporregionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.cobrarclientesporregionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCobrarClientesPorRegion= new GridBagConstraints();
						this.gridBagConstraintsCobrarClientesPorRegion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
						this.jContentPaneDetalleCobrarClientesPorRegion.add(this.jTabbedPaneRelacionesCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCobrarClientesPorRegion.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCobrarClientesPorRegion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
					this.gridBagConstraintsCobrarClientesPorRegion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCobrarClientesPorRegion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
					
				
					this.jContentPaneDetalleCobrarClientesPorRegion.add(jPanelCamposOcultosCobrarClientesPorRegion, gridBagConstraintsCobrarClientesPorRegion);
				
					this.jPanelCamposOcultosCobrarClientesPorRegion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesPorRegion.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
	        this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCobrarClientesPorRegion.add(this.jPanelAccionesFormularioCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);							
			
			
			
			this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
	        this.gridBagConstraintsCobrarClientesPorRegion.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
	        
			
			this.jContentPaneDetalleCobrarClientesPorRegion.add(this.jPanelAccionesCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCobrarClientesPorRegion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCobrarClientesPorRegion=   new JScrollPane(this.jPanelCamposCobrarClientesPorRegion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCobrarClientesPorRegion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarClientesPorRegion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarClientesPorRegion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesPorRegion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
			this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCobrarClientesPorRegion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesPorRegion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);			
			
			this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesPorRegion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
			
			
		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
		
			
		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesPorRegion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesPorRegion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCobrarClientesPorRegion;//jContentPane;
		
		return jScrollPanelDatosEdicionCobrarClientesPorRegion;
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
