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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.tesoreria.util.BancoConstantesFunciones;

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
public class BancoDetalleFormJInternalFrame extends BancoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleBanco;
	
	protected JMenuBar jmenuBarDetalleBanco;
	
	protected JMenu jmenuDetalleBanco;
	protected JMenu jmenuDetalleArchivoBanco;
	protected JMenu jmenuDetalleAccionesBanco;
	protected JMenu jmenuDetalleDatosBanco;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutBanco;	
	protected GridBagConstraints gridBagConstraintsBanco;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected BancoBeanSwingJInternalFrameAdditional jInternalFrameDetalleBanco;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TipoBancoBeanSwingJInternalFrame tipobancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipobanco="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledebitoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledebito="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecredito="";

	protected FormatoBeanSwingJInternalFrame formato1BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato1="";

	protected FormatoBeanSwingJInternalFrame formato2BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato2="";
	
	public BancoSessionBean bancoSessionBean;
	
	

	public CuentaBancoPunVenBeanSwingJInternalFrame cuentabancopunvenBeanSwingJInternalFrame=null;
	public CuentaBancoPunVenBeanSwingJInternalFrame cuentabancopunvenBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCuentaBancoPunVen=false;
	public CuentaBancoPunVenSessionBean cuentabancopunvenSessionBean;

	public PoliticasClienteBeanSwingJInternalFrame politicasclienteBeanSwingJInternalFrame=null;
	public PoliticasClienteBeanSwingJInternalFrame politicasclienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePoliticasCliente=false;
	public PoliticasClienteSessionBean politicasclienteSessionBean;

	public FormaPagoPuntoVentaBeanSwingJInternalFrame formapagopuntoventaBeanSwingJInternalFrame=null;
	public FormaPagoPuntoVentaBeanSwingJInternalFrame formapagopuntoventaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFormaPagoPuntoVenta=false;
	public FormaPagoPuntoVentaSessionBean formapagopuntoventaSessionBean;

	public TarjetaCreditoBeanSwingJInternalFrame tarjetacreditoBeanSwingJInternalFrame=null;
	public TarjetaCreditoBeanSwingJInternalFrame tarjetacreditoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteTarjetaCredito=false;
	public TarjetaCreditoSessionBean tarjetacreditoSessionBean;

	public AutoriPagoBeanSwingJInternalFrame autoripagoBeanSwingJInternalFrame=null;
	public AutoriPagoBeanSwingJInternalFrame autoripagoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteAutoriPago=false;
	public AutoriPagoSessionBean autoripagoSessionBean;

	public TipoCuentaBancoGeneralBeanSwingJInternalFrame tipocuentabancogeneralBeanSwingJInternalFrame=null;
	public TipoCuentaBancoGeneralBeanSwingJInternalFrame tipocuentabancogeneralBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteTipoCuentaBancoGeneral=false;
	public TipoCuentaBancoGeneralSessionBean tipocuentabancogeneralSessionBean;

	public CuentaBancoBeanSwingJInternalFrame cuentabancoBeanSwingJInternalFrame=null;
	public CuentaBancoBeanSwingJInternalFrame cuentabancoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCuentaBanco=false;
	public CuentaBancoSessionBean cuentabancoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TipoBancoSessionBean tipobancoSessionBean;
	public CuentaContableSessionBean cuentacontabledebitoSessionBean;
	public CuentaContableSessionBean cuentacontablecreditoSessionBean;
	public FormatoSessionBean formato1SessionBean;
	public FormatoSessionBean formato2SessionBean;	
	
	public BancoLogic bancoLogic;
	
	public JScrollPane jScrollPanelDatosBanco;
	public JScrollPane jScrollPanelDatosEdicionBanco;
	public JScrollPane jScrollPanelDatosGeneralBanco;
	
	protected JPanel jPanelCamposBanco;    
	protected JPanel jPanelCamposOcultosBanco;    	
	protected JPanel jPanelAccionesBanco;
	protected JPanel jPanelAccionesFormularioBanco;
    
	
	
	protected Integer iXPanelCamposBanco=0;
	protected Integer iYPanelCamposBanco=0;
	
	protected Integer iXPanelCamposOcultosBanco=0;
	protected Integer iYPanelCamposOcultosBanco=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoBanco;
	public JButton jButtonModificarBanco;
	public JButton jButtonActualizarBanco;
    public JButton jButtonEliminarBanco;
	public JButton jButtonCancelarBanco;
    public JButton jButtonGuardarCambiosBanco;
	public JButton jButtonGuardarCambiosTablaBanco;
	protected JButton jButtonCerrarBanco;
	
	
	protected JButton jButtonProcesarInformacionBanco;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoBanco;
	protected JCheckBox jCheckBoxPostAccionSinCerrarBanco;
	protected JCheckBox jCheckBoxPostAccionSinMensajeBanco;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarBanco;
	protected JButton jButtonModificarToolBarBanco;
	protected JButton jButtonActualizarToolBarBanco;
    protected JButton jButtonEliminarToolBarBanco;
	protected JButton jButtonCancelarToolBarBanco;
    protected JButton jButtonGuardarCambiosToolBarBanco;
	protected JButton jButtonGuardarCambiosTablaToolBarBanco;
	protected JButton jButtonMostrarOcultarTablaToolBarBanco;
	protected JButton jButtonCerrarToolBarBanco;
	
	protected JButton jButtonProcesarInformacionToolBarBanco;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoBanco;
	protected JMenuItem jMenuItemModificarBanco;
	protected JMenuItem jMenuItemActualizarBanco;
    protected JMenuItem jMenuItemEliminarBanco;
	protected JMenuItem jMenuItemCancelarBanco;
    protected JMenuItem jMenuItemGuardarCambiosBanco;
	protected JMenuItem jMenuItemGuardarCambiosTablaBanco;
	protected JMenuItem jMenuItemCerrarBanco;
	protected JMenuItem jMenuItemDetalleCerrarBanco;
	protected JMenuItem jMenuItemDetalleMostarOcultarBanco;
	
	protected JMenuItem jMenuItemProcesarInformacionBanco;
	protected JMenuItem jMenuItemNuevoGuardarCambiosBanco;
	protected JMenuItem jMenuItemMostrarOcultarBanco;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesBanco;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesBanco;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioBanco;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidBanco;
	public JLabel jLabelIdBanco;
	public JLabel jLabelidBanco;
	public JButton jButtonidBancoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoBanco;
	public JLabel jLabelcodigoBanco;
	public JTextArea jTextAreacodigoBanco;
	public JScrollPane jscrollPanecodigoBanco;
	public JButton jButtoncodigoBancoBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_institucionBanco;
	public JLabel jLabelcodigo_institucionBanco;
	public JTextField jTextFieldcodigo_institucionBanco;
	public JButton jButtoncodigo_institucionBancoBusqueda= new JButtonMe();

	public JPanel jPanelnombreBanco;
	public JLabel jLabelnombreBanco;
	public JTextArea jTextAreanombreBanco;
	public JScrollPane jscrollPanenombreBanco;
	public JButton jButtonnombreBancoBusqueda= new JButtonMe();

	public JPanel jPaneldias_efectivo_localBanco;
	public JLabel jLabeldias_efectivo_localBanco;
	public JTextField jTextFielddias_efectivo_localBanco;
	public JButton jButtondias_efectivo_localBancoBusqueda= new JButtonMe();

	public JPanel jPaneldias_efectivo_extranjeroBanco;
	public JLabel jLabeldias_efectivo_extranjeroBanco;
	public JTextField jTextFielddias_efectivo_extranjeroBanco;
	public JButton jButtondias_efectivo_extranjeroBancoBusqueda= new JButtonMe();

	public JPanel jPaneldelimitadorBanco;
	public JLabel jLabeldelimitadorBanco;
	public JTextField jTextFielddelimitadorBanco;
	public JButton jButtondelimitadorBancoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaBanco;
	public JLabel jLabelid_empresaBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaBanco;
	public JButton jButtonid_empresaBanco= new JButtonMe();
	public JButton jButtonid_empresaBancoUpdate= new JButtonMe();
	public JButton jButtonid_empresaBancoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalBanco;
	public JLabel jLabelid_sucursalBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalBanco;
	public JButton jButtonid_sucursalBanco= new JButtonMe();
	public JButton jButtonid_sucursalBancoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalBancoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_bancoBanco;
	public JLabel jLabelid_tipo_bancoBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_bancoBanco;
	public JButton jButtonid_tipo_bancoBanco= new JButtonMe();
	public JButton jButtonid_tipo_bancoBancoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_bancoBancoBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_debitoBanco;
	public JLabel jLabelid_cuenta_contable_debitoBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_debitoBanco;
	public JButton jButtonid_cuenta_contable_debitoBanco= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoBancoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoBancoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoBancoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_creditoBanco;
	public JLabel jLabelid_cuenta_contable_creditoBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_creditoBanco;
	public JButton jButtonid_cuenta_contable_creditoBanco= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoBancoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoBancoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoBancoArbol= new JButtonMe();

	public JPanel jPanelid_formato1Banco;
	public JLabel jLabelid_formato1Banco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato1Banco;
	public JButton jButtonid_formato1Banco= new JButtonMe();
	public JButton jButtonid_formato1BancoUpdate= new JButtonMe();
	public JButton jButtonid_formato1BancoBusqueda= new JButtonMe();

	public JPanel jPanelid_formato2Banco;
	public JLabel jLabelid_formato2Banco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato2Banco;
	public JButton jButtonid_formato2Banco= new JButtonMe();
	public JButton jButtonid_formato2BancoUpdate= new JButtonMe();
	public JButton jButtonid_formato2BancoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesBanco;
	
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
	public int iHeightFormulario=990;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public BancoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposBanco=new JPanel();
				this.jPanelAccionesFormularioBanco=new JPanel();
				this.jmenuBarDetalleBanco=new JMenuBar();
				this.jTtoolBarDetalleBanco=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BancoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Banco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public BancoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Banco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BancoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Banco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BancoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Banco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BancoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Banco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarBanco() {
		return this.jButtonActualizarToolBarBanco;
	}
	
	public JButton getjButtonEliminarToolBarBanco() {
		return this.jButtonEliminarToolBarBanco;
	}
	
	public JButton getjButtonCancelarToolBarBanco() {
		return this.jButtonCancelarToolBarBanco;
	}		
	
	public JButton getjButtonProcesarInformacionBanco() {
		return this.jButtonProcesarInformacionBanco;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionBanco)	{
		this.jButtonProcesarInformacionBanco = jButtonProcesarInformacionBanco;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesBanco() {
		return this.jComboBoxTiposAccionesBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesBanco(
			JComboBox jComboBoxTiposRelacionesBanco) {
		this.jComboBoxTiposRelacionesBanco = jComboBoxTiposRelacionesBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesBanco(
			JComboBox jComboBoxTiposAccionesBanco) {
		this.jComboBoxTiposAccionesBanco = jComboBoxTiposAccionesBanco;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioBanco() {
		return this.jComboBoxTiposAccionesFormularioBanco;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioBanco(
			JComboBox jComboBoxTiposAccionesFormularioBanco) {
		this.jComboBoxTiposAccionesFormularioBanco = jComboBoxTiposAccionesFormularioBanco;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.bancoSessionBean=new BancoSessionBean();
		
		this.bancoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.bancoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.bancoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.cuentabancopunvenSessionBean=new CuentaBancoPunVenSessionBean();
		//this.politicasclienteSessionBean=new PoliticasClienteSessionBean();
		//this.formapagopuntoventaSessionBean=new FormaPagoPuntoVentaSessionBean();
		//this.tarjetacreditoSessionBean=new TarjetaCreditoSessionBean();
		//this.autoripagoSessionBean=new AutoriPagoSessionBean();
		//this.tipocuentabancogeneralSessionBean=new TipoCuentaBancoGeneralSessionBean();
		//this.cuentabancoSessionBean=new CuentaBancoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		BancoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		BancoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		BancoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Banco MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.bancoSessionBean.getEsGuardarRelacionado()) {
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
	
		BancoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleBanco= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarBanco=new JButtonMe();
				this.jButtonModificarToolBarBanco=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarBanco,this.jTtoolBarDetalleBanco,
							"actualizar","actualizar","Actualizar"+" "+BancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarBanco,this.jTtoolBarDetalleBanco,
							"eliminar","eliminar","Eliminar"+" "+BancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarBanco,this.jTtoolBarDetalleBanco,
							"cancelar","cancelar","Cancelar"+" "+BancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarBanco,this.jTtoolBarDetalleBanco,
							"guardarcambios","guardarcambios","Guardar"+" "+BancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarBanco,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleBanco=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleBanco=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoBanco=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesBanco=new JMenuMe("Acciones");
		this.jmenuDetalleDatosBanco=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoBanco= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoBanco.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoBanco,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarBanco= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarBanco.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarBanco,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarBanco= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarBanco.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarBanco,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarBanco= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarBanco.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarBanco,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarBanco= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarBanco.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarBanco,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosBanco= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosBanco.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosBanco,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarBanco= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarBanco.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarBanco,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarBanco= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarBanco.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarBanco,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarBanco,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarBanco,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarBanco, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoBanco.add(this.jMenuItemDetalleCerrarBanco);
		
		this.jmenuDetalleAccionesBanco.add(this.jMenuItemActualizarBanco);
		this.jmenuDetalleAccionesBanco.add(this.jMenuItemEliminarBanco);
		this.jmenuDetalleAccionesBanco.add(this.jMenuItemCancelarBanco);		
		
		//this.jmenuDetalleDatosBanco.add(this.jMenuItemDetalleAbrirOrderByBanco);				
		this.jmenuDetalleDatosBanco.add(this.jMenuItemDetalleMostarOcultarBanco);				
				
		//this.jmenuDetalleAccionesBanco.add(this.jMenuItemGuardarCambiosBanco);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleBanco.add(this.jmenuDetalleArchivoBanco);		
		this.jmenuBarDetalleBanco.add(this.jmenuDetalleAccionesBanco);		
		this.jmenuBarDetalleBanco.add(this.jmenuDetalleDatosBanco);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleBanco.add(this.jmenuDetalleBanco);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleBanco);				
	}
	
	
	public void inicializarElementosCamposBanco() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdBanco = new JLabelMe();
		jLabelIdBanco.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidBanco = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidBanco.setToolTipText(BancoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutBanco= new GridBagLayout();

		this.jPanelidBanco.setLayout(this.gridaBagLayoutBanco);

		jLabelidBanco = new JLabel();
		jLabelidBanco.setText("Id");

		jLabelidBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoBanco = new JLabelMe();
		this.jLabelcodigoBanco.setText(""+BancoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoBanco.setToolTipText("Codigo");
		this.jLabelcodigoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoBanco.setToolTipText(BancoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutBanco = new GridBagLayout();
		this.jPanelcodigoBanco.setLayout(this.gridaBagLayoutBanco);


		jTextAreacodigoBanco= new JTextAreaMe();
		jTextAreacodigoBanco.setEnabled(false);
		jTextAreacodigoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoBanco.setLineWrap(true);
		jTextAreacodigoBanco.setWrapStyleWord(true);
		jTextAreacodigoBanco.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreacodigoBanco.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreacodigoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanecodigoBanco = new JScrollPane(jTextAreacodigoBanco);
		jscrollPanecodigoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecodigoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecodigoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtoncodigoBancoBusqueda= new JButtonMe();
		this.jButtoncodigoBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoBancoBusqueda.setText("U");
		this.jButtoncodigoBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreacodigoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreacodigoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoBancoBusqueda"));

		if(this.bancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoBancoBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_institucionBanco = new JLabelMe();
		this.jLabelcodigo_institucionBanco.setText(""+BancoConstantesFunciones.LABEL_CODIGOINSTITUCION+" : *");
		this.jLabelcodigo_institucionBanco.setToolTipText("Codigo Institucion");
		this.jLabelcodigo_institucionBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_institucionBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_institucionBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_institucionBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_institucionBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_institucionBanco.setToolTipText(BancoConstantesFunciones.LABEL_CODIGOINSTITUCION);
		this.gridaBagLayoutBanco = new GridBagLayout();
		this.jPanelcodigo_institucionBanco.setLayout(this.gridaBagLayoutBanco);


		jTextFieldcodigo_institucionBanco= new JTextFieldMe();

		jTextFieldcodigo_institucionBanco.setEnabled(false);
		jTextFieldcodigo_institucionBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_institucionBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_institucionBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_institucionBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_institucionBancoBusqueda= new JButtonMe();
		this.jButtoncodigo_institucionBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_institucionBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_institucionBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_institucionBancoBusqueda.setText("U");
		this.jButtoncodigo_institucionBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_institucionBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_institucionBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_institucionBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_institucionBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_institucionBancoBusqueda"));

		if(this.bancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_institucionBancoBusqueda.setVisible(false);		}


					
		this.jLabelnombreBanco = new JLabelMe();
		this.jLabelnombreBanco.setText(""+BancoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreBanco.setToolTipText("Nombre");
		this.jLabelnombreBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreBanco.setToolTipText(BancoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutBanco = new GridBagLayout();
		this.jPanelnombreBanco.setLayout(this.gridaBagLayoutBanco);


		jTextAreanombreBanco= new JTextAreaMe();
		jTextAreanombreBanco.setEnabled(false);
		jTextAreanombreBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBanco.setLineWrap(true);
		jTextAreanombreBanco.setWrapStyleWord(true);
		jTextAreanombreBanco.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreBanco.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreBanco = new JScrollPane(jTextAreanombreBanco);
		jscrollPanenombreBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreBancoBusqueda= new JButtonMe();
		this.jButtonnombreBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreBancoBusqueda.setText("U");
		this.jButtonnombreBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreBancoBusqueda"));

		if(this.bancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreBancoBusqueda.setVisible(false);		}


					
		this.jLabeldias_efectivo_localBanco = new JLabelMe();
		this.jLabeldias_efectivo_localBanco.setText(""+BancoConstantesFunciones.LABEL_DIASEFECTIVOLOCAL+" : *");
		this.jLabeldias_efectivo_localBanco.setToolTipText("Dias Efectivo Local");
		this.jLabeldias_efectivo_localBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldias_efectivo_localBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldias_efectivo_localBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldias_efectivo_localBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldias_efectivo_localBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldias_efectivo_localBanco.setToolTipText(BancoConstantesFunciones.LABEL_DIASEFECTIVOLOCAL);
		this.gridaBagLayoutBanco = new GridBagLayout();
		this.jPaneldias_efectivo_localBanco.setLayout(this.gridaBagLayoutBanco);


		jTextFielddias_efectivo_localBanco= new JTextFieldMe();
		jTextFielddias_efectivo_localBanco.setEnabled(false);
		jTextFielddias_efectivo_localBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddias_efectivo_localBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddias_efectivo_localBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddias_efectivo_localBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddias_efectivo_localBanco.setText("0");

		this.jButtondias_efectivo_localBancoBusqueda= new JButtonMe();
		this.jButtondias_efectivo_localBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondias_efectivo_localBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondias_efectivo_localBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondias_efectivo_localBancoBusqueda.setText("U");
		this.jButtondias_efectivo_localBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondias_efectivo_localBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondias_efectivo_localBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddias_efectivo_localBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddias_efectivo_localBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"dias_efectivo_localBancoBusqueda"));

		if(this.bancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondias_efectivo_localBancoBusqueda.setVisible(false);		}


					
		this.jLabeldias_efectivo_extranjeroBanco = new JLabelMe();
		this.jLabeldias_efectivo_extranjeroBanco.setText(""+BancoConstantesFunciones.LABEL_DIASEFECTIVOEXTRANJERO+" : *");
		this.jLabeldias_efectivo_extranjeroBanco.setToolTipText("Dias Efectivo Extranjero");
		this.jLabeldias_efectivo_extranjeroBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeldias_efectivo_extranjeroBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeldias_efectivo_extranjeroBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabeldias_efectivo_extranjeroBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldias_efectivo_extranjeroBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldias_efectivo_extranjeroBanco.setToolTipText(BancoConstantesFunciones.LABEL_DIASEFECTIVOEXTRANJERO);
		this.gridaBagLayoutBanco = new GridBagLayout();
		this.jPaneldias_efectivo_extranjeroBanco.setLayout(this.gridaBagLayoutBanco);


		jTextFielddias_efectivo_extranjeroBanco= new JTextFieldMe();
		jTextFielddias_efectivo_extranjeroBanco.setEnabled(false);
		jTextFielddias_efectivo_extranjeroBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddias_efectivo_extranjeroBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddias_efectivo_extranjeroBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddias_efectivo_extranjeroBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddias_efectivo_extranjeroBanco.setText("0");

		this.jButtondias_efectivo_extranjeroBancoBusqueda= new JButtonMe();
		this.jButtondias_efectivo_extranjeroBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondias_efectivo_extranjeroBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondias_efectivo_extranjeroBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondias_efectivo_extranjeroBancoBusqueda.setText("U");
		this.jButtondias_efectivo_extranjeroBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondias_efectivo_extranjeroBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondias_efectivo_extranjeroBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddias_efectivo_extranjeroBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddias_efectivo_extranjeroBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"dias_efectivo_extranjeroBancoBusqueda"));

		if(this.bancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondias_efectivo_extranjeroBancoBusqueda.setVisible(false);		}


					
		this.jLabeldelimitadorBanco = new JLabelMe();
		this.jLabeldelimitadorBanco.setText(""+BancoConstantesFunciones.LABEL_DELIMITADOR+" :");
		this.jLabeldelimitadorBanco.setToolTipText("Delimitador");
		this.jLabeldelimitadorBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldelimitadorBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldelimitadorBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldelimitadorBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldelimitadorBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldelimitadorBanco.setToolTipText(BancoConstantesFunciones.LABEL_DELIMITADOR);
		this.gridaBagLayoutBanco = new GridBagLayout();
		this.jPaneldelimitadorBanco.setLayout(this.gridaBagLayoutBanco);


		jTextFielddelimitadorBanco= new JTextFieldMe();

		jTextFielddelimitadorBanco.setEnabled(false);
		jTextFielddelimitadorBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddelimitadorBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddelimitadorBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddelimitadorBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtondelimitadorBancoBusqueda= new JButtonMe();
		this.jButtondelimitadorBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondelimitadorBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondelimitadorBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondelimitadorBancoBusqueda.setText("U");
		this.jButtondelimitadorBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondelimitadorBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondelimitadorBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddelimitadorBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddelimitadorBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"delimitadorBancoBusqueda"));

		if(this.bancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondelimitadorBancoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysBanco() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaBanco = new JLabelMe();
		this.jLabelid_empresaBanco.setText(""+BancoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaBanco.setToolTipText("Empresa");
		this.jLabelid_empresaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaBanco.setToolTipText(BancoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutBanco = new GridBagLayout();
		this.jPanelid_empresaBanco.setLayout(this.gridaBagLayoutBanco);


		jComboBoxid_empresaBanco= new JComboBoxMe();
		jComboBoxid_empresaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaBanco.setEnabled(false);

		this.jButtonid_empresaBanco= new JButtonMe();
		this.jButtonid_empresaBanco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaBanco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaBanco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaBanco.setText("Buscar");
		this.jButtonid_empresaBanco.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaBanco.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaBanco,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaBanco"));

		this.jButtonid_empresaBancoBusqueda= new JButtonMe();
		this.jButtonid_empresaBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaBancoBusqueda.setText("U");
		this.jButtonid_empresaBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaBancoBusqueda"));

		if(this.bancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaBancoBusqueda.setVisible(false);		}

		this.jButtonid_empresaBancoUpdate= new JButtonMe();
		this.jButtonid_empresaBancoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBancoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBancoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaBancoUpdate.setText("U");
		this.jButtonid_empresaBancoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaBancoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaBancoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaBancoUpdate"));



					
		this.jLabelid_sucursalBanco = new JLabelMe();
		this.jLabelid_sucursalBanco.setText(""+BancoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalBanco.setToolTipText("Sucursal");
		this.jLabelid_sucursalBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalBanco.setToolTipText(BancoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutBanco = new GridBagLayout();
		this.jPanelid_sucursalBanco.setLayout(this.gridaBagLayoutBanco);


		jComboBoxid_sucursalBanco= new JComboBoxMe();
		jComboBoxid_sucursalBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalBanco.setEnabled(false);

		this.jButtonid_sucursalBanco= new JButtonMe();
		this.jButtonid_sucursalBanco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalBanco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalBanco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalBanco.setText("Buscar");
		this.jButtonid_sucursalBanco.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalBanco.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalBanco,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalBanco"));

		this.jButtonid_sucursalBancoBusqueda= new JButtonMe();
		this.jButtonid_sucursalBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalBancoBusqueda.setText("U");
		this.jButtonid_sucursalBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalBancoBusqueda"));

		if(this.bancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalBancoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalBancoUpdate= new JButtonMe();
		this.jButtonid_sucursalBancoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalBancoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalBancoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalBancoUpdate.setText("U");
		this.jButtonid_sucursalBancoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalBancoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalBancoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalBancoUpdate"));



					
		this.jLabelid_tipo_bancoBanco = new JLabelMe();
		this.jLabelid_tipo_bancoBanco.setText(""+BancoConstantesFunciones.LABEL_IDTIPOBANCO+" : *");
		this.jLabelid_tipo_bancoBanco.setToolTipText("Tipo Banco Sri");
		this.jLabelid_tipo_bancoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_bancoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_bancoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_bancoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_bancoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_bancoBanco.setToolTipText(BancoConstantesFunciones.LABEL_IDTIPOBANCO);
		this.gridaBagLayoutBanco = new GridBagLayout();
		this.jPanelid_tipo_bancoBanco.setLayout(this.gridaBagLayoutBanco);


		jComboBoxid_tipo_bancoBanco= new JComboBoxMe();
		jComboBoxid_tipo_bancoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_bancoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_bancoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_bancoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_bancoBanco= new JButtonMe();
		this.jButtonid_tipo_bancoBanco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_bancoBanco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_bancoBanco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_bancoBanco.setText("Buscar");
		this.jButtonid_tipo_bancoBanco.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_bancoBanco.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_bancoBanco,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_bancoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_bancoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_bancoBanco"));

		this.jButtonid_tipo_bancoBancoBusqueda= new JButtonMe();
		this.jButtonid_tipo_bancoBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_bancoBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_bancoBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_bancoBancoBusqueda.setText("U");
		this.jButtonid_tipo_bancoBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_bancoBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_bancoBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_bancoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_bancoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_bancoBancoBusqueda"));

		if(this.bancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_bancoBancoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_bancoBancoUpdate= new JButtonMe();
		this.jButtonid_tipo_bancoBancoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_bancoBancoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_bancoBancoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_bancoBancoUpdate.setText("U");
		this.jButtonid_tipo_bancoBancoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_bancoBancoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_bancoBancoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_bancoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_bancoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_bancoBancoUpdate"));



					
		this.jLabelid_cuenta_contable_debitoBanco = new JLabelMe();
		this.jLabelid_cuenta_contable_debitoBanco.setText(""+BancoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO+" :");
		this.jLabelid_cuenta_contable_debitoBanco.setToolTipText("Cuenta Contable Debito");
		this.jLabelid_cuenta_contable_debitoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_debitoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_debitoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_debitoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_debitoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_debitoBanco.setToolTipText(BancoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO);
		this.gridaBagLayoutBanco = new GridBagLayout();
		this.jPanelid_cuenta_contable_debitoBanco.setLayout(this.gridaBagLayoutBanco);


		jComboBoxid_cuenta_contable_debitoBanco= new JComboBoxMe();
		jComboBoxid_cuenta_contable_debitoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_debitoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_debitoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_debitoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_debitoBanco= new JButtonMe();
		this.jButtonid_cuenta_contable_debitoBanco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_debitoBanco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_debitoBanco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_debitoBanco.setText("Buscar");
		this.jButtonid_cuenta_contable_debitoBanco.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_debitoBanco.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoBanco,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_debitoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoBanco"));

		this.jButtonid_cuenta_contable_debitoBancoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_debitoBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_debitoBancoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_debitoBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_debitoBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_debitoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoBancoBusqueda"));

		if(this.bancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_debitoBancoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_debitoBancoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_debitoBancoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoBancoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoBancoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_debitoBancoUpdate.setText("U");
		this.jButtonid_cuenta_contable_debitoBancoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_debitoBancoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoBancoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_debitoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoBancoUpdate"));


		jButtonid_cuenta_contable_debitoBancoArbol= new JButtonMe();
		jButtonid_cuenta_contable_debitoBancoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_debitoBancoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_debitoBancoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_debitoBancoArbol.setText("Arbol");
		jButtonid_cuenta_contable_debitoBancoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_debitoBancoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoBancoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_debitoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoBancoArbol"));



					
		this.jLabelid_cuenta_contable_creditoBanco = new JLabelMe();
		this.jLabelid_cuenta_contable_creditoBanco.setText(""+BancoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO+" :");
		this.jLabelid_cuenta_contable_creditoBanco.setToolTipText("Cuenta Contable Credito");
		this.jLabelid_cuenta_contable_creditoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_creditoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_creditoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_creditoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_creditoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_creditoBanco.setToolTipText(BancoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
		this.gridaBagLayoutBanco = new GridBagLayout();
		this.jPanelid_cuenta_contable_creditoBanco.setLayout(this.gridaBagLayoutBanco);


		jComboBoxid_cuenta_contable_creditoBanco= new JComboBoxMe();
		jComboBoxid_cuenta_contable_creditoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_creditoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_creditoBanco= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoBanco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoBanco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoBanco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoBanco.setText("Buscar");
		this.jButtonid_cuenta_contable_creditoBanco.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_creditoBanco.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoBanco,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_creditoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoBanco"));

		this.jButtonid_cuenta_contable_creditoBancoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_creditoBancoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_creditoBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_creditoBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_creditoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoBancoBusqueda"));

		if(this.bancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_creditoBancoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_creditoBancoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoBancoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoBancoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoBancoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_creditoBancoUpdate.setText("U");
		this.jButtonid_cuenta_contable_creditoBancoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_creditoBancoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoBancoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_creditoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoBancoUpdate"));


		jButtonid_cuenta_contable_creditoBancoArbol= new JButtonMe();
		jButtonid_cuenta_contable_creditoBancoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoBancoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoBancoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoBancoArbol.setText("Arbol");
		jButtonid_cuenta_contable_creditoBancoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_creditoBancoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoBancoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_creditoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoBancoArbol"));



					
		this.jLabelid_formato1Banco = new JLabelMe();
		this.jLabelid_formato1Banco.setText(""+BancoConstantesFunciones.LABEL_IDFORMATO1+" :");
		this.jLabelid_formato1Banco.setToolTipText("Formato1");
		this.jLabelid_formato1Banco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formato1Banco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formato1Banco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formato1Banco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formato1Banco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formato1Banco.setToolTipText(BancoConstantesFunciones.LABEL_IDFORMATO1);
		this.gridaBagLayoutBanco = new GridBagLayout();
		this.jPanelid_formato1Banco.setLayout(this.gridaBagLayoutBanco);


		jComboBoxid_formato1Banco= new JComboBoxMe();
		jComboBoxid_formato1Banco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato1Banco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato1Banco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato1Banco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formato1Banco= new JButtonMe();
		this.jButtonid_formato1Banco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato1Banco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato1Banco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato1Banco.setText("Buscar");
		this.jButtonid_formato1Banco.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formato1Banco.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato1Banco,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formato1Banco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato1Banco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato1Banco"));

		this.jButtonid_formato1BancoBusqueda= new JButtonMe();
		this.jButtonid_formato1BancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato1BancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato1BancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato1BancoBusqueda.setText("U");
		this.jButtonid_formato1BancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formato1BancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato1BancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formato1Banco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato1Banco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato1BancoBusqueda"));

		if(this.bancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formato1BancoBusqueda.setVisible(false);		}

		this.jButtonid_formato1BancoUpdate= new JButtonMe();
		this.jButtonid_formato1BancoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato1BancoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato1BancoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato1BancoUpdate.setText("U");
		this.jButtonid_formato1BancoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formato1BancoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato1BancoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formato1Banco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato1Banco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato1BancoUpdate"));



					
		this.jLabelid_formato2Banco = new JLabelMe();
		this.jLabelid_formato2Banco.setText(""+BancoConstantesFunciones.LABEL_IDFORMATO2+" :");
		this.jLabelid_formato2Banco.setToolTipText("Formato2");
		this.jLabelid_formato2Banco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formato2Banco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formato2Banco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formato2Banco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formato2Banco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formato2Banco.setToolTipText(BancoConstantesFunciones.LABEL_IDFORMATO2);
		this.gridaBagLayoutBanco = new GridBagLayout();
		this.jPanelid_formato2Banco.setLayout(this.gridaBagLayoutBanco);


		jComboBoxid_formato2Banco= new JComboBoxMe();
		jComboBoxid_formato2Banco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato2Banco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato2Banco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato2Banco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formato2Banco= new JButtonMe();
		this.jButtonid_formato2Banco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato2Banco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato2Banco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato2Banco.setText("Buscar");
		this.jButtonid_formato2Banco.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formato2Banco.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato2Banco,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formato2Banco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato2Banco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato2Banco"));

		this.jButtonid_formato2BancoBusqueda= new JButtonMe();
		this.jButtonid_formato2BancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato2BancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato2BancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato2BancoBusqueda.setText("U");
		this.jButtonid_formato2BancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formato2BancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato2BancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formato2Banco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato2Banco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato2BancoBusqueda"));

		if(this.bancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formato2BancoBusqueda.setVisible(false);		}

		this.jButtonid_formato2BancoUpdate= new JButtonMe();
		this.jButtonid_formato2BancoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato2BancoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato2BancoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato2BancoUpdate.setText("U");
		this.jButtonid_formato2BancoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formato2BancoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato2BancoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formato2Banco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato2Banco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato2BancoUpdate"));



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
		//this.jInternalFrameDetalleBanco = new BancoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Banco DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutBanco= new GridBagLayout();
		

		
		String sToolTipBanco="";
		sToolTipBanco=BancoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipBanco+="(Tesoreria.Banco)";
		}
		
		if(!this.bancoSessionBean.getEsGuardarRelacionado()) {
			sToolTipBanco+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoBanco = new JButtonMe();
		this.jButtonModificarBanco = new JButtonMe();
        this.jButtonActualizarBanco = new JButtonMe();
        this.jButtonEliminarBanco = new JButtonMe();
        this.jButtonCancelarBanco = new JButtonMe();
        this.jButtonGuardarCambiosBanco = new JButtonMe();
		this.jButtonGuardarCambiosTablaBanco = new JButtonMe();
		this.jButtonCerrarBanco = new JButtonMe();
		
		this.jScrollPanelDatosBanco = new JScrollPane();   
        this.jScrollPanelDatosEdicionBanco = new JScrollPane();
		this.jScrollPanelDatosGeneralBanco = new JScrollPane();
				
		
		
		this.jPanelCamposBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Banco";
		
		if(!this.bancoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bancos" + this.sPath));
		} else {
			this.jScrollPanelDatosBanco.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposBanco.setName("jPanelCamposBanco"); 

		this.jPanelCamposOcultosBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosBanco.setName("jPanelCamposOcultosBanco"); 

        this.jPanelAccionesBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesBanco.setToolTipText("Acciones");
        this.jPanelAccionesBanco.setName("Acciones"); 

		this.jPanelAccionesFormularioBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioBanco.setToolTipText("Acciones");
        this.jPanelAccionesFormularioBanco.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosBanco, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposBanco, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosBanco, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoBanco.setText("Nuevo");
		this.jButtonModificarBanco.setText("Editar");
        this.jButtonActualizarBanco.setText("Actualizar");
        this.jButtonEliminarBanco.setText("Eliminar");
        this.jButtonCancelarBanco.setText("Cancelar");
        this.jButtonGuardarCambiosBanco.setText("Guardar");
		this.jButtonGuardarCambiosTablaBanco.setText("Guardar");
		this.jButtonCerrarBanco.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoBanco,"nuevo_button","Nuevo",this.bancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarBanco,"modificar_button","Editar",this.bancoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarBanco,"actualizar_button","Actualizar",this.bancoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarBanco,"eliminar_button","Eliminar",this.bancoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarBanco,"cancelar_button","Cancelar",this.bancoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosBanco,"guardarcambios_button","Guardar",this.bancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaBanco,"guardarcambiostabla_button","Guardar",this.bancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarBanco,"cerrar_button","Salir",this.bancoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoBanco.setToolTipText("Nuevo"+" "+BancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarBanco.setToolTipText("Editar"+" "+BancoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarBanco.setToolTipText("Actualizar"+" "+BancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarBanco.setToolTipText("Eliminar)"+" "+BancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarBanco.setToolTipText("Cancelar"+" "+BancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosBanco.setToolTipText("Guardar"+" "+BancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaBanco.setToolTipText("Guardar"+" "+BancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarBanco.setToolTipText("Salir"+" "+BancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoBanco";
		inputMap = this.jButtonNuevoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoBanco"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarBanco";
		inputMap = this.jButtonActualizarBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarBanco"));
		
		//ELIMINAR
		sMapKey = "EliminarBanco";
		inputMap = this.jButtonEliminarBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarBanco"));
		
		//CANCELAR	
		sMapKey = "CancelarBanco";
		inputMap = this.jButtonCancelarBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarBanco"));
		
		//CERRAR		
		sMapKey = "CerrarBanco";
		inputMap = this.jButtonCerrarBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarBanco"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaBanco";
		inputMap = this.jButtonGuardarCambiosTablaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaBanco"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoBanco = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoBanco.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoBanco.setToolTipText("Nuevo Banco");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarBanco = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarBanco.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarBanco.setToolTipText("Sin Cerrar Ventana Banco");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarBanco, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeBanco = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeBanco.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeBanco.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeBanco, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesBanco = new JComboBoxMe();
		//this.jComboBoxTiposAccionesBanco.setText("Accion");
		this.jComboBoxTiposAccionesBanco.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioBanco = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioBanco.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioBanco.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesBanco = new JLabelMe();
		
		this.jLabelAccionesBanco.setText("Acciones");		
		this.jLabelAccionesBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposBanco();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysBanco();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesBanco=new JTabbedPane();
		this.jTabbedPaneRelacionesBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioBanco.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioBanco.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioBanco.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioBanco, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposBanco = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosBanco = new GridBagLayout();
		
		this.jPanelCamposBanco.setLayout(gridaBagLayoutCamposBanco);
		this.jPanelCamposOcultosBanco.setLayout(gridaBagLayoutCamposOcultosBanco);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBanco.gridy = 0;
	this.gridBagConstraintsBanco.gridx = 0;
	this.gridBagConstraintsBanco.ipadx = 0;
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidBanco.add(jLabelIdBanco, this.gridBagConstraintsBanco);



	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBanco.gridy = 0;
	this.gridBagConstraintsBanco.gridx = 1;
	this.gridBagConstraintsBanco.ipadx = 0;
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidBanco.add(jLabelidBanco, this.gridBagConstraintsBanco);


	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBanco.gridy = 0;
	this.gridBagConstraintsBanco.gridx = 0;
	this.gridBagConstraintsBanco.ipadx = 0;
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaBanco.add(jLabelid_empresaBanco, this.gridBagConstraintsBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBanco = new GridBagConstraints();
		//this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBanco.gridy = 0;
		this.gridBagConstraintsBanco.gridx = 2;
		this.gridBagConstraintsBanco.ipadx = 0;
		this.gridBagConstraintsBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaBanco.add(jButtonid_empresaBancoBusqueda, this.gridBagConstraintsBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBanco = new GridBagConstraints();
		//this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBanco.gridy = 0;
		this.gridBagConstraintsBanco.gridx = 3;
		this.gridBagConstraintsBanco.ipadx = 0;
		this.gridBagConstraintsBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaBanco.add(jButtonid_empresaBancoUpdate, this.gridBagConstraintsBanco);
	}

	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBanco.gridy = 0;
	this.gridBagConstraintsBanco.gridx = 1;
	this.gridBagConstraintsBanco.ipadx = 0;
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaBanco.add(jComboBoxid_empresaBanco, this.gridBagConstraintsBanco);


	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBanco.gridy = 0;
	this.gridBagConstraintsBanco.gridx = 0;
	this.gridBagConstraintsBanco.ipadx = 0;
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalBanco.add(jLabelid_sucursalBanco, this.gridBagConstraintsBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBanco = new GridBagConstraints();
		//this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBanco.gridy = 0;
		this.gridBagConstraintsBanco.gridx = 2;
		this.gridBagConstraintsBanco.ipadx = 0;
		this.gridBagConstraintsBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalBanco.add(jButtonid_sucursalBancoBusqueda, this.gridBagConstraintsBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBanco = new GridBagConstraints();
		//this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBanco.gridy = 0;
		this.gridBagConstraintsBanco.gridx = 3;
		this.gridBagConstraintsBanco.ipadx = 0;
		this.gridBagConstraintsBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalBanco.add(jButtonid_sucursalBancoUpdate, this.gridBagConstraintsBanco);
	}

	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBanco.gridy = 0;
	this.gridBagConstraintsBanco.gridx = 1;
	this.gridBagConstraintsBanco.ipadx = 0;
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalBanco.add(jComboBoxid_sucursalBanco, this.gridBagConstraintsBanco);


	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBanco.gridy = 0;
	this.gridBagConstraintsBanco.gridx = 0;
	this.gridBagConstraintsBanco.ipadx = 0;
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoBanco.add(jLabelcodigoBanco, this.gridBagConstraintsBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBanco = new GridBagConstraints();
		//this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBanco.gridy = 0;
		this.gridBagConstraintsBanco.gridx = 2;
		this.gridBagConstraintsBanco.ipadx = 0;
		this.gridBagConstraintsBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoBanco.add(jButtoncodigoBancoBusqueda, this.gridBagConstraintsBanco);
	}

	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBanco.gridy = 0;
	this.gridBagConstraintsBanco.gridx = 1;
	this.gridBagConstraintsBanco.ipadx = 0;
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoBanco.add(jscrollPanecodigoBanco, this.gridBagConstraintsBanco);


	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBanco.gridy = 0;
	this.gridBagConstraintsBanco.gridx = 0;
	this.gridBagConstraintsBanco.ipadx = 0;
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_institucionBanco.add(jLabelcodigo_institucionBanco, this.gridBagConstraintsBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBanco = new GridBagConstraints();
		//this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBanco.gridy = 0;
		this.gridBagConstraintsBanco.gridx = 2;
		this.gridBagConstraintsBanco.ipadx = 0;
		this.gridBagConstraintsBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_institucionBanco.add(jButtoncodigo_institucionBancoBusqueda, this.gridBagConstraintsBanco);
	}

	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBanco.gridy = 0;
	this.gridBagConstraintsBanco.gridx = 1;
	this.gridBagConstraintsBanco.ipadx = 0;
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_institucionBanco.add(jTextFieldcodigo_institucionBanco, this.gridBagConstraintsBanco);


	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBanco.gridy = 0;
	this.gridBagConstraintsBanco.gridx = 0;
	this.gridBagConstraintsBanco.ipadx = 0;
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreBanco.add(jLabelnombreBanco, this.gridBagConstraintsBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBanco = new GridBagConstraints();
		//this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBanco.gridy = 0;
		this.gridBagConstraintsBanco.gridx = 2;
		this.gridBagConstraintsBanco.ipadx = 0;
		this.gridBagConstraintsBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreBanco.add(jButtonnombreBancoBusqueda, this.gridBagConstraintsBanco);
	}

	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBanco.gridy = 0;
	this.gridBagConstraintsBanco.gridx = 1;
	this.gridBagConstraintsBanco.ipadx = 0;
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreBanco.add(jscrollPanenombreBanco, this.gridBagConstraintsBanco);


	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBanco.gridy = 0;
	this.gridBagConstraintsBanco.gridx = 0;
	this.gridBagConstraintsBanco.ipadx = 0;
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_bancoBanco.add(jLabelid_tipo_bancoBanco, this.gridBagConstraintsBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBanco = new GridBagConstraints();
		//this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBanco.gridy = 0;
		this.gridBagConstraintsBanco.gridx = 2;
		this.gridBagConstraintsBanco.ipadx = 0;
		this.gridBagConstraintsBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_bancoBanco.add(jButtonid_tipo_bancoBancoBusqueda, this.gridBagConstraintsBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBanco = new GridBagConstraints();
		//this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBanco.gridy = 0;
		this.gridBagConstraintsBanco.gridx = 3;
		this.gridBagConstraintsBanco.ipadx = 0;
		this.gridBagConstraintsBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_bancoBanco.add(jButtonid_tipo_bancoBancoUpdate, this.gridBagConstraintsBanco);
	}

	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBanco.gridy = 0;
	this.gridBagConstraintsBanco.gridx = 1;
	this.gridBagConstraintsBanco.ipadx = 0;
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_bancoBanco.add(jComboBoxid_tipo_bancoBanco, this.gridBagConstraintsBanco);


	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBanco.gridy = 0;
	this.gridBagConstraintsBanco.gridx = 0;
	this.gridBagConstraintsBanco.ipadx = 0;
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldias_efectivo_localBanco.add(jLabeldias_efectivo_localBanco, this.gridBagConstraintsBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBanco = new GridBagConstraints();
		//this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBanco.gridy = 0;
		this.gridBagConstraintsBanco.gridx = 2;
		this.gridBagConstraintsBanco.ipadx = 0;
		this.gridBagConstraintsBanco.insets = new Insets(0, 0, 0, 0);
		this.jPaneldias_efectivo_localBanco.add(jButtondias_efectivo_localBancoBusqueda, this.gridBagConstraintsBanco);
	}

	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBanco.gridy = 0;
	this.gridBagConstraintsBanco.gridx = 1;
	this.gridBagConstraintsBanco.ipadx = 0;
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldias_efectivo_localBanco.add(jTextFielddias_efectivo_localBanco, this.gridBagConstraintsBanco);


	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBanco.gridy = 0;
	this.gridBagConstraintsBanco.gridx = 0;
	this.gridBagConstraintsBanco.ipadx = 0;
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldias_efectivo_extranjeroBanco.add(jLabeldias_efectivo_extranjeroBanco, this.gridBagConstraintsBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBanco = new GridBagConstraints();
		//this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBanco.gridy = 0;
		this.gridBagConstraintsBanco.gridx = 2;
		this.gridBagConstraintsBanco.ipadx = 0;
		this.gridBagConstraintsBanco.insets = new Insets(0, 0, 0, 0);
		this.jPaneldias_efectivo_extranjeroBanco.add(jButtondias_efectivo_extranjeroBancoBusqueda, this.gridBagConstraintsBanco);
	}

	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBanco.gridy = 0;
	this.gridBagConstraintsBanco.gridx = 1;
	this.gridBagConstraintsBanco.ipadx = 0;
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldias_efectivo_extranjeroBanco.add(jTextFielddias_efectivo_extranjeroBanco, this.gridBagConstraintsBanco);


	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBanco.gridy = 0;
	this.gridBagConstraintsBanco.gridx = 0;
	this.gridBagConstraintsBanco.ipadx = 0;
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_debitoBanco.add(jLabelid_cuenta_contable_debitoBanco, this.gridBagConstraintsBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBanco = new GridBagConstraints();
		//this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBanco.gridy = 0;
		this.gridBagConstraintsBanco.gridx = 2;
		this.gridBagConstraintsBanco.ipadx = 0;
		this.gridBagConstraintsBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_debitoBanco.add(jButtonid_cuenta_contable_debitoBancoBusqueda, this.gridBagConstraintsBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBanco = new GridBagConstraints();
		//this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBanco.gridy = 0;
		this.gridBagConstraintsBanco.gridx = 3;
		this.gridBagConstraintsBanco.ipadx = 0;
		this.gridBagConstraintsBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_debitoBanco.add(jButtonid_cuenta_contable_debitoBancoUpdate, this.gridBagConstraintsBanco);
	}

	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBanco.gridy = 0;
	this.gridBagConstraintsBanco.gridx = 1;
	this.gridBagConstraintsBanco.ipadx = 0;
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_debitoBanco.add(jComboBoxid_cuenta_contable_debitoBanco, this.gridBagConstraintsBanco);


	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBanco.gridy = 0;
	this.gridBagConstraintsBanco.gridx = 0;
	this.gridBagConstraintsBanco.ipadx = 0;
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_creditoBanco.add(jLabelid_cuenta_contable_creditoBanco, this.gridBagConstraintsBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBanco = new GridBagConstraints();
		//this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBanco.gridy = 0;
		this.gridBagConstraintsBanco.gridx = 2;
		this.gridBagConstraintsBanco.ipadx = 0;
		this.gridBagConstraintsBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_creditoBanco.add(jButtonid_cuenta_contable_creditoBancoBusqueda, this.gridBagConstraintsBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBanco = new GridBagConstraints();
		//this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBanco.gridy = 0;
		this.gridBagConstraintsBanco.gridx = 3;
		this.gridBagConstraintsBanco.ipadx = 0;
		this.gridBagConstraintsBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_creditoBanco.add(jButtonid_cuenta_contable_creditoBancoUpdate, this.gridBagConstraintsBanco);
	}

	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBanco.gridy = 0;
	this.gridBagConstraintsBanco.gridx = 1;
	this.gridBagConstraintsBanco.ipadx = 0;
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_creditoBanco.add(jComboBoxid_cuenta_contable_creditoBanco, this.gridBagConstraintsBanco);


	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBanco.gridy = 0;
	this.gridBagConstraintsBanco.gridx = 0;
	this.gridBagConstraintsBanco.ipadx = 0;
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldelimitadorBanco.add(jLabeldelimitadorBanco, this.gridBagConstraintsBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBanco = new GridBagConstraints();
		//this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBanco.gridy = 0;
		this.gridBagConstraintsBanco.gridx = 2;
		this.gridBagConstraintsBanco.ipadx = 0;
		this.gridBagConstraintsBanco.insets = new Insets(0, 0, 0, 0);
		this.jPaneldelimitadorBanco.add(jButtondelimitadorBancoBusqueda, this.gridBagConstraintsBanco);
	}

	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBanco.gridy = 0;
	this.gridBagConstraintsBanco.gridx = 1;
	this.gridBagConstraintsBanco.ipadx = 0;
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldelimitadorBanco.add(jTextFielddelimitadorBanco, this.gridBagConstraintsBanco);


	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBanco.gridy = 0;
	this.gridBagConstraintsBanco.gridx = 0;
	this.gridBagConstraintsBanco.ipadx = 0;
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formato1Banco.add(jLabelid_formato1Banco, this.gridBagConstraintsBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBanco = new GridBagConstraints();
		//this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBanco.gridy = 0;
		this.gridBagConstraintsBanco.gridx = 2;
		this.gridBagConstraintsBanco.ipadx = 0;
		this.gridBagConstraintsBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato1Banco.add(jButtonid_formato1BancoBusqueda, this.gridBagConstraintsBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBanco = new GridBagConstraints();
		//this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBanco.gridy = 0;
		this.gridBagConstraintsBanco.gridx = 3;
		this.gridBagConstraintsBanco.ipadx = 0;
		this.gridBagConstraintsBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato1Banco.add(jButtonid_formato1BancoUpdate, this.gridBagConstraintsBanco);
	}

	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBanco.gridy = 0;
	this.gridBagConstraintsBanco.gridx = 1;
	this.gridBagConstraintsBanco.ipadx = 0;
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formato1Banco.add(jComboBoxid_formato1Banco, this.gridBagConstraintsBanco);


	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBanco.gridy = 0;
	this.gridBagConstraintsBanco.gridx = 0;
	this.gridBagConstraintsBanco.ipadx = 0;
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formato2Banco.add(jLabelid_formato2Banco, this.gridBagConstraintsBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBanco = new GridBagConstraints();
		//this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBanco.gridy = 0;
		this.gridBagConstraintsBanco.gridx = 2;
		this.gridBagConstraintsBanco.ipadx = 0;
		this.gridBagConstraintsBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato2Banco.add(jButtonid_formato2BancoBusqueda, this.gridBagConstraintsBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBanco = new GridBagConstraints();
		//this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBanco.gridy = 0;
		this.gridBagConstraintsBanco.gridx = 3;
		this.gridBagConstraintsBanco.ipadx = 0;
		this.gridBagConstraintsBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato2Banco.add(jButtonid_formato2BancoUpdate, this.gridBagConstraintsBanco);
	}

	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBanco.gridy = 0;
	this.gridBagConstraintsBanco.gridx = 1;
	this.gridBagConstraintsBanco.ipadx = 0;
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formato2Banco.add(jComboBoxid_formato2Banco, this.gridBagConstraintsBanco);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBanco.gridy = iYPanelCamposBanco;
	this.gridBagConstraintsBanco.gridx = iXPanelCamposBanco++;
	this.gridBagConstraintsBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBanco.add(this.jPanelidBanco, this.gridBagConstraintsBanco);



	if(iXPanelCamposBanco % 1==0) {
		iXPanelCamposBanco=0;
		iYPanelCamposBanco++;
	}
	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBanco.gridy = iYPanelCamposBanco;
	this.gridBagConstraintsBanco.gridx = iXPanelCamposBanco++;
	this.gridBagConstraintsBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBanco.add(this.jPanelcodigoBanco, this.gridBagConstraintsBanco);



	if(iXPanelCamposBanco % 1==0) {
		iXPanelCamposBanco=0;
		iYPanelCamposBanco++;
	}
	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBanco.gridy = iYPanelCamposBanco;
	this.gridBagConstraintsBanco.gridx = iXPanelCamposBanco++;
	this.gridBagConstraintsBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBanco.add(this.jPanelcodigo_institucionBanco, this.gridBagConstraintsBanco);



	if(iXPanelCamposBanco % 1==0) {
		iXPanelCamposBanco=0;
		iYPanelCamposBanco++;
	}
	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBanco.gridy = iYPanelCamposBanco;
	this.gridBagConstraintsBanco.gridx = iXPanelCamposBanco++;
	this.gridBagConstraintsBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBanco.add(this.jPanelnombreBanco, this.gridBagConstraintsBanco);



	if(iXPanelCamposBanco % 1==0) {
		iXPanelCamposBanco=0;
		iYPanelCamposBanco++;
	}
	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBanco.gridy = iYPanelCamposBanco;
	this.gridBagConstraintsBanco.gridx = iXPanelCamposBanco++;
	this.gridBagConstraintsBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBanco.add(this.jPanelid_tipo_bancoBanco, this.gridBagConstraintsBanco);



	if(iXPanelCamposBanco % 1==0) {
		iXPanelCamposBanco=0;
		iYPanelCamposBanco++;
	}
	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBanco.gridy = iYPanelCamposBanco;
	this.gridBagConstraintsBanco.gridx = iXPanelCamposBanco++;
	this.gridBagConstraintsBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBanco.add(this.jPaneldias_efectivo_localBanco, this.gridBagConstraintsBanco);



	if(iXPanelCamposBanco % 1==0) {
		iXPanelCamposBanco=0;
		iYPanelCamposBanco++;
	}
	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBanco.gridy = iYPanelCamposBanco;
	this.gridBagConstraintsBanco.gridx = iXPanelCamposBanco++;
	this.gridBagConstraintsBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBanco.add(this.jPaneldias_efectivo_extranjeroBanco, this.gridBagConstraintsBanco);



	if(iXPanelCamposBanco % 1==0) {
		iXPanelCamposBanco=0;
		iYPanelCamposBanco++;
	}
	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBanco.gridy = iYPanelCamposBanco;
	this.gridBagConstraintsBanco.gridx = iXPanelCamposBanco++;
	this.gridBagConstraintsBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBanco.add(this.jPanelid_cuenta_contable_debitoBanco, this.gridBagConstraintsBanco);



	if(iXPanelCamposBanco % 1==0) {
		iXPanelCamposBanco=0;
		iYPanelCamposBanco++;
	}
	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBanco.gridy = iYPanelCamposBanco;
	this.gridBagConstraintsBanco.gridx = iXPanelCamposBanco++;
	this.gridBagConstraintsBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBanco.add(this.jPanelid_cuenta_contable_creditoBanco, this.gridBagConstraintsBanco);



	if(iXPanelCamposBanco % 1==0) {
		iXPanelCamposBanco=0;
		iYPanelCamposBanco++;
	}
	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBanco.gridy = iYPanelCamposBanco;
	this.gridBagConstraintsBanco.gridx = iXPanelCamposBanco++;
	this.gridBagConstraintsBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBanco.add(this.jPaneldelimitadorBanco, this.gridBagConstraintsBanco);



	if(iXPanelCamposBanco % 1==0) {
		iXPanelCamposBanco=0;
		iYPanelCamposBanco++;
	}
	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBanco.gridy = iYPanelCamposBanco;
	this.gridBagConstraintsBanco.gridx = iXPanelCamposBanco++;
	this.gridBagConstraintsBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBanco.add(this.jPanelid_formato1Banco, this.gridBagConstraintsBanco);



	if(iXPanelCamposBanco % 1==0) {
		iXPanelCamposBanco=0;
		iYPanelCamposBanco++;
	}
	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBanco.gridy = iYPanelCamposBanco;
	this.gridBagConstraintsBanco.gridx = iXPanelCamposBanco++;
	this.gridBagConstraintsBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBanco.add(this.jPanelid_formato2Banco, this.gridBagConstraintsBanco);



	if(iXPanelCamposBanco % 1==0) {
		iXPanelCamposBanco=0;
		iYPanelCamposBanco++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBanco.gridy = iYPanelCamposOcultosBanco;
	this.gridBagConstraintsBanco.gridx = iXPanelCamposOcultosBanco++;
	this.gridBagConstraintsBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosBanco.add(this.jPanelid_empresaBanco, this.gridBagConstraintsBanco);



	if(iXPanelCamposOcultosBanco % 1==0) {
		iXPanelCamposOcultosBanco=0;
		iYPanelCamposOcultosBanco++;
	}
	this.gridBagConstraintsBanco = new GridBagConstraints();
	this.gridBagConstraintsBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBanco.gridy = iYPanelCamposOcultosBanco;
	this.gridBagConstraintsBanco.gridx = iXPanelCamposOcultosBanco++;
	this.gridBagConstraintsBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosBanco.add(this.jPanelid_sucursalBanco, this.gridBagConstraintsBanco);



	if(iXPanelCamposOcultosBanco % 1==0) {
		iXPanelCamposOcultosBanco=0;
		iYPanelCamposOcultosBanco++;
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
			
		GridBagLayout gridaBagLayoutAccionesBanco= new GridBagLayout();
		this.jPanelAccionesBanco.setLayout(gridaBagLayoutAccionesBanco);
		
		GridBagLayout gridaBagLayoutAccionesFormularioBanco= new GridBagLayout();
		this.jPanelAccionesFormularioBanco.setLayout(gridaBagLayoutAccionesFormularioBanco);
		
		this.gridBagConstraintsBanco = new GridBagConstraints();
		this.gridBagConstraintsBanco.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsBanco.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioBanco.add(this.jComboBoxTiposAccionesFormularioBanco, this.gridBagConstraintsBanco);

		this.gridBagConstraintsBanco = new GridBagConstraints();
		this.gridBagConstraintsBanco.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsBanco.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioBanco.add(this.jCheckBoxPostAccionNuevoBanco, this.gridBagConstraintsBanco);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.bancoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsBanco = new GridBagConstraints();
			this.gridBagConstraintsBanco.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsBanco.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioBanco.add(this.jCheckBoxPostAccionSinCerrarBanco, this.gridBagConstraintsBanco);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.bancoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.bancoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsBanco = new GridBagConstraints();
			this.gridBagConstraintsBanco.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsBanco.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioBanco.add(this.jCheckBoxPostAccionSinMensajeBanco, this.gridBagConstraintsBanco);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsBanco = new GridBagConstraints();
		this.gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBanco.gridy = 0;
		this.gridBagConstraintsBanco.gridx = iPosXAccion++;
			
		this.jPanelAccionesBanco.add(this.jButtonModificarBanco, this.gridBagConstraintsBanco);							

		this.gridBagConstraintsBanco = new GridBagConstraints();
		this.gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBanco.gridy = 0;
		this.gridBagConstraintsBanco.gridx =iPosXAccion++;
			
		this.jPanelAccionesBanco.add(this.jButtonEliminarBanco, this.gridBagConstraintsBanco);
		
			
		this.gridBagConstraintsBanco = new GridBagConstraints();
		this.gridBagConstraintsBanco.gridy = 0;		
		this.gridBagConstraintsBanco.gridx = iPosXAccion++;
		
		this.jPanelAccionesBanco.add(this.jButtonActualizarBanco, this.gridBagConstraintsBanco);


		this.gridBagConstraintsBanco = new GridBagConstraints();
		this.gridBagConstraintsBanco.gridy = 0;		
		this.gridBagConstraintsBanco.gridx = iPosXAccion++;
		
		this.jPanelAccionesBanco.add(this.jButtonGuardarCambiosBanco, this.gridBagConstraintsBanco);	
		
		this.gridBagConstraintsBanco = new GridBagConstraints();
		this.gridBagConstraintsBanco.gridy = 0;		
		this.gridBagConstraintsBanco.gridx =iPosXAccion++;
		
		this.jPanelAccionesBanco.add(this.jButtonCancelarBanco, this.gridBagConstraintsBanco);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutBanco = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutBanco);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.bancoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsBanco = new GridBagConstraints();						
			this.gridBagConstraintsBanco.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBanco.gridx = 0;		
			//this.gridBagConstraintsBanco.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBanco.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsBanco.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsBanco = new GridBagConstraints();
		this.gridBagConstraintsBanco.gridy =iGridyPrincipal++;
		this.gridBagConstraintsBanco.gridx =0;
		this.gridBagConstraintsBanco.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsBanco.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosBanco, this.gridBagConstraintsBanco);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(BancoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleBanco = new BancoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Banco DATOS");
			
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
			
	        //this.setTitle("[FOR] - Banco DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Banco Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			BancoModel bancoModel=new BancoModel(this);
			
			//SI USARA CLASE INTERNA
			//BancoModel.BancoFocusTraversalPolicy bancoFocusTraversalPolicy = bancoModel.new BancoFocusTraversalPolicy(this);
			
			//bancoFocusTraversalPolicy.setbancoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(bancoModel);
			
			
			this.jContentPaneDetalleBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleBanco = new GridBagLayout();	
			this.jContentPaneDetalleBanco.setLayout(gridaBagLayoutDetalleBanco);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosBanco = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsBanco = new GridBagConstraints();
				this.gridBagConstraintsBanco.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsBanco.gridx = 0;
					
				
				this.jContentPaneDetalleBanco.add(jTtoolBarDetalleBanco, gridBagConstraintsBanco);								
				
}
			
			this.jScrollPanelDatosEdicionBanco=   new JScrollPane(jContentPaneDetalleBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralBanco=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsBanco = new GridBagConstraints();
			
			
	        this.gridBagConstraintsBanco.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsBanco.gridx = 0;
	        
			this.jContentPaneDetalleBanco.add(jPanelCamposBanco, gridBagConstraintsBanco);
			
			
			
			
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
						&& bancoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameAutoriPago(this.puedeCargarPorParteAutoriPago,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCuentaBanco(this.puedeCargarPorParteCuentaBanco,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCuentaBancoPunVen(this.puedeCargarPorParteCuentaBancoPunVen,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFormaPagoPuntoVenta(this.puedeCargarPorParteFormaPagoPuntoVenta,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePoliticasCliente(this.puedeCargarPorPartePoliticasCliente,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTarjetaCredito(this.puedeCargarPorParteTarjetaCredito,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTipoCuentaBancoGeneral(this.puedeCargarPorParteTipoCuentaBancoGeneral,false,-1);
					
					if(this.bancoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsBanco= new GridBagConstraints();
						this.gridBagConstraintsBanco.gridy = iGridyRelaciones++;
						this.gridBagConstraintsBanco.gridx = 0;
						this.jContentPaneDetalleBanco.add(this.jTabbedPaneRelacionesBanco, this.gridBagConstraintsBanco);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesBanco.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameAutoriPago(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCuentaBanco(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCuentaBancoPunVen(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFormaPagoPuntoVenta(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePoliticasCliente(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTarjetaCredito(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTipoCuentaBancoGeneral(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosBanco.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsBanco = new GridBagConstraints();
					this.gridBagConstraintsBanco.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsBanco.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsBanco.gridx = 0;
					
				
					this.jContentPaneDetalleBanco.add(jPanelCamposOcultosBanco, gridBagConstraintsBanco);
				
					this.jPanelCamposOcultosBanco.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsBanco = new GridBagConstraints();
			this.gridBagConstraintsBanco.gridy = iGridyRelaciones++;//22;		
	        this.gridBagConstraintsBanco.gridx = 0;
	        this.gridBagConstraintsBanco.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleBanco.add(this.jPanelAccionesFormularioBanco, this.gridBagConstraintsBanco);							
			
			
			
			this.gridBagConstraintsBanco = new GridBagConstraints();
	        this.gridBagConstraintsBanco.gridy = iGridyRelaciones;//22;		
	        this.gridBagConstraintsBanco.gridx = 0;
	        
			
			this.jContentPaneDetalleBanco.add(this.jPanelAccionesBanco, this.gridBagConstraintsBanco);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionBanco);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionBanco=   new JScrollPane(this.jPanelCamposBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsBanco = new GridBagConstraints();
			this.gridBagConstraintsBanco.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsBanco.gridx = 0;
			this.gridBagConstraintsBanco.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsBanco.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionBanco, this.gridBagConstraintsBanco);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsBanco = new GridBagConstraints();
			this.gridBagConstraintsBanco.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsBanco.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioBanco, this.gridBagConstraintsBanco);			
			
			this.gridBagConstraintsBanco = new GridBagConstraints();
			this.gridBagConstraintsBanco.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsBanco.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesBanco, this.gridBagConstraintsBanco);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsBanco = new GridBagConstraints();
		this.gridBagConstraintsBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposBanco, this.gridBagConstraintsBanco);
			
			
		this.gridBagConstraintsBanco = new GridBagConstraints();
		this.gridBagConstraintsBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosBanco, this.gridBagConstraintsBanco);
		
			
		this.gridBagConstraintsBanco = new GridBagConstraints();
		this.gridBagConstraintsBanco.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsBanco.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesBanco, this.gridBagConstraintsBanco);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralBanco;//jContentPane;
		
		return jScrollPanelDatosEdicionBanco;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameAutoriPago(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.autoripagoSessionBean=new AutoriPagoSessionBean();
		this.autoripagoSessionBean.setConGuardarRelaciones(false);
		this.autoripagoSessionBean.setEsGuardarRelacionado(true);

		this.autoripagoBeanSwingJInternalFrame=null;//new AutoriPagoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.autoripagoBeanSwingJInternalFramePopup=new AutoriPagoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.autoripagoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.autoripagoSessionBean.getEsGuardarRelacionado()) {

				AutoriPagoJInternalFrame.STIPO_TAMANIO_GENERAL=BancoJInternalFrame.STIPO_TAMANIO_GENERAL;
				AutoriPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=BancoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.autoripagoSessionBean.setEsGuardarRelacionado(true);

				this.autoripagoBeanSwingJInternalFrame=new AutoriPagoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.autoripagoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.autoripagoBeanSwingJInternalFrame.setautoripagoSessionBean(this.autoripagoSessionBean);

				//this.gridBagConstraintsBanco = new GridBagConstraints();
				//this.gridBagConstraintsBanco.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsBanco.gridx = 0;
				//this.jContentPaneDetalleBanco.add(this.autoripagoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsBanco);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesBanco.add("Autori Pagos",this.autoripagoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesBanco.setComponentAt(iIndexTab,this.autoripagoBeanSwingJInternalFrame.getContentPane());
				}

				//AutoriPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.autoripagoSessionBean.setEsGuardarRelacionado(false);
				this.autoripagoBeanSwingJInternalFrame=null;//new AutoriPagoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.autoripagoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteAutoriPago) {
					this.jTabbedPaneRelacionesBanco.add("Autori Pagos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameCuentaBanco(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cuentabancoSessionBean=new CuentaBancoSessionBean();
		this.cuentabancoSessionBean.setConGuardarRelaciones(false);
		this.cuentabancoSessionBean.setEsGuardarRelacionado(true);

		this.cuentabancoBeanSwingJInternalFrame=null;//new CuentaBancoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cuentabancoBeanSwingJInternalFramePopup=new CuentaBancoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cuentabancoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cuentabancoSessionBean.getEsGuardarRelacionado()) {

				CuentaBancoJInternalFrame.STIPO_TAMANIO_GENERAL=BancoJInternalFrame.STIPO_TAMANIO_GENERAL;
				CuentaBancoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=BancoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cuentabancoSessionBean.setEsGuardarRelacionado(true);

				this.cuentabancoBeanSwingJInternalFrame=new CuentaBancoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cuentabancoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cuentabancoBeanSwingJInternalFrame.setcuentabancoSessionBean(this.cuentabancoSessionBean);

				//this.gridBagConstraintsBanco = new GridBagConstraints();
				//this.gridBagConstraintsBanco.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsBanco.gridx = 0;
				//this.jContentPaneDetalleBanco.add(this.cuentabancoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsBanco);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesBanco.add("Cuenta Bancos",this.cuentabancoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesBanco.setComponentAt(iIndexTab,this.cuentabancoBeanSwingJInternalFrame.getContentPane());
				}

				//CuentaBancoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cuentabancoSessionBean.setEsGuardarRelacionado(false);
				this.cuentabancoBeanSwingJInternalFrame=null;//new CuentaBancoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cuentabancoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCuentaBanco) {
					this.jTabbedPaneRelacionesBanco.add("Cuenta Bancos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameCuentaBancoPunVen(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cuentabancopunvenSessionBean=new CuentaBancoPunVenSessionBean();
		this.cuentabancopunvenSessionBean.setConGuardarRelaciones(false);
		this.cuentabancopunvenSessionBean.setEsGuardarRelacionado(true);

		this.cuentabancopunvenBeanSwingJInternalFrame=null;//new CuentaBancoPunVenBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cuentabancopunvenBeanSwingJInternalFramePopup=new CuentaBancoPunVenBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cuentabancopunvenBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {

				CuentaBancoPunVenJInternalFrame.STIPO_TAMANIO_GENERAL=BancoJInternalFrame.STIPO_TAMANIO_GENERAL;
				CuentaBancoPunVenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=BancoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cuentabancopunvenSessionBean.setEsGuardarRelacionado(true);

				this.cuentabancopunvenBeanSwingJInternalFrame=new CuentaBancoPunVenBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cuentabancopunvenBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cuentabancopunvenBeanSwingJInternalFrame.setcuentabancopunvenSessionBean(this.cuentabancopunvenSessionBean);

				//this.gridBagConstraintsBanco = new GridBagConstraints();
				//this.gridBagConstraintsBanco.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsBanco.gridx = 0;
				//this.jContentPaneDetalleBanco.add(this.cuentabancopunvenBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsBanco);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesBanco.add("Cuenta Bancoes",this.cuentabancopunvenBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesBanco.setComponentAt(iIndexTab,this.cuentabancopunvenBeanSwingJInternalFrame.getContentPane());
				}

				//CuentaBancoPunVenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cuentabancopunvenSessionBean.setEsGuardarRelacionado(false);
				this.cuentabancopunvenBeanSwingJInternalFrame=null;//new CuentaBancoPunVenBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCuentaBancoPunVen) {
					this.jTabbedPaneRelacionesBanco.add("Cuenta Bancoes",new JPanel());
				}
			}
		}
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

				FormaPagoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=BancoJInternalFrame.STIPO_TAMANIO_GENERAL;
				FormaPagoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=BancoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.formapagopuntoventaSessionBean.setEsGuardarRelacionado(true);

				this.formapagopuntoventaBeanSwingJInternalFrame=new FormaPagoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.formapagopuntoventaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.formapagopuntoventaBeanSwingJInternalFrame.setformapagopuntoventaSessionBean(this.formapagopuntoventaSessionBean);

				//this.gridBagConstraintsBanco = new GridBagConstraints();
				//this.gridBagConstraintsBanco.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsBanco.gridx = 0;
				//this.jContentPaneDetalleBanco.add(this.formapagopuntoventaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsBanco);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesBanco.add("Forma Pagoes",this.formapagopuntoventaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesBanco.setComponentAt(iIndexTab,this.formapagopuntoventaBeanSwingJInternalFrame.getContentPane());
				}

				//FormaPagoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.formapagopuntoventaSessionBean.setEsGuardarRelacionado(false);
				this.formapagopuntoventaBeanSwingJInternalFrame=null;//new FormaPagoPuntoVentaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFormaPagoPuntoVenta) {
					this.jTabbedPaneRelacionesBanco.add("Forma Pagoes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePoliticasCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.politicasclienteSessionBean=new PoliticasClienteSessionBean();
		this.politicasclienteSessionBean.setConGuardarRelaciones(false);
		this.politicasclienteSessionBean.setEsGuardarRelacionado(true);

		this.politicasclienteBeanSwingJInternalFrame=null;//new PoliticasClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.politicasclienteBeanSwingJInternalFramePopup=new PoliticasClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.politicasclienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.politicasclienteSessionBean.getEsGuardarRelacionado()) {

				PoliticasClienteJInternalFrame.STIPO_TAMANIO_GENERAL=BancoJInternalFrame.STIPO_TAMANIO_GENERAL;
				PoliticasClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=BancoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.politicasclienteSessionBean.setEsGuardarRelacionado(true);

				this.politicasclienteBeanSwingJInternalFrame=new PoliticasClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.politicasclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.politicasclienteBeanSwingJInternalFrame.setpoliticasclienteSessionBean(this.politicasclienteSessionBean);

				//this.gridBagConstraintsBanco = new GridBagConstraints();
				//this.gridBagConstraintsBanco.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsBanco.gridx = 0;
				//this.jContentPaneDetalleBanco.add(this.politicasclienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsBanco);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesBanco.add("Politicas Clientes",this.politicasclienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesBanco.setComponentAt(iIndexTab,this.politicasclienteBeanSwingJInternalFrame.getContentPane());
				}

				//PoliticasClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.politicasclienteSessionBean.setEsGuardarRelacionado(false);
				this.politicasclienteBeanSwingJInternalFrame=null;//new PoliticasClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.politicasclienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePoliticasCliente) {
					this.jTabbedPaneRelacionesBanco.add("Politicas Clientes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameTarjetaCredito(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.tarjetacreditoSessionBean=new TarjetaCreditoSessionBean();
		this.tarjetacreditoSessionBean.setConGuardarRelaciones(false);
		this.tarjetacreditoSessionBean.setEsGuardarRelacionado(true);

		this.tarjetacreditoBeanSwingJInternalFrame=null;//new TarjetaCreditoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.tarjetacreditoBeanSwingJInternalFramePopup=new TarjetaCreditoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.tarjetacreditoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.tarjetacreditoSessionBean.getEsGuardarRelacionado()) {

				TarjetaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL=BancoJInternalFrame.STIPO_TAMANIO_GENERAL;
				TarjetaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=BancoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.tarjetacreditoSessionBean.setEsGuardarRelacionado(true);

				this.tarjetacreditoBeanSwingJInternalFrame=new TarjetaCreditoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.tarjetacreditoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.tarjetacreditoBeanSwingJInternalFrame.settarjetacreditoSessionBean(this.tarjetacreditoSessionBean);

				//this.gridBagConstraintsBanco = new GridBagConstraints();
				//this.gridBagConstraintsBanco.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsBanco.gridx = 0;
				//this.jContentPaneDetalleBanco.add(this.tarjetacreditoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsBanco);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesBanco.add("Tarjeta Creditos",this.tarjetacreditoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesBanco.setComponentAt(iIndexTab,this.tarjetacreditoBeanSwingJInternalFrame.getContentPane());
				}

				//TarjetaCreditoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.tarjetacreditoSessionBean.setEsGuardarRelacionado(false);
				this.tarjetacreditoBeanSwingJInternalFrame=null;//new TarjetaCreditoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.tarjetacreditoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteTarjetaCredito) {
					this.jTabbedPaneRelacionesBanco.add("Tarjeta Creditos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameTipoCuentaBancoGeneral(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.tipocuentabancogeneralSessionBean=new TipoCuentaBancoGeneralSessionBean();
		this.tipocuentabancogeneralSessionBean.setConGuardarRelaciones(false);
		this.tipocuentabancogeneralSessionBean.setEsGuardarRelacionado(true);

		this.tipocuentabancogeneralBeanSwingJInternalFrame=null;//new TipoCuentaBancoGeneralBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.tipocuentabancogeneralBeanSwingJInternalFramePopup=new TipoCuentaBancoGeneralBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.tipocuentabancogeneralBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {

				TipoCuentaBancoGeneralJInternalFrame.STIPO_TAMANIO_GENERAL=BancoJInternalFrame.STIPO_TAMANIO_GENERAL;
				TipoCuentaBancoGeneralJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=BancoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.tipocuentabancogeneralSessionBean.setEsGuardarRelacionado(true);

				this.tipocuentabancogeneralBeanSwingJInternalFrame=new TipoCuentaBancoGeneralBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.tipocuentabancogeneralBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.tipocuentabancogeneralBeanSwingJInternalFrame.settipocuentabancogeneralSessionBean(this.tipocuentabancogeneralSessionBean);

				//this.gridBagConstraintsBanco = new GridBagConstraints();
				//this.gridBagConstraintsBanco.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsBanco.gridx = 0;
				//this.jContentPaneDetalleBanco.add(this.tipocuentabancogeneralBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsBanco);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesBanco.add("Tipo Cuenta Banco Generales",this.tipocuentabancogeneralBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesBanco.setComponentAt(iIndexTab,this.tipocuentabancogeneralBeanSwingJInternalFrame.getContentPane());
				}

				//TipoCuentaBancoGeneralJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.tipocuentabancogeneralSessionBean.setEsGuardarRelacionado(false);
				this.tipocuentabancogeneralBeanSwingJInternalFrame=null;//new TipoCuentaBancoGeneralBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteTipoCuentaBancoGeneral) {
					this.jTabbedPaneRelacionesBanco.add("Tipo Cuenta Banco Generales",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarCuentaBancoPunVenBeanSwingJInternalFrame(List<Banco> bancos,Banco banco,CuentaBancoPunVenBeanSwingJInternalFrame cuentabancopunvenBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cuentabancopunvenBeanSwingJInternalFrame=new CuentaBancoPunVenBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cuentabancopunvenBeanSwingJInternalFrame.getCuentaBancoPunVenLogic().setConnexion(this.bancoLogic.getConnexion());

					cuentabancopunvenBeanSwingJInternalFrame.setbancosForeignKey(bancos);
					cuentabancopunvenBeanSwingJInternalFrame.setbancoForeignKey(banco);
					cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvenSessionBean.setisBusquedaDesdeForeignKeySesionBanco(true);
					cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvenSessionBean.setlidBancoActual(banco.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cuentabancopunvenBeanSwingJInternalFrame.cargarCombosForeignKeyCuentaBancoPunVen(cuentabancopunvenBeanSwingJInternalFrame.isCargarCombosDependencia);
					cuentabancopunvenBeanSwingJInternalFrame.setVisibilidadBusquedasParaBanco(true);
					cuentabancopunvenBeanSwingJInternalFrame.setid_bancoFK_IdBanco(banco.getId());

					if(!this.conCargarFormDetalle) {
						cuentabancopunvenBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cuentabancopunvenBeanSwingJInternalFrame.setSelectedItemCombosFrameBancoForeignKey(banco,1,false,true,true);
					cuentabancopunvenBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cuentabancopunvenBeanSwingJInternalFrame.procesarBusqueda("FK_IdBanco");
					cuentabancopunvenBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdBanco");
					cuentabancopunvenBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaBancoPunVen(true);
					cuentabancopunvenBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCuentaBancoPunVen("n",cuentabancopunvenBeanSwingJInternalFrame.isGuardarCambiosEnLote, cuentabancopunvenBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cuentabancopunvenBeanSwingJInternalFrame.setAutoscrolls(true);
					cuentabancopunvenBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cuentabancopunvenBeanSwingJInternalFrame.actualizarEstadoPanelsCuentaBancoPunVen("relacionado");
					} else {
						cuentabancopunvenBeanSwingJInternalFrame.actualizarEstadoPanelsCuentaBancoPunVen("no_relacionado");
					}

					cuentabancopunvenBeanSwingJInternalFrame.getjButtonRecargarInformacionCuentaBancoPunVen().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPoliticasClienteBeanSwingJInternalFrame(List<Banco> bancos,Banco banco,PoliticasClienteBeanSwingJInternalFrame politicasclienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//politicasclienteBeanSwingJInternalFrame=new PoliticasClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					politicasclienteBeanSwingJInternalFrame.getPoliticasClienteLogic().setConnexion(this.bancoLogic.getConnexion());

					politicasclienteBeanSwingJInternalFrame.setbancosForeignKey(bancos);
					politicasclienteBeanSwingJInternalFrame.setbancoForeignKey(banco);
					politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.setisBusquedaDesdeForeignKeySesionBanco(true);
					politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.setlidBancoActual(banco.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					politicasclienteBeanSwingJInternalFrame.cargarCombosForeignKeyPoliticasCliente(politicasclienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					politicasclienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaBanco(true);
					politicasclienteBeanSwingJInternalFrame.setid_bancoFK_IdBanco(banco.getId());

					if(!this.conCargarFormDetalle) {
						politicasclienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					politicasclienteBeanSwingJInternalFrame.setSelectedItemCombosFrameBancoForeignKey(banco,1,false,true,true);
					politicasclienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					politicasclienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdBanco");
					politicasclienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdBanco");
					politicasclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaPoliticasCliente(true);
					politicasclienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPoliticasCliente("n",politicasclienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, politicasclienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					politicasclienteBeanSwingJInternalFrame.inicializarActualizarBindingPoliticasCliente(false);
					politicasclienteBeanSwingJInternalFrame.setAutoscrolls(true);
					politicasclienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						politicasclienteBeanSwingJInternalFrame.actualizarEstadoPanelsPoliticasCliente("relacionado");
					} else {
						politicasclienteBeanSwingJInternalFrame.actualizarEstadoPanelsPoliticasCliente("no_relacionado");
					}

					politicasclienteBeanSwingJInternalFrame.getjButtonRecargarInformacionPoliticasCliente().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarFormaPagoPuntoVentaBeanSwingJInternalFrame(List<Banco> bancos,Banco banco,FormaPagoPuntoVentaBeanSwingJInternalFrame formapagopuntoventaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//formapagopuntoventaBeanSwingJInternalFrame=new FormaPagoPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					formapagopuntoventaBeanSwingJInternalFrame.getFormaPagoPuntoVentaLogic().setConnexion(this.bancoLogic.getConnexion());

					formapagopuntoventaBeanSwingJInternalFrame.setbancosForeignKey(bancos);
					formapagopuntoventaBeanSwingJInternalFrame.setbancoForeignKey(banco);
					formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionBanco(true);
					formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setlidBancoActual(banco.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					formapagopuntoventaBeanSwingJInternalFrame.cargarCombosForeignKeyFormaPagoPuntoVenta(formapagopuntoventaBeanSwingJInternalFrame.isCargarCombosDependencia);
					formapagopuntoventaBeanSwingJInternalFrame.setVisibilidadBusquedasParaBanco(true);
					formapagopuntoventaBeanSwingJInternalFrame.setid_bancoFK_IdBanco(banco.getId());

					if(!this.conCargarFormDetalle) {
						formapagopuntoventaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					formapagopuntoventaBeanSwingJInternalFrame.setSelectedItemCombosFrameBancoForeignKey(banco,1,false,true,true);
					formapagopuntoventaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					formapagopuntoventaBeanSwingJInternalFrame.procesarBusqueda("FK_IdBanco");
					formapagopuntoventaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdBanco");
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

		public void cargarTarjetaCreditoBeanSwingJInternalFrame(List<Banco> bancos,Banco banco,TarjetaCreditoBeanSwingJInternalFrame tarjetacreditoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//tarjetacreditoBeanSwingJInternalFrame=new TarjetaCreditoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					tarjetacreditoBeanSwingJInternalFrame.getTarjetaCreditoLogic().setConnexion(this.bancoLogic.getConnexion());

					tarjetacreditoBeanSwingJInternalFrame.setbancosForeignKey(bancos);
					tarjetacreditoBeanSwingJInternalFrame.setbancoForeignKey(banco);
					tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoSessionBean.setisBusquedaDesdeForeignKeySesionBanco(true);
					tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoSessionBean.setlidBancoActual(banco.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					tarjetacreditoBeanSwingJInternalFrame.cargarCombosForeignKeyTarjetaCredito(tarjetacreditoBeanSwingJInternalFrame.isCargarCombosDependencia);
					tarjetacreditoBeanSwingJInternalFrame.setVisibilidadBusquedasParaBanco(true);
					tarjetacreditoBeanSwingJInternalFrame.setid_bancoFK_IdBanco(banco.getId());

					if(!this.conCargarFormDetalle) {
						tarjetacreditoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					tarjetacreditoBeanSwingJInternalFrame.setSelectedItemCombosFrameBancoForeignKey(banco,1,false,true,true);
					tarjetacreditoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					tarjetacreditoBeanSwingJInternalFrame.procesarBusqueda("FK_IdBanco");
					tarjetacreditoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdBanco");
					tarjetacreditoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTarjetaCredito(true);
					tarjetacreditoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesTarjetaCredito("n",tarjetacreditoBeanSwingJInternalFrame.isGuardarCambiosEnLote, tarjetacreditoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					tarjetacreditoBeanSwingJInternalFrame.setAutoscrolls(true);
					tarjetacreditoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						tarjetacreditoBeanSwingJInternalFrame.actualizarEstadoPanelsTarjetaCredito("relacionado");
					} else {
						tarjetacreditoBeanSwingJInternalFrame.actualizarEstadoPanelsTarjetaCredito("no_relacionado");
					}

					tarjetacreditoBeanSwingJInternalFrame.getjButtonRecargarInformacionTarjetaCredito().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarAutoriPagoBeanSwingJInternalFrame(List<Banco> bancos,Banco banco,AutoriPagoBeanSwingJInternalFrame autoripagoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//autoripagoBeanSwingJInternalFrame=new AutoriPagoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					autoripagoBeanSwingJInternalFrame.getAutoriPagoLogic().setConnexion(this.bancoLogic.getConnexion());

					autoripagoBeanSwingJInternalFrame.setbancosForeignKey(bancos);
					autoripagoBeanSwingJInternalFrame.setbancoForeignKey(banco);
					autoripagoBeanSwingJInternalFrame.autoripagoSessionBean.setisBusquedaDesdeForeignKeySesionBanco(true);
					autoripagoBeanSwingJInternalFrame.autoripagoSessionBean.setlidBancoActual(banco.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					autoripagoBeanSwingJInternalFrame.cargarCombosForeignKeyAutoriPago(autoripagoBeanSwingJInternalFrame.isCargarCombosDependencia);
					autoripagoBeanSwingJInternalFrame.setVisibilidadBusquedasParaBanco(true);
					autoripagoBeanSwingJInternalFrame.setid_bancoFK_IdBanco(banco.getId());

					if(!this.conCargarFormDetalle) {
						autoripagoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					autoripagoBeanSwingJInternalFrame.setSelectedItemCombosFrameBancoForeignKey(banco,1,false,true,true);
					autoripagoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					autoripagoBeanSwingJInternalFrame.procesarBusqueda("FK_IdBanco");
					autoripagoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdBanco");
					autoripagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaAutoriPago(true);
					autoripagoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesAutoriPago("n",autoripagoBeanSwingJInternalFrame.isGuardarCambiosEnLote, autoripagoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					autoripagoBeanSwingJInternalFrame.setAutoscrolls(true);
					autoripagoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						autoripagoBeanSwingJInternalFrame.actualizarEstadoPanelsAutoriPago("relacionado");
					} else {
						autoripagoBeanSwingJInternalFrame.actualizarEstadoPanelsAutoriPago("no_relacionado");
					}

					autoripagoBeanSwingJInternalFrame.getjButtonRecargarInformacionAutoriPago().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarTipoCuentaBancoGeneralBeanSwingJInternalFrame(List<Banco> bancos,Banco banco,TipoCuentaBancoGeneralBeanSwingJInternalFrame tipocuentabancogeneralBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//tipocuentabancogeneralBeanSwingJInternalFrame=new TipoCuentaBancoGeneralBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					tipocuentabancogeneralBeanSwingJInternalFrame.getTipoCuentaBancoGeneralLogic().setConnexion(this.bancoLogic.getConnexion());

					tipocuentabancogeneralBeanSwingJInternalFrame.setbancosForeignKey(bancos);
					tipocuentabancogeneralBeanSwingJInternalFrame.setbancoForeignKey(banco);
					tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralSessionBean.setisBusquedaDesdeForeignKeySesionBanco(true);
					tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralSessionBean.setlidBancoActual(banco.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					tipocuentabancogeneralBeanSwingJInternalFrame.cargarCombosForeignKeyTipoCuentaBancoGeneral(tipocuentabancogeneralBeanSwingJInternalFrame.isCargarCombosDependencia);
					tipocuentabancogeneralBeanSwingJInternalFrame.setVisibilidadBusquedasParaBanco(true);
					tipocuentabancogeneralBeanSwingJInternalFrame.setid_bancoFK_IdBanco(banco.getId());

					if(!this.conCargarFormDetalle) {
						tipocuentabancogeneralBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					tipocuentabancogeneralBeanSwingJInternalFrame.setSelectedItemCombosFrameBancoForeignKey(banco,1,false,true,true);
					tipocuentabancogeneralBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					tipocuentabancogeneralBeanSwingJInternalFrame.procesarBusqueda("FK_IdBanco");
					tipocuentabancogeneralBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdBanco");
					tipocuentabancogeneralBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoCuentaBancoGeneral(true);
					tipocuentabancogeneralBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesTipoCuentaBancoGeneral("n",tipocuentabancogeneralBeanSwingJInternalFrame.isGuardarCambiosEnLote, tipocuentabancogeneralBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					tipocuentabancogeneralBeanSwingJInternalFrame.setAutoscrolls(true);
					tipocuentabancogeneralBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						tipocuentabancogeneralBeanSwingJInternalFrame.actualizarEstadoPanelsTipoCuentaBancoGeneral("relacionado");
					} else {
						tipocuentabancogeneralBeanSwingJInternalFrame.actualizarEstadoPanelsTipoCuentaBancoGeneral("no_relacionado");
					}

					tipocuentabancogeneralBeanSwingJInternalFrame.getjButtonRecargarInformacionTipoCuentaBancoGeneral().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarCuentaBancoBeanSwingJInternalFrame(List<Banco> bancos,Banco banco,CuentaBancoBeanSwingJInternalFrame cuentabancoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cuentabancoBeanSwingJInternalFrame=new CuentaBancoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cuentabancoBeanSwingJInternalFrame.getCuentaBancoLogic().setConnexion(this.bancoLogic.getConnexion());

					cuentabancoBeanSwingJInternalFrame.setbancosForeignKey(bancos);
					cuentabancoBeanSwingJInternalFrame.setbancoForeignKey(banco);
					cuentabancoBeanSwingJInternalFrame.cuentabancoSessionBean.setisBusquedaDesdeForeignKeySesionBanco(true);
					cuentabancoBeanSwingJInternalFrame.cuentabancoSessionBean.setlidBancoActual(banco.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cuentabancoBeanSwingJInternalFrame.cargarCombosForeignKeyCuentaBanco(cuentabancoBeanSwingJInternalFrame.isCargarCombosDependencia);
					cuentabancoBeanSwingJInternalFrame.setVisibilidadBusquedasParaBanco(true);
					cuentabancoBeanSwingJInternalFrame.setid_bancoFK_IdBanco(banco.getId());

					if(!this.conCargarFormDetalle) {
						cuentabancoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cuentabancoBeanSwingJInternalFrame.setSelectedItemCombosFrameBancoForeignKey(banco,1,false,true,true);
					cuentabancoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cuentabancoBeanSwingJInternalFrame.procesarBusqueda("FK_IdBanco");
					cuentabancoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdBanco");
					cuentabancoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaBanco(true);
					cuentabancoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCuentaBanco("n",cuentabancoBeanSwingJInternalFrame.isGuardarCambiosEnLote, cuentabancoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cuentabancoBeanSwingJInternalFrame.setAutoscrolls(true);
					cuentabancoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cuentabancoBeanSwingJInternalFrame.actualizarEstadoPanelsCuentaBanco("relacionado");
					} else {
						cuentabancoBeanSwingJInternalFrame.actualizarEstadoPanelsCuentaBanco("no_relacionado");
					}

					cuentabancoBeanSwingJInternalFrame.getjButtonRecargarInformacionCuentaBanco().setVisible(false);

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
