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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.PlantillaFacturaConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class PlantillaFacturaDetalleFormJInternalFrame extends PlantillaFacturaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePlantillaFactura;
	
	protected JMenuBar jmenuBarDetallePlantillaFactura;
	
	protected JMenu jmenuDetallePlantillaFactura;
	protected JMenu jmenuDetalleArchivoPlantillaFactura;
	protected JMenu jmenuDetalleAccionesPlantillaFactura;
	protected JMenu jmenuDetalleDatosPlantillaFactura;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePlantillaFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPlantillaFactura;	
	protected GridBagConstraints gridBagConstraintsPlantillaFactura;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PlantillaFacturaBeanSwingJInternalFrameAdditional jInternalFrameDetallePlantillaFactura;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableaplicadaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableaplicada="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditobienBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecreditobien="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditoservicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecreditoservicio="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionfuentebienBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencionfuentebien="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionfuenteservicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencionfuenteservicio="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionivabienBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencionivabien="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionivaservicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencionivaservicio="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablegastoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablegasto="";
	
	public PlantillaFacturaSessionBean plantillafacturaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public CuentaContableSessionBean cuentacontableaplicadaSessionBean;
	public CuentaContableSessionBean cuentacontablecreditobienSessionBean;
	public CuentaContableSessionBean cuentacontablecreditoservicioSessionBean;
	public TipoRetencionSessionBean tiporetencionfuentebienSessionBean;
	public TipoRetencionSessionBean tiporetencionfuenteservicioSessionBean;
	public TipoRetencionSessionBean tiporetencionivabienSessionBean;
	public TipoRetencionSessionBean tiporetencionivaservicioSessionBean;
	public CuentaContableSessionBean cuentacontablegastoSessionBean;	
	
	public PlantillaFacturaLogic plantillafacturaLogic;
	
	public JScrollPane jScrollPanelDatosPlantillaFactura;
	public JScrollPane jScrollPanelDatosEdicionPlantillaFactura;
	public JScrollPane jScrollPanelDatosGeneralPlantillaFactura;
	
	protected JPanel jPanelCamposPlantillaFactura;    
	protected JPanel jPanelCamposOcultosPlantillaFactura;    	
	protected JPanel jPanelAccionesPlantillaFactura;
	protected JPanel jPanelAccionesFormularioPlantillaFactura;
    
	
	
	protected Integer iXPanelCamposPlantillaFactura=0;
	protected Integer iYPanelCamposPlantillaFactura=0;
	
	protected Integer iXPanelCamposOcultosPlantillaFactura=0;
	protected Integer iYPanelCamposOcultosPlantillaFactura=0;
	
	

	protected JPanel jPanelCamposIniciogeneralPlantillaFactura;
	protected Integer iXPanelCamposIniciogeneralPlantillaFactura=0;
	protected Integer iYPanelCamposIniciogeneralPlantillaFactura=0;

	protected JPanel jPanelCamposIniciocuenta_contablePlantillaFactura;
	protected Integer iXPanelCamposIniciocuenta_contablePlantillaFactura=0;
	protected Integer iYPanelCamposIniciocuenta_contablePlantillaFactura=0;

	protected JPanel jPanelCamposIniciotipo_retencionPlantillaFactura;
	protected Integer iXPanelCamposIniciotipo_retencionPlantillaFactura=0;
	protected Integer iYPanelCamposIniciotipo_retencionPlantillaFactura=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPlantillaFactura;
	public JButton jButtonModificarPlantillaFactura;
	public JButton jButtonActualizarPlantillaFactura;
    public JButton jButtonEliminarPlantillaFactura;
	public JButton jButtonCancelarPlantillaFactura;
    public JButton jButtonGuardarCambiosPlantillaFactura;
	public JButton jButtonGuardarCambiosTablaPlantillaFactura;
	protected JButton jButtonCerrarPlantillaFactura;
	
	
	protected JButton jButtonProcesarInformacionPlantillaFactura;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPlantillaFactura;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPlantillaFactura;
	protected JCheckBox jCheckBoxPostAccionSinMensajePlantillaFactura;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPlantillaFactura;
	protected JButton jButtonModificarToolBarPlantillaFactura;
	protected JButton jButtonActualizarToolBarPlantillaFactura;
    protected JButton jButtonEliminarToolBarPlantillaFactura;
	protected JButton jButtonCancelarToolBarPlantillaFactura;
    protected JButton jButtonGuardarCambiosToolBarPlantillaFactura;
	protected JButton jButtonGuardarCambiosTablaToolBarPlantillaFactura;
	protected JButton jButtonMostrarOcultarTablaToolBarPlantillaFactura;
	protected JButton jButtonCerrarToolBarPlantillaFactura;
	
	protected JButton jButtonProcesarInformacionToolBarPlantillaFactura;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPlantillaFactura;
	protected JMenuItem jMenuItemModificarPlantillaFactura;
	protected JMenuItem jMenuItemActualizarPlantillaFactura;
    protected JMenuItem jMenuItemEliminarPlantillaFactura;
	protected JMenuItem jMenuItemCancelarPlantillaFactura;
    protected JMenuItem jMenuItemGuardarCambiosPlantillaFactura;
	protected JMenuItem jMenuItemGuardarCambiosTablaPlantillaFactura;
	protected JMenuItem jMenuItemCerrarPlantillaFactura;
	protected JMenuItem jMenuItemDetalleCerrarPlantillaFactura;
	protected JMenuItem jMenuItemDetalleMostarOcultarPlantillaFactura;
	
	protected JMenuItem jMenuItemProcesarInformacionPlantillaFactura;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPlantillaFactura;
	protected JMenuItem jMenuItemMostrarOcultarPlantillaFactura;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPlantillaFactura;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPlantillaFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPlantillaFactura;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPlantillaFactura;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPlantillaFactura;
	public JLabel jLabelIdPlantillaFactura;
	public JLabel jLabelidPlantillaFactura;
	public JButton jButtonidPlantillaFacturaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoPlantillaFactura;
	public JLabel jLabelcodigoPlantillaFactura;
	public JTextField jTextFieldcodigoPlantillaFactura;
	public JButton jButtoncodigoPlantillaFacturaBusqueda= new JButtonMe();

	public JPanel jPanelnombrePlantillaFactura;
	public JLabel jLabelnombrePlantillaFactura;
	public JTextArea jTextAreanombrePlantillaFactura;
	public JScrollPane jscrollPanenombrePlantillaFactura;
	public JButton jButtonnombrePlantillaFacturaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionPlantillaFactura;
	public JLabel jLabeldescripcionPlantillaFactura;
	public JTextArea jTextAreadescripcionPlantillaFactura;
	public JScrollPane jscrollPanedescripcionPlantillaFactura;
	public JButton jButtondescripcionPlantillaFacturaBusqueda= new JButtonMe();

	public JPanel jPaneles_proveedorPlantillaFactura;
	public JLabel jLabeles_proveedorPlantillaFactura;
	public JCheckBox jCheckBoxes_proveedorPlantillaFactura;
	public JButton jButtones_proveedorPlantillaFacturaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPlantillaFactura;
	public JLabel jLabelid_empresaPlantillaFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPlantillaFactura;
	public JButton jButtonid_empresaPlantillaFactura= new JButtonMe();
	public JButton jButtonid_empresaPlantillaFacturaUpdate= new JButtonMe();
	public JButton jButtonid_empresaPlantillaFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_aplicadaPlantillaFactura;
	public JLabel jLabelid_cuenta_contable_aplicadaPlantillaFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_aplicadaPlantillaFactura;
	public JButton jButtonid_cuenta_contable_aplicadaPlantillaFactura= new JButtonMe();
	public JButton jButtonid_cuenta_contable_aplicadaPlantillaFacturaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_aplicadaPlantillaFacturaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_aplicadaPlantillaFacturaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_credito_bienPlantillaFactura;
	public JLabel jLabelid_cuenta_contable_credito_bienPlantillaFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_credito_bienPlantillaFactura;
	public JButton jButtonid_cuenta_contable_credito_bienPlantillaFactura= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_bienPlantillaFacturaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_bienPlantillaFacturaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_bienPlantillaFacturaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_credito_servicioPlantillaFactura;
	public JLabel jLabelid_cuenta_contable_credito_servicioPlantillaFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_credito_servicioPlantillaFactura;
	public JButton jButtonid_cuenta_contable_credito_servicioPlantillaFactura= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_servicioPlantillaFacturaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_servicioPlantillaFacturaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_servicioPlantillaFacturaArbol= new JButtonMe();

	public JPanel jPanelid_tipo_retencion_fuente_bienPlantillaFactura;
	public JLabel jLabelid_tipo_retencion_fuente_bienPlantillaFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencion_fuente_bienPlantillaFactura;
	public JButton jButtonid_tipo_retencion_fuente_bienPlantillaFactura= new JButtonMe();
	public JButton jButtonid_tipo_retencion_fuente_bienPlantillaFacturaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencion_fuente_bienPlantillaFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_retencion_fuente_servicioPlantillaFactura;
	public JLabel jLabelid_tipo_retencion_fuente_servicioPlantillaFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencion_fuente_servicioPlantillaFactura;
	public JButton jButtonid_tipo_retencion_fuente_servicioPlantillaFactura= new JButtonMe();
	public JButton jButtonid_tipo_retencion_fuente_servicioPlantillaFacturaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencion_fuente_servicioPlantillaFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_retencion_iva_bienPlantillaFactura;
	public JLabel jLabelid_tipo_retencion_iva_bienPlantillaFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencion_iva_bienPlantillaFactura;
	public JButton jButtonid_tipo_retencion_iva_bienPlantillaFactura= new JButtonMe();
	public JButton jButtonid_tipo_retencion_iva_bienPlantillaFacturaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencion_iva_bienPlantillaFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_retencion_iva_servicioPlantillaFactura;
	public JLabel jLabelid_tipo_retencion_iva_servicioPlantillaFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencion_iva_servicioPlantillaFactura;
	public JButton jButtonid_tipo_retencion_iva_servicioPlantillaFactura= new JButtonMe();
	public JButton jButtonid_tipo_retencion_iva_servicioPlantillaFacturaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencion_iva_servicioPlantillaFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_gastoPlantillaFactura;
	public JLabel jLabelid_cuenta_contable_gastoPlantillaFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_gastoPlantillaFactura;
	public JButton jButtonid_cuenta_contable_gastoPlantillaFactura= new JButtonMe();
	public JButton jButtonid_cuenta_contable_gastoPlantillaFacturaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_gastoPlantillaFacturaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_gastoPlantillaFacturaArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPlantillaFactura;
	
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
	public int iHeightFormulario=902;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PlantillaFacturaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPlantillaFactura=new JPanel();
				this.jPanelAccionesFormularioPlantillaFactura=new JPanel();
				this.jmenuBarDetallePlantillaFactura=new JMenuBar();
				this.jTtoolBarDetallePlantillaFactura=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PlantillaFacturaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PlantillaFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PlantillaFacturaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PlantillaFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PlantillaFacturaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PlantillaFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PlantillaFacturaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PlantillaFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PlantillaFacturaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PlantillaFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPlantillaFactura() {
		return this.jButtonActualizarToolBarPlantillaFactura;
	}
	
	public JButton getjButtonEliminarToolBarPlantillaFactura() {
		return this.jButtonEliminarToolBarPlantillaFactura;
	}
	
	public JButton getjButtonCancelarToolBarPlantillaFactura() {
		return this.jButtonCancelarToolBarPlantillaFactura;
	}		
	
	public JButton getjButtonProcesarInformacionPlantillaFactura() {
		return this.jButtonProcesarInformacionPlantillaFactura;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPlantillaFactura)	{
		this.jButtonProcesarInformacionPlantillaFactura = jButtonProcesarInformacionPlantillaFactura;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPlantillaFactura() {
		return this.jComboBoxTiposAccionesPlantillaFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPlantillaFactura(
			JComboBox jComboBoxTiposRelacionesPlantillaFactura) {
		this.jComboBoxTiposRelacionesPlantillaFactura = jComboBoxTiposRelacionesPlantillaFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPlantillaFactura(
			JComboBox jComboBoxTiposAccionesPlantillaFactura) {
		this.jComboBoxTiposAccionesPlantillaFactura = jComboBoxTiposAccionesPlantillaFactura;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPlantillaFactura() {
		return this.jComboBoxTiposAccionesFormularioPlantillaFactura;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPlantillaFactura(
			JComboBox jComboBoxTiposAccionesFormularioPlantillaFactura) {
		this.jComboBoxTiposAccionesFormularioPlantillaFactura = jComboBoxTiposAccionesFormularioPlantillaFactura;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.plantillafacturaSessionBean=new PlantillaFacturaSessionBean();
		
		this.plantillafacturaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.plantillafacturaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.plantillafacturaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PlantillaFacturaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PlantillaFacturaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PlantillaFacturaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Plantilla Factura MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.plantillafacturaSessionBean.getEsGuardarRelacionado()) {
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
	
		PlantillaFacturaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePlantillaFactura= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPlantillaFactura=new JButtonMe();
				this.jButtonModificarToolBarPlantillaFactura=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPlantillaFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPlantillaFactura,this.jTtoolBarDetallePlantillaFactura,
							"actualizar","actualizar","Actualizar"+" "+PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPlantillaFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPlantillaFactura,this.jTtoolBarDetallePlantillaFactura,
							"eliminar","eliminar","Eliminar"+" "+PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPlantillaFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPlantillaFactura,this.jTtoolBarDetallePlantillaFactura,
							"cancelar","cancelar","Cancelar"+" "+PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPlantillaFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPlantillaFactura,this.jTtoolBarDetallePlantillaFactura,
							"guardarcambios","guardarcambios","Guardar"+" "+PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePlantillaFactura=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePlantillaFactura=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPlantillaFactura=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPlantillaFactura=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPlantillaFactura=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPlantillaFactura= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPlantillaFactura.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPlantillaFactura,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPlantillaFactura= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPlantillaFactura.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPlantillaFactura,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPlantillaFactura= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPlantillaFactura.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPlantillaFactura,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPlantillaFactura= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPlantillaFactura.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPlantillaFactura,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPlantillaFactura= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPlantillaFactura.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPlantillaFactura,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPlantillaFactura= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPlantillaFactura.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPlantillaFactura,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPlantillaFactura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPlantillaFactura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPlantillaFactura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPlantillaFactura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPlantillaFactura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPlantillaFactura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPlantillaFactura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPlantillaFactura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPlantillaFactura,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPlantillaFactura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPlantillaFactura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPlantillaFactura,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPlantillaFactura.add(this.jMenuItemDetalleCerrarPlantillaFactura);
		
		this.jmenuDetalleAccionesPlantillaFactura.add(this.jMenuItemActualizarPlantillaFactura);
		this.jmenuDetalleAccionesPlantillaFactura.add(this.jMenuItemEliminarPlantillaFactura);
		this.jmenuDetalleAccionesPlantillaFactura.add(this.jMenuItemCancelarPlantillaFactura);		
		
		//this.jmenuDetalleDatosPlantillaFactura.add(this.jMenuItemDetalleAbrirOrderByPlantillaFactura);				
		this.jmenuDetalleDatosPlantillaFactura.add(this.jMenuItemDetalleMostarOcultarPlantillaFactura);				
				
		//this.jmenuDetalleAccionesPlantillaFactura.add(this.jMenuItemGuardarCambiosPlantillaFactura);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePlantillaFactura.add(this.jmenuDetalleArchivoPlantillaFactura);		
		this.jmenuBarDetallePlantillaFactura.add(this.jmenuDetalleAccionesPlantillaFactura);		
		this.jmenuBarDetallePlantillaFactura.add(this.jmenuDetalleDatosPlantillaFactura);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePlantillaFactura);				
	}
	
	
	public void inicializarElementosCamposPlantillaFactura() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPlantillaFactura = new JLabelMe();
		jLabelIdPlantillaFactura.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPlantillaFactura = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPlantillaFactura.setToolTipText(PlantillaFacturaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPlantillaFactura= new GridBagLayout();

		this.jPanelidPlantillaFactura.setLayout(this.gridaBagLayoutPlantillaFactura);

		jLabelidPlantillaFactura = new JLabel();
		jLabelidPlantillaFactura.setText("Id");

		jLabelidPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoPlantillaFactura = new JLabelMe();
		this.jLabelcodigoPlantillaFactura.setText(""+PlantillaFacturaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoPlantillaFactura.setToolTipText("Codigo");
		this.jLabelcodigoPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoPlantillaFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoPlantillaFactura.setToolTipText(PlantillaFacturaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutPlantillaFactura = new GridBagLayout();
		this.jPanelcodigoPlantillaFactura.setLayout(this.gridaBagLayoutPlantillaFactura);


		jTextFieldcodigoPlantillaFactura= new JTextFieldMe();

		jTextFieldcodigoPlantillaFactura.setEnabled(false);
		jTextFieldcodigoPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoPlantillaFacturaBusqueda= new JButtonMe();
		this.jButtoncodigoPlantillaFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoPlantillaFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoPlantillaFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoPlantillaFacturaBusqueda.setText("U");
		this.jButtoncodigoPlantillaFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoPlantillaFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoPlantillaFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoPlantillaFacturaBusqueda"));

		if(this.plantillafacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoPlantillaFacturaBusqueda.setVisible(false);		}


					
		this.jLabelnombrePlantillaFactura = new JLabelMe();
		this.jLabelnombrePlantillaFactura.setText(""+PlantillaFacturaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombrePlantillaFactura.setToolTipText("Nombre");
		this.jLabelnombrePlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrePlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrePlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombrePlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombrePlantillaFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombrePlantillaFactura.setToolTipText(PlantillaFacturaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutPlantillaFactura = new GridBagLayout();
		this.jPanelnombrePlantillaFactura.setLayout(this.gridaBagLayoutPlantillaFactura);


		jTextAreanombrePlantillaFactura= new JTextAreaMe();
		jTextAreanombrePlantillaFactura.setEnabled(false);
		jTextAreanombrePlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePlantillaFactura.setLineWrap(true);
		jTextAreanombrePlantillaFactura.setWrapStyleWord(true);
		jTextAreanombrePlantillaFactura.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombrePlantillaFactura.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombrePlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombrePlantillaFactura = new JScrollPane(jTextAreanombrePlantillaFactura);
		jscrollPanenombrePlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombrePlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombrePlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombrePlantillaFacturaBusqueda= new JButtonMe();
		this.jButtonnombrePlantillaFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrePlantillaFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrePlantillaFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombrePlantillaFacturaBusqueda.setText("U");
		this.jButtonnombrePlantillaFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombrePlantillaFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombrePlantillaFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombrePlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombrePlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombrePlantillaFacturaBusqueda"));

		if(this.plantillafacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombrePlantillaFacturaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionPlantillaFactura = new JLabelMe();
		this.jLabeldescripcionPlantillaFactura.setText(""+PlantillaFacturaConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionPlantillaFactura.setToolTipText("Descripcion");
		this.jLabeldescripcionPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionPlantillaFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionPlantillaFactura.setToolTipText(PlantillaFacturaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutPlantillaFactura = new GridBagLayout();
		this.jPaneldescripcionPlantillaFactura.setLayout(this.gridaBagLayoutPlantillaFactura);


		jTextAreadescripcionPlantillaFactura= new JTextAreaMe();
		jTextAreadescripcionPlantillaFactura.setEnabled(false);
		jTextAreadescripcionPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPlantillaFactura.setLineWrap(true);
		jTextAreadescripcionPlantillaFactura.setWrapStyleWord(true);
		jTextAreadescripcionPlantillaFactura.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionPlantillaFactura.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionPlantillaFactura = new JScrollPane(jTextAreadescripcionPlantillaFactura);
		jscrollPanedescripcionPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionPlantillaFacturaBusqueda= new JButtonMe();
		this.jButtondescripcionPlantillaFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPlantillaFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPlantillaFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionPlantillaFacturaBusqueda.setText("U");
		this.jButtondescripcionPlantillaFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionPlantillaFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionPlantillaFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionPlantillaFacturaBusqueda"));

		if(this.plantillafacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionPlantillaFacturaBusqueda.setVisible(false);		}


					
		this.jLabeles_proveedorPlantillaFactura = new JLabelMe();
		this.jLabeles_proveedorPlantillaFactura.setText(""+PlantillaFacturaConstantesFunciones.LABEL_ESPROVEEDOR+" : *");
		this.jLabeles_proveedorPlantillaFactura.setToolTipText("Es Proveedor");
		this.jLabeles_proveedorPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_proveedorPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_proveedorPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_proveedorPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_proveedorPlantillaFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_proveedorPlantillaFactura.setToolTipText(PlantillaFacturaConstantesFunciones.LABEL_ESPROVEEDOR);
		this.gridaBagLayoutPlantillaFactura = new GridBagLayout();
		this.jPaneles_proveedorPlantillaFactura.setLayout(this.gridaBagLayoutPlantillaFactura);


		jCheckBoxes_proveedorPlantillaFactura= new JCheckBoxMe();
		jCheckBoxes_proveedorPlantillaFactura.setEnabled(false);

		jCheckBoxes_proveedorPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_proveedorPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_proveedorPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_proveedorPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_proveedorPlantillaFacturaBusqueda= new JButtonMe();
		this.jButtones_proveedorPlantillaFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_proveedorPlantillaFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_proveedorPlantillaFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_proveedorPlantillaFacturaBusqueda.setText("U");
		this.jButtones_proveedorPlantillaFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_proveedorPlantillaFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_proveedorPlantillaFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_proveedorPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_proveedorPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_proveedorPlantillaFacturaBusqueda"));

		if(this.plantillafacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_proveedorPlantillaFacturaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPlantillaFactura() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPlantillaFactura = new JLabelMe();
		this.jLabelid_empresaPlantillaFactura.setText(""+PlantillaFacturaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPlantillaFactura.setToolTipText("Empresa");
		this.jLabelid_empresaPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPlantillaFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPlantillaFactura.setToolTipText(PlantillaFacturaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPlantillaFactura = new GridBagLayout();
		this.jPanelid_empresaPlantillaFactura.setLayout(this.gridaBagLayoutPlantillaFactura);


		jComboBoxid_empresaPlantillaFactura= new JComboBoxMe();
		jComboBoxid_empresaPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPlantillaFactura.setEnabled(false);

		this.jButtonid_empresaPlantillaFactura= new JButtonMe();
		this.jButtonid_empresaPlantillaFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPlantillaFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPlantillaFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPlantillaFactura.setText("Buscar");
		this.jButtonid_empresaPlantillaFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPlantillaFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPlantillaFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPlantillaFactura"));

		this.jButtonid_empresaPlantillaFacturaBusqueda= new JButtonMe();
		this.jButtonid_empresaPlantillaFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPlantillaFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPlantillaFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPlantillaFacturaBusqueda.setText("U");
		this.jButtonid_empresaPlantillaFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPlantillaFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPlantillaFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPlantillaFacturaBusqueda"));

		if(this.plantillafacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPlantillaFacturaBusqueda.setVisible(false);		}

		this.jButtonid_empresaPlantillaFacturaUpdate= new JButtonMe();
		this.jButtonid_empresaPlantillaFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPlantillaFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPlantillaFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPlantillaFacturaUpdate.setText("U");
		this.jButtonid_empresaPlantillaFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPlantillaFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPlantillaFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPlantillaFacturaUpdate"));



					
		this.jLabelid_cuenta_contable_aplicadaPlantillaFactura = new JLabelMe();
		this.jLabelid_cuenta_contable_aplicadaPlantillaFactura.setText(""+PlantillaFacturaConstantesFunciones.LABEL_IDCUENTACONTABLEAPLICADA+" : *");
		this.jLabelid_cuenta_contable_aplicadaPlantillaFactura.setToolTipText("Cta. Aplicada");
		this.jLabelid_cuenta_contable_aplicadaPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_contable_aplicadaPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_contable_aplicadaPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_aplicadaPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_aplicadaPlantillaFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_aplicadaPlantillaFactura.setToolTipText(PlantillaFacturaConstantesFunciones.LABEL_IDCUENTACONTABLEAPLICADA);
		this.gridaBagLayoutPlantillaFactura = new GridBagLayout();
		this.jPanelid_cuenta_contable_aplicadaPlantillaFactura.setLayout(this.gridaBagLayoutPlantillaFactura);


		jComboBoxid_cuenta_contable_aplicadaPlantillaFactura= new JComboBoxMe();
		jComboBoxid_cuenta_contable_aplicadaPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_aplicadaPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_aplicadaPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_aplicadaPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_aplicadaPlantillaFactura= new JButtonMe();
		this.jButtonid_cuenta_contable_aplicadaPlantillaFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_aplicadaPlantillaFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_aplicadaPlantillaFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_aplicadaPlantillaFactura.setText("Buscar");
		this.jButtonid_cuenta_contable_aplicadaPlantillaFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_aplicadaPlantillaFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_aplicadaPlantillaFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_aplicadaPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_aplicadaPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_aplicadaPlantillaFactura"));

		this.jButtonid_cuenta_contable_aplicadaPlantillaFacturaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_aplicadaPlantillaFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_aplicadaPlantillaFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_aplicadaPlantillaFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_aplicadaPlantillaFacturaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_aplicadaPlantillaFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_aplicadaPlantillaFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_aplicadaPlantillaFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_aplicadaPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_aplicadaPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_aplicadaPlantillaFacturaBusqueda"));

		if(this.plantillafacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_aplicadaPlantillaFacturaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_aplicadaPlantillaFacturaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_aplicadaPlantillaFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_aplicadaPlantillaFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_aplicadaPlantillaFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_aplicadaPlantillaFacturaUpdate.setText("U");
		this.jButtonid_cuenta_contable_aplicadaPlantillaFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_aplicadaPlantillaFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_aplicadaPlantillaFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_aplicadaPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_aplicadaPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_aplicadaPlantillaFacturaUpdate"));


		jButtonid_cuenta_contable_aplicadaPlantillaFacturaArbol= new JButtonMe();
		jButtonid_cuenta_contable_aplicadaPlantillaFacturaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_aplicadaPlantillaFacturaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_aplicadaPlantillaFacturaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_aplicadaPlantillaFacturaArbol.setText("Arbol");
		jButtonid_cuenta_contable_aplicadaPlantillaFacturaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_aplicadaPlantillaFacturaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_aplicadaPlantillaFacturaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_aplicadaPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_aplicadaPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_aplicadaPlantillaFacturaArbol"));



					
		this.jLabelid_cuenta_contable_credito_bienPlantillaFactura = new JLabelMe();
		this.jLabelid_cuenta_contable_credito_bienPlantillaFactura.setText(""+PlantillaFacturaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITOBIEN+" :");
		this.jLabelid_cuenta_contable_credito_bienPlantillaFactura.setToolTipText("Cta. Credito Bien");
		this.jLabelid_cuenta_contable_credito_bienPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_credito_bienPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_credito_bienPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_credito_bienPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_credito_bienPlantillaFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_credito_bienPlantillaFactura.setToolTipText(PlantillaFacturaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITOBIEN);
		this.gridaBagLayoutPlantillaFactura = new GridBagLayout();
		this.jPanelid_cuenta_contable_credito_bienPlantillaFactura.setLayout(this.gridaBagLayoutPlantillaFactura);


		jComboBoxid_cuenta_contable_credito_bienPlantillaFactura= new JComboBoxMe();
		jComboBoxid_cuenta_contable_credito_bienPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_credito_bienPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_credito_bienPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_credito_bienPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_credito_bienPlantillaFactura= new JButtonMe();
		this.jButtonid_cuenta_contable_credito_bienPlantillaFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_credito_bienPlantillaFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_credito_bienPlantillaFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_credito_bienPlantillaFactura.setText("Buscar");
		this.jButtonid_cuenta_contable_credito_bienPlantillaFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_credito_bienPlantillaFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_credito_bienPlantillaFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_credito_bienPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_credito_bienPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_credito_bienPlantillaFactura"));

		this.jButtonid_cuenta_contable_credito_bienPlantillaFacturaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_credito_bienPlantillaFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_credito_bienPlantillaFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_credito_bienPlantillaFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_credito_bienPlantillaFacturaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_credito_bienPlantillaFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_credito_bienPlantillaFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_credito_bienPlantillaFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_credito_bienPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_credito_bienPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_credito_bienPlantillaFacturaBusqueda"));

		if(this.plantillafacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_credito_bienPlantillaFacturaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_credito_bienPlantillaFacturaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_credito_bienPlantillaFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_credito_bienPlantillaFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_credito_bienPlantillaFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_credito_bienPlantillaFacturaUpdate.setText("U");
		this.jButtonid_cuenta_contable_credito_bienPlantillaFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_credito_bienPlantillaFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_credito_bienPlantillaFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_credito_bienPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_credito_bienPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_credito_bienPlantillaFacturaUpdate"));


		jButtonid_cuenta_contable_credito_bienPlantillaFacturaArbol= new JButtonMe();
		jButtonid_cuenta_contable_credito_bienPlantillaFacturaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_credito_bienPlantillaFacturaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_credito_bienPlantillaFacturaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_credito_bienPlantillaFacturaArbol.setText("Arbol");
		jButtonid_cuenta_contable_credito_bienPlantillaFacturaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_credito_bienPlantillaFacturaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_credito_bienPlantillaFacturaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_credito_bienPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_credito_bienPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_credito_bienPlantillaFacturaArbol"));



					
		this.jLabelid_cuenta_contable_credito_servicioPlantillaFactura = new JLabelMe();
		this.jLabelid_cuenta_contable_credito_servicioPlantillaFactura.setText(""+PlantillaFacturaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITOSERVICIO+" :");
		this.jLabelid_cuenta_contable_credito_servicioPlantillaFactura.setToolTipText("Cta. Credito Servicio");
		this.jLabelid_cuenta_contable_credito_servicioPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_credito_servicioPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_credito_servicioPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_credito_servicioPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_credito_servicioPlantillaFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_credito_servicioPlantillaFactura.setToolTipText(PlantillaFacturaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITOSERVICIO);
		this.gridaBagLayoutPlantillaFactura = new GridBagLayout();
		this.jPanelid_cuenta_contable_credito_servicioPlantillaFactura.setLayout(this.gridaBagLayoutPlantillaFactura);


		jComboBoxid_cuenta_contable_credito_servicioPlantillaFactura= new JComboBoxMe();
		jComboBoxid_cuenta_contable_credito_servicioPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_credito_servicioPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_credito_servicioPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_credito_servicioPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_credito_servicioPlantillaFactura= new JButtonMe();
		this.jButtonid_cuenta_contable_credito_servicioPlantillaFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_credito_servicioPlantillaFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_credito_servicioPlantillaFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_credito_servicioPlantillaFactura.setText("Buscar");
		this.jButtonid_cuenta_contable_credito_servicioPlantillaFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_credito_servicioPlantillaFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_credito_servicioPlantillaFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_credito_servicioPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_credito_servicioPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_credito_servicioPlantillaFactura"));

		this.jButtonid_cuenta_contable_credito_servicioPlantillaFacturaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_credito_servicioPlantillaFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_credito_servicioPlantillaFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_credito_servicioPlantillaFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_credito_servicioPlantillaFacturaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_credito_servicioPlantillaFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_credito_servicioPlantillaFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_credito_servicioPlantillaFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_credito_servicioPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_credito_servicioPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_credito_servicioPlantillaFacturaBusqueda"));

		if(this.plantillafacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_credito_servicioPlantillaFacturaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_credito_servicioPlantillaFacturaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_credito_servicioPlantillaFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_credito_servicioPlantillaFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_credito_servicioPlantillaFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_credito_servicioPlantillaFacturaUpdate.setText("U");
		this.jButtonid_cuenta_contable_credito_servicioPlantillaFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_credito_servicioPlantillaFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_credito_servicioPlantillaFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_credito_servicioPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_credito_servicioPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_credito_servicioPlantillaFacturaUpdate"));


		jButtonid_cuenta_contable_credito_servicioPlantillaFacturaArbol= new JButtonMe();
		jButtonid_cuenta_contable_credito_servicioPlantillaFacturaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_credito_servicioPlantillaFacturaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_credito_servicioPlantillaFacturaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_credito_servicioPlantillaFacturaArbol.setText("Arbol");
		jButtonid_cuenta_contable_credito_servicioPlantillaFacturaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_credito_servicioPlantillaFacturaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_credito_servicioPlantillaFacturaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_credito_servicioPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_credito_servicioPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_credito_servicioPlantillaFacturaArbol"));



					
		this.jLabelid_tipo_retencion_fuente_bienPlantillaFactura = new JLabelMe();
		this.jLabelid_tipo_retencion_fuente_bienPlantillaFactura.setText(""+PlantillaFacturaConstantesFunciones.LABEL_IDTIPORETENCIONFUENTEBIEN+" :");
		this.jLabelid_tipo_retencion_fuente_bienPlantillaFactura.setToolTipText("Ret Fuente Bien");
		this.jLabelid_tipo_retencion_fuente_bienPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_retencion_fuente_bienPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_retencion_fuente_bienPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencion_fuente_bienPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_retencion_fuente_bienPlantillaFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_retencion_fuente_bienPlantillaFactura.setToolTipText(PlantillaFacturaConstantesFunciones.LABEL_IDTIPORETENCIONFUENTEBIEN);
		this.gridaBagLayoutPlantillaFactura = new GridBagLayout();
		this.jPanelid_tipo_retencion_fuente_bienPlantillaFactura.setLayout(this.gridaBagLayoutPlantillaFactura);


		jComboBoxid_tipo_retencion_fuente_bienPlantillaFactura= new JComboBoxMe();
		jComboBoxid_tipo_retencion_fuente_bienPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_fuente_bienPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_fuente_bienPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencion_fuente_bienPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_retencion_fuente_bienPlantillaFactura= new JButtonMe();
		this.jButtonid_tipo_retencion_fuente_bienPlantillaFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_fuente_bienPlantillaFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_fuente_bienPlantillaFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_fuente_bienPlantillaFactura.setText("Buscar");
		this.jButtonid_tipo_retencion_fuente_bienPlantillaFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_retencion_fuente_bienPlantillaFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_fuente_bienPlantillaFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_retencion_fuente_bienPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_fuente_bienPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_fuente_bienPlantillaFactura"));

		this.jButtonid_tipo_retencion_fuente_bienPlantillaFacturaBusqueda= new JButtonMe();
		this.jButtonid_tipo_retencion_fuente_bienPlantillaFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_fuente_bienPlantillaFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_fuente_bienPlantillaFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_fuente_bienPlantillaFacturaBusqueda.setText("U");
		this.jButtonid_tipo_retencion_fuente_bienPlantillaFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_retencion_fuente_bienPlantillaFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_fuente_bienPlantillaFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_retencion_fuente_bienPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_fuente_bienPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_fuente_bienPlantillaFacturaBusqueda"));

		if(this.plantillafacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_retencion_fuente_bienPlantillaFacturaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_retencion_fuente_bienPlantillaFacturaUpdate= new JButtonMe();
		this.jButtonid_tipo_retencion_fuente_bienPlantillaFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_fuente_bienPlantillaFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_fuente_bienPlantillaFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_fuente_bienPlantillaFacturaUpdate.setText("U");
		this.jButtonid_tipo_retencion_fuente_bienPlantillaFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_retencion_fuente_bienPlantillaFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_fuente_bienPlantillaFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_retencion_fuente_bienPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_fuente_bienPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_fuente_bienPlantillaFacturaUpdate"));



					
		this.jLabelid_tipo_retencion_fuente_servicioPlantillaFactura = new JLabelMe();
		this.jLabelid_tipo_retencion_fuente_servicioPlantillaFactura.setText(""+PlantillaFacturaConstantesFunciones.LABEL_IDTIPORETENCIONFUENTESERVICIO+" :");
		this.jLabelid_tipo_retencion_fuente_servicioPlantillaFactura.setToolTipText("Ret. Fuente Servicio");
		this.jLabelid_tipo_retencion_fuente_servicioPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_retencion_fuente_servicioPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_retencion_fuente_servicioPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencion_fuente_servicioPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_retencion_fuente_servicioPlantillaFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_retencion_fuente_servicioPlantillaFactura.setToolTipText(PlantillaFacturaConstantesFunciones.LABEL_IDTIPORETENCIONFUENTESERVICIO);
		this.gridaBagLayoutPlantillaFactura = new GridBagLayout();
		this.jPanelid_tipo_retencion_fuente_servicioPlantillaFactura.setLayout(this.gridaBagLayoutPlantillaFactura);


		jComboBoxid_tipo_retencion_fuente_servicioPlantillaFactura= new JComboBoxMe();
		jComboBoxid_tipo_retencion_fuente_servicioPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_fuente_servicioPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_fuente_servicioPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencion_fuente_servicioPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_retencion_fuente_servicioPlantillaFactura= new JButtonMe();
		this.jButtonid_tipo_retencion_fuente_servicioPlantillaFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_fuente_servicioPlantillaFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_fuente_servicioPlantillaFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_fuente_servicioPlantillaFactura.setText("Buscar");
		this.jButtonid_tipo_retencion_fuente_servicioPlantillaFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_retencion_fuente_servicioPlantillaFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_fuente_servicioPlantillaFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_retencion_fuente_servicioPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_fuente_servicioPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_fuente_servicioPlantillaFactura"));

		this.jButtonid_tipo_retencion_fuente_servicioPlantillaFacturaBusqueda= new JButtonMe();
		this.jButtonid_tipo_retencion_fuente_servicioPlantillaFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_fuente_servicioPlantillaFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_fuente_servicioPlantillaFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_fuente_servicioPlantillaFacturaBusqueda.setText("U");
		this.jButtonid_tipo_retencion_fuente_servicioPlantillaFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_retencion_fuente_servicioPlantillaFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_fuente_servicioPlantillaFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_retencion_fuente_servicioPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_fuente_servicioPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_fuente_servicioPlantillaFacturaBusqueda"));

		if(this.plantillafacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_retencion_fuente_servicioPlantillaFacturaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_retencion_fuente_servicioPlantillaFacturaUpdate= new JButtonMe();
		this.jButtonid_tipo_retencion_fuente_servicioPlantillaFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_fuente_servicioPlantillaFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_fuente_servicioPlantillaFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_fuente_servicioPlantillaFacturaUpdate.setText("U");
		this.jButtonid_tipo_retencion_fuente_servicioPlantillaFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_retencion_fuente_servicioPlantillaFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_fuente_servicioPlantillaFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_retencion_fuente_servicioPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_fuente_servicioPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_fuente_servicioPlantillaFacturaUpdate"));



					
		this.jLabelid_tipo_retencion_iva_bienPlantillaFactura = new JLabelMe();
		this.jLabelid_tipo_retencion_iva_bienPlantillaFactura.setText(""+PlantillaFacturaConstantesFunciones.LABEL_IDTIPORETENCIONIVABIEN+" :");
		this.jLabelid_tipo_retencion_iva_bienPlantillaFactura.setToolTipText("Ret. Iva Bien");
		this.jLabelid_tipo_retencion_iva_bienPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_retencion_iva_bienPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_retencion_iva_bienPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencion_iva_bienPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_retencion_iva_bienPlantillaFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_retencion_iva_bienPlantillaFactura.setToolTipText(PlantillaFacturaConstantesFunciones.LABEL_IDTIPORETENCIONIVABIEN);
		this.gridaBagLayoutPlantillaFactura = new GridBagLayout();
		this.jPanelid_tipo_retencion_iva_bienPlantillaFactura.setLayout(this.gridaBagLayoutPlantillaFactura);


		jComboBoxid_tipo_retencion_iva_bienPlantillaFactura= new JComboBoxMe();
		jComboBoxid_tipo_retencion_iva_bienPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_iva_bienPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_iva_bienPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencion_iva_bienPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_retencion_iva_bienPlantillaFactura= new JButtonMe();
		this.jButtonid_tipo_retencion_iva_bienPlantillaFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_iva_bienPlantillaFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_iva_bienPlantillaFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_iva_bienPlantillaFactura.setText("Buscar");
		this.jButtonid_tipo_retencion_iva_bienPlantillaFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_retencion_iva_bienPlantillaFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_iva_bienPlantillaFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_retencion_iva_bienPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_iva_bienPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_iva_bienPlantillaFactura"));

		this.jButtonid_tipo_retencion_iva_bienPlantillaFacturaBusqueda= new JButtonMe();
		this.jButtonid_tipo_retencion_iva_bienPlantillaFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva_bienPlantillaFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva_bienPlantillaFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_iva_bienPlantillaFacturaBusqueda.setText("U");
		this.jButtonid_tipo_retencion_iva_bienPlantillaFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_retencion_iva_bienPlantillaFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_iva_bienPlantillaFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_retencion_iva_bienPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_iva_bienPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_iva_bienPlantillaFacturaBusqueda"));

		if(this.plantillafacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_retencion_iva_bienPlantillaFacturaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_retencion_iva_bienPlantillaFacturaUpdate= new JButtonMe();
		this.jButtonid_tipo_retencion_iva_bienPlantillaFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva_bienPlantillaFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva_bienPlantillaFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_iva_bienPlantillaFacturaUpdate.setText("U");
		this.jButtonid_tipo_retencion_iva_bienPlantillaFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_retencion_iva_bienPlantillaFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_iva_bienPlantillaFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_retencion_iva_bienPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_iva_bienPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_iva_bienPlantillaFacturaUpdate"));



					
		this.jLabelid_tipo_retencion_iva_servicioPlantillaFactura = new JLabelMe();
		this.jLabelid_tipo_retencion_iva_servicioPlantillaFactura.setText(""+PlantillaFacturaConstantesFunciones.LABEL_IDTIPORETENCIONIVASERVICIO+" :");
		this.jLabelid_tipo_retencion_iva_servicioPlantillaFactura.setToolTipText("Ret. Iva Servicio");
		this.jLabelid_tipo_retencion_iva_servicioPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_retencion_iva_servicioPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_retencion_iva_servicioPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencion_iva_servicioPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_retencion_iva_servicioPlantillaFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_retencion_iva_servicioPlantillaFactura.setToolTipText(PlantillaFacturaConstantesFunciones.LABEL_IDTIPORETENCIONIVASERVICIO);
		this.gridaBagLayoutPlantillaFactura = new GridBagLayout();
		this.jPanelid_tipo_retencion_iva_servicioPlantillaFactura.setLayout(this.gridaBagLayoutPlantillaFactura);


		jComboBoxid_tipo_retencion_iva_servicioPlantillaFactura= new JComboBoxMe();
		jComboBoxid_tipo_retencion_iva_servicioPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_iva_servicioPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_iva_servicioPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencion_iva_servicioPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_retencion_iva_servicioPlantillaFactura= new JButtonMe();
		this.jButtonid_tipo_retencion_iva_servicioPlantillaFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_iva_servicioPlantillaFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_iva_servicioPlantillaFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_iva_servicioPlantillaFactura.setText("Buscar");
		this.jButtonid_tipo_retencion_iva_servicioPlantillaFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_retencion_iva_servicioPlantillaFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_iva_servicioPlantillaFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_retencion_iva_servicioPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_iva_servicioPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_iva_servicioPlantillaFactura"));

		this.jButtonid_tipo_retencion_iva_servicioPlantillaFacturaBusqueda= new JButtonMe();
		this.jButtonid_tipo_retencion_iva_servicioPlantillaFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva_servicioPlantillaFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva_servicioPlantillaFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_iva_servicioPlantillaFacturaBusqueda.setText("U");
		this.jButtonid_tipo_retencion_iva_servicioPlantillaFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_retencion_iva_servicioPlantillaFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_iva_servicioPlantillaFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_retencion_iva_servicioPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_iva_servicioPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_iva_servicioPlantillaFacturaBusqueda"));

		if(this.plantillafacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_retencion_iva_servicioPlantillaFacturaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_retencion_iva_servicioPlantillaFacturaUpdate= new JButtonMe();
		this.jButtonid_tipo_retencion_iva_servicioPlantillaFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva_servicioPlantillaFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva_servicioPlantillaFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_iva_servicioPlantillaFacturaUpdate.setText("U");
		this.jButtonid_tipo_retencion_iva_servicioPlantillaFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_retencion_iva_servicioPlantillaFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_iva_servicioPlantillaFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_retencion_iva_servicioPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_iva_servicioPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_iva_servicioPlantillaFacturaUpdate"));



					
		this.jLabelid_cuenta_contable_gastoPlantillaFactura = new JLabelMe();
		this.jLabelid_cuenta_contable_gastoPlantillaFactura.setText(""+PlantillaFacturaConstantesFunciones.LABEL_IDCUENTACONTABLEGASTO+" :");
		this.jLabelid_cuenta_contable_gastoPlantillaFactura.setToolTipText("C. Gasto");
		this.jLabelid_cuenta_contable_gastoPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_contable_gastoPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_contable_gastoPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_gastoPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_gastoPlantillaFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_gastoPlantillaFactura.setToolTipText(PlantillaFacturaConstantesFunciones.LABEL_IDCUENTACONTABLEGASTO);
		this.gridaBagLayoutPlantillaFactura = new GridBagLayout();
		this.jPanelid_cuenta_contable_gastoPlantillaFactura.setLayout(this.gridaBagLayoutPlantillaFactura);


		jComboBoxid_cuenta_contable_gastoPlantillaFactura= new JComboBoxMe();
		jComboBoxid_cuenta_contable_gastoPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_gastoPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_gastoPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_gastoPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_cuenta_contable_gastoPlantillaFactura.setEnabled(false);

		this.jButtonid_cuenta_contable_gastoPlantillaFactura= new JButtonMe();
		this.jButtonid_cuenta_contable_gastoPlantillaFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_gastoPlantillaFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_gastoPlantillaFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_gastoPlantillaFactura.setText("Buscar");
		this.jButtonid_cuenta_contable_gastoPlantillaFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_gastoPlantillaFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_gastoPlantillaFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_gastoPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_gastoPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_gastoPlantillaFactura"));

		this.jButtonid_cuenta_contable_gastoPlantillaFacturaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_gastoPlantillaFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_gastoPlantillaFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_gastoPlantillaFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_gastoPlantillaFacturaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_gastoPlantillaFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_gastoPlantillaFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_gastoPlantillaFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_gastoPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_gastoPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_gastoPlantillaFacturaBusqueda"));

		if(this.plantillafacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_gastoPlantillaFacturaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_gastoPlantillaFacturaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_gastoPlantillaFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_gastoPlantillaFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_gastoPlantillaFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_gastoPlantillaFacturaUpdate.setText("U");
		this.jButtonid_cuenta_contable_gastoPlantillaFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_gastoPlantillaFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_gastoPlantillaFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_gastoPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_gastoPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_gastoPlantillaFacturaUpdate"));


		jButtonid_cuenta_contable_gastoPlantillaFacturaArbol= new JButtonMe();
		jButtonid_cuenta_contable_gastoPlantillaFacturaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_gastoPlantillaFacturaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_gastoPlantillaFacturaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_gastoPlantillaFacturaArbol.setText("Arbol");
		jButtonid_cuenta_contable_gastoPlantillaFacturaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_gastoPlantillaFacturaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_gastoPlantillaFacturaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_gastoPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_gastoPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_gastoPlantillaFacturaArbol"));



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
		//this.jInternalFrameDetallePlantillaFactura = new PlantillaFacturaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Plantilla Factura DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPlantillaFactura= new GridBagLayout();
		

		
		String sToolTipPlantillaFactura="";
		sToolTipPlantillaFactura=PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPlantillaFactura+="(Contabilidad.PlantillaFactura)";
		}
		
		if(!this.plantillafacturaSessionBean.getEsGuardarRelacionado()) {
			sToolTipPlantillaFactura+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPlantillaFactura = new JButtonMe();
		this.jButtonModificarPlantillaFactura = new JButtonMe();
        this.jButtonActualizarPlantillaFactura = new JButtonMe();
        this.jButtonEliminarPlantillaFactura = new JButtonMe();
        this.jButtonCancelarPlantillaFactura = new JButtonMe();
        this.jButtonGuardarCambiosPlantillaFactura = new JButtonMe();
		this.jButtonGuardarCambiosTablaPlantillaFactura = new JButtonMe();
		this.jButtonCerrarPlantillaFactura = new JButtonMe();
		
		this.jScrollPanelDatosPlantillaFactura = new JScrollPane();   
        this.jScrollPanelDatosEdicionPlantillaFactura = new JScrollPane();
		this.jScrollPanelDatosGeneralPlantillaFactura = new JScrollPane();
				
		
		
		this.jPanelCamposPlantillaFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPlantillaFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPlantillaFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPlantillaFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralPlantillaFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocuenta_contablePlantillaFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciotipo_retencionPlantillaFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Plantilla Factura";
		
		if(!this.plantillafacturaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Plantilla Facturas" + this.sPath));
		} else {
			this.jScrollPanelDatosPlantillaFactura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPlantillaFactura.setName("jPanelCamposPlantillaFactura"); 

		this.jPanelCamposOcultosPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPlantillaFactura.setName("jPanelCamposOcultosPlantillaFactura"); 

        this.jPanelAccionesPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPlantillaFactura.setToolTipText("Acciones");
        this.jPanelAccionesPlantillaFactura.setName("Acciones"); 

		this.jPanelAccionesFormularioPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPlantillaFactura.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPlantillaFactura.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralPlantillaFactura.setName("jPanelCamposFingeneralPlantillaFactura");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralPlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocuenta_contablePlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuenta Contable"));
		this.jPanelCamposIniciocuenta_contablePlantillaFactura.setName("jPanelCamposFincuenta_contablePlantillaFactura");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocuenta_contablePlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciotipo_retencionPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo Retencion"));
		this.jPanelCamposIniciotipo_retencionPlantillaFactura.setName("jPanelCamposFintipo_retencionPlantillaFactura");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciotipo_retencionPlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPlantillaFactura.setText("Nuevo");
		this.jButtonModificarPlantillaFactura.setText("Editar");
        this.jButtonActualizarPlantillaFactura.setText("Actualizar");
        this.jButtonEliminarPlantillaFactura.setText("Eliminar");
        this.jButtonCancelarPlantillaFactura.setText("Cancelar");
        this.jButtonGuardarCambiosPlantillaFactura.setText("Guardar");
		this.jButtonGuardarCambiosTablaPlantillaFactura.setText("Guardar");
		this.jButtonCerrarPlantillaFactura.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPlantillaFactura,"nuevo_button","Nuevo",this.plantillafacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPlantillaFactura,"modificar_button","Editar",this.plantillafacturaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPlantillaFactura,"actualizar_button","Actualizar",this.plantillafacturaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPlantillaFactura,"eliminar_button","Eliminar",this.plantillafacturaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPlantillaFactura,"cancelar_button","Cancelar",this.plantillafacturaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPlantillaFactura,"guardarcambios_button","Guardar",this.plantillafacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPlantillaFactura,"guardarcambiostabla_button","Guardar",this.plantillafacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPlantillaFactura,"cerrar_button","Salir",this.plantillafacturaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPlantillaFactura.setToolTipText("Nuevo"+" "+PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPlantillaFactura.setToolTipText("Editar"+" "+PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPlantillaFactura.setToolTipText("Actualizar"+" "+PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPlantillaFactura.setToolTipText("Eliminar)"+" "+PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPlantillaFactura.setToolTipText("Cancelar"+" "+PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPlantillaFactura.setToolTipText("Guardar"+" "+PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPlantillaFactura.setToolTipText("Guardar"+" "+PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPlantillaFactura.setToolTipText("Salir"+" "+PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPlantillaFactura";
		inputMap = this.jButtonNuevoPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPlantillaFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPlantillaFactura"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPlantillaFactura";
		inputMap = this.jButtonActualizarPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPlantillaFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPlantillaFactura"));
		
		//ELIMINAR
		sMapKey = "EliminarPlantillaFactura";
		inputMap = this.jButtonEliminarPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPlantillaFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPlantillaFactura"));
		
		//CANCELAR	
		sMapKey = "CancelarPlantillaFactura";
		inputMap = this.jButtonCancelarPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPlantillaFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPlantillaFactura"));
		
		//CERRAR		
		sMapKey = "CerrarPlantillaFactura";
		inputMap = this.jButtonCerrarPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPlantillaFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPlantillaFactura"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPlantillaFactura";
		inputMap = this.jButtonGuardarCambiosTablaPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPlantillaFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPlantillaFactura"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPlantillaFactura = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPlantillaFactura.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPlantillaFactura.setToolTipText("Nuevo PlantillaFactura");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPlantillaFactura = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPlantillaFactura.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPlantillaFactura.setToolTipText("Sin Cerrar Ventana PlantillaFactura");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePlantillaFactura = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePlantillaFactura.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePlantillaFactura.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPlantillaFactura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPlantillaFactura.setText("Accion");
		this.jComboBoxTiposAccionesPlantillaFactura.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPlantillaFactura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPlantillaFactura.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPlantillaFactura.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPlantillaFactura = new JLabelMe();
		
		this.jLabelAccionesPlantillaFactura.setText("Acciones");		
		this.jLabelAccionesPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPlantillaFactura();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPlantillaFactura();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPlantillaFactura=new JTabbedPane();
		this.jTabbedPaneRelacionesPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPlantillaFactura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPlantillaFactura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPlantillaFactura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPlantillaFactura.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPlantillaFactura.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPlantillaFactura.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPlantillaFactura = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPlantillaFactura = new GridBagLayout();
		
		this.jPanelCamposPlantillaFactura.setLayout(gridaBagLayoutCamposPlantillaFactura);
		this.jPanelCamposOcultosPlantillaFactura.setLayout(gridaBagLayoutCamposOcultosPlantillaFactura);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralPlantillaFactura= new GridBagLayout();
		this.jPanelCamposIniciogeneralPlantillaFactura.setLayout(gridaBagLayoutCamposIniciogeneralPlantillaFactura);

		GridBagLayout gridaBagLayoutCamposIniciocuenta_contablePlantillaFactura= new GridBagLayout();
		this.jPanelCamposIniciocuenta_contablePlantillaFactura.setLayout(gridaBagLayoutCamposIniciocuenta_contablePlantillaFactura);

		GridBagLayout gridaBagLayoutCamposIniciotipo_retencionPlantillaFactura= new GridBagLayout();
		this.jPanelCamposIniciotipo_retencionPlantillaFactura.setLayout(gridaBagLayoutCamposIniciotipo_retencionPlantillaFactura);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlantillaFactura.gridy = 0;
	this.gridBagConstraintsPlantillaFactura.gridx = 0;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPlantillaFactura.add(jLabelIdPlantillaFactura, this.gridBagConstraintsPlantillaFactura);



	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlantillaFactura.gridy = 0;
	this.gridBagConstraintsPlantillaFactura.gridx = 1;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPlantillaFactura.add(jLabelidPlantillaFactura, this.gridBagConstraintsPlantillaFactura);


	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlantillaFactura.gridy = 0;
	this.gridBagConstraintsPlantillaFactura.gridx = 0;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPlantillaFactura.add(jLabelid_empresaPlantillaFactura, this.gridBagConstraintsPlantillaFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		//this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlantillaFactura.gridy = 0;
		this.gridBagConstraintsPlantillaFactura.gridx = 2;
		this.gridBagConstraintsPlantillaFactura.ipadx = 0;
		this.gridBagConstraintsPlantillaFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPlantillaFactura.add(jButtonid_empresaPlantillaFacturaBusqueda, this.gridBagConstraintsPlantillaFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		//this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlantillaFactura.gridy = 0;
		this.gridBagConstraintsPlantillaFactura.gridx = 3;
		this.gridBagConstraintsPlantillaFactura.ipadx = 0;
		this.gridBagConstraintsPlantillaFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPlantillaFactura.add(jButtonid_empresaPlantillaFacturaUpdate, this.gridBagConstraintsPlantillaFactura);
	}

	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlantillaFactura.gridy = 0;
	this.gridBagConstraintsPlantillaFactura.gridx = 1;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPlantillaFactura.add(jComboBoxid_empresaPlantillaFactura, this.gridBagConstraintsPlantillaFactura);


	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlantillaFactura.gridy = 0;
	this.gridBagConstraintsPlantillaFactura.gridx = 0;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoPlantillaFactura.add(jLabelcodigoPlantillaFactura, this.gridBagConstraintsPlantillaFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		//this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlantillaFactura.gridy = 0;
		this.gridBagConstraintsPlantillaFactura.gridx = 2;
		this.gridBagConstraintsPlantillaFactura.ipadx = 0;
		this.gridBagConstraintsPlantillaFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoPlantillaFactura.add(jButtoncodigoPlantillaFacturaBusqueda, this.gridBagConstraintsPlantillaFactura);
	}

	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlantillaFactura.gridy = 0;
	this.gridBagConstraintsPlantillaFactura.gridx = 1;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoPlantillaFactura.add(jTextFieldcodigoPlantillaFactura, this.gridBagConstraintsPlantillaFactura);


	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlantillaFactura.gridy = 0;
	this.gridBagConstraintsPlantillaFactura.gridx = 0;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombrePlantillaFactura.add(jLabelnombrePlantillaFactura, this.gridBagConstraintsPlantillaFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		//this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlantillaFactura.gridy = 0;
		this.gridBagConstraintsPlantillaFactura.gridx = 2;
		this.gridBagConstraintsPlantillaFactura.ipadx = 0;
		this.gridBagConstraintsPlantillaFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombrePlantillaFactura.add(jButtonnombrePlantillaFacturaBusqueda, this.gridBagConstraintsPlantillaFactura);
	}

	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlantillaFactura.gridy = 0;
	this.gridBagConstraintsPlantillaFactura.gridx = 1;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombrePlantillaFactura.add(jscrollPanenombrePlantillaFactura, this.gridBagConstraintsPlantillaFactura);


	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlantillaFactura.gridy = 0;
	this.gridBagConstraintsPlantillaFactura.gridx = 0;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionPlantillaFactura.add(jLabeldescripcionPlantillaFactura, this.gridBagConstraintsPlantillaFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		//this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlantillaFactura.gridy = 0;
		this.gridBagConstraintsPlantillaFactura.gridx = 2;
		this.gridBagConstraintsPlantillaFactura.ipadx = 0;
		this.gridBagConstraintsPlantillaFactura.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionPlantillaFactura.add(jButtondescripcionPlantillaFacturaBusqueda, this.gridBagConstraintsPlantillaFactura);
	}

	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlantillaFactura.gridy = 0;
	this.gridBagConstraintsPlantillaFactura.gridx = 1;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionPlantillaFactura.add(jscrollPanedescripcionPlantillaFactura, this.gridBagConstraintsPlantillaFactura);


	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlantillaFactura.gridy = 0;
	this.gridBagConstraintsPlantillaFactura.gridx = 0;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_proveedorPlantillaFactura.add(jLabeles_proveedorPlantillaFactura, this.gridBagConstraintsPlantillaFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		//this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlantillaFactura.gridy = 0;
		this.gridBagConstraintsPlantillaFactura.gridx = 2;
		this.gridBagConstraintsPlantillaFactura.ipadx = 0;
		this.gridBagConstraintsPlantillaFactura.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_proveedorPlantillaFactura.add(jButtones_proveedorPlantillaFacturaBusqueda, this.gridBagConstraintsPlantillaFactura);
	}

	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlantillaFactura.gridy = 0;
	this.gridBagConstraintsPlantillaFactura.gridx = 1;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_proveedorPlantillaFactura.add(jCheckBoxes_proveedorPlantillaFactura, this.gridBagConstraintsPlantillaFactura);


	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlantillaFactura.gridy = 0;
	this.gridBagConstraintsPlantillaFactura.gridx = 0;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_aplicadaPlantillaFactura.add(jLabelid_cuenta_contable_aplicadaPlantillaFactura, this.gridBagConstraintsPlantillaFactura);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	//this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlantillaFactura.gridy = 0;
	this.gridBagConstraintsPlantillaFactura.gridx = 2;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_aplicadaPlantillaFactura.add(jButtonid_cuenta_contable_aplicadaPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	//this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlantillaFactura.gridy = 0;
	this.gridBagConstraintsPlantillaFactura.gridx = 3;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_aplicadaPlantillaFactura.add(jButtonid_cuenta_contable_aplicadaPlantillaFacturaArbol, this.gridBagConstraintsPlantillaFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		//this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlantillaFactura.gridy = 0;
		this.gridBagConstraintsPlantillaFactura.gridx = 4;
		this.gridBagConstraintsPlantillaFactura.ipadx = 0;
		this.gridBagConstraintsPlantillaFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_aplicadaPlantillaFactura.add(jButtonid_cuenta_contable_aplicadaPlantillaFacturaBusqueda, this.gridBagConstraintsPlantillaFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		//this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlantillaFactura.gridy = 0;
		this.gridBagConstraintsPlantillaFactura.gridx = 5;
		this.gridBagConstraintsPlantillaFactura.ipadx = 0;
		this.gridBagConstraintsPlantillaFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_aplicadaPlantillaFactura.add(jButtonid_cuenta_contable_aplicadaPlantillaFacturaUpdate, this.gridBagConstraintsPlantillaFactura);
	}

	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlantillaFactura.gridy = 0;
	this.gridBagConstraintsPlantillaFactura.gridx = 1;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_aplicadaPlantillaFactura.add(jComboBoxid_cuenta_contable_aplicadaPlantillaFactura, this.gridBagConstraintsPlantillaFactura);


	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlantillaFactura.gridy = 0;
	this.gridBagConstraintsPlantillaFactura.gridx = 0;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_credito_bienPlantillaFactura.add(jLabelid_cuenta_contable_credito_bienPlantillaFactura, this.gridBagConstraintsPlantillaFactura);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	//this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlantillaFactura.gridy = 0;
	this.gridBagConstraintsPlantillaFactura.gridx = 2;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_credito_bienPlantillaFactura.add(jButtonid_cuenta_contable_credito_bienPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	//this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlantillaFactura.gridy = 0;
	this.gridBagConstraintsPlantillaFactura.gridx = 3;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_credito_bienPlantillaFactura.add(jButtonid_cuenta_contable_credito_bienPlantillaFacturaArbol, this.gridBagConstraintsPlantillaFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		//this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlantillaFactura.gridy = 0;
		this.gridBagConstraintsPlantillaFactura.gridx = 4;
		this.gridBagConstraintsPlantillaFactura.ipadx = 0;
		this.gridBagConstraintsPlantillaFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_credito_bienPlantillaFactura.add(jButtonid_cuenta_contable_credito_bienPlantillaFacturaBusqueda, this.gridBagConstraintsPlantillaFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		//this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlantillaFactura.gridy = 0;
		this.gridBagConstraintsPlantillaFactura.gridx = 5;
		this.gridBagConstraintsPlantillaFactura.ipadx = 0;
		this.gridBagConstraintsPlantillaFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_credito_bienPlantillaFactura.add(jButtonid_cuenta_contable_credito_bienPlantillaFacturaUpdate, this.gridBagConstraintsPlantillaFactura);
	}

	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlantillaFactura.gridy = 0;
	this.gridBagConstraintsPlantillaFactura.gridx = 1;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_credito_bienPlantillaFactura.add(jComboBoxid_cuenta_contable_credito_bienPlantillaFactura, this.gridBagConstraintsPlantillaFactura);


	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlantillaFactura.gridy = 0;
	this.gridBagConstraintsPlantillaFactura.gridx = 0;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_credito_servicioPlantillaFactura.add(jLabelid_cuenta_contable_credito_servicioPlantillaFactura, this.gridBagConstraintsPlantillaFactura);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	//this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlantillaFactura.gridy = 0;
	this.gridBagConstraintsPlantillaFactura.gridx = 2;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_credito_servicioPlantillaFactura.add(jButtonid_cuenta_contable_credito_servicioPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	//this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlantillaFactura.gridy = 0;
	this.gridBagConstraintsPlantillaFactura.gridx = 3;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_credito_servicioPlantillaFactura.add(jButtonid_cuenta_contable_credito_servicioPlantillaFacturaArbol, this.gridBagConstraintsPlantillaFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		//this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlantillaFactura.gridy = 0;
		this.gridBagConstraintsPlantillaFactura.gridx = 4;
		this.gridBagConstraintsPlantillaFactura.ipadx = 0;
		this.gridBagConstraintsPlantillaFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_credito_servicioPlantillaFactura.add(jButtonid_cuenta_contable_credito_servicioPlantillaFacturaBusqueda, this.gridBagConstraintsPlantillaFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		//this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlantillaFactura.gridy = 0;
		this.gridBagConstraintsPlantillaFactura.gridx = 5;
		this.gridBagConstraintsPlantillaFactura.ipadx = 0;
		this.gridBagConstraintsPlantillaFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_credito_servicioPlantillaFactura.add(jButtonid_cuenta_contable_credito_servicioPlantillaFacturaUpdate, this.gridBagConstraintsPlantillaFactura);
	}

	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlantillaFactura.gridy = 0;
	this.gridBagConstraintsPlantillaFactura.gridx = 1;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_credito_servicioPlantillaFactura.add(jComboBoxid_cuenta_contable_credito_servicioPlantillaFactura, this.gridBagConstraintsPlantillaFactura);


	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlantillaFactura.gridy = 0;
	this.gridBagConstraintsPlantillaFactura.gridx = 0;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_retencion_fuente_bienPlantillaFactura.add(jLabelid_tipo_retencion_fuente_bienPlantillaFactura, this.gridBagConstraintsPlantillaFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		//this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlantillaFactura.gridy = 0;
		this.gridBagConstraintsPlantillaFactura.gridx = 2;
		this.gridBagConstraintsPlantillaFactura.ipadx = 0;
		this.gridBagConstraintsPlantillaFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_fuente_bienPlantillaFactura.add(jButtonid_tipo_retencion_fuente_bienPlantillaFacturaBusqueda, this.gridBagConstraintsPlantillaFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		//this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlantillaFactura.gridy = 0;
		this.gridBagConstraintsPlantillaFactura.gridx = 3;
		this.gridBagConstraintsPlantillaFactura.ipadx = 0;
		this.gridBagConstraintsPlantillaFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_fuente_bienPlantillaFactura.add(jButtonid_tipo_retencion_fuente_bienPlantillaFacturaUpdate, this.gridBagConstraintsPlantillaFactura);
	}

	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlantillaFactura.gridy = 0;
	this.gridBagConstraintsPlantillaFactura.gridx = 1;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_retencion_fuente_bienPlantillaFactura.add(jComboBoxid_tipo_retencion_fuente_bienPlantillaFactura, this.gridBagConstraintsPlantillaFactura);


	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlantillaFactura.gridy = 0;
	this.gridBagConstraintsPlantillaFactura.gridx = 0;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_retencion_fuente_servicioPlantillaFactura.add(jLabelid_tipo_retencion_fuente_servicioPlantillaFactura, this.gridBagConstraintsPlantillaFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		//this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlantillaFactura.gridy = 0;
		this.gridBagConstraintsPlantillaFactura.gridx = 2;
		this.gridBagConstraintsPlantillaFactura.ipadx = 0;
		this.gridBagConstraintsPlantillaFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_fuente_servicioPlantillaFactura.add(jButtonid_tipo_retencion_fuente_servicioPlantillaFacturaBusqueda, this.gridBagConstraintsPlantillaFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		//this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlantillaFactura.gridy = 0;
		this.gridBagConstraintsPlantillaFactura.gridx = 3;
		this.gridBagConstraintsPlantillaFactura.ipadx = 0;
		this.gridBagConstraintsPlantillaFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_fuente_servicioPlantillaFactura.add(jButtonid_tipo_retencion_fuente_servicioPlantillaFacturaUpdate, this.gridBagConstraintsPlantillaFactura);
	}

	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlantillaFactura.gridy = 0;
	this.gridBagConstraintsPlantillaFactura.gridx = 1;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_retencion_fuente_servicioPlantillaFactura.add(jComboBoxid_tipo_retencion_fuente_servicioPlantillaFactura, this.gridBagConstraintsPlantillaFactura);


	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlantillaFactura.gridy = 0;
	this.gridBagConstraintsPlantillaFactura.gridx = 0;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_retencion_iva_bienPlantillaFactura.add(jLabelid_tipo_retencion_iva_bienPlantillaFactura, this.gridBagConstraintsPlantillaFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		//this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlantillaFactura.gridy = 0;
		this.gridBagConstraintsPlantillaFactura.gridx = 2;
		this.gridBagConstraintsPlantillaFactura.ipadx = 0;
		this.gridBagConstraintsPlantillaFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_iva_bienPlantillaFactura.add(jButtonid_tipo_retencion_iva_bienPlantillaFacturaBusqueda, this.gridBagConstraintsPlantillaFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		//this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlantillaFactura.gridy = 0;
		this.gridBagConstraintsPlantillaFactura.gridx = 3;
		this.gridBagConstraintsPlantillaFactura.ipadx = 0;
		this.gridBagConstraintsPlantillaFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_iva_bienPlantillaFactura.add(jButtonid_tipo_retencion_iva_bienPlantillaFacturaUpdate, this.gridBagConstraintsPlantillaFactura);
	}

	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlantillaFactura.gridy = 0;
	this.gridBagConstraintsPlantillaFactura.gridx = 1;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_retencion_iva_bienPlantillaFactura.add(jComboBoxid_tipo_retencion_iva_bienPlantillaFactura, this.gridBagConstraintsPlantillaFactura);


	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlantillaFactura.gridy = 0;
	this.gridBagConstraintsPlantillaFactura.gridx = 0;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_retencion_iva_servicioPlantillaFactura.add(jLabelid_tipo_retencion_iva_servicioPlantillaFactura, this.gridBagConstraintsPlantillaFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		//this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlantillaFactura.gridy = 0;
		this.gridBagConstraintsPlantillaFactura.gridx = 2;
		this.gridBagConstraintsPlantillaFactura.ipadx = 0;
		this.gridBagConstraintsPlantillaFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_iva_servicioPlantillaFactura.add(jButtonid_tipo_retencion_iva_servicioPlantillaFacturaBusqueda, this.gridBagConstraintsPlantillaFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		//this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlantillaFactura.gridy = 0;
		this.gridBagConstraintsPlantillaFactura.gridx = 3;
		this.gridBagConstraintsPlantillaFactura.ipadx = 0;
		this.gridBagConstraintsPlantillaFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_iva_servicioPlantillaFactura.add(jButtonid_tipo_retencion_iva_servicioPlantillaFacturaUpdate, this.gridBagConstraintsPlantillaFactura);
	}

	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlantillaFactura.gridy = 0;
	this.gridBagConstraintsPlantillaFactura.gridx = 1;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_retencion_iva_servicioPlantillaFactura.add(jComboBoxid_tipo_retencion_iva_servicioPlantillaFactura, this.gridBagConstraintsPlantillaFactura);


	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlantillaFactura.gridy = 0;
	this.gridBagConstraintsPlantillaFactura.gridx = 0;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_gastoPlantillaFactura.add(jLabelid_cuenta_contable_gastoPlantillaFactura, this.gridBagConstraintsPlantillaFactura);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	//this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlantillaFactura.gridy = 0;
	this.gridBagConstraintsPlantillaFactura.gridx = 2;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_gastoPlantillaFactura.add(jButtonid_cuenta_contable_gastoPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	//this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlantillaFactura.gridy = 0;
	this.gridBagConstraintsPlantillaFactura.gridx = 3;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_gastoPlantillaFactura.add(jButtonid_cuenta_contable_gastoPlantillaFacturaArbol, this.gridBagConstraintsPlantillaFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		//this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlantillaFactura.gridy = 0;
		this.gridBagConstraintsPlantillaFactura.gridx = 4;
		this.gridBagConstraintsPlantillaFactura.ipadx = 0;
		this.gridBagConstraintsPlantillaFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_gastoPlantillaFactura.add(jButtonid_cuenta_contable_gastoPlantillaFacturaBusqueda, this.gridBagConstraintsPlantillaFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		//this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlantillaFactura.gridy = 0;
		this.gridBagConstraintsPlantillaFactura.gridx = 5;
		this.gridBagConstraintsPlantillaFactura.ipadx = 0;
		this.gridBagConstraintsPlantillaFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_gastoPlantillaFactura.add(jButtonid_cuenta_contable_gastoPlantillaFacturaUpdate, this.gridBagConstraintsPlantillaFactura);
	}

	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlantillaFactura.gridy = 0;
	this.gridBagConstraintsPlantillaFactura.gridx = 1;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_gastoPlantillaFactura.add(jComboBoxid_cuenta_contable_gastoPlantillaFactura, this.gridBagConstraintsPlantillaFactura);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlantillaFactura.gridy = iYPanelCamposOcultosPlantillaFactura;
	this.gridBagConstraintsPlantillaFactura.gridx = iXPanelCamposOcultosPlantillaFactura++;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPlantillaFactura.add(this.jPanelid_empresaPlantillaFactura, this.gridBagConstraintsPlantillaFactura);



	if(iXPanelCamposOcultosPlantillaFactura % 1==0) {
		iXPanelCamposOcultosPlantillaFactura=0;
		iYPanelCamposOcultosPlantillaFactura++;
	}
	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlantillaFactura.gridy = iYPanelCamposOcultosPlantillaFactura;
	this.gridBagConstraintsPlantillaFactura.gridx = iXPanelCamposOcultosPlantillaFactura++;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPlantillaFactura.add(this.jPanelid_cuenta_contable_gastoPlantillaFactura, this.gridBagConstraintsPlantillaFactura);



	if(iXPanelCamposOcultosPlantillaFactura % 1==0) {
		iXPanelCamposOcultosPlantillaFactura=0;
		iYPanelCamposOcultosPlantillaFactura++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlantillaFactura.gridy = iYPanelCamposIniciogeneralPlantillaFactura;
	this.gridBagConstraintsPlantillaFactura.gridx = iXPanelCamposIniciogeneralPlantillaFactura++;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPlantillaFactura.add(this.jPanelidPlantillaFactura, this.gridBagConstraintsPlantillaFactura);



	if(iXPanelCamposIniciogeneralPlantillaFactura % 1==0) {
		iXPanelCamposIniciogeneralPlantillaFactura=0;
		iYPanelCamposIniciogeneralPlantillaFactura++;
	}
	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlantillaFactura.gridy = iYPanelCamposIniciogeneralPlantillaFactura;
	this.gridBagConstraintsPlantillaFactura.gridx = iXPanelCamposIniciogeneralPlantillaFactura++;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPlantillaFactura.add(this.jPanelcodigoPlantillaFactura, this.gridBagConstraintsPlantillaFactura);



	if(iXPanelCamposIniciogeneralPlantillaFactura % 1==0) {
		iXPanelCamposIniciogeneralPlantillaFactura=0;
		iYPanelCamposIniciogeneralPlantillaFactura++;
	}
	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlantillaFactura.gridy = iYPanelCamposIniciogeneralPlantillaFactura;
	this.gridBagConstraintsPlantillaFactura.gridx = iXPanelCamposIniciogeneralPlantillaFactura++;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPlantillaFactura.add(this.jPanelnombrePlantillaFactura, this.gridBagConstraintsPlantillaFactura);



	if(iXPanelCamposIniciogeneralPlantillaFactura % 1==0) {
		iXPanelCamposIniciogeneralPlantillaFactura=0;
		iYPanelCamposIniciogeneralPlantillaFactura++;
	}
	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlantillaFactura.gridy = iYPanelCamposIniciogeneralPlantillaFactura;
	this.gridBagConstraintsPlantillaFactura.gridx = iXPanelCamposIniciogeneralPlantillaFactura++;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPlantillaFactura.add(this.jPaneldescripcionPlantillaFactura, this.gridBagConstraintsPlantillaFactura);



	if(iXPanelCamposIniciogeneralPlantillaFactura % 1==0) {
		iXPanelCamposIniciogeneralPlantillaFactura=0;
		iYPanelCamposIniciogeneralPlantillaFactura++;
	}
	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlantillaFactura.gridy = iYPanelCamposIniciogeneralPlantillaFactura;
	this.gridBagConstraintsPlantillaFactura.gridx = iXPanelCamposIniciogeneralPlantillaFactura++;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPlantillaFactura.add(this.jPaneles_proveedorPlantillaFactura, this.gridBagConstraintsPlantillaFactura);



	if(iXPanelCamposIniciogeneralPlantillaFactura % 1==0) {
		iXPanelCamposIniciogeneralPlantillaFactura=0;
		iYPanelCamposIniciogeneralPlantillaFactura++;
	}
	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlantillaFactura.gridy = iYPanelCamposIniciocuenta_contablePlantillaFactura;
	this.gridBagConstraintsPlantillaFactura.gridx = iXPanelCamposIniciocuenta_contablePlantillaFactura++;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contablePlantillaFactura.add(this.jPanelid_cuenta_contable_aplicadaPlantillaFactura, this.gridBagConstraintsPlantillaFactura);



	if(iXPanelCamposIniciocuenta_contablePlantillaFactura % 1==0) {
		iXPanelCamposIniciocuenta_contablePlantillaFactura=0;
		iYPanelCamposIniciocuenta_contablePlantillaFactura++;
	}
	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlantillaFactura.gridy = iYPanelCamposIniciocuenta_contablePlantillaFactura;
	this.gridBagConstraintsPlantillaFactura.gridx = iXPanelCamposIniciocuenta_contablePlantillaFactura++;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contablePlantillaFactura.add(this.jPanelid_cuenta_contable_credito_bienPlantillaFactura, this.gridBagConstraintsPlantillaFactura);



	if(iXPanelCamposIniciocuenta_contablePlantillaFactura % 1==0) {
		iXPanelCamposIniciocuenta_contablePlantillaFactura=0;
		iYPanelCamposIniciocuenta_contablePlantillaFactura++;
	}
	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlantillaFactura.gridy = iYPanelCamposIniciocuenta_contablePlantillaFactura;
	this.gridBagConstraintsPlantillaFactura.gridx = iXPanelCamposIniciocuenta_contablePlantillaFactura++;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contablePlantillaFactura.add(this.jPanelid_cuenta_contable_credito_servicioPlantillaFactura, this.gridBagConstraintsPlantillaFactura);



	if(iXPanelCamposIniciocuenta_contablePlantillaFactura % 1==0) {
		iXPanelCamposIniciocuenta_contablePlantillaFactura=0;
		iYPanelCamposIniciocuenta_contablePlantillaFactura++;
	}

	iXPanelCamposIniciotipo_retencionPlantillaFactura=0;
	iYPanelCamposIniciotipo_retencionPlantillaFactura++;

	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlantillaFactura.gridy = iYPanelCamposIniciotipo_retencionPlantillaFactura;
	this.gridBagConstraintsPlantillaFactura.gridx = iXPanelCamposIniciotipo_retencionPlantillaFactura++;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotipo_retencionPlantillaFactura.add(this.jPanelid_tipo_retencion_fuente_bienPlantillaFactura, this.gridBagConstraintsPlantillaFactura);



	if(iXPanelCamposIniciotipo_retencionPlantillaFactura % 1==0) {
		iXPanelCamposIniciotipo_retencionPlantillaFactura=0;
		iYPanelCamposIniciotipo_retencionPlantillaFactura++;
	}
	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlantillaFactura.gridy = iYPanelCamposIniciotipo_retencionPlantillaFactura;
	this.gridBagConstraintsPlantillaFactura.gridx = iXPanelCamposIniciotipo_retencionPlantillaFactura++;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotipo_retencionPlantillaFactura.add(this.jPanelid_tipo_retencion_fuente_servicioPlantillaFactura, this.gridBagConstraintsPlantillaFactura);



	if(iXPanelCamposIniciotipo_retencionPlantillaFactura % 1==0) {
		iXPanelCamposIniciotipo_retencionPlantillaFactura=0;
		iYPanelCamposIniciotipo_retencionPlantillaFactura++;
	}
	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlantillaFactura.gridy = iYPanelCamposIniciotipo_retencionPlantillaFactura;
	this.gridBagConstraintsPlantillaFactura.gridx = iXPanelCamposIniciotipo_retencionPlantillaFactura++;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotipo_retencionPlantillaFactura.add(this.jPanelid_tipo_retencion_iva_bienPlantillaFactura, this.gridBagConstraintsPlantillaFactura);



	if(iXPanelCamposIniciotipo_retencionPlantillaFactura % 1==0) {
		iXPanelCamposIniciotipo_retencionPlantillaFactura=0;
		iYPanelCamposIniciotipo_retencionPlantillaFactura++;
	}
	this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlantillaFactura.gridy = iYPanelCamposIniciotipo_retencionPlantillaFactura;
	this.gridBagConstraintsPlantillaFactura.gridx = iXPanelCamposIniciotipo_retencionPlantillaFactura++;
	this.gridBagConstraintsPlantillaFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotipo_retencionPlantillaFactura.add(this.jPanelid_tipo_retencion_iva_servicioPlantillaFactura, this.gridBagConstraintsPlantillaFactura);



	if(iXPanelCamposIniciotipo_retencionPlantillaFactura % 1==0) {
		iXPanelCamposIniciotipo_retencionPlantillaFactura=0;
		iYPanelCamposIniciotipo_retencionPlantillaFactura++;
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
			
		GridBagLayout gridaBagLayoutAccionesPlantillaFactura= new GridBagLayout();
		this.jPanelAccionesPlantillaFactura.setLayout(gridaBagLayoutAccionesPlantillaFactura);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPlantillaFactura= new GridBagLayout();
		this.jPanelAccionesFormularioPlantillaFactura.setLayout(gridaBagLayoutAccionesFormularioPlantillaFactura);
		
		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPlantillaFactura.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPlantillaFactura.add(this.jComboBoxTiposAccionesFormularioPlantillaFactura, this.gridBagConstraintsPlantillaFactura);

		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPlantillaFactura.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPlantillaFactura.add(this.jCheckBoxPostAccionNuevoPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.plantillafacturaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsPlantillaFactura.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPlantillaFactura.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPlantillaFactura.add(this.jCheckBoxPostAccionSinCerrarPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.plantillafacturaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.plantillafacturaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsPlantillaFactura.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPlantillaFactura.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPlantillaFactura.add(this.jCheckBoxPostAccionSinMensajePlantillaFactura, this.gridBagConstraintsPlantillaFactura);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlantillaFactura.gridy = 0;
		this.gridBagConstraintsPlantillaFactura.gridx = iPosXAccion++;
			
		this.jPanelAccionesPlantillaFactura.add(this.jButtonModificarPlantillaFactura, this.gridBagConstraintsPlantillaFactura);							

		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlantillaFactura.gridy = 0;
		this.gridBagConstraintsPlantillaFactura.gridx =iPosXAccion++;
			
		this.jPanelAccionesPlantillaFactura.add(this.jButtonEliminarPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
		
			
		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.gridy = 0;		
		this.gridBagConstraintsPlantillaFactura.gridx = iPosXAccion++;
		
		this.jPanelAccionesPlantillaFactura.add(this.jButtonActualizarPlantillaFactura, this.gridBagConstraintsPlantillaFactura);


		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.gridy = 0;		
		this.gridBagConstraintsPlantillaFactura.gridx = iPosXAccion++;
		
		this.jPanelAccionesPlantillaFactura.add(this.jButtonGuardarCambiosPlantillaFactura, this.gridBagConstraintsPlantillaFactura);	
		
		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.gridy = 0;		
		this.gridBagConstraintsPlantillaFactura.gridx =iPosXAccion++;
		
		this.jPanelAccionesPlantillaFactura.add(this.jButtonCancelarPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPlantillaFactura = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPlantillaFactura);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.plantillafacturaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();						
			this.gridBagConstraintsPlantillaFactura.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPlantillaFactura.gridx = 0;		
			//this.gridBagConstraintsPlantillaFactura.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPlantillaFactura.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPlantillaFactura.gridx =0;
		this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPlantillaFactura.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PlantillaFacturaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePlantillaFactura = new PlantillaFacturaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Plantilla Factura DATOS");
			
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
			
	        //this.setTitle("[FOR] - Plantilla Factura DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Plantilla Factura Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PlantillaFacturaModel plantillafacturaModel=new PlantillaFacturaModel(this);
			
			//SI USARA CLASE INTERNA
			//PlantillaFacturaModel.PlantillaFacturaFocusTraversalPolicy plantillafacturaFocusTraversalPolicy = plantillafacturaModel.new PlantillaFacturaFocusTraversalPolicy(this);
			
			//plantillafacturaFocusTraversalPolicy.setplantillafacturaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(plantillafacturaModel);
			
			
			this.jContentPaneDetallePlantillaFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePlantillaFactura = new GridBagLayout();	
			this.jContentPaneDetallePlantillaFactura.setLayout(gridaBagLayoutDetallePlantillaFactura);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPlantillaFactura = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
				this.gridBagConstraintsPlantillaFactura.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPlantillaFactura.gridx = 0;
					
				
				this.jContentPaneDetallePlantillaFactura.add(jTtoolBarDetallePlantillaFactura, gridBagConstraintsPlantillaFactura);								
				
}
			
			this.jScrollPanelDatosEdicionPlantillaFactura=   new JScrollPane(jContentPaneDetallePlantillaFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPlantillaFactura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPlantillaFactura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPlantillaFactura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPlantillaFactura=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPlantillaFactura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPlantillaFactura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPlantillaFactura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			


		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.CENTER;

		this.gridBagConstraintsPlantillaFactura.gridy = iGridyRelaciones++;
		this.gridBagConstraintsPlantillaFactura.gridx = 0;

		this.jContentPaneDetallePlantillaFactura.add(jPanelCamposIniciogeneralPlantillaFactura, gridBagConstraintsPlantillaFactura);


		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsPlantillaFactura.gridy = iGridyRelaciones++;
		this.gridBagConstraintsPlantillaFactura.gridx = 0;

		this.jContentPaneDetallePlantillaFactura.add(jPanelCamposIniciocuenta_contablePlantillaFactura, gridBagConstraintsPlantillaFactura);


		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.CENTER;

		this.gridBagConstraintsPlantillaFactura.gridy = iGridyRelaciones++;
		this.gridBagConstraintsPlantillaFactura.gridx = 0;

		this.jContentPaneDetallePlantillaFactura.add(jPanelCamposIniciotipo_retencionPlantillaFactura, gridBagConstraintsPlantillaFactura);
			
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
						&& plantillafacturaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.plantillafacturaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPlantillaFactura= new GridBagConstraints();
						this.gridBagConstraintsPlantillaFactura.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPlantillaFactura.gridx = 0;
						this.jContentPaneDetallePlantillaFactura.add(this.jTabbedPaneRelacionesPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPlantillaFactura.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPlantillaFactura.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
					this.gridBagConstraintsPlantillaFactura.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPlantillaFactura.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPlantillaFactura.gridx = 0;
					
				
					this.jContentPaneDetallePlantillaFactura.add(jPanelCamposOcultosPlantillaFactura, gridBagConstraintsPlantillaFactura);
				
					this.jPanelCamposOcultosPlantillaFactura.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsPlantillaFactura.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPlantillaFactura.gridx = 0;
	        this.gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePlantillaFactura.add(this.jPanelAccionesFormularioPlantillaFactura, this.gridBagConstraintsPlantillaFactura);							
			
			
			
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
	        this.gridBagConstraintsPlantillaFactura.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPlantillaFactura.gridx = 0;
	        
			
			this.jContentPaneDetallePlantillaFactura.add(this.jPanelAccionesPlantillaFactura, this.gridBagConstraintsPlantillaFactura);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPlantillaFactura);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPlantillaFactura=   new JScrollPane(this.jPanelCamposPlantillaFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPlantillaFactura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPlantillaFactura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPlantillaFactura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsPlantillaFactura.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPlantillaFactura.gridx = 0;
			this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPlantillaFactura.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsPlantillaFactura.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPlantillaFactura.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPlantillaFactura, this.gridBagConstraintsPlantillaFactura);			
			
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsPlantillaFactura.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPlantillaFactura.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPlantillaFactura, this.gridBagConstraintsPlantillaFactura);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPlantillaFactura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
			
			
		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPlantillaFactura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
		
			
		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPlantillaFactura.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPlantillaFactura;//jContentPane;
		
		return jScrollPanelDatosEdicionPlantillaFactura;
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
