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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.report.*;
import com.bydan.erp.contabilidad.util.report.RetencionesPorPagarPorCuentasConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.report.*;
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
public class RetencionesPorPagarPorCuentasDetalleFormJInternalFrame extends RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleRetencionesPorPagarPorCuentas;
	
	protected JMenuBar jmenuBarDetalleRetencionesPorPagarPorCuentas;
	
	protected JMenu jmenuDetalleRetencionesPorPagarPorCuentas;
	protected JMenu jmenuDetalleArchivoRetencionesPorPagarPorCuentas;
	protected JMenu jmenuDetalleAccionesRetencionesPorPagarPorCuentas;
	protected JMenu jmenuDetalleDatosRetencionesPorPagarPorCuentas;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleRetencionesPorPagarPorCuentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRetencionesPorPagarPorCuentas;	
	protected GridBagConstraints gridBagConstraintsRetencionesPorPagarPorCuentas;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional jInternalFrameDetalleRetencionesPorPagarPorCuentas;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencion="";
	
	public RetencionesPorPagarPorCuentasSessionBean retencionesporpagarporcuentasSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public TipoRetencionSessionBean tiporetencionSessionBean;	
	
	public RetencionesPorPagarPorCuentasLogic retencionesporpagarporcuentasLogic;
	
	public JScrollPane jScrollPanelDatosRetencionesPorPagarPorCuentas;
	public JScrollPane jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas;
	public JScrollPane jScrollPanelDatosGeneralRetencionesPorPagarPorCuentas;
	
	protected JPanel jPanelCamposRetencionesPorPagarPorCuentas;    
	protected JPanel jPanelCamposOcultosRetencionesPorPagarPorCuentas;    	
	protected JPanel jPanelAccionesRetencionesPorPagarPorCuentas;
	protected JPanel jPanelAccionesFormularioRetencionesPorPagarPorCuentas;
    
	
	
	protected Integer iXPanelCamposRetencionesPorPagarPorCuentas=0;
	protected Integer iYPanelCamposRetencionesPorPagarPorCuentas=0;
	
	protected Integer iXPanelCamposOcultosRetencionesPorPagarPorCuentas=0;
	protected Integer iYPanelCamposOcultosRetencionesPorPagarPorCuentas=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoRetencionesPorPagarPorCuentas;
	public JButton jButtonModificarRetencionesPorPagarPorCuentas;
	public JButton jButtonActualizarRetencionesPorPagarPorCuentas;
    public JButton jButtonEliminarRetencionesPorPagarPorCuentas;
	public JButton jButtonCancelarRetencionesPorPagarPorCuentas;
    public JButton jButtonGuardarCambiosRetencionesPorPagarPorCuentas;
	public JButton jButtonGuardarCambiosTablaRetencionesPorPagarPorCuentas;
	protected JButton jButtonCerrarRetencionesPorPagarPorCuentas;
	
	
	protected JButton jButtonProcesarInformacionRetencionesPorPagarPorCuentas;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoRetencionesPorPagarPorCuentas;
	protected JCheckBox jCheckBoxPostAccionSinCerrarRetencionesPorPagarPorCuentas;
	protected JCheckBox jCheckBoxPostAccionSinMensajeRetencionesPorPagarPorCuentas;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRetencionesPorPagarPorCuentas;
	protected JButton jButtonModificarToolBarRetencionesPorPagarPorCuentas;
	protected JButton jButtonActualizarToolBarRetencionesPorPagarPorCuentas;
    protected JButton jButtonEliminarToolBarRetencionesPorPagarPorCuentas;
	protected JButton jButtonCancelarToolBarRetencionesPorPagarPorCuentas;
    protected JButton jButtonGuardarCambiosToolBarRetencionesPorPagarPorCuentas;
	protected JButton jButtonGuardarCambiosTablaToolBarRetencionesPorPagarPorCuentas;
	protected JButton jButtonMostrarOcultarTablaToolBarRetencionesPorPagarPorCuentas;
	protected JButton jButtonCerrarToolBarRetencionesPorPagarPorCuentas;
	
	protected JButton jButtonProcesarInformacionToolBarRetencionesPorPagarPorCuentas;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRetencionesPorPagarPorCuentas;
	protected JMenuItem jMenuItemModificarRetencionesPorPagarPorCuentas;
	protected JMenuItem jMenuItemActualizarRetencionesPorPagarPorCuentas;
    protected JMenuItem jMenuItemEliminarRetencionesPorPagarPorCuentas;
	protected JMenuItem jMenuItemCancelarRetencionesPorPagarPorCuentas;
    protected JMenuItem jMenuItemGuardarCambiosRetencionesPorPagarPorCuentas;
	protected JMenuItem jMenuItemGuardarCambiosTablaRetencionesPorPagarPorCuentas;
	protected JMenuItem jMenuItemCerrarRetencionesPorPagarPorCuentas;
	protected JMenuItem jMenuItemDetalleCerrarRetencionesPorPagarPorCuentas;
	protected JMenuItem jMenuItemDetalleMostarOcultarRetencionesPorPagarPorCuentas;
	
	protected JMenuItem jMenuItemProcesarInformacionRetencionesPorPagarPorCuentas;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRetencionesPorPagarPorCuentas;
	protected JMenuItem jMenuItemMostrarOcultarRetencionesPorPagarPorCuentas;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRetencionesPorPagarPorCuentas;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRetencionesPorPagarPorCuentas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRetencionesPorPagarPorCuentas;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioRetencionesPorPagarPorCuentas;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidRetencionesPorPagarPorCuentas;
	public JLabel jLabelIdRetencionesPorPagarPorCuentas;
	public JLabel jLabelidRetencionesPorPagarPorCuentas;
	public JButton jButtonidRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();

	public JPanel jPaneles_debitoRetencionesPorPagarPorCuentas;
	public JLabel jLabeles_debitoRetencionesPorPagarPorCuentas;
	public JCheckBox jCheckBoxes_debitoRetencionesPorPagarPorCuentas;
	public JButton jButtones_debitoRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionRetencionesPorPagarPorCuentas;
	public JLabel jLabelfecha_emisionRetencionesPorPagarPorCuentas;
	//public JFormattedTextField jDateChooserfecha_emisionRetencionesPorPagarPorCuentas;

	public JDateChooser jDateChooserfecha_emisionRetencionesPorPagarPorCuentas;
	public JButton jButtonfecha_emisionRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_tipo_movimientoRetencionesPorPagarPorCuentas;
	public JLabel jLabelnombre_tipo_movimientoRetencionesPorPagarPorCuentas;
	public JTextArea jTextAreanombre_tipo_movimientoRetencionesPorPagarPorCuentas;
	public JScrollPane jscrollPanenombre_tipo_movimientoRetencionesPorPagarPorCuentas;
	public JButton jButtonnombre_tipo_movimientoRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();

	public JPanel jPanelnumero_mayorRetencionesPorPagarPorCuentas;
	public JLabel jLabelnumero_mayorRetencionesPorPagarPorCuentas;
	public JTextArea jTextAreanumero_mayorRetencionesPorPagarPorCuentas;
	public JScrollPane jscrollPanenumero_mayorRetencionesPorPagarPorCuentas;
	public JButton jButtonnumero_mayorRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas;
	public JLabel jLabelnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas;
	public JTextArea jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas;
	public JScrollPane jscrollPanenombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas;
	public JButton jButtonnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();

	public JPanel jPanelnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas;
	public JLabel jLabelnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas;
	public JTextField jTextFieldnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas;
	public JButton jButtonnumero_pre_impreso_facturaRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeRetencionesPorPagarPorCuentas;
	public JLabel jLabelporcentajeRetencionesPorPagarPorCuentas;
	public JTextField jTextFieldporcentajeRetencionesPorPagarPorCuentas;
	public JButton jButtonporcentajeRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();

	public JPanel jPanelbase_imponibleRetencionesPorPagarPorCuentas;
	public JLabel jLabelbase_imponibleRetencionesPorPagarPorCuentas;
	public JTextField jTextFieldbase_imponibleRetencionesPorPagarPorCuentas;
	public JButton jButtonbase_imponibleRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();

	public JPanel jPanelvalorRetencionesPorPagarPorCuentas;
	public JLabel jLabelvalorRetencionesPorPagarPorCuentas;
	public JTextField jTextFieldvalorRetencionesPorPagarPorCuentas;
	public JButton jButtonvalorRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();

	public JPanel jPanelnumeroRetencionesPorPagarPorCuentas;
	public JLabel jLabelnumeroRetencionesPorPagarPorCuentas;
	public JTextField jTextFieldnumeroRetencionesPorPagarPorCuentas;
	public JButton jButtonnumeroRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_benefRetencionesPorPagarPorCuentas;
	public JLabel jLabelnombre_benefRetencionesPorPagarPorCuentas;
	public JTextArea jTextAreanombre_benefRetencionesPorPagarPorCuentas;
	public JScrollPane jscrollPanenombre_benefRetencionesPorPagarPorCuentas;
	public JButton jButtonnombre_benefRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();

	public JPanel jPanelruc_benefRetencionesPorPagarPorCuentas;
	public JLabel jLabelruc_benefRetencionesPorPagarPorCuentas;
	public JTextField jTextFieldruc_benefRetencionesPorPagarPorCuentas;
	public JButton jButtonruc_benefRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_cuenta_contableRetencionesPorPagarPorCuentas;
	public JLabel jLabelnombre_cuenta_contableRetencionesPorPagarPorCuentas;
	public JTextArea jTextAreanombre_cuenta_contableRetencionesPorPagarPorCuentas;
	public JScrollPane jscrollPanenombre_cuenta_contableRetencionesPorPagarPorCuentas;
	public JButton jButtonnombre_cuenta_contableRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas;
	public JLabel jLabelnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas;
	public JTextArea jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas;
	public JScrollPane jscrollPanenombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas;
	public JButton jButtonnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();

	public JPanel jPaneles_debito_datoRetencionesPorPagarPorCuentas;
	public JLabel jLabeles_debito_datoRetencionesPorPagarPorCuentas;
	public JCheckBox jCheckBoxes_debito_datoRetencionesPorPagarPorCuentas;
	public JButton jButtones_debito_datoRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaRetencionesPorPagarPorCuentas;
	public JLabel jLabelid_empresaRetencionesPorPagarPorCuentas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaRetencionesPorPagarPorCuentas;
	public JButton jButtonid_empresaRetencionesPorPagarPorCuentas= new JButtonMe();
	public JButton jButtonid_empresaRetencionesPorPagarPorCuentasUpdate= new JButtonMe();
	public JButton jButtonid_empresaRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalRetencionesPorPagarPorCuentas;
	public JLabel jLabelid_sucursalRetencionesPorPagarPorCuentas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalRetencionesPorPagarPorCuentas;
	public JButton jButtonid_sucursalRetencionesPorPagarPorCuentas= new JButtonMe();
	public JButton jButtonid_sucursalRetencionesPorPagarPorCuentasUpdate= new JButtonMe();
	public JButton jButtonid_sucursalRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioRetencionesPorPagarPorCuentas;
	public JLabel jLabelid_ejercicioRetencionesPorPagarPorCuentas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioRetencionesPorPagarPorCuentas;
	public JButton jButtonid_ejercicioRetencionesPorPagarPorCuentas= new JButtonMe();
	public JButton jButtonid_ejercicioRetencionesPorPagarPorCuentasUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoRetencionesPorPagarPorCuentas;
	public JLabel jLabelid_periodoRetencionesPorPagarPorCuentas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoRetencionesPorPagarPorCuentas;
	public JButton jButtonid_periodoRetencionesPorPagarPorCuentas= new JButtonMe();
	public JButton jButtonid_periodoRetencionesPorPagarPorCuentasUpdate= new JButtonMe();
	public JButton jButtonid_periodoRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_retencionRetencionesPorPagarPorCuentas;
	public JLabel jLabelid_tipo_retencionRetencionesPorPagarPorCuentas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencionRetencionesPorPagarPorCuentas;
	public JButton jButtonid_tipo_retencionRetencionesPorPagarPorCuentas= new JButtonMe();
	public JButton jButtonid_tipo_retencionRetencionesPorPagarPorCuentasUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencionRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesRetencionesPorPagarPorCuentas;
	
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
	
	public RetencionesPorPagarPorCuentasDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposRetencionesPorPagarPorCuentas=new JPanel();
				this.jPanelAccionesFormularioRetencionesPorPagarPorCuentas=new JPanel();
				this.jmenuBarDetalleRetencionesPorPagarPorCuentas=new JMenuBar();
				this.jTtoolBarDetalleRetencionesPorPagarPorCuentas=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RetencionesPorPagarPorCuentasDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("RetencionesPorPagarPorCuentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public RetencionesPorPagarPorCuentasDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("RetencionesPorPagarPorCuentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RetencionesPorPagarPorCuentasDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RetencionesPorPagarPorCuentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RetencionesPorPagarPorCuentasDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RetencionesPorPagarPorCuentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RetencionesPorPagarPorCuentasDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RetencionesPorPagarPorCuentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarRetencionesPorPagarPorCuentas() {
		return this.jButtonActualizarToolBarRetencionesPorPagarPorCuentas;
	}
	
	public JButton getjButtonEliminarToolBarRetencionesPorPagarPorCuentas() {
		return this.jButtonEliminarToolBarRetencionesPorPagarPorCuentas;
	}
	
	public JButton getjButtonCancelarToolBarRetencionesPorPagarPorCuentas() {
		return this.jButtonCancelarToolBarRetencionesPorPagarPorCuentas;
	}		
	
	public JButton getjButtonProcesarInformacionRetencionesPorPagarPorCuentas() {
		return this.jButtonProcesarInformacionRetencionesPorPagarPorCuentas;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRetencionesPorPagarPorCuentas)	{
		this.jButtonProcesarInformacionRetencionesPorPagarPorCuentas = jButtonProcesarInformacionRetencionesPorPagarPorCuentas;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRetencionesPorPagarPorCuentas() {
		return this.jComboBoxTiposAccionesRetencionesPorPagarPorCuentas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRetencionesPorPagarPorCuentas(
			JComboBox jComboBoxTiposRelacionesRetencionesPorPagarPorCuentas) {
		this.jComboBoxTiposRelacionesRetencionesPorPagarPorCuentas = jComboBoxTiposRelacionesRetencionesPorPagarPorCuentas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRetencionesPorPagarPorCuentas(
			JComboBox jComboBoxTiposAccionesRetencionesPorPagarPorCuentas) {
		this.jComboBoxTiposAccionesRetencionesPorPagarPorCuentas = jComboBoxTiposAccionesRetencionesPorPagarPorCuentas;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioRetencionesPorPagarPorCuentas() {
		return this.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorCuentas;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioRetencionesPorPagarPorCuentas(
			JComboBox jComboBoxTiposAccionesFormularioRetencionesPorPagarPorCuentas) {
		this.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorCuentas = jComboBoxTiposAccionesFormularioRetencionesPorPagarPorCuentas;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.retencionesporpagarporcuentasSessionBean=new RetencionesPorPagarPorCuentasSessionBean();
		
		this.retencionesporpagarporcuentasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.retencionesporpagarporcuentasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RetencionesPorPagarPorCuentasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RetencionesPorPagarPorCuentasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RetencionesPorPagarPorCuentasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Retenciones Por Pagar Por Cuentas MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()) {
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
	
		RetencionesPorPagarPorCuentasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleRetencionesPorPagarPorCuentas= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarRetencionesPorPagarPorCuentas=new JButtonMe();
				this.jButtonModificarToolBarRetencionesPorPagarPorCuentas=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarRetencionesPorPagarPorCuentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarRetencionesPorPagarPorCuentas,this.jTtoolBarDetalleRetencionesPorPagarPorCuentas,
							"actualizar","actualizar","Actualizar"+" "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarRetencionesPorPagarPorCuentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarRetencionesPorPagarPorCuentas,this.jTtoolBarDetalleRetencionesPorPagarPorCuentas,
							"eliminar","eliminar","Eliminar"+" "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarRetencionesPorPagarPorCuentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarRetencionesPorPagarPorCuentas,this.jTtoolBarDetalleRetencionesPorPagarPorCuentas,
							"cancelar","cancelar","Cancelar"+" "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarRetencionesPorPagarPorCuentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarRetencionesPorPagarPorCuentas,this.jTtoolBarDetalleRetencionesPorPagarPorCuentas,
							"guardarcambios","guardarcambios","Guardar"+" "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleRetencionesPorPagarPorCuentas=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleRetencionesPorPagarPorCuentas=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoRetencionesPorPagarPorCuentas=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesRetencionesPorPagarPorCuentas=new JMenuMe("Acciones");
		this.jmenuDetalleDatosRetencionesPorPagarPorCuentas=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRetencionesPorPagarPorCuentas= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRetencionesPorPagarPorCuentas.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRetencionesPorPagarPorCuentas,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarRetencionesPorPagarPorCuentas= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarRetencionesPorPagarPorCuentas.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarRetencionesPorPagarPorCuentas,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarRetencionesPorPagarPorCuentas= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarRetencionesPorPagarPorCuentas.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarRetencionesPorPagarPorCuentas,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarRetencionesPorPagarPorCuentas= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarRetencionesPorPagarPorCuentas.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarRetencionesPorPagarPorCuentas,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarRetencionesPorPagarPorCuentas= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarRetencionesPorPagarPorCuentas.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarRetencionesPorPagarPorCuentas,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosRetencionesPorPagarPorCuentas= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRetencionesPorPagarPorCuentas.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRetencionesPorPagarPorCuentas,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRetencionesPorPagarPorCuentas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRetencionesPorPagarPorCuentas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRetencionesPorPagarPorCuentas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarRetencionesPorPagarPorCuentas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarRetencionesPorPagarPorCuentas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarRetencionesPorPagarPorCuentas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRetencionesPorPagarPorCuentas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRetencionesPorPagarPorCuentas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRetencionesPorPagarPorCuentas,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRetencionesPorPagarPorCuentas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRetencionesPorPagarPorCuentas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRetencionesPorPagarPorCuentas,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoRetencionesPorPagarPorCuentas.add(this.jMenuItemDetalleCerrarRetencionesPorPagarPorCuentas);
		
		this.jmenuDetalleAccionesRetencionesPorPagarPorCuentas.add(this.jMenuItemActualizarRetencionesPorPagarPorCuentas);
		this.jmenuDetalleAccionesRetencionesPorPagarPorCuentas.add(this.jMenuItemEliminarRetencionesPorPagarPorCuentas);
		this.jmenuDetalleAccionesRetencionesPorPagarPorCuentas.add(this.jMenuItemCancelarRetencionesPorPagarPorCuentas);		
		
		//this.jmenuDetalleDatosRetencionesPorPagarPorCuentas.add(this.jMenuItemDetalleAbrirOrderByRetencionesPorPagarPorCuentas);				
		this.jmenuDetalleDatosRetencionesPorPagarPorCuentas.add(this.jMenuItemDetalleMostarOcultarRetencionesPorPagarPorCuentas);				
				
		//this.jmenuDetalleAccionesRetencionesPorPagarPorCuentas.add(this.jMenuItemGuardarCambiosRetencionesPorPagarPorCuentas);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleRetencionesPorPagarPorCuentas.add(this.jmenuDetalleArchivoRetencionesPorPagarPorCuentas);		
		this.jmenuBarDetalleRetencionesPorPagarPorCuentas.add(this.jmenuDetalleAccionesRetencionesPorPagarPorCuentas);		
		this.jmenuBarDetalleRetencionesPorPagarPorCuentas.add(this.jmenuDetalleDatosRetencionesPorPagarPorCuentas);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleRetencionesPorPagarPorCuentas);				
	}
	
	
	public void inicializarElementosCamposRetencionesPorPagarPorCuentas() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdRetencionesPorPagarPorCuentas = new JLabelMe();
		jLabelIdRetencionesPorPagarPorCuentas.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidRetencionesPorPagarPorCuentas = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidRetencionesPorPagarPorCuentas.setToolTipText(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutRetencionesPorPagarPorCuentas= new GridBagLayout();

		this.jPanelidRetencionesPorPagarPorCuentas.setLayout(this.gridaBagLayoutRetencionesPorPagarPorCuentas);

		jLabelidRetencionesPorPagarPorCuentas = new JLabel();
		jLabelidRetencionesPorPagarPorCuentas.setText("Id");

		jLabelidRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeles_debitoRetencionesPorPagarPorCuentas = new JLabelMe();
		this.jLabeles_debitoRetencionesPorPagarPorCuentas.setText(""+RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_ESDEBITO+" : *");
		this.jLabeles_debitoRetencionesPorPagarPorCuentas.setToolTipText("Es Debito");
		this.jLabeles_debitoRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_debitoRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_debitoRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_debitoRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_debitoRetencionesPorPagarPorCuentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_debitoRetencionesPorPagarPorCuentas.setToolTipText(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_ESDEBITO);
		this.gridaBagLayoutRetencionesPorPagarPorCuentas = new GridBagLayout();
		this.jPaneles_debitoRetencionesPorPagarPorCuentas.setLayout(this.gridaBagLayoutRetencionesPorPagarPorCuentas);


		jCheckBoxes_debitoRetencionesPorPagarPorCuentas= new JCheckBoxMe();
		jCheckBoxes_debitoRetencionesPorPagarPorCuentas.setEnabled(false);

		jCheckBoxes_debitoRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_debitoRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_debitoRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_debitoRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_debitoRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();
		this.jButtones_debitoRetencionesPorPagarPorCuentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_debitoRetencionesPorPagarPorCuentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_debitoRetencionesPorPagarPorCuentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_debitoRetencionesPorPagarPorCuentasBusqueda.setText("U");
		this.jButtones_debitoRetencionesPorPagarPorCuentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_debitoRetencionesPorPagarPorCuentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_debitoRetencionesPorPagarPorCuentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_debitoRetencionesPorPagarPorCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_debitoRetencionesPorPagarPorCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_debitoRetencionesPorPagarPorCuentasBusqueda"));

		if(this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_debitoRetencionesPorPagarPorCuentasBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionRetencionesPorPagarPorCuentas = new JLabelMe();
		this.jLabelfecha_emisionRetencionesPorPagarPorCuentas.setText(""+RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionRetencionesPorPagarPorCuentas.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionRetencionesPorPagarPorCuentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionRetencionesPorPagarPorCuentas.setToolTipText(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutRetencionesPorPagarPorCuentas = new GridBagLayout();
		this.jPanelfecha_emisionRetencionesPorPagarPorCuentas.setLayout(this.gridaBagLayoutRetencionesPorPagarPorCuentas);


		//jFormattedTextFieldfecha_emisionRetencionesPorPagarPorCuentas= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionRetencionesPorPagarPorCuentas= new JDateChooser();
		jDateChooserfecha_emisionRetencionesPorPagarPorCuentas.setEnabled(false);
		jDateChooserfecha_emisionRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionRetencionesPorPagarPorCuentas.setDate(new Date());
		jDateChooserfecha_emisionRetencionesPorPagarPorCuentas.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionRetencionesPorPagarPorCuentas.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();
		this.jButtonfecha_emisionRetencionesPorPagarPorCuentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionRetencionesPorPagarPorCuentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionRetencionesPorPagarPorCuentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionRetencionesPorPagarPorCuentasBusqueda.setText("U");
		this.jButtonfecha_emisionRetencionesPorPagarPorCuentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionRetencionesPorPagarPorCuentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionRetencionesPorPagarPorCuentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionRetencionesPorPagarPorCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionRetencionesPorPagarPorCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionRetencionesPorPagarPorCuentasBusqueda"));

		if(this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionRetencionesPorPagarPorCuentasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_tipo_movimientoRetencionesPorPagarPorCuentas = new JLabelMe();
		this.jLabelnombre_tipo_movimientoRetencionesPorPagarPorCuentas.setText(""+RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRETIPOMOVIMIENTO+" : *");
		this.jLabelnombre_tipo_movimientoRetencionesPorPagarPorCuentas.setToolTipText("Nombre Tipo Movimiento");
		this.jLabelnombre_tipo_movimientoRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_movimientoRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_movimientoRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_tipo_movimientoRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_tipo_movimientoRetencionesPorPagarPorCuentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_tipo_movimientoRetencionesPorPagarPorCuentas.setToolTipText(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRETIPOMOVIMIENTO);
		this.gridaBagLayoutRetencionesPorPagarPorCuentas = new GridBagLayout();
		this.jPanelnombre_tipo_movimientoRetencionesPorPagarPorCuentas.setLayout(this.gridaBagLayoutRetencionesPorPagarPorCuentas);


		jTextAreanombre_tipo_movimientoRetencionesPorPagarPorCuentas= new JTextAreaMe();
		jTextAreanombre_tipo_movimientoRetencionesPorPagarPorCuentas.setEnabled(false);
		jTextAreanombre_tipo_movimientoRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_movimientoRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_movimientoRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_movimientoRetencionesPorPagarPorCuentas.setLineWrap(true);
		jTextAreanombre_tipo_movimientoRetencionesPorPagarPorCuentas.setWrapStyleWord(true);
		jTextAreanombre_tipo_movimientoRetencionesPorPagarPorCuentas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_tipo_movimientoRetencionesPorPagarPorCuentas.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_tipo_movimientoRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_tipo_movimientoRetencionesPorPagarPorCuentas = new JScrollPane(jTextAreanombre_tipo_movimientoRetencionesPorPagarPorCuentas);
		jscrollPanenombre_tipo_movimientoRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_tipo_movimientoRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_tipo_movimientoRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_tipo_movimientoRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();
		this.jButtonnombre_tipo_movimientoRetencionesPorPagarPorCuentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_movimientoRetencionesPorPagarPorCuentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_movimientoRetencionesPorPagarPorCuentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_tipo_movimientoRetencionesPorPagarPorCuentasBusqueda.setText("U");
		this.jButtonnombre_tipo_movimientoRetencionesPorPagarPorCuentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_tipo_movimientoRetencionesPorPagarPorCuentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_tipo_movimientoRetencionesPorPagarPorCuentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_tipo_movimientoRetencionesPorPagarPorCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_tipo_movimientoRetencionesPorPagarPorCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_tipo_movimientoRetencionesPorPagarPorCuentasBusqueda"));

		if(this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_tipo_movimientoRetencionesPorPagarPorCuentasBusqueda.setVisible(false);		}


					
		this.jLabelnumero_mayorRetencionesPorPagarPorCuentas = new JLabelMe();
		this.jLabelnumero_mayorRetencionesPorPagarPorCuentas.setText(""+RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMEROMAYOR+" : *");
		this.jLabelnumero_mayorRetencionesPorPagarPorCuentas.setToolTipText("Numero Mayor");
		this.jLabelnumero_mayorRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mayorRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mayorRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_mayorRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_mayorRetencionesPorPagarPorCuentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_mayorRetencionesPorPagarPorCuentas.setToolTipText(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMEROMAYOR);
		this.gridaBagLayoutRetencionesPorPagarPorCuentas = new GridBagLayout();
		this.jPanelnumero_mayorRetencionesPorPagarPorCuentas.setLayout(this.gridaBagLayoutRetencionesPorPagarPorCuentas);


		jTextAreanumero_mayorRetencionesPorPagarPorCuentas= new JTextAreaMe();
		jTextAreanumero_mayorRetencionesPorPagarPorCuentas.setEnabled(false);
		jTextAreanumero_mayorRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorRetencionesPorPagarPorCuentas.setLineWrap(true);
		jTextAreanumero_mayorRetencionesPorPagarPorCuentas.setWrapStyleWord(true);
		jTextAreanumero_mayorRetencionesPorPagarPorCuentas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanumero_mayorRetencionesPorPagarPorCuentas.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanumero_mayorRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenumero_mayorRetencionesPorPagarPorCuentas = new JScrollPane(jTextAreanumero_mayorRetencionesPorPagarPorCuentas);
		jscrollPanenumero_mayorRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenumero_mayorRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenumero_mayorRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnumero_mayorRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();
		this.jButtonnumero_mayorRetencionesPorPagarPorCuentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mayorRetencionesPorPagarPorCuentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mayorRetencionesPorPagarPorCuentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_mayorRetencionesPorPagarPorCuentasBusqueda.setText("U");
		this.jButtonnumero_mayorRetencionesPorPagarPorCuentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_mayorRetencionesPorPagarPorCuentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_mayorRetencionesPorPagarPorCuentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanumero_mayorRetencionesPorPagarPorCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanumero_mayorRetencionesPorPagarPorCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_mayorRetencionesPorPagarPorCuentasBusqueda"));

		if(this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_mayorRetencionesPorPagarPorCuentasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas = new JLabelMe();
		this.jLabelnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas.setText(""+RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION+" : *");
		this.jLabelnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas.setToolTipText("Nombre Cuenta Contable Retencion");
		this.jLabelnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas.setToolTipText(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION);
		this.gridaBagLayoutRetencionesPorPagarPorCuentas = new GridBagLayout();
		this.jPanelnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas.setLayout(this.gridaBagLayoutRetencionesPorPagarPorCuentas);


		jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas= new JTextAreaMe();
		jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas.setEnabled(false);
		jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas.setLineWrap(true);
		jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas.setWrapStyleWord(true);
		jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas = new JScrollPane(jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas);
		jscrollPanenombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();
		this.jButtonnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentasBusqueda.setText("U");
		this.jButtonnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_cuenta_contable_retencionRetencionesPorPagarPorCuentasBusqueda"));

		if(this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentasBusqueda.setVisible(false);		}


					
		this.jLabelnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas = new JLabelMe();
		this.jLabelnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas.setText(""+RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA+" : *");
		this.jLabelnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas.setToolTipText("Numero Pre Impreso Factura");
		this.jLabelnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas.setToolTipText(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA);
		this.gridaBagLayoutRetencionesPorPagarPorCuentas = new GridBagLayout();
		this.jPanelnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas.setLayout(this.gridaBagLayoutRetencionesPorPagarPorCuentas);


		jTextFieldnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas= new JTextFieldMe();

		jTextFieldnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas.setEnabled(false);
		jTextFieldnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_pre_impreso_facturaRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();
		this.jButtonnumero_pre_impreso_facturaRetencionesPorPagarPorCuentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impreso_facturaRetencionesPorPagarPorCuentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impreso_facturaRetencionesPorPagarPorCuentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_pre_impreso_facturaRetencionesPorPagarPorCuentasBusqueda.setText("U");
		this.jButtonnumero_pre_impreso_facturaRetencionesPorPagarPorCuentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_pre_impreso_facturaRetencionesPorPagarPorCuentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_pre_impreso_facturaRetencionesPorPagarPorCuentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_pre_impreso_facturaRetencionesPorPagarPorCuentasBusqueda"));

		if(this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_pre_impreso_facturaRetencionesPorPagarPorCuentasBusqueda.setVisible(false);		}


					
		this.jLabelporcentajeRetencionesPorPagarPorCuentas = new JLabelMe();
		this.jLabelporcentajeRetencionesPorPagarPorCuentas.setText(""+RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeRetencionesPorPagarPorCuentas.setToolTipText("Porcentaje");
		this.jLabelporcentajeRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeRetencionesPorPagarPorCuentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeRetencionesPorPagarPorCuentas.setToolTipText(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutRetencionesPorPagarPorCuentas = new GridBagLayout();
		this.jPanelporcentajeRetencionesPorPagarPorCuentas.setLayout(this.gridaBagLayoutRetencionesPorPagarPorCuentas);


		jTextFieldporcentajeRetencionesPorPagarPorCuentas= new JTextFieldMe();
		jTextFieldporcentajeRetencionesPorPagarPorCuentas.setEnabled(false);
		jTextFieldporcentajeRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeRetencionesPorPagarPorCuentas.setText("0.0");

		this.jButtonporcentajeRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();
		this.jButtonporcentajeRetencionesPorPagarPorCuentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeRetencionesPorPagarPorCuentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeRetencionesPorPagarPorCuentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeRetencionesPorPagarPorCuentasBusqueda.setText("U");
		this.jButtonporcentajeRetencionesPorPagarPorCuentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeRetencionesPorPagarPorCuentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeRetencionesPorPagarPorCuentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeRetencionesPorPagarPorCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeRetencionesPorPagarPorCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeRetencionesPorPagarPorCuentasBusqueda"));

		if(this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeRetencionesPorPagarPorCuentasBusqueda.setVisible(false);		}


					
		this.jLabelbase_imponibleRetencionesPorPagarPorCuentas = new JLabelMe();
		this.jLabelbase_imponibleRetencionesPorPagarPorCuentas.setText(""+RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_BASEIMPONIBLE+" : *");
		this.jLabelbase_imponibleRetencionesPorPagarPorCuentas.setToolTipText("Base Imponible");
		this.jLabelbase_imponibleRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbase_imponibleRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbase_imponibleRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbase_imponibleRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbase_imponibleRetencionesPorPagarPorCuentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbase_imponibleRetencionesPorPagarPorCuentas.setToolTipText(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_BASEIMPONIBLE);
		this.gridaBagLayoutRetencionesPorPagarPorCuentas = new GridBagLayout();
		this.jPanelbase_imponibleRetencionesPorPagarPorCuentas.setLayout(this.gridaBagLayoutRetencionesPorPagarPorCuentas);


		jTextFieldbase_imponibleRetencionesPorPagarPorCuentas= new JTextFieldMe();
		jTextFieldbase_imponibleRetencionesPorPagarPorCuentas.setEnabled(false);
		jTextFieldbase_imponibleRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbase_imponibleRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbase_imponibleRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldbase_imponibleRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldbase_imponibleRetencionesPorPagarPorCuentas.setText("0.0");

		this.jButtonbase_imponibleRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();
		this.jButtonbase_imponibleRetencionesPorPagarPorCuentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbase_imponibleRetencionesPorPagarPorCuentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbase_imponibleRetencionesPorPagarPorCuentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbase_imponibleRetencionesPorPagarPorCuentasBusqueda.setText("U");
		this.jButtonbase_imponibleRetencionesPorPagarPorCuentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbase_imponibleRetencionesPorPagarPorCuentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbase_imponibleRetencionesPorPagarPorCuentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldbase_imponibleRetencionesPorPagarPorCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldbase_imponibleRetencionesPorPagarPorCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"base_imponibleRetencionesPorPagarPorCuentasBusqueda"));

		if(this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbase_imponibleRetencionesPorPagarPorCuentasBusqueda.setVisible(false);		}


					
		this.jLabelvalorRetencionesPorPagarPorCuentas = new JLabelMe();
		this.jLabelvalorRetencionesPorPagarPorCuentas.setText(""+RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorRetencionesPorPagarPorCuentas.setToolTipText("Valor");
		this.jLabelvalorRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorRetencionesPorPagarPorCuentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorRetencionesPorPagarPorCuentas.setToolTipText(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutRetencionesPorPagarPorCuentas = new GridBagLayout();
		this.jPanelvalorRetencionesPorPagarPorCuentas.setLayout(this.gridaBagLayoutRetencionesPorPagarPorCuentas);


		jTextFieldvalorRetencionesPorPagarPorCuentas= new JTextFieldMe();
		jTextFieldvalorRetencionesPorPagarPorCuentas.setEnabled(false);
		jTextFieldvalorRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorRetencionesPorPagarPorCuentas.setText("0.0");

		this.jButtonvalorRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();
		this.jButtonvalorRetencionesPorPagarPorCuentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorRetencionesPorPagarPorCuentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorRetencionesPorPagarPorCuentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorRetencionesPorPagarPorCuentasBusqueda.setText("U");
		this.jButtonvalorRetencionesPorPagarPorCuentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorRetencionesPorPagarPorCuentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorRetencionesPorPagarPorCuentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorRetencionesPorPagarPorCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorRetencionesPorPagarPorCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorRetencionesPorPagarPorCuentasBusqueda"));

		if(this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorRetencionesPorPagarPorCuentasBusqueda.setVisible(false);		}


					
		this.jLabelnumeroRetencionesPorPagarPorCuentas = new JLabelMe();
		this.jLabelnumeroRetencionesPorPagarPorCuentas.setText(""+RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMERO+" : *");
		this.jLabelnumeroRetencionesPorPagarPorCuentas.setToolTipText("Numero");
		this.jLabelnumeroRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumeroRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumeroRetencionesPorPagarPorCuentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumeroRetencionesPorPagarPorCuentas.setToolTipText(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMERO);
		this.gridaBagLayoutRetencionesPorPagarPorCuentas = new GridBagLayout();
		this.jPanelnumeroRetencionesPorPagarPorCuentas.setLayout(this.gridaBagLayoutRetencionesPorPagarPorCuentas);


		jTextFieldnumeroRetencionesPorPagarPorCuentas= new JTextFieldMe();

		jTextFieldnumeroRetencionesPorPagarPorCuentas.setEnabled(false);
		jTextFieldnumeroRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumeroRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumeroRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();
		this.jButtonnumeroRetencionesPorPagarPorCuentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroRetencionesPorPagarPorCuentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroRetencionesPorPagarPorCuentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumeroRetencionesPorPagarPorCuentasBusqueda.setText("U");
		this.jButtonnumeroRetencionesPorPagarPorCuentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumeroRetencionesPorPagarPorCuentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumeroRetencionesPorPagarPorCuentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumeroRetencionesPorPagarPorCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumeroRetencionesPorPagarPorCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numeroRetencionesPorPagarPorCuentasBusqueda"));

		if(this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumeroRetencionesPorPagarPorCuentasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_benefRetencionesPorPagarPorCuentas = new JLabelMe();
		this.jLabelnombre_benefRetencionesPorPagarPorCuentas.setText(""+RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBREBENEF+" : *");
		this.jLabelnombre_benefRetencionesPorPagarPorCuentas.setToolTipText("Nombre Benef");
		this.jLabelnombre_benefRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_benefRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_benefRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_benefRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_benefRetencionesPorPagarPorCuentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_benefRetencionesPorPagarPorCuentas.setToolTipText(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBREBENEF);
		this.gridaBagLayoutRetencionesPorPagarPorCuentas = new GridBagLayout();
		this.jPanelnombre_benefRetencionesPorPagarPorCuentas.setLayout(this.gridaBagLayoutRetencionesPorPagarPorCuentas);


		jTextAreanombre_benefRetencionesPorPagarPorCuentas= new JTextAreaMe();
		jTextAreanombre_benefRetencionesPorPagarPorCuentas.setEnabled(false);
		jTextAreanombre_benefRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_benefRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_benefRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_benefRetencionesPorPagarPorCuentas.setLineWrap(true);
		jTextAreanombre_benefRetencionesPorPagarPorCuentas.setWrapStyleWord(true);
		jTextAreanombre_benefRetencionesPorPagarPorCuentas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_benefRetencionesPorPagarPorCuentas.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_benefRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_benefRetencionesPorPagarPorCuentas = new JScrollPane(jTextAreanombre_benefRetencionesPorPagarPorCuentas);
		jscrollPanenombre_benefRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_benefRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_benefRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_benefRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();
		this.jButtonnombre_benefRetencionesPorPagarPorCuentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_benefRetencionesPorPagarPorCuentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_benefRetencionesPorPagarPorCuentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_benefRetencionesPorPagarPorCuentasBusqueda.setText("U");
		this.jButtonnombre_benefRetencionesPorPagarPorCuentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_benefRetencionesPorPagarPorCuentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_benefRetencionesPorPagarPorCuentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_benefRetencionesPorPagarPorCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_benefRetencionesPorPagarPorCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_benefRetencionesPorPagarPorCuentasBusqueda"));

		if(this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_benefRetencionesPorPagarPorCuentasBusqueda.setVisible(false);		}


					
		this.jLabelruc_benefRetencionesPorPagarPorCuentas = new JLabelMe();
		this.jLabelruc_benefRetencionesPorPagarPorCuentas.setText(""+RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_RUCBENEF+" : *");
		this.jLabelruc_benefRetencionesPorPagarPorCuentas.setToolTipText("Ruc Benef");
		this.jLabelruc_benefRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelruc_benefRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelruc_benefRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelruc_benefRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelruc_benefRetencionesPorPagarPorCuentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelruc_benefRetencionesPorPagarPorCuentas.setToolTipText(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_RUCBENEF);
		this.gridaBagLayoutRetencionesPorPagarPorCuentas = new GridBagLayout();
		this.jPanelruc_benefRetencionesPorPagarPorCuentas.setLayout(this.gridaBagLayoutRetencionesPorPagarPorCuentas);


		jTextFieldruc_benefRetencionesPorPagarPorCuentas= new JTextFieldMe();

		jTextFieldruc_benefRetencionesPorPagarPorCuentas.setEnabled(false);
		jTextFieldruc_benefRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldruc_benefRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldruc_benefRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldruc_benefRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonruc_benefRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();
		this.jButtonruc_benefRetencionesPorPagarPorCuentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonruc_benefRetencionesPorPagarPorCuentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonruc_benefRetencionesPorPagarPorCuentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonruc_benefRetencionesPorPagarPorCuentasBusqueda.setText("U");
		this.jButtonruc_benefRetencionesPorPagarPorCuentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonruc_benefRetencionesPorPagarPorCuentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonruc_benefRetencionesPorPagarPorCuentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldruc_benefRetencionesPorPagarPorCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldruc_benefRetencionesPorPagarPorCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ruc_benefRetencionesPorPagarPorCuentasBusqueda"));

		if(this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonruc_benefRetencionesPorPagarPorCuentasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_cuenta_contableRetencionesPorPagarPorCuentas = new JLabelMe();
		this.jLabelnombre_cuenta_contableRetencionesPorPagarPorCuentas.setText(""+RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLE+" : *");
		this.jLabelnombre_cuenta_contableRetencionesPorPagarPorCuentas.setToolTipText("Nombre Cuenta Contable");
		this.jLabelnombre_cuenta_contableRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_cuenta_contableRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_cuenta_contableRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_cuenta_contableRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_cuenta_contableRetencionesPorPagarPorCuentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_cuenta_contableRetencionesPorPagarPorCuentas.setToolTipText(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLE);
		this.gridaBagLayoutRetencionesPorPagarPorCuentas = new GridBagLayout();
		this.jPanelnombre_cuenta_contableRetencionesPorPagarPorCuentas.setLayout(this.gridaBagLayoutRetencionesPorPagarPorCuentas);


		jTextAreanombre_cuenta_contableRetencionesPorPagarPorCuentas= new JTextAreaMe();
		jTextAreanombre_cuenta_contableRetencionesPorPagarPorCuentas.setEnabled(false);
		jTextAreanombre_cuenta_contableRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuenta_contableRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuenta_contableRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuenta_contableRetencionesPorPagarPorCuentas.setLineWrap(true);
		jTextAreanombre_cuenta_contableRetencionesPorPagarPorCuentas.setWrapStyleWord(true);
		jTextAreanombre_cuenta_contableRetencionesPorPagarPorCuentas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_cuenta_contableRetencionesPorPagarPorCuentas.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_cuenta_contableRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_cuenta_contableRetencionesPorPagarPorCuentas = new JScrollPane(jTextAreanombre_cuenta_contableRetencionesPorPagarPorCuentas);
		jscrollPanenombre_cuenta_contableRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_cuenta_contableRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_cuenta_contableRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_cuenta_contableRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();
		this.jButtonnombre_cuenta_contableRetencionesPorPagarPorCuentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cuenta_contableRetencionesPorPagarPorCuentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cuenta_contableRetencionesPorPagarPorCuentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_cuenta_contableRetencionesPorPagarPorCuentasBusqueda.setText("U");
		this.jButtonnombre_cuenta_contableRetencionesPorPagarPorCuentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_cuenta_contableRetencionesPorPagarPorCuentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_cuenta_contableRetencionesPorPagarPorCuentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_cuenta_contableRetencionesPorPagarPorCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_cuenta_contableRetencionesPorPagarPorCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_cuenta_contableRetencionesPorPagarPorCuentasBusqueda"));

		if(this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_cuenta_contableRetencionesPorPagarPorCuentasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas = new JLabelMe();
		this.jLabelnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas.setText(""+RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLECREDITO+" : *");
		this.jLabelnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas.setToolTipText("Nombre Cuenta Contable Credito");
		this.jLabelnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas.setToolTipText(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLECREDITO);
		this.gridaBagLayoutRetencionesPorPagarPorCuentas = new GridBagLayout();
		this.jPanelnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas.setLayout(this.gridaBagLayoutRetencionesPorPagarPorCuentas);


		jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas= new JTextAreaMe();
		jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas.setEnabled(false);
		jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas.setLineWrap(true);
		jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas.setWrapStyleWord(true);
		jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas = new JScrollPane(jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas);
		jscrollPanenombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();
		this.jButtonnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentasBusqueda.setText("U");
		this.jButtonnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_cuenta_contable_creditoRetencionesPorPagarPorCuentasBusqueda"));

		if(this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentasBusqueda.setVisible(false);		}


					
		this.jLabeles_debito_datoRetencionesPorPagarPorCuentas = new JLabelMe();
		this.jLabeles_debito_datoRetencionesPorPagarPorCuentas.setText(""+RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_ESDEBITODATO+" : *");
		this.jLabeles_debito_datoRetencionesPorPagarPorCuentas.setToolTipText("Es Debito Dato");
		this.jLabeles_debito_datoRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_debito_datoRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_debito_datoRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_debito_datoRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_debito_datoRetencionesPorPagarPorCuentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_debito_datoRetencionesPorPagarPorCuentas.setToolTipText(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_ESDEBITODATO);
		this.gridaBagLayoutRetencionesPorPagarPorCuentas = new GridBagLayout();
		this.jPaneles_debito_datoRetencionesPorPagarPorCuentas.setLayout(this.gridaBagLayoutRetencionesPorPagarPorCuentas);


		jCheckBoxes_debito_datoRetencionesPorPagarPorCuentas= new JCheckBoxMe();
		jCheckBoxes_debito_datoRetencionesPorPagarPorCuentas.setEnabled(false);

		jCheckBoxes_debito_datoRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_debito_datoRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_debito_datoRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_debito_datoRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_debito_datoRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();
		this.jButtones_debito_datoRetencionesPorPagarPorCuentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_debito_datoRetencionesPorPagarPorCuentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_debito_datoRetencionesPorPagarPorCuentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_debito_datoRetencionesPorPagarPorCuentasBusqueda.setText("U");
		this.jButtones_debito_datoRetencionesPorPagarPorCuentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_debito_datoRetencionesPorPagarPorCuentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_debito_datoRetencionesPorPagarPorCuentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_debito_datoRetencionesPorPagarPorCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_debito_datoRetencionesPorPagarPorCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_debito_datoRetencionesPorPagarPorCuentasBusqueda"));

		if(this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_debito_datoRetencionesPorPagarPorCuentasBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysRetencionesPorPagarPorCuentas() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaRetencionesPorPagarPorCuentas = new JLabelMe();
		this.jLabelid_empresaRetencionesPorPagarPorCuentas.setText(""+RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaRetencionesPorPagarPorCuentas.setToolTipText("Empresa");
		this.jLabelid_empresaRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaRetencionesPorPagarPorCuentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaRetencionesPorPagarPorCuentas.setToolTipText(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutRetencionesPorPagarPorCuentas = new GridBagLayout();
		this.jPanelid_empresaRetencionesPorPagarPorCuentas.setLayout(this.gridaBagLayoutRetencionesPorPagarPorCuentas);


		jComboBoxid_empresaRetencionesPorPagarPorCuentas= new JComboBoxMe();
		jComboBoxid_empresaRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaRetencionesPorPagarPorCuentas.setEnabled(false);

		this.jButtonid_empresaRetencionesPorPagarPorCuentas= new JButtonMe();
		this.jButtonid_empresaRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRetencionesPorPagarPorCuentas.setText("Buscar");
		this.jButtonid_empresaRetencionesPorPagarPorCuentas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaRetencionesPorPagarPorCuentas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRetencionesPorPagarPorCuentas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaRetencionesPorPagarPorCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRetencionesPorPagarPorCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRetencionesPorPagarPorCuentas"));

		this.jButtonid_empresaRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();
		this.jButtonid_empresaRetencionesPorPagarPorCuentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRetencionesPorPagarPorCuentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRetencionesPorPagarPorCuentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRetencionesPorPagarPorCuentasBusqueda.setText("U");
		this.jButtonid_empresaRetencionesPorPagarPorCuentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaRetencionesPorPagarPorCuentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRetencionesPorPagarPorCuentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaRetencionesPorPagarPorCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRetencionesPorPagarPorCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRetencionesPorPagarPorCuentasBusqueda"));

		if(this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaRetencionesPorPagarPorCuentasBusqueda.setVisible(false);		}

		this.jButtonid_empresaRetencionesPorPagarPorCuentasUpdate= new JButtonMe();
		this.jButtonid_empresaRetencionesPorPagarPorCuentasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRetencionesPorPagarPorCuentasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRetencionesPorPagarPorCuentasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRetencionesPorPagarPorCuentasUpdate.setText("U");
		this.jButtonid_empresaRetencionesPorPagarPorCuentasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaRetencionesPorPagarPorCuentasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRetencionesPorPagarPorCuentasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaRetencionesPorPagarPorCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRetencionesPorPagarPorCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRetencionesPorPagarPorCuentasUpdate"));



					
		this.jLabelid_sucursalRetencionesPorPagarPorCuentas = new JLabelMe();
		this.jLabelid_sucursalRetencionesPorPagarPorCuentas.setText(""+RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalRetencionesPorPagarPorCuentas.setToolTipText("Sucursal");
		this.jLabelid_sucursalRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalRetencionesPorPagarPorCuentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalRetencionesPorPagarPorCuentas.setToolTipText(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutRetencionesPorPagarPorCuentas = new GridBagLayout();
		this.jPanelid_sucursalRetencionesPorPagarPorCuentas.setLayout(this.gridaBagLayoutRetencionesPorPagarPorCuentas);


		jComboBoxid_sucursalRetencionesPorPagarPorCuentas= new JComboBoxMe();
		jComboBoxid_sucursalRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalRetencionesPorPagarPorCuentas.setEnabled(false);

		this.jButtonid_sucursalRetencionesPorPagarPorCuentas= new JButtonMe();
		this.jButtonid_sucursalRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalRetencionesPorPagarPorCuentas.setText("Buscar");
		this.jButtonid_sucursalRetencionesPorPagarPorCuentas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalRetencionesPorPagarPorCuentas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalRetencionesPorPagarPorCuentas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalRetencionesPorPagarPorCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalRetencionesPorPagarPorCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalRetencionesPorPagarPorCuentas"));

		this.jButtonid_sucursalRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();
		this.jButtonid_sucursalRetencionesPorPagarPorCuentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRetencionesPorPagarPorCuentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRetencionesPorPagarPorCuentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalRetencionesPorPagarPorCuentasBusqueda.setText("U");
		this.jButtonid_sucursalRetencionesPorPagarPorCuentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalRetencionesPorPagarPorCuentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalRetencionesPorPagarPorCuentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalRetencionesPorPagarPorCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalRetencionesPorPagarPorCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalRetencionesPorPagarPorCuentasBusqueda"));

		if(this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalRetencionesPorPagarPorCuentasBusqueda.setVisible(false);		}

		this.jButtonid_sucursalRetencionesPorPagarPorCuentasUpdate= new JButtonMe();
		this.jButtonid_sucursalRetencionesPorPagarPorCuentasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRetencionesPorPagarPorCuentasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRetencionesPorPagarPorCuentasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalRetencionesPorPagarPorCuentasUpdate.setText("U");
		this.jButtonid_sucursalRetencionesPorPagarPorCuentasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalRetencionesPorPagarPorCuentasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalRetencionesPorPagarPorCuentasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalRetencionesPorPagarPorCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalRetencionesPorPagarPorCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalRetencionesPorPagarPorCuentasUpdate"));



					
		this.jLabelid_ejercicioRetencionesPorPagarPorCuentas = new JLabelMe();
		this.jLabelid_ejercicioRetencionesPorPagarPorCuentas.setText(""+RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioRetencionesPorPagarPorCuentas.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioRetencionesPorPagarPorCuentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioRetencionesPorPagarPorCuentas.setToolTipText(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutRetencionesPorPagarPorCuentas = new GridBagLayout();
		this.jPanelid_ejercicioRetencionesPorPagarPorCuentas.setLayout(this.gridaBagLayoutRetencionesPorPagarPorCuentas);


		jComboBoxid_ejercicioRetencionesPorPagarPorCuentas= new JComboBoxMe();
		jComboBoxid_ejercicioRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioRetencionesPorPagarPorCuentas.setEnabled(false);

		this.jButtonid_ejercicioRetencionesPorPagarPorCuentas= new JButtonMe();
		this.jButtonid_ejercicioRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioRetencionesPorPagarPorCuentas.setText("Buscar");
		this.jButtonid_ejercicioRetencionesPorPagarPorCuentas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioRetencionesPorPagarPorCuentas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioRetencionesPorPagarPorCuentas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioRetencionesPorPagarPorCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioRetencionesPorPagarPorCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioRetencionesPorPagarPorCuentas"));

		this.jButtonid_ejercicioRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();
		this.jButtonid_ejercicioRetencionesPorPagarPorCuentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioRetencionesPorPagarPorCuentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioRetencionesPorPagarPorCuentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioRetencionesPorPagarPorCuentasBusqueda.setText("U");
		this.jButtonid_ejercicioRetencionesPorPagarPorCuentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioRetencionesPorPagarPorCuentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioRetencionesPorPagarPorCuentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioRetencionesPorPagarPorCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioRetencionesPorPagarPorCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioRetencionesPorPagarPorCuentasBusqueda"));

		if(this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioRetencionesPorPagarPorCuentasBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioRetencionesPorPagarPorCuentasUpdate= new JButtonMe();
		this.jButtonid_ejercicioRetencionesPorPagarPorCuentasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioRetencionesPorPagarPorCuentasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioRetencionesPorPagarPorCuentasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioRetencionesPorPagarPorCuentasUpdate.setText("U");
		this.jButtonid_ejercicioRetencionesPorPagarPorCuentasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioRetencionesPorPagarPorCuentasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioRetencionesPorPagarPorCuentasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioRetencionesPorPagarPorCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioRetencionesPorPagarPorCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioRetencionesPorPagarPorCuentasUpdate"));



					
		this.jLabelid_periodoRetencionesPorPagarPorCuentas = new JLabelMe();
		this.jLabelid_periodoRetencionesPorPagarPorCuentas.setText(""+RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoRetencionesPorPagarPorCuentas.setToolTipText("Periodo");
		this.jLabelid_periodoRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoRetencionesPorPagarPorCuentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoRetencionesPorPagarPorCuentas.setToolTipText(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutRetencionesPorPagarPorCuentas = new GridBagLayout();
		this.jPanelid_periodoRetencionesPorPagarPorCuentas.setLayout(this.gridaBagLayoutRetencionesPorPagarPorCuentas);


		jComboBoxid_periodoRetencionesPorPagarPorCuentas= new JComboBoxMe();
		jComboBoxid_periodoRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoRetencionesPorPagarPorCuentas.setEnabled(false);

		this.jButtonid_periodoRetencionesPorPagarPorCuentas= new JButtonMe();
		this.jButtonid_periodoRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoRetencionesPorPagarPorCuentas.setText("Buscar");
		this.jButtonid_periodoRetencionesPorPagarPorCuentas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoRetencionesPorPagarPorCuentas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoRetencionesPorPagarPorCuentas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoRetencionesPorPagarPorCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoRetencionesPorPagarPorCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoRetencionesPorPagarPorCuentas"));

		this.jButtonid_periodoRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();
		this.jButtonid_periodoRetencionesPorPagarPorCuentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoRetencionesPorPagarPorCuentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoRetencionesPorPagarPorCuentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoRetencionesPorPagarPorCuentasBusqueda.setText("U");
		this.jButtonid_periodoRetencionesPorPagarPorCuentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoRetencionesPorPagarPorCuentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoRetencionesPorPagarPorCuentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoRetencionesPorPagarPorCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoRetencionesPorPagarPorCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoRetencionesPorPagarPorCuentasBusqueda"));

		if(this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoRetencionesPorPagarPorCuentasBusqueda.setVisible(false);		}

		this.jButtonid_periodoRetencionesPorPagarPorCuentasUpdate= new JButtonMe();
		this.jButtonid_periodoRetencionesPorPagarPorCuentasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoRetencionesPorPagarPorCuentasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoRetencionesPorPagarPorCuentasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoRetencionesPorPagarPorCuentasUpdate.setText("U");
		this.jButtonid_periodoRetencionesPorPagarPorCuentasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoRetencionesPorPagarPorCuentasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoRetencionesPorPagarPorCuentasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoRetencionesPorPagarPorCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoRetencionesPorPagarPorCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoRetencionesPorPagarPorCuentasUpdate"));



					
		this.jLabelid_tipo_retencionRetencionesPorPagarPorCuentas = new JLabelMe();
		this.jLabelid_tipo_retencionRetencionesPorPagarPorCuentas.setText(""+RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDTIPORETENCION+" : *");
		this.jLabelid_tipo_retencionRetencionesPorPagarPorCuentas.setToolTipText("Tipo Retencion");
		this.jLabelid_tipo_retencionRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_retencionRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_retencionRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencionRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_retencionRetencionesPorPagarPorCuentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_retencionRetencionesPorPagarPorCuentas.setToolTipText(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDTIPORETENCION);
		this.gridaBagLayoutRetencionesPorPagarPorCuentas = new GridBagLayout();
		this.jPanelid_tipo_retencionRetencionesPorPagarPorCuentas.setLayout(this.gridaBagLayoutRetencionesPorPagarPorCuentas);


		jComboBoxid_tipo_retencionRetencionesPorPagarPorCuentas= new JComboBoxMe();
		jComboBoxid_tipo_retencionRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencionRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_retencionRetencionesPorPagarPorCuentas= new JButtonMe();
		this.jButtonid_tipo_retencionRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencionRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencionRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencionRetencionesPorPagarPorCuentas.setText("Buscar");
		this.jButtonid_tipo_retencionRetencionesPorPagarPorCuentas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_retencionRetencionesPorPagarPorCuentas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencionRetencionesPorPagarPorCuentas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_retencionRetencionesPorPagarPorCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencionRetencionesPorPagarPorCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencionRetencionesPorPagarPorCuentas"));

		this.jButtonid_tipo_retencionRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();
		this.jButtonid_tipo_retencionRetencionesPorPagarPorCuentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionRetencionesPorPagarPorCuentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionRetencionesPorPagarPorCuentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencionRetencionesPorPagarPorCuentasBusqueda.setText("U");
		this.jButtonid_tipo_retencionRetencionesPorPagarPorCuentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_retencionRetencionesPorPagarPorCuentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencionRetencionesPorPagarPorCuentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_retencionRetencionesPorPagarPorCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencionRetencionesPorPagarPorCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencionRetencionesPorPagarPorCuentasBusqueda"));

		if(this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_retencionRetencionesPorPagarPorCuentasBusqueda.setVisible(false);		}

		this.jButtonid_tipo_retencionRetencionesPorPagarPorCuentasUpdate= new JButtonMe();
		this.jButtonid_tipo_retencionRetencionesPorPagarPorCuentasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionRetencionesPorPagarPorCuentasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionRetencionesPorPagarPorCuentasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencionRetencionesPorPagarPorCuentasUpdate.setText("U");
		this.jButtonid_tipo_retencionRetencionesPorPagarPorCuentasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_retencionRetencionesPorPagarPorCuentasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencionRetencionesPorPagarPorCuentasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_retencionRetencionesPorPagarPorCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencionRetencionesPorPagarPorCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencionRetencionesPorPagarPorCuentasUpdate"));



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
		//this.jInternalFrameDetalleRetencionesPorPagarPorCuentas = new RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Retenciones Por Pagar Por Cuentas DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRetencionesPorPagarPorCuentas= new GridBagLayout();
		

		
		String sToolTipRetencionesPorPagarPorCuentas="";
		sToolTipRetencionesPorPagarPorCuentas=RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRetencionesPorPagarPorCuentas+="(Contabilidad.RetencionesPorPagarPorCuentas)";
		}
		
		if(!this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()) {
			sToolTipRetencionesPorPagarPorCuentas+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoRetencionesPorPagarPorCuentas = new JButtonMe();
		this.jButtonModificarRetencionesPorPagarPorCuentas = new JButtonMe();
        this.jButtonActualizarRetencionesPorPagarPorCuentas = new JButtonMe();
        this.jButtonEliminarRetencionesPorPagarPorCuentas = new JButtonMe();
        this.jButtonCancelarRetencionesPorPagarPorCuentas = new JButtonMe();
        this.jButtonGuardarCambiosRetencionesPorPagarPorCuentas = new JButtonMe();
		this.jButtonGuardarCambiosTablaRetencionesPorPagarPorCuentas = new JButtonMe();
		this.jButtonCerrarRetencionesPorPagarPorCuentas = new JButtonMe();
		
		this.jScrollPanelDatosRetencionesPorPagarPorCuentas = new JScrollPane();   
        this.jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas = new JScrollPane();
		this.jScrollPanelDatosGeneralRetencionesPorPagarPorCuentas = new JScrollPane();
				
		
		
		this.jPanelCamposRetencionesPorPagarPorCuentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosRetencionesPorPagarPorCuentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesRetencionesPorPagarPorCuentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioRetencionesPorPagarPorCuentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Retenciones Por Pagar Por Cuentas";
		
		if(!this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRetencionesPorPagarPorCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retenciones Por Pagar Por Cuentases" + this.sPath));
		} else {
			this.jScrollPanelDatosRetencionesPorPagarPorCuentas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralRetencionesPorPagarPorCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposRetencionesPorPagarPorCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposRetencionesPorPagarPorCuentas.setName("jPanelCamposRetencionesPorPagarPorCuentas"); 

		this.jPanelCamposOcultosRetencionesPorPagarPorCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosRetencionesPorPagarPorCuentas.setName("jPanelCamposOcultosRetencionesPorPagarPorCuentas"); 

        this.jPanelAccionesRetencionesPorPagarPorCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRetencionesPorPagarPorCuentas.setToolTipText("Acciones");
        this.jPanelAccionesRetencionesPorPagarPorCuentas.setName("Acciones"); 

		this.jPanelAccionesFormularioRetencionesPorPagarPorCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioRetencionesPorPagarPorCuentas.setToolTipText("Acciones");
        this.jPanelAccionesFormularioRetencionesPorPagarPorCuentas.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoRetencionesPorPagarPorCuentas.setText("Nuevo");
		this.jButtonModificarRetencionesPorPagarPorCuentas.setText("Editar");
        this.jButtonActualizarRetencionesPorPagarPorCuentas.setText("Actualizar");
        this.jButtonEliminarRetencionesPorPagarPorCuentas.setText("Eliminar");
        this.jButtonCancelarRetencionesPorPagarPorCuentas.setText("Cancelar");
        this.jButtonGuardarCambiosRetencionesPorPagarPorCuentas.setText("Guardar");
		this.jButtonGuardarCambiosTablaRetencionesPorPagarPorCuentas.setText("Guardar");
		this.jButtonCerrarRetencionesPorPagarPorCuentas.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRetencionesPorPagarPorCuentas,"nuevo_button","Nuevo",this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarRetencionesPorPagarPorCuentas,"modificar_button","Editar",this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarRetencionesPorPagarPorCuentas,"actualizar_button","Actualizar",this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarRetencionesPorPagarPorCuentas,"eliminar_button","Eliminar",this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarRetencionesPorPagarPorCuentas,"cancelar_button","Cancelar",this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosRetencionesPorPagarPorCuentas,"guardarcambios_button","Guardar",this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRetencionesPorPagarPorCuentas,"guardarcambiostabla_button","Guardar",this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRetencionesPorPagarPorCuentas,"cerrar_button","Salir",this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoRetencionesPorPagarPorCuentas.setToolTipText("Nuevo"+" "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarRetencionesPorPagarPorCuentas.setToolTipText("Editar"+" "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarRetencionesPorPagarPorCuentas.setToolTipText("Actualizar"+" "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarRetencionesPorPagarPorCuentas.setToolTipText("Eliminar)"+" "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarRetencionesPorPagarPorCuentas.setToolTipText("Cancelar"+" "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosRetencionesPorPagarPorCuentas.setToolTipText("Guardar"+" "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaRetencionesPorPagarPorCuentas.setToolTipText("Guardar"+" "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRetencionesPorPagarPorCuentas.setToolTipText("Salir"+" "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRetencionesPorPagarPorCuentas";
		inputMap = this.jButtonNuevoRetencionesPorPagarPorCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRetencionesPorPagarPorCuentas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRetencionesPorPagarPorCuentas"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarRetencionesPorPagarPorCuentas";
		inputMap = this.jButtonActualizarRetencionesPorPagarPorCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarRetencionesPorPagarPorCuentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarRetencionesPorPagarPorCuentas"));
		
		//ELIMINAR
		sMapKey = "EliminarRetencionesPorPagarPorCuentas";
		inputMap = this.jButtonEliminarRetencionesPorPagarPorCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarRetencionesPorPagarPorCuentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarRetencionesPorPagarPorCuentas"));
		
		//CANCELAR	
		sMapKey = "CancelarRetencionesPorPagarPorCuentas";
		inputMap = this.jButtonCancelarRetencionesPorPagarPorCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarRetencionesPorPagarPorCuentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarRetencionesPorPagarPorCuentas"));
		
		//CERRAR		
		sMapKey = "CerrarRetencionesPorPagarPorCuentas";
		inputMap = this.jButtonCerrarRetencionesPorPagarPorCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRetencionesPorPagarPorCuentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRetencionesPorPagarPorCuentas"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRetencionesPorPagarPorCuentas";
		inputMap = this.jButtonGuardarCambiosTablaRetencionesPorPagarPorCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRetencionesPorPagarPorCuentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRetencionesPorPagarPorCuentas"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoRetencionesPorPagarPorCuentas = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoRetencionesPorPagarPorCuentas.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoRetencionesPorPagarPorCuentas.setToolTipText("Nuevo RetencionesPorPagarPorCuentas");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarRetencionesPorPagarPorCuentas = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarRetencionesPorPagarPorCuentas.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarRetencionesPorPagarPorCuentas.setToolTipText("Sin Cerrar Ventana RetencionesPorPagarPorCuentas");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeRetencionesPorPagarPorCuentas = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeRetencionesPorPagarPorCuentas.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeRetencionesPorPagarPorCuentas.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesRetencionesPorPagarPorCuentas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRetencionesPorPagarPorCuentas.setText("Accion");
		this.jComboBoxTiposAccionesRetencionesPorPagarPorCuentas.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorCuentas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorCuentas.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorCuentas.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesRetencionesPorPagarPorCuentas = new JLabelMe();
		
		this.jLabelAccionesRetencionesPorPagarPorCuentas.setText("Acciones");		
		this.jLabelAccionesRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposRetencionesPorPagarPorCuentas();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysRetencionesPorPagarPorCuentas();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesRetencionesPorPagarPorCuentas=new JTabbedPane();
		this.jTabbedPaneRelacionesRetencionesPorPagarPorCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposRetencionesPorPagarPorCuentas = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosRetencionesPorPagarPorCuentas = new GridBagLayout();
		
		this.jPanelCamposRetencionesPorPagarPorCuentas.setLayout(gridaBagLayoutCamposRetencionesPorPagarPorCuentas);
		this.jPanelCamposOcultosRetencionesPorPagarPorCuentas.setLayout(gridaBagLayoutCamposOcultosRetencionesPorPagarPorCuentas);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidRetencionesPorPagarPorCuentas.add(jLabelIdRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidRetencionesPorPagarPorCuentas.add(jLabelidRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);


	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaRetencionesPorPagarPorCuentas.add(jLabelid_empresaRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRetencionesPorPagarPorCuentas.add(jButtonid_empresaRetencionesPorPagarPorCuentasBusqueda, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 3;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRetencionesPorPagarPorCuentas.add(jButtonid_empresaRetencionesPorPagarPorCuentasUpdate, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
	}

	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaRetencionesPorPagarPorCuentas.add(jComboBoxid_empresaRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);


	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalRetencionesPorPagarPorCuentas.add(jLabelid_sucursalRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalRetencionesPorPagarPorCuentas.add(jButtonid_sucursalRetencionesPorPagarPorCuentasBusqueda, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 3;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalRetencionesPorPagarPorCuentas.add(jButtonid_sucursalRetencionesPorPagarPorCuentasUpdate, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
	}

	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalRetencionesPorPagarPorCuentas.add(jComboBoxid_sucursalRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);


	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioRetencionesPorPagarPorCuentas.add(jLabelid_ejercicioRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioRetencionesPorPagarPorCuentas.add(jButtonid_ejercicioRetencionesPorPagarPorCuentasBusqueda, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 3;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioRetencionesPorPagarPorCuentas.add(jButtonid_ejercicioRetencionesPorPagarPorCuentasUpdate, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
	}

	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioRetencionesPorPagarPorCuentas.add(jComboBoxid_ejercicioRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);


	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoRetencionesPorPagarPorCuentas.add(jLabelid_periodoRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoRetencionesPorPagarPorCuentas.add(jButtonid_periodoRetencionesPorPagarPorCuentasBusqueda, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 3;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoRetencionesPorPagarPorCuentas.add(jButtonid_periodoRetencionesPorPagarPorCuentasUpdate, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
	}

	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoRetencionesPorPagarPorCuentas.add(jComboBoxid_periodoRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);


	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_retencionRetencionesPorPagarPorCuentas.add(jLabelid_tipo_retencionRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencionRetencionesPorPagarPorCuentas.add(jButtonid_tipo_retencionRetencionesPorPagarPorCuentasBusqueda, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 3;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencionRetencionesPorPagarPorCuentas.add(jButtonid_tipo_retencionRetencionesPorPagarPorCuentasUpdate, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
	}

	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_retencionRetencionesPorPagarPorCuentas.add(jComboBoxid_tipo_retencionRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);


	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_debitoRetencionesPorPagarPorCuentas.add(jLabeles_debitoRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_debitoRetencionesPorPagarPorCuentas.add(jButtones_debitoRetencionesPorPagarPorCuentasBusqueda, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
	}

	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_debitoRetencionesPorPagarPorCuentas.add(jCheckBoxes_debitoRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);


	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionRetencionesPorPagarPorCuentas.add(jLabelfecha_emisionRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionRetencionesPorPagarPorCuentas.add(jButtonfecha_emisionRetencionesPorPagarPorCuentasBusqueda, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
	}

	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionRetencionesPorPagarPorCuentas.add(jDateChooserfecha_emisionRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);


	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_tipo_movimientoRetencionesPorPagarPorCuentas.add(jLabelnombre_tipo_movimientoRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_tipo_movimientoRetencionesPorPagarPorCuentas.add(jButtonnombre_tipo_movimientoRetencionesPorPagarPorCuentasBusqueda, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
	}

	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_tipo_movimientoRetencionesPorPagarPorCuentas.add(jscrollPanenombre_tipo_movimientoRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);


	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_mayorRetencionesPorPagarPorCuentas.add(jLabelnumero_mayorRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_mayorRetencionesPorPagarPorCuentas.add(jButtonnumero_mayorRetencionesPorPagarPorCuentasBusqueda, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
	}

	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_mayorRetencionesPorPagarPorCuentas.add(jscrollPanenumero_mayorRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);


	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas.add(jLabelnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas.add(jButtonnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentasBusqueda, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
	}

	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas.add(jscrollPanenombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);


	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas.add(jLabelnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas.add(jButtonnumero_pre_impreso_facturaRetencionesPorPagarPorCuentasBusqueda, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
	}

	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas.add(jTextFieldnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);


	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeRetencionesPorPagarPorCuentas.add(jLabelporcentajeRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeRetencionesPorPagarPorCuentas.add(jButtonporcentajeRetencionesPorPagarPorCuentasBusqueda, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
	}

	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeRetencionesPorPagarPorCuentas.add(jTextFieldporcentajeRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);


	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelbase_imponibleRetencionesPorPagarPorCuentas.add(jLabelbase_imponibleRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelbase_imponibleRetencionesPorPagarPorCuentas.add(jButtonbase_imponibleRetencionesPorPagarPorCuentasBusqueda, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
	}

	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelbase_imponibleRetencionesPorPagarPorCuentas.add(jTextFieldbase_imponibleRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);


	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorRetencionesPorPagarPorCuentas.add(jLabelvalorRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorRetencionesPorPagarPorCuentas.add(jButtonvalorRetencionesPorPagarPorCuentasBusqueda, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
	}

	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorRetencionesPorPagarPorCuentas.add(jTextFieldvalorRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);


	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumeroRetencionesPorPagarPorCuentas.add(jLabelnumeroRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumeroRetencionesPorPagarPorCuentas.add(jButtonnumeroRetencionesPorPagarPorCuentasBusqueda, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
	}

	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumeroRetencionesPorPagarPorCuentas.add(jTextFieldnumeroRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);


	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_benefRetencionesPorPagarPorCuentas.add(jLabelnombre_benefRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_benefRetencionesPorPagarPorCuentas.add(jButtonnombre_benefRetencionesPorPagarPorCuentasBusqueda, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
	}

	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_benefRetencionesPorPagarPorCuentas.add(jscrollPanenombre_benefRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);


	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelruc_benefRetencionesPorPagarPorCuentas.add(jLabelruc_benefRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelruc_benefRetencionesPorPagarPorCuentas.add(jButtonruc_benefRetencionesPorPagarPorCuentasBusqueda, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
	}

	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelruc_benefRetencionesPorPagarPorCuentas.add(jTextFieldruc_benefRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);


	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_cuenta_contableRetencionesPorPagarPorCuentas.add(jLabelnombre_cuenta_contableRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_cuenta_contableRetencionesPorPagarPorCuentas.add(jButtonnombre_cuenta_contableRetencionesPorPagarPorCuentasBusqueda, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
	}

	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_cuenta_contableRetencionesPorPagarPorCuentas.add(jscrollPanenombre_cuenta_contableRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);


	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas.add(jLabelnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas.add(jButtonnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentasBusqueda, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
	}

	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas.add(jscrollPanenombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);


	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_debito_datoRetencionesPorPagarPorCuentas.add(jLabeles_debito_datoRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_debito_datoRetencionesPorPagarPorCuentas.add(jButtones_debito_datoRetencionesPorPagarPorCuentasBusqueda, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
	}

	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_debito_datoRetencionesPorPagarPorCuentas.add(jCheckBoxes_debito_datoRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iYPanelCamposRetencionesPorPagarPorCuentas;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iXPanelCamposRetencionesPorPagarPorCuentas++;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionesPorPagarPorCuentas.add(this.jPanelidRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(iXPanelCamposRetencionesPorPagarPorCuentas % 2==0) {
		iXPanelCamposRetencionesPorPagarPorCuentas=0;
		iYPanelCamposRetencionesPorPagarPorCuentas++;
	}
	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iYPanelCamposRetencionesPorPagarPorCuentas;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iXPanelCamposRetencionesPorPagarPorCuentas++;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionesPorPagarPorCuentas.add(this.jPanelid_tipo_retencionRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(iXPanelCamposRetencionesPorPagarPorCuentas % 2==0) {
		iXPanelCamposRetencionesPorPagarPorCuentas=0;
		iYPanelCamposRetencionesPorPagarPorCuentas++;
	}
	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iYPanelCamposRetencionesPorPagarPorCuentas;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iXPanelCamposRetencionesPorPagarPorCuentas++;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionesPorPagarPorCuentas.add(this.jPaneles_debitoRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(iXPanelCamposRetencionesPorPagarPorCuentas % 2==0) {
		iXPanelCamposRetencionesPorPagarPorCuentas=0;
		iYPanelCamposRetencionesPorPagarPorCuentas++;
	}
	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iYPanelCamposRetencionesPorPagarPorCuentas;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iXPanelCamposRetencionesPorPagarPorCuentas++;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionesPorPagarPorCuentas.add(this.jPanelfecha_emisionRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(iXPanelCamposRetencionesPorPagarPorCuentas % 2==0) {
		iXPanelCamposRetencionesPorPagarPorCuentas=0;
		iYPanelCamposRetencionesPorPagarPorCuentas++;
	}
	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iYPanelCamposRetencionesPorPagarPorCuentas;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iXPanelCamposRetencionesPorPagarPorCuentas++;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionesPorPagarPorCuentas.add(this.jPanelnombre_tipo_movimientoRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(iXPanelCamposRetencionesPorPagarPorCuentas % 2==0) {
		iXPanelCamposRetencionesPorPagarPorCuentas=0;
		iYPanelCamposRetencionesPorPagarPorCuentas++;
	}
	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iYPanelCamposRetencionesPorPagarPorCuentas;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iXPanelCamposRetencionesPorPagarPorCuentas++;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionesPorPagarPorCuentas.add(this.jPanelnumero_mayorRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(iXPanelCamposRetencionesPorPagarPorCuentas % 2==0) {
		iXPanelCamposRetencionesPorPagarPorCuentas=0;
		iYPanelCamposRetencionesPorPagarPorCuentas++;
	}
	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iYPanelCamposRetencionesPorPagarPorCuentas;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iXPanelCamposRetencionesPorPagarPorCuentas++;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionesPorPagarPorCuentas.add(this.jPanelnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(iXPanelCamposRetencionesPorPagarPorCuentas % 2==0) {
		iXPanelCamposRetencionesPorPagarPorCuentas=0;
		iYPanelCamposRetencionesPorPagarPorCuentas++;
	}
	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iYPanelCamposRetencionesPorPagarPorCuentas;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iXPanelCamposRetencionesPorPagarPorCuentas++;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionesPorPagarPorCuentas.add(this.jPanelnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(iXPanelCamposRetencionesPorPagarPorCuentas % 2==0) {
		iXPanelCamposRetencionesPorPagarPorCuentas=0;
		iYPanelCamposRetencionesPorPagarPorCuentas++;
	}
	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iYPanelCamposRetencionesPorPagarPorCuentas;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iXPanelCamposRetencionesPorPagarPorCuentas++;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionesPorPagarPorCuentas.add(this.jPanelporcentajeRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(iXPanelCamposRetencionesPorPagarPorCuentas % 2==0) {
		iXPanelCamposRetencionesPorPagarPorCuentas=0;
		iYPanelCamposRetencionesPorPagarPorCuentas++;
	}
	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iYPanelCamposRetencionesPorPagarPorCuentas;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iXPanelCamposRetencionesPorPagarPorCuentas++;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionesPorPagarPorCuentas.add(this.jPanelbase_imponibleRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(iXPanelCamposRetencionesPorPagarPorCuentas % 2==0) {
		iXPanelCamposRetencionesPorPagarPorCuentas=0;
		iYPanelCamposRetencionesPorPagarPorCuentas++;
	}
	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iYPanelCamposRetencionesPorPagarPorCuentas;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iXPanelCamposRetencionesPorPagarPorCuentas++;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionesPorPagarPorCuentas.add(this.jPanelvalorRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(iXPanelCamposRetencionesPorPagarPorCuentas % 2==0) {
		iXPanelCamposRetencionesPorPagarPorCuentas=0;
		iYPanelCamposRetencionesPorPagarPorCuentas++;
	}
	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iYPanelCamposRetencionesPorPagarPorCuentas;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iXPanelCamposRetencionesPorPagarPorCuentas++;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionesPorPagarPorCuentas.add(this.jPanelnumeroRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(iXPanelCamposRetencionesPorPagarPorCuentas % 2==0) {
		iXPanelCamposRetencionesPorPagarPorCuentas=0;
		iYPanelCamposRetencionesPorPagarPorCuentas++;
	}
	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iYPanelCamposRetencionesPorPagarPorCuentas;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iXPanelCamposRetencionesPorPagarPorCuentas++;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionesPorPagarPorCuentas.add(this.jPanelnombre_benefRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(iXPanelCamposRetencionesPorPagarPorCuentas % 2==0) {
		iXPanelCamposRetencionesPorPagarPorCuentas=0;
		iYPanelCamposRetencionesPorPagarPorCuentas++;
	}
	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iYPanelCamposRetencionesPorPagarPorCuentas;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iXPanelCamposRetencionesPorPagarPorCuentas++;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionesPorPagarPorCuentas.add(this.jPanelruc_benefRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(iXPanelCamposRetencionesPorPagarPorCuentas % 2==0) {
		iXPanelCamposRetencionesPorPagarPorCuentas=0;
		iYPanelCamposRetencionesPorPagarPorCuentas++;
	}
	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iYPanelCamposRetencionesPorPagarPorCuentas;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iXPanelCamposRetencionesPorPagarPorCuentas++;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionesPorPagarPorCuentas.add(this.jPanelnombre_cuenta_contableRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(iXPanelCamposRetencionesPorPagarPorCuentas % 2==0) {
		iXPanelCamposRetencionesPorPagarPorCuentas=0;
		iYPanelCamposRetencionesPorPagarPorCuentas++;
	}
	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iYPanelCamposRetencionesPorPagarPorCuentas;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iXPanelCamposRetencionesPorPagarPorCuentas++;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionesPorPagarPorCuentas.add(this.jPanelnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(iXPanelCamposRetencionesPorPagarPorCuentas % 2==0) {
		iXPanelCamposRetencionesPorPagarPorCuentas=0;
		iYPanelCamposRetencionesPorPagarPorCuentas++;
	}
	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iYPanelCamposRetencionesPorPagarPorCuentas;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iXPanelCamposRetencionesPorPagarPorCuentas++;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionesPorPagarPorCuentas.add(this.jPaneles_debito_datoRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(iXPanelCamposRetencionesPorPagarPorCuentas % 2==0) {
		iXPanelCamposRetencionesPorPagarPorCuentas=0;
		iYPanelCamposRetencionesPorPagarPorCuentas++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iYPanelCamposOcultosRetencionesPorPagarPorCuentas;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iXPanelCamposOcultosRetencionesPorPagarPorCuentas++;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRetencionesPorPagarPorCuentas.add(this.jPanelid_empresaRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(iXPanelCamposOcultosRetencionesPorPagarPorCuentas % 2==0) {
		iXPanelCamposOcultosRetencionesPorPagarPorCuentas=0;
		iYPanelCamposOcultosRetencionesPorPagarPorCuentas++;
	}
	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iYPanelCamposOcultosRetencionesPorPagarPorCuentas;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iXPanelCamposOcultosRetencionesPorPagarPorCuentas++;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRetencionesPorPagarPorCuentas.add(this.jPanelid_sucursalRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(iXPanelCamposOcultosRetencionesPorPagarPorCuentas % 2==0) {
		iXPanelCamposOcultosRetencionesPorPagarPorCuentas=0;
		iYPanelCamposOcultosRetencionesPorPagarPorCuentas++;
	}
	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iYPanelCamposOcultosRetencionesPorPagarPorCuentas;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iXPanelCamposOcultosRetencionesPorPagarPorCuentas++;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRetencionesPorPagarPorCuentas.add(this.jPanelid_ejercicioRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(iXPanelCamposOcultosRetencionesPorPagarPorCuentas % 2==0) {
		iXPanelCamposOcultosRetencionesPorPagarPorCuentas=0;
		iYPanelCamposOcultosRetencionesPorPagarPorCuentas++;
	}
	this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iYPanelCamposOcultosRetencionesPorPagarPorCuentas;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iXPanelCamposOcultosRetencionesPorPagarPorCuentas++;
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRetencionesPorPagarPorCuentas.add(this.jPanelid_periodoRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);



	if(iXPanelCamposOcultosRetencionesPorPagarPorCuentas % 2==0) {
		iXPanelCamposOcultosRetencionesPorPagarPorCuentas=0;
		iYPanelCamposOcultosRetencionesPorPagarPorCuentas++;
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
			
		GridBagLayout gridaBagLayoutAccionesRetencionesPorPagarPorCuentas= new GridBagLayout();
		this.jPanelAccionesRetencionesPorPagarPorCuentas.setLayout(gridaBagLayoutAccionesRetencionesPorPagarPorCuentas);
		
		GridBagLayout gridaBagLayoutAccionesFormularioRetencionesPorPagarPorCuentas= new GridBagLayout();
		this.jPanelAccionesFormularioRetencionesPorPagarPorCuentas.setLayout(gridaBagLayoutAccionesFormularioRetencionesPorPagarPorCuentas);
		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRetencionesPorPagarPorCuentas.add(this.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iPosXAccion++;
			
		this.jPanelAccionesRetencionesPorPagarPorCuentas.add(this.jButtonModificarRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);							

		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx =iPosXAccion++;
			
		this.jPanelAccionesRetencionesPorPagarPorCuentas.add(this.jButtonEliminarRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
		
			
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iPosXAccion++;
		
		this.jPanelAccionesRetencionesPorPagarPorCuentas.add(this.jButtonActualizarRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);


		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iPosXAccion++;
		
		this.jPanelAccionesRetencionesPorPagarPorCuentas.add(this.jButtonGuardarCambiosRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);	
		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx =iPosXAccion++;
		
		this.jPanelAccionesRetencionesPorPagarPorCuentas.add(this.jButtonCancelarRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRetencionesPorPagarPorCuentas = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRetencionesPorPagarPorCuentas);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();						
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;		
			//this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx =0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(RetencionesPorPagarPorCuentasJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleRetencionesPorPagarPorCuentas = new RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Retenciones Por Pagar Por Cuentas DATOS");
			
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
			
	        //this.setTitle("[FOR] - Retenciones Por Pagar Por Cuentas DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Retenciones Por Pagar Por Cuentas Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			RetencionesPorPagarPorCuentasModel retencionesporpagarporcuentasModel=new RetencionesPorPagarPorCuentasModel(this);
			
			//SI USARA CLASE INTERNA
			//RetencionesPorPagarPorCuentasModel.RetencionesPorPagarPorCuentasFocusTraversalPolicy retencionesporpagarporcuentasFocusTraversalPolicy = retencionesporpagarporcuentasModel.new RetencionesPorPagarPorCuentasFocusTraversalPolicy(this);
			
			//retencionesporpagarporcuentasFocusTraversalPolicy.setretencionesporpagarporcuentasJInternalFrame(this);
			
			this.setFocusTraversalPolicy(retencionesporpagarporcuentasModel);
			
			
			this.jContentPaneDetalleRetencionesPorPagarPorCuentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleRetencionesPorPagarPorCuentas = new GridBagLayout();	
			this.jContentPaneDetalleRetencionesPorPagarPorCuentas.setLayout(gridaBagLayoutDetalleRetencionesPorPagarPorCuentas);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRetencionesPorPagarPorCuentas = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
				this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
					
				
				this.jContentPaneDetalleRetencionesPorPagarPorCuentas.add(jTtoolBarDetalleRetencionesPorPagarPorCuentas, gridBagConstraintsRetencionesPorPagarPorCuentas);								
				
}
			
			this.jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas=   new JScrollPane(jContentPaneDetalleRetencionesPorPagarPorCuentas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralRetencionesPorPagarPorCuentas=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
			
			
	        this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
	        
			this.jContentPaneDetalleRetencionesPorPagarPorCuentas.add(jPanelCamposRetencionesPorPagarPorCuentas, gridBagConstraintsRetencionesPorPagarPorCuentas);
			
			
			
			
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
						//&& retencionesporpagarporcuentasSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.retencionesporpagarporcuentasSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsRetencionesPorPagarPorCuentas= new GridBagConstraints();
						this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iGridyRelaciones++;
						this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
						this.jContentPaneDetalleRetencionesPorPagarPorCuentas.add(this.jTabbedPaneRelacionesRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesRetencionesPorPagarPorCuentas.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosRetencionesPorPagarPorCuentas.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
					this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
					
				
					this.jContentPaneDetalleRetencionesPorPagarPorCuentas.add(jPanelCamposOcultosRetencionesPorPagarPorCuentas, gridBagConstraintsRetencionesPorPagarPorCuentas);
				
					this.jPanelCamposOcultosRetencionesPorPagarPorCuentas.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
	        this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleRetencionesPorPagarPorCuentas.add(this.jPanelAccionesFormularioRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);							
			
			
			
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
	        this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
	        
			
			this.jContentPaneDetalleRetencionesPorPagarPorCuentas.add(this.jPanelAccionesRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas=   new JScrollPane(this.jPanelCamposRetencionesPorPagarPorCuentas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);			
			
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
			
			
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
		
			
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralRetencionesPorPagarPorCuentas;//jContentPane;
		
		return jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas;
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
