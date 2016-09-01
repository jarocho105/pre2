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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.tesoreria.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.report.*;
import com.bydan.erp.tesoreria.util.report.BeneficiariosPagosCobrosConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.report.*;
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
public class BeneficiariosPagosCobrosDetalleFormJInternalFrame extends BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleBeneficiariosPagosCobros;
	
	protected JMenuBar jmenuBarDetalleBeneficiariosPagosCobros;
	
	protected JMenu jmenuDetalleBeneficiariosPagosCobros;
	protected JMenu jmenuDetalleArchivoBeneficiariosPagosCobros;
	protected JMenu jmenuDetalleAccionesBeneficiariosPagosCobros;
	protected JMenu jmenuDetalleDatosBeneficiariosPagosCobros;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleBeneficiariosPagosCobros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutBeneficiariosPagosCobros;	
	protected GridBagConstraints gridBagConstraintsBeneficiariosPagosCobros;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional jInternalFrameDetalleBeneficiariosPagosCobros;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";
	
	public BeneficiariosPagosCobrosSessionBean beneficiariospagoscobrosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;	
	
	public BeneficiariosPagosCobrosLogic beneficiariospagoscobrosLogic;
	
	public JScrollPane jScrollPanelDatosBeneficiariosPagosCobros;
	public JScrollPane jScrollPanelDatosEdicionBeneficiariosPagosCobros;
	public JScrollPane jScrollPanelDatosGeneralBeneficiariosPagosCobros;
	
	protected JPanel jPanelCamposBeneficiariosPagosCobros;    
	protected JPanel jPanelCamposOcultosBeneficiariosPagosCobros;    	
	protected JPanel jPanelAccionesBeneficiariosPagosCobros;
	protected JPanel jPanelAccionesFormularioBeneficiariosPagosCobros;
    
	
	
	protected Integer iXPanelCamposBeneficiariosPagosCobros=0;
	protected Integer iYPanelCamposBeneficiariosPagosCobros=0;
	
	protected Integer iXPanelCamposOcultosBeneficiariosPagosCobros=0;
	protected Integer iYPanelCamposOcultosBeneficiariosPagosCobros=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoBeneficiariosPagosCobros;
	public JButton jButtonModificarBeneficiariosPagosCobros;
	public JButton jButtonActualizarBeneficiariosPagosCobros;
    public JButton jButtonEliminarBeneficiariosPagosCobros;
	public JButton jButtonCancelarBeneficiariosPagosCobros;
    public JButton jButtonGuardarCambiosBeneficiariosPagosCobros;
	public JButton jButtonGuardarCambiosTablaBeneficiariosPagosCobros;
	protected JButton jButtonCerrarBeneficiariosPagosCobros;
	
	
	protected JButton jButtonProcesarInformacionBeneficiariosPagosCobros;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoBeneficiariosPagosCobros;
	protected JCheckBox jCheckBoxPostAccionSinCerrarBeneficiariosPagosCobros;
	protected JCheckBox jCheckBoxPostAccionSinMensajeBeneficiariosPagosCobros;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarBeneficiariosPagosCobros;
	protected JButton jButtonModificarToolBarBeneficiariosPagosCobros;
	protected JButton jButtonActualizarToolBarBeneficiariosPagosCobros;
    protected JButton jButtonEliminarToolBarBeneficiariosPagosCobros;
	protected JButton jButtonCancelarToolBarBeneficiariosPagosCobros;
    protected JButton jButtonGuardarCambiosToolBarBeneficiariosPagosCobros;
	protected JButton jButtonGuardarCambiosTablaToolBarBeneficiariosPagosCobros;
	protected JButton jButtonMostrarOcultarTablaToolBarBeneficiariosPagosCobros;
	protected JButton jButtonCerrarToolBarBeneficiariosPagosCobros;
	
	protected JButton jButtonProcesarInformacionToolBarBeneficiariosPagosCobros;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoBeneficiariosPagosCobros;
	protected JMenuItem jMenuItemModificarBeneficiariosPagosCobros;
	protected JMenuItem jMenuItemActualizarBeneficiariosPagosCobros;
    protected JMenuItem jMenuItemEliminarBeneficiariosPagosCobros;
	protected JMenuItem jMenuItemCancelarBeneficiariosPagosCobros;
    protected JMenuItem jMenuItemGuardarCambiosBeneficiariosPagosCobros;
	protected JMenuItem jMenuItemGuardarCambiosTablaBeneficiariosPagosCobros;
	protected JMenuItem jMenuItemCerrarBeneficiariosPagosCobros;
	protected JMenuItem jMenuItemDetalleCerrarBeneficiariosPagosCobros;
	protected JMenuItem jMenuItemDetalleMostarOcultarBeneficiariosPagosCobros;
	
	protected JMenuItem jMenuItemProcesarInformacionBeneficiariosPagosCobros;
	protected JMenuItem jMenuItemNuevoGuardarCambiosBeneficiariosPagosCobros;
	protected JMenuItem jMenuItemMostrarOcultarBeneficiariosPagosCobros;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesBeneficiariosPagosCobros;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesBeneficiariosPagosCobros;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesBeneficiariosPagosCobros;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioBeneficiariosPagosCobros;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidBeneficiariosPagosCobros;
	public JLabel jLabelIdBeneficiariosPagosCobros;
	public JLabel jLabelidBeneficiariosPagosCobros;
	public JButton jButtonidBeneficiariosPagosCobrosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_desdeBeneficiariosPagosCobros;
	public JLabel jLabelfecha_desdeBeneficiariosPagosCobros;
	//public JFormattedTextField jDateChooserfecha_desdeBeneficiariosPagosCobros;

	public JDateChooser jDateChooserfecha_desdeBeneficiariosPagosCobros;
	public JButton jButtonfecha_desdeBeneficiariosPagosCobrosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_hastaBeneficiariosPagosCobros;
	public JLabel jLabelfecha_hastaBeneficiariosPagosCobros;
	//public JFormattedTextField jDateChooserfecha_hastaBeneficiariosPagosCobros;

	public JDateChooser jDateChooserfecha_hastaBeneficiariosPagosCobros;
	public JButton jButtonfecha_hastaBeneficiariosPagosCobrosBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_cuenta_contableBeneficiariosPagosCobros;
	public JLabel jLabelcodigo_cuenta_contableBeneficiariosPagosCobros;
	public JTextField jTextFieldcodigo_cuenta_contableBeneficiariosPagosCobros;
	public JButton jButtoncodigo_cuenta_contableBeneficiariosPagosCobrosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_cuenta_contableBeneficiariosPagosCobros;
	public JLabel jLabelnombre_cuenta_contableBeneficiariosPagosCobros;
	public JTextArea jTextAreanombre_cuenta_contableBeneficiariosPagosCobros;
	public JScrollPane jscrollPanenombre_cuenta_contableBeneficiariosPagosCobros;
	public JButton jButtonnombre_cuenta_contableBeneficiariosPagosCobrosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_mayorBeneficiariosPagosCobros;
	public JLabel jLabelnumero_mayorBeneficiariosPagosCobros;
	public JTextArea jTextAreanumero_mayorBeneficiariosPagosCobros;
	public JScrollPane jscrollPanenumero_mayorBeneficiariosPagosCobros;
	public JButton jButtonnumero_mayorBeneficiariosPagosCobrosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_chequeBeneficiariosPagosCobros;
	public JLabel jLabelnumero_chequeBeneficiariosPagosCobros;
	public JTextField jTextFieldnumero_chequeBeneficiariosPagosCobros;
	public JButton jButtonnumero_chequeBeneficiariosPagosCobrosBusqueda= new JButtonMe();

	public JPanel jPanelbeneficiarioBeneficiariosPagosCobros;
	public JLabel jLabelbeneficiarioBeneficiariosPagosCobros;
	public JTextArea jTextAreabeneficiarioBeneficiariosPagosCobros;
	public JScrollPane jscrollPanebeneficiarioBeneficiariosPagosCobros;
	public JButton jButtonbeneficiarioBeneficiariosPagosCobrosBusqueda= new JButtonMe();

	public JPanel jPaneldebito_localBeneficiariosPagosCobros;
	public JLabel jLabeldebito_localBeneficiariosPagosCobros;
	public JTextField jTextFielddebito_localBeneficiariosPagosCobros;
	public JButton jButtondebito_localBeneficiariosPagosCobrosBusqueda= new JButtonMe();

	public JPanel jPanelcredito_localBeneficiariosPagosCobros;
	public JLabel jLabelcredito_localBeneficiariosPagosCobros;
	public JTextField jTextFieldcredito_localBeneficiariosPagosCobros;
	public JButton jButtoncredito_localBeneficiariosPagosCobrosBusqueda= new JButtonMe();

	public JPanel jPaneldetalleBeneficiariosPagosCobros;
	public JLabel jLabeldetalleBeneficiariosPagosCobros;
	public JTextArea jTextAreadetalleBeneficiariosPagosCobros;
	public JScrollPane jscrollPanedetalleBeneficiariosPagosCobros;
	public JButton jButtondetalleBeneficiariosPagosCobrosBusqueda= new JButtonMe();

	public JPanel jPaneltipo_movimientoBeneficiariosPagosCobros;
	public JLabel jLabeltipo_movimientoBeneficiariosPagosCobros;
	public JTextArea jTextAreatipo_movimientoBeneficiariosPagosCobros;
	public JScrollPane jscrollPanetipo_movimientoBeneficiariosPagosCobros;
	public JButton jButtontipo_movimientoBeneficiariosPagosCobrosBusqueda= new JButtonMe();

	public JPanel jPanelvalorBeneficiariosPagosCobros;
	public JLabel jLabelvalorBeneficiariosPagosCobros;
	public JTextField jTextFieldvalorBeneficiariosPagosCobros;
	public JButton jButtonvalorBeneficiariosPagosCobrosBusqueda= new JButtonMe();

	public JPanel jPanelcuentaBeneficiariosPagosCobros;
	public JLabel jLabelcuentaBeneficiariosPagosCobros;
	public JTextField jTextFieldcuentaBeneficiariosPagosCobros;
	public JButton jButtoncuentaBeneficiariosPagosCobrosBusqueda= new JButtonMe();

	public JPanel jPanelfechaBeneficiariosPagosCobros;
	public JLabel jLabelfechaBeneficiariosPagosCobros;
	//public JFormattedTextField jDateChooserfechaBeneficiariosPagosCobros;

	public JDateChooser jDateChooserfechaBeneficiariosPagosCobros;
	public JButton jButtonfechaBeneficiariosPagosCobrosBusqueda= new JButtonMe();

	public JPanel jPanelbeneficiario_asientoBeneficiariosPagosCobros;
	public JLabel jLabelbeneficiario_asientoBeneficiariosPagosCobros;
	public JTextArea jTextAreabeneficiario_asientoBeneficiariosPagosCobros;
	public JScrollPane jscrollPanebeneficiario_asientoBeneficiariosPagosCobros;
	public JButton jButtonbeneficiario_asientoBeneficiariosPagosCobrosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaBeneficiariosPagosCobros;
	public JLabel jLabelid_empresaBeneficiariosPagosCobros;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaBeneficiariosPagosCobros;
	public JButton jButtonid_empresaBeneficiariosPagosCobros= new JButtonMe();
	public JButton jButtonid_empresaBeneficiariosPagosCobrosUpdate= new JButtonMe();
	public JButton jButtonid_empresaBeneficiariosPagosCobrosBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalBeneficiariosPagosCobros;
	public JLabel jLabelid_sucursalBeneficiariosPagosCobros;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalBeneficiariosPagosCobros;
	public JButton jButtonid_sucursalBeneficiariosPagosCobros= new JButtonMe();
	public JButton jButtonid_sucursalBeneficiariosPagosCobrosUpdate= new JButtonMe();
	public JButton jButtonid_sucursalBeneficiariosPagosCobrosBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioBeneficiariosPagosCobros;
	public JLabel jLabelid_ejercicioBeneficiariosPagosCobros;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioBeneficiariosPagosCobros;
	public JButton jButtonid_ejercicioBeneficiariosPagosCobros= new JButtonMe();
	public JButton jButtonid_ejercicioBeneficiariosPagosCobrosUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioBeneficiariosPagosCobrosBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_movimientoBeneficiariosPagosCobros;
	public JLabel jLabelid_tipo_movimientoBeneficiariosPagosCobros;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimientoBeneficiariosPagosCobros;
	public JButton jButtonid_tipo_movimientoBeneficiariosPagosCobros= new JButtonMe();
	public JButton jButtonid_tipo_movimientoBeneficiariosPagosCobrosUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimientoBeneficiariosPagosCobrosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesBeneficiariosPagosCobros;
	
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
	public int iHeightFormulario=880;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public BeneficiariosPagosCobrosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposBeneficiariosPagosCobros=new JPanel();
				this.jPanelAccionesFormularioBeneficiariosPagosCobros=new JPanel();
				this.jmenuBarDetalleBeneficiariosPagosCobros=new JMenuBar();
				this.jTtoolBarDetalleBeneficiariosPagosCobros=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BeneficiariosPagosCobrosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("BeneficiariosPagosCobros No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public BeneficiariosPagosCobrosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("BeneficiariosPagosCobros No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BeneficiariosPagosCobrosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("BeneficiariosPagosCobros No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BeneficiariosPagosCobrosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("BeneficiariosPagosCobros No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BeneficiariosPagosCobrosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("BeneficiariosPagosCobros No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarBeneficiariosPagosCobros() {
		return this.jButtonActualizarToolBarBeneficiariosPagosCobros;
	}
	
	public JButton getjButtonEliminarToolBarBeneficiariosPagosCobros() {
		return this.jButtonEliminarToolBarBeneficiariosPagosCobros;
	}
	
	public JButton getjButtonCancelarToolBarBeneficiariosPagosCobros() {
		return this.jButtonCancelarToolBarBeneficiariosPagosCobros;
	}		
	
	public JButton getjButtonProcesarInformacionBeneficiariosPagosCobros() {
		return this.jButtonProcesarInformacionBeneficiariosPagosCobros;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionBeneficiariosPagosCobros)	{
		this.jButtonProcesarInformacionBeneficiariosPagosCobros = jButtonProcesarInformacionBeneficiariosPagosCobros;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesBeneficiariosPagosCobros() {
		return this.jComboBoxTiposAccionesBeneficiariosPagosCobros;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesBeneficiariosPagosCobros(
			JComboBox jComboBoxTiposRelacionesBeneficiariosPagosCobros) {
		this.jComboBoxTiposRelacionesBeneficiariosPagosCobros = jComboBoxTiposRelacionesBeneficiariosPagosCobros;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesBeneficiariosPagosCobros(
			JComboBox jComboBoxTiposAccionesBeneficiariosPagosCobros) {
		this.jComboBoxTiposAccionesBeneficiariosPagosCobros = jComboBoxTiposAccionesBeneficiariosPagosCobros;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioBeneficiariosPagosCobros() {
		return this.jComboBoxTiposAccionesFormularioBeneficiariosPagosCobros;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioBeneficiariosPagosCobros(
			JComboBox jComboBoxTiposAccionesFormularioBeneficiariosPagosCobros) {
		this.jComboBoxTiposAccionesFormularioBeneficiariosPagosCobros = jComboBoxTiposAccionesFormularioBeneficiariosPagosCobros;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.beneficiariospagoscobrosSessionBean=new BeneficiariosPagosCobrosSessionBean();
		
		this.beneficiariospagoscobrosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.beneficiariospagoscobrosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		BeneficiariosPagosCobrosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		BeneficiariosPagosCobrosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		BeneficiariosPagosCobrosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Beneficiarios Pagos Cobros MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()) {
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
	
		BeneficiariosPagosCobrosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleBeneficiariosPagosCobros= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarBeneficiariosPagosCobros=new JButtonMe();
				this.jButtonModificarToolBarBeneficiariosPagosCobros=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarBeneficiariosPagosCobros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarBeneficiariosPagosCobros,this.jTtoolBarDetalleBeneficiariosPagosCobros,
							"actualizar","actualizar","Actualizar"+" "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarBeneficiariosPagosCobros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarBeneficiariosPagosCobros,this.jTtoolBarDetalleBeneficiariosPagosCobros,
							"eliminar","eliminar","Eliminar"+" "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarBeneficiariosPagosCobros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarBeneficiariosPagosCobros,this.jTtoolBarDetalleBeneficiariosPagosCobros,
							"cancelar","cancelar","Cancelar"+" "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarBeneficiariosPagosCobros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarBeneficiariosPagosCobros,this.jTtoolBarDetalleBeneficiariosPagosCobros,
							"guardarcambios","guardarcambios","Guardar"+" "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleBeneficiariosPagosCobros=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleBeneficiariosPagosCobros=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoBeneficiariosPagosCobros=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesBeneficiariosPagosCobros=new JMenuMe("Acciones");
		this.jmenuDetalleDatosBeneficiariosPagosCobros=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoBeneficiariosPagosCobros= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoBeneficiariosPagosCobros.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoBeneficiariosPagosCobros,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarBeneficiariosPagosCobros= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarBeneficiariosPagosCobros.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarBeneficiariosPagosCobros,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarBeneficiariosPagosCobros= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarBeneficiariosPagosCobros.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarBeneficiariosPagosCobros,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarBeneficiariosPagosCobros= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarBeneficiariosPagosCobros.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarBeneficiariosPagosCobros,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarBeneficiariosPagosCobros= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarBeneficiariosPagosCobros.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarBeneficiariosPagosCobros,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosBeneficiariosPagosCobros= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosBeneficiariosPagosCobros.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosBeneficiariosPagosCobros,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarBeneficiariosPagosCobros= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarBeneficiariosPagosCobros.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarBeneficiariosPagosCobros,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarBeneficiariosPagosCobros= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarBeneficiariosPagosCobros.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarBeneficiariosPagosCobros,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarBeneficiariosPagosCobros= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarBeneficiariosPagosCobros.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarBeneficiariosPagosCobros,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarBeneficiariosPagosCobros= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarBeneficiariosPagosCobros.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarBeneficiariosPagosCobros,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoBeneficiariosPagosCobros.add(this.jMenuItemDetalleCerrarBeneficiariosPagosCobros);
		
		this.jmenuDetalleAccionesBeneficiariosPagosCobros.add(this.jMenuItemActualizarBeneficiariosPagosCobros);
		this.jmenuDetalleAccionesBeneficiariosPagosCobros.add(this.jMenuItemEliminarBeneficiariosPagosCobros);
		this.jmenuDetalleAccionesBeneficiariosPagosCobros.add(this.jMenuItemCancelarBeneficiariosPagosCobros);		
		
		//this.jmenuDetalleDatosBeneficiariosPagosCobros.add(this.jMenuItemDetalleAbrirOrderByBeneficiariosPagosCobros);				
		this.jmenuDetalleDatosBeneficiariosPagosCobros.add(this.jMenuItemDetalleMostarOcultarBeneficiariosPagosCobros);				
				
		//this.jmenuDetalleAccionesBeneficiariosPagosCobros.add(this.jMenuItemGuardarCambiosBeneficiariosPagosCobros);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleBeneficiariosPagosCobros.add(this.jmenuDetalleArchivoBeneficiariosPagosCobros);		
		this.jmenuBarDetalleBeneficiariosPagosCobros.add(this.jmenuDetalleAccionesBeneficiariosPagosCobros);		
		this.jmenuBarDetalleBeneficiariosPagosCobros.add(this.jmenuDetalleDatosBeneficiariosPagosCobros);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleBeneficiariosPagosCobros);				
	}
	
	
	public void inicializarElementosCamposBeneficiariosPagosCobros() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdBeneficiariosPagosCobros = new JLabelMe();
		jLabelIdBeneficiariosPagosCobros.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidBeneficiariosPagosCobros = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidBeneficiariosPagosCobros.setToolTipText(BeneficiariosPagosCobrosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutBeneficiariosPagosCobros= new GridBagLayout();

		this.jPanelidBeneficiariosPagosCobros.setLayout(this.gridaBagLayoutBeneficiariosPagosCobros);

		jLabelidBeneficiariosPagosCobros = new JLabel();
		jLabelidBeneficiariosPagosCobros.setText("Id");

		jLabelidBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_desdeBeneficiariosPagosCobros = new JLabelMe();
		this.jLabelfecha_desdeBeneficiariosPagosCobros.setText(""+BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHADESDE+" : *");
		this.jLabelfecha_desdeBeneficiariosPagosCobros.setToolTipText("Fecha Desde");
		this.jLabelfecha_desdeBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_desdeBeneficiariosPagosCobros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_desdeBeneficiariosPagosCobros.setToolTipText(BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHADESDE);
		this.gridaBagLayoutBeneficiariosPagosCobros = new GridBagLayout();
		this.jPanelfecha_desdeBeneficiariosPagosCobros.setLayout(this.gridaBagLayoutBeneficiariosPagosCobros);


		//jFormattedTextFieldfecha_desdeBeneficiariosPagosCobros= new JFormattedTextFieldMe();

		jDateChooserfecha_desdeBeneficiariosPagosCobros= new JDateChooser();
		jDateChooserfecha_desdeBeneficiariosPagosCobros.setEnabled(false);
		jDateChooserfecha_desdeBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_desdeBeneficiariosPagosCobros.setDate(new Date());
		jDateChooserfecha_desdeBeneficiariosPagosCobros.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_desdeBeneficiariosPagosCobros.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_desdeBeneficiariosPagosCobrosBusqueda= new JButtonMe();
		this.jButtonfecha_desdeBeneficiariosPagosCobrosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeBeneficiariosPagosCobrosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeBeneficiariosPagosCobrosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_desdeBeneficiariosPagosCobrosBusqueda.setText("U");
		this.jButtonfecha_desdeBeneficiariosPagosCobrosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_desdeBeneficiariosPagosCobrosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_desdeBeneficiariosPagosCobrosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_desdeBeneficiariosPagosCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_desdeBeneficiariosPagosCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_desdeBeneficiariosPagosCobrosBusqueda"));

		if(this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_desdeBeneficiariosPagosCobrosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_hastaBeneficiariosPagosCobros = new JLabelMe();
		this.jLabelfecha_hastaBeneficiariosPagosCobros.setText(""+BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHAHASTA+" : *");
		this.jLabelfecha_hastaBeneficiariosPagosCobros.setToolTipText("Fecha Hasta");
		this.jLabelfecha_hastaBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_hastaBeneficiariosPagosCobros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_hastaBeneficiariosPagosCobros.setToolTipText(BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHAHASTA);
		this.gridaBagLayoutBeneficiariosPagosCobros = new GridBagLayout();
		this.jPanelfecha_hastaBeneficiariosPagosCobros.setLayout(this.gridaBagLayoutBeneficiariosPagosCobros);


		//jFormattedTextFieldfecha_hastaBeneficiariosPagosCobros= new JFormattedTextFieldMe();

		jDateChooserfecha_hastaBeneficiariosPagosCobros= new JDateChooser();
		jDateChooserfecha_hastaBeneficiariosPagosCobros.setEnabled(false);
		jDateChooserfecha_hastaBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_hastaBeneficiariosPagosCobros.setDate(new Date());
		jDateChooserfecha_hastaBeneficiariosPagosCobros.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_hastaBeneficiariosPagosCobros.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_hastaBeneficiariosPagosCobrosBusqueda= new JButtonMe();
		this.jButtonfecha_hastaBeneficiariosPagosCobrosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaBeneficiariosPagosCobrosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaBeneficiariosPagosCobrosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_hastaBeneficiariosPagosCobrosBusqueda.setText("U");
		this.jButtonfecha_hastaBeneficiariosPagosCobrosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_hastaBeneficiariosPagosCobrosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_hastaBeneficiariosPagosCobrosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_hastaBeneficiariosPagosCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_hastaBeneficiariosPagosCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_hastaBeneficiariosPagosCobrosBusqueda"));

		if(this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_hastaBeneficiariosPagosCobrosBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_cuenta_contableBeneficiariosPagosCobros = new JLabelMe();
		this.jLabelcodigo_cuenta_contableBeneficiariosPagosCobros.setText(""+BeneficiariosPagosCobrosConstantesFunciones.LABEL_CODIGOCUENTACONTABLE+" : *");
		this.jLabelcodigo_cuenta_contableBeneficiariosPagosCobros.setToolTipText("Codigo Cuenta Contable");
		this.jLabelcodigo_cuenta_contableBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_cuenta_contableBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_cuenta_contableBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_cuenta_contableBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_cuenta_contableBeneficiariosPagosCobros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_cuenta_contableBeneficiariosPagosCobros.setToolTipText(BeneficiariosPagosCobrosConstantesFunciones.LABEL_CODIGOCUENTACONTABLE);
		this.gridaBagLayoutBeneficiariosPagosCobros = new GridBagLayout();
		this.jPanelcodigo_cuenta_contableBeneficiariosPagosCobros.setLayout(this.gridaBagLayoutBeneficiariosPagosCobros);


		jTextFieldcodigo_cuenta_contableBeneficiariosPagosCobros= new JTextFieldMe();

		jTextFieldcodigo_cuenta_contableBeneficiariosPagosCobros.setEnabled(false);
		jTextFieldcodigo_cuenta_contableBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_cuenta_contableBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_cuenta_contableBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_cuenta_contableBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_cuenta_contableBeneficiariosPagosCobrosBusqueda= new JButtonMe();
		this.jButtoncodigo_cuenta_contableBeneficiariosPagosCobrosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_cuenta_contableBeneficiariosPagosCobrosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_cuenta_contableBeneficiariosPagosCobrosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_cuenta_contableBeneficiariosPagosCobrosBusqueda.setText("U");
		this.jButtoncodigo_cuenta_contableBeneficiariosPagosCobrosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_cuenta_contableBeneficiariosPagosCobrosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_cuenta_contableBeneficiariosPagosCobrosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_cuenta_contableBeneficiariosPagosCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_cuenta_contableBeneficiariosPagosCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_cuenta_contableBeneficiariosPagosCobrosBusqueda"));

		if(this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_cuenta_contableBeneficiariosPagosCobrosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_cuenta_contableBeneficiariosPagosCobros = new JLabelMe();
		this.jLabelnombre_cuenta_contableBeneficiariosPagosCobros.setText(""+BeneficiariosPagosCobrosConstantesFunciones.LABEL_NOMBRECUENTACONTABLE+" : *");
		this.jLabelnombre_cuenta_contableBeneficiariosPagosCobros.setToolTipText("Nombre Cuenta Contable");
		this.jLabelnombre_cuenta_contableBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_cuenta_contableBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_cuenta_contableBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_cuenta_contableBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_cuenta_contableBeneficiariosPagosCobros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_cuenta_contableBeneficiariosPagosCobros.setToolTipText(BeneficiariosPagosCobrosConstantesFunciones.LABEL_NOMBRECUENTACONTABLE);
		this.gridaBagLayoutBeneficiariosPagosCobros = new GridBagLayout();
		this.jPanelnombre_cuenta_contableBeneficiariosPagosCobros.setLayout(this.gridaBagLayoutBeneficiariosPagosCobros);


		jTextAreanombre_cuenta_contableBeneficiariosPagosCobros= new JTextAreaMe();
		jTextAreanombre_cuenta_contableBeneficiariosPagosCobros.setEnabled(false);
		jTextAreanombre_cuenta_contableBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuenta_contableBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuenta_contableBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuenta_contableBeneficiariosPagosCobros.setLineWrap(true);
		jTextAreanombre_cuenta_contableBeneficiariosPagosCobros.setWrapStyleWord(true);
		jTextAreanombre_cuenta_contableBeneficiariosPagosCobros.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_cuenta_contableBeneficiariosPagosCobros.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_cuenta_contableBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_cuenta_contableBeneficiariosPagosCobros = new JScrollPane(jTextAreanombre_cuenta_contableBeneficiariosPagosCobros);
		jscrollPanenombre_cuenta_contableBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_cuenta_contableBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_cuenta_contableBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_cuenta_contableBeneficiariosPagosCobrosBusqueda= new JButtonMe();
		this.jButtonnombre_cuenta_contableBeneficiariosPagosCobrosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cuenta_contableBeneficiariosPagosCobrosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cuenta_contableBeneficiariosPagosCobrosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_cuenta_contableBeneficiariosPagosCobrosBusqueda.setText("U");
		this.jButtonnombre_cuenta_contableBeneficiariosPagosCobrosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_cuenta_contableBeneficiariosPagosCobrosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_cuenta_contableBeneficiariosPagosCobrosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_cuenta_contableBeneficiariosPagosCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_cuenta_contableBeneficiariosPagosCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_cuenta_contableBeneficiariosPagosCobrosBusqueda"));

		if(this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_cuenta_contableBeneficiariosPagosCobrosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_mayorBeneficiariosPagosCobros = new JLabelMe();
		this.jLabelnumero_mayorBeneficiariosPagosCobros.setText(""+BeneficiariosPagosCobrosConstantesFunciones.LABEL_NUMEROMAYOR+" : *");
		this.jLabelnumero_mayorBeneficiariosPagosCobros.setToolTipText("Numero Mayor");
		this.jLabelnumero_mayorBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mayorBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mayorBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_mayorBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_mayorBeneficiariosPagosCobros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_mayorBeneficiariosPagosCobros.setToolTipText(BeneficiariosPagosCobrosConstantesFunciones.LABEL_NUMEROMAYOR);
		this.gridaBagLayoutBeneficiariosPagosCobros = new GridBagLayout();
		this.jPanelnumero_mayorBeneficiariosPagosCobros.setLayout(this.gridaBagLayoutBeneficiariosPagosCobros);


		jTextAreanumero_mayorBeneficiariosPagosCobros= new JTextAreaMe();
		jTextAreanumero_mayorBeneficiariosPagosCobros.setEnabled(false);
		jTextAreanumero_mayorBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorBeneficiariosPagosCobros.setLineWrap(true);
		jTextAreanumero_mayorBeneficiariosPagosCobros.setWrapStyleWord(true);
		jTextAreanumero_mayorBeneficiariosPagosCobros.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanumero_mayorBeneficiariosPagosCobros.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanumero_mayorBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenumero_mayorBeneficiariosPagosCobros = new JScrollPane(jTextAreanumero_mayorBeneficiariosPagosCobros);
		jscrollPanenumero_mayorBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenumero_mayorBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenumero_mayorBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnumero_mayorBeneficiariosPagosCobrosBusqueda= new JButtonMe();
		this.jButtonnumero_mayorBeneficiariosPagosCobrosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mayorBeneficiariosPagosCobrosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mayorBeneficiariosPagosCobrosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_mayorBeneficiariosPagosCobrosBusqueda.setText("U");
		this.jButtonnumero_mayorBeneficiariosPagosCobrosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_mayorBeneficiariosPagosCobrosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_mayorBeneficiariosPagosCobrosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanumero_mayorBeneficiariosPagosCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanumero_mayorBeneficiariosPagosCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_mayorBeneficiariosPagosCobrosBusqueda"));

		if(this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_mayorBeneficiariosPagosCobrosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_chequeBeneficiariosPagosCobros = new JLabelMe();
		this.jLabelnumero_chequeBeneficiariosPagosCobros.setText(""+BeneficiariosPagosCobrosConstantesFunciones.LABEL_NUMEROCHEQUE+" : *");
		this.jLabelnumero_chequeBeneficiariosPagosCobros.setToolTipText("Numero Cheque");
		this.jLabelnumero_chequeBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_chequeBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_chequeBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_chequeBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_chequeBeneficiariosPagosCobros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_chequeBeneficiariosPagosCobros.setToolTipText(BeneficiariosPagosCobrosConstantesFunciones.LABEL_NUMEROCHEQUE);
		this.gridaBagLayoutBeneficiariosPagosCobros = new GridBagLayout();
		this.jPanelnumero_chequeBeneficiariosPagosCobros.setLayout(this.gridaBagLayoutBeneficiariosPagosCobros);


		jTextFieldnumero_chequeBeneficiariosPagosCobros= new JTextFieldMe();

		jTextFieldnumero_chequeBeneficiariosPagosCobros.setEnabled(false);
		jTextFieldnumero_chequeBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_chequeBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_chequeBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_chequeBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_chequeBeneficiariosPagosCobrosBusqueda= new JButtonMe();
		this.jButtonnumero_chequeBeneficiariosPagosCobrosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_chequeBeneficiariosPagosCobrosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_chequeBeneficiariosPagosCobrosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_chequeBeneficiariosPagosCobrosBusqueda.setText("U");
		this.jButtonnumero_chequeBeneficiariosPagosCobrosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_chequeBeneficiariosPagosCobrosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_chequeBeneficiariosPagosCobrosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_chequeBeneficiariosPagosCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_chequeBeneficiariosPagosCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_chequeBeneficiariosPagosCobrosBusqueda"));

		if(this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_chequeBeneficiariosPagosCobrosBusqueda.setVisible(false);		}


					
		this.jLabelbeneficiarioBeneficiariosPagosCobros = new JLabelMe();
		this.jLabelbeneficiarioBeneficiariosPagosCobros.setText(""+BeneficiariosPagosCobrosConstantesFunciones.LABEL_BENEFICIARIO+" : *");
		this.jLabelbeneficiarioBeneficiariosPagosCobros.setToolTipText("Beneficiario");
		this.jLabelbeneficiarioBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbeneficiarioBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbeneficiarioBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbeneficiarioBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbeneficiarioBeneficiariosPagosCobros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbeneficiarioBeneficiariosPagosCobros.setToolTipText(BeneficiariosPagosCobrosConstantesFunciones.LABEL_BENEFICIARIO);
		this.gridaBagLayoutBeneficiariosPagosCobros = new GridBagLayout();
		this.jPanelbeneficiarioBeneficiariosPagosCobros.setLayout(this.gridaBagLayoutBeneficiariosPagosCobros);


		jTextAreabeneficiarioBeneficiariosPagosCobros= new JTextAreaMe();
		jTextAreabeneficiarioBeneficiariosPagosCobros.setEnabled(false);
		jTextAreabeneficiarioBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioBeneficiariosPagosCobros.setLineWrap(true);
		jTextAreabeneficiarioBeneficiariosPagosCobros.setWrapStyleWord(true);
		jTextAreabeneficiarioBeneficiariosPagosCobros.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreabeneficiarioBeneficiariosPagosCobros.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreabeneficiarioBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanebeneficiarioBeneficiariosPagosCobros = new JScrollPane(jTextAreabeneficiarioBeneficiariosPagosCobros);
		jscrollPanebeneficiarioBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanebeneficiarioBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanebeneficiarioBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonbeneficiarioBeneficiariosPagosCobrosBusqueda= new JButtonMe();
		this.jButtonbeneficiarioBeneficiariosPagosCobrosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbeneficiarioBeneficiariosPagosCobrosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbeneficiarioBeneficiariosPagosCobrosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbeneficiarioBeneficiariosPagosCobrosBusqueda.setText("U");
		this.jButtonbeneficiarioBeneficiariosPagosCobrosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbeneficiarioBeneficiariosPagosCobrosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbeneficiarioBeneficiariosPagosCobrosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreabeneficiarioBeneficiariosPagosCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreabeneficiarioBeneficiariosPagosCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"beneficiarioBeneficiariosPagosCobrosBusqueda"));

		if(this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbeneficiarioBeneficiariosPagosCobrosBusqueda.setVisible(false);		}


					
		this.jLabeldebito_localBeneficiariosPagosCobros = new JLabelMe();
		this.jLabeldebito_localBeneficiariosPagosCobros.setText(""+BeneficiariosPagosCobrosConstantesFunciones.LABEL_DEBITOLOCAL+" : *");
		this.jLabeldebito_localBeneficiariosPagosCobros.setToolTipText("Debito Local");
		this.jLabeldebito_localBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldebito_localBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldebito_localBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldebito_localBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldebito_localBeneficiariosPagosCobros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldebito_localBeneficiariosPagosCobros.setToolTipText(BeneficiariosPagosCobrosConstantesFunciones.LABEL_DEBITOLOCAL);
		this.gridaBagLayoutBeneficiariosPagosCobros = new GridBagLayout();
		this.jPaneldebito_localBeneficiariosPagosCobros.setLayout(this.gridaBagLayoutBeneficiariosPagosCobros);


		jTextFielddebito_localBeneficiariosPagosCobros= new JTextFieldMe();
		jTextFielddebito_localBeneficiariosPagosCobros.setEnabled(false);
		jTextFielddebito_localBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_localBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_localBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddebito_localBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddebito_localBeneficiariosPagosCobros.setText("0.0");

		this.jButtondebito_localBeneficiariosPagosCobrosBusqueda= new JButtonMe();
		this.jButtondebito_localBeneficiariosPagosCobrosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_localBeneficiariosPagosCobrosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_localBeneficiariosPagosCobrosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondebito_localBeneficiariosPagosCobrosBusqueda.setText("U");
		this.jButtondebito_localBeneficiariosPagosCobrosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondebito_localBeneficiariosPagosCobrosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondebito_localBeneficiariosPagosCobrosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddebito_localBeneficiariosPagosCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddebito_localBeneficiariosPagosCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"debito_localBeneficiariosPagosCobrosBusqueda"));

		if(this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondebito_localBeneficiariosPagosCobrosBusqueda.setVisible(false);		}


					
		this.jLabelcredito_localBeneficiariosPagosCobros = new JLabelMe();
		this.jLabelcredito_localBeneficiariosPagosCobros.setText(""+BeneficiariosPagosCobrosConstantesFunciones.LABEL_CREDITOLOCAL+" : *");
		this.jLabelcredito_localBeneficiariosPagosCobros.setToolTipText("Credito Local");
		this.jLabelcredito_localBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcredito_localBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcredito_localBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcredito_localBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcredito_localBeneficiariosPagosCobros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcredito_localBeneficiariosPagosCobros.setToolTipText(BeneficiariosPagosCobrosConstantesFunciones.LABEL_CREDITOLOCAL);
		this.gridaBagLayoutBeneficiariosPagosCobros = new GridBagLayout();
		this.jPanelcredito_localBeneficiariosPagosCobros.setLayout(this.gridaBagLayoutBeneficiariosPagosCobros);


		jTextFieldcredito_localBeneficiariosPagosCobros= new JTextFieldMe();
		jTextFieldcredito_localBeneficiariosPagosCobros.setEnabled(false);
		jTextFieldcredito_localBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_localBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_localBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcredito_localBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcredito_localBeneficiariosPagosCobros.setText("0.0");

		this.jButtoncredito_localBeneficiariosPagosCobrosBusqueda= new JButtonMe();
		this.jButtoncredito_localBeneficiariosPagosCobrosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_localBeneficiariosPagosCobrosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_localBeneficiariosPagosCobrosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncredito_localBeneficiariosPagosCobrosBusqueda.setText("U");
		this.jButtoncredito_localBeneficiariosPagosCobrosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncredito_localBeneficiariosPagosCobrosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncredito_localBeneficiariosPagosCobrosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcredito_localBeneficiariosPagosCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcredito_localBeneficiariosPagosCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"credito_localBeneficiariosPagosCobrosBusqueda"));

		if(this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncredito_localBeneficiariosPagosCobrosBusqueda.setVisible(false);		}


					
		this.jLabeldetalleBeneficiariosPagosCobros = new JLabelMe();
		this.jLabeldetalleBeneficiariosPagosCobros.setText(""+BeneficiariosPagosCobrosConstantesFunciones.LABEL_DETALLE+" : *");
		this.jLabeldetalleBeneficiariosPagosCobros.setToolTipText("Detalle");
		this.jLabeldetalleBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldetalleBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldetalleBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldetalleBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldetalleBeneficiariosPagosCobros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldetalleBeneficiariosPagosCobros.setToolTipText(BeneficiariosPagosCobrosConstantesFunciones.LABEL_DETALLE);
		this.gridaBagLayoutBeneficiariosPagosCobros = new GridBagLayout();
		this.jPaneldetalleBeneficiariosPagosCobros.setLayout(this.gridaBagLayoutBeneficiariosPagosCobros);


		jTextAreadetalleBeneficiariosPagosCobros= new JTextAreaMe();
		jTextAreadetalleBeneficiariosPagosCobros.setEnabled(false);
		jTextAreadetalleBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleBeneficiariosPagosCobros.setLineWrap(true);
		jTextAreadetalleBeneficiariosPagosCobros.setWrapStyleWord(true);
		jTextAreadetalleBeneficiariosPagosCobros.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadetalleBeneficiariosPagosCobros.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadetalleBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedetalleBeneficiariosPagosCobros = new JScrollPane(jTextAreadetalleBeneficiariosPagosCobros);
		jscrollPanedetalleBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedetalleBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedetalleBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondetalleBeneficiariosPagosCobrosBusqueda= new JButtonMe();
		this.jButtondetalleBeneficiariosPagosCobrosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalleBeneficiariosPagosCobrosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalleBeneficiariosPagosCobrosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondetalleBeneficiariosPagosCobrosBusqueda.setText("U");
		this.jButtondetalleBeneficiariosPagosCobrosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondetalleBeneficiariosPagosCobrosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondetalleBeneficiariosPagosCobrosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadetalleBeneficiariosPagosCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadetalleBeneficiariosPagosCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"detalleBeneficiariosPagosCobrosBusqueda"));

		if(this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondetalleBeneficiariosPagosCobrosBusqueda.setVisible(false);		}


					
		this.jLabeltipo_movimientoBeneficiariosPagosCobros = new JLabelMe();
		this.jLabeltipo_movimientoBeneficiariosPagosCobros.setText(""+BeneficiariosPagosCobrosConstantesFunciones.LABEL_TIPOMOVIMIENTO+" : *");
		this.jLabeltipo_movimientoBeneficiariosPagosCobros.setToolTipText("Tipo Movimiento");
		this.jLabeltipo_movimientoBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltipo_movimientoBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltipo_movimientoBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltipo_movimientoBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltipo_movimientoBeneficiariosPagosCobros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltipo_movimientoBeneficiariosPagosCobros.setToolTipText(BeneficiariosPagosCobrosConstantesFunciones.LABEL_TIPOMOVIMIENTO);
		this.gridaBagLayoutBeneficiariosPagosCobros = new GridBagLayout();
		this.jPaneltipo_movimientoBeneficiariosPagosCobros.setLayout(this.gridaBagLayoutBeneficiariosPagosCobros);


		jTextAreatipo_movimientoBeneficiariosPagosCobros= new JTextAreaMe();
		jTextAreatipo_movimientoBeneficiariosPagosCobros.setEnabled(false);
		jTextAreatipo_movimientoBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatipo_movimientoBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatipo_movimientoBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatipo_movimientoBeneficiariosPagosCobros.setLineWrap(true);
		jTextAreatipo_movimientoBeneficiariosPagosCobros.setWrapStyleWord(true);
		jTextAreatipo_movimientoBeneficiariosPagosCobros.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatipo_movimientoBeneficiariosPagosCobros.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreatipo_movimientoBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetipo_movimientoBeneficiariosPagosCobros = new JScrollPane(jTextAreatipo_movimientoBeneficiariosPagosCobros);
		jscrollPanetipo_movimientoBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetipo_movimientoBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetipo_movimientoBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtontipo_movimientoBeneficiariosPagosCobrosBusqueda= new JButtonMe();
		this.jButtontipo_movimientoBeneficiariosPagosCobrosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipo_movimientoBeneficiariosPagosCobrosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipo_movimientoBeneficiariosPagosCobrosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontipo_movimientoBeneficiariosPagosCobrosBusqueda.setText("U");
		this.jButtontipo_movimientoBeneficiariosPagosCobrosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontipo_movimientoBeneficiariosPagosCobrosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontipo_movimientoBeneficiariosPagosCobrosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatipo_movimientoBeneficiariosPagosCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatipo_movimientoBeneficiariosPagosCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tipo_movimientoBeneficiariosPagosCobrosBusqueda"));

		if(this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontipo_movimientoBeneficiariosPagosCobrosBusqueda.setVisible(false);		}


					
		this.jLabelvalorBeneficiariosPagosCobros = new JLabelMe();
		this.jLabelvalorBeneficiariosPagosCobros.setText(""+BeneficiariosPagosCobrosConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorBeneficiariosPagosCobros.setToolTipText("Valor");
		this.jLabelvalorBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorBeneficiariosPagosCobros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorBeneficiariosPagosCobros.setToolTipText(BeneficiariosPagosCobrosConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutBeneficiariosPagosCobros = new GridBagLayout();
		this.jPanelvalorBeneficiariosPagosCobros.setLayout(this.gridaBagLayoutBeneficiariosPagosCobros);


		jTextFieldvalorBeneficiariosPagosCobros= new JTextFieldMe();
		jTextFieldvalorBeneficiariosPagosCobros.setEnabled(false);
		jTextFieldvalorBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorBeneficiariosPagosCobros.setText("0.0");

		this.jButtonvalorBeneficiariosPagosCobrosBusqueda= new JButtonMe();
		this.jButtonvalorBeneficiariosPagosCobrosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorBeneficiariosPagosCobrosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorBeneficiariosPagosCobrosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorBeneficiariosPagosCobrosBusqueda.setText("U");
		this.jButtonvalorBeneficiariosPagosCobrosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorBeneficiariosPagosCobrosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorBeneficiariosPagosCobrosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorBeneficiariosPagosCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorBeneficiariosPagosCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorBeneficiariosPagosCobrosBusqueda"));

		if(this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorBeneficiariosPagosCobrosBusqueda.setVisible(false);		}


					
		this.jLabelcuentaBeneficiariosPagosCobros = new JLabelMe();
		this.jLabelcuentaBeneficiariosPagosCobros.setText(""+BeneficiariosPagosCobrosConstantesFunciones.LABEL_CUENTA+" : *");
		this.jLabelcuentaBeneficiariosPagosCobros.setToolTipText("Cuenta");
		this.jLabelcuentaBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcuentaBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcuentaBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcuentaBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcuentaBeneficiariosPagosCobros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcuentaBeneficiariosPagosCobros.setToolTipText(BeneficiariosPagosCobrosConstantesFunciones.LABEL_CUENTA);
		this.gridaBagLayoutBeneficiariosPagosCobros = new GridBagLayout();
		this.jPanelcuentaBeneficiariosPagosCobros.setLayout(this.gridaBagLayoutBeneficiariosPagosCobros);


		jTextFieldcuentaBeneficiariosPagosCobros= new JTextFieldMe();

		jTextFieldcuentaBeneficiariosPagosCobros.setEnabled(false);
		jTextFieldcuentaBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcuentaBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcuentaBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcuentaBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncuentaBeneficiariosPagosCobrosBusqueda= new JButtonMe();
		this.jButtoncuentaBeneficiariosPagosCobrosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncuentaBeneficiariosPagosCobrosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncuentaBeneficiariosPagosCobrosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncuentaBeneficiariosPagosCobrosBusqueda.setText("U");
		this.jButtoncuentaBeneficiariosPagosCobrosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncuentaBeneficiariosPagosCobrosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncuentaBeneficiariosPagosCobrosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcuentaBeneficiariosPagosCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcuentaBeneficiariosPagosCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cuentaBeneficiariosPagosCobrosBusqueda"));

		if(this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncuentaBeneficiariosPagosCobrosBusqueda.setVisible(false);		}


					
		this.jLabelfechaBeneficiariosPagosCobros = new JLabelMe();
		this.jLabelfechaBeneficiariosPagosCobros.setText(""+BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaBeneficiariosPagosCobros.setToolTipText("Fecha");
		this.jLabelfechaBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaBeneficiariosPagosCobros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaBeneficiariosPagosCobros.setToolTipText(BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutBeneficiariosPagosCobros = new GridBagLayout();
		this.jPanelfechaBeneficiariosPagosCobros.setLayout(this.gridaBagLayoutBeneficiariosPagosCobros);


		//jFormattedTextFieldfechaBeneficiariosPagosCobros= new JFormattedTextFieldMe();

		jDateChooserfechaBeneficiariosPagosCobros= new JDateChooser();
		jDateChooserfechaBeneficiariosPagosCobros.setEnabled(false);
		jDateChooserfechaBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaBeneficiariosPagosCobros.setDate(new Date());
		jDateChooserfechaBeneficiariosPagosCobros.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaBeneficiariosPagosCobros.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaBeneficiariosPagosCobrosBusqueda= new JButtonMe();
		this.jButtonfechaBeneficiariosPagosCobrosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaBeneficiariosPagosCobrosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaBeneficiariosPagosCobrosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaBeneficiariosPagosCobrosBusqueda.setText("U");
		this.jButtonfechaBeneficiariosPagosCobrosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaBeneficiariosPagosCobrosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaBeneficiariosPagosCobrosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaBeneficiariosPagosCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaBeneficiariosPagosCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaBeneficiariosPagosCobrosBusqueda"));

		if(this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaBeneficiariosPagosCobrosBusqueda.setVisible(false);		}


					
		this.jLabelbeneficiario_asientoBeneficiariosPagosCobros = new JLabelMe();
		this.jLabelbeneficiario_asientoBeneficiariosPagosCobros.setText(""+BeneficiariosPagosCobrosConstantesFunciones.LABEL_BENEFICIARIOASIENTO+" : *");
		this.jLabelbeneficiario_asientoBeneficiariosPagosCobros.setToolTipText("Beneficiario Asiento");
		this.jLabelbeneficiario_asientoBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelbeneficiario_asientoBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelbeneficiario_asientoBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelbeneficiario_asientoBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbeneficiario_asientoBeneficiariosPagosCobros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbeneficiario_asientoBeneficiariosPagosCobros.setToolTipText(BeneficiariosPagosCobrosConstantesFunciones.LABEL_BENEFICIARIOASIENTO);
		this.gridaBagLayoutBeneficiariosPagosCobros = new GridBagLayout();
		this.jPanelbeneficiario_asientoBeneficiariosPagosCobros.setLayout(this.gridaBagLayoutBeneficiariosPagosCobros);


		jTextAreabeneficiario_asientoBeneficiariosPagosCobros= new JTextAreaMe();
		jTextAreabeneficiario_asientoBeneficiariosPagosCobros.setEnabled(false);
		jTextAreabeneficiario_asientoBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiario_asientoBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiario_asientoBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiario_asientoBeneficiariosPagosCobros.setLineWrap(true);
		jTextAreabeneficiario_asientoBeneficiariosPagosCobros.setWrapStyleWord(true);
		jTextAreabeneficiario_asientoBeneficiariosPagosCobros.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreabeneficiario_asientoBeneficiariosPagosCobros.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreabeneficiario_asientoBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanebeneficiario_asientoBeneficiariosPagosCobros = new JScrollPane(jTextAreabeneficiario_asientoBeneficiariosPagosCobros);
		jscrollPanebeneficiario_asientoBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanebeneficiario_asientoBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanebeneficiario_asientoBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonbeneficiario_asientoBeneficiariosPagosCobrosBusqueda= new JButtonMe();
		this.jButtonbeneficiario_asientoBeneficiariosPagosCobrosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbeneficiario_asientoBeneficiariosPagosCobrosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbeneficiario_asientoBeneficiariosPagosCobrosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbeneficiario_asientoBeneficiariosPagosCobrosBusqueda.setText("U");
		this.jButtonbeneficiario_asientoBeneficiariosPagosCobrosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbeneficiario_asientoBeneficiariosPagosCobrosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbeneficiario_asientoBeneficiariosPagosCobrosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreabeneficiario_asientoBeneficiariosPagosCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreabeneficiario_asientoBeneficiariosPagosCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"beneficiario_asientoBeneficiariosPagosCobrosBusqueda"));

		if(this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbeneficiario_asientoBeneficiariosPagosCobrosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysBeneficiariosPagosCobros() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaBeneficiariosPagosCobros = new JLabelMe();
		this.jLabelid_empresaBeneficiariosPagosCobros.setText(""+BeneficiariosPagosCobrosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaBeneficiariosPagosCobros.setToolTipText("Empresa");
		this.jLabelid_empresaBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaBeneficiariosPagosCobros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaBeneficiariosPagosCobros.setToolTipText(BeneficiariosPagosCobrosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutBeneficiariosPagosCobros = new GridBagLayout();
		this.jPanelid_empresaBeneficiariosPagosCobros.setLayout(this.gridaBagLayoutBeneficiariosPagosCobros);


		jComboBoxid_empresaBeneficiariosPagosCobros= new JComboBoxMe();
		jComboBoxid_empresaBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaBeneficiariosPagosCobros.setEnabled(false);

		this.jButtonid_empresaBeneficiariosPagosCobros= new JButtonMe();
		this.jButtonid_empresaBeneficiariosPagosCobros.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaBeneficiariosPagosCobros.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaBeneficiariosPagosCobros.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaBeneficiariosPagosCobros.setText("Buscar");
		this.jButtonid_empresaBeneficiariosPagosCobros.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaBeneficiariosPagosCobros.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaBeneficiariosPagosCobros,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaBeneficiariosPagosCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaBeneficiariosPagosCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaBeneficiariosPagosCobros"));

		this.jButtonid_empresaBeneficiariosPagosCobrosBusqueda= new JButtonMe();
		this.jButtonid_empresaBeneficiariosPagosCobrosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBeneficiariosPagosCobrosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBeneficiariosPagosCobrosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaBeneficiariosPagosCobrosBusqueda.setText("U");
		this.jButtonid_empresaBeneficiariosPagosCobrosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaBeneficiariosPagosCobrosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaBeneficiariosPagosCobrosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaBeneficiariosPagosCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaBeneficiariosPagosCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaBeneficiariosPagosCobrosBusqueda"));

		if(this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaBeneficiariosPagosCobrosBusqueda.setVisible(false);		}

		this.jButtonid_empresaBeneficiariosPagosCobrosUpdate= new JButtonMe();
		this.jButtonid_empresaBeneficiariosPagosCobrosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBeneficiariosPagosCobrosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBeneficiariosPagosCobrosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaBeneficiariosPagosCobrosUpdate.setText("U");
		this.jButtonid_empresaBeneficiariosPagosCobrosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaBeneficiariosPagosCobrosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaBeneficiariosPagosCobrosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaBeneficiariosPagosCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaBeneficiariosPagosCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaBeneficiariosPagosCobrosUpdate"));



					
		this.jLabelid_sucursalBeneficiariosPagosCobros = new JLabelMe();
		this.jLabelid_sucursalBeneficiariosPagosCobros.setText(""+BeneficiariosPagosCobrosConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalBeneficiariosPagosCobros.setToolTipText("Sucursal");
		this.jLabelid_sucursalBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalBeneficiariosPagosCobros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalBeneficiariosPagosCobros.setToolTipText(BeneficiariosPagosCobrosConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutBeneficiariosPagosCobros = new GridBagLayout();
		this.jPanelid_sucursalBeneficiariosPagosCobros.setLayout(this.gridaBagLayoutBeneficiariosPagosCobros);


		jComboBoxid_sucursalBeneficiariosPagosCobros= new JComboBoxMe();
		jComboBoxid_sucursalBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalBeneficiariosPagosCobros.setEnabled(false);

		this.jButtonid_sucursalBeneficiariosPagosCobros= new JButtonMe();
		this.jButtonid_sucursalBeneficiariosPagosCobros.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalBeneficiariosPagosCobros.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalBeneficiariosPagosCobros.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalBeneficiariosPagosCobros.setText("Buscar");
		this.jButtonid_sucursalBeneficiariosPagosCobros.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalBeneficiariosPagosCobros.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalBeneficiariosPagosCobros,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalBeneficiariosPagosCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalBeneficiariosPagosCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalBeneficiariosPagosCobros"));

		this.jButtonid_sucursalBeneficiariosPagosCobrosBusqueda= new JButtonMe();
		this.jButtonid_sucursalBeneficiariosPagosCobrosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalBeneficiariosPagosCobrosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalBeneficiariosPagosCobrosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalBeneficiariosPagosCobrosBusqueda.setText("U");
		this.jButtonid_sucursalBeneficiariosPagosCobrosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalBeneficiariosPagosCobrosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalBeneficiariosPagosCobrosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalBeneficiariosPagosCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalBeneficiariosPagosCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalBeneficiariosPagosCobrosBusqueda"));

		if(this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalBeneficiariosPagosCobrosBusqueda.setVisible(false);		}

		this.jButtonid_sucursalBeneficiariosPagosCobrosUpdate= new JButtonMe();
		this.jButtonid_sucursalBeneficiariosPagosCobrosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalBeneficiariosPagosCobrosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalBeneficiariosPagosCobrosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalBeneficiariosPagosCobrosUpdate.setText("U");
		this.jButtonid_sucursalBeneficiariosPagosCobrosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalBeneficiariosPagosCobrosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalBeneficiariosPagosCobrosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalBeneficiariosPagosCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalBeneficiariosPagosCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalBeneficiariosPagosCobrosUpdate"));



					
		this.jLabelid_ejercicioBeneficiariosPagosCobros = new JLabelMe();
		this.jLabelid_ejercicioBeneficiariosPagosCobros.setText(""+BeneficiariosPagosCobrosConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioBeneficiariosPagosCobros.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioBeneficiariosPagosCobros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioBeneficiariosPagosCobros.setToolTipText(BeneficiariosPagosCobrosConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutBeneficiariosPagosCobros = new GridBagLayout();
		this.jPanelid_ejercicioBeneficiariosPagosCobros.setLayout(this.gridaBagLayoutBeneficiariosPagosCobros);


		jComboBoxid_ejercicioBeneficiariosPagosCobros= new JComboBoxMe();
		jComboBoxid_ejercicioBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioBeneficiariosPagosCobros.setEnabled(false);

		this.jButtonid_ejercicioBeneficiariosPagosCobros= new JButtonMe();
		this.jButtonid_ejercicioBeneficiariosPagosCobros.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioBeneficiariosPagosCobros.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioBeneficiariosPagosCobros.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioBeneficiariosPagosCobros.setText("Buscar");
		this.jButtonid_ejercicioBeneficiariosPagosCobros.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioBeneficiariosPagosCobros.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioBeneficiariosPagosCobros,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioBeneficiariosPagosCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioBeneficiariosPagosCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioBeneficiariosPagosCobros"));

		this.jButtonid_ejercicioBeneficiariosPagosCobrosBusqueda= new JButtonMe();
		this.jButtonid_ejercicioBeneficiariosPagosCobrosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioBeneficiariosPagosCobrosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioBeneficiariosPagosCobrosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioBeneficiariosPagosCobrosBusqueda.setText("U");
		this.jButtonid_ejercicioBeneficiariosPagosCobrosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioBeneficiariosPagosCobrosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioBeneficiariosPagosCobrosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioBeneficiariosPagosCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioBeneficiariosPagosCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioBeneficiariosPagosCobrosBusqueda"));

		if(this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioBeneficiariosPagosCobrosBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioBeneficiariosPagosCobrosUpdate= new JButtonMe();
		this.jButtonid_ejercicioBeneficiariosPagosCobrosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioBeneficiariosPagosCobrosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioBeneficiariosPagosCobrosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioBeneficiariosPagosCobrosUpdate.setText("U");
		this.jButtonid_ejercicioBeneficiariosPagosCobrosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioBeneficiariosPagosCobrosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioBeneficiariosPagosCobrosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioBeneficiariosPagosCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioBeneficiariosPagosCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioBeneficiariosPagosCobrosUpdate"));



					
		this.jLabelid_tipo_movimientoBeneficiariosPagosCobros = new JLabelMe();
		this.jLabelid_tipo_movimientoBeneficiariosPagosCobros.setText(""+BeneficiariosPagosCobrosConstantesFunciones.LABEL_IDTIPOMOVIMIENTO+" : *");
		this.jLabelid_tipo_movimientoBeneficiariosPagosCobros.setToolTipText("Tipo Movimiento Base");
		this.jLabelid_tipo_movimientoBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_movimientoBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_movimientoBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimientoBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_movimientoBeneficiariosPagosCobros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_movimientoBeneficiariosPagosCobros.setToolTipText(BeneficiariosPagosCobrosConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
		this.gridaBagLayoutBeneficiariosPagosCobros = new GridBagLayout();
		this.jPanelid_tipo_movimientoBeneficiariosPagosCobros.setLayout(this.gridaBagLayoutBeneficiariosPagosCobros);


		jComboBoxid_tipo_movimientoBeneficiariosPagosCobros= new JComboBoxMe();
		jComboBoxid_tipo_movimientoBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimientoBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_movimientoBeneficiariosPagosCobros= new JButtonMe();
		this.jButtonid_tipo_movimientoBeneficiariosPagosCobros.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoBeneficiariosPagosCobros.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoBeneficiariosPagosCobros.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoBeneficiariosPagosCobros.setText("Buscar");
		this.jButtonid_tipo_movimientoBeneficiariosPagosCobros.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_movimientoBeneficiariosPagosCobros.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoBeneficiariosPagosCobros,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_movimientoBeneficiariosPagosCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoBeneficiariosPagosCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoBeneficiariosPagosCobros"));

		this.jButtonid_tipo_movimientoBeneficiariosPagosCobrosBusqueda= new JButtonMe();
		this.jButtonid_tipo_movimientoBeneficiariosPagosCobrosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoBeneficiariosPagosCobrosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoBeneficiariosPagosCobrosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoBeneficiariosPagosCobrosBusqueda.setText("U");
		this.jButtonid_tipo_movimientoBeneficiariosPagosCobrosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_movimientoBeneficiariosPagosCobrosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoBeneficiariosPagosCobrosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_movimientoBeneficiariosPagosCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoBeneficiariosPagosCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoBeneficiariosPagosCobrosBusqueda"));

		if(this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_movimientoBeneficiariosPagosCobrosBusqueda.setVisible(false);		}

		this.jButtonid_tipo_movimientoBeneficiariosPagosCobrosUpdate= new JButtonMe();
		this.jButtonid_tipo_movimientoBeneficiariosPagosCobrosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoBeneficiariosPagosCobrosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoBeneficiariosPagosCobrosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoBeneficiariosPagosCobrosUpdate.setText("U");
		this.jButtonid_tipo_movimientoBeneficiariosPagosCobrosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_movimientoBeneficiariosPagosCobrosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoBeneficiariosPagosCobrosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_movimientoBeneficiariosPagosCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoBeneficiariosPagosCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoBeneficiariosPagosCobrosUpdate"));



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
		//this.jInternalFrameDetalleBeneficiariosPagosCobros = new BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Beneficiarios Pagos Cobros DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutBeneficiariosPagosCobros= new GridBagLayout();
		

		
		String sToolTipBeneficiariosPagosCobros="";
		sToolTipBeneficiariosPagosCobros=BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipBeneficiariosPagosCobros+="(Tesoreria.BeneficiariosPagosCobros)";
		}
		
		if(!this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()) {
			sToolTipBeneficiariosPagosCobros+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoBeneficiariosPagosCobros = new JButtonMe();
		this.jButtonModificarBeneficiariosPagosCobros = new JButtonMe();
        this.jButtonActualizarBeneficiariosPagosCobros = new JButtonMe();
        this.jButtonEliminarBeneficiariosPagosCobros = new JButtonMe();
        this.jButtonCancelarBeneficiariosPagosCobros = new JButtonMe();
        this.jButtonGuardarCambiosBeneficiariosPagosCobros = new JButtonMe();
		this.jButtonGuardarCambiosTablaBeneficiariosPagosCobros = new JButtonMe();
		this.jButtonCerrarBeneficiariosPagosCobros = new JButtonMe();
		
		this.jScrollPanelDatosBeneficiariosPagosCobros = new JScrollPane();   
        this.jScrollPanelDatosEdicionBeneficiariosPagosCobros = new JScrollPane();
		this.jScrollPanelDatosGeneralBeneficiariosPagosCobros = new JScrollPane();
				
		
		
		this.jPanelCamposBeneficiariosPagosCobros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosBeneficiariosPagosCobros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesBeneficiariosPagosCobros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioBeneficiariosPagosCobros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Beneficiarios Pagos Cobros";
		
		if(!this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosBeneficiariosPagosCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Beneficiarios Pagos Cobroses" + this.sPath));
		} else {
			this.jScrollPanelDatosBeneficiariosPagosCobros.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionBeneficiariosPagosCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralBeneficiariosPagosCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposBeneficiariosPagosCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposBeneficiariosPagosCobros.setName("jPanelCamposBeneficiariosPagosCobros"); 

		this.jPanelCamposOcultosBeneficiariosPagosCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosBeneficiariosPagosCobros.setName("jPanelCamposOcultosBeneficiariosPagosCobros"); 

        this.jPanelAccionesBeneficiariosPagosCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesBeneficiariosPagosCobros.setToolTipText("Acciones");
        this.jPanelAccionesBeneficiariosPagosCobros.setName("Acciones"); 

		this.jPanelAccionesFormularioBeneficiariosPagosCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioBeneficiariosPagosCobros.setToolTipText("Acciones");
        this.jPanelAccionesFormularioBeneficiariosPagosCobros.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoBeneficiariosPagosCobros.setText("Nuevo");
		this.jButtonModificarBeneficiariosPagosCobros.setText("Editar");
        this.jButtonActualizarBeneficiariosPagosCobros.setText("Actualizar");
        this.jButtonEliminarBeneficiariosPagosCobros.setText("Eliminar");
        this.jButtonCancelarBeneficiariosPagosCobros.setText("Cancelar");
        this.jButtonGuardarCambiosBeneficiariosPagosCobros.setText("Guardar");
		this.jButtonGuardarCambiosTablaBeneficiariosPagosCobros.setText("Guardar");
		this.jButtonCerrarBeneficiariosPagosCobros.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoBeneficiariosPagosCobros,"nuevo_button","Nuevo",this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarBeneficiariosPagosCobros,"modificar_button","Editar",this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarBeneficiariosPagosCobros,"actualizar_button","Actualizar",this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarBeneficiariosPagosCobros,"eliminar_button","Eliminar",this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarBeneficiariosPagosCobros,"cancelar_button","Cancelar",this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosBeneficiariosPagosCobros,"guardarcambios_button","Guardar",this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaBeneficiariosPagosCobros,"guardarcambiostabla_button","Guardar",this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarBeneficiariosPagosCobros,"cerrar_button","Salir",this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoBeneficiariosPagosCobros.setToolTipText("Nuevo"+" "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarBeneficiariosPagosCobros.setToolTipText("Editar"+" "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarBeneficiariosPagosCobros.setToolTipText("Actualizar"+" "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarBeneficiariosPagosCobros.setToolTipText("Eliminar)"+" "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarBeneficiariosPagosCobros.setToolTipText("Cancelar"+" "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosBeneficiariosPagosCobros.setToolTipText("Guardar"+" "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaBeneficiariosPagosCobros.setToolTipText("Guardar"+" "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarBeneficiariosPagosCobros.setToolTipText("Salir"+" "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoBeneficiariosPagosCobros";
		inputMap = this.jButtonNuevoBeneficiariosPagosCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoBeneficiariosPagosCobros.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoBeneficiariosPagosCobros"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarBeneficiariosPagosCobros";
		inputMap = this.jButtonActualizarBeneficiariosPagosCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarBeneficiariosPagosCobros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarBeneficiariosPagosCobros"));
		
		//ELIMINAR
		sMapKey = "EliminarBeneficiariosPagosCobros";
		inputMap = this.jButtonEliminarBeneficiariosPagosCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarBeneficiariosPagosCobros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarBeneficiariosPagosCobros"));
		
		//CANCELAR	
		sMapKey = "CancelarBeneficiariosPagosCobros";
		inputMap = this.jButtonCancelarBeneficiariosPagosCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarBeneficiariosPagosCobros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarBeneficiariosPagosCobros"));
		
		//CERRAR		
		sMapKey = "CerrarBeneficiariosPagosCobros";
		inputMap = this.jButtonCerrarBeneficiariosPagosCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarBeneficiariosPagosCobros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarBeneficiariosPagosCobros"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaBeneficiariosPagosCobros";
		inputMap = this.jButtonGuardarCambiosTablaBeneficiariosPagosCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaBeneficiariosPagosCobros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaBeneficiariosPagosCobros"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoBeneficiariosPagosCobros = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoBeneficiariosPagosCobros.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoBeneficiariosPagosCobros.setToolTipText("Nuevo BeneficiariosPagosCobros");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarBeneficiariosPagosCobros = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarBeneficiariosPagosCobros.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarBeneficiariosPagosCobros.setToolTipText("Sin Cerrar Ventana BeneficiariosPagosCobros");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeBeneficiariosPagosCobros = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeBeneficiariosPagosCobros.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeBeneficiariosPagosCobros.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesBeneficiariosPagosCobros = new JComboBoxMe();
		//this.jComboBoxTiposAccionesBeneficiariosPagosCobros.setText("Accion");
		this.jComboBoxTiposAccionesBeneficiariosPagosCobros.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioBeneficiariosPagosCobros = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioBeneficiariosPagosCobros.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioBeneficiariosPagosCobros.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesBeneficiariosPagosCobros = new JLabelMe();
		
		this.jLabelAccionesBeneficiariosPagosCobros.setText("Acciones");		
		this.jLabelAccionesBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposBeneficiariosPagosCobros();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysBeneficiariosPagosCobros();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesBeneficiariosPagosCobros=new JTabbedPane();
		this.jTabbedPaneRelacionesBeneficiariosPagosCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesBeneficiariosPagosCobros.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBeneficiariosPagosCobros.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBeneficiariosPagosCobros.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioBeneficiariosPagosCobros.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioBeneficiariosPagosCobros.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioBeneficiariosPagosCobros.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposBeneficiariosPagosCobros = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosBeneficiariosPagosCobros = new GridBagLayout();
		
		this.jPanelCamposBeneficiariosPagosCobros.setLayout(gridaBagLayoutCamposBeneficiariosPagosCobros);
		this.jPanelCamposOcultosBeneficiariosPagosCobros.setLayout(gridaBagLayoutCamposOcultosBeneficiariosPagosCobros);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidBeneficiariosPagosCobros.add(jLabelIdBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 1;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidBeneficiariosPagosCobros.add(jLabelidBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);


	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaBeneficiariosPagosCobros.add(jLabelid_empresaBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		//this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 2;
		this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaBeneficiariosPagosCobros.add(jButtonid_empresaBeneficiariosPagosCobrosBusqueda, this.gridBagConstraintsBeneficiariosPagosCobros);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		//this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 3;
		this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaBeneficiariosPagosCobros.add(jButtonid_empresaBeneficiariosPagosCobrosUpdate, this.gridBagConstraintsBeneficiariosPagosCobros);
	}

	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 1;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaBeneficiariosPagosCobros.add(jComboBoxid_empresaBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);


	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalBeneficiariosPagosCobros.add(jLabelid_sucursalBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		//this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 2;
		this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalBeneficiariosPagosCobros.add(jButtonid_sucursalBeneficiariosPagosCobrosBusqueda, this.gridBagConstraintsBeneficiariosPagosCobros);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		//this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 3;
		this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalBeneficiariosPagosCobros.add(jButtonid_sucursalBeneficiariosPagosCobrosUpdate, this.gridBagConstraintsBeneficiariosPagosCobros);
	}

	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 1;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalBeneficiariosPagosCobros.add(jComboBoxid_sucursalBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);


	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioBeneficiariosPagosCobros.add(jLabelid_ejercicioBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		//this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 2;
		this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioBeneficiariosPagosCobros.add(jButtonid_ejercicioBeneficiariosPagosCobrosBusqueda, this.gridBagConstraintsBeneficiariosPagosCobros);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		//this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 3;
		this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioBeneficiariosPagosCobros.add(jButtonid_ejercicioBeneficiariosPagosCobrosUpdate, this.gridBagConstraintsBeneficiariosPagosCobros);
	}

	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 1;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioBeneficiariosPagosCobros.add(jComboBoxid_ejercicioBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);


	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_movimientoBeneficiariosPagosCobros.add(jLabelid_tipo_movimientoBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		//this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 2;
		this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoBeneficiariosPagosCobros.add(jButtonid_tipo_movimientoBeneficiariosPagosCobrosBusqueda, this.gridBagConstraintsBeneficiariosPagosCobros);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		//this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 3;
		this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoBeneficiariosPagosCobros.add(jButtonid_tipo_movimientoBeneficiariosPagosCobrosUpdate, this.gridBagConstraintsBeneficiariosPagosCobros);
	}

	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 1;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_movimientoBeneficiariosPagosCobros.add(jComboBoxid_tipo_movimientoBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);


	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_desdeBeneficiariosPagosCobros.add(jLabelfecha_desdeBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		//this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 2;
		this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_desdeBeneficiariosPagosCobros.add(jButtonfecha_desdeBeneficiariosPagosCobrosBusqueda, this.gridBagConstraintsBeneficiariosPagosCobros);
	}

	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 1;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_desdeBeneficiariosPagosCobros.add(jDateChooserfecha_desdeBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);


	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_hastaBeneficiariosPagosCobros.add(jLabelfecha_hastaBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		//this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 2;
		this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_hastaBeneficiariosPagosCobros.add(jButtonfecha_hastaBeneficiariosPagosCobrosBusqueda, this.gridBagConstraintsBeneficiariosPagosCobros);
	}

	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 1;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_hastaBeneficiariosPagosCobros.add(jDateChooserfecha_hastaBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);


	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_cuenta_contableBeneficiariosPagosCobros.add(jLabelcodigo_cuenta_contableBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		//this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 2;
		this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_cuenta_contableBeneficiariosPagosCobros.add(jButtoncodigo_cuenta_contableBeneficiariosPagosCobrosBusqueda, this.gridBagConstraintsBeneficiariosPagosCobros);
	}

	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 1;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_cuenta_contableBeneficiariosPagosCobros.add(jTextFieldcodigo_cuenta_contableBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);


	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_cuenta_contableBeneficiariosPagosCobros.add(jLabelnombre_cuenta_contableBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		//this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 2;
		this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_cuenta_contableBeneficiariosPagosCobros.add(jButtonnombre_cuenta_contableBeneficiariosPagosCobrosBusqueda, this.gridBagConstraintsBeneficiariosPagosCobros);
	}

	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 1;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_cuenta_contableBeneficiariosPagosCobros.add(jscrollPanenombre_cuenta_contableBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);


	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_mayorBeneficiariosPagosCobros.add(jLabelnumero_mayorBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		//this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 2;
		this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_mayorBeneficiariosPagosCobros.add(jButtonnumero_mayorBeneficiariosPagosCobrosBusqueda, this.gridBagConstraintsBeneficiariosPagosCobros);
	}

	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 1;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_mayorBeneficiariosPagosCobros.add(jscrollPanenumero_mayorBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);


	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_chequeBeneficiariosPagosCobros.add(jLabelnumero_chequeBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		//this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 2;
		this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_chequeBeneficiariosPagosCobros.add(jButtonnumero_chequeBeneficiariosPagosCobrosBusqueda, this.gridBagConstraintsBeneficiariosPagosCobros);
	}

	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 1;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_chequeBeneficiariosPagosCobros.add(jTextFieldnumero_chequeBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);


	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelbeneficiarioBeneficiariosPagosCobros.add(jLabelbeneficiarioBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		//this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 2;
		this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelbeneficiarioBeneficiariosPagosCobros.add(jButtonbeneficiarioBeneficiariosPagosCobrosBusqueda, this.gridBagConstraintsBeneficiariosPagosCobros);
	}

	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 1;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelbeneficiarioBeneficiariosPagosCobros.add(jscrollPanebeneficiarioBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);


	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldebito_localBeneficiariosPagosCobros.add(jLabeldebito_localBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		//this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 2;
		this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(0, 0, 0, 0);
		this.jPaneldebito_localBeneficiariosPagosCobros.add(jButtondebito_localBeneficiariosPagosCobrosBusqueda, this.gridBagConstraintsBeneficiariosPagosCobros);
	}

	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 1;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldebito_localBeneficiariosPagosCobros.add(jTextFielddebito_localBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);


	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcredito_localBeneficiariosPagosCobros.add(jLabelcredito_localBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		//this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 2;
		this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelcredito_localBeneficiariosPagosCobros.add(jButtoncredito_localBeneficiariosPagosCobrosBusqueda, this.gridBagConstraintsBeneficiariosPagosCobros);
	}

	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 1;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcredito_localBeneficiariosPagosCobros.add(jTextFieldcredito_localBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);


	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldetalleBeneficiariosPagosCobros.add(jLabeldetalleBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		//this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 2;
		this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(0, 0, 0, 0);
		this.jPaneldetalleBeneficiariosPagosCobros.add(jButtondetalleBeneficiariosPagosCobrosBusqueda, this.gridBagConstraintsBeneficiariosPagosCobros);
	}

	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 1;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldetalleBeneficiariosPagosCobros.add(jscrollPanedetalleBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);


	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltipo_movimientoBeneficiariosPagosCobros.add(jLabeltipo_movimientoBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		//this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 2;
		this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(0, 0, 0, 0);
		this.jPaneltipo_movimientoBeneficiariosPagosCobros.add(jButtontipo_movimientoBeneficiariosPagosCobrosBusqueda, this.gridBagConstraintsBeneficiariosPagosCobros);
	}

	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 1;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltipo_movimientoBeneficiariosPagosCobros.add(jscrollPanetipo_movimientoBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);


	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorBeneficiariosPagosCobros.add(jLabelvalorBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		//this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 2;
		this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorBeneficiariosPagosCobros.add(jButtonvalorBeneficiariosPagosCobrosBusqueda, this.gridBagConstraintsBeneficiariosPagosCobros);
	}

	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 1;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorBeneficiariosPagosCobros.add(jTextFieldvalorBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);


	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcuentaBeneficiariosPagosCobros.add(jLabelcuentaBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		//this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 2;
		this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelcuentaBeneficiariosPagosCobros.add(jButtoncuentaBeneficiariosPagosCobrosBusqueda, this.gridBagConstraintsBeneficiariosPagosCobros);
	}

	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 1;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcuentaBeneficiariosPagosCobros.add(jTextFieldcuentaBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);


	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaBeneficiariosPagosCobros.add(jLabelfechaBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		//this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 2;
		this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaBeneficiariosPagosCobros.add(jButtonfechaBeneficiariosPagosCobrosBusqueda, this.gridBagConstraintsBeneficiariosPagosCobros);
	}

	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 1;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaBeneficiariosPagosCobros.add(jDateChooserfechaBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);


	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelbeneficiario_asientoBeneficiariosPagosCobros.add(jLabelbeneficiario_asientoBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		//this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 2;
		this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelbeneficiario_asientoBeneficiariosPagosCobros.add(jButtonbeneficiario_asientoBeneficiariosPagosCobrosBusqueda, this.gridBagConstraintsBeneficiariosPagosCobros);
	}

	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 1;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelbeneficiario_asientoBeneficiariosPagosCobros.add(jscrollPanebeneficiario_asientoBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iYPanelCamposBeneficiariosPagosCobros;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iXPanelCamposBeneficiariosPagosCobros++;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBeneficiariosPagosCobros.add(this.jPanelidBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(iXPanelCamposBeneficiariosPagosCobros % 2==0) {
		iXPanelCamposBeneficiariosPagosCobros=0;
		iYPanelCamposBeneficiariosPagosCobros++;
	}
	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iYPanelCamposBeneficiariosPagosCobros;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iXPanelCamposBeneficiariosPagosCobros++;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBeneficiariosPagosCobros.add(this.jPanelid_tipo_movimientoBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(iXPanelCamposBeneficiariosPagosCobros % 2==0) {
		iXPanelCamposBeneficiariosPagosCobros=0;
		iYPanelCamposBeneficiariosPagosCobros++;
	}
	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iYPanelCamposBeneficiariosPagosCobros;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iXPanelCamposBeneficiariosPagosCobros++;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBeneficiariosPagosCobros.add(this.jPanelfecha_desdeBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(iXPanelCamposBeneficiariosPagosCobros % 2==0) {
		iXPanelCamposBeneficiariosPagosCobros=0;
		iYPanelCamposBeneficiariosPagosCobros++;
	}
	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iYPanelCamposBeneficiariosPagosCobros;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iXPanelCamposBeneficiariosPagosCobros++;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBeneficiariosPagosCobros.add(this.jPanelfecha_hastaBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(iXPanelCamposBeneficiariosPagosCobros % 2==0) {
		iXPanelCamposBeneficiariosPagosCobros=0;
		iYPanelCamposBeneficiariosPagosCobros++;
	}
	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iYPanelCamposBeneficiariosPagosCobros;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iXPanelCamposBeneficiariosPagosCobros++;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBeneficiariosPagosCobros.add(this.jPanelcodigo_cuenta_contableBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(iXPanelCamposBeneficiariosPagosCobros % 2==0) {
		iXPanelCamposBeneficiariosPagosCobros=0;
		iYPanelCamposBeneficiariosPagosCobros++;
	}
	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iYPanelCamposBeneficiariosPagosCobros;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iXPanelCamposBeneficiariosPagosCobros++;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBeneficiariosPagosCobros.add(this.jPanelnombre_cuenta_contableBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(iXPanelCamposBeneficiariosPagosCobros % 2==0) {
		iXPanelCamposBeneficiariosPagosCobros=0;
		iYPanelCamposBeneficiariosPagosCobros++;
	}
	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iYPanelCamposBeneficiariosPagosCobros;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iXPanelCamposBeneficiariosPagosCobros++;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBeneficiariosPagosCobros.add(this.jPanelnumero_mayorBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(iXPanelCamposBeneficiariosPagosCobros % 2==0) {
		iXPanelCamposBeneficiariosPagosCobros=0;
		iYPanelCamposBeneficiariosPagosCobros++;
	}
	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iYPanelCamposBeneficiariosPagosCobros;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iXPanelCamposBeneficiariosPagosCobros++;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBeneficiariosPagosCobros.add(this.jPanelnumero_chequeBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(iXPanelCamposBeneficiariosPagosCobros % 2==0) {
		iXPanelCamposBeneficiariosPagosCobros=0;
		iYPanelCamposBeneficiariosPagosCobros++;
	}
	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iYPanelCamposBeneficiariosPagosCobros;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iXPanelCamposBeneficiariosPagosCobros++;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBeneficiariosPagosCobros.add(this.jPanelbeneficiarioBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(iXPanelCamposBeneficiariosPagosCobros % 2==0) {
		iXPanelCamposBeneficiariosPagosCobros=0;
		iYPanelCamposBeneficiariosPagosCobros++;
	}
	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iYPanelCamposBeneficiariosPagosCobros;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iXPanelCamposBeneficiariosPagosCobros++;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBeneficiariosPagosCobros.add(this.jPaneldebito_localBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(iXPanelCamposBeneficiariosPagosCobros % 2==0) {
		iXPanelCamposBeneficiariosPagosCobros=0;
		iYPanelCamposBeneficiariosPagosCobros++;
	}
	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iYPanelCamposBeneficiariosPagosCobros;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iXPanelCamposBeneficiariosPagosCobros++;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBeneficiariosPagosCobros.add(this.jPanelcredito_localBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(iXPanelCamposBeneficiariosPagosCobros % 2==0) {
		iXPanelCamposBeneficiariosPagosCobros=0;
		iYPanelCamposBeneficiariosPagosCobros++;
	}
	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iYPanelCamposBeneficiariosPagosCobros;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iXPanelCamposBeneficiariosPagosCobros++;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBeneficiariosPagosCobros.add(this.jPaneldetalleBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(iXPanelCamposBeneficiariosPagosCobros % 2==0) {
		iXPanelCamposBeneficiariosPagosCobros=0;
		iYPanelCamposBeneficiariosPagosCobros++;
	}
	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iYPanelCamposBeneficiariosPagosCobros;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iXPanelCamposBeneficiariosPagosCobros++;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBeneficiariosPagosCobros.add(this.jPaneltipo_movimientoBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(iXPanelCamposBeneficiariosPagosCobros % 2==0) {
		iXPanelCamposBeneficiariosPagosCobros=0;
		iYPanelCamposBeneficiariosPagosCobros++;
	}
	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iYPanelCamposBeneficiariosPagosCobros;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iXPanelCamposBeneficiariosPagosCobros++;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBeneficiariosPagosCobros.add(this.jPanelvalorBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(iXPanelCamposBeneficiariosPagosCobros % 2==0) {
		iXPanelCamposBeneficiariosPagosCobros=0;
		iYPanelCamposBeneficiariosPagosCobros++;
	}
	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iYPanelCamposBeneficiariosPagosCobros;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iXPanelCamposBeneficiariosPagosCobros++;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBeneficiariosPagosCobros.add(this.jPanelcuentaBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(iXPanelCamposBeneficiariosPagosCobros % 2==0) {
		iXPanelCamposBeneficiariosPagosCobros=0;
		iYPanelCamposBeneficiariosPagosCobros++;
	}
	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iYPanelCamposBeneficiariosPagosCobros;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iXPanelCamposBeneficiariosPagosCobros++;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBeneficiariosPagosCobros.add(this.jPanelfechaBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(iXPanelCamposBeneficiariosPagosCobros % 2==0) {
		iXPanelCamposBeneficiariosPagosCobros=0;
		iYPanelCamposBeneficiariosPagosCobros++;
	}
	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iYPanelCamposBeneficiariosPagosCobros;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iXPanelCamposBeneficiariosPagosCobros++;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBeneficiariosPagosCobros.add(this.jPanelbeneficiario_asientoBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(iXPanelCamposBeneficiariosPagosCobros % 2==0) {
		iXPanelCamposBeneficiariosPagosCobros=0;
		iYPanelCamposBeneficiariosPagosCobros++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iYPanelCamposOcultosBeneficiariosPagosCobros;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iXPanelCamposOcultosBeneficiariosPagosCobros++;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosBeneficiariosPagosCobros.add(this.jPanelid_empresaBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(iXPanelCamposOcultosBeneficiariosPagosCobros % 2==0) {
		iXPanelCamposOcultosBeneficiariosPagosCobros=0;
		iYPanelCamposOcultosBeneficiariosPagosCobros++;
	}
	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iYPanelCamposOcultosBeneficiariosPagosCobros;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iXPanelCamposOcultosBeneficiariosPagosCobros++;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosBeneficiariosPagosCobros.add(this.jPanelid_sucursalBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(iXPanelCamposOcultosBeneficiariosPagosCobros % 2==0) {
		iXPanelCamposOcultosBeneficiariosPagosCobros=0;
		iYPanelCamposOcultosBeneficiariosPagosCobros++;
	}
	this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iYPanelCamposOcultosBeneficiariosPagosCobros;
	this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iXPanelCamposOcultosBeneficiariosPagosCobros++;
	this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBeneficiariosPagosCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosBeneficiariosPagosCobros.add(this.jPanelid_ejercicioBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);



	if(iXPanelCamposOcultosBeneficiariosPagosCobros % 2==0) {
		iXPanelCamposOcultosBeneficiariosPagosCobros=0;
		iYPanelCamposOcultosBeneficiariosPagosCobros++;
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
			
		GridBagLayout gridaBagLayoutAccionesBeneficiariosPagosCobros= new GridBagLayout();
		this.jPanelAccionesBeneficiariosPagosCobros.setLayout(gridaBagLayoutAccionesBeneficiariosPagosCobros);
		
		GridBagLayout gridaBagLayoutAccionesFormularioBeneficiariosPagosCobros= new GridBagLayout();
		this.jPanelAccionesFormularioBeneficiariosPagosCobros.setLayout(gridaBagLayoutAccionesFormularioBeneficiariosPagosCobros);
		
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioBeneficiariosPagosCobros.add(this.jComboBoxTiposAccionesFormularioBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iPosXAccion++;
			
		this.jPanelAccionesBeneficiariosPagosCobros.add(this.jButtonModificarBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);							

		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx =iPosXAccion++;
			
		this.jPanelAccionesBeneficiariosPagosCobros.add(this.jButtonEliminarBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
		
			
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;		
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iPosXAccion++;
		
		this.jPanelAccionesBeneficiariosPagosCobros.add(this.jButtonActualizarBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);


		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;		
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iPosXAccion++;
		
		this.jPanelAccionesBeneficiariosPagosCobros.add(this.jButtonGuardarCambiosBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);	
		
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;		
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx =iPosXAccion++;
		
		this.jPanelAccionesBeneficiariosPagosCobros.add(this.jButtonCancelarBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutBeneficiariosPagosCobros = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutBeneficiariosPagosCobros);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();						
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;		
			//this.gridBagConstraintsBeneficiariosPagosCobros.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy =iGridyPrincipal++;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx =0;
		this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsBeneficiariosPagosCobros.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(BeneficiariosPagosCobrosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleBeneficiariosPagosCobros = new BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Beneficiarios Pagos Cobros DATOS");
			
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
			
	        //this.setTitle("[FOR] - Beneficiarios Pagos Cobros DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Beneficiarios Pagos Cobros Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			BeneficiariosPagosCobrosModel beneficiariospagoscobrosModel=new BeneficiariosPagosCobrosModel(this);
			
			//SI USARA CLASE INTERNA
			//BeneficiariosPagosCobrosModel.BeneficiariosPagosCobrosFocusTraversalPolicy beneficiariospagoscobrosFocusTraversalPolicy = beneficiariospagoscobrosModel.new BeneficiariosPagosCobrosFocusTraversalPolicy(this);
			
			//beneficiariospagoscobrosFocusTraversalPolicy.setbeneficiariospagoscobrosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(beneficiariospagoscobrosModel);
			
			
			this.jContentPaneDetalleBeneficiariosPagosCobros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleBeneficiariosPagosCobros = new GridBagLayout();	
			this.jContentPaneDetalleBeneficiariosPagosCobros.setLayout(gridaBagLayoutDetalleBeneficiariosPagosCobros);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosBeneficiariosPagosCobros = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
				this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
					
				
				this.jContentPaneDetalleBeneficiariosPagosCobros.add(jTtoolBarDetalleBeneficiariosPagosCobros, gridBagConstraintsBeneficiariosPagosCobros);								
				
}
			
			this.jScrollPanelDatosEdicionBeneficiariosPagosCobros=   new JScrollPane(jContentPaneDetalleBeneficiariosPagosCobros,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionBeneficiariosPagosCobros.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBeneficiariosPagosCobros.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBeneficiariosPagosCobros.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralBeneficiariosPagosCobros=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralBeneficiariosPagosCobros.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBeneficiariosPagosCobros.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBeneficiariosPagosCobros.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
			
			
	        this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
	        
			this.jContentPaneDetalleBeneficiariosPagosCobros.add(jPanelCamposBeneficiariosPagosCobros, gridBagConstraintsBeneficiariosPagosCobros);
			
			
			
			
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
						//&& beneficiariospagoscobrosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.beneficiariospagoscobrosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsBeneficiariosPagosCobros= new GridBagConstraints();
						this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iGridyRelaciones++;
						this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
						this.jContentPaneDetalleBeneficiariosPagosCobros.add(this.jTabbedPaneRelacionesBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesBeneficiariosPagosCobros.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosBeneficiariosPagosCobros.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
					this.gridBagConstraintsBeneficiariosPagosCobros.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
					
				
					this.jContentPaneDetalleBeneficiariosPagosCobros.add(jPanelCamposOcultosBeneficiariosPagosCobros, gridBagConstraintsBeneficiariosPagosCobros);
				
					this.jPanelCamposOcultosBeneficiariosPagosCobros.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
	        this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleBeneficiariosPagosCobros.add(this.jPanelAccionesFormularioBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);							
			
			
			
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
	        this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
	        
			
			this.jContentPaneDetalleBeneficiariosPagosCobros.add(this.jPanelAccionesBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionBeneficiariosPagosCobros);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionBeneficiariosPagosCobros=   new JScrollPane(this.jPanelCamposBeneficiariosPagosCobros,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionBeneficiariosPagosCobros.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBeneficiariosPagosCobros.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBeneficiariosPagosCobros.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
			this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsBeneficiariosPagosCobros.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);			
			
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
			
			
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
		
			
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralBeneficiariosPagosCobros;//jContentPane;
		
		return jScrollPanelDatosEdicionBeneficiariosPagosCobros;
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
