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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.ServicioConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class ServicioDetalleFormJInternalFrame extends ServicioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleServicio;
	
	protected JMenuBar jmenuBarDetalleServicio;
	
	protected JMenu jmenuDetalleServicio;
	protected JMenu jmenuDetalleArchivoServicio;
	protected JMenu jmenuDetalleAccionesServicio;
	protected JMenu jmenuDetalleDatosServicio;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutServicio;	
	protected GridBagConstraints gridBagConstraintsServicio;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ServicioBeanSwingJInternalFrameAdditional jInternalFrameDetalleServicio;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoServicioBeanSwingJInternalFrame tiposervicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiposervicio="";

	protected EstadoServicioBeanSwingJInternalFrame estadoservicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoservicio="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablegastoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablegasto="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablefiscalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablefiscal="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablefiscal2BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablefiscal2="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableretencionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableretencion="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableretencion2BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableretencion2="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableiva="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableiva2BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableiva2="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecredito="";
	
	public ServicioSessionBean servicioSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoServicioSessionBean tiposervicioSessionBean;
	public EstadoServicioSessionBean estadoservicioSessionBean;
	public CuentaContableSessionBean cuentacontablegastoSessionBean;
	public CuentaContableSessionBean cuentacontablefiscalSessionBean;
	public CuentaContableSessionBean cuentacontablefiscal2SessionBean;
	public CuentaContableSessionBean cuentacontableretencionSessionBean;
	public CuentaContableSessionBean cuentacontableretencion2SessionBean;
	public CuentaContableSessionBean cuentacontableivaSessionBean;
	public CuentaContableSessionBean cuentacontableiva2SessionBean;
	public CuentaContableSessionBean cuentacontablecreditoSessionBean;	
	
	public ServicioLogic servicioLogic;
	
	public JScrollPane jScrollPanelDatosServicio;
	public JScrollPane jScrollPanelDatosEdicionServicio;
	public JScrollPane jScrollPanelDatosGeneralServicio;
	
	protected JPanel jPanelCamposServicio;    
	protected JPanel jPanelCamposOcultosServicio;    	
	protected JPanel jPanelAccionesServicio;
	protected JPanel jPanelAccionesFormularioServicio;
    
	
	
	protected JTabbedPane jTabbedPaneCamposServicio;	
	protected Integer iXPanelCamposServicio=0;
	protected Integer iYPanelCamposServicio=0;
	
	protected Integer iXPanelCamposOcultosServicio=0;
	protected Integer iYPanelCamposOcultosServicio=0;
	
	

	protected JPanel jPanelCamposIniciogeneralServicio;
	protected Integer iXPanelCamposIniciogeneralServicio=0;
	protected Integer iYPanelCamposIniciogeneralServicio=0;

	protected JPanel jPanelCamposIniciocuenta_contableServicio;
	protected Integer iXPanelCamposIniciocuenta_contableServicio=0;
	protected Integer iYPanelCamposIniciocuenta_contableServicio=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoServicio;
	public JButton jButtonModificarServicio;
	public JButton jButtonActualizarServicio;
    public JButton jButtonEliminarServicio;
	public JButton jButtonCancelarServicio;
    public JButton jButtonGuardarCambiosServicio;
	public JButton jButtonGuardarCambiosTablaServicio;
	protected JButton jButtonCerrarServicio;
	
	
	protected JButton jButtonProcesarInformacionServicio;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoServicio;
	protected JCheckBox jCheckBoxPostAccionSinCerrarServicio;
	protected JCheckBox jCheckBoxPostAccionSinMensajeServicio;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarServicio;
	protected JButton jButtonModificarToolBarServicio;
	protected JButton jButtonActualizarToolBarServicio;
    protected JButton jButtonEliminarToolBarServicio;
	protected JButton jButtonCancelarToolBarServicio;
    protected JButton jButtonGuardarCambiosToolBarServicio;
	protected JButton jButtonGuardarCambiosTablaToolBarServicio;
	protected JButton jButtonMostrarOcultarTablaToolBarServicio;
	protected JButton jButtonCerrarToolBarServicio;
	
	protected JButton jButtonProcesarInformacionToolBarServicio;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoServicio;
	protected JMenuItem jMenuItemModificarServicio;
	protected JMenuItem jMenuItemActualizarServicio;
    protected JMenuItem jMenuItemEliminarServicio;
	protected JMenuItem jMenuItemCancelarServicio;
    protected JMenuItem jMenuItemGuardarCambiosServicio;
	protected JMenuItem jMenuItemGuardarCambiosTablaServicio;
	protected JMenuItem jMenuItemCerrarServicio;
	protected JMenuItem jMenuItemDetalleCerrarServicio;
	protected JMenuItem jMenuItemDetalleMostarOcultarServicio;
	
	protected JMenuItem jMenuItemProcesarInformacionServicio;
	protected JMenuItem jMenuItemNuevoGuardarCambiosServicio;
	protected JMenuItem jMenuItemMostrarOcultarServicio;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesServicio;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesServicio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesServicio;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioServicio;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidServicio;
	public JLabel jLabelIdServicio;
	public JLabel jLabelidServicio;
	public JButton jButtonidServicioBusqueda= new JButtonMe();

	public JPanel jPanelcodigoServicio;
	public JLabel jLabelcodigoServicio;
	public JTextArea jTextAreacodigoServicio;
	public JScrollPane jscrollPanecodigoServicio;
	public JButton jButtoncodigoServicioBusqueda= new JButtonMe();

	public JPanel jPanelnombreServicio;
	public JLabel jLabelnombreServicio;
	public JTextArea jTextAreanombreServicio;
	public JScrollPane jscrollPanenombreServicio;
	public JButton jButtonnombreServicioBusqueda= new JButtonMe();

	public JPanel jPanelivaServicio;
	public JLabel jLabelivaServicio;
	public JTextField jTextFieldivaServicio;
	public JButton jButtonivaServicioBusqueda= new JButtonMe();

	public JPanel jPaneliceServicio;
	public JLabel jLabeliceServicio;
	public JTextField jTextFieldiceServicio;
	public JButton jButtoniceServicioBusqueda= new JButtonMe();

	public JPanel jPaneles_bienServicio;
	public JLabel jLabeles_bienServicio;
	public JCheckBox jCheckBoxes_bienServicio;
	public JButton jButtones_bienServicioBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionServicio;
	public JLabel jLabeldescripcionServicio;
	public JTextArea jTextAreadescripcionServicio;
	public JScrollPane jscrollPanedescripcionServicio;
	public JButton jButtondescripcionServicioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaServicio;
	public JLabel jLabelid_empresaServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaServicio;
	public JButton jButtonid_empresaServicio= new JButtonMe();
	public JButton jButtonid_empresaServicioUpdate= new JButtonMe();
	public JButton jButtonid_empresaServicioBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_servicioServicio;
	public JLabel jLabelid_tipo_servicioServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_servicioServicio;
	public JButton jButtonid_tipo_servicioServicio= new JButtonMe();
	public JButton jButtonid_tipo_servicioServicioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_servicioServicioBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_servicioServicio;
	public JLabel jLabelid_estado_servicioServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_servicioServicio;
	public JButton jButtonid_estado_servicioServicio= new JButtonMe();
	public JButton jButtonid_estado_servicioServicioUpdate= new JButtonMe();
	public JButton jButtonid_estado_servicioServicioBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_gastoServicio;
	public JLabel jLabelid_cuenta_contable_gastoServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_gastoServicio;
	public JButton jButtonid_cuenta_contable_gastoServicio= new JButtonMe();
	public JButton jButtonid_cuenta_contable_gastoServicioUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_gastoServicioBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_gastoServicioArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_fiscalServicio;
	public JLabel jLabelid_cuenta_contable_fiscalServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_fiscalServicio;
	public JButton jButtonid_cuenta_contable_fiscalServicio= new JButtonMe();
	public JButton jButtonid_cuenta_contable_fiscalServicioUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_fiscalServicioBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_fiscalServicioArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_fiscal2Servicio;
	public JLabel jLabelid_cuenta_contable_fiscal2Servicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_fiscal2Servicio;
	public JButton jButtonid_cuenta_contable_fiscal2Servicio= new JButtonMe();
	public JButton jButtonid_cuenta_contable_fiscal2ServicioUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_fiscal2ServicioBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_fiscal2ServicioArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_retencionServicio;
	public JLabel jLabelid_cuenta_contable_retencionServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_retencionServicio;
	public JButton jButtonid_cuenta_contable_retencionServicio= new JButtonMe();
	public JButton jButtonid_cuenta_contable_retencionServicioUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_retencionServicioBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_retencionServicioArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_retencion2Servicio;
	public JLabel jLabelid_cuenta_contable_retencion2Servicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_retencion2Servicio;
	public JButton jButtonid_cuenta_contable_retencion2Servicio= new JButtonMe();
	public JButton jButtonid_cuenta_contable_retencion2ServicioUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_retencion2ServicioBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_retencion2ServicioArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_ivaServicio;
	public JLabel jLabelid_cuenta_contable_ivaServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_ivaServicio;
	public JButton jButtonid_cuenta_contable_ivaServicio= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ivaServicioUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ivaServicioBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ivaServicioArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_iva2Servicio;
	public JLabel jLabelid_cuenta_contable_iva2Servicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_iva2Servicio;
	public JButton jButtonid_cuenta_contable_iva2Servicio= new JButtonMe();
	public JButton jButtonid_cuenta_contable_iva2ServicioUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_iva2ServicioBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_iva2ServicioArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_creditoServicio;
	public JLabel jLabelid_cuenta_contable_creditoServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_creditoServicio;
	public JButton jButtonid_cuenta_contable_creditoServicio= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoServicioUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoServicioBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoServicioArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesServicio;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=1122;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ServicioDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposServicio=new JPanel();
				this.jPanelAccionesFormularioServicio=new JPanel();
				this.jmenuBarDetalleServicio=new JMenuBar();
				this.jTtoolBarDetalleServicio=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ServicioDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Servicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ServicioDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Servicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ServicioDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Servicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ServicioDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Servicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ServicioDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Servicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarServicio() {
		return this.jButtonActualizarToolBarServicio;
	}
	
	public JButton getjButtonEliminarToolBarServicio() {
		return this.jButtonEliminarToolBarServicio;
	}
	
	public JButton getjButtonCancelarToolBarServicio() {
		return this.jButtonCancelarToolBarServicio;
	}		
	
	public JButton getjButtonProcesarInformacionServicio() {
		return this.jButtonProcesarInformacionServicio;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionServicio)	{
		this.jButtonProcesarInformacionServicio = jButtonProcesarInformacionServicio;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesServicio() {
		return this.jComboBoxTiposAccionesServicio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesServicio(
			JComboBox jComboBoxTiposRelacionesServicio) {
		this.jComboBoxTiposRelacionesServicio = jComboBoxTiposRelacionesServicio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesServicio(
			JComboBox jComboBoxTiposAccionesServicio) {
		this.jComboBoxTiposAccionesServicio = jComboBoxTiposAccionesServicio;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioServicio() {
		return this.jComboBoxTiposAccionesFormularioServicio;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioServicio(
			JComboBox jComboBoxTiposAccionesFormularioServicio) {
		this.jComboBoxTiposAccionesFormularioServicio = jComboBoxTiposAccionesFormularioServicio;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.servicioSessionBean=new ServicioSessionBean();
		
		this.servicioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.servicioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.servicioSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ServicioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ServicioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ServicioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Servicio MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.servicioSessionBean.getEsGuardarRelacionado()) {
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
	
		ServicioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleServicio= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarServicio=new JButtonMe();
				this.jButtonModificarToolBarServicio=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarServicio,this.jTtoolBarDetalleServicio,
							"actualizar","actualizar","Actualizar"+" "+ServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarServicio,this.jTtoolBarDetalleServicio,
							"eliminar","eliminar","Eliminar"+" "+ServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarServicio,this.jTtoolBarDetalleServicio,
							"cancelar","cancelar","Cancelar"+" "+ServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarServicio,this.jTtoolBarDetalleServicio,
							"guardarcambios","guardarcambios","Guardar"+" "+ServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarServicio,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarServicio,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarServicio,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleServicio=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleServicio=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoServicio=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesServicio=new JMenuMe("Acciones");
		this.jmenuDetalleDatosServicio=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoServicio= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoServicio.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoServicio,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarServicio= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarServicio.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarServicio,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarServicio= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarServicio.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarServicio,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarServicio= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarServicio.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarServicio,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarServicio= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarServicio.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarServicio,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosServicio= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosServicio.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosServicio,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarServicio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarServicio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarServicio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarServicio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarServicio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarServicio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarServicio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarServicio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarServicio,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarServicio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarServicio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarServicio,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarServicio, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoServicio.add(this.jMenuItemDetalleCerrarServicio);
		
		this.jmenuDetalleAccionesServicio.add(this.jMenuItemActualizarServicio);
		this.jmenuDetalleAccionesServicio.add(this.jMenuItemEliminarServicio);
		this.jmenuDetalleAccionesServicio.add(this.jMenuItemCancelarServicio);		
		
		//this.jmenuDetalleDatosServicio.add(this.jMenuItemDetalleAbrirOrderByServicio);				
		this.jmenuDetalleDatosServicio.add(this.jMenuItemDetalleMostarOcultarServicio);				
				
		//this.jmenuDetalleAccionesServicio.add(this.jMenuItemGuardarCambiosServicio);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosServicio, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleServicio.add(this.jmenuDetalleArchivoServicio);		
		this.jmenuBarDetalleServicio.add(this.jmenuDetalleAccionesServicio);		
		this.jmenuBarDetalleServicio.add(this.jmenuDetalleDatosServicio);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleServicio);				
	}
	
	
	public void inicializarElementosCamposServicio() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdServicio = new JLabelMe();
		jLabelIdServicio.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidServicio = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidServicio.setToolTipText(ServicioConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutServicio= new GridBagLayout();

		this.jPanelidServicio.setLayout(this.gridaBagLayoutServicio);

		jLabelidServicio = new JLabel();
		jLabelidServicio.setText("Id");

		jLabelidServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoServicio = new JLabelMe();
		this.jLabelcodigoServicio.setText(""+ServicioConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoServicio.setToolTipText("Codigo");
		this.jLabelcodigoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoServicio.setToolTipText(ServicioConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutServicio = new GridBagLayout();
		this.jPanelcodigoServicio.setLayout(this.gridaBagLayoutServicio);


		jTextAreacodigoServicio= new JTextAreaMe();
		jTextAreacodigoServicio.setEnabled(false);
		jTextAreacodigoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoServicio.setLineWrap(true);
		jTextAreacodigoServicio.setWrapStyleWord(true);
		jTextAreacodigoServicio.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreacodigoServicio.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreacodigoServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanecodigoServicio = new JScrollPane(jTextAreacodigoServicio);
		jscrollPanecodigoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecodigoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecodigoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtoncodigoServicioBusqueda= new JButtonMe();
		this.jButtoncodigoServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoServicioBusqueda.setText("U");
		this.jButtoncodigoServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreacodigoServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreacodigoServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoServicioBusqueda"));

		if(this.servicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoServicioBusqueda.setVisible(false);		}


					
		this.jLabelnombreServicio = new JLabelMe();
		this.jLabelnombreServicio.setText(""+ServicioConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreServicio.setToolTipText("Nombre");
		this.jLabelnombreServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreServicio.setToolTipText(ServicioConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutServicio = new GridBagLayout();
		this.jPanelnombreServicio.setLayout(this.gridaBagLayoutServicio);


		jTextAreanombreServicio= new JTextAreaMe();
		jTextAreanombreServicio.setEnabled(false);
		jTextAreanombreServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreServicio.setLineWrap(true);
		jTextAreanombreServicio.setWrapStyleWord(true);
		jTextAreanombreServicio.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreServicio.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreServicio = new JScrollPane(jTextAreanombreServicio);
		jscrollPanenombreServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreServicioBusqueda= new JButtonMe();
		this.jButtonnombreServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreServicioBusqueda.setText("U");
		this.jButtonnombreServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreServicioBusqueda"));

		if(this.servicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreServicioBusqueda.setVisible(false);		}


					
		this.jLabelivaServicio = new JLabelMe();
		this.jLabelivaServicio.setText(""+ServicioConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaServicio.setToolTipText("Iva");
		this.jLabelivaServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaServicio.setToolTipText(ServicioConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutServicio = new GridBagLayout();
		this.jPanelivaServicio.setLayout(this.gridaBagLayoutServicio);


		jTextFieldivaServicio= new JTextFieldMe();
		jTextFieldivaServicio.setEnabled(false);
		jTextFieldivaServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaServicio.setText("0.0");

		this.jButtonivaServicioBusqueda= new JButtonMe();
		this.jButtonivaServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaServicioBusqueda.setText("U");
		this.jButtonivaServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaServicioBusqueda"));

		if(this.servicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaServicioBusqueda.setVisible(false);		}


					
		this.jLabeliceServicio = new JLabelMe();
		this.jLabeliceServicio.setText(""+ServicioConstantesFunciones.LABEL_ICE+" : *");
		this.jLabeliceServicio.setToolTipText("Ice");
		this.jLabeliceServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliceServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliceServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliceServicio.setToolTipText(ServicioConstantesFunciones.LABEL_ICE);
		this.gridaBagLayoutServicio = new GridBagLayout();
		this.jPaneliceServicio.setLayout(this.gridaBagLayoutServicio);


		jTextFieldiceServicio= new JTextFieldMe();
		jTextFieldiceServicio.setEnabled(false);
		jTextFieldiceServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiceServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiceServicio.setText("0.0");

		this.jButtoniceServicioBusqueda= new JButtonMe();
		this.jButtoniceServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniceServicioBusqueda.setText("U");
		this.jButtoniceServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniceServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniceServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiceServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiceServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iceServicioBusqueda"));

		if(this.servicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniceServicioBusqueda.setVisible(false);		}


					
		this.jLabeles_bienServicio = new JLabelMe();
		this.jLabeles_bienServicio.setText(""+ServicioConstantesFunciones.LABEL_ESBIEN+" : *");
		this.jLabeles_bienServicio.setToolTipText("Es Bien");
		this.jLabeles_bienServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_bienServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_bienServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_bienServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_bienServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_bienServicio.setToolTipText(ServicioConstantesFunciones.LABEL_ESBIEN);
		this.gridaBagLayoutServicio = new GridBagLayout();
		this.jPaneles_bienServicio.setLayout(this.gridaBagLayoutServicio);


		jCheckBoxes_bienServicio= new JCheckBoxMe();
		jCheckBoxes_bienServicio.setEnabled(false);

		jCheckBoxes_bienServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_bienServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_bienServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_bienServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_bienServicioBusqueda= new JButtonMe();
		this.jButtones_bienServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_bienServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_bienServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_bienServicioBusqueda.setText("U");
		this.jButtones_bienServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_bienServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_bienServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_bienServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_bienServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_bienServicioBusqueda"));

		if(this.servicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_bienServicioBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionServicio = new JLabelMe();
		this.jLabeldescripcionServicio.setText(""+ServicioConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionServicio.setToolTipText("Descripcion");
		this.jLabeldescripcionServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionServicio.setToolTipText(ServicioConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutServicio = new GridBagLayout();
		this.jPaneldescripcionServicio.setLayout(this.gridaBagLayoutServicio);


		jTextAreadescripcionServicio= new JTextAreaMe();
		jTextAreadescripcionServicio.setEnabled(false);
		jTextAreadescripcionServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionServicio.setLineWrap(true);
		jTextAreadescripcionServicio.setWrapStyleWord(true);
		jTextAreadescripcionServicio.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionServicio.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionServicio = new JScrollPane(jTextAreadescripcionServicio);
		jscrollPanedescripcionServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionServicioBusqueda= new JButtonMe();
		this.jButtondescripcionServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionServicioBusqueda.setText("U");
		this.jButtondescripcionServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionServicioBusqueda"));

		if(this.servicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionServicioBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysServicio() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaServicio = new JLabelMe();
		this.jLabelid_empresaServicio.setText(""+ServicioConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaServicio.setToolTipText("Empresa");
		this.jLabelid_empresaServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaServicio.setToolTipText(ServicioConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutServicio = new GridBagLayout();
		this.jPanelid_empresaServicio.setLayout(this.gridaBagLayoutServicio);


		jComboBoxid_empresaServicio= new JComboBoxMe();
		jComboBoxid_empresaServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaServicio,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaServicio.setEnabled(false);

		this.jButtonid_empresaServicio= new JButtonMe();
		this.jButtonid_empresaServicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaServicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaServicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaServicio.setText("Buscar");
		this.jButtonid_empresaServicio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaServicio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaServicio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaServicio"));

		this.jButtonid_empresaServicioBusqueda= new JButtonMe();
		this.jButtonid_empresaServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaServicioBusqueda.setText("U");
		this.jButtonid_empresaServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaServicioBusqueda"));

		if(this.servicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaServicioBusqueda.setVisible(false);		}

		this.jButtonid_empresaServicioUpdate= new JButtonMe();
		this.jButtonid_empresaServicioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaServicioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaServicioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaServicioUpdate.setText("U");
		this.jButtonid_empresaServicioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaServicioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaServicioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaServicioUpdate"));



					
		this.jLabelid_tipo_servicioServicio = new JLabelMe();
		this.jLabelid_tipo_servicioServicio.setText(""+ServicioConstantesFunciones.LABEL_IDTIPOSERVICIO+" : *");
		this.jLabelid_tipo_servicioServicio.setToolTipText("Tipo Servicio");
		this.jLabelid_tipo_servicioServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_servicioServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_servicioServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_servicioServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_servicioServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_servicioServicio.setToolTipText(ServicioConstantesFunciones.LABEL_IDTIPOSERVICIO);
		this.gridaBagLayoutServicio = new GridBagLayout();
		this.jPanelid_tipo_servicioServicio.setLayout(this.gridaBagLayoutServicio);


		jComboBoxid_tipo_servicioServicio= new JComboBoxMe();
		jComboBoxid_tipo_servicioServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_servicioServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_servicioServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_servicioServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_servicioServicio= new JButtonMe();
		this.jButtonid_tipo_servicioServicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_servicioServicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_servicioServicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_servicioServicio.setText("Buscar");
		this.jButtonid_tipo_servicioServicio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_servicioServicio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_servicioServicio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_servicioServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_servicioServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_servicioServicio"));

		this.jButtonid_tipo_servicioServicioBusqueda= new JButtonMe();
		this.jButtonid_tipo_servicioServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_servicioServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_servicioServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_servicioServicioBusqueda.setText("U");
		this.jButtonid_tipo_servicioServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_servicioServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_servicioServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_servicioServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_servicioServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_servicioServicioBusqueda"));

		if(this.servicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_servicioServicioBusqueda.setVisible(false);		}

		this.jButtonid_tipo_servicioServicioUpdate= new JButtonMe();
		this.jButtonid_tipo_servicioServicioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_servicioServicioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_servicioServicioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_servicioServicioUpdate.setText("U");
		this.jButtonid_tipo_servicioServicioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_servicioServicioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_servicioServicioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_servicioServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_servicioServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_servicioServicioUpdate"));



					
		this.jLabelid_estado_servicioServicio = new JLabelMe();
		this.jLabelid_estado_servicioServicio.setText(""+ServicioConstantesFunciones.LABEL_IDESTADOSERVICIO+" : *");
		this.jLabelid_estado_servicioServicio.setToolTipText("Estado Servicio");
		this.jLabelid_estado_servicioServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estado_servicioServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estado_servicioServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_servicioServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_servicioServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_servicioServicio.setToolTipText(ServicioConstantesFunciones.LABEL_IDESTADOSERVICIO);
		this.gridaBagLayoutServicio = new GridBagLayout();
		this.jPanelid_estado_servicioServicio.setLayout(this.gridaBagLayoutServicio);


		jComboBoxid_estado_servicioServicio= new JComboBoxMe();
		jComboBoxid_estado_servicioServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_servicioServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_servicioServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_servicioServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_servicioServicio= new JButtonMe();
		this.jButtonid_estado_servicioServicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_servicioServicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_servicioServicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_servicioServicio.setText("Buscar");
		this.jButtonid_estado_servicioServicio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_servicioServicio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_servicioServicio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_servicioServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_servicioServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_servicioServicio"));

		this.jButtonid_estado_servicioServicioBusqueda= new JButtonMe();
		this.jButtonid_estado_servicioServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_servicioServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_servicioServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_servicioServicioBusqueda.setText("U");
		this.jButtonid_estado_servicioServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_servicioServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_servicioServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_servicioServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_servicioServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_servicioServicioBusqueda"));

		if(this.servicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_servicioServicioBusqueda.setVisible(false);		}

		this.jButtonid_estado_servicioServicioUpdate= new JButtonMe();
		this.jButtonid_estado_servicioServicioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_servicioServicioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_servicioServicioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_servicioServicioUpdate.setText("U");
		this.jButtonid_estado_servicioServicioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_servicioServicioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_servicioServicioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_servicioServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_servicioServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_servicioServicioUpdate"));



					
		this.jLabelid_cuenta_contable_gastoServicio = new JLabelMe();
		this.jLabelid_cuenta_contable_gastoServicio.setText(""+ServicioConstantesFunciones.LABEL_IDCUENTACONTABLEGASTO+" : *");
		this.jLabelid_cuenta_contable_gastoServicio.setToolTipText("Cuenta C. Gasto");
		this.jLabelid_cuenta_contable_gastoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_gastoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_gastoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_gastoServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_gastoServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_gastoServicio.setToolTipText(ServicioConstantesFunciones.LABEL_IDCUENTACONTABLEGASTO);
		this.gridaBagLayoutServicio = new GridBagLayout();
		this.jPanelid_cuenta_contable_gastoServicio.setLayout(this.gridaBagLayoutServicio);


		jComboBoxid_cuenta_contable_gastoServicio= new JComboBoxMe();
		jComboBoxid_cuenta_contable_gastoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_gastoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_gastoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_gastoServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_gastoServicio= new JButtonMe();
		this.jButtonid_cuenta_contable_gastoServicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_gastoServicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_gastoServicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_gastoServicio.setText("Buscar");
		this.jButtonid_cuenta_contable_gastoServicio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_gastoServicio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_gastoServicio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_gastoServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_gastoServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_gastoServicio"));

		this.jButtonid_cuenta_contable_gastoServicioBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_gastoServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_gastoServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_gastoServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_gastoServicioBusqueda.setText("U");
		this.jButtonid_cuenta_contable_gastoServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_gastoServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_gastoServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_gastoServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_gastoServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_gastoServicioBusqueda"));

		if(this.servicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_gastoServicioBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_gastoServicioUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_gastoServicioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_gastoServicioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_gastoServicioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_gastoServicioUpdate.setText("U");
		this.jButtonid_cuenta_contable_gastoServicioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_gastoServicioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_gastoServicioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_gastoServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_gastoServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_gastoServicioUpdate"));


		jButtonid_cuenta_contable_gastoServicioArbol= new JButtonMe();
		jButtonid_cuenta_contable_gastoServicioArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_gastoServicioArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_gastoServicioArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_gastoServicioArbol.setText("Arbol");
		jButtonid_cuenta_contable_gastoServicioArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_gastoServicioArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_gastoServicioArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_gastoServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_gastoServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_gastoServicioArbol"));



					
		this.jLabelid_cuenta_contable_fiscalServicio = new JLabelMe();
		this.jLabelid_cuenta_contable_fiscalServicio.setText(""+ServicioConstantesFunciones.LABEL_IDCUENTACONTABLEFISCAL+" : *");
		this.jLabelid_cuenta_contable_fiscalServicio.setToolTipText("Cuenta C. Fiscal");
		this.jLabelid_cuenta_contable_fiscalServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_fiscalServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_fiscalServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_fiscalServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_fiscalServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_fiscalServicio.setToolTipText(ServicioConstantesFunciones.LABEL_IDCUENTACONTABLEFISCAL);
		this.gridaBagLayoutServicio = new GridBagLayout();
		this.jPanelid_cuenta_contable_fiscalServicio.setLayout(this.gridaBagLayoutServicio);


		jComboBoxid_cuenta_contable_fiscalServicio= new JComboBoxMe();
		jComboBoxid_cuenta_contable_fiscalServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_fiscalServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_fiscalServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_fiscalServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_fiscalServicio= new JButtonMe();
		this.jButtonid_cuenta_contable_fiscalServicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_fiscalServicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_fiscalServicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_fiscalServicio.setText("Buscar");
		this.jButtonid_cuenta_contable_fiscalServicio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_fiscalServicio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_fiscalServicio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_fiscalServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_fiscalServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_fiscalServicio"));

		this.jButtonid_cuenta_contable_fiscalServicioBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_fiscalServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_fiscalServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_fiscalServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_fiscalServicioBusqueda.setText("U");
		this.jButtonid_cuenta_contable_fiscalServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_fiscalServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_fiscalServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_fiscalServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_fiscalServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_fiscalServicioBusqueda"));

		if(this.servicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_fiscalServicioBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_fiscalServicioUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_fiscalServicioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_fiscalServicioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_fiscalServicioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_fiscalServicioUpdate.setText("U");
		this.jButtonid_cuenta_contable_fiscalServicioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_fiscalServicioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_fiscalServicioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_fiscalServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_fiscalServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_fiscalServicioUpdate"));


		jButtonid_cuenta_contable_fiscalServicioArbol= new JButtonMe();
		jButtonid_cuenta_contable_fiscalServicioArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_fiscalServicioArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_fiscalServicioArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_fiscalServicioArbol.setText("Arbol");
		jButtonid_cuenta_contable_fiscalServicioArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_fiscalServicioArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_fiscalServicioArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_fiscalServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_fiscalServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_fiscalServicioArbol"));



					
		this.jLabelid_cuenta_contable_fiscal2Servicio = new JLabelMe();
		this.jLabelid_cuenta_contable_fiscal2Servicio.setText(""+ServicioConstantesFunciones.LABEL_IDCUENTACONTABLEFISCAL2+" :");
		this.jLabelid_cuenta_contable_fiscal2Servicio.setToolTipText("Cuenta C. Fiscal 2");
		this.jLabelid_cuenta_contable_fiscal2Servicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_fiscal2Servicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_fiscal2Servicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_fiscal2Servicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_fiscal2Servicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_fiscal2Servicio.setToolTipText(ServicioConstantesFunciones.LABEL_IDCUENTACONTABLEFISCAL2);
		this.gridaBagLayoutServicio = new GridBagLayout();
		this.jPanelid_cuenta_contable_fiscal2Servicio.setLayout(this.gridaBagLayoutServicio);


		jComboBoxid_cuenta_contable_fiscal2Servicio= new JComboBoxMe();
		jComboBoxid_cuenta_contable_fiscal2Servicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_fiscal2Servicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_fiscal2Servicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_fiscal2Servicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_fiscal2Servicio= new JButtonMe();
		this.jButtonid_cuenta_contable_fiscal2Servicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_fiscal2Servicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_fiscal2Servicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_fiscal2Servicio.setText("Buscar");
		this.jButtonid_cuenta_contable_fiscal2Servicio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_fiscal2Servicio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_fiscal2Servicio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_fiscal2Servicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_fiscal2Servicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_fiscal2Servicio"));

		this.jButtonid_cuenta_contable_fiscal2ServicioBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_fiscal2ServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_fiscal2ServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_fiscal2ServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_fiscal2ServicioBusqueda.setText("U");
		this.jButtonid_cuenta_contable_fiscal2ServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_fiscal2ServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_fiscal2ServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_fiscal2Servicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_fiscal2Servicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_fiscal2ServicioBusqueda"));

		if(this.servicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_fiscal2ServicioBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_fiscal2ServicioUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_fiscal2ServicioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_fiscal2ServicioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_fiscal2ServicioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_fiscal2ServicioUpdate.setText("U");
		this.jButtonid_cuenta_contable_fiscal2ServicioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_fiscal2ServicioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_fiscal2ServicioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_fiscal2Servicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_fiscal2Servicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_fiscal2ServicioUpdate"));


		jButtonid_cuenta_contable_fiscal2ServicioArbol= new JButtonMe();
		jButtonid_cuenta_contable_fiscal2ServicioArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_fiscal2ServicioArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_fiscal2ServicioArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_fiscal2ServicioArbol.setText("Arbol");
		jButtonid_cuenta_contable_fiscal2ServicioArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_fiscal2ServicioArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_fiscal2ServicioArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_fiscal2Servicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_fiscal2Servicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_fiscal2ServicioArbol"));



					
		this.jLabelid_cuenta_contable_retencionServicio = new JLabelMe();
		this.jLabelid_cuenta_contable_retencionServicio.setText(""+ServicioConstantesFunciones.LABEL_IDCUENTACONTABLERETENCION+" : *");
		this.jLabelid_cuenta_contable_retencionServicio.setToolTipText("Cuenta C. Retencion");
		this.jLabelid_cuenta_contable_retencionServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_retencionServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_retencionServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_retencionServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_retencionServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_retencionServicio.setToolTipText(ServicioConstantesFunciones.LABEL_IDCUENTACONTABLERETENCION);
		this.gridaBagLayoutServicio = new GridBagLayout();
		this.jPanelid_cuenta_contable_retencionServicio.setLayout(this.gridaBagLayoutServicio);


		jComboBoxid_cuenta_contable_retencionServicio= new JComboBoxMe();
		jComboBoxid_cuenta_contable_retencionServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_retencionServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_retencionServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_retencionServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_retencionServicio= new JButtonMe();
		this.jButtonid_cuenta_contable_retencionServicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_retencionServicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_retencionServicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_retencionServicio.setText("Buscar");
		this.jButtonid_cuenta_contable_retencionServicio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_retencionServicio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_retencionServicio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_retencionServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_retencionServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_retencionServicio"));

		this.jButtonid_cuenta_contable_retencionServicioBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_retencionServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_retencionServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_retencionServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_retencionServicioBusqueda.setText("U");
		this.jButtonid_cuenta_contable_retencionServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_retencionServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_retencionServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_retencionServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_retencionServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_retencionServicioBusqueda"));

		if(this.servicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_retencionServicioBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_retencionServicioUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_retencionServicioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_retencionServicioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_retencionServicioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_retencionServicioUpdate.setText("U");
		this.jButtonid_cuenta_contable_retencionServicioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_retencionServicioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_retencionServicioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_retencionServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_retencionServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_retencionServicioUpdate"));


		jButtonid_cuenta_contable_retencionServicioArbol= new JButtonMe();
		jButtonid_cuenta_contable_retencionServicioArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_retencionServicioArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_retencionServicioArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_retencionServicioArbol.setText("Arbol");
		jButtonid_cuenta_contable_retencionServicioArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_retencionServicioArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_retencionServicioArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_retencionServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_retencionServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_retencionServicioArbol"));



					
		this.jLabelid_cuenta_contable_retencion2Servicio = new JLabelMe();
		this.jLabelid_cuenta_contable_retencion2Servicio.setText(""+ServicioConstantesFunciones.LABEL_IDCUENTACONTABLERETENCION2+" :");
		this.jLabelid_cuenta_contable_retencion2Servicio.setToolTipText("Cuenta C. Retencion 2");
		this.jLabelid_cuenta_contable_retencion2Servicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_retencion2Servicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_retencion2Servicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_retencion2Servicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_retencion2Servicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_retencion2Servicio.setToolTipText(ServicioConstantesFunciones.LABEL_IDCUENTACONTABLERETENCION2);
		this.gridaBagLayoutServicio = new GridBagLayout();
		this.jPanelid_cuenta_contable_retencion2Servicio.setLayout(this.gridaBagLayoutServicio);


		jComboBoxid_cuenta_contable_retencion2Servicio= new JComboBoxMe();
		jComboBoxid_cuenta_contable_retencion2Servicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_retencion2Servicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_retencion2Servicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_retencion2Servicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_retencion2Servicio= new JButtonMe();
		this.jButtonid_cuenta_contable_retencion2Servicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_retencion2Servicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_retencion2Servicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_retencion2Servicio.setText("Buscar");
		this.jButtonid_cuenta_contable_retencion2Servicio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_retencion2Servicio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_retencion2Servicio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_retencion2Servicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_retencion2Servicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_retencion2Servicio"));

		this.jButtonid_cuenta_contable_retencion2ServicioBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_retencion2ServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_retencion2ServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_retencion2ServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_retencion2ServicioBusqueda.setText("U");
		this.jButtonid_cuenta_contable_retencion2ServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_retencion2ServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_retencion2ServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_retencion2Servicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_retencion2Servicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_retencion2ServicioBusqueda"));

		if(this.servicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_retencion2ServicioBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_retencion2ServicioUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_retencion2ServicioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_retencion2ServicioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_retencion2ServicioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_retencion2ServicioUpdate.setText("U");
		this.jButtonid_cuenta_contable_retencion2ServicioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_retencion2ServicioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_retencion2ServicioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_retencion2Servicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_retencion2Servicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_retencion2ServicioUpdate"));


		jButtonid_cuenta_contable_retencion2ServicioArbol= new JButtonMe();
		jButtonid_cuenta_contable_retencion2ServicioArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_retencion2ServicioArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_retencion2ServicioArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_retencion2ServicioArbol.setText("Arbol");
		jButtonid_cuenta_contable_retencion2ServicioArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_retencion2ServicioArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_retencion2ServicioArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_retencion2Servicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_retencion2Servicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_retencion2ServicioArbol"));



					
		this.jLabelid_cuenta_contable_ivaServicio = new JLabelMe();
		this.jLabelid_cuenta_contable_ivaServicio.setText(""+ServicioConstantesFunciones.LABEL_IDCUENTACONTABLEIVA+" : *");
		this.jLabelid_cuenta_contable_ivaServicio.setToolTipText("Cuenta C. Iva");
		this.jLabelid_cuenta_contable_ivaServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_contable_ivaServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_contable_ivaServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_ivaServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_ivaServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_ivaServicio.setToolTipText(ServicioConstantesFunciones.LABEL_IDCUENTACONTABLEIVA);
		this.gridaBagLayoutServicio = new GridBagLayout();
		this.jPanelid_cuenta_contable_ivaServicio.setLayout(this.gridaBagLayoutServicio);


		jComboBoxid_cuenta_contable_ivaServicio= new JComboBoxMe();
		jComboBoxid_cuenta_contable_ivaServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ivaServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ivaServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_ivaServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_ivaServicio= new JButtonMe();
		this.jButtonid_cuenta_contable_ivaServicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ivaServicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ivaServicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ivaServicio.setText("Buscar");
		this.jButtonid_cuenta_contable_ivaServicio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_ivaServicio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ivaServicio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_ivaServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ivaServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ivaServicio"));

		this.jButtonid_cuenta_contable_ivaServicioBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_ivaServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ivaServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ivaServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_ivaServicioBusqueda.setText("U");
		this.jButtonid_cuenta_contable_ivaServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_ivaServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ivaServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_ivaServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ivaServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ivaServicioBusqueda"));

		if(this.servicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_ivaServicioBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_ivaServicioUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_ivaServicioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ivaServicioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ivaServicioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_ivaServicioUpdate.setText("U");
		this.jButtonid_cuenta_contable_ivaServicioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_ivaServicioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ivaServicioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_ivaServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ivaServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ivaServicioUpdate"));


		jButtonid_cuenta_contable_ivaServicioArbol= new JButtonMe();
		jButtonid_cuenta_contable_ivaServicioArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ivaServicioArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ivaServicioArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ivaServicioArbol.setText("Arbol");
		jButtonid_cuenta_contable_ivaServicioArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_ivaServicioArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ivaServicioArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_ivaServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ivaServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ivaServicioArbol"));



					
		this.jLabelid_cuenta_contable_iva2Servicio = new JLabelMe();
		this.jLabelid_cuenta_contable_iva2Servicio.setText(""+ServicioConstantesFunciones.LABEL_IDCUENTACONTABLEIVA2+" :");
		this.jLabelid_cuenta_contable_iva2Servicio.setToolTipText("Cuenta C. Iva 2");
		this.jLabelid_cuenta_contable_iva2Servicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_iva2Servicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_iva2Servicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_iva2Servicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_iva2Servicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_iva2Servicio.setToolTipText(ServicioConstantesFunciones.LABEL_IDCUENTACONTABLEIVA2);
		this.gridaBagLayoutServicio = new GridBagLayout();
		this.jPanelid_cuenta_contable_iva2Servicio.setLayout(this.gridaBagLayoutServicio);


		jComboBoxid_cuenta_contable_iva2Servicio= new JComboBoxMe();
		jComboBoxid_cuenta_contable_iva2Servicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_iva2Servicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_iva2Servicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_iva2Servicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_iva2Servicio= new JButtonMe();
		this.jButtonid_cuenta_contable_iva2Servicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_iva2Servicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_iva2Servicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_iva2Servicio.setText("Buscar");
		this.jButtonid_cuenta_contable_iva2Servicio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_iva2Servicio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_iva2Servicio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_iva2Servicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_iva2Servicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_iva2Servicio"));

		this.jButtonid_cuenta_contable_iva2ServicioBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_iva2ServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_iva2ServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_iva2ServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_iva2ServicioBusqueda.setText("U");
		this.jButtonid_cuenta_contable_iva2ServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_iva2ServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_iva2ServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_iva2Servicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_iva2Servicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_iva2ServicioBusqueda"));

		if(this.servicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_iva2ServicioBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_iva2ServicioUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_iva2ServicioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_iva2ServicioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_iva2ServicioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_iva2ServicioUpdate.setText("U");
		this.jButtonid_cuenta_contable_iva2ServicioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_iva2ServicioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_iva2ServicioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_iva2Servicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_iva2Servicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_iva2ServicioUpdate"));


		jButtonid_cuenta_contable_iva2ServicioArbol= new JButtonMe();
		jButtonid_cuenta_contable_iva2ServicioArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_iva2ServicioArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_iva2ServicioArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_iva2ServicioArbol.setText("Arbol");
		jButtonid_cuenta_contable_iva2ServicioArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_iva2ServicioArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_iva2ServicioArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_iva2Servicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_iva2Servicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_iva2ServicioArbol"));



					
		this.jLabelid_cuenta_contable_creditoServicio = new JLabelMe();
		this.jLabelid_cuenta_contable_creditoServicio.setText(""+ServicioConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO+" : *");
		this.jLabelid_cuenta_contable_creditoServicio.setToolTipText("Cuenta C. Credito");
		this.jLabelid_cuenta_contable_creditoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_creditoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_creditoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_creditoServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_creditoServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_creditoServicio.setToolTipText(ServicioConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
		this.gridaBagLayoutServicio = new GridBagLayout();
		this.jPanelid_cuenta_contable_creditoServicio.setLayout(this.gridaBagLayoutServicio);


		jComboBoxid_cuenta_contable_creditoServicio= new JComboBoxMe();
		jComboBoxid_cuenta_contable_creditoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_creditoServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_creditoServicio= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoServicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoServicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoServicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoServicio.setText("Buscar");
		this.jButtonid_cuenta_contable_creditoServicio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_creditoServicio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoServicio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_creditoServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoServicio"));

		this.jButtonid_cuenta_contable_creditoServicioBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_creditoServicioBusqueda.setText("U");
		this.jButtonid_cuenta_contable_creditoServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_creditoServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_creditoServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoServicioBusqueda"));

		if(this.servicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_creditoServicioBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_creditoServicioUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoServicioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoServicioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoServicioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_creditoServicioUpdate.setText("U");
		this.jButtonid_cuenta_contable_creditoServicioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_creditoServicioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoServicioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_creditoServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoServicioUpdate"));


		jButtonid_cuenta_contable_creditoServicioArbol= new JButtonMe();
		jButtonid_cuenta_contable_creditoServicioArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoServicioArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoServicioArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoServicioArbol.setText("Arbol");
		jButtonid_cuenta_contable_creditoServicioArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_creditoServicioArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoServicioArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_creditoServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoServicioArbol"));



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
		//this.jInternalFrameDetalleServicio = new ServicioBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Servicio DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutServicio= new GridBagLayout();
		

		
		String sToolTipServicio="";
		sToolTipServicio=ServicioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipServicio+="(Inventario.Servicio)";
		}
		
		if(!this.servicioSessionBean.getEsGuardarRelacionado()) {
			sToolTipServicio+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoServicio = new JButtonMe();
		this.jButtonModificarServicio = new JButtonMe();
        this.jButtonActualizarServicio = new JButtonMe();
        this.jButtonEliminarServicio = new JButtonMe();
        this.jButtonCancelarServicio = new JButtonMe();
        this.jButtonGuardarCambiosServicio = new JButtonMe();
		this.jButtonGuardarCambiosTablaServicio = new JButtonMe();
		this.jButtonCerrarServicio = new JButtonMe();
		
		this.jScrollPanelDatosServicio = new JScrollPane();   
        this.jScrollPanelDatosEdicionServicio = new JScrollPane();
		this.jScrollPanelDatosGeneralServicio = new JScrollPane();
				
		
		
		this.jPanelCamposServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		this.jTabbedPaneCamposServicio=new JTabbedPane();
		
		
		this.jTabbedPaneCamposServicio.setBorder(javax.swing.BorderFactory.createEmptyBorder());//javax.swing.BorderFactory.createTitledBorder("Campos")
		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneCamposServicio,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocuenta_contableServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Servicio";
		
		if(!this.servicioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Servicioes" + this.sPath));
		} else {
			this.jScrollPanelDatosServicio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposServicio.setName("jPanelCamposServicio"); 

		this.jPanelCamposOcultosServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosServicio.setName("jPanelCamposOcultosServicio"); 

        this.jPanelAccionesServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesServicio.setToolTipText("Acciones");
        this.jPanelAccionesServicio.setName("Acciones"); 

		this.jPanelAccionesFormularioServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioServicio.setToolTipText("Acciones");
        this.jPanelAccionesFormularioServicio.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionServicio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralServicio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosServicio, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposServicio, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosServicio, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioServicio, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralServicio.setName("jPanelCamposFingeneralServicio");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralServicio, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocuenta_contableServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuenta Contable"));
		this.jPanelCamposIniciocuenta_contableServicio.setName("jPanelCamposFincuenta_contableServicio");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocuenta_contableServicio, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoServicio.setText("Nuevo");
		this.jButtonModificarServicio.setText("Editar");
        this.jButtonActualizarServicio.setText("Actualizar");
        this.jButtonEliminarServicio.setText("Eliminar");
        this.jButtonCancelarServicio.setText("Cancelar");
        this.jButtonGuardarCambiosServicio.setText("Guardar");
		this.jButtonGuardarCambiosTablaServicio.setText("Guardar");
		this.jButtonCerrarServicio.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoServicio,"nuevo_button","Nuevo",this.servicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarServicio,"modificar_button","Editar",this.servicioSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarServicio,"actualizar_button","Actualizar",this.servicioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarServicio,"eliminar_button","Eliminar",this.servicioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarServicio,"cancelar_button","Cancelar",this.servicioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosServicio,"guardarcambios_button","Guardar",this.servicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaServicio,"guardarcambiostabla_button","Guardar",this.servicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarServicio,"cerrar_button","Salir",this.servicioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarServicio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarServicio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarServicio, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoServicio.setToolTipText("Nuevo"+" "+ServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarServicio.setToolTipText("Editar"+" "+ServicioConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarServicio.setToolTipText("Actualizar"+" "+ServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarServicio.setToolTipText("Eliminar)"+" "+ServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarServicio.setToolTipText("Cancelar"+" "+ServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosServicio.setToolTipText("Guardar"+" "+ServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaServicio.setToolTipText("Guardar"+" "+ServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarServicio.setToolTipText("Salir"+" "+ServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoServicio";
		inputMap = this.jButtonNuevoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoServicio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoServicio"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarServicio";
		inputMap = this.jButtonActualizarServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarServicio"));
		
		//ELIMINAR
		sMapKey = "EliminarServicio";
		inputMap = this.jButtonEliminarServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarServicio"));
		
		//CANCELAR	
		sMapKey = "CancelarServicio";
		inputMap = this.jButtonCancelarServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarServicio"));
		
		//CERRAR		
		sMapKey = "CerrarServicio";
		inputMap = this.jButtonCerrarServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarServicio"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaServicio";
		inputMap = this.jButtonGuardarCambiosTablaServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaServicio"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoServicio = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoServicio.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoServicio.setToolTipText("Nuevo Servicio");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarServicio = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarServicio.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarServicio.setToolTipText("Sin Cerrar Ventana Servicio");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarServicio, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeServicio = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeServicio.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeServicio.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeServicio, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesServicio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesServicio.setText("Accion");
		this.jComboBoxTiposAccionesServicio.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioServicio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioServicio.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioServicio.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesServicio = new JLabelMe();
		
		this.jLabelAccionesServicio.setText("Acciones");		
		this.jLabelAccionesServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposServicio();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysServicio();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesServicio=new JTabbedPane();
		this.jTabbedPaneRelacionesServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesServicio,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesServicio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesServicio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesServicio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioServicio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioServicio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioServicio.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioServicio, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposServicio = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosServicio = new GridBagLayout();
		
		this.jPanelCamposServicio.setLayout(gridaBagLayoutCamposServicio);
		this.jPanelCamposOcultosServicio.setLayout(gridaBagLayoutCamposOcultosServicio);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralServicio= new GridBagLayout();
		this.jPanelCamposIniciogeneralServicio.setLayout(gridaBagLayoutCamposIniciogeneralServicio);

		GridBagLayout gridaBagLayoutCamposIniciocuenta_contableServicio= new GridBagLayout();
		this.jPanelCamposIniciocuenta_contableServicio.setLayout(gridaBagLayoutCamposIniciocuenta_contableServicio);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 0;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidServicio.add(jLabelIdServicio, this.gridBagConstraintsServicio);



	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 1;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidServicio.add(jLabelidServicio, this.gridBagConstraintsServicio);


	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 0;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaServicio.add(jLabelid_empresaServicio, this.gridBagConstraintsServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicio = new GridBagConstraints();
		//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = 0;
		this.gridBagConstraintsServicio.gridx = 2;
		this.gridBagConstraintsServicio.ipadx = 0;
		this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaServicio.add(jButtonid_empresaServicioBusqueda, this.gridBagConstraintsServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicio = new GridBagConstraints();
		//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = 0;
		this.gridBagConstraintsServicio.gridx = 3;
		this.gridBagConstraintsServicio.ipadx = 0;
		this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaServicio.add(jButtonid_empresaServicioUpdate, this.gridBagConstraintsServicio);
	}

	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 1;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaServicio.add(jComboBoxid_empresaServicio, this.gridBagConstraintsServicio);


	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 0;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_servicioServicio.add(jLabelid_tipo_servicioServicio, this.gridBagConstraintsServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicio = new GridBagConstraints();
		//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = 0;
		this.gridBagConstraintsServicio.gridx = 2;
		this.gridBagConstraintsServicio.ipadx = 0;
		this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_servicioServicio.add(jButtonid_tipo_servicioServicioBusqueda, this.gridBagConstraintsServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicio = new GridBagConstraints();
		//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = 0;
		this.gridBagConstraintsServicio.gridx = 3;
		this.gridBagConstraintsServicio.ipadx = 0;
		this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_servicioServicio.add(jButtonid_tipo_servicioServicioUpdate, this.gridBagConstraintsServicio);
	}

	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 1;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_servicioServicio.add(jComboBoxid_tipo_servicioServicio, this.gridBagConstraintsServicio);


	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 0;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoServicio.add(jLabelcodigoServicio, this.gridBagConstraintsServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicio = new GridBagConstraints();
		//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = 0;
		this.gridBagConstraintsServicio.gridx = 2;
		this.gridBagConstraintsServicio.ipadx = 0;
		this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoServicio.add(jButtoncodigoServicioBusqueda, this.gridBagConstraintsServicio);
	}

	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 1;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoServicio.add(jscrollPanecodigoServicio, this.gridBagConstraintsServicio);


	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 0;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreServicio.add(jLabelnombreServicio, this.gridBagConstraintsServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicio = new GridBagConstraints();
		//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = 0;
		this.gridBagConstraintsServicio.gridx = 2;
		this.gridBagConstraintsServicio.ipadx = 0;
		this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreServicio.add(jButtonnombreServicioBusqueda, this.gridBagConstraintsServicio);
	}

	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 1;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreServicio.add(jscrollPanenombreServicio, this.gridBagConstraintsServicio);


	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 0;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaServicio.add(jLabelivaServicio, this.gridBagConstraintsServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicio = new GridBagConstraints();
		//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = 0;
		this.gridBagConstraintsServicio.gridx = 2;
		this.gridBagConstraintsServicio.ipadx = 0;
		this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaServicio.add(jButtonivaServicioBusqueda, this.gridBagConstraintsServicio);
	}

	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 1;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaServicio.add(jTextFieldivaServicio, this.gridBagConstraintsServicio);


	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 0;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneliceServicio.add(jLabeliceServicio, this.gridBagConstraintsServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicio = new GridBagConstraints();
		//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = 0;
		this.gridBagConstraintsServicio.gridx = 2;
		this.gridBagConstraintsServicio.ipadx = 0;
		this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
		this.jPaneliceServicio.add(jButtoniceServicioBusqueda, this.gridBagConstraintsServicio);
	}

	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 1;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneliceServicio.add(jTextFieldiceServicio, this.gridBagConstraintsServicio);


	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 0;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_bienServicio.add(jLabeles_bienServicio, this.gridBagConstraintsServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicio = new GridBagConstraints();
		//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = 0;
		this.gridBagConstraintsServicio.gridx = 2;
		this.gridBagConstraintsServicio.ipadx = 0;
		this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_bienServicio.add(jButtones_bienServicioBusqueda, this.gridBagConstraintsServicio);
	}

	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 1;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_bienServicio.add(jCheckBoxes_bienServicio, this.gridBagConstraintsServicio);


	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 0;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_servicioServicio.add(jLabelid_estado_servicioServicio, this.gridBagConstraintsServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicio = new GridBagConstraints();
		//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = 0;
		this.gridBagConstraintsServicio.gridx = 2;
		this.gridBagConstraintsServicio.ipadx = 0;
		this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_servicioServicio.add(jButtonid_estado_servicioServicioBusqueda, this.gridBagConstraintsServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicio = new GridBagConstraints();
		//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = 0;
		this.gridBagConstraintsServicio.gridx = 3;
		this.gridBagConstraintsServicio.ipadx = 0;
		this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_servicioServicio.add(jButtonid_estado_servicioServicioUpdate, this.gridBagConstraintsServicio);
	}

	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 1;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_servicioServicio.add(jComboBoxid_estado_servicioServicio, this.gridBagConstraintsServicio);


	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 0;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionServicio.add(jLabeldescripcionServicio, this.gridBagConstraintsServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicio = new GridBagConstraints();
		//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = 0;
		this.gridBagConstraintsServicio.gridx = 2;
		this.gridBagConstraintsServicio.ipadx = 0;
		this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionServicio.add(jButtondescripcionServicioBusqueda, this.gridBagConstraintsServicio);
	}

	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 1;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionServicio.add(jscrollPanedescripcionServicio, this.gridBagConstraintsServicio);


	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 0;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_gastoServicio.add(jLabelid_cuenta_contable_gastoServicio, this.gridBagConstraintsServicio);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsServicio = new GridBagConstraints();
	//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 2;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_gastoServicio.add(jButtonid_cuenta_contable_gastoServicio, this.gridBagConstraintsServicio);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsServicio = new GridBagConstraints();
	//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 3;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_gastoServicio.add(jButtonid_cuenta_contable_gastoServicioArbol, this.gridBagConstraintsServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicio = new GridBagConstraints();
		//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = 0;
		this.gridBagConstraintsServicio.gridx = 4;
		this.gridBagConstraintsServicio.ipadx = 0;
		this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_gastoServicio.add(jButtonid_cuenta_contable_gastoServicioBusqueda, this.gridBagConstraintsServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicio = new GridBagConstraints();
		//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = 0;
		this.gridBagConstraintsServicio.gridx = 5;
		this.gridBagConstraintsServicio.ipadx = 0;
		this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_gastoServicio.add(jButtonid_cuenta_contable_gastoServicioUpdate, this.gridBagConstraintsServicio);
	}

	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 1;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_gastoServicio.add(jComboBoxid_cuenta_contable_gastoServicio, this.gridBagConstraintsServicio);


	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 0;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_fiscalServicio.add(jLabelid_cuenta_contable_fiscalServicio, this.gridBagConstraintsServicio);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsServicio = new GridBagConstraints();
	//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 2;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_fiscalServicio.add(jButtonid_cuenta_contable_fiscalServicio, this.gridBagConstraintsServicio);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsServicio = new GridBagConstraints();
	//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 3;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_fiscalServicio.add(jButtonid_cuenta_contable_fiscalServicioArbol, this.gridBagConstraintsServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicio = new GridBagConstraints();
		//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = 0;
		this.gridBagConstraintsServicio.gridx = 4;
		this.gridBagConstraintsServicio.ipadx = 0;
		this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_fiscalServicio.add(jButtonid_cuenta_contable_fiscalServicioBusqueda, this.gridBagConstraintsServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicio = new GridBagConstraints();
		//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = 0;
		this.gridBagConstraintsServicio.gridx = 5;
		this.gridBagConstraintsServicio.ipadx = 0;
		this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_fiscalServicio.add(jButtonid_cuenta_contable_fiscalServicioUpdate, this.gridBagConstraintsServicio);
	}

	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 1;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_fiscalServicio.add(jComboBoxid_cuenta_contable_fiscalServicio, this.gridBagConstraintsServicio);


	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 0;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_fiscal2Servicio.add(jLabelid_cuenta_contable_fiscal2Servicio, this.gridBagConstraintsServicio);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsServicio = new GridBagConstraints();
	//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 2;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_fiscal2Servicio.add(jButtonid_cuenta_contable_fiscal2Servicio, this.gridBagConstraintsServicio);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsServicio = new GridBagConstraints();
	//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 3;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_fiscal2Servicio.add(jButtonid_cuenta_contable_fiscal2ServicioArbol, this.gridBagConstraintsServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicio = new GridBagConstraints();
		//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = 0;
		this.gridBagConstraintsServicio.gridx = 4;
		this.gridBagConstraintsServicio.ipadx = 0;
		this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_fiscal2Servicio.add(jButtonid_cuenta_contable_fiscal2ServicioBusqueda, this.gridBagConstraintsServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicio = new GridBagConstraints();
		//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = 0;
		this.gridBagConstraintsServicio.gridx = 5;
		this.gridBagConstraintsServicio.ipadx = 0;
		this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_fiscal2Servicio.add(jButtonid_cuenta_contable_fiscal2ServicioUpdate, this.gridBagConstraintsServicio);
	}

	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 1;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_fiscal2Servicio.add(jComboBoxid_cuenta_contable_fiscal2Servicio, this.gridBagConstraintsServicio);


	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 0;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_retencionServicio.add(jLabelid_cuenta_contable_retencionServicio, this.gridBagConstraintsServicio);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsServicio = new GridBagConstraints();
	//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 2;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_retencionServicio.add(jButtonid_cuenta_contable_retencionServicio, this.gridBagConstraintsServicio);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsServicio = new GridBagConstraints();
	//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 3;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_retencionServicio.add(jButtonid_cuenta_contable_retencionServicioArbol, this.gridBagConstraintsServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicio = new GridBagConstraints();
		//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = 0;
		this.gridBagConstraintsServicio.gridx = 4;
		this.gridBagConstraintsServicio.ipadx = 0;
		this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_retencionServicio.add(jButtonid_cuenta_contable_retencionServicioBusqueda, this.gridBagConstraintsServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicio = new GridBagConstraints();
		//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = 0;
		this.gridBagConstraintsServicio.gridx = 5;
		this.gridBagConstraintsServicio.ipadx = 0;
		this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_retencionServicio.add(jButtonid_cuenta_contable_retencionServicioUpdate, this.gridBagConstraintsServicio);
	}

	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 1;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_retencionServicio.add(jComboBoxid_cuenta_contable_retencionServicio, this.gridBagConstraintsServicio);


	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 0;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_retencion2Servicio.add(jLabelid_cuenta_contable_retencion2Servicio, this.gridBagConstraintsServicio);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsServicio = new GridBagConstraints();
	//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 2;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_retencion2Servicio.add(jButtonid_cuenta_contable_retencion2Servicio, this.gridBagConstraintsServicio);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsServicio = new GridBagConstraints();
	//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 3;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_retencion2Servicio.add(jButtonid_cuenta_contable_retencion2ServicioArbol, this.gridBagConstraintsServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicio = new GridBagConstraints();
		//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = 0;
		this.gridBagConstraintsServicio.gridx = 4;
		this.gridBagConstraintsServicio.ipadx = 0;
		this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_retencion2Servicio.add(jButtonid_cuenta_contable_retencion2ServicioBusqueda, this.gridBagConstraintsServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicio = new GridBagConstraints();
		//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = 0;
		this.gridBagConstraintsServicio.gridx = 5;
		this.gridBagConstraintsServicio.ipadx = 0;
		this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_retencion2Servicio.add(jButtonid_cuenta_contable_retencion2ServicioUpdate, this.gridBagConstraintsServicio);
	}

	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 1;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_retencion2Servicio.add(jComboBoxid_cuenta_contable_retencion2Servicio, this.gridBagConstraintsServicio);


	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 0;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_ivaServicio.add(jLabelid_cuenta_contable_ivaServicio, this.gridBagConstraintsServicio);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsServicio = new GridBagConstraints();
	//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 2;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_ivaServicio.add(jButtonid_cuenta_contable_ivaServicio, this.gridBagConstraintsServicio);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsServicio = new GridBagConstraints();
	//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 3;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_ivaServicio.add(jButtonid_cuenta_contable_ivaServicioArbol, this.gridBagConstraintsServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicio = new GridBagConstraints();
		//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = 0;
		this.gridBagConstraintsServicio.gridx = 4;
		this.gridBagConstraintsServicio.ipadx = 0;
		this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_ivaServicio.add(jButtonid_cuenta_contable_ivaServicioBusqueda, this.gridBagConstraintsServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicio = new GridBagConstraints();
		//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = 0;
		this.gridBagConstraintsServicio.gridx = 5;
		this.gridBagConstraintsServicio.ipadx = 0;
		this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_ivaServicio.add(jButtonid_cuenta_contable_ivaServicioUpdate, this.gridBagConstraintsServicio);
	}

	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 1;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_ivaServicio.add(jComboBoxid_cuenta_contable_ivaServicio, this.gridBagConstraintsServicio);


	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 0;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_iva2Servicio.add(jLabelid_cuenta_contable_iva2Servicio, this.gridBagConstraintsServicio);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsServicio = new GridBagConstraints();
	//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 2;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_iva2Servicio.add(jButtonid_cuenta_contable_iva2Servicio, this.gridBagConstraintsServicio);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsServicio = new GridBagConstraints();
	//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 3;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_iva2Servicio.add(jButtonid_cuenta_contable_iva2ServicioArbol, this.gridBagConstraintsServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicio = new GridBagConstraints();
		//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = 0;
		this.gridBagConstraintsServicio.gridx = 4;
		this.gridBagConstraintsServicio.ipadx = 0;
		this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_iva2Servicio.add(jButtonid_cuenta_contable_iva2ServicioBusqueda, this.gridBagConstraintsServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicio = new GridBagConstraints();
		//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = 0;
		this.gridBagConstraintsServicio.gridx = 5;
		this.gridBagConstraintsServicio.ipadx = 0;
		this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_iva2Servicio.add(jButtonid_cuenta_contable_iva2ServicioUpdate, this.gridBagConstraintsServicio);
	}

	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 1;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_iva2Servicio.add(jComboBoxid_cuenta_contable_iva2Servicio, this.gridBagConstraintsServicio);


	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 0;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_creditoServicio.add(jLabelid_cuenta_contable_creditoServicio, this.gridBagConstraintsServicio);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsServicio = new GridBagConstraints();
	//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 2;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_creditoServicio.add(jButtonid_cuenta_contable_creditoServicio, this.gridBagConstraintsServicio);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsServicio = new GridBagConstraints();
	//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 3;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_creditoServicio.add(jButtonid_cuenta_contable_creditoServicioArbol, this.gridBagConstraintsServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicio = new GridBagConstraints();
		//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = 0;
		this.gridBagConstraintsServicio.gridx = 4;
		this.gridBagConstraintsServicio.ipadx = 0;
		this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_creditoServicio.add(jButtonid_cuenta_contable_creditoServicioBusqueda, this.gridBagConstraintsServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicio = new GridBagConstraints();
		//this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = 0;
		this.gridBagConstraintsServicio.gridx = 5;
		this.gridBagConstraintsServicio.ipadx = 0;
		this.gridBagConstraintsServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_creditoServicio.add(jButtonid_cuenta_contable_creditoServicioUpdate, this.gridBagConstraintsServicio);
	}

	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicio.gridy = 0;
	this.gridBagConstraintsServicio.gridx = 1;
	this.gridBagConstraintsServicio.ipadx = 0;
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_creditoServicio.add(jComboBoxid_cuenta_contable_creditoServicio, this.gridBagConstraintsServicio);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicio.gridy = iYPanelCamposOcultosServicio;
	this.gridBagConstraintsServicio.gridx = iXPanelCamposOcultosServicio++;
	this.gridBagConstraintsServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosServicio.add(this.jPanelid_empresaServicio, this.gridBagConstraintsServicio);



	if(iXPanelCamposOcultosServicio % 1==0) {
		iXPanelCamposOcultosServicio=0;
		iYPanelCamposOcultosServicio++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicio.gridy = iYPanelCamposIniciogeneralServicio;
	this.gridBagConstraintsServicio.gridx = iXPanelCamposIniciogeneralServicio++;
	this.gridBagConstraintsServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralServicio.add(this.jPanelidServicio, this.gridBagConstraintsServicio);



	if(iXPanelCamposIniciogeneralServicio % 1==0) {
		iXPanelCamposIniciogeneralServicio=0;
		iYPanelCamposIniciogeneralServicio++;
	}
	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicio.gridy = iYPanelCamposIniciogeneralServicio;
	this.gridBagConstraintsServicio.gridx = iXPanelCamposIniciogeneralServicio++;
	this.gridBagConstraintsServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralServicio.add(this.jPanelid_tipo_servicioServicio, this.gridBagConstraintsServicio);



	if(iXPanelCamposIniciogeneralServicio % 1==0) {
		iXPanelCamposIniciogeneralServicio=0;
		iYPanelCamposIniciogeneralServicio++;
	}
	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicio.gridy = iYPanelCamposIniciogeneralServicio;
	this.gridBagConstraintsServicio.gridx = iXPanelCamposIniciogeneralServicio++;
	this.gridBagConstraintsServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralServicio.add(this.jPanelcodigoServicio, this.gridBagConstraintsServicio);



	if(iXPanelCamposIniciogeneralServicio % 1==0) {
		iXPanelCamposIniciogeneralServicio=0;
		iYPanelCamposIniciogeneralServicio++;
	}
	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicio.gridy = iYPanelCamposIniciogeneralServicio;
	this.gridBagConstraintsServicio.gridx = iXPanelCamposIniciogeneralServicio++;
	this.gridBagConstraintsServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralServicio.add(this.jPanelnombreServicio, this.gridBagConstraintsServicio);



	if(iXPanelCamposIniciogeneralServicio % 1==0) {
		iXPanelCamposIniciogeneralServicio=0;
		iYPanelCamposIniciogeneralServicio++;
	}
	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicio.gridy = iYPanelCamposIniciogeneralServicio;
	this.gridBagConstraintsServicio.gridx = iXPanelCamposIniciogeneralServicio++;
	this.gridBagConstraintsServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralServicio.add(this.jPanelivaServicio, this.gridBagConstraintsServicio);



	if(iXPanelCamposIniciogeneralServicio % 1==0) {
		iXPanelCamposIniciogeneralServicio=0;
		iYPanelCamposIniciogeneralServicio++;
	}
	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicio.gridy = iYPanelCamposIniciogeneralServicio;
	this.gridBagConstraintsServicio.gridx = iXPanelCamposIniciogeneralServicio++;
	this.gridBagConstraintsServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralServicio.add(this.jPaneliceServicio, this.gridBagConstraintsServicio);



	if(iXPanelCamposIniciogeneralServicio % 1==0) {
		iXPanelCamposIniciogeneralServicio=0;
		iYPanelCamposIniciogeneralServicio++;
	}
	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicio.gridy = iYPanelCamposIniciogeneralServicio;
	this.gridBagConstraintsServicio.gridx = iXPanelCamposIniciogeneralServicio++;
	this.gridBagConstraintsServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralServicio.add(this.jPaneles_bienServicio, this.gridBagConstraintsServicio);



	if(iXPanelCamposIniciogeneralServicio % 1==0) {
		iXPanelCamposIniciogeneralServicio=0;
		iYPanelCamposIniciogeneralServicio++;
	}
	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicio.gridy = iYPanelCamposIniciogeneralServicio;
	this.gridBagConstraintsServicio.gridx = iXPanelCamposIniciogeneralServicio++;
	this.gridBagConstraintsServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralServicio.add(this.jPanelid_estado_servicioServicio, this.gridBagConstraintsServicio);



	if(iXPanelCamposIniciogeneralServicio % 1==0) {
		iXPanelCamposIniciogeneralServicio=0;
		iYPanelCamposIniciogeneralServicio++;
	}
	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicio.gridy = iYPanelCamposIniciogeneralServicio;
	this.gridBagConstraintsServicio.gridx = iXPanelCamposIniciogeneralServicio++;
	this.gridBagConstraintsServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralServicio.add(this.jPaneldescripcionServicio, this.gridBagConstraintsServicio);



	if(iXPanelCamposIniciogeneralServicio % 1==0) {
		iXPanelCamposIniciogeneralServicio=0;
		iYPanelCamposIniciogeneralServicio++;
	}
	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicio.gridy = iYPanelCamposIniciocuenta_contableServicio;
	this.gridBagConstraintsServicio.gridx = iXPanelCamposIniciocuenta_contableServicio++;
	this.gridBagConstraintsServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableServicio.add(this.jPanelid_cuenta_contable_gastoServicio, this.gridBagConstraintsServicio);



	if(iXPanelCamposIniciocuenta_contableServicio % 1==0) {
		iXPanelCamposIniciocuenta_contableServicio=0;
		iYPanelCamposIniciocuenta_contableServicio++;
	}
	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicio.gridy = iYPanelCamposIniciocuenta_contableServicio;
	this.gridBagConstraintsServicio.gridx = iXPanelCamposIniciocuenta_contableServicio++;
	this.gridBagConstraintsServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableServicio.add(this.jPanelid_cuenta_contable_fiscalServicio, this.gridBagConstraintsServicio);



	if(iXPanelCamposIniciocuenta_contableServicio % 1==0) {
		iXPanelCamposIniciocuenta_contableServicio=0;
		iYPanelCamposIniciocuenta_contableServicio++;
	}
	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicio.gridy = iYPanelCamposIniciocuenta_contableServicio;
	this.gridBagConstraintsServicio.gridx = iXPanelCamposIniciocuenta_contableServicio++;
	this.gridBagConstraintsServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableServicio.add(this.jPanelid_cuenta_contable_fiscal2Servicio, this.gridBagConstraintsServicio);



	if(iXPanelCamposIniciocuenta_contableServicio % 1==0) {
		iXPanelCamposIniciocuenta_contableServicio=0;
		iYPanelCamposIniciocuenta_contableServicio++;
	}
	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicio.gridy = iYPanelCamposIniciocuenta_contableServicio;
	this.gridBagConstraintsServicio.gridx = iXPanelCamposIniciocuenta_contableServicio++;
	this.gridBagConstraintsServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableServicio.add(this.jPanelid_cuenta_contable_retencionServicio, this.gridBagConstraintsServicio);



	if(iXPanelCamposIniciocuenta_contableServicio % 1==0) {
		iXPanelCamposIniciocuenta_contableServicio=0;
		iYPanelCamposIniciocuenta_contableServicio++;
	}
	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicio.gridy = iYPanelCamposIniciocuenta_contableServicio;
	this.gridBagConstraintsServicio.gridx = iXPanelCamposIniciocuenta_contableServicio++;
	this.gridBagConstraintsServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableServicio.add(this.jPanelid_cuenta_contable_retencion2Servicio, this.gridBagConstraintsServicio);



	if(iXPanelCamposIniciocuenta_contableServicio % 1==0) {
		iXPanelCamposIniciocuenta_contableServicio=0;
		iYPanelCamposIniciocuenta_contableServicio++;
	}
	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicio.gridy = iYPanelCamposIniciocuenta_contableServicio;
	this.gridBagConstraintsServicio.gridx = iXPanelCamposIniciocuenta_contableServicio++;
	this.gridBagConstraintsServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableServicio.add(this.jPanelid_cuenta_contable_ivaServicio, this.gridBagConstraintsServicio);



	if(iXPanelCamposIniciocuenta_contableServicio % 1==0) {
		iXPanelCamposIniciocuenta_contableServicio=0;
		iYPanelCamposIniciocuenta_contableServicio++;
	}
	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicio.gridy = iYPanelCamposIniciocuenta_contableServicio;
	this.gridBagConstraintsServicio.gridx = iXPanelCamposIniciocuenta_contableServicio++;
	this.gridBagConstraintsServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableServicio.add(this.jPanelid_cuenta_contable_iva2Servicio, this.gridBagConstraintsServicio);



	if(iXPanelCamposIniciocuenta_contableServicio % 1==0) {
		iXPanelCamposIniciocuenta_contableServicio=0;
		iYPanelCamposIniciocuenta_contableServicio++;
	}
	this.gridBagConstraintsServicio = new GridBagConstraints();
	this.gridBagConstraintsServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicio.gridy = iYPanelCamposIniciocuenta_contableServicio;
	this.gridBagConstraintsServicio.gridx = iXPanelCamposIniciocuenta_contableServicio++;
	this.gridBagConstraintsServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableServicio.add(this.jPanelid_cuenta_contable_creditoServicio, this.gridBagConstraintsServicio);



	if(iXPanelCamposIniciocuenta_contableServicio % 1==0) {
		iXPanelCamposIniciocuenta_contableServicio=0;
		iYPanelCamposIniciocuenta_contableServicio++;
	}
		
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
			
		GridBagLayout gridaBagLayoutAccionesServicio= new GridBagLayout();
		this.jPanelAccionesServicio.setLayout(gridaBagLayoutAccionesServicio);
		
		GridBagLayout gridaBagLayoutAccionesFormularioServicio= new GridBagLayout();
		this.jPanelAccionesFormularioServicio.setLayout(gridaBagLayoutAccionesFormularioServicio);
		
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsServicio.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioServicio.add(this.jComboBoxTiposAccionesFormularioServicio, this.gridBagConstraintsServicio);

		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsServicio.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioServicio.add(this.jCheckBoxPostAccionNuevoServicio, this.gridBagConstraintsServicio);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.servicioSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsServicio.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioServicio.add(this.jCheckBoxPostAccionSinCerrarServicio, this.gridBagConstraintsServicio);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.servicioSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.servicioSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsServicio.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioServicio.add(this.jCheckBoxPostAccionSinMensajeServicio, this.gridBagConstraintsServicio);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsServicio.gridy = 0;
		this.gridBagConstraintsServicio.gridx = iPosXAccion++;
			
		this.jPanelAccionesServicio.add(this.jButtonModificarServicio, this.gridBagConstraintsServicio);							

		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsServicio.gridy = 0;
		this.gridBagConstraintsServicio.gridx =iPosXAccion++;
			
		this.jPanelAccionesServicio.add(this.jButtonEliminarServicio, this.gridBagConstraintsServicio);
		
			
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.gridy = 0;		
		this.gridBagConstraintsServicio.gridx = iPosXAccion++;
		
		this.jPanelAccionesServicio.add(this.jButtonActualizarServicio, this.gridBagConstraintsServicio);


		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.gridy = 0;		
		this.gridBagConstraintsServicio.gridx = iPosXAccion++;
		
		this.jPanelAccionesServicio.add(this.jButtonGuardarCambiosServicio, this.gridBagConstraintsServicio);	
		
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.gridy = 0;		
		this.gridBagConstraintsServicio.gridx =iPosXAccion++;
		
		this.jPanelAccionesServicio.add(this.jButtonCancelarServicio, this.gridBagConstraintsServicio);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutServicio = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutServicio);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.servicioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsServicio = new GridBagConstraints();						
			this.gridBagConstraintsServicio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsServicio.gridx = 0;		
			//this.gridBagConstraintsServicio.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicio.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsServicio.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.gridy =iGridyPrincipal++;
		this.gridBagConstraintsServicio.gridx =0;
		this.gridBagConstraintsServicio.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsServicio.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosServicio, this.gridBagConstraintsServicio);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ServicioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleServicio = new ServicioBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Servicio DATOS");
			
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
			
	        //this.setTitle("[FOR] - Servicio DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Servicio Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ServicioModel servicioModel=new ServicioModel(this);
			
			//SI USARA CLASE INTERNA
			//ServicioModel.ServicioFocusTraversalPolicy servicioFocusTraversalPolicy = servicioModel.new ServicioFocusTraversalPolicy(this);
			
			//servicioFocusTraversalPolicy.setservicioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(servicioModel);
			
			
			this.jContentPaneDetalleServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleServicio = new GridBagLayout();	
			this.jContentPaneDetalleServicio.setLayout(gridaBagLayoutDetalleServicio);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosServicio = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsServicio = new GridBagConstraints();
				this.gridBagConstraintsServicio.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsServicio.gridx = 0;
					
				
				this.jContentPaneDetalleServicio.add(jTtoolBarDetalleServicio, gridBagConstraintsServicio);								
				
}
			
			this.jScrollPanelDatosEdicionServicio=   new JScrollPane(jContentPaneDetalleServicio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionServicio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionServicio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionServicio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralServicio=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralServicio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralServicio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralServicio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsServicio = new GridBagConstraints();
			
			
			
			
			
		this.jTabbedPaneCamposServicio.add("General",this.jPanelCamposIniciogeneralServicio);
		this.jTabbedPaneCamposServicio.add("Cuenta Contable",this.jPanelCamposIniciocuenta_contableServicio);
			
			this.gridBagConstraintsServicio = new GridBagConstraints();
						
			this.gridBagConstraintsServicio.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsServicio.gridx = 0;
	        
			this.jContentPaneDetalleServicio.add(jTabbedPaneCamposServicio, gridBagConstraintsServicio);
			
			
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
						&& servicioSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.servicioSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsServicio= new GridBagConstraints();
						this.gridBagConstraintsServicio.gridy = iGridyRelaciones++;
						this.gridBagConstraintsServicio.gridx = 0;
						this.jContentPaneDetalleServicio.add(this.jTabbedPaneRelacionesServicio, this.gridBagConstraintsServicio);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesServicio.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosServicio.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsServicio = new GridBagConstraints();
					this.gridBagConstraintsServicio.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsServicio.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsServicio.gridx = 0;
					
				
					this.jContentPaneDetalleServicio.add(jPanelCamposOcultosServicio, gridBagConstraintsServicio);
				
					this.jPanelCamposOcultosServicio.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsServicio.gridx = 0;
	        this.gridBagConstraintsServicio.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleServicio.add(this.jPanelAccionesFormularioServicio, this.gridBagConstraintsServicio);							
			
			
			
			this.gridBagConstraintsServicio = new GridBagConstraints();
	        this.gridBagConstraintsServicio.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsServicio.gridx = 0;
	        
			
			this.jContentPaneDetalleServicio.add(this.jPanelAccionesServicio, this.gridBagConstraintsServicio);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionServicio);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionServicio=   new JScrollPane(this.jPanelCamposServicio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionServicio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionServicio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionServicio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsServicio.gridx = 0;
			this.gridBagConstraintsServicio.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsServicio.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionServicio, this.gridBagConstraintsServicio);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsServicio.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioServicio, this.gridBagConstraintsServicio);			
			
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsServicio.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesServicio, this.gridBagConstraintsServicio);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsServicio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposServicio, this.gridBagConstraintsServicio);
			
			
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsServicio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosServicio, this.gridBagConstraintsServicio);
		
			
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsServicio.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesServicio, this.gridBagConstraintsServicio);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralServicio;//jContentPane;
		
		return jScrollPanelDatosEdicionServicio;
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
