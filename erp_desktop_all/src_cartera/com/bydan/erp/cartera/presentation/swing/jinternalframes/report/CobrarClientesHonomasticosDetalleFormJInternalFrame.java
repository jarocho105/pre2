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
import com.bydan.erp.cartera.util.report.CobrarClientesHonomasticosConstantesFunciones;

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
public class CobrarClientesHonomasticosDetalleFormJInternalFrame extends CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCobrarClientesHonomasticos;
	
	protected JMenuBar jmenuBarDetalleCobrarClientesHonomasticos;
	
	protected JMenu jmenuDetalleCobrarClientesHonomasticos;
	protected JMenu jmenuDetalleArchivoCobrarClientesHonomasticos;
	protected JMenu jmenuDetalleAccionesCobrarClientesHonomasticos;
	protected JMenu jmenuDetalleDatosCobrarClientesHonomasticos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCobrarClientesHonomasticos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCobrarClientesHonomasticos;	
	protected GridBagConstraints gridBagConstraintsCobrarClientesHonomasticos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional jInternalFrameDetalleCobrarClientesHonomasticos;		
	
	
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
	
	public CobrarClientesHonomasticosSessionBean cobrarclienteshonomasticosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public PaisSessionBean paisSessionBean;
	public RegionSessionBean regionSessionBean;
	public ProvinciaSessionBean provinciaSessionBean;
	public CiudadSessionBean ciudadSessionBean;	
	
	public CobrarClientesHonomasticosLogic cobrarclienteshonomasticosLogic;
	
	public JScrollPane jScrollPanelDatosCobrarClientesHonomasticos;
	public JScrollPane jScrollPanelDatosEdicionCobrarClientesHonomasticos;
	public JScrollPane jScrollPanelDatosGeneralCobrarClientesHonomasticos;
	
	protected JPanel jPanelCamposCobrarClientesHonomasticos;    
	protected JPanel jPanelCamposOcultosCobrarClientesHonomasticos;    	
	protected JPanel jPanelAccionesCobrarClientesHonomasticos;
	protected JPanel jPanelAccionesFormularioCobrarClientesHonomasticos;
    
	
	
	protected Integer iXPanelCamposCobrarClientesHonomasticos=0;
	protected Integer iYPanelCamposCobrarClientesHonomasticos=0;
	
	protected Integer iXPanelCamposOcultosCobrarClientesHonomasticos=0;
	protected Integer iYPanelCamposOcultosCobrarClientesHonomasticos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCobrarClientesHonomasticos;
	public JButton jButtonModificarCobrarClientesHonomasticos;
	public JButton jButtonActualizarCobrarClientesHonomasticos;
    public JButton jButtonEliminarCobrarClientesHonomasticos;
	public JButton jButtonCancelarCobrarClientesHonomasticos;
    public JButton jButtonGuardarCambiosCobrarClientesHonomasticos;
	public JButton jButtonGuardarCambiosTablaCobrarClientesHonomasticos;
	protected JButton jButtonCerrarCobrarClientesHonomasticos;
	
	
	protected JButton jButtonProcesarInformacionCobrarClientesHonomasticos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCobrarClientesHonomasticos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCobrarClientesHonomasticos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCobrarClientesHonomasticos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCobrarClientesHonomasticos;
	protected JButton jButtonModificarToolBarCobrarClientesHonomasticos;
	protected JButton jButtonActualizarToolBarCobrarClientesHonomasticos;
    protected JButton jButtonEliminarToolBarCobrarClientesHonomasticos;
	protected JButton jButtonCancelarToolBarCobrarClientesHonomasticos;
    protected JButton jButtonGuardarCambiosToolBarCobrarClientesHonomasticos;
	protected JButton jButtonGuardarCambiosTablaToolBarCobrarClientesHonomasticos;
	protected JButton jButtonMostrarOcultarTablaToolBarCobrarClientesHonomasticos;
	protected JButton jButtonCerrarToolBarCobrarClientesHonomasticos;
	
	protected JButton jButtonProcesarInformacionToolBarCobrarClientesHonomasticos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCobrarClientesHonomasticos;
	protected JMenuItem jMenuItemModificarCobrarClientesHonomasticos;
	protected JMenuItem jMenuItemActualizarCobrarClientesHonomasticos;
    protected JMenuItem jMenuItemEliminarCobrarClientesHonomasticos;
	protected JMenuItem jMenuItemCancelarCobrarClientesHonomasticos;
    protected JMenuItem jMenuItemGuardarCambiosCobrarClientesHonomasticos;
	protected JMenuItem jMenuItemGuardarCambiosTablaCobrarClientesHonomasticos;
	protected JMenuItem jMenuItemCerrarCobrarClientesHonomasticos;
	protected JMenuItem jMenuItemDetalleCerrarCobrarClientesHonomasticos;
	protected JMenuItem jMenuItemDetalleMostarOcultarCobrarClientesHonomasticos;
	
	protected JMenuItem jMenuItemProcesarInformacionCobrarClientesHonomasticos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCobrarClientesHonomasticos;
	protected JMenuItem jMenuItemMostrarOcultarCobrarClientesHonomasticos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCobrarClientesHonomasticos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCobrarClientesHonomasticos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCobrarClientesHonomasticos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCobrarClientesHonomasticos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCobrarClientesHonomasticos;
	public JLabel jLabelIdCobrarClientesHonomasticos;
	public JLabel jLabelidCobrarClientesHonomasticos;
	public JButton jButtonidCobrarClientesHonomasticosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_nacimientoCobrarClientesHonomasticos;
	public JLabel jLabelfecha_nacimientoCobrarClientesHonomasticos;
	//public JFormattedTextField jDateChooserfecha_nacimientoCobrarClientesHonomasticos;

	public JDateChooser jDateChooserfecha_nacimientoCobrarClientesHonomasticos;
	public JButton jButtonfecha_nacimientoCobrarClientesHonomasticosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_ciudadCobrarClientesHonomasticos;
	public JLabel jLabelnombre_ciudadCobrarClientesHonomasticos;
	public JTextArea jTextAreanombre_ciudadCobrarClientesHonomasticos;
	public JScrollPane jscrollPanenombre_ciudadCobrarClientesHonomasticos;
	public JButton jButtonnombre_ciudadCobrarClientesHonomasticosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_rutaCobrarClientesHonomasticos;
	public JLabel jLabelnombre_rutaCobrarClientesHonomasticos;
	public JTextArea jTextAreanombre_rutaCobrarClientesHonomasticos;
	public JScrollPane jscrollPanenombre_rutaCobrarClientesHonomasticos;
	public JButton jButtonnombre_rutaCobrarClientesHonomasticosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_vendedorCobrarClientesHonomasticos;
	public JLabel jLabelnombre_vendedorCobrarClientesHonomasticos;
	public JTextArea jTextAreanombre_vendedorCobrarClientesHonomasticos;
	public JScrollPane jscrollPanenombre_vendedorCobrarClientesHonomasticos;
	public JButton jButtonnombre_vendedorCobrarClientesHonomasticosBusqueda= new JButtonMe();

	public JPanel jPanelcodigoCobrarClientesHonomasticos;
	public JLabel jLabelcodigoCobrarClientesHonomasticos;
	public JTextField jTextFieldcodigoCobrarClientesHonomasticos;
	public JButton jButtoncodigoCobrarClientesHonomasticosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completoCobrarClientesHonomasticos;
	public JLabel jLabelnombre_completoCobrarClientesHonomasticos;
	public JTextArea jTextAreanombre_completoCobrarClientesHonomasticos;
	public JScrollPane jscrollPanenombre_completoCobrarClientesHonomasticos;
	public JButton jButtonnombre_completoCobrarClientesHonomasticosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_comercialCobrarClientesHonomasticos;
	public JLabel jLabelnombre_comercialCobrarClientesHonomasticos;
	public JTextArea jTextAreanombre_comercialCobrarClientesHonomasticos;
	public JScrollPane jscrollPanenombre_comercialCobrarClientesHonomasticos;
	public JButton jButtonnombre_comercialCobrarClientesHonomasticosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_nacimiento_datoCobrarClientesHonomasticos;
	public JLabel jLabelfecha_nacimiento_datoCobrarClientesHonomasticos;
	//public JFormattedTextField jDateChooserfecha_nacimiento_datoCobrarClientesHonomasticos;

	public JDateChooser jDateChooserfecha_nacimiento_datoCobrarClientesHonomasticos;
	public JButton jButtonfecha_nacimiento_datoCobrarClientesHonomasticosBusqueda= new JButtonMe();

	public JPanel jPaneldireccion_direccionCobrarClientesHonomasticos;
	public JLabel jLabeldireccion_direccionCobrarClientesHonomasticos;
	public JTextArea jTextAreadireccion_direccionCobrarClientesHonomasticos;
	public JScrollPane jscrollPanedireccion_direccionCobrarClientesHonomasticos;
	public JButton jButtondireccion_direccionCobrarClientesHonomasticosBusqueda= new JButtonMe();

	public JPanel jPaneltelefono_telefonoCobrarClientesHonomasticos;
	public JLabel jLabeltelefono_telefonoCobrarClientesHonomasticos;
	public JTextArea jTextAreatelefono_telefonoCobrarClientesHonomasticos;
	public JScrollPane jscrollPanetelefono_telefonoCobrarClientesHonomasticos;
	public JButton jButtontelefono_telefonoCobrarClientesHonomasticosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCobrarClientesHonomasticos;
	public JLabel jLabelid_empresaCobrarClientesHonomasticos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCobrarClientesHonomasticos;
	public JButton jButtonid_empresaCobrarClientesHonomasticos= new JButtonMe();
	public JButton jButtonid_empresaCobrarClientesHonomasticosUpdate= new JButtonMe();
	public JButton jButtonid_empresaCobrarClientesHonomasticosBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalCobrarClientesHonomasticos;
	public JLabel jLabelid_sucursalCobrarClientesHonomasticos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalCobrarClientesHonomasticos;
	public JButton jButtonid_sucursalCobrarClientesHonomasticos= new JButtonMe();
	public JButton jButtonid_sucursalCobrarClientesHonomasticosUpdate= new JButtonMe();
	public JButton jButtonid_sucursalCobrarClientesHonomasticosBusqueda= new JButtonMe();

	public JPanel jPanelid_paisCobrarClientesHonomasticos;
	public JLabel jLabelid_paisCobrarClientesHonomasticos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisCobrarClientesHonomasticos;
	public JButton jButtonid_paisCobrarClientesHonomasticos= new JButtonMe();
	public JButton jButtonid_paisCobrarClientesHonomasticosUpdate= new JButtonMe();
	public JButton jButtonid_paisCobrarClientesHonomasticosBusqueda= new JButtonMe();

	public JPanel jPanelid_regionCobrarClientesHonomasticos;
	public JLabel jLabelid_regionCobrarClientesHonomasticos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_regionCobrarClientesHonomasticos;
	public JButton jButtonid_regionCobrarClientesHonomasticos= new JButtonMe();
	public JButton jButtonid_regionCobrarClientesHonomasticosUpdate= new JButtonMe();
	public JButton jButtonid_regionCobrarClientesHonomasticosBusqueda= new JButtonMe();

	public JPanel jPanelid_provinciaCobrarClientesHonomasticos;
	public JLabel jLabelid_provinciaCobrarClientesHonomasticos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_provinciaCobrarClientesHonomasticos;
	public JButton jButtonid_provinciaCobrarClientesHonomasticos= new JButtonMe();
	public JButton jButtonid_provinciaCobrarClientesHonomasticosUpdate= new JButtonMe();
	public JButton jButtonid_provinciaCobrarClientesHonomasticosBusqueda= new JButtonMe();

	public JPanel jPanelid_ciudadCobrarClientesHonomasticos;
	public JLabel jLabelid_ciudadCobrarClientesHonomasticos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadCobrarClientesHonomasticos;
	public JButton jButtonid_ciudadCobrarClientesHonomasticos= new JButtonMe();
	public JButton jButtonid_ciudadCobrarClientesHonomasticosUpdate= new JButtonMe();
	public JButton jButtonid_ciudadCobrarClientesHonomasticosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCobrarClientesHonomasticos;
	
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
	public int iHeightFormulario=792;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CobrarClientesHonomasticosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCobrarClientesHonomasticos=new JPanel();
				this.jPanelAccionesFormularioCobrarClientesHonomasticos=new JPanel();
				this.jmenuBarDetalleCobrarClientesHonomasticos=new JMenuBar();
				this.jTtoolBarDetalleCobrarClientesHonomasticos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesHonomasticosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CobrarClientesHonomasticos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CobrarClientesHonomasticosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CobrarClientesHonomasticos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesHonomasticosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarClientesHonomasticos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesHonomasticosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarClientesHonomasticos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesHonomasticosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CobrarClientesHonomasticos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCobrarClientesHonomasticos() {
		return this.jButtonActualizarToolBarCobrarClientesHonomasticos;
	}
	
	public JButton getjButtonEliminarToolBarCobrarClientesHonomasticos() {
		return this.jButtonEliminarToolBarCobrarClientesHonomasticos;
	}
	
	public JButton getjButtonCancelarToolBarCobrarClientesHonomasticos() {
		return this.jButtonCancelarToolBarCobrarClientesHonomasticos;
	}		
	
	public JButton getjButtonProcesarInformacionCobrarClientesHonomasticos() {
		return this.jButtonProcesarInformacionCobrarClientesHonomasticos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCobrarClientesHonomasticos)	{
		this.jButtonProcesarInformacionCobrarClientesHonomasticos = jButtonProcesarInformacionCobrarClientesHonomasticos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCobrarClientesHonomasticos() {
		return this.jComboBoxTiposAccionesCobrarClientesHonomasticos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCobrarClientesHonomasticos(
			JComboBox jComboBoxTiposRelacionesCobrarClientesHonomasticos) {
		this.jComboBoxTiposRelacionesCobrarClientesHonomasticos = jComboBoxTiposRelacionesCobrarClientesHonomasticos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCobrarClientesHonomasticos(
			JComboBox jComboBoxTiposAccionesCobrarClientesHonomasticos) {
		this.jComboBoxTiposAccionesCobrarClientesHonomasticos = jComboBoxTiposAccionesCobrarClientesHonomasticos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCobrarClientesHonomasticos() {
		return this.jComboBoxTiposAccionesFormularioCobrarClientesHonomasticos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCobrarClientesHonomasticos(
			JComboBox jComboBoxTiposAccionesFormularioCobrarClientesHonomasticos) {
		this.jComboBoxTiposAccionesFormularioCobrarClientesHonomasticos = jComboBoxTiposAccionesFormularioCobrarClientesHonomasticos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cobrarclienteshonomasticosSessionBean=new CobrarClientesHonomasticosSessionBean();
		
		this.cobrarclienteshonomasticosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarclienteshonomasticosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CobrarClientesHonomasticosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CobrarClientesHonomasticosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CobrarClientesHonomasticosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cobrar Clientes Honomasticos MANTENIMIENTO"));
		
		
		if(iWidth > 1650) {
			iWidth=1650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()) {
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
	
		CobrarClientesHonomasticosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCobrarClientesHonomasticos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCobrarClientesHonomasticos=new JButtonMe();
				this.jButtonModificarToolBarCobrarClientesHonomasticos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCobrarClientesHonomasticos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCobrarClientesHonomasticos,this.jTtoolBarDetalleCobrarClientesHonomasticos,
							"actualizar","actualizar","Actualizar"+" "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCobrarClientesHonomasticos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCobrarClientesHonomasticos,this.jTtoolBarDetalleCobrarClientesHonomasticos,
							"eliminar","eliminar","Eliminar"+" "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCobrarClientesHonomasticos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCobrarClientesHonomasticos,this.jTtoolBarDetalleCobrarClientesHonomasticos,
							"cancelar","cancelar","Cancelar"+" "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCobrarClientesHonomasticos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCobrarClientesHonomasticos,this.jTtoolBarDetalleCobrarClientesHonomasticos,
							"guardarcambios","guardarcambios","Guardar"+" "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCobrarClientesHonomasticos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCobrarClientesHonomasticos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCobrarClientesHonomasticos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCobrarClientesHonomasticos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCobrarClientesHonomasticos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCobrarClientesHonomasticos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCobrarClientesHonomasticos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCobrarClientesHonomasticos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCobrarClientesHonomasticos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCobrarClientesHonomasticos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCobrarClientesHonomasticos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCobrarClientesHonomasticos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCobrarClientesHonomasticos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCobrarClientesHonomasticos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCobrarClientesHonomasticos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCobrarClientesHonomasticos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCobrarClientesHonomasticos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCobrarClientesHonomasticos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCobrarClientesHonomasticos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCobrarClientesHonomasticos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCobrarClientesHonomasticos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCobrarClientesHonomasticos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCobrarClientesHonomasticos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCobrarClientesHonomasticos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCobrarClientesHonomasticos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCobrarClientesHonomasticos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCobrarClientesHonomasticos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCobrarClientesHonomasticos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCobrarClientesHonomasticos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCobrarClientesHonomasticos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCobrarClientesHonomasticos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCobrarClientesHonomasticos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCobrarClientesHonomasticos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCobrarClientesHonomasticos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCobrarClientesHonomasticos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCobrarClientesHonomasticos.add(this.jMenuItemDetalleCerrarCobrarClientesHonomasticos);
		
		this.jmenuDetalleAccionesCobrarClientesHonomasticos.add(this.jMenuItemActualizarCobrarClientesHonomasticos);
		this.jmenuDetalleAccionesCobrarClientesHonomasticos.add(this.jMenuItemEliminarCobrarClientesHonomasticos);
		this.jmenuDetalleAccionesCobrarClientesHonomasticos.add(this.jMenuItemCancelarCobrarClientesHonomasticos);		
		
		//this.jmenuDetalleDatosCobrarClientesHonomasticos.add(this.jMenuItemDetalleAbrirOrderByCobrarClientesHonomasticos);				
		this.jmenuDetalleDatosCobrarClientesHonomasticos.add(this.jMenuItemDetalleMostarOcultarCobrarClientesHonomasticos);				
				
		//this.jmenuDetalleAccionesCobrarClientesHonomasticos.add(this.jMenuItemGuardarCambiosCobrarClientesHonomasticos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCobrarClientesHonomasticos.add(this.jmenuDetalleArchivoCobrarClientesHonomasticos);		
		this.jmenuBarDetalleCobrarClientesHonomasticos.add(this.jmenuDetalleAccionesCobrarClientesHonomasticos);		
		this.jmenuBarDetalleCobrarClientesHonomasticos.add(this.jmenuDetalleDatosCobrarClientesHonomasticos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCobrarClientesHonomasticos);				
	}
	
	
	public void inicializarElementosCamposCobrarClientesHonomasticos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCobrarClientesHonomasticos = new JLabelMe();
		jLabelIdCobrarClientesHonomasticos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCobrarClientesHonomasticos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCobrarClientesHonomasticos.setToolTipText(CobrarClientesHonomasticosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCobrarClientesHonomasticos= new GridBagLayout();

		this.jPanelidCobrarClientesHonomasticos.setLayout(this.gridaBagLayoutCobrarClientesHonomasticos);

		jLabelidCobrarClientesHonomasticos = new JLabel();
		jLabelidCobrarClientesHonomasticos.setText("Id");

		jLabelidCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_nacimientoCobrarClientesHonomasticos = new JLabelMe();
		this.jLabelfecha_nacimientoCobrarClientesHonomasticos.setText(""+CobrarClientesHonomasticosConstantesFunciones.LABEL_FECHANACIMIENTO+" : *");
		this.jLabelfecha_nacimientoCobrarClientesHonomasticos.setToolTipText("Fecha Nacimiento");
		this.jLabelfecha_nacimientoCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_nacimientoCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_nacimientoCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_nacimientoCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_nacimientoCobrarClientesHonomasticos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_nacimientoCobrarClientesHonomasticos.setToolTipText(CobrarClientesHonomasticosConstantesFunciones.LABEL_FECHANACIMIENTO);
		this.gridaBagLayoutCobrarClientesHonomasticos = new GridBagLayout();
		this.jPanelfecha_nacimientoCobrarClientesHonomasticos.setLayout(this.gridaBagLayoutCobrarClientesHonomasticos);


		//jFormattedTextFieldfecha_nacimientoCobrarClientesHonomasticos= new JFormattedTextFieldMe();

		jDateChooserfecha_nacimientoCobrarClientesHonomasticos= new JDateChooser();
		jDateChooserfecha_nacimientoCobrarClientesHonomasticos.setEnabled(false);
		jDateChooserfecha_nacimientoCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_nacimientoCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_nacimientoCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_nacimientoCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_nacimientoCobrarClientesHonomasticos.setDate(new Date());
		jDateChooserfecha_nacimientoCobrarClientesHonomasticos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_nacimientoCobrarClientesHonomasticos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_nacimientoCobrarClientesHonomasticosBusqueda= new JButtonMe();
		this.jButtonfecha_nacimientoCobrarClientesHonomasticosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_nacimientoCobrarClientesHonomasticosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_nacimientoCobrarClientesHonomasticosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_nacimientoCobrarClientesHonomasticosBusqueda.setText("U");
		this.jButtonfecha_nacimientoCobrarClientesHonomasticosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_nacimientoCobrarClientesHonomasticosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_nacimientoCobrarClientesHonomasticosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_nacimientoCobrarClientesHonomasticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_nacimientoCobrarClientesHonomasticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_nacimientoCobrarClientesHonomasticosBusqueda"));

		if(this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_nacimientoCobrarClientesHonomasticosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_ciudadCobrarClientesHonomasticos = new JLabelMe();
		this.jLabelnombre_ciudadCobrarClientesHonomasticos.setText(""+CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECIUDAD+" : *");
		this.jLabelnombre_ciudadCobrarClientesHonomasticos.setToolTipText("Nombre Ciudad");
		this.jLabelnombre_ciudadCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_ciudadCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_ciudadCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_ciudadCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_ciudadCobrarClientesHonomasticos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_ciudadCobrarClientesHonomasticos.setToolTipText(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECIUDAD);
		this.gridaBagLayoutCobrarClientesHonomasticos = new GridBagLayout();
		this.jPanelnombre_ciudadCobrarClientesHonomasticos.setLayout(this.gridaBagLayoutCobrarClientesHonomasticos);


		jTextAreanombre_ciudadCobrarClientesHonomasticos= new JTextAreaMe();
		jTextAreanombre_ciudadCobrarClientesHonomasticos.setEnabled(false);
		jTextAreanombre_ciudadCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_ciudadCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_ciudadCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_ciudadCobrarClientesHonomasticos.setLineWrap(true);
		jTextAreanombre_ciudadCobrarClientesHonomasticos.setWrapStyleWord(true);
		jTextAreanombre_ciudadCobrarClientesHonomasticos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_ciudadCobrarClientesHonomasticos.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_ciudadCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_ciudadCobrarClientesHonomasticos = new JScrollPane(jTextAreanombre_ciudadCobrarClientesHonomasticos);
		jscrollPanenombre_ciudadCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_ciudadCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_ciudadCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombre_ciudadCobrarClientesHonomasticosBusqueda= new JButtonMe();
		this.jButtonnombre_ciudadCobrarClientesHonomasticosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_ciudadCobrarClientesHonomasticosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_ciudadCobrarClientesHonomasticosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_ciudadCobrarClientesHonomasticosBusqueda.setText("U");
		this.jButtonnombre_ciudadCobrarClientesHonomasticosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_ciudadCobrarClientesHonomasticosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_ciudadCobrarClientesHonomasticosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_ciudadCobrarClientesHonomasticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_ciudadCobrarClientesHonomasticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_ciudadCobrarClientesHonomasticosBusqueda"));

		if(this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_ciudadCobrarClientesHonomasticosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_rutaCobrarClientesHonomasticos = new JLabelMe();
		this.jLabelnombre_rutaCobrarClientesHonomasticos.setText(""+CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRERUTA+" : *");
		this.jLabelnombre_rutaCobrarClientesHonomasticos.setToolTipText("Nombre Ruta");
		this.jLabelnombre_rutaCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_rutaCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_rutaCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_rutaCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_rutaCobrarClientesHonomasticos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_rutaCobrarClientesHonomasticos.setToolTipText(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRERUTA);
		this.gridaBagLayoutCobrarClientesHonomasticos = new GridBagLayout();
		this.jPanelnombre_rutaCobrarClientesHonomasticos.setLayout(this.gridaBagLayoutCobrarClientesHonomasticos);


		jTextAreanombre_rutaCobrarClientesHonomasticos= new JTextAreaMe();
		jTextAreanombre_rutaCobrarClientesHonomasticos.setEnabled(false);
		jTextAreanombre_rutaCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_rutaCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_rutaCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_rutaCobrarClientesHonomasticos.setLineWrap(true);
		jTextAreanombre_rutaCobrarClientesHonomasticos.setWrapStyleWord(true);
		jTextAreanombre_rutaCobrarClientesHonomasticos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_rutaCobrarClientesHonomasticos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_rutaCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_rutaCobrarClientesHonomasticos = new JScrollPane(jTextAreanombre_rutaCobrarClientesHonomasticos);
		jscrollPanenombre_rutaCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_rutaCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_rutaCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_rutaCobrarClientesHonomasticosBusqueda= new JButtonMe();
		this.jButtonnombre_rutaCobrarClientesHonomasticosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_rutaCobrarClientesHonomasticosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_rutaCobrarClientesHonomasticosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_rutaCobrarClientesHonomasticosBusqueda.setText("U");
		this.jButtonnombre_rutaCobrarClientesHonomasticosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_rutaCobrarClientesHonomasticosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_rutaCobrarClientesHonomasticosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_rutaCobrarClientesHonomasticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_rutaCobrarClientesHonomasticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_rutaCobrarClientesHonomasticosBusqueda"));

		if(this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_rutaCobrarClientesHonomasticosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_vendedorCobrarClientesHonomasticos = new JLabelMe();
		this.jLabelnombre_vendedorCobrarClientesHonomasticos.setText(""+CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBREVENDEDOR+" : *");
		this.jLabelnombre_vendedorCobrarClientesHonomasticos.setToolTipText("Nombre Vendedor");
		this.jLabelnombre_vendedorCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_vendedorCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_vendedorCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_vendedorCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_vendedorCobrarClientesHonomasticos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_vendedorCobrarClientesHonomasticos.setToolTipText(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBREVENDEDOR);
		this.gridaBagLayoutCobrarClientesHonomasticos = new GridBagLayout();
		this.jPanelnombre_vendedorCobrarClientesHonomasticos.setLayout(this.gridaBagLayoutCobrarClientesHonomasticos);


		jTextAreanombre_vendedorCobrarClientesHonomasticos= new JTextAreaMe();
		jTextAreanombre_vendedorCobrarClientesHonomasticos.setEnabled(false);
		jTextAreanombre_vendedorCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_vendedorCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_vendedorCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_vendedorCobrarClientesHonomasticos.setLineWrap(true);
		jTextAreanombre_vendedorCobrarClientesHonomasticos.setWrapStyleWord(true);
		jTextAreanombre_vendedorCobrarClientesHonomasticos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_vendedorCobrarClientesHonomasticos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_vendedorCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_vendedorCobrarClientesHonomasticos = new JScrollPane(jTextAreanombre_vendedorCobrarClientesHonomasticos);
		jscrollPanenombre_vendedorCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_vendedorCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_vendedorCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_vendedorCobrarClientesHonomasticosBusqueda= new JButtonMe();
		this.jButtonnombre_vendedorCobrarClientesHonomasticosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_vendedorCobrarClientesHonomasticosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_vendedorCobrarClientesHonomasticosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_vendedorCobrarClientesHonomasticosBusqueda.setText("U");
		this.jButtonnombre_vendedorCobrarClientesHonomasticosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_vendedorCobrarClientesHonomasticosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_vendedorCobrarClientesHonomasticosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_vendedorCobrarClientesHonomasticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_vendedorCobrarClientesHonomasticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_vendedorCobrarClientesHonomasticosBusqueda"));

		if(this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_vendedorCobrarClientesHonomasticosBusqueda.setVisible(false);		}


					
		this.jLabelcodigoCobrarClientesHonomasticos = new JLabelMe();
		this.jLabelcodigoCobrarClientesHonomasticos.setText(""+CobrarClientesHonomasticosConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoCobrarClientesHonomasticos.setToolTipText("Codigo");
		this.jLabelcodigoCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoCobrarClientesHonomasticos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoCobrarClientesHonomasticos.setToolTipText(CobrarClientesHonomasticosConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutCobrarClientesHonomasticos = new GridBagLayout();
		this.jPanelcodigoCobrarClientesHonomasticos.setLayout(this.gridaBagLayoutCobrarClientesHonomasticos);


		jTextFieldcodigoCobrarClientesHonomasticos= new JTextFieldMe();

		jTextFieldcodigoCobrarClientesHonomasticos.setEnabled(false);
		jTextFieldcodigoCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoCobrarClientesHonomasticosBusqueda= new JButtonMe();
		this.jButtoncodigoCobrarClientesHonomasticosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCobrarClientesHonomasticosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCobrarClientesHonomasticosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoCobrarClientesHonomasticosBusqueda.setText("U");
		this.jButtoncodigoCobrarClientesHonomasticosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoCobrarClientesHonomasticosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoCobrarClientesHonomasticosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoCobrarClientesHonomasticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoCobrarClientesHonomasticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoCobrarClientesHonomasticosBusqueda"));

		if(this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoCobrarClientesHonomasticosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completoCobrarClientesHonomasticos = new JLabelMe();
		this.jLabelnombre_completoCobrarClientesHonomasticos.setText(""+CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECOMPLETO+" : *");
		this.jLabelnombre_completoCobrarClientesHonomasticos.setToolTipText("Nombre Completo");
		this.jLabelnombre_completoCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completoCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completoCobrarClientesHonomasticos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completoCobrarClientesHonomasticos.setToolTipText(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECOMPLETO);
		this.gridaBagLayoutCobrarClientesHonomasticos = new GridBagLayout();
		this.jPanelnombre_completoCobrarClientesHonomasticos.setLayout(this.gridaBagLayoutCobrarClientesHonomasticos);


		jTextAreanombre_completoCobrarClientesHonomasticos= new JTextAreaMe();
		jTextAreanombre_completoCobrarClientesHonomasticos.setEnabled(false);
		jTextAreanombre_completoCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoCobrarClientesHonomasticos.setLineWrap(true);
		jTextAreanombre_completoCobrarClientesHonomasticos.setWrapStyleWord(true);
		jTextAreanombre_completoCobrarClientesHonomasticos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completoCobrarClientesHonomasticos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completoCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completoCobrarClientesHonomasticos = new JScrollPane(jTextAreanombre_completoCobrarClientesHonomasticos);
		jscrollPanenombre_completoCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completoCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completoCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completoCobrarClientesHonomasticosBusqueda= new JButtonMe();
		this.jButtonnombre_completoCobrarClientesHonomasticosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoCobrarClientesHonomasticosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoCobrarClientesHonomasticosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completoCobrarClientesHonomasticosBusqueda.setText("U");
		this.jButtonnombre_completoCobrarClientesHonomasticosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completoCobrarClientesHonomasticosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completoCobrarClientesHonomasticosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completoCobrarClientesHonomasticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completoCobrarClientesHonomasticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completoCobrarClientesHonomasticosBusqueda"));

		if(this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completoCobrarClientesHonomasticosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_comercialCobrarClientesHonomasticos = new JLabelMe();
		this.jLabelnombre_comercialCobrarClientesHonomasticos.setText(""+CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECOMERCIAL+" : *");
		this.jLabelnombre_comercialCobrarClientesHonomasticos.setToolTipText("Nombre Comercial");
		this.jLabelnombre_comercialCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_comercialCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_comercialCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_comercialCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_comercialCobrarClientesHonomasticos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_comercialCobrarClientesHonomasticos.setToolTipText(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECOMERCIAL);
		this.gridaBagLayoutCobrarClientesHonomasticos = new GridBagLayout();
		this.jPanelnombre_comercialCobrarClientesHonomasticos.setLayout(this.gridaBagLayoutCobrarClientesHonomasticos);


		jTextAreanombre_comercialCobrarClientesHonomasticos= new JTextAreaMe();
		jTextAreanombre_comercialCobrarClientesHonomasticos.setEnabled(false);
		jTextAreanombre_comercialCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_comercialCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_comercialCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_comercialCobrarClientesHonomasticos.setLineWrap(true);
		jTextAreanombre_comercialCobrarClientesHonomasticos.setWrapStyleWord(true);
		jTextAreanombre_comercialCobrarClientesHonomasticos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_comercialCobrarClientesHonomasticos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_comercialCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_comercialCobrarClientesHonomasticos = new JScrollPane(jTextAreanombre_comercialCobrarClientesHonomasticos);
		jscrollPanenombre_comercialCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_comercialCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_comercialCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_comercialCobrarClientesHonomasticosBusqueda= new JButtonMe();
		this.jButtonnombre_comercialCobrarClientesHonomasticosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_comercialCobrarClientesHonomasticosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_comercialCobrarClientesHonomasticosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_comercialCobrarClientesHonomasticosBusqueda.setText("U");
		this.jButtonnombre_comercialCobrarClientesHonomasticosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_comercialCobrarClientesHonomasticosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_comercialCobrarClientesHonomasticosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_comercialCobrarClientesHonomasticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_comercialCobrarClientesHonomasticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_comercialCobrarClientesHonomasticosBusqueda"));

		if(this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_comercialCobrarClientesHonomasticosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_nacimiento_datoCobrarClientesHonomasticos = new JLabelMe();
		this.jLabelfecha_nacimiento_datoCobrarClientesHonomasticos.setText(""+CobrarClientesHonomasticosConstantesFunciones.LABEL_FECHANACIMIENTODATO+" : *");
		this.jLabelfecha_nacimiento_datoCobrarClientesHonomasticos.setToolTipText("Fecha Nacimiento Dato");
		this.jLabelfecha_nacimiento_datoCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_nacimiento_datoCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_nacimiento_datoCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_nacimiento_datoCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_nacimiento_datoCobrarClientesHonomasticos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_nacimiento_datoCobrarClientesHonomasticos.setToolTipText(CobrarClientesHonomasticosConstantesFunciones.LABEL_FECHANACIMIENTODATO);
		this.gridaBagLayoutCobrarClientesHonomasticos = new GridBagLayout();
		this.jPanelfecha_nacimiento_datoCobrarClientesHonomasticos.setLayout(this.gridaBagLayoutCobrarClientesHonomasticos);


		//jFormattedTextFieldfecha_nacimiento_datoCobrarClientesHonomasticos= new JFormattedTextFieldMe();

		jDateChooserfecha_nacimiento_datoCobrarClientesHonomasticos= new JDateChooser();
		jDateChooserfecha_nacimiento_datoCobrarClientesHonomasticos.setEnabled(false);
		jDateChooserfecha_nacimiento_datoCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_nacimiento_datoCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_nacimiento_datoCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_nacimiento_datoCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_nacimiento_datoCobrarClientesHonomasticos.setDate(new Date());
		jDateChooserfecha_nacimiento_datoCobrarClientesHonomasticos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_nacimiento_datoCobrarClientesHonomasticos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_nacimiento_datoCobrarClientesHonomasticosBusqueda= new JButtonMe();
		this.jButtonfecha_nacimiento_datoCobrarClientesHonomasticosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_nacimiento_datoCobrarClientesHonomasticosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_nacimiento_datoCobrarClientesHonomasticosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_nacimiento_datoCobrarClientesHonomasticosBusqueda.setText("U");
		this.jButtonfecha_nacimiento_datoCobrarClientesHonomasticosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_nacimiento_datoCobrarClientesHonomasticosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_nacimiento_datoCobrarClientesHonomasticosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_nacimiento_datoCobrarClientesHonomasticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_nacimiento_datoCobrarClientesHonomasticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_nacimiento_datoCobrarClientesHonomasticosBusqueda"));

		if(this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_nacimiento_datoCobrarClientesHonomasticosBusqueda.setVisible(false);		}


					
		this.jLabeldireccion_direccionCobrarClientesHonomasticos = new JLabelMe();
		this.jLabeldireccion_direccionCobrarClientesHonomasticos.setText(""+CobrarClientesHonomasticosConstantesFunciones.LABEL_DIRECCIONDIRECCION+" : *");
		this.jLabeldireccion_direccionCobrarClientesHonomasticos.setToolTipText("Direccion Direccion");
		this.jLabeldireccion_direccionCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldireccion_direccionCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldireccion_direccionCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccion_direccionCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccion_direccionCobrarClientesHonomasticos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccion_direccionCobrarClientesHonomasticos.setToolTipText(CobrarClientesHonomasticosConstantesFunciones.LABEL_DIRECCIONDIRECCION);
		this.gridaBagLayoutCobrarClientesHonomasticos = new GridBagLayout();
		this.jPaneldireccion_direccionCobrarClientesHonomasticos.setLayout(this.gridaBagLayoutCobrarClientesHonomasticos);


		jTextAreadireccion_direccionCobrarClientesHonomasticos= new JTextAreaMe();
		jTextAreadireccion_direccionCobrarClientesHonomasticos.setEnabled(false);
		jTextAreadireccion_direccionCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_direccionCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_direccionCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_direccionCobrarClientesHonomasticos.setLineWrap(true);
		jTextAreadireccion_direccionCobrarClientesHonomasticos.setWrapStyleWord(true);
		jTextAreadireccion_direccionCobrarClientesHonomasticos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccion_direccionCobrarClientesHonomasticos.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadireccion_direccionCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccion_direccionCobrarClientesHonomasticos = new JScrollPane(jTextAreadireccion_direccionCobrarClientesHonomasticos);
		jscrollPanedireccion_direccionCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccion_direccionCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccion_direccionCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondireccion_direccionCobrarClientesHonomasticosBusqueda= new JButtonMe();
		this.jButtondireccion_direccionCobrarClientesHonomasticosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccion_direccionCobrarClientesHonomasticosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccion_direccionCobrarClientesHonomasticosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccion_direccionCobrarClientesHonomasticosBusqueda.setText("U");
		this.jButtondireccion_direccionCobrarClientesHonomasticosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccion_direccionCobrarClientesHonomasticosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccion_direccionCobrarClientesHonomasticosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccion_direccionCobrarClientesHonomasticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccion_direccionCobrarClientesHonomasticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccion_direccionCobrarClientesHonomasticosBusqueda"));

		if(this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccion_direccionCobrarClientesHonomasticosBusqueda.setVisible(false);		}


					
		this.jLabeltelefono_telefonoCobrarClientesHonomasticos = new JLabelMe();
		this.jLabeltelefono_telefonoCobrarClientesHonomasticos.setText(""+CobrarClientesHonomasticosConstantesFunciones.LABEL_TELEFONOTELEFONO+" : *");
		this.jLabeltelefono_telefonoCobrarClientesHonomasticos.setToolTipText("Telefono Telefono");
		this.jLabeltelefono_telefonoCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltelefono_telefonoCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltelefono_telefonoCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefono_telefonoCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefono_telefonoCobrarClientesHonomasticos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefono_telefonoCobrarClientesHonomasticos.setToolTipText(CobrarClientesHonomasticosConstantesFunciones.LABEL_TELEFONOTELEFONO);
		this.gridaBagLayoutCobrarClientesHonomasticos = new GridBagLayout();
		this.jPaneltelefono_telefonoCobrarClientesHonomasticos.setLayout(this.gridaBagLayoutCobrarClientesHonomasticos);


		jTextAreatelefono_telefonoCobrarClientesHonomasticos= new JTextAreaMe();
		jTextAreatelefono_telefonoCobrarClientesHonomasticos.setEnabled(false);
		jTextAreatelefono_telefonoCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_telefonoCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_telefonoCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_telefonoCobrarClientesHonomasticos.setLineWrap(true);
		jTextAreatelefono_telefonoCobrarClientesHonomasticos.setWrapStyleWord(true);
		jTextAreatelefono_telefonoCobrarClientesHonomasticos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatelefono_telefonoCobrarClientesHonomasticos.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreatelefono_telefonoCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetelefono_telefonoCobrarClientesHonomasticos = new JScrollPane(jTextAreatelefono_telefonoCobrarClientesHonomasticos);
		jscrollPanetelefono_telefonoCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetelefono_telefonoCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetelefono_telefonoCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtontelefono_telefonoCobrarClientesHonomasticosBusqueda= new JButtonMe();
		this.jButtontelefono_telefonoCobrarClientesHonomasticosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_telefonoCobrarClientesHonomasticosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_telefonoCobrarClientesHonomasticosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefono_telefonoCobrarClientesHonomasticosBusqueda.setText("U");
		this.jButtontelefono_telefonoCobrarClientesHonomasticosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefono_telefonoCobrarClientesHonomasticosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefono_telefonoCobrarClientesHonomasticosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatelefono_telefonoCobrarClientesHonomasticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatelefono_telefonoCobrarClientesHonomasticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefono_telefonoCobrarClientesHonomasticosBusqueda"));

		if(this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefono_telefonoCobrarClientesHonomasticosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCobrarClientesHonomasticos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCobrarClientesHonomasticos = new JLabelMe();
		this.jLabelid_empresaCobrarClientesHonomasticos.setText(""+CobrarClientesHonomasticosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCobrarClientesHonomasticos.setToolTipText("Empresa");
		this.jLabelid_empresaCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCobrarClientesHonomasticos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCobrarClientesHonomasticos.setToolTipText(CobrarClientesHonomasticosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCobrarClientesHonomasticos = new GridBagLayout();
		this.jPanelid_empresaCobrarClientesHonomasticos.setLayout(this.gridaBagLayoutCobrarClientesHonomasticos);


		jComboBoxid_empresaCobrarClientesHonomasticos= new JComboBoxMe();
		jComboBoxid_empresaCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCobrarClientesHonomasticos.setEnabled(false);

		this.jButtonid_empresaCobrarClientesHonomasticos= new JButtonMe();
		this.jButtonid_empresaCobrarClientesHonomasticos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarClientesHonomasticos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarClientesHonomasticos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarClientesHonomasticos.setText("Buscar");
		this.jButtonid_empresaCobrarClientesHonomasticos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCobrarClientesHonomasticos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarClientesHonomasticos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCobrarClientesHonomasticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarClientesHonomasticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarClientesHonomasticos"));

		this.jButtonid_empresaCobrarClientesHonomasticosBusqueda= new JButtonMe();
		this.jButtonid_empresaCobrarClientesHonomasticosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarClientesHonomasticosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarClientesHonomasticosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCobrarClientesHonomasticosBusqueda.setText("U");
		this.jButtonid_empresaCobrarClientesHonomasticosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCobrarClientesHonomasticosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarClientesHonomasticosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCobrarClientesHonomasticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarClientesHonomasticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarClientesHonomasticosBusqueda"));

		if(this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCobrarClientesHonomasticosBusqueda.setVisible(false);		}

		this.jButtonid_empresaCobrarClientesHonomasticosUpdate= new JButtonMe();
		this.jButtonid_empresaCobrarClientesHonomasticosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarClientesHonomasticosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarClientesHonomasticosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCobrarClientesHonomasticosUpdate.setText("U");
		this.jButtonid_empresaCobrarClientesHonomasticosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCobrarClientesHonomasticosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarClientesHonomasticosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCobrarClientesHonomasticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarClientesHonomasticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarClientesHonomasticosUpdate"));



					
		this.jLabelid_sucursalCobrarClientesHonomasticos = new JLabelMe();
		this.jLabelid_sucursalCobrarClientesHonomasticos.setText(""+CobrarClientesHonomasticosConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalCobrarClientesHonomasticos.setToolTipText("Sucursal");
		this.jLabelid_sucursalCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalCobrarClientesHonomasticos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalCobrarClientesHonomasticos.setToolTipText(CobrarClientesHonomasticosConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutCobrarClientesHonomasticos = new GridBagLayout();
		this.jPanelid_sucursalCobrarClientesHonomasticos.setLayout(this.gridaBagLayoutCobrarClientesHonomasticos);


		jComboBoxid_sucursalCobrarClientesHonomasticos= new JComboBoxMe();
		jComboBoxid_sucursalCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalCobrarClientesHonomasticos.setEnabled(false);

		this.jButtonid_sucursalCobrarClientesHonomasticos= new JButtonMe();
		this.jButtonid_sucursalCobrarClientesHonomasticos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCobrarClientesHonomasticos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCobrarClientesHonomasticos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCobrarClientesHonomasticos.setText("Buscar");
		this.jButtonid_sucursalCobrarClientesHonomasticos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalCobrarClientesHonomasticos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCobrarClientesHonomasticos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalCobrarClientesHonomasticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCobrarClientesHonomasticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCobrarClientesHonomasticos"));

		this.jButtonid_sucursalCobrarClientesHonomasticosBusqueda= new JButtonMe();
		this.jButtonid_sucursalCobrarClientesHonomasticosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCobrarClientesHonomasticosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCobrarClientesHonomasticosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCobrarClientesHonomasticosBusqueda.setText("U");
		this.jButtonid_sucursalCobrarClientesHonomasticosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalCobrarClientesHonomasticosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCobrarClientesHonomasticosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalCobrarClientesHonomasticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCobrarClientesHonomasticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCobrarClientesHonomasticosBusqueda"));

		if(this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalCobrarClientesHonomasticosBusqueda.setVisible(false);		}

		this.jButtonid_sucursalCobrarClientesHonomasticosUpdate= new JButtonMe();
		this.jButtonid_sucursalCobrarClientesHonomasticosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCobrarClientesHonomasticosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCobrarClientesHonomasticosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCobrarClientesHonomasticosUpdate.setText("U");
		this.jButtonid_sucursalCobrarClientesHonomasticosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalCobrarClientesHonomasticosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCobrarClientesHonomasticosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalCobrarClientesHonomasticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCobrarClientesHonomasticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCobrarClientesHonomasticosUpdate"));



					
		this.jLabelid_paisCobrarClientesHonomasticos = new JLabelMe();
		this.jLabelid_paisCobrarClientesHonomasticos.setText(""+CobrarClientesHonomasticosConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisCobrarClientesHonomasticos.setToolTipText("Pais");
		this.jLabelid_paisCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisCobrarClientesHonomasticos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisCobrarClientesHonomasticos.setToolTipText(CobrarClientesHonomasticosConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutCobrarClientesHonomasticos = new GridBagLayout();
		this.jPanelid_paisCobrarClientesHonomasticos.setLayout(this.gridaBagLayoutCobrarClientesHonomasticos);


		jComboBoxid_paisCobrarClientesHonomasticos= new JComboBoxMe();
		jComboBoxid_paisCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisCobrarClientesHonomasticos= new JButtonMe();
		this.jButtonid_paisCobrarClientesHonomasticos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisCobrarClientesHonomasticos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisCobrarClientesHonomasticos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisCobrarClientesHonomasticos.setText("Buscar");
		this.jButtonid_paisCobrarClientesHonomasticos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisCobrarClientesHonomasticos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisCobrarClientesHonomasticos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisCobrarClientesHonomasticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisCobrarClientesHonomasticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisCobrarClientesHonomasticos"));

		this.jButtonid_paisCobrarClientesHonomasticosBusqueda= new JButtonMe();
		this.jButtonid_paisCobrarClientesHonomasticosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisCobrarClientesHonomasticosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisCobrarClientesHonomasticosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisCobrarClientesHonomasticosBusqueda.setText("U");
		this.jButtonid_paisCobrarClientesHonomasticosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisCobrarClientesHonomasticosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisCobrarClientesHonomasticosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisCobrarClientesHonomasticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisCobrarClientesHonomasticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisCobrarClientesHonomasticosBusqueda"));

		if(this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisCobrarClientesHonomasticosBusqueda.setVisible(false);		}

		this.jButtonid_paisCobrarClientesHonomasticosUpdate= new JButtonMe();
		this.jButtonid_paisCobrarClientesHonomasticosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisCobrarClientesHonomasticosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisCobrarClientesHonomasticosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisCobrarClientesHonomasticosUpdate.setText("U");
		this.jButtonid_paisCobrarClientesHonomasticosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisCobrarClientesHonomasticosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisCobrarClientesHonomasticosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisCobrarClientesHonomasticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisCobrarClientesHonomasticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisCobrarClientesHonomasticosUpdate"));



					
		this.jLabelid_regionCobrarClientesHonomasticos = new JLabelMe();
		this.jLabelid_regionCobrarClientesHonomasticos.setText(""+CobrarClientesHonomasticosConstantesFunciones.LABEL_IDREGION+" : *");
		this.jLabelid_regionCobrarClientesHonomasticos.setToolTipText("Region");
		this.jLabelid_regionCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_regionCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_regionCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_regionCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_regionCobrarClientesHonomasticos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_regionCobrarClientesHonomasticos.setToolTipText(CobrarClientesHonomasticosConstantesFunciones.LABEL_IDREGION);
		this.gridaBagLayoutCobrarClientesHonomasticos = new GridBagLayout();
		this.jPanelid_regionCobrarClientesHonomasticos.setLayout(this.gridaBagLayoutCobrarClientesHonomasticos);


		jComboBoxid_regionCobrarClientesHonomasticos= new JComboBoxMe();
		jComboBoxid_regionCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_regionCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_regionCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_regionCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_regionCobrarClientesHonomasticos= new JButtonMe();
		this.jButtonid_regionCobrarClientesHonomasticos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_regionCobrarClientesHonomasticos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_regionCobrarClientesHonomasticos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_regionCobrarClientesHonomasticos.setText("Buscar");
		this.jButtonid_regionCobrarClientesHonomasticos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_regionCobrarClientesHonomasticos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_regionCobrarClientesHonomasticos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_regionCobrarClientesHonomasticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_regionCobrarClientesHonomasticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_regionCobrarClientesHonomasticos"));

		this.jButtonid_regionCobrarClientesHonomasticosBusqueda= new JButtonMe();
		this.jButtonid_regionCobrarClientesHonomasticosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_regionCobrarClientesHonomasticosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_regionCobrarClientesHonomasticosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_regionCobrarClientesHonomasticosBusqueda.setText("U");
		this.jButtonid_regionCobrarClientesHonomasticosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_regionCobrarClientesHonomasticosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_regionCobrarClientesHonomasticosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_regionCobrarClientesHonomasticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_regionCobrarClientesHonomasticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_regionCobrarClientesHonomasticosBusqueda"));

		if(this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_regionCobrarClientesHonomasticosBusqueda.setVisible(false);		}

		this.jButtonid_regionCobrarClientesHonomasticosUpdate= new JButtonMe();
		this.jButtonid_regionCobrarClientesHonomasticosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_regionCobrarClientesHonomasticosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_regionCobrarClientesHonomasticosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_regionCobrarClientesHonomasticosUpdate.setText("U");
		this.jButtonid_regionCobrarClientesHonomasticosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_regionCobrarClientesHonomasticosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_regionCobrarClientesHonomasticosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_regionCobrarClientesHonomasticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_regionCobrarClientesHonomasticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_regionCobrarClientesHonomasticosUpdate"));



					
		this.jLabelid_provinciaCobrarClientesHonomasticos = new JLabelMe();
		this.jLabelid_provinciaCobrarClientesHonomasticos.setText(""+CobrarClientesHonomasticosConstantesFunciones.LABEL_IDPROVINCIA+" : *");
		this.jLabelid_provinciaCobrarClientesHonomasticos.setToolTipText("Provincia");
		this.jLabelid_provinciaCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_provinciaCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_provinciaCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_provinciaCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_provinciaCobrarClientesHonomasticos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_provinciaCobrarClientesHonomasticos.setToolTipText(CobrarClientesHonomasticosConstantesFunciones.LABEL_IDPROVINCIA);
		this.gridaBagLayoutCobrarClientesHonomasticos = new GridBagLayout();
		this.jPanelid_provinciaCobrarClientesHonomasticos.setLayout(this.gridaBagLayoutCobrarClientesHonomasticos);


		jComboBoxid_provinciaCobrarClientesHonomasticos= new JComboBoxMe();
		jComboBoxid_provinciaCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_provinciaCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_provinciaCobrarClientesHonomasticos= new JButtonMe();
		this.jButtonid_provinciaCobrarClientesHonomasticos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_provinciaCobrarClientesHonomasticos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_provinciaCobrarClientesHonomasticos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_provinciaCobrarClientesHonomasticos.setText("Buscar");
		this.jButtonid_provinciaCobrarClientesHonomasticos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_provinciaCobrarClientesHonomasticos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_provinciaCobrarClientesHonomasticos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_provinciaCobrarClientesHonomasticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_provinciaCobrarClientesHonomasticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provinciaCobrarClientesHonomasticos"));

		this.jButtonid_provinciaCobrarClientesHonomasticosBusqueda= new JButtonMe();
		this.jButtonid_provinciaCobrarClientesHonomasticosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaCobrarClientesHonomasticosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaCobrarClientesHonomasticosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_provinciaCobrarClientesHonomasticosBusqueda.setText("U");
		this.jButtonid_provinciaCobrarClientesHonomasticosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_provinciaCobrarClientesHonomasticosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_provinciaCobrarClientesHonomasticosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_provinciaCobrarClientesHonomasticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_provinciaCobrarClientesHonomasticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provinciaCobrarClientesHonomasticosBusqueda"));

		if(this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_provinciaCobrarClientesHonomasticosBusqueda.setVisible(false);		}

		this.jButtonid_provinciaCobrarClientesHonomasticosUpdate= new JButtonMe();
		this.jButtonid_provinciaCobrarClientesHonomasticosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaCobrarClientesHonomasticosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaCobrarClientesHonomasticosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_provinciaCobrarClientesHonomasticosUpdate.setText("U");
		this.jButtonid_provinciaCobrarClientesHonomasticosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_provinciaCobrarClientesHonomasticosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_provinciaCobrarClientesHonomasticosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_provinciaCobrarClientesHonomasticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_provinciaCobrarClientesHonomasticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provinciaCobrarClientesHonomasticosUpdate"));



					
		this.jLabelid_ciudadCobrarClientesHonomasticos = new JLabelMe();
		this.jLabelid_ciudadCobrarClientesHonomasticos.setText(""+CobrarClientesHonomasticosConstantesFunciones.LABEL_IDCIUDAD+" : *");
		this.jLabelid_ciudadCobrarClientesHonomasticos.setToolTipText("Ciudad");
		this.jLabelid_ciudadCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ciudadCobrarClientesHonomasticos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ciudadCobrarClientesHonomasticos.setToolTipText(CobrarClientesHonomasticosConstantesFunciones.LABEL_IDCIUDAD);
		this.gridaBagLayoutCobrarClientesHonomasticos = new GridBagLayout();
		this.jPanelid_ciudadCobrarClientesHonomasticos.setLayout(this.gridaBagLayoutCobrarClientesHonomasticos);


		jComboBoxid_ciudadCobrarClientesHonomasticos= new JComboBoxMe();
		jComboBoxid_ciudadCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ciudadCobrarClientesHonomasticos= new JButtonMe();
		this.jButtonid_ciudadCobrarClientesHonomasticos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadCobrarClientesHonomasticos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadCobrarClientesHonomasticos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadCobrarClientesHonomasticos.setText("Buscar");
		this.jButtonid_ciudadCobrarClientesHonomasticos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ciudadCobrarClientesHonomasticos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadCobrarClientesHonomasticos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ciudadCobrarClientesHonomasticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadCobrarClientesHonomasticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadCobrarClientesHonomasticos"));

		this.jButtonid_ciudadCobrarClientesHonomasticosBusqueda= new JButtonMe();
		this.jButtonid_ciudadCobrarClientesHonomasticosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadCobrarClientesHonomasticosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadCobrarClientesHonomasticosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadCobrarClientesHonomasticosBusqueda.setText("U");
		this.jButtonid_ciudadCobrarClientesHonomasticosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ciudadCobrarClientesHonomasticosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadCobrarClientesHonomasticosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ciudadCobrarClientesHonomasticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadCobrarClientesHonomasticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadCobrarClientesHonomasticosBusqueda"));

		if(this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ciudadCobrarClientesHonomasticosBusqueda.setVisible(false);		}

		this.jButtonid_ciudadCobrarClientesHonomasticosUpdate= new JButtonMe();
		this.jButtonid_ciudadCobrarClientesHonomasticosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadCobrarClientesHonomasticosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadCobrarClientesHonomasticosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadCobrarClientesHonomasticosUpdate.setText("U");
		this.jButtonid_ciudadCobrarClientesHonomasticosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ciudadCobrarClientesHonomasticosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadCobrarClientesHonomasticosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ciudadCobrarClientesHonomasticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadCobrarClientesHonomasticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadCobrarClientesHonomasticosUpdate"));



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
		//this.jInternalFrameDetalleCobrarClientesHonomasticos = new CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cobrar Clientes Honomasticos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCobrarClientesHonomasticos= new GridBagLayout();
		

		
		String sToolTipCobrarClientesHonomasticos="";
		sToolTipCobrarClientesHonomasticos=CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCobrarClientesHonomasticos+="(Cartera.CobrarClientesHonomasticos)";
		}
		
		if(!this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()) {
			sToolTipCobrarClientesHonomasticos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCobrarClientesHonomasticos = new JButtonMe();
		this.jButtonModificarCobrarClientesHonomasticos = new JButtonMe();
        this.jButtonActualizarCobrarClientesHonomasticos = new JButtonMe();
        this.jButtonEliminarCobrarClientesHonomasticos = new JButtonMe();
        this.jButtonCancelarCobrarClientesHonomasticos = new JButtonMe();
        this.jButtonGuardarCambiosCobrarClientesHonomasticos = new JButtonMe();
		this.jButtonGuardarCambiosTablaCobrarClientesHonomasticos = new JButtonMe();
		this.jButtonCerrarCobrarClientesHonomasticos = new JButtonMe();
		
		this.jScrollPanelDatosCobrarClientesHonomasticos = new JScrollPane();   
        this.jScrollPanelDatosEdicionCobrarClientesHonomasticos = new JScrollPane();
		this.jScrollPanelDatosGeneralCobrarClientesHonomasticos = new JScrollPane();
				
		
		
		this.jPanelCamposCobrarClientesHonomasticos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCobrarClientesHonomasticos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCobrarClientesHonomasticos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCobrarClientesHonomasticos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cobrar Clientes Honomasticos";
		
		if(!this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCobrarClientesHonomasticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Clientes Honomasticoses" + this.sPath));
		} else {
			this.jScrollPanelDatosCobrarClientesHonomasticos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCobrarClientesHonomasticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCobrarClientesHonomasticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCobrarClientesHonomasticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCobrarClientesHonomasticos.setName("jPanelCamposCobrarClientesHonomasticos"); 

		this.jPanelCamposOcultosCobrarClientesHonomasticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCobrarClientesHonomasticos.setName("jPanelCamposOcultosCobrarClientesHonomasticos"); 

        this.jPanelAccionesCobrarClientesHonomasticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCobrarClientesHonomasticos.setToolTipText("Acciones");
        this.jPanelAccionesCobrarClientesHonomasticos.setName("Acciones"); 

		this.jPanelAccionesFormularioCobrarClientesHonomasticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCobrarClientesHonomasticos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCobrarClientesHonomasticos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCobrarClientesHonomasticos.setText("Nuevo");
		this.jButtonModificarCobrarClientesHonomasticos.setText("Editar");
        this.jButtonActualizarCobrarClientesHonomasticos.setText("Actualizar");
        this.jButtonEliminarCobrarClientesHonomasticos.setText("Eliminar");
        this.jButtonCancelarCobrarClientesHonomasticos.setText("Cancelar");
        this.jButtonGuardarCambiosCobrarClientesHonomasticos.setText("Guardar");
		this.jButtonGuardarCambiosTablaCobrarClientesHonomasticos.setText("Guardar");
		this.jButtonCerrarCobrarClientesHonomasticos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCobrarClientesHonomasticos,"nuevo_button","Nuevo",this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCobrarClientesHonomasticos,"modificar_button","Editar",this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCobrarClientesHonomasticos,"actualizar_button","Actualizar",this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCobrarClientesHonomasticos,"eliminar_button","Eliminar",this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCobrarClientesHonomasticos,"cancelar_button","Cancelar",this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCobrarClientesHonomasticos,"guardarcambios_button","Guardar",this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCobrarClientesHonomasticos,"guardarcambiostabla_button","Guardar",this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCobrarClientesHonomasticos,"cerrar_button","Salir",this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCobrarClientesHonomasticos.setToolTipText("Nuevo"+" "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCobrarClientesHonomasticos.setToolTipText("Editar"+" "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCobrarClientesHonomasticos.setToolTipText("Actualizar"+" "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCobrarClientesHonomasticos.setToolTipText("Eliminar)"+" "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCobrarClientesHonomasticos.setToolTipText("Cancelar"+" "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCobrarClientesHonomasticos.setToolTipText("Guardar"+" "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCobrarClientesHonomasticos.setToolTipText("Guardar"+" "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCobrarClientesHonomasticos.setToolTipText("Salir"+" "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCobrarClientesHonomasticos";
		inputMap = this.jButtonNuevoCobrarClientesHonomasticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCobrarClientesHonomasticos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCobrarClientesHonomasticos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCobrarClientesHonomasticos";
		inputMap = this.jButtonActualizarCobrarClientesHonomasticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCobrarClientesHonomasticos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCobrarClientesHonomasticos"));
		
		//ELIMINAR
		sMapKey = "EliminarCobrarClientesHonomasticos";
		inputMap = this.jButtonEliminarCobrarClientesHonomasticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCobrarClientesHonomasticos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCobrarClientesHonomasticos"));
		
		//CANCELAR	
		sMapKey = "CancelarCobrarClientesHonomasticos";
		inputMap = this.jButtonCancelarCobrarClientesHonomasticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCobrarClientesHonomasticos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCobrarClientesHonomasticos"));
		
		//CERRAR		
		sMapKey = "CerrarCobrarClientesHonomasticos";
		inputMap = this.jButtonCerrarCobrarClientesHonomasticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCobrarClientesHonomasticos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCobrarClientesHonomasticos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCobrarClientesHonomasticos";
		inputMap = this.jButtonGuardarCambiosTablaCobrarClientesHonomasticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCobrarClientesHonomasticos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCobrarClientesHonomasticos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCobrarClientesHonomasticos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCobrarClientesHonomasticos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCobrarClientesHonomasticos.setToolTipText("Nuevo CobrarClientesHonomasticos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCobrarClientesHonomasticos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCobrarClientesHonomasticos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCobrarClientesHonomasticos.setToolTipText("Sin Cerrar Ventana CobrarClientesHonomasticos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCobrarClientesHonomasticos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCobrarClientesHonomasticos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCobrarClientesHonomasticos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCobrarClientesHonomasticos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCobrarClientesHonomasticos.setText("Accion");
		this.jComboBoxTiposAccionesCobrarClientesHonomasticos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCobrarClientesHonomasticos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCobrarClientesHonomasticos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCobrarClientesHonomasticos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCobrarClientesHonomasticos = new JLabelMe();
		
		this.jLabelAccionesCobrarClientesHonomasticos.setText("Acciones");		
		this.jLabelAccionesCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCobrarClientesHonomasticos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCobrarClientesHonomasticos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCobrarClientesHonomasticos=new JTabbedPane();
		this.jTabbedPaneRelacionesCobrarClientesHonomasticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCobrarClientesHonomasticos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarClientesHonomasticos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarClientesHonomasticos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCobrarClientesHonomasticos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCobrarClientesHonomasticos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCobrarClientesHonomasticos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCobrarClientesHonomasticos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCobrarClientesHonomasticos = new GridBagLayout();
		
		this.jPanelCamposCobrarClientesHonomasticos.setLayout(gridaBagLayoutCamposCobrarClientesHonomasticos);
		this.jPanelCamposOcultosCobrarClientesHonomasticos.setLayout(gridaBagLayoutCamposOcultosCobrarClientesHonomasticos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCobrarClientesHonomasticos.add(jLabelIdCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);



	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 1;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCobrarClientesHonomasticos.add(jLabelidCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);


	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCobrarClientesHonomasticos.add(jLabelid_empresaCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 2;
		this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCobrarClientesHonomasticos.add(jButtonid_empresaCobrarClientesHonomasticosBusqueda, this.gridBagConstraintsCobrarClientesHonomasticos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 3;
		this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCobrarClientesHonomasticos.add(jButtonid_empresaCobrarClientesHonomasticosUpdate, this.gridBagConstraintsCobrarClientesHonomasticos);
	}

	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 1;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCobrarClientesHonomasticos.add(jComboBoxid_empresaCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);


	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalCobrarClientesHonomasticos.add(jLabelid_sucursalCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 2;
		this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCobrarClientesHonomasticos.add(jButtonid_sucursalCobrarClientesHonomasticosBusqueda, this.gridBagConstraintsCobrarClientesHonomasticos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 3;
		this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCobrarClientesHonomasticos.add(jButtonid_sucursalCobrarClientesHonomasticosUpdate, this.gridBagConstraintsCobrarClientesHonomasticos);
	}

	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 1;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalCobrarClientesHonomasticos.add(jComboBoxid_sucursalCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);


	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisCobrarClientesHonomasticos.add(jLabelid_paisCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 2;
		this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisCobrarClientesHonomasticos.add(jButtonid_paisCobrarClientesHonomasticosBusqueda, this.gridBagConstraintsCobrarClientesHonomasticos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 3;
		this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisCobrarClientesHonomasticos.add(jButtonid_paisCobrarClientesHonomasticosUpdate, this.gridBagConstraintsCobrarClientesHonomasticos);
	}

	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 1;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisCobrarClientesHonomasticos.add(jComboBoxid_paisCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);


	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_regionCobrarClientesHonomasticos.add(jLabelid_regionCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 2;
		this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_regionCobrarClientesHonomasticos.add(jButtonid_regionCobrarClientesHonomasticosBusqueda, this.gridBagConstraintsCobrarClientesHonomasticos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 3;
		this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_regionCobrarClientesHonomasticos.add(jButtonid_regionCobrarClientesHonomasticosUpdate, this.gridBagConstraintsCobrarClientesHonomasticos);
	}

	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 1;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_regionCobrarClientesHonomasticos.add(jComboBoxid_regionCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);


	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_provinciaCobrarClientesHonomasticos.add(jLabelid_provinciaCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 2;
		this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_provinciaCobrarClientesHonomasticos.add(jButtonid_provinciaCobrarClientesHonomasticosBusqueda, this.gridBagConstraintsCobrarClientesHonomasticos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 3;
		this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_provinciaCobrarClientesHonomasticos.add(jButtonid_provinciaCobrarClientesHonomasticosUpdate, this.gridBagConstraintsCobrarClientesHonomasticos);
	}

	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 1;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_provinciaCobrarClientesHonomasticos.add(jComboBoxid_provinciaCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);


	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ciudadCobrarClientesHonomasticos.add(jLabelid_ciudadCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 2;
		this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadCobrarClientesHonomasticos.add(jButtonid_ciudadCobrarClientesHonomasticosBusqueda, this.gridBagConstraintsCobrarClientesHonomasticos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 3;
		this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadCobrarClientesHonomasticos.add(jButtonid_ciudadCobrarClientesHonomasticosUpdate, this.gridBagConstraintsCobrarClientesHonomasticos);
	}

	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 1;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ciudadCobrarClientesHonomasticos.add(jComboBoxid_ciudadCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);


	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_nacimientoCobrarClientesHonomasticos.add(jLabelfecha_nacimientoCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 2;
		this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_nacimientoCobrarClientesHonomasticos.add(jButtonfecha_nacimientoCobrarClientesHonomasticosBusqueda, this.gridBagConstraintsCobrarClientesHonomasticos);
	}

	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 1;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_nacimientoCobrarClientesHonomasticos.add(jDateChooserfecha_nacimientoCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);


	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_ciudadCobrarClientesHonomasticos.add(jLabelnombre_ciudadCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 2;
		this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_ciudadCobrarClientesHonomasticos.add(jButtonnombre_ciudadCobrarClientesHonomasticosBusqueda, this.gridBagConstraintsCobrarClientesHonomasticos);
	}

	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 1;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_ciudadCobrarClientesHonomasticos.add(jscrollPanenombre_ciudadCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);


	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_rutaCobrarClientesHonomasticos.add(jLabelnombre_rutaCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 2;
		this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_rutaCobrarClientesHonomasticos.add(jButtonnombre_rutaCobrarClientesHonomasticosBusqueda, this.gridBagConstraintsCobrarClientesHonomasticos);
	}

	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 1;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_rutaCobrarClientesHonomasticos.add(jscrollPanenombre_rutaCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);


	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_vendedorCobrarClientesHonomasticos.add(jLabelnombre_vendedorCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 2;
		this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_vendedorCobrarClientesHonomasticos.add(jButtonnombre_vendedorCobrarClientesHonomasticosBusqueda, this.gridBagConstraintsCobrarClientesHonomasticos);
	}

	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 1;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_vendedorCobrarClientesHonomasticos.add(jscrollPanenombre_vendedorCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);


	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoCobrarClientesHonomasticos.add(jLabelcodigoCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 2;
		this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoCobrarClientesHonomasticos.add(jButtoncodigoCobrarClientesHonomasticosBusqueda, this.gridBagConstraintsCobrarClientesHonomasticos);
	}

	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 1;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoCobrarClientesHonomasticos.add(jTextFieldcodigoCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);


	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completoCobrarClientesHonomasticos.add(jLabelnombre_completoCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 2;
		this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completoCobrarClientesHonomasticos.add(jButtonnombre_completoCobrarClientesHonomasticosBusqueda, this.gridBagConstraintsCobrarClientesHonomasticos);
	}

	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 1;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completoCobrarClientesHonomasticos.add(jscrollPanenombre_completoCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);


	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_comercialCobrarClientesHonomasticos.add(jLabelnombre_comercialCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 2;
		this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_comercialCobrarClientesHonomasticos.add(jButtonnombre_comercialCobrarClientesHonomasticosBusqueda, this.gridBagConstraintsCobrarClientesHonomasticos);
	}

	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 1;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_comercialCobrarClientesHonomasticos.add(jscrollPanenombre_comercialCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);


	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_nacimiento_datoCobrarClientesHonomasticos.add(jLabelfecha_nacimiento_datoCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 2;
		this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_nacimiento_datoCobrarClientesHonomasticos.add(jButtonfecha_nacimiento_datoCobrarClientesHonomasticosBusqueda, this.gridBagConstraintsCobrarClientesHonomasticos);
	}

	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 1;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_nacimiento_datoCobrarClientesHonomasticos.add(jDateChooserfecha_nacimiento_datoCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);


	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccion_direccionCobrarClientesHonomasticos.add(jLabeldireccion_direccionCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 2;
		this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccion_direccionCobrarClientesHonomasticos.add(jButtondireccion_direccionCobrarClientesHonomasticosBusqueda, this.gridBagConstraintsCobrarClientesHonomasticos);
	}

	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 1;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccion_direccionCobrarClientesHonomasticos.add(jscrollPanedireccion_direccionCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);


	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefono_telefonoCobrarClientesHonomasticos.add(jLabeltelefono_telefonoCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 2;
		this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefono_telefonoCobrarClientesHonomasticos.add(jButtontelefono_telefonoCobrarClientesHonomasticosBusqueda, this.gridBagConstraintsCobrarClientesHonomasticos);
	}

	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 1;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefono_telefonoCobrarClientesHonomasticos.add(jscrollPanetelefono_telefonoCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iYPanelCamposCobrarClientesHonomasticos;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iXPanelCamposCobrarClientesHonomasticos++;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesHonomasticos.add(this.jPanelidCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);



	if(iXPanelCamposCobrarClientesHonomasticos % 2==0) {
		iXPanelCamposCobrarClientesHonomasticos=0;
		iYPanelCamposCobrarClientesHonomasticos++;
	}
	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iYPanelCamposCobrarClientesHonomasticos;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iXPanelCamposCobrarClientesHonomasticos++;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesHonomasticos.add(this.jPanelid_paisCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);



	if(iXPanelCamposCobrarClientesHonomasticos % 2==0) {
		iXPanelCamposCobrarClientesHonomasticos=0;
		iYPanelCamposCobrarClientesHonomasticos++;
	}
	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iYPanelCamposCobrarClientesHonomasticos;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iXPanelCamposCobrarClientesHonomasticos++;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesHonomasticos.add(this.jPanelid_regionCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);



	if(iXPanelCamposCobrarClientesHonomasticos % 2==0) {
		iXPanelCamposCobrarClientesHonomasticos=0;
		iYPanelCamposCobrarClientesHonomasticos++;
	}
	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iYPanelCamposCobrarClientesHonomasticos;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iXPanelCamposCobrarClientesHonomasticos++;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesHonomasticos.add(this.jPanelid_provinciaCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);



	if(iXPanelCamposCobrarClientesHonomasticos % 2==0) {
		iXPanelCamposCobrarClientesHonomasticos=0;
		iYPanelCamposCobrarClientesHonomasticos++;
	}
	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iYPanelCamposCobrarClientesHonomasticos;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iXPanelCamposCobrarClientesHonomasticos++;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesHonomasticos.add(this.jPanelid_ciudadCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);



	if(iXPanelCamposCobrarClientesHonomasticos % 2==0) {
		iXPanelCamposCobrarClientesHonomasticos=0;
		iYPanelCamposCobrarClientesHonomasticos++;
	}
	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iYPanelCamposCobrarClientesHonomasticos;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iXPanelCamposCobrarClientesHonomasticos++;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesHonomasticos.add(this.jPanelfecha_nacimientoCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);



	if(iXPanelCamposCobrarClientesHonomasticos % 2==0) {
		iXPanelCamposCobrarClientesHonomasticos=0;
		iYPanelCamposCobrarClientesHonomasticos++;
	}
	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iYPanelCamposCobrarClientesHonomasticos;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iXPanelCamposCobrarClientesHonomasticos++;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesHonomasticos.add(this.jPanelnombre_ciudadCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);



	if(iXPanelCamposCobrarClientesHonomasticos % 2==0) {
		iXPanelCamposCobrarClientesHonomasticos=0;
		iYPanelCamposCobrarClientesHonomasticos++;
	}
	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iYPanelCamposCobrarClientesHonomasticos;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iXPanelCamposCobrarClientesHonomasticos++;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesHonomasticos.add(this.jPanelnombre_rutaCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);



	if(iXPanelCamposCobrarClientesHonomasticos % 2==0) {
		iXPanelCamposCobrarClientesHonomasticos=0;
		iYPanelCamposCobrarClientesHonomasticos++;
	}
	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iYPanelCamposCobrarClientesHonomasticos;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iXPanelCamposCobrarClientesHonomasticos++;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesHonomasticos.add(this.jPanelnombre_vendedorCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);



	if(iXPanelCamposCobrarClientesHonomasticos % 2==0) {
		iXPanelCamposCobrarClientesHonomasticos=0;
		iYPanelCamposCobrarClientesHonomasticos++;
	}
	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iYPanelCamposCobrarClientesHonomasticos;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iXPanelCamposCobrarClientesHonomasticos++;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesHonomasticos.add(this.jPanelcodigoCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);



	if(iXPanelCamposCobrarClientesHonomasticos % 2==0) {
		iXPanelCamposCobrarClientesHonomasticos=0;
		iYPanelCamposCobrarClientesHonomasticos++;
	}
	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iYPanelCamposCobrarClientesHonomasticos;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iXPanelCamposCobrarClientesHonomasticos++;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesHonomasticos.add(this.jPanelnombre_completoCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);



	if(iXPanelCamposCobrarClientesHonomasticos % 2==0) {
		iXPanelCamposCobrarClientesHonomasticos=0;
		iYPanelCamposCobrarClientesHonomasticos++;
	}
	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iYPanelCamposCobrarClientesHonomasticos;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iXPanelCamposCobrarClientesHonomasticos++;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesHonomasticos.add(this.jPanelnombre_comercialCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);



	if(iXPanelCamposCobrarClientesHonomasticos % 2==0) {
		iXPanelCamposCobrarClientesHonomasticos=0;
		iYPanelCamposCobrarClientesHonomasticos++;
	}
	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iYPanelCamposCobrarClientesHonomasticos;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iXPanelCamposCobrarClientesHonomasticos++;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesHonomasticos.add(this.jPanelfecha_nacimiento_datoCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);



	if(iXPanelCamposCobrarClientesHonomasticos % 2==0) {
		iXPanelCamposCobrarClientesHonomasticos=0;
		iYPanelCamposCobrarClientesHonomasticos++;
	}
	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iYPanelCamposCobrarClientesHonomasticos;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iXPanelCamposCobrarClientesHonomasticos++;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesHonomasticos.add(this.jPaneldireccion_direccionCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);



	if(iXPanelCamposCobrarClientesHonomasticos % 2==0) {
		iXPanelCamposCobrarClientesHonomasticos=0;
		iYPanelCamposCobrarClientesHonomasticos++;
	}
	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iYPanelCamposCobrarClientesHonomasticos;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iXPanelCamposCobrarClientesHonomasticos++;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesHonomasticos.add(this.jPaneltelefono_telefonoCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);



	if(iXPanelCamposCobrarClientesHonomasticos % 2==0) {
		iXPanelCamposCobrarClientesHonomasticos=0;
		iYPanelCamposCobrarClientesHonomasticos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iYPanelCamposOcultosCobrarClientesHonomasticos;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iXPanelCamposOcultosCobrarClientesHonomasticos++;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCobrarClientesHonomasticos.add(this.jPanelid_empresaCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);



	if(iXPanelCamposOcultosCobrarClientesHonomasticos % 2==0) {
		iXPanelCamposOcultosCobrarClientesHonomasticos=0;
		iYPanelCamposOcultosCobrarClientesHonomasticos++;
	}
	this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iYPanelCamposOcultosCobrarClientesHonomasticos;
	this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iXPanelCamposOcultosCobrarClientesHonomasticos++;
	this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesHonomasticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCobrarClientesHonomasticos.add(this.jPanelid_sucursalCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);



	if(iXPanelCamposOcultosCobrarClientesHonomasticos % 2==0) {
		iXPanelCamposOcultosCobrarClientesHonomasticos=0;
		iYPanelCamposOcultosCobrarClientesHonomasticos++;
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
			
		GridBagLayout gridaBagLayoutAccionesCobrarClientesHonomasticos= new GridBagLayout();
		this.jPanelAccionesCobrarClientesHonomasticos.setLayout(gridaBagLayoutAccionesCobrarClientesHonomasticos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCobrarClientesHonomasticos= new GridBagLayout();
		this.jPanelAccionesFormularioCobrarClientesHonomasticos.setLayout(gridaBagLayoutAccionesFormularioCobrarClientesHonomasticos);
		
		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCobrarClientesHonomasticos.add(this.jComboBoxTiposAccionesFormularioCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iPosXAccion++;
			
		this.jPanelAccionesCobrarClientesHonomasticos.add(this.jButtonModificarCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);							

		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx =iPosXAccion++;
			
		this.jPanelAccionesCobrarClientesHonomasticos.add(this.jButtonEliminarCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
		
			
		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;		
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iPosXAccion++;
		
		this.jPanelAccionesCobrarClientesHonomasticos.add(this.jButtonActualizarCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);


		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;		
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iPosXAccion++;
		
		this.jPanelAccionesCobrarClientesHonomasticos.add(this.jButtonGuardarCambiosCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);	
		
		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;		
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx =iPosXAccion++;
		
		this.jPanelAccionesCobrarClientesHonomasticos.add(this.jButtonCancelarCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCobrarClientesHonomasticos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCobrarClientesHonomasticos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();						
			this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;		
			//this.gridBagConstraintsCobrarClientesHonomasticos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx =0;
		this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCobrarClientesHonomasticos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CobrarClientesHonomasticosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCobrarClientesHonomasticos = new CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cobrar Clientes Honomasticos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cobrar Clientes Honomasticos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cobrar Clientes Honomasticos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CobrarClientesHonomasticosModel cobrarclienteshonomasticosModel=new CobrarClientesHonomasticosModel(this);
			
			//SI USARA CLASE INTERNA
			//CobrarClientesHonomasticosModel.CobrarClientesHonomasticosFocusTraversalPolicy cobrarclienteshonomasticosFocusTraversalPolicy = cobrarclienteshonomasticosModel.new CobrarClientesHonomasticosFocusTraversalPolicy(this);
			
			//cobrarclienteshonomasticosFocusTraversalPolicy.setcobrarclienteshonomasticosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cobrarclienteshonomasticosModel);
			
			
			this.jContentPaneDetalleCobrarClientesHonomasticos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCobrarClientesHonomasticos = new GridBagLayout();	
			this.jContentPaneDetalleCobrarClientesHonomasticos.setLayout(gridaBagLayoutDetalleCobrarClientesHonomasticos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCobrarClientesHonomasticos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
				this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
					
				
				this.jContentPaneDetalleCobrarClientesHonomasticos.add(jTtoolBarDetalleCobrarClientesHonomasticos, gridBagConstraintsCobrarClientesHonomasticos);								
				
}
			
			this.jScrollPanelDatosEdicionCobrarClientesHonomasticos=   new JScrollPane(jContentPaneDetalleCobrarClientesHonomasticos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCobrarClientesHonomasticos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarClientesHonomasticos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarClientesHonomasticos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCobrarClientesHonomasticos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCobrarClientesHonomasticos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarClientesHonomasticos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarClientesHonomasticos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
	        
			this.jContentPaneDetalleCobrarClientesHonomasticos.add(jPanelCamposCobrarClientesHonomasticos, gridBagConstraintsCobrarClientesHonomasticos);
			
			
			
			
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
						//&& cobrarclienteshonomasticosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.cobrarclienteshonomasticosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCobrarClientesHonomasticos= new GridBagConstraints();
						this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
						this.jContentPaneDetalleCobrarClientesHonomasticos.add(this.jTabbedPaneRelacionesCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCobrarClientesHonomasticos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCobrarClientesHonomasticos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
					this.gridBagConstraintsCobrarClientesHonomasticos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
					
				
					this.jContentPaneDetalleCobrarClientesHonomasticos.add(jPanelCamposOcultosCobrarClientesHonomasticos, gridBagConstraintsCobrarClientesHonomasticos);
				
					this.jPanelCamposOcultosCobrarClientesHonomasticos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
	        this.gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCobrarClientesHonomasticos.add(this.jPanelAccionesFormularioCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);							
			
			
			
			this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
	        this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
	        
			
			this.jContentPaneDetalleCobrarClientesHonomasticos.add(this.jPanelAccionesCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCobrarClientesHonomasticos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCobrarClientesHonomasticos=   new JScrollPane(this.jPanelCamposCobrarClientesHonomasticos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCobrarClientesHonomasticos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarClientesHonomasticos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarClientesHonomasticos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
			this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCobrarClientesHonomasticos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesHonomasticos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);			
			
			this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesHonomasticos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
			
			
		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
		
			
		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCobrarClientesHonomasticos;//jContentPane;
		
		return jScrollPanelDatosEdicionCobrarClientesHonomasticos;
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
