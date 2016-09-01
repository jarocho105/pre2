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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.tesoreria.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.util.TransaccionConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.*;
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
public class TransaccionDetalleFormJInternalFrame extends TransaccionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTransaccion;
	
	protected JMenuBar jmenuBarDetalleTransaccion;
	
	protected JMenu jmenuDetalleTransaccion;
	protected JMenu jmenuDetalleArchivoTransaccion;
	protected JMenu jmenuDetalleAccionesTransaccion;
	protected JMenu jmenuDetalleDatosTransaccion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTransaccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTransaccion;	
	protected GridBagConstraints gridBagConstraintsTransaccion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TransaccionBeanSwingJInternalFrameAdditional jInternalFrameDetalleTransaccion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TipoTransaBeanSwingJInternalFrame tipotransaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransa="";

	protected TipoComprobanteBeanSwingJInternalFrame tipocomprobanteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocomprobante="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencion="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";
	
	public TransaccionSessionBean transaccionSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TipoTransaSessionBean tipotransaSessionBean;
	public TipoComprobanteSessionBean tipocomprobanteSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;
	public TipoRetencionSessionBean tiporetencionSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;	
	
	public TransaccionLogic transaccionLogic;
	
	public JScrollPane jScrollPanelDatosTransaccion;
	public JScrollPane jScrollPanelDatosEdicionTransaccion;
	public JScrollPane jScrollPanelDatosGeneralTransaccion;
	
	protected JPanel jPanelCamposTransaccion;    
	protected JPanel jPanelCamposOcultosTransaccion;    	
	protected JPanel jPanelAccionesTransaccion;
	protected JPanel jPanelAccionesFormularioTransaccion;
    
	
	
	protected Integer iXPanelCamposTransaccion=0;
	protected Integer iYPanelCamposTransaccion=0;
	
	protected Integer iXPanelCamposOcultosTransaccion=0;
	protected Integer iYPanelCamposOcultosTransaccion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTransaccion;
	public JButton jButtonModificarTransaccion;
	public JButton jButtonActualizarTransaccion;
    public JButton jButtonEliminarTransaccion;
	public JButton jButtonCancelarTransaccion;
    public JButton jButtonGuardarCambiosTransaccion;
	public JButton jButtonGuardarCambiosTablaTransaccion;
	protected JButton jButtonCerrarTransaccion;
	
	
	protected JButton jButtonProcesarInformacionTransaccion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTransaccion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTransaccion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTransaccion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTransaccion;
	protected JButton jButtonModificarToolBarTransaccion;
	protected JButton jButtonActualizarToolBarTransaccion;
    protected JButton jButtonEliminarToolBarTransaccion;
	protected JButton jButtonCancelarToolBarTransaccion;
    protected JButton jButtonGuardarCambiosToolBarTransaccion;
	protected JButton jButtonGuardarCambiosTablaToolBarTransaccion;
	protected JButton jButtonMostrarOcultarTablaToolBarTransaccion;
	protected JButton jButtonCerrarToolBarTransaccion;
	
	protected JButton jButtonProcesarInformacionToolBarTransaccion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTransaccion;
	protected JMenuItem jMenuItemModificarTransaccion;
	protected JMenuItem jMenuItemActualizarTransaccion;
    protected JMenuItem jMenuItemEliminarTransaccion;
	protected JMenuItem jMenuItemCancelarTransaccion;
    protected JMenuItem jMenuItemGuardarCambiosTransaccion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTransaccion;
	protected JMenuItem jMenuItemCerrarTransaccion;
	protected JMenuItem jMenuItemDetalleCerrarTransaccion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTransaccion;
	
	protected JMenuItem jMenuItemProcesarInformacionTransaccion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTransaccion;
	protected JMenuItem jMenuItemMostrarOcultarTransaccion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTransaccion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTransaccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTransaccion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTransaccion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTransaccion;
	public JLabel jLabelIdTransaccion;
	public JLabel jLabelidTransaccion;
	public JButton jButtonidTransaccionBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTransaccion;
	public JLabel jLabelcodigoTransaccion;
	public JTextField jTextFieldcodigoTransaccion;
	public JButton jButtoncodigoTransaccionBusqueda= new JButtonMe();

	public JPanel jPanelnombreTransaccion;
	public JLabel jLabelnombreTransaccion;
	public JTextArea jTextAreanombreTransaccion;
	public JScrollPane jscrollPanenombreTransaccion;
	public JButton jButtonnombreTransaccionBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionTransaccion;
	public JLabel jLabeldescripcionTransaccion;
	public JTextArea jTextAreadescripcionTransaccion;
	public JScrollPane jscrollPanedescripcionTransaccion;
	public JButton jButtondescripcionTransaccionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTransaccion;
	public JLabel jLabelid_empresaTransaccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTransaccion;
	public JButton jButtonid_empresaTransaccion= new JButtonMe();
	public JButton jButtonid_empresaTransaccionUpdate= new JButtonMe();
	public JButton jButtonid_empresaTransaccionBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalTransaccion;
	public JLabel jLabelid_sucursalTransaccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalTransaccion;
	public JButton jButtonid_sucursalTransaccion= new JButtonMe();
	public JButton jButtonid_sucursalTransaccionUpdate= new JButtonMe();
	public JButton jButtonid_sucursalTransaccionBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloTransaccion;
	public JLabel jLabelid_moduloTransaccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloTransaccion;
	public JButton jButtonid_moduloTransaccion= new JButtonMe();
	public JButton jButtonid_moduloTransaccionUpdate= new JButtonMe();
	public JButton jButtonid_moduloTransaccionBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_transaTransaccion;
	public JLabel jLabelid_tipo_transaTransaccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaTransaccion;
	public JButton jButtonid_tipo_transaTransaccion= new JButtonMe();
	public JButton jButtonid_tipo_transaTransaccionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaTransaccionBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_comprobanteTransaccion;
	public JLabel jLabelid_tipo_comprobanteTransaccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_comprobanteTransaccion;
	public JButton jButtonid_tipo_comprobanteTransaccion= new JButtonMe();
	public JButton jButtonid_tipo_comprobanteTransaccionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_comprobanteTransaccionBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_transaccion_moduloTransaccion;
	public JLabel jLabelid_tipo_transaccion_moduloTransaccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaccion_moduloTransaccion;
	public JButton jButtonid_tipo_transaccion_moduloTransaccion= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloTransaccionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloTransaccionBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_retencionTransaccion;
	public JLabel jLabelid_tipo_retencionTransaccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencionTransaccion;
	public JButton jButtonid_tipo_retencionTransaccion= new JButtonMe();
	public JButton jButtonid_tipo_retencionTransaccionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencionTransaccionBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contableTransaccion;
	public JLabel jLabelid_cuenta_contableTransaccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableTransaccion;
	public JButton jButtonid_cuenta_contableTransaccion= new JButtonMe();
	public JButton jButtonid_cuenta_contableTransaccionUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableTransaccionBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableTransaccionArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTransaccion;
	
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
	public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TransaccionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTransaccion=new JPanel();
				this.jPanelAccionesFormularioTransaccion=new JPanel();
				this.jmenuBarDetalleTransaccion=new JMenuBar();
				this.jTtoolBarDetalleTransaccion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Transaccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TransaccionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Transaccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Transaccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Transaccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Transaccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTransaccion() {
		return this.jButtonActualizarToolBarTransaccion;
	}
	
	public JButton getjButtonEliminarToolBarTransaccion() {
		return this.jButtonEliminarToolBarTransaccion;
	}
	
	public JButton getjButtonCancelarToolBarTransaccion() {
		return this.jButtonCancelarToolBarTransaccion;
	}		
	
	public JButton getjButtonProcesarInformacionTransaccion() {
		return this.jButtonProcesarInformacionTransaccion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTransaccion)	{
		this.jButtonProcesarInformacionTransaccion = jButtonProcesarInformacionTransaccion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTransaccion() {
		return this.jComboBoxTiposAccionesTransaccion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTransaccion(
			JComboBox jComboBoxTiposRelacionesTransaccion) {
		this.jComboBoxTiposRelacionesTransaccion = jComboBoxTiposRelacionesTransaccion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTransaccion(
			JComboBox jComboBoxTiposAccionesTransaccion) {
		this.jComboBoxTiposAccionesTransaccion = jComboBoxTiposAccionesTransaccion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTransaccion() {
		return this.jComboBoxTiposAccionesFormularioTransaccion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTransaccion(
			JComboBox jComboBoxTiposAccionesFormularioTransaccion) {
		this.jComboBoxTiposAccionesFormularioTransaccion = jComboBoxTiposAccionesFormularioTransaccion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.transaccionSessionBean=new TransaccionSessionBean();
		
		this.transaccionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.transaccionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.transaccionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TransaccionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TransaccionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TransaccionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Transaccion MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.transaccionSessionBean.getEsGuardarRelacionado()) {
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
	
		TransaccionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTransaccion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTransaccion=new JButtonMe();
				this.jButtonModificarToolBarTransaccion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTransaccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTransaccion,this.jTtoolBarDetalleTransaccion,
							"actualizar","actualizar","Actualizar"+" "+TransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTransaccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTransaccion,this.jTtoolBarDetalleTransaccion,
							"eliminar","eliminar","Eliminar"+" "+TransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTransaccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTransaccion,this.jTtoolBarDetalleTransaccion,
							"cancelar","cancelar","Cancelar"+" "+TransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTransaccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTransaccion,this.jTtoolBarDetalleTransaccion,
							"guardarcambios","guardarcambios","Guardar"+" "+TransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTransaccion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTransaccion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTransaccion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTransaccion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTransaccion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTransaccion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTransaccion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTransaccion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTransaccion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTransaccion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTransaccion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTransaccion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTransaccion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTransaccion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTransaccion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTransaccion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTransaccion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTransaccion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTransaccion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTransaccion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTransaccion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTransaccion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTransaccion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTransaccion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTransaccion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTransaccion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTransaccion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTransaccion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTransaccion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTransaccion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTransaccion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTransaccion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTransaccion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTransaccion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTransaccion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTransaccion.add(this.jMenuItemDetalleCerrarTransaccion);
		
		this.jmenuDetalleAccionesTransaccion.add(this.jMenuItemActualizarTransaccion);
		this.jmenuDetalleAccionesTransaccion.add(this.jMenuItemEliminarTransaccion);
		this.jmenuDetalleAccionesTransaccion.add(this.jMenuItemCancelarTransaccion);		
		
		//this.jmenuDetalleDatosTransaccion.add(this.jMenuItemDetalleAbrirOrderByTransaccion);				
		this.jmenuDetalleDatosTransaccion.add(this.jMenuItemDetalleMostarOcultarTransaccion);				
				
		//this.jmenuDetalleAccionesTransaccion.add(this.jMenuItemGuardarCambiosTransaccion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTransaccion.add(this.jmenuDetalleArchivoTransaccion);		
		this.jmenuBarDetalleTransaccion.add(this.jmenuDetalleAccionesTransaccion);		
		this.jmenuBarDetalleTransaccion.add(this.jmenuDetalleDatosTransaccion);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTransaccion);				
	}
	
	
	public void inicializarElementosCamposTransaccion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTransaccion = new JLabelMe();
		jLabelIdTransaccion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTransaccion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTransaccion.setToolTipText(TransaccionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTransaccion= new GridBagLayout();

		this.jPanelidTransaccion.setLayout(this.gridaBagLayoutTransaccion);

		jLabelidTransaccion = new JLabel();
		jLabelidTransaccion.setText("Id");

		jLabelidTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTransaccion = new JLabelMe();
		this.jLabelcodigoTransaccion.setText(""+TransaccionConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTransaccion.setToolTipText("Codigo");
		this.jLabelcodigoTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTransaccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTransaccion.setToolTipText(TransaccionConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTransaccion = new GridBagLayout();
		this.jPanelcodigoTransaccion.setLayout(this.gridaBagLayoutTransaccion);


		jTextFieldcodigoTransaccion= new JTextFieldMe();

		jTextFieldcodigoTransaccion.setEnabled(false);
		jTextFieldcodigoTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTransaccionBusqueda= new JButtonMe();
		this.jButtoncodigoTransaccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTransaccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTransaccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTransaccionBusqueda.setText("U");
		this.jButtoncodigoTransaccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTransaccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTransaccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTransaccionBusqueda"));

		if(this.transaccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTransaccionBusqueda.setVisible(false);		}


					
		this.jLabelnombreTransaccion = new JLabelMe();
		this.jLabelnombreTransaccion.setText(""+TransaccionConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTransaccion.setToolTipText("Nombre");
		this.jLabelnombreTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTransaccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTransaccion.setToolTipText(TransaccionConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTransaccion = new GridBagLayout();
		this.jPanelnombreTransaccion.setLayout(this.gridaBagLayoutTransaccion);


		jTextAreanombreTransaccion= new JTextAreaMe();
		jTextAreanombreTransaccion.setEnabled(false);
		jTextAreanombreTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTransaccion.setLineWrap(true);
		jTextAreanombreTransaccion.setWrapStyleWord(true);
		jTextAreanombreTransaccion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTransaccion.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTransaccion = new JScrollPane(jTextAreanombreTransaccion);
		jscrollPanenombreTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));
		jscrollPanenombreTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));
		jscrollPanenombreTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));

		this.jButtonnombreTransaccionBusqueda= new JButtonMe();
		this.jButtonnombreTransaccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTransaccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTransaccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTransaccionBusqueda.setText("U");
		this.jButtonnombreTransaccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTransaccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTransaccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTransaccionBusqueda"));

		if(this.transaccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTransaccionBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionTransaccion = new JLabelMe();
		this.jLabeldescripcionTransaccion.setText(""+TransaccionConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionTransaccion.setToolTipText("Descripcion");
		this.jLabeldescripcionTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionTransaccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionTransaccion.setToolTipText(TransaccionConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutTransaccion = new GridBagLayout();
		this.jPaneldescripcionTransaccion.setLayout(this.gridaBagLayoutTransaccion);


		jTextAreadescripcionTransaccion= new JTextAreaMe();
		jTextAreadescripcionTransaccion.setEnabled(false);
		jTextAreadescripcionTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTransaccion.setLineWrap(true);
		jTextAreadescripcionTransaccion.setWrapStyleWord(true);
		jTextAreadescripcionTransaccion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionTransaccion.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionTransaccion = new JScrollPane(jTextAreadescripcionTransaccion);
		jscrollPanedescripcionTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionTransaccionBusqueda= new JButtonMe();
		this.jButtondescripcionTransaccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTransaccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTransaccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionTransaccionBusqueda.setText("U");
		this.jButtondescripcionTransaccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionTransaccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionTransaccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionTransaccionBusqueda"));

		if(this.transaccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionTransaccionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTransaccion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTransaccion = new JLabelMe();
		this.jLabelid_empresaTransaccion.setText(""+TransaccionConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTransaccion.setToolTipText("Empresa");
		this.jLabelid_empresaTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTransaccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTransaccion.setToolTipText(TransaccionConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTransaccion = new GridBagLayout();
		this.jPanelid_empresaTransaccion.setLayout(this.gridaBagLayoutTransaccion);


		jComboBoxid_empresaTransaccion= new JComboBoxMe();
		jComboBoxid_empresaTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTransaccion.setEnabled(false);

		this.jButtonid_empresaTransaccion= new JButtonMe();
		this.jButtonid_empresaTransaccion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTransaccion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTransaccion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTransaccion.setText("Buscar");
		this.jButtonid_empresaTransaccion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTransaccion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTransaccion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTransaccion"));

		this.jButtonid_empresaTransaccionBusqueda= new JButtonMe();
		this.jButtonid_empresaTransaccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransaccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransaccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTransaccionBusqueda.setText("U");
		this.jButtonid_empresaTransaccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTransaccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTransaccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTransaccionBusqueda"));

		if(this.transaccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTransaccionBusqueda.setVisible(false);		}

		this.jButtonid_empresaTransaccionUpdate= new JButtonMe();
		this.jButtonid_empresaTransaccionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransaccionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransaccionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTransaccionUpdate.setText("U");
		this.jButtonid_empresaTransaccionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTransaccionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTransaccionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTransaccionUpdate"));



					
		this.jLabelid_sucursalTransaccion = new JLabelMe();
		this.jLabelid_sucursalTransaccion.setText(""+TransaccionConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalTransaccion.setToolTipText("Sucursal");
		this.jLabelid_sucursalTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalTransaccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalTransaccion.setToolTipText(TransaccionConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutTransaccion = new GridBagLayout();
		this.jPanelid_sucursalTransaccion.setLayout(this.gridaBagLayoutTransaccion);


		jComboBoxid_sucursalTransaccion= new JComboBoxMe();
		jComboBoxid_sucursalTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalTransaccion.setEnabled(false);

		this.jButtonid_sucursalTransaccion= new JButtonMe();
		this.jButtonid_sucursalTransaccion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTransaccion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTransaccion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTransaccion.setText("Buscar");
		this.jButtonid_sucursalTransaccion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalTransaccion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTransaccion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTransaccion"));

		this.jButtonid_sucursalTransaccionBusqueda= new JButtonMe();
		this.jButtonid_sucursalTransaccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTransaccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTransaccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalTransaccionBusqueda.setText("U");
		this.jButtonid_sucursalTransaccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalTransaccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTransaccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTransaccionBusqueda"));

		if(this.transaccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalTransaccionBusqueda.setVisible(false);		}

		this.jButtonid_sucursalTransaccionUpdate= new JButtonMe();
		this.jButtonid_sucursalTransaccionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTransaccionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTransaccionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalTransaccionUpdate.setText("U");
		this.jButtonid_sucursalTransaccionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalTransaccionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTransaccionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTransaccionUpdate"));



					
		this.jLabelid_moduloTransaccion = new JLabelMe();
		this.jLabelid_moduloTransaccion.setText(""+TransaccionConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloTransaccion.setToolTipText("Modulo");
		this.jLabelid_moduloTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloTransaccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloTransaccion.setToolTipText(TransaccionConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutTransaccion = new GridBagLayout();
		this.jPanelid_moduloTransaccion.setLayout(this.gridaBagLayoutTransaccion);


		jComboBoxid_moduloTransaccion= new JComboBoxMe();
		jComboBoxid_moduloTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_moduloTransaccion.setEnabled(false);

		this.jButtonid_moduloTransaccion= new JButtonMe();
		this.jButtonid_moduloTransaccion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloTransaccion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloTransaccion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloTransaccion.setText("Buscar");
		this.jButtonid_moduloTransaccion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloTransaccion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloTransaccion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloTransaccion"));

		this.jButtonid_moduloTransaccionBusqueda= new JButtonMe();
		this.jButtonid_moduloTransaccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTransaccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTransaccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloTransaccionBusqueda.setText("U");
		this.jButtonid_moduloTransaccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloTransaccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloTransaccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloTransaccionBusqueda"));

		if(this.transaccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloTransaccionBusqueda.setVisible(false);		}

		this.jButtonid_moduloTransaccionUpdate= new JButtonMe();
		this.jButtonid_moduloTransaccionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTransaccionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTransaccionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloTransaccionUpdate.setText("U");
		this.jButtonid_moduloTransaccionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloTransaccionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloTransaccionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloTransaccionUpdate"));



					
		this.jLabelid_tipo_transaTransaccion = new JLabelMe();
		this.jLabelid_tipo_transaTransaccion.setText(""+TransaccionConstantesFunciones.LABEL_IDTIPOTRANSA+" : *");
		this.jLabelid_tipo_transaTransaccion.setToolTipText("Movimiento");
		this.jLabelid_tipo_transaTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_transaTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_transaTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_transaTransaccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_transaTransaccion.setToolTipText(TransaccionConstantesFunciones.LABEL_IDTIPOTRANSA);
		this.gridaBagLayoutTransaccion = new GridBagLayout();
		this.jPanelid_tipo_transaTransaccion.setLayout(this.gridaBagLayoutTransaccion);


		jComboBoxid_tipo_transaTransaccion= new JComboBoxMe();
		jComboBoxid_tipo_transaTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_transaTransaccion= new JButtonMe();
		this.jButtonid_tipo_transaTransaccion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaTransaccion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaTransaccion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaTransaccion.setText("Buscar");
		this.jButtonid_tipo_transaTransaccion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_transaTransaccion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaTransaccion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_transaTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaTransaccion"));

		this.jButtonid_tipo_transaTransaccionBusqueda= new JButtonMe();
		this.jButtonid_tipo_transaTransaccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaTransaccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaTransaccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaTransaccionBusqueda.setText("U");
		this.jButtonid_tipo_transaTransaccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_transaTransaccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaTransaccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_transaTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaTransaccionBusqueda"));

		if(this.transaccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_transaTransaccionBusqueda.setVisible(false);		}

		this.jButtonid_tipo_transaTransaccionUpdate= new JButtonMe();
		this.jButtonid_tipo_transaTransaccionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaTransaccionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaTransaccionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaTransaccionUpdate.setText("U");
		this.jButtonid_tipo_transaTransaccionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_transaTransaccionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaTransaccionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_transaTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaTransaccionUpdate"));



					
		this.jLabelid_tipo_comprobanteTransaccion = new JLabelMe();
		this.jLabelid_tipo_comprobanteTransaccion.setText(""+TransaccionConstantesFunciones.LABEL_IDTIPOCOMPROBANTE+" : *");
		this.jLabelid_tipo_comprobanteTransaccion.setToolTipText("Tipo Compr.");
		this.jLabelid_tipo_comprobanteTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_comprobanteTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_comprobanteTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_comprobanteTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_comprobanteTransaccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_comprobanteTransaccion.setToolTipText(TransaccionConstantesFunciones.LABEL_IDTIPOCOMPROBANTE);
		this.gridaBagLayoutTransaccion = new GridBagLayout();
		this.jPanelid_tipo_comprobanteTransaccion.setLayout(this.gridaBagLayoutTransaccion);


		jComboBoxid_tipo_comprobanteTransaccion= new JComboBoxMe();
		jComboBoxid_tipo_comprobanteTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_comprobanteTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_comprobanteTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_comprobanteTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_comprobanteTransaccion= new JButtonMe();
		this.jButtonid_tipo_comprobanteTransaccion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_comprobanteTransaccion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_comprobanteTransaccion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_comprobanteTransaccion.setText("Buscar");
		this.jButtonid_tipo_comprobanteTransaccion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_comprobanteTransaccion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_comprobanteTransaccion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_comprobanteTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_comprobanteTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_comprobanteTransaccion"));

		this.jButtonid_tipo_comprobanteTransaccionBusqueda= new JButtonMe();
		this.jButtonid_tipo_comprobanteTransaccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_comprobanteTransaccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_comprobanteTransaccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_comprobanteTransaccionBusqueda.setText("U");
		this.jButtonid_tipo_comprobanteTransaccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_comprobanteTransaccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_comprobanteTransaccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_comprobanteTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_comprobanteTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_comprobanteTransaccionBusqueda"));

		if(this.transaccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_comprobanteTransaccionBusqueda.setVisible(false);		}

		this.jButtonid_tipo_comprobanteTransaccionUpdate= new JButtonMe();
		this.jButtonid_tipo_comprobanteTransaccionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_comprobanteTransaccionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_comprobanteTransaccionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_comprobanteTransaccionUpdate.setText("U");
		this.jButtonid_tipo_comprobanteTransaccionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_comprobanteTransaccionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_comprobanteTransaccionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_comprobanteTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_comprobanteTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_comprobanteTransaccionUpdate"));



					
		this.jLabelid_tipo_transaccion_moduloTransaccion = new JLabelMe();
		this.jLabelid_tipo_transaccion_moduloTransaccion.setText(""+TransaccionConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO+" : *");
		this.jLabelid_tipo_transaccion_moduloTransaccion.setToolTipText("Tipo Transaccion Modulo");
		this.jLabelid_tipo_transaccion_moduloTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_transaccion_moduloTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_transaccion_moduloTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaccion_moduloTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_transaccion_moduloTransaccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_transaccion_moduloTransaccion.setToolTipText(TransaccionConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO);
		this.gridaBagLayoutTransaccion = new GridBagLayout();
		this.jPanelid_tipo_transaccion_moduloTransaccion.setLayout(this.gridaBagLayoutTransaccion);


		jComboBoxid_tipo_transaccion_moduloTransaccion= new JComboBoxMe();
		jComboBoxid_tipo_transaccion_moduloTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaccion_moduloTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_transaccion_moduloTransaccion.setEnabled(false);

		this.jButtonid_tipo_transaccion_moduloTransaccion= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloTransaccion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloTransaccion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloTransaccion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloTransaccion.setText("Buscar");
		this.jButtonid_tipo_transaccion_moduloTransaccion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_transaccion_moduloTransaccion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloTransaccion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_transaccion_moduloTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloTransaccion"));

		this.jButtonid_tipo_transaccion_moduloTransaccionBusqueda= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloTransaccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloTransaccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloTransaccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloTransaccionBusqueda.setText("U");
		this.jButtonid_tipo_transaccion_moduloTransaccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_transaccion_moduloTransaccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloTransaccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_transaccion_moduloTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloTransaccionBusqueda"));

		if(this.transaccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_transaccion_moduloTransaccionBusqueda.setVisible(false);		}

		this.jButtonid_tipo_transaccion_moduloTransaccionUpdate= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloTransaccionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloTransaccionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloTransaccionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloTransaccionUpdate.setText("U");
		this.jButtonid_tipo_transaccion_moduloTransaccionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_transaccion_moduloTransaccionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloTransaccionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_transaccion_moduloTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloTransaccionUpdate"));



					
		this.jLabelid_tipo_retencionTransaccion = new JLabelMe();
		this.jLabelid_tipo_retencionTransaccion.setText(""+TransaccionConstantesFunciones.LABEL_IDTIPORETENCION+" : *");
		this.jLabelid_tipo_retencionTransaccion.setToolTipText("Tipo Retencion");
		this.jLabelid_tipo_retencionTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_retencionTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_retencionTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencionTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_retencionTransaccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_retencionTransaccion.setToolTipText(TransaccionConstantesFunciones.LABEL_IDTIPORETENCION);
		this.gridaBagLayoutTransaccion = new GridBagLayout();
		this.jPanelid_tipo_retencionTransaccion.setLayout(this.gridaBagLayoutTransaccion);


		jComboBoxid_tipo_retencionTransaccion= new JComboBoxMe();
		jComboBoxid_tipo_retencionTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencionTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_retencionTransaccion= new JButtonMe();
		this.jButtonid_tipo_retencionTransaccion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencionTransaccion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencionTransaccion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencionTransaccion.setText("Buscar");
		this.jButtonid_tipo_retencionTransaccion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_retencionTransaccion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencionTransaccion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_retencionTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencionTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencionTransaccion"));

		this.jButtonid_tipo_retencionTransaccionBusqueda= new JButtonMe();
		this.jButtonid_tipo_retencionTransaccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionTransaccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionTransaccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencionTransaccionBusqueda.setText("U");
		this.jButtonid_tipo_retencionTransaccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_retencionTransaccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencionTransaccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_retencionTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencionTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencionTransaccionBusqueda"));

		if(this.transaccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_retencionTransaccionBusqueda.setVisible(false);		}

		this.jButtonid_tipo_retencionTransaccionUpdate= new JButtonMe();
		this.jButtonid_tipo_retencionTransaccionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionTransaccionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionTransaccionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencionTransaccionUpdate.setText("U");
		this.jButtonid_tipo_retencionTransaccionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_retencionTransaccionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencionTransaccionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_retencionTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencionTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencionTransaccionUpdate"));



					
		this.jLabelid_cuenta_contableTransaccion = new JLabelMe();
		this.jLabelid_cuenta_contableTransaccion.setText(""+TransaccionConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableTransaccion.setToolTipText("Cuenta C.");
		this.jLabelid_cuenta_contableTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_contableTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_contableTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableTransaccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableTransaccion.setToolTipText(TransaccionConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutTransaccion = new GridBagLayout();
		this.jPanelid_cuenta_contableTransaccion.setLayout(this.gridaBagLayoutTransaccion);


		jComboBoxid_cuenta_contableTransaccion= new JComboBoxMe();
		jComboBoxid_cuenta_contableTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableTransaccion= new JButtonMe();
		this.jButtonid_cuenta_contableTransaccion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableTransaccion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableTransaccion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableTransaccion.setText("Buscar");
		this.jButtonid_cuenta_contableTransaccion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableTransaccion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableTransaccion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableTransaccion"));

		this.jButtonid_cuenta_contableTransaccionBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableTransaccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableTransaccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableTransaccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableTransaccionBusqueda.setText("U");
		this.jButtonid_cuenta_contableTransaccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableTransaccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableTransaccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableTransaccionBusqueda"));

		if(this.transaccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableTransaccionBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableTransaccionUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableTransaccionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableTransaccionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableTransaccionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableTransaccionUpdate.setText("U");
		this.jButtonid_cuenta_contableTransaccionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableTransaccionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableTransaccionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableTransaccionUpdate"));


		jButtonid_cuenta_contableTransaccionArbol= new JButtonMe();
		jButtonid_cuenta_contableTransaccionArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableTransaccionArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableTransaccionArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableTransaccionArbol.setText("Arbol");
		jButtonid_cuenta_contableTransaccionArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contableTransaccionArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableTransaccionArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contableTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableTransaccionArbol"));



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
		//this.jInternalFrameDetalleTransaccion = new TransaccionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Transaccion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTransaccion= new GridBagLayout();
		

		
		String sToolTipTransaccion="";
		sToolTipTransaccion=TransaccionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTransaccion+="(Tesoreria.Transaccion)";
		}
		
		if(!this.transaccionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTransaccion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTransaccion = new JButtonMe();
		this.jButtonModificarTransaccion = new JButtonMe();
        this.jButtonActualizarTransaccion = new JButtonMe();
        this.jButtonEliminarTransaccion = new JButtonMe();
        this.jButtonCancelarTransaccion = new JButtonMe();
        this.jButtonGuardarCambiosTransaccion = new JButtonMe();
		this.jButtonGuardarCambiosTablaTransaccion = new JButtonMe();
		this.jButtonCerrarTransaccion = new JButtonMe();
		
		this.jScrollPanelDatosTransaccion = new JScrollPane();   
        this.jScrollPanelDatosEdicionTransaccion = new JScrollPane();
		this.jScrollPanelDatosGeneralTransaccion = new JScrollPane();
				
		
		
		this.jPanelCamposTransaccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTransaccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTransaccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTransaccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Transaccion";
		
		if(!this.transaccionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transacciones" + this.sPath));
		} else {
			this.jScrollPanelDatosTransaccion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTransaccion.setName("jPanelCamposTransaccion"); 

		this.jPanelCamposOcultosTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTransaccion.setName("jPanelCamposOcultosTransaccion"); 

        this.jPanelAccionesTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTransaccion.setToolTipText("Acciones");
        this.jPanelAccionesTransaccion.setName("Acciones"); 

		this.jPanelAccionesFormularioTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTransaccion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTransaccion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTransaccion.setText("Nuevo");
		this.jButtonModificarTransaccion.setText("Editar");
        this.jButtonActualizarTransaccion.setText("Actualizar");
        this.jButtonEliminarTransaccion.setText("Eliminar");
        this.jButtonCancelarTransaccion.setText("Cancelar");
        this.jButtonGuardarCambiosTransaccion.setText("Guardar");
		this.jButtonGuardarCambiosTablaTransaccion.setText("Guardar");
		this.jButtonCerrarTransaccion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTransaccion,"nuevo_button","Nuevo",this.transaccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTransaccion,"modificar_button","Editar",this.transaccionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTransaccion,"actualizar_button","Actualizar",this.transaccionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTransaccion,"eliminar_button","Eliminar",this.transaccionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTransaccion,"cancelar_button","Cancelar",this.transaccionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTransaccion,"guardarcambios_button","Guardar",this.transaccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTransaccion,"guardarcambiostabla_button","Guardar",this.transaccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTransaccion,"cerrar_button","Salir",this.transaccionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTransaccion.setToolTipText("Nuevo"+" "+TransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTransaccion.setToolTipText("Editar"+" "+TransaccionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTransaccion.setToolTipText("Actualizar"+" "+TransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTransaccion.setToolTipText("Eliminar)"+" "+TransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTransaccion.setToolTipText("Cancelar"+" "+TransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTransaccion.setToolTipText("Guardar"+" "+TransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTransaccion.setToolTipText("Guardar"+" "+TransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTransaccion.setToolTipText("Salir"+" "+TransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTransaccion";
		inputMap = this.jButtonNuevoTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTransaccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTransaccion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTransaccion";
		inputMap = this.jButtonActualizarTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTransaccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTransaccion"));
		
		//ELIMINAR
		sMapKey = "EliminarTransaccion";
		inputMap = this.jButtonEliminarTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTransaccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTransaccion"));
		
		//CANCELAR	
		sMapKey = "CancelarTransaccion";
		inputMap = this.jButtonCancelarTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTransaccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTransaccion"));
		
		//CERRAR		
		sMapKey = "CerrarTransaccion";
		inputMap = this.jButtonCerrarTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTransaccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTransaccion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTransaccion";
		inputMap = this.jButtonGuardarCambiosTablaTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTransaccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTransaccion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTransaccion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTransaccion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTransaccion.setToolTipText("Nuevo Transaccion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTransaccion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTransaccion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTransaccion.setToolTipText("Sin Cerrar Ventana Transaccion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTransaccion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTransaccion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTransaccion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTransaccion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTransaccion.setText("Accion");
		this.jComboBoxTiposAccionesTransaccion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTransaccion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTransaccion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTransaccion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTransaccion = new JLabelMe();
		
		this.jLabelAccionesTransaccion.setText("Acciones");		
		this.jLabelAccionesTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTransaccion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTransaccion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTransaccion=new JTabbedPane();
		this.jTabbedPaneRelacionesTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTransaccion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransaccion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransaccion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTransaccion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTransaccion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTransaccion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTransaccion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTransaccion = new GridBagLayout();
		
		this.jPanelCamposTransaccion.setLayout(gridaBagLayoutCamposTransaccion);
		this.jPanelCamposOcultosTransaccion.setLayout(gridaBagLayoutCamposOcultosTransaccion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTransaccion = new GridBagConstraints();
	this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccion.gridy = 0;
	this.gridBagConstraintsTransaccion.gridx = 0;
	this.gridBagConstraintsTransaccion.ipadx = 0;
	this.gridBagConstraintsTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTransaccion.add(jLabelIdTransaccion, this.gridBagConstraintsTransaccion);



	this.gridBagConstraintsTransaccion = new GridBagConstraints();
	this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccion.gridy = 0;
	this.gridBagConstraintsTransaccion.gridx = 1;
	this.gridBagConstraintsTransaccion.ipadx = 0;
	this.gridBagConstraintsTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTransaccion.add(jLabelidTransaccion, this.gridBagConstraintsTransaccion);


	this.gridBagConstraintsTransaccion = new GridBagConstraints();
	this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccion.gridy = 0;
	this.gridBagConstraintsTransaccion.gridx = 0;
	this.gridBagConstraintsTransaccion.ipadx = 0;
	this.gridBagConstraintsTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTransaccion.add(jLabelid_empresaTransaccion, this.gridBagConstraintsTransaccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccion.gridy = 0;
		this.gridBagConstraintsTransaccion.gridx = 2;
		this.gridBagConstraintsTransaccion.ipadx = 0;
		this.gridBagConstraintsTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTransaccion.add(jButtonid_empresaTransaccionBusqueda, this.gridBagConstraintsTransaccion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccion.gridy = 0;
		this.gridBagConstraintsTransaccion.gridx = 3;
		this.gridBagConstraintsTransaccion.ipadx = 0;
		this.gridBagConstraintsTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTransaccion.add(jButtonid_empresaTransaccionUpdate, this.gridBagConstraintsTransaccion);
	}

	this.gridBagConstraintsTransaccion = new GridBagConstraints();
	this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccion.gridy = 0;
	this.gridBagConstraintsTransaccion.gridx = 1;
	this.gridBagConstraintsTransaccion.ipadx = 0;
	this.gridBagConstraintsTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTransaccion.add(jComboBoxid_empresaTransaccion, this.gridBagConstraintsTransaccion);


	this.gridBagConstraintsTransaccion = new GridBagConstraints();
	this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccion.gridy = 0;
	this.gridBagConstraintsTransaccion.gridx = 0;
	this.gridBagConstraintsTransaccion.ipadx = 0;
	this.gridBagConstraintsTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalTransaccion.add(jLabelid_sucursalTransaccion, this.gridBagConstraintsTransaccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccion.gridy = 0;
		this.gridBagConstraintsTransaccion.gridx = 2;
		this.gridBagConstraintsTransaccion.ipadx = 0;
		this.gridBagConstraintsTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalTransaccion.add(jButtonid_sucursalTransaccionBusqueda, this.gridBagConstraintsTransaccion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccion.gridy = 0;
		this.gridBagConstraintsTransaccion.gridx = 3;
		this.gridBagConstraintsTransaccion.ipadx = 0;
		this.gridBagConstraintsTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalTransaccion.add(jButtonid_sucursalTransaccionUpdate, this.gridBagConstraintsTransaccion);
	}

	this.gridBagConstraintsTransaccion = new GridBagConstraints();
	this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccion.gridy = 0;
	this.gridBagConstraintsTransaccion.gridx = 1;
	this.gridBagConstraintsTransaccion.ipadx = 0;
	this.gridBagConstraintsTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalTransaccion.add(jComboBoxid_sucursalTransaccion, this.gridBagConstraintsTransaccion);


	this.gridBagConstraintsTransaccion = new GridBagConstraints();
	this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccion.gridy = 0;
	this.gridBagConstraintsTransaccion.gridx = 0;
	this.gridBagConstraintsTransaccion.ipadx = 0;
	this.gridBagConstraintsTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTransaccion.add(jLabelcodigoTransaccion, this.gridBagConstraintsTransaccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccion.gridy = 0;
		this.gridBagConstraintsTransaccion.gridx = 2;
		this.gridBagConstraintsTransaccion.ipadx = 0;
		this.gridBagConstraintsTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTransaccion.add(jButtoncodigoTransaccionBusqueda, this.gridBagConstraintsTransaccion);
	}

	this.gridBagConstraintsTransaccion = new GridBagConstraints();
	this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccion.gridy = 0;
	this.gridBagConstraintsTransaccion.gridx = 1;
	this.gridBagConstraintsTransaccion.ipadx = 0;
	this.gridBagConstraintsTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTransaccion.add(jTextFieldcodigoTransaccion, this.gridBagConstraintsTransaccion);


	this.gridBagConstraintsTransaccion = new GridBagConstraints();
	this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccion.gridy = 0;
	this.gridBagConstraintsTransaccion.gridx = 0;
	this.gridBagConstraintsTransaccion.ipadx = 0;
	this.gridBagConstraintsTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTransaccion.add(jLabelnombreTransaccion, this.gridBagConstraintsTransaccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccion.gridy = 0;
		this.gridBagConstraintsTransaccion.gridx = 2;
		this.gridBagConstraintsTransaccion.ipadx = 0;
		this.gridBagConstraintsTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTransaccion.add(jButtonnombreTransaccionBusqueda, this.gridBagConstraintsTransaccion);
	}

	this.gridBagConstraintsTransaccion = new GridBagConstraints();
	this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccion.gridy = 0;
	this.gridBagConstraintsTransaccion.gridx = 1;
	this.gridBagConstraintsTransaccion.ipadx = 0;
	this.gridBagConstraintsTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTransaccion.add(jscrollPanenombreTransaccion, this.gridBagConstraintsTransaccion);


	this.gridBagConstraintsTransaccion = new GridBagConstraints();
	this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccion.gridy = 0;
	this.gridBagConstraintsTransaccion.gridx = 0;
	this.gridBagConstraintsTransaccion.ipadx = 0;
	this.gridBagConstraintsTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloTransaccion.add(jLabelid_moduloTransaccion, this.gridBagConstraintsTransaccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccion.gridy = 0;
		this.gridBagConstraintsTransaccion.gridx = 2;
		this.gridBagConstraintsTransaccion.ipadx = 0;
		this.gridBagConstraintsTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloTransaccion.add(jButtonid_moduloTransaccionBusqueda, this.gridBagConstraintsTransaccion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccion.gridy = 0;
		this.gridBagConstraintsTransaccion.gridx = 3;
		this.gridBagConstraintsTransaccion.ipadx = 0;
		this.gridBagConstraintsTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloTransaccion.add(jButtonid_moduloTransaccionUpdate, this.gridBagConstraintsTransaccion);
	}

	this.gridBagConstraintsTransaccion = new GridBagConstraints();
	this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccion.gridy = 0;
	this.gridBagConstraintsTransaccion.gridx = 1;
	this.gridBagConstraintsTransaccion.ipadx = 0;
	this.gridBagConstraintsTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloTransaccion.add(jComboBoxid_moduloTransaccion, this.gridBagConstraintsTransaccion);


	this.gridBagConstraintsTransaccion = new GridBagConstraints();
	this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccion.gridy = 0;
	this.gridBagConstraintsTransaccion.gridx = 0;
	this.gridBagConstraintsTransaccion.ipadx = 0;
	this.gridBagConstraintsTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_transaTransaccion.add(jLabelid_tipo_transaTransaccion, this.gridBagConstraintsTransaccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccion.gridy = 0;
		this.gridBagConstraintsTransaccion.gridx = 2;
		this.gridBagConstraintsTransaccion.ipadx = 0;
		this.gridBagConstraintsTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaTransaccion.add(jButtonid_tipo_transaTransaccionBusqueda, this.gridBagConstraintsTransaccion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccion.gridy = 0;
		this.gridBagConstraintsTransaccion.gridx = 3;
		this.gridBagConstraintsTransaccion.ipadx = 0;
		this.gridBagConstraintsTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaTransaccion.add(jButtonid_tipo_transaTransaccionUpdate, this.gridBagConstraintsTransaccion);
	}

	this.gridBagConstraintsTransaccion = new GridBagConstraints();
	this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccion.gridy = 0;
	this.gridBagConstraintsTransaccion.gridx = 1;
	this.gridBagConstraintsTransaccion.ipadx = 0;
	this.gridBagConstraintsTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_transaTransaccion.add(jComboBoxid_tipo_transaTransaccion, this.gridBagConstraintsTransaccion);


	this.gridBagConstraintsTransaccion = new GridBagConstraints();
	this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccion.gridy = 0;
	this.gridBagConstraintsTransaccion.gridx = 0;
	this.gridBagConstraintsTransaccion.ipadx = 0;
	this.gridBagConstraintsTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_comprobanteTransaccion.add(jLabelid_tipo_comprobanteTransaccion, this.gridBagConstraintsTransaccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccion.gridy = 0;
		this.gridBagConstraintsTransaccion.gridx = 2;
		this.gridBagConstraintsTransaccion.ipadx = 0;
		this.gridBagConstraintsTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_comprobanteTransaccion.add(jButtonid_tipo_comprobanteTransaccionBusqueda, this.gridBagConstraintsTransaccion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccion.gridy = 0;
		this.gridBagConstraintsTransaccion.gridx = 3;
		this.gridBagConstraintsTransaccion.ipadx = 0;
		this.gridBagConstraintsTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_comprobanteTransaccion.add(jButtonid_tipo_comprobanteTransaccionUpdate, this.gridBagConstraintsTransaccion);
	}

	this.gridBagConstraintsTransaccion = new GridBagConstraints();
	this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccion.gridy = 0;
	this.gridBagConstraintsTransaccion.gridx = 1;
	this.gridBagConstraintsTransaccion.ipadx = 0;
	this.gridBagConstraintsTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_comprobanteTransaccion.add(jComboBoxid_tipo_comprobanteTransaccion, this.gridBagConstraintsTransaccion);


	this.gridBagConstraintsTransaccion = new GridBagConstraints();
	this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccion.gridy = 0;
	this.gridBagConstraintsTransaccion.gridx = 0;
	this.gridBagConstraintsTransaccion.ipadx = 0;
	this.gridBagConstraintsTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_transaccion_moduloTransaccion.add(jLabelid_tipo_transaccion_moduloTransaccion, this.gridBagConstraintsTransaccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccion.gridy = 0;
		this.gridBagConstraintsTransaccion.gridx = 2;
		this.gridBagConstraintsTransaccion.ipadx = 0;
		this.gridBagConstraintsTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloTransaccion.add(jButtonid_tipo_transaccion_moduloTransaccionBusqueda, this.gridBagConstraintsTransaccion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccion.gridy = 0;
		this.gridBagConstraintsTransaccion.gridx = 3;
		this.gridBagConstraintsTransaccion.ipadx = 0;
		this.gridBagConstraintsTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloTransaccion.add(jButtonid_tipo_transaccion_moduloTransaccionUpdate, this.gridBagConstraintsTransaccion);
	}

	this.gridBagConstraintsTransaccion = new GridBagConstraints();
	this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccion.gridy = 0;
	this.gridBagConstraintsTransaccion.gridx = 1;
	this.gridBagConstraintsTransaccion.ipadx = 0;
	this.gridBagConstraintsTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_transaccion_moduloTransaccion.add(jComboBoxid_tipo_transaccion_moduloTransaccion, this.gridBagConstraintsTransaccion);


	this.gridBagConstraintsTransaccion = new GridBagConstraints();
	this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccion.gridy = 0;
	this.gridBagConstraintsTransaccion.gridx = 0;
	this.gridBagConstraintsTransaccion.ipadx = 0;
	this.gridBagConstraintsTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_retencionTransaccion.add(jLabelid_tipo_retencionTransaccion, this.gridBagConstraintsTransaccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccion.gridy = 0;
		this.gridBagConstraintsTransaccion.gridx = 2;
		this.gridBagConstraintsTransaccion.ipadx = 0;
		this.gridBagConstraintsTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencionTransaccion.add(jButtonid_tipo_retencionTransaccionBusqueda, this.gridBagConstraintsTransaccion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccion.gridy = 0;
		this.gridBagConstraintsTransaccion.gridx = 3;
		this.gridBagConstraintsTransaccion.ipadx = 0;
		this.gridBagConstraintsTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencionTransaccion.add(jButtonid_tipo_retencionTransaccionUpdate, this.gridBagConstraintsTransaccion);
	}

	this.gridBagConstraintsTransaccion = new GridBagConstraints();
	this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccion.gridy = 0;
	this.gridBagConstraintsTransaccion.gridx = 1;
	this.gridBagConstraintsTransaccion.ipadx = 0;
	this.gridBagConstraintsTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_retencionTransaccion.add(jComboBoxid_tipo_retencionTransaccion, this.gridBagConstraintsTransaccion);


	this.gridBagConstraintsTransaccion = new GridBagConstraints();
	this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccion.gridy = 0;
	this.gridBagConstraintsTransaccion.gridx = 0;
	this.gridBagConstraintsTransaccion.ipadx = 0;
	this.gridBagConstraintsTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableTransaccion.add(jLabelid_cuenta_contableTransaccion, this.gridBagConstraintsTransaccion);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTransaccion = new GridBagConstraints();
	//this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccion.gridy = 0;
	this.gridBagConstraintsTransaccion.gridx = 2;
	this.gridBagConstraintsTransaccion.ipadx = 0;
	this.gridBagConstraintsTransaccion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableTransaccion.add(jButtonid_cuenta_contableTransaccion, this.gridBagConstraintsTransaccion);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTransaccion = new GridBagConstraints();
	//this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccion.gridy = 0;
	this.gridBagConstraintsTransaccion.gridx = 3;
	this.gridBagConstraintsTransaccion.ipadx = 0;
	this.gridBagConstraintsTransaccion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableTransaccion.add(jButtonid_cuenta_contableTransaccionArbol, this.gridBagConstraintsTransaccion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccion.gridy = 0;
		this.gridBagConstraintsTransaccion.gridx = 4;
		this.gridBagConstraintsTransaccion.ipadx = 0;
		this.gridBagConstraintsTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableTransaccion.add(jButtonid_cuenta_contableTransaccionBusqueda, this.gridBagConstraintsTransaccion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccion.gridy = 0;
		this.gridBagConstraintsTransaccion.gridx = 5;
		this.gridBagConstraintsTransaccion.ipadx = 0;
		this.gridBagConstraintsTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableTransaccion.add(jButtonid_cuenta_contableTransaccionUpdate, this.gridBagConstraintsTransaccion);
	}

	this.gridBagConstraintsTransaccion = new GridBagConstraints();
	this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccion.gridy = 0;
	this.gridBagConstraintsTransaccion.gridx = 1;
	this.gridBagConstraintsTransaccion.ipadx = 0;
	this.gridBagConstraintsTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableTransaccion.add(jComboBoxid_cuenta_contableTransaccion, this.gridBagConstraintsTransaccion);


	this.gridBagConstraintsTransaccion = new GridBagConstraints();
	this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccion.gridy = 0;
	this.gridBagConstraintsTransaccion.gridx = 0;
	this.gridBagConstraintsTransaccion.ipadx = 0;
	this.gridBagConstraintsTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionTransaccion.add(jLabeldescripcionTransaccion, this.gridBagConstraintsTransaccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccion.gridy = 0;
		this.gridBagConstraintsTransaccion.gridx = 2;
		this.gridBagConstraintsTransaccion.ipadx = 0;
		this.gridBagConstraintsTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionTransaccion.add(jButtondescripcionTransaccionBusqueda, this.gridBagConstraintsTransaccion);
	}

	this.gridBagConstraintsTransaccion = new GridBagConstraints();
	this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccion.gridy = 0;
	this.gridBagConstraintsTransaccion.gridx = 1;
	this.gridBagConstraintsTransaccion.ipadx = 0;
	this.gridBagConstraintsTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionTransaccion.add(jscrollPanedescripcionTransaccion, this.gridBagConstraintsTransaccion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTransaccion = new GridBagConstraints();
	this.gridBagConstraintsTransaccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccion.gridy = iYPanelCamposTransaccion;
	this.gridBagConstraintsTransaccion.gridx = iXPanelCamposTransaccion++;
	this.gridBagConstraintsTransaccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccion.add(this.jPanelidTransaccion, this.gridBagConstraintsTransaccion);



	if(iXPanelCamposTransaccion % 1==0) {
		iXPanelCamposTransaccion=0;
		iYPanelCamposTransaccion++;
	}
	this.gridBagConstraintsTransaccion = new GridBagConstraints();
	this.gridBagConstraintsTransaccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccion.gridy = iYPanelCamposTransaccion;
	this.gridBagConstraintsTransaccion.gridx = iXPanelCamposTransaccion++;
	this.gridBagConstraintsTransaccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccion.add(this.jPanelcodigoTransaccion, this.gridBagConstraintsTransaccion);



	if(iXPanelCamposTransaccion % 1==0) {
		iXPanelCamposTransaccion=0;
		iYPanelCamposTransaccion++;
	}
	this.gridBagConstraintsTransaccion = new GridBagConstraints();
	this.gridBagConstraintsTransaccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccion.gridy = iYPanelCamposTransaccion;
	this.gridBagConstraintsTransaccion.gridx = iXPanelCamposTransaccion++;
	this.gridBagConstraintsTransaccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccion.add(this.jPanelnombreTransaccion, this.gridBagConstraintsTransaccion);



	if(iXPanelCamposTransaccion % 1==0) {
		iXPanelCamposTransaccion=0;
		iYPanelCamposTransaccion++;
	}
	this.gridBagConstraintsTransaccion = new GridBagConstraints();
	this.gridBagConstraintsTransaccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccion.gridy = iYPanelCamposTransaccion;
	this.gridBagConstraintsTransaccion.gridx = iXPanelCamposTransaccion++;
	this.gridBagConstraintsTransaccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccion.add(this.jPanelid_tipo_transaTransaccion, this.gridBagConstraintsTransaccion);



	if(iXPanelCamposTransaccion % 1==0) {
		iXPanelCamposTransaccion=0;
		iYPanelCamposTransaccion++;
	}
	this.gridBagConstraintsTransaccion = new GridBagConstraints();
	this.gridBagConstraintsTransaccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccion.gridy = iYPanelCamposTransaccion;
	this.gridBagConstraintsTransaccion.gridx = iXPanelCamposTransaccion++;
	this.gridBagConstraintsTransaccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccion.add(this.jPanelid_tipo_comprobanteTransaccion, this.gridBagConstraintsTransaccion);



	if(iXPanelCamposTransaccion % 1==0) {
		iXPanelCamposTransaccion=0;
		iYPanelCamposTransaccion++;
	}
	this.gridBagConstraintsTransaccion = new GridBagConstraints();
	this.gridBagConstraintsTransaccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccion.gridy = iYPanelCamposTransaccion;
	this.gridBagConstraintsTransaccion.gridx = iXPanelCamposTransaccion++;
	this.gridBagConstraintsTransaccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccion.add(this.jPanelid_tipo_retencionTransaccion, this.gridBagConstraintsTransaccion);



	if(iXPanelCamposTransaccion % 1==0) {
		iXPanelCamposTransaccion=0;
		iYPanelCamposTransaccion++;
	}
	this.gridBagConstraintsTransaccion = new GridBagConstraints();
	this.gridBagConstraintsTransaccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccion.gridy = iYPanelCamposTransaccion;
	this.gridBagConstraintsTransaccion.gridx = iXPanelCamposTransaccion++;
	this.gridBagConstraintsTransaccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccion.add(this.jPanelid_cuenta_contableTransaccion, this.gridBagConstraintsTransaccion);



	if(iXPanelCamposTransaccion % 1==0) {
		iXPanelCamposTransaccion=0;
		iYPanelCamposTransaccion++;
	}
	this.gridBagConstraintsTransaccion = new GridBagConstraints();
	this.gridBagConstraintsTransaccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccion.gridy = iYPanelCamposTransaccion;
	this.gridBagConstraintsTransaccion.gridx = iXPanelCamposTransaccion++;
	this.gridBagConstraintsTransaccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccion.add(this.jPaneldescripcionTransaccion, this.gridBagConstraintsTransaccion);



	if(iXPanelCamposTransaccion % 1==0) {
		iXPanelCamposTransaccion=0;
		iYPanelCamposTransaccion++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTransaccion = new GridBagConstraints();
	this.gridBagConstraintsTransaccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccion.gridy = iYPanelCamposOcultosTransaccion;
	this.gridBagConstraintsTransaccion.gridx = iXPanelCamposOcultosTransaccion++;
	this.gridBagConstraintsTransaccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTransaccion.add(this.jPanelid_empresaTransaccion, this.gridBagConstraintsTransaccion);



	if(iXPanelCamposOcultosTransaccion % 1==0) {
		iXPanelCamposOcultosTransaccion=0;
		iYPanelCamposOcultosTransaccion++;
	}
	this.gridBagConstraintsTransaccion = new GridBagConstraints();
	this.gridBagConstraintsTransaccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccion.gridy = iYPanelCamposOcultosTransaccion;
	this.gridBagConstraintsTransaccion.gridx = iXPanelCamposOcultosTransaccion++;
	this.gridBagConstraintsTransaccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTransaccion.add(this.jPanelid_sucursalTransaccion, this.gridBagConstraintsTransaccion);



	if(iXPanelCamposOcultosTransaccion % 1==0) {
		iXPanelCamposOcultosTransaccion=0;
		iYPanelCamposOcultosTransaccion++;
	}
	this.gridBagConstraintsTransaccion = new GridBagConstraints();
	this.gridBagConstraintsTransaccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccion.gridy = iYPanelCamposOcultosTransaccion;
	this.gridBagConstraintsTransaccion.gridx = iXPanelCamposOcultosTransaccion++;
	this.gridBagConstraintsTransaccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTransaccion.add(this.jPanelid_moduloTransaccion, this.gridBagConstraintsTransaccion);



	if(iXPanelCamposOcultosTransaccion % 1==0) {
		iXPanelCamposOcultosTransaccion=0;
		iYPanelCamposOcultosTransaccion++;
	}
	this.gridBagConstraintsTransaccion = new GridBagConstraints();
	this.gridBagConstraintsTransaccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccion.gridy = iYPanelCamposOcultosTransaccion;
	this.gridBagConstraintsTransaccion.gridx = iXPanelCamposOcultosTransaccion++;
	this.gridBagConstraintsTransaccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTransaccion.add(this.jPanelid_tipo_transaccion_moduloTransaccion, this.gridBagConstraintsTransaccion);



	if(iXPanelCamposOcultosTransaccion % 1==0) {
		iXPanelCamposOcultosTransaccion=0;
		iYPanelCamposOcultosTransaccion++;
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
			
		GridBagLayout gridaBagLayoutAccionesTransaccion= new GridBagLayout();
		this.jPanelAccionesTransaccion.setLayout(gridaBagLayoutAccionesTransaccion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTransaccion= new GridBagLayout();
		this.jPanelAccionesFormularioTransaccion.setLayout(gridaBagLayoutAccionesFormularioTransaccion);
		
		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		this.gridBagConstraintsTransaccion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTransaccion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTransaccion.add(this.jComboBoxTiposAccionesFormularioTransaccion, this.gridBagConstraintsTransaccion);

		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		this.gridBagConstraintsTransaccion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTransaccion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTransaccion.add(this.jCheckBoxPostAccionNuevoTransaccion, this.gridBagConstraintsTransaccion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.transaccionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			this.gridBagConstraintsTransaccion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTransaccion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTransaccion.add(this.jCheckBoxPostAccionSinCerrarTransaccion, this.gridBagConstraintsTransaccion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.transaccionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.transaccionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			this.gridBagConstraintsTransaccion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTransaccion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTransaccion.add(this.jCheckBoxPostAccionSinMensajeTransaccion, this.gridBagConstraintsTransaccion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		this.gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccion.gridy = 0;
		this.gridBagConstraintsTransaccion.gridx = iPosXAccion++;
			
		this.jPanelAccionesTransaccion.add(this.jButtonModificarTransaccion, this.gridBagConstraintsTransaccion);							

		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		this.gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccion.gridy = 0;
		this.gridBagConstraintsTransaccion.gridx =iPosXAccion++;
			
		this.jPanelAccionesTransaccion.add(this.jButtonEliminarTransaccion, this.gridBagConstraintsTransaccion);
		
			
		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		this.gridBagConstraintsTransaccion.gridy = 0;		
		this.gridBagConstraintsTransaccion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTransaccion.add(this.jButtonActualizarTransaccion, this.gridBagConstraintsTransaccion);


		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		this.gridBagConstraintsTransaccion.gridy = 0;		
		this.gridBagConstraintsTransaccion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTransaccion.add(this.jButtonGuardarCambiosTransaccion, this.gridBagConstraintsTransaccion);	
		
		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		this.gridBagConstraintsTransaccion.gridy = 0;		
		this.gridBagConstraintsTransaccion.gridx =iPosXAccion++;
		
		this.jPanelAccionesTransaccion.add(this.jButtonCancelarTransaccion, this.gridBagConstraintsTransaccion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTransaccion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTransaccion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.transaccionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTransaccion = new GridBagConstraints();						
			this.gridBagConstraintsTransaccion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTransaccion.gridx = 0;		
			//this.gridBagConstraintsTransaccion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTransaccion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		this.gridBagConstraintsTransaccion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTransaccion.gridx =0;
		this.gridBagConstraintsTransaccion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTransaccion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTransaccion, this.gridBagConstraintsTransaccion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TransaccionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTransaccion = new TransaccionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Transaccion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Transaccion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Transaccion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TransaccionModel transaccionModel=new TransaccionModel(this);
			
			//SI USARA CLASE INTERNA
			//TransaccionModel.TransaccionFocusTraversalPolicy transaccionFocusTraversalPolicy = transaccionModel.new TransaccionFocusTraversalPolicy(this);
			
			//transaccionFocusTraversalPolicy.settransaccionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(transaccionModel);
			
			
			this.jContentPaneDetalleTransaccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTransaccion = new GridBagLayout();	
			this.jContentPaneDetalleTransaccion.setLayout(gridaBagLayoutDetalleTransaccion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTransaccion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTransaccion = new GridBagConstraints();
				this.gridBagConstraintsTransaccion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTransaccion.gridx = 0;
					
				
				this.jContentPaneDetalleTransaccion.add(jTtoolBarDetalleTransaccion, gridBagConstraintsTransaccion);								
				
}
			
			this.jScrollPanelDatosEdicionTransaccion=   new JScrollPane(jContentPaneDetalleTransaccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTransaccion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransaccion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransaccion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTransaccion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTransaccion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransaccion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransaccion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTransaccion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTransaccion.gridx = 0;
	        
			this.jContentPaneDetalleTransaccion.add(jPanelCamposTransaccion, gridBagConstraintsTransaccion);
			
			
			
			
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
						&& transaccionSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.transaccionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTransaccion= new GridBagConstraints();
						this.gridBagConstraintsTransaccion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTransaccion.gridx = 0;
						this.jContentPaneDetalleTransaccion.add(this.jTabbedPaneRelacionesTransaccion, this.gridBagConstraintsTransaccion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTransaccion.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTransaccion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTransaccion = new GridBagConstraints();
					this.gridBagConstraintsTransaccion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTransaccion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTransaccion.gridx = 0;
					
				
					this.jContentPaneDetalleTransaccion.add(jPanelCamposOcultosTransaccion, gridBagConstraintsTransaccion);
				
					this.jPanelCamposOcultosTransaccion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			this.gridBagConstraintsTransaccion.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTransaccion.gridx = 0;
	        this.gridBagConstraintsTransaccion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTransaccion.add(this.jPanelAccionesFormularioTransaccion, this.gridBagConstraintsTransaccion);							
			
			
			
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
	        this.gridBagConstraintsTransaccion.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTransaccion.gridx = 0;
	        
			
			this.jContentPaneDetalleTransaccion.add(this.jPanelAccionesTransaccion, this.gridBagConstraintsTransaccion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTransaccion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTransaccion=   new JScrollPane(this.jPanelCamposTransaccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTransaccion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransaccion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransaccion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			this.gridBagConstraintsTransaccion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTransaccion.gridx = 0;
			this.gridBagConstraintsTransaccion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTransaccion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTransaccion, this.gridBagConstraintsTransaccion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			this.gridBagConstraintsTransaccion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTransaccion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTransaccion, this.gridBagConstraintsTransaccion);			
			
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			this.gridBagConstraintsTransaccion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTransaccion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTransaccion, this.gridBagConstraintsTransaccion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		this.gridBagConstraintsTransaccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTransaccion, this.gridBagConstraintsTransaccion);
			
			
		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		this.gridBagConstraintsTransaccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTransaccion, this.gridBagConstraintsTransaccion);
		
			
		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		this.gridBagConstraintsTransaccion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTransaccion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTransaccion, this.gridBagConstraintsTransaccion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTransaccion;//jContentPane;
		
		return jScrollPanelDatosEdicionTransaccion;
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
