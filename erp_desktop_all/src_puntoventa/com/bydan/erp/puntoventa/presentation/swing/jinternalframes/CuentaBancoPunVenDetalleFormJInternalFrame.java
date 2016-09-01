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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.CuentaBancoPunVenConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class CuentaBancoPunVenDetalleFormJInternalFrame extends CuentaBancoPunVenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCuentaBancoPunVen;
	
	protected JMenuBar jmenuBarDetalleCuentaBancoPunVen;
	
	protected JMenu jmenuDetalleCuentaBancoPunVen;
	protected JMenu jmenuDetalleArchivoCuentaBancoPunVen;
	protected JMenu jmenuDetalleAccionesCuentaBancoPunVen;
	protected JMenu jmenuDetalleDatosCuentaBancoPunVen;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCuentaBancoPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCuentaBancoPunVen;	
	protected GridBagConstraints gridBagConstraintsCuentaBancoPunVen;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CuentaBancoPunVenBeanSwingJInternalFrameAdditional jInternalFrameDetalleCuentaBancoPunVen;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_banco="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";
	
	public CuentaBancoPunVenSessionBean cuentabancopunvenSessionBean;
	
	

	public FormaPagoPuntoVentaBeanSwingJInternalFrame formapagopuntoventaBeanSwingJInternalFrame=null;
	public FormaPagoPuntoVentaBeanSwingJInternalFrame formapagopuntoventaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFormaPagoPuntoVenta=false;
	public FormaPagoPuntoVentaSessionBean formapagopuntoventaSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BancoSessionBean bancoSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;	
	
	public CuentaBancoPunVenLogic cuentabancopunvenLogic;
	
	public JScrollPane jScrollPanelDatosCuentaBancoPunVen;
	public JScrollPane jScrollPanelDatosEdicionCuentaBancoPunVen;
	public JScrollPane jScrollPanelDatosGeneralCuentaBancoPunVen;
	
	protected JPanel jPanelCamposCuentaBancoPunVen;    
	protected JPanel jPanelCamposOcultosCuentaBancoPunVen;    	
	protected JPanel jPanelAccionesCuentaBancoPunVen;
	protected JPanel jPanelAccionesFormularioCuentaBancoPunVen;
    
	
	
	protected Integer iXPanelCamposCuentaBancoPunVen=0;
	protected Integer iYPanelCamposCuentaBancoPunVen=0;
	
	protected Integer iXPanelCamposOcultosCuentaBancoPunVen=0;
	protected Integer iYPanelCamposOcultosCuentaBancoPunVen=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCuentaBancoPunVen;
	public JButton jButtonModificarCuentaBancoPunVen;
	public JButton jButtonActualizarCuentaBancoPunVen;
    public JButton jButtonEliminarCuentaBancoPunVen;
	public JButton jButtonCancelarCuentaBancoPunVen;
    public JButton jButtonGuardarCambiosCuentaBancoPunVen;
	public JButton jButtonGuardarCambiosTablaCuentaBancoPunVen;
	protected JButton jButtonCerrarCuentaBancoPunVen;
	
	
	protected JButton jButtonProcesarInformacionCuentaBancoPunVen;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCuentaBancoPunVen;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCuentaBancoPunVen;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCuentaBancoPunVen;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCuentaBancoPunVen;
	protected JButton jButtonModificarToolBarCuentaBancoPunVen;
	protected JButton jButtonActualizarToolBarCuentaBancoPunVen;
    protected JButton jButtonEliminarToolBarCuentaBancoPunVen;
	protected JButton jButtonCancelarToolBarCuentaBancoPunVen;
    protected JButton jButtonGuardarCambiosToolBarCuentaBancoPunVen;
	protected JButton jButtonGuardarCambiosTablaToolBarCuentaBancoPunVen;
	protected JButton jButtonMostrarOcultarTablaToolBarCuentaBancoPunVen;
	protected JButton jButtonCerrarToolBarCuentaBancoPunVen;
	
	protected JButton jButtonProcesarInformacionToolBarCuentaBancoPunVen;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCuentaBancoPunVen;
	protected JMenuItem jMenuItemModificarCuentaBancoPunVen;
	protected JMenuItem jMenuItemActualizarCuentaBancoPunVen;
    protected JMenuItem jMenuItemEliminarCuentaBancoPunVen;
	protected JMenuItem jMenuItemCancelarCuentaBancoPunVen;
    protected JMenuItem jMenuItemGuardarCambiosCuentaBancoPunVen;
	protected JMenuItem jMenuItemGuardarCambiosTablaCuentaBancoPunVen;
	protected JMenuItem jMenuItemCerrarCuentaBancoPunVen;
	protected JMenuItem jMenuItemDetalleCerrarCuentaBancoPunVen;
	protected JMenuItem jMenuItemDetalleMostarOcultarCuentaBancoPunVen;
	
	protected JMenuItem jMenuItemProcesarInformacionCuentaBancoPunVen;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCuentaBancoPunVen;
	protected JMenuItem jMenuItemMostrarOcultarCuentaBancoPunVen;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCuentaBancoPunVen;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCuentaBancoPunVen;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCuentaBancoPunVen;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCuentaBancoPunVen;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCuentaBancoPunVen;
	public JLabel jLabelIdCuentaBancoPunVen;
	public JLabel jLabelidCuentaBancoPunVen;
	public JButton jButtonidCuentaBancoPunVenBusqueda= new JButtonMe();

	public JPanel jPanelcodigoCuentaBancoPunVen;
	public JLabel jLabelcodigoCuentaBancoPunVen;
	public JTextField jTextFieldcodigoCuentaBancoPunVen;
	public JButton jButtoncodigoCuentaBancoPunVenBusqueda= new JButtonMe();

	public JPanel jPanelnombreCuentaBancoPunVen;
	public JLabel jLabelnombreCuentaBancoPunVen;
	public JTextArea jTextAreanombreCuentaBancoPunVen;
	public JScrollPane jscrollPanenombreCuentaBancoPunVen;
	public JButton jButtonnombreCuentaBancoPunVenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCuentaBancoPunVen;
	public JLabel jLabelid_empresaCuentaBancoPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCuentaBancoPunVen;
	public JButton jButtonid_empresaCuentaBancoPunVen= new JButtonMe();
	public JButton jButtonid_empresaCuentaBancoPunVenUpdate= new JButtonMe();
	public JButton jButtonid_empresaCuentaBancoPunVenBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalCuentaBancoPunVen;
	public JLabel jLabelid_sucursalCuentaBancoPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalCuentaBancoPunVen;
	public JButton jButtonid_sucursalCuentaBancoPunVen= new JButtonMe();
	public JButton jButtonid_sucursalCuentaBancoPunVenUpdate= new JButtonMe();
	public JButton jButtonid_sucursalCuentaBancoPunVenBusqueda= new JButtonMe();

	public JPanel jPanelid_bancoCuentaBancoPunVen;
	public JLabel jLabelid_bancoCuentaBancoPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bancoCuentaBancoPunVen;
	public JButton jButtonid_bancoCuentaBancoPunVen= new JButtonMe();
	public JButton jButtonid_bancoCuentaBancoPunVenUpdate= new JButtonMe();
	public JButton jButtonid_bancoCuentaBancoPunVenBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteCuentaBancoPunVen;
	public JLabel jLabelid_clienteCuentaBancoPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteCuentaBancoPunVen;
	public JButton jButtonid_clienteCuentaBancoPunVen= new JButtonMe();
	public JButton jButtonid_clienteCuentaBancoPunVenUpdate= new JButtonMe();
	public JButton jButtonid_clienteCuentaBancoPunVenBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contableCuentaBancoPunVen;
	public JLabel jLabelid_cuenta_contableCuentaBancoPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableCuentaBancoPunVen;
	public JButton jButtonid_cuenta_contableCuentaBancoPunVen= new JButtonMe();
	public JButton jButtonid_cuenta_contableCuentaBancoPunVenUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableCuentaBancoPunVenBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableCuentaBancoPunVenArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCuentaBancoPunVen;
	
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
	public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CuentaBancoPunVenDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCuentaBancoPunVen=new JPanel();
				this.jPanelAccionesFormularioCuentaBancoPunVen=new JPanel();
				this.jmenuBarDetalleCuentaBancoPunVen=new JMenuBar();
				this.jTtoolBarDetalleCuentaBancoPunVen=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaBancoPunVenDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CuentaBancoPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CuentaBancoPunVenDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CuentaBancoPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaBancoPunVenDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentaBancoPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaBancoPunVenDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentaBancoPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaBancoPunVenDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CuentaBancoPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCuentaBancoPunVen() {
		return this.jButtonActualizarToolBarCuentaBancoPunVen;
	}
	
	public JButton getjButtonEliminarToolBarCuentaBancoPunVen() {
		return this.jButtonEliminarToolBarCuentaBancoPunVen;
	}
	
	public JButton getjButtonCancelarToolBarCuentaBancoPunVen() {
		return this.jButtonCancelarToolBarCuentaBancoPunVen;
	}		
	
	public JButton getjButtonProcesarInformacionCuentaBancoPunVen() {
		return this.jButtonProcesarInformacionCuentaBancoPunVen;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCuentaBancoPunVen)	{
		this.jButtonProcesarInformacionCuentaBancoPunVen = jButtonProcesarInformacionCuentaBancoPunVen;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCuentaBancoPunVen() {
		return this.jComboBoxTiposAccionesCuentaBancoPunVen;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCuentaBancoPunVen(
			JComboBox jComboBoxTiposRelacionesCuentaBancoPunVen) {
		this.jComboBoxTiposRelacionesCuentaBancoPunVen = jComboBoxTiposRelacionesCuentaBancoPunVen;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCuentaBancoPunVen(
			JComboBox jComboBoxTiposAccionesCuentaBancoPunVen) {
		this.jComboBoxTiposAccionesCuentaBancoPunVen = jComboBoxTiposAccionesCuentaBancoPunVen;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCuentaBancoPunVen() {
		return this.jComboBoxTiposAccionesFormularioCuentaBancoPunVen;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCuentaBancoPunVen(
			JComboBox jComboBoxTiposAccionesFormularioCuentaBancoPunVen) {
		this.jComboBoxTiposAccionesFormularioCuentaBancoPunVen = jComboBoxTiposAccionesFormularioCuentaBancoPunVen;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cuentabancopunvenSessionBean=new CuentaBancoPunVenSessionBean();
		
		this.cuentabancopunvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cuentabancopunvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cuentabancopunvenSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.formapagopuntoventaSessionBean=new FormaPagoPuntoVentaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CuentaBancoPunVenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CuentaBancoPunVenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CuentaBancoPunVenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cuenta Banco MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {
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
	
		CuentaBancoPunVenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCuentaBancoPunVen= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCuentaBancoPunVen=new JButtonMe();
				this.jButtonModificarToolBarCuentaBancoPunVen=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCuentaBancoPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCuentaBancoPunVen,this.jTtoolBarDetalleCuentaBancoPunVen,
							"actualizar","actualizar","Actualizar"+" "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCuentaBancoPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCuentaBancoPunVen,this.jTtoolBarDetalleCuentaBancoPunVen,
							"eliminar","eliminar","Eliminar"+" "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCuentaBancoPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCuentaBancoPunVen,this.jTtoolBarDetalleCuentaBancoPunVen,
							"cancelar","cancelar","Cancelar"+" "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCuentaBancoPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCuentaBancoPunVen,this.jTtoolBarDetalleCuentaBancoPunVen,
							"guardarcambios","guardarcambios","Guardar"+" "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCuentaBancoPunVen,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCuentaBancoPunVen,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCuentaBancoPunVen,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCuentaBancoPunVen=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCuentaBancoPunVen=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCuentaBancoPunVen=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCuentaBancoPunVen=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCuentaBancoPunVen=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCuentaBancoPunVen= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCuentaBancoPunVen.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCuentaBancoPunVen,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCuentaBancoPunVen= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCuentaBancoPunVen.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCuentaBancoPunVen,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCuentaBancoPunVen= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCuentaBancoPunVen.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCuentaBancoPunVen,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCuentaBancoPunVen= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCuentaBancoPunVen.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCuentaBancoPunVen,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCuentaBancoPunVen= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCuentaBancoPunVen.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCuentaBancoPunVen,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCuentaBancoPunVen= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCuentaBancoPunVen.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCuentaBancoPunVen,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCuentaBancoPunVen= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCuentaBancoPunVen.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCuentaBancoPunVen,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCuentaBancoPunVen= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCuentaBancoPunVen.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCuentaBancoPunVen,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCuentaBancoPunVen= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCuentaBancoPunVen.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCuentaBancoPunVen,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCuentaBancoPunVen= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCuentaBancoPunVen.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCuentaBancoPunVen,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCuentaBancoPunVen.add(this.jMenuItemDetalleCerrarCuentaBancoPunVen);
		
		this.jmenuDetalleAccionesCuentaBancoPunVen.add(this.jMenuItemActualizarCuentaBancoPunVen);
		this.jmenuDetalleAccionesCuentaBancoPunVen.add(this.jMenuItemEliminarCuentaBancoPunVen);
		this.jmenuDetalleAccionesCuentaBancoPunVen.add(this.jMenuItemCancelarCuentaBancoPunVen);		
		
		//this.jmenuDetalleDatosCuentaBancoPunVen.add(this.jMenuItemDetalleAbrirOrderByCuentaBancoPunVen);				
		this.jmenuDetalleDatosCuentaBancoPunVen.add(this.jMenuItemDetalleMostarOcultarCuentaBancoPunVen);				
				
		//this.jmenuDetalleAccionesCuentaBancoPunVen.add(this.jMenuItemGuardarCambiosCuentaBancoPunVen);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCuentaBancoPunVen.add(this.jmenuDetalleArchivoCuentaBancoPunVen);		
		this.jmenuBarDetalleCuentaBancoPunVen.add(this.jmenuDetalleAccionesCuentaBancoPunVen);		
		this.jmenuBarDetalleCuentaBancoPunVen.add(this.jmenuDetalleDatosCuentaBancoPunVen);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleCuentaBancoPunVen.add(this.jmenuDetalleCuentaBancoPunVen);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCuentaBancoPunVen);				
	}
	
	
	public void inicializarElementosCamposCuentaBancoPunVen() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCuentaBancoPunVen = new JLabelMe();
		jLabelIdCuentaBancoPunVen.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCuentaBancoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCuentaBancoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCuentaBancoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCuentaBancoPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCuentaBancoPunVen = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCuentaBancoPunVen.setToolTipText(CuentaBancoPunVenConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCuentaBancoPunVen= new GridBagLayout();

		this.jPanelidCuentaBancoPunVen.setLayout(this.gridaBagLayoutCuentaBancoPunVen);

		jLabelidCuentaBancoPunVen = new JLabel();
		jLabelidCuentaBancoPunVen.setText("Id");

		jLabelidCuentaBancoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCuentaBancoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCuentaBancoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoCuentaBancoPunVen = new JLabelMe();
		this.jLabelcodigoCuentaBancoPunVen.setText(""+CuentaBancoPunVenConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoCuentaBancoPunVen.setToolTipText("Codigo");
		this.jLabelcodigoCuentaBancoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCuentaBancoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCuentaBancoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoCuentaBancoPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoCuentaBancoPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoCuentaBancoPunVen.setToolTipText(CuentaBancoPunVenConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutCuentaBancoPunVen = new GridBagLayout();
		this.jPanelcodigoCuentaBancoPunVen.setLayout(this.gridaBagLayoutCuentaBancoPunVen);


		jTextFieldcodigoCuentaBancoPunVen= new JTextFieldMe();

		jTextFieldcodigoCuentaBancoPunVen.setEnabled(false);
		jTextFieldcodigoCuentaBancoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCuentaBancoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCuentaBancoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoCuentaBancoPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoCuentaBancoPunVenBusqueda= new JButtonMe();
		this.jButtoncodigoCuentaBancoPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCuentaBancoPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCuentaBancoPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoCuentaBancoPunVenBusqueda.setText("U");
		this.jButtoncodigoCuentaBancoPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoCuentaBancoPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoCuentaBancoPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoCuentaBancoPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoCuentaBancoPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoCuentaBancoPunVenBusqueda"));

		if(this.cuentabancopunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoCuentaBancoPunVenBusqueda.setVisible(false);		}


					
		this.jLabelnombreCuentaBancoPunVen = new JLabelMe();
		this.jLabelnombreCuentaBancoPunVen.setText(""+CuentaBancoPunVenConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreCuentaBancoPunVen.setToolTipText("Nombre");
		this.jLabelnombreCuentaBancoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCuentaBancoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCuentaBancoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreCuentaBancoPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreCuentaBancoPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreCuentaBancoPunVen.setToolTipText(CuentaBancoPunVenConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutCuentaBancoPunVen = new GridBagLayout();
		this.jPanelnombreCuentaBancoPunVen.setLayout(this.gridaBagLayoutCuentaBancoPunVen);


		jTextAreanombreCuentaBancoPunVen= new JTextAreaMe();
		jTextAreanombreCuentaBancoPunVen.setEnabled(false);
		jTextAreanombreCuentaBancoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCuentaBancoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCuentaBancoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCuentaBancoPunVen.setLineWrap(true);
		jTextAreanombreCuentaBancoPunVen.setWrapStyleWord(true);
		jTextAreanombreCuentaBancoPunVen.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreCuentaBancoPunVen.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreCuentaBancoPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreCuentaBancoPunVen = new JScrollPane(jTextAreanombreCuentaBancoPunVen);
		jscrollPanenombreCuentaBancoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCuentaBancoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCuentaBancoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreCuentaBancoPunVenBusqueda= new JButtonMe();
		this.jButtonnombreCuentaBancoPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCuentaBancoPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCuentaBancoPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreCuentaBancoPunVenBusqueda.setText("U");
		this.jButtonnombreCuentaBancoPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreCuentaBancoPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreCuentaBancoPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreCuentaBancoPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreCuentaBancoPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreCuentaBancoPunVenBusqueda"));

		if(this.cuentabancopunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreCuentaBancoPunVenBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCuentaBancoPunVen() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCuentaBancoPunVen = new JLabelMe();
		this.jLabelid_empresaCuentaBancoPunVen.setText(""+CuentaBancoPunVenConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCuentaBancoPunVen.setToolTipText("Empresa");
		this.jLabelid_empresaCuentaBancoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCuentaBancoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCuentaBancoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCuentaBancoPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCuentaBancoPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCuentaBancoPunVen.setToolTipText(CuentaBancoPunVenConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCuentaBancoPunVen = new GridBagLayout();
		this.jPanelid_empresaCuentaBancoPunVen.setLayout(this.gridaBagLayoutCuentaBancoPunVen);


		jComboBoxid_empresaCuentaBancoPunVen= new JComboBoxMe();
		jComboBoxid_empresaCuentaBancoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCuentaBancoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCuentaBancoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCuentaBancoPunVen,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCuentaBancoPunVen.setEnabled(false);

		this.jButtonid_empresaCuentaBancoPunVen= new JButtonMe();
		this.jButtonid_empresaCuentaBancoPunVen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCuentaBancoPunVen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCuentaBancoPunVen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCuentaBancoPunVen.setText("Buscar");
		this.jButtonid_empresaCuentaBancoPunVen.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCuentaBancoPunVen.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCuentaBancoPunVen,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCuentaBancoPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCuentaBancoPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCuentaBancoPunVen"));

		this.jButtonid_empresaCuentaBancoPunVenBusqueda= new JButtonMe();
		this.jButtonid_empresaCuentaBancoPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCuentaBancoPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCuentaBancoPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCuentaBancoPunVenBusqueda.setText("U");
		this.jButtonid_empresaCuentaBancoPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCuentaBancoPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCuentaBancoPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCuentaBancoPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCuentaBancoPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCuentaBancoPunVenBusqueda"));

		if(this.cuentabancopunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCuentaBancoPunVenBusqueda.setVisible(false);		}

		this.jButtonid_empresaCuentaBancoPunVenUpdate= new JButtonMe();
		this.jButtonid_empresaCuentaBancoPunVenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCuentaBancoPunVenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCuentaBancoPunVenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCuentaBancoPunVenUpdate.setText("U");
		this.jButtonid_empresaCuentaBancoPunVenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCuentaBancoPunVenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCuentaBancoPunVenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCuentaBancoPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCuentaBancoPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCuentaBancoPunVenUpdate"));



					
		this.jLabelid_sucursalCuentaBancoPunVen = new JLabelMe();
		this.jLabelid_sucursalCuentaBancoPunVen.setText(""+CuentaBancoPunVenConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalCuentaBancoPunVen.setToolTipText("Sucursal");
		this.jLabelid_sucursalCuentaBancoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCuentaBancoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCuentaBancoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalCuentaBancoPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalCuentaBancoPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalCuentaBancoPunVen.setToolTipText(CuentaBancoPunVenConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutCuentaBancoPunVen = new GridBagLayout();
		this.jPanelid_sucursalCuentaBancoPunVen.setLayout(this.gridaBagLayoutCuentaBancoPunVen);


		jComboBoxid_sucursalCuentaBancoPunVen= new JComboBoxMe();
		jComboBoxid_sucursalCuentaBancoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCuentaBancoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCuentaBancoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalCuentaBancoPunVen,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalCuentaBancoPunVen.setEnabled(false);

		this.jButtonid_sucursalCuentaBancoPunVen= new JButtonMe();
		this.jButtonid_sucursalCuentaBancoPunVen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCuentaBancoPunVen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCuentaBancoPunVen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCuentaBancoPunVen.setText("Buscar");
		this.jButtonid_sucursalCuentaBancoPunVen.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalCuentaBancoPunVen.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCuentaBancoPunVen,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalCuentaBancoPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCuentaBancoPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCuentaBancoPunVen"));

		this.jButtonid_sucursalCuentaBancoPunVenBusqueda= new JButtonMe();
		this.jButtonid_sucursalCuentaBancoPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCuentaBancoPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCuentaBancoPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCuentaBancoPunVenBusqueda.setText("U");
		this.jButtonid_sucursalCuentaBancoPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalCuentaBancoPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCuentaBancoPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalCuentaBancoPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCuentaBancoPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCuentaBancoPunVenBusqueda"));

		if(this.cuentabancopunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalCuentaBancoPunVenBusqueda.setVisible(false);		}

		this.jButtonid_sucursalCuentaBancoPunVenUpdate= new JButtonMe();
		this.jButtonid_sucursalCuentaBancoPunVenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCuentaBancoPunVenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCuentaBancoPunVenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCuentaBancoPunVenUpdate.setText("U");
		this.jButtonid_sucursalCuentaBancoPunVenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalCuentaBancoPunVenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCuentaBancoPunVenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalCuentaBancoPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCuentaBancoPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCuentaBancoPunVenUpdate"));



					
		this.jLabelid_bancoCuentaBancoPunVen = new JLabelMe();
		this.jLabelid_bancoCuentaBancoPunVen.setText(""+CuentaBancoPunVenConstantesFunciones.LABEL_IDBANCO+" : *");
		this.jLabelid_bancoCuentaBancoPunVen.setToolTipText("Banco");
		this.jLabelid_bancoCuentaBancoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bancoCuentaBancoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bancoCuentaBancoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bancoCuentaBancoPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bancoCuentaBancoPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bancoCuentaBancoPunVen.setToolTipText(CuentaBancoPunVenConstantesFunciones.LABEL_IDBANCO);
		this.gridaBagLayoutCuentaBancoPunVen = new GridBagLayout();
		this.jPanelid_bancoCuentaBancoPunVen.setLayout(this.gridaBagLayoutCuentaBancoPunVen);


		jComboBoxid_bancoCuentaBancoPunVen= new JComboBoxMe();
		jComboBoxid_bancoCuentaBancoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoCuentaBancoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoCuentaBancoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bancoCuentaBancoPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bancoCuentaBancoPunVen= new JButtonMe();
		this.jButtonid_bancoCuentaBancoPunVen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoCuentaBancoPunVen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoCuentaBancoPunVen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoCuentaBancoPunVen.setText("Buscar");
		this.jButtonid_bancoCuentaBancoPunVen.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bancoCuentaBancoPunVen.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoCuentaBancoPunVen,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bancoCuentaBancoPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoCuentaBancoPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoCuentaBancoPunVen"));

		this.jButtonid_bancoCuentaBancoPunVenBusqueda= new JButtonMe();
		this.jButtonid_bancoCuentaBancoPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoCuentaBancoPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoCuentaBancoPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bancoCuentaBancoPunVenBusqueda.setText("U");
		this.jButtonid_bancoCuentaBancoPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bancoCuentaBancoPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoCuentaBancoPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bancoCuentaBancoPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoCuentaBancoPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoCuentaBancoPunVenBusqueda"));

		if(this.cuentabancopunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bancoCuentaBancoPunVenBusqueda.setVisible(false);		}

		this.jButtonid_bancoCuentaBancoPunVenUpdate= new JButtonMe();
		this.jButtonid_bancoCuentaBancoPunVenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoCuentaBancoPunVenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoCuentaBancoPunVenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bancoCuentaBancoPunVenUpdate.setText("U");
		this.jButtonid_bancoCuentaBancoPunVenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bancoCuentaBancoPunVenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoCuentaBancoPunVenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bancoCuentaBancoPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoCuentaBancoPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoCuentaBancoPunVenUpdate"));



					
		this.jLabelid_clienteCuentaBancoPunVen = new JLabelMe();
		this.jLabelid_clienteCuentaBancoPunVen.setText(""+CuentaBancoPunVenConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteCuentaBancoPunVen.setToolTipText("Cliente");
		this.jLabelid_clienteCuentaBancoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteCuentaBancoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteCuentaBancoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteCuentaBancoPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteCuentaBancoPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteCuentaBancoPunVen.setToolTipText(CuentaBancoPunVenConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutCuentaBancoPunVen = new GridBagLayout();
		this.jPanelid_clienteCuentaBancoPunVen.setLayout(this.gridaBagLayoutCuentaBancoPunVen);


		jComboBoxid_clienteCuentaBancoPunVen= new JComboBoxMe();
		jComboBoxid_clienteCuentaBancoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteCuentaBancoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteCuentaBancoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteCuentaBancoPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteCuentaBancoPunVen= new JButtonMe();
		this.jButtonid_clienteCuentaBancoPunVen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteCuentaBancoPunVen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteCuentaBancoPunVen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteCuentaBancoPunVen.setText("Buscar");
		this.jButtonid_clienteCuentaBancoPunVen.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteCuentaBancoPunVen.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteCuentaBancoPunVen,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteCuentaBancoPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteCuentaBancoPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteCuentaBancoPunVen"));

		this.jButtonid_clienteCuentaBancoPunVenBusqueda= new JButtonMe();
		this.jButtonid_clienteCuentaBancoPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteCuentaBancoPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteCuentaBancoPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteCuentaBancoPunVenBusqueda.setText("U");
		this.jButtonid_clienteCuentaBancoPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteCuentaBancoPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteCuentaBancoPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteCuentaBancoPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteCuentaBancoPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteCuentaBancoPunVenBusqueda"));

		if(this.cuentabancopunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteCuentaBancoPunVenBusqueda.setVisible(false);		}

		this.jButtonid_clienteCuentaBancoPunVenUpdate= new JButtonMe();
		this.jButtonid_clienteCuentaBancoPunVenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteCuentaBancoPunVenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteCuentaBancoPunVenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteCuentaBancoPunVenUpdate.setText("U");
		this.jButtonid_clienteCuentaBancoPunVenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteCuentaBancoPunVenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteCuentaBancoPunVenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteCuentaBancoPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteCuentaBancoPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteCuentaBancoPunVenUpdate"));



					
		this.jLabelid_cuenta_contableCuentaBancoPunVen = new JLabelMe();
		this.jLabelid_cuenta_contableCuentaBancoPunVen.setText(""+CuentaBancoPunVenConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableCuentaBancoPunVen.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contableCuentaBancoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableCuentaBancoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableCuentaBancoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableCuentaBancoPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableCuentaBancoPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableCuentaBancoPunVen.setToolTipText(CuentaBancoPunVenConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutCuentaBancoPunVen = new GridBagLayout();
		this.jPanelid_cuenta_contableCuentaBancoPunVen.setLayout(this.gridaBagLayoutCuentaBancoPunVen);


		jComboBoxid_cuenta_contableCuentaBancoPunVen= new JComboBoxMe();
		jComboBoxid_cuenta_contableCuentaBancoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableCuentaBancoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableCuentaBancoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableCuentaBancoPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableCuentaBancoPunVen= new JButtonMe();
		this.jButtonid_cuenta_contableCuentaBancoPunVen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableCuentaBancoPunVen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableCuentaBancoPunVen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableCuentaBancoPunVen.setText("Buscar");
		this.jButtonid_cuenta_contableCuentaBancoPunVen.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableCuentaBancoPunVen.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCuentaBancoPunVen,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableCuentaBancoPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCuentaBancoPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCuentaBancoPunVen"));

		this.jButtonid_cuenta_contableCuentaBancoPunVenBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableCuentaBancoPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCuentaBancoPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCuentaBancoPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableCuentaBancoPunVenBusqueda.setText("U");
		this.jButtonid_cuenta_contableCuentaBancoPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableCuentaBancoPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCuentaBancoPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableCuentaBancoPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCuentaBancoPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCuentaBancoPunVenBusqueda"));

		if(this.cuentabancopunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableCuentaBancoPunVenBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableCuentaBancoPunVenUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableCuentaBancoPunVenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCuentaBancoPunVenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCuentaBancoPunVenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableCuentaBancoPunVenUpdate.setText("U");
		this.jButtonid_cuenta_contableCuentaBancoPunVenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableCuentaBancoPunVenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCuentaBancoPunVenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableCuentaBancoPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCuentaBancoPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCuentaBancoPunVenUpdate"));


		jButtonid_cuenta_contableCuentaBancoPunVenArbol= new JButtonMe();
		jButtonid_cuenta_contableCuentaBancoPunVenArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableCuentaBancoPunVenArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableCuentaBancoPunVenArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableCuentaBancoPunVenArbol.setText("Arbol");
		jButtonid_cuenta_contableCuentaBancoPunVenArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contableCuentaBancoPunVenArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCuentaBancoPunVenArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contableCuentaBancoPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCuentaBancoPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCuentaBancoPunVenArbol"));



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
		//this.jInternalFrameDetalleCuentaBancoPunVen = new CuentaBancoPunVenBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cuenta Banco DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCuentaBancoPunVen= new GridBagLayout();
		

		
		String sToolTipCuentaBancoPunVen="";
		sToolTipCuentaBancoPunVen=CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCuentaBancoPunVen+="(PuntoVenta.CuentaBancoPunVen)";
		}
		
		if(!this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {
			sToolTipCuentaBancoPunVen+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCuentaBancoPunVen = new JButtonMe();
		this.jButtonModificarCuentaBancoPunVen = new JButtonMe();
        this.jButtonActualizarCuentaBancoPunVen = new JButtonMe();
        this.jButtonEliminarCuentaBancoPunVen = new JButtonMe();
        this.jButtonCancelarCuentaBancoPunVen = new JButtonMe();
        this.jButtonGuardarCambiosCuentaBancoPunVen = new JButtonMe();
		this.jButtonGuardarCambiosTablaCuentaBancoPunVen = new JButtonMe();
		this.jButtonCerrarCuentaBancoPunVen = new JButtonMe();
		
		this.jScrollPanelDatosCuentaBancoPunVen = new JScrollPane();   
        this.jScrollPanelDatosEdicionCuentaBancoPunVen = new JScrollPane();
		this.jScrollPanelDatosGeneralCuentaBancoPunVen = new JScrollPane();
				
		
		
		this.jPanelCamposCuentaBancoPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCuentaBancoPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCuentaBancoPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCuentaBancoPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cuenta Banco";
		
		if(!this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCuentaBancoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Bancoes" + this.sPath));
		} else {
			this.jScrollPanelDatosCuentaBancoPunVen.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCuentaBancoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCuentaBancoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCuentaBancoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCuentaBancoPunVen.setName("jPanelCamposCuentaBancoPunVen"); 

		this.jPanelCamposOcultosCuentaBancoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCuentaBancoPunVen.setName("jPanelCamposOcultosCuentaBancoPunVen"); 

        this.jPanelAccionesCuentaBancoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCuentaBancoPunVen.setToolTipText("Acciones");
        this.jPanelAccionesCuentaBancoPunVen.setName("Acciones"); 

		this.jPanelAccionesFormularioCuentaBancoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCuentaBancoPunVen.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCuentaBancoPunVen.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCuentaBancoPunVen.setText("Nuevo");
		this.jButtonModificarCuentaBancoPunVen.setText("Editar");
        this.jButtonActualizarCuentaBancoPunVen.setText("Actualizar");
        this.jButtonEliminarCuentaBancoPunVen.setText("Eliminar");
        this.jButtonCancelarCuentaBancoPunVen.setText("Cancelar");
        this.jButtonGuardarCambiosCuentaBancoPunVen.setText("Guardar");
		this.jButtonGuardarCambiosTablaCuentaBancoPunVen.setText("Guardar");
		this.jButtonCerrarCuentaBancoPunVen.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCuentaBancoPunVen,"nuevo_button","Nuevo",this.cuentabancopunvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCuentaBancoPunVen,"modificar_button","Editar",this.cuentabancopunvenSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCuentaBancoPunVen,"actualizar_button","Actualizar",this.cuentabancopunvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCuentaBancoPunVen,"eliminar_button","Eliminar",this.cuentabancopunvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCuentaBancoPunVen,"cancelar_button","Cancelar",this.cuentabancopunvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCuentaBancoPunVen,"guardarcambios_button","Guardar",this.cuentabancopunvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCuentaBancoPunVen,"guardarcambiostabla_button","Guardar",this.cuentabancopunvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCuentaBancoPunVen,"cerrar_button","Salir",this.cuentabancopunvenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCuentaBancoPunVen.setToolTipText("Nuevo"+" "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCuentaBancoPunVen.setToolTipText("Editar"+" "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCuentaBancoPunVen.setToolTipText("Actualizar"+" "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCuentaBancoPunVen.setToolTipText("Eliminar)"+" "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCuentaBancoPunVen.setToolTipText("Cancelar"+" "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCuentaBancoPunVen.setToolTipText("Guardar"+" "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCuentaBancoPunVen.setToolTipText("Guardar"+" "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCuentaBancoPunVen.setToolTipText("Salir"+" "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCuentaBancoPunVen";
		inputMap = this.jButtonNuevoCuentaBancoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCuentaBancoPunVen.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCuentaBancoPunVen"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCuentaBancoPunVen";
		inputMap = this.jButtonActualizarCuentaBancoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCuentaBancoPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCuentaBancoPunVen"));
		
		//ELIMINAR
		sMapKey = "EliminarCuentaBancoPunVen";
		inputMap = this.jButtonEliminarCuentaBancoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCuentaBancoPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCuentaBancoPunVen"));
		
		//CANCELAR	
		sMapKey = "CancelarCuentaBancoPunVen";
		inputMap = this.jButtonCancelarCuentaBancoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCuentaBancoPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCuentaBancoPunVen"));
		
		//CERRAR		
		sMapKey = "CerrarCuentaBancoPunVen";
		inputMap = this.jButtonCerrarCuentaBancoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCuentaBancoPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCuentaBancoPunVen"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCuentaBancoPunVen";
		inputMap = this.jButtonGuardarCambiosTablaCuentaBancoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCuentaBancoPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCuentaBancoPunVen"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCuentaBancoPunVen = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCuentaBancoPunVen.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCuentaBancoPunVen.setToolTipText("Nuevo CuentaBancoPunVen");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCuentaBancoPunVen = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCuentaBancoPunVen.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCuentaBancoPunVen.setToolTipText("Sin Cerrar Ventana CuentaBancoPunVen");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCuentaBancoPunVen = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCuentaBancoPunVen.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCuentaBancoPunVen.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCuentaBancoPunVen = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCuentaBancoPunVen.setText("Accion");
		this.jComboBoxTiposAccionesCuentaBancoPunVen.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCuentaBancoPunVen = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCuentaBancoPunVen.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCuentaBancoPunVen.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCuentaBancoPunVen = new JLabelMe();
		
		this.jLabelAccionesCuentaBancoPunVen.setText("Acciones");		
		this.jLabelAccionesCuentaBancoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentaBancoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentaBancoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCuentaBancoPunVen();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCuentaBancoPunVen();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCuentaBancoPunVen=new JTabbedPane();
		this.jTabbedPaneRelacionesCuentaBancoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCuentaBancoPunVen,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCuentaBancoPunVen.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentaBancoPunVen.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentaBancoPunVen.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCuentaBancoPunVen.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCuentaBancoPunVen.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCuentaBancoPunVen.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCuentaBancoPunVen = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCuentaBancoPunVen = new GridBagLayout();
		
		this.jPanelCamposCuentaBancoPunVen.setLayout(gridaBagLayoutCamposCuentaBancoPunVen);
		this.jPanelCamposOcultosCuentaBancoPunVen.setLayout(gridaBagLayoutCamposOcultosCuentaBancoPunVen);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
	this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;
	this.gridBagConstraintsCuentaBancoPunVen.gridx = 0;
	this.gridBagConstraintsCuentaBancoPunVen.ipadx = 0;
	this.gridBagConstraintsCuentaBancoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCuentaBancoPunVen.add(jLabelIdCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);



	this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
	this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;
	this.gridBagConstraintsCuentaBancoPunVen.gridx = 1;
	this.gridBagConstraintsCuentaBancoPunVen.ipadx = 0;
	this.gridBagConstraintsCuentaBancoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCuentaBancoPunVen.add(jLabelidCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);


	this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
	this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;
	this.gridBagConstraintsCuentaBancoPunVen.gridx = 0;
	this.gridBagConstraintsCuentaBancoPunVen.ipadx = 0;
	this.gridBagConstraintsCuentaBancoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCuentaBancoPunVen.add(jLabelid_empresaCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;
		this.gridBagConstraintsCuentaBancoPunVen.gridx = 2;
		this.gridBagConstraintsCuentaBancoPunVen.ipadx = 0;
		this.gridBagConstraintsCuentaBancoPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCuentaBancoPunVen.add(jButtonid_empresaCuentaBancoPunVenBusqueda, this.gridBagConstraintsCuentaBancoPunVen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;
		this.gridBagConstraintsCuentaBancoPunVen.gridx = 3;
		this.gridBagConstraintsCuentaBancoPunVen.ipadx = 0;
		this.gridBagConstraintsCuentaBancoPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCuentaBancoPunVen.add(jButtonid_empresaCuentaBancoPunVenUpdate, this.gridBagConstraintsCuentaBancoPunVen);
	}

	this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
	this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;
	this.gridBagConstraintsCuentaBancoPunVen.gridx = 1;
	this.gridBagConstraintsCuentaBancoPunVen.ipadx = 0;
	this.gridBagConstraintsCuentaBancoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCuentaBancoPunVen.add(jComboBoxid_empresaCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);


	this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
	this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;
	this.gridBagConstraintsCuentaBancoPunVen.gridx = 0;
	this.gridBagConstraintsCuentaBancoPunVen.ipadx = 0;
	this.gridBagConstraintsCuentaBancoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalCuentaBancoPunVen.add(jLabelid_sucursalCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;
		this.gridBagConstraintsCuentaBancoPunVen.gridx = 2;
		this.gridBagConstraintsCuentaBancoPunVen.ipadx = 0;
		this.gridBagConstraintsCuentaBancoPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCuentaBancoPunVen.add(jButtonid_sucursalCuentaBancoPunVenBusqueda, this.gridBagConstraintsCuentaBancoPunVen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;
		this.gridBagConstraintsCuentaBancoPunVen.gridx = 3;
		this.gridBagConstraintsCuentaBancoPunVen.ipadx = 0;
		this.gridBagConstraintsCuentaBancoPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCuentaBancoPunVen.add(jButtonid_sucursalCuentaBancoPunVenUpdate, this.gridBagConstraintsCuentaBancoPunVen);
	}

	this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
	this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;
	this.gridBagConstraintsCuentaBancoPunVen.gridx = 1;
	this.gridBagConstraintsCuentaBancoPunVen.ipadx = 0;
	this.gridBagConstraintsCuentaBancoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalCuentaBancoPunVen.add(jComboBoxid_sucursalCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);


	this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
	this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;
	this.gridBagConstraintsCuentaBancoPunVen.gridx = 0;
	this.gridBagConstraintsCuentaBancoPunVen.ipadx = 0;
	this.gridBagConstraintsCuentaBancoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bancoCuentaBancoPunVen.add(jLabelid_bancoCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;
		this.gridBagConstraintsCuentaBancoPunVen.gridx = 2;
		this.gridBagConstraintsCuentaBancoPunVen.ipadx = 0;
		this.gridBagConstraintsCuentaBancoPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bancoCuentaBancoPunVen.add(jButtonid_bancoCuentaBancoPunVenBusqueda, this.gridBagConstraintsCuentaBancoPunVen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;
		this.gridBagConstraintsCuentaBancoPunVen.gridx = 3;
		this.gridBagConstraintsCuentaBancoPunVen.ipadx = 0;
		this.gridBagConstraintsCuentaBancoPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bancoCuentaBancoPunVen.add(jButtonid_bancoCuentaBancoPunVenUpdate, this.gridBagConstraintsCuentaBancoPunVen);
	}

	this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
	this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;
	this.gridBagConstraintsCuentaBancoPunVen.gridx = 1;
	this.gridBagConstraintsCuentaBancoPunVen.ipadx = 0;
	this.gridBagConstraintsCuentaBancoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bancoCuentaBancoPunVen.add(jComboBoxid_bancoCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);


	this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
	this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;
	this.gridBagConstraintsCuentaBancoPunVen.gridx = 0;
	this.gridBagConstraintsCuentaBancoPunVen.ipadx = 0;
	this.gridBagConstraintsCuentaBancoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteCuentaBancoPunVen.add(jLabelid_clienteCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
	//this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;
	this.gridBagConstraintsCuentaBancoPunVen.gridx = 2;
	this.gridBagConstraintsCuentaBancoPunVen.ipadx = 0;
	this.gridBagConstraintsCuentaBancoPunVen.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteCuentaBancoPunVen.add(jButtonid_clienteCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;
		this.gridBagConstraintsCuentaBancoPunVen.gridx = 3;
		this.gridBagConstraintsCuentaBancoPunVen.ipadx = 0;
		this.gridBagConstraintsCuentaBancoPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteCuentaBancoPunVen.add(jButtonid_clienteCuentaBancoPunVenBusqueda, this.gridBagConstraintsCuentaBancoPunVen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;
		this.gridBagConstraintsCuentaBancoPunVen.gridx = 4;
		this.gridBagConstraintsCuentaBancoPunVen.ipadx = 0;
		this.gridBagConstraintsCuentaBancoPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteCuentaBancoPunVen.add(jButtonid_clienteCuentaBancoPunVenUpdate, this.gridBagConstraintsCuentaBancoPunVen);
	}

	this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
	this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;
	this.gridBagConstraintsCuentaBancoPunVen.gridx = 1;
	this.gridBagConstraintsCuentaBancoPunVen.ipadx = 0;
	this.gridBagConstraintsCuentaBancoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteCuentaBancoPunVen.add(jComboBoxid_clienteCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);


	this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
	this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;
	this.gridBagConstraintsCuentaBancoPunVen.gridx = 0;
	this.gridBagConstraintsCuentaBancoPunVen.ipadx = 0;
	this.gridBagConstraintsCuentaBancoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableCuentaBancoPunVen.add(jLabelid_cuenta_contableCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;
		this.gridBagConstraintsCuentaBancoPunVen.gridx = 2;
		this.gridBagConstraintsCuentaBancoPunVen.ipadx = 0;
		this.gridBagConstraintsCuentaBancoPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableCuentaBancoPunVen.add(jButtonid_cuenta_contableCuentaBancoPunVenBusqueda, this.gridBagConstraintsCuentaBancoPunVen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;
		this.gridBagConstraintsCuentaBancoPunVen.gridx = 3;
		this.gridBagConstraintsCuentaBancoPunVen.ipadx = 0;
		this.gridBagConstraintsCuentaBancoPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableCuentaBancoPunVen.add(jButtonid_cuenta_contableCuentaBancoPunVenUpdate, this.gridBagConstraintsCuentaBancoPunVen);
	}

	this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
	this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;
	this.gridBagConstraintsCuentaBancoPunVen.gridx = 1;
	this.gridBagConstraintsCuentaBancoPunVen.ipadx = 0;
	this.gridBagConstraintsCuentaBancoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableCuentaBancoPunVen.add(jComboBoxid_cuenta_contableCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);


	this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
	this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;
	this.gridBagConstraintsCuentaBancoPunVen.gridx = 0;
	this.gridBagConstraintsCuentaBancoPunVen.ipadx = 0;
	this.gridBagConstraintsCuentaBancoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoCuentaBancoPunVen.add(jLabelcodigoCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;
		this.gridBagConstraintsCuentaBancoPunVen.gridx = 2;
		this.gridBagConstraintsCuentaBancoPunVen.ipadx = 0;
		this.gridBagConstraintsCuentaBancoPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoCuentaBancoPunVen.add(jButtoncodigoCuentaBancoPunVenBusqueda, this.gridBagConstraintsCuentaBancoPunVen);
	}

	this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
	this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;
	this.gridBagConstraintsCuentaBancoPunVen.gridx = 1;
	this.gridBagConstraintsCuentaBancoPunVen.ipadx = 0;
	this.gridBagConstraintsCuentaBancoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoCuentaBancoPunVen.add(jTextFieldcodigoCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);


	this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
	this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;
	this.gridBagConstraintsCuentaBancoPunVen.gridx = 0;
	this.gridBagConstraintsCuentaBancoPunVen.ipadx = 0;
	this.gridBagConstraintsCuentaBancoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreCuentaBancoPunVen.add(jLabelnombreCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;
		this.gridBagConstraintsCuentaBancoPunVen.gridx = 2;
		this.gridBagConstraintsCuentaBancoPunVen.ipadx = 0;
		this.gridBagConstraintsCuentaBancoPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreCuentaBancoPunVen.add(jButtonnombreCuentaBancoPunVenBusqueda, this.gridBagConstraintsCuentaBancoPunVen);
	}

	this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
	this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;
	this.gridBagConstraintsCuentaBancoPunVen.gridx = 1;
	this.gridBagConstraintsCuentaBancoPunVen.ipadx = 0;
	this.gridBagConstraintsCuentaBancoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreCuentaBancoPunVen.add(jscrollPanenombreCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
	this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaBancoPunVen.gridy = iYPanelCamposCuentaBancoPunVen;
	this.gridBagConstraintsCuentaBancoPunVen.gridx = iXPanelCamposCuentaBancoPunVen++;
	this.gridBagConstraintsCuentaBancoPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaBancoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaBancoPunVen.add(this.jPanelidCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);



	if(iXPanelCamposCuentaBancoPunVen % 1==0) {
		iXPanelCamposCuentaBancoPunVen=0;
		iYPanelCamposCuentaBancoPunVen++;
	}
	this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
	this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaBancoPunVen.gridy = iYPanelCamposCuentaBancoPunVen;
	this.gridBagConstraintsCuentaBancoPunVen.gridx = iXPanelCamposCuentaBancoPunVen++;
	this.gridBagConstraintsCuentaBancoPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaBancoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaBancoPunVen.add(this.jPanelid_bancoCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);



	if(iXPanelCamposCuentaBancoPunVen % 1==0) {
		iXPanelCamposCuentaBancoPunVen=0;
		iYPanelCamposCuentaBancoPunVen++;
	}
	this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
	this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaBancoPunVen.gridy = iYPanelCamposCuentaBancoPunVen;
	this.gridBagConstraintsCuentaBancoPunVen.gridx = iXPanelCamposCuentaBancoPunVen++;
	this.gridBagConstraintsCuentaBancoPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaBancoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaBancoPunVen.add(this.jPanelid_clienteCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);



	if(iXPanelCamposCuentaBancoPunVen % 1==0) {
		iXPanelCamposCuentaBancoPunVen=0;
		iYPanelCamposCuentaBancoPunVen++;
	}
	this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
	this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaBancoPunVen.gridy = iYPanelCamposCuentaBancoPunVen;
	this.gridBagConstraintsCuentaBancoPunVen.gridx = iXPanelCamposCuentaBancoPunVen++;
	this.gridBagConstraintsCuentaBancoPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaBancoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaBancoPunVen.add(this.jPanelid_cuenta_contableCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);



	if(iXPanelCamposCuentaBancoPunVen % 1==0) {
		iXPanelCamposCuentaBancoPunVen=0;
		iYPanelCamposCuentaBancoPunVen++;
	}
	this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
	this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaBancoPunVen.gridy = iYPanelCamposCuentaBancoPunVen;
	this.gridBagConstraintsCuentaBancoPunVen.gridx = iXPanelCamposCuentaBancoPunVen++;
	this.gridBagConstraintsCuentaBancoPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaBancoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaBancoPunVen.add(this.jPanelcodigoCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);



	if(iXPanelCamposCuentaBancoPunVen % 1==0) {
		iXPanelCamposCuentaBancoPunVen=0;
		iYPanelCamposCuentaBancoPunVen++;
	}
	this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
	this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaBancoPunVen.gridy = iYPanelCamposCuentaBancoPunVen;
	this.gridBagConstraintsCuentaBancoPunVen.gridx = iXPanelCamposCuentaBancoPunVen++;
	this.gridBagConstraintsCuentaBancoPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaBancoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaBancoPunVen.add(this.jPanelnombreCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);



	if(iXPanelCamposCuentaBancoPunVen % 1==0) {
		iXPanelCamposCuentaBancoPunVen=0;
		iYPanelCamposCuentaBancoPunVen++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
	this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaBancoPunVen.gridy = iYPanelCamposOcultosCuentaBancoPunVen;
	this.gridBagConstraintsCuentaBancoPunVen.gridx = iXPanelCamposOcultosCuentaBancoPunVen++;
	this.gridBagConstraintsCuentaBancoPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaBancoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCuentaBancoPunVen.add(this.jPanelid_empresaCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);



	if(iXPanelCamposOcultosCuentaBancoPunVen % 1==0) {
		iXPanelCamposOcultosCuentaBancoPunVen=0;
		iYPanelCamposOcultosCuentaBancoPunVen++;
	}
	this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
	this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaBancoPunVen.gridy = iYPanelCamposOcultosCuentaBancoPunVen;
	this.gridBagConstraintsCuentaBancoPunVen.gridx = iXPanelCamposOcultosCuentaBancoPunVen++;
	this.gridBagConstraintsCuentaBancoPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaBancoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCuentaBancoPunVen.add(this.jPanelid_sucursalCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);



	if(iXPanelCamposOcultosCuentaBancoPunVen % 1==0) {
		iXPanelCamposOcultosCuentaBancoPunVen=0;
		iYPanelCamposOcultosCuentaBancoPunVen++;
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
			
		GridBagLayout gridaBagLayoutAccionesCuentaBancoPunVen= new GridBagLayout();
		this.jPanelAccionesCuentaBancoPunVen.setLayout(gridaBagLayoutAccionesCuentaBancoPunVen);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCuentaBancoPunVen= new GridBagLayout();
		this.jPanelAccionesFormularioCuentaBancoPunVen.setLayout(gridaBagLayoutAccionesFormularioCuentaBancoPunVen);
		
		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCuentaBancoPunVen.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCuentaBancoPunVen.add(this.jComboBoxTiposAccionesFormularioCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);

		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCuentaBancoPunVen.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCuentaBancoPunVen.add(this.jCheckBoxPostAccionNuevoCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.cuentabancopunvenSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCuentaBancoPunVen.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCuentaBancoPunVen.add(this.jCheckBoxPostAccionSinCerrarCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.cuentabancopunvenSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCuentaBancoPunVen.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCuentaBancoPunVen.add(this.jCheckBoxPostAccionSinMensajeCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;
		this.gridBagConstraintsCuentaBancoPunVen.gridx = iPosXAccion++;
			
		this.jPanelAccionesCuentaBancoPunVen.add(this.jButtonModificarCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);							

		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;
		this.gridBagConstraintsCuentaBancoPunVen.gridx =iPosXAccion++;
			
		this.jPanelAccionesCuentaBancoPunVen.add(this.jButtonEliminarCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
		
			
		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;		
		this.gridBagConstraintsCuentaBancoPunVen.gridx = iPosXAccion++;
		
		this.jPanelAccionesCuentaBancoPunVen.add(this.jButtonActualizarCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);


		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;		
		this.gridBagConstraintsCuentaBancoPunVen.gridx = iPosXAccion++;
		
		this.jPanelAccionesCuentaBancoPunVen.add(this.jButtonGuardarCambiosCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);	
		
		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;		
		this.gridBagConstraintsCuentaBancoPunVen.gridx =iPosXAccion++;
		
		this.jPanelAccionesCuentaBancoPunVen.add(this.jButtonCancelarCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCuentaBancoPunVen = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCuentaBancoPunVen);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();						
			this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCuentaBancoPunVen.gridx = 0;		
			//this.gridBagConstraintsCuentaBancoPunVen.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCuentaBancoPunVen.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		this.gridBagConstraintsCuentaBancoPunVen.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCuentaBancoPunVen.gridx =0;
		this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCuentaBancoPunVen.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CuentaBancoPunVenJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCuentaBancoPunVen = new CuentaBancoPunVenBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cuenta Banco DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cuenta Banco DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cuenta Banco Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CuentaBancoPunVenModel cuentabancopunvenModel=new CuentaBancoPunVenModel(this);
			
			//SI USARA CLASE INTERNA
			//CuentaBancoPunVenModel.CuentaBancoPunVenFocusTraversalPolicy cuentabancopunvenFocusTraversalPolicy = cuentabancopunvenModel.new CuentaBancoPunVenFocusTraversalPolicy(this);
			
			//cuentabancopunvenFocusTraversalPolicy.setcuentabancopunvenJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cuentabancopunvenModel);
			
			
			this.jContentPaneDetalleCuentaBancoPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCuentaBancoPunVen = new GridBagLayout();	
			this.jContentPaneDetalleCuentaBancoPunVen.setLayout(gridaBagLayoutDetalleCuentaBancoPunVen);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCuentaBancoPunVen = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
				this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCuentaBancoPunVen.gridx = 0;
					
				
				this.jContentPaneDetalleCuentaBancoPunVen.add(jTtoolBarDetalleCuentaBancoPunVen, gridBagConstraintsCuentaBancoPunVen);								
				
}
			
			this.jScrollPanelDatosEdicionCuentaBancoPunVen=   new JScrollPane(jContentPaneDetalleCuentaBancoPunVen,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCuentaBancoPunVen.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentaBancoPunVen.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentaBancoPunVen.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCuentaBancoPunVen=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCuentaBancoPunVen.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentaBancoPunVen.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentaBancoPunVen.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCuentaBancoPunVen.gridx = 0;
	        
			this.jContentPaneDetalleCuentaBancoPunVen.add(jPanelCamposCuentaBancoPunVen, gridBagConstraintsCuentaBancoPunVen);
			
			
			
			
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
						&& cuentabancopunvenSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameFormaPagoPuntoVenta(this.puedeCargarPorParteFormaPagoPuntoVenta,false,-1);
					
					if(this.cuentabancopunvenSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCuentaBancoPunVen= new GridBagConstraints();
						this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCuentaBancoPunVen.gridx = 0;
						this.jContentPaneDetalleCuentaBancoPunVen.add(this.jTabbedPaneRelacionesCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCuentaBancoPunVen.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameFormaPagoPuntoVenta(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCuentaBancoPunVen.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
					this.gridBagConstraintsCuentaBancoPunVen.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCuentaBancoPunVen.gridx = 0;
					
				
					this.jContentPaneDetalleCuentaBancoPunVen.add(jPanelCamposOcultosCuentaBancoPunVen, gridBagConstraintsCuentaBancoPunVen);
				
					this.jPanelCamposOcultosCuentaBancoPunVen.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsCuentaBancoPunVen.gridx = 0;
	        this.gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCuentaBancoPunVen.add(this.jPanelAccionesFormularioCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);							
			
			
			
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
	        this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsCuentaBancoPunVen.gridx = 0;
	        
			
			this.jContentPaneDetalleCuentaBancoPunVen.add(this.jPanelAccionesCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCuentaBancoPunVen);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCuentaBancoPunVen=   new JScrollPane(this.jPanelCamposCuentaBancoPunVen,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCuentaBancoPunVen.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentaBancoPunVen.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentaBancoPunVen.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCuentaBancoPunVen.gridx = 0;
			this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCuentaBancoPunVen.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			this.gridBagConstraintsCuentaBancoPunVen.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCuentaBancoPunVen.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);			
			
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			this.gridBagConstraintsCuentaBancoPunVen.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCuentaBancoPunVen.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaBancoPunVen.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
			
			
		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaBancoPunVen.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
		
			
		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		this.gridBagConstraintsCuentaBancoPunVen.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCuentaBancoPunVen.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCuentaBancoPunVen;//jContentPane;
		
		return jScrollPanelDatosEdicionCuentaBancoPunVen;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameFormaPagoPuntoVenta(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.formapagopuntoventaSessionBean=new FormaPagoPuntoVentaSessionBean();
		this.formapagopuntoventaSessionBean.setConGuardarRelaciones(false);
		this.formapagopuntoventaSessionBean.setEsGuardarRelacionado(true);

		this.formapagopuntoventaBeanSwingJInternalFrame=null;//new FormaPagoPuntoVentaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.formapagopuntoventaBeanSwingJInternalFramePopup=new FormaPagoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.formapagopuntoventaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado()) {

				FormaPagoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=CuentaBancoPunVenJInternalFrame.STIPO_TAMANIO_GENERAL;
				FormaPagoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=CuentaBancoPunVenJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.formapagopuntoventaSessionBean.setEsGuardarRelacionado(true);

				this.formapagopuntoventaBeanSwingJInternalFrame=new FormaPagoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.formapagopuntoventaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.formapagopuntoventaBeanSwingJInternalFrame.setformapagopuntoventaSessionBean(this.formapagopuntoventaSessionBean);

				//this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
				//this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCuentaBancoPunVen.gridx = 0;
				//this.jContentPaneDetalleCuentaBancoPunVen.add(this.formapagopuntoventaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCuentaBancoPunVen);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCuentaBancoPunVen.add("Forma Pagoes",this.formapagopuntoventaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCuentaBancoPunVen.setComponentAt(iIndexTab,this.formapagopuntoventaBeanSwingJInternalFrame.getContentPane());
				}

				//FormaPagoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.formapagopuntoventaSessionBean.setEsGuardarRelacionado(false);
				this.formapagopuntoventaBeanSwingJInternalFrame=null;//new FormaPagoPuntoVentaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFormaPagoPuntoVenta) {
					this.jTabbedPaneRelacionesCuentaBancoPunVen.add("Forma Pagoes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarFormaPagoPuntoVentaBeanSwingJInternalFrame(List<CuentaBancoPunVen> cuentabancopunvens,CuentaBancoPunVen cuentabancopunven,FormaPagoPuntoVentaBeanSwingJInternalFrame formapagopuntoventaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//formapagopuntoventaBeanSwingJInternalFrame=new FormaPagoPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					formapagopuntoventaBeanSwingJInternalFrame.getFormaPagoPuntoVentaLogic().setConnexion(this.cuentabancopunvenLogic.getConnexion());

					formapagopuntoventaBeanSwingJInternalFrame.setcuentabancopunvensForeignKey(cuentabancopunvens);
					formapagopuntoventaBeanSwingJInternalFrame.setcuentabancopunvenForeignKey(cuentabancopunven);
					formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionCuentaBancoPunVen(true);
					formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setlidCuentaBancoPunVenActual(cuentabancopunven.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					formapagopuntoventaBeanSwingJInternalFrame.cargarCombosForeignKeyFormaPagoPuntoVenta(formapagopuntoventaBeanSwingJInternalFrame.isCargarCombosDependencia);
					formapagopuntoventaBeanSwingJInternalFrame.setVisibilidadBusquedasParaCuentaBancoPunVen(true);
					formapagopuntoventaBeanSwingJInternalFrame.setid_cuenta_banco_pun_venFK_IdCuentaBancoPunVen(cuentabancopunven.getId());

					if(!this.conCargarFormDetalle) {
						formapagopuntoventaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					formapagopuntoventaBeanSwingJInternalFrame.setSelectedItemCombosFrameCuentaBancoPunVenForeignKey(cuentabancopunven,1,false,true,true);
					formapagopuntoventaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					formapagopuntoventaBeanSwingJInternalFrame.procesarBusqueda("FK_IdCuentaBancoPunVen");
					formapagopuntoventaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCuentaBancoPunVen");
					formapagopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormaPagoPuntoVenta(true);
					formapagopuntoventaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFormaPagoPuntoVenta("n",formapagopuntoventaBeanSwingJInternalFrame.isGuardarCambiosEnLote, formapagopuntoventaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					formapagopuntoventaBeanSwingJInternalFrame.setAutoscrolls(true);
					formapagopuntoventaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						formapagopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsFormaPagoPuntoVenta("relacionado");
					} else {
						formapagopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsFormaPagoPuntoVenta("no_relacionado");
					}

					formapagopuntoventaBeanSwingJInternalFrame.getjButtonRecargarInformacionFormaPagoPuntoVenta().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
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
