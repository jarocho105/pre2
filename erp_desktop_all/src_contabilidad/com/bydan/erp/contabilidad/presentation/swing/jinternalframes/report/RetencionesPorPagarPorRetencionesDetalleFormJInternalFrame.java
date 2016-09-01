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
import com.bydan.erp.contabilidad.util.report.RetencionesPorPagarPorRetencionesConstantesFunciones;

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
public class RetencionesPorPagarPorRetencionesDetalleFormJInternalFrame extends RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleRetencionesPorPagarPorRetenciones;
	
	protected JMenuBar jmenuBarDetalleRetencionesPorPagarPorRetenciones;
	
	protected JMenu jmenuDetalleRetencionesPorPagarPorRetenciones;
	protected JMenu jmenuDetalleArchivoRetencionesPorPagarPorRetenciones;
	protected JMenu jmenuDetalleAccionesRetencionesPorPagarPorRetenciones;
	protected JMenu jmenuDetalleDatosRetencionesPorPagarPorRetenciones;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleRetencionesPorPagarPorRetenciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRetencionesPorPagarPorRetenciones;	
	protected GridBagConstraints gridBagConstraintsRetencionesPorPagarPorRetenciones;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional jInternalFrameDetalleRetencionesPorPagarPorRetenciones;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";
	
	public RetencionesPorPagarPorRetencionesSessionBean retencionesporpagarporretencionesSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;	
	
	public RetencionesPorPagarPorRetencionesLogic retencionesporpagarporretencionesLogic;
	
	public JScrollPane jScrollPanelDatosRetencionesPorPagarPorRetenciones;
	public JScrollPane jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones;
	public JScrollPane jScrollPanelDatosGeneralRetencionesPorPagarPorRetenciones;
	
	protected JPanel jPanelCamposRetencionesPorPagarPorRetenciones;    
	protected JPanel jPanelCamposOcultosRetencionesPorPagarPorRetenciones;    	
	protected JPanel jPanelAccionesRetencionesPorPagarPorRetenciones;
	protected JPanel jPanelAccionesFormularioRetencionesPorPagarPorRetenciones;
    
	
	
	protected Integer iXPanelCamposRetencionesPorPagarPorRetenciones=0;
	protected Integer iYPanelCamposRetencionesPorPagarPorRetenciones=0;
	
	protected Integer iXPanelCamposOcultosRetencionesPorPagarPorRetenciones=0;
	protected Integer iYPanelCamposOcultosRetencionesPorPagarPorRetenciones=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoRetencionesPorPagarPorRetenciones;
	public JButton jButtonModificarRetencionesPorPagarPorRetenciones;
	public JButton jButtonActualizarRetencionesPorPagarPorRetenciones;
    public JButton jButtonEliminarRetencionesPorPagarPorRetenciones;
	public JButton jButtonCancelarRetencionesPorPagarPorRetenciones;
    public JButton jButtonGuardarCambiosRetencionesPorPagarPorRetenciones;
	public JButton jButtonGuardarCambiosTablaRetencionesPorPagarPorRetenciones;
	protected JButton jButtonCerrarRetencionesPorPagarPorRetenciones;
	
	
	protected JButton jButtonProcesarInformacionRetencionesPorPagarPorRetenciones;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoRetencionesPorPagarPorRetenciones;
	protected JCheckBox jCheckBoxPostAccionSinCerrarRetencionesPorPagarPorRetenciones;
	protected JCheckBox jCheckBoxPostAccionSinMensajeRetencionesPorPagarPorRetenciones;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRetencionesPorPagarPorRetenciones;
	protected JButton jButtonModificarToolBarRetencionesPorPagarPorRetenciones;
	protected JButton jButtonActualizarToolBarRetencionesPorPagarPorRetenciones;
    protected JButton jButtonEliminarToolBarRetencionesPorPagarPorRetenciones;
	protected JButton jButtonCancelarToolBarRetencionesPorPagarPorRetenciones;
    protected JButton jButtonGuardarCambiosToolBarRetencionesPorPagarPorRetenciones;
	protected JButton jButtonGuardarCambiosTablaToolBarRetencionesPorPagarPorRetenciones;
	protected JButton jButtonMostrarOcultarTablaToolBarRetencionesPorPagarPorRetenciones;
	protected JButton jButtonCerrarToolBarRetencionesPorPagarPorRetenciones;
	
	protected JButton jButtonProcesarInformacionToolBarRetencionesPorPagarPorRetenciones;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRetencionesPorPagarPorRetenciones;
	protected JMenuItem jMenuItemModificarRetencionesPorPagarPorRetenciones;
	protected JMenuItem jMenuItemActualizarRetencionesPorPagarPorRetenciones;
    protected JMenuItem jMenuItemEliminarRetencionesPorPagarPorRetenciones;
	protected JMenuItem jMenuItemCancelarRetencionesPorPagarPorRetenciones;
    protected JMenuItem jMenuItemGuardarCambiosRetencionesPorPagarPorRetenciones;
	protected JMenuItem jMenuItemGuardarCambiosTablaRetencionesPorPagarPorRetenciones;
	protected JMenuItem jMenuItemCerrarRetencionesPorPagarPorRetenciones;
	protected JMenuItem jMenuItemDetalleCerrarRetencionesPorPagarPorRetenciones;
	protected JMenuItem jMenuItemDetalleMostarOcultarRetencionesPorPagarPorRetenciones;
	
	protected JMenuItem jMenuItemProcesarInformacionRetencionesPorPagarPorRetenciones;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRetencionesPorPagarPorRetenciones;
	protected JMenuItem jMenuItemMostrarOcultarRetencionesPorPagarPorRetenciones;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRetencionesPorPagarPorRetenciones;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRetencionesPorPagarPorRetenciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioRetencionesPorPagarPorRetenciones;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidRetencionesPorPagarPorRetenciones;
	public JLabel jLabelIdRetencionesPorPagarPorRetenciones;
	public JLabel jLabelidRetencionesPorPagarPorRetenciones;
	public JButton jButtonidRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();

	public JPanel jPaneles_debitoRetencionesPorPagarPorRetenciones;
	public JLabel jLabeles_debitoRetencionesPorPagarPorRetenciones;
	public JCheckBox jCheckBoxes_debitoRetencionesPorPagarPorRetenciones;
	public JButton jButtones_debitoRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionRetencionesPorPagarPorRetenciones;
	public JLabel jLabelfecha_emisionRetencionesPorPagarPorRetenciones;
	//public JFormattedTextField jDateChooserfecha_emisionRetencionesPorPagarPorRetenciones;

	public JDateChooser jDateChooserfecha_emisionRetencionesPorPagarPorRetenciones;
	public JButton jButtonfecha_emisionRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_tipo_movimientoRetencionesPorPagarPorRetenciones;
	public JLabel jLabelnombre_tipo_movimientoRetencionesPorPagarPorRetenciones;
	public JTextArea jTextAreanombre_tipo_movimientoRetencionesPorPagarPorRetenciones;
	public JScrollPane jscrollPanenombre_tipo_movimientoRetencionesPorPagarPorRetenciones;
	public JButton jButtonnombre_tipo_movimientoRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();

	public JPanel jPanelnumero_mayorRetencionesPorPagarPorRetenciones;
	public JLabel jLabelnumero_mayorRetencionesPorPagarPorRetenciones;
	public JTextArea jTextAreanumero_mayorRetencionesPorPagarPorRetenciones;
	public JScrollPane jscrollPanenumero_mayorRetencionesPorPagarPorRetenciones;
	public JButton jButtonnumero_mayorRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones;
	public JLabel jLabelnombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones;
	public JTextArea jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones;
	public JScrollPane jscrollPanenombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones;
	public JButton jButtonnombre_cuenta_contable_retencionRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();

	public JPanel jPanelnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones;
	public JLabel jLabelnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones;
	public JTextField jTextFieldnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones;
	public JButton jButtonnumero_pre_impreso_facturaRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeRetencionesPorPagarPorRetenciones;
	public JLabel jLabelporcentajeRetencionesPorPagarPorRetenciones;
	public JTextField jTextFieldporcentajeRetencionesPorPagarPorRetenciones;
	public JButton jButtonporcentajeRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();

	public JPanel jPanelbase_imponibleRetencionesPorPagarPorRetenciones;
	public JLabel jLabelbase_imponibleRetencionesPorPagarPorRetenciones;
	public JTextField jTextFieldbase_imponibleRetencionesPorPagarPorRetenciones;
	public JButton jButtonbase_imponibleRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();

	public JPanel jPanelvalorRetencionesPorPagarPorRetenciones;
	public JLabel jLabelvalorRetencionesPorPagarPorRetenciones;
	public JTextField jTextFieldvalorRetencionesPorPagarPorRetenciones;
	public JButton jButtonvalorRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();

	public JPanel jPanelnumeroRetencionesPorPagarPorRetenciones;
	public JLabel jLabelnumeroRetencionesPorPagarPorRetenciones;
	public JTextField jTextFieldnumeroRetencionesPorPagarPorRetenciones;
	public JButton jButtonnumeroRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_benefRetencionesPorPagarPorRetenciones;
	public JLabel jLabelnombre_benefRetencionesPorPagarPorRetenciones;
	public JTextArea jTextAreanombre_benefRetencionesPorPagarPorRetenciones;
	public JScrollPane jscrollPanenombre_benefRetencionesPorPagarPorRetenciones;
	public JButton jButtonnombre_benefRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();

	public JPanel jPanelruc_benefRetencionesPorPagarPorRetenciones;
	public JLabel jLabelruc_benefRetencionesPorPagarPorRetenciones;
	public JTextField jTextFieldruc_benefRetencionesPorPagarPorRetenciones;
	public JButton jButtonruc_benefRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_cuenta_contableRetencionesPorPagarPorRetenciones;
	public JLabel jLabelnombre_cuenta_contableRetencionesPorPagarPorRetenciones;
	public JTextArea jTextAreanombre_cuenta_contableRetencionesPorPagarPorRetenciones;
	public JScrollPane jscrollPanenombre_cuenta_contableRetencionesPorPagarPorRetenciones;
	public JButton jButtonnombre_cuenta_contableRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones;
	public JLabel jLabelnombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones;
	public JTextArea jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones;
	public JScrollPane jscrollPanenombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones;
	public JButton jButtonnombre_cuenta_contable_creditoRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();

	public JPanel jPaneles_debito_datoRetencionesPorPagarPorRetenciones;
	public JLabel jLabeles_debito_datoRetencionesPorPagarPorRetenciones;
	public JCheckBox jCheckBoxes_debito_datoRetencionesPorPagarPorRetenciones;
	public JButton jButtones_debito_datoRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaRetencionesPorPagarPorRetenciones;
	public JLabel jLabelid_empresaRetencionesPorPagarPorRetenciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaRetencionesPorPagarPorRetenciones;
	public JButton jButtonid_empresaRetencionesPorPagarPorRetenciones= new JButtonMe();
	public JButton jButtonid_empresaRetencionesPorPagarPorRetencionesUpdate= new JButtonMe();
	public JButton jButtonid_empresaRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalRetencionesPorPagarPorRetenciones;
	public JLabel jLabelid_sucursalRetencionesPorPagarPorRetenciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalRetencionesPorPagarPorRetenciones;
	public JButton jButtonid_sucursalRetencionesPorPagarPorRetenciones= new JButtonMe();
	public JButton jButtonid_sucursalRetencionesPorPagarPorRetencionesUpdate= new JButtonMe();
	public JButton jButtonid_sucursalRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioRetencionesPorPagarPorRetenciones;
	public JLabel jLabelid_ejercicioRetencionesPorPagarPorRetenciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioRetencionesPorPagarPorRetenciones;
	public JButton jButtonid_ejercicioRetencionesPorPagarPorRetenciones= new JButtonMe();
	public JButton jButtonid_ejercicioRetencionesPorPagarPorRetencionesUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoRetencionesPorPagarPorRetenciones;
	public JLabel jLabelid_periodoRetencionesPorPagarPorRetenciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoRetencionesPorPagarPorRetenciones;
	public JButton jButtonid_periodoRetencionesPorPagarPorRetenciones= new JButtonMe();
	public JButton jButtonid_periodoRetencionesPorPagarPorRetencionesUpdate= new JButtonMe();
	public JButton jButtonid_periodoRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesRetencionesPorPagarPorRetenciones;
	
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
	public int iHeightFormulario=858;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public RetencionesPorPagarPorRetencionesDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposRetencionesPorPagarPorRetenciones=new JPanel();
				this.jPanelAccionesFormularioRetencionesPorPagarPorRetenciones=new JPanel();
				this.jmenuBarDetalleRetencionesPorPagarPorRetenciones=new JMenuBar();
				this.jTtoolBarDetalleRetencionesPorPagarPorRetenciones=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RetencionesPorPagarPorRetencionesDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("RetencionesPorPagarPorRetenciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public RetencionesPorPagarPorRetencionesDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("RetencionesPorPagarPorRetenciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RetencionesPorPagarPorRetencionesDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RetencionesPorPagarPorRetenciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RetencionesPorPagarPorRetencionesDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RetencionesPorPagarPorRetenciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RetencionesPorPagarPorRetencionesDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RetencionesPorPagarPorRetenciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarRetencionesPorPagarPorRetenciones() {
		return this.jButtonActualizarToolBarRetencionesPorPagarPorRetenciones;
	}
	
	public JButton getjButtonEliminarToolBarRetencionesPorPagarPorRetenciones() {
		return this.jButtonEliminarToolBarRetencionesPorPagarPorRetenciones;
	}
	
	public JButton getjButtonCancelarToolBarRetencionesPorPagarPorRetenciones() {
		return this.jButtonCancelarToolBarRetencionesPorPagarPorRetenciones;
	}		
	
	public JButton getjButtonProcesarInformacionRetencionesPorPagarPorRetenciones() {
		return this.jButtonProcesarInformacionRetencionesPorPagarPorRetenciones;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRetencionesPorPagarPorRetenciones)	{
		this.jButtonProcesarInformacionRetencionesPorPagarPorRetenciones = jButtonProcesarInformacionRetencionesPorPagarPorRetenciones;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRetencionesPorPagarPorRetenciones() {
		return this.jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRetencionesPorPagarPorRetenciones(
			JComboBox jComboBoxTiposRelacionesRetencionesPorPagarPorRetenciones) {
		this.jComboBoxTiposRelacionesRetencionesPorPagarPorRetenciones = jComboBoxTiposRelacionesRetencionesPorPagarPorRetenciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRetencionesPorPagarPorRetenciones(
			JComboBox jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones) {
		this.jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones = jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioRetencionesPorPagarPorRetenciones() {
		return this.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorRetenciones;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioRetencionesPorPagarPorRetenciones(
			JComboBox jComboBoxTiposAccionesFormularioRetencionesPorPagarPorRetenciones) {
		this.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorRetenciones = jComboBoxTiposAccionesFormularioRetencionesPorPagarPorRetenciones;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.retencionesporpagarporretencionesSessionBean=new RetencionesPorPagarPorRetencionesSessionBean();
		
		this.retencionesporpagarporretencionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.retencionesporpagarporretencionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RetencionesPorPagarPorRetencionesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RetencionesPorPagarPorRetencionesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RetencionesPorPagarPorRetencionesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Retenciones Por Pagar Por Retenciones MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()) {
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
	
		RetencionesPorPagarPorRetencionesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleRetencionesPorPagarPorRetenciones= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarRetencionesPorPagarPorRetenciones=new JButtonMe();
				this.jButtonModificarToolBarRetencionesPorPagarPorRetenciones=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarRetencionesPorPagarPorRetenciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarRetencionesPorPagarPorRetenciones,this.jTtoolBarDetalleRetencionesPorPagarPorRetenciones,
							"actualizar","actualizar","Actualizar"+" "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarRetencionesPorPagarPorRetenciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarRetencionesPorPagarPorRetenciones,this.jTtoolBarDetalleRetencionesPorPagarPorRetenciones,
							"eliminar","eliminar","Eliminar"+" "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarRetencionesPorPagarPorRetenciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarRetencionesPorPagarPorRetenciones,this.jTtoolBarDetalleRetencionesPorPagarPorRetenciones,
							"cancelar","cancelar","Cancelar"+" "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarRetencionesPorPagarPorRetenciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarRetencionesPorPagarPorRetenciones,this.jTtoolBarDetalleRetencionesPorPagarPorRetenciones,
							"guardarcambios","guardarcambios","Guardar"+" "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleRetencionesPorPagarPorRetenciones=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleRetencionesPorPagarPorRetenciones=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoRetencionesPorPagarPorRetenciones=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesRetencionesPorPagarPorRetenciones=new JMenuMe("Acciones");
		this.jmenuDetalleDatosRetencionesPorPagarPorRetenciones=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRetencionesPorPagarPorRetenciones= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRetencionesPorPagarPorRetenciones.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRetencionesPorPagarPorRetenciones,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarRetencionesPorPagarPorRetenciones= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarRetencionesPorPagarPorRetenciones.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarRetencionesPorPagarPorRetenciones,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarRetencionesPorPagarPorRetenciones= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarRetencionesPorPagarPorRetenciones.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarRetencionesPorPagarPorRetenciones,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarRetencionesPorPagarPorRetenciones= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarRetencionesPorPagarPorRetenciones.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarRetencionesPorPagarPorRetenciones,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarRetencionesPorPagarPorRetenciones= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarRetencionesPorPagarPorRetenciones.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarRetencionesPorPagarPorRetenciones,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosRetencionesPorPagarPorRetenciones= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRetencionesPorPagarPorRetenciones.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRetencionesPorPagarPorRetenciones,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRetencionesPorPagarPorRetenciones= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRetencionesPorPagarPorRetenciones.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRetencionesPorPagarPorRetenciones,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarRetencionesPorPagarPorRetenciones= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarRetencionesPorPagarPorRetenciones.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarRetencionesPorPagarPorRetenciones,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRetencionesPorPagarPorRetenciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRetencionesPorPagarPorRetenciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRetencionesPorPagarPorRetenciones,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRetencionesPorPagarPorRetenciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRetencionesPorPagarPorRetenciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRetencionesPorPagarPorRetenciones,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoRetencionesPorPagarPorRetenciones.add(this.jMenuItemDetalleCerrarRetencionesPorPagarPorRetenciones);
		
		this.jmenuDetalleAccionesRetencionesPorPagarPorRetenciones.add(this.jMenuItemActualizarRetencionesPorPagarPorRetenciones);
		this.jmenuDetalleAccionesRetencionesPorPagarPorRetenciones.add(this.jMenuItemEliminarRetencionesPorPagarPorRetenciones);
		this.jmenuDetalleAccionesRetencionesPorPagarPorRetenciones.add(this.jMenuItemCancelarRetencionesPorPagarPorRetenciones);		
		
		//this.jmenuDetalleDatosRetencionesPorPagarPorRetenciones.add(this.jMenuItemDetalleAbrirOrderByRetencionesPorPagarPorRetenciones);				
		this.jmenuDetalleDatosRetencionesPorPagarPorRetenciones.add(this.jMenuItemDetalleMostarOcultarRetencionesPorPagarPorRetenciones);				
				
		//this.jmenuDetalleAccionesRetencionesPorPagarPorRetenciones.add(this.jMenuItemGuardarCambiosRetencionesPorPagarPorRetenciones);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleRetencionesPorPagarPorRetenciones.add(this.jmenuDetalleArchivoRetencionesPorPagarPorRetenciones);		
		this.jmenuBarDetalleRetencionesPorPagarPorRetenciones.add(this.jmenuDetalleAccionesRetencionesPorPagarPorRetenciones);		
		this.jmenuBarDetalleRetencionesPorPagarPorRetenciones.add(this.jmenuDetalleDatosRetencionesPorPagarPorRetenciones);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleRetencionesPorPagarPorRetenciones);				
	}
	
	
	public void inicializarElementosCamposRetencionesPorPagarPorRetenciones() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdRetencionesPorPagarPorRetenciones = new JLabelMe();
		jLabelIdRetencionesPorPagarPorRetenciones.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidRetencionesPorPagarPorRetenciones = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidRetencionesPorPagarPorRetenciones.setToolTipText(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutRetencionesPorPagarPorRetenciones= new GridBagLayout();

		this.jPanelidRetencionesPorPagarPorRetenciones.setLayout(this.gridaBagLayoutRetencionesPorPagarPorRetenciones);

		jLabelidRetencionesPorPagarPorRetenciones = new JLabel();
		jLabelidRetencionesPorPagarPorRetenciones.setText("Id");

		jLabelidRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeles_debitoRetencionesPorPagarPorRetenciones = new JLabelMe();
		this.jLabeles_debitoRetencionesPorPagarPorRetenciones.setText(""+RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_ESDEBITO+" : *");
		this.jLabeles_debitoRetencionesPorPagarPorRetenciones.setToolTipText("Es Debito");
		this.jLabeles_debitoRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_debitoRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_debitoRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_debitoRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_debitoRetencionesPorPagarPorRetenciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_debitoRetencionesPorPagarPorRetenciones.setToolTipText(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_ESDEBITO);
		this.gridaBagLayoutRetencionesPorPagarPorRetenciones = new GridBagLayout();
		this.jPaneles_debitoRetencionesPorPagarPorRetenciones.setLayout(this.gridaBagLayoutRetencionesPorPagarPorRetenciones);


		jCheckBoxes_debitoRetencionesPorPagarPorRetenciones= new JCheckBoxMe();
		jCheckBoxes_debitoRetencionesPorPagarPorRetenciones.setEnabled(false);

		jCheckBoxes_debitoRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_debitoRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_debitoRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_debitoRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_debitoRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();
		this.jButtones_debitoRetencionesPorPagarPorRetencionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_debitoRetencionesPorPagarPorRetencionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_debitoRetencionesPorPagarPorRetencionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_debitoRetencionesPorPagarPorRetencionesBusqueda.setText("U");
		this.jButtones_debitoRetencionesPorPagarPorRetencionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_debitoRetencionesPorPagarPorRetencionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_debitoRetencionesPorPagarPorRetencionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_debitoRetencionesPorPagarPorRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_debitoRetencionesPorPagarPorRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_debitoRetencionesPorPagarPorRetencionesBusqueda"));

		if(this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_debitoRetencionesPorPagarPorRetencionesBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionRetencionesPorPagarPorRetenciones = new JLabelMe();
		this.jLabelfecha_emisionRetencionesPorPagarPorRetenciones.setText(""+RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionRetencionesPorPagarPorRetenciones.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionRetencionesPorPagarPorRetenciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionRetencionesPorPagarPorRetenciones.setToolTipText(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutRetencionesPorPagarPorRetenciones = new GridBagLayout();
		this.jPanelfecha_emisionRetencionesPorPagarPorRetenciones.setLayout(this.gridaBagLayoutRetencionesPorPagarPorRetenciones);


		//jFormattedTextFieldfecha_emisionRetencionesPorPagarPorRetenciones= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionRetencionesPorPagarPorRetenciones= new JDateChooser();
		jDateChooserfecha_emisionRetencionesPorPagarPorRetenciones.setEnabled(false);
		jDateChooserfecha_emisionRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionRetencionesPorPagarPorRetenciones.setDate(new Date());
		jDateChooserfecha_emisionRetencionesPorPagarPorRetenciones.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionRetencionesPorPagarPorRetenciones.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();
		this.jButtonfecha_emisionRetencionesPorPagarPorRetencionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionRetencionesPorPagarPorRetencionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionRetencionesPorPagarPorRetencionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionRetencionesPorPagarPorRetencionesBusqueda.setText("U");
		this.jButtonfecha_emisionRetencionesPorPagarPorRetencionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionRetencionesPorPagarPorRetencionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionRetencionesPorPagarPorRetencionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionRetencionesPorPagarPorRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionRetencionesPorPagarPorRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionRetencionesPorPagarPorRetencionesBusqueda"));

		if(this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionRetencionesPorPagarPorRetencionesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_tipo_movimientoRetencionesPorPagarPorRetenciones = new JLabelMe();
		this.jLabelnombre_tipo_movimientoRetencionesPorPagarPorRetenciones.setText(""+RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRETIPOMOVIMIENTO+" : *");
		this.jLabelnombre_tipo_movimientoRetencionesPorPagarPorRetenciones.setToolTipText("Nombre Tipo Movimiento");
		this.jLabelnombre_tipo_movimientoRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_movimientoRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_movimientoRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_tipo_movimientoRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_tipo_movimientoRetencionesPorPagarPorRetenciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_tipo_movimientoRetencionesPorPagarPorRetenciones.setToolTipText(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRETIPOMOVIMIENTO);
		this.gridaBagLayoutRetencionesPorPagarPorRetenciones = new GridBagLayout();
		this.jPanelnombre_tipo_movimientoRetencionesPorPagarPorRetenciones.setLayout(this.gridaBagLayoutRetencionesPorPagarPorRetenciones);


		jTextAreanombre_tipo_movimientoRetencionesPorPagarPorRetenciones= new JTextAreaMe();
		jTextAreanombre_tipo_movimientoRetencionesPorPagarPorRetenciones.setEnabled(false);
		jTextAreanombre_tipo_movimientoRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_movimientoRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_movimientoRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_movimientoRetencionesPorPagarPorRetenciones.setLineWrap(true);
		jTextAreanombre_tipo_movimientoRetencionesPorPagarPorRetenciones.setWrapStyleWord(true);
		jTextAreanombre_tipo_movimientoRetencionesPorPagarPorRetenciones.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_tipo_movimientoRetencionesPorPagarPorRetenciones.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_tipo_movimientoRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_tipo_movimientoRetencionesPorPagarPorRetenciones = new JScrollPane(jTextAreanombre_tipo_movimientoRetencionesPorPagarPorRetenciones);
		jscrollPanenombre_tipo_movimientoRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_tipo_movimientoRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_tipo_movimientoRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_tipo_movimientoRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();
		this.jButtonnombre_tipo_movimientoRetencionesPorPagarPorRetencionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_movimientoRetencionesPorPagarPorRetencionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_movimientoRetencionesPorPagarPorRetencionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_tipo_movimientoRetencionesPorPagarPorRetencionesBusqueda.setText("U");
		this.jButtonnombre_tipo_movimientoRetencionesPorPagarPorRetencionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_tipo_movimientoRetencionesPorPagarPorRetencionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_tipo_movimientoRetencionesPorPagarPorRetencionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_tipo_movimientoRetencionesPorPagarPorRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_tipo_movimientoRetencionesPorPagarPorRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_tipo_movimientoRetencionesPorPagarPorRetencionesBusqueda"));

		if(this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_tipo_movimientoRetencionesPorPagarPorRetencionesBusqueda.setVisible(false);		}


					
		this.jLabelnumero_mayorRetencionesPorPagarPorRetenciones = new JLabelMe();
		this.jLabelnumero_mayorRetencionesPorPagarPorRetenciones.setText(""+RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMEROMAYOR+" : *");
		this.jLabelnumero_mayorRetencionesPorPagarPorRetenciones.setToolTipText("Numero Mayor");
		this.jLabelnumero_mayorRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mayorRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mayorRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_mayorRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_mayorRetencionesPorPagarPorRetenciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_mayorRetencionesPorPagarPorRetenciones.setToolTipText(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMEROMAYOR);
		this.gridaBagLayoutRetencionesPorPagarPorRetenciones = new GridBagLayout();
		this.jPanelnumero_mayorRetencionesPorPagarPorRetenciones.setLayout(this.gridaBagLayoutRetencionesPorPagarPorRetenciones);


		jTextAreanumero_mayorRetencionesPorPagarPorRetenciones= new JTextAreaMe();
		jTextAreanumero_mayorRetencionesPorPagarPorRetenciones.setEnabled(false);
		jTextAreanumero_mayorRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorRetencionesPorPagarPorRetenciones.setLineWrap(true);
		jTextAreanumero_mayorRetencionesPorPagarPorRetenciones.setWrapStyleWord(true);
		jTextAreanumero_mayorRetencionesPorPagarPorRetenciones.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanumero_mayorRetencionesPorPagarPorRetenciones.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanumero_mayorRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenumero_mayorRetencionesPorPagarPorRetenciones = new JScrollPane(jTextAreanumero_mayorRetencionesPorPagarPorRetenciones);
		jscrollPanenumero_mayorRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenumero_mayorRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenumero_mayorRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnumero_mayorRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();
		this.jButtonnumero_mayorRetencionesPorPagarPorRetencionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mayorRetencionesPorPagarPorRetencionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mayorRetencionesPorPagarPorRetencionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_mayorRetencionesPorPagarPorRetencionesBusqueda.setText("U");
		this.jButtonnumero_mayorRetencionesPorPagarPorRetencionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_mayorRetencionesPorPagarPorRetencionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_mayorRetencionesPorPagarPorRetencionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanumero_mayorRetencionesPorPagarPorRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanumero_mayorRetencionesPorPagarPorRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_mayorRetencionesPorPagarPorRetencionesBusqueda"));

		if(this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_mayorRetencionesPorPagarPorRetencionesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones = new JLabelMe();
		this.jLabelnombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones.setText(""+RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION+" : *");
		this.jLabelnombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones.setToolTipText("Nombre Cuenta Contable Retencion");
		this.jLabelnombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones.setToolTipText(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION);
		this.gridaBagLayoutRetencionesPorPagarPorRetenciones = new GridBagLayout();
		this.jPanelnombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones.setLayout(this.gridaBagLayoutRetencionesPorPagarPorRetenciones);


		jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones= new JTextAreaMe();
		jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones.setEnabled(false);
		jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones.setLineWrap(true);
		jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones.setWrapStyleWord(true);
		jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones = new JScrollPane(jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones);
		jscrollPanenombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_cuenta_contable_retencionRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();
		this.jButtonnombre_cuenta_contable_retencionRetencionesPorPagarPorRetencionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cuenta_contable_retencionRetencionesPorPagarPorRetencionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cuenta_contable_retencionRetencionesPorPagarPorRetencionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_cuenta_contable_retencionRetencionesPorPagarPorRetencionesBusqueda.setText("U");
		this.jButtonnombre_cuenta_contable_retencionRetencionesPorPagarPorRetencionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_cuenta_contable_retencionRetencionesPorPagarPorRetencionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_cuenta_contable_retencionRetencionesPorPagarPorRetencionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_cuenta_contable_retencionRetencionesPorPagarPorRetencionesBusqueda"));

		if(this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_cuenta_contable_retencionRetencionesPorPagarPorRetencionesBusqueda.setVisible(false);		}


					
		this.jLabelnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones = new JLabelMe();
		this.jLabelnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones.setText(""+RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA+" : *");
		this.jLabelnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones.setToolTipText("Numero Pre Impreso Factura");
		this.jLabelnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones.setToolTipText(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA);
		this.gridaBagLayoutRetencionesPorPagarPorRetenciones = new GridBagLayout();
		this.jPanelnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones.setLayout(this.gridaBagLayoutRetencionesPorPagarPorRetenciones);


		jTextFieldnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones= new JTextFieldMe();

		jTextFieldnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones.setEnabled(false);
		jTextFieldnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_pre_impreso_facturaRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();
		this.jButtonnumero_pre_impreso_facturaRetencionesPorPagarPorRetencionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impreso_facturaRetencionesPorPagarPorRetencionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impreso_facturaRetencionesPorPagarPorRetencionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_pre_impreso_facturaRetencionesPorPagarPorRetencionesBusqueda.setText("U");
		this.jButtonnumero_pre_impreso_facturaRetencionesPorPagarPorRetencionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_pre_impreso_facturaRetencionesPorPagarPorRetencionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_pre_impreso_facturaRetencionesPorPagarPorRetencionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_pre_impreso_facturaRetencionesPorPagarPorRetencionesBusqueda"));

		if(this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_pre_impreso_facturaRetencionesPorPagarPorRetencionesBusqueda.setVisible(false);		}


					
		this.jLabelporcentajeRetencionesPorPagarPorRetenciones = new JLabelMe();
		this.jLabelporcentajeRetencionesPorPagarPorRetenciones.setText(""+RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeRetencionesPorPagarPorRetenciones.setToolTipText("Porcentaje");
		this.jLabelporcentajeRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeRetencionesPorPagarPorRetenciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeRetencionesPorPagarPorRetenciones.setToolTipText(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutRetencionesPorPagarPorRetenciones = new GridBagLayout();
		this.jPanelporcentajeRetencionesPorPagarPorRetenciones.setLayout(this.gridaBagLayoutRetencionesPorPagarPorRetenciones);


		jTextFieldporcentajeRetencionesPorPagarPorRetenciones= new JTextFieldMe();
		jTextFieldporcentajeRetencionesPorPagarPorRetenciones.setEnabled(false);
		jTextFieldporcentajeRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeRetencionesPorPagarPorRetenciones.setText("0.0");

		this.jButtonporcentajeRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();
		this.jButtonporcentajeRetencionesPorPagarPorRetencionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeRetencionesPorPagarPorRetencionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeRetencionesPorPagarPorRetencionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeRetencionesPorPagarPorRetencionesBusqueda.setText("U");
		this.jButtonporcentajeRetencionesPorPagarPorRetencionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeRetencionesPorPagarPorRetencionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeRetencionesPorPagarPorRetencionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeRetencionesPorPagarPorRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeRetencionesPorPagarPorRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeRetencionesPorPagarPorRetencionesBusqueda"));

		if(this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeRetencionesPorPagarPorRetencionesBusqueda.setVisible(false);		}


					
		this.jLabelbase_imponibleRetencionesPorPagarPorRetenciones = new JLabelMe();
		this.jLabelbase_imponibleRetencionesPorPagarPorRetenciones.setText(""+RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_BASEIMPONIBLE+" : *");
		this.jLabelbase_imponibleRetencionesPorPagarPorRetenciones.setToolTipText("Base Imponible");
		this.jLabelbase_imponibleRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbase_imponibleRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbase_imponibleRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbase_imponibleRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbase_imponibleRetencionesPorPagarPorRetenciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbase_imponibleRetencionesPorPagarPorRetenciones.setToolTipText(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_BASEIMPONIBLE);
		this.gridaBagLayoutRetencionesPorPagarPorRetenciones = new GridBagLayout();
		this.jPanelbase_imponibleRetencionesPorPagarPorRetenciones.setLayout(this.gridaBagLayoutRetencionesPorPagarPorRetenciones);


		jTextFieldbase_imponibleRetencionesPorPagarPorRetenciones= new JTextFieldMe();
		jTextFieldbase_imponibleRetencionesPorPagarPorRetenciones.setEnabled(false);
		jTextFieldbase_imponibleRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbase_imponibleRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbase_imponibleRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldbase_imponibleRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldbase_imponibleRetencionesPorPagarPorRetenciones.setText("0.0");

		this.jButtonbase_imponibleRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();
		this.jButtonbase_imponibleRetencionesPorPagarPorRetencionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbase_imponibleRetencionesPorPagarPorRetencionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbase_imponibleRetencionesPorPagarPorRetencionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbase_imponibleRetencionesPorPagarPorRetencionesBusqueda.setText("U");
		this.jButtonbase_imponibleRetencionesPorPagarPorRetencionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbase_imponibleRetencionesPorPagarPorRetencionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbase_imponibleRetencionesPorPagarPorRetencionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldbase_imponibleRetencionesPorPagarPorRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldbase_imponibleRetencionesPorPagarPorRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"base_imponibleRetencionesPorPagarPorRetencionesBusqueda"));

		if(this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbase_imponibleRetencionesPorPagarPorRetencionesBusqueda.setVisible(false);		}


					
		this.jLabelvalorRetencionesPorPagarPorRetenciones = new JLabelMe();
		this.jLabelvalorRetencionesPorPagarPorRetenciones.setText(""+RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorRetencionesPorPagarPorRetenciones.setToolTipText("Valor");
		this.jLabelvalorRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorRetencionesPorPagarPorRetenciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorRetencionesPorPagarPorRetenciones.setToolTipText(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutRetencionesPorPagarPorRetenciones = new GridBagLayout();
		this.jPanelvalorRetencionesPorPagarPorRetenciones.setLayout(this.gridaBagLayoutRetencionesPorPagarPorRetenciones);


		jTextFieldvalorRetencionesPorPagarPorRetenciones= new JTextFieldMe();
		jTextFieldvalorRetencionesPorPagarPorRetenciones.setEnabled(false);
		jTextFieldvalorRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorRetencionesPorPagarPorRetenciones.setText("0.0");

		this.jButtonvalorRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();
		this.jButtonvalorRetencionesPorPagarPorRetencionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorRetencionesPorPagarPorRetencionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorRetencionesPorPagarPorRetencionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorRetencionesPorPagarPorRetencionesBusqueda.setText("U");
		this.jButtonvalorRetencionesPorPagarPorRetencionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorRetencionesPorPagarPorRetencionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorRetencionesPorPagarPorRetencionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorRetencionesPorPagarPorRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorRetencionesPorPagarPorRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorRetencionesPorPagarPorRetencionesBusqueda"));

		if(this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorRetencionesPorPagarPorRetencionesBusqueda.setVisible(false);		}


					
		this.jLabelnumeroRetencionesPorPagarPorRetenciones = new JLabelMe();
		this.jLabelnumeroRetencionesPorPagarPorRetenciones.setText(""+RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMERO+" : *");
		this.jLabelnumeroRetencionesPorPagarPorRetenciones.setToolTipText("Numero");
		this.jLabelnumeroRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumeroRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumeroRetencionesPorPagarPorRetenciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumeroRetencionesPorPagarPorRetenciones.setToolTipText(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMERO);
		this.gridaBagLayoutRetencionesPorPagarPorRetenciones = new GridBagLayout();
		this.jPanelnumeroRetencionesPorPagarPorRetenciones.setLayout(this.gridaBagLayoutRetencionesPorPagarPorRetenciones);


		jTextFieldnumeroRetencionesPorPagarPorRetenciones= new JTextFieldMe();

		jTextFieldnumeroRetencionesPorPagarPorRetenciones.setEnabled(false);
		jTextFieldnumeroRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumeroRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumeroRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();
		this.jButtonnumeroRetencionesPorPagarPorRetencionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroRetencionesPorPagarPorRetencionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroRetencionesPorPagarPorRetencionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumeroRetencionesPorPagarPorRetencionesBusqueda.setText("U");
		this.jButtonnumeroRetencionesPorPagarPorRetencionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumeroRetencionesPorPagarPorRetencionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumeroRetencionesPorPagarPorRetencionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumeroRetencionesPorPagarPorRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumeroRetencionesPorPagarPorRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numeroRetencionesPorPagarPorRetencionesBusqueda"));

		if(this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumeroRetencionesPorPagarPorRetencionesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_benefRetencionesPorPagarPorRetenciones = new JLabelMe();
		this.jLabelnombre_benefRetencionesPorPagarPorRetenciones.setText(""+RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBREBENEF+" : *");
		this.jLabelnombre_benefRetencionesPorPagarPorRetenciones.setToolTipText("Nombre Benef");
		this.jLabelnombre_benefRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_benefRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_benefRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_benefRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_benefRetencionesPorPagarPorRetenciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_benefRetencionesPorPagarPorRetenciones.setToolTipText(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBREBENEF);
		this.gridaBagLayoutRetencionesPorPagarPorRetenciones = new GridBagLayout();
		this.jPanelnombre_benefRetencionesPorPagarPorRetenciones.setLayout(this.gridaBagLayoutRetencionesPorPagarPorRetenciones);


		jTextAreanombre_benefRetencionesPorPagarPorRetenciones= new JTextAreaMe();
		jTextAreanombre_benefRetencionesPorPagarPorRetenciones.setEnabled(false);
		jTextAreanombre_benefRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_benefRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_benefRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_benefRetencionesPorPagarPorRetenciones.setLineWrap(true);
		jTextAreanombre_benefRetencionesPorPagarPorRetenciones.setWrapStyleWord(true);
		jTextAreanombre_benefRetencionesPorPagarPorRetenciones.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_benefRetencionesPorPagarPorRetenciones.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_benefRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_benefRetencionesPorPagarPorRetenciones = new JScrollPane(jTextAreanombre_benefRetencionesPorPagarPorRetenciones);
		jscrollPanenombre_benefRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_benefRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_benefRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_benefRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();
		this.jButtonnombre_benefRetencionesPorPagarPorRetencionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_benefRetencionesPorPagarPorRetencionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_benefRetencionesPorPagarPorRetencionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_benefRetencionesPorPagarPorRetencionesBusqueda.setText("U");
		this.jButtonnombre_benefRetencionesPorPagarPorRetencionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_benefRetencionesPorPagarPorRetencionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_benefRetencionesPorPagarPorRetencionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_benefRetencionesPorPagarPorRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_benefRetencionesPorPagarPorRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_benefRetencionesPorPagarPorRetencionesBusqueda"));

		if(this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_benefRetencionesPorPagarPorRetencionesBusqueda.setVisible(false);		}


					
		this.jLabelruc_benefRetencionesPorPagarPorRetenciones = new JLabelMe();
		this.jLabelruc_benefRetencionesPorPagarPorRetenciones.setText(""+RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_RUCBENEF+" : *");
		this.jLabelruc_benefRetencionesPorPagarPorRetenciones.setToolTipText("Ruc Benef");
		this.jLabelruc_benefRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelruc_benefRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelruc_benefRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelruc_benefRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelruc_benefRetencionesPorPagarPorRetenciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelruc_benefRetencionesPorPagarPorRetenciones.setToolTipText(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_RUCBENEF);
		this.gridaBagLayoutRetencionesPorPagarPorRetenciones = new GridBagLayout();
		this.jPanelruc_benefRetencionesPorPagarPorRetenciones.setLayout(this.gridaBagLayoutRetencionesPorPagarPorRetenciones);


		jTextFieldruc_benefRetencionesPorPagarPorRetenciones= new JTextFieldMe();

		jTextFieldruc_benefRetencionesPorPagarPorRetenciones.setEnabled(false);
		jTextFieldruc_benefRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldruc_benefRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldruc_benefRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldruc_benefRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonruc_benefRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();
		this.jButtonruc_benefRetencionesPorPagarPorRetencionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonruc_benefRetencionesPorPagarPorRetencionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonruc_benefRetencionesPorPagarPorRetencionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonruc_benefRetencionesPorPagarPorRetencionesBusqueda.setText("U");
		this.jButtonruc_benefRetencionesPorPagarPorRetencionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonruc_benefRetencionesPorPagarPorRetencionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonruc_benefRetencionesPorPagarPorRetencionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldruc_benefRetencionesPorPagarPorRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldruc_benefRetencionesPorPagarPorRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ruc_benefRetencionesPorPagarPorRetencionesBusqueda"));

		if(this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonruc_benefRetencionesPorPagarPorRetencionesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_cuenta_contableRetencionesPorPagarPorRetenciones = new JLabelMe();
		this.jLabelnombre_cuenta_contableRetencionesPorPagarPorRetenciones.setText(""+RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE+" : *");
		this.jLabelnombre_cuenta_contableRetencionesPorPagarPorRetenciones.setToolTipText("Nombre Cuenta Contable");
		this.jLabelnombre_cuenta_contableRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_cuenta_contableRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_cuenta_contableRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_cuenta_contableRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_cuenta_contableRetencionesPorPagarPorRetenciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_cuenta_contableRetencionesPorPagarPorRetenciones.setToolTipText(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE);
		this.gridaBagLayoutRetencionesPorPagarPorRetenciones = new GridBagLayout();
		this.jPanelnombre_cuenta_contableRetencionesPorPagarPorRetenciones.setLayout(this.gridaBagLayoutRetencionesPorPagarPorRetenciones);


		jTextAreanombre_cuenta_contableRetencionesPorPagarPorRetenciones= new JTextAreaMe();
		jTextAreanombre_cuenta_contableRetencionesPorPagarPorRetenciones.setEnabled(false);
		jTextAreanombre_cuenta_contableRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuenta_contableRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuenta_contableRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuenta_contableRetencionesPorPagarPorRetenciones.setLineWrap(true);
		jTextAreanombre_cuenta_contableRetencionesPorPagarPorRetenciones.setWrapStyleWord(true);
		jTextAreanombre_cuenta_contableRetencionesPorPagarPorRetenciones.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_cuenta_contableRetencionesPorPagarPorRetenciones.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_cuenta_contableRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_cuenta_contableRetencionesPorPagarPorRetenciones = new JScrollPane(jTextAreanombre_cuenta_contableRetencionesPorPagarPorRetenciones);
		jscrollPanenombre_cuenta_contableRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_cuenta_contableRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_cuenta_contableRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_cuenta_contableRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();
		this.jButtonnombre_cuenta_contableRetencionesPorPagarPorRetencionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cuenta_contableRetencionesPorPagarPorRetencionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cuenta_contableRetencionesPorPagarPorRetencionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_cuenta_contableRetencionesPorPagarPorRetencionesBusqueda.setText("U");
		this.jButtonnombre_cuenta_contableRetencionesPorPagarPorRetencionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_cuenta_contableRetencionesPorPagarPorRetencionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_cuenta_contableRetencionesPorPagarPorRetencionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_cuenta_contableRetencionesPorPagarPorRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_cuenta_contableRetencionesPorPagarPorRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_cuenta_contableRetencionesPorPagarPorRetencionesBusqueda"));

		if(this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_cuenta_contableRetencionesPorPagarPorRetencionesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones = new JLabelMe();
		this.jLabelnombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones.setText(""+RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLECREDITO+" : *");
		this.jLabelnombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones.setToolTipText("Nombre Cuenta Contable Credito");
		this.jLabelnombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones.setToolTipText(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLECREDITO);
		this.gridaBagLayoutRetencionesPorPagarPorRetenciones = new GridBagLayout();
		this.jPanelnombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones.setLayout(this.gridaBagLayoutRetencionesPorPagarPorRetenciones);


		jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones= new JTextAreaMe();
		jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones.setEnabled(false);
		jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones.setLineWrap(true);
		jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones.setWrapStyleWord(true);
		jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones = new JScrollPane(jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones);
		jscrollPanenombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_cuenta_contable_creditoRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();
		this.jButtonnombre_cuenta_contable_creditoRetencionesPorPagarPorRetencionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cuenta_contable_creditoRetencionesPorPagarPorRetencionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cuenta_contable_creditoRetencionesPorPagarPorRetencionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_cuenta_contable_creditoRetencionesPorPagarPorRetencionesBusqueda.setText("U");
		this.jButtonnombre_cuenta_contable_creditoRetencionesPorPagarPorRetencionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_cuenta_contable_creditoRetencionesPorPagarPorRetencionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_cuenta_contable_creditoRetencionesPorPagarPorRetencionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_cuenta_contable_creditoRetencionesPorPagarPorRetencionesBusqueda"));

		if(this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_cuenta_contable_creditoRetencionesPorPagarPorRetencionesBusqueda.setVisible(false);		}


					
		this.jLabeles_debito_datoRetencionesPorPagarPorRetenciones = new JLabelMe();
		this.jLabeles_debito_datoRetencionesPorPagarPorRetenciones.setText(""+RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_ESDEBITODATO+" : *");
		this.jLabeles_debito_datoRetencionesPorPagarPorRetenciones.setToolTipText("Es Debito Dato");
		this.jLabeles_debito_datoRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_debito_datoRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_debito_datoRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_debito_datoRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_debito_datoRetencionesPorPagarPorRetenciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_debito_datoRetencionesPorPagarPorRetenciones.setToolTipText(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_ESDEBITODATO);
		this.gridaBagLayoutRetencionesPorPagarPorRetenciones = new GridBagLayout();
		this.jPaneles_debito_datoRetencionesPorPagarPorRetenciones.setLayout(this.gridaBagLayoutRetencionesPorPagarPorRetenciones);


		jCheckBoxes_debito_datoRetencionesPorPagarPorRetenciones= new JCheckBoxMe();
		jCheckBoxes_debito_datoRetencionesPorPagarPorRetenciones.setEnabled(false);

		jCheckBoxes_debito_datoRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_debito_datoRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_debito_datoRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_debito_datoRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_debito_datoRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();
		this.jButtones_debito_datoRetencionesPorPagarPorRetencionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_debito_datoRetencionesPorPagarPorRetencionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_debito_datoRetencionesPorPagarPorRetencionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_debito_datoRetencionesPorPagarPorRetencionesBusqueda.setText("U");
		this.jButtones_debito_datoRetencionesPorPagarPorRetencionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_debito_datoRetencionesPorPagarPorRetencionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_debito_datoRetencionesPorPagarPorRetencionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_debito_datoRetencionesPorPagarPorRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_debito_datoRetencionesPorPagarPorRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_debito_datoRetencionesPorPagarPorRetencionesBusqueda"));

		if(this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_debito_datoRetencionesPorPagarPorRetencionesBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysRetencionesPorPagarPorRetenciones() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaRetencionesPorPagarPorRetenciones = new JLabelMe();
		this.jLabelid_empresaRetencionesPorPagarPorRetenciones.setText(""+RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaRetencionesPorPagarPorRetenciones.setToolTipText("Empresa");
		this.jLabelid_empresaRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaRetencionesPorPagarPorRetenciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaRetencionesPorPagarPorRetenciones.setToolTipText(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutRetencionesPorPagarPorRetenciones = new GridBagLayout();
		this.jPanelid_empresaRetencionesPorPagarPorRetenciones.setLayout(this.gridaBagLayoutRetencionesPorPagarPorRetenciones);


		jComboBoxid_empresaRetencionesPorPagarPorRetenciones= new JComboBoxMe();
		jComboBoxid_empresaRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaRetencionesPorPagarPorRetenciones.setEnabled(false);

		this.jButtonid_empresaRetencionesPorPagarPorRetenciones= new JButtonMe();
		this.jButtonid_empresaRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRetencionesPorPagarPorRetenciones.setText("Buscar");
		this.jButtonid_empresaRetencionesPorPagarPorRetenciones.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaRetencionesPorPagarPorRetenciones.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRetencionesPorPagarPorRetenciones,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaRetencionesPorPagarPorRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRetencionesPorPagarPorRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRetencionesPorPagarPorRetenciones"));

		this.jButtonid_empresaRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();
		this.jButtonid_empresaRetencionesPorPagarPorRetencionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRetencionesPorPagarPorRetencionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRetencionesPorPagarPorRetencionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRetencionesPorPagarPorRetencionesBusqueda.setText("U");
		this.jButtonid_empresaRetencionesPorPagarPorRetencionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaRetencionesPorPagarPorRetencionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRetencionesPorPagarPorRetencionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaRetencionesPorPagarPorRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRetencionesPorPagarPorRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRetencionesPorPagarPorRetencionesBusqueda"));

		if(this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaRetencionesPorPagarPorRetencionesBusqueda.setVisible(false);		}

		this.jButtonid_empresaRetencionesPorPagarPorRetencionesUpdate= new JButtonMe();
		this.jButtonid_empresaRetencionesPorPagarPorRetencionesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRetencionesPorPagarPorRetencionesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRetencionesPorPagarPorRetencionesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRetencionesPorPagarPorRetencionesUpdate.setText("U");
		this.jButtonid_empresaRetencionesPorPagarPorRetencionesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaRetencionesPorPagarPorRetencionesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRetencionesPorPagarPorRetencionesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaRetencionesPorPagarPorRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRetencionesPorPagarPorRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRetencionesPorPagarPorRetencionesUpdate"));



					
		this.jLabelid_sucursalRetencionesPorPagarPorRetenciones = new JLabelMe();
		this.jLabelid_sucursalRetencionesPorPagarPorRetenciones.setText(""+RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalRetencionesPorPagarPorRetenciones.setToolTipText("Sucursal");
		this.jLabelid_sucursalRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalRetencionesPorPagarPorRetenciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalRetencionesPorPagarPorRetenciones.setToolTipText(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutRetencionesPorPagarPorRetenciones = new GridBagLayout();
		this.jPanelid_sucursalRetencionesPorPagarPorRetenciones.setLayout(this.gridaBagLayoutRetencionesPorPagarPorRetenciones);


		jComboBoxid_sucursalRetencionesPorPagarPorRetenciones= new JComboBoxMe();
		jComboBoxid_sucursalRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalRetencionesPorPagarPorRetenciones.setEnabled(false);

		this.jButtonid_sucursalRetencionesPorPagarPorRetenciones= new JButtonMe();
		this.jButtonid_sucursalRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalRetencionesPorPagarPorRetenciones.setText("Buscar");
		this.jButtonid_sucursalRetencionesPorPagarPorRetenciones.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalRetencionesPorPagarPorRetenciones.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalRetencionesPorPagarPorRetenciones,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalRetencionesPorPagarPorRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalRetencionesPorPagarPorRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalRetencionesPorPagarPorRetenciones"));

		this.jButtonid_sucursalRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();
		this.jButtonid_sucursalRetencionesPorPagarPorRetencionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRetencionesPorPagarPorRetencionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRetencionesPorPagarPorRetencionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalRetencionesPorPagarPorRetencionesBusqueda.setText("U");
		this.jButtonid_sucursalRetencionesPorPagarPorRetencionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalRetencionesPorPagarPorRetencionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalRetencionesPorPagarPorRetencionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalRetencionesPorPagarPorRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalRetencionesPorPagarPorRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalRetencionesPorPagarPorRetencionesBusqueda"));

		if(this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalRetencionesPorPagarPorRetencionesBusqueda.setVisible(false);		}

		this.jButtonid_sucursalRetencionesPorPagarPorRetencionesUpdate= new JButtonMe();
		this.jButtonid_sucursalRetencionesPorPagarPorRetencionesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRetencionesPorPagarPorRetencionesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRetencionesPorPagarPorRetencionesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalRetencionesPorPagarPorRetencionesUpdate.setText("U");
		this.jButtonid_sucursalRetencionesPorPagarPorRetencionesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalRetencionesPorPagarPorRetencionesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalRetencionesPorPagarPorRetencionesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalRetencionesPorPagarPorRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalRetencionesPorPagarPorRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalRetencionesPorPagarPorRetencionesUpdate"));



					
		this.jLabelid_ejercicioRetencionesPorPagarPorRetenciones = new JLabelMe();
		this.jLabelid_ejercicioRetencionesPorPagarPorRetenciones.setText(""+RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioRetencionesPorPagarPorRetenciones.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioRetencionesPorPagarPorRetenciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioRetencionesPorPagarPorRetenciones.setToolTipText(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutRetencionesPorPagarPorRetenciones = new GridBagLayout();
		this.jPanelid_ejercicioRetencionesPorPagarPorRetenciones.setLayout(this.gridaBagLayoutRetencionesPorPagarPorRetenciones);


		jComboBoxid_ejercicioRetencionesPorPagarPorRetenciones= new JComboBoxMe();
		jComboBoxid_ejercicioRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioRetencionesPorPagarPorRetenciones.setEnabled(false);

		this.jButtonid_ejercicioRetencionesPorPagarPorRetenciones= new JButtonMe();
		this.jButtonid_ejercicioRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioRetencionesPorPagarPorRetenciones.setText("Buscar");
		this.jButtonid_ejercicioRetencionesPorPagarPorRetenciones.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioRetencionesPorPagarPorRetenciones.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioRetencionesPorPagarPorRetenciones,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioRetencionesPorPagarPorRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioRetencionesPorPagarPorRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioRetencionesPorPagarPorRetenciones"));

		this.jButtonid_ejercicioRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();
		this.jButtonid_ejercicioRetencionesPorPagarPorRetencionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioRetencionesPorPagarPorRetencionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioRetencionesPorPagarPorRetencionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioRetencionesPorPagarPorRetencionesBusqueda.setText("U");
		this.jButtonid_ejercicioRetencionesPorPagarPorRetencionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioRetencionesPorPagarPorRetencionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioRetencionesPorPagarPorRetencionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioRetencionesPorPagarPorRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioRetencionesPorPagarPorRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioRetencionesPorPagarPorRetencionesBusqueda"));

		if(this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioRetencionesPorPagarPorRetencionesBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioRetencionesPorPagarPorRetencionesUpdate= new JButtonMe();
		this.jButtonid_ejercicioRetencionesPorPagarPorRetencionesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioRetencionesPorPagarPorRetencionesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioRetencionesPorPagarPorRetencionesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioRetencionesPorPagarPorRetencionesUpdate.setText("U");
		this.jButtonid_ejercicioRetencionesPorPagarPorRetencionesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioRetencionesPorPagarPorRetencionesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioRetencionesPorPagarPorRetencionesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioRetencionesPorPagarPorRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioRetencionesPorPagarPorRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioRetencionesPorPagarPorRetencionesUpdate"));



					
		this.jLabelid_periodoRetencionesPorPagarPorRetenciones = new JLabelMe();
		this.jLabelid_periodoRetencionesPorPagarPorRetenciones.setText(""+RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoRetencionesPorPagarPorRetenciones.setToolTipText("Periodo");
		this.jLabelid_periodoRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoRetencionesPorPagarPorRetenciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoRetencionesPorPagarPorRetenciones.setToolTipText(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutRetencionesPorPagarPorRetenciones = new GridBagLayout();
		this.jPanelid_periodoRetencionesPorPagarPorRetenciones.setLayout(this.gridaBagLayoutRetencionesPorPagarPorRetenciones);


		jComboBoxid_periodoRetencionesPorPagarPorRetenciones= new JComboBoxMe();
		jComboBoxid_periodoRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoRetencionesPorPagarPorRetenciones.setEnabled(false);

		this.jButtonid_periodoRetencionesPorPagarPorRetenciones= new JButtonMe();
		this.jButtonid_periodoRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoRetencionesPorPagarPorRetenciones.setText("Buscar");
		this.jButtonid_periodoRetencionesPorPagarPorRetenciones.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoRetencionesPorPagarPorRetenciones.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoRetencionesPorPagarPorRetenciones,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoRetencionesPorPagarPorRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoRetencionesPorPagarPorRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoRetencionesPorPagarPorRetenciones"));

		this.jButtonid_periodoRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();
		this.jButtonid_periodoRetencionesPorPagarPorRetencionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoRetencionesPorPagarPorRetencionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoRetencionesPorPagarPorRetencionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoRetencionesPorPagarPorRetencionesBusqueda.setText("U");
		this.jButtonid_periodoRetencionesPorPagarPorRetencionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoRetencionesPorPagarPorRetencionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoRetencionesPorPagarPorRetencionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoRetencionesPorPagarPorRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoRetencionesPorPagarPorRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoRetencionesPorPagarPorRetencionesBusqueda"));

		if(this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoRetencionesPorPagarPorRetencionesBusqueda.setVisible(false);		}

		this.jButtonid_periodoRetencionesPorPagarPorRetencionesUpdate= new JButtonMe();
		this.jButtonid_periodoRetencionesPorPagarPorRetencionesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoRetencionesPorPagarPorRetencionesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoRetencionesPorPagarPorRetencionesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoRetencionesPorPagarPorRetencionesUpdate.setText("U");
		this.jButtonid_periodoRetencionesPorPagarPorRetencionesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoRetencionesPorPagarPorRetencionesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoRetencionesPorPagarPorRetencionesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoRetencionesPorPagarPorRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoRetencionesPorPagarPorRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoRetencionesPorPagarPorRetencionesUpdate"));



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
		//this.jInternalFrameDetalleRetencionesPorPagarPorRetenciones = new RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Retenciones Por Pagar Por Retenciones DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRetencionesPorPagarPorRetenciones= new GridBagLayout();
		

		
		String sToolTipRetencionesPorPagarPorRetenciones="";
		sToolTipRetencionesPorPagarPorRetenciones=RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRetencionesPorPagarPorRetenciones+="(Contabilidad.RetencionesPorPagarPorRetenciones)";
		}
		
		if(!this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()) {
			sToolTipRetencionesPorPagarPorRetenciones+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoRetencionesPorPagarPorRetenciones = new JButtonMe();
		this.jButtonModificarRetencionesPorPagarPorRetenciones = new JButtonMe();
        this.jButtonActualizarRetencionesPorPagarPorRetenciones = new JButtonMe();
        this.jButtonEliminarRetencionesPorPagarPorRetenciones = new JButtonMe();
        this.jButtonCancelarRetencionesPorPagarPorRetenciones = new JButtonMe();
        this.jButtonGuardarCambiosRetencionesPorPagarPorRetenciones = new JButtonMe();
		this.jButtonGuardarCambiosTablaRetencionesPorPagarPorRetenciones = new JButtonMe();
		this.jButtonCerrarRetencionesPorPagarPorRetenciones = new JButtonMe();
		
		this.jScrollPanelDatosRetencionesPorPagarPorRetenciones = new JScrollPane();   
        this.jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones = new JScrollPane();
		this.jScrollPanelDatosGeneralRetencionesPorPagarPorRetenciones = new JScrollPane();
				
		
		
		this.jPanelCamposRetencionesPorPagarPorRetenciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosRetencionesPorPagarPorRetenciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesRetencionesPorPagarPorRetenciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioRetencionesPorPagarPorRetenciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Retenciones Por Pagar Por Retenciones";
		
		if(!this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRetencionesPorPagarPorRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retenciones Por Pagar Por Retencioneses" + this.sPath));
		} else {
			this.jScrollPanelDatosRetencionesPorPagarPorRetenciones.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralRetencionesPorPagarPorRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposRetencionesPorPagarPorRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposRetencionesPorPagarPorRetenciones.setName("jPanelCamposRetencionesPorPagarPorRetenciones"); 

		this.jPanelCamposOcultosRetencionesPorPagarPorRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosRetencionesPorPagarPorRetenciones.setName("jPanelCamposOcultosRetencionesPorPagarPorRetenciones"); 

        this.jPanelAccionesRetencionesPorPagarPorRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRetencionesPorPagarPorRetenciones.setToolTipText("Acciones");
        this.jPanelAccionesRetencionesPorPagarPorRetenciones.setName("Acciones"); 

		this.jPanelAccionesFormularioRetencionesPorPagarPorRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioRetencionesPorPagarPorRetenciones.setToolTipText("Acciones");
        this.jPanelAccionesFormularioRetencionesPorPagarPorRetenciones.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoRetencionesPorPagarPorRetenciones.setText("Nuevo");
		this.jButtonModificarRetencionesPorPagarPorRetenciones.setText("Editar");
        this.jButtonActualizarRetencionesPorPagarPorRetenciones.setText("Actualizar");
        this.jButtonEliminarRetencionesPorPagarPorRetenciones.setText("Eliminar");
        this.jButtonCancelarRetencionesPorPagarPorRetenciones.setText("Cancelar");
        this.jButtonGuardarCambiosRetencionesPorPagarPorRetenciones.setText("Guardar");
		this.jButtonGuardarCambiosTablaRetencionesPorPagarPorRetenciones.setText("Guardar");
		this.jButtonCerrarRetencionesPorPagarPorRetenciones.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRetencionesPorPagarPorRetenciones,"nuevo_button","Nuevo",this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarRetencionesPorPagarPorRetenciones,"modificar_button","Editar",this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarRetencionesPorPagarPorRetenciones,"actualizar_button","Actualizar",this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarRetencionesPorPagarPorRetenciones,"eliminar_button","Eliminar",this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarRetencionesPorPagarPorRetenciones,"cancelar_button","Cancelar",this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosRetencionesPorPagarPorRetenciones,"guardarcambios_button","Guardar",this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRetencionesPorPagarPorRetenciones,"guardarcambiostabla_button","Guardar",this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRetencionesPorPagarPorRetenciones,"cerrar_button","Salir",this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoRetencionesPorPagarPorRetenciones.setToolTipText("Nuevo"+" "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarRetencionesPorPagarPorRetenciones.setToolTipText("Editar"+" "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarRetencionesPorPagarPorRetenciones.setToolTipText("Actualizar"+" "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarRetencionesPorPagarPorRetenciones.setToolTipText("Eliminar)"+" "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarRetencionesPorPagarPorRetenciones.setToolTipText("Cancelar"+" "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosRetencionesPorPagarPorRetenciones.setToolTipText("Guardar"+" "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaRetencionesPorPagarPorRetenciones.setToolTipText("Guardar"+" "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRetencionesPorPagarPorRetenciones.setToolTipText("Salir"+" "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRetencionesPorPagarPorRetenciones";
		inputMap = this.jButtonNuevoRetencionesPorPagarPorRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRetencionesPorPagarPorRetenciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRetencionesPorPagarPorRetenciones"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarRetencionesPorPagarPorRetenciones";
		inputMap = this.jButtonActualizarRetencionesPorPagarPorRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarRetencionesPorPagarPorRetenciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarRetencionesPorPagarPorRetenciones"));
		
		//ELIMINAR
		sMapKey = "EliminarRetencionesPorPagarPorRetenciones";
		inputMap = this.jButtonEliminarRetencionesPorPagarPorRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarRetencionesPorPagarPorRetenciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarRetencionesPorPagarPorRetenciones"));
		
		//CANCELAR	
		sMapKey = "CancelarRetencionesPorPagarPorRetenciones";
		inputMap = this.jButtonCancelarRetencionesPorPagarPorRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarRetencionesPorPagarPorRetenciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarRetencionesPorPagarPorRetenciones"));
		
		//CERRAR		
		sMapKey = "CerrarRetencionesPorPagarPorRetenciones";
		inputMap = this.jButtonCerrarRetencionesPorPagarPorRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRetencionesPorPagarPorRetenciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRetencionesPorPagarPorRetenciones"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRetencionesPorPagarPorRetenciones";
		inputMap = this.jButtonGuardarCambiosTablaRetencionesPorPagarPorRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRetencionesPorPagarPorRetenciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRetencionesPorPagarPorRetenciones"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoRetencionesPorPagarPorRetenciones = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoRetencionesPorPagarPorRetenciones.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoRetencionesPorPagarPorRetenciones.setToolTipText("Nuevo RetencionesPorPagarPorRetenciones");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarRetencionesPorPagarPorRetenciones = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarRetencionesPorPagarPorRetenciones.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarRetencionesPorPagarPorRetenciones.setToolTipText("Sin Cerrar Ventana RetencionesPorPagarPorRetenciones");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeRetencionesPorPagarPorRetenciones = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeRetencionesPorPagarPorRetenciones.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeRetencionesPorPagarPorRetenciones.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones.setText("Accion");
		this.jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorRetenciones = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorRetenciones.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorRetenciones.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesRetencionesPorPagarPorRetenciones = new JLabelMe();
		
		this.jLabelAccionesRetencionesPorPagarPorRetenciones.setText("Acciones");		
		this.jLabelAccionesRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposRetencionesPorPagarPorRetenciones();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysRetencionesPorPagarPorRetenciones();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesRetencionesPorPagarPorRetenciones=new JTabbedPane();
		this.jTabbedPaneRelacionesRetencionesPorPagarPorRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposRetencionesPorPagarPorRetenciones = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosRetencionesPorPagarPorRetenciones = new GridBagLayout();
		
		this.jPanelCamposRetencionesPorPagarPorRetenciones.setLayout(gridaBagLayoutCamposRetencionesPorPagarPorRetenciones);
		this.jPanelCamposOcultosRetencionesPorPagarPorRetenciones.setLayout(gridaBagLayoutCamposOcultosRetencionesPorPagarPorRetenciones);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidRetencionesPorPagarPorRetenciones.add(jLabelIdRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidRetencionesPorPagarPorRetenciones.add(jLabelidRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);


	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaRetencionesPorPagarPorRetenciones.add(jLabelid_empresaRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRetencionesPorPagarPorRetenciones.add(jButtonid_empresaRetencionesPorPagarPorRetencionesBusqueda, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 3;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRetencionesPorPagarPorRetenciones.add(jButtonid_empresaRetencionesPorPagarPorRetencionesUpdate, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
	}

	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaRetencionesPorPagarPorRetenciones.add(jComboBoxid_empresaRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);


	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalRetencionesPorPagarPorRetenciones.add(jLabelid_sucursalRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalRetencionesPorPagarPorRetenciones.add(jButtonid_sucursalRetencionesPorPagarPorRetencionesBusqueda, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 3;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalRetencionesPorPagarPorRetenciones.add(jButtonid_sucursalRetencionesPorPagarPorRetencionesUpdate, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
	}

	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalRetencionesPorPagarPorRetenciones.add(jComboBoxid_sucursalRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);


	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioRetencionesPorPagarPorRetenciones.add(jLabelid_ejercicioRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioRetencionesPorPagarPorRetenciones.add(jButtonid_ejercicioRetencionesPorPagarPorRetencionesBusqueda, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 3;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioRetencionesPorPagarPorRetenciones.add(jButtonid_ejercicioRetencionesPorPagarPorRetencionesUpdate, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
	}

	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioRetencionesPorPagarPorRetenciones.add(jComboBoxid_ejercicioRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);


	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoRetencionesPorPagarPorRetenciones.add(jLabelid_periodoRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoRetencionesPorPagarPorRetenciones.add(jButtonid_periodoRetencionesPorPagarPorRetencionesBusqueda, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 3;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoRetencionesPorPagarPorRetenciones.add(jButtonid_periodoRetencionesPorPagarPorRetencionesUpdate, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
	}

	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoRetencionesPorPagarPorRetenciones.add(jComboBoxid_periodoRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);


	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_debitoRetencionesPorPagarPorRetenciones.add(jLabeles_debitoRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_debitoRetencionesPorPagarPorRetenciones.add(jButtones_debitoRetencionesPorPagarPorRetencionesBusqueda, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
	}

	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_debitoRetencionesPorPagarPorRetenciones.add(jCheckBoxes_debitoRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);


	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionRetencionesPorPagarPorRetenciones.add(jLabelfecha_emisionRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionRetencionesPorPagarPorRetenciones.add(jButtonfecha_emisionRetencionesPorPagarPorRetencionesBusqueda, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
	}

	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionRetencionesPorPagarPorRetenciones.add(jDateChooserfecha_emisionRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);


	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_tipo_movimientoRetencionesPorPagarPorRetenciones.add(jLabelnombre_tipo_movimientoRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_tipo_movimientoRetencionesPorPagarPorRetenciones.add(jButtonnombre_tipo_movimientoRetencionesPorPagarPorRetencionesBusqueda, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
	}

	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_tipo_movimientoRetencionesPorPagarPorRetenciones.add(jscrollPanenombre_tipo_movimientoRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);


	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_mayorRetencionesPorPagarPorRetenciones.add(jLabelnumero_mayorRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_mayorRetencionesPorPagarPorRetenciones.add(jButtonnumero_mayorRetencionesPorPagarPorRetencionesBusqueda, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
	}

	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_mayorRetencionesPorPagarPorRetenciones.add(jscrollPanenumero_mayorRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);


	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones.add(jLabelnombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones.add(jButtonnombre_cuenta_contable_retencionRetencionesPorPagarPorRetencionesBusqueda, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
	}

	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones.add(jscrollPanenombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);


	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones.add(jLabelnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones.add(jButtonnumero_pre_impreso_facturaRetencionesPorPagarPorRetencionesBusqueda, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
	}

	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones.add(jTextFieldnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);


	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeRetencionesPorPagarPorRetenciones.add(jLabelporcentajeRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeRetencionesPorPagarPorRetenciones.add(jButtonporcentajeRetencionesPorPagarPorRetencionesBusqueda, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
	}

	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeRetencionesPorPagarPorRetenciones.add(jTextFieldporcentajeRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);


	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelbase_imponibleRetencionesPorPagarPorRetenciones.add(jLabelbase_imponibleRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelbase_imponibleRetencionesPorPagarPorRetenciones.add(jButtonbase_imponibleRetencionesPorPagarPorRetencionesBusqueda, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
	}

	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelbase_imponibleRetencionesPorPagarPorRetenciones.add(jTextFieldbase_imponibleRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);


	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorRetencionesPorPagarPorRetenciones.add(jLabelvalorRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorRetencionesPorPagarPorRetenciones.add(jButtonvalorRetencionesPorPagarPorRetencionesBusqueda, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
	}

	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorRetencionesPorPagarPorRetenciones.add(jTextFieldvalorRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);


	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumeroRetencionesPorPagarPorRetenciones.add(jLabelnumeroRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumeroRetencionesPorPagarPorRetenciones.add(jButtonnumeroRetencionesPorPagarPorRetencionesBusqueda, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
	}

	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumeroRetencionesPorPagarPorRetenciones.add(jTextFieldnumeroRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);


	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_benefRetencionesPorPagarPorRetenciones.add(jLabelnombre_benefRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_benefRetencionesPorPagarPorRetenciones.add(jButtonnombre_benefRetencionesPorPagarPorRetencionesBusqueda, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
	}

	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_benefRetencionesPorPagarPorRetenciones.add(jscrollPanenombre_benefRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);


	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelruc_benefRetencionesPorPagarPorRetenciones.add(jLabelruc_benefRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelruc_benefRetencionesPorPagarPorRetenciones.add(jButtonruc_benefRetencionesPorPagarPorRetencionesBusqueda, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
	}

	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelruc_benefRetencionesPorPagarPorRetenciones.add(jTextFieldruc_benefRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);


	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_cuenta_contableRetencionesPorPagarPorRetenciones.add(jLabelnombre_cuenta_contableRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_cuenta_contableRetencionesPorPagarPorRetenciones.add(jButtonnombre_cuenta_contableRetencionesPorPagarPorRetencionesBusqueda, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
	}

	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_cuenta_contableRetencionesPorPagarPorRetenciones.add(jscrollPanenombre_cuenta_contableRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);


	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones.add(jLabelnombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones.add(jButtonnombre_cuenta_contable_creditoRetencionesPorPagarPorRetencionesBusqueda, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
	}

	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones.add(jscrollPanenombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);


	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_debito_datoRetencionesPorPagarPorRetenciones.add(jLabeles_debito_datoRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 2;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_debito_datoRetencionesPorPagarPorRetenciones.add(jButtones_debito_datoRetencionesPorPagarPorRetencionesBusqueda, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
	}

	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 1;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_debito_datoRetencionesPorPagarPorRetenciones.add(jCheckBoxes_debito_datoRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iYPanelCamposRetencionesPorPagarPorRetenciones;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iXPanelCamposRetencionesPorPagarPorRetenciones++;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionesPorPagarPorRetenciones.add(this.jPanelidRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(iXPanelCamposRetencionesPorPagarPorRetenciones % 2==0) {
		iXPanelCamposRetencionesPorPagarPorRetenciones=0;
		iYPanelCamposRetencionesPorPagarPorRetenciones++;
	}
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iYPanelCamposRetencionesPorPagarPorRetenciones;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iXPanelCamposRetencionesPorPagarPorRetenciones++;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionesPorPagarPorRetenciones.add(this.jPaneles_debitoRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(iXPanelCamposRetencionesPorPagarPorRetenciones % 2==0) {
		iXPanelCamposRetencionesPorPagarPorRetenciones=0;
		iYPanelCamposRetencionesPorPagarPorRetenciones++;
	}
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iYPanelCamposRetencionesPorPagarPorRetenciones;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iXPanelCamposRetencionesPorPagarPorRetenciones++;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionesPorPagarPorRetenciones.add(this.jPanelfecha_emisionRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(iXPanelCamposRetencionesPorPagarPorRetenciones % 2==0) {
		iXPanelCamposRetencionesPorPagarPorRetenciones=0;
		iYPanelCamposRetencionesPorPagarPorRetenciones++;
	}
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iYPanelCamposRetencionesPorPagarPorRetenciones;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iXPanelCamposRetencionesPorPagarPorRetenciones++;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionesPorPagarPorRetenciones.add(this.jPanelnombre_tipo_movimientoRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(iXPanelCamposRetencionesPorPagarPorRetenciones % 2==0) {
		iXPanelCamposRetencionesPorPagarPorRetenciones=0;
		iYPanelCamposRetencionesPorPagarPorRetenciones++;
	}
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iYPanelCamposRetencionesPorPagarPorRetenciones;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iXPanelCamposRetencionesPorPagarPorRetenciones++;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionesPorPagarPorRetenciones.add(this.jPanelnumero_mayorRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(iXPanelCamposRetencionesPorPagarPorRetenciones % 2==0) {
		iXPanelCamposRetencionesPorPagarPorRetenciones=0;
		iYPanelCamposRetencionesPorPagarPorRetenciones++;
	}
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iYPanelCamposRetencionesPorPagarPorRetenciones;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iXPanelCamposRetencionesPorPagarPorRetenciones++;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionesPorPagarPorRetenciones.add(this.jPanelnombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(iXPanelCamposRetencionesPorPagarPorRetenciones % 2==0) {
		iXPanelCamposRetencionesPorPagarPorRetenciones=0;
		iYPanelCamposRetencionesPorPagarPorRetenciones++;
	}
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iYPanelCamposRetencionesPorPagarPorRetenciones;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iXPanelCamposRetencionesPorPagarPorRetenciones++;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionesPorPagarPorRetenciones.add(this.jPanelnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(iXPanelCamposRetencionesPorPagarPorRetenciones % 2==0) {
		iXPanelCamposRetencionesPorPagarPorRetenciones=0;
		iYPanelCamposRetencionesPorPagarPorRetenciones++;
	}
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iYPanelCamposRetencionesPorPagarPorRetenciones;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iXPanelCamposRetencionesPorPagarPorRetenciones++;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionesPorPagarPorRetenciones.add(this.jPanelporcentajeRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(iXPanelCamposRetencionesPorPagarPorRetenciones % 2==0) {
		iXPanelCamposRetencionesPorPagarPorRetenciones=0;
		iYPanelCamposRetencionesPorPagarPorRetenciones++;
	}
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iYPanelCamposRetencionesPorPagarPorRetenciones;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iXPanelCamposRetencionesPorPagarPorRetenciones++;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionesPorPagarPorRetenciones.add(this.jPanelbase_imponibleRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(iXPanelCamposRetencionesPorPagarPorRetenciones % 2==0) {
		iXPanelCamposRetencionesPorPagarPorRetenciones=0;
		iYPanelCamposRetencionesPorPagarPorRetenciones++;
	}
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iYPanelCamposRetencionesPorPagarPorRetenciones;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iXPanelCamposRetencionesPorPagarPorRetenciones++;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionesPorPagarPorRetenciones.add(this.jPanelvalorRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(iXPanelCamposRetencionesPorPagarPorRetenciones % 2==0) {
		iXPanelCamposRetencionesPorPagarPorRetenciones=0;
		iYPanelCamposRetencionesPorPagarPorRetenciones++;
	}
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iYPanelCamposRetencionesPorPagarPorRetenciones;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iXPanelCamposRetencionesPorPagarPorRetenciones++;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionesPorPagarPorRetenciones.add(this.jPanelnumeroRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(iXPanelCamposRetencionesPorPagarPorRetenciones % 2==0) {
		iXPanelCamposRetencionesPorPagarPorRetenciones=0;
		iYPanelCamposRetencionesPorPagarPorRetenciones++;
	}
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iYPanelCamposRetencionesPorPagarPorRetenciones;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iXPanelCamposRetencionesPorPagarPorRetenciones++;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionesPorPagarPorRetenciones.add(this.jPanelnombre_benefRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(iXPanelCamposRetencionesPorPagarPorRetenciones % 2==0) {
		iXPanelCamposRetencionesPorPagarPorRetenciones=0;
		iYPanelCamposRetencionesPorPagarPorRetenciones++;
	}
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iYPanelCamposRetencionesPorPagarPorRetenciones;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iXPanelCamposRetencionesPorPagarPorRetenciones++;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionesPorPagarPorRetenciones.add(this.jPanelruc_benefRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(iXPanelCamposRetencionesPorPagarPorRetenciones % 2==0) {
		iXPanelCamposRetencionesPorPagarPorRetenciones=0;
		iYPanelCamposRetencionesPorPagarPorRetenciones++;
	}
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iYPanelCamposRetencionesPorPagarPorRetenciones;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iXPanelCamposRetencionesPorPagarPorRetenciones++;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionesPorPagarPorRetenciones.add(this.jPanelnombre_cuenta_contableRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(iXPanelCamposRetencionesPorPagarPorRetenciones % 2==0) {
		iXPanelCamposRetencionesPorPagarPorRetenciones=0;
		iYPanelCamposRetencionesPorPagarPorRetenciones++;
	}
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iYPanelCamposRetencionesPorPagarPorRetenciones;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iXPanelCamposRetencionesPorPagarPorRetenciones++;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionesPorPagarPorRetenciones.add(this.jPanelnombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(iXPanelCamposRetencionesPorPagarPorRetenciones % 2==0) {
		iXPanelCamposRetencionesPorPagarPorRetenciones=0;
		iYPanelCamposRetencionesPorPagarPorRetenciones++;
	}
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iYPanelCamposRetencionesPorPagarPorRetenciones;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iXPanelCamposRetencionesPorPagarPorRetenciones++;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionesPorPagarPorRetenciones.add(this.jPaneles_debito_datoRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(iXPanelCamposRetencionesPorPagarPorRetenciones % 2==0) {
		iXPanelCamposRetencionesPorPagarPorRetenciones=0;
		iYPanelCamposRetencionesPorPagarPorRetenciones++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iYPanelCamposOcultosRetencionesPorPagarPorRetenciones;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iXPanelCamposOcultosRetencionesPorPagarPorRetenciones++;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRetencionesPorPagarPorRetenciones.add(this.jPanelid_empresaRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(iXPanelCamposOcultosRetencionesPorPagarPorRetenciones % 2==0) {
		iXPanelCamposOcultosRetencionesPorPagarPorRetenciones=0;
		iYPanelCamposOcultosRetencionesPorPagarPorRetenciones++;
	}
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iYPanelCamposOcultosRetencionesPorPagarPorRetenciones;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iXPanelCamposOcultosRetencionesPorPagarPorRetenciones++;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRetencionesPorPagarPorRetenciones.add(this.jPanelid_sucursalRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(iXPanelCamposOcultosRetencionesPorPagarPorRetenciones % 2==0) {
		iXPanelCamposOcultosRetencionesPorPagarPorRetenciones=0;
		iYPanelCamposOcultosRetencionesPorPagarPorRetenciones++;
	}
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iYPanelCamposOcultosRetencionesPorPagarPorRetenciones;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iXPanelCamposOcultosRetencionesPorPagarPorRetenciones++;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRetencionesPorPagarPorRetenciones.add(this.jPanelid_ejercicioRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(iXPanelCamposOcultosRetencionesPorPagarPorRetenciones % 2==0) {
		iXPanelCamposOcultosRetencionesPorPagarPorRetenciones=0;
		iYPanelCamposOcultosRetencionesPorPagarPorRetenciones++;
	}
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iYPanelCamposOcultosRetencionesPorPagarPorRetenciones;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iXPanelCamposOcultosRetencionesPorPagarPorRetenciones++;
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionesPorPagarPorRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRetencionesPorPagarPorRetenciones.add(this.jPanelid_periodoRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);



	if(iXPanelCamposOcultosRetencionesPorPagarPorRetenciones % 2==0) {
		iXPanelCamposOcultosRetencionesPorPagarPorRetenciones=0;
		iYPanelCamposOcultosRetencionesPorPagarPorRetenciones++;
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
			
		GridBagLayout gridaBagLayoutAccionesRetencionesPorPagarPorRetenciones= new GridBagLayout();
		this.jPanelAccionesRetencionesPorPagarPorRetenciones.setLayout(gridaBagLayoutAccionesRetencionesPorPagarPorRetenciones);
		
		GridBagLayout gridaBagLayoutAccionesFormularioRetencionesPorPagarPorRetenciones= new GridBagLayout();
		this.jPanelAccionesFormularioRetencionesPorPagarPorRetenciones.setLayout(gridaBagLayoutAccionesFormularioRetencionesPorPagarPorRetenciones);
		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRetencionesPorPagarPorRetenciones.add(this.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iPosXAccion++;
			
		this.jPanelAccionesRetencionesPorPagarPorRetenciones.add(this.jButtonModificarRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);							

		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx =iPosXAccion++;
			
		this.jPanelAccionesRetencionesPorPagarPorRetenciones.add(this.jButtonEliminarRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
		
			
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iPosXAccion++;
		
		this.jPanelAccionesRetencionesPorPagarPorRetenciones.add(this.jButtonActualizarRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);


		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iPosXAccion++;
		
		this.jPanelAccionesRetencionesPorPagarPorRetenciones.add(this.jButtonGuardarCambiosRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);	
		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx =iPosXAccion++;
		
		this.jPanelAccionesRetencionesPorPagarPorRetenciones.add(this.jButtonCancelarRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRetencionesPorPagarPorRetenciones = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRetencionesPorPagarPorRetenciones);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();						
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;		
			//this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx =0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(RetencionesPorPagarPorRetencionesJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleRetencionesPorPagarPorRetenciones = new RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Retenciones Por Pagar Por Retenciones DATOS");
			
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
			
	        //this.setTitle("[FOR] - Retenciones Por Pagar Por Retenciones DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Retenciones Por Pagar Por Retenciones Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			RetencionesPorPagarPorRetencionesModel retencionesporpagarporretencionesModel=new RetencionesPorPagarPorRetencionesModel(this);
			
			//SI USARA CLASE INTERNA
			//RetencionesPorPagarPorRetencionesModel.RetencionesPorPagarPorRetencionesFocusTraversalPolicy retencionesporpagarporretencionesFocusTraversalPolicy = retencionesporpagarporretencionesModel.new RetencionesPorPagarPorRetencionesFocusTraversalPolicy(this);
			
			//retencionesporpagarporretencionesFocusTraversalPolicy.setretencionesporpagarporretencionesJInternalFrame(this);
			
			this.setFocusTraversalPolicy(retencionesporpagarporretencionesModel);
			
			
			this.jContentPaneDetalleRetencionesPorPagarPorRetenciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleRetencionesPorPagarPorRetenciones = new GridBagLayout();	
			this.jContentPaneDetalleRetencionesPorPagarPorRetenciones.setLayout(gridaBagLayoutDetalleRetencionesPorPagarPorRetenciones);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRetencionesPorPagarPorRetenciones = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
				this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
					
				
				this.jContentPaneDetalleRetencionesPorPagarPorRetenciones.add(jTtoolBarDetalleRetencionesPorPagarPorRetenciones, gridBagConstraintsRetencionesPorPagarPorRetenciones);								
				
}
			
			this.jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones=   new JScrollPane(jContentPaneDetalleRetencionesPorPagarPorRetenciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralRetencionesPorPagarPorRetenciones=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
			
			
	        this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
	        
			this.jContentPaneDetalleRetencionesPorPagarPorRetenciones.add(jPanelCamposRetencionesPorPagarPorRetenciones, gridBagConstraintsRetencionesPorPagarPorRetenciones);
			
			
			
			
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
						//&& retencionesporpagarporretencionesSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.retencionesporpagarporretencionesSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsRetencionesPorPagarPorRetenciones= new GridBagConstraints();
						this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iGridyRelaciones++;
						this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
						this.jContentPaneDetalleRetencionesPorPagarPorRetenciones.add(this.jTabbedPaneRelacionesRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesRetencionesPorPagarPorRetenciones.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosRetencionesPorPagarPorRetenciones.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
					this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
					
				
					this.jContentPaneDetalleRetencionesPorPagarPorRetenciones.add(jPanelCamposOcultosRetencionesPorPagarPorRetenciones, gridBagConstraintsRetencionesPorPagarPorRetenciones);
				
					this.jPanelCamposOcultosRetencionesPorPagarPorRetenciones.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
	        this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleRetencionesPorPagarPorRetenciones.add(this.jPanelAccionesFormularioRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);							
			
			
			
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
	        this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
	        
			
			this.jContentPaneDetalleRetencionesPorPagarPorRetenciones.add(this.jPanelAccionesRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones=   new JScrollPane(this.jPanelCamposRetencionesPorPagarPorRetenciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);			
			
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
			
			
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
		
			
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralRetencionesPorPagarPorRetenciones;//jContentPane;
		
		return jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones;
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
