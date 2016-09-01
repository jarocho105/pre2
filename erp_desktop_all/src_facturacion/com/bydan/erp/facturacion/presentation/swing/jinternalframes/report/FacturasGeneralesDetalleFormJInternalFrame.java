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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.report.*;
import com.bydan.erp.facturacion.util.report.FacturasGeneralesConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.report.*;
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
public class FacturasGeneralesDetalleFormJInternalFrame extends FacturasGeneralesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleFacturasGenerales;
	
	protected JMenuBar jmenuBarDetalleFacturasGenerales;
	
	protected JMenu jmenuDetalleFacturasGenerales;
	protected JMenu jmenuDetalleArchivoFacturasGenerales;
	protected JMenu jmenuDetalleAccionesFacturasGenerales;
	protected JMenu jmenuDetalleDatosFacturasGenerales;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleFacturasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFacturasGenerales;	
	protected GridBagConstraints gridBagConstraintsFacturasGenerales;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected FacturasGeneralesBeanSwingJInternalFrameAdditional jInternalFrameDetalleFacturasGenerales;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_zona="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoFacturaBeanSwingJInternalFrame tipofacturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipofactura="";
	
	public FacturasGeneralesSessionBean facturasgeneralesSessionBean;
	
	
	
	
	public ZonaSessionBean zonaSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoFacturaSessionBean tipofacturaSessionBean;	
	
	public FacturasGeneralesLogic facturasgeneralesLogic;
	
	public JScrollPane jScrollPanelDatosFacturasGenerales;
	public JScrollPane jScrollPanelDatosEdicionFacturasGenerales;
	public JScrollPane jScrollPanelDatosGeneralFacturasGenerales;
	
	protected JPanel jPanelCamposFacturasGenerales;    
	protected JPanel jPanelCamposOcultosFacturasGenerales;    	
	protected JPanel jPanelAccionesFacturasGenerales;
	protected JPanel jPanelAccionesFormularioFacturasGenerales;
    
	
	
	protected Integer iXPanelCamposFacturasGenerales=0;
	protected Integer iYPanelCamposFacturasGenerales=0;
	
	protected Integer iXPanelCamposOcultosFacturasGenerales=0;
	protected Integer iYPanelCamposOcultosFacturasGenerales=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoFacturasGenerales;
	public JButton jButtonModificarFacturasGenerales;
	public JButton jButtonActualizarFacturasGenerales;
    public JButton jButtonEliminarFacturasGenerales;
	public JButton jButtonCancelarFacturasGenerales;
    public JButton jButtonGuardarCambiosFacturasGenerales;
	public JButton jButtonGuardarCambiosTablaFacturasGenerales;
	protected JButton jButtonCerrarFacturasGenerales;
	
	
	protected JButton jButtonProcesarInformacionFacturasGenerales;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoFacturasGenerales;
	protected JCheckBox jCheckBoxPostAccionSinCerrarFacturasGenerales;
	protected JCheckBox jCheckBoxPostAccionSinMensajeFacturasGenerales;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFacturasGenerales;
	protected JButton jButtonModificarToolBarFacturasGenerales;
	protected JButton jButtonActualizarToolBarFacturasGenerales;
    protected JButton jButtonEliminarToolBarFacturasGenerales;
	protected JButton jButtonCancelarToolBarFacturasGenerales;
    protected JButton jButtonGuardarCambiosToolBarFacturasGenerales;
	protected JButton jButtonGuardarCambiosTablaToolBarFacturasGenerales;
	protected JButton jButtonMostrarOcultarTablaToolBarFacturasGenerales;
	protected JButton jButtonCerrarToolBarFacturasGenerales;
	
	protected JButton jButtonProcesarInformacionToolBarFacturasGenerales;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFacturasGenerales;
	protected JMenuItem jMenuItemModificarFacturasGenerales;
	protected JMenuItem jMenuItemActualizarFacturasGenerales;
    protected JMenuItem jMenuItemEliminarFacturasGenerales;
	protected JMenuItem jMenuItemCancelarFacturasGenerales;
    protected JMenuItem jMenuItemGuardarCambiosFacturasGenerales;
	protected JMenuItem jMenuItemGuardarCambiosTablaFacturasGenerales;
	protected JMenuItem jMenuItemCerrarFacturasGenerales;
	protected JMenuItem jMenuItemDetalleCerrarFacturasGenerales;
	protected JMenuItem jMenuItemDetalleMostarOcultarFacturasGenerales;
	
	protected JMenuItem jMenuItemProcesarInformacionFacturasGenerales;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFacturasGenerales;
	protected JMenuItem jMenuItemMostrarOcultarFacturasGenerales;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFacturasGenerales;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFacturasGenerales;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFacturasGenerales;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioFacturasGenerales;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidFacturasGenerales;
	public JLabel jLabelIdFacturasGenerales;
	public JLabel jLabelidFacturasGenerales;
	public JButton jButtonidFacturasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_clienteFacturasGenerales;
	public JLabel jLabelid_tipo_clienteFacturasGenerales;
	public JTextField jTextFieldid_tipo_clienteFacturasGenerales;
	public JButton jButtonid_tipo_clienteFacturasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_desdeFacturasGenerales;
	public JLabel jLabelfecha_emision_desdeFacturasGenerales;
	//public JFormattedTextField jDateChooserfecha_emision_desdeFacturasGenerales;

	public JDateChooser jDateChooserfecha_emision_desdeFacturasGenerales;
	public JButton jButtonfecha_emision_desdeFacturasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaFacturasGenerales;
	public JLabel jLabelfecha_emision_hastaFacturasGenerales;
	//public JFormattedTextField jDateChooserfecha_emision_hastaFacturasGenerales;

	public JDateChooser jDateChooserfecha_emision_hastaFacturasGenerales;
	public JButton jButtonfecha_emision_hastaFacturasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_zonaFacturasGenerales;
	public JLabel jLabelnombre_zonaFacturasGenerales;
	public JTextField jTextFieldnombre_zonaFacturasGenerales;
	public JButton jButtonnombre_zonaFacturasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completo_clienteFacturasGenerales;
	public JLabel jLabelnombre_completo_clienteFacturasGenerales;
	public JTextArea jTextAreanombre_completo_clienteFacturasGenerales;
	public JScrollPane jscrollPanenombre_completo_clienteFacturasGenerales;
	public JButton jButtonnombre_completo_clienteFacturasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_tipo_facturaFacturasGenerales;
	public JLabel jLabelnombre_tipo_facturaFacturasGenerales;
	public JTextArea jTextAreanombre_tipo_facturaFacturasGenerales;
	public JScrollPane jscrollPanenombre_tipo_facturaFacturasGenerales;
	public JButton jButtonnombre_tipo_facturaFacturasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionFacturasGenerales;
	public JLabel jLabelfecha_emisionFacturasGenerales;
	//public JFormattedTextField jDateChooserfecha_emisionFacturasGenerales;

	public JDateChooser jDateChooserfecha_emisionFacturasGenerales;
	public JButton jButtonfecha_emisionFacturasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vencimientoFacturasGenerales;
	public JLabel jLabelfecha_vencimientoFacturasGenerales;
	//public JFormattedTextField jDateChooserfecha_vencimientoFacturasGenerales;

	public JDateChooser jDateChooserfecha_vencimientoFacturasGenerales;
	public JButton jButtonfecha_vencimientoFacturasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelnumero_pre_impresoFacturasGenerales;
	public JLabel jLabelnumero_pre_impresoFacturasGenerales;
	public JTextField jTextFieldnumero_pre_impresoFacturasGenerales;
	public JButton jButtonnumero_pre_impresoFacturasGeneralesBusqueda= new JButtonMe();

	public JPanel jPaneltotal_descuentoFacturasGenerales;
	public JLabel jLabeltotal_descuentoFacturasGenerales;
	public JTextField jTextFieldtotal_descuentoFacturasGenerales;
	public JButton jButtontotal_descuentoFacturasGeneralesBusqueda= new JButtonMe();

	public JPanel jPaneltotal_otroFacturasGenerales;
	public JLabel jLabeltotal_otroFacturasGenerales;
	public JTextField jTextFieldtotal_otroFacturasGenerales;
	public JButton jButtontotal_otroFacturasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelsub_totalFacturasGenerales;
	public JLabel jLabelsub_totalFacturasGenerales;
	public JTextField jTextFieldsub_totalFacturasGenerales;
	public JButton jButtonsub_totalFacturasGeneralesBusqueda= new JButtonMe();

	public JPanel jPaneltotalFacturasGenerales;
	public JLabel jLabeltotalFacturasGenerales;
	public JTextField jTextFieldtotalFacturasGenerales;
	public JButton jButtontotalFacturasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelivaFacturasGenerales;
	public JLabel jLabelivaFacturasGenerales;
	public JTextField jTextFieldivaFacturasGenerales;
	public JButton jButtonivaFacturasGeneralesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_zonaFacturasGenerales;
	public JLabel jLabelid_zonaFacturasGenerales;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_zonaFacturasGenerales;
	public JButton jButtonid_zonaFacturasGenerales= new JButtonMe();
	public JButton jButtonid_zonaFacturasGeneralesUpdate= new JButtonMe();
	public JButton jButtonid_zonaFacturasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaFacturasGenerales;
	public JLabel jLabelid_empresaFacturasGenerales;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaFacturasGenerales;
	public JButton jButtonid_empresaFacturasGenerales= new JButtonMe();
	public JButton jButtonid_empresaFacturasGeneralesUpdate= new JButtonMe();
	public JButton jButtonid_empresaFacturasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalFacturasGenerales;
	public JLabel jLabelid_sucursalFacturasGenerales;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalFacturasGenerales;
	public JButton jButtonid_sucursalFacturasGenerales= new JButtonMe();
	public JButton jButtonid_sucursalFacturasGeneralesUpdate= new JButtonMe();
	public JButton jButtonid_sucursalFacturasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteFacturasGenerales;
	public JLabel jLabelid_clienteFacturasGenerales;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFacturasGenerales;
	public JButton jButtonid_clienteFacturasGenerales= new JButtonMe();
	public JButton jButtonid_clienteFacturasGeneralesUpdate= new JButtonMe();
	public JButton jButtonid_clienteFacturasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_facturaFacturasGenerales;
	public JLabel jLabelid_tipo_facturaFacturasGenerales;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_facturaFacturasGenerales;
	public JButton jButtonid_tipo_facturaFacturasGenerales= new JButtonMe();
	public JButton jButtonid_tipo_facturaFacturasGeneralesUpdate= new JButtonMe();
	public JButton jButtonid_tipo_facturaFacturasGeneralesBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesFacturasGenerales;
	
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
	public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public FacturasGeneralesDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposFacturasGenerales=new JPanel();
				this.jPanelAccionesFormularioFacturasGenerales=new JPanel();
				this.jmenuBarDetalleFacturasGenerales=new JMenuBar();
				this.jTtoolBarDetalleFacturasGenerales=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturasGeneralesDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("FacturasGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public FacturasGeneralesDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("FacturasGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturasGeneralesDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturasGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturasGeneralesDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturasGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturasGeneralesDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FacturasGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarFacturasGenerales() {
		return this.jButtonActualizarToolBarFacturasGenerales;
	}
	
	public JButton getjButtonEliminarToolBarFacturasGenerales() {
		return this.jButtonEliminarToolBarFacturasGenerales;
	}
	
	public JButton getjButtonCancelarToolBarFacturasGenerales() {
		return this.jButtonCancelarToolBarFacturasGenerales;
	}		
	
	public JButton getjButtonProcesarInformacionFacturasGenerales() {
		return this.jButtonProcesarInformacionFacturasGenerales;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFacturasGenerales)	{
		this.jButtonProcesarInformacionFacturasGenerales = jButtonProcesarInformacionFacturasGenerales;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFacturasGenerales() {
		return this.jComboBoxTiposAccionesFacturasGenerales;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFacturasGenerales(
			JComboBox jComboBoxTiposRelacionesFacturasGenerales) {
		this.jComboBoxTiposRelacionesFacturasGenerales = jComboBoxTiposRelacionesFacturasGenerales;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFacturasGenerales(
			JComboBox jComboBoxTiposAccionesFacturasGenerales) {
		this.jComboBoxTiposAccionesFacturasGenerales = jComboBoxTiposAccionesFacturasGenerales;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioFacturasGenerales() {
		return this.jComboBoxTiposAccionesFormularioFacturasGenerales;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioFacturasGenerales(
			JComboBox jComboBoxTiposAccionesFormularioFacturasGenerales) {
		this.jComboBoxTiposAccionesFormularioFacturasGenerales = jComboBoxTiposAccionesFormularioFacturasGenerales;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.facturasgeneralesSessionBean=new FacturasGeneralesSessionBean();
		
		this.facturasgeneralesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.facturasgeneralesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.facturasgeneralesSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FacturasGeneralesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FacturasGeneralesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FacturasGeneralesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Facturas Generales MANTENIMIENTO"));
		
		
		if(iWidth > 1950) {
			iWidth=1950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.facturasgeneralesSessionBean.getEsGuardarRelacionado()) {
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
	
		FacturasGeneralesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleFacturasGenerales= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarFacturasGenerales=new JButtonMe();
				this.jButtonModificarToolBarFacturasGenerales=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarFacturasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarFacturasGenerales,this.jTtoolBarDetalleFacturasGenerales,
							"actualizar","actualizar","Actualizar"+" "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarFacturasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarFacturasGenerales,this.jTtoolBarDetalleFacturasGenerales,
							"eliminar","eliminar","Eliminar"+" "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarFacturasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarFacturasGenerales,this.jTtoolBarDetalleFacturasGenerales,
							"cancelar","cancelar","Cancelar"+" "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarFacturasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarFacturasGenerales,this.jTtoolBarDetalleFacturasGenerales,
							"guardarcambios","guardarcambios","Guardar"+" "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleFacturasGenerales=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleFacturasGenerales=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoFacturasGenerales=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesFacturasGenerales=new JMenuMe("Acciones");
		this.jmenuDetalleDatosFacturasGenerales=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFacturasGenerales= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFacturasGenerales.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFacturasGenerales,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarFacturasGenerales= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarFacturasGenerales.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarFacturasGenerales,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarFacturasGenerales= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarFacturasGenerales.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarFacturasGenerales,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarFacturasGenerales= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarFacturasGenerales.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarFacturasGenerales,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarFacturasGenerales= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarFacturasGenerales.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarFacturasGenerales,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosFacturasGenerales= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFacturasGenerales.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFacturasGenerales,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFacturasGenerales= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFacturasGenerales.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFacturasGenerales,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarFacturasGenerales= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarFacturasGenerales.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarFacturasGenerales,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFacturasGenerales= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFacturasGenerales.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFacturasGenerales,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFacturasGenerales= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFacturasGenerales.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFacturasGenerales,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoFacturasGenerales.add(this.jMenuItemDetalleCerrarFacturasGenerales);
		
		this.jmenuDetalleAccionesFacturasGenerales.add(this.jMenuItemActualizarFacturasGenerales);
		this.jmenuDetalleAccionesFacturasGenerales.add(this.jMenuItemEliminarFacturasGenerales);
		this.jmenuDetalleAccionesFacturasGenerales.add(this.jMenuItemCancelarFacturasGenerales);		
		
		//this.jmenuDetalleDatosFacturasGenerales.add(this.jMenuItemDetalleAbrirOrderByFacturasGenerales);				
		this.jmenuDetalleDatosFacturasGenerales.add(this.jMenuItemDetalleMostarOcultarFacturasGenerales);				
				
		//this.jmenuDetalleAccionesFacturasGenerales.add(this.jMenuItemGuardarCambiosFacturasGenerales);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleFacturasGenerales.add(this.jmenuDetalleArchivoFacturasGenerales);		
		this.jmenuBarDetalleFacturasGenerales.add(this.jmenuDetalleAccionesFacturasGenerales);		
		this.jmenuBarDetalleFacturasGenerales.add(this.jmenuDetalleDatosFacturasGenerales);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleFacturasGenerales);				
	}
	
	
	public void inicializarElementosCamposFacturasGenerales() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdFacturasGenerales = new JLabelMe();
		jLabelIdFacturasGenerales.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidFacturasGenerales = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidFacturasGenerales.setToolTipText(FacturasGeneralesConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutFacturasGenerales= new GridBagLayout();

		this.jPanelidFacturasGenerales.setLayout(this.gridaBagLayoutFacturasGenerales);

		jLabelidFacturasGenerales = new JLabel();
		jLabelidFacturasGenerales.setText("Id");

		jLabelidFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelid_tipo_clienteFacturasGenerales = new JLabelMe();
		this.jLabelid_tipo_clienteFacturasGenerales.setText(""+FacturasGeneralesConstantesFunciones.LABEL_IDTIPOCLIENTE+" : *");
		this.jLabelid_tipo_clienteFacturasGenerales.setToolTipText("Tipo Cliente");
		this.jLabelid_tipo_clienteFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_clienteFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_clienteFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_clienteFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_clienteFacturasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_clienteFacturasGenerales.setToolTipText(FacturasGeneralesConstantesFunciones.LABEL_IDTIPOCLIENTE);
		this.gridaBagLayoutFacturasGenerales = new GridBagLayout();
		this.jPanelid_tipo_clienteFacturasGenerales.setLayout(this.gridaBagLayoutFacturasGenerales);


		jTextFieldid_tipo_clienteFacturasGenerales= new JTextFieldMe();
		jTextFieldid_tipo_clienteFacturasGenerales.setEnabled(false);
		jTextFieldid_tipo_clienteFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldid_tipo_clienteFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldid_tipo_clienteFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldid_tipo_clienteFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldid_tipo_clienteFacturasGenerales.setText("0");

		this.jButtonid_tipo_clienteFacturasGeneralesBusqueda= new JButtonMe();
		this.jButtonid_tipo_clienteFacturasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_clienteFacturasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_clienteFacturasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_clienteFacturasGeneralesBusqueda.setText("U");
		this.jButtonid_tipo_clienteFacturasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_clienteFacturasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_clienteFacturasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldid_tipo_clienteFacturasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldid_tipo_clienteFacturasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_clienteFacturasGeneralesBusqueda"));

		if(this.facturasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_clienteFacturasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_desdeFacturasGenerales = new JLabelMe();
		this.jLabelfecha_emision_desdeFacturasGenerales.setText(""+FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE+" : *");
		this.jLabelfecha_emision_desdeFacturasGenerales.setToolTipText("Fecha Emision Desde");
		this.jLabelfecha_emision_desdeFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_desdeFacturasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_desdeFacturasGenerales.setToolTipText(FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		this.gridaBagLayoutFacturasGenerales = new GridBagLayout();
		this.jPanelfecha_emision_desdeFacturasGenerales.setLayout(this.gridaBagLayoutFacturasGenerales);


		//jFormattedTextFieldfecha_emision_desdeFacturasGenerales= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_desdeFacturasGenerales= new JDateChooser();
		jDateChooserfecha_emision_desdeFacturasGenerales.setEnabled(false);
		jDateChooserfecha_emision_desdeFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_desdeFacturasGenerales.setDate(new Date());
		jDateChooserfecha_emision_desdeFacturasGenerales.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_desdeFacturasGenerales.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_desdeFacturasGeneralesBusqueda= new JButtonMe();
		this.jButtonfecha_emision_desdeFacturasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeFacturasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeFacturasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_desdeFacturasGeneralesBusqueda.setText("U");
		this.jButtonfecha_emision_desdeFacturasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_desdeFacturasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_desdeFacturasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_desdeFacturasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_desdeFacturasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_desdeFacturasGeneralesBusqueda"));

		if(this.facturasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_desdeFacturasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_hastaFacturasGenerales = new JLabelMe();
		this.jLabelfecha_emision_hastaFacturasGenerales.setText(""+FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaFacturasGenerales.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaFacturasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaFacturasGenerales.setToolTipText(FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutFacturasGenerales = new GridBagLayout();
		this.jPanelfecha_emision_hastaFacturasGenerales.setLayout(this.gridaBagLayoutFacturasGenerales);


		//jFormattedTextFieldfecha_emision_hastaFacturasGenerales= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaFacturasGenerales= new JDateChooser();
		jDateChooserfecha_emision_hastaFacturasGenerales.setEnabled(false);
		jDateChooserfecha_emision_hastaFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaFacturasGenerales.setDate(new Date());
		jDateChooserfecha_emision_hastaFacturasGenerales.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaFacturasGenerales.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaFacturasGeneralesBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaFacturasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaFacturasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaFacturasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaFacturasGeneralesBusqueda.setText("U");
		this.jButtonfecha_emision_hastaFacturasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaFacturasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaFacturasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaFacturasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaFacturasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaFacturasGeneralesBusqueda"));

		if(this.facturasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaFacturasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_zonaFacturasGenerales = new JLabelMe();
		this.jLabelnombre_zonaFacturasGenerales.setText(""+FacturasGeneralesConstantesFunciones.LABEL_NOMBREZONA+" : *");
		this.jLabelnombre_zonaFacturasGenerales.setToolTipText("Nombre Zona");
		this.jLabelnombre_zonaFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_zonaFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_zonaFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_zonaFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_zonaFacturasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_zonaFacturasGenerales.setToolTipText(FacturasGeneralesConstantesFunciones.LABEL_NOMBREZONA);
		this.gridaBagLayoutFacturasGenerales = new GridBagLayout();
		this.jPanelnombre_zonaFacturasGenerales.setLayout(this.gridaBagLayoutFacturasGenerales);


		jTextFieldnombre_zonaFacturasGenerales= new JTextFieldMe();

		jTextFieldnombre_zonaFacturasGenerales.setEnabled(false);
		jTextFieldnombre_zonaFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_zonaFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_zonaFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_zonaFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_zonaFacturasGeneralesBusqueda= new JButtonMe();
		this.jButtonnombre_zonaFacturasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_zonaFacturasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_zonaFacturasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_zonaFacturasGeneralesBusqueda.setText("U");
		this.jButtonnombre_zonaFacturasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_zonaFacturasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_zonaFacturasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_zonaFacturasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_zonaFacturasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_zonaFacturasGeneralesBusqueda"));

		if(this.facturasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_zonaFacturasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completo_clienteFacturasGenerales = new JLabelMe();
		this.jLabelnombre_completo_clienteFacturasGenerales.setText(""+FacturasGeneralesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+" : *");
		this.jLabelnombre_completo_clienteFacturasGenerales.setToolTipText("Nombre Completo Cliente");
		this.jLabelnombre_completo_clienteFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completo_clienteFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completo_clienteFacturasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completo_clienteFacturasGenerales.setToolTipText(FacturasGeneralesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		this.gridaBagLayoutFacturasGenerales = new GridBagLayout();
		this.jPanelnombre_completo_clienteFacturasGenerales.setLayout(this.gridaBagLayoutFacturasGenerales);


		jTextAreanombre_completo_clienteFacturasGenerales= new JTextAreaMe();
		jTextAreanombre_completo_clienteFacturasGenerales.setEnabled(false);
		jTextAreanombre_completo_clienteFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteFacturasGenerales.setLineWrap(true);
		jTextAreanombre_completo_clienteFacturasGenerales.setWrapStyleWord(true);
		jTextAreanombre_completo_clienteFacturasGenerales.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completo_clienteFacturasGenerales.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completo_clienteFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completo_clienteFacturasGenerales = new JScrollPane(jTextAreanombre_completo_clienteFacturasGenerales);
		jscrollPanenombre_completo_clienteFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clienteFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clienteFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completo_clienteFacturasGeneralesBusqueda= new JButtonMe();
		this.jButtonnombre_completo_clienteFacturasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteFacturasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteFacturasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completo_clienteFacturasGeneralesBusqueda.setText("U");
		this.jButtonnombre_completo_clienteFacturasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completo_clienteFacturasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completo_clienteFacturasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completo_clienteFacturasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completo_clienteFacturasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completo_clienteFacturasGeneralesBusqueda"));

		if(this.facturasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completo_clienteFacturasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_tipo_facturaFacturasGenerales = new JLabelMe();
		this.jLabelnombre_tipo_facturaFacturasGenerales.setText(""+FacturasGeneralesConstantesFunciones.LABEL_NOMBRETIPOFACTURA+" : *");
		this.jLabelnombre_tipo_facturaFacturasGenerales.setToolTipText("Nombre Tipo Factura");
		this.jLabelnombre_tipo_facturaFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_tipo_facturaFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_tipo_facturaFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_tipo_facturaFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_tipo_facturaFacturasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_tipo_facturaFacturasGenerales.setToolTipText(FacturasGeneralesConstantesFunciones.LABEL_NOMBRETIPOFACTURA);
		this.gridaBagLayoutFacturasGenerales = new GridBagLayout();
		this.jPanelnombre_tipo_facturaFacturasGenerales.setLayout(this.gridaBagLayoutFacturasGenerales);


		jTextAreanombre_tipo_facturaFacturasGenerales= new JTextAreaMe();
		jTextAreanombre_tipo_facturaFacturasGenerales.setEnabled(false);
		jTextAreanombre_tipo_facturaFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_facturaFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_facturaFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_facturaFacturasGenerales.setLineWrap(true);
		jTextAreanombre_tipo_facturaFacturasGenerales.setWrapStyleWord(true);
		jTextAreanombre_tipo_facturaFacturasGenerales.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_tipo_facturaFacturasGenerales.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_tipo_facturaFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_tipo_facturaFacturasGenerales = new JScrollPane(jTextAreanombre_tipo_facturaFacturasGenerales);
		jscrollPanenombre_tipo_facturaFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_tipo_facturaFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_tipo_facturaFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_tipo_facturaFacturasGeneralesBusqueda= new JButtonMe();
		this.jButtonnombre_tipo_facturaFacturasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_facturaFacturasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_facturaFacturasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_tipo_facturaFacturasGeneralesBusqueda.setText("U");
		this.jButtonnombre_tipo_facturaFacturasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_tipo_facturaFacturasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_tipo_facturaFacturasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_tipo_facturaFacturasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_tipo_facturaFacturasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_tipo_facturaFacturasGeneralesBusqueda"));

		if(this.facturasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_tipo_facturaFacturasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionFacturasGenerales = new JLabelMe();
		this.jLabelfecha_emisionFacturasGenerales.setText(""+FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionFacturasGenerales.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionFacturasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionFacturasGenerales.setToolTipText(FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutFacturasGenerales = new GridBagLayout();
		this.jPanelfecha_emisionFacturasGenerales.setLayout(this.gridaBagLayoutFacturasGenerales);


		//jFormattedTextFieldfecha_emisionFacturasGenerales= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionFacturasGenerales= new JDateChooser();
		jDateChooserfecha_emisionFacturasGenerales.setEnabled(false);
		jDateChooserfecha_emisionFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionFacturasGenerales.setDate(new Date());
		jDateChooserfecha_emisionFacturasGenerales.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionFacturasGenerales.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionFacturasGeneralesBusqueda= new JButtonMe();
		this.jButtonfecha_emisionFacturasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionFacturasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionFacturasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionFacturasGeneralesBusqueda.setText("U");
		this.jButtonfecha_emisionFacturasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionFacturasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionFacturasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionFacturasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionFacturasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionFacturasGeneralesBusqueda"));

		if(this.facturasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionFacturasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelfecha_vencimientoFacturasGenerales = new JLabelMe();
		this.jLabelfecha_vencimientoFacturasGenerales.setText(""+FacturasGeneralesConstantesFunciones.LABEL_FECHAVENCIMIENTO+" : *");
		this.jLabelfecha_vencimientoFacturasGenerales.setToolTipText("Fecha Vencimiento");
		this.jLabelfecha_vencimientoFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimientoFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vencimientoFacturasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vencimientoFacturasGenerales.setToolTipText(FacturasGeneralesConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		this.gridaBagLayoutFacturasGenerales = new GridBagLayout();
		this.jPanelfecha_vencimientoFacturasGenerales.setLayout(this.gridaBagLayoutFacturasGenerales);


		//jFormattedTextFieldfecha_vencimientoFacturasGenerales= new JFormattedTextFieldMe();

		jDateChooserfecha_vencimientoFacturasGenerales= new JDateChooser();
		jDateChooserfecha_vencimientoFacturasGenerales.setEnabled(false);
		jDateChooserfecha_vencimientoFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimientoFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vencimientoFacturasGenerales.setDate(new Date());
		jDateChooserfecha_vencimientoFacturasGenerales.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vencimientoFacturasGenerales.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vencimientoFacturasGeneralesBusqueda= new JButtonMe();
		this.jButtonfecha_vencimientoFacturasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoFacturasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoFacturasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vencimientoFacturasGeneralesBusqueda.setText("U");
		this.jButtonfecha_vencimientoFacturasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vencimientoFacturasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vencimientoFacturasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vencimientoFacturasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vencimientoFacturasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vencimientoFacturasGeneralesBusqueda"));

		if(this.facturasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vencimientoFacturasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelnumero_pre_impresoFacturasGenerales = new JLabelMe();
		this.jLabelnumero_pre_impresoFacturasGenerales.setText(""+FacturasGeneralesConstantesFunciones.LABEL_NUMEROPREIMPRESO+" : *");
		this.jLabelnumero_pre_impresoFacturasGenerales.setToolTipText("Numero Pre Impreso");
		this.jLabelnumero_pre_impresoFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_pre_impresoFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_pre_impresoFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_pre_impresoFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_pre_impresoFacturasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_pre_impresoFacturasGenerales.setToolTipText(FacturasGeneralesConstantesFunciones.LABEL_NUMEROPREIMPRESO);
		this.gridaBagLayoutFacturasGenerales = new GridBagLayout();
		this.jPanelnumero_pre_impresoFacturasGenerales.setLayout(this.gridaBagLayoutFacturasGenerales);


		jTextFieldnumero_pre_impresoFacturasGenerales= new JTextFieldMe();

		jTextFieldnumero_pre_impresoFacturasGenerales.setEnabled(false);
		jTextFieldnumero_pre_impresoFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impresoFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impresoFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_pre_impresoFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_pre_impresoFacturasGeneralesBusqueda= new JButtonMe();
		this.jButtonnumero_pre_impresoFacturasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impresoFacturasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impresoFacturasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_pre_impresoFacturasGeneralesBusqueda.setText("U");
		this.jButtonnumero_pre_impresoFacturasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_pre_impresoFacturasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_pre_impresoFacturasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_pre_impresoFacturasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_pre_impresoFacturasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_pre_impresoFacturasGeneralesBusqueda"));

		if(this.facturasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_pre_impresoFacturasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabeltotal_descuentoFacturasGenerales = new JLabelMe();
		this.jLabeltotal_descuentoFacturasGenerales.setText(""+FacturasGeneralesConstantesFunciones.LABEL_TOTALDESCUENTO+" : *");
		this.jLabeltotal_descuentoFacturasGenerales.setToolTipText("Total Descuento");
		this.jLabeltotal_descuentoFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_descuentoFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_descuentoFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_descuentoFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_descuentoFacturasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_descuentoFacturasGenerales.setToolTipText(FacturasGeneralesConstantesFunciones.LABEL_TOTALDESCUENTO);
		this.gridaBagLayoutFacturasGenerales = new GridBagLayout();
		this.jPaneltotal_descuentoFacturasGenerales.setLayout(this.gridaBagLayoutFacturasGenerales);


		jTextFieldtotal_descuentoFacturasGenerales= new JTextFieldMe();
		jTextFieldtotal_descuentoFacturasGenerales.setEnabled(false);
		jTextFieldtotal_descuentoFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_descuentoFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_descuentoFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_descuentoFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_descuentoFacturasGenerales.setText("0.0");

		this.jButtontotal_descuentoFacturasGeneralesBusqueda= new JButtonMe();
		this.jButtontotal_descuentoFacturasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_descuentoFacturasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_descuentoFacturasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_descuentoFacturasGeneralesBusqueda.setText("U");
		this.jButtontotal_descuentoFacturasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_descuentoFacturasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_descuentoFacturasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_descuentoFacturasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_descuentoFacturasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_descuentoFacturasGeneralesBusqueda"));

		if(this.facturasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_descuentoFacturasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabeltotal_otroFacturasGenerales = new JLabelMe();
		this.jLabeltotal_otroFacturasGenerales.setText(""+FacturasGeneralesConstantesFunciones.LABEL_TOTALOTRO+" : *");
		this.jLabeltotal_otroFacturasGenerales.setToolTipText("Total Otro");
		this.jLabeltotal_otroFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_otroFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_otroFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_otroFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_otroFacturasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_otroFacturasGenerales.setToolTipText(FacturasGeneralesConstantesFunciones.LABEL_TOTALOTRO);
		this.gridaBagLayoutFacturasGenerales = new GridBagLayout();
		this.jPaneltotal_otroFacturasGenerales.setLayout(this.gridaBagLayoutFacturasGenerales);


		jTextFieldtotal_otroFacturasGenerales= new JTextFieldMe();
		jTextFieldtotal_otroFacturasGenerales.setEnabled(false);
		jTextFieldtotal_otroFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_otroFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_otroFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_otroFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_otroFacturasGenerales.setText("0.0");

		this.jButtontotal_otroFacturasGeneralesBusqueda= new JButtonMe();
		this.jButtontotal_otroFacturasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_otroFacturasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_otroFacturasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_otroFacturasGeneralesBusqueda.setText("U");
		this.jButtontotal_otroFacturasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_otroFacturasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_otroFacturasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_otroFacturasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_otroFacturasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_otroFacturasGeneralesBusqueda"));

		if(this.facturasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_otroFacturasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelsub_totalFacturasGenerales = new JLabelMe();
		this.jLabelsub_totalFacturasGenerales.setText(""+FacturasGeneralesConstantesFunciones.LABEL_SUBTOTAL+" : *");
		this.jLabelsub_totalFacturasGenerales.setToolTipText("Sub Total");
		this.jLabelsub_totalFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsub_totalFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsub_totalFacturasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsub_totalFacturasGenerales.setToolTipText(FacturasGeneralesConstantesFunciones.LABEL_SUBTOTAL);
		this.gridaBagLayoutFacturasGenerales = new GridBagLayout();
		this.jPanelsub_totalFacturasGenerales.setLayout(this.gridaBagLayoutFacturasGenerales);


		jTextFieldsub_totalFacturasGenerales= new JTextFieldMe();
		jTextFieldsub_totalFacturasGenerales.setEnabled(false);
		jTextFieldsub_totalFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsub_totalFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsub_totalFacturasGenerales.setText("0.0");

		this.jButtonsub_totalFacturasGeneralesBusqueda= new JButtonMe();
		this.jButtonsub_totalFacturasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalFacturasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalFacturasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsub_totalFacturasGeneralesBusqueda.setText("U");
		this.jButtonsub_totalFacturasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsub_totalFacturasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsub_totalFacturasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsub_totalFacturasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsub_totalFacturasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sub_totalFacturasGeneralesBusqueda"));

		if(this.facturasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsub_totalFacturasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabeltotalFacturasGenerales = new JLabelMe();
		this.jLabeltotalFacturasGenerales.setText(""+FacturasGeneralesConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalFacturasGenerales.setToolTipText("Total");
		this.jLabeltotalFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalFacturasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalFacturasGenerales.setToolTipText(FacturasGeneralesConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutFacturasGenerales = new GridBagLayout();
		this.jPaneltotalFacturasGenerales.setLayout(this.gridaBagLayoutFacturasGenerales);


		jTextFieldtotalFacturasGenerales= new JTextFieldMe();
		jTextFieldtotalFacturasGenerales.setEnabled(false);
		jTextFieldtotalFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalFacturasGenerales.setText("0.0");

		this.jButtontotalFacturasGeneralesBusqueda= new JButtonMe();
		this.jButtontotalFacturasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalFacturasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalFacturasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalFacturasGeneralesBusqueda.setText("U");
		this.jButtontotalFacturasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalFacturasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalFacturasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalFacturasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalFacturasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalFacturasGeneralesBusqueda"));

		if(this.facturasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalFacturasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelivaFacturasGenerales = new JLabelMe();
		this.jLabelivaFacturasGenerales.setText(""+FacturasGeneralesConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaFacturasGenerales.setToolTipText("Iva");
		this.jLabelivaFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaFacturasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaFacturasGenerales.setToolTipText(FacturasGeneralesConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutFacturasGenerales = new GridBagLayout();
		this.jPanelivaFacturasGenerales.setLayout(this.gridaBagLayoutFacturasGenerales);


		jTextFieldivaFacturasGenerales= new JTextFieldMe();
		jTextFieldivaFacturasGenerales.setEnabled(false);
		jTextFieldivaFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaFacturasGenerales.setText("0.0");

		this.jButtonivaFacturasGeneralesBusqueda= new JButtonMe();
		this.jButtonivaFacturasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaFacturasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaFacturasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaFacturasGeneralesBusqueda.setText("U");
		this.jButtonivaFacturasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaFacturasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaFacturasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaFacturasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaFacturasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaFacturasGeneralesBusqueda"));

		if(this.facturasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaFacturasGeneralesBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysFacturasGenerales() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_zonaFacturasGenerales = new JLabelMe();
		this.jLabelid_zonaFacturasGenerales.setText(""+FacturasGeneralesConstantesFunciones.LABEL_IDZONA+" : *");
		this.jLabelid_zonaFacturasGenerales.setToolTipText("Zona");
		this.jLabelid_zonaFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_zonaFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_zonaFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_zonaFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_zonaFacturasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_zonaFacturasGenerales.setToolTipText(FacturasGeneralesConstantesFunciones.LABEL_IDZONA);
		this.gridaBagLayoutFacturasGenerales = new GridBagLayout();
		this.jPanelid_zonaFacturasGenerales.setLayout(this.gridaBagLayoutFacturasGenerales);


		jComboBoxid_zonaFacturasGenerales= new JComboBoxMe();
		jComboBoxid_zonaFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_zonaFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_zonaFacturasGenerales= new JButtonMe();
		this.jButtonid_zonaFacturasGenerales.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaFacturasGenerales.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaFacturasGenerales.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaFacturasGenerales.setText("Buscar");
		this.jButtonid_zonaFacturasGenerales.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_zonaFacturasGenerales.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaFacturasGenerales,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_zonaFacturasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaFacturasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaFacturasGenerales"));

		this.jButtonid_zonaFacturasGeneralesBusqueda= new JButtonMe();
		this.jButtonid_zonaFacturasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaFacturasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaFacturasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_zonaFacturasGeneralesBusqueda.setText("U");
		this.jButtonid_zonaFacturasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_zonaFacturasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaFacturasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_zonaFacturasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaFacturasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaFacturasGeneralesBusqueda"));

		if(this.facturasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_zonaFacturasGeneralesBusqueda.setVisible(false);		}

		this.jButtonid_zonaFacturasGeneralesUpdate= new JButtonMe();
		this.jButtonid_zonaFacturasGeneralesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaFacturasGeneralesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaFacturasGeneralesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_zonaFacturasGeneralesUpdate.setText("U");
		this.jButtonid_zonaFacturasGeneralesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_zonaFacturasGeneralesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaFacturasGeneralesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_zonaFacturasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaFacturasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaFacturasGeneralesUpdate"));



					
		this.jLabelid_empresaFacturasGenerales = new JLabelMe();
		this.jLabelid_empresaFacturasGenerales.setText(""+FacturasGeneralesConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaFacturasGenerales.setToolTipText("Empresa");
		this.jLabelid_empresaFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaFacturasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaFacturasGenerales.setToolTipText(FacturasGeneralesConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutFacturasGenerales = new GridBagLayout();
		this.jPanelid_empresaFacturasGenerales.setLayout(this.gridaBagLayoutFacturasGenerales);


		jComboBoxid_empresaFacturasGenerales= new JComboBoxMe();
		jComboBoxid_empresaFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaFacturasGenerales.setEnabled(false);

		this.jButtonid_empresaFacturasGenerales= new JButtonMe();
		this.jButtonid_empresaFacturasGenerales.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFacturasGenerales.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFacturasGenerales.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFacturasGenerales.setText("Buscar");
		this.jButtonid_empresaFacturasGenerales.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaFacturasGenerales.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFacturasGenerales,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaFacturasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFacturasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFacturasGenerales"));

		this.jButtonid_empresaFacturasGeneralesBusqueda= new JButtonMe();
		this.jButtonid_empresaFacturasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFacturasGeneralesBusqueda.setText("U");
		this.jButtonid_empresaFacturasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaFacturasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFacturasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaFacturasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFacturasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFacturasGeneralesBusqueda"));

		if(this.facturasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaFacturasGeneralesBusqueda.setVisible(false);		}

		this.jButtonid_empresaFacturasGeneralesUpdate= new JButtonMe();
		this.jButtonid_empresaFacturasGeneralesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturasGeneralesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturasGeneralesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFacturasGeneralesUpdate.setText("U");
		this.jButtonid_empresaFacturasGeneralesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaFacturasGeneralesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFacturasGeneralesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaFacturasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFacturasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFacturasGeneralesUpdate"));



					
		this.jLabelid_sucursalFacturasGenerales = new JLabelMe();
		this.jLabelid_sucursalFacturasGenerales.setText(""+FacturasGeneralesConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalFacturasGenerales.setToolTipText("Sucursal");
		this.jLabelid_sucursalFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalFacturasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalFacturasGenerales.setToolTipText(FacturasGeneralesConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutFacturasGenerales = new GridBagLayout();
		this.jPanelid_sucursalFacturasGenerales.setLayout(this.gridaBagLayoutFacturasGenerales);


		jComboBoxid_sucursalFacturasGenerales= new JComboBoxMe();
		jComboBoxid_sucursalFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalFacturasGenerales.setEnabled(false);

		this.jButtonid_sucursalFacturasGenerales= new JButtonMe();
		this.jButtonid_sucursalFacturasGenerales.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFacturasGenerales.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFacturasGenerales.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFacturasGenerales.setText("Buscar");
		this.jButtonid_sucursalFacturasGenerales.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalFacturasGenerales.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFacturasGenerales,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalFacturasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFacturasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFacturasGenerales"));

		this.jButtonid_sucursalFacturasGeneralesBusqueda= new JButtonMe();
		this.jButtonid_sucursalFacturasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFacturasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFacturasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalFacturasGeneralesBusqueda.setText("U");
		this.jButtonid_sucursalFacturasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalFacturasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFacturasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalFacturasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFacturasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFacturasGeneralesBusqueda"));

		if(this.facturasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalFacturasGeneralesBusqueda.setVisible(false);		}

		this.jButtonid_sucursalFacturasGeneralesUpdate= new JButtonMe();
		this.jButtonid_sucursalFacturasGeneralesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFacturasGeneralesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFacturasGeneralesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalFacturasGeneralesUpdate.setText("U");
		this.jButtonid_sucursalFacturasGeneralesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalFacturasGeneralesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFacturasGeneralesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalFacturasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFacturasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFacturasGeneralesUpdate"));



					
		this.jLabelid_clienteFacturasGenerales = new JLabelMe();
		this.jLabelid_clienteFacturasGenerales.setText(""+FacturasGeneralesConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteFacturasGenerales.setToolTipText("Cliente");
		this.jLabelid_clienteFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteFacturasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteFacturasGenerales.setToolTipText(FacturasGeneralesConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutFacturasGenerales = new GridBagLayout();
		this.jPanelid_clienteFacturasGenerales.setLayout(this.gridaBagLayoutFacturasGenerales);


		jComboBoxid_clienteFacturasGenerales= new JComboBoxMe();
		jComboBoxid_clienteFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteFacturasGenerales= new JButtonMe();
		this.jButtonid_clienteFacturasGenerales.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteFacturasGenerales.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteFacturasGenerales.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteFacturasGenerales.setText("Buscar");
		this.jButtonid_clienteFacturasGenerales.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteFacturasGenerales.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteFacturasGenerales,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteFacturasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteFacturasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteFacturasGenerales"));

		this.jButtonid_clienteFacturasGeneralesBusqueda= new JButtonMe();
		this.jButtonid_clienteFacturasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteFacturasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteFacturasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteFacturasGeneralesBusqueda.setText("U");
		this.jButtonid_clienteFacturasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteFacturasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteFacturasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteFacturasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteFacturasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteFacturasGeneralesBusqueda"));

		if(this.facturasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteFacturasGeneralesBusqueda.setVisible(false);		}

		this.jButtonid_clienteFacturasGeneralesUpdate= new JButtonMe();
		this.jButtonid_clienteFacturasGeneralesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteFacturasGeneralesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteFacturasGeneralesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteFacturasGeneralesUpdate.setText("U");
		this.jButtonid_clienteFacturasGeneralesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteFacturasGeneralesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteFacturasGeneralesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteFacturasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteFacturasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteFacturasGeneralesUpdate"));



					
		this.jLabelid_tipo_facturaFacturasGenerales = new JLabelMe();
		this.jLabelid_tipo_facturaFacturasGenerales.setText(""+FacturasGeneralesConstantesFunciones.LABEL_IDTIPOFACTURA+" : *");
		this.jLabelid_tipo_facturaFacturasGenerales.setToolTipText("Tipo Factura");
		this.jLabelid_tipo_facturaFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_facturaFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_facturaFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_facturaFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_facturaFacturasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_facturaFacturasGenerales.setToolTipText(FacturasGeneralesConstantesFunciones.LABEL_IDTIPOFACTURA);
		this.gridaBagLayoutFacturasGenerales = new GridBagLayout();
		this.jPanelid_tipo_facturaFacturasGenerales.setLayout(this.gridaBagLayoutFacturasGenerales);


		jComboBoxid_tipo_facturaFacturasGenerales= new JComboBoxMe();
		jComboBoxid_tipo_facturaFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_facturaFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_facturaFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_facturaFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_facturaFacturasGenerales= new JButtonMe();
		this.jButtonid_tipo_facturaFacturasGenerales.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_facturaFacturasGenerales.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_facturaFacturasGenerales.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_facturaFacturasGenerales.setText("Buscar");
		this.jButtonid_tipo_facturaFacturasGenerales.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_facturaFacturasGenerales.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_facturaFacturasGenerales,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_facturaFacturasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_facturaFacturasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_facturaFacturasGenerales"));

		this.jButtonid_tipo_facturaFacturasGeneralesBusqueda= new JButtonMe();
		this.jButtonid_tipo_facturaFacturasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_facturaFacturasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_facturaFacturasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_facturaFacturasGeneralesBusqueda.setText("U");
		this.jButtonid_tipo_facturaFacturasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_facturaFacturasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_facturaFacturasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_facturaFacturasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_facturaFacturasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_facturaFacturasGeneralesBusqueda"));

		if(this.facturasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_facturaFacturasGeneralesBusqueda.setVisible(false);		}

		this.jButtonid_tipo_facturaFacturasGeneralesUpdate= new JButtonMe();
		this.jButtonid_tipo_facturaFacturasGeneralesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_facturaFacturasGeneralesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_facturaFacturasGeneralesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_facturaFacturasGeneralesUpdate.setText("U");
		this.jButtonid_tipo_facturaFacturasGeneralesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_facturaFacturasGeneralesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_facturaFacturasGeneralesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_facturaFacturasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_facturaFacturasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_facturaFacturasGeneralesUpdate"));



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
		//this.jInternalFrameDetalleFacturasGenerales = new FacturasGeneralesBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Facturas Generales DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFacturasGenerales= new GridBagLayout();
		

		
		String sToolTipFacturasGenerales="";
		sToolTipFacturasGenerales=FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFacturasGenerales+="(Facturacion.FacturasGenerales)";
		}
		
		if(!this.facturasgeneralesSessionBean.getEsGuardarRelacionado()) {
			sToolTipFacturasGenerales+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoFacturasGenerales = new JButtonMe();
		this.jButtonModificarFacturasGenerales = new JButtonMe();
        this.jButtonActualizarFacturasGenerales = new JButtonMe();
        this.jButtonEliminarFacturasGenerales = new JButtonMe();
        this.jButtonCancelarFacturasGenerales = new JButtonMe();
        this.jButtonGuardarCambiosFacturasGenerales = new JButtonMe();
		this.jButtonGuardarCambiosTablaFacturasGenerales = new JButtonMe();
		this.jButtonCerrarFacturasGenerales = new JButtonMe();
		
		this.jScrollPanelDatosFacturasGenerales = new JScrollPane();   
        this.jScrollPanelDatosEdicionFacturasGenerales = new JScrollPane();
		this.jScrollPanelDatosGeneralFacturasGenerales = new JScrollPane();
				
		
		
		this.jPanelCamposFacturasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosFacturasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesFacturasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioFacturasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Facturas Generales";
		
		if(!this.facturasgeneralesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFacturasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturas Generaleses" + this.sPath));
		} else {
			this.jScrollPanelDatosFacturasGenerales.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionFacturasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralFacturasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposFacturasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposFacturasGenerales.setName("jPanelCamposFacturasGenerales"); 

		this.jPanelCamposOcultosFacturasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosFacturasGenerales.setName("jPanelCamposOcultosFacturasGenerales"); 

        this.jPanelAccionesFacturasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFacturasGenerales.setToolTipText("Acciones");
        this.jPanelAccionesFacturasGenerales.setName("Acciones"); 

		this.jPanelAccionesFormularioFacturasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioFacturasGenerales.setToolTipText("Acciones");
        this.jPanelAccionesFormularioFacturasGenerales.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionFacturasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFacturasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFacturasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposFacturasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosFacturasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioFacturasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoFacturasGenerales.setText("Nuevo");
		this.jButtonModificarFacturasGenerales.setText("Editar");
        this.jButtonActualizarFacturasGenerales.setText("Actualizar");
        this.jButtonEliminarFacturasGenerales.setText("Eliminar");
        this.jButtonCancelarFacturasGenerales.setText("Cancelar");
        this.jButtonGuardarCambiosFacturasGenerales.setText("Guardar");
		this.jButtonGuardarCambiosTablaFacturasGenerales.setText("Guardar");
		this.jButtonCerrarFacturasGenerales.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFacturasGenerales,"nuevo_button","Nuevo",this.facturasgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarFacturasGenerales,"modificar_button","Editar",this.facturasgeneralesSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarFacturasGenerales,"actualizar_button","Actualizar",this.facturasgeneralesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarFacturasGenerales,"eliminar_button","Eliminar",this.facturasgeneralesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarFacturasGenerales,"cancelar_button","Cancelar",this.facturasgeneralesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosFacturasGenerales,"guardarcambios_button","Guardar",this.facturasgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFacturasGenerales,"guardarcambiostabla_button","Guardar",this.facturasgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFacturasGenerales,"cerrar_button","Salir",this.facturasgeneralesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarFacturasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarFacturasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarFacturasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoFacturasGenerales.setToolTipText("Nuevo"+" "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarFacturasGenerales.setToolTipText("Editar"+" "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarFacturasGenerales.setToolTipText("Actualizar"+" "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarFacturasGenerales.setToolTipText("Eliminar)"+" "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarFacturasGenerales.setToolTipText("Cancelar"+" "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosFacturasGenerales.setToolTipText("Guardar"+" "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaFacturasGenerales.setToolTipText("Guardar"+" "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFacturasGenerales.setToolTipText("Salir"+" "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFacturasGenerales";
		inputMap = this.jButtonNuevoFacturasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFacturasGenerales.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFacturasGenerales"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarFacturasGenerales";
		inputMap = this.jButtonActualizarFacturasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarFacturasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarFacturasGenerales"));
		
		//ELIMINAR
		sMapKey = "EliminarFacturasGenerales";
		inputMap = this.jButtonEliminarFacturasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarFacturasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarFacturasGenerales"));
		
		//CANCELAR	
		sMapKey = "CancelarFacturasGenerales";
		inputMap = this.jButtonCancelarFacturasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarFacturasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarFacturasGenerales"));
		
		//CERRAR		
		sMapKey = "CerrarFacturasGenerales";
		inputMap = this.jButtonCerrarFacturasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFacturasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFacturasGenerales"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFacturasGenerales";
		inputMap = this.jButtonGuardarCambiosTablaFacturasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFacturasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFacturasGenerales"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoFacturasGenerales = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoFacturasGenerales.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoFacturasGenerales.setToolTipText("Nuevo FacturasGenerales");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoFacturasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarFacturasGenerales = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarFacturasGenerales.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarFacturasGenerales.setToolTipText("Sin Cerrar Ventana FacturasGenerales");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarFacturasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeFacturasGenerales = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeFacturasGenerales.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeFacturasGenerales.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeFacturasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesFacturasGenerales = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFacturasGenerales.setText("Accion");
		this.jComboBoxTiposAccionesFacturasGenerales.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioFacturasGenerales = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioFacturasGenerales.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioFacturasGenerales.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesFacturasGenerales = new JLabelMe();
		
		this.jLabelAccionesFacturasGenerales.setText("Acciones");		
		this.jLabelAccionesFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposFacturasGenerales();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysFacturasGenerales();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesFacturasGenerales=new JTabbedPane();
		this.jTabbedPaneRelacionesFacturasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesFacturasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesFacturasGenerales.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturasGenerales.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturasGenerales.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioFacturasGenerales.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFacturasGenerales.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFacturasGenerales.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioFacturasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposFacturasGenerales = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosFacturasGenerales = new GridBagLayout();
		
		this.jPanelCamposFacturasGenerales.setLayout(gridaBagLayoutCamposFacturasGenerales);
		this.jPanelCamposOcultosFacturasGenerales.setLayout(gridaBagLayoutCamposOcultosFacturasGenerales);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 0;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidFacturasGenerales.add(jLabelIdFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 1;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidFacturasGenerales.add(jLabelidFacturasGenerales, this.gridBagConstraintsFacturasGenerales);


	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 0;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_zonaFacturasGenerales.add(jLabelid_zonaFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = 0;
		this.gridBagConstraintsFacturasGenerales.gridx = 2;
		this.gridBagConstraintsFacturasGenerales.ipadx = 0;
		this.gridBagConstraintsFacturasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_zonaFacturasGenerales.add(jButtonid_zonaFacturasGeneralesBusqueda, this.gridBagConstraintsFacturasGenerales);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = 0;
		this.gridBagConstraintsFacturasGenerales.gridx = 3;
		this.gridBagConstraintsFacturasGenerales.ipadx = 0;
		this.gridBagConstraintsFacturasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_zonaFacturasGenerales.add(jButtonid_zonaFacturasGeneralesUpdate, this.gridBagConstraintsFacturasGenerales);
	}

	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 1;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_zonaFacturasGenerales.add(jComboBoxid_zonaFacturasGenerales, this.gridBagConstraintsFacturasGenerales);


	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 0;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_clienteFacturasGenerales.add(jLabelid_tipo_clienteFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = 0;
		this.gridBagConstraintsFacturasGenerales.gridx = 2;
		this.gridBagConstraintsFacturasGenerales.ipadx = 0;
		this.gridBagConstraintsFacturasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_clienteFacturasGenerales.add(jButtonid_tipo_clienteFacturasGeneralesBusqueda, this.gridBagConstraintsFacturasGenerales);
	}

	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 1;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_clienteFacturasGenerales.add(jTextFieldid_tipo_clienteFacturasGenerales, this.gridBagConstraintsFacturasGenerales);


	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 0;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaFacturasGenerales.add(jLabelid_empresaFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = 0;
		this.gridBagConstraintsFacturasGenerales.gridx = 2;
		this.gridBagConstraintsFacturasGenerales.ipadx = 0;
		this.gridBagConstraintsFacturasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFacturasGenerales.add(jButtonid_empresaFacturasGeneralesBusqueda, this.gridBagConstraintsFacturasGenerales);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = 0;
		this.gridBagConstraintsFacturasGenerales.gridx = 3;
		this.gridBagConstraintsFacturasGenerales.ipadx = 0;
		this.gridBagConstraintsFacturasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFacturasGenerales.add(jButtonid_empresaFacturasGeneralesUpdate, this.gridBagConstraintsFacturasGenerales);
	}

	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 1;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaFacturasGenerales.add(jComboBoxid_empresaFacturasGenerales, this.gridBagConstraintsFacturasGenerales);


	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 0;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalFacturasGenerales.add(jLabelid_sucursalFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = 0;
		this.gridBagConstraintsFacturasGenerales.gridx = 2;
		this.gridBagConstraintsFacturasGenerales.ipadx = 0;
		this.gridBagConstraintsFacturasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalFacturasGenerales.add(jButtonid_sucursalFacturasGeneralesBusqueda, this.gridBagConstraintsFacturasGenerales);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = 0;
		this.gridBagConstraintsFacturasGenerales.gridx = 3;
		this.gridBagConstraintsFacturasGenerales.ipadx = 0;
		this.gridBagConstraintsFacturasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalFacturasGenerales.add(jButtonid_sucursalFacturasGeneralesUpdate, this.gridBagConstraintsFacturasGenerales);
	}

	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 1;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalFacturasGenerales.add(jComboBoxid_sucursalFacturasGenerales, this.gridBagConstraintsFacturasGenerales);


	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 0;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteFacturasGenerales.add(jLabelid_clienteFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = 0;
		this.gridBagConstraintsFacturasGenerales.gridx = 2;
		this.gridBagConstraintsFacturasGenerales.ipadx = 0;
		this.gridBagConstraintsFacturasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteFacturasGenerales.add(jButtonid_clienteFacturasGeneralesBusqueda, this.gridBagConstraintsFacturasGenerales);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = 0;
		this.gridBagConstraintsFacturasGenerales.gridx = 3;
		this.gridBagConstraintsFacturasGenerales.ipadx = 0;
		this.gridBagConstraintsFacturasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteFacturasGenerales.add(jButtonid_clienteFacturasGeneralesUpdate, this.gridBagConstraintsFacturasGenerales);
	}

	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 1;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteFacturasGenerales.add(jComboBoxid_clienteFacturasGenerales, this.gridBagConstraintsFacturasGenerales);


	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 0;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_facturaFacturasGenerales.add(jLabelid_tipo_facturaFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = 0;
		this.gridBagConstraintsFacturasGenerales.gridx = 2;
		this.gridBagConstraintsFacturasGenerales.ipadx = 0;
		this.gridBagConstraintsFacturasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_facturaFacturasGenerales.add(jButtonid_tipo_facturaFacturasGeneralesBusqueda, this.gridBagConstraintsFacturasGenerales);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = 0;
		this.gridBagConstraintsFacturasGenerales.gridx = 3;
		this.gridBagConstraintsFacturasGenerales.ipadx = 0;
		this.gridBagConstraintsFacturasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_facturaFacturasGenerales.add(jButtonid_tipo_facturaFacturasGeneralesUpdate, this.gridBagConstraintsFacturasGenerales);
	}

	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 1;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_facturaFacturasGenerales.add(jComboBoxid_tipo_facturaFacturasGenerales, this.gridBagConstraintsFacturasGenerales);


	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 0;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_desdeFacturasGenerales.add(jLabelfecha_emision_desdeFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = 0;
		this.gridBagConstraintsFacturasGenerales.gridx = 2;
		this.gridBagConstraintsFacturasGenerales.ipadx = 0;
		this.gridBagConstraintsFacturasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_desdeFacturasGenerales.add(jButtonfecha_emision_desdeFacturasGeneralesBusqueda, this.gridBagConstraintsFacturasGenerales);
	}

	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 1;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_desdeFacturasGenerales.add(jDateChooserfecha_emision_desdeFacturasGenerales, this.gridBagConstraintsFacturasGenerales);


	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 0;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaFacturasGenerales.add(jLabelfecha_emision_hastaFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = 0;
		this.gridBagConstraintsFacturasGenerales.gridx = 2;
		this.gridBagConstraintsFacturasGenerales.ipadx = 0;
		this.gridBagConstraintsFacturasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaFacturasGenerales.add(jButtonfecha_emision_hastaFacturasGeneralesBusqueda, this.gridBagConstraintsFacturasGenerales);
	}

	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 1;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaFacturasGenerales.add(jDateChooserfecha_emision_hastaFacturasGenerales, this.gridBagConstraintsFacturasGenerales);


	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 0;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_zonaFacturasGenerales.add(jLabelnombre_zonaFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = 0;
		this.gridBagConstraintsFacturasGenerales.gridx = 2;
		this.gridBagConstraintsFacturasGenerales.ipadx = 0;
		this.gridBagConstraintsFacturasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_zonaFacturasGenerales.add(jButtonnombre_zonaFacturasGeneralesBusqueda, this.gridBagConstraintsFacturasGenerales);
	}

	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 1;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_zonaFacturasGenerales.add(jTextFieldnombre_zonaFacturasGenerales, this.gridBagConstraintsFacturasGenerales);


	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 0;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completo_clienteFacturasGenerales.add(jLabelnombre_completo_clienteFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = 0;
		this.gridBagConstraintsFacturasGenerales.gridx = 2;
		this.gridBagConstraintsFacturasGenerales.ipadx = 0;
		this.gridBagConstraintsFacturasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completo_clienteFacturasGenerales.add(jButtonnombre_completo_clienteFacturasGeneralesBusqueda, this.gridBagConstraintsFacturasGenerales);
	}

	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 1;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completo_clienteFacturasGenerales.add(jscrollPanenombre_completo_clienteFacturasGenerales, this.gridBagConstraintsFacturasGenerales);


	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 0;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_tipo_facturaFacturasGenerales.add(jLabelnombre_tipo_facturaFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = 0;
		this.gridBagConstraintsFacturasGenerales.gridx = 2;
		this.gridBagConstraintsFacturasGenerales.ipadx = 0;
		this.gridBagConstraintsFacturasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_tipo_facturaFacturasGenerales.add(jButtonnombre_tipo_facturaFacturasGeneralesBusqueda, this.gridBagConstraintsFacturasGenerales);
	}

	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 1;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_tipo_facturaFacturasGenerales.add(jscrollPanenombre_tipo_facturaFacturasGenerales, this.gridBagConstraintsFacturasGenerales);


	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 0;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionFacturasGenerales.add(jLabelfecha_emisionFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = 0;
		this.gridBagConstraintsFacturasGenerales.gridx = 2;
		this.gridBagConstraintsFacturasGenerales.ipadx = 0;
		this.gridBagConstraintsFacturasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionFacturasGenerales.add(jButtonfecha_emisionFacturasGeneralesBusqueda, this.gridBagConstraintsFacturasGenerales);
	}

	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 1;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionFacturasGenerales.add(jDateChooserfecha_emisionFacturasGenerales, this.gridBagConstraintsFacturasGenerales);


	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 0;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_vencimientoFacturasGenerales.add(jLabelfecha_vencimientoFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = 0;
		this.gridBagConstraintsFacturasGenerales.gridx = 2;
		this.gridBagConstraintsFacturasGenerales.ipadx = 0;
		this.gridBagConstraintsFacturasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vencimientoFacturasGenerales.add(jButtonfecha_vencimientoFacturasGeneralesBusqueda, this.gridBagConstraintsFacturasGenerales);
	}

	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 1;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_vencimientoFacturasGenerales.add(jDateChooserfecha_vencimientoFacturasGenerales, this.gridBagConstraintsFacturasGenerales);


	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 0;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_pre_impresoFacturasGenerales.add(jLabelnumero_pre_impresoFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = 0;
		this.gridBagConstraintsFacturasGenerales.gridx = 2;
		this.gridBagConstraintsFacturasGenerales.ipadx = 0;
		this.gridBagConstraintsFacturasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_pre_impresoFacturasGenerales.add(jButtonnumero_pre_impresoFacturasGeneralesBusqueda, this.gridBagConstraintsFacturasGenerales);
	}

	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 1;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_pre_impresoFacturasGenerales.add(jTextFieldnumero_pre_impresoFacturasGenerales, this.gridBagConstraintsFacturasGenerales);


	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 0;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_descuentoFacturasGenerales.add(jLabeltotal_descuentoFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = 0;
		this.gridBagConstraintsFacturasGenerales.gridx = 2;
		this.gridBagConstraintsFacturasGenerales.ipadx = 0;
		this.gridBagConstraintsFacturasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_descuentoFacturasGenerales.add(jButtontotal_descuentoFacturasGeneralesBusqueda, this.gridBagConstraintsFacturasGenerales);
	}

	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 1;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_descuentoFacturasGenerales.add(jTextFieldtotal_descuentoFacturasGenerales, this.gridBagConstraintsFacturasGenerales);


	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 0;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_otroFacturasGenerales.add(jLabeltotal_otroFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = 0;
		this.gridBagConstraintsFacturasGenerales.gridx = 2;
		this.gridBagConstraintsFacturasGenerales.ipadx = 0;
		this.gridBagConstraintsFacturasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_otroFacturasGenerales.add(jButtontotal_otroFacturasGeneralesBusqueda, this.gridBagConstraintsFacturasGenerales);
	}

	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 1;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_otroFacturasGenerales.add(jTextFieldtotal_otroFacturasGenerales, this.gridBagConstraintsFacturasGenerales);


	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 0;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsub_totalFacturasGenerales.add(jLabelsub_totalFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = 0;
		this.gridBagConstraintsFacturasGenerales.gridx = 2;
		this.gridBagConstraintsFacturasGenerales.ipadx = 0;
		this.gridBagConstraintsFacturasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelsub_totalFacturasGenerales.add(jButtonsub_totalFacturasGeneralesBusqueda, this.gridBagConstraintsFacturasGenerales);
	}

	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 1;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsub_totalFacturasGenerales.add(jTextFieldsub_totalFacturasGenerales, this.gridBagConstraintsFacturasGenerales);


	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 0;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalFacturasGenerales.add(jLabeltotalFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = 0;
		this.gridBagConstraintsFacturasGenerales.gridx = 2;
		this.gridBagConstraintsFacturasGenerales.ipadx = 0;
		this.gridBagConstraintsFacturasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalFacturasGenerales.add(jButtontotalFacturasGeneralesBusqueda, this.gridBagConstraintsFacturasGenerales);
	}

	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 1;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalFacturasGenerales.add(jTextFieldtotalFacturasGenerales, this.gridBagConstraintsFacturasGenerales);


	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 0;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaFacturasGenerales.add(jLabelivaFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = 0;
		this.gridBagConstraintsFacturasGenerales.gridx = 2;
		this.gridBagConstraintsFacturasGenerales.ipadx = 0;
		this.gridBagConstraintsFacturasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaFacturasGenerales.add(jButtonivaFacturasGeneralesBusqueda, this.gridBagConstraintsFacturasGenerales);
	}

	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasGenerales.gridy = 0;
	this.gridBagConstraintsFacturasGenerales.gridx = 1;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaFacturasGenerales.add(jTextFieldivaFacturasGenerales, this.gridBagConstraintsFacturasGenerales);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasGenerales.gridy = iYPanelCamposFacturasGenerales;
	this.gridBagConstraintsFacturasGenerales.gridx = iXPanelCamposFacturasGenerales++;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasGenerales.add(this.jPanelidFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(iXPanelCamposFacturasGenerales % 2==0) {
		iXPanelCamposFacturasGenerales=0;
		iYPanelCamposFacturasGenerales++;
	}
	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasGenerales.gridy = iYPanelCamposFacturasGenerales;
	this.gridBagConstraintsFacturasGenerales.gridx = iXPanelCamposFacturasGenerales++;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasGenerales.add(this.jPanelid_zonaFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(iXPanelCamposFacturasGenerales % 2==0) {
		iXPanelCamposFacturasGenerales=0;
		iYPanelCamposFacturasGenerales++;
	}
	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasGenerales.gridy = iYPanelCamposFacturasGenerales;
	this.gridBagConstraintsFacturasGenerales.gridx = iXPanelCamposFacturasGenerales++;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasGenerales.add(this.jPanelid_tipo_clienteFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(iXPanelCamposFacturasGenerales % 2==0) {
		iXPanelCamposFacturasGenerales=0;
		iYPanelCamposFacturasGenerales++;
	}
	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasGenerales.gridy = iYPanelCamposFacturasGenerales;
	this.gridBagConstraintsFacturasGenerales.gridx = iXPanelCamposFacturasGenerales++;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasGenerales.add(this.jPanelid_clienteFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(iXPanelCamposFacturasGenerales % 2==0) {
		iXPanelCamposFacturasGenerales=0;
		iYPanelCamposFacturasGenerales++;
	}
	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasGenerales.gridy = iYPanelCamposFacturasGenerales;
	this.gridBagConstraintsFacturasGenerales.gridx = iXPanelCamposFacturasGenerales++;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasGenerales.add(this.jPanelid_tipo_facturaFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(iXPanelCamposFacturasGenerales % 2==0) {
		iXPanelCamposFacturasGenerales=0;
		iYPanelCamposFacturasGenerales++;
	}
	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasGenerales.gridy = iYPanelCamposFacturasGenerales;
	this.gridBagConstraintsFacturasGenerales.gridx = iXPanelCamposFacturasGenerales++;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasGenerales.add(this.jPanelfecha_emision_desdeFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(iXPanelCamposFacturasGenerales % 2==0) {
		iXPanelCamposFacturasGenerales=0;
		iYPanelCamposFacturasGenerales++;
	}
	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasGenerales.gridy = iYPanelCamposFacturasGenerales;
	this.gridBagConstraintsFacturasGenerales.gridx = iXPanelCamposFacturasGenerales++;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasGenerales.add(this.jPanelfecha_emision_hastaFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(iXPanelCamposFacturasGenerales % 2==0) {
		iXPanelCamposFacturasGenerales=0;
		iYPanelCamposFacturasGenerales++;
	}
	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasGenerales.gridy = iYPanelCamposFacturasGenerales;
	this.gridBagConstraintsFacturasGenerales.gridx = iXPanelCamposFacturasGenerales++;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasGenerales.add(this.jPanelnombre_zonaFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(iXPanelCamposFacturasGenerales % 2==0) {
		iXPanelCamposFacturasGenerales=0;
		iYPanelCamposFacturasGenerales++;
	}
	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasGenerales.gridy = iYPanelCamposFacturasGenerales;
	this.gridBagConstraintsFacturasGenerales.gridx = iXPanelCamposFacturasGenerales++;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasGenerales.add(this.jPanelnombre_completo_clienteFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(iXPanelCamposFacturasGenerales % 2==0) {
		iXPanelCamposFacturasGenerales=0;
		iYPanelCamposFacturasGenerales++;
	}
	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasGenerales.gridy = iYPanelCamposFacturasGenerales;
	this.gridBagConstraintsFacturasGenerales.gridx = iXPanelCamposFacturasGenerales++;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasGenerales.add(this.jPanelnombre_tipo_facturaFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(iXPanelCamposFacturasGenerales % 2==0) {
		iXPanelCamposFacturasGenerales=0;
		iYPanelCamposFacturasGenerales++;
	}
	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasGenerales.gridy = iYPanelCamposFacturasGenerales;
	this.gridBagConstraintsFacturasGenerales.gridx = iXPanelCamposFacturasGenerales++;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasGenerales.add(this.jPanelfecha_emisionFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(iXPanelCamposFacturasGenerales % 2==0) {
		iXPanelCamposFacturasGenerales=0;
		iYPanelCamposFacturasGenerales++;
	}
	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasGenerales.gridy = iYPanelCamposFacturasGenerales;
	this.gridBagConstraintsFacturasGenerales.gridx = iXPanelCamposFacturasGenerales++;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasGenerales.add(this.jPanelfecha_vencimientoFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(iXPanelCamposFacturasGenerales % 2==0) {
		iXPanelCamposFacturasGenerales=0;
		iYPanelCamposFacturasGenerales++;
	}
	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasGenerales.gridy = iYPanelCamposFacturasGenerales;
	this.gridBagConstraintsFacturasGenerales.gridx = iXPanelCamposFacturasGenerales++;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasGenerales.add(this.jPanelnumero_pre_impresoFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(iXPanelCamposFacturasGenerales % 2==0) {
		iXPanelCamposFacturasGenerales=0;
		iYPanelCamposFacturasGenerales++;
	}
	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasGenerales.gridy = iYPanelCamposFacturasGenerales;
	this.gridBagConstraintsFacturasGenerales.gridx = iXPanelCamposFacturasGenerales++;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasGenerales.add(this.jPaneltotal_descuentoFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(iXPanelCamposFacturasGenerales % 2==0) {
		iXPanelCamposFacturasGenerales=0;
		iYPanelCamposFacturasGenerales++;
	}
	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasGenerales.gridy = iYPanelCamposFacturasGenerales;
	this.gridBagConstraintsFacturasGenerales.gridx = iXPanelCamposFacturasGenerales++;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasGenerales.add(this.jPaneltotal_otroFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(iXPanelCamposFacturasGenerales % 2==0) {
		iXPanelCamposFacturasGenerales=0;
		iYPanelCamposFacturasGenerales++;
	}
	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasGenerales.gridy = iYPanelCamposFacturasGenerales;
	this.gridBagConstraintsFacturasGenerales.gridx = iXPanelCamposFacturasGenerales++;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasGenerales.add(this.jPanelsub_totalFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(iXPanelCamposFacturasGenerales % 2==0) {
		iXPanelCamposFacturasGenerales=0;
		iYPanelCamposFacturasGenerales++;
	}
	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasGenerales.gridy = iYPanelCamposFacturasGenerales;
	this.gridBagConstraintsFacturasGenerales.gridx = iXPanelCamposFacturasGenerales++;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasGenerales.add(this.jPaneltotalFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(iXPanelCamposFacturasGenerales % 2==0) {
		iXPanelCamposFacturasGenerales=0;
		iYPanelCamposFacturasGenerales++;
	}
	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasGenerales.gridy = iYPanelCamposFacturasGenerales;
	this.gridBagConstraintsFacturasGenerales.gridx = iXPanelCamposFacturasGenerales++;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasGenerales.add(this.jPanelivaFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(iXPanelCamposFacturasGenerales % 2==0) {
		iXPanelCamposFacturasGenerales=0;
		iYPanelCamposFacturasGenerales++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasGenerales.gridy = iYPanelCamposOcultosFacturasGenerales;
	this.gridBagConstraintsFacturasGenerales.gridx = iXPanelCamposOcultosFacturasGenerales++;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFacturasGenerales.add(this.jPanelid_empresaFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(iXPanelCamposOcultosFacturasGenerales % 2==0) {
		iXPanelCamposOcultosFacturasGenerales=0;
		iYPanelCamposOcultosFacturasGenerales++;
	}
	this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasGenerales.gridy = iYPanelCamposOcultosFacturasGenerales;
	this.gridBagConstraintsFacturasGenerales.gridx = iXPanelCamposOcultosFacturasGenerales++;
	this.gridBagConstraintsFacturasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFacturasGenerales.add(this.jPanelid_sucursalFacturasGenerales, this.gridBagConstraintsFacturasGenerales);



	if(iXPanelCamposOcultosFacturasGenerales % 2==0) {
		iXPanelCamposOcultosFacturasGenerales=0;
		iYPanelCamposOcultosFacturasGenerales++;
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
			
		GridBagLayout gridaBagLayoutAccionesFacturasGenerales= new GridBagLayout();
		this.jPanelAccionesFacturasGenerales.setLayout(gridaBagLayoutAccionesFacturasGenerales);
		
		GridBagLayout gridaBagLayoutAccionesFormularioFacturasGenerales= new GridBagLayout();
		this.jPanelAccionesFormularioFacturasGenerales.setLayout(gridaBagLayoutAccionesFormularioFacturasGenerales);
		
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFacturasGenerales.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFacturasGenerales.add(this.jComboBoxTiposAccionesFormularioFacturasGenerales, this.gridBagConstraintsFacturasGenerales);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasGenerales.gridy = 0;
		this.gridBagConstraintsFacturasGenerales.gridx = iPosXAccion++;
			
		this.jPanelAccionesFacturasGenerales.add(this.jButtonModificarFacturasGenerales, this.gridBagConstraintsFacturasGenerales);							

		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasGenerales.gridy = 0;
		this.gridBagConstraintsFacturasGenerales.gridx =iPosXAccion++;
			
		this.jPanelAccionesFacturasGenerales.add(this.jButtonEliminarFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
		
			
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.gridy = 0;		
		this.gridBagConstraintsFacturasGenerales.gridx = iPosXAccion++;
		
		this.jPanelAccionesFacturasGenerales.add(this.jButtonActualizarFacturasGenerales, this.gridBagConstraintsFacturasGenerales);


		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.gridy = 0;		
		this.gridBagConstraintsFacturasGenerales.gridx = iPosXAccion++;
		
		this.jPanelAccionesFacturasGenerales.add(this.jButtonGuardarCambiosFacturasGenerales, this.gridBagConstraintsFacturasGenerales);	
		
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.gridy = 0;		
		this.gridBagConstraintsFacturasGenerales.gridx =iPosXAccion++;
		
		this.jPanelAccionesFacturasGenerales.add(this.jButtonCancelarFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFacturasGenerales = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFacturasGenerales);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.facturasgeneralesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();						
			this.gridBagConstraintsFacturasGenerales.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFacturasGenerales.gridx = 0;		
			//this.gridBagConstraintsFacturasGenerales.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFacturasGenerales.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFacturasGenerales.gridx =0;
		this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFacturasGenerales.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(FacturasGeneralesJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleFacturasGenerales = new FacturasGeneralesBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Facturas Generales DATOS");
			
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
			
	        //this.setTitle("[FOR] - Facturas Generales DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Facturas Generales Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			FacturasGeneralesModel facturasgeneralesModel=new FacturasGeneralesModel(this);
			
			//SI USARA CLASE INTERNA
			//FacturasGeneralesModel.FacturasGeneralesFocusTraversalPolicy facturasgeneralesFocusTraversalPolicy = facturasgeneralesModel.new FacturasGeneralesFocusTraversalPolicy(this);
			
			//facturasgeneralesFocusTraversalPolicy.setfacturasgeneralesJInternalFrame(this);
			
			this.setFocusTraversalPolicy(facturasgeneralesModel);
			
			
			this.jContentPaneDetalleFacturasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleFacturasGenerales = new GridBagLayout();	
			this.jContentPaneDetalleFacturasGenerales.setLayout(gridaBagLayoutDetalleFacturasGenerales);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFacturasGenerales = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
				this.gridBagConstraintsFacturasGenerales.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsFacturasGenerales.gridx = 0;
					
				
				this.jContentPaneDetalleFacturasGenerales.add(jTtoolBarDetalleFacturasGenerales, gridBagConstraintsFacturasGenerales);								
				
}
			
			this.jScrollPanelDatosEdicionFacturasGenerales=   new JScrollPane(jContentPaneDetalleFacturasGenerales,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFacturasGenerales.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturasGenerales.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturasGenerales.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralFacturasGenerales=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFacturasGenerales.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturasGenerales.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturasGenerales.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
			
			
	        this.gridBagConstraintsFacturasGenerales.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsFacturasGenerales.gridx = 0;
	        
			this.jContentPaneDetalleFacturasGenerales.add(jPanelCamposFacturasGenerales, gridBagConstraintsFacturasGenerales);
			
			
			
			
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
						//&& facturasgeneralesSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.facturasgeneralesSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsFacturasGenerales= new GridBagConstraints();
						this.gridBagConstraintsFacturasGenerales.gridy = iGridyRelaciones++;
						this.gridBagConstraintsFacturasGenerales.gridx = 0;
						this.jContentPaneDetalleFacturasGenerales.add(this.jTabbedPaneRelacionesFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesFacturasGenerales.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosFacturasGenerales.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
					this.gridBagConstraintsFacturasGenerales.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsFacturasGenerales.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsFacturasGenerales.gridx = 0;
					
				
					this.jContentPaneDetalleFacturasGenerales.add(jPanelCamposOcultosFacturasGenerales, gridBagConstraintsFacturasGenerales);
				
					this.jPanelCamposOcultosFacturasGenerales.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
			this.gridBagConstraintsFacturasGenerales.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsFacturasGenerales.gridx = 0;
	        this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleFacturasGenerales.add(this.jPanelAccionesFormularioFacturasGenerales, this.gridBagConstraintsFacturasGenerales);							
			
			
			
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
	        this.gridBagConstraintsFacturasGenerales.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsFacturasGenerales.gridx = 0;
	        
			
			this.jContentPaneDetalleFacturasGenerales.add(this.jPanelAccionesFacturasGenerales, this.gridBagConstraintsFacturasGenerales);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionFacturasGenerales);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionFacturasGenerales=   new JScrollPane(this.jPanelCamposFacturasGenerales,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFacturasGenerales.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturasGenerales.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturasGenerales.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
			this.gridBagConstraintsFacturasGenerales.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsFacturasGenerales.gridx = 0;
			this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsFacturasGenerales.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
			this.gridBagConstraintsFacturasGenerales.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFacturasGenerales.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioFacturasGenerales, this.gridBagConstraintsFacturasGenerales);			
			
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
			this.gridBagConstraintsFacturasGenerales.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFacturasGenerales.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFacturasGenerales, this.gridBagConstraintsFacturasGenerales);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturasGenerales.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
			
			
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturasGenerales.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
		
			
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFacturasGenerales.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralFacturasGenerales;//jContentPane;
		
		return jScrollPanelDatosEdicionFacturasGenerales;
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
