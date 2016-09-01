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
import com.bydan.erp.puntoventa.util.report.ComprobanteTarjetaConstantesFunciones;

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
public class ComprobanteTarjetaDetalleFormJInternalFrame extends ComprobanteTarjetaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleComprobanteTarjeta;
	
	protected JMenuBar jmenuBarDetalleComprobanteTarjeta;
	
	protected JMenu jmenuDetalleComprobanteTarjeta;
	protected JMenu jmenuDetalleArchivoComprobanteTarjeta;
	protected JMenu jmenuDetalleAccionesComprobanteTarjeta;
	protected JMenu jmenuDetalleDatosComprobanteTarjeta;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleComprobanteTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutComprobanteTarjeta;	
	protected GridBagConstraints gridBagConstraintsComprobanteTarjeta;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ComprobanteTarjetaBeanSwingJInternalFrameAdditional jInternalFrameDetalleComprobanteTarjeta;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_caja="";
	
	public ComprobanteTarjetaSessionBean comprobantetarjetaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public CajaSessionBean cajaSessionBean;	
	
	public ComprobanteTarjetaLogic comprobantetarjetaLogic;
	
	public JScrollPane jScrollPanelDatosComprobanteTarjeta;
	public JScrollPane jScrollPanelDatosEdicionComprobanteTarjeta;
	public JScrollPane jScrollPanelDatosGeneralComprobanteTarjeta;
	
	protected JPanel jPanelCamposComprobanteTarjeta;    
	protected JPanel jPanelCamposOcultosComprobanteTarjeta;    	
	protected JPanel jPanelAccionesComprobanteTarjeta;
	protected JPanel jPanelAccionesFormularioComprobanteTarjeta;
    
	
	
	protected Integer iXPanelCamposComprobanteTarjeta=0;
	protected Integer iYPanelCamposComprobanteTarjeta=0;
	
	protected Integer iXPanelCamposOcultosComprobanteTarjeta=0;
	protected Integer iYPanelCamposOcultosComprobanteTarjeta=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoComprobanteTarjeta;
	public JButton jButtonModificarComprobanteTarjeta;
	public JButton jButtonActualizarComprobanteTarjeta;
    public JButton jButtonEliminarComprobanteTarjeta;
	public JButton jButtonCancelarComprobanteTarjeta;
    public JButton jButtonGuardarCambiosComprobanteTarjeta;
	public JButton jButtonGuardarCambiosTablaComprobanteTarjeta;
	protected JButton jButtonCerrarComprobanteTarjeta;
	
	
	protected JButton jButtonProcesarInformacionComprobanteTarjeta;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoComprobanteTarjeta;
	protected JCheckBox jCheckBoxPostAccionSinCerrarComprobanteTarjeta;
	protected JCheckBox jCheckBoxPostAccionSinMensajeComprobanteTarjeta;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarComprobanteTarjeta;
	protected JButton jButtonModificarToolBarComprobanteTarjeta;
	protected JButton jButtonActualizarToolBarComprobanteTarjeta;
    protected JButton jButtonEliminarToolBarComprobanteTarjeta;
	protected JButton jButtonCancelarToolBarComprobanteTarjeta;
    protected JButton jButtonGuardarCambiosToolBarComprobanteTarjeta;
	protected JButton jButtonGuardarCambiosTablaToolBarComprobanteTarjeta;
	protected JButton jButtonMostrarOcultarTablaToolBarComprobanteTarjeta;
	protected JButton jButtonCerrarToolBarComprobanteTarjeta;
	
	protected JButton jButtonProcesarInformacionToolBarComprobanteTarjeta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoComprobanteTarjeta;
	protected JMenuItem jMenuItemModificarComprobanteTarjeta;
	protected JMenuItem jMenuItemActualizarComprobanteTarjeta;
    protected JMenuItem jMenuItemEliminarComprobanteTarjeta;
	protected JMenuItem jMenuItemCancelarComprobanteTarjeta;
    protected JMenuItem jMenuItemGuardarCambiosComprobanteTarjeta;
	protected JMenuItem jMenuItemGuardarCambiosTablaComprobanteTarjeta;
	protected JMenuItem jMenuItemCerrarComprobanteTarjeta;
	protected JMenuItem jMenuItemDetalleCerrarComprobanteTarjeta;
	protected JMenuItem jMenuItemDetalleMostarOcultarComprobanteTarjeta;
	
	protected JMenuItem jMenuItemProcesarInformacionComprobanteTarjeta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosComprobanteTarjeta;
	protected JMenuItem jMenuItemMostrarOcultarComprobanteTarjeta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesComprobanteTarjeta;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesComprobanteTarjeta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesComprobanteTarjeta;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioComprobanteTarjeta;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidComprobanteTarjeta;
	public JLabel jLabelIdComprobanteTarjeta;
	public JLabel jLabelidComprobanteTarjeta;
	public JButton jButtonidComprobanteTarjetaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_inicioComprobanteTarjeta;
	public JLabel jLabelfecha_inicioComprobanteTarjeta;
	//public JFormattedTextField jDateChooserfecha_inicioComprobanteTarjeta;

	public JDateChooser jDateChooserfecha_inicioComprobanteTarjeta;
	public JButton jButtonfecha_inicioComprobanteTarjetaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finComprobanteTarjeta;
	public JLabel jLabelfecha_finComprobanteTarjeta;
	//public JFormattedTextField jDateChooserfecha_finComprobanteTarjeta;

	public JDateChooser jDateChooserfecha_finComprobanteTarjeta;
	public JButton jButtonfecha_finComprobanteTarjetaBusqueda= new JButtonMe();

	public JPanel jPanelnombre_cajaComprobanteTarjeta;
	public JLabel jLabelnombre_cajaComprobanteTarjeta;
	public JTextArea jTextAreanombre_cajaComprobanteTarjeta;
	public JScrollPane jscrollPanenombre_cajaComprobanteTarjeta;
	public JButton jButtonnombre_cajaComprobanteTarjetaBusqueda= new JButtonMe();

	public JPanel jPanelsecuencialComprobanteTarjeta;
	public JLabel jLabelsecuencialComprobanteTarjeta;
	public JTextField jTextFieldsecuencialComprobanteTarjeta;
	public JButton jButtonsecuencialComprobanteTarjetaBusqueda= new JButtonMe();

	public JPanel jPanelfechaComprobanteTarjeta;
	public JLabel jLabelfechaComprobanteTarjeta;
	//public JFormattedTextField jDateChooserfechaComprobanteTarjeta;

	public JDateChooser jDateChooserfechaComprobanteTarjeta;
	public JButton jButtonfechaComprobanteTarjetaBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_clienteComprobanteTarjeta;
	public JLabel jLabelcodigo_clienteComprobanteTarjeta;
	public JTextField jTextFieldcodigo_clienteComprobanteTarjeta;
	public JButton jButtoncodigo_clienteComprobanteTarjetaBusqueda= new JButtonMe();

	public JPanel jPanelnombre_clienteComprobanteTarjeta;
	public JLabel jLabelnombre_clienteComprobanteTarjeta;
	public JTextArea jTextAreanombre_clienteComprobanteTarjeta;
	public JScrollPane jscrollPanenombre_clienteComprobanteTarjeta;
	public JButton jButtonnombre_clienteComprobanteTarjetaBusqueda= new JButtonMe();

	public JPanel jPanelsubtotalComprobanteTarjeta;
	public JLabel jLabelsubtotalComprobanteTarjeta;
	public JTextField jTextFieldsubtotalComprobanteTarjeta;
	public JButton jButtonsubtotalComprobanteTarjetaBusqueda= new JButtonMe();

	public JPanel jPanelivaComprobanteTarjeta;
	public JLabel jLabelivaComprobanteTarjeta;
	public JTextField jTextFieldivaComprobanteTarjeta;
	public JButton jButtonivaComprobanteTarjetaBusqueda= new JButtonMe();

	public JPanel jPaneldescuentoComprobanteTarjeta;
	public JLabel jLabeldescuentoComprobanteTarjeta;
	public JTextField jTextFielddescuentoComprobanteTarjeta;
	public JButton jButtondescuentoComprobanteTarjetaBusqueda= new JButtonMe();

	public JPanel jPanelfinanciamientoComprobanteTarjeta;
	public JLabel jLabelfinanciamientoComprobanteTarjeta;
	public JTextField jTextFieldfinanciamientoComprobanteTarjeta;
	public JButton jButtonfinanciamientoComprobanteTarjetaBusqueda= new JButtonMe();

	public JPanel jPanelfleteComprobanteTarjeta;
	public JLabel jLabelfleteComprobanteTarjeta;
	public JTextField jTextFieldfleteComprobanteTarjeta;
	public JButton jButtonfleteComprobanteTarjetaBusqueda= new JButtonMe();

	public JPanel jPaneliceComprobanteTarjeta;
	public JLabel jLabeliceComprobanteTarjeta;
	public JTextField jTextFieldiceComprobanteTarjeta;
	public JButton jButtoniceComprobanteTarjetaBusqueda= new JButtonMe();

	public JPanel jPaneltotalComprobanteTarjeta;
	public JLabel jLabeltotalComprobanteTarjeta;
	public JTextField jTextFieldtotalComprobanteTarjeta;
	public JButton jButtontotalComprobanteTarjetaBusqueda= new JButtonMe();

	public JPanel jPanelvalorComprobanteTarjeta;
	public JLabel jLabelvalorComprobanteTarjeta;
	public JTextField jTextFieldvalorComprobanteTarjeta;
	public JButton jButtonvalorComprobanteTarjetaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_forma_pagoComprobanteTarjeta;
	public JLabel jLabelfecha_forma_pagoComprobanteTarjeta;
	//public JFormattedTextField jDateChooserfecha_forma_pagoComprobanteTarjeta;

	public JDateChooser jDateChooserfecha_forma_pagoComprobanteTarjeta;
	public JButton jButtonfecha_forma_pagoComprobanteTarjetaBusqueda= new JButtonMe();

	public JPanel jPanelnumeroComprobanteTarjeta;
	public JLabel jLabelnumeroComprobanteTarjeta;
	public JTextField jTextFieldnumeroComprobanteTarjeta;
	public JButton jButtonnumeroComprobanteTarjetaBusqueda= new JButtonMe();

	public JPanel jPaneltarjeta_habienteComprobanteTarjeta;
	public JLabel jLabeltarjeta_habienteComprobanteTarjeta;
	public JTextArea jTextAreatarjeta_habienteComprobanteTarjeta;
	public JScrollPane jscrollPanetarjeta_habienteComprobanteTarjeta;
	public JButton jButtontarjeta_habienteComprobanteTarjetaBusqueda= new JButtonMe();

	public JPanel jPanelautorizacionComprobanteTarjeta;
	public JLabel jLabelautorizacionComprobanteTarjeta;
	public JTextArea jTextAreaautorizacionComprobanteTarjeta;
	public JScrollPane jscrollPaneautorizacionComprobanteTarjeta;
	public JButton jButtonautorizacionComprobanteTarjetaBusqueda= new JButtonMe();

	public JPanel jPanelvoucherComprobanteTarjeta;
	public JLabel jLabelvoucherComprobanteTarjeta;
	public JTextField jTextFieldvoucherComprobanteTarjeta;
	public JButton jButtonvoucherComprobanteTarjetaBusqueda= new JButtonMe();

	public JPanel jPanelloteComprobanteTarjeta;
	public JLabel jLabelloteComprobanteTarjeta;
	public JTextField jTextFieldloteComprobanteTarjeta;
	public JButton jButtonloteComprobanteTarjetaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaComprobanteTarjeta;
	public JLabel jLabelid_empresaComprobanteTarjeta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaComprobanteTarjeta;
	public JButton jButtonid_empresaComprobanteTarjeta= new JButtonMe();
	public JButton jButtonid_empresaComprobanteTarjetaUpdate= new JButtonMe();
	public JButton jButtonid_empresaComprobanteTarjetaBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalComprobanteTarjeta;
	public JLabel jLabelid_sucursalComprobanteTarjeta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalComprobanteTarjeta;
	public JButton jButtonid_sucursalComprobanteTarjeta= new JButtonMe();
	public JButton jButtonid_sucursalComprobanteTarjetaUpdate= new JButtonMe();
	public JButton jButtonid_sucursalComprobanteTarjetaBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteComprobanteTarjeta;
	public JLabel jLabelid_clienteComprobanteTarjeta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteComprobanteTarjeta;
	public JButton jButtonid_clienteComprobanteTarjeta= new JButtonMe();
	public JButton jButtonid_clienteComprobanteTarjetaUpdate= new JButtonMe();
	public JButton jButtonid_clienteComprobanteTarjetaBusqueda= new JButtonMe();

	public JPanel jPanelid_cajaComprobanteTarjeta;
	public JLabel jLabelid_cajaComprobanteTarjeta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cajaComprobanteTarjeta;
	public JButton jButtonid_cajaComprobanteTarjeta= new JButtonMe();
	public JButton jButtonid_cajaComprobanteTarjetaUpdate= new JButtonMe();
	public JButton jButtonid_cajaComprobanteTarjetaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesComprobanteTarjeta;
	
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
	public int iHeightFormulario=696;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ComprobanteTarjetaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposComprobanteTarjeta=new JPanel();
				this.jPanelAccionesFormularioComprobanteTarjeta=new JPanel();
				this.jmenuBarDetalleComprobanteTarjeta=new JMenuBar();
				this.jTtoolBarDetalleComprobanteTarjeta=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComprobanteTarjetaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ComprobanteTarjeta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ComprobanteTarjetaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ComprobanteTarjeta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComprobanteTarjetaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComprobanteTarjeta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComprobanteTarjetaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComprobanteTarjeta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComprobanteTarjetaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ComprobanteTarjeta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarComprobanteTarjeta() {
		return this.jButtonActualizarToolBarComprobanteTarjeta;
	}
	
	public JButton getjButtonEliminarToolBarComprobanteTarjeta() {
		return this.jButtonEliminarToolBarComprobanteTarjeta;
	}
	
	public JButton getjButtonCancelarToolBarComprobanteTarjeta() {
		return this.jButtonCancelarToolBarComprobanteTarjeta;
	}		
	
	public JButton getjButtonProcesarInformacionComprobanteTarjeta() {
		return this.jButtonProcesarInformacionComprobanteTarjeta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionComprobanteTarjeta)	{
		this.jButtonProcesarInformacionComprobanteTarjeta = jButtonProcesarInformacionComprobanteTarjeta;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesComprobanteTarjeta() {
		return this.jComboBoxTiposAccionesComprobanteTarjeta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesComprobanteTarjeta(
			JComboBox jComboBoxTiposRelacionesComprobanteTarjeta) {
		this.jComboBoxTiposRelacionesComprobanteTarjeta = jComboBoxTiposRelacionesComprobanteTarjeta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesComprobanteTarjeta(
			JComboBox jComboBoxTiposAccionesComprobanteTarjeta) {
		this.jComboBoxTiposAccionesComprobanteTarjeta = jComboBoxTiposAccionesComprobanteTarjeta;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioComprobanteTarjeta() {
		return this.jComboBoxTiposAccionesFormularioComprobanteTarjeta;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioComprobanteTarjeta(
			JComboBox jComboBoxTiposAccionesFormularioComprobanteTarjeta) {
		this.jComboBoxTiposAccionesFormularioComprobanteTarjeta = jComboBoxTiposAccionesFormularioComprobanteTarjeta;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.comprobantetarjetaSessionBean=new ComprobanteTarjetaSessionBean();
		
		this.comprobantetarjetaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comprobantetarjetaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.comprobantetarjetaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ComprobanteTarjetaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ComprobanteTarjetaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ComprobanteTarjetaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Comprobante Tarjeta MANTENIMIENTO"));
		
		
		if(iWidth > 2350) {
			iWidth=2350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()) {
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
	
		ComprobanteTarjetaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleComprobanteTarjeta= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarComprobanteTarjeta=new JButtonMe();
				this.jButtonModificarToolBarComprobanteTarjeta=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarComprobanteTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarComprobanteTarjeta,this.jTtoolBarDetalleComprobanteTarjeta,
							"actualizar","actualizar","Actualizar"+" "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarComprobanteTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarComprobanteTarjeta,this.jTtoolBarDetalleComprobanteTarjeta,
							"eliminar","eliminar","Eliminar"+" "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarComprobanteTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarComprobanteTarjeta,this.jTtoolBarDetalleComprobanteTarjeta,
							"cancelar","cancelar","Cancelar"+" "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarComprobanteTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarComprobanteTarjeta,this.jTtoolBarDetalleComprobanteTarjeta,
							"guardarcambios","guardarcambios","Guardar"+" "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleComprobanteTarjeta=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleComprobanteTarjeta=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoComprobanteTarjeta=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesComprobanteTarjeta=new JMenuMe("Acciones");
		this.jmenuDetalleDatosComprobanteTarjeta=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoComprobanteTarjeta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoComprobanteTarjeta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoComprobanteTarjeta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarComprobanteTarjeta= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarComprobanteTarjeta.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarComprobanteTarjeta,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarComprobanteTarjeta= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarComprobanteTarjeta.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarComprobanteTarjeta,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarComprobanteTarjeta= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarComprobanteTarjeta.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarComprobanteTarjeta,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarComprobanteTarjeta= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarComprobanteTarjeta.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarComprobanteTarjeta,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosComprobanteTarjeta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosComprobanteTarjeta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosComprobanteTarjeta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarComprobanteTarjeta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarComprobanteTarjeta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarComprobanteTarjeta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarComprobanteTarjeta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarComprobanteTarjeta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarComprobanteTarjeta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarComprobanteTarjeta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarComprobanteTarjeta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarComprobanteTarjeta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarComprobanteTarjeta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarComprobanteTarjeta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarComprobanteTarjeta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoComprobanteTarjeta.add(this.jMenuItemDetalleCerrarComprobanteTarjeta);
		
		this.jmenuDetalleAccionesComprobanteTarjeta.add(this.jMenuItemActualizarComprobanteTarjeta);
		this.jmenuDetalleAccionesComprobanteTarjeta.add(this.jMenuItemEliminarComprobanteTarjeta);
		this.jmenuDetalleAccionesComprobanteTarjeta.add(this.jMenuItemCancelarComprobanteTarjeta);		
		
		//this.jmenuDetalleDatosComprobanteTarjeta.add(this.jMenuItemDetalleAbrirOrderByComprobanteTarjeta);				
		this.jmenuDetalleDatosComprobanteTarjeta.add(this.jMenuItemDetalleMostarOcultarComprobanteTarjeta);				
				
		//this.jmenuDetalleAccionesComprobanteTarjeta.add(this.jMenuItemGuardarCambiosComprobanteTarjeta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleComprobanteTarjeta.add(this.jmenuDetalleArchivoComprobanteTarjeta);		
		this.jmenuBarDetalleComprobanteTarjeta.add(this.jmenuDetalleAccionesComprobanteTarjeta);		
		this.jmenuBarDetalleComprobanteTarjeta.add(this.jmenuDetalleDatosComprobanteTarjeta);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleComprobanteTarjeta);				
	}
	
	
	public void inicializarElementosCamposComprobanteTarjeta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdComprobanteTarjeta = new JLabelMe();
		jLabelIdComprobanteTarjeta.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidComprobanteTarjeta = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidComprobanteTarjeta.setToolTipText(ComprobanteTarjetaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutComprobanteTarjeta= new GridBagLayout();

		this.jPanelidComprobanteTarjeta.setLayout(this.gridaBagLayoutComprobanteTarjeta);

		jLabelidComprobanteTarjeta = new JLabel();
		jLabelidComprobanteTarjeta.setText("Id");

		jLabelidComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_inicioComprobanteTarjeta = new JLabelMe();
		this.jLabelfecha_inicioComprobanteTarjeta.setText(""+ComprobanteTarjetaConstantesFunciones.LABEL_FECHAINICIO+" : *");
		this.jLabelfecha_inicioComprobanteTarjeta.setToolTipText("Fecha Inicio");
		this.jLabelfecha_inicioComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_inicioComprobanteTarjeta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_inicioComprobanteTarjeta.setToolTipText(ComprobanteTarjetaConstantesFunciones.LABEL_FECHAINICIO);
		this.gridaBagLayoutComprobanteTarjeta = new GridBagLayout();
		this.jPanelfecha_inicioComprobanteTarjeta.setLayout(this.gridaBagLayoutComprobanteTarjeta);


		//jFormattedTextFieldfecha_inicioComprobanteTarjeta= new JFormattedTextFieldMe();

		jDateChooserfecha_inicioComprobanteTarjeta= new JDateChooser();
		jDateChooserfecha_inicioComprobanteTarjeta.setEnabled(false);
		jDateChooserfecha_inicioComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_inicioComprobanteTarjeta.setDate(new Date());
		jDateChooserfecha_inicioComprobanteTarjeta.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_inicioComprobanteTarjeta.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_inicioComprobanteTarjetaBusqueda= new JButtonMe();
		this.jButtonfecha_inicioComprobanteTarjetaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioComprobanteTarjetaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioComprobanteTarjetaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_inicioComprobanteTarjetaBusqueda.setText("U");
		this.jButtonfecha_inicioComprobanteTarjetaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_inicioComprobanteTarjetaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_inicioComprobanteTarjetaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_inicioComprobanteTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_inicioComprobanteTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_inicioComprobanteTarjetaBusqueda"));

		if(this.comprobantetarjetaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_inicioComprobanteTarjetaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finComprobanteTarjeta = new JLabelMe();
		this.jLabelfecha_finComprobanteTarjeta.setText(""+ComprobanteTarjetaConstantesFunciones.LABEL_FECHAFIN+" : *");
		this.jLabelfecha_finComprobanteTarjeta.setToolTipText("Fecha Fin");
		this.jLabelfecha_finComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finComprobanteTarjeta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finComprobanteTarjeta.setToolTipText(ComprobanteTarjetaConstantesFunciones.LABEL_FECHAFIN);
		this.gridaBagLayoutComprobanteTarjeta = new GridBagLayout();
		this.jPanelfecha_finComprobanteTarjeta.setLayout(this.gridaBagLayoutComprobanteTarjeta);


		//jFormattedTextFieldfecha_finComprobanteTarjeta= new JFormattedTextFieldMe();

		jDateChooserfecha_finComprobanteTarjeta= new JDateChooser();
		jDateChooserfecha_finComprobanteTarjeta.setEnabled(false);
		jDateChooserfecha_finComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finComprobanteTarjeta.setDate(new Date());
		jDateChooserfecha_finComprobanteTarjeta.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finComprobanteTarjeta.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finComprobanteTarjetaBusqueda= new JButtonMe();
		this.jButtonfecha_finComprobanteTarjetaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finComprobanteTarjetaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finComprobanteTarjetaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finComprobanteTarjetaBusqueda.setText("U");
		this.jButtonfecha_finComprobanteTarjetaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finComprobanteTarjetaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finComprobanteTarjetaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finComprobanteTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finComprobanteTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finComprobanteTarjetaBusqueda"));

		if(this.comprobantetarjetaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finComprobanteTarjetaBusqueda.setVisible(false);		}


					
		this.jLabelnombre_cajaComprobanteTarjeta = new JLabelMe();
		this.jLabelnombre_cajaComprobanteTarjeta.setText(""+ComprobanteTarjetaConstantesFunciones.LABEL_NOMBRECAJA+" : *");
		this.jLabelnombre_cajaComprobanteTarjeta.setToolTipText("Nombre Caja");
		this.jLabelnombre_cajaComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_cajaComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_cajaComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_cajaComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_cajaComprobanteTarjeta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_cajaComprobanteTarjeta.setToolTipText(ComprobanteTarjetaConstantesFunciones.LABEL_NOMBRECAJA);
		this.gridaBagLayoutComprobanteTarjeta = new GridBagLayout();
		this.jPanelnombre_cajaComprobanteTarjeta.setLayout(this.gridaBagLayoutComprobanteTarjeta);


		jTextAreanombre_cajaComprobanteTarjeta= new JTextAreaMe();
		jTextAreanombre_cajaComprobanteTarjeta.setEnabled(false);
		jTextAreanombre_cajaComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cajaComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cajaComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cajaComprobanteTarjeta.setLineWrap(true);
		jTextAreanombre_cajaComprobanteTarjeta.setWrapStyleWord(true);
		jTextAreanombre_cajaComprobanteTarjeta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_cajaComprobanteTarjeta.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_cajaComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_cajaComprobanteTarjeta = new JScrollPane(jTextAreanombre_cajaComprobanteTarjeta);
		jscrollPanenombre_cajaComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_cajaComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_cajaComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_cajaComprobanteTarjetaBusqueda= new JButtonMe();
		this.jButtonnombre_cajaComprobanteTarjetaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cajaComprobanteTarjetaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cajaComprobanteTarjetaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_cajaComprobanteTarjetaBusqueda.setText("U");
		this.jButtonnombre_cajaComprobanteTarjetaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_cajaComprobanteTarjetaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_cajaComprobanteTarjetaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_cajaComprobanteTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_cajaComprobanteTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_cajaComprobanteTarjetaBusqueda"));

		if(this.comprobantetarjetaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_cajaComprobanteTarjetaBusqueda.setVisible(false);		}


					
		this.jLabelsecuencialComprobanteTarjeta = new JLabelMe();
		this.jLabelsecuencialComprobanteTarjeta.setText(""+ComprobanteTarjetaConstantesFunciones.LABEL_SECUENCIAL+" : *");
		this.jLabelsecuencialComprobanteTarjeta.setToolTipText("Secuencial");
		this.jLabelsecuencialComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencialComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencialComprobanteTarjeta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencialComprobanteTarjeta.setToolTipText(ComprobanteTarjetaConstantesFunciones.LABEL_SECUENCIAL);
		this.gridaBagLayoutComprobanteTarjeta = new GridBagLayout();
		this.jPanelsecuencialComprobanteTarjeta.setLayout(this.gridaBagLayoutComprobanteTarjeta);


		jTextFieldsecuencialComprobanteTarjeta= new JTextFieldMe();

		jTextFieldsecuencialComprobanteTarjeta.setEnabled(false);
		jTextFieldsecuencialComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencialComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencialComprobanteTarjetaBusqueda= new JButtonMe();
		this.jButtonsecuencialComprobanteTarjetaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialComprobanteTarjetaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialComprobanteTarjetaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencialComprobanteTarjetaBusqueda.setText("U");
		this.jButtonsecuencialComprobanteTarjetaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencialComprobanteTarjetaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencialComprobanteTarjetaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencialComprobanteTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencialComprobanteTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencialComprobanteTarjetaBusqueda"));

		if(this.comprobantetarjetaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencialComprobanteTarjetaBusqueda.setVisible(false);		}


					
		this.jLabelfechaComprobanteTarjeta = new JLabelMe();
		this.jLabelfechaComprobanteTarjeta.setText(""+ComprobanteTarjetaConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaComprobanteTarjeta.setToolTipText("Fecha");
		this.jLabelfechaComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaComprobanteTarjeta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaComprobanteTarjeta.setToolTipText(ComprobanteTarjetaConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutComprobanteTarjeta = new GridBagLayout();
		this.jPanelfechaComprobanteTarjeta.setLayout(this.gridaBagLayoutComprobanteTarjeta);


		//jFormattedTextFieldfechaComprobanteTarjeta= new JFormattedTextFieldMe();

		jDateChooserfechaComprobanteTarjeta= new JDateChooser();
		jDateChooserfechaComprobanteTarjeta.setEnabled(false);
		jDateChooserfechaComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaComprobanteTarjeta.setDate(new Date());
		jDateChooserfechaComprobanteTarjeta.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaComprobanteTarjeta.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaComprobanteTarjetaBusqueda= new JButtonMe();
		this.jButtonfechaComprobanteTarjetaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaComprobanteTarjetaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaComprobanteTarjetaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaComprobanteTarjetaBusqueda.setText("U");
		this.jButtonfechaComprobanteTarjetaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaComprobanteTarjetaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaComprobanteTarjetaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaComprobanteTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaComprobanteTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaComprobanteTarjetaBusqueda"));

		if(this.comprobantetarjetaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaComprobanteTarjetaBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_clienteComprobanteTarjeta = new JLabelMe();
		this.jLabelcodigo_clienteComprobanteTarjeta.setText(""+ComprobanteTarjetaConstantesFunciones.LABEL_CODIGOCLIENTE+" : *");
		this.jLabelcodigo_clienteComprobanteTarjeta.setToolTipText("Codigo Cliente");
		this.jLabelcodigo_clienteComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_clienteComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_clienteComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_clienteComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_clienteComprobanteTarjeta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_clienteComprobanteTarjeta.setToolTipText(ComprobanteTarjetaConstantesFunciones.LABEL_CODIGOCLIENTE);
		this.gridaBagLayoutComprobanteTarjeta = new GridBagLayout();
		this.jPanelcodigo_clienteComprobanteTarjeta.setLayout(this.gridaBagLayoutComprobanteTarjeta);


		jTextFieldcodigo_clienteComprobanteTarjeta= new JTextFieldMe();

		jTextFieldcodigo_clienteComprobanteTarjeta.setEnabled(false);
		jTextFieldcodigo_clienteComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_clienteComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_clienteComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_clienteComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_clienteComprobanteTarjetaBusqueda= new JButtonMe();
		this.jButtoncodigo_clienteComprobanteTarjetaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_clienteComprobanteTarjetaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_clienteComprobanteTarjetaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_clienteComprobanteTarjetaBusqueda.setText("U");
		this.jButtoncodigo_clienteComprobanteTarjetaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_clienteComprobanteTarjetaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_clienteComprobanteTarjetaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_clienteComprobanteTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_clienteComprobanteTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_clienteComprobanteTarjetaBusqueda"));

		if(this.comprobantetarjetaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_clienteComprobanteTarjetaBusqueda.setVisible(false);		}


					
		this.jLabelnombre_clienteComprobanteTarjeta = new JLabelMe();
		this.jLabelnombre_clienteComprobanteTarjeta.setText(""+ComprobanteTarjetaConstantesFunciones.LABEL_NOMBRECLIENTE+" : *");
		this.jLabelnombre_clienteComprobanteTarjeta.setToolTipText("Nombre Cliente");
		this.jLabelnombre_clienteComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clienteComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clienteComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_clienteComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_clienteComprobanteTarjeta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_clienteComprobanteTarjeta.setToolTipText(ComprobanteTarjetaConstantesFunciones.LABEL_NOMBRECLIENTE);
		this.gridaBagLayoutComprobanteTarjeta = new GridBagLayout();
		this.jPanelnombre_clienteComprobanteTarjeta.setLayout(this.gridaBagLayoutComprobanteTarjeta);


		jTextAreanombre_clienteComprobanteTarjeta= new JTextAreaMe();
		jTextAreanombre_clienteComprobanteTarjeta.setEnabled(false);
		jTextAreanombre_clienteComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteComprobanteTarjeta.setLineWrap(true);
		jTextAreanombre_clienteComprobanteTarjeta.setWrapStyleWord(true);
		jTextAreanombre_clienteComprobanteTarjeta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_clienteComprobanteTarjeta.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_clienteComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_clienteComprobanteTarjeta = new JScrollPane(jTextAreanombre_clienteComprobanteTarjeta);
		jscrollPanenombre_clienteComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_clienteComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_clienteComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_clienteComprobanteTarjetaBusqueda= new JButtonMe();
		this.jButtonnombre_clienteComprobanteTarjetaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clienteComprobanteTarjetaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clienteComprobanteTarjetaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_clienteComprobanteTarjetaBusqueda.setText("U");
		this.jButtonnombre_clienteComprobanteTarjetaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_clienteComprobanteTarjetaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_clienteComprobanteTarjetaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_clienteComprobanteTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_clienteComprobanteTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_clienteComprobanteTarjetaBusqueda"));

		if(this.comprobantetarjetaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_clienteComprobanteTarjetaBusqueda.setVisible(false);		}


					
		this.jLabelsubtotalComprobanteTarjeta = new JLabelMe();
		this.jLabelsubtotalComprobanteTarjeta.setText(""+ComprobanteTarjetaConstantesFunciones.LABEL_SUBTOTAL+" : *");
		this.jLabelsubtotalComprobanteTarjeta.setToolTipText("Subtotal");
		this.jLabelsubtotalComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsubtotalComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsubtotalComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsubtotalComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsubtotalComprobanteTarjeta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsubtotalComprobanteTarjeta.setToolTipText(ComprobanteTarjetaConstantesFunciones.LABEL_SUBTOTAL);
		this.gridaBagLayoutComprobanteTarjeta = new GridBagLayout();
		this.jPanelsubtotalComprobanteTarjeta.setLayout(this.gridaBagLayoutComprobanteTarjeta);


		jTextFieldsubtotalComprobanteTarjeta= new JTextFieldMe();
		jTextFieldsubtotalComprobanteTarjeta.setEnabled(false);
		jTextFieldsubtotalComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsubtotalComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsubtotalComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsubtotalComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsubtotalComprobanteTarjeta.setText("0.0");

		this.jButtonsubtotalComprobanteTarjetaBusqueda= new JButtonMe();
		this.jButtonsubtotalComprobanteTarjetaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsubtotalComprobanteTarjetaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsubtotalComprobanteTarjetaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsubtotalComprobanteTarjetaBusqueda.setText("U");
		this.jButtonsubtotalComprobanteTarjetaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsubtotalComprobanteTarjetaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsubtotalComprobanteTarjetaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsubtotalComprobanteTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsubtotalComprobanteTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"subtotalComprobanteTarjetaBusqueda"));

		if(this.comprobantetarjetaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsubtotalComprobanteTarjetaBusqueda.setVisible(false);		}


					
		this.jLabelivaComprobanteTarjeta = new JLabelMe();
		this.jLabelivaComprobanteTarjeta.setText(""+ComprobanteTarjetaConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaComprobanteTarjeta.setToolTipText("Iva");
		this.jLabelivaComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaComprobanteTarjeta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaComprobanteTarjeta.setToolTipText(ComprobanteTarjetaConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutComprobanteTarjeta = new GridBagLayout();
		this.jPanelivaComprobanteTarjeta.setLayout(this.gridaBagLayoutComprobanteTarjeta);


		jTextFieldivaComprobanteTarjeta= new JTextFieldMe();
		jTextFieldivaComprobanteTarjeta.setEnabled(false);
		jTextFieldivaComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaComprobanteTarjeta.setText("0.0");

		this.jButtonivaComprobanteTarjetaBusqueda= new JButtonMe();
		this.jButtonivaComprobanteTarjetaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaComprobanteTarjetaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaComprobanteTarjetaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaComprobanteTarjetaBusqueda.setText("U");
		this.jButtonivaComprobanteTarjetaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaComprobanteTarjetaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaComprobanteTarjetaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaComprobanteTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaComprobanteTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaComprobanteTarjetaBusqueda"));

		if(this.comprobantetarjetaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaComprobanteTarjetaBusqueda.setVisible(false);		}


					
		this.jLabeldescuentoComprobanteTarjeta = new JLabelMe();
		this.jLabeldescuentoComprobanteTarjeta.setText(""+ComprobanteTarjetaConstantesFunciones.LABEL_DESCUENTO+" : *");
		this.jLabeldescuentoComprobanteTarjeta.setToolTipText("Descuento");
		this.jLabeldescuentoComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuentoComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuentoComprobanteTarjeta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuentoComprobanteTarjeta.setToolTipText(ComprobanteTarjetaConstantesFunciones.LABEL_DESCUENTO);
		this.gridaBagLayoutComprobanteTarjeta = new GridBagLayout();
		this.jPaneldescuentoComprobanteTarjeta.setLayout(this.gridaBagLayoutComprobanteTarjeta);


		jTextFielddescuentoComprobanteTarjeta= new JTextFieldMe();
		jTextFielddescuentoComprobanteTarjeta.setEnabled(false);
		jTextFielddescuentoComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuentoComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuentoComprobanteTarjeta.setText("0.0");

		this.jButtondescuentoComprobanteTarjetaBusqueda= new JButtonMe();
		this.jButtondescuentoComprobanteTarjetaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoComprobanteTarjetaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoComprobanteTarjetaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuentoComprobanteTarjetaBusqueda.setText("U");
		this.jButtondescuentoComprobanteTarjetaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuentoComprobanteTarjetaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuentoComprobanteTarjetaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuentoComprobanteTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuentoComprobanteTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuentoComprobanteTarjetaBusqueda"));

		if(this.comprobantetarjetaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuentoComprobanteTarjetaBusqueda.setVisible(false);		}


					
		this.jLabelfinanciamientoComprobanteTarjeta = new JLabelMe();
		this.jLabelfinanciamientoComprobanteTarjeta.setText(""+ComprobanteTarjetaConstantesFunciones.LABEL_FINANCIAMIENTO+" : *");
		this.jLabelfinanciamientoComprobanteTarjeta.setToolTipText("Financiamiento");
		this.jLabelfinanciamientoComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfinanciamientoComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfinanciamientoComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfinanciamientoComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfinanciamientoComprobanteTarjeta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfinanciamientoComprobanteTarjeta.setToolTipText(ComprobanteTarjetaConstantesFunciones.LABEL_FINANCIAMIENTO);
		this.gridaBagLayoutComprobanteTarjeta = new GridBagLayout();
		this.jPanelfinanciamientoComprobanteTarjeta.setLayout(this.gridaBagLayoutComprobanteTarjeta);


		jTextFieldfinanciamientoComprobanteTarjeta= new JTextFieldMe();
		jTextFieldfinanciamientoComprobanteTarjeta.setEnabled(false);
		jTextFieldfinanciamientoComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfinanciamientoComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfinanciamientoComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfinanciamientoComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfinanciamientoComprobanteTarjeta.setText("0.0");

		this.jButtonfinanciamientoComprobanteTarjetaBusqueda= new JButtonMe();
		this.jButtonfinanciamientoComprobanteTarjetaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfinanciamientoComprobanteTarjetaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfinanciamientoComprobanteTarjetaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfinanciamientoComprobanteTarjetaBusqueda.setText("U");
		this.jButtonfinanciamientoComprobanteTarjetaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfinanciamientoComprobanteTarjetaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfinanciamientoComprobanteTarjetaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfinanciamientoComprobanteTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfinanciamientoComprobanteTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"financiamientoComprobanteTarjetaBusqueda"));

		if(this.comprobantetarjetaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfinanciamientoComprobanteTarjetaBusqueda.setVisible(false);		}


					
		this.jLabelfleteComprobanteTarjeta = new JLabelMe();
		this.jLabelfleteComprobanteTarjeta.setText(""+ComprobanteTarjetaConstantesFunciones.LABEL_FLETE+" : *");
		this.jLabelfleteComprobanteTarjeta.setToolTipText("Flete");
		this.jLabelfleteComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfleteComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfleteComprobanteTarjeta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfleteComprobanteTarjeta.setToolTipText(ComprobanteTarjetaConstantesFunciones.LABEL_FLETE);
		this.gridaBagLayoutComprobanteTarjeta = new GridBagLayout();
		this.jPanelfleteComprobanteTarjeta.setLayout(this.gridaBagLayoutComprobanteTarjeta);


		jTextFieldfleteComprobanteTarjeta= new JTextFieldMe();
		jTextFieldfleteComprobanteTarjeta.setEnabled(false);
		jTextFieldfleteComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfleteComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfleteComprobanteTarjeta.setText("0.0");

		this.jButtonfleteComprobanteTarjetaBusqueda= new JButtonMe();
		this.jButtonfleteComprobanteTarjetaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteComprobanteTarjetaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteComprobanteTarjetaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfleteComprobanteTarjetaBusqueda.setText("U");
		this.jButtonfleteComprobanteTarjetaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfleteComprobanteTarjetaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfleteComprobanteTarjetaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfleteComprobanteTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfleteComprobanteTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fleteComprobanteTarjetaBusqueda"));

		if(this.comprobantetarjetaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfleteComprobanteTarjetaBusqueda.setVisible(false);		}


					
		this.jLabeliceComprobanteTarjeta = new JLabelMe();
		this.jLabeliceComprobanteTarjeta.setText(""+ComprobanteTarjetaConstantesFunciones.LABEL_ICE+" : *");
		this.jLabeliceComprobanteTarjeta.setToolTipText("Ice");
		this.jLabeliceComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliceComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliceComprobanteTarjeta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliceComprobanteTarjeta.setToolTipText(ComprobanteTarjetaConstantesFunciones.LABEL_ICE);
		this.gridaBagLayoutComprobanteTarjeta = new GridBagLayout();
		this.jPaneliceComprobanteTarjeta.setLayout(this.gridaBagLayoutComprobanteTarjeta);


		jTextFieldiceComprobanteTarjeta= new JTextFieldMe();
		jTextFieldiceComprobanteTarjeta.setEnabled(false);
		jTextFieldiceComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiceComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiceComprobanteTarjeta.setText("0.0");

		this.jButtoniceComprobanteTarjetaBusqueda= new JButtonMe();
		this.jButtoniceComprobanteTarjetaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceComprobanteTarjetaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceComprobanteTarjetaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniceComprobanteTarjetaBusqueda.setText("U");
		this.jButtoniceComprobanteTarjetaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniceComprobanteTarjetaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniceComprobanteTarjetaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiceComprobanteTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiceComprobanteTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iceComprobanteTarjetaBusqueda"));

		if(this.comprobantetarjetaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniceComprobanteTarjetaBusqueda.setVisible(false);		}


					
		this.jLabeltotalComprobanteTarjeta = new JLabelMe();
		this.jLabeltotalComprobanteTarjeta.setText(""+ComprobanteTarjetaConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalComprobanteTarjeta.setToolTipText("Total");
		this.jLabeltotalComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalComprobanteTarjeta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalComprobanteTarjeta.setToolTipText(ComprobanteTarjetaConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutComprobanteTarjeta = new GridBagLayout();
		this.jPaneltotalComprobanteTarjeta.setLayout(this.gridaBagLayoutComprobanteTarjeta);


		jTextFieldtotalComprobanteTarjeta= new JTextFieldMe();
		jTextFieldtotalComprobanteTarjeta.setEnabled(false);
		jTextFieldtotalComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalComprobanteTarjeta.setText("0.0");

		this.jButtontotalComprobanteTarjetaBusqueda= new JButtonMe();
		this.jButtontotalComprobanteTarjetaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalComprobanteTarjetaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalComprobanteTarjetaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalComprobanteTarjetaBusqueda.setText("U");
		this.jButtontotalComprobanteTarjetaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalComprobanteTarjetaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalComprobanteTarjetaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalComprobanteTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalComprobanteTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalComprobanteTarjetaBusqueda"));

		if(this.comprobantetarjetaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalComprobanteTarjetaBusqueda.setVisible(false);		}


					
		this.jLabelvalorComprobanteTarjeta = new JLabelMe();
		this.jLabelvalorComprobanteTarjeta.setText(""+ComprobanteTarjetaConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorComprobanteTarjeta.setToolTipText("Valor");
		this.jLabelvalorComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorComprobanteTarjeta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorComprobanteTarjeta.setToolTipText(ComprobanteTarjetaConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutComprobanteTarjeta = new GridBagLayout();
		this.jPanelvalorComprobanteTarjeta.setLayout(this.gridaBagLayoutComprobanteTarjeta);


		jTextFieldvalorComprobanteTarjeta= new JTextFieldMe();
		jTextFieldvalorComprobanteTarjeta.setEnabled(false);
		jTextFieldvalorComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorComprobanteTarjeta.setText("0.0");

		this.jButtonvalorComprobanteTarjetaBusqueda= new JButtonMe();
		this.jButtonvalorComprobanteTarjetaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorComprobanteTarjetaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorComprobanteTarjetaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorComprobanteTarjetaBusqueda.setText("U");
		this.jButtonvalorComprobanteTarjetaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorComprobanteTarjetaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorComprobanteTarjetaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorComprobanteTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorComprobanteTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorComprobanteTarjetaBusqueda"));

		if(this.comprobantetarjetaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorComprobanteTarjetaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_forma_pagoComprobanteTarjeta = new JLabelMe();
		this.jLabelfecha_forma_pagoComprobanteTarjeta.setText(""+ComprobanteTarjetaConstantesFunciones.LABEL_FECHAFORMAPAGO+" : *");
		this.jLabelfecha_forma_pagoComprobanteTarjeta.setToolTipText("Fecha Forma Pago");
		this.jLabelfecha_forma_pagoComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_forma_pagoComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_forma_pagoComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_forma_pagoComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_forma_pagoComprobanteTarjeta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_forma_pagoComprobanteTarjeta.setToolTipText(ComprobanteTarjetaConstantesFunciones.LABEL_FECHAFORMAPAGO);
		this.gridaBagLayoutComprobanteTarjeta = new GridBagLayout();
		this.jPanelfecha_forma_pagoComprobanteTarjeta.setLayout(this.gridaBagLayoutComprobanteTarjeta);


		//jFormattedTextFieldfecha_forma_pagoComprobanteTarjeta= new JFormattedTextFieldMe();

		jDateChooserfecha_forma_pagoComprobanteTarjeta= new JDateChooser();
		jDateChooserfecha_forma_pagoComprobanteTarjeta.setEnabled(false);
		jDateChooserfecha_forma_pagoComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_forma_pagoComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_forma_pagoComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_forma_pagoComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_forma_pagoComprobanteTarjeta.setDate(new Date());
		jDateChooserfecha_forma_pagoComprobanteTarjeta.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_forma_pagoComprobanteTarjeta.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_forma_pagoComprobanteTarjetaBusqueda= new JButtonMe();
		this.jButtonfecha_forma_pagoComprobanteTarjetaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_forma_pagoComprobanteTarjetaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_forma_pagoComprobanteTarjetaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_forma_pagoComprobanteTarjetaBusqueda.setText("U");
		this.jButtonfecha_forma_pagoComprobanteTarjetaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_forma_pagoComprobanteTarjetaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_forma_pagoComprobanteTarjetaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_forma_pagoComprobanteTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_forma_pagoComprobanteTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_forma_pagoComprobanteTarjetaBusqueda"));

		if(this.comprobantetarjetaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_forma_pagoComprobanteTarjetaBusqueda.setVisible(false);		}


					
		this.jLabelnumeroComprobanteTarjeta = new JLabelMe();
		this.jLabelnumeroComprobanteTarjeta.setText(""+ComprobanteTarjetaConstantesFunciones.LABEL_NUMERO+" : *");
		this.jLabelnumeroComprobanteTarjeta.setToolTipText("Numero");
		this.jLabelnumeroComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumeroComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumeroComprobanteTarjeta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumeroComprobanteTarjeta.setToolTipText(ComprobanteTarjetaConstantesFunciones.LABEL_NUMERO);
		this.gridaBagLayoutComprobanteTarjeta = new GridBagLayout();
		this.jPanelnumeroComprobanteTarjeta.setLayout(this.gridaBagLayoutComprobanteTarjeta);


		jTextFieldnumeroComprobanteTarjeta= new JTextFieldMe();

		jTextFieldnumeroComprobanteTarjeta.setEnabled(false);
		jTextFieldnumeroComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumeroComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumeroComprobanteTarjetaBusqueda= new JButtonMe();
		this.jButtonnumeroComprobanteTarjetaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroComprobanteTarjetaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroComprobanteTarjetaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumeroComprobanteTarjetaBusqueda.setText("U");
		this.jButtonnumeroComprobanteTarjetaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumeroComprobanteTarjetaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumeroComprobanteTarjetaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumeroComprobanteTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumeroComprobanteTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numeroComprobanteTarjetaBusqueda"));

		if(this.comprobantetarjetaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumeroComprobanteTarjetaBusqueda.setVisible(false);		}


					
		this.jLabeltarjeta_habienteComprobanteTarjeta = new JLabelMe();
		this.jLabeltarjeta_habienteComprobanteTarjeta.setText(""+ComprobanteTarjetaConstantesFunciones.LABEL_TARJETAHABIENTE+" : *");
		this.jLabeltarjeta_habienteComprobanteTarjeta.setToolTipText("Tarjeta Habiente");
		this.jLabeltarjeta_habienteComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltarjeta_habienteComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltarjeta_habienteComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltarjeta_habienteComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltarjeta_habienteComprobanteTarjeta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltarjeta_habienteComprobanteTarjeta.setToolTipText(ComprobanteTarjetaConstantesFunciones.LABEL_TARJETAHABIENTE);
		this.gridaBagLayoutComprobanteTarjeta = new GridBagLayout();
		this.jPaneltarjeta_habienteComprobanteTarjeta.setLayout(this.gridaBagLayoutComprobanteTarjeta);


		jTextAreatarjeta_habienteComprobanteTarjeta= new JTextAreaMe();
		jTextAreatarjeta_habienteComprobanteTarjeta.setEnabled(false);
		jTextAreatarjeta_habienteComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatarjeta_habienteComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatarjeta_habienteComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatarjeta_habienteComprobanteTarjeta.setLineWrap(true);
		jTextAreatarjeta_habienteComprobanteTarjeta.setWrapStyleWord(true);
		jTextAreatarjeta_habienteComprobanteTarjeta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatarjeta_habienteComprobanteTarjeta.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreatarjeta_habienteComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetarjeta_habienteComprobanteTarjeta = new JScrollPane(jTextAreatarjeta_habienteComprobanteTarjeta);
		jscrollPanetarjeta_habienteComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanetarjeta_habienteComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanetarjeta_habienteComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtontarjeta_habienteComprobanteTarjetaBusqueda= new JButtonMe();
		this.jButtontarjeta_habienteComprobanteTarjetaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontarjeta_habienteComprobanteTarjetaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontarjeta_habienteComprobanteTarjetaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontarjeta_habienteComprobanteTarjetaBusqueda.setText("U");
		this.jButtontarjeta_habienteComprobanteTarjetaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontarjeta_habienteComprobanteTarjetaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontarjeta_habienteComprobanteTarjetaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatarjeta_habienteComprobanteTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatarjeta_habienteComprobanteTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tarjeta_habienteComprobanteTarjetaBusqueda"));

		if(this.comprobantetarjetaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontarjeta_habienteComprobanteTarjetaBusqueda.setVisible(false);		}


					
		this.jLabelautorizacionComprobanteTarjeta = new JLabelMe();
		this.jLabelautorizacionComprobanteTarjeta.setText(""+ComprobanteTarjetaConstantesFunciones.LABEL_AUTORIZACION+" : *");
		this.jLabelautorizacionComprobanteTarjeta.setToolTipText("Autorizacion");
		this.jLabelautorizacionComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelautorizacionComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelautorizacionComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelautorizacionComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelautorizacionComprobanteTarjeta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelautorizacionComprobanteTarjeta.setToolTipText(ComprobanteTarjetaConstantesFunciones.LABEL_AUTORIZACION);
		this.gridaBagLayoutComprobanteTarjeta = new GridBagLayout();
		this.jPanelautorizacionComprobanteTarjeta.setLayout(this.gridaBagLayoutComprobanteTarjeta);


		jTextAreaautorizacionComprobanteTarjeta= new JTextAreaMe();
		jTextAreaautorizacionComprobanteTarjeta.setEnabled(false);
		jTextAreaautorizacionComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaautorizacionComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaautorizacionComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaautorizacionComprobanteTarjeta.setLineWrap(true);
		jTextAreaautorizacionComprobanteTarjeta.setWrapStyleWord(true);
		jTextAreaautorizacionComprobanteTarjeta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaautorizacionComprobanteTarjeta.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaautorizacionComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneautorizacionComprobanteTarjeta = new JScrollPane(jTextAreaautorizacionComprobanteTarjeta);
		jscrollPaneautorizacionComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPaneautorizacionComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPaneautorizacionComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonautorizacionComprobanteTarjetaBusqueda= new JButtonMe();
		this.jButtonautorizacionComprobanteTarjetaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonautorizacionComprobanteTarjetaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonautorizacionComprobanteTarjetaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonautorizacionComprobanteTarjetaBusqueda.setText("U");
		this.jButtonautorizacionComprobanteTarjetaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonautorizacionComprobanteTarjetaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonautorizacionComprobanteTarjetaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaautorizacionComprobanteTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaautorizacionComprobanteTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"autorizacionComprobanteTarjetaBusqueda"));

		if(this.comprobantetarjetaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonautorizacionComprobanteTarjetaBusqueda.setVisible(false);		}


					
		this.jLabelvoucherComprobanteTarjeta = new JLabelMe();
		this.jLabelvoucherComprobanteTarjeta.setText(""+ComprobanteTarjetaConstantesFunciones.LABEL_VOUCHER+" : *");
		this.jLabelvoucherComprobanteTarjeta.setToolTipText("Voucher");
		this.jLabelvoucherComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvoucherComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvoucherComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvoucherComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvoucherComprobanteTarjeta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvoucherComprobanteTarjeta.setToolTipText(ComprobanteTarjetaConstantesFunciones.LABEL_VOUCHER);
		this.gridaBagLayoutComprobanteTarjeta = new GridBagLayout();
		this.jPanelvoucherComprobanteTarjeta.setLayout(this.gridaBagLayoutComprobanteTarjeta);


		jTextFieldvoucherComprobanteTarjeta= new JTextFieldMe();

		jTextFieldvoucherComprobanteTarjeta.setEnabled(false);
		jTextFieldvoucherComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvoucherComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvoucherComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvoucherComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonvoucherComprobanteTarjetaBusqueda= new JButtonMe();
		this.jButtonvoucherComprobanteTarjetaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvoucherComprobanteTarjetaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvoucherComprobanteTarjetaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvoucherComprobanteTarjetaBusqueda.setText("U");
		this.jButtonvoucherComprobanteTarjetaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvoucherComprobanteTarjetaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvoucherComprobanteTarjetaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvoucherComprobanteTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvoucherComprobanteTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"voucherComprobanteTarjetaBusqueda"));

		if(this.comprobantetarjetaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvoucherComprobanteTarjetaBusqueda.setVisible(false);		}


					
		this.jLabelloteComprobanteTarjeta = new JLabelMe();
		this.jLabelloteComprobanteTarjeta.setText(""+ComprobanteTarjetaConstantesFunciones.LABEL_LOTE+" : *");
		this.jLabelloteComprobanteTarjeta.setToolTipText("Lote");
		this.jLabelloteComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelloteComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelloteComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelloteComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelloteComprobanteTarjeta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelloteComprobanteTarjeta.setToolTipText(ComprobanteTarjetaConstantesFunciones.LABEL_LOTE);
		this.gridaBagLayoutComprobanteTarjeta = new GridBagLayout();
		this.jPanelloteComprobanteTarjeta.setLayout(this.gridaBagLayoutComprobanteTarjeta);


		jTextFieldloteComprobanteTarjeta= new JTextFieldMe();

		jTextFieldloteComprobanteTarjeta.setEnabled(false);
		jTextFieldloteComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldloteComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldloteComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldloteComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonloteComprobanteTarjetaBusqueda= new JButtonMe();
		this.jButtonloteComprobanteTarjetaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonloteComprobanteTarjetaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonloteComprobanteTarjetaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonloteComprobanteTarjetaBusqueda.setText("U");
		this.jButtonloteComprobanteTarjetaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonloteComprobanteTarjetaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonloteComprobanteTarjetaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldloteComprobanteTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldloteComprobanteTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"loteComprobanteTarjetaBusqueda"));

		if(this.comprobantetarjetaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonloteComprobanteTarjetaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysComprobanteTarjeta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaComprobanteTarjeta = new JLabelMe();
		this.jLabelid_empresaComprobanteTarjeta.setText(""+ComprobanteTarjetaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaComprobanteTarjeta.setToolTipText("Empresa");
		this.jLabelid_empresaComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaComprobanteTarjeta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaComprobanteTarjeta.setToolTipText(ComprobanteTarjetaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutComprobanteTarjeta = new GridBagLayout();
		this.jPanelid_empresaComprobanteTarjeta.setLayout(this.gridaBagLayoutComprobanteTarjeta);


		jComboBoxid_empresaComprobanteTarjeta= new JComboBoxMe();
		jComboBoxid_empresaComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaComprobanteTarjeta.setEnabled(false);

		this.jButtonid_empresaComprobanteTarjeta= new JButtonMe();
		this.jButtonid_empresaComprobanteTarjeta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComprobanteTarjeta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComprobanteTarjeta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComprobanteTarjeta.setText("Buscar");
		this.jButtonid_empresaComprobanteTarjeta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaComprobanteTarjeta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComprobanteTarjeta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaComprobanteTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComprobanteTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComprobanteTarjeta"));

		this.jButtonid_empresaComprobanteTarjetaBusqueda= new JButtonMe();
		this.jButtonid_empresaComprobanteTarjetaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComprobanteTarjetaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComprobanteTarjetaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaComprobanteTarjetaBusqueda.setText("U");
		this.jButtonid_empresaComprobanteTarjetaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaComprobanteTarjetaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComprobanteTarjetaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaComprobanteTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComprobanteTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComprobanteTarjetaBusqueda"));

		if(this.comprobantetarjetaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaComprobanteTarjetaBusqueda.setVisible(false);		}

		this.jButtonid_empresaComprobanteTarjetaUpdate= new JButtonMe();
		this.jButtonid_empresaComprobanteTarjetaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComprobanteTarjetaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComprobanteTarjetaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaComprobanteTarjetaUpdate.setText("U");
		this.jButtonid_empresaComprobanteTarjetaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaComprobanteTarjetaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComprobanteTarjetaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaComprobanteTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComprobanteTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComprobanteTarjetaUpdate"));



					
		this.jLabelid_sucursalComprobanteTarjeta = new JLabelMe();
		this.jLabelid_sucursalComprobanteTarjeta.setText(""+ComprobanteTarjetaConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalComprobanteTarjeta.setToolTipText("Sucursal");
		this.jLabelid_sucursalComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalComprobanteTarjeta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalComprobanteTarjeta.setToolTipText(ComprobanteTarjetaConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutComprobanteTarjeta = new GridBagLayout();
		this.jPanelid_sucursalComprobanteTarjeta.setLayout(this.gridaBagLayoutComprobanteTarjeta);


		jComboBoxid_sucursalComprobanteTarjeta= new JComboBoxMe();
		jComboBoxid_sucursalComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalComprobanteTarjeta.setEnabled(false);

		this.jButtonid_sucursalComprobanteTarjeta= new JButtonMe();
		this.jButtonid_sucursalComprobanteTarjeta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalComprobanteTarjeta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalComprobanteTarjeta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalComprobanteTarjeta.setText("Buscar");
		this.jButtonid_sucursalComprobanteTarjeta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalComprobanteTarjeta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalComprobanteTarjeta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalComprobanteTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalComprobanteTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalComprobanteTarjeta"));

		this.jButtonid_sucursalComprobanteTarjetaBusqueda= new JButtonMe();
		this.jButtonid_sucursalComprobanteTarjetaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalComprobanteTarjetaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalComprobanteTarjetaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalComprobanteTarjetaBusqueda.setText("U");
		this.jButtonid_sucursalComprobanteTarjetaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalComprobanteTarjetaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalComprobanteTarjetaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalComprobanteTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalComprobanteTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalComprobanteTarjetaBusqueda"));

		if(this.comprobantetarjetaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalComprobanteTarjetaBusqueda.setVisible(false);		}

		this.jButtonid_sucursalComprobanteTarjetaUpdate= new JButtonMe();
		this.jButtonid_sucursalComprobanteTarjetaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalComprobanteTarjetaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalComprobanteTarjetaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalComprobanteTarjetaUpdate.setText("U");
		this.jButtonid_sucursalComprobanteTarjetaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalComprobanteTarjetaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalComprobanteTarjetaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalComprobanteTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalComprobanteTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalComprobanteTarjetaUpdate"));



					
		this.jLabelid_clienteComprobanteTarjeta = new JLabelMe();
		this.jLabelid_clienteComprobanteTarjeta.setText(""+ComprobanteTarjetaConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteComprobanteTarjeta.setToolTipText("Cliente");
		this.jLabelid_clienteComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteComprobanteTarjeta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteComprobanteTarjeta.setToolTipText(ComprobanteTarjetaConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutComprobanteTarjeta = new GridBagLayout();
		this.jPanelid_clienteComprobanteTarjeta.setLayout(this.gridaBagLayoutComprobanteTarjeta);


		jComboBoxid_clienteComprobanteTarjeta= new JComboBoxMe();
		jComboBoxid_clienteComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_clienteComprobanteTarjeta.setEnabled(false);

		this.jButtonid_clienteComprobanteTarjeta= new JButtonMe();
		this.jButtonid_clienteComprobanteTarjeta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteComprobanteTarjeta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteComprobanteTarjeta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteComprobanteTarjeta.setText("Buscar");
		this.jButtonid_clienteComprobanteTarjeta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteComprobanteTarjeta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteComprobanteTarjeta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteComprobanteTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteComprobanteTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteComprobanteTarjeta"));

		this.jButtonid_clienteComprobanteTarjetaBusqueda= new JButtonMe();
		this.jButtonid_clienteComprobanteTarjetaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteComprobanteTarjetaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteComprobanteTarjetaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteComprobanteTarjetaBusqueda.setText("U");
		this.jButtonid_clienteComprobanteTarjetaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteComprobanteTarjetaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteComprobanteTarjetaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteComprobanteTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteComprobanteTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteComprobanteTarjetaBusqueda"));

		if(this.comprobantetarjetaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteComprobanteTarjetaBusqueda.setVisible(false);		}

		this.jButtonid_clienteComprobanteTarjetaUpdate= new JButtonMe();
		this.jButtonid_clienteComprobanteTarjetaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteComprobanteTarjetaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteComprobanteTarjetaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteComprobanteTarjetaUpdate.setText("U");
		this.jButtonid_clienteComprobanteTarjetaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteComprobanteTarjetaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteComprobanteTarjetaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteComprobanteTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteComprobanteTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteComprobanteTarjetaUpdate"));



					
		this.jLabelid_cajaComprobanteTarjeta = new JLabelMe();
		this.jLabelid_cajaComprobanteTarjeta.setText(""+ComprobanteTarjetaConstantesFunciones.LABEL_IDCAJA+" : *");
		this.jLabelid_cajaComprobanteTarjeta.setToolTipText("Caja");
		this.jLabelid_cajaComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cajaComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cajaComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cajaComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cajaComprobanteTarjeta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cajaComprobanteTarjeta.setToolTipText(ComprobanteTarjetaConstantesFunciones.LABEL_IDCAJA);
		this.gridaBagLayoutComprobanteTarjeta = new GridBagLayout();
		this.jPanelid_cajaComprobanteTarjeta.setLayout(this.gridaBagLayoutComprobanteTarjeta);


		jComboBoxid_cajaComprobanteTarjeta= new JComboBoxMe();
		jComboBoxid_cajaComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cajaComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_cajaComprobanteTarjeta.setEnabled(false);

		this.jButtonid_cajaComprobanteTarjeta= new JButtonMe();
		this.jButtonid_cajaComprobanteTarjeta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaComprobanteTarjeta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaComprobanteTarjeta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaComprobanteTarjeta.setText("Buscar");
		this.jButtonid_cajaComprobanteTarjeta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cajaComprobanteTarjeta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaComprobanteTarjeta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cajaComprobanteTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaComprobanteTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaComprobanteTarjeta"));

		this.jButtonid_cajaComprobanteTarjetaBusqueda= new JButtonMe();
		this.jButtonid_cajaComprobanteTarjetaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaComprobanteTarjetaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaComprobanteTarjetaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cajaComprobanteTarjetaBusqueda.setText("U");
		this.jButtonid_cajaComprobanteTarjetaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cajaComprobanteTarjetaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaComprobanteTarjetaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cajaComprobanteTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaComprobanteTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaComprobanteTarjetaBusqueda"));

		if(this.comprobantetarjetaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cajaComprobanteTarjetaBusqueda.setVisible(false);		}

		this.jButtonid_cajaComprobanteTarjetaUpdate= new JButtonMe();
		this.jButtonid_cajaComprobanteTarjetaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaComprobanteTarjetaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaComprobanteTarjetaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cajaComprobanteTarjetaUpdate.setText("U");
		this.jButtonid_cajaComprobanteTarjetaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cajaComprobanteTarjetaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaComprobanteTarjetaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cajaComprobanteTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaComprobanteTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaComprobanteTarjetaUpdate"));



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
		//this.jInternalFrameDetalleComprobanteTarjeta = new ComprobanteTarjetaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Comprobante Tarjeta DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutComprobanteTarjeta= new GridBagLayout();
		

		
		String sToolTipComprobanteTarjeta="";
		sToolTipComprobanteTarjeta=ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipComprobanteTarjeta+="(PuntoVenta.ComprobanteTarjeta)";
		}
		
		if(!this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()) {
			sToolTipComprobanteTarjeta+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoComprobanteTarjeta = new JButtonMe();
		this.jButtonModificarComprobanteTarjeta = new JButtonMe();
        this.jButtonActualizarComprobanteTarjeta = new JButtonMe();
        this.jButtonEliminarComprobanteTarjeta = new JButtonMe();
        this.jButtonCancelarComprobanteTarjeta = new JButtonMe();
        this.jButtonGuardarCambiosComprobanteTarjeta = new JButtonMe();
		this.jButtonGuardarCambiosTablaComprobanteTarjeta = new JButtonMe();
		this.jButtonCerrarComprobanteTarjeta = new JButtonMe();
		
		this.jScrollPanelDatosComprobanteTarjeta = new JScrollPane();   
        this.jScrollPanelDatosEdicionComprobanteTarjeta = new JScrollPane();
		this.jScrollPanelDatosGeneralComprobanteTarjeta = new JScrollPane();
				
		
		
		this.jPanelCamposComprobanteTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosComprobanteTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesComprobanteTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioComprobanteTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Comprobante Tarjeta";
		
		if(!this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosComprobanteTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comprobante Tarjetas" + this.sPath));
		} else {
			this.jScrollPanelDatosComprobanteTarjeta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionComprobanteTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralComprobanteTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposComprobanteTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposComprobanteTarjeta.setName("jPanelCamposComprobanteTarjeta"); 

		this.jPanelCamposOcultosComprobanteTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosComprobanteTarjeta.setName("jPanelCamposOcultosComprobanteTarjeta"); 

        this.jPanelAccionesComprobanteTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesComprobanteTarjeta.setToolTipText("Acciones");
        this.jPanelAccionesComprobanteTarjeta.setName("Acciones"); 

		this.jPanelAccionesFormularioComprobanteTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioComprobanteTarjeta.setToolTipText("Acciones");
        this.jPanelAccionesFormularioComprobanteTarjeta.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoComprobanteTarjeta.setText("Nuevo");
		this.jButtonModificarComprobanteTarjeta.setText("Editar");
        this.jButtonActualizarComprobanteTarjeta.setText("Actualizar");
        this.jButtonEliminarComprobanteTarjeta.setText("Eliminar");
        this.jButtonCancelarComprobanteTarjeta.setText("Cancelar");
        this.jButtonGuardarCambiosComprobanteTarjeta.setText("Guardar");
		this.jButtonGuardarCambiosTablaComprobanteTarjeta.setText("Guardar");
		this.jButtonCerrarComprobanteTarjeta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoComprobanteTarjeta,"nuevo_button","Nuevo",this.comprobantetarjetaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarComprobanteTarjeta,"modificar_button","Editar",this.comprobantetarjetaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarComprobanteTarjeta,"actualizar_button","Actualizar",this.comprobantetarjetaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarComprobanteTarjeta,"eliminar_button","Eliminar",this.comprobantetarjetaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarComprobanteTarjeta,"cancelar_button","Cancelar",this.comprobantetarjetaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosComprobanteTarjeta,"guardarcambios_button","Guardar",this.comprobantetarjetaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaComprobanteTarjeta,"guardarcambiostabla_button","Guardar",this.comprobantetarjetaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarComprobanteTarjeta,"cerrar_button","Salir",this.comprobantetarjetaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoComprobanteTarjeta.setToolTipText("Nuevo"+" "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarComprobanteTarjeta.setToolTipText("Editar"+" "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarComprobanteTarjeta.setToolTipText("Actualizar"+" "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarComprobanteTarjeta.setToolTipText("Eliminar)"+" "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarComprobanteTarjeta.setToolTipText("Cancelar"+" "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosComprobanteTarjeta.setToolTipText("Guardar"+" "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaComprobanteTarjeta.setToolTipText("Guardar"+" "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarComprobanteTarjeta.setToolTipText("Salir"+" "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoComprobanteTarjeta";
		inputMap = this.jButtonNuevoComprobanteTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoComprobanteTarjeta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoComprobanteTarjeta"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarComprobanteTarjeta";
		inputMap = this.jButtonActualizarComprobanteTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarComprobanteTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarComprobanteTarjeta"));
		
		//ELIMINAR
		sMapKey = "EliminarComprobanteTarjeta";
		inputMap = this.jButtonEliminarComprobanteTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarComprobanteTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarComprobanteTarjeta"));
		
		//CANCELAR	
		sMapKey = "CancelarComprobanteTarjeta";
		inputMap = this.jButtonCancelarComprobanteTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarComprobanteTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarComprobanteTarjeta"));
		
		//CERRAR		
		sMapKey = "CerrarComprobanteTarjeta";
		inputMap = this.jButtonCerrarComprobanteTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarComprobanteTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarComprobanteTarjeta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaComprobanteTarjeta";
		inputMap = this.jButtonGuardarCambiosTablaComprobanteTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaComprobanteTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaComprobanteTarjeta"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoComprobanteTarjeta = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoComprobanteTarjeta.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoComprobanteTarjeta.setToolTipText("Nuevo ComprobanteTarjeta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarComprobanteTarjeta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarComprobanteTarjeta.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarComprobanteTarjeta.setToolTipText("Sin Cerrar Ventana ComprobanteTarjeta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeComprobanteTarjeta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeComprobanteTarjeta.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeComprobanteTarjeta.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesComprobanteTarjeta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesComprobanteTarjeta.setText("Accion");
		this.jComboBoxTiposAccionesComprobanteTarjeta.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioComprobanteTarjeta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioComprobanteTarjeta.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioComprobanteTarjeta.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesComprobanteTarjeta = new JLabelMe();
		
		this.jLabelAccionesComprobanteTarjeta.setText("Acciones");		
		this.jLabelAccionesComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposComprobanteTarjeta();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysComprobanteTarjeta();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesComprobanteTarjeta=new JTabbedPane();
		this.jTabbedPaneRelacionesComprobanteTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesComprobanteTarjeta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComprobanteTarjeta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComprobanteTarjeta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioComprobanteTarjeta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioComprobanteTarjeta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioComprobanteTarjeta.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposComprobanteTarjeta = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosComprobanteTarjeta = new GridBagLayout();
		
		this.jPanelCamposComprobanteTarjeta.setLayout(gridaBagLayoutCamposComprobanteTarjeta);
		this.jPanelCamposOcultosComprobanteTarjeta.setLayout(gridaBagLayoutCamposOcultosComprobanteTarjeta);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidComprobanteTarjeta.add(jLabelIdComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 1;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidComprobanteTarjeta.add(jLabelidComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);


	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaComprobanteTarjeta.add(jLabelid_empresaComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
		this.gridBagConstraintsComprobanteTarjeta.gridx = 2;
		this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
		this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaComprobanteTarjeta.add(jButtonid_empresaComprobanteTarjetaBusqueda, this.gridBagConstraintsComprobanteTarjeta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
		this.gridBagConstraintsComprobanteTarjeta.gridx = 3;
		this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
		this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaComprobanteTarjeta.add(jButtonid_empresaComprobanteTarjetaUpdate, this.gridBagConstraintsComprobanteTarjeta);
	}

	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 1;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaComprobanteTarjeta.add(jComboBoxid_empresaComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);


	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalComprobanteTarjeta.add(jLabelid_sucursalComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
		this.gridBagConstraintsComprobanteTarjeta.gridx = 2;
		this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
		this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalComprobanteTarjeta.add(jButtonid_sucursalComprobanteTarjetaBusqueda, this.gridBagConstraintsComprobanteTarjeta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
		this.gridBagConstraintsComprobanteTarjeta.gridx = 3;
		this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
		this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalComprobanteTarjeta.add(jButtonid_sucursalComprobanteTarjetaUpdate, this.gridBagConstraintsComprobanteTarjeta);
	}

	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 1;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalComprobanteTarjeta.add(jComboBoxid_sucursalComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);


	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteComprobanteTarjeta.add(jLabelid_clienteComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
		this.gridBagConstraintsComprobanteTarjeta.gridx = 2;
		this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
		this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteComprobanteTarjeta.add(jButtonid_clienteComprobanteTarjetaBusqueda, this.gridBagConstraintsComprobanteTarjeta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
		this.gridBagConstraintsComprobanteTarjeta.gridx = 3;
		this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
		this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteComprobanteTarjeta.add(jButtonid_clienteComprobanteTarjetaUpdate, this.gridBagConstraintsComprobanteTarjeta);
	}

	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 1;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteComprobanteTarjeta.add(jComboBoxid_clienteComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);


	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cajaComprobanteTarjeta.add(jLabelid_cajaComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
		this.gridBagConstraintsComprobanteTarjeta.gridx = 2;
		this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
		this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cajaComprobanteTarjeta.add(jButtonid_cajaComprobanteTarjetaBusqueda, this.gridBagConstraintsComprobanteTarjeta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
		this.gridBagConstraintsComprobanteTarjeta.gridx = 3;
		this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
		this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cajaComprobanteTarjeta.add(jButtonid_cajaComprobanteTarjetaUpdate, this.gridBagConstraintsComprobanteTarjeta);
	}

	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 1;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cajaComprobanteTarjeta.add(jComboBoxid_cajaComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);


	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_inicioComprobanteTarjeta.add(jLabelfecha_inicioComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
		this.gridBagConstraintsComprobanteTarjeta.gridx = 2;
		this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
		this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_inicioComprobanteTarjeta.add(jButtonfecha_inicioComprobanteTarjetaBusqueda, this.gridBagConstraintsComprobanteTarjeta);
	}

	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 1;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_inicioComprobanteTarjeta.add(jDateChooserfecha_inicioComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);


	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_finComprobanteTarjeta.add(jLabelfecha_finComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
		this.gridBagConstraintsComprobanteTarjeta.gridx = 2;
		this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
		this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finComprobanteTarjeta.add(jButtonfecha_finComprobanteTarjetaBusqueda, this.gridBagConstraintsComprobanteTarjeta);
	}

	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 1;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_finComprobanteTarjeta.add(jDateChooserfecha_finComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);


	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_cajaComprobanteTarjeta.add(jLabelnombre_cajaComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
		this.gridBagConstraintsComprobanteTarjeta.gridx = 2;
		this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
		this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_cajaComprobanteTarjeta.add(jButtonnombre_cajaComprobanteTarjetaBusqueda, this.gridBagConstraintsComprobanteTarjeta);
	}

	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 1;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_cajaComprobanteTarjeta.add(jscrollPanenombre_cajaComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);


	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencialComprobanteTarjeta.add(jLabelsecuencialComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
		this.gridBagConstraintsComprobanteTarjeta.gridx = 2;
		this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
		this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencialComprobanteTarjeta.add(jButtonsecuencialComprobanteTarjetaBusqueda, this.gridBagConstraintsComprobanteTarjeta);
	}

	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 1;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencialComprobanteTarjeta.add(jTextFieldsecuencialComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);


	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaComprobanteTarjeta.add(jLabelfechaComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
		this.gridBagConstraintsComprobanteTarjeta.gridx = 2;
		this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
		this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaComprobanteTarjeta.add(jButtonfechaComprobanteTarjetaBusqueda, this.gridBagConstraintsComprobanteTarjeta);
	}

	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 1;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaComprobanteTarjeta.add(jDateChooserfechaComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);


	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_clienteComprobanteTarjeta.add(jLabelcodigo_clienteComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
		this.gridBagConstraintsComprobanteTarjeta.gridx = 2;
		this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
		this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_clienteComprobanteTarjeta.add(jButtoncodigo_clienteComprobanteTarjetaBusqueda, this.gridBagConstraintsComprobanteTarjeta);
	}

	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 1;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_clienteComprobanteTarjeta.add(jTextFieldcodigo_clienteComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);


	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_clienteComprobanteTarjeta.add(jLabelnombre_clienteComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
		this.gridBagConstraintsComprobanteTarjeta.gridx = 2;
		this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
		this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_clienteComprobanteTarjeta.add(jButtonnombre_clienteComprobanteTarjetaBusqueda, this.gridBagConstraintsComprobanteTarjeta);
	}

	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 1;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_clienteComprobanteTarjeta.add(jscrollPanenombre_clienteComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);


	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsubtotalComprobanteTarjeta.add(jLabelsubtotalComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
		this.gridBagConstraintsComprobanteTarjeta.gridx = 2;
		this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
		this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(0, 0, 0, 0);
		this.jPanelsubtotalComprobanteTarjeta.add(jButtonsubtotalComprobanteTarjetaBusqueda, this.gridBagConstraintsComprobanteTarjeta);
	}

	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 1;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsubtotalComprobanteTarjeta.add(jTextFieldsubtotalComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);


	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaComprobanteTarjeta.add(jLabelivaComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
		this.gridBagConstraintsComprobanteTarjeta.gridx = 2;
		this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
		this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaComprobanteTarjeta.add(jButtonivaComprobanteTarjetaBusqueda, this.gridBagConstraintsComprobanteTarjeta);
	}

	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 1;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaComprobanteTarjeta.add(jTextFieldivaComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);


	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuentoComprobanteTarjeta.add(jLabeldescuentoComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
		this.gridBagConstraintsComprobanteTarjeta.gridx = 2;
		this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
		this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuentoComprobanteTarjeta.add(jButtondescuentoComprobanteTarjetaBusqueda, this.gridBagConstraintsComprobanteTarjeta);
	}

	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 1;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuentoComprobanteTarjeta.add(jTextFielddescuentoComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);


	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfinanciamientoComprobanteTarjeta.add(jLabelfinanciamientoComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
		this.gridBagConstraintsComprobanteTarjeta.gridx = 2;
		this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
		this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(0, 0, 0, 0);
		this.jPanelfinanciamientoComprobanteTarjeta.add(jButtonfinanciamientoComprobanteTarjetaBusqueda, this.gridBagConstraintsComprobanteTarjeta);
	}

	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 1;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfinanciamientoComprobanteTarjeta.add(jTextFieldfinanciamientoComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);


	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfleteComprobanteTarjeta.add(jLabelfleteComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
		this.gridBagConstraintsComprobanteTarjeta.gridx = 2;
		this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
		this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(0, 0, 0, 0);
		this.jPanelfleteComprobanteTarjeta.add(jButtonfleteComprobanteTarjetaBusqueda, this.gridBagConstraintsComprobanteTarjeta);
	}

	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 1;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfleteComprobanteTarjeta.add(jTextFieldfleteComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);


	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneliceComprobanteTarjeta.add(jLabeliceComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
		this.gridBagConstraintsComprobanteTarjeta.gridx = 2;
		this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
		this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(0, 0, 0, 0);
		this.jPaneliceComprobanteTarjeta.add(jButtoniceComprobanteTarjetaBusqueda, this.gridBagConstraintsComprobanteTarjeta);
	}

	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 1;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneliceComprobanteTarjeta.add(jTextFieldiceComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);


	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalComprobanteTarjeta.add(jLabeltotalComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
		this.gridBagConstraintsComprobanteTarjeta.gridx = 2;
		this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
		this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalComprobanteTarjeta.add(jButtontotalComprobanteTarjetaBusqueda, this.gridBagConstraintsComprobanteTarjeta);
	}

	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 1;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalComprobanteTarjeta.add(jTextFieldtotalComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);


	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorComprobanteTarjeta.add(jLabelvalorComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
		this.gridBagConstraintsComprobanteTarjeta.gridx = 2;
		this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
		this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorComprobanteTarjeta.add(jButtonvalorComprobanteTarjetaBusqueda, this.gridBagConstraintsComprobanteTarjeta);
	}

	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 1;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorComprobanteTarjeta.add(jTextFieldvalorComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);


	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_forma_pagoComprobanteTarjeta.add(jLabelfecha_forma_pagoComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
		this.gridBagConstraintsComprobanteTarjeta.gridx = 2;
		this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
		this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_forma_pagoComprobanteTarjeta.add(jButtonfecha_forma_pagoComprobanteTarjetaBusqueda, this.gridBagConstraintsComprobanteTarjeta);
	}

	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 1;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_forma_pagoComprobanteTarjeta.add(jDateChooserfecha_forma_pagoComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);


	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumeroComprobanteTarjeta.add(jLabelnumeroComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
		this.gridBagConstraintsComprobanteTarjeta.gridx = 2;
		this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
		this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumeroComprobanteTarjeta.add(jButtonnumeroComprobanteTarjetaBusqueda, this.gridBagConstraintsComprobanteTarjeta);
	}

	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 1;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumeroComprobanteTarjeta.add(jTextFieldnumeroComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);


	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltarjeta_habienteComprobanteTarjeta.add(jLabeltarjeta_habienteComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
		this.gridBagConstraintsComprobanteTarjeta.gridx = 2;
		this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
		this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(0, 0, 0, 0);
		this.jPaneltarjeta_habienteComprobanteTarjeta.add(jButtontarjeta_habienteComprobanteTarjetaBusqueda, this.gridBagConstraintsComprobanteTarjeta);
	}

	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 1;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltarjeta_habienteComprobanteTarjeta.add(jscrollPanetarjeta_habienteComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);


	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelautorizacionComprobanteTarjeta.add(jLabelautorizacionComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
		this.gridBagConstraintsComprobanteTarjeta.gridx = 2;
		this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
		this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(0, 0, 0, 0);
		this.jPanelautorizacionComprobanteTarjeta.add(jButtonautorizacionComprobanteTarjetaBusqueda, this.gridBagConstraintsComprobanteTarjeta);
	}

	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 1;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelautorizacionComprobanteTarjeta.add(jscrollPaneautorizacionComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);


	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvoucherComprobanteTarjeta.add(jLabelvoucherComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
		this.gridBagConstraintsComprobanteTarjeta.gridx = 2;
		this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
		this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(0, 0, 0, 0);
		this.jPanelvoucherComprobanteTarjeta.add(jButtonvoucherComprobanteTarjetaBusqueda, this.gridBagConstraintsComprobanteTarjeta);
	}

	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 1;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvoucherComprobanteTarjeta.add(jTextFieldvoucherComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);


	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelloteComprobanteTarjeta.add(jLabelloteComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
		this.gridBagConstraintsComprobanteTarjeta.gridx = 2;
		this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
		this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(0, 0, 0, 0);
		this.jPanelloteComprobanteTarjeta.add(jButtonloteComprobanteTarjetaBusqueda, this.gridBagConstraintsComprobanteTarjeta);
	}

	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
	this.gridBagConstraintsComprobanteTarjeta.gridx = 1;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelloteComprobanteTarjeta.add(jTextFieldloteComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteTarjeta.gridy = iYPanelCamposComprobanteTarjeta;
	this.gridBagConstraintsComprobanteTarjeta.gridx = iXPanelCamposComprobanteTarjeta++;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteTarjeta.add(this.jPanelidComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(iXPanelCamposComprobanteTarjeta % 3==0) {
		iXPanelCamposComprobanteTarjeta=0;
		iYPanelCamposComprobanteTarjeta++;
	}
	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteTarjeta.gridy = iYPanelCamposComprobanteTarjeta;
	this.gridBagConstraintsComprobanteTarjeta.gridx = iXPanelCamposComprobanteTarjeta++;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteTarjeta.add(this.jPanelfecha_inicioComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(iXPanelCamposComprobanteTarjeta % 3==0) {
		iXPanelCamposComprobanteTarjeta=0;
		iYPanelCamposComprobanteTarjeta++;
	}
	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteTarjeta.gridy = iYPanelCamposComprobanteTarjeta;
	this.gridBagConstraintsComprobanteTarjeta.gridx = iXPanelCamposComprobanteTarjeta++;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteTarjeta.add(this.jPanelfecha_finComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(iXPanelCamposComprobanteTarjeta % 3==0) {
		iXPanelCamposComprobanteTarjeta=0;
		iYPanelCamposComprobanteTarjeta++;
	}
	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteTarjeta.gridy = iYPanelCamposComprobanteTarjeta;
	this.gridBagConstraintsComprobanteTarjeta.gridx = iXPanelCamposComprobanteTarjeta++;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteTarjeta.add(this.jPanelnombre_cajaComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(iXPanelCamposComprobanteTarjeta % 3==0) {
		iXPanelCamposComprobanteTarjeta=0;
		iYPanelCamposComprobanteTarjeta++;
	}
	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteTarjeta.gridy = iYPanelCamposComprobanteTarjeta;
	this.gridBagConstraintsComprobanteTarjeta.gridx = iXPanelCamposComprobanteTarjeta++;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteTarjeta.add(this.jPanelsecuencialComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(iXPanelCamposComprobanteTarjeta % 3==0) {
		iXPanelCamposComprobanteTarjeta=0;
		iYPanelCamposComprobanteTarjeta++;
	}
	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteTarjeta.gridy = iYPanelCamposComprobanteTarjeta;
	this.gridBagConstraintsComprobanteTarjeta.gridx = iXPanelCamposComprobanteTarjeta++;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteTarjeta.add(this.jPanelfechaComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(iXPanelCamposComprobanteTarjeta % 3==0) {
		iXPanelCamposComprobanteTarjeta=0;
		iYPanelCamposComprobanteTarjeta++;
	}
	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteTarjeta.gridy = iYPanelCamposComprobanteTarjeta;
	this.gridBagConstraintsComprobanteTarjeta.gridx = iXPanelCamposComprobanteTarjeta++;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteTarjeta.add(this.jPanelcodigo_clienteComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(iXPanelCamposComprobanteTarjeta % 3==0) {
		iXPanelCamposComprobanteTarjeta=0;
		iYPanelCamposComprobanteTarjeta++;
	}
	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteTarjeta.gridy = iYPanelCamposComprobanteTarjeta;
	this.gridBagConstraintsComprobanteTarjeta.gridx = iXPanelCamposComprobanteTarjeta++;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteTarjeta.add(this.jPanelnombre_clienteComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(iXPanelCamposComprobanteTarjeta % 3==0) {
		iXPanelCamposComprobanteTarjeta=0;
		iYPanelCamposComprobanteTarjeta++;
	}
	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteTarjeta.gridy = iYPanelCamposComprobanteTarjeta;
	this.gridBagConstraintsComprobanteTarjeta.gridx = iXPanelCamposComprobanteTarjeta++;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteTarjeta.add(this.jPanelsubtotalComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(iXPanelCamposComprobanteTarjeta % 3==0) {
		iXPanelCamposComprobanteTarjeta=0;
		iYPanelCamposComprobanteTarjeta++;
	}
	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteTarjeta.gridy = iYPanelCamposComprobanteTarjeta;
	this.gridBagConstraintsComprobanteTarjeta.gridx = iXPanelCamposComprobanteTarjeta++;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteTarjeta.add(this.jPanelivaComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(iXPanelCamposComprobanteTarjeta % 3==0) {
		iXPanelCamposComprobanteTarjeta=0;
		iYPanelCamposComprobanteTarjeta++;
	}
	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteTarjeta.gridy = iYPanelCamposComprobanteTarjeta;
	this.gridBagConstraintsComprobanteTarjeta.gridx = iXPanelCamposComprobanteTarjeta++;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteTarjeta.add(this.jPaneldescuentoComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(iXPanelCamposComprobanteTarjeta % 3==0) {
		iXPanelCamposComprobanteTarjeta=0;
		iYPanelCamposComprobanteTarjeta++;
	}
	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteTarjeta.gridy = iYPanelCamposComprobanteTarjeta;
	this.gridBagConstraintsComprobanteTarjeta.gridx = iXPanelCamposComprobanteTarjeta++;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteTarjeta.add(this.jPanelfinanciamientoComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(iXPanelCamposComprobanteTarjeta % 3==0) {
		iXPanelCamposComprobanteTarjeta=0;
		iYPanelCamposComprobanteTarjeta++;
	}
	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteTarjeta.gridy = iYPanelCamposComprobanteTarjeta;
	this.gridBagConstraintsComprobanteTarjeta.gridx = iXPanelCamposComprobanteTarjeta++;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteTarjeta.add(this.jPanelfleteComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(iXPanelCamposComprobanteTarjeta % 3==0) {
		iXPanelCamposComprobanteTarjeta=0;
		iYPanelCamposComprobanteTarjeta++;
	}
	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteTarjeta.gridy = iYPanelCamposComprobanteTarjeta;
	this.gridBagConstraintsComprobanteTarjeta.gridx = iXPanelCamposComprobanteTarjeta++;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteTarjeta.add(this.jPaneliceComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(iXPanelCamposComprobanteTarjeta % 3==0) {
		iXPanelCamposComprobanteTarjeta=0;
		iYPanelCamposComprobanteTarjeta++;
	}
	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteTarjeta.gridy = iYPanelCamposComprobanteTarjeta;
	this.gridBagConstraintsComprobanteTarjeta.gridx = iXPanelCamposComprobanteTarjeta++;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteTarjeta.add(this.jPaneltotalComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(iXPanelCamposComprobanteTarjeta % 3==0) {
		iXPanelCamposComprobanteTarjeta=0;
		iYPanelCamposComprobanteTarjeta++;
	}
	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteTarjeta.gridy = iYPanelCamposComprobanteTarjeta;
	this.gridBagConstraintsComprobanteTarjeta.gridx = iXPanelCamposComprobanteTarjeta++;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteTarjeta.add(this.jPanelvalorComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(iXPanelCamposComprobanteTarjeta % 3==0) {
		iXPanelCamposComprobanteTarjeta=0;
		iYPanelCamposComprobanteTarjeta++;
	}
	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteTarjeta.gridy = iYPanelCamposComprobanteTarjeta;
	this.gridBagConstraintsComprobanteTarjeta.gridx = iXPanelCamposComprobanteTarjeta++;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteTarjeta.add(this.jPanelfecha_forma_pagoComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(iXPanelCamposComprobanteTarjeta % 3==0) {
		iXPanelCamposComprobanteTarjeta=0;
		iYPanelCamposComprobanteTarjeta++;
	}
	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteTarjeta.gridy = iYPanelCamposComprobanteTarjeta;
	this.gridBagConstraintsComprobanteTarjeta.gridx = iXPanelCamposComprobanteTarjeta++;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteTarjeta.add(this.jPanelnumeroComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(iXPanelCamposComprobanteTarjeta % 3==0) {
		iXPanelCamposComprobanteTarjeta=0;
		iYPanelCamposComprobanteTarjeta++;
	}
	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteTarjeta.gridy = iYPanelCamposComprobanteTarjeta;
	this.gridBagConstraintsComprobanteTarjeta.gridx = iXPanelCamposComprobanteTarjeta++;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteTarjeta.add(this.jPaneltarjeta_habienteComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(iXPanelCamposComprobanteTarjeta % 3==0) {
		iXPanelCamposComprobanteTarjeta=0;
		iYPanelCamposComprobanteTarjeta++;
	}
	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteTarjeta.gridy = iYPanelCamposComprobanteTarjeta;
	this.gridBagConstraintsComprobanteTarjeta.gridx = iXPanelCamposComprobanteTarjeta++;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteTarjeta.add(this.jPanelautorizacionComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(iXPanelCamposComprobanteTarjeta % 3==0) {
		iXPanelCamposComprobanteTarjeta=0;
		iYPanelCamposComprobanteTarjeta++;
	}
	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteTarjeta.gridy = iYPanelCamposComprobanteTarjeta;
	this.gridBagConstraintsComprobanteTarjeta.gridx = iXPanelCamposComprobanteTarjeta++;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteTarjeta.add(this.jPanelvoucherComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(iXPanelCamposComprobanteTarjeta % 3==0) {
		iXPanelCamposComprobanteTarjeta=0;
		iYPanelCamposComprobanteTarjeta++;
	}
	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteTarjeta.gridy = iYPanelCamposComprobanteTarjeta;
	this.gridBagConstraintsComprobanteTarjeta.gridx = iXPanelCamposComprobanteTarjeta++;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteTarjeta.add(this.jPanelloteComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(iXPanelCamposComprobanteTarjeta % 3==0) {
		iXPanelCamposComprobanteTarjeta=0;
		iYPanelCamposComprobanteTarjeta++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteTarjeta.gridy = iYPanelCamposOcultosComprobanteTarjeta;
	this.gridBagConstraintsComprobanteTarjeta.gridx = iXPanelCamposOcultosComprobanteTarjeta++;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosComprobanteTarjeta.add(this.jPanelid_empresaComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(iXPanelCamposOcultosComprobanteTarjeta % 3==0) {
		iXPanelCamposOcultosComprobanteTarjeta=0;
		iYPanelCamposOcultosComprobanteTarjeta++;
	}
	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteTarjeta.gridy = iYPanelCamposOcultosComprobanteTarjeta;
	this.gridBagConstraintsComprobanteTarjeta.gridx = iXPanelCamposOcultosComprobanteTarjeta++;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosComprobanteTarjeta.add(this.jPanelid_sucursalComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(iXPanelCamposOcultosComprobanteTarjeta % 3==0) {
		iXPanelCamposOcultosComprobanteTarjeta=0;
		iYPanelCamposOcultosComprobanteTarjeta++;
	}
	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteTarjeta.gridy = iYPanelCamposOcultosComprobanteTarjeta;
	this.gridBagConstraintsComprobanteTarjeta.gridx = iXPanelCamposOcultosComprobanteTarjeta++;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosComprobanteTarjeta.add(this.jPanelid_clienteComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(iXPanelCamposOcultosComprobanteTarjeta % 3==0) {
		iXPanelCamposOcultosComprobanteTarjeta=0;
		iYPanelCamposOcultosComprobanteTarjeta++;
	}
	this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteTarjeta.gridy = iYPanelCamposOcultosComprobanteTarjeta;
	this.gridBagConstraintsComprobanteTarjeta.gridx = iXPanelCamposOcultosComprobanteTarjeta++;
	this.gridBagConstraintsComprobanteTarjeta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosComprobanteTarjeta.add(this.jPanelid_cajaComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);



	if(iXPanelCamposOcultosComprobanteTarjeta % 3==0) {
		iXPanelCamposOcultosComprobanteTarjeta=0;
		iYPanelCamposOcultosComprobanteTarjeta++;
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
			
		GridBagLayout gridaBagLayoutAccionesComprobanteTarjeta= new GridBagLayout();
		this.jPanelAccionesComprobanteTarjeta.setLayout(gridaBagLayoutAccionesComprobanteTarjeta);
		
		GridBagLayout gridaBagLayoutAccionesFormularioComprobanteTarjeta= new GridBagLayout();
		this.jPanelAccionesFormularioComprobanteTarjeta.setLayout(gridaBagLayoutAccionesFormularioComprobanteTarjeta);
		
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsComprobanteTarjeta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioComprobanteTarjeta.add(this.jComboBoxTiposAccionesFormularioComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
		this.gridBagConstraintsComprobanteTarjeta.gridx = iPosXAccion++;
			
		this.jPanelAccionesComprobanteTarjeta.add(this.jButtonModificarComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);							

		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
		this.gridBagConstraintsComprobanteTarjeta.gridx =iPosXAccion++;
			
		this.jPanelAccionesComprobanteTarjeta.add(this.jButtonEliminarComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
		
			
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.gridy = 0;		
		this.gridBagConstraintsComprobanteTarjeta.gridx = iPosXAccion++;
		
		this.jPanelAccionesComprobanteTarjeta.add(this.jButtonActualizarComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);


		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.gridy = 0;		
		this.gridBagConstraintsComprobanteTarjeta.gridx = iPosXAccion++;
		
		this.jPanelAccionesComprobanteTarjeta.add(this.jButtonGuardarCambiosComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);	
		
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.gridy = 0;		
		this.gridBagConstraintsComprobanteTarjeta.gridx =iPosXAccion++;
		
		this.jPanelAccionesComprobanteTarjeta.add(this.jButtonCancelarComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutComprobanteTarjeta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutComprobanteTarjeta);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();						
			this.gridBagConstraintsComprobanteTarjeta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComprobanteTarjeta.gridx = 0;		
			//this.gridBagConstraintsComprobanteTarjeta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsComprobanteTarjeta.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsComprobanteTarjeta.gridx =0;
		this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsComprobanteTarjeta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ComprobanteTarjetaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleComprobanteTarjeta = new ComprobanteTarjetaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Comprobante Tarjeta DATOS");
			
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
			
	        //this.setTitle("[FOR] - Comprobante Tarjeta DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Comprobante Tarjeta Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ComprobanteTarjetaModel comprobantetarjetaModel=new ComprobanteTarjetaModel(this);
			
			//SI USARA CLASE INTERNA
			//ComprobanteTarjetaModel.ComprobanteTarjetaFocusTraversalPolicy comprobantetarjetaFocusTraversalPolicy = comprobantetarjetaModel.new ComprobanteTarjetaFocusTraversalPolicy(this);
			
			//comprobantetarjetaFocusTraversalPolicy.setcomprobantetarjetaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(comprobantetarjetaModel);
			
			
			this.jContentPaneDetalleComprobanteTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleComprobanteTarjeta = new GridBagLayout();	
			this.jContentPaneDetalleComprobanteTarjeta.setLayout(gridaBagLayoutDetalleComprobanteTarjeta);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosComprobanteTarjeta = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
				this.gridBagConstraintsComprobanteTarjeta.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
					
				
				this.jContentPaneDetalleComprobanteTarjeta.add(jTtoolBarDetalleComprobanteTarjeta, gridBagConstraintsComprobanteTarjeta);								
				
}
			
			this.jScrollPanelDatosEdicionComprobanteTarjeta=   new JScrollPane(jContentPaneDetalleComprobanteTarjeta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionComprobanteTarjeta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComprobanteTarjeta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComprobanteTarjeta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralComprobanteTarjeta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralComprobanteTarjeta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComprobanteTarjeta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComprobanteTarjeta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
			
			
	        this.gridBagConstraintsComprobanteTarjeta.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
	        
			this.jContentPaneDetalleComprobanteTarjeta.add(jPanelCamposComprobanteTarjeta, gridBagConstraintsComprobanteTarjeta);
			
			
			
			
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
						//&& comprobantetarjetaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.comprobantetarjetaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsComprobanteTarjeta= new GridBagConstraints();
						this.gridBagConstraintsComprobanteTarjeta.gridy = iGridyRelaciones++;
						this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
						this.jContentPaneDetalleComprobanteTarjeta.add(this.jTabbedPaneRelacionesComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesComprobanteTarjeta.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosComprobanteTarjeta.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
					this.gridBagConstraintsComprobanteTarjeta.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsComprobanteTarjeta.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
					
				
					this.jContentPaneDetalleComprobanteTarjeta.add(jPanelCamposOcultosComprobanteTarjeta, gridBagConstraintsComprobanteTarjeta);
				
					this.jPanelCamposOcultosComprobanteTarjeta.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
			this.gridBagConstraintsComprobanteTarjeta.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
	        this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleComprobanteTarjeta.add(this.jPanelAccionesFormularioComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);							
			
			
			
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
	        this.gridBagConstraintsComprobanteTarjeta.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
	        
			
			this.jContentPaneDetalleComprobanteTarjeta.add(this.jPanelAccionesComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionComprobanteTarjeta);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionComprobanteTarjeta=   new JScrollPane(this.jPanelCamposComprobanteTarjeta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionComprobanteTarjeta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComprobanteTarjeta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComprobanteTarjeta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
			this.gridBagConstraintsComprobanteTarjeta.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
			this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsComprobanteTarjeta.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
			this.gridBagConstraintsComprobanteTarjeta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);			
			
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
			this.gridBagConstraintsComprobanteTarjeta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
			
			
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
		
			
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsComprobanteTarjeta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralComprobanteTarjeta;//jContentPane;
		
		return jScrollPanelDatosEdicionComprobanteTarjeta;
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
