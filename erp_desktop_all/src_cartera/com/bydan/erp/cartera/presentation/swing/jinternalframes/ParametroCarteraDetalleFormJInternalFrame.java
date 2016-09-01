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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.ParametroCarteraConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class ParametroCarteraDetalleFormJInternalFrame extends ParametroCarteraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleParametroCartera;
	
	protected JMenuBar jmenuBarDetalleParametroCartera;
	
	protected JMenu jmenuDetalleParametroCartera;
	protected JMenu jmenuDetalleArchivoParametroCartera;
	protected JMenu jmenuDetalleAccionesParametroCartera;
	protected JMenu jmenuDetalleDatosParametroCartera;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleParametroCartera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroCartera;	
	protected GridBagConstraints gridBagConstraintsParametroCartera;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ParametroCarteraBeanSwingJInternalFrameAdditional jInternalFrameDetalleParametroCartera;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TransaccionBeanSwingJInternalFrame transaccionfacturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccionfactura="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected TransaccionBeanSwingJInternalFrame transacciondeshabilitaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transacciondeshabilita="";

	protected TransaccionBeanSwingJInternalFrame transaccionhabilitaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccionhabilita="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected TipoFacturaBeanSwingJInternalFrame tipofacturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipofactura="";

	protected TipoAutoPagoBeanSwingJInternalFrame tipoautopagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoautopago="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditofiscalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecreditofiscal="";
	
	public ParametroCarteraSessionBean parametrocarteraSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TransaccionSessionBean transaccionfacturaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public TransaccionSessionBean transacciondeshabilitaSessionBean;
	public TransaccionSessionBean transaccionhabilitaSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public TipoFacturaSessionBean tipofacturaSessionBean;
	public TipoAutoPagoSessionBean tipoautopagoSessionBean;
	public CuentaContableSessionBean cuentacontablecreditofiscalSessionBean;	
	
	public ParametroCarteraLogic parametrocarteraLogic;
	
	public JScrollPane jScrollPanelDatosParametroCartera;
	public JScrollPane jScrollPanelDatosEdicionParametroCartera;
	public JScrollPane jScrollPanelDatosGeneralParametroCartera;
	
	protected JPanel jPanelCamposParametroCartera;    
	protected JPanel jPanelCamposOcultosParametroCartera;    	
	protected JPanel jPanelAccionesParametroCartera;
	protected JPanel jPanelAccionesFormularioParametroCartera;
    
	
	
	protected Integer iXPanelCamposParametroCartera=0;
	protected Integer iYPanelCamposParametroCartera=0;
	
	protected Integer iXPanelCamposOcultosParametroCartera=0;
	protected Integer iYPanelCamposOcultosParametroCartera=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoParametroCartera;
	public JButton jButtonModificarParametroCartera;
	public JButton jButtonActualizarParametroCartera;
    public JButton jButtonEliminarParametroCartera;
	public JButton jButtonCancelarParametroCartera;
    public JButton jButtonGuardarCambiosParametroCartera;
	public JButton jButtonGuardarCambiosTablaParametroCartera;
	protected JButton jButtonCerrarParametroCartera;
	
	
	protected JButton jButtonProcesarInformacionParametroCartera;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoParametroCartera;
	protected JCheckBox jCheckBoxPostAccionSinCerrarParametroCartera;
	protected JCheckBox jCheckBoxPostAccionSinMensajeParametroCartera;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroCartera;
	protected JButton jButtonModificarToolBarParametroCartera;
	protected JButton jButtonActualizarToolBarParametroCartera;
    protected JButton jButtonEliminarToolBarParametroCartera;
	protected JButton jButtonCancelarToolBarParametroCartera;
    protected JButton jButtonGuardarCambiosToolBarParametroCartera;
	protected JButton jButtonGuardarCambiosTablaToolBarParametroCartera;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroCartera;
	protected JButton jButtonCerrarToolBarParametroCartera;
	
	protected JButton jButtonProcesarInformacionToolBarParametroCartera;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroCartera;
	protected JMenuItem jMenuItemModificarParametroCartera;
	protected JMenuItem jMenuItemActualizarParametroCartera;
    protected JMenuItem jMenuItemEliminarParametroCartera;
	protected JMenuItem jMenuItemCancelarParametroCartera;
    protected JMenuItem jMenuItemGuardarCambiosParametroCartera;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroCartera;
	protected JMenuItem jMenuItemCerrarParametroCartera;
	protected JMenuItem jMenuItemDetalleCerrarParametroCartera;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroCartera;
	
	protected JMenuItem jMenuItemProcesarInformacionParametroCartera;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroCartera;
	protected JMenuItem jMenuItemMostrarOcultarParametroCartera;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroCartera;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroCartera;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroCartera;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioParametroCartera;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidParametroCartera;
	public JLabel jLabelIdParametroCartera;
	public JLabel jLabelidParametroCartera;
	public JButton jButtonidParametroCarteraBusqueda= new JButtonMe();

	public JPanel jPanelnumero_digitos_facturaParametroCartera;
	public JLabel jLabelnumero_digitos_facturaParametroCartera;
	public JTextField jTextFieldnumero_digitos_facturaParametroCartera;
	public JButton jButtonnumero_digitos_facturaParametroCarteraBusqueda= new JButtonMe();

	public JPanel jPanelpor_lotesParametroCartera;
	public JLabel jLabelpor_lotesParametroCartera;
	public JCheckBox jCheckBoxpor_lotesParametroCartera;
	public JButton jButtonpor_lotesParametroCarteraBusqueda= new JButtonMe();

	public JPanel jPanelnumero_orden_pagoParametroCartera;
	public JLabel jLabelnumero_orden_pagoParametroCartera;
	public JTextField jTextFieldnumero_orden_pagoParametroCartera;
	public JButton jButtonnumero_orden_pagoParametroCarteraBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionParametroCartera;
	public JLabel jLabeldescripcionParametroCartera;
	public JTextArea jTextAreadescripcionParametroCartera;
	public JScrollPane jscrollPanedescripcionParametroCartera;
	public JButton jButtondescripcionParametroCarteraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaParametroCartera;
	public JLabel jLabelid_empresaParametroCartera;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaParametroCartera;
	public JButton jButtonid_empresaParametroCartera= new JButtonMe();
	public JButton jButtonid_empresaParametroCarteraUpdate= new JButtonMe();
	public JButton jButtonid_empresaParametroCarteraBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion_facturaParametroCartera;
	public JLabel jLabelid_transaccion_facturaParametroCartera;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_facturaParametroCartera;
	public JButton jButtonid_transaccion_facturaParametroCartera= new JButtonMe();
	public JButton jButtonid_transaccion_facturaParametroCarteraUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_facturaParametroCarteraBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoParametroCartera;
	public JLabel jLabelid_empleadoParametroCartera;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoParametroCartera;
	public JButton jButtonid_empleadoParametroCartera= new JButtonMe();
	public JButton jButtonid_empleadoParametroCarteraUpdate= new JButtonMe();
	public JButton jButtonid_empleadoParametroCarteraBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion_deshabilitaParametroCartera;
	public JLabel jLabelid_transaccion_deshabilitaParametroCartera;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_deshabilitaParametroCartera;
	public JButton jButtonid_transaccion_deshabilitaParametroCartera= new JButtonMe();
	public JButton jButtonid_transaccion_deshabilitaParametroCarteraUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_deshabilitaParametroCarteraBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion_habilitaParametroCartera;
	public JLabel jLabelid_transaccion_habilitaParametroCartera;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_habilitaParametroCartera;
	public JButton jButtonid_transaccion_habilitaParametroCartera= new JButtonMe();
	public JButton jButtonid_transaccion_habilitaParametroCarteraUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_habilitaParametroCarteraBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaParametroCartera;
	public JLabel jLabelid_bodegaParametroCartera;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaParametroCartera;
	public JButton jButtonid_bodegaParametroCartera= new JButtonMe();
	public JButton jButtonid_bodegaParametroCarteraUpdate= new JButtonMe();
	public JButton jButtonid_bodegaParametroCarteraBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_facturaParametroCartera;
	public JLabel jLabelid_tipo_facturaParametroCartera;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_facturaParametroCartera;
	public JButton jButtonid_tipo_facturaParametroCartera= new JButtonMe();
	public JButton jButtonid_tipo_facturaParametroCarteraUpdate= new JButtonMe();
	public JButton jButtonid_tipo_facturaParametroCarteraBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_auto_pagoParametroCartera;
	public JLabel jLabelid_tipo_auto_pagoParametroCartera;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_auto_pagoParametroCartera;
	public JButton jButtonid_tipo_auto_pagoParametroCartera= new JButtonMe();
	public JButton jButtonid_tipo_auto_pagoParametroCarteraUpdate= new JButtonMe();
	public JButton jButtonid_tipo_auto_pagoParametroCarteraBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_credito_fiscalParametroCartera;
	public JLabel jLabelid_cuenta_contable_credito_fiscalParametroCartera;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_credito_fiscalParametroCartera;
	public JButton jButtonid_cuenta_contable_credito_fiscalParametroCartera= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_fiscalParametroCarteraUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_fiscalParametroCarteraBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_fiscalParametroCarteraArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesParametroCartera;
	
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
		
	public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=858;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ParametroCarteraDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposParametroCartera=new JPanel();
				this.jPanelAccionesFormularioParametroCartera=new JPanel();
				this.jmenuBarDetalleParametroCartera=new JMenuBar();
				this.jTtoolBarDetalleParametroCartera=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroCarteraDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ParametroCartera No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ParametroCarteraDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ParametroCartera No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroCarteraDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroCartera No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroCarteraDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroCartera No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroCarteraDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroCartera No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarParametroCartera() {
		return this.jButtonActualizarToolBarParametroCartera;
	}
	
	public JButton getjButtonEliminarToolBarParametroCartera() {
		return this.jButtonEliminarToolBarParametroCartera;
	}
	
	public JButton getjButtonCancelarToolBarParametroCartera() {
		return this.jButtonCancelarToolBarParametroCartera;
	}		
	
	public JButton getjButtonProcesarInformacionParametroCartera() {
		return this.jButtonProcesarInformacionParametroCartera;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroCartera)	{
		this.jButtonProcesarInformacionParametroCartera = jButtonProcesarInformacionParametroCartera;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroCartera() {
		return this.jComboBoxTiposAccionesParametroCartera;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroCartera(
			JComboBox jComboBoxTiposRelacionesParametroCartera) {
		this.jComboBoxTiposRelacionesParametroCartera = jComboBoxTiposRelacionesParametroCartera;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroCartera(
			JComboBox jComboBoxTiposAccionesParametroCartera) {
		this.jComboBoxTiposAccionesParametroCartera = jComboBoxTiposAccionesParametroCartera;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioParametroCartera() {
		return this.jComboBoxTiposAccionesFormularioParametroCartera;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioParametroCartera(
			JComboBox jComboBoxTiposAccionesFormularioParametroCartera) {
		this.jComboBoxTiposAccionesFormularioParametroCartera = jComboBoxTiposAccionesFormularioParametroCartera;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.parametrocarteraSessionBean=new ParametroCarteraSessionBean();
		
		this.parametrocarteraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrocarteraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrocarteraSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroCarteraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroCarteraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroCarteraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Cartera MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {
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
	
		ParametroCarteraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleParametroCartera= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarParametroCartera=new JButtonMe();
				this.jButtonModificarToolBarParametroCartera=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarParametroCartera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarParametroCartera,this.jTtoolBarDetalleParametroCartera,
							"actualizar","actualizar","Actualizar"+" "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarParametroCartera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarParametroCartera,this.jTtoolBarDetalleParametroCartera,
							"eliminar","eliminar","Eliminar"+" "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarParametroCartera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarParametroCartera,this.jTtoolBarDetalleParametroCartera,
							"cancelar","cancelar","Cancelar"+" "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarParametroCartera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarParametroCartera,this.jTtoolBarDetalleParametroCartera,
							"guardarcambios","guardarcambios","Guardar"+" "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarParametroCartera,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarParametroCartera,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarParametroCartera,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleParametroCartera=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleParametroCartera=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoParametroCartera=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesParametroCartera=new JMenuMe("Acciones");
		this.jmenuDetalleDatosParametroCartera=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroCartera= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroCartera.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroCartera,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarParametroCartera= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarParametroCartera.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarParametroCartera,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarParametroCartera= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarParametroCartera.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarParametroCartera,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarParametroCartera= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarParametroCartera.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarParametroCartera,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarParametroCartera= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarParametroCartera.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarParametroCartera,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosParametroCartera= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroCartera.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroCartera,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroCartera= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroCartera.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroCartera,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarParametroCartera= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarParametroCartera.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarParametroCartera,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroCartera= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroCartera.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroCartera,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroCartera= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroCartera.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroCartera,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoParametroCartera.add(this.jMenuItemDetalleCerrarParametroCartera);
		
		this.jmenuDetalleAccionesParametroCartera.add(this.jMenuItemActualizarParametroCartera);
		this.jmenuDetalleAccionesParametroCartera.add(this.jMenuItemEliminarParametroCartera);
		this.jmenuDetalleAccionesParametroCartera.add(this.jMenuItemCancelarParametroCartera);		
		
		//this.jmenuDetalleDatosParametroCartera.add(this.jMenuItemDetalleAbrirOrderByParametroCartera);				
		this.jmenuDetalleDatosParametroCartera.add(this.jMenuItemDetalleMostarOcultarParametroCartera);				
				
		//this.jmenuDetalleAccionesParametroCartera.add(this.jMenuItemGuardarCambiosParametroCartera);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleParametroCartera.add(this.jmenuDetalleArchivoParametroCartera);		
		this.jmenuBarDetalleParametroCartera.add(this.jmenuDetalleAccionesParametroCartera);		
		this.jmenuBarDetalleParametroCartera.add(this.jmenuDetalleDatosParametroCartera);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleParametroCartera);				
	}
	
	
	public void inicializarElementosCamposParametroCartera() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdParametroCartera = new JLabelMe();
		jLabelIdParametroCartera.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdParametroCartera,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidParametroCartera = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidParametroCartera.setToolTipText(ParametroCarteraConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutParametroCartera= new GridBagLayout();

		this.jPanelidParametroCartera.setLayout(this.gridaBagLayoutParametroCartera);

		jLabelidParametroCartera = new JLabel();
		jLabelidParametroCartera.setText("Id");

		jLabelidParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_digitos_facturaParametroCartera = new JLabelMe();
		this.jLabelnumero_digitos_facturaParametroCartera.setText(""+ParametroCarteraConstantesFunciones.LABEL_NUMERODIGITOSFACTURA+" : *");
		this.jLabelnumero_digitos_facturaParametroCartera.setToolTipText("No Digitos Factura");
		this.jLabelnumero_digitos_facturaParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_digitos_facturaParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_digitos_facturaParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_digitos_facturaParametroCartera,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_digitos_facturaParametroCartera=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_digitos_facturaParametroCartera.setToolTipText(ParametroCarteraConstantesFunciones.LABEL_NUMERODIGITOSFACTURA);
		this.gridaBagLayoutParametroCartera = new GridBagLayout();
		this.jPanelnumero_digitos_facturaParametroCartera.setLayout(this.gridaBagLayoutParametroCartera);


		jTextFieldnumero_digitos_facturaParametroCartera= new JTextFieldMe();
		jTextFieldnumero_digitos_facturaParametroCartera.setEnabled(false);
		jTextFieldnumero_digitos_facturaParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_digitos_facturaParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_digitos_facturaParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_digitos_facturaParametroCartera,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_digitos_facturaParametroCartera.setText("0");

		this.jButtonnumero_digitos_facturaParametroCarteraBusqueda= new JButtonMe();
		this.jButtonnumero_digitos_facturaParametroCarteraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_digitos_facturaParametroCarteraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_digitos_facturaParametroCarteraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_digitos_facturaParametroCarteraBusqueda.setText("U");
		this.jButtonnumero_digitos_facturaParametroCarteraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_digitos_facturaParametroCarteraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_digitos_facturaParametroCarteraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_digitos_facturaParametroCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_digitos_facturaParametroCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_digitos_facturaParametroCarteraBusqueda"));

		if(this.parametrocarteraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_digitos_facturaParametroCarteraBusqueda.setVisible(false);		}


					
		this.jLabelpor_lotesParametroCartera = new JLabelMe();
		this.jLabelpor_lotesParametroCartera.setText(""+ParametroCarteraConstantesFunciones.LABEL_PORLOTES+" : *");
		this.jLabelpor_lotesParametroCartera.setToolTipText("Por Lotes");
		this.jLabelpor_lotesParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpor_lotesParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpor_lotesParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelpor_lotesParametroCartera,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpor_lotesParametroCartera=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpor_lotesParametroCartera.setToolTipText(ParametroCarteraConstantesFunciones.LABEL_PORLOTES);
		this.gridaBagLayoutParametroCartera = new GridBagLayout();
		this.jPanelpor_lotesParametroCartera.setLayout(this.gridaBagLayoutParametroCartera);


		jCheckBoxpor_lotesParametroCartera= new JCheckBoxMe();
		jCheckBoxpor_lotesParametroCartera.setEnabled(false);

		jCheckBoxpor_lotesParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxpor_lotesParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxpor_lotesParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxpor_lotesParametroCartera,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonpor_lotesParametroCarteraBusqueda= new JButtonMe();
		this.jButtonpor_lotesParametroCarteraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpor_lotesParametroCarteraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpor_lotesParametroCarteraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpor_lotesParametroCarteraBusqueda.setText("U");
		this.jButtonpor_lotesParametroCarteraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpor_lotesParametroCarteraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpor_lotesParametroCarteraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxpor_lotesParametroCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxpor_lotesParametroCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"por_lotesParametroCarteraBusqueda"));

		if(this.parametrocarteraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpor_lotesParametroCarteraBusqueda.setVisible(false);		}


					
		this.jLabelnumero_orden_pagoParametroCartera = new JLabelMe();
		this.jLabelnumero_orden_pagoParametroCartera.setText(""+ParametroCarteraConstantesFunciones.LABEL_NUMEROORDENPAGO+" : *");
		this.jLabelnumero_orden_pagoParametroCartera.setToolTipText("No Orden Pago");
		this.jLabelnumero_orden_pagoParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_orden_pagoParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_orden_pagoParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_orden_pagoParametroCartera,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_orden_pagoParametroCartera=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_orden_pagoParametroCartera.setToolTipText(ParametroCarteraConstantesFunciones.LABEL_NUMEROORDENPAGO);
		this.gridaBagLayoutParametroCartera = new GridBagLayout();
		this.jPanelnumero_orden_pagoParametroCartera.setLayout(this.gridaBagLayoutParametroCartera);


		jTextFieldnumero_orden_pagoParametroCartera= new JTextFieldMe();

		jTextFieldnumero_orden_pagoParametroCartera.setEnabled(false);
		jTextFieldnumero_orden_pagoParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_orden_pagoParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_orden_pagoParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_orden_pagoParametroCartera,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_orden_pagoParametroCarteraBusqueda= new JButtonMe();
		this.jButtonnumero_orden_pagoParametroCarteraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_orden_pagoParametroCarteraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_orden_pagoParametroCarteraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_orden_pagoParametroCarteraBusqueda.setText("U");
		this.jButtonnumero_orden_pagoParametroCarteraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_orden_pagoParametroCarteraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_orden_pagoParametroCarteraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_orden_pagoParametroCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_orden_pagoParametroCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_orden_pagoParametroCarteraBusqueda"));

		if(this.parametrocarteraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_orden_pagoParametroCarteraBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionParametroCartera = new JLabelMe();
		this.jLabeldescripcionParametroCartera.setText(""+ParametroCarteraConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionParametroCartera.setToolTipText("Descripcion");
		this.jLabeldescripcionParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionParametroCartera,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionParametroCartera=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionParametroCartera.setToolTipText(ParametroCarteraConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutParametroCartera = new GridBagLayout();
		this.jPaneldescripcionParametroCartera.setLayout(this.gridaBagLayoutParametroCartera);


		jTextAreadescripcionParametroCartera= new JTextAreaMe();
		jTextAreadescripcionParametroCartera.setEnabled(false);
		jTextAreadescripcionParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionParametroCartera.setLineWrap(true);
		jTextAreadescripcionParametroCartera.setWrapStyleWord(true);
		jTextAreadescripcionParametroCartera.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionParametroCartera.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionParametroCartera,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionParametroCartera = new JScrollPane(jTextAreadescripcionParametroCartera);
		jscrollPanedescripcionParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionParametroCarteraBusqueda= new JButtonMe();
		this.jButtondescripcionParametroCarteraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionParametroCarteraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionParametroCarteraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionParametroCarteraBusqueda.setText("U");
		this.jButtondescripcionParametroCarteraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionParametroCarteraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionParametroCarteraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionParametroCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionParametroCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionParametroCarteraBusqueda"));

		if(this.parametrocarteraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionParametroCarteraBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysParametroCartera() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaParametroCartera = new JLabelMe();
		this.jLabelid_empresaParametroCartera.setText(""+ParametroCarteraConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaParametroCartera.setToolTipText("Empresa");
		this.jLabelid_empresaParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaParametroCartera,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaParametroCartera=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaParametroCartera.setToolTipText(ParametroCarteraConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutParametroCartera = new GridBagLayout();
		this.jPanelid_empresaParametroCartera.setLayout(this.gridaBagLayoutParametroCartera);


		jComboBoxid_empresaParametroCartera= new JComboBoxMe();
		jComboBoxid_empresaParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaParametroCartera,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaParametroCartera.setEnabled(false);

		this.jButtonid_empresaParametroCartera= new JButtonMe();
		this.jButtonid_empresaParametroCartera.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroCartera.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroCartera.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroCartera.setText("Buscar");
		this.jButtonid_empresaParametroCartera.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaParametroCartera.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroCartera,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaParametroCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroCartera"));

		this.jButtonid_empresaParametroCarteraBusqueda= new JButtonMe();
		this.jButtonid_empresaParametroCarteraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroCarteraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroCarteraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroCarteraBusqueda.setText("U");
		this.jButtonid_empresaParametroCarteraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaParametroCarteraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroCarteraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaParametroCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroCarteraBusqueda"));

		if(this.parametrocarteraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaParametroCarteraBusqueda.setVisible(false);		}

		this.jButtonid_empresaParametroCarteraUpdate= new JButtonMe();
		this.jButtonid_empresaParametroCarteraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroCarteraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroCarteraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroCarteraUpdate.setText("U");
		this.jButtonid_empresaParametroCarteraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaParametroCarteraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroCarteraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaParametroCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroCarteraUpdate"));



					
		this.jLabelid_transaccion_facturaParametroCartera = new JLabelMe();
		this.jLabelid_transaccion_facturaParametroCartera.setText(""+ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONFACTURA+" : *");
		this.jLabelid_transaccion_facturaParametroCartera.setToolTipText("Transaccion Factura");
		this.jLabelid_transaccion_facturaParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_transaccion_facturaParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_transaccion_facturaParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_facturaParametroCartera,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion_facturaParametroCartera=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion_facturaParametroCartera.setToolTipText(ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONFACTURA);
		this.gridaBagLayoutParametroCartera = new GridBagLayout();
		this.jPanelid_transaccion_facturaParametroCartera.setLayout(this.gridaBagLayoutParametroCartera);


		jComboBoxid_transaccion_facturaParametroCartera= new JComboBoxMe();
		jComboBoxid_transaccion_facturaParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_facturaParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_facturaParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_facturaParametroCartera,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion_facturaParametroCartera= new JButtonMe();
		this.jButtonid_transaccion_facturaParametroCartera.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_facturaParametroCartera.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_facturaParametroCartera.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_facturaParametroCartera.setText("Buscar");
		this.jButtonid_transaccion_facturaParametroCartera.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion_facturaParametroCartera.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_facturaParametroCartera,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion_facturaParametroCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_facturaParametroCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_facturaParametroCartera"));

		this.jButtonid_transaccion_facturaParametroCarteraBusqueda= new JButtonMe();
		this.jButtonid_transaccion_facturaParametroCarteraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_facturaParametroCarteraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_facturaParametroCarteraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_facturaParametroCarteraBusqueda.setText("U");
		this.jButtonid_transaccion_facturaParametroCarteraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion_facturaParametroCarteraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_facturaParametroCarteraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion_facturaParametroCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_facturaParametroCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_facturaParametroCarteraBusqueda"));

		if(this.parametrocarteraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion_facturaParametroCarteraBusqueda.setVisible(false);		}

		this.jButtonid_transaccion_facturaParametroCarteraUpdate= new JButtonMe();
		this.jButtonid_transaccion_facturaParametroCarteraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_facturaParametroCarteraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_facturaParametroCarteraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_facturaParametroCarteraUpdate.setText("U");
		this.jButtonid_transaccion_facturaParametroCarteraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion_facturaParametroCarteraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_facturaParametroCarteraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion_facturaParametroCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_facturaParametroCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_facturaParametroCarteraUpdate"));



					
		this.jLabelid_empleadoParametroCartera = new JLabelMe();
		this.jLabelid_empleadoParametroCartera.setText(""+ParametroCarteraConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoParametroCartera.setToolTipText("Tesorero");
		this.jLabelid_empleadoParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoParametroCartera,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoParametroCartera=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoParametroCartera.setToolTipText(ParametroCarteraConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutParametroCartera = new GridBagLayout();
		this.jPanelid_empleadoParametroCartera.setLayout(this.gridaBagLayoutParametroCartera);


		jComboBoxid_empleadoParametroCartera= new JComboBoxMe();
		jComboBoxid_empleadoParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoParametroCartera,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoParametroCartera= new JButtonMe();
		this.jButtonid_empleadoParametroCartera.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoParametroCartera.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoParametroCartera.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoParametroCartera.setText("Buscar");
		this.jButtonid_empleadoParametroCartera.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoParametroCartera.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoParametroCartera,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoParametroCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoParametroCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoParametroCartera"));

		this.jButtonid_empleadoParametroCarteraBusqueda= new JButtonMe();
		this.jButtonid_empleadoParametroCarteraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoParametroCarteraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoParametroCarteraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoParametroCarteraBusqueda.setText("U");
		this.jButtonid_empleadoParametroCarteraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoParametroCarteraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoParametroCarteraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoParametroCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoParametroCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoParametroCarteraBusqueda"));

		if(this.parametrocarteraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoParametroCarteraBusqueda.setVisible(false);		}

		this.jButtonid_empleadoParametroCarteraUpdate= new JButtonMe();
		this.jButtonid_empleadoParametroCarteraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoParametroCarteraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoParametroCarteraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoParametroCarteraUpdate.setText("U");
		this.jButtonid_empleadoParametroCarteraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoParametroCarteraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoParametroCarteraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoParametroCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoParametroCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoParametroCarteraUpdate"));



					
		this.jLabelid_transaccion_deshabilitaParametroCartera = new JLabelMe();
		this.jLabelid_transaccion_deshabilitaParametroCartera.setText(""+ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONDESHABILITA+" : *");
		this.jLabelid_transaccion_deshabilitaParametroCartera.setToolTipText("Transaccion Deshabilita");
		this.jLabelid_transaccion_deshabilitaParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_transaccion_deshabilitaParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_transaccion_deshabilitaParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_deshabilitaParametroCartera,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion_deshabilitaParametroCartera=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion_deshabilitaParametroCartera.setToolTipText(ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONDESHABILITA);
		this.gridaBagLayoutParametroCartera = new GridBagLayout();
		this.jPanelid_transaccion_deshabilitaParametroCartera.setLayout(this.gridaBagLayoutParametroCartera);


		jComboBoxid_transaccion_deshabilitaParametroCartera= new JComboBoxMe();
		jComboBoxid_transaccion_deshabilitaParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_deshabilitaParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_deshabilitaParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_deshabilitaParametroCartera,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion_deshabilitaParametroCartera= new JButtonMe();
		this.jButtonid_transaccion_deshabilitaParametroCartera.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_deshabilitaParametroCartera.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_deshabilitaParametroCartera.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_deshabilitaParametroCartera.setText("Buscar");
		this.jButtonid_transaccion_deshabilitaParametroCartera.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion_deshabilitaParametroCartera.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_deshabilitaParametroCartera,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion_deshabilitaParametroCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_deshabilitaParametroCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_deshabilitaParametroCartera"));

		this.jButtonid_transaccion_deshabilitaParametroCarteraBusqueda= new JButtonMe();
		this.jButtonid_transaccion_deshabilitaParametroCarteraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_deshabilitaParametroCarteraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_deshabilitaParametroCarteraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_deshabilitaParametroCarteraBusqueda.setText("U");
		this.jButtonid_transaccion_deshabilitaParametroCarteraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion_deshabilitaParametroCarteraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_deshabilitaParametroCarteraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion_deshabilitaParametroCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_deshabilitaParametroCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_deshabilitaParametroCarteraBusqueda"));

		if(this.parametrocarteraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion_deshabilitaParametroCarteraBusqueda.setVisible(false);		}

		this.jButtonid_transaccion_deshabilitaParametroCarteraUpdate= new JButtonMe();
		this.jButtonid_transaccion_deshabilitaParametroCarteraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_deshabilitaParametroCarteraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_deshabilitaParametroCarteraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_deshabilitaParametroCarteraUpdate.setText("U");
		this.jButtonid_transaccion_deshabilitaParametroCarteraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion_deshabilitaParametroCarteraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_deshabilitaParametroCarteraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion_deshabilitaParametroCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_deshabilitaParametroCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_deshabilitaParametroCarteraUpdate"));



					
		this.jLabelid_transaccion_habilitaParametroCartera = new JLabelMe();
		this.jLabelid_transaccion_habilitaParametroCartera.setText(""+ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONHABILITA+" : *");
		this.jLabelid_transaccion_habilitaParametroCartera.setToolTipText("Transaccion Habilita");
		this.jLabelid_transaccion_habilitaParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_transaccion_habilitaParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_transaccion_habilitaParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_habilitaParametroCartera,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion_habilitaParametroCartera=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion_habilitaParametroCartera.setToolTipText(ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONHABILITA);
		this.gridaBagLayoutParametroCartera = new GridBagLayout();
		this.jPanelid_transaccion_habilitaParametroCartera.setLayout(this.gridaBagLayoutParametroCartera);


		jComboBoxid_transaccion_habilitaParametroCartera= new JComboBoxMe();
		jComboBoxid_transaccion_habilitaParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_habilitaParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_habilitaParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_habilitaParametroCartera,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion_habilitaParametroCartera= new JButtonMe();
		this.jButtonid_transaccion_habilitaParametroCartera.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_habilitaParametroCartera.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_habilitaParametroCartera.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_habilitaParametroCartera.setText("Buscar");
		this.jButtonid_transaccion_habilitaParametroCartera.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion_habilitaParametroCartera.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_habilitaParametroCartera,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion_habilitaParametroCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_habilitaParametroCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_habilitaParametroCartera"));

		this.jButtonid_transaccion_habilitaParametroCarteraBusqueda= new JButtonMe();
		this.jButtonid_transaccion_habilitaParametroCarteraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_habilitaParametroCarteraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_habilitaParametroCarteraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_habilitaParametroCarteraBusqueda.setText("U");
		this.jButtonid_transaccion_habilitaParametroCarteraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion_habilitaParametroCarteraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_habilitaParametroCarteraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion_habilitaParametroCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_habilitaParametroCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_habilitaParametroCarteraBusqueda"));

		if(this.parametrocarteraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion_habilitaParametroCarteraBusqueda.setVisible(false);		}

		this.jButtonid_transaccion_habilitaParametroCarteraUpdate= new JButtonMe();
		this.jButtonid_transaccion_habilitaParametroCarteraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_habilitaParametroCarteraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_habilitaParametroCarteraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_habilitaParametroCarteraUpdate.setText("U");
		this.jButtonid_transaccion_habilitaParametroCarteraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion_habilitaParametroCarteraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_habilitaParametroCarteraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion_habilitaParametroCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_habilitaParametroCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_habilitaParametroCarteraUpdate"));



					
		this.jLabelid_bodegaParametroCartera = new JLabelMe();
		this.jLabelid_bodegaParametroCartera.setText(""+ParametroCarteraConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaParametroCartera.setToolTipText("Bodega");
		this.jLabelid_bodegaParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaParametroCartera,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaParametroCartera=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaParametroCartera.setToolTipText(ParametroCarteraConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutParametroCartera = new GridBagLayout();
		this.jPanelid_bodegaParametroCartera.setLayout(this.gridaBagLayoutParametroCartera);


		jComboBoxid_bodegaParametroCartera= new JComboBoxMe();
		jComboBoxid_bodegaParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaParametroCartera,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaParametroCartera= new JButtonMe();
		this.jButtonid_bodegaParametroCartera.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaParametroCartera.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaParametroCartera.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaParametroCartera.setText("Buscar");
		this.jButtonid_bodegaParametroCartera.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaParametroCartera.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaParametroCartera,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaParametroCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaParametroCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaParametroCartera"));

		this.jButtonid_bodegaParametroCarteraBusqueda= new JButtonMe();
		this.jButtonid_bodegaParametroCarteraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaParametroCarteraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaParametroCarteraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaParametroCarteraBusqueda.setText("U");
		this.jButtonid_bodegaParametroCarteraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaParametroCarteraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaParametroCarteraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaParametroCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaParametroCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaParametroCarteraBusqueda"));

		if(this.parametrocarteraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaParametroCarteraBusqueda.setVisible(false);		}

		this.jButtonid_bodegaParametroCarteraUpdate= new JButtonMe();
		this.jButtonid_bodegaParametroCarteraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaParametroCarteraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaParametroCarteraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaParametroCarteraUpdate.setText("U");
		this.jButtonid_bodegaParametroCarteraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaParametroCarteraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaParametroCarteraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaParametroCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaParametroCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaParametroCarteraUpdate"));



					
		this.jLabelid_tipo_facturaParametroCartera = new JLabelMe();
		this.jLabelid_tipo_facturaParametroCartera.setText(""+ParametroCarteraConstantesFunciones.LABEL_IDTIPOFACTURA+" : *");
		this.jLabelid_tipo_facturaParametroCartera.setToolTipText("Tipo Factura");
		this.jLabelid_tipo_facturaParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_facturaParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_facturaParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_facturaParametroCartera,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_facturaParametroCartera=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_facturaParametroCartera.setToolTipText(ParametroCarteraConstantesFunciones.LABEL_IDTIPOFACTURA);
		this.gridaBagLayoutParametroCartera = new GridBagLayout();
		this.jPanelid_tipo_facturaParametroCartera.setLayout(this.gridaBagLayoutParametroCartera);


		jComboBoxid_tipo_facturaParametroCartera= new JComboBoxMe();
		jComboBoxid_tipo_facturaParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_facturaParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_facturaParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_facturaParametroCartera,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_facturaParametroCartera= new JButtonMe();
		this.jButtonid_tipo_facturaParametroCartera.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_facturaParametroCartera.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_facturaParametroCartera.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_facturaParametroCartera.setText("Buscar");
		this.jButtonid_tipo_facturaParametroCartera.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_facturaParametroCartera.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_facturaParametroCartera,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_facturaParametroCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_facturaParametroCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_facturaParametroCartera"));

		this.jButtonid_tipo_facturaParametroCarteraBusqueda= new JButtonMe();
		this.jButtonid_tipo_facturaParametroCarteraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_facturaParametroCarteraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_facturaParametroCarteraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_facturaParametroCarteraBusqueda.setText("U");
		this.jButtonid_tipo_facturaParametroCarteraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_facturaParametroCarteraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_facturaParametroCarteraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_facturaParametroCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_facturaParametroCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_facturaParametroCarteraBusqueda"));

		if(this.parametrocarteraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_facturaParametroCarteraBusqueda.setVisible(false);		}

		this.jButtonid_tipo_facturaParametroCarteraUpdate= new JButtonMe();
		this.jButtonid_tipo_facturaParametroCarteraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_facturaParametroCarteraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_facturaParametroCarteraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_facturaParametroCarteraUpdate.setText("U");
		this.jButtonid_tipo_facturaParametroCarteraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_facturaParametroCarteraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_facturaParametroCarteraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_facturaParametroCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_facturaParametroCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_facturaParametroCarteraUpdate"));



					
		this.jLabelid_tipo_auto_pagoParametroCartera = new JLabelMe();
		this.jLabelid_tipo_auto_pagoParametroCartera.setText(""+ParametroCarteraConstantesFunciones.LABEL_IDTIPOAUTOPAGO+" : *");
		this.jLabelid_tipo_auto_pagoParametroCartera.setToolTipText("Tipo Auto Pago");
		this.jLabelid_tipo_auto_pagoParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_auto_pagoParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_auto_pagoParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_auto_pagoParametroCartera,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_auto_pagoParametroCartera=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_auto_pagoParametroCartera.setToolTipText(ParametroCarteraConstantesFunciones.LABEL_IDTIPOAUTOPAGO);
		this.gridaBagLayoutParametroCartera = new GridBagLayout();
		this.jPanelid_tipo_auto_pagoParametroCartera.setLayout(this.gridaBagLayoutParametroCartera);


		jComboBoxid_tipo_auto_pagoParametroCartera= new JComboBoxMe();
		jComboBoxid_tipo_auto_pagoParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_auto_pagoParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_auto_pagoParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_auto_pagoParametroCartera,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_auto_pagoParametroCartera= new JButtonMe();
		this.jButtonid_tipo_auto_pagoParametroCartera.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_auto_pagoParametroCartera.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_auto_pagoParametroCartera.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_auto_pagoParametroCartera.setText("Buscar");
		this.jButtonid_tipo_auto_pagoParametroCartera.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_auto_pagoParametroCartera.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_auto_pagoParametroCartera,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_auto_pagoParametroCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_auto_pagoParametroCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_auto_pagoParametroCartera"));

		this.jButtonid_tipo_auto_pagoParametroCarteraBusqueda= new JButtonMe();
		this.jButtonid_tipo_auto_pagoParametroCarteraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_auto_pagoParametroCarteraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_auto_pagoParametroCarteraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_auto_pagoParametroCarteraBusqueda.setText("U");
		this.jButtonid_tipo_auto_pagoParametroCarteraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_auto_pagoParametroCarteraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_auto_pagoParametroCarteraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_auto_pagoParametroCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_auto_pagoParametroCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_auto_pagoParametroCarteraBusqueda"));

		if(this.parametrocarteraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_auto_pagoParametroCarteraBusqueda.setVisible(false);		}

		this.jButtonid_tipo_auto_pagoParametroCarteraUpdate= new JButtonMe();
		this.jButtonid_tipo_auto_pagoParametroCarteraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_auto_pagoParametroCarteraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_auto_pagoParametroCarteraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_auto_pagoParametroCarteraUpdate.setText("U");
		this.jButtonid_tipo_auto_pagoParametroCarteraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_auto_pagoParametroCarteraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_auto_pagoParametroCarteraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_auto_pagoParametroCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_auto_pagoParametroCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_auto_pagoParametroCarteraUpdate"));



					
		this.jLabelid_cuenta_contable_credito_fiscalParametroCartera = new JLabelMe();
		this.jLabelid_cuenta_contable_credito_fiscalParametroCartera.setText(""+ParametroCarteraConstantesFunciones.LABEL_IDCUENTACONTABLECREDITOFISCAL+" : *");
		this.jLabelid_cuenta_contable_credito_fiscalParametroCartera.setToolTipText("Cuenta Contable Credito Fiscal");
		this.jLabelid_cuenta_contable_credito_fiscalParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_credito_fiscalParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_credito_fiscalParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_credito_fiscalParametroCartera,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_credito_fiscalParametroCartera=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_credito_fiscalParametroCartera.setToolTipText(ParametroCarteraConstantesFunciones.LABEL_IDCUENTACONTABLECREDITOFISCAL);
		this.gridaBagLayoutParametroCartera = new GridBagLayout();
		this.jPanelid_cuenta_contable_credito_fiscalParametroCartera.setLayout(this.gridaBagLayoutParametroCartera);


		jComboBoxid_cuenta_contable_credito_fiscalParametroCartera= new JComboBoxMe();
		jComboBoxid_cuenta_contable_credito_fiscalParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_credito_fiscalParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_credito_fiscalParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_credito_fiscalParametroCartera,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_credito_fiscalParametroCartera= new JButtonMe();
		this.jButtonid_cuenta_contable_credito_fiscalParametroCartera.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_credito_fiscalParametroCartera.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_credito_fiscalParametroCartera.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_credito_fiscalParametroCartera.setText("Buscar");
		this.jButtonid_cuenta_contable_credito_fiscalParametroCartera.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_credito_fiscalParametroCartera.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_credito_fiscalParametroCartera,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_credito_fiscalParametroCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_credito_fiscalParametroCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_credito_fiscalParametroCartera"));

		this.jButtonid_cuenta_contable_credito_fiscalParametroCarteraBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_credito_fiscalParametroCarteraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_credito_fiscalParametroCarteraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_credito_fiscalParametroCarteraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_credito_fiscalParametroCarteraBusqueda.setText("U");
		this.jButtonid_cuenta_contable_credito_fiscalParametroCarteraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_credito_fiscalParametroCarteraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_credito_fiscalParametroCarteraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_credito_fiscalParametroCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_credito_fiscalParametroCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_credito_fiscalParametroCarteraBusqueda"));

		if(this.parametrocarteraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_credito_fiscalParametroCarteraBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_credito_fiscalParametroCarteraUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_credito_fiscalParametroCarteraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_credito_fiscalParametroCarteraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_credito_fiscalParametroCarteraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_credito_fiscalParametroCarteraUpdate.setText("U");
		this.jButtonid_cuenta_contable_credito_fiscalParametroCarteraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_credito_fiscalParametroCarteraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_credito_fiscalParametroCarteraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_credito_fiscalParametroCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_credito_fiscalParametroCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_credito_fiscalParametroCarteraUpdate"));


		jButtonid_cuenta_contable_credito_fiscalParametroCarteraArbol= new JButtonMe();
		jButtonid_cuenta_contable_credito_fiscalParametroCarteraArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_credito_fiscalParametroCarteraArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_credito_fiscalParametroCarteraArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_credito_fiscalParametroCarteraArbol.setText("Arbol");
		jButtonid_cuenta_contable_credito_fiscalParametroCarteraArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_credito_fiscalParametroCarteraArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_credito_fiscalParametroCarteraArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_credito_fiscalParametroCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_credito_fiscalParametroCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_credito_fiscalParametroCarteraArbol"));



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
		//this.jInternalFrameDetalleParametroCartera = new ParametroCarteraBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Parametro Cartera DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroCartera= new GridBagLayout();
		

		
		String sToolTipParametroCartera="";
		sToolTipParametroCartera=ParametroCarteraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroCartera+="(Cartera.ParametroCartera)";
		}
		
		if(!this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroCartera+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoParametroCartera = new JButtonMe();
		this.jButtonModificarParametroCartera = new JButtonMe();
        this.jButtonActualizarParametroCartera = new JButtonMe();
        this.jButtonEliminarParametroCartera = new JButtonMe();
        this.jButtonCancelarParametroCartera = new JButtonMe();
        this.jButtonGuardarCambiosParametroCartera = new JButtonMe();
		this.jButtonGuardarCambiosTablaParametroCartera = new JButtonMe();
		this.jButtonCerrarParametroCartera = new JButtonMe();
		
		this.jScrollPanelDatosParametroCartera = new JScrollPane();   
        this.jScrollPanelDatosEdicionParametroCartera = new JScrollPane();
		this.jScrollPanelDatosGeneralParametroCartera = new JScrollPane();
				
		
		
		this.jPanelCamposParametroCartera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosParametroCartera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesParametroCartera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioParametroCartera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Cartera";
		
		if(!this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Carteras" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroCartera.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionParametroCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralParametroCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposParametroCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposParametroCartera.setName("jPanelCamposParametroCartera"); 

		this.jPanelCamposOcultosParametroCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosParametroCartera.setName("jPanelCamposOcultosParametroCartera"); 

        this.jPanelAccionesParametroCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroCartera.setToolTipText("Acciones");
        this.jPanelAccionesParametroCartera.setName("Acciones"); 

		this.jPanelAccionesFormularioParametroCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioParametroCartera.setToolTipText("Acciones");
        this.jPanelAccionesFormularioParametroCartera.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionParametroCartera, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroCartera, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroCartera, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposParametroCartera, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosParametroCartera, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioParametroCartera, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoParametroCartera.setText("Nuevo");
		this.jButtonModificarParametroCartera.setText("Editar");
        this.jButtonActualizarParametroCartera.setText("Actualizar");
        this.jButtonEliminarParametroCartera.setText("Eliminar");
        this.jButtonCancelarParametroCartera.setText("Cancelar");
        this.jButtonGuardarCambiosParametroCartera.setText("Guardar");
		this.jButtonGuardarCambiosTablaParametroCartera.setText("Guardar");
		this.jButtonCerrarParametroCartera.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroCartera,"nuevo_button","Nuevo",this.parametrocarteraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarParametroCartera,"modificar_button","Editar",this.parametrocarteraSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarParametroCartera,"actualizar_button","Actualizar",this.parametrocarteraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarParametroCartera,"eliminar_button","Eliminar",this.parametrocarteraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarParametroCartera,"cancelar_button","Cancelar",this.parametrocarteraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosParametroCartera,"guardarcambios_button","Guardar",this.parametrocarteraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroCartera,"guardarcambiostabla_button","Guardar",this.parametrocarteraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroCartera,"cerrar_button","Salir",this.parametrocarteraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarParametroCartera, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarParametroCartera, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarParametroCartera, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoParametroCartera.setToolTipText("Nuevo"+" "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarParametroCartera.setToolTipText("Editar"+" "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarParametroCartera.setToolTipText("Actualizar"+" "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarParametroCartera.setToolTipText("Eliminar)"+" "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarParametroCartera.setToolTipText("Cancelar"+" "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosParametroCartera.setToolTipText("Guardar"+" "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaParametroCartera.setToolTipText("Guardar"+" "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroCartera.setToolTipText("Salir"+" "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroCartera";
		inputMap = this.jButtonNuevoParametroCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroCartera.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroCartera"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarParametroCartera";
		inputMap = this.jButtonActualizarParametroCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarParametroCartera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarParametroCartera"));
		
		//ELIMINAR
		sMapKey = "EliminarParametroCartera";
		inputMap = this.jButtonEliminarParametroCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarParametroCartera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarParametroCartera"));
		
		//CANCELAR	
		sMapKey = "CancelarParametroCartera";
		inputMap = this.jButtonCancelarParametroCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarParametroCartera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarParametroCartera"));
		
		//CERRAR		
		sMapKey = "CerrarParametroCartera";
		inputMap = this.jButtonCerrarParametroCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroCartera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroCartera"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroCartera";
		inputMap = this.jButtonGuardarCambiosTablaParametroCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroCartera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroCartera"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoParametroCartera = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoParametroCartera.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoParametroCartera.setToolTipText("Nuevo ParametroCartera");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoParametroCartera, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarParametroCartera = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarParametroCartera.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarParametroCartera.setToolTipText("Sin Cerrar Ventana ParametroCartera");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarParametroCartera, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeParametroCartera = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeParametroCartera.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeParametroCartera.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeParametroCartera, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesParametroCartera = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroCartera.setText("Accion");
		this.jComboBoxTiposAccionesParametroCartera.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioParametroCartera = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioParametroCartera.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioParametroCartera.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesParametroCartera = new JLabelMe();
		
		this.jLabelAccionesParametroCartera.setText("Acciones");		
		this.jLabelAccionesParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposParametroCartera();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysParametroCartera();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesParametroCartera=new JTabbedPane();
		this.jTabbedPaneRelacionesParametroCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesParametroCartera,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesParametroCartera.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroCartera.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroCartera.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioParametroCartera.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroCartera.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroCartera.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioParametroCartera, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposParametroCartera = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosParametroCartera = new GridBagLayout();
		
		this.jPanelCamposParametroCartera.setLayout(gridaBagLayoutCamposParametroCartera);
		this.jPanelCamposOcultosParametroCartera.setLayout(gridaBagLayoutCamposOcultosParametroCartera);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCartera.gridy = 0;
	this.gridBagConstraintsParametroCartera.gridx = 0;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidParametroCartera.add(jLabelIdParametroCartera, this.gridBagConstraintsParametroCartera);



	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCartera.gridy = 0;
	this.gridBagConstraintsParametroCartera.gridx = 1;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidParametroCartera.add(jLabelidParametroCartera, this.gridBagConstraintsParametroCartera);


	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCartera.gridy = 0;
	this.gridBagConstraintsParametroCartera.gridx = 0;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaParametroCartera.add(jLabelid_empresaParametroCartera, this.gridBagConstraintsParametroCartera);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		//this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCartera.gridy = 0;
		this.gridBagConstraintsParametroCartera.gridx = 2;
		this.gridBagConstraintsParametroCartera.ipadx = 0;
		this.gridBagConstraintsParametroCartera.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroCartera.add(jButtonid_empresaParametroCarteraBusqueda, this.gridBagConstraintsParametroCartera);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		//this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCartera.gridy = 0;
		this.gridBagConstraintsParametroCartera.gridx = 3;
		this.gridBagConstraintsParametroCartera.ipadx = 0;
		this.gridBagConstraintsParametroCartera.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroCartera.add(jButtonid_empresaParametroCarteraUpdate, this.gridBagConstraintsParametroCartera);
	}

	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCartera.gridy = 0;
	this.gridBagConstraintsParametroCartera.gridx = 1;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaParametroCartera.add(jComboBoxid_empresaParametroCartera, this.gridBagConstraintsParametroCartera);


	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCartera.gridy = 0;
	this.gridBagConstraintsParametroCartera.gridx = 0;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion_facturaParametroCartera.add(jLabelid_transaccion_facturaParametroCartera, this.gridBagConstraintsParametroCartera);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		//this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCartera.gridy = 0;
		this.gridBagConstraintsParametroCartera.gridx = 2;
		this.gridBagConstraintsParametroCartera.ipadx = 0;
		this.gridBagConstraintsParametroCartera.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_facturaParametroCartera.add(jButtonid_transaccion_facturaParametroCarteraBusqueda, this.gridBagConstraintsParametroCartera);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		//this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCartera.gridy = 0;
		this.gridBagConstraintsParametroCartera.gridx = 3;
		this.gridBagConstraintsParametroCartera.ipadx = 0;
		this.gridBagConstraintsParametroCartera.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_facturaParametroCartera.add(jButtonid_transaccion_facturaParametroCarteraUpdate, this.gridBagConstraintsParametroCartera);
	}

	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCartera.gridy = 0;
	this.gridBagConstraintsParametroCartera.gridx = 1;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion_facturaParametroCartera.add(jComboBoxid_transaccion_facturaParametroCartera, this.gridBagConstraintsParametroCartera);


	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCartera.gridy = 0;
	this.gridBagConstraintsParametroCartera.gridx = 0;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_digitos_facturaParametroCartera.add(jLabelnumero_digitos_facturaParametroCartera, this.gridBagConstraintsParametroCartera);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		//this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCartera.gridy = 0;
		this.gridBagConstraintsParametroCartera.gridx = 2;
		this.gridBagConstraintsParametroCartera.ipadx = 0;
		this.gridBagConstraintsParametroCartera.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_digitos_facturaParametroCartera.add(jButtonnumero_digitos_facturaParametroCarteraBusqueda, this.gridBagConstraintsParametroCartera);
	}

	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCartera.gridy = 0;
	this.gridBagConstraintsParametroCartera.gridx = 1;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_digitos_facturaParametroCartera.add(jTextFieldnumero_digitos_facturaParametroCartera, this.gridBagConstraintsParametroCartera);


	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCartera.gridy = 0;
	this.gridBagConstraintsParametroCartera.gridx = 0;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpor_lotesParametroCartera.add(jLabelpor_lotesParametroCartera, this.gridBagConstraintsParametroCartera);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		//this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCartera.gridy = 0;
		this.gridBagConstraintsParametroCartera.gridx = 2;
		this.gridBagConstraintsParametroCartera.ipadx = 0;
		this.gridBagConstraintsParametroCartera.insets = new Insets(0, 0, 0, 0);
		this.jPanelpor_lotesParametroCartera.add(jButtonpor_lotesParametroCarteraBusqueda, this.gridBagConstraintsParametroCartera);
	}

	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCartera.gridy = 0;
	this.gridBagConstraintsParametroCartera.gridx = 1;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpor_lotesParametroCartera.add(jCheckBoxpor_lotesParametroCartera, this.gridBagConstraintsParametroCartera);


	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCartera.gridy = 0;
	this.gridBagConstraintsParametroCartera.gridx = 0;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoParametroCartera.add(jLabelid_empleadoParametroCartera, this.gridBagConstraintsParametroCartera);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		//this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCartera.gridy = 0;
		this.gridBagConstraintsParametroCartera.gridx = 2;
		this.gridBagConstraintsParametroCartera.ipadx = 0;
		this.gridBagConstraintsParametroCartera.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoParametroCartera.add(jButtonid_empleadoParametroCarteraBusqueda, this.gridBagConstraintsParametroCartera);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		//this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCartera.gridy = 0;
		this.gridBagConstraintsParametroCartera.gridx = 3;
		this.gridBagConstraintsParametroCartera.ipadx = 0;
		this.gridBagConstraintsParametroCartera.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoParametroCartera.add(jButtonid_empleadoParametroCarteraUpdate, this.gridBagConstraintsParametroCartera);
	}

	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCartera.gridy = 0;
	this.gridBagConstraintsParametroCartera.gridx = 1;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoParametroCartera.add(jComboBoxid_empleadoParametroCartera, this.gridBagConstraintsParametroCartera);


	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCartera.gridy = 0;
	this.gridBagConstraintsParametroCartera.gridx = 0;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion_deshabilitaParametroCartera.add(jLabelid_transaccion_deshabilitaParametroCartera, this.gridBagConstraintsParametroCartera);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		//this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCartera.gridy = 0;
		this.gridBagConstraintsParametroCartera.gridx = 2;
		this.gridBagConstraintsParametroCartera.ipadx = 0;
		this.gridBagConstraintsParametroCartera.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_deshabilitaParametroCartera.add(jButtonid_transaccion_deshabilitaParametroCarteraBusqueda, this.gridBagConstraintsParametroCartera);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		//this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCartera.gridy = 0;
		this.gridBagConstraintsParametroCartera.gridx = 3;
		this.gridBagConstraintsParametroCartera.ipadx = 0;
		this.gridBagConstraintsParametroCartera.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_deshabilitaParametroCartera.add(jButtonid_transaccion_deshabilitaParametroCarteraUpdate, this.gridBagConstraintsParametroCartera);
	}

	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCartera.gridy = 0;
	this.gridBagConstraintsParametroCartera.gridx = 1;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion_deshabilitaParametroCartera.add(jComboBoxid_transaccion_deshabilitaParametroCartera, this.gridBagConstraintsParametroCartera);


	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCartera.gridy = 0;
	this.gridBagConstraintsParametroCartera.gridx = 0;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion_habilitaParametroCartera.add(jLabelid_transaccion_habilitaParametroCartera, this.gridBagConstraintsParametroCartera);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		//this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCartera.gridy = 0;
		this.gridBagConstraintsParametroCartera.gridx = 2;
		this.gridBagConstraintsParametroCartera.ipadx = 0;
		this.gridBagConstraintsParametroCartera.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_habilitaParametroCartera.add(jButtonid_transaccion_habilitaParametroCarteraBusqueda, this.gridBagConstraintsParametroCartera);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		//this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCartera.gridy = 0;
		this.gridBagConstraintsParametroCartera.gridx = 3;
		this.gridBagConstraintsParametroCartera.ipadx = 0;
		this.gridBagConstraintsParametroCartera.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_habilitaParametroCartera.add(jButtonid_transaccion_habilitaParametroCarteraUpdate, this.gridBagConstraintsParametroCartera);
	}

	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCartera.gridy = 0;
	this.gridBagConstraintsParametroCartera.gridx = 1;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion_habilitaParametroCartera.add(jComboBoxid_transaccion_habilitaParametroCartera, this.gridBagConstraintsParametroCartera);


	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCartera.gridy = 0;
	this.gridBagConstraintsParametroCartera.gridx = 0;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaParametroCartera.add(jLabelid_bodegaParametroCartera, this.gridBagConstraintsParametroCartera);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		//this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCartera.gridy = 0;
		this.gridBagConstraintsParametroCartera.gridx = 2;
		this.gridBagConstraintsParametroCartera.ipadx = 0;
		this.gridBagConstraintsParametroCartera.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaParametroCartera.add(jButtonid_bodegaParametroCarteraBusqueda, this.gridBagConstraintsParametroCartera);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		//this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCartera.gridy = 0;
		this.gridBagConstraintsParametroCartera.gridx = 3;
		this.gridBagConstraintsParametroCartera.ipadx = 0;
		this.gridBagConstraintsParametroCartera.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaParametroCartera.add(jButtonid_bodegaParametroCarteraUpdate, this.gridBagConstraintsParametroCartera);
	}

	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCartera.gridy = 0;
	this.gridBagConstraintsParametroCartera.gridx = 1;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaParametroCartera.add(jComboBoxid_bodegaParametroCartera, this.gridBagConstraintsParametroCartera);


	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCartera.gridy = 0;
	this.gridBagConstraintsParametroCartera.gridx = 0;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_facturaParametroCartera.add(jLabelid_tipo_facturaParametroCartera, this.gridBagConstraintsParametroCartera);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		//this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCartera.gridy = 0;
		this.gridBagConstraintsParametroCartera.gridx = 2;
		this.gridBagConstraintsParametroCartera.ipadx = 0;
		this.gridBagConstraintsParametroCartera.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_facturaParametroCartera.add(jButtonid_tipo_facturaParametroCarteraBusqueda, this.gridBagConstraintsParametroCartera);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		//this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCartera.gridy = 0;
		this.gridBagConstraintsParametroCartera.gridx = 3;
		this.gridBagConstraintsParametroCartera.ipadx = 0;
		this.gridBagConstraintsParametroCartera.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_facturaParametroCartera.add(jButtonid_tipo_facturaParametroCarteraUpdate, this.gridBagConstraintsParametroCartera);
	}

	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCartera.gridy = 0;
	this.gridBagConstraintsParametroCartera.gridx = 1;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_facturaParametroCartera.add(jComboBoxid_tipo_facturaParametroCartera, this.gridBagConstraintsParametroCartera);


	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCartera.gridy = 0;
	this.gridBagConstraintsParametroCartera.gridx = 0;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_auto_pagoParametroCartera.add(jLabelid_tipo_auto_pagoParametroCartera, this.gridBagConstraintsParametroCartera);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		//this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCartera.gridy = 0;
		this.gridBagConstraintsParametroCartera.gridx = 2;
		this.gridBagConstraintsParametroCartera.ipadx = 0;
		this.gridBagConstraintsParametroCartera.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_auto_pagoParametroCartera.add(jButtonid_tipo_auto_pagoParametroCarteraBusqueda, this.gridBagConstraintsParametroCartera);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		//this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCartera.gridy = 0;
		this.gridBagConstraintsParametroCartera.gridx = 3;
		this.gridBagConstraintsParametroCartera.ipadx = 0;
		this.gridBagConstraintsParametroCartera.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_auto_pagoParametroCartera.add(jButtonid_tipo_auto_pagoParametroCarteraUpdate, this.gridBagConstraintsParametroCartera);
	}

	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCartera.gridy = 0;
	this.gridBagConstraintsParametroCartera.gridx = 1;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_auto_pagoParametroCartera.add(jComboBoxid_tipo_auto_pagoParametroCartera, this.gridBagConstraintsParametroCartera);


	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCartera.gridy = 0;
	this.gridBagConstraintsParametroCartera.gridx = 0;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_orden_pagoParametroCartera.add(jLabelnumero_orden_pagoParametroCartera, this.gridBagConstraintsParametroCartera);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		//this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCartera.gridy = 0;
		this.gridBagConstraintsParametroCartera.gridx = 2;
		this.gridBagConstraintsParametroCartera.ipadx = 0;
		this.gridBagConstraintsParametroCartera.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_orden_pagoParametroCartera.add(jButtonnumero_orden_pagoParametroCarteraBusqueda, this.gridBagConstraintsParametroCartera);
	}

	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCartera.gridy = 0;
	this.gridBagConstraintsParametroCartera.gridx = 1;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_orden_pagoParametroCartera.add(jTextFieldnumero_orden_pagoParametroCartera, this.gridBagConstraintsParametroCartera);


	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCartera.gridy = 0;
	this.gridBagConstraintsParametroCartera.gridx = 0;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_credito_fiscalParametroCartera.add(jLabelid_cuenta_contable_credito_fiscalParametroCartera, this.gridBagConstraintsParametroCartera);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	//this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCartera.gridy = 0;
	this.gridBagConstraintsParametroCartera.gridx = 2;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	this.gridBagConstraintsParametroCartera.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_credito_fiscalParametroCartera.add(jButtonid_cuenta_contable_credito_fiscalParametroCartera, this.gridBagConstraintsParametroCartera);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	//this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCartera.gridy = 0;
	this.gridBagConstraintsParametroCartera.gridx = 3;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	this.gridBagConstraintsParametroCartera.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_credito_fiscalParametroCartera.add(jButtonid_cuenta_contable_credito_fiscalParametroCarteraArbol, this.gridBagConstraintsParametroCartera);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		//this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCartera.gridy = 0;
		this.gridBagConstraintsParametroCartera.gridx = 4;
		this.gridBagConstraintsParametroCartera.ipadx = 0;
		this.gridBagConstraintsParametroCartera.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_credito_fiscalParametroCartera.add(jButtonid_cuenta_contable_credito_fiscalParametroCarteraBusqueda, this.gridBagConstraintsParametroCartera);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		//this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCartera.gridy = 0;
		this.gridBagConstraintsParametroCartera.gridx = 5;
		this.gridBagConstraintsParametroCartera.ipadx = 0;
		this.gridBagConstraintsParametroCartera.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_credito_fiscalParametroCartera.add(jButtonid_cuenta_contable_credito_fiscalParametroCarteraUpdate, this.gridBagConstraintsParametroCartera);
	}

	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCartera.gridy = 0;
	this.gridBagConstraintsParametroCartera.gridx = 1;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_credito_fiscalParametroCartera.add(jComboBoxid_cuenta_contable_credito_fiscalParametroCartera, this.gridBagConstraintsParametroCartera);


	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCartera.gridy = 0;
	this.gridBagConstraintsParametroCartera.gridx = 0;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionParametroCartera.add(jLabeldescripcionParametroCartera, this.gridBagConstraintsParametroCartera);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		//this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCartera.gridy = 0;
		this.gridBagConstraintsParametroCartera.gridx = 2;
		this.gridBagConstraintsParametroCartera.ipadx = 0;
		this.gridBagConstraintsParametroCartera.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionParametroCartera.add(jButtondescripcionParametroCarteraBusqueda, this.gridBagConstraintsParametroCartera);
	}

	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCartera.gridy = 0;
	this.gridBagConstraintsParametroCartera.gridx = 1;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionParametroCartera.add(jscrollPanedescripcionParametroCartera, this.gridBagConstraintsParametroCartera);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCartera.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCartera.gridy = iYPanelCamposParametroCartera;
	this.gridBagConstraintsParametroCartera.gridx = iXPanelCamposParametroCartera++;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroCartera.add(this.jPanelidParametroCartera, this.gridBagConstraintsParametroCartera);



	if(iXPanelCamposParametroCartera % 1==0) {
		iXPanelCamposParametroCartera=0;
		iYPanelCamposParametroCartera++;
	}
	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCartera.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCartera.gridy = iYPanelCamposParametroCartera;
	this.gridBagConstraintsParametroCartera.gridx = iXPanelCamposParametroCartera++;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroCartera.add(this.jPanelid_transaccion_facturaParametroCartera, this.gridBagConstraintsParametroCartera);



	if(iXPanelCamposParametroCartera % 1==0) {
		iXPanelCamposParametroCartera=0;
		iYPanelCamposParametroCartera++;
	}
	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCartera.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCartera.gridy = iYPanelCamposParametroCartera;
	this.gridBagConstraintsParametroCartera.gridx = iXPanelCamposParametroCartera++;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroCartera.add(this.jPanelnumero_digitos_facturaParametroCartera, this.gridBagConstraintsParametroCartera);



	if(iXPanelCamposParametroCartera % 1==0) {
		iXPanelCamposParametroCartera=0;
		iYPanelCamposParametroCartera++;
	}
	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCartera.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCartera.gridy = iYPanelCamposParametroCartera;
	this.gridBagConstraintsParametroCartera.gridx = iXPanelCamposParametroCartera++;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroCartera.add(this.jPanelpor_lotesParametroCartera, this.gridBagConstraintsParametroCartera);



	if(iXPanelCamposParametroCartera % 1==0) {
		iXPanelCamposParametroCartera=0;
		iYPanelCamposParametroCartera++;
	}
	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCartera.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCartera.gridy = iYPanelCamposParametroCartera;
	this.gridBagConstraintsParametroCartera.gridx = iXPanelCamposParametroCartera++;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroCartera.add(this.jPanelid_empleadoParametroCartera, this.gridBagConstraintsParametroCartera);



	if(iXPanelCamposParametroCartera % 1==0) {
		iXPanelCamposParametroCartera=0;
		iYPanelCamposParametroCartera++;
	}
	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCartera.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCartera.gridy = iYPanelCamposParametroCartera;
	this.gridBagConstraintsParametroCartera.gridx = iXPanelCamposParametroCartera++;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroCartera.add(this.jPanelid_transaccion_deshabilitaParametroCartera, this.gridBagConstraintsParametroCartera);



	if(iXPanelCamposParametroCartera % 1==0) {
		iXPanelCamposParametroCartera=0;
		iYPanelCamposParametroCartera++;
	}
	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCartera.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCartera.gridy = iYPanelCamposParametroCartera;
	this.gridBagConstraintsParametroCartera.gridx = iXPanelCamposParametroCartera++;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroCartera.add(this.jPanelid_transaccion_habilitaParametroCartera, this.gridBagConstraintsParametroCartera);



	if(iXPanelCamposParametroCartera % 1==0) {
		iXPanelCamposParametroCartera=0;
		iYPanelCamposParametroCartera++;
	}
	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCartera.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCartera.gridy = iYPanelCamposParametroCartera;
	this.gridBagConstraintsParametroCartera.gridx = iXPanelCamposParametroCartera++;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroCartera.add(this.jPanelid_bodegaParametroCartera, this.gridBagConstraintsParametroCartera);



	if(iXPanelCamposParametroCartera % 1==0) {
		iXPanelCamposParametroCartera=0;
		iYPanelCamposParametroCartera++;
	}
	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCartera.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCartera.gridy = iYPanelCamposParametroCartera;
	this.gridBagConstraintsParametroCartera.gridx = iXPanelCamposParametroCartera++;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroCartera.add(this.jPanelid_tipo_facturaParametroCartera, this.gridBagConstraintsParametroCartera);



	if(iXPanelCamposParametroCartera % 1==0) {
		iXPanelCamposParametroCartera=0;
		iYPanelCamposParametroCartera++;
	}
	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCartera.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCartera.gridy = iYPanelCamposParametroCartera;
	this.gridBagConstraintsParametroCartera.gridx = iXPanelCamposParametroCartera++;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroCartera.add(this.jPanelid_tipo_auto_pagoParametroCartera, this.gridBagConstraintsParametroCartera);



	if(iXPanelCamposParametroCartera % 1==0) {
		iXPanelCamposParametroCartera=0;
		iYPanelCamposParametroCartera++;
	}
	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCartera.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCartera.gridy = iYPanelCamposParametroCartera;
	this.gridBagConstraintsParametroCartera.gridx = iXPanelCamposParametroCartera++;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroCartera.add(this.jPanelnumero_orden_pagoParametroCartera, this.gridBagConstraintsParametroCartera);



	if(iXPanelCamposParametroCartera % 1==0) {
		iXPanelCamposParametroCartera=0;
		iYPanelCamposParametroCartera++;
	}
	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCartera.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCartera.gridy = iYPanelCamposParametroCartera;
	this.gridBagConstraintsParametroCartera.gridx = iXPanelCamposParametroCartera++;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroCartera.add(this.jPanelid_cuenta_contable_credito_fiscalParametroCartera, this.gridBagConstraintsParametroCartera);



	if(iXPanelCamposParametroCartera % 1==0) {
		iXPanelCamposParametroCartera=0;
		iYPanelCamposParametroCartera++;
	}
	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCartera.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCartera.gridy = iYPanelCamposParametroCartera;
	this.gridBagConstraintsParametroCartera.gridx = iXPanelCamposParametroCartera++;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroCartera.add(this.jPaneldescripcionParametroCartera, this.gridBagConstraintsParametroCartera);



	if(iXPanelCamposParametroCartera % 1==0) {
		iXPanelCamposParametroCartera=0;
		iYPanelCamposParametroCartera++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCartera.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCartera.gridy = iYPanelCamposOcultosParametroCartera;
	this.gridBagConstraintsParametroCartera.gridx = iXPanelCamposOcultosParametroCartera++;
	this.gridBagConstraintsParametroCartera.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroCartera.add(this.jPanelid_empresaParametroCartera, this.gridBagConstraintsParametroCartera);



	if(iXPanelCamposOcultosParametroCartera % 1==0) {
		iXPanelCamposOcultosParametroCartera=0;
		iYPanelCamposOcultosParametroCartera++;
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
			
		GridBagLayout gridaBagLayoutAccionesParametroCartera= new GridBagLayout();
		this.jPanelAccionesParametroCartera.setLayout(gridaBagLayoutAccionesParametroCartera);
		
		GridBagLayout gridaBagLayoutAccionesFormularioParametroCartera= new GridBagLayout();
		this.jPanelAccionesFormularioParametroCartera.setLayout(gridaBagLayoutAccionesFormularioParametroCartera);
		
		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		this.gridBagConstraintsParametroCartera.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroCartera.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroCartera.add(this.jComboBoxTiposAccionesFormularioParametroCartera, this.gridBagConstraintsParametroCartera);

		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		this.gridBagConstraintsParametroCartera.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroCartera.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroCartera.add(this.jCheckBoxPostAccionNuevoParametroCartera, this.gridBagConstraintsParametroCartera);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.parametrocarteraSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
			this.gridBagConstraintsParametroCartera.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroCartera.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroCartera.add(this.jCheckBoxPostAccionSinCerrarParametroCartera, this.gridBagConstraintsParametroCartera);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.parametrocarteraSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.parametrocarteraSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
			this.gridBagConstraintsParametroCartera.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroCartera.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroCartera.add(this.jCheckBoxPostAccionSinMensajeParametroCartera, this.gridBagConstraintsParametroCartera);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroCartera.gridy = 0;
		this.gridBagConstraintsParametroCartera.gridx = iPosXAccion++;
			
		this.jPanelAccionesParametroCartera.add(this.jButtonModificarParametroCartera, this.gridBagConstraintsParametroCartera);							

		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroCartera.gridy = 0;
		this.gridBagConstraintsParametroCartera.gridx =iPosXAccion++;
			
		this.jPanelAccionesParametroCartera.add(this.jButtonEliminarParametroCartera, this.gridBagConstraintsParametroCartera);
		
			
		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		this.gridBagConstraintsParametroCartera.gridy = 0;		
		this.gridBagConstraintsParametroCartera.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroCartera.add(this.jButtonActualizarParametroCartera, this.gridBagConstraintsParametroCartera);


		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		this.gridBagConstraintsParametroCartera.gridy = 0;		
		this.gridBagConstraintsParametroCartera.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroCartera.add(this.jButtonGuardarCambiosParametroCartera, this.gridBagConstraintsParametroCartera);	
		
		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		this.gridBagConstraintsParametroCartera.gridy = 0;		
		this.gridBagConstraintsParametroCartera.gridx =iPosXAccion++;
		
		this.jPanelAccionesParametroCartera.add(this.jButtonCancelarParametroCartera, this.gridBagConstraintsParametroCartera);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroCartera = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroCartera);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();						
			this.gridBagConstraintsParametroCartera.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroCartera.gridx = 0;		
			//this.gridBagConstraintsParametroCartera.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCartera.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroCartera.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		this.gridBagConstraintsParametroCartera.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroCartera.gridx =0;
		this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroCartera.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroCartera, this.gridBagConstraintsParametroCartera);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ParametroCarteraJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleParametroCartera = new ParametroCarteraBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Parametro Cartera DATOS");
			
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
			
	        //this.setTitle("[FOR] - Parametro Cartera DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Cartera Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ParametroCarteraModel parametrocarteraModel=new ParametroCarteraModel(this);
			
			//SI USARA CLASE INTERNA
			//ParametroCarteraModel.ParametroCarteraFocusTraversalPolicy parametrocarteraFocusTraversalPolicy = parametrocarteraModel.new ParametroCarteraFocusTraversalPolicy(this);
			
			//parametrocarteraFocusTraversalPolicy.setparametrocarteraJInternalFrame(this);
			
			this.setFocusTraversalPolicy(parametrocarteraModel);
			
			
			this.jContentPaneDetalleParametroCartera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleParametroCartera = new GridBagLayout();	
			this.jContentPaneDetalleParametroCartera.setLayout(gridaBagLayoutDetalleParametroCartera);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroCartera = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsParametroCartera = new GridBagConstraints();
				this.gridBagConstraintsParametroCartera.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsParametroCartera.gridx = 0;
					
				
				this.jContentPaneDetalleParametroCartera.add(jTtoolBarDetalleParametroCartera, gridBagConstraintsParametroCartera);								
				
}
			
			this.jScrollPanelDatosEdicionParametroCartera=   new JScrollPane(jContentPaneDetalleParametroCartera,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroCartera.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroCartera.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroCartera.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralParametroCartera=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroCartera.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroCartera.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroCartera.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
			
			
	        this.gridBagConstraintsParametroCartera.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsParametroCartera.gridx = 0;
	        
			this.jContentPaneDetalleParametroCartera.add(jPanelCamposParametroCartera, gridBagConstraintsParametroCartera);
			
			
			
			
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
						&& parametrocarteraSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.parametrocarteraSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsParametroCartera= new GridBagConstraints();
						this.gridBagConstraintsParametroCartera.gridy = iGridyRelaciones++;
						this.gridBagConstraintsParametroCartera.gridx = 0;
						this.jContentPaneDetalleParametroCartera.add(this.jTabbedPaneRelacionesParametroCartera, this.gridBagConstraintsParametroCartera);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesParametroCartera.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosParametroCartera.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsParametroCartera = new GridBagConstraints();
					this.gridBagConstraintsParametroCartera.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsParametroCartera.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsParametroCartera.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsParametroCartera.gridx = 0;
					
				
					this.jContentPaneDetalleParametroCartera.add(jPanelCamposOcultosParametroCartera, gridBagConstraintsParametroCartera);
				
					this.jPanelCamposOcultosParametroCartera.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
			this.gridBagConstraintsParametroCartera.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsParametroCartera.gridx = 0;
	        this.gridBagConstraintsParametroCartera.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleParametroCartera.add(this.jPanelAccionesFormularioParametroCartera, this.gridBagConstraintsParametroCartera);							
			
			
			
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
	        this.gridBagConstraintsParametroCartera.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsParametroCartera.gridx = 0;
	        
			
			this.jContentPaneDetalleParametroCartera.add(this.jPanelAccionesParametroCartera, this.gridBagConstraintsParametroCartera);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionParametroCartera);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionParametroCartera=   new JScrollPane(this.jPanelCamposParametroCartera,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroCartera.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroCartera.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroCartera.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
			this.gridBagConstraintsParametroCartera.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsParametroCartera.gridx = 0;
			this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsParametroCartera.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsParametroCartera.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionParametroCartera, this.gridBagConstraintsParametroCartera);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
			this.gridBagConstraintsParametroCartera.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroCartera.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioParametroCartera, this.gridBagConstraintsParametroCartera);			
			
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
			this.gridBagConstraintsParametroCartera.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroCartera.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesParametroCartera, this.gridBagConstraintsParametroCartera);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		this.gridBagConstraintsParametroCartera.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroCartera.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroCartera, this.gridBagConstraintsParametroCartera);
			
			
		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		this.gridBagConstraintsParametroCartera.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroCartera.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroCartera, this.gridBagConstraintsParametroCartera);
		
			
		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		this.gridBagConstraintsParametroCartera.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroCartera.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroCartera, this.gridBagConstraintsParametroCartera);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralParametroCartera;//jContentPane;
		
		return jScrollPanelDatosEdicionParametroCartera;
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
