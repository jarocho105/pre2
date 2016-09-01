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

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.cartera.util.BalanceGeneralClienteConstantesFunciones;

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
public class BalanceGeneralClienteDetalleFormJInternalFrame extends BalanceGeneralClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleBalanceGeneralCliente;
	
	protected JMenuBar jmenuBarDetalleBalanceGeneralCliente;
	
	protected JMenu jmenuDetalleBalanceGeneralCliente;
	protected JMenu jmenuDetalleArchivoBalanceGeneralCliente;
	protected JMenu jmenuDetalleAccionesBalanceGeneralCliente;
	protected JMenu jmenuDetalleDatosBalanceGeneralCliente;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleBalanceGeneralCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutBalanceGeneralCliente;	
	protected GridBagConstraints gridBagConstraintsBalanceGeneralCliente;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected BalanceGeneralClienteBeanSwingJInternalFrameAdditional jInternalFrameDetalleBalanceGeneralCliente;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public BalanceGeneralClienteSessionBean balancegeneralclienteSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;	
	
	public BalanceGeneralClienteLogic balancegeneralclienteLogic;
	
	public JScrollPane jScrollPanelDatosBalanceGeneralCliente;
	public JScrollPane jScrollPanelDatosEdicionBalanceGeneralCliente;
	public JScrollPane jScrollPanelDatosGeneralBalanceGeneralCliente;
	
	protected JPanel jPanelCamposBalanceGeneralCliente;    
	protected JPanel jPanelCamposOcultosBalanceGeneralCliente;    	
	protected JPanel jPanelAccionesBalanceGeneralCliente;
	protected JPanel jPanelAccionesFormularioBalanceGeneralCliente;
    
	
	
	protected Integer iXPanelCamposBalanceGeneralCliente=0;
	protected Integer iYPanelCamposBalanceGeneralCliente=0;
	
	protected Integer iXPanelCamposOcultosBalanceGeneralCliente=0;
	protected Integer iYPanelCamposOcultosBalanceGeneralCliente=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoBalanceGeneralCliente;
	public JButton jButtonModificarBalanceGeneralCliente;
	public JButton jButtonActualizarBalanceGeneralCliente;
    public JButton jButtonEliminarBalanceGeneralCliente;
	public JButton jButtonCancelarBalanceGeneralCliente;
    public JButton jButtonGuardarCambiosBalanceGeneralCliente;
	public JButton jButtonGuardarCambiosTablaBalanceGeneralCliente;
	protected JButton jButtonCerrarBalanceGeneralCliente;
	
	
	protected JButton jButtonProcesarInformacionBalanceGeneralCliente;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoBalanceGeneralCliente;
	protected JCheckBox jCheckBoxPostAccionSinCerrarBalanceGeneralCliente;
	protected JCheckBox jCheckBoxPostAccionSinMensajeBalanceGeneralCliente;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarBalanceGeneralCliente;
	protected JButton jButtonModificarToolBarBalanceGeneralCliente;
	protected JButton jButtonActualizarToolBarBalanceGeneralCliente;
    protected JButton jButtonEliminarToolBarBalanceGeneralCliente;
	protected JButton jButtonCancelarToolBarBalanceGeneralCliente;
    protected JButton jButtonGuardarCambiosToolBarBalanceGeneralCliente;
	protected JButton jButtonGuardarCambiosTablaToolBarBalanceGeneralCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarBalanceGeneralCliente;
	protected JButton jButtonCerrarToolBarBalanceGeneralCliente;
	
	protected JButton jButtonProcesarInformacionToolBarBalanceGeneralCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoBalanceGeneralCliente;
	protected JMenuItem jMenuItemModificarBalanceGeneralCliente;
	protected JMenuItem jMenuItemActualizarBalanceGeneralCliente;
    protected JMenuItem jMenuItemEliminarBalanceGeneralCliente;
	protected JMenuItem jMenuItemCancelarBalanceGeneralCliente;
    protected JMenuItem jMenuItemGuardarCambiosBalanceGeneralCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaBalanceGeneralCliente;
	protected JMenuItem jMenuItemCerrarBalanceGeneralCliente;
	protected JMenuItem jMenuItemDetalleCerrarBalanceGeneralCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarBalanceGeneralCliente;
	
	protected JMenuItem jMenuItemProcesarInformacionBalanceGeneralCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosBalanceGeneralCliente;
	protected JMenuItem jMenuItemMostrarOcultarBalanceGeneralCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesBalanceGeneralCliente;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesBalanceGeneralCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesBalanceGeneralCliente;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioBalanceGeneralCliente;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidBalanceGeneralCliente;
	public JLabel jLabelIdBalanceGeneralCliente;
	public JLabel jLabelidBalanceGeneralCliente;
	public JButton jButtonidBalanceGeneralClienteBusqueda= new JButtonMe();

	public JPanel jPanelcaja_bancos_disponibleBalanceGeneralCliente;
	public JLabel jLabelcaja_bancos_disponibleBalanceGeneralCliente;
	public JTextField jTextFieldcaja_bancos_disponibleBalanceGeneralCliente;
	public JButton jButtoncaja_bancos_disponibleBalanceGeneralClienteBusqueda= new JButtonMe();

	public JPanel jPanelcuentas_por_cobrar_clientesBalanceGeneralCliente;
	public JLabel jLabelcuentas_por_cobrar_clientesBalanceGeneralCliente;
	public JTextField jTextFieldcuentas_por_cobrar_clientesBalanceGeneralCliente;
	public JButton jButtoncuentas_por_cobrar_clientesBalanceGeneralClienteBusqueda= new JButtonMe();

	public JPanel jPanelinventarioBalanceGeneralCliente;
	public JLabel jLabelinventarioBalanceGeneralCliente;
	public JTextField jTextFieldinventarioBalanceGeneralCliente;
	public JButton jButtoninventarioBalanceGeneralClienteBusqueda= new JButtonMe();

	public JPanel jPanelotros_activos_corrientesBalanceGeneralCliente;
	public JLabel jLabelotros_activos_corrientesBalanceGeneralCliente;
	public JTextField jTextFieldotros_activos_corrientesBalanceGeneralCliente;
	public JButton jButtonotros_activos_corrientesBalanceGeneralClienteBusqueda= new JButtonMe();

	public JPanel jPaneltotal_activos_corrientesBalanceGeneralCliente;
	public JLabel jLabeltotal_activos_corrientesBalanceGeneralCliente;
	public JTextField jTextFieldtotal_activos_corrientesBalanceGeneralCliente;
	public JButton jButtontotal_activos_corrientesBalanceGeneralClienteBusqueda= new JButtonMe();

	public JPanel jPanelbienes_inmueblesBalanceGeneralCliente;
	public JLabel jLabelbienes_inmueblesBalanceGeneralCliente;
	public JTextField jTextFieldbienes_inmueblesBalanceGeneralCliente;
	public JButton jButtonbienes_inmueblesBalanceGeneralClienteBusqueda= new JButtonMe();

	public JPanel jPanelbienes_mueblesBalanceGeneralCliente;
	public JLabel jLabelbienes_mueblesBalanceGeneralCliente;
	public JTextField jTextFieldbienes_mueblesBalanceGeneralCliente;
	public JButton jButtonbienes_mueblesBalanceGeneralClienteBusqueda= new JButtonMe();

	public JPanel jPanelotros_activos_no_corrientesBalanceGeneralCliente;
	public JLabel jLabelotros_activos_no_corrientesBalanceGeneralCliente;
	public JTextField jTextFieldotros_activos_no_corrientesBalanceGeneralCliente;
	public JButton jButtonotros_activos_no_corrientesBalanceGeneralClienteBusqueda= new JButtonMe();

	public JPanel jPaneltotal_activos_no_corrientesBalanceGeneralCliente;
	public JLabel jLabeltotal_activos_no_corrientesBalanceGeneralCliente;
	public JTextField jTextFieldtotal_activos_no_corrientesBalanceGeneralCliente;
	public JButton jButtontotal_activos_no_corrientesBalanceGeneralClienteBusqueda= new JButtonMe();

	public JPanel jPanelventas_mensualesBalanceGeneralCliente;
	public JLabel jLabelventas_mensualesBalanceGeneralCliente;
	public JTextField jTextFieldventas_mensualesBalanceGeneralCliente;
	public JButton jButtonventas_mensualesBalanceGeneralClienteBusqueda= new JButtonMe();

	public JPanel jPanelcosto_ventas_mensualesBalanceGeneralCliente;
	public JLabel jLabelcosto_ventas_mensualesBalanceGeneralCliente;
	public JTextField jTextFieldcosto_ventas_mensualesBalanceGeneralCliente;
	public JButton jButtoncosto_ventas_mensualesBalanceGeneralClienteBusqueda= new JButtonMe();

	public JPanel jPanelutilidad_brutaBalanceGeneralCliente;
	public JLabel jLabelutilidad_brutaBalanceGeneralCliente;
	public JTextField jTextFieldutilidad_brutaBalanceGeneralCliente;
	public JButton jButtonutilidad_brutaBalanceGeneralClienteBusqueda= new JButtonMe();

	public JPanel jPanelgastos_operativosBalanceGeneralCliente;
	public JLabel jLabelgastos_operativosBalanceGeneralCliente;
	public JTextField jTextFieldgastos_operativosBalanceGeneralCliente;
	public JButton jButtongastos_operativosBalanceGeneralClienteBusqueda= new JButtonMe();

	public JPanel jPanelsueldosBalanceGeneralCliente;
	public JLabel jLabelsueldosBalanceGeneralCliente;
	public JTextField jTextFieldsueldosBalanceGeneralCliente;
	public JButton jButtonsueldosBalanceGeneralClienteBusqueda= new JButtonMe();

	public JPanel jPanelserviciosBalanceGeneralCliente;
	public JLabel jLabelserviciosBalanceGeneralCliente;
	public JTextField jTextFieldserviciosBalanceGeneralCliente;
	public JButton jButtonserviciosBalanceGeneralClienteBusqueda= new JButtonMe();

	public JPanel jPanelarriendosBalanceGeneralCliente;
	public JLabel jLabelarriendosBalanceGeneralCliente;
	public JTextField jTextFieldarriendosBalanceGeneralCliente;
	public JButton jButtonarriendosBalanceGeneralClienteBusqueda= new JButtonMe();

	public JPanel jPanelimpuestosBalanceGeneralCliente;
	public JLabel jLabelimpuestosBalanceGeneralCliente;
	public JTextField jTextFieldimpuestosBalanceGeneralCliente;
	public JButton jButtonimpuestosBalanceGeneralClienteBusqueda= new JButtonMe();

	public JPanel jPanelutilidad_operativaBalanceGeneralCliente;
	public JLabel jLabelutilidad_operativaBalanceGeneralCliente;
	public JTextField jTextFieldutilidad_operativaBalanceGeneralCliente;
	public JButton jButtonutilidad_operativaBalanceGeneralClienteBusqueda= new JButtonMe();

	public JPanel jPanelgastos_familiaresBalanceGeneralCliente;
	public JLabel jLabelgastos_familiaresBalanceGeneralCliente;
	public JTextField jTextFieldgastos_familiaresBalanceGeneralCliente;
	public JButton jButtongastos_familiaresBalanceGeneralClienteBusqueda= new JButtonMe();

	public JPanel jPanelexcedente_antes_dividendosBalanceGeneralCliente;
	public JLabel jLabelexcedente_antes_dividendosBalanceGeneralCliente;
	public JTextField jTextFieldexcedente_antes_dividendosBalanceGeneralCliente;
	public JButton jButtonexcedente_antes_dividendosBalanceGeneralClienteBusqueda= new JButtonMe();

	public JPanel jPaneldividendos_bancos_otrosBalanceGeneralCliente;
	public JLabel jLabeldividendos_bancos_otrosBalanceGeneralCliente;
	public JTextField jTextFielddividendos_bancos_otrosBalanceGeneralCliente;
	public JButton jButtondividendos_bancos_otrosBalanceGeneralClienteBusqueda= new JButtonMe();

	public JPanel jPanelexedente_neto_mensualBalanceGeneralCliente;
	public JLabel jLabelexedente_neto_mensualBalanceGeneralCliente;
	public JTextField jTextFieldexedente_neto_mensualBalanceGeneralCliente;
	public JButton jButtonexedente_neto_mensualBalanceGeneralClienteBusqueda= new JButtonMe();

	public JPanel jPaneldeudas_bancariasBalanceGeneralCliente;
	public JLabel jLabeldeudas_bancariasBalanceGeneralCliente;
	public JTextField jTextFielddeudas_bancariasBalanceGeneralCliente;
	public JButton jButtondeudas_bancariasBalanceGeneralClienteBusqueda= new JButtonMe();

	public JPanel jPanelcuentas_por_pagarBalanceGeneralCliente;
	public JLabel jLabelcuentas_por_pagarBalanceGeneralCliente;
	public JTextField jTextFieldcuentas_por_pagarBalanceGeneralCliente;
	public JButton jButtoncuentas_por_pagarBalanceGeneralClienteBusqueda= new JButtonMe();

	public JPanel jPanelanticipos_recibosBalanceGeneralCliente;
	public JLabel jLabelanticipos_recibosBalanceGeneralCliente;
	public JTextField jTextFieldanticipos_recibosBalanceGeneralCliente;
	public JButton jButtonanticipos_recibosBalanceGeneralClienteBusqueda= new JButtonMe();

	public JPanel jPanelotras_cuentas_por_pagarBalanceGeneralCliente;
	public JLabel jLabelotras_cuentas_por_pagarBalanceGeneralCliente;
	public JTextField jTextFieldotras_cuentas_por_pagarBalanceGeneralCliente;
	public JButton jButtonotras_cuentas_por_pagarBalanceGeneralClienteBusqueda= new JButtonMe();

	public JPanel jPanelotras_deudas_familiaresBalanceGeneralCliente;
	public JLabel jLabelotras_deudas_familiaresBalanceGeneralCliente;
	public JTextField jTextFieldotras_deudas_familiaresBalanceGeneralCliente;
	public JButton jButtonotras_deudas_familiaresBalanceGeneralClienteBusqueda= new JButtonMe();

	public JPanel jPaneltotal_pasivo_corrienteBalanceGeneralCliente;
	public JLabel jLabeltotal_pasivo_corrienteBalanceGeneralCliente;
	public JTextField jTextFieldtotal_pasivo_corrienteBalanceGeneralCliente;
	public JButton jButtontotal_pasivo_corrienteBalanceGeneralClienteBusqueda= new JButtonMe();

	public JPanel jPaneldeudas_bancarias_largo_plazoBalanceGeneralCliente;
	public JLabel jLabeldeudas_bancarias_largo_plazoBalanceGeneralCliente;
	public JTextField jTextFielddeudas_bancarias_largo_plazoBalanceGeneralCliente;
	public JButton jButtondeudas_bancarias_largo_plazoBalanceGeneralClienteBusqueda= new JButtonMe();

	public JPanel jPanelotros_pasivos_largo_plazoBalanceGeneralCliente;
	public JLabel jLabelotros_pasivos_largo_plazoBalanceGeneralCliente;
	public JTextField jTextFieldotros_pasivos_largo_plazoBalanceGeneralCliente;
	public JButton jButtonotros_pasivos_largo_plazoBalanceGeneralClienteBusqueda= new JButtonMe();

	public JPanel jPaneltotal_pasivo_no_corrienteBalanceGeneralCliente;
	public JLabel jLabeltotal_pasivo_no_corrienteBalanceGeneralCliente;
	public JTextField jTextFieldtotal_pasivo_no_corrienteBalanceGeneralCliente;
	public JButton jButtontotal_pasivo_no_corrienteBalanceGeneralClienteBusqueda= new JButtonMe();

	public JPanel jPaneltotal_pasivoBalanceGeneralCliente;
	public JLabel jLabeltotal_pasivoBalanceGeneralCliente;
	public JTextField jTextFieldtotal_pasivoBalanceGeneralCliente;
	public JButton jButtontotal_pasivoBalanceGeneralClienteBusqueda= new JButtonMe();

	public JPanel jPanelpatrimonioBalanceGeneralCliente;
	public JLabel jLabelpatrimonioBalanceGeneralCliente;
	public JTextField jTextFieldpatrimonioBalanceGeneralCliente;
	public JButton jButtonpatrimonioBalanceGeneralClienteBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionBalanceGeneralCliente;
	public JLabel jLabeldescripcionBalanceGeneralCliente;
	public JTextArea jTextAreadescripcionBalanceGeneralCliente;
	public JScrollPane jscrollPanedescripcionBalanceGeneralCliente;
	public JButton jButtondescripcionBalanceGeneralClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaBalanceGeneralCliente;
	public JLabel jLabelid_empresaBalanceGeneralCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaBalanceGeneralCliente;
	public JButton jButtonid_empresaBalanceGeneralCliente= new JButtonMe();
	public JButton jButtonid_empresaBalanceGeneralClienteUpdate= new JButtonMe();
	public JButton jButtonid_empresaBalanceGeneralClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteBalanceGeneralCliente;
	public JLabel jLabelid_clienteBalanceGeneralCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteBalanceGeneralCliente;
	public JButton jButtonid_clienteBalanceGeneralCliente= new JButtonMe();
	public JButton jButtonid_clienteBalanceGeneralClienteUpdate= new JButtonMe();
	public JButton jButtonid_clienteBalanceGeneralClienteBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesBalanceGeneralCliente;
	
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
	public int iHeightFormulario=946;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public BalanceGeneralClienteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposBalanceGeneralCliente=new JPanel();
				this.jPanelAccionesFormularioBalanceGeneralCliente=new JPanel();
				this.jmenuBarDetalleBalanceGeneralCliente=new JMenuBar();
				this.jTtoolBarDetalleBalanceGeneralCliente=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BalanceGeneralClienteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("BalanceGeneralCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public BalanceGeneralClienteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("BalanceGeneralCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BalanceGeneralClienteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("BalanceGeneralCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BalanceGeneralClienteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("BalanceGeneralCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BalanceGeneralClienteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("BalanceGeneralCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarBalanceGeneralCliente() {
		return this.jButtonActualizarToolBarBalanceGeneralCliente;
	}
	
	public JButton getjButtonEliminarToolBarBalanceGeneralCliente() {
		return this.jButtonEliminarToolBarBalanceGeneralCliente;
	}
	
	public JButton getjButtonCancelarToolBarBalanceGeneralCliente() {
		return this.jButtonCancelarToolBarBalanceGeneralCliente;
	}		
	
	public JButton getjButtonProcesarInformacionBalanceGeneralCliente() {
		return this.jButtonProcesarInformacionBalanceGeneralCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionBalanceGeneralCliente)	{
		this.jButtonProcesarInformacionBalanceGeneralCliente = jButtonProcesarInformacionBalanceGeneralCliente;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesBalanceGeneralCliente() {
		return this.jComboBoxTiposAccionesBalanceGeneralCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesBalanceGeneralCliente(
			JComboBox jComboBoxTiposRelacionesBalanceGeneralCliente) {
		this.jComboBoxTiposRelacionesBalanceGeneralCliente = jComboBoxTiposRelacionesBalanceGeneralCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesBalanceGeneralCliente(
			JComboBox jComboBoxTiposAccionesBalanceGeneralCliente) {
		this.jComboBoxTiposAccionesBalanceGeneralCliente = jComboBoxTiposAccionesBalanceGeneralCliente;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioBalanceGeneralCliente() {
		return this.jComboBoxTiposAccionesFormularioBalanceGeneralCliente;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioBalanceGeneralCliente(
			JComboBox jComboBoxTiposAccionesFormularioBalanceGeneralCliente) {
		this.jComboBoxTiposAccionesFormularioBalanceGeneralCliente = jComboBoxTiposAccionesFormularioBalanceGeneralCliente;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.balancegeneralclienteSessionBean=new BalanceGeneralClienteSessionBean();
		
		this.balancegeneralclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.balancegeneralclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.balancegeneralclienteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		BalanceGeneralClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		BalanceGeneralClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		BalanceGeneralClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Balance General Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 3750) {
			iWidth=3750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.balancegeneralclienteSessionBean.getEsGuardarRelacionado()) {
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
	
		BalanceGeneralClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleBalanceGeneralCliente= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarBalanceGeneralCliente=new JButtonMe();
				this.jButtonModificarToolBarBalanceGeneralCliente=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarBalanceGeneralCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarBalanceGeneralCliente,this.jTtoolBarDetalleBalanceGeneralCliente,
							"actualizar","actualizar","Actualizar"+" "+BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarBalanceGeneralCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarBalanceGeneralCliente,this.jTtoolBarDetalleBalanceGeneralCliente,
							"eliminar","eliminar","Eliminar"+" "+BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarBalanceGeneralCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarBalanceGeneralCliente,this.jTtoolBarDetalleBalanceGeneralCliente,
							"cancelar","cancelar","Cancelar"+" "+BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarBalanceGeneralCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarBalanceGeneralCliente,this.jTtoolBarDetalleBalanceGeneralCliente,
							"guardarcambios","guardarcambios","Guardar"+" "+BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleBalanceGeneralCliente=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleBalanceGeneralCliente=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoBalanceGeneralCliente=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesBalanceGeneralCliente=new JMenuMe("Acciones");
		this.jmenuDetalleDatosBalanceGeneralCliente=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoBalanceGeneralCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoBalanceGeneralCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoBalanceGeneralCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarBalanceGeneralCliente= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarBalanceGeneralCliente.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarBalanceGeneralCliente,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarBalanceGeneralCliente= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarBalanceGeneralCliente.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarBalanceGeneralCliente,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarBalanceGeneralCliente= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarBalanceGeneralCliente.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarBalanceGeneralCliente,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarBalanceGeneralCliente= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarBalanceGeneralCliente.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarBalanceGeneralCliente,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosBalanceGeneralCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosBalanceGeneralCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosBalanceGeneralCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarBalanceGeneralCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarBalanceGeneralCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarBalanceGeneralCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarBalanceGeneralCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarBalanceGeneralCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarBalanceGeneralCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarBalanceGeneralCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarBalanceGeneralCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarBalanceGeneralCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarBalanceGeneralCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarBalanceGeneralCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarBalanceGeneralCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoBalanceGeneralCliente.add(this.jMenuItemDetalleCerrarBalanceGeneralCliente);
		
		this.jmenuDetalleAccionesBalanceGeneralCliente.add(this.jMenuItemActualizarBalanceGeneralCliente);
		this.jmenuDetalleAccionesBalanceGeneralCliente.add(this.jMenuItemEliminarBalanceGeneralCliente);
		this.jmenuDetalleAccionesBalanceGeneralCliente.add(this.jMenuItemCancelarBalanceGeneralCliente);		
		
		//this.jmenuDetalleDatosBalanceGeneralCliente.add(this.jMenuItemDetalleAbrirOrderByBalanceGeneralCliente);				
		this.jmenuDetalleDatosBalanceGeneralCliente.add(this.jMenuItemDetalleMostarOcultarBalanceGeneralCliente);				
				
		//this.jmenuDetalleAccionesBalanceGeneralCliente.add(this.jMenuItemGuardarCambiosBalanceGeneralCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleBalanceGeneralCliente.add(this.jmenuDetalleArchivoBalanceGeneralCliente);		
		this.jmenuBarDetalleBalanceGeneralCliente.add(this.jmenuDetalleAccionesBalanceGeneralCliente);		
		this.jmenuBarDetalleBalanceGeneralCliente.add(this.jmenuDetalleDatosBalanceGeneralCliente);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleBalanceGeneralCliente);				
	}
	
	
	public void inicializarElementosCamposBalanceGeneralCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdBalanceGeneralCliente = new JLabelMe();
		jLabelIdBalanceGeneralCliente.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidBalanceGeneralCliente = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidBalanceGeneralCliente.setToolTipText(BalanceGeneralClienteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutBalanceGeneralCliente= new GridBagLayout();

		this.jPanelidBalanceGeneralCliente.setLayout(this.gridaBagLayoutBalanceGeneralCliente);

		jLabelidBalanceGeneralCliente = new JLabel();
		jLabelidBalanceGeneralCliente.setText("Id");

		jLabelidBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcaja_bancos_disponibleBalanceGeneralCliente = new JLabelMe();
		this.jLabelcaja_bancos_disponibleBalanceGeneralCliente.setText(""+BalanceGeneralClienteConstantesFunciones.LABEL_CAJABANCOSDISPONIBLE+" : *");
		this.jLabelcaja_bancos_disponibleBalanceGeneralCliente.setToolTipText("Caja Bancos Disponible");
		this.jLabelcaja_bancos_disponibleBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcaja_bancos_disponibleBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcaja_bancos_disponibleBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcaja_bancos_disponibleBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcaja_bancos_disponibleBalanceGeneralCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcaja_bancos_disponibleBalanceGeneralCliente.setToolTipText(BalanceGeneralClienteConstantesFunciones.LABEL_CAJABANCOSDISPONIBLE);
		this.gridaBagLayoutBalanceGeneralCliente = new GridBagLayout();
		this.jPanelcaja_bancos_disponibleBalanceGeneralCliente.setLayout(this.gridaBagLayoutBalanceGeneralCliente);


		jTextFieldcaja_bancos_disponibleBalanceGeneralCliente= new JTextFieldMe();
		jTextFieldcaja_bancos_disponibleBalanceGeneralCliente.setEnabled(false);
		jTextFieldcaja_bancos_disponibleBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcaja_bancos_disponibleBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcaja_bancos_disponibleBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcaja_bancos_disponibleBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcaja_bancos_disponibleBalanceGeneralCliente.setText("0.0");

		this.jButtoncaja_bancos_disponibleBalanceGeneralClienteBusqueda= new JButtonMe();
		this.jButtoncaja_bancos_disponibleBalanceGeneralClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncaja_bancos_disponibleBalanceGeneralClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncaja_bancos_disponibleBalanceGeneralClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncaja_bancos_disponibleBalanceGeneralClienteBusqueda.setText("U");
		this.jButtoncaja_bancos_disponibleBalanceGeneralClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncaja_bancos_disponibleBalanceGeneralClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncaja_bancos_disponibleBalanceGeneralClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcaja_bancos_disponibleBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcaja_bancos_disponibleBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"caja_bancos_disponibleBalanceGeneralClienteBusqueda"));

		if(this.balancegeneralclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncaja_bancos_disponibleBalanceGeneralClienteBusqueda.setVisible(false);		}


					
		this.jLabelcuentas_por_cobrar_clientesBalanceGeneralCliente = new JLabelMe();
		this.jLabelcuentas_por_cobrar_clientesBalanceGeneralCliente.setText(""+BalanceGeneralClienteConstantesFunciones.LABEL_CUENTASPORCOBRARCLIENTES+" : *");
		this.jLabelcuentas_por_cobrar_clientesBalanceGeneralCliente.setToolTipText("Cuentas Por Cobrar Clientes");
		this.jLabelcuentas_por_cobrar_clientesBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcuentas_por_cobrar_clientesBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcuentas_por_cobrar_clientesBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcuentas_por_cobrar_clientesBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcuentas_por_cobrar_clientesBalanceGeneralCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcuentas_por_cobrar_clientesBalanceGeneralCliente.setToolTipText(BalanceGeneralClienteConstantesFunciones.LABEL_CUENTASPORCOBRARCLIENTES);
		this.gridaBagLayoutBalanceGeneralCliente = new GridBagLayout();
		this.jPanelcuentas_por_cobrar_clientesBalanceGeneralCliente.setLayout(this.gridaBagLayoutBalanceGeneralCliente);


		jTextFieldcuentas_por_cobrar_clientesBalanceGeneralCliente= new JTextFieldMe();
		jTextFieldcuentas_por_cobrar_clientesBalanceGeneralCliente.setEnabled(false);
		jTextFieldcuentas_por_cobrar_clientesBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcuentas_por_cobrar_clientesBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcuentas_por_cobrar_clientesBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcuentas_por_cobrar_clientesBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcuentas_por_cobrar_clientesBalanceGeneralCliente.setText("0.0");

		this.jButtoncuentas_por_cobrar_clientesBalanceGeneralClienteBusqueda= new JButtonMe();
		this.jButtoncuentas_por_cobrar_clientesBalanceGeneralClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncuentas_por_cobrar_clientesBalanceGeneralClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncuentas_por_cobrar_clientesBalanceGeneralClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncuentas_por_cobrar_clientesBalanceGeneralClienteBusqueda.setText("U");
		this.jButtoncuentas_por_cobrar_clientesBalanceGeneralClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncuentas_por_cobrar_clientesBalanceGeneralClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncuentas_por_cobrar_clientesBalanceGeneralClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcuentas_por_cobrar_clientesBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcuentas_por_cobrar_clientesBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cuentas_por_cobrar_clientesBalanceGeneralClienteBusqueda"));

		if(this.balancegeneralclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncuentas_por_cobrar_clientesBalanceGeneralClienteBusqueda.setVisible(false);		}


					
		this.jLabelinventarioBalanceGeneralCliente = new JLabelMe();
		this.jLabelinventarioBalanceGeneralCliente.setText(""+BalanceGeneralClienteConstantesFunciones.LABEL_INVENTARIO+" : *");
		this.jLabelinventarioBalanceGeneralCliente.setToolTipText("Inventario");
		this.jLabelinventarioBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelinventarioBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelinventarioBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelinventarioBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelinventarioBalanceGeneralCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelinventarioBalanceGeneralCliente.setToolTipText(BalanceGeneralClienteConstantesFunciones.LABEL_INVENTARIO);
		this.gridaBagLayoutBalanceGeneralCliente = new GridBagLayout();
		this.jPanelinventarioBalanceGeneralCliente.setLayout(this.gridaBagLayoutBalanceGeneralCliente);


		jTextFieldinventarioBalanceGeneralCliente= new JTextFieldMe();
		jTextFieldinventarioBalanceGeneralCliente.setEnabled(false);
		jTextFieldinventarioBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldinventarioBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldinventarioBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldinventarioBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldinventarioBalanceGeneralCliente.setText("0.0");

		this.jButtoninventarioBalanceGeneralClienteBusqueda= new JButtonMe();
		this.jButtoninventarioBalanceGeneralClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoninventarioBalanceGeneralClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoninventarioBalanceGeneralClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoninventarioBalanceGeneralClienteBusqueda.setText("U");
		this.jButtoninventarioBalanceGeneralClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoninventarioBalanceGeneralClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoninventarioBalanceGeneralClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldinventarioBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldinventarioBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"inventarioBalanceGeneralClienteBusqueda"));

		if(this.balancegeneralclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoninventarioBalanceGeneralClienteBusqueda.setVisible(false);		}


					
		this.jLabelotros_activos_corrientesBalanceGeneralCliente = new JLabelMe();
		this.jLabelotros_activos_corrientesBalanceGeneralCliente.setText(""+BalanceGeneralClienteConstantesFunciones.LABEL_OTROSACTIVOSCORRIENTES+" : *");
		this.jLabelotros_activos_corrientesBalanceGeneralCliente.setToolTipText("Otros Activos Corrientes");
		this.jLabelotros_activos_corrientesBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelotros_activos_corrientesBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelotros_activos_corrientesBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelotros_activos_corrientesBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelotros_activos_corrientesBalanceGeneralCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelotros_activos_corrientesBalanceGeneralCliente.setToolTipText(BalanceGeneralClienteConstantesFunciones.LABEL_OTROSACTIVOSCORRIENTES);
		this.gridaBagLayoutBalanceGeneralCliente = new GridBagLayout();
		this.jPanelotros_activos_corrientesBalanceGeneralCliente.setLayout(this.gridaBagLayoutBalanceGeneralCliente);


		jTextFieldotros_activos_corrientesBalanceGeneralCliente= new JTextFieldMe();
		jTextFieldotros_activos_corrientesBalanceGeneralCliente.setEnabled(false);
		jTextFieldotros_activos_corrientesBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotros_activos_corrientesBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotros_activos_corrientesBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldotros_activos_corrientesBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldotros_activos_corrientesBalanceGeneralCliente.setText("0.0");

		this.jButtonotros_activos_corrientesBalanceGeneralClienteBusqueda= new JButtonMe();
		this.jButtonotros_activos_corrientesBalanceGeneralClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotros_activos_corrientesBalanceGeneralClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotros_activos_corrientesBalanceGeneralClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonotros_activos_corrientesBalanceGeneralClienteBusqueda.setText("U");
		this.jButtonotros_activos_corrientesBalanceGeneralClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonotros_activos_corrientesBalanceGeneralClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonotros_activos_corrientesBalanceGeneralClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldotros_activos_corrientesBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldotros_activos_corrientesBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"otros_activos_corrientesBalanceGeneralClienteBusqueda"));

		if(this.balancegeneralclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonotros_activos_corrientesBalanceGeneralClienteBusqueda.setVisible(false);		}


					
		this.jLabeltotal_activos_corrientesBalanceGeneralCliente = new JLabelMe();
		this.jLabeltotal_activos_corrientesBalanceGeneralCliente.setText(""+BalanceGeneralClienteConstantesFunciones.LABEL_TOTALACTIVOSCORRIENTES+" : *");
		this.jLabeltotal_activos_corrientesBalanceGeneralCliente.setToolTipText("Total Activos Corrientes");
		this.jLabeltotal_activos_corrientesBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeltotal_activos_corrientesBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeltotal_activos_corrientesBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_activos_corrientesBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_activos_corrientesBalanceGeneralCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_activos_corrientesBalanceGeneralCliente.setToolTipText(BalanceGeneralClienteConstantesFunciones.LABEL_TOTALACTIVOSCORRIENTES);
		this.gridaBagLayoutBalanceGeneralCliente = new GridBagLayout();
		this.jPaneltotal_activos_corrientesBalanceGeneralCliente.setLayout(this.gridaBagLayoutBalanceGeneralCliente);


		jTextFieldtotal_activos_corrientesBalanceGeneralCliente= new JTextFieldMe();
		jTextFieldtotal_activos_corrientesBalanceGeneralCliente.setEnabled(false);
		jTextFieldtotal_activos_corrientesBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_activos_corrientesBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_activos_corrientesBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_activos_corrientesBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_activos_corrientesBalanceGeneralCliente.setText("0.0");

		this.jButtontotal_activos_corrientesBalanceGeneralClienteBusqueda= new JButtonMe();
		this.jButtontotal_activos_corrientesBalanceGeneralClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_activos_corrientesBalanceGeneralClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_activos_corrientesBalanceGeneralClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_activos_corrientesBalanceGeneralClienteBusqueda.setText("U");
		this.jButtontotal_activos_corrientesBalanceGeneralClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_activos_corrientesBalanceGeneralClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_activos_corrientesBalanceGeneralClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_activos_corrientesBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_activos_corrientesBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_activos_corrientesBalanceGeneralClienteBusqueda"));

		if(this.balancegeneralclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_activos_corrientesBalanceGeneralClienteBusqueda.setVisible(false);		}


					
		this.jLabelbienes_inmueblesBalanceGeneralCliente = new JLabelMe();
		this.jLabelbienes_inmueblesBalanceGeneralCliente.setText(""+BalanceGeneralClienteConstantesFunciones.LABEL_BIENESINMUEBLES+" : *");
		this.jLabelbienes_inmueblesBalanceGeneralCliente.setToolTipText("Bienes Inmuebles");
		this.jLabelbienes_inmueblesBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelbienes_inmueblesBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelbienes_inmueblesBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelbienes_inmueblesBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbienes_inmueblesBalanceGeneralCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbienes_inmueblesBalanceGeneralCliente.setToolTipText(BalanceGeneralClienteConstantesFunciones.LABEL_BIENESINMUEBLES);
		this.gridaBagLayoutBalanceGeneralCliente = new GridBagLayout();
		this.jPanelbienes_inmueblesBalanceGeneralCliente.setLayout(this.gridaBagLayoutBalanceGeneralCliente);


		jTextFieldbienes_inmueblesBalanceGeneralCliente= new JTextFieldMe();
		jTextFieldbienes_inmueblesBalanceGeneralCliente.setEnabled(false);
		jTextFieldbienes_inmueblesBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbienes_inmueblesBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbienes_inmueblesBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldbienes_inmueblesBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldbienes_inmueblesBalanceGeneralCliente.setText("0.0");

		this.jButtonbienes_inmueblesBalanceGeneralClienteBusqueda= new JButtonMe();
		this.jButtonbienes_inmueblesBalanceGeneralClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbienes_inmueblesBalanceGeneralClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbienes_inmueblesBalanceGeneralClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbienes_inmueblesBalanceGeneralClienteBusqueda.setText("U");
		this.jButtonbienes_inmueblesBalanceGeneralClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbienes_inmueblesBalanceGeneralClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbienes_inmueblesBalanceGeneralClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldbienes_inmueblesBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldbienes_inmueblesBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"bienes_inmueblesBalanceGeneralClienteBusqueda"));

		if(this.balancegeneralclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbienes_inmueblesBalanceGeneralClienteBusqueda.setVisible(false);		}


					
		this.jLabelbienes_mueblesBalanceGeneralCliente = new JLabelMe();
		this.jLabelbienes_mueblesBalanceGeneralCliente.setText(""+BalanceGeneralClienteConstantesFunciones.LABEL_BIENESMUEBLES+" : *");
		this.jLabelbienes_mueblesBalanceGeneralCliente.setToolTipText("Bienes Muebles");
		this.jLabelbienes_mueblesBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbienes_mueblesBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbienes_mueblesBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbienes_mueblesBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbienes_mueblesBalanceGeneralCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbienes_mueblesBalanceGeneralCliente.setToolTipText(BalanceGeneralClienteConstantesFunciones.LABEL_BIENESMUEBLES);
		this.gridaBagLayoutBalanceGeneralCliente = new GridBagLayout();
		this.jPanelbienes_mueblesBalanceGeneralCliente.setLayout(this.gridaBagLayoutBalanceGeneralCliente);


		jTextFieldbienes_mueblesBalanceGeneralCliente= new JTextFieldMe();
		jTextFieldbienes_mueblesBalanceGeneralCliente.setEnabled(false);
		jTextFieldbienes_mueblesBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbienes_mueblesBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbienes_mueblesBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldbienes_mueblesBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldbienes_mueblesBalanceGeneralCliente.setText("0.0");

		this.jButtonbienes_mueblesBalanceGeneralClienteBusqueda= new JButtonMe();
		this.jButtonbienes_mueblesBalanceGeneralClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbienes_mueblesBalanceGeneralClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbienes_mueblesBalanceGeneralClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbienes_mueblesBalanceGeneralClienteBusqueda.setText("U");
		this.jButtonbienes_mueblesBalanceGeneralClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbienes_mueblesBalanceGeneralClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbienes_mueblesBalanceGeneralClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldbienes_mueblesBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldbienes_mueblesBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"bienes_mueblesBalanceGeneralClienteBusqueda"));

		if(this.balancegeneralclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbienes_mueblesBalanceGeneralClienteBusqueda.setVisible(false);		}


					
		this.jLabelotros_activos_no_corrientesBalanceGeneralCliente = new JLabelMe();
		this.jLabelotros_activos_no_corrientesBalanceGeneralCliente.setText(""+BalanceGeneralClienteConstantesFunciones.LABEL_OTROSACTIVOSNOCORRIENTES+" : *");
		this.jLabelotros_activos_no_corrientesBalanceGeneralCliente.setToolTipText("Otros Activos No Corrientes");
		this.jLabelotros_activos_no_corrientesBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelotros_activos_no_corrientesBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelotros_activos_no_corrientesBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelotros_activos_no_corrientesBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelotros_activos_no_corrientesBalanceGeneralCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelotros_activos_no_corrientesBalanceGeneralCliente.setToolTipText(BalanceGeneralClienteConstantesFunciones.LABEL_OTROSACTIVOSNOCORRIENTES);
		this.gridaBagLayoutBalanceGeneralCliente = new GridBagLayout();
		this.jPanelotros_activos_no_corrientesBalanceGeneralCliente.setLayout(this.gridaBagLayoutBalanceGeneralCliente);


		jTextFieldotros_activos_no_corrientesBalanceGeneralCliente= new JTextFieldMe();
		jTextFieldotros_activos_no_corrientesBalanceGeneralCliente.setEnabled(false);
		jTextFieldotros_activos_no_corrientesBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotros_activos_no_corrientesBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotros_activos_no_corrientesBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldotros_activos_no_corrientesBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldotros_activos_no_corrientesBalanceGeneralCliente.setText("0.0");

		this.jButtonotros_activos_no_corrientesBalanceGeneralClienteBusqueda= new JButtonMe();
		this.jButtonotros_activos_no_corrientesBalanceGeneralClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotros_activos_no_corrientesBalanceGeneralClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotros_activos_no_corrientesBalanceGeneralClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonotros_activos_no_corrientesBalanceGeneralClienteBusqueda.setText("U");
		this.jButtonotros_activos_no_corrientesBalanceGeneralClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonotros_activos_no_corrientesBalanceGeneralClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonotros_activos_no_corrientesBalanceGeneralClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldotros_activos_no_corrientesBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldotros_activos_no_corrientesBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"otros_activos_no_corrientesBalanceGeneralClienteBusqueda"));

		if(this.balancegeneralclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonotros_activos_no_corrientesBalanceGeneralClienteBusqueda.setVisible(false);		}


					
		this.jLabeltotal_activos_no_corrientesBalanceGeneralCliente = new JLabelMe();
		this.jLabeltotal_activos_no_corrientesBalanceGeneralCliente.setText(""+BalanceGeneralClienteConstantesFunciones.LABEL_TOTALACTIVOSNOCORRIENTES+" : *");
		this.jLabeltotal_activos_no_corrientesBalanceGeneralCliente.setToolTipText("Total Activos No Corrientes");
		this.jLabeltotal_activos_no_corrientesBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeltotal_activos_no_corrientesBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeltotal_activos_no_corrientesBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_activos_no_corrientesBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_activos_no_corrientesBalanceGeneralCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_activos_no_corrientesBalanceGeneralCliente.setToolTipText(BalanceGeneralClienteConstantesFunciones.LABEL_TOTALACTIVOSNOCORRIENTES);
		this.gridaBagLayoutBalanceGeneralCliente = new GridBagLayout();
		this.jPaneltotal_activos_no_corrientesBalanceGeneralCliente.setLayout(this.gridaBagLayoutBalanceGeneralCliente);


		jTextFieldtotal_activos_no_corrientesBalanceGeneralCliente= new JTextFieldMe();
		jTextFieldtotal_activos_no_corrientesBalanceGeneralCliente.setEnabled(false);
		jTextFieldtotal_activos_no_corrientesBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_activos_no_corrientesBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_activos_no_corrientesBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_activos_no_corrientesBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_activos_no_corrientesBalanceGeneralCliente.setText("0.0");

		this.jButtontotal_activos_no_corrientesBalanceGeneralClienteBusqueda= new JButtonMe();
		this.jButtontotal_activos_no_corrientesBalanceGeneralClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_activos_no_corrientesBalanceGeneralClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_activos_no_corrientesBalanceGeneralClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_activos_no_corrientesBalanceGeneralClienteBusqueda.setText("U");
		this.jButtontotal_activos_no_corrientesBalanceGeneralClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_activos_no_corrientesBalanceGeneralClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_activos_no_corrientesBalanceGeneralClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_activos_no_corrientesBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_activos_no_corrientesBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_activos_no_corrientesBalanceGeneralClienteBusqueda"));

		if(this.balancegeneralclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_activos_no_corrientesBalanceGeneralClienteBusqueda.setVisible(false);		}


					
		this.jLabelventas_mensualesBalanceGeneralCliente = new JLabelMe();
		this.jLabelventas_mensualesBalanceGeneralCliente.setText(""+BalanceGeneralClienteConstantesFunciones.LABEL_VENTASMENSUALES+" : *");
		this.jLabelventas_mensualesBalanceGeneralCliente.setToolTipText("Ventas Mensuales");
		this.jLabelventas_mensualesBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelventas_mensualesBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelventas_mensualesBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelventas_mensualesBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelventas_mensualesBalanceGeneralCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelventas_mensualesBalanceGeneralCliente.setToolTipText(BalanceGeneralClienteConstantesFunciones.LABEL_VENTASMENSUALES);
		this.gridaBagLayoutBalanceGeneralCliente = new GridBagLayout();
		this.jPanelventas_mensualesBalanceGeneralCliente.setLayout(this.gridaBagLayoutBalanceGeneralCliente);


		jTextFieldventas_mensualesBalanceGeneralCliente= new JTextFieldMe();
		jTextFieldventas_mensualesBalanceGeneralCliente.setEnabled(false);
		jTextFieldventas_mensualesBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldventas_mensualesBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldventas_mensualesBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldventas_mensualesBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldventas_mensualesBalanceGeneralCliente.setText("0.0");

		this.jButtonventas_mensualesBalanceGeneralClienteBusqueda= new JButtonMe();
		this.jButtonventas_mensualesBalanceGeneralClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonventas_mensualesBalanceGeneralClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonventas_mensualesBalanceGeneralClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonventas_mensualesBalanceGeneralClienteBusqueda.setText("U");
		this.jButtonventas_mensualesBalanceGeneralClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonventas_mensualesBalanceGeneralClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonventas_mensualesBalanceGeneralClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldventas_mensualesBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldventas_mensualesBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ventas_mensualesBalanceGeneralClienteBusqueda"));

		if(this.balancegeneralclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonventas_mensualesBalanceGeneralClienteBusqueda.setVisible(false);		}


					
		this.jLabelcosto_ventas_mensualesBalanceGeneralCliente = new JLabelMe();
		this.jLabelcosto_ventas_mensualesBalanceGeneralCliente.setText(""+BalanceGeneralClienteConstantesFunciones.LABEL_COSTOVENTASMENSUALES+" : *");
		this.jLabelcosto_ventas_mensualesBalanceGeneralCliente.setToolTipText("Costo Ventas Mensuales");
		this.jLabelcosto_ventas_mensualesBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcosto_ventas_mensualesBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcosto_ventas_mensualesBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_ventas_mensualesBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_ventas_mensualesBalanceGeneralCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_ventas_mensualesBalanceGeneralCliente.setToolTipText(BalanceGeneralClienteConstantesFunciones.LABEL_COSTOVENTASMENSUALES);
		this.gridaBagLayoutBalanceGeneralCliente = new GridBagLayout();
		this.jPanelcosto_ventas_mensualesBalanceGeneralCliente.setLayout(this.gridaBagLayoutBalanceGeneralCliente);


		jTextFieldcosto_ventas_mensualesBalanceGeneralCliente= new JTextFieldMe();
		jTextFieldcosto_ventas_mensualesBalanceGeneralCliente.setEnabled(false);
		jTextFieldcosto_ventas_mensualesBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_ventas_mensualesBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_ventas_mensualesBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_ventas_mensualesBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_ventas_mensualesBalanceGeneralCliente.setText("0.0");

		this.jButtoncosto_ventas_mensualesBalanceGeneralClienteBusqueda= new JButtonMe();
		this.jButtoncosto_ventas_mensualesBalanceGeneralClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_ventas_mensualesBalanceGeneralClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_ventas_mensualesBalanceGeneralClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_ventas_mensualesBalanceGeneralClienteBusqueda.setText("U");
		this.jButtoncosto_ventas_mensualesBalanceGeneralClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_ventas_mensualesBalanceGeneralClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_ventas_mensualesBalanceGeneralClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_ventas_mensualesBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_ventas_mensualesBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_ventas_mensualesBalanceGeneralClienteBusqueda"));

		if(this.balancegeneralclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_ventas_mensualesBalanceGeneralClienteBusqueda.setVisible(false);		}


					
		this.jLabelutilidad_brutaBalanceGeneralCliente = new JLabelMe();
		this.jLabelutilidad_brutaBalanceGeneralCliente.setText(""+BalanceGeneralClienteConstantesFunciones.LABEL_UTILIDADBRUTA+" : *");
		this.jLabelutilidad_brutaBalanceGeneralCliente.setToolTipText("Utilidad Bruta");
		this.jLabelutilidad_brutaBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelutilidad_brutaBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelutilidad_brutaBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelutilidad_brutaBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelutilidad_brutaBalanceGeneralCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelutilidad_brutaBalanceGeneralCliente.setToolTipText(BalanceGeneralClienteConstantesFunciones.LABEL_UTILIDADBRUTA);
		this.gridaBagLayoutBalanceGeneralCliente = new GridBagLayout();
		this.jPanelutilidad_brutaBalanceGeneralCliente.setLayout(this.gridaBagLayoutBalanceGeneralCliente);


		jTextFieldutilidad_brutaBalanceGeneralCliente= new JTextFieldMe();
		jTextFieldutilidad_brutaBalanceGeneralCliente.setEnabled(false);
		jTextFieldutilidad_brutaBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldutilidad_brutaBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldutilidad_brutaBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldutilidad_brutaBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldutilidad_brutaBalanceGeneralCliente.setText("0.0");

		this.jButtonutilidad_brutaBalanceGeneralClienteBusqueda= new JButtonMe();
		this.jButtonutilidad_brutaBalanceGeneralClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonutilidad_brutaBalanceGeneralClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonutilidad_brutaBalanceGeneralClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonutilidad_brutaBalanceGeneralClienteBusqueda.setText("U");
		this.jButtonutilidad_brutaBalanceGeneralClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonutilidad_brutaBalanceGeneralClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonutilidad_brutaBalanceGeneralClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldutilidad_brutaBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldutilidad_brutaBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"utilidad_brutaBalanceGeneralClienteBusqueda"));

		if(this.balancegeneralclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonutilidad_brutaBalanceGeneralClienteBusqueda.setVisible(false);		}


					
		this.jLabelgastos_operativosBalanceGeneralCliente = new JLabelMe();
		this.jLabelgastos_operativosBalanceGeneralCliente.setText(""+BalanceGeneralClienteConstantesFunciones.LABEL_GASTOSOPERATIVOS+" : *");
		this.jLabelgastos_operativosBalanceGeneralCliente.setToolTipText("Gastos Operativos");
		this.jLabelgastos_operativosBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelgastos_operativosBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelgastos_operativosBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelgastos_operativosBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelgastos_operativosBalanceGeneralCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelgastos_operativosBalanceGeneralCliente.setToolTipText(BalanceGeneralClienteConstantesFunciones.LABEL_GASTOSOPERATIVOS);
		this.gridaBagLayoutBalanceGeneralCliente = new GridBagLayout();
		this.jPanelgastos_operativosBalanceGeneralCliente.setLayout(this.gridaBagLayoutBalanceGeneralCliente);


		jTextFieldgastos_operativosBalanceGeneralCliente= new JTextFieldMe();
		jTextFieldgastos_operativosBalanceGeneralCliente.setEnabled(false);
		jTextFieldgastos_operativosBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgastos_operativosBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgastos_operativosBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldgastos_operativosBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldgastos_operativosBalanceGeneralCliente.setText("0.0");

		this.jButtongastos_operativosBalanceGeneralClienteBusqueda= new JButtonMe();
		this.jButtongastos_operativosBalanceGeneralClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongastos_operativosBalanceGeneralClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongastos_operativosBalanceGeneralClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtongastos_operativosBalanceGeneralClienteBusqueda.setText("U");
		this.jButtongastos_operativosBalanceGeneralClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtongastos_operativosBalanceGeneralClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtongastos_operativosBalanceGeneralClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldgastos_operativosBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldgastos_operativosBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"gastos_operativosBalanceGeneralClienteBusqueda"));

		if(this.balancegeneralclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtongastos_operativosBalanceGeneralClienteBusqueda.setVisible(false);		}


					
		this.jLabelsueldosBalanceGeneralCliente = new JLabelMe();
		this.jLabelsueldosBalanceGeneralCliente.setText(""+BalanceGeneralClienteConstantesFunciones.LABEL_SUELDOS+" : *");
		this.jLabelsueldosBalanceGeneralCliente.setToolTipText("Sueldos");
		this.jLabelsueldosBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsueldosBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsueldosBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsueldosBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsueldosBalanceGeneralCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsueldosBalanceGeneralCliente.setToolTipText(BalanceGeneralClienteConstantesFunciones.LABEL_SUELDOS);
		this.gridaBagLayoutBalanceGeneralCliente = new GridBagLayout();
		this.jPanelsueldosBalanceGeneralCliente.setLayout(this.gridaBagLayoutBalanceGeneralCliente);


		jTextFieldsueldosBalanceGeneralCliente= new JTextFieldMe();
		jTextFieldsueldosBalanceGeneralCliente.setEnabled(false);
		jTextFieldsueldosBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsueldosBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsueldosBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsueldosBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsueldosBalanceGeneralCliente.setText("0.0");

		this.jButtonsueldosBalanceGeneralClienteBusqueda= new JButtonMe();
		this.jButtonsueldosBalanceGeneralClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsueldosBalanceGeneralClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsueldosBalanceGeneralClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsueldosBalanceGeneralClienteBusqueda.setText("U");
		this.jButtonsueldosBalanceGeneralClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsueldosBalanceGeneralClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsueldosBalanceGeneralClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsueldosBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsueldosBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sueldosBalanceGeneralClienteBusqueda"));

		if(this.balancegeneralclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsueldosBalanceGeneralClienteBusqueda.setVisible(false);		}


					
		this.jLabelserviciosBalanceGeneralCliente = new JLabelMe();
		this.jLabelserviciosBalanceGeneralCliente.setText(""+BalanceGeneralClienteConstantesFunciones.LABEL_SERVICIOS+" : *");
		this.jLabelserviciosBalanceGeneralCliente.setToolTipText("Servicios");
		this.jLabelserviciosBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelserviciosBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelserviciosBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelserviciosBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelserviciosBalanceGeneralCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelserviciosBalanceGeneralCliente.setToolTipText(BalanceGeneralClienteConstantesFunciones.LABEL_SERVICIOS);
		this.gridaBagLayoutBalanceGeneralCliente = new GridBagLayout();
		this.jPanelserviciosBalanceGeneralCliente.setLayout(this.gridaBagLayoutBalanceGeneralCliente);


		jTextFieldserviciosBalanceGeneralCliente= new JTextFieldMe();
		jTextFieldserviciosBalanceGeneralCliente.setEnabled(false);
		jTextFieldserviciosBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldserviciosBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldserviciosBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldserviciosBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldserviciosBalanceGeneralCliente.setText("0.0");

		this.jButtonserviciosBalanceGeneralClienteBusqueda= new JButtonMe();
		this.jButtonserviciosBalanceGeneralClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonserviciosBalanceGeneralClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonserviciosBalanceGeneralClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonserviciosBalanceGeneralClienteBusqueda.setText("U");
		this.jButtonserviciosBalanceGeneralClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonserviciosBalanceGeneralClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonserviciosBalanceGeneralClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldserviciosBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldserviciosBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"serviciosBalanceGeneralClienteBusqueda"));

		if(this.balancegeneralclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonserviciosBalanceGeneralClienteBusqueda.setVisible(false);		}


					
		this.jLabelarriendosBalanceGeneralCliente = new JLabelMe();
		this.jLabelarriendosBalanceGeneralCliente.setText(""+BalanceGeneralClienteConstantesFunciones.LABEL_ARRIENDOS+" : *");
		this.jLabelarriendosBalanceGeneralCliente.setToolTipText("Arriendos");
		this.jLabelarriendosBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelarriendosBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelarriendosBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelarriendosBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelarriendosBalanceGeneralCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelarriendosBalanceGeneralCliente.setToolTipText(BalanceGeneralClienteConstantesFunciones.LABEL_ARRIENDOS);
		this.gridaBagLayoutBalanceGeneralCliente = new GridBagLayout();
		this.jPanelarriendosBalanceGeneralCliente.setLayout(this.gridaBagLayoutBalanceGeneralCliente);


		jTextFieldarriendosBalanceGeneralCliente= new JTextFieldMe();
		jTextFieldarriendosBalanceGeneralCliente.setEnabled(false);
		jTextFieldarriendosBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldarriendosBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldarriendosBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldarriendosBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldarriendosBalanceGeneralCliente.setText("0.0");

		this.jButtonarriendosBalanceGeneralClienteBusqueda= new JButtonMe();
		this.jButtonarriendosBalanceGeneralClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonarriendosBalanceGeneralClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonarriendosBalanceGeneralClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonarriendosBalanceGeneralClienteBusqueda.setText("U");
		this.jButtonarriendosBalanceGeneralClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonarriendosBalanceGeneralClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonarriendosBalanceGeneralClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldarriendosBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldarriendosBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"arriendosBalanceGeneralClienteBusqueda"));

		if(this.balancegeneralclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonarriendosBalanceGeneralClienteBusqueda.setVisible(false);		}


					
		this.jLabelimpuestosBalanceGeneralCliente = new JLabelMe();
		this.jLabelimpuestosBalanceGeneralCliente.setText(""+BalanceGeneralClienteConstantesFunciones.LABEL_IMPUESTOS+" : *");
		this.jLabelimpuestosBalanceGeneralCliente.setToolTipText("Impuestos");
		this.jLabelimpuestosBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelimpuestosBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelimpuestosBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelimpuestosBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelimpuestosBalanceGeneralCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelimpuestosBalanceGeneralCliente.setToolTipText(BalanceGeneralClienteConstantesFunciones.LABEL_IMPUESTOS);
		this.gridaBagLayoutBalanceGeneralCliente = new GridBagLayout();
		this.jPanelimpuestosBalanceGeneralCliente.setLayout(this.gridaBagLayoutBalanceGeneralCliente);


		jTextFieldimpuestosBalanceGeneralCliente= new JTextFieldMe();
		jTextFieldimpuestosBalanceGeneralCliente.setEnabled(false);
		jTextFieldimpuestosBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldimpuestosBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldimpuestosBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldimpuestosBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldimpuestosBalanceGeneralCliente.setText("0.0");

		this.jButtonimpuestosBalanceGeneralClienteBusqueda= new JButtonMe();
		this.jButtonimpuestosBalanceGeneralClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonimpuestosBalanceGeneralClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonimpuestosBalanceGeneralClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonimpuestosBalanceGeneralClienteBusqueda.setText("U");
		this.jButtonimpuestosBalanceGeneralClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonimpuestosBalanceGeneralClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonimpuestosBalanceGeneralClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldimpuestosBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldimpuestosBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"impuestosBalanceGeneralClienteBusqueda"));

		if(this.balancegeneralclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonimpuestosBalanceGeneralClienteBusqueda.setVisible(false);		}


					
		this.jLabelutilidad_operativaBalanceGeneralCliente = new JLabelMe();
		this.jLabelutilidad_operativaBalanceGeneralCliente.setText(""+BalanceGeneralClienteConstantesFunciones.LABEL_UTILIDADOPERATIVA+" : *");
		this.jLabelutilidad_operativaBalanceGeneralCliente.setToolTipText("Utilidad Operativa");
		this.jLabelutilidad_operativaBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelutilidad_operativaBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelutilidad_operativaBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelutilidad_operativaBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelutilidad_operativaBalanceGeneralCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelutilidad_operativaBalanceGeneralCliente.setToolTipText(BalanceGeneralClienteConstantesFunciones.LABEL_UTILIDADOPERATIVA);
		this.gridaBagLayoutBalanceGeneralCliente = new GridBagLayout();
		this.jPanelutilidad_operativaBalanceGeneralCliente.setLayout(this.gridaBagLayoutBalanceGeneralCliente);


		jTextFieldutilidad_operativaBalanceGeneralCliente= new JTextFieldMe();
		jTextFieldutilidad_operativaBalanceGeneralCliente.setEnabled(false);
		jTextFieldutilidad_operativaBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldutilidad_operativaBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldutilidad_operativaBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldutilidad_operativaBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldutilidad_operativaBalanceGeneralCliente.setText("0.0");

		this.jButtonutilidad_operativaBalanceGeneralClienteBusqueda= new JButtonMe();
		this.jButtonutilidad_operativaBalanceGeneralClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonutilidad_operativaBalanceGeneralClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonutilidad_operativaBalanceGeneralClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonutilidad_operativaBalanceGeneralClienteBusqueda.setText("U");
		this.jButtonutilidad_operativaBalanceGeneralClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonutilidad_operativaBalanceGeneralClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonutilidad_operativaBalanceGeneralClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldutilidad_operativaBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldutilidad_operativaBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"utilidad_operativaBalanceGeneralClienteBusqueda"));

		if(this.balancegeneralclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonutilidad_operativaBalanceGeneralClienteBusqueda.setVisible(false);		}


					
		this.jLabelgastos_familiaresBalanceGeneralCliente = new JLabelMe();
		this.jLabelgastos_familiaresBalanceGeneralCliente.setText(""+BalanceGeneralClienteConstantesFunciones.LABEL_GASTOSFAMILIARES+" : *");
		this.jLabelgastos_familiaresBalanceGeneralCliente.setToolTipText("Gastos Familiares");
		this.jLabelgastos_familiaresBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelgastos_familiaresBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelgastos_familiaresBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelgastos_familiaresBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelgastos_familiaresBalanceGeneralCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelgastos_familiaresBalanceGeneralCliente.setToolTipText(BalanceGeneralClienteConstantesFunciones.LABEL_GASTOSFAMILIARES);
		this.gridaBagLayoutBalanceGeneralCliente = new GridBagLayout();
		this.jPanelgastos_familiaresBalanceGeneralCliente.setLayout(this.gridaBagLayoutBalanceGeneralCliente);


		jTextFieldgastos_familiaresBalanceGeneralCliente= new JTextFieldMe();
		jTextFieldgastos_familiaresBalanceGeneralCliente.setEnabled(false);
		jTextFieldgastos_familiaresBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgastos_familiaresBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgastos_familiaresBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldgastos_familiaresBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldgastos_familiaresBalanceGeneralCliente.setText("0.0");

		this.jButtongastos_familiaresBalanceGeneralClienteBusqueda= new JButtonMe();
		this.jButtongastos_familiaresBalanceGeneralClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongastos_familiaresBalanceGeneralClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongastos_familiaresBalanceGeneralClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtongastos_familiaresBalanceGeneralClienteBusqueda.setText("U");
		this.jButtongastos_familiaresBalanceGeneralClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtongastos_familiaresBalanceGeneralClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtongastos_familiaresBalanceGeneralClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldgastos_familiaresBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldgastos_familiaresBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"gastos_familiaresBalanceGeneralClienteBusqueda"));

		if(this.balancegeneralclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtongastos_familiaresBalanceGeneralClienteBusqueda.setVisible(false);		}


					
		this.jLabelexcedente_antes_dividendosBalanceGeneralCliente = new JLabelMe();
		this.jLabelexcedente_antes_dividendosBalanceGeneralCliente.setText(""+BalanceGeneralClienteConstantesFunciones.LABEL_EXCEDENTEANTESDIVIDENDOS+" : *");
		this.jLabelexcedente_antes_dividendosBalanceGeneralCliente.setToolTipText("Excedente Antes Dividendos");
		this.jLabelexcedente_antes_dividendosBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelexcedente_antes_dividendosBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelexcedente_antes_dividendosBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelexcedente_antes_dividendosBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelexcedente_antes_dividendosBalanceGeneralCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelexcedente_antes_dividendosBalanceGeneralCliente.setToolTipText(BalanceGeneralClienteConstantesFunciones.LABEL_EXCEDENTEANTESDIVIDENDOS);
		this.gridaBagLayoutBalanceGeneralCliente = new GridBagLayout();
		this.jPanelexcedente_antes_dividendosBalanceGeneralCliente.setLayout(this.gridaBagLayoutBalanceGeneralCliente);


		jTextFieldexcedente_antes_dividendosBalanceGeneralCliente= new JTextFieldMe();
		jTextFieldexcedente_antes_dividendosBalanceGeneralCliente.setEnabled(false);
		jTextFieldexcedente_antes_dividendosBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldexcedente_antes_dividendosBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldexcedente_antes_dividendosBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldexcedente_antes_dividendosBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldexcedente_antes_dividendosBalanceGeneralCliente.setText("0.0");

		this.jButtonexcedente_antes_dividendosBalanceGeneralClienteBusqueda= new JButtonMe();
		this.jButtonexcedente_antes_dividendosBalanceGeneralClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonexcedente_antes_dividendosBalanceGeneralClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonexcedente_antes_dividendosBalanceGeneralClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonexcedente_antes_dividendosBalanceGeneralClienteBusqueda.setText("U");
		this.jButtonexcedente_antes_dividendosBalanceGeneralClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonexcedente_antes_dividendosBalanceGeneralClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonexcedente_antes_dividendosBalanceGeneralClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldexcedente_antes_dividendosBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldexcedente_antes_dividendosBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"excedente_antes_dividendosBalanceGeneralClienteBusqueda"));

		if(this.balancegeneralclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonexcedente_antes_dividendosBalanceGeneralClienteBusqueda.setVisible(false);		}


					
		this.jLabeldividendos_bancos_otrosBalanceGeneralCliente = new JLabelMe();
		this.jLabeldividendos_bancos_otrosBalanceGeneralCliente.setText(""+BalanceGeneralClienteConstantesFunciones.LABEL_DIVIDENDOSBANCOSOTROS+" : *");
		this.jLabeldividendos_bancos_otrosBalanceGeneralCliente.setToolTipText("Dividendos Bancos Otros");
		this.jLabeldividendos_bancos_otrosBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeldividendos_bancos_otrosBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeldividendos_bancos_otrosBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabeldividendos_bancos_otrosBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldividendos_bancos_otrosBalanceGeneralCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldividendos_bancos_otrosBalanceGeneralCliente.setToolTipText(BalanceGeneralClienteConstantesFunciones.LABEL_DIVIDENDOSBANCOSOTROS);
		this.gridaBagLayoutBalanceGeneralCliente = new GridBagLayout();
		this.jPaneldividendos_bancos_otrosBalanceGeneralCliente.setLayout(this.gridaBagLayoutBalanceGeneralCliente);


		jTextFielddividendos_bancos_otrosBalanceGeneralCliente= new JTextFieldMe();
		jTextFielddividendos_bancos_otrosBalanceGeneralCliente.setEnabled(false);
		jTextFielddividendos_bancos_otrosBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddividendos_bancos_otrosBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddividendos_bancos_otrosBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddividendos_bancos_otrosBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddividendos_bancos_otrosBalanceGeneralCliente.setText("0.0");

		this.jButtondividendos_bancos_otrosBalanceGeneralClienteBusqueda= new JButtonMe();
		this.jButtondividendos_bancos_otrosBalanceGeneralClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondividendos_bancos_otrosBalanceGeneralClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondividendos_bancos_otrosBalanceGeneralClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondividendos_bancos_otrosBalanceGeneralClienteBusqueda.setText("U");
		this.jButtondividendos_bancos_otrosBalanceGeneralClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondividendos_bancos_otrosBalanceGeneralClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondividendos_bancos_otrosBalanceGeneralClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddividendos_bancos_otrosBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddividendos_bancos_otrosBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"dividendos_bancos_otrosBalanceGeneralClienteBusqueda"));

		if(this.balancegeneralclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondividendos_bancos_otrosBalanceGeneralClienteBusqueda.setVisible(false);		}


					
		this.jLabelexedente_neto_mensualBalanceGeneralCliente = new JLabelMe();
		this.jLabelexedente_neto_mensualBalanceGeneralCliente.setText(""+BalanceGeneralClienteConstantesFunciones.LABEL_EXEDENTENETOMENSUAL+" : *");
		this.jLabelexedente_neto_mensualBalanceGeneralCliente.setToolTipText("Exedente Neto Mensual");
		this.jLabelexedente_neto_mensualBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelexedente_neto_mensualBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelexedente_neto_mensualBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelexedente_neto_mensualBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelexedente_neto_mensualBalanceGeneralCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelexedente_neto_mensualBalanceGeneralCliente.setToolTipText(BalanceGeneralClienteConstantesFunciones.LABEL_EXEDENTENETOMENSUAL);
		this.gridaBagLayoutBalanceGeneralCliente = new GridBagLayout();
		this.jPanelexedente_neto_mensualBalanceGeneralCliente.setLayout(this.gridaBagLayoutBalanceGeneralCliente);


		jTextFieldexedente_neto_mensualBalanceGeneralCliente= new JTextFieldMe();
		jTextFieldexedente_neto_mensualBalanceGeneralCliente.setEnabled(false);
		jTextFieldexedente_neto_mensualBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldexedente_neto_mensualBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldexedente_neto_mensualBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldexedente_neto_mensualBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldexedente_neto_mensualBalanceGeneralCliente.setText("0.0");

		this.jButtonexedente_neto_mensualBalanceGeneralClienteBusqueda= new JButtonMe();
		this.jButtonexedente_neto_mensualBalanceGeneralClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonexedente_neto_mensualBalanceGeneralClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonexedente_neto_mensualBalanceGeneralClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonexedente_neto_mensualBalanceGeneralClienteBusqueda.setText("U");
		this.jButtonexedente_neto_mensualBalanceGeneralClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonexedente_neto_mensualBalanceGeneralClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonexedente_neto_mensualBalanceGeneralClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldexedente_neto_mensualBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldexedente_neto_mensualBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"exedente_neto_mensualBalanceGeneralClienteBusqueda"));

		if(this.balancegeneralclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonexedente_neto_mensualBalanceGeneralClienteBusqueda.setVisible(false);		}


					
		this.jLabeldeudas_bancariasBalanceGeneralCliente = new JLabelMe();
		this.jLabeldeudas_bancariasBalanceGeneralCliente.setText(""+BalanceGeneralClienteConstantesFunciones.LABEL_DEUDASBANCARIAS+" : *");
		this.jLabeldeudas_bancariasBalanceGeneralCliente.setToolTipText("Deudas Bancarias");
		this.jLabeldeudas_bancariasBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldeudas_bancariasBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldeudas_bancariasBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldeudas_bancariasBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldeudas_bancariasBalanceGeneralCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldeudas_bancariasBalanceGeneralCliente.setToolTipText(BalanceGeneralClienteConstantesFunciones.LABEL_DEUDASBANCARIAS);
		this.gridaBagLayoutBalanceGeneralCliente = new GridBagLayout();
		this.jPaneldeudas_bancariasBalanceGeneralCliente.setLayout(this.gridaBagLayoutBalanceGeneralCliente);


		jTextFielddeudas_bancariasBalanceGeneralCliente= new JTextFieldMe();
		jTextFielddeudas_bancariasBalanceGeneralCliente.setEnabled(false);
		jTextFielddeudas_bancariasBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddeudas_bancariasBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddeudas_bancariasBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddeudas_bancariasBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddeudas_bancariasBalanceGeneralCliente.setText("0.0");

		this.jButtondeudas_bancariasBalanceGeneralClienteBusqueda= new JButtonMe();
		this.jButtondeudas_bancariasBalanceGeneralClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondeudas_bancariasBalanceGeneralClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondeudas_bancariasBalanceGeneralClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondeudas_bancariasBalanceGeneralClienteBusqueda.setText("U");
		this.jButtondeudas_bancariasBalanceGeneralClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondeudas_bancariasBalanceGeneralClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondeudas_bancariasBalanceGeneralClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddeudas_bancariasBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddeudas_bancariasBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"deudas_bancariasBalanceGeneralClienteBusqueda"));

		if(this.balancegeneralclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondeudas_bancariasBalanceGeneralClienteBusqueda.setVisible(false);		}


					
		this.jLabelcuentas_por_pagarBalanceGeneralCliente = new JLabelMe();
		this.jLabelcuentas_por_pagarBalanceGeneralCliente.setText(""+BalanceGeneralClienteConstantesFunciones.LABEL_CUENTASPORPAGAR+" : *");
		this.jLabelcuentas_por_pagarBalanceGeneralCliente.setToolTipText("Cuentas Por Pagar");
		this.jLabelcuentas_por_pagarBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcuentas_por_pagarBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcuentas_por_pagarBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcuentas_por_pagarBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcuentas_por_pagarBalanceGeneralCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcuentas_por_pagarBalanceGeneralCliente.setToolTipText(BalanceGeneralClienteConstantesFunciones.LABEL_CUENTASPORPAGAR);
		this.gridaBagLayoutBalanceGeneralCliente = new GridBagLayout();
		this.jPanelcuentas_por_pagarBalanceGeneralCliente.setLayout(this.gridaBagLayoutBalanceGeneralCliente);


		jTextFieldcuentas_por_pagarBalanceGeneralCliente= new JTextFieldMe();
		jTextFieldcuentas_por_pagarBalanceGeneralCliente.setEnabled(false);
		jTextFieldcuentas_por_pagarBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcuentas_por_pagarBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcuentas_por_pagarBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcuentas_por_pagarBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcuentas_por_pagarBalanceGeneralCliente.setText("0.0");

		this.jButtoncuentas_por_pagarBalanceGeneralClienteBusqueda= new JButtonMe();
		this.jButtoncuentas_por_pagarBalanceGeneralClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncuentas_por_pagarBalanceGeneralClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncuentas_por_pagarBalanceGeneralClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncuentas_por_pagarBalanceGeneralClienteBusqueda.setText("U");
		this.jButtoncuentas_por_pagarBalanceGeneralClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncuentas_por_pagarBalanceGeneralClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncuentas_por_pagarBalanceGeneralClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcuentas_por_pagarBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcuentas_por_pagarBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cuentas_por_pagarBalanceGeneralClienteBusqueda"));

		if(this.balancegeneralclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncuentas_por_pagarBalanceGeneralClienteBusqueda.setVisible(false);		}


					
		this.jLabelanticipos_recibosBalanceGeneralCliente = new JLabelMe();
		this.jLabelanticipos_recibosBalanceGeneralCliente.setText(""+BalanceGeneralClienteConstantesFunciones.LABEL_ANTICIPOSRECIBOS+" : *");
		this.jLabelanticipos_recibosBalanceGeneralCliente.setToolTipText("Anticipos Recibos");
		this.jLabelanticipos_recibosBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelanticipos_recibosBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelanticipos_recibosBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelanticipos_recibosBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelanticipos_recibosBalanceGeneralCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelanticipos_recibosBalanceGeneralCliente.setToolTipText(BalanceGeneralClienteConstantesFunciones.LABEL_ANTICIPOSRECIBOS);
		this.gridaBagLayoutBalanceGeneralCliente = new GridBagLayout();
		this.jPanelanticipos_recibosBalanceGeneralCliente.setLayout(this.gridaBagLayoutBalanceGeneralCliente);


		jTextFieldanticipos_recibosBalanceGeneralCliente= new JTextFieldMe();
		jTextFieldanticipos_recibosBalanceGeneralCliente.setEnabled(false);
		jTextFieldanticipos_recibosBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldanticipos_recibosBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldanticipos_recibosBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldanticipos_recibosBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldanticipos_recibosBalanceGeneralCliente.setText("0.0");

		this.jButtonanticipos_recibosBalanceGeneralClienteBusqueda= new JButtonMe();
		this.jButtonanticipos_recibosBalanceGeneralClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanticipos_recibosBalanceGeneralClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanticipos_recibosBalanceGeneralClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonanticipos_recibosBalanceGeneralClienteBusqueda.setText("U");
		this.jButtonanticipos_recibosBalanceGeneralClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonanticipos_recibosBalanceGeneralClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonanticipos_recibosBalanceGeneralClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldanticipos_recibosBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldanticipos_recibosBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"anticipos_recibosBalanceGeneralClienteBusqueda"));

		if(this.balancegeneralclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonanticipos_recibosBalanceGeneralClienteBusqueda.setVisible(false);		}


					
		this.jLabelotras_cuentas_por_pagarBalanceGeneralCliente = new JLabelMe();
		this.jLabelotras_cuentas_por_pagarBalanceGeneralCliente.setText(""+BalanceGeneralClienteConstantesFunciones.LABEL_OTRASCUENTASPORPAGAR+" : *");
		this.jLabelotras_cuentas_por_pagarBalanceGeneralCliente.setToolTipText("Otras Cuentas Por Pagar");
		this.jLabelotras_cuentas_por_pagarBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelotras_cuentas_por_pagarBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelotras_cuentas_por_pagarBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelotras_cuentas_por_pagarBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelotras_cuentas_por_pagarBalanceGeneralCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelotras_cuentas_por_pagarBalanceGeneralCliente.setToolTipText(BalanceGeneralClienteConstantesFunciones.LABEL_OTRASCUENTASPORPAGAR);
		this.gridaBagLayoutBalanceGeneralCliente = new GridBagLayout();
		this.jPanelotras_cuentas_por_pagarBalanceGeneralCliente.setLayout(this.gridaBagLayoutBalanceGeneralCliente);


		jTextFieldotras_cuentas_por_pagarBalanceGeneralCliente= new JTextFieldMe();
		jTextFieldotras_cuentas_por_pagarBalanceGeneralCliente.setEnabled(false);
		jTextFieldotras_cuentas_por_pagarBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotras_cuentas_por_pagarBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotras_cuentas_por_pagarBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldotras_cuentas_por_pagarBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldotras_cuentas_por_pagarBalanceGeneralCliente.setText("0.0");

		this.jButtonotras_cuentas_por_pagarBalanceGeneralClienteBusqueda= new JButtonMe();
		this.jButtonotras_cuentas_por_pagarBalanceGeneralClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotras_cuentas_por_pagarBalanceGeneralClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotras_cuentas_por_pagarBalanceGeneralClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonotras_cuentas_por_pagarBalanceGeneralClienteBusqueda.setText("U");
		this.jButtonotras_cuentas_por_pagarBalanceGeneralClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonotras_cuentas_por_pagarBalanceGeneralClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonotras_cuentas_por_pagarBalanceGeneralClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldotras_cuentas_por_pagarBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldotras_cuentas_por_pagarBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"otras_cuentas_por_pagarBalanceGeneralClienteBusqueda"));

		if(this.balancegeneralclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonotras_cuentas_por_pagarBalanceGeneralClienteBusqueda.setVisible(false);		}


					
		this.jLabelotras_deudas_familiaresBalanceGeneralCliente = new JLabelMe();
		this.jLabelotras_deudas_familiaresBalanceGeneralCliente.setText(""+BalanceGeneralClienteConstantesFunciones.LABEL_OTRASDEUDASFAMILIARES+" : *");
		this.jLabelotras_deudas_familiaresBalanceGeneralCliente.setToolTipText("Otras Deudas Familiares");
		this.jLabelotras_deudas_familiaresBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelotras_deudas_familiaresBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelotras_deudas_familiaresBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelotras_deudas_familiaresBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelotras_deudas_familiaresBalanceGeneralCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelotras_deudas_familiaresBalanceGeneralCliente.setToolTipText(BalanceGeneralClienteConstantesFunciones.LABEL_OTRASDEUDASFAMILIARES);
		this.gridaBagLayoutBalanceGeneralCliente = new GridBagLayout();
		this.jPanelotras_deudas_familiaresBalanceGeneralCliente.setLayout(this.gridaBagLayoutBalanceGeneralCliente);


		jTextFieldotras_deudas_familiaresBalanceGeneralCliente= new JTextFieldMe();
		jTextFieldotras_deudas_familiaresBalanceGeneralCliente.setEnabled(false);
		jTextFieldotras_deudas_familiaresBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotras_deudas_familiaresBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotras_deudas_familiaresBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldotras_deudas_familiaresBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldotras_deudas_familiaresBalanceGeneralCliente.setText("0.0");

		this.jButtonotras_deudas_familiaresBalanceGeneralClienteBusqueda= new JButtonMe();
		this.jButtonotras_deudas_familiaresBalanceGeneralClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotras_deudas_familiaresBalanceGeneralClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotras_deudas_familiaresBalanceGeneralClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonotras_deudas_familiaresBalanceGeneralClienteBusqueda.setText("U");
		this.jButtonotras_deudas_familiaresBalanceGeneralClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonotras_deudas_familiaresBalanceGeneralClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonotras_deudas_familiaresBalanceGeneralClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldotras_deudas_familiaresBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldotras_deudas_familiaresBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"otras_deudas_familiaresBalanceGeneralClienteBusqueda"));

		if(this.balancegeneralclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonotras_deudas_familiaresBalanceGeneralClienteBusqueda.setVisible(false);		}


					
		this.jLabeltotal_pasivo_corrienteBalanceGeneralCliente = new JLabelMe();
		this.jLabeltotal_pasivo_corrienteBalanceGeneralCliente.setText(""+BalanceGeneralClienteConstantesFunciones.LABEL_TOTALPASIVOCORRIENTE+" : *");
		this.jLabeltotal_pasivo_corrienteBalanceGeneralCliente.setToolTipText("Total Pasivo Corriente");
		this.jLabeltotal_pasivo_corrienteBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeltotal_pasivo_corrienteBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeltotal_pasivo_corrienteBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_pasivo_corrienteBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_pasivo_corrienteBalanceGeneralCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_pasivo_corrienteBalanceGeneralCliente.setToolTipText(BalanceGeneralClienteConstantesFunciones.LABEL_TOTALPASIVOCORRIENTE);
		this.gridaBagLayoutBalanceGeneralCliente = new GridBagLayout();
		this.jPaneltotal_pasivo_corrienteBalanceGeneralCliente.setLayout(this.gridaBagLayoutBalanceGeneralCliente);


		jTextFieldtotal_pasivo_corrienteBalanceGeneralCliente= new JTextFieldMe();
		jTextFieldtotal_pasivo_corrienteBalanceGeneralCliente.setEnabled(false);
		jTextFieldtotal_pasivo_corrienteBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_pasivo_corrienteBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_pasivo_corrienteBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_pasivo_corrienteBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_pasivo_corrienteBalanceGeneralCliente.setText("0.0");

		this.jButtontotal_pasivo_corrienteBalanceGeneralClienteBusqueda= new JButtonMe();
		this.jButtontotal_pasivo_corrienteBalanceGeneralClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_pasivo_corrienteBalanceGeneralClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_pasivo_corrienteBalanceGeneralClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_pasivo_corrienteBalanceGeneralClienteBusqueda.setText("U");
		this.jButtontotal_pasivo_corrienteBalanceGeneralClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_pasivo_corrienteBalanceGeneralClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_pasivo_corrienteBalanceGeneralClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_pasivo_corrienteBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_pasivo_corrienteBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_pasivo_corrienteBalanceGeneralClienteBusqueda"));

		if(this.balancegeneralclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_pasivo_corrienteBalanceGeneralClienteBusqueda.setVisible(false);		}


					
		this.jLabeldeudas_bancarias_largo_plazoBalanceGeneralCliente = new JLabelMe();
		this.jLabeldeudas_bancarias_largo_plazoBalanceGeneralCliente.setText(""+BalanceGeneralClienteConstantesFunciones.LABEL_DEUDASBANCARIASLARGOPLAZO+" : *");
		this.jLabeldeudas_bancarias_largo_plazoBalanceGeneralCliente.setToolTipText("Deudas Bancarias Largo Plazo");
		this.jLabeldeudas_bancarias_largo_plazoBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeldeudas_bancarias_largo_plazoBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeldeudas_bancarias_largo_plazoBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabeldeudas_bancarias_largo_plazoBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldeudas_bancarias_largo_plazoBalanceGeneralCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldeudas_bancarias_largo_plazoBalanceGeneralCliente.setToolTipText(BalanceGeneralClienteConstantesFunciones.LABEL_DEUDASBANCARIASLARGOPLAZO);
		this.gridaBagLayoutBalanceGeneralCliente = new GridBagLayout();
		this.jPaneldeudas_bancarias_largo_plazoBalanceGeneralCliente.setLayout(this.gridaBagLayoutBalanceGeneralCliente);


		jTextFielddeudas_bancarias_largo_plazoBalanceGeneralCliente= new JTextFieldMe();
		jTextFielddeudas_bancarias_largo_plazoBalanceGeneralCliente.setEnabled(false);
		jTextFielddeudas_bancarias_largo_plazoBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddeudas_bancarias_largo_plazoBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddeudas_bancarias_largo_plazoBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddeudas_bancarias_largo_plazoBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddeudas_bancarias_largo_plazoBalanceGeneralCliente.setText("0.0");

		this.jButtondeudas_bancarias_largo_plazoBalanceGeneralClienteBusqueda= new JButtonMe();
		this.jButtondeudas_bancarias_largo_plazoBalanceGeneralClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondeudas_bancarias_largo_plazoBalanceGeneralClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondeudas_bancarias_largo_plazoBalanceGeneralClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondeudas_bancarias_largo_plazoBalanceGeneralClienteBusqueda.setText("U");
		this.jButtondeudas_bancarias_largo_plazoBalanceGeneralClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondeudas_bancarias_largo_plazoBalanceGeneralClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondeudas_bancarias_largo_plazoBalanceGeneralClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddeudas_bancarias_largo_plazoBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddeudas_bancarias_largo_plazoBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"deudas_bancarias_largo_plazoBalanceGeneralClienteBusqueda"));

		if(this.balancegeneralclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondeudas_bancarias_largo_plazoBalanceGeneralClienteBusqueda.setVisible(false);		}


					
		this.jLabelotros_pasivos_largo_plazoBalanceGeneralCliente = new JLabelMe();
		this.jLabelotros_pasivos_largo_plazoBalanceGeneralCliente.setText(""+BalanceGeneralClienteConstantesFunciones.LABEL_OTROSPASIVOSLARGOPLAZO+" : *");
		this.jLabelotros_pasivos_largo_plazoBalanceGeneralCliente.setToolTipText("Otros Pasivos Largo Plazo");
		this.jLabelotros_pasivos_largo_plazoBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelotros_pasivos_largo_plazoBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelotros_pasivos_largo_plazoBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelotros_pasivos_largo_plazoBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelotros_pasivos_largo_plazoBalanceGeneralCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelotros_pasivos_largo_plazoBalanceGeneralCliente.setToolTipText(BalanceGeneralClienteConstantesFunciones.LABEL_OTROSPASIVOSLARGOPLAZO);
		this.gridaBagLayoutBalanceGeneralCliente = new GridBagLayout();
		this.jPanelotros_pasivos_largo_plazoBalanceGeneralCliente.setLayout(this.gridaBagLayoutBalanceGeneralCliente);


		jTextFieldotros_pasivos_largo_plazoBalanceGeneralCliente= new JTextFieldMe();
		jTextFieldotros_pasivos_largo_plazoBalanceGeneralCliente.setEnabled(false);
		jTextFieldotros_pasivos_largo_plazoBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotros_pasivos_largo_plazoBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotros_pasivos_largo_plazoBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldotros_pasivos_largo_plazoBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldotros_pasivos_largo_plazoBalanceGeneralCliente.setText("0.0");

		this.jButtonotros_pasivos_largo_plazoBalanceGeneralClienteBusqueda= new JButtonMe();
		this.jButtonotros_pasivos_largo_plazoBalanceGeneralClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotros_pasivos_largo_plazoBalanceGeneralClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotros_pasivos_largo_plazoBalanceGeneralClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonotros_pasivos_largo_plazoBalanceGeneralClienteBusqueda.setText("U");
		this.jButtonotros_pasivos_largo_plazoBalanceGeneralClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonotros_pasivos_largo_plazoBalanceGeneralClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonotros_pasivos_largo_plazoBalanceGeneralClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldotros_pasivos_largo_plazoBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldotros_pasivos_largo_plazoBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"otros_pasivos_largo_plazoBalanceGeneralClienteBusqueda"));

		if(this.balancegeneralclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonotros_pasivos_largo_plazoBalanceGeneralClienteBusqueda.setVisible(false);		}


					
		this.jLabeltotal_pasivo_no_corrienteBalanceGeneralCliente = new JLabelMe();
		this.jLabeltotal_pasivo_no_corrienteBalanceGeneralCliente.setText(""+BalanceGeneralClienteConstantesFunciones.LABEL_TOTALPASIVONOCORRIENTE+" : *");
		this.jLabeltotal_pasivo_no_corrienteBalanceGeneralCliente.setToolTipText("Total Pasivo No Corriente");
		this.jLabeltotal_pasivo_no_corrienteBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeltotal_pasivo_no_corrienteBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeltotal_pasivo_no_corrienteBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_pasivo_no_corrienteBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_pasivo_no_corrienteBalanceGeneralCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_pasivo_no_corrienteBalanceGeneralCliente.setToolTipText(BalanceGeneralClienteConstantesFunciones.LABEL_TOTALPASIVONOCORRIENTE);
		this.gridaBagLayoutBalanceGeneralCliente = new GridBagLayout();
		this.jPaneltotal_pasivo_no_corrienteBalanceGeneralCliente.setLayout(this.gridaBagLayoutBalanceGeneralCliente);


		jTextFieldtotal_pasivo_no_corrienteBalanceGeneralCliente= new JTextFieldMe();
		jTextFieldtotal_pasivo_no_corrienteBalanceGeneralCliente.setEnabled(false);
		jTextFieldtotal_pasivo_no_corrienteBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_pasivo_no_corrienteBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_pasivo_no_corrienteBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_pasivo_no_corrienteBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_pasivo_no_corrienteBalanceGeneralCliente.setText("0.0");

		this.jButtontotal_pasivo_no_corrienteBalanceGeneralClienteBusqueda= new JButtonMe();
		this.jButtontotal_pasivo_no_corrienteBalanceGeneralClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_pasivo_no_corrienteBalanceGeneralClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_pasivo_no_corrienteBalanceGeneralClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_pasivo_no_corrienteBalanceGeneralClienteBusqueda.setText("U");
		this.jButtontotal_pasivo_no_corrienteBalanceGeneralClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_pasivo_no_corrienteBalanceGeneralClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_pasivo_no_corrienteBalanceGeneralClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_pasivo_no_corrienteBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_pasivo_no_corrienteBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_pasivo_no_corrienteBalanceGeneralClienteBusqueda"));

		if(this.balancegeneralclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_pasivo_no_corrienteBalanceGeneralClienteBusqueda.setVisible(false);		}


					
		this.jLabeltotal_pasivoBalanceGeneralCliente = new JLabelMe();
		this.jLabeltotal_pasivoBalanceGeneralCliente.setText(""+BalanceGeneralClienteConstantesFunciones.LABEL_TOTALPASIVO+" : *");
		this.jLabeltotal_pasivoBalanceGeneralCliente.setToolTipText("Total Pasivo");
		this.jLabeltotal_pasivoBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_pasivoBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_pasivoBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_pasivoBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_pasivoBalanceGeneralCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_pasivoBalanceGeneralCliente.setToolTipText(BalanceGeneralClienteConstantesFunciones.LABEL_TOTALPASIVO);
		this.gridaBagLayoutBalanceGeneralCliente = new GridBagLayout();
		this.jPaneltotal_pasivoBalanceGeneralCliente.setLayout(this.gridaBagLayoutBalanceGeneralCliente);


		jTextFieldtotal_pasivoBalanceGeneralCliente= new JTextFieldMe();
		jTextFieldtotal_pasivoBalanceGeneralCliente.setEnabled(false);
		jTextFieldtotal_pasivoBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_pasivoBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_pasivoBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_pasivoBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_pasivoBalanceGeneralCliente.setText("0.0");

		this.jButtontotal_pasivoBalanceGeneralClienteBusqueda= new JButtonMe();
		this.jButtontotal_pasivoBalanceGeneralClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_pasivoBalanceGeneralClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_pasivoBalanceGeneralClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_pasivoBalanceGeneralClienteBusqueda.setText("U");
		this.jButtontotal_pasivoBalanceGeneralClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_pasivoBalanceGeneralClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_pasivoBalanceGeneralClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_pasivoBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_pasivoBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_pasivoBalanceGeneralClienteBusqueda"));

		if(this.balancegeneralclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_pasivoBalanceGeneralClienteBusqueda.setVisible(false);		}


					
		this.jLabelpatrimonioBalanceGeneralCliente = new JLabelMe();
		this.jLabelpatrimonioBalanceGeneralCliente.setText(""+BalanceGeneralClienteConstantesFunciones.LABEL_PATRIMONIO+" : *");
		this.jLabelpatrimonioBalanceGeneralCliente.setToolTipText("Patrimonio");
		this.jLabelpatrimonioBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpatrimonioBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpatrimonioBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelpatrimonioBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpatrimonioBalanceGeneralCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpatrimonioBalanceGeneralCliente.setToolTipText(BalanceGeneralClienteConstantesFunciones.LABEL_PATRIMONIO);
		this.gridaBagLayoutBalanceGeneralCliente = new GridBagLayout();
		this.jPanelpatrimonioBalanceGeneralCliente.setLayout(this.gridaBagLayoutBalanceGeneralCliente);


		jTextFieldpatrimonioBalanceGeneralCliente= new JTextFieldMe();
		jTextFieldpatrimonioBalanceGeneralCliente.setEnabled(false);
		jTextFieldpatrimonioBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpatrimonioBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpatrimonioBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldpatrimonioBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldpatrimonioBalanceGeneralCliente.setText("0.0");

		this.jButtonpatrimonioBalanceGeneralClienteBusqueda= new JButtonMe();
		this.jButtonpatrimonioBalanceGeneralClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpatrimonioBalanceGeneralClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpatrimonioBalanceGeneralClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpatrimonioBalanceGeneralClienteBusqueda.setText("U");
		this.jButtonpatrimonioBalanceGeneralClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpatrimonioBalanceGeneralClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpatrimonioBalanceGeneralClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldpatrimonioBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldpatrimonioBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"patrimonioBalanceGeneralClienteBusqueda"));

		if(this.balancegeneralclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpatrimonioBalanceGeneralClienteBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionBalanceGeneralCliente = new JLabelMe();
		this.jLabeldescripcionBalanceGeneralCliente.setText(""+BalanceGeneralClienteConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionBalanceGeneralCliente.setToolTipText("Descripcion");
		this.jLabeldescripcionBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionBalanceGeneralCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionBalanceGeneralCliente.setToolTipText(BalanceGeneralClienteConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutBalanceGeneralCliente = new GridBagLayout();
		this.jPaneldescripcionBalanceGeneralCliente.setLayout(this.gridaBagLayoutBalanceGeneralCliente);


		jTextAreadescripcionBalanceGeneralCliente= new JTextAreaMe();
		jTextAreadescripcionBalanceGeneralCliente.setEnabled(false);
		jTextAreadescripcionBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionBalanceGeneralCliente.setLineWrap(true);
		jTextAreadescripcionBalanceGeneralCliente.setWrapStyleWord(true);
		jTextAreadescripcionBalanceGeneralCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionBalanceGeneralCliente.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionBalanceGeneralCliente = new JScrollPane(jTextAreadescripcionBalanceGeneralCliente);
		jscrollPanedescripcionBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionBalanceGeneralClienteBusqueda= new JButtonMe();
		this.jButtondescripcionBalanceGeneralClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionBalanceGeneralClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionBalanceGeneralClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionBalanceGeneralClienteBusqueda.setText("U");
		this.jButtondescripcionBalanceGeneralClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionBalanceGeneralClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionBalanceGeneralClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionBalanceGeneralClienteBusqueda"));

		if(this.balancegeneralclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionBalanceGeneralClienteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysBalanceGeneralCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaBalanceGeneralCliente = new JLabelMe();
		this.jLabelid_empresaBalanceGeneralCliente.setText(""+BalanceGeneralClienteConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaBalanceGeneralCliente.setToolTipText("Empresa");
		this.jLabelid_empresaBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaBalanceGeneralCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaBalanceGeneralCliente.setToolTipText(BalanceGeneralClienteConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutBalanceGeneralCliente = new GridBagLayout();
		this.jPanelid_empresaBalanceGeneralCliente.setLayout(this.gridaBagLayoutBalanceGeneralCliente);


		jComboBoxid_empresaBalanceGeneralCliente= new JComboBoxMe();
		jComboBoxid_empresaBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaBalanceGeneralCliente.setEnabled(false);

		this.jButtonid_empresaBalanceGeneralCliente= new JButtonMe();
		this.jButtonid_empresaBalanceGeneralCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaBalanceGeneralCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaBalanceGeneralCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaBalanceGeneralCliente.setText("Buscar");
		this.jButtonid_empresaBalanceGeneralCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaBalanceGeneralCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaBalanceGeneralCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaBalanceGeneralCliente"));

		this.jButtonid_empresaBalanceGeneralClienteBusqueda= new JButtonMe();
		this.jButtonid_empresaBalanceGeneralClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBalanceGeneralClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBalanceGeneralClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaBalanceGeneralClienteBusqueda.setText("U");
		this.jButtonid_empresaBalanceGeneralClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaBalanceGeneralClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaBalanceGeneralClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaBalanceGeneralClienteBusqueda"));

		if(this.balancegeneralclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaBalanceGeneralClienteBusqueda.setVisible(false);		}

		this.jButtonid_empresaBalanceGeneralClienteUpdate= new JButtonMe();
		this.jButtonid_empresaBalanceGeneralClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBalanceGeneralClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBalanceGeneralClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaBalanceGeneralClienteUpdate.setText("U");
		this.jButtonid_empresaBalanceGeneralClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaBalanceGeneralClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaBalanceGeneralClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaBalanceGeneralClienteUpdate"));



					
		this.jLabelid_clienteBalanceGeneralCliente = new JLabelMe();
		this.jLabelid_clienteBalanceGeneralCliente.setText(""+BalanceGeneralClienteConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteBalanceGeneralCliente.setToolTipText("Cliente");
		this.jLabelid_clienteBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteBalanceGeneralCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteBalanceGeneralCliente.setToolTipText(BalanceGeneralClienteConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutBalanceGeneralCliente = new GridBagLayout();
		this.jPanelid_clienteBalanceGeneralCliente.setLayout(this.gridaBagLayoutBalanceGeneralCliente);


		jComboBoxid_clienteBalanceGeneralCliente= new JComboBoxMe();
		jComboBoxid_clienteBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteBalanceGeneralCliente= new JButtonMe();
		this.jButtonid_clienteBalanceGeneralCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteBalanceGeneralCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteBalanceGeneralCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteBalanceGeneralCliente.setText("Buscar");
		this.jButtonid_clienteBalanceGeneralCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteBalanceGeneralCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteBalanceGeneralCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteBalanceGeneralCliente"));

		this.jButtonid_clienteBalanceGeneralClienteBusqueda= new JButtonMe();
		this.jButtonid_clienteBalanceGeneralClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteBalanceGeneralClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteBalanceGeneralClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteBalanceGeneralClienteBusqueda.setText("U");
		this.jButtonid_clienteBalanceGeneralClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteBalanceGeneralClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteBalanceGeneralClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteBalanceGeneralClienteBusqueda"));

		if(this.balancegeneralclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteBalanceGeneralClienteBusqueda.setVisible(false);		}

		this.jButtonid_clienteBalanceGeneralClienteUpdate= new JButtonMe();
		this.jButtonid_clienteBalanceGeneralClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteBalanceGeneralClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteBalanceGeneralClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteBalanceGeneralClienteUpdate.setText("U");
		this.jButtonid_clienteBalanceGeneralClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteBalanceGeneralClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteBalanceGeneralClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteBalanceGeneralCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteBalanceGeneralCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteBalanceGeneralClienteUpdate"));



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
		//this.jInternalFrameDetalleBalanceGeneralCliente = new BalanceGeneralClienteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Balance General Cliente DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutBalanceGeneralCliente= new GridBagLayout();
		

		
		String sToolTipBalanceGeneralCliente="";
		sToolTipBalanceGeneralCliente=BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipBalanceGeneralCliente+="(Cartera.BalanceGeneralCliente)";
		}
		
		if(!this.balancegeneralclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipBalanceGeneralCliente+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoBalanceGeneralCliente = new JButtonMe();
		this.jButtonModificarBalanceGeneralCliente = new JButtonMe();
        this.jButtonActualizarBalanceGeneralCliente = new JButtonMe();
        this.jButtonEliminarBalanceGeneralCliente = new JButtonMe();
        this.jButtonCancelarBalanceGeneralCliente = new JButtonMe();
        this.jButtonGuardarCambiosBalanceGeneralCliente = new JButtonMe();
		this.jButtonGuardarCambiosTablaBalanceGeneralCliente = new JButtonMe();
		this.jButtonCerrarBalanceGeneralCliente = new JButtonMe();
		
		this.jScrollPanelDatosBalanceGeneralCliente = new JScrollPane();   
        this.jScrollPanelDatosEdicionBalanceGeneralCliente = new JScrollPane();
		this.jScrollPanelDatosGeneralBalanceGeneralCliente = new JScrollPane();
				
		
		
		this.jPanelCamposBalanceGeneralCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosBalanceGeneralCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesBalanceGeneralCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioBalanceGeneralCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Balance General Cliente";
		
		if(!this.balancegeneralclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosBalanceGeneralCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Balance General Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosBalanceGeneralCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionBalanceGeneralCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralBalanceGeneralCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposBalanceGeneralCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposBalanceGeneralCliente.setName("jPanelCamposBalanceGeneralCliente"); 

		this.jPanelCamposOcultosBalanceGeneralCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosBalanceGeneralCliente.setName("jPanelCamposOcultosBalanceGeneralCliente"); 

        this.jPanelAccionesBalanceGeneralCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesBalanceGeneralCliente.setToolTipText("Acciones");
        this.jPanelAccionesBalanceGeneralCliente.setName("Acciones"); 

		this.jPanelAccionesFormularioBalanceGeneralCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioBalanceGeneralCliente.setToolTipText("Acciones");
        this.jPanelAccionesFormularioBalanceGeneralCliente.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoBalanceGeneralCliente.setText("Nuevo");
		this.jButtonModificarBalanceGeneralCliente.setText("Editar");
        this.jButtonActualizarBalanceGeneralCliente.setText("Actualizar");
        this.jButtonEliminarBalanceGeneralCliente.setText("Eliminar");
        this.jButtonCancelarBalanceGeneralCliente.setText("Cancelar");
        this.jButtonGuardarCambiosBalanceGeneralCliente.setText("Guardar");
		this.jButtonGuardarCambiosTablaBalanceGeneralCliente.setText("Guardar");
		this.jButtonCerrarBalanceGeneralCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoBalanceGeneralCliente,"nuevo_button","Nuevo",this.balancegeneralclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarBalanceGeneralCliente,"modificar_button","Editar",this.balancegeneralclienteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarBalanceGeneralCliente,"actualizar_button","Actualizar",this.balancegeneralclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarBalanceGeneralCliente,"eliminar_button","Eliminar",this.balancegeneralclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarBalanceGeneralCliente,"cancelar_button","Cancelar",this.balancegeneralclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosBalanceGeneralCliente,"guardarcambios_button","Guardar",this.balancegeneralclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaBalanceGeneralCliente,"guardarcambiostabla_button","Guardar",this.balancegeneralclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarBalanceGeneralCliente,"cerrar_button","Salir",this.balancegeneralclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoBalanceGeneralCliente.setToolTipText("Nuevo"+" "+BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarBalanceGeneralCliente.setToolTipText("Editar"+" "+BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarBalanceGeneralCliente.setToolTipText("Actualizar"+" "+BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarBalanceGeneralCliente.setToolTipText("Eliminar)"+" "+BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarBalanceGeneralCliente.setToolTipText("Cancelar"+" "+BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosBalanceGeneralCliente.setToolTipText("Guardar"+" "+BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaBalanceGeneralCliente.setToolTipText("Guardar"+" "+BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarBalanceGeneralCliente.setToolTipText("Salir"+" "+BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoBalanceGeneralCliente";
		inputMap = this.jButtonNuevoBalanceGeneralCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoBalanceGeneralCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoBalanceGeneralCliente"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarBalanceGeneralCliente";
		inputMap = this.jButtonActualizarBalanceGeneralCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarBalanceGeneralCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarBalanceGeneralCliente"));
		
		//ELIMINAR
		sMapKey = "EliminarBalanceGeneralCliente";
		inputMap = this.jButtonEliminarBalanceGeneralCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarBalanceGeneralCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarBalanceGeneralCliente"));
		
		//CANCELAR	
		sMapKey = "CancelarBalanceGeneralCliente";
		inputMap = this.jButtonCancelarBalanceGeneralCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarBalanceGeneralCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarBalanceGeneralCliente"));
		
		//CERRAR		
		sMapKey = "CerrarBalanceGeneralCliente";
		inputMap = this.jButtonCerrarBalanceGeneralCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarBalanceGeneralCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarBalanceGeneralCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaBalanceGeneralCliente";
		inputMap = this.jButtonGuardarCambiosTablaBalanceGeneralCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaBalanceGeneralCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaBalanceGeneralCliente"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoBalanceGeneralCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoBalanceGeneralCliente.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoBalanceGeneralCliente.setToolTipText("Nuevo BalanceGeneralCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarBalanceGeneralCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarBalanceGeneralCliente.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarBalanceGeneralCliente.setToolTipText("Sin Cerrar Ventana BalanceGeneralCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeBalanceGeneralCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeBalanceGeneralCliente.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeBalanceGeneralCliente.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesBalanceGeneralCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesBalanceGeneralCliente.setText("Accion");
		this.jComboBoxTiposAccionesBalanceGeneralCliente.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioBalanceGeneralCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioBalanceGeneralCliente.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioBalanceGeneralCliente.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesBalanceGeneralCliente = new JLabelMe();
		
		this.jLabelAccionesBalanceGeneralCliente.setText("Acciones");		
		this.jLabelAccionesBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposBalanceGeneralCliente();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysBalanceGeneralCliente();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesBalanceGeneralCliente=new JTabbedPane();
		this.jTabbedPaneRelacionesBalanceGeneralCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesBalanceGeneralCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBalanceGeneralCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBalanceGeneralCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioBalanceGeneralCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioBalanceGeneralCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioBalanceGeneralCliente.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposBalanceGeneralCliente = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosBalanceGeneralCliente = new GridBagLayout();
		
		this.jPanelCamposBalanceGeneralCliente.setLayout(gridaBagLayoutCamposBalanceGeneralCliente);
		this.jPanelCamposOcultosBalanceGeneralCliente.setLayout(gridaBagLayoutCamposOcultosBalanceGeneralCliente);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidBalanceGeneralCliente.add(jLabelIdBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 1;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidBalanceGeneralCliente.add(jLabelidBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaBalanceGeneralCliente.add(jLabelid_empresaBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 2;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
		this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaBalanceGeneralCliente.add(jButtonid_empresaBalanceGeneralClienteBusqueda, this.gridBagConstraintsBalanceGeneralCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 3;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
		this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaBalanceGeneralCliente.add(jButtonid_empresaBalanceGeneralClienteUpdate, this.gridBagConstraintsBalanceGeneralCliente);
	}

	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 1;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaBalanceGeneralCliente.add(jComboBoxid_empresaBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteBalanceGeneralCliente.add(jLabelid_clienteBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 2;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteBalanceGeneralCliente.add(jButtonid_clienteBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 3;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
		this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteBalanceGeneralCliente.add(jButtonid_clienteBalanceGeneralClienteBusqueda, this.gridBagConstraintsBalanceGeneralCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 4;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
		this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteBalanceGeneralCliente.add(jButtonid_clienteBalanceGeneralClienteUpdate, this.gridBagConstraintsBalanceGeneralCliente);
	}

	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 1;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteBalanceGeneralCliente.add(jComboBoxid_clienteBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcaja_bancos_disponibleBalanceGeneralCliente.add(jLabelcaja_bancos_disponibleBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 2;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
		this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelcaja_bancos_disponibleBalanceGeneralCliente.add(jButtoncaja_bancos_disponibleBalanceGeneralClienteBusqueda, this.gridBagConstraintsBalanceGeneralCliente);
	}

	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 1;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcaja_bancos_disponibleBalanceGeneralCliente.add(jTextFieldcaja_bancos_disponibleBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcuentas_por_cobrar_clientesBalanceGeneralCliente.add(jLabelcuentas_por_cobrar_clientesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 2;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
		this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelcuentas_por_cobrar_clientesBalanceGeneralCliente.add(jButtoncuentas_por_cobrar_clientesBalanceGeneralClienteBusqueda, this.gridBagConstraintsBalanceGeneralCliente);
	}

	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 1;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcuentas_por_cobrar_clientesBalanceGeneralCliente.add(jTextFieldcuentas_por_cobrar_clientesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelinventarioBalanceGeneralCliente.add(jLabelinventarioBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 2;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
		this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelinventarioBalanceGeneralCliente.add(jButtoninventarioBalanceGeneralClienteBusqueda, this.gridBagConstraintsBalanceGeneralCliente);
	}

	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 1;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelinventarioBalanceGeneralCliente.add(jTextFieldinventarioBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelotros_activos_corrientesBalanceGeneralCliente.add(jLabelotros_activos_corrientesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 2;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
		this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelotros_activos_corrientesBalanceGeneralCliente.add(jButtonotros_activos_corrientesBalanceGeneralClienteBusqueda, this.gridBagConstraintsBalanceGeneralCliente);
	}

	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 1;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelotros_activos_corrientesBalanceGeneralCliente.add(jTextFieldotros_activos_corrientesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_activos_corrientesBalanceGeneralCliente.add(jLabeltotal_activos_corrientesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 2;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
		this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_activos_corrientesBalanceGeneralCliente.add(jButtontotal_activos_corrientesBalanceGeneralClienteBusqueda, this.gridBagConstraintsBalanceGeneralCliente);
	}

	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 1;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_activos_corrientesBalanceGeneralCliente.add(jTextFieldtotal_activos_corrientesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelbienes_inmueblesBalanceGeneralCliente.add(jLabelbienes_inmueblesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 2;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
		this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelbienes_inmueblesBalanceGeneralCliente.add(jButtonbienes_inmueblesBalanceGeneralClienteBusqueda, this.gridBagConstraintsBalanceGeneralCliente);
	}

	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 1;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelbienes_inmueblesBalanceGeneralCliente.add(jTextFieldbienes_inmueblesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelbienes_mueblesBalanceGeneralCliente.add(jLabelbienes_mueblesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 2;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
		this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelbienes_mueblesBalanceGeneralCliente.add(jButtonbienes_mueblesBalanceGeneralClienteBusqueda, this.gridBagConstraintsBalanceGeneralCliente);
	}

	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 1;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelbienes_mueblesBalanceGeneralCliente.add(jTextFieldbienes_mueblesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelotros_activos_no_corrientesBalanceGeneralCliente.add(jLabelotros_activos_no_corrientesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 2;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
		this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelotros_activos_no_corrientesBalanceGeneralCliente.add(jButtonotros_activos_no_corrientesBalanceGeneralClienteBusqueda, this.gridBagConstraintsBalanceGeneralCliente);
	}

	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 1;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelotros_activos_no_corrientesBalanceGeneralCliente.add(jTextFieldotros_activos_no_corrientesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_activos_no_corrientesBalanceGeneralCliente.add(jLabeltotal_activos_no_corrientesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 2;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
		this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_activos_no_corrientesBalanceGeneralCliente.add(jButtontotal_activos_no_corrientesBalanceGeneralClienteBusqueda, this.gridBagConstraintsBalanceGeneralCliente);
	}

	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 1;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_activos_no_corrientesBalanceGeneralCliente.add(jTextFieldtotal_activos_no_corrientesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelventas_mensualesBalanceGeneralCliente.add(jLabelventas_mensualesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 2;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
		this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelventas_mensualesBalanceGeneralCliente.add(jButtonventas_mensualesBalanceGeneralClienteBusqueda, this.gridBagConstraintsBalanceGeneralCliente);
	}

	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 1;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelventas_mensualesBalanceGeneralCliente.add(jTextFieldventas_mensualesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_ventas_mensualesBalanceGeneralCliente.add(jLabelcosto_ventas_mensualesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 2;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
		this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_ventas_mensualesBalanceGeneralCliente.add(jButtoncosto_ventas_mensualesBalanceGeneralClienteBusqueda, this.gridBagConstraintsBalanceGeneralCliente);
	}

	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 1;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_ventas_mensualesBalanceGeneralCliente.add(jTextFieldcosto_ventas_mensualesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelutilidad_brutaBalanceGeneralCliente.add(jLabelutilidad_brutaBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 2;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
		this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelutilidad_brutaBalanceGeneralCliente.add(jButtonutilidad_brutaBalanceGeneralClienteBusqueda, this.gridBagConstraintsBalanceGeneralCliente);
	}

	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 1;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelutilidad_brutaBalanceGeneralCliente.add(jTextFieldutilidad_brutaBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelgastos_operativosBalanceGeneralCliente.add(jLabelgastos_operativosBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 2;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
		this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelgastos_operativosBalanceGeneralCliente.add(jButtongastos_operativosBalanceGeneralClienteBusqueda, this.gridBagConstraintsBalanceGeneralCliente);
	}

	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 1;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelgastos_operativosBalanceGeneralCliente.add(jTextFieldgastos_operativosBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsueldosBalanceGeneralCliente.add(jLabelsueldosBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 2;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
		this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelsueldosBalanceGeneralCliente.add(jButtonsueldosBalanceGeneralClienteBusqueda, this.gridBagConstraintsBalanceGeneralCliente);
	}

	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 1;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsueldosBalanceGeneralCliente.add(jTextFieldsueldosBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelserviciosBalanceGeneralCliente.add(jLabelserviciosBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 2;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
		this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelserviciosBalanceGeneralCliente.add(jButtonserviciosBalanceGeneralClienteBusqueda, this.gridBagConstraintsBalanceGeneralCliente);
	}

	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 1;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelserviciosBalanceGeneralCliente.add(jTextFieldserviciosBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelarriendosBalanceGeneralCliente.add(jLabelarriendosBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 2;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
		this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelarriendosBalanceGeneralCliente.add(jButtonarriendosBalanceGeneralClienteBusqueda, this.gridBagConstraintsBalanceGeneralCliente);
	}

	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 1;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelarriendosBalanceGeneralCliente.add(jTextFieldarriendosBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelimpuestosBalanceGeneralCliente.add(jLabelimpuestosBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 2;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
		this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelimpuestosBalanceGeneralCliente.add(jButtonimpuestosBalanceGeneralClienteBusqueda, this.gridBagConstraintsBalanceGeneralCliente);
	}

	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 1;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelimpuestosBalanceGeneralCliente.add(jTextFieldimpuestosBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelutilidad_operativaBalanceGeneralCliente.add(jLabelutilidad_operativaBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 2;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
		this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelutilidad_operativaBalanceGeneralCliente.add(jButtonutilidad_operativaBalanceGeneralClienteBusqueda, this.gridBagConstraintsBalanceGeneralCliente);
	}

	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 1;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelutilidad_operativaBalanceGeneralCliente.add(jTextFieldutilidad_operativaBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelgastos_familiaresBalanceGeneralCliente.add(jLabelgastos_familiaresBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 2;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
		this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelgastos_familiaresBalanceGeneralCliente.add(jButtongastos_familiaresBalanceGeneralClienteBusqueda, this.gridBagConstraintsBalanceGeneralCliente);
	}

	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 1;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelgastos_familiaresBalanceGeneralCliente.add(jTextFieldgastos_familiaresBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelexcedente_antes_dividendosBalanceGeneralCliente.add(jLabelexcedente_antes_dividendosBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 2;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
		this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelexcedente_antes_dividendosBalanceGeneralCliente.add(jButtonexcedente_antes_dividendosBalanceGeneralClienteBusqueda, this.gridBagConstraintsBalanceGeneralCliente);
	}

	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 1;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelexcedente_antes_dividendosBalanceGeneralCliente.add(jTextFieldexcedente_antes_dividendosBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldividendos_bancos_otrosBalanceGeneralCliente.add(jLabeldividendos_bancos_otrosBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 2;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
		this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneldividendos_bancos_otrosBalanceGeneralCliente.add(jButtondividendos_bancos_otrosBalanceGeneralClienteBusqueda, this.gridBagConstraintsBalanceGeneralCliente);
	}

	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 1;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldividendos_bancos_otrosBalanceGeneralCliente.add(jTextFielddividendos_bancos_otrosBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelexedente_neto_mensualBalanceGeneralCliente.add(jLabelexedente_neto_mensualBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 2;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
		this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelexedente_neto_mensualBalanceGeneralCliente.add(jButtonexedente_neto_mensualBalanceGeneralClienteBusqueda, this.gridBagConstraintsBalanceGeneralCliente);
	}

	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 1;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelexedente_neto_mensualBalanceGeneralCliente.add(jTextFieldexedente_neto_mensualBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldeudas_bancariasBalanceGeneralCliente.add(jLabeldeudas_bancariasBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 2;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
		this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneldeudas_bancariasBalanceGeneralCliente.add(jButtondeudas_bancariasBalanceGeneralClienteBusqueda, this.gridBagConstraintsBalanceGeneralCliente);
	}

	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 1;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldeudas_bancariasBalanceGeneralCliente.add(jTextFielddeudas_bancariasBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcuentas_por_pagarBalanceGeneralCliente.add(jLabelcuentas_por_pagarBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 2;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
		this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelcuentas_por_pagarBalanceGeneralCliente.add(jButtoncuentas_por_pagarBalanceGeneralClienteBusqueda, this.gridBagConstraintsBalanceGeneralCliente);
	}

	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 1;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcuentas_por_pagarBalanceGeneralCliente.add(jTextFieldcuentas_por_pagarBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelanticipos_recibosBalanceGeneralCliente.add(jLabelanticipos_recibosBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 2;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
		this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelanticipos_recibosBalanceGeneralCliente.add(jButtonanticipos_recibosBalanceGeneralClienteBusqueda, this.gridBagConstraintsBalanceGeneralCliente);
	}

	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 1;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelanticipos_recibosBalanceGeneralCliente.add(jTextFieldanticipos_recibosBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelotras_cuentas_por_pagarBalanceGeneralCliente.add(jLabelotras_cuentas_por_pagarBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 2;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
		this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelotras_cuentas_por_pagarBalanceGeneralCliente.add(jButtonotras_cuentas_por_pagarBalanceGeneralClienteBusqueda, this.gridBagConstraintsBalanceGeneralCliente);
	}

	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 1;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelotras_cuentas_por_pagarBalanceGeneralCliente.add(jTextFieldotras_cuentas_por_pagarBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelotras_deudas_familiaresBalanceGeneralCliente.add(jLabelotras_deudas_familiaresBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 2;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
		this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelotras_deudas_familiaresBalanceGeneralCliente.add(jButtonotras_deudas_familiaresBalanceGeneralClienteBusqueda, this.gridBagConstraintsBalanceGeneralCliente);
	}

	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 1;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelotras_deudas_familiaresBalanceGeneralCliente.add(jTextFieldotras_deudas_familiaresBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_pasivo_corrienteBalanceGeneralCliente.add(jLabeltotal_pasivo_corrienteBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 2;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
		this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_pasivo_corrienteBalanceGeneralCliente.add(jButtontotal_pasivo_corrienteBalanceGeneralClienteBusqueda, this.gridBagConstraintsBalanceGeneralCliente);
	}

	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 1;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_pasivo_corrienteBalanceGeneralCliente.add(jTextFieldtotal_pasivo_corrienteBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldeudas_bancarias_largo_plazoBalanceGeneralCliente.add(jLabeldeudas_bancarias_largo_plazoBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 2;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
		this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneldeudas_bancarias_largo_plazoBalanceGeneralCliente.add(jButtondeudas_bancarias_largo_plazoBalanceGeneralClienteBusqueda, this.gridBagConstraintsBalanceGeneralCliente);
	}

	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 1;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldeudas_bancarias_largo_plazoBalanceGeneralCliente.add(jTextFielddeudas_bancarias_largo_plazoBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelotros_pasivos_largo_plazoBalanceGeneralCliente.add(jLabelotros_pasivos_largo_plazoBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 2;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
		this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelotros_pasivos_largo_plazoBalanceGeneralCliente.add(jButtonotros_pasivos_largo_plazoBalanceGeneralClienteBusqueda, this.gridBagConstraintsBalanceGeneralCliente);
	}

	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 1;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelotros_pasivos_largo_plazoBalanceGeneralCliente.add(jTextFieldotros_pasivos_largo_plazoBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_pasivo_no_corrienteBalanceGeneralCliente.add(jLabeltotal_pasivo_no_corrienteBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 2;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
		this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_pasivo_no_corrienteBalanceGeneralCliente.add(jButtontotal_pasivo_no_corrienteBalanceGeneralClienteBusqueda, this.gridBagConstraintsBalanceGeneralCliente);
	}

	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 1;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_pasivo_no_corrienteBalanceGeneralCliente.add(jTextFieldtotal_pasivo_no_corrienteBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_pasivoBalanceGeneralCliente.add(jLabeltotal_pasivoBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 2;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
		this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_pasivoBalanceGeneralCliente.add(jButtontotal_pasivoBalanceGeneralClienteBusqueda, this.gridBagConstraintsBalanceGeneralCliente);
	}

	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 1;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_pasivoBalanceGeneralCliente.add(jTextFieldtotal_pasivoBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpatrimonioBalanceGeneralCliente.add(jLabelpatrimonioBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 2;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
		this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelpatrimonioBalanceGeneralCliente.add(jButtonpatrimonioBalanceGeneralClienteBusqueda, this.gridBagConstraintsBalanceGeneralCliente);
	}

	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 1;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpatrimonioBalanceGeneralCliente.add(jTextFieldpatrimonioBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionBalanceGeneralCliente.add(jLabeldescripcionBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 2;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
		this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionBalanceGeneralCliente.add(jButtondescripcionBalanceGeneralClienteBusqueda, this.gridBagConstraintsBalanceGeneralCliente);
	}

	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = 1;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionBalanceGeneralCliente.add(jscrollPanedescripcionBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = iYPanelCamposBalanceGeneralCliente;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = iXPanelCamposBalanceGeneralCliente++;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBalanceGeneralCliente.add(this.jPanelidBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(iXPanelCamposBalanceGeneralCliente % 2==0) {
		iXPanelCamposBalanceGeneralCliente=0;
		iYPanelCamposBalanceGeneralCliente++;
	}
	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = iYPanelCamposBalanceGeneralCliente;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = iXPanelCamposBalanceGeneralCliente++;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBalanceGeneralCliente.add(this.jPanelid_clienteBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(iXPanelCamposBalanceGeneralCliente % 2==0) {
		iXPanelCamposBalanceGeneralCliente=0;
		iYPanelCamposBalanceGeneralCliente++;
	}
	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = iYPanelCamposBalanceGeneralCliente;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = iXPanelCamposBalanceGeneralCliente++;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBalanceGeneralCliente.add(this.jPanelcaja_bancos_disponibleBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(iXPanelCamposBalanceGeneralCliente % 2==0) {
		iXPanelCamposBalanceGeneralCliente=0;
		iYPanelCamposBalanceGeneralCliente++;
	}
	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = iYPanelCamposBalanceGeneralCliente;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = iXPanelCamposBalanceGeneralCliente++;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBalanceGeneralCliente.add(this.jPanelcuentas_por_cobrar_clientesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(iXPanelCamposBalanceGeneralCliente % 2==0) {
		iXPanelCamposBalanceGeneralCliente=0;
		iYPanelCamposBalanceGeneralCliente++;
	}
	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = iYPanelCamposBalanceGeneralCliente;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = iXPanelCamposBalanceGeneralCliente++;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBalanceGeneralCliente.add(this.jPanelinventarioBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(iXPanelCamposBalanceGeneralCliente % 2==0) {
		iXPanelCamposBalanceGeneralCliente=0;
		iYPanelCamposBalanceGeneralCliente++;
	}
	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = iYPanelCamposBalanceGeneralCliente;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = iXPanelCamposBalanceGeneralCliente++;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBalanceGeneralCliente.add(this.jPanelotros_activos_corrientesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(iXPanelCamposBalanceGeneralCliente % 2==0) {
		iXPanelCamposBalanceGeneralCliente=0;
		iYPanelCamposBalanceGeneralCliente++;
	}
	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = iYPanelCamposBalanceGeneralCliente;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = iXPanelCamposBalanceGeneralCliente++;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBalanceGeneralCliente.add(this.jPaneltotal_activos_corrientesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(iXPanelCamposBalanceGeneralCliente % 2==0) {
		iXPanelCamposBalanceGeneralCliente=0;
		iYPanelCamposBalanceGeneralCliente++;
	}
	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = iYPanelCamposBalanceGeneralCliente;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = iXPanelCamposBalanceGeneralCliente++;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBalanceGeneralCliente.add(this.jPanelbienes_inmueblesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(iXPanelCamposBalanceGeneralCliente % 2==0) {
		iXPanelCamposBalanceGeneralCliente=0;
		iYPanelCamposBalanceGeneralCliente++;
	}
	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = iYPanelCamposBalanceGeneralCliente;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = iXPanelCamposBalanceGeneralCliente++;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBalanceGeneralCliente.add(this.jPanelbienes_mueblesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(iXPanelCamposBalanceGeneralCliente % 2==0) {
		iXPanelCamposBalanceGeneralCliente=0;
		iYPanelCamposBalanceGeneralCliente++;
	}
	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = iYPanelCamposBalanceGeneralCliente;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = iXPanelCamposBalanceGeneralCliente++;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBalanceGeneralCliente.add(this.jPanelotros_activos_no_corrientesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(iXPanelCamposBalanceGeneralCliente % 2==0) {
		iXPanelCamposBalanceGeneralCliente=0;
		iYPanelCamposBalanceGeneralCliente++;
	}
	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = iYPanelCamposBalanceGeneralCliente;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = iXPanelCamposBalanceGeneralCliente++;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBalanceGeneralCliente.add(this.jPaneltotal_activos_no_corrientesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(iXPanelCamposBalanceGeneralCliente % 2==0) {
		iXPanelCamposBalanceGeneralCliente=0;
		iYPanelCamposBalanceGeneralCliente++;
	}
	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = iYPanelCamposBalanceGeneralCliente;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = iXPanelCamposBalanceGeneralCliente++;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBalanceGeneralCliente.add(this.jPanelventas_mensualesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(iXPanelCamposBalanceGeneralCliente % 2==0) {
		iXPanelCamposBalanceGeneralCliente=0;
		iYPanelCamposBalanceGeneralCliente++;
	}
	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = iYPanelCamposBalanceGeneralCliente;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = iXPanelCamposBalanceGeneralCliente++;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBalanceGeneralCliente.add(this.jPanelcosto_ventas_mensualesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(iXPanelCamposBalanceGeneralCliente % 2==0) {
		iXPanelCamposBalanceGeneralCliente=0;
		iYPanelCamposBalanceGeneralCliente++;
	}
	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = iYPanelCamposBalanceGeneralCliente;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = iXPanelCamposBalanceGeneralCliente++;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBalanceGeneralCliente.add(this.jPanelutilidad_brutaBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(iXPanelCamposBalanceGeneralCliente % 2==0) {
		iXPanelCamposBalanceGeneralCliente=0;
		iYPanelCamposBalanceGeneralCliente++;
	}
	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = iYPanelCamposBalanceGeneralCliente;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = iXPanelCamposBalanceGeneralCliente++;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBalanceGeneralCliente.add(this.jPanelgastos_operativosBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(iXPanelCamposBalanceGeneralCliente % 2==0) {
		iXPanelCamposBalanceGeneralCliente=0;
		iYPanelCamposBalanceGeneralCliente++;
	}
	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = iYPanelCamposBalanceGeneralCliente;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = iXPanelCamposBalanceGeneralCliente++;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBalanceGeneralCliente.add(this.jPanelsueldosBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(iXPanelCamposBalanceGeneralCliente % 2==0) {
		iXPanelCamposBalanceGeneralCliente=0;
		iYPanelCamposBalanceGeneralCliente++;
	}
	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = iYPanelCamposBalanceGeneralCliente;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = iXPanelCamposBalanceGeneralCliente++;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBalanceGeneralCliente.add(this.jPanelserviciosBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(iXPanelCamposBalanceGeneralCliente % 2==0) {
		iXPanelCamposBalanceGeneralCliente=0;
		iYPanelCamposBalanceGeneralCliente++;
	}
	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = iYPanelCamposBalanceGeneralCliente;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = iXPanelCamposBalanceGeneralCliente++;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBalanceGeneralCliente.add(this.jPanelarriendosBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(iXPanelCamposBalanceGeneralCliente % 2==0) {
		iXPanelCamposBalanceGeneralCliente=0;
		iYPanelCamposBalanceGeneralCliente++;
	}
	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = iYPanelCamposBalanceGeneralCliente;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = iXPanelCamposBalanceGeneralCliente++;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBalanceGeneralCliente.add(this.jPanelimpuestosBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(iXPanelCamposBalanceGeneralCliente % 2==0) {
		iXPanelCamposBalanceGeneralCliente=0;
		iYPanelCamposBalanceGeneralCliente++;
	}
	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = iYPanelCamposBalanceGeneralCliente;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = iXPanelCamposBalanceGeneralCliente++;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBalanceGeneralCliente.add(this.jPanelutilidad_operativaBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(iXPanelCamposBalanceGeneralCliente % 2==0) {
		iXPanelCamposBalanceGeneralCliente=0;
		iYPanelCamposBalanceGeneralCliente++;
	}
	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = iYPanelCamposBalanceGeneralCliente;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = iXPanelCamposBalanceGeneralCliente++;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBalanceGeneralCliente.add(this.jPanelgastos_familiaresBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(iXPanelCamposBalanceGeneralCliente % 2==0) {
		iXPanelCamposBalanceGeneralCliente=0;
		iYPanelCamposBalanceGeneralCliente++;
	}
	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = iYPanelCamposBalanceGeneralCliente;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = iXPanelCamposBalanceGeneralCliente++;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBalanceGeneralCliente.add(this.jPanelexcedente_antes_dividendosBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(iXPanelCamposBalanceGeneralCliente % 2==0) {
		iXPanelCamposBalanceGeneralCliente=0;
		iYPanelCamposBalanceGeneralCliente++;
	}
	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = iYPanelCamposBalanceGeneralCliente;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = iXPanelCamposBalanceGeneralCliente++;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBalanceGeneralCliente.add(this.jPaneldividendos_bancos_otrosBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(iXPanelCamposBalanceGeneralCliente % 2==0) {
		iXPanelCamposBalanceGeneralCliente=0;
		iYPanelCamposBalanceGeneralCliente++;
	}
	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = iYPanelCamposBalanceGeneralCliente;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = iXPanelCamposBalanceGeneralCliente++;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBalanceGeneralCliente.add(this.jPanelexedente_neto_mensualBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(iXPanelCamposBalanceGeneralCliente % 2==0) {
		iXPanelCamposBalanceGeneralCliente=0;
		iYPanelCamposBalanceGeneralCliente++;
	}
	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = iYPanelCamposBalanceGeneralCliente;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = iXPanelCamposBalanceGeneralCliente++;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBalanceGeneralCliente.add(this.jPaneldeudas_bancariasBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(iXPanelCamposBalanceGeneralCliente % 2==0) {
		iXPanelCamposBalanceGeneralCliente=0;
		iYPanelCamposBalanceGeneralCliente++;
	}
	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = iYPanelCamposBalanceGeneralCliente;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = iXPanelCamposBalanceGeneralCliente++;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBalanceGeneralCliente.add(this.jPanelcuentas_por_pagarBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(iXPanelCamposBalanceGeneralCliente % 2==0) {
		iXPanelCamposBalanceGeneralCliente=0;
		iYPanelCamposBalanceGeneralCliente++;
	}
	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = iYPanelCamposBalanceGeneralCliente;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = iXPanelCamposBalanceGeneralCliente++;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBalanceGeneralCliente.add(this.jPanelanticipos_recibosBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(iXPanelCamposBalanceGeneralCliente % 2==0) {
		iXPanelCamposBalanceGeneralCliente=0;
		iYPanelCamposBalanceGeneralCliente++;
	}
	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = iYPanelCamposBalanceGeneralCliente;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = iXPanelCamposBalanceGeneralCliente++;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBalanceGeneralCliente.add(this.jPanelotras_cuentas_por_pagarBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(iXPanelCamposBalanceGeneralCliente % 2==0) {
		iXPanelCamposBalanceGeneralCliente=0;
		iYPanelCamposBalanceGeneralCliente++;
	}
	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = iYPanelCamposBalanceGeneralCliente;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = iXPanelCamposBalanceGeneralCliente++;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBalanceGeneralCliente.add(this.jPanelotras_deudas_familiaresBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(iXPanelCamposBalanceGeneralCliente % 2==0) {
		iXPanelCamposBalanceGeneralCliente=0;
		iYPanelCamposBalanceGeneralCliente++;
	}
	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = iYPanelCamposBalanceGeneralCliente;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = iXPanelCamposBalanceGeneralCliente++;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBalanceGeneralCliente.add(this.jPaneltotal_pasivo_corrienteBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(iXPanelCamposBalanceGeneralCliente % 2==0) {
		iXPanelCamposBalanceGeneralCliente=0;
		iYPanelCamposBalanceGeneralCliente++;
	}
	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = iYPanelCamposBalanceGeneralCliente;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = iXPanelCamposBalanceGeneralCliente++;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBalanceGeneralCliente.add(this.jPaneldeudas_bancarias_largo_plazoBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(iXPanelCamposBalanceGeneralCliente % 2==0) {
		iXPanelCamposBalanceGeneralCliente=0;
		iYPanelCamposBalanceGeneralCliente++;
	}
	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = iYPanelCamposBalanceGeneralCliente;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = iXPanelCamposBalanceGeneralCliente++;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBalanceGeneralCliente.add(this.jPanelotros_pasivos_largo_plazoBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(iXPanelCamposBalanceGeneralCliente % 2==0) {
		iXPanelCamposBalanceGeneralCliente=0;
		iYPanelCamposBalanceGeneralCliente++;
	}
	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = iYPanelCamposBalanceGeneralCliente;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = iXPanelCamposBalanceGeneralCliente++;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBalanceGeneralCliente.add(this.jPaneltotal_pasivo_no_corrienteBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(iXPanelCamposBalanceGeneralCliente % 2==0) {
		iXPanelCamposBalanceGeneralCliente=0;
		iYPanelCamposBalanceGeneralCliente++;
	}
	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = iYPanelCamposBalanceGeneralCliente;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = iXPanelCamposBalanceGeneralCliente++;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBalanceGeneralCliente.add(this.jPaneltotal_pasivoBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(iXPanelCamposBalanceGeneralCliente % 2==0) {
		iXPanelCamposBalanceGeneralCliente=0;
		iYPanelCamposBalanceGeneralCliente++;
	}
	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = iYPanelCamposBalanceGeneralCliente;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = iXPanelCamposBalanceGeneralCliente++;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBalanceGeneralCliente.add(this.jPanelpatrimonioBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(iXPanelCamposBalanceGeneralCliente % 2==0) {
		iXPanelCamposBalanceGeneralCliente=0;
		iYPanelCamposBalanceGeneralCliente++;
	}
	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = iYPanelCamposBalanceGeneralCliente;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = iXPanelCamposBalanceGeneralCliente++;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBalanceGeneralCliente.add(this.jPaneldescripcionBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(iXPanelCamposBalanceGeneralCliente % 2==0) {
		iXPanelCamposBalanceGeneralCliente=0;
		iYPanelCamposBalanceGeneralCliente++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBalanceGeneralCliente.gridy = iYPanelCamposOcultosBalanceGeneralCliente;
	this.gridBagConstraintsBalanceGeneralCliente.gridx = iXPanelCamposOcultosBalanceGeneralCliente++;
	this.gridBagConstraintsBalanceGeneralCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBalanceGeneralCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosBalanceGeneralCliente.add(this.jPanelid_empresaBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);



	if(iXPanelCamposOcultosBalanceGeneralCliente % 2==0) {
		iXPanelCamposOcultosBalanceGeneralCliente=0;
		iYPanelCamposOcultosBalanceGeneralCliente++;
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
			
		GridBagLayout gridaBagLayoutAccionesBalanceGeneralCliente= new GridBagLayout();
		this.jPanelAccionesBalanceGeneralCliente.setLayout(gridaBagLayoutAccionesBalanceGeneralCliente);
		
		GridBagLayout gridaBagLayoutAccionesFormularioBalanceGeneralCliente= new GridBagLayout();
		this.jPanelAccionesFormularioBalanceGeneralCliente.setLayout(gridaBagLayoutAccionesFormularioBalanceGeneralCliente);
		
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsBalanceGeneralCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioBalanceGeneralCliente.add(this.jComboBoxTiposAccionesFormularioBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsBalanceGeneralCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioBalanceGeneralCliente.add(this.jCheckBoxPostAccionNuevoBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.balancegeneralclienteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsBalanceGeneralCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioBalanceGeneralCliente.add(this.jCheckBoxPostAccionSinCerrarBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.balancegeneralclienteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.balancegeneralclienteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsBalanceGeneralCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioBalanceGeneralCliente.add(this.jCheckBoxPostAccionSinMensajeBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = iPosXAccion++;
			
		this.jPanelAccionesBalanceGeneralCliente.add(this.jButtonModificarBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);							

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx =iPosXAccion++;
			
		this.jPanelAccionesBalanceGeneralCliente.add(this.jButtonEliminarBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
		
			
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;		
		this.gridBagConstraintsBalanceGeneralCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesBalanceGeneralCliente.add(this.jButtonActualizarBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;		
		this.gridBagConstraintsBalanceGeneralCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesBalanceGeneralCliente.add(this.jButtonGuardarCambiosBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);	
		
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;		
		this.gridBagConstraintsBalanceGeneralCliente.gridx =iPosXAccion++;
		
		this.jPanelAccionesBalanceGeneralCliente.add(this.jButtonCancelarBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutBalanceGeneralCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutBalanceGeneralCliente);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.balancegeneralclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();						
			this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;		
			//this.gridBagConstraintsBalanceGeneralCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsBalanceGeneralCliente.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsBalanceGeneralCliente.gridx =0;
		this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsBalanceGeneralCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(BalanceGeneralClienteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleBalanceGeneralCliente = new BalanceGeneralClienteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Balance General Cliente DATOS");
			
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
			
	        //this.setTitle("[FOR] - Balance General Cliente DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Balance General Cliente Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			BalanceGeneralClienteModel balancegeneralclienteModel=new BalanceGeneralClienteModel(this);
			
			//SI USARA CLASE INTERNA
			//BalanceGeneralClienteModel.BalanceGeneralClienteFocusTraversalPolicy balancegeneralclienteFocusTraversalPolicy = balancegeneralclienteModel.new BalanceGeneralClienteFocusTraversalPolicy(this);
			
			//balancegeneralclienteFocusTraversalPolicy.setbalancegeneralclienteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(balancegeneralclienteModel);
			
			
			this.jContentPaneDetalleBalanceGeneralCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleBalanceGeneralCliente = new GridBagLayout();	
			this.jContentPaneDetalleBalanceGeneralCliente.setLayout(gridaBagLayoutDetalleBalanceGeneralCliente);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosBalanceGeneralCliente = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
				this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
					
				
				this.jContentPaneDetalleBalanceGeneralCliente.add(jTtoolBarDetalleBalanceGeneralCliente, gridBagConstraintsBalanceGeneralCliente);								
				
}
			
			this.jScrollPanelDatosEdicionBalanceGeneralCliente=   new JScrollPane(jContentPaneDetalleBalanceGeneralCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionBalanceGeneralCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBalanceGeneralCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBalanceGeneralCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralBalanceGeneralCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralBalanceGeneralCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBalanceGeneralCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBalanceGeneralCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			
			
	        this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	        
			this.jContentPaneDetalleBalanceGeneralCliente.add(jPanelCamposBalanceGeneralCliente, gridBagConstraintsBalanceGeneralCliente);
			
			
			
			
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
						&& balancegeneralclienteSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.balancegeneralclienteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsBalanceGeneralCliente= new GridBagConstraints();
						this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridyRelaciones++;
						this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
						this.jContentPaneDetalleBalanceGeneralCliente.add(this.jTabbedPaneRelacionesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesBalanceGeneralCliente.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosBalanceGeneralCliente.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
					this.gridBagConstraintsBalanceGeneralCliente.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
					
				
					this.jContentPaneDetalleBalanceGeneralCliente.add(jPanelCamposOcultosBalanceGeneralCliente, gridBagConstraintsBalanceGeneralCliente);
				
					this.jPanelCamposOcultosBalanceGeneralCliente.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	        this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleBalanceGeneralCliente.add(this.jPanelAccionesFormularioBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);							
			
			
			
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
	        this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
	        
			
			this.jContentPaneDetalleBalanceGeneralCliente.add(this.jPanelAccionesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionBalanceGeneralCliente);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionBalanceGeneralCliente=   new JScrollPane(this.jPanelCamposBalanceGeneralCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionBalanceGeneralCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBalanceGeneralCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBalanceGeneralCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
			this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsBalanceGeneralCliente.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);			
			
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
			
			
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
		
			
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsBalanceGeneralCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralBalanceGeneralCliente;//jContentPane;
		
		return jScrollPanelDatosEdicionBalanceGeneralCliente;
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
