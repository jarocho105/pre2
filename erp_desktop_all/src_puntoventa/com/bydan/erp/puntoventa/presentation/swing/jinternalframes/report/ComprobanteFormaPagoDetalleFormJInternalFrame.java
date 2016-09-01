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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.puntoventa.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.report.*;
import com.bydan.erp.puntoventa.util.report.ComprobanteFormaPagoConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.report.*;
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
public class ComprobanteFormaPagoDetalleFormJInternalFrame extends ComprobanteFormaPagoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleComprobanteFormaPago;
	
	protected JMenuBar jmenuBarDetalleComprobanteFormaPago;
	
	protected JMenu jmenuDetalleComprobanteFormaPago;
	protected JMenu jmenuDetalleArchivoComprobanteFormaPago;
	protected JMenu jmenuDetalleAccionesComprobanteFormaPago;
	protected JMenu jmenuDetalleDatosComprobanteFormaPago;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleComprobanteFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutComprobanteFormaPago;	
	protected GridBagConstraints gridBagConstraintsComprobanteFormaPago;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ComprobanteFormaPagoBeanSwingJInternalFrameAdditional jInternalFrameDetalleComprobanteFormaPago;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_caja="";
	
	public ComprobanteFormaPagoSessionBean comprobanteformapagoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public CajaSessionBean cajaSessionBean;	
	
	public ComprobanteFormaPagoLogic comprobanteformapagoLogic;
	
	public JScrollPane jScrollPanelDatosComprobanteFormaPago;
	public JScrollPane jScrollPanelDatosEdicionComprobanteFormaPago;
	public JScrollPane jScrollPanelDatosGeneralComprobanteFormaPago;
	
	protected JPanel jPanelCamposComprobanteFormaPago;    
	protected JPanel jPanelCamposOcultosComprobanteFormaPago;    	
	protected JPanel jPanelAccionesComprobanteFormaPago;
	protected JPanel jPanelAccionesFormularioComprobanteFormaPago;
    
	
	
	protected Integer iXPanelCamposComprobanteFormaPago=0;
	protected Integer iYPanelCamposComprobanteFormaPago=0;
	
	protected Integer iXPanelCamposOcultosComprobanteFormaPago=0;
	protected Integer iYPanelCamposOcultosComprobanteFormaPago=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoComprobanteFormaPago;
	public JButton jButtonModificarComprobanteFormaPago;
	public JButton jButtonActualizarComprobanteFormaPago;
    public JButton jButtonEliminarComprobanteFormaPago;
	public JButton jButtonCancelarComprobanteFormaPago;
    public JButton jButtonGuardarCambiosComprobanteFormaPago;
	public JButton jButtonGuardarCambiosTablaComprobanteFormaPago;
	protected JButton jButtonCerrarComprobanteFormaPago;
	
	
	protected JButton jButtonProcesarInformacionComprobanteFormaPago;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoComprobanteFormaPago;
	protected JCheckBox jCheckBoxPostAccionSinCerrarComprobanteFormaPago;
	protected JCheckBox jCheckBoxPostAccionSinMensajeComprobanteFormaPago;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarComprobanteFormaPago;
	protected JButton jButtonModificarToolBarComprobanteFormaPago;
	protected JButton jButtonActualizarToolBarComprobanteFormaPago;
    protected JButton jButtonEliminarToolBarComprobanteFormaPago;
	protected JButton jButtonCancelarToolBarComprobanteFormaPago;
    protected JButton jButtonGuardarCambiosToolBarComprobanteFormaPago;
	protected JButton jButtonGuardarCambiosTablaToolBarComprobanteFormaPago;
	protected JButton jButtonMostrarOcultarTablaToolBarComprobanteFormaPago;
	protected JButton jButtonCerrarToolBarComprobanteFormaPago;
	
	protected JButton jButtonProcesarInformacionToolBarComprobanteFormaPago;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoComprobanteFormaPago;
	protected JMenuItem jMenuItemModificarComprobanteFormaPago;
	protected JMenuItem jMenuItemActualizarComprobanteFormaPago;
    protected JMenuItem jMenuItemEliminarComprobanteFormaPago;
	protected JMenuItem jMenuItemCancelarComprobanteFormaPago;
    protected JMenuItem jMenuItemGuardarCambiosComprobanteFormaPago;
	protected JMenuItem jMenuItemGuardarCambiosTablaComprobanteFormaPago;
	protected JMenuItem jMenuItemCerrarComprobanteFormaPago;
	protected JMenuItem jMenuItemDetalleCerrarComprobanteFormaPago;
	protected JMenuItem jMenuItemDetalleMostarOcultarComprobanteFormaPago;
	
	protected JMenuItem jMenuItemProcesarInformacionComprobanteFormaPago;
	protected JMenuItem jMenuItemNuevoGuardarCambiosComprobanteFormaPago;
	protected JMenuItem jMenuItemMostrarOcultarComprobanteFormaPago;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesComprobanteFormaPago;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesComprobanteFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesComprobanteFormaPago;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioComprobanteFormaPago;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidComprobanteFormaPago;
	public JLabel jLabelIdComprobanteFormaPago;
	public JLabel jLabelidComprobanteFormaPago;
	public JButton jButtonidComprobanteFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_inicioComprobanteFormaPago;
	public JLabel jLabelfecha_inicioComprobanteFormaPago;
	//public JFormattedTextField jDateChooserfecha_inicioComprobanteFormaPago;

	public JDateChooser jDateChooserfecha_inicioComprobanteFormaPago;
	public JButton jButtonfecha_inicioComprobanteFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finComprobanteFormaPago;
	public JLabel jLabelfecha_finComprobanteFormaPago;
	//public JFormattedTextField jDateChooserfecha_finComprobanteFormaPago;

	public JDateChooser jDateChooserfecha_finComprobanteFormaPago;
	public JButton jButtonfecha_finComprobanteFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelnombre_cajaComprobanteFormaPago;
	public JLabel jLabelnombre_cajaComprobanteFormaPago;
	public JTextArea jTextAreanombre_cajaComprobanteFormaPago;
	public JScrollPane jscrollPanenombre_cajaComprobanteFormaPago;
	public JButton jButtonnombre_cajaComprobanteFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelsecuencialComprobanteFormaPago;
	public JLabel jLabelsecuencialComprobanteFormaPago;
	public JTextField jTextFieldsecuencialComprobanteFormaPago;
	public JButton jButtonsecuencialComprobanteFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelfechaComprobanteFormaPago;
	public JLabel jLabelfechaComprobanteFormaPago;
	//public JFormattedTextField jDateChooserfechaComprobanteFormaPago;

	public JDateChooser jDateChooserfechaComprobanteFormaPago;
	public JButton jButtonfechaComprobanteFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_clienteComprobanteFormaPago;
	public JLabel jLabelcodigo_clienteComprobanteFormaPago;
	public JTextField jTextFieldcodigo_clienteComprobanteFormaPago;
	public JButton jButtoncodigo_clienteComprobanteFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelnombre_clienteComprobanteFormaPago;
	public JLabel jLabelnombre_clienteComprobanteFormaPago;
	public JTextArea jTextAreanombre_clienteComprobanteFormaPago;
	public JScrollPane jscrollPanenombre_clienteComprobanteFormaPago;
	public JButton jButtonnombre_clienteComprobanteFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelsubtotalComprobanteFormaPago;
	public JLabel jLabelsubtotalComprobanteFormaPago;
	public JTextField jTextFieldsubtotalComprobanteFormaPago;
	public JButton jButtonsubtotalComprobanteFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelivaComprobanteFormaPago;
	public JLabel jLabelivaComprobanteFormaPago;
	public JTextField jTextFieldivaComprobanteFormaPago;
	public JButton jButtonivaComprobanteFormaPagoBusqueda= new JButtonMe();

	public JPanel jPaneldescuentoComprobanteFormaPago;
	public JLabel jLabeldescuentoComprobanteFormaPago;
	public JTextField jTextFielddescuentoComprobanteFormaPago;
	public JButton jButtondescuentoComprobanteFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelfinanciamientoComprobanteFormaPago;
	public JLabel jLabelfinanciamientoComprobanteFormaPago;
	public JTextField jTextFieldfinanciamientoComprobanteFormaPago;
	public JButton jButtonfinanciamientoComprobanteFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelfleteComprobanteFormaPago;
	public JLabel jLabelfleteComprobanteFormaPago;
	public JTextField jTextFieldfleteComprobanteFormaPago;
	public JButton jButtonfleteComprobanteFormaPagoBusqueda= new JButtonMe();

	public JPanel jPaneliceComprobanteFormaPago;
	public JLabel jLabeliceComprobanteFormaPago;
	public JTextField jTextFieldiceComprobanteFormaPago;
	public JButton jButtoniceComprobanteFormaPagoBusqueda= new JButtonMe();

	public JPanel jPaneltotalComprobanteFormaPago;
	public JLabel jLabeltotalComprobanteFormaPago;
	public JTextField jTextFieldtotalComprobanteFormaPago;
	public JButton jButtontotalComprobanteFormaPagoBusqueda= new JButtonMe();

	public JPanel jPaneltipoComprobanteFormaPago;
	public JLabel jLabeltipoComprobanteFormaPago;
	public JTextField jTextFieldtipoComprobanteFormaPago;
	public JButton jButtontipoComprobanteFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelvalorComprobanteFormaPago;
	public JLabel jLabelvalorComprobanteFormaPago;
	public JTextField jTextFieldvalorComprobanteFormaPago;
	public JButton jButtonvalorComprobanteFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_forma_pagoComprobanteFormaPago;
	public JLabel jLabelfecha_forma_pagoComprobanteFormaPago;
	//public JFormattedTextField jDateChooserfecha_forma_pagoComprobanteFormaPago;

	public JDateChooser jDateChooserfecha_forma_pagoComprobanteFormaPago;
	public JButton jButtonfecha_forma_pagoComprobanteFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_cuentaComprobanteFormaPago;
	public JLabel jLabelnumero_cuentaComprobanteFormaPago;
	public JTextField jTextFieldnumero_cuentaComprobanteFormaPago;
	public JButton jButtonnumero_cuentaComprobanteFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_chequeComprobanteFormaPago;
	public JLabel jLabelnumero_chequeComprobanteFormaPago;
	public JTextField jTextFieldnumero_chequeComprobanteFormaPago;
	public JButton jButtonnumero_chequeComprobanteFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelgiradorComprobanteFormaPago;
	public JLabel jLabelgiradorComprobanteFormaPago;
	public JTextArea jTextAreagiradorComprobanteFormaPago;
	public JScrollPane jscrollPanegiradorComprobanteFormaPago;
	public JButton jButtongiradorComprobanteFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_dias_plazoComprobanteFormaPago;
	public JLabel jLabelnumero_dias_plazoComprobanteFormaPago;
	public JTextField jTextFieldnumero_dias_plazoComprobanteFormaPago;
	public JButton jButtonnumero_dias_plazoComprobanteFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_tarjetaComprobanteFormaPago;
	public JLabel jLabelnumero_tarjetaComprobanteFormaPago;
	public JTextField jTextFieldnumero_tarjetaComprobanteFormaPago;
	public JButton jButtonnumero_tarjetaComprobanteFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelautorizacionComprobanteFormaPago;
	public JLabel jLabelautorizacionComprobanteFormaPago;
	public JTextArea jTextAreaautorizacionComprobanteFormaPago;
	public JScrollPane jscrollPaneautorizacionComprobanteFormaPago;
	public JButton jButtonautorizacionComprobanteFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelloteComprobanteFormaPago;
	public JLabel jLabelloteComprobanteFormaPago;
	public JTextField jTextFieldloteComprobanteFormaPago;
	public JButton jButtonloteComprobanteFormaPagoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaComprobanteFormaPago;
	public JLabel jLabelid_empresaComprobanteFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaComprobanteFormaPago;
	public JButton jButtonid_empresaComprobanteFormaPago= new JButtonMe();
	public JButton jButtonid_empresaComprobanteFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_empresaComprobanteFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalComprobanteFormaPago;
	public JLabel jLabelid_sucursalComprobanteFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalComprobanteFormaPago;
	public JButton jButtonid_sucursalComprobanteFormaPago= new JButtonMe();
	public JButton jButtonid_sucursalComprobanteFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalComprobanteFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteComprobanteFormaPago;
	public JLabel jLabelid_clienteComprobanteFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteComprobanteFormaPago;
	public JButton jButtonid_clienteComprobanteFormaPago= new JButtonMe();
	public JButton jButtonid_clienteComprobanteFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_clienteComprobanteFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_cajaComprobanteFormaPago;
	public JLabel jLabelid_cajaComprobanteFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cajaComprobanteFormaPago;
	public JButton jButtonid_cajaComprobanteFormaPago= new JButtonMe();
	public JButton jButtonid_cajaComprobanteFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_cajaComprobanteFormaPagoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesComprobanteFormaPago;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=1050;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightFormulario=799;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ComprobanteFormaPagoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposComprobanteFormaPago=new JPanel();
				this.jPanelAccionesFormularioComprobanteFormaPago=new JPanel();
				this.jmenuBarDetalleComprobanteFormaPago=new JMenuBar();
				this.jTtoolBarDetalleComprobanteFormaPago=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComprobanteFormaPagoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ComprobanteFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ComprobanteFormaPagoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ComprobanteFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComprobanteFormaPagoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComprobanteFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComprobanteFormaPagoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComprobanteFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComprobanteFormaPagoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ComprobanteFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarComprobanteFormaPago() {
		return this.jButtonActualizarToolBarComprobanteFormaPago;
	}
	
	public JButton getjButtonEliminarToolBarComprobanteFormaPago() {
		return this.jButtonEliminarToolBarComprobanteFormaPago;
	}
	
	public JButton getjButtonCancelarToolBarComprobanteFormaPago() {
		return this.jButtonCancelarToolBarComprobanteFormaPago;
	}		
	
	public JButton getjButtonProcesarInformacionComprobanteFormaPago() {
		return this.jButtonProcesarInformacionComprobanteFormaPago;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionComprobanteFormaPago)	{
		this.jButtonProcesarInformacionComprobanteFormaPago = jButtonProcesarInformacionComprobanteFormaPago;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesComprobanteFormaPago() {
		return this.jComboBoxTiposAccionesComprobanteFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesComprobanteFormaPago(
			JComboBox jComboBoxTiposRelacionesComprobanteFormaPago) {
		this.jComboBoxTiposRelacionesComprobanteFormaPago = jComboBoxTiposRelacionesComprobanteFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesComprobanteFormaPago(
			JComboBox jComboBoxTiposAccionesComprobanteFormaPago) {
		this.jComboBoxTiposAccionesComprobanteFormaPago = jComboBoxTiposAccionesComprobanteFormaPago;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioComprobanteFormaPago() {
		return this.jComboBoxTiposAccionesFormularioComprobanteFormaPago;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioComprobanteFormaPago(
			JComboBox jComboBoxTiposAccionesFormularioComprobanteFormaPago) {
		this.jComboBoxTiposAccionesFormularioComprobanteFormaPago = jComboBoxTiposAccionesFormularioComprobanteFormaPago;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.comprobanteformapagoSessionBean=new ComprobanteFormaPagoSessionBean();
		
		this.comprobanteformapagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comprobanteformapagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.comprobanteformapagoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ComprobanteFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ComprobanteFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ComprobanteFormaPagoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Comprobante Forma Pago MANTENIMIENTO"));
		
		
		if(iWidth > 2650) {
			iWidth=2650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()) {
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
	
		ComprobanteFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleComprobanteFormaPago= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarComprobanteFormaPago=new JButtonMe();
				this.jButtonModificarToolBarComprobanteFormaPago=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarComprobanteFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarComprobanteFormaPago,this.jTtoolBarDetalleComprobanteFormaPago,
							"actualizar","actualizar","Actualizar"+" "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarComprobanteFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarComprobanteFormaPago,this.jTtoolBarDetalleComprobanteFormaPago,
							"eliminar","eliminar","Eliminar"+" "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarComprobanteFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarComprobanteFormaPago,this.jTtoolBarDetalleComprobanteFormaPago,
							"cancelar","cancelar","Cancelar"+" "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarComprobanteFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarComprobanteFormaPago,this.jTtoolBarDetalleComprobanteFormaPago,
							"guardarcambios","guardarcambios","Guardar"+" "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleComprobanteFormaPago=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleComprobanteFormaPago=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoComprobanteFormaPago=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesComprobanteFormaPago=new JMenuMe("Acciones");
		this.jmenuDetalleDatosComprobanteFormaPago=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoComprobanteFormaPago= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoComprobanteFormaPago.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoComprobanteFormaPago,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarComprobanteFormaPago= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarComprobanteFormaPago.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarComprobanteFormaPago,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarComprobanteFormaPago= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarComprobanteFormaPago.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarComprobanteFormaPago,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarComprobanteFormaPago= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarComprobanteFormaPago.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarComprobanteFormaPago,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarComprobanteFormaPago= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarComprobanteFormaPago.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarComprobanteFormaPago,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosComprobanteFormaPago= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosComprobanteFormaPago.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosComprobanteFormaPago,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarComprobanteFormaPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarComprobanteFormaPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarComprobanteFormaPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarComprobanteFormaPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarComprobanteFormaPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarComprobanteFormaPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarComprobanteFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarComprobanteFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarComprobanteFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarComprobanteFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarComprobanteFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarComprobanteFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoComprobanteFormaPago.add(this.jMenuItemDetalleCerrarComprobanteFormaPago);
		
		this.jmenuDetalleAccionesComprobanteFormaPago.add(this.jMenuItemActualizarComprobanteFormaPago);
		this.jmenuDetalleAccionesComprobanteFormaPago.add(this.jMenuItemEliminarComprobanteFormaPago);
		this.jmenuDetalleAccionesComprobanteFormaPago.add(this.jMenuItemCancelarComprobanteFormaPago);		
		
		//this.jmenuDetalleDatosComprobanteFormaPago.add(this.jMenuItemDetalleAbrirOrderByComprobanteFormaPago);				
		this.jmenuDetalleDatosComprobanteFormaPago.add(this.jMenuItemDetalleMostarOcultarComprobanteFormaPago);				
				
		//this.jmenuDetalleAccionesComprobanteFormaPago.add(this.jMenuItemGuardarCambiosComprobanteFormaPago);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleComprobanteFormaPago.add(this.jmenuDetalleArchivoComprobanteFormaPago);		
		this.jmenuBarDetalleComprobanteFormaPago.add(this.jmenuDetalleAccionesComprobanteFormaPago);		
		this.jmenuBarDetalleComprobanteFormaPago.add(this.jmenuDetalleDatosComprobanteFormaPago);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleComprobanteFormaPago);				
	}
	
	
	public void inicializarElementosCamposComprobanteFormaPago() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdComprobanteFormaPago = new JLabelMe();
		jLabelIdComprobanteFormaPago.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidComprobanteFormaPago = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidComprobanteFormaPago.setToolTipText(ComprobanteFormaPagoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutComprobanteFormaPago= new GridBagLayout();

		this.jPanelidComprobanteFormaPago.setLayout(this.gridaBagLayoutComprobanteFormaPago);

		jLabelidComprobanteFormaPago = new JLabel();
		jLabelidComprobanteFormaPago.setText("Id");

		jLabelidComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_inicioComprobanteFormaPago = new JLabelMe();
		this.jLabelfecha_inicioComprobanteFormaPago.setText(""+ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAINICIO+" : *");
		this.jLabelfecha_inicioComprobanteFormaPago.setToolTipText("Fecha Inicio");
		this.jLabelfecha_inicioComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_inicioComprobanteFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_inicioComprobanteFormaPago.setToolTipText(ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAINICIO);
		this.gridaBagLayoutComprobanteFormaPago = new GridBagLayout();
		this.jPanelfecha_inicioComprobanteFormaPago.setLayout(this.gridaBagLayoutComprobanteFormaPago);


		//jFormattedTextFieldfecha_inicioComprobanteFormaPago= new JFormattedTextFieldMe();

		jDateChooserfecha_inicioComprobanteFormaPago= new JDateChooser();
		jDateChooserfecha_inicioComprobanteFormaPago.setEnabled(false);
		jDateChooserfecha_inicioComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_inicioComprobanteFormaPago.setDate(new Date());
		jDateChooserfecha_inicioComprobanteFormaPago.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_inicioComprobanteFormaPago.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_inicioComprobanteFormaPagoBusqueda= new JButtonMe();
		this.jButtonfecha_inicioComprobanteFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioComprobanteFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioComprobanteFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_inicioComprobanteFormaPagoBusqueda.setText("U");
		this.jButtonfecha_inicioComprobanteFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_inicioComprobanteFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_inicioComprobanteFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_inicioComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_inicioComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_inicioComprobanteFormaPagoBusqueda"));

		if(this.comprobanteformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_inicioComprobanteFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finComprobanteFormaPago = new JLabelMe();
		this.jLabelfecha_finComprobanteFormaPago.setText(""+ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAFIN+" : *");
		this.jLabelfecha_finComprobanteFormaPago.setToolTipText("Fecha Fin");
		this.jLabelfecha_finComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finComprobanteFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finComprobanteFormaPago.setToolTipText(ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAFIN);
		this.gridaBagLayoutComprobanteFormaPago = new GridBagLayout();
		this.jPanelfecha_finComprobanteFormaPago.setLayout(this.gridaBagLayoutComprobanteFormaPago);


		//jFormattedTextFieldfecha_finComprobanteFormaPago= new JFormattedTextFieldMe();

		jDateChooserfecha_finComprobanteFormaPago= new JDateChooser();
		jDateChooserfecha_finComprobanteFormaPago.setEnabled(false);
		jDateChooserfecha_finComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finComprobanteFormaPago.setDate(new Date());
		jDateChooserfecha_finComprobanteFormaPago.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finComprobanteFormaPago.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finComprobanteFormaPagoBusqueda= new JButtonMe();
		this.jButtonfecha_finComprobanteFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finComprobanteFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finComprobanteFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finComprobanteFormaPagoBusqueda.setText("U");
		this.jButtonfecha_finComprobanteFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finComprobanteFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finComprobanteFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finComprobanteFormaPagoBusqueda"));

		if(this.comprobanteformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finComprobanteFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelnombre_cajaComprobanteFormaPago = new JLabelMe();
		this.jLabelnombre_cajaComprobanteFormaPago.setText(""+ComprobanteFormaPagoConstantesFunciones.LABEL_NOMBRECAJA+" : *");
		this.jLabelnombre_cajaComprobanteFormaPago.setToolTipText("Nombre Caja");
		this.jLabelnombre_cajaComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_cajaComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_cajaComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_cajaComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_cajaComprobanteFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_cajaComprobanteFormaPago.setToolTipText(ComprobanteFormaPagoConstantesFunciones.LABEL_NOMBRECAJA);
		this.gridaBagLayoutComprobanteFormaPago = new GridBagLayout();
		this.jPanelnombre_cajaComprobanteFormaPago.setLayout(this.gridaBagLayoutComprobanteFormaPago);


		jTextAreanombre_cajaComprobanteFormaPago= new JTextAreaMe();
		jTextAreanombre_cajaComprobanteFormaPago.setEnabled(false);
		jTextAreanombre_cajaComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cajaComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cajaComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cajaComprobanteFormaPago.setLineWrap(true);
		jTextAreanombre_cajaComprobanteFormaPago.setWrapStyleWord(true);
		jTextAreanombre_cajaComprobanteFormaPago.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_cajaComprobanteFormaPago.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_cajaComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_cajaComprobanteFormaPago = new JScrollPane(jTextAreanombre_cajaComprobanteFormaPago);
		jscrollPanenombre_cajaComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_cajaComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_cajaComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_cajaComprobanteFormaPagoBusqueda= new JButtonMe();
		this.jButtonnombre_cajaComprobanteFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cajaComprobanteFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cajaComprobanteFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_cajaComprobanteFormaPagoBusqueda.setText("U");
		this.jButtonnombre_cajaComprobanteFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_cajaComprobanteFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_cajaComprobanteFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_cajaComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_cajaComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_cajaComprobanteFormaPagoBusqueda"));

		if(this.comprobanteformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_cajaComprobanteFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelsecuencialComprobanteFormaPago = new JLabelMe();
		this.jLabelsecuencialComprobanteFormaPago.setText(""+ComprobanteFormaPagoConstantesFunciones.LABEL_SECUENCIAL+" : *");
		this.jLabelsecuencialComprobanteFormaPago.setToolTipText("Secuencial");
		this.jLabelsecuencialComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencialComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencialComprobanteFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencialComprobanteFormaPago.setToolTipText(ComprobanteFormaPagoConstantesFunciones.LABEL_SECUENCIAL);
		this.gridaBagLayoutComprobanteFormaPago = new GridBagLayout();
		this.jPanelsecuencialComprobanteFormaPago.setLayout(this.gridaBagLayoutComprobanteFormaPago);


		jTextFieldsecuencialComprobanteFormaPago= new JTextFieldMe();

		jTextFieldsecuencialComprobanteFormaPago.setEnabled(false);
		jTextFieldsecuencialComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencialComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencialComprobanteFormaPagoBusqueda= new JButtonMe();
		this.jButtonsecuencialComprobanteFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialComprobanteFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialComprobanteFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencialComprobanteFormaPagoBusqueda.setText("U");
		this.jButtonsecuencialComprobanteFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencialComprobanteFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencialComprobanteFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencialComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencialComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencialComprobanteFormaPagoBusqueda"));

		if(this.comprobanteformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencialComprobanteFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelfechaComprobanteFormaPago = new JLabelMe();
		this.jLabelfechaComprobanteFormaPago.setText(""+ComprobanteFormaPagoConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaComprobanteFormaPago.setToolTipText("Fecha");
		this.jLabelfechaComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaComprobanteFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaComprobanteFormaPago.setToolTipText(ComprobanteFormaPagoConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutComprobanteFormaPago = new GridBagLayout();
		this.jPanelfechaComprobanteFormaPago.setLayout(this.gridaBagLayoutComprobanteFormaPago);


		//jFormattedTextFieldfechaComprobanteFormaPago= new JFormattedTextFieldMe();

		jDateChooserfechaComprobanteFormaPago= new JDateChooser();
		jDateChooserfechaComprobanteFormaPago.setEnabled(false);
		jDateChooserfechaComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaComprobanteFormaPago.setDate(new Date());
		jDateChooserfechaComprobanteFormaPago.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaComprobanteFormaPago.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaComprobanteFormaPagoBusqueda= new JButtonMe();
		this.jButtonfechaComprobanteFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaComprobanteFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaComprobanteFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaComprobanteFormaPagoBusqueda.setText("U");
		this.jButtonfechaComprobanteFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaComprobanteFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaComprobanteFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaComprobanteFormaPagoBusqueda"));

		if(this.comprobanteformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaComprobanteFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_clienteComprobanteFormaPago = new JLabelMe();
		this.jLabelcodigo_clienteComprobanteFormaPago.setText(""+ComprobanteFormaPagoConstantesFunciones.LABEL_CODIGOCLIENTE+" : *");
		this.jLabelcodigo_clienteComprobanteFormaPago.setToolTipText("Codigo Cliente");
		this.jLabelcodigo_clienteComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_clienteComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_clienteComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_clienteComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_clienteComprobanteFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_clienteComprobanteFormaPago.setToolTipText(ComprobanteFormaPagoConstantesFunciones.LABEL_CODIGOCLIENTE);
		this.gridaBagLayoutComprobanteFormaPago = new GridBagLayout();
		this.jPanelcodigo_clienteComprobanteFormaPago.setLayout(this.gridaBagLayoutComprobanteFormaPago);


		jTextFieldcodigo_clienteComprobanteFormaPago= new JTextFieldMe();

		jTextFieldcodigo_clienteComprobanteFormaPago.setEnabled(false);
		jTextFieldcodigo_clienteComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_clienteComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_clienteComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_clienteComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_clienteComprobanteFormaPagoBusqueda= new JButtonMe();
		this.jButtoncodigo_clienteComprobanteFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_clienteComprobanteFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_clienteComprobanteFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_clienteComprobanteFormaPagoBusqueda.setText("U");
		this.jButtoncodigo_clienteComprobanteFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_clienteComprobanteFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_clienteComprobanteFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_clienteComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_clienteComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_clienteComprobanteFormaPagoBusqueda"));

		if(this.comprobanteformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_clienteComprobanteFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelnombre_clienteComprobanteFormaPago = new JLabelMe();
		this.jLabelnombre_clienteComprobanteFormaPago.setText(""+ComprobanteFormaPagoConstantesFunciones.LABEL_NOMBRECLIENTE+" : *");
		this.jLabelnombre_clienteComprobanteFormaPago.setToolTipText("Nombre Cliente");
		this.jLabelnombre_clienteComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clienteComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clienteComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_clienteComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_clienteComprobanteFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_clienteComprobanteFormaPago.setToolTipText(ComprobanteFormaPagoConstantesFunciones.LABEL_NOMBRECLIENTE);
		this.gridaBagLayoutComprobanteFormaPago = new GridBagLayout();
		this.jPanelnombre_clienteComprobanteFormaPago.setLayout(this.gridaBagLayoutComprobanteFormaPago);


		jTextAreanombre_clienteComprobanteFormaPago= new JTextAreaMe();
		jTextAreanombre_clienteComprobanteFormaPago.setEnabled(false);
		jTextAreanombre_clienteComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteComprobanteFormaPago.setLineWrap(true);
		jTextAreanombre_clienteComprobanteFormaPago.setWrapStyleWord(true);
		jTextAreanombre_clienteComprobanteFormaPago.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_clienteComprobanteFormaPago.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_clienteComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_clienteComprobanteFormaPago = new JScrollPane(jTextAreanombre_clienteComprobanteFormaPago);
		jscrollPanenombre_clienteComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_clienteComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_clienteComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_clienteComprobanteFormaPagoBusqueda= new JButtonMe();
		this.jButtonnombre_clienteComprobanteFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clienteComprobanteFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clienteComprobanteFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_clienteComprobanteFormaPagoBusqueda.setText("U");
		this.jButtonnombre_clienteComprobanteFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_clienteComprobanteFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_clienteComprobanteFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_clienteComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_clienteComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_clienteComprobanteFormaPagoBusqueda"));

		if(this.comprobanteformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_clienteComprobanteFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelsubtotalComprobanteFormaPago = new JLabelMe();
		this.jLabelsubtotalComprobanteFormaPago.setText(""+ComprobanteFormaPagoConstantesFunciones.LABEL_SUBTOTAL+" :");
		this.jLabelsubtotalComprobanteFormaPago.setToolTipText("Subtotal");
		this.jLabelsubtotalComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsubtotalComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsubtotalComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsubtotalComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsubtotalComprobanteFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsubtotalComprobanteFormaPago.setToolTipText(ComprobanteFormaPagoConstantesFunciones.LABEL_SUBTOTAL);
		this.gridaBagLayoutComprobanteFormaPago = new GridBagLayout();
		this.jPanelsubtotalComprobanteFormaPago.setLayout(this.gridaBagLayoutComprobanteFormaPago);


		jTextFieldsubtotalComprobanteFormaPago= new JTextFieldMe();
		jTextFieldsubtotalComprobanteFormaPago.setEnabled(false);
		jTextFieldsubtotalComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsubtotalComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsubtotalComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsubtotalComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsubtotalComprobanteFormaPago.setText("0.0");

		this.jButtonsubtotalComprobanteFormaPagoBusqueda= new JButtonMe();
		this.jButtonsubtotalComprobanteFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsubtotalComprobanteFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsubtotalComprobanteFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsubtotalComprobanteFormaPagoBusqueda.setText("U");
		this.jButtonsubtotalComprobanteFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsubtotalComprobanteFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsubtotalComprobanteFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsubtotalComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsubtotalComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"subtotalComprobanteFormaPagoBusqueda"));

		if(this.comprobanteformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsubtotalComprobanteFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelivaComprobanteFormaPago = new JLabelMe();
		this.jLabelivaComprobanteFormaPago.setText(""+ComprobanteFormaPagoConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaComprobanteFormaPago.setToolTipText("Iva");
		this.jLabelivaComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaComprobanteFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaComprobanteFormaPago.setToolTipText(ComprobanteFormaPagoConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutComprobanteFormaPago = new GridBagLayout();
		this.jPanelivaComprobanteFormaPago.setLayout(this.gridaBagLayoutComprobanteFormaPago);


		jTextFieldivaComprobanteFormaPago= new JTextFieldMe();
		jTextFieldivaComprobanteFormaPago.setEnabled(false);
		jTextFieldivaComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaComprobanteFormaPago.setText("0.0");

		this.jButtonivaComprobanteFormaPagoBusqueda= new JButtonMe();
		this.jButtonivaComprobanteFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaComprobanteFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaComprobanteFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaComprobanteFormaPagoBusqueda.setText("U");
		this.jButtonivaComprobanteFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaComprobanteFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaComprobanteFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaComprobanteFormaPagoBusqueda"));

		if(this.comprobanteformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaComprobanteFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabeldescuentoComprobanteFormaPago = new JLabelMe();
		this.jLabeldescuentoComprobanteFormaPago.setText(""+ComprobanteFormaPagoConstantesFunciones.LABEL_DESCUENTO+" : *");
		this.jLabeldescuentoComprobanteFormaPago.setToolTipText("Descuento");
		this.jLabeldescuentoComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuentoComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuentoComprobanteFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuentoComprobanteFormaPago.setToolTipText(ComprobanteFormaPagoConstantesFunciones.LABEL_DESCUENTO);
		this.gridaBagLayoutComprobanteFormaPago = new GridBagLayout();
		this.jPaneldescuentoComprobanteFormaPago.setLayout(this.gridaBagLayoutComprobanteFormaPago);


		jTextFielddescuentoComprobanteFormaPago= new JTextFieldMe();
		jTextFielddescuentoComprobanteFormaPago.setEnabled(false);
		jTextFielddescuentoComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuentoComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuentoComprobanteFormaPago.setText("0.0");

		this.jButtondescuentoComprobanteFormaPagoBusqueda= new JButtonMe();
		this.jButtondescuentoComprobanteFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoComprobanteFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoComprobanteFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuentoComprobanteFormaPagoBusqueda.setText("U");
		this.jButtondescuentoComprobanteFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuentoComprobanteFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuentoComprobanteFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuentoComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuentoComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuentoComprobanteFormaPagoBusqueda"));

		if(this.comprobanteformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuentoComprobanteFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelfinanciamientoComprobanteFormaPago = new JLabelMe();
		this.jLabelfinanciamientoComprobanteFormaPago.setText(""+ComprobanteFormaPagoConstantesFunciones.LABEL_FINANCIAMIENTO+" : *");
		this.jLabelfinanciamientoComprobanteFormaPago.setToolTipText("Financiamiento");
		this.jLabelfinanciamientoComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfinanciamientoComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfinanciamientoComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfinanciamientoComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfinanciamientoComprobanteFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfinanciamientoComprobanteFormaPago.setToolTipText(ComprobanteFormaPagoConstantesFunciones.LABEL_FINANCIAMIENTO);
		this.gridaBagLayoutComprobanteFormaPago = new GridBagLayout();
		this.jPanelfinanciamientoComprobanteFormaPago.setLayout(this.gridaBagLayoutComprobanteFormaPago);


		jTextFieldfinanciamientoComprobanteFormaPago= new JTextFieldMe();
		jTextFieldfinanciamientoComprobanteFormaPago.setEnabled(false);
		jTextFieldfinanciamientoComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfinanciamientoComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfinanciamientoComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfinanciamientoComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfinanciamientoComprobanteFormaPago.setText("0.0");

		this.jButtonfinanciamientoComprobanteFormaPagoBusqueda= new JButtonMe();
		this.jButtonfinanciamientoComprobanteFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfinanciamientoComprobanteFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfinanciamientoComprobanteFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfinanciamientoComprobanteFormaPagoBusqueda.setText("U");
		this.jButtonfinanciamientoComprobanteFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfinanciamientoComprobanteFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfinanciamientoComprobanteFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfinanciamientoComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfinanciamientoComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"financiamientoComprobanteFormaPagoBusqueda"));

		if(this.comprobanteformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfinanciamientoComprobanteFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelfleteComprobanteFormaPago = new JLabelMe();
		this.jLabelfleteComprobanteFormaPago.setText(""+ComprobanteFormaPagoConstantesFunciones.LABEL_FLETE+" : *");
		this.jLabelfleteComprobanteFormaPago.setToolTipText("Flete");
		this.jLabelfleteComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfleteComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfleteComprobanteFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfleteComprobanteFormaPago.setToolTipText(ComprobanteFormaPagoConstantesFunciones.LABEL_FLETE);
		this.gridaBagLayoutComprobanteFormaPago = new GridBagLayout();
		this.jPanelfleteComprobanteFormaPago.setLayout(this.gridaBagLayoutComprobanteFormaPago);


		jTextFieldfleteComprobanteFormaPago= new JTextFieldMe();
		jTextFieldfleteComprobanteFormaPago.setEnabled(false);
		jTextFieldfleteComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfleteComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfleteComprobanteFormaPago.setText("0.0");

		this.jButtonfleteComprobanteFormaPagoBusqueda= new JButtonMe();
		this.jButtonfleteComprobanteFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteComprobanteFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteComprobanteFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfleteComprobanteFormaPagoBusqueda.setText("U");
		this.jButtonfleteComprobanteFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfleteComprobanteFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfleteComprobanteFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfleteComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfleteComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fleteComprobanteFormaPagoBusqueda"));

		if(this.comprobanteformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfleteComprobanteFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabeliceComprobanteFormaPago = new JLabelMe();
		this.jLabeliceComprobanteFormaPago.setText(""+ComprobanteFormaPagoConstantesFunciones.LABEL_ICE+" : *");
		this.jLabeliceComprobanteFormaPago.setToolTipText("Ice");
		this.jLabeliceComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliceComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliceComprobanteFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliceComprobanteFormaPago.setToolTipText(ComprobanteFormaPagoConstantesFunciones.LABEL_ICE);
		this.gridaBagLayoutComprobanteFormaPago = new GridBagLayout();
		this.jPaneliceComprobanteFormaPago.setLayout(this.gridaBagLayoutComprobanteFormaPago);


		jTextFieldiceComprobanteFormaPago= new JTextFieldMe();
		jTextFieldiceComprobanteFormaPago.setEnabled(false);
		jTextFieldiceComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiceComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiceComprobanteFormaPago.setText("0.0");

		this.jButtoniceComprobanteFormaPagoBusqueda= new JButtonMe();
		this.jButtoniceComprobanteFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceComprobanteFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceComprobanteFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniceComprobanteFormaPagoBusqueda.setText("U");
		this.jButtoniceComprobanteFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniceComprobanteFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniceComprobanteFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiceComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiceComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iceComprobanteFormaPagoBusqueda"));

		if(this.comprobanteformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniceComprobanteFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabeltotalComprobanteFormaPago = new JLabelMe();
		this.jLabeltotalComprobanteFormaPago.setText(""+ComprobanteFormaPagoConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalComprobanteFormaPago.setToolTipText("Total");
		this.jLabeltotalComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalComprobanteFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalComprobanteFormaPago.setToolTipText(ComprobanteFormaPagoConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutComprobanteFormaPago = new GridBagLayout();
		this.jPaneltotalComprobanteFormaPago.setLayout(this.gridaBagLayoutComprobanteFormaPago);


		jTextFieldtotalComprobanteFormaPago= new JTextFieldMe();
		jTextFieldtotalComprobanteFormaPago.setEnabled(false);
		jTextFieldtotalComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalComprobanteFormaPago.setText("0.0");

		this.jButtontotalComprobanteFormaPagoBusqueda= new JButtonMe();
		this.jButtontotalComprobanteFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalComprobanteFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalComprobanteFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalComprobanteFormaPagoBusqueda.setText("U");
		this.jButtontotalComprobanteFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalComprobanteFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalComprobanteFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalComprobanteFormaPagoBusqueda"));

		if(this.comprobanteformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalComprobanteFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabeltipoComprobanteFormaPago = new JLabelMe();
		this.jLabeltipoComprobanteFormaPago.setText(""+ComprobanteFormaPagoConstantesFunciones.LABEL_TIPO+" : *");
		this.jLabeltipoComprobanteFormaPago.setToolTipText("Tipo");
		this.jLabeltipoComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltipoComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltipoComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltipoComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltipoComprobanteFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltipoComprobanteFormaPago.setToolTipText(ComprobanteFormaPagoConstantesFunciones.LABEL_TIPO);
		this.gridaBagLayoutComprobanteFormaPago = new GridBagLayout();
		this.jPaneltipoComprobanteFormaPago.setLayout(this.gridaBagLayoutComprobanteFormaPago);


		jTextFieldtipoComprobanteFormaPago= new JTextFieldMe();

		jTextFieldtipoComprobanteFormaPago.setEnabled(false);
		jTextFieldtipoComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtipoComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtipoComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtipoComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontipoComprobanteFormaPagoBusqueda= new JButtonMe();
		this.jButtontipoComprobanteFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipoComprobanteFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipoComprobanteFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontipoComprobanteFormaPagoBusqueda.setText("U");
		this.jButtontipoComprobanteFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontipoComprobanteFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontipoComprobanteFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtipoComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtipoComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tipoComprobanteFormaPagoBusqueda"));

		if(this.comprobanteformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontipoComprobanteFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelvalorComprobanteFormaPago = new JLabelMe();
		this.jLabelvalorComprobanteFormaPago.setText(""+ComprobanteFormaPagoConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorComprobanteFormaPago.setToolTipText("Valor");
		this.jLabelvalorComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorComprobanteFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorComprobanteFormaPago.setToolTipText(ComprobanteFormaPagoConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutComprobanteFormaPago = new GridBagLayout();
		this.jPanelvalorComprobanteFormaPago.setLayout(this.gridaBagLayoutComprobanteFormaPago);


		jTextFieldvalorComprobanteFormaPago= new JTextFieldMe();
		jTextFieldvalorComprobanteFormaPago.setEnabled(false);
		jTextFieldvalorComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorComprobanteFormaPago.setText("0.0");

		this.jButtonvalorComprobanteFormaPagoBusqueda= new JButtonMe();
		this.jButtonvalorComprobanteFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorComprobanteFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorComprobanteFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorComprobanteFormaPagoBusqueda.setText("U");
		this.jButtonvalorComprobanteFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorComprobanteFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorComprobanteFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorComprobanteFormaPagoBusqueda"));

		if(this.comprobanteformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorComprobanteFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_forma_pagoComprobanteFormaPago = new JLabelMe();
		this.jLabelfecha_forma_pagoComprobanteFormaPago.setText(""+ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAFORMAPAGO+" : *");
		this.jLabelfecha_forma_pagoComprobanteFormaPago.setToolTipText("Fecha Forma Pago");
		this.jLabelfecha_forma_pagoComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_forma_pagoComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_forma_pagoComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_forma_pagoComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_forma_pagoComprobanteFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_forma_pagoComprobanteFormaPago.setToolTipText(ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAFORMAPAGO);
		this.gridaBagLayoutComprobanteFormaPago = new GridBagLayout();
		this.jPanelfecha_forma_pagoComprobanteFormaPago.setLayout(this.gridaBagLayoutComprobanteFormaPago);


		//jFormattedTextFieldfecha_forma_pagoComprobanteFormaPago= new JFormattedTextFieldMe();

		jDateChooserfecha_forma_pagoComprobanteFormaPago= new JDateChooser();
		jDateChooserfecha_forma_pagoComprobanteFormaPago.setEnabled(false);
		jDateChooserfecha_forma_pagoComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_forma_pagoComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_forma_pagoComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_forma_pagoComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_forma_pagoComprobanteFormaPago.setDate(new Date());
		jDateChooserfecha_forma_pagoComprobanteFormaPago.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_forma_pagoComprobanteFormaPago.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_forma_pagoComprobanteFormaPagoBusqueda= new JButtonMe();
		this.jButtonfecha_forma_pagoComprobanteFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_forma_pagoComprobanteFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_forma_pagoComprobanteFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_forma_pagoComprobanteFormaPagoBusqueda.setText("U");
		this.jButtonfecha_forma_pagoComprobanteFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_forma_pagoComprobanteFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_forma_pagoComprobanteFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_forma_pagoComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_forma_pagoComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_forma_pagoComprobanteFormaPagoBusqueda"));

		if(this.comprobanteformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_forma_pagoComprobanteFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_cuentaComprobanteFormaPago = new JLabelMe();
		this.jLabelnumero_cuentaComprobanteFormaPago.setText(""+ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROCUENTA+" : *");
		this.jLabelnumero_cuentaComprobanteFormaPago.setToolTipText("Numero Cuenta");
		this.jLabelnumero_cuentaComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuentaComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuentaComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_cuentaComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_cuentaComprobanteFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_cuentaComprobanteFormaPago.setToolTipText(ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROCUENTA);
		this.gridaBagLayoutComprobanteFormaPago = new GridBagLayout();
		this.jPanelnumero_cuentaComprobanteFormaPago.setLayout(this.gridaBagLayoutComprobanteFormaPago);


		jTextFieldnumero_cuentaComprobanteFormaPago= new JTextFieldMe();

		jTextFieldnumero_cuentaComprobanteFormaPago.setEnabled(false);
		jTextFieldnumero_cuentaComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuentaComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuentaComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_cuentaComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_cuentaComprobanteFormaPagoBusqueda= new JButtonMe();
		this.jButtonnumero_cuentaComprobanteFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuentaComprobanteFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuentaComprobanteFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_cuentaComprobanteFormaPagoBusqueda.setText("U");
		this.jButtonnumero_cuentaComprobanteFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_cuentaComprobanteFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_cuentaComprobanteFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_cuentaComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_cuentaComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_cuentaComprobanteFormaPagoBusqueda"));

		if(this.comprobanteformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_cuentaComprobanteFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_chequeComprobanteFormaPago = new JLabelMe();
		this.jLabelnumero_chequeComprobanteFormaPago.setText(""+ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROCHEQUE+" : *");
		this.jLabelnumero_chequeComprobanteFormaPago.setToolTipText("Numero Cheque");
		this.jLabelnumero_chequeComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_chequeComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_chequeComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_chequeComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_chequeComprobanteFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_chequeComprobanteFormaPago.setToolTipText(ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROCHEQUE);
		this.gridaBagLayoutComprobanteFormaPago = new GridBagLayout();
		this.jPanelnumero_chequeComprobanteFormaPago.setLayout(this.gridaBagLayoutComprobanteFormaPago);


		jTextFieldnumero_chequeComprobanteFormaPago= new JTextFieldMe();

		jTextFieldnumero_chequeComprobanteFormaPago.setEnabled(false);
		jTextFieldnumero_chequeComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_chequeComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_chequeComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_chequeComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_chequeComprobanteFormaPagoBusqueda= new JButtonMe();
		this.jButtonnumero_chequeComprobanteFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_chequeComprobanteFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_chequeComprobanteFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_chequeComprobanteFormaPagoBusqueda.setText("U");
		this.jButtonnumero_chequeComprobanteFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_chequeComprobanteFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_chequeComprobanteFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_chequeComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_chequeComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_chequeComprobanteFormaPagoBusqueda"));

		if(this.comprobanteformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_chequeComprobanteFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelgiradorComprobanteFormaPago = new JLabelMe();
		this.jLabelgiradorComprobanteFormaPago.setText(""+ComprobanteFormaPagoConstantesFunciones.LABEL_GIRADOR+" : *");
		this.jLabelgiradorComprobanteFormaPago.setToolTipText("Girador");
		this.jLabelgiradorComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelgiradorComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelgiradorComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelgiradorComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelgiradorComprobanteFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelgiradorComprobanteFormaPago.setToolTipText(ComprobanteFormaPagoConstantesFunciones.LABEL_GIRADOR);
		this.gridaBagLayoutComprobanteFormaPago = new GridBagLayout();
		this.jPanelgiradorComprobanteFormaPago.setLayout(this.gridaBagLayoutComprobanteFormaPago);


		jTextAreagiradorComprobanteFormaPago= new JTextAreaMe();
		jTextAreagiradorComprobanteFormaPago.setEnabled(false);
		jTextAreagiradorComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreagiradorComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreagiradorComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreagiradorComprobanteFormaPago.setLineWrap(true);
		jTextAreagiradorComprobanteFormaPago.setWrapStyleWord(true);
		jTextAreagiradorComprobanteFormaPago.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreagiradorComprobanteFormaPago.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreagiradorComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanegiradorComprobanteFormaPago = new JScrollPane(jTextAreagiradorComprobanteFormaPago);
		jscrollPanegiradorComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanegiradorComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanegiradorComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtongiradorComprobanteFormaPagoBusqueda= new JButtonMe();
		this.jButtongiradorComprobanteFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongiradorComprobanteFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongiradorComprobanteFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtongiradorComprobanteFormaPagoBusqueda.setText("U");
		this.jButtongiradorComprobanteFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtongiradorComprobanteFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtongiradorComprobanteFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreagiradorComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreagiradorComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"giradorComprobanteFormaPagoBusqueda"));

		if(this.comprobanteformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtongiradorComprobanteFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_dias_plazoComprobanteFormaPago = new JLabelMe();
		this.jLabelnumero_dias_plazoComprobanteFormaPago.setText(""+ComprobanteFormaPagoConstantesFunciones.LABEL_NUMERODIASPLAZO+" : *");
		this.jLabelnumero_dias_plazoComprobanteFormaPago.setToolTipText("Numero Dias Plazo");
		this.jLabelnumero_dias_plazoComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_dias_plazoComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_dias_plazoComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_dias_plazoComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_dias_plazoComprobanteFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_dias_plazoComprobanteFormaPago.setToolTipText(ComprobanteFormaPagoConstantesFunciones.LABEL_NUMERODIASPLAZO);
		this.gridaBagLayoutComprobanteFormaPago = new GridBagLayout();
		this.jPanelnumero_dias_plazoComprobanteFormaPago.setLayout(this.gridaBagLayoutComprobanteFormaPago);


		jTextFieldnumero_dias_plazoComprobanteFormaPago= new JTextFieldMe();
		jTextFieldnumero_dias_plazoComprobanteFormaPago.setEnabled(false);
		jTextFieldnumero_dias_plazoComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_dias_plazoComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_dias_plazoComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_dias_plazoComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_dias_plazoComprobanteFormaPago.setText("0");

		this.jButtonnumero_dias_plazoComprobanteFormaPagoBusqueda= new JButtonMe();
		this.jButtonnumero_dias_plazoComprobanteFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_dias_plazoComprobanteFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_dias_plazoComprobanteFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_dias_plazoComprobanteFormaPagoBusqueda.setText("U");
		this.jButtonnumero_dias_plazoComprobanteFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_dias_plazoComprobanteFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_dias_plazoComprobanteFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_dias_plazoComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_dias_plazoComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_dias_plazoComprobanteFormaPagoBusqueda"));

		if(this.comprobanteformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_dias_plazoComprobanteFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_tarjetaComprobanteFormaPago = new JLabelMe();
		this.jLabelnumero_tarjetaComprobanteFormaPago.setText(""+ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROTARJETA+" : *");
		this.jLabelnumero_tarjetaComprobanteFormaPago.setToolTipText("Numero Tarjeta");
		this.jLabelnumero_tarjetaComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_tarjetaComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_tarjetaComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_tarjetaComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_tarjetaComprobanteFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_tarjetaComprobanteFormaPago.setToolTipText(ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROTARJETA);
		this.gridaBagLayoutComprobanteFormaPago = new GridBagLayout();
		this.jPanelnumero_tarjetaComprobanteFormaPago.setLayout(this.gridaBagLayoutComprobanteFormaPago);


		jTextFieldnumero_tarjetaComprobanteFormaPago= new JTextFieldMe();

		jTextFieldnumero_tarjetaComprobanteFormaPago.setEnabled(false);
		jTextFieldnumero_tarjetaComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_tarjetaComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_tarjetaComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_tarjetaComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_tarjetaComprobanteFormaPagoBusqueda= new JButtonMe();
		this.jButtonnumero_tarjetaComprobanteFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_tarjetaComprobanteFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_tarjetaComprobanteFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_tarjetaComprobanteFormaPagoBusqueda.setText("U");
		this.jButtonnumero_tarjetaComprobanteFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_tarjetaComprobanteFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_tarjetaComprobanteFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_tarjetaComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_tarjetaComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_tarjetaComprobanteFormaPagoBusqueda"));

		if(this.comprobanteformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_tarjetaComprobanteFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelautorizacionComprobanteFormaPago = new JLabelMe();
		this.jLabelautorizacionComprobanteFormaPago.setText(""+ComprobanteFormaPagoConstantesFunciones.LABEL_AUTORIZACION+" : *");
		this.jLabelautorizacionComprobanteFormaPago.setToolTipText("Autorizacion");
		this.jLabelautorizacionComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelautorizacionComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelautorizacionComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelautorizacionComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelautorizacionComprobanteFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelautorizacionComprobanteFormaPago.setToolTipText(ComprobanteFormaPagoConstantesFunciones.LABEL_AUTORIZACION);
		this.gridaBagLayoutComprobanteFormaPago = new GridBagLayout();
		this.jPanelautorizacionComprobanteFormaPago.setLayout(this.gridaBagLayoutComprobanteFormaPago);


		jTextAreaautorizacionComprobanteFormaPago= new JTextAreaMe();
		jTextAreaautorizacionComprobanteFormaPago.setEnabled(false);
		jTextAreaautorizacionComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaautorizacionComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaautorizacionComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaautorizacionComprobanteFormaPago.setLineWrap(true);
		jTextAreaautorizacionComprobanteFormaPago.setWrapStyleWord(true);
		jTextAreaautorizacionComprobanteFormaPago.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaautorizacionComprobanteFormaPago.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaautorizacionComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneautorizacionComprobanteFormaPago = new JScrollPane(jTextAreaautorizacionComprobanteFormaPago);
		jscrollPaneautorizacionComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPaneautorizacionComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPaneautorizacionComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonautorizacionComprobanteFormaPagoBusqueda= new JButtonMe();
		this.jButtonautorizacionComprobanteFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonautorizacionComprobanteFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonautorizacionComprobanteFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonautorizacionComprobanteFormaPagoBusqueda.setText("U");
		this.jButtonautorizacionComprobanteFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonautorizacionComprobanteFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonautorizacionComprobanteFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaautorizacionComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaautorizacionComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"autorizacionComprobanteFormaPagoBusqueda"));

		if(this.comprobanteformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonautorizacionComprobanteFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelloteComprobanteFormaPago = new JLabelMe();
		this.jLabelloteComprobanteFormaPago.setText(""+ComprobanteFormaPagoConstantesFunciones.LABEL_LOTE+" : *");
		this.jLabelloteComprobanteFormaPago.setToolTipText("Lote");
		this.jLabelloteComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelloteComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelloteComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelloteComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelloteComprobanteFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelloteComprobanteFormaPago.setToolTipText(ComprobanteFormaPagoConstantesFunciones.LABEL_LOTE);
		this.gridaBagLayoutComprobanteFormaPago = new GridBagLayout();
		this.jPanelloteComprobanteFormaPago.setLayout(this.gridaBagLayoutComprobanteFormaPago);


		jTextFieldloteComprobanteFormaPago= new JTextFieldMe();

		jTextFieldloteComprobanteFormaPago.setEnabled(false);
		jTextFieldloteComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldloteComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldloteComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldloteComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonloteComprobanteFormaPagoBusqueda= new JButtonMe();
		this.jButtonloteComprobanteFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonloteComprobanteFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonloteComprobanteFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonloteComprobanteFormaPagoBusqueda.setText("U");
		this.jButtonloteComprobanteFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonloteComprobanteFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonloteComprobanteFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldloteComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldloteComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"loteComprobanteFormaPagoBusqueda"));

		if(this.comprobanteformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonloteComprobanteFormaPagoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysComprobanteFormaPago() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaComprobanteFormaPago = new JLabelMe();
		this.jLabelid_empresaComprobanteFormaPago.setText(""+ComprobanteFormaPagoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaComprobanteFormaPago.setToolTipText("Empresa");
		this.jLabelid_empresaComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaComprobanteFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaComprobanteFormaPago.setToolTipText(ComprobanteFormaPagoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutComprobanteFormaPago = new GridBagLayout();
		this.jPanelid_empresaComprobanteFormaPago.setLayout(this.gridaBagLayoutComprobanteFormaPago);


		jComboBoxid_empresaComprobanteFormaPago= new JComboBoxMe();
		jComboBoxid_empresaComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaComprobanteFormaPago.setEnabled(false);

		this.jButtonid_empresaComprobanteFormaPago= new JButtonMe();
		this.jButtonid_empresaComprobanteFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComprobanteFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComprobanteFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComprobanteFormaPago.setText("Buscar");
		this.jButtonid_empresaComprobanteFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaComprobanteFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComprobanteFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComprobanteFormaPago"));

		this.jButtonid_empresaComprobanteFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_empresaComprobanteFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComprobanteFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComprobanteFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaComprobanteFormaPagoBusqueda.setText("U");
		this.jButtonid_empresaComprobanteFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaComprobanteFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComprobanteFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComprobanteFormaPagoBusqueda"));

		if(this.comprobanteformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaComprobanteFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_empresaComprobanteFormaPagoUpdate= new JButtonMe();
		this.jButtonid_empresaComprobanteFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComprobanteFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComprobanteFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaComprobanteFormaPagoUpdate.setText("U");
		this.jButtonid_empresaComprobanteFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaComprobanteFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComprobanteFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComprobanteFormaPagoUpdate"));



					
		this.jLabelid_sucursalComprobanteFormaPago = new JLabelMe();
		this.jLabelid_sucursalComprobanteFormaPago.setText(""+ComprobanteFormaPagoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalComprobanteFormaPago.setToolTipText("Sucursal");
		this.jLabelid_sucursalComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalComprobanteFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalComprobanteFormaPago.setToolTipText(ComprobanteFormaPagoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutComprobanteFormaPago = new GridBagLayout();
		this.jPanelid_sucursalComprobanteFormaPago.setLayout(this.gridaBagLayoutComprobanteFormaPago);


		jComboBoxid_sucursalComprobanteFormaPago= new JComboBoxMe();
		jComboBoxid_sucursalComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalComprobanteFormaPago.setEnabled(false);

		this.jButtonid_sucursalComprobanteFormaPago= new JButtonMe();
		this.jButtonid_sucursalComprobanteFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalComprobanteFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalComprobanteFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalComprobanteFormaPago.setText("Buscar");
		this.jButtonid_sucursalComprobanteFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalComprobanteFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalComprobanteFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalComprobanteFormaPago"));

		this.jButtonid_sucursalComprobanteFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_sucursalComprobanteFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalComprobanteFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalComprobanteFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalComprobanteFormaPagoBusqueda.setText("U");
		this.jButtonid_sucursalComprobanteFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalComprobanteFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalComprobanteFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalComprobanteFormaPagoBusqueda"));

		if(this.comprobanteformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalComprobanteFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalComprobanteFormaPagoUpdate= new JButtonMe();
		this.jButtonid_sucursalComprobanteFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalComprobanteFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalComprobanteFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalComprobanteFormaPagoUpdate.setText("U");
		this.jButtonid_sucursalComprobanteFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalComprobanteFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalComprobanteFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalComprobanteFormaPagoUpdate"));



					
		this.jLabelid_clienteComprobanteFormaPago = new JLabelMe();
		this.jLabelid_clienteComprobanteFormaPago.setText(""+ComprobanteFormaPagoConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteComprobanteFormaPago.setToolTipText("Cliente");
		this.jLabelid_clienteComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteComprobanteFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteComprobanteFormaPago.setToolTipText(ComprobanteFormaPagoConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutComprobanteFormaPago = new GridBagLayout();
		this.jPanelid_clienteComprobanteFormaPago.setLayout(this.gridaBagLayoutComprobanteFormaPago);


		jComboBoxid_clienteComprobanteFormaPago= new JComboBoxMe();
		jComboBoxid_clienteComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_clienteComprobanteFormaPago.setEnabled(false);

		this.jButtonid_clienteComprobanteFormaPago= new JButtonMe();
		this.jButtonid_clienteComprobanteFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteComprobanteFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteComprobanteFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteComprobanteFormaPago.setText("Buscar");
		this.jButtonid_clienteComprobanteFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteComprobanteFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteComprobanteFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteComprobanteFormaPago"));

		this.jButtonid_clienteComprobanteFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_clienteComprobanteFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteComprobanteFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteComprobanteFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteComprobanteFormaPagoBusqueda.setText("U");
		this.jButtonid_clienteComprobanteFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteComprobanteFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteComprobanteFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteComprobanteFormaPagoBusqueda"));

		if(this.comprobanteformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteComprobanteFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_clienteComprobanteFormaPagoUpdate= new JButtonMe();
		this.jButtonid_clienteComprobanteFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteComprobanteFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteComprobanteFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteComprobanteFormaPagoUpdate.setText("U");
		this.jButtonid_clienteComprobanteFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteComprobanteFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteComprobanteFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteComprobanteFormaPagoUpdate"));



					
		this.jLabelid_cajaComprobanteFormaPago = new JLabelMe();
		this.jLabelid_cajaComprobanteFormaPago.setText(""+ComprobanteFormaPagoConstantesFunciones.LABEL_IDCAJA+" : *");
		this.jLabelid_cajaComprobanteFormaPago.setToolTipText("Caja");
		this.jLabelid_cajaComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cajaComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cajaComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cajaComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cajaComprobanteFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cajaComprobanteFormaPago.setToolTipText(ComprobanteFormaPagoConstantesFunciones.LABEL_IDCAJA);
		this.gridaBagLayoutComprobanteFormaPago = new GridBagLayout();
		this.jPanelid_cajaComprobanteFormaPago.setLayout(this.gridaBagLayoutComprobanteFormaPago);


		jComboBoxid_cajaComprobanteFormaPago= new JComboBoxMe();
		jComboBoxid_cajaComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cajaComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_cajaComprobanteFormaPago.setEnabled(false);

		this.jButtonid_cajaComprobanteFormaPago= new JButtonMe();
		this.jButtonid_cajaComprobanteFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaComprobanteFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaComprobanteFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaComprobanteFormaPago.setText("Buscar");
		this.jButtonid_cajaComprobanteFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cajaComprobanteFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaComprobanteFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cajaComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaComprobanteFormaPago"));

		this.jButtonid_cajaComprobanteFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_cajaComprobanteFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaComprobanteFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaComprobanteFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cajaComprobanteFormaPagoBusqueda.setText("U");
		this.jButtonid_cajaComprobanteFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cajaComprobanteFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaComprobanteFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cajaComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaComprobanteFormaPagoBusqueda"));

		if(this.comprobanteformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cajaComprobanteFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_cajaComprobanteFormaPagoUpdate= new JButtonMe();
		this.jButtonid_cajaComprobanteFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaComprobanteFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaComprobanteFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cajaComprobanteFormaPagoUpdate.setText("U");
		this.jButtonid_cajaComprobanteFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cajaComprobanteFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaComprobanteFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cajaComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaComprobanteFormaPagoUpdate"));



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
		//this.jInternalFrameDetalleComprobanteFormaPago = new ComprobanteFormaPagoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Comprobante Forma Pago DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutComprobanteFormaPago= new GridBagLayout();
		

		
		String sToolTipComprobanteFormaPago="";
		sToolTipComprobanteFormaPago=ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipComprobanteFormaPago+="(PuntoVenta.ComprobanteFormaPago)";
		}
		
		if(!this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()) {
			sToolTipComprobanteFormaPago+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoComprobanteFormaPago = new JButtonMe();
		this.jButtonModificarComprobanteFormaPago = new JButtonMe();
        this.jButtonActualizarComprobanteFormaPago = new JButtonMe();
        this.jButtonEliminarComprobanteFormaPago = new JButtonMe();
        this.jButtonCancelarComprobanteFormaPago = new JButtonMe();
        this.jButtonGuardarCambiosComprobanteFormaPago = new JButtonMe();
		this.jButtonGuardarCambiosTablaComprobanteFormaPago = new JButtonMe();
		this.jButtonCerrarComprobanteFormaPago = new JButtonMe();
		
		this.jScrollPanelDatosComprobanteFormaPago = new JScrollPane();   
        this.jScrollPanelDatosEdicionComprobanteFormaPago = new JScrollPane();
		this.jScrollPanelDatosGeneralComprobanteFormaPago = new JScrollPane();
				
		
		
		this.jPanelCamposComprobanteFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosComprobanteFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesComprobanteFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioComprobanteFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Comprobante Forma Pago";
		
		if(!this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosComprobanteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comprobante Forma Pagos" + this.sPath));
		} else {
			this.jScrollPanelDatosComprobanteFormaPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionComprobanteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralComprobanteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposComprobanteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposComprobanteFormaPago.setName("jPanelCamposComprobanteFormaPago"); 

		this.jPanelCamposOcultosComprobanteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosComprobanteFormaPago.setName("jPanelCamposOcultosComprobanteFormaPago"); 

        this.jPanelAccionesComprobanteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesComprobanteFormaPago.setToolTipText("Acciones");
        this.jPanelAccionesComprobanteFormaPago.setName("Acciones"); 

		this.jPanelAccionesFormularioComprobanteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioComprobanteFormaPago.setToolTipText("Acciones");
        this.jPanelAccionesFormularioComprobanteFormaPago.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoComprobanteFormaPago.setText("Nuevo");
		this.jButtonModificarComprobanteFormaPago.setText("Editar");
        this.jButtonActualizarComprobanteFormaPago.setText("Actualizar");
        this.jButtonEliminarComprobanteFormaPago.setText("Eliminar");
        this.jButtonCancelarComprobanteFormaPago.setText("Cancelar");
        this.jButtonGuardarCambiosComprobanteFormaPago.setText("Guardar");
		this.jButtonGuardarCambiosTablaComprobanteFormaPago.setText("Guardar");
		this.jButtonCerrarComprobanteFormaPago.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoComprobanteFormaPago,"nuevo_button","Nuevo",this.comprobanteformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarComprobanteFormaPago,"modificar_button","Editar",this.comprobanteformapagoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarComprobanteFormaPago,"actualizar_button","Actualizar",this.comprobanteformapagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarComprobanteFormaPago,"eliminar_button","Eliminar",this.comprobanteformapagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarComprobanteFormaPago,"cancelar_button","Cancelar",this.comprobanteformapagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosComprobanteFormaPago,"guardarcambios_button","Guardar",this.comprobanteformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaComprobanteFormaPago,"guardarcambiostabla_button","Guardar",this.comprobanteformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarComprobanteFormaPago,"cerrar_button","Salir",this.comprobanteformapagoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoComprobanteFormaPago.setToolTipText("Nuevo"+" "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarComprobanteFormaPago.setToolTipText("Editar"+" "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarComprobanteFormaPago.setToolTipText("Actualizar"+" "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarComprobanteFormaPago.setToolTipText("Eliminar)"+" "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarComprobanteFormaPago.setToolTipText("Cancelar"+" "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosComprobanteFormaPago.setToolTipText("Guardar"+" "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaComprobanteFormaPago.setToolTipText("Guardar"+" "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarComprobanteFormaPago.setToolTipText("Salir"+" "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoComprobanteFormaPago";
		inputMap = this.jButtonNuevoComprobanteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoComprobanteFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoComprobanteFormaPago"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarComprobanteFormaPago";
		inputMap = this.jButtonActualizarComprobanteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarComprobanteFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarComprobanteFormaPago"));
		
		//ELIMINAR
		sMapKey = "EliminarComprobanteFormaPago";
		inputMap = this.jButtonEliminarComprobanteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarComprobanteFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarComprobanteFormaPago"));
		
		//CANCELAR	
		sMapKey = "CancelarComprobanteFormaPago";
		inputMap = this.jButtonCancelarComprobanteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarComprobanteFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarComprobanteFormaPago"));
		
		//CERRAR		
		sMapKey = "CerrarComprobanteFormaPago";
		inputMap = this.jButtonCerrarComprobanteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarComprobanteFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarComprobanteFormaPago"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaComprobanteFormaPago";
		inputMap = this.jButtonGuardarCambiosTablaComprobanteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaComprobanteFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaComprobanteFormaPago"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoComprobanteFormaPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoComprobanteFormaPago.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoComprobanteFormaPago.setToolTipText("Nuevo ComprobanteFormaPago");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarComprobanteFormaPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarComprobanteFormaPago.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarComprobanteFormaPago.setToolTipText("Sin Cerrar Ventana ComprobanteFormaPago");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeComprobanteFormaPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeComprobanteFormaPago.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeComprobanteFormaPago.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesComprobanteFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesComprobanteFormaPago.setText("Accion");
		this.jComboBoxTiposAccionesComprobanteFormaPago.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioComprobanteFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioComprobanteFormaPago.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioComprobanteFormaPago.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesComprobanteFormaPago = new JLabelMe();
		
		this.jLabelAccionesComprobanteFormaPago.setText("Acciones");		
		this.jLabelAccionesComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposComprobanteFormaPago();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysComprobanteFormaPago();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesComprobanteFormaPago=new JTabbedPane();
		this.jTabbedPaneRelacionesComprobanteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesComprobanteFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComprobanteFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComprobanteFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioComprobanteFormaPago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioComprobanteFormaPago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioComprobanteFormaPago.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposComprobanteFormaPago = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosComprobanteFormaPago = new GridBagLayout();
		
		this.jPanelCamposComprobanteFormaPago.setLayout(gridaBagLayoutCamposComprobanteFormaPago);
		this.jPanelCamposOcultosComprobanteFormaPago.setLayout(gridaBagLayoutCamposOcultosComprobanteFormaPago);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidComprobanteFormaPago.add(jLabelIdComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 1;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidComprobanteFormaPago.add(jLabelidComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);


	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaComprobanteFormaPago.add(jLabelid_empresaComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
		this.gridBagConstraintsComprobanteFormaPago.gridx = 2;
		this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
		this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaComprobanteFormaPago.add(jButtonid_empresaComprobanteFormaPagoBusqueda, this.gridBagConstraintsComprobanteFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
		this.gridBagConstraintsComprobanteFormaPago.gridx = 3;
		this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
		this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaComprobanteFormaPago.add(jButtonid_empresaComprobanteFormaPagoUpdate, this.gridBagConstraintsComprobanteFormaPago);
	}

	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 1;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaComprobanteFormaPago.add(jComboBoxid_empresaComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);


	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalComprobanteFormaPago.add(jLabelid_sucursalComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
		this.gridBagConstraintsComprobanteFormaPago.gridx = 2;
		this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
		this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalComprobanteFormaPago.add(jButtonid_sucursalComprobanteFormaPagoBusqueda, this.gridBagConstraintsComprobanteFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
		this.gridBagConstraintsComprobanteFormaPago.gridx = 3;
		this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
		this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalComprobanteFormaPago.add(jButtonid_sucursalComprobanteFormaPagoUpdate, this.gridBagConstraintsComprobanteFormaPago);
	}

	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 1;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalComprobanteFormaPago.add(jComboBoxid_sucursalComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);


	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteComprobanteFormaPago.add(jLabelid_clienteComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
		this.gridBagConstraintsComprobanteFormaPago.gridx = 2;
		this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
		this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteComprobanteFormaPago.add(jButtonid_clienteComprobanteFormaPagoBusqueda, this.gridBagConstraintsComprobanteFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
		this.gridBagConstraintsComprobanteFormaPago.gridx = 3;
		this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
		this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteComprobanteFormaPago.add(jButtonid_clienteComprobanteFormaPagoUpdate, this.gridBagConstraintsComprobanteFormaPago);
	}

	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 1;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteComprobanteFormaPago.add(jComboBoxid_clienteComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);


	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cajaComprobanteFormaPago.add(jLabelid_cajaComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
		this.gridBagConstraintsComprobanteFormaPago.gridx = 2;
		this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
		this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cajaComprobanteFormaPago.add(jButtonid_cajaComprobanteFormaPagoBusqueda, this.gridBagConstraintsComprobanteFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
		this.gridBagConstraintsComprobanteFormaPago.gridx = 3;
		this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
		this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cajaComprobanteFormaPago.add(jButtonid_cajaComprobanteFormaPagoUpdate, this.gridBagConstraintsComprobanteFormaPago);
	}

	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 1;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cajaComprobanteFormaPago.add(jComboBoxid_cajaComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);


	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_inicioComprobanteFormaPago.add(jLabelfecha_inicioComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
		this.gridBagConstraintsComprobanteFormaPago.gridx = 2;
		this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
		this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_inicioComprobanteFormaPago.add(jButtonfecha_inicioComprobanteFormaPagoBusqueda, this.gridBagConstraintsComprobanteFormaPago);
	}

	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 1;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_inicioComprobanteFormaPago.add(jDateChooserfecha_inicioComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);


	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_finComprobanteFormaPago.add(jLabelfecha_finComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
		this.gridBagConstraintsComprobanteFormaPago.gridx = 2;
		this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
		this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finComprobanteFormaPago.add(jButtonfecha_finComprobanteFormaPagoBusqueda, this.gridBagConstraintsComprobanteFormaPago);
	}

	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 1;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_finComprobanteFormaPago.add(jDateChooserfecha_finComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);


	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_cajaComprobanteFormaPago.add(jLabelnombre_cajaComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
		this.gridBagConstraintsComprobanteFormaPago.gridx = 2;
		this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
		this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_cajaComprobanteFormaPago.add(jButtonnombre_cajaComprobanteFormaPagoBusqueda, this.gridBagConstraintsComprobanteFormaPago);
	}

	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 1;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_cajaComprobanteFormaPago.add(jscrollPanenombre_cajaComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);


	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencialComprobanteFormaPago.add(jLabelsecuencialComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
		this.gridBagConstraintsComprobanteFormaPago.gridx = 2;
		this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
		this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencialComprobanteFormaPago.add(jButtonsecuencialComprobanteFormaPagoBusqueda, this.gridBagConstraintsComprobanteFormaPago);
	}

	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 1;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencialComprobanteFormaPago.add(jTextFieldsecuencialComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);


	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaComprobanteFormaPago.add(jLabelfechaComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
		this.gridBagConstraintsComprobanteFormaPago.gridx = 2;
		this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
		this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaComprobanteFormaPago.add(jButtonfechaComprobanteFormaPagoBusqueda, this.gridBagConstraintsComprobanteFormaPago);
	}

	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 1;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaComprobanteFormaPago.add(jDateChooserfechaComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);


	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_clienteComprobanteFormaPago.add(jLabelcodigo_clienteComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
		this.gridBagConstraintsComprobanteFormaPago.gridx = 2;
		this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
		this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_clienteComprobanteFormaPago.add(jButtoncodigo_clienteComprobanteFormaPagoBusqueda, this.gridBagConstraintsComprobanteFormaPago);
	}

	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 1;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_clienteComprobanteFormaPago.add(jTextFieldcodigo_clienteComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);


	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_clienteComprobanteFormaPago.add(jLabelnombre_clienteComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
		this.gridBagConstraintsComprobanteFormaPago.gridx = 2;
		this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
		this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_clienteComprobanteFormaPago.add(jButtonnombre_clienteComprobanteFormaPagoBusqueda, this.gridBagConstraintsComprobanteFormaPago);
	}

	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 1;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_clienteComprobanteFormaPago.add(jscrollPanenombre_clienteComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);


	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsubtotalComprobanteFormaPago.add(jLabelsubtotalComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
		this.gridBagConstraintsComprobanteFormaPago.gridx = 2;
		this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
		this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelsubtotalComprobanteFormaPago.add(jButtonsubtotalComprobanteFormaPagoBusqueda, this.gridBagConstraintsComprobanteFormaPago);
	}

	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 1;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsubtotalComprobanteFormaPago.add(jTextFieldsubtotalComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);


	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaComprobanteFormaPago.add(jLabelivaComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
		this.gridBagConstraintsComprobanteFormaPago.gridx = 2;
		this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
		this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaComprobanteFormaPago.add(jButtonivaComprobanteFormaPagoBusqueda, this.gridBagConstraintsComprobanteFormaPago);
	}

	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 1;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaComprobanteFormaPago.add(jTextFieldivaComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);


	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuentoComprobanteFormaPago.add(jLabeldescuentoComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
		this.gridBagConstraintsComprobanteFormaPago.gridx = 2;
		this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
		this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuentoComprobanteFormaPago.add(jButtondescuentoComprobanteFormaPagoBusqueda, this.gridBagConstraintsComprobanteFormaPago);
	}

	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 1;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuentoComprobanteFormaPago.add(jTextFielddescuentoComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);


	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfinanciamientoComprobanteFormaPago.add(jLabelfinanciamientoComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
		this.gridBagConstraintsComprobanteFormaPago.gridx = 2;
		this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
		this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelfinanciamientoComprobanteFormaPago.add(jButtonfinanciamientoComprobanteFormaPagoBusqueda, this.gridBagConstraintsComprobanteFormaPago);
	}

	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 1;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfinanciamientoComprobanteFormaPago.add(jTextFieldfinanciamientoComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);


	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfleteComprobanteFormaPago.add(jLabelfleteComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
		this.gridBagConstraintsComprobanteFormaPago.gridx = 2;
		this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
		this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelfleteComprobanteFormaPago.add(jButtonfleteComprobanteFormaPagoBusqueda, this.gridBagConstraintsComprobanteFormaPago);
	}

	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 1;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfleteComprobanteFormaPago.add(jTextFieldfleteComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);


	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneliceComprobanteFormaPago.add(jLabeliceComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
		this.gridBagConstraintsComprobanteFormaPago.gridx = 2;
		this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
		this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPaneliceComprobanteFormaPago.add(jButtoniceComprobanteFormaPagoBusqueda, this.gridBagConstraintsComprobanteFormaPago);
	}

	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 1;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneliceComprobanteFormaPago.add(jTextFieldiceComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);


	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalComprobanteFormaPago.add(jLabeltotalComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
		this.gridBagConstraintsComprobanteFormaPago.gridx = 2;
		this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
		this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalComprobanteFormaPago.add(jButtontotalComprobanteFormaPagoBusqueda, this.gridBagConstraintsComprobanteFormaPago);
	}

	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 1;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalComprobanteFormaPago.add(jTextFieldtotalComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);


	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltipoComprobanteFormaPago.add(jLabeltipoComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
		this.gridBagConstraintsComprobanteFormaPago.gridx = 2;
		this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
		this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPaneltipoComprobanteFormaPago.add(jButtontipoComprobanteFormaPagoBusqueda, this.gridBagConstraintsComprobanteFormaPago);
	}

	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 1;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltipoComprobanteFormaPago.add(jTextFieldtipoComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);


	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorComprobanteFormaPago.add(jLabelvalorComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
		this.gridBagConstraintsComprobanteFormaPago.gridx = 2;
		this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
		this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorComprobanteFormaPago.add(jButtonvalorComprobanteFormaPagoBusqueda, this.gridBagConstraintsComprobanteFormaPago);
	}

	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 1;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorComprobanteFormaPago.add(jTextFieldvalorComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);


	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_forma_pagoComprobanteFormaPago.add(jLabelfecha_forma_pagoComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
		this.gridBagConstraintsComprobanteFormaPago.gridx = 2;
		this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
		this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_forma_pagoComprobanteFormaPago.add(jButtonfecha_forma_pagoComprobanteFormaPagoBusqueda, this.gridBagConstraintsComprobanteFormaPago);
	}

	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 1;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_forma_pagoComprobanteFormaPago.add(jDateChooserfecha_forma_pagoComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);


	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_cuentaComprobanteFormaPago.add(jLabelnumero_cuentaComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
		this.gridBagConstraintsComprobanteFormaPago.gridx = 2;
		this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
		this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_cuentaComprobanteFormaPago.add(jButtonnumero_cuentaComprobanteFormaPagoBusqueda, this.gridBagConstraintsComprobanteFormaPago);
	}

	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 1;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_cuentaComprobanteFormaPago.add(jTextFieldnumero_cuentaComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);


	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_chequeComprobanteFormaPago.add(jLabelnumero_chequeComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
		this.gridBagConstraintsComprobanteFormaPago.gridx = 2;
		this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
		this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_chequeComprobanteFormaPago.add(jButtonnumero_chequeComprobanteFormaPagoBusqueda, this.gridBagConstraintsComprobanteFormaPago);
	}

	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 1;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_chequeComprobanteFormaPago.add(jTextFieldnumero_chequeComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);


	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelgiradorComprobanteFormaPago.add(jLabelgiradorComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
		this.gridBagConstraintsComprobanteFormaPago.gridx = 2;
		this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
		this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelgiradorComprobanteFormaPago.add(jButtongiradorComprobanteFormaPagoBusqueda, this.gridBagConstraintsComprobanteFormaPago);
	}

	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 1;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelgiradorComprobanteFormaPago.add(jscrollPanegiradorComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);


	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_dias_plazoComprobanteFormaPago.add(jLabelnumero_dias_plazoComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
		this.gridBagConstraintsComprobanteFormaPago.gridx = 2;
		this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
		this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_dias_plazoComprobanteFormaPago.add(jButtonnumero_dias_plazoComprobanteFormaPagoBusqueda, this.gridBagConstraintsComprobanteFormaPago);
	}

	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 1;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_dias_plazoComprobanteFormaPago.add(jTextFieldnumero_dias_plazoComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);


	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_tarjetaComprobanteFormaPago.add(jLabelnumero_tarjetaComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
		this.gridBagConstraintsComprobanteFormaPago.gridx = 2;
		this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
		this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_tarjetaComprobanteFormaPago.add(jButtonnumero_tarjetaComprobanteFormaPagoBusqueda, this.gridBagConstraintsComprobanteFormaPago);
	}

	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 1;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_tarjetaComprobanteFormaPago.add(jTextFieldnumero_tarjetaComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);


	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelautorizacionComprobanteFormaPago.add(jLabelautorizacionComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
		this.gridBagConstraintsComprobanteFormaPago.gridx = 2;
		this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
		this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelautorizacionComprobanteFormaPago.add(jButtonautorizacionComprobanteFormaPagoBusqueda, this.gridBagConstraintsComprobanteFormaPago);
	}

	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 1;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelautorizacionComprobanteFormaPago.add(jscrollPaneautorizacionComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);


	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelloteComprobanteFormaPago.add(jLabelloteComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
		this.gridBagConstraintsComprobanteFormaPago.gridx = 2;
		this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
		this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelloteComprobanteFormaPago.add(jButtonloteComprobanteFormaPagoBusqueda, this.gridBagConstraintsComprobanteFormaPago);
	}

	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
	this.gridBagConstraintsComprobanteFormaPago.gridx = 1;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelloteComprobanteFormaPago.add(jTextFieldloteComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFormaPago.gridy = iYPanelCamposComprobanteFormaPago;
	this.gridBagConstraintsComprobanteFormaPago.gridx = iXPanelCamposComprobanteFormaPago++;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFormaPago.add(this.jPanelidComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(iXPanelCamposComprobanteFormaPago % 3==0) {
		iXPanelCamposComprobanteFormaPago=0;
		iYPanelCamposComprobanteFormaPago++;
	}
	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFormaPago.gridy = iYPanelCamposComprobanteFormaPago;
	this.gridBagConstraintsComprobanteFormaPago.gridx = iXPanelCamposComprobanteFormaPago++;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFormaPago.add(this.jPanelfecha_inicioComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(iXPanelCamposComprobanteFormaPago % 3==0) {
		iXPanelCamposComprobanteFormaPago=0;
		iYPanelCamposComprobanteFormaPago++;
	}
	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFormaPago.gridy = iYPanelCamposComprobanteFormaPago;
	this.gridBagConstraintsComprobanteFormaPago.gridx = iXPanelCamposComprobanteFormaPago++;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFormaPago.add(this.jPanelfecha_finComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(iXPanelCamposComprobanteFormaPago % 3==0) {
		iXPanelCamposComprobanteFormaPago=0;
		iYPanelCamposComprobanteFormaPago++;
	}
	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFormaPago.gridy = iYPanelCamposComprobanteFormaPago;
	this.gridBagConstraintsComprobanteFormaPago.gridx = iXPanelCamposComprobanteFormaPago++;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFormaPago.add(this.jPanelnombre_cajaComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(iXPanelCamposComprobanteFormaPago % 3==0) {
		iXPanelCamposComprobanteFormaPago=0;
		iYPanelCamposComprobanteFormaPago++;
	}
	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFormaPago.gridy = iYPanelCamposComprobanteFormaPago;
	this.gridBagConstraintsComprobanteFormaPago.gridx = iXPanelCamposComprobanteFormaPago++;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFormaPago.add(this.jPanelsecuencialComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(iXPanelCamposComprobanteFormaPago % 3==0) {
		iXPanelCamposComprobanteFormaPago=0;
		iYPanelCamposComprobanteFormaPago++;
	}
	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFormaPago.gridy = iYPanelCamposComprobanteFormaPago;
	this.gridBagConstraintsComprobanteFormaPago.gridx = iXPanelCamposComprobanteFormaPago++;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFormaPago.add(this.jPanelfechaComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(iXPanelCamposComprobanteFormaPago % 3==0) {
		iXPanelCamposComprobanteFormaPago=0;
		iYPanelCamposComprobanteFormaPago++;
	}
	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFormaPago.gridy = iYPanelCamposComprobanteFormaPago;
	this.gridBagConstraintsComprobanteFormaPago.gridx = iXPanelCamposComprobanteFormaPago++;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFormaPago.add(this.jPanelcodigo_clienteComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(iXPanelCamposComprobanteFormaPago % 3==0) {
		iXPanelCamposComprobanteFormaPago=0;
		iYPanelCamposComprobanteFormaPago++;
	}
	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFormaPago.gridy = iYPanelCamposComprobanteFormaPago;
	this.gridBagConstraintsComprobanteFormaPago.gridx = iXPanelCamposComprobanteFormaPago++;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFormaPago.add(this.jPanelnombre_clienteComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(iXPanelCamposComprobanteFormaPago % 3==0) {
		iXPanelCamposComprobanteFormaPago=0;
		iYPanelCamposComprobanteFormaPago++;
	}
	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFormaPago.gridy = iYPanelCamposComprobanteFormaPago;
	this.gridBagConstraintsComprobanteFormaPago.gridx = iXPanelCamposComprobanteFormaPago++;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFormaPago.add(this.jPanelsubtotalComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(iXPanelCamposComprobanteFormaPago % 3==0) {
		iXPanelCamposComprobanteFormaPago=0;
		iYPanelCamposComprobanteFormaPago++;
	}
	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFormaPago.gridy = iYPanelCamposComprobanteFormaPago;
	this.gridBagConstraintsComprobanteFormaPago.gridx = iXPanelCamposComprobanteFormaPago++;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFormaPago.add(this.jPanelivaComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(iXPanelCamposComprobanteFormaPago % 3==0) {
		iXPanelCamposComprobanteFormaPago=0;
		iYPanelCamposComprobanteFormaPago++;
	}
	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFormaPago.gridy = iYPanelCamposComprobanteFormaPago;
	this.gridBagConstraintsComprobanteFormaPago.gridx = iXPanelCamposComprobanteFormaPago++;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFormaPago.add(this.jPaneldescuentoComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(iXPanelCamposComprobanteFormaPago % 3==0) {
		iXPanelCamposComprobanteFormaPago=0;
		iYPanelCamposComprobanteFormaPago++;
	}
	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFormaPago.gridy = iYPanelCamposComprobanteFormaPago;
	this.gridBagConstraintsComprobanteFormaPago.gridx = iXPanelCamposComprobanteFormaPago++;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFormaPago.add(this.jPanelfinanciamientoComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(iXPanelCamposComprobanteFormaPago % 3==0) {
		iXPanelCamposComprobanteFormaPago=0;
		iYPanelCamposComprobanteFormaPago++;
	}
	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFormaPago.gridy = iYPanelCamposComprobanteFormaPago;
	this.gridBagConstraintsComprobanteFormaPago.gridx = iXPanelCamposComprobanteFormaPago++;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFormaPago.add(this.jPanelfleteComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(iXPanelCamposComprobanteFormaPago % 3==0) {
		iXPanelCamposComprobanteFormaPago=0;
		iYPanelCamposComprobanteFormaPago++;
	}
	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFormaPago.gridy = iYPanelCamposComprobanteFormaPago;
	this.gridBagConstraintsComprobanteFormaPago.gridx = iXPanelCamposComprobanteFormaPago++;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFormaPago.add(this.jPaneliceComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(iXPanelCamposComprobanteFormaPago % 3==0) {
		iXPanelCamposComprobanteFormaPago=0;
		iYPanelCamposComprobanteFormaPago++;
	}
	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFormaPago.gridy = iYPanelCamposComprobanteFormaPago;
	this.gridBagConstraintsComprobanteFormaPago.gridx = iXPanelCamposComprobanteFormaPago++;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFormaPago.add(this.jPaneltotalComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(iXPanelCamposComprobanteFormaPago % 3==0) {
		iXPanelCamposComprobanteFormaPago=0;
		iYPanelCamposComprobanteFormaPago++;
	}
	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFormaPago.gridy = iYPanelCamposComprobanteFormaPago;
	this.gridBagConstraintsComprobanteFormaPago.gridx = iXPanelCamposComprobanteFormaPago++;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFormaPago.add(this.jPaneltipoComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(iXPanelCamposComprobanteFormaPago % 3==0) {
		iXPanelCamposComprobanteFormaPago=0;
		iYPanelCamposComprobanteFormaPago++;
	}
	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFormaPago.gridy = iYPanelCamposComprobanteFormaPago;
	this.gridBagConstraintsComprobanteFormaPago.gridx = iXPanelCamposComprobanteFormaPago++;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFormaPago.add(this.jPanelvalorComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(iXPanelCamposComprobanteFormaPago % 3==0) {
		iXPanelCamposComprobanteFormaPago=0;
		iYPanelCamposComprobanteFormaPago++;
	}
	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFormaPago.gridy = iYPanelCamposComprobanteFormaPago;
	this.gridBagConstraintsComprobanteFormaPago.gridx = iXPanelCamposComprobanteFormaPago++;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFormaPago.add(this.jPanelfecha_forma_pagoComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(iXPanelCamposComprobanteFormaPago % 3==0) {
		iXPanelCamposComprobanteFormaPago=0;
		iYPanelCamposComprobanteFormaPago++;
	}
	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFormaPago.gridy = iYPanelCamposComprobanteFormaPago;
	this.gridBagConstraintsComprobanteFormaPago.gridx = iXPanelCamposComprobanteFormaPago++;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFormaPago.add(this.jPanelnumero_cuentaComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(iXPanelCamposComprobanteFormaPago % 3==0) {
		iXPanelCamposComprobanteFormaPago=0;
		iYPanelCamposComprobanteFormaPago++;
	}
	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFormaPago.gridy = iYPanelCamposComprobanteFormaPago;
	this.gridBagConstraintsComprobanteFormaPago.gridx = iXPanelCamposComprobanteFormaPago++;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFormaPago.add(this.jPanelnumero_chequeComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(iXPanelCamposComprobanteFormaPago % 3==0) {
		iXPanelCamposComprobanteFormaPago=0;
		iYPanelCamposComprobanteFormaPago++;
	}
	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFormaPago.gridy = iYPanelCamposComprobanteFormaPago;
	this.gridBagConstraintsComprobanteFormaPago.gridx = iXPanelCamposComprobanteFormaPago++;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFormaPago.add(this.jPanelgiradorComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(iXPanelCamposComprobanteFormaPago % 3==0) {
		iXPanelCamposComprobanteFormaPago=0;
		iYPanelCamposComprobanteFormaPago++;
	}
	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFormaPago.gridy = iYPanelCamposComprobanteFormaPago;
	this.gridBagConstraintsComprobanteFormaPago.gridx = iXPanelCamposComprobanteFormaPago++;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFormaPago.add(this.jPanelnumero_dias_plazoComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(iXPanelCamposComprobanteFormaPago % 3==0) {
		iXPanelCamposComprobanteFormaPago=0;
		iYPanelCamposComprobanteFormaPago++;
	}
	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFormaPago.gridy = iYPanelCamposComprobanteFormaPago;
	this.gridBagConstraintsComprobanteFormaPago.gridx = iXPanelCamposComprobanteFormaPago++;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFormaPago.add(this.jPanelnumero_tarjetaComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(iXPanelCamposComprobanteFormaPago % 3==0) {
		iXPanelCamposComprobanteFormaPago=0;
		iYPanelCamposComprobanteFormaPago++;
	}
	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFormaPago.gridy = iYPanelCamposComprobanteFormaPago;
	this.gridBagConstraintsComprobanteFormaPago.gridx = iXPanelCamposComprobanteFormaPago++;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFormaPago.add(this.jPanelautorizacionComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(iXPanelCamposComprobanteFormaPago % 3==0) {
		iXPanelCamposComprobanteFormaPago=0;
		iYPanelCamposComprobanteFormaPago++;
	}
	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFormaPago.gridy = iYPanelCamposComprobanteFormaPago;
	this.gridBagConstraintsComprobanteFormaPago.gridx = iXPanelCamposComprobanteFormaPago++;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFormaPago.add(this.jPanelloteComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(iXPanelCamposComprobanteFormaPago % 3==0) {
		iXPanelCamposComprobanteFormaPago=0;
		iYPanelCamposComprobanteFormaPago++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFormaPago.gridy = iYPanelCamposOcultosComprobanteFormaPago;
	this.gridBagConstraintsComprobanteFormaPago.gridx = iXPanelCamposOcultosComprobanteFormaPago++;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosComprobanteFormaPago.add(this.jPanelid_empresaComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(iXPanelCamposOcultosComprobanteFormaPago % 3==0) {
		iXPanelCamposOcultosComprobanteFormaPago=0;
		iYPanelCamposOcultosComprobanteFormaPago++;
	}
	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFormaPago.gridy = iYPanelCamposOcultosComprobanteFormaPago;
	this.gridBagConstraintsComprobanteFormaPago.gridx = iXPanelCamposOcultosComprobanteFormaPago++;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosComprobanteFormaPago.add(this.jPanelid_sucursalComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(iXPanelCamposOcultosComprobanteFormaPago % 3==0) {
		iXPanelCamposOcultosComprobanteFormaPago=0;
		iYPanelCamposOcultosComprobanteFormaPago++;
	}
	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFormaPago.gridy = iYPanelCamposOcultosComprobanteFormaPago;
	this.gridBagConstraintsComprobanteFormaPago.gridx = iXPanelCamposOcultosComprobanteFormaPago++;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosComprobanteFormaPago.add(this.jPanelid_clienteComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(iXPanelCamposOcultosComprobanteFormaPago % 3==0) {
		iXPanelCamposOcultosComprobanteFormaPago=0;
		iYPanelCamposOcultosComprobanteFormaPago++;
	}
	this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFormaPago.gridy = iYPanelCamposOcultosComprobanteFormaPago;
	this.gridBagConstraintsComprobanteFormaPago.gridx = iXPanelCamposOcultosComprobanteFormaPago++;
	this.gridBagConstraintsComprobanteFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosComprobanteFormaPago.add(this.jPanelid_cajaComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);



	if(iXPanelCamposOcultosComprobanteFormaPago % 3==0) {
		iXPanelCamposOcultosComprobanteFormaPago=0;
		iYPanelCamposOcultosComprobanteFormaPago++;
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
			
		GridBagLayout gridaBagLayoutAccionesComprobanteFormaPago= new GridBagLayout();
		this.jPanelAccionesComprobanteFormaPago.setLayout(gridaBagLayoutAccionesComprobanteFormaPago);
		
		GridBagLayout gridaBagLayoutAccionesFormularioComprobanteFormaPago= new GridBagLayout();
		this.jPanelAccionesFormularioComprobanteFormaPago.setLayout(gridaBagLayoutAccionesFormularioComprobanteFormaPago);
		
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsComprobanteFormaPago.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioComprobanteFormaPago.add(this.jComboBoxTiposAccionesFormularioComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
		this.gridBagConstraintsComprobanteFormaPago.gridx = iPosXAccion++;
			
		this.jPanelAccionesComprobanteFormaPago.add(this.jButtonModificarComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);							

		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
		this.gridBagConstraintsComprobanteFormaPago.gridx =iPosXAccion++;
			
		this.jPanelAccionesComprobanteFormaPago.add(this.jButtonEliminarComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
		
			
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.gridy = 0;		
		this.gridBagConstraintsComprobanteFormaPago.gridx = iPosXAccion++;
		
		this.jPanelAccionesComprobanteFormaPago.add(this.jButtonActualizarComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);


		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.gridy = 0;		
		this.gridBagConstraintsComprobanteFormaPago.gridx = iPosXAccion++;
		
		this.jPanelAccionesComprobanteFormaPago.add(this.jButtonGuardarCambiosComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);	
		
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.gridy = 0;		
		this.gridBagConstraintsComprobanteFormaPago.gridx =iPosXAccion++;
		
		this.jPanelAccionesComprobanteFormaPago.add(this.jButtonCancelarComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutComprobanteFormaPago = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutComprobanteFormaPago);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();						
			this.gridBagConstraintsComprobanteFormaPago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComprobanteFormaPago.gridx = 0;		
			//this.gridBagConstraintsComprobanteFormaPago.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsComprobanteFormaPago.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.gridy =iGridyPrincipal++;
		this.gridBagConstraintsComprobanteFormaPago.gridx =0;
		this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsComprobanteFormaPago.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ComprobanteFormaPagoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleComprobanteFormaPago = new ComprobanteFormaPagoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Comprobante Forma Pago DATOS");
			
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
			
	        //this.setTitle("[FOR] - Comprobante Forma Pago DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Comprobante Forma Pago Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ComprobanteFormaPagoModel comprobanteformapagoModel=new ComprobanteFormaPagoModel(this);
			
			//SI USARA CLASE INTERNA
			//ComprobanteFormaPagoModel.ComprobanteFormaPagoFocusTraversalPolicy comprobanteformapagoFocusTraversalPolicy = comprobanteformapagoModel.new ComprobanteFormaPagoFocusTraversalPolicy(this);
			
			//comprobanteformapagoFocusTraversalPolicy.setcomprobanteformapagoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(comprobanteformapagoModel);
			
			
			this.jContentPaneDetalleComprobanteFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleComprobanteFormaPago = new GridBagLayout();	
			this.jContentPaneDetalleComprobanteFormaPago.setLayout(gridaBagLayoutDetalleComprobanteFormaPago);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosComprobanteFormaPago = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
				this.gridBagConstraintsComprobanteFormaPago.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
					
				
				this.jContentPaneDetalleComprobanteFormaPago.add(jTtoolBarDetalleComprobanteFormaPago, gridBagConstraintsComprobanteFormaPago);								
				
}
			
			this.jScrollPanelDatosEdicionComprobanteFormaPago=   new JScrollPane(jContentPaneDetalleComprobanteFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionComprobanteFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComprobanteFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComprobanteFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralComprobanteFormaPago=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralComprobanteFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComprobanteFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComprobanteFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
			
			
	        this.gridBagConstraintsComprobanteFormaPago.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
	        
			this.jContentPaneDetalleComprobanteFormaPago.add(jPanelCamposComprobanteFormaPago, gridBagConstraintsComprobanteFormaPago);
			
			
			
			
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
						//&& comprobanteformapagoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.comprobanteformapagoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsComprobanteFormaPago= new GridBagConstraints();
						this.gridBagConstraintsComprobanteFormaPago.gridy = iGridyRelaciones++;
						this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
						this.jContentPaneDetalleComprobanteFormaPago.add(this.jTabbedPaneRelacionesComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesComprobanteFormaPago.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosComprobanteFormaPago.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
					this.gridBagConstraintsComprobanteFormaPago.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsComprobanteFormaPago.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
					
				
					this.jContentPaneDetalleComprobanteFormaPago.add(jPanelCamposOcultosComprobanteFormaPago, gridBagConstraintsComprobanteFormaPago);
				
					this.jPanelCamposOcultosComprobanteFormaPago.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFormaPago.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
	        this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleComprobanteFormaPago.add(this.jPanelAccionesFormularioComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);							
			
			
			
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
	        this.gridBagConstraintsComprobanteFormaPago.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
	        
			
			this.jContentPaneDetalleComprobanteFormaPago.add(this.jPanelAccionesComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionComprobanteFormaPago);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionComprobanteFormaPago=   new JScrollPane(this.jPanelCamposComprobanteFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionComprobanteFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComprobanteFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComprobanteFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFormaPago.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
			this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsComprobanteFormaPago.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFormaPago.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);			
			
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFormaPago.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
			
			
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
		
			
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsComprobanteFormaPago.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralComprobanteFormaPago;//jContentPane;
		
		return jScrollPanelDatosEdicionComprobanteFormaPago;
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
