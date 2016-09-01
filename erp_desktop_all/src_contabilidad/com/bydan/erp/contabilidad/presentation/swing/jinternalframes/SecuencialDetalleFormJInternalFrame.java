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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.SecuencialConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class SecuencialDetalleFormJInternalFrame extends SecuencialBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleSecuencial;
	
	protected JMenuBar jmenuBarDetalleSecuencial;
	
	protected JMenu jmenuDetalleSecuencial;
	protected JMenu jmenuDetalleArchivoSecuencial;
	protected JMenu jmenuDetalleAccionesSecuencial;
	protected JMenu jmenuDetalleDatosSecuencial;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleSecuencial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSecuencial;	
	protected GridBagConstraints gridBagConstraintsSecuencial;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected SecuencialBeanSwingJInternalFrameAdditional jInternalFrameDetalleSecuencial;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TipoMovimientoModuloBeanSwingJInternalFrame tipomovimientomoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimientomodulo="";

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumento="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";
	
	public SecuencialSessionBean secuencialSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TipoMovimientoModuloSessionBean tipomovimientomoduloSessionBean;
	public TipoDocumentoSessionBean tipodocumentoSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;	
	
	public SecuencialLogic secuencialLogic;
	
	public JScrollPane jScrollPanelDatosSecuencial;
	public JScrollPane jScrollPanelDatosEdicionSecuencial;
	public JScrollPane jScrollPanelDatosGeneralSecuencial;
	
	protected JPanel jPanelCamposSecuencial;    
	protected JPanel jPanelCamposOcultosSecuencial;    	
	protected JPanel jPanelAccionesSecuencial;
	protected JPanel jPanelAccionesFormularioSecuencial;
    
	
	
	protected JTabbedPane jTabbedPaneCamposSecuencial;	
	protected Integer iXPanelCamposSecuencial=0;
	protected Integer iYPanelCamposSecuencial=0;
	
	protected Integer iXPanelCamposOcultosSecuencial=0;
	protected Integer iYPanelCamposOcultosSecuencial=0;
	
	

	protected JPanel jPanelCamposIniciogeneralSecuencial;
	protected Integer iXPanelCamposIniciogeneralSecuencial=0;
	protected Integer iYPanelCamposIniciogeneralSecuencial=0;

	protected JPanel jPanelCamposIniciosecuencialSecuencial;
	protected Integer iXPanelCamposIniciosecuencialSecuencial=0;
	protected Integer iYPanelCamposIniciosecuencialSecuencial=0;

	protected JPanel jPanelCamposInicioformatoSecuencial;
	protected Integer iXPanelCamposInicioformatoSecuencial=0;
	protected Integer iYPanelCamposInicioformatoSecuencial=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoSecuencial;
	public JButton jButtonModificarSecuencial;
	public JButton jButtonActualizarSecuencial;
    public JButton jButtonEliminarSecuencial;
	public JButton jButtonCancelarSecuencial;
    public JButton jButtonGuardarCambiosSecuencial;
	public JButton jButtonGuardarCambiosTablaSecuencial;
	protected JButton jButtonCerrarSecuencial;
	
	
	protected JButton jButtonProcesarInformacionSecuencial;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoSecuencial;
	protected JCheckBox jCheckBoxPostAccionSinCerrarSecuencial;
	protected JCheckBox jCheckBoxPostAccionSinMensajeSecuencial;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSecuencial;
	protected JButton jButtonModificarToolBarSecuencial;
	protected JButton jButtonActualizarToolBarSecuencial;
    protected JButton jButtonEliminarToolBarSecuencial;
	protected JButton jButtonCancelarToolBarSecuencial;
    protected JButton jButtonGuardarCambiosToolBarSecuencial;
	protected JButton jButtonGuardarCambiosTablaToolBarSecuencial;
	protected JButton jButtonMostrarOcultarTablaToolBarSecuencial;
	protected JButton jButtonCerrarToolBarSecuencial;
	
	protected JButton jButtonProcesarInformacionToolBarSecuencial;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSecuencial;
	protected JMenuItem jMenuItemModificarSecuencial;
	protected JMenuItem jMenuItemActualizarSecuencial;
    protected JMenuItem jMenuItemEliminarSecuencial;
	protected JMenuItem jMenuItemCancelarSecuencial;
    protected JMenuItem jMenuItemGuardarCambiosSecuencial;
	protected JMenuItem jMenuItemGuardarCambiosTablaSecuencial;
	protected JMenuItem jMenuItemCerrarSecuencial;
	protected JMenuItem jMenuItemDetalleCerrarSecuencial;
	protected JMenuItem jMenuItemDetalleMostarOcultarSecuencial;
	
	protected JMenuItem jMenuItemProcesarInformacionSecuencial;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSecuencial;
	protected JMenuItem jMenuItemMostrarOcultarSecuencial;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSecuencial;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSecuencial;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSecuencial;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioSecuencial;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidSecuencial;
	public JLabel jLabelIdSecuencial;
	public JLabel jLabelidSecuencial;
	public JButton jButtonidSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelnumero_asientoSecuencial;
	public JLabel jLabelnumero_asientoSecuencial;
	public JTextField jTextFieldnumero_asientoSecuencial;
	public JButton jButtonnumero_asientoSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelnumero_ingresoSecuencial;
	public JLabel jLabelnumero_ingresoSecuencial;
	public JTextField jTextFieldnumero_ingresoSecuencial;
	public JButton jButtonnumero_ingresoSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelnumero_egresoSecuencial;
	public JLabel jLabelnumero_egresoSecuencial;
	public JTextField jTextFieldnumero_egresoSecuencial;
	public JButton jButtonnumero_egresoSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelnumero_diarioSecuencial;
	public JLabel jLabelnumero_diarioSecuencial;
	public JTextField jTextFieldnumero_diarioSecuencial;
	public JButton jButtonnumero_diarioSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelnumero_retencion_ivaSecuencial;
	public JLabel jLabelnumero_retencion_ivaSecuencial;
	public JTextField jTextFieldnumero_retencion_ivaSecuencial;
	public JButton jButtonnumero_retencion_ivaSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelnumero_retencion_fuenteSecuencial;
	public JLabel jLabelnumero_retencion_fuenteSecuencial;
	public JTextField jTextFieldnumero_retencion_fuenteSecuencial;
	public JButton jButtonnumero_retencion_fuenteSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelnumero_asiento_formatoSecuencial;
	public JLabel jLabelnumero_asiento_formatoSecuencial;
	public JTextField jTextFieldnumero_asiento_formatoSecuencial;
	public JButton jButtonnumero_asiento_formatoSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelnumero_ingreso_formatoSecuencial;
	public JLabel jLabelnumero_ingreso_formatoSecuencial;
	public JTextField jTextFieldnumero_ingreso_formatoSecuencial;
	public JButton jButtonnumero_ingreso_formatoSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelnumero_egreso_formatoSecuencial;
	public JLabel jLabelnumero_egreso_formatoSecuencial;
	public JTextField jTextFieldnumero_egreso_formatoSecuencial;
	public JButton jButtonnumero_egreso_formatoSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelnumero_diario_formatoSecuencial;
	public JLabel jLabelnumero_diario_formatoSecuencial;
	public JTextField jTextFieldnumero_diario_formatoSecuencial;
	public JButton jButtonnumero_diario_formatoSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelnumero_retencion_fuente_formatoSecuencial;
	public JLabel jLabelnumero_retencion_fuente_formatoSecuencial;
	public JTextField jTextFieldnumero_retencion_fuente_formatoSecuencial;
	public JButton jButtonnumero_retencion_fuente_formatoSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelnumero_retencion_iva_formatoSecuencial;
	public JLabel jLabelnumero_retencion_iva_formatoSecuencial;
	public JTextField jTextFieldnumero_retencion_iva_formatoSecuencial;
	public JButton jButtonnumero_retencion_iva_formatoSecuencialBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaSecuencial;
	public JLabel jLabelid_empresaSecuencial;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaSecuencial;
	public JButton jButtonid_empresaSecuencial= new JButtonMe();
	public JButton jButtonid_empresaSecuencialUpdate= new JButtonMe();
	public JButton jButtonid_empresaSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalSecuencial;
	public JLabel jLabelid_sucursalSecuencial;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalSecuencial;
	public JButton jButtonid_sucursalSecuencial= new JButtonMe();
	public JButton jButtonid_sucursalSecuencialUpdate= new JButtonMe();
	public JButton jButtonid_sucursalSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioSecuencial;
	public JLabel jLabelid_ejercicioSecuencial;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioSecuencial;
	public JButton jButtonid_ejercicioSecuencial= new JButtonMe();
	public JButton jButtonid_ejercicioSecuencialUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoSecuencial;
	public JLabel jLabelid_periodoSecuencial;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoSecuencial;
	public JButton jButtonid_periodoSecuencial= new JButtonMe();
	public JButton jButtonid_periodoSecuencialUpdate= new JButtonMe();
	public JButton jButtonid_periodoSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelid_anioSecuencial;
	public JLabel jLabelid_anioSecuencial;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioSecuencial;
	public JButton jButtonid_anioSecuencial= new JButtonMe();
	public JButton jButtonid_anioSecuencialUpdate= new JButtonMe();
	public JButton jButtonid_anioSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelid_mesSecuencial;
	public JLabel jLabelid_mesSecuencial;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesSecuencial;
	public JButton jButtonid_mesSecuencial= new JButtonMe();
	public JButton jButtonid_mesSecuencialUpdate= new JButtonMe();
	public JButton jButtonid_mesSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloSecuencial;
	public JLabel jLabelid_moduloSecuencial;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloSecuencial;
	public JButton jButtonid_moduloSecuencial= new JButtonMe();
	public JButton jButtonid_moduloSecuencialUpdate= new JButtonMe();
	public JButton jButtonid_moduloSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_movimiento_moduloSecuencial;
	public JLabel jLabelid_tipo_movimiento_moduloSecuencial;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimiento_moduloSecuencial;
	public JButton jButtonid_tipo_movimiento_moduloSecuencial= new JButtonMe();
	public JButton jButtonid_tipo_movimiento_moduloSecuencialUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimiento_moduloSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_documentoSecuencial;
	public JLabel jLabelid_tipo_documentoSecuencial;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documentoSecuencial;
	public JButton jButtonid_tipo_documentoSecuencial= new JButtonMe();
	public JButton jButtonid_tipo_documentoSecuencialUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documentoSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_movimientoSecuencial;
	public JLabel jLabelid_tipo_movimientoSecuencial;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimientoSecuencial;
	public JButton jButtonid_tipo_movimientoSecuencial= new JButtonMe();
	public JButton jButtonid_tipo_movimientoSecuencialUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimientoSecuencialBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesSecuencial;
	
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
	public int iHeightFormulario=770;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public SecuencialDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposSecuencial=new JPanel();
				this.jPanelAccionesFormularioSecuencial=new JPanel();
				this.jmenuBarDetalleSecuencial=new JMenuBar();
				this.jTtoolBarDetalleSecuencial=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SecuencialDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Secuencial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public SecuencialDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Secuencial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SecuencialDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Secuencial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SecuencialDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Secuencial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SecuencialDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Secuencial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarSecuencial() {
		return this.jButtonActualizarToolBarSecuencial;
	}
	
	public JButton getjButtonEliminarToolBarSecuencial() {
		return this.jButtonEliminarToolBarSecuencial;
	}
	
	public JButton getjButtonCancelarToolBarSecuencial() {
		return this.jButtonCancelarToolBarSecuencial;
	}		
	
	public JButton getjButtonProcesarInformacionSecuencial() {
		return this.jButtonProcesarInformacionSecuencial;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSecuencial)	{
		this.jButtonProcesarInformacionSecuencial = jButtonProcesarInformacionSecuencial;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSecuencial() {
		return this.jComboBoxTiposAccionesSecuencial;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSecuencial(
			JComboBox jComboBoxTiposRelacionesSecuencial) {
		this.jComboBoxTiposRelacionesSecuencial = jComboBoxTiposRelacionesSecuencial;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSecuencial(
			JComboBox jComboBoxTiposAccionesSecuencial) {
		this.jComboBoxTiposAccionesSecuencial = jComboBoxTiposAccionesSecuencial;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioSecuencial() {
		return this.jComboBoxTiposAccionesFormularioSecuencial;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioSecuencial(
			JComboBox jComboBoxTiposAccionesFormularioSecuencial) {
		this.jComboBoxTiposAccionesFormularioSecuencial = jComboBoxTiposAccionesFormularioSecuencial;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.secuencialSessionBean=new SecuencialSessionBean();
		
		this.secuencialSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.secuencialSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.secuencialSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SecuencialJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SecuencialJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SecuencialJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Secuencial MANTENIMIENTO"));
		
		
		if(iWidth > 1950) {
			iWidth=1950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.secuencialSessionBean.getEsGuardarRelacionado()) {
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
	
		SecuencialJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleSecuencial= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarSecuencial=new JButtonMe();
				this.jButtonModificarToolBarSecuencial=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarSecuencial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarSecuencial,this.jTtoolBarDetalleSecuencial,
							"actualizar","actualizar","Actualizar"+" "+SecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarSecuencial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarSecuencial,this.jTtoolBarDetalleSecuencial,
							"eliminar","eliminar","Eliminar"+" "+SecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarSecuencial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarSecuencial,this.jTtoolBarDetalleSecuencial,
							"cancelar","cancelar","Cancelar"+" "+SecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarSecuencial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarSecuencial,this.jTtoolBarDetalleSecuencial,
							"guardarcambios","guardarcambios","Guardar"+" "+SecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleSecuencial=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleSecuencial=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoSecuencial=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesSecuencial=new JMenuMe("Acciones");
		this.jmenuDetalleDatosSecuencial=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSecuencial= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSecuencial.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSecuencial,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarSecuencial= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarSecuencial.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarSecuencial,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarSecuencial= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarSecuencial.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarSecuencial,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarSecuencial= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarSecuencial.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarSecuencial,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarSecuencial= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarSecuencial.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarSecuencial,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosSecuencial= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSecuencial.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSecuencial,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSecuencial= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSecuencial.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSecuencial,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarSecuencial= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarSecuencial.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarSecuencial,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSecuencial= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSecuencial.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSecuencial,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSecuencial= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSecuencial.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSecuencial,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoSecuencial.add(this.jMenuItemDetalleCerrarSecuencial);
		
		this.jmenuDetalleAccionesSecuencial.add(this.jMenuItemActualizarSecuencial);
		this.jmenuDetalleAccionesSecuencial.add(this.jMenuItemEliminarSecuencial);
		this.jmenuDetalleAccionesSecuencial.add(this.jMenuItemCancelarSecuencial);		
		
		//this.jmenuDetalleDatosSecuencial.add(this.jMenuItemDetalleAbrirOrderBySecuencial);				
		this.jmenuDetalleDatosSecuencial.add(this.jMenuItemDetalleMostarOcultarSecuencial);				
				
		//this.jmenuDetalleAccionesSecuencial.add(this.jMenuItemGuardarCambiosSecuencial);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleSecuencial.add(this.jmenuDetalleArchivoSecuencial);		
		this.jmenuBarDetalleSecuencial.add(this.jmenuDetalleAccionesSecuencial);		
		this.jmenuBarDetalleSecuencial.add(this.jmenuDetalleDatosSecuencial);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleSecuencial);				
	}
	
	
	public void inicializarElementosCamposSecuencial() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdSecuencial = new JLabelMe();
		jLabelIdSecuencial.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidSecuencial = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidSecuencial.setToolTipText(SecuencialConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutSecuencial= new GridBagLayout();

		this.jPanelidSecuencial.setLayout(this.gridaBagLayoutSecuencial);

		jLabelidSecuencial = new JLabel();
		jLabelidSecuencial.setText("Id");

		jLabelidSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_asientoSecuencial = new JLabelMe();
		this.jLabelnumero_asientoSecuencial.setText(""+SecuencialConstantesFunciones.LABEL_NUMEROASIENTO+" : *");
		this.jLabelnumero_asientoSecuencial.setToolTipText("No Asiento");
		this.jLabelnumero_asientoSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_asientoSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_asientoSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_asientoSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_asientoSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_asientoSecuencial.setToolTipText(SecuencialConstantesFunciones.LABEL_NUMEROASIENTO);
		this.gridaBagLayoutSecuencial = new GridBagLayout();
		this.jPanelnumero_asientoSecuencial.setLayout(this.gridaBagLayoutSecuencial);


		jTextFieldnumero_asientoSecuencial= new JTextFieldMe();
		jTextFieldnumero_asientoSecuencial.setEnabled(false);
		jTextFieldnumero_asientoSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_asientoSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_asientoSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_asientoSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_asientoSecuencial.setText("0");

		this.jButtonnumero_asientoSecuencialBusqueda= new JButtonMe();
		this.jButtonnumero_asientoSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_asientoSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_asientoSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_asientoSecuencialBusqueda.setText("U");
		this.jButtonnumero_asientoSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_asientoSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_asientoSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_asientoSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_asientoSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_asientoSecuencialBusqueda"));

		if(this.secuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_asientoSecuencialBusqueda.setVisible(false);		}


					
		this.jLabelnumero_ingresoSecuencial = new JLabelMe();
		this.jLabelnumero_ingresoSecuencial.setText(""+SecuencialConstantesFunciones.LABEL_NUMEROINGRESO+" : *");
		this.jLabelnumero_ingresoSecuencial.setToolTipText("No Ingreso");
		this.jLabelnumero_ingresoSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_ingresoSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_ingresoSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_ingresoSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_ingresoSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_ingresoSecuencial.setToolTipText(SecuencialConstantesFunciones.LABEL_NUMEROINGRESO);
		this.gridaBagLayoutSecuencial = new GridBagLayout();
		this.jPanelnumero_ingresoSecuencial.setLayout(this.gridaBagLayoutSecuencial);


		jTextFieldnumero_ingresoSecuencial= new JTextFieldMe();
		jTextFieldnumero_ingresoSecuencial.setEnabled(false);
		jTextFieldnumero_ingresoSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_ingresoSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_ingresoSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_ingresoSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_ingresoSecuencial.setText("0");

		this.jButtonnumero_ingresoSecuencialBusqueda= new JButtonMe();
		this.jButtonnumero_ingresoSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_ingresoSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_ingresoSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_ingresoSecuencialBusqueda.setText("U");
		this.jButtonnumero_ingresoSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_ingresoSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_ingresoSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_ingresoSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_ingresoSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_ingresoSecuencialBusqueda"));

		if(this.secuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_ingresoSecuencialBusqueda.setVisible(false);		}


					
		this.jLabelnumero_egresoSecuencial = new JLabelMe();
		this.jLabelnumero_egresoSecuencial.setText(""+SecuencialConstantesFunciones.LABEL_NUMEROEGRESO+" : *");
		this.jLabelnumero_egresoSecuencial.setToolTipText("No Egreso");
		this.jLabelnumero_egresoSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_egresoSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_egresoSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_egresoSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_egresoSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_egresoSecuencial.setToolTipText(SecuencialConstantesFunciones.LABEL_NUMEROEGRESO);
		this.gridaBagLayoutSecuencial = new GridBagLayout();
		this.jPanelnumero_egresoSecuencial.setLayout(this.gridaBagLayoutSecuencial);


		jTextFieldnumero_egresoSecuencial= new JTextFieldMe();
		jTextFieldnumero_egresoSecuencial.setEnabled(false);
		jTextFieldnumero_egresoSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_egresoSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_egresoSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_egresoSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_egresoSecuencial.setText("0");

		this.jButtonnumero_egresoSecuencialBusqueda= new JButtonMe();
		this.jButtonnumero_egresoSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_egresoSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_egresoSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_egresoSecuencialBusqueda.setText("U");
		this.jButtonnumero_egresoSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_egresoSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_egresoSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_egresoSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_egresoSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_egresoSecuencialBusqueda"));

		if(this.secuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_egresoSecuencialBusqueda.setVisible(false);		}


					
		this.jLabelnumero_diarioSecuencial = new JLabelMe();
		this.jLabelnumero_diarioSecuencial.setText(""+SecuencialConstantesFunciones.LABEL_NUMERODIARIO+" : *");
		this.jLabelnumero_diarioSecuencial.setToolTipText("No Diario");
		this.jLabelnumero_diarioSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_diarioSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_diarioSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_diarioSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_diarioSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_diarioSecuencial.setToolTipText(SecuencialConstantesFunciones.LABEL_NUMERODIARIO);
		this.gridaBagLayoutSecuencial = new GridBagLayout();
		this.jPanelnumero_diarioSecuencial.setLayout(this.gridaBagLayoutSecuencial);


		jTextFieldnumero_diarioSecuencial= new JTextFieldMe();
		jTextFieldnumero_diarioSecuencial.setEnabled(false);
		jTextFieldnumero_diarioSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_diarioSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_diarioSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_diarioSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_diarioSecuencial.setText("0");

		this.jButtonnumero_diarioSecuencialBusqueda= new JButtonMe();
		this.jButtonnumero_diarioSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_diarioSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_diarioSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_diarioSecuencialBusqueda.setText("U");
		this.jButtonnumero_diarioSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_diarioSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_diarioSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_diarioSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_diarioSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_diarioSecuencialBusqueda"));

		if(this.secuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_diarioSecuencialBusqueda.setVisible(false);		}


					
		this.jLabelnumero_retencion_ivaSecuencial = new JLabelMe();
		this.jLabelnumero_retencion_ivaSecuencial.setText(""+SecuencialConstantesFunciones.LABEL_NUMERORETENCIONIVA+" : *");
		this.jLabelnumero_retencion_ivaSecuencial.setToolTipText("No Ret Iva");
		this.jLabelnumero_retencion_ivaSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_retencion_ivaSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_retencion_ivaSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_retencion_ivaSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_retencion_ivaSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_retencion_ivaSecuencial.setToolTipText(SecuencialConstantesFunciones.LABEL_NUMERORETENCIONIVA);
		this.gridaBagLayoutSecuencial = new GridBagLayout();
		this.jPanelnumero_retencion_ivaSecuencial.setLayout(this.gridaBagLayoutSecuencial);


		jTextFieldnumero_retencion_ivaSecuencial= new JTextFieldMe();
		jTextFieldnumero_retencion_ivaSecuencial.setEnabled(false);
		jTextFieldnumero_retencion_ivaSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_retencion_ivaSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_retencion_ivaSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_retencion_ivaSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_retencion_ivaSecuencial.setText("0");

		this.jButtonnumero_retencion_ivaSecuencialBusqueda= new JButtonMe();
		this.jButtonnumero_retencion_ivaSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_retencion_ivaSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_retencion_ivaSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_retencion_ivaSecuencialBusqueda.setText("U");
		this.jButtonnumero_retencion_ivaSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_retencion_ivaSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_retencion_ivaSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_retencion_ivaSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_retencion_ivaSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_retencion_ivaSecuencialBusqueda"));

		if(this.secuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_retencion_ivaSecuencialBusqueda.setVisible(false);		}


					
		this.jLabelnumero_retencion_fuenteSecuencial = new JLabelMe();
		this.jLabelnumero_retencion_fuenteSecuencial.setText(""+SecuencialConstantesFunciones.LABEL_NUMERORETENCIONFUENTE+" : *");
		this.jLabelnumero_retencion_fuenteSecuencial.setToolTipText("No Ret Fuente");
		this.jLabelnumero_retencion_fuenteSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_retencion_fuenteSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_retencion_fuenteSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_retencion_fuenteSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_retencion_fuenteSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_retencion_fuenteSecuencial.setToolTipText(SecuencialConstantesFunciones.LABEL_NUMERORETENCIONFUENTE);
		this.gridaBagLayoutSecuencial = new GridBagLayout();
		this.jPanelnumero_retencion_fuenteSecuencial.setLayout(this.gridaBagLayoutSecuencial);


		jTextFieldnumero_retencion_fuenteSecuencial= new JTextFieldMe();
		jTextFieldnumero_retencion_fuenteSecuencial.setEnabled(false);
		jTextFieldnumero_retencion_fuenteSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_retencion_fuenteSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_retencion_fuenteSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_retencion_fuenteSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_retencion_fuenteSecuencial.setText("0");

		this.jButtonnumero_retencion_fuenteSecuencialBusqueda= new JButtonMe();
		this.jButtonnumero_retencion_fuenteSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_retencion_fuenteSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_retencion_fuenteSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_retencion_fuenteSecuencialBusqueda.setText("U");
		this.jButtonnumero_retencion_fuenteSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_retencion_fuenteSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_retencion_fuenteSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_retencion_fuenteSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_retencion_fuenteSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_retencion_fuenteSecuencialBusqueda"));

		if(this.secuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_retencion_fuenteSecuencialBusqueda.setVisible(false);		}


					
		this.jLabelnumero_asiento_formatoSecuencial = new JLabelMe();
		this.jLabelnumero_asiento_formatoSecuencial.setText(""+SecuencialConstantesFunciones.LABEL_NUMEROASIENTOFORMATO+" : *");
		this.jLabelnumero_asiento_formatoSecuencial.setToolTipText("No Asiento.");
		this.jLabelnumero_asiento_formatoSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_asiento_formatoSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_asiento_formatoSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_asiento_formatoSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_asiento_formatoSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_asiento_formatoSecuencial.setToolTipText(SecuencialConstantesFunciones.LABEL_NUMEROASIENTOFORMATO);
		this.gridaBagLayoutSecuencial = new GridBagLayout();
		this.jPanelnumero_asiento_formatoSecuencial.setLayout(this.gridaBagLayoutSecuencial);


		jTextFieldnumero_asiento_formatoSecuencial= new JTextFieldMe();

		jTextFieldnumero_asiento_formatoSecuencial.setEnabled(false);
		jTextFieldnumero_asiento_formatoSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_asiento_formatoSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_asiento_formatoSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_asiento_formatoSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_asiento_formatoSecuencialBusqueda= new JButtonMe();
		this.jButtonnumero_asiento_formatoSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_asiento_formatoSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_asiento_formatoSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_asiento_formatoSecuencialBusqueda.setText("U");
		this.jButtonnumero_asiento_formatoSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_asiento_formatoSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_asiento_formatoSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_asiento_formatoSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_asiento_formatoSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_asiento_formatoSecuencialBusqueda"));

		if(this.secuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_asiento_formatoSecuencialBusqueda.setVisible(false);		}


					
		this.jLabelnumero_ingreso_formatoSecuencial = new JLabelMe();
		this.jLabelnumero_ingreso_formatoSecuencial.setText(""+SecuencialConstantesFunciones.LABEL_NUMEROINGRESOFORMATO+" : *");
		this.jLabelnumero_ingreso_formatoSecuencial.setToolTipText("No Ingreso.");
		this.jLabelnumero_ingreso_formatoSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_ingreso_formatoSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_ingreso_formatoSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_ingreso_formatoSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_ingreso_formatoSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_ingreso_formatoSecuencial.setToolTipText(SecuencialConstantesFunciones.LABEL_NUMEROINGRESOFORMATO);
		this.gridaBagLayoutSecuencial = new GridBagLayout();
		this.jPanelnumero_ingreso_formatoSecuencial.setLayout(this.gridaBagLayoutSecuencial);


		jTextFieldnumero_ingreso_formatoSecuencial= new JTextFieldMe();

		jTextFieldnumero_ingreso_formatoSecuencial.setEnabled(false);
		jTextFieldnumero_ingreso_formatoSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_ingreso_formatoSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_ingreso_formatoSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_ingreso_formatoSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_ingreso_formatoSecuencialBusqueda= new JButtonMe();
		this.jButtonnumero_ingreso_formatoSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_ingreso_formatoSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_ingreso_formatoSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_ingreso_formatoSecuencialBusqueda.setText("U");
		this.jButtonnumero_ingreso_formatoSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_ingreso_formatoSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_ingreso_formatoSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_ingreso_formatoSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_ingreso_formatoSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_ingreso_formatoSecuencialBusqueda"));

		if(this.secuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_ingreso_formatoSecuencialBusqueda.setVisible(false);		}


					
		this.jLabelnumero_egreso_formatoSecuencial = new JLabelMe();
		this.jLabelnumero_egreso_formatoSecuencial.setText(""+SecuencialConstantesFunciones.LABEL_NUMEROEGRESOFORMATO+" : *");
		this.jLabelnumero_egreso_formatoSecuencial.setToolTipText("No Egreso.");
		this.jLabelnumero_egreso_formatoSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_egreso_formatoSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_egreso_formatoSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_egreso_formatoSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_egreso_formatoSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_egreso_formatoSecuencial.setToolTipText(SecuencialConstantesFunciones.LABEL_NUMEROEGRESOFORMATO);
		this.gridaBagLayoutSecuencial = new GridBagLayout();
		this.jPanelnumero_egreso_formatoSecuencial.setLayout(this.gridaBagLayoutSecuencial);


		jTextFieldnumero_egreso_formatoSecuencial= new JTextFieldMe();

		jTextFieldnumero_egreso_formatoSecuencial.setEnabled(false);
		jTextFieldnumero_egreso_formatoSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_egreso_formatoSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_egreso_formatoSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_egreso_formatoSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_egreso_formatoSecuencialBusqueda= new JButtonMe();
		this.jButtonnumero_egreso_formatoSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_egreso_formatoSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_egreso_formatoSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_egreso_formatoSecuencialBusqueda.setText("U");
		this.jButtonnumero_egreso_formatoSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_egreso_formatoSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_egreso_formatoSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_egreso_formatoSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_egreso_formatoSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_egreso_formatoSecuencialBusqueda"));

		if(this.secuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_egreso_formatoSecuencialBusqueda.setVisible(false);		}


					
		this.jLabelnumero_diario_formatoSecuencial = new JLabelMe();
		this.jLabelnumero_diario_formatoSecuencial.setText(""+SecuencialConstantesFunciones.LABEL_NUMERODIARIOFORMATO+" : *");
		this.jLabelnumero_diario_formatoSecuencial.setToolTipText("No Diario.");
		this.jLabelnumero_diario_formatoSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_diario_formatoSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_diario_formatoSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_diario_formatoSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_diario_formatoSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_diario_formatoSecuencial.setToolTipText(SecuencialConstantesFunciones.LABEL_NUMERODIARIOFORMATO);
		this.gridaBagLayoutSecuencial = new GridBagLayout();
		this.jPanelnumero_diario_formatoSecuencial.setLayout(this.gridaBagLayoutSecuencial);


		jTextFieldnumero_diario_formatoSecuencial= new JTextFieldMe();

		jTextFieldnumero_diario_formatoSecuencial.setEnabled(false);
		jTextFieldnumero_diario_formatoSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_diario_formatoSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_diario_formatoSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_diario_formatoSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_diario_formatoSecuencialBusqueda= new JButtonMe();
		this.jButtonnumero_diario_formatoSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_diario_formatoSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_diario_formatoSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_diario_formatoSecuencialBusqueda.setText("U");
		this.jButtonnumero_diario_formatoSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_diario_formatoSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_diario_formatoSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_diario_formatoSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_diario_formatoSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_diario_formatoSecuencialBusqueda"));

		if(this.secuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_diario_formatoSecuencialBusqueda.setVisible(false);		}


					
		this.jLabelnumero_retencion_fuente_formatoSecuencial = new JLabelMe();
		this.jLabelnumero_retencion_fuente_formatoSecuencial.setText(""+SecuencialConstantesFunciones.LABEL_NUMERORETENCIONFUENTEFORMATO+" : *");
		this.jLabelnumero_retencion_fuente_formatoSecuencial.setToolTipText("No Ret Fuente.");
		this.jLabelnumero_retencion_fuente_formatoSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_retencion_fuente_formatoSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_retencion_fuente_formatoSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_retencion_fuente_formatoSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_retencion_fuente_formatoSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_retencion_fuente_formatoSecuencial.setToolTipText(SecuencialConstantesFunciones.LABEL_NUMERORETENCIONFUENTEFORMATO);
		this.gridaBagLayoutSecuencial = new GridBagLayout();
		this.jPanelnumero_retencion_fuente_formatoSecuencial.setLayout(this.gridaBagLayoutSecuencial);


		jTextFieldnumero_retencion_fuente_formatoSecuencial= new JTextFieldMe();

		jTextFieldnumero_retencion_fuente_formatoSecuencial.setEnabled(false);
		jTextFieldnumero_retencion_fuente_formatoSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_retencion_fuente_formatoSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_retencion_fuente_formatoSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_retencion_fuente_formatoSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_retencion_fuente_formatoSecuencialBusqueda= new JButtonMe();
		this.jButtonnumero_retencion_fuente_formatoSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_retencion_fuente_formatoSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_retencion_fuente_formatoSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_retencion_fuente_formatoSecuencialBusqueda.setText("U");
		this.jButtonnumero_retencion_fuente_formatoSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_retencion_fuente_formatoSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_retencion_fuente_formatoSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_retencion_fuente_formatoSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_retencion_fuente_formatoSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_retencion_fuente_formatoSecuencialBusqueda"));

		if(this.secuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_retencion_fuente_formatoSecuencialBusqueda.setVisible(false);		}


					
		this.jLabelnumero_retencion_iva_formatoSecuencial = new JLabelMe();
		this.jLabelnumero_retencion_iva_formatoSecuencial.setText(""+SecuencialConstantesFunciones.LABEL_NUMERORETENCIONIVAFORMATO+" : *");
		this.jLabelnumero_retencion_iva_formatoSecuencial.setToolTipText("No Ret Iva.");
		this.jLabelnumero_retencion_iva_formatoSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_retencion_iva_formatoSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_retencion_iva_formatoSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_retencion_iva_formatoSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_retencion_iva_formatoSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_retencion_iva_formatoSecuencial.setToolTipText(SecuencialConstantesFunciones.LABEL_NUMERORETENCIONIVAFORMATO);
		this.gridaBagLayoutSecuencial = new GridBagLayout();
		this.jPanelnumero_retencion_iva_formatoSecuencial.setLayout(this.gridaBagLayoutSecuencial);


		jTextFieldnumero_retencion_iva_formatoSecuencial= new JTextFieldMe();

		jTextFieldnumero_retencion_iva_formatoSecuencial.setEnabled(false);
		jTextFieldnumero_retencion_iva_formatoSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_retencion_iva_formatoSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_retencion_iva_formatoSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_retencion_iva_formatoSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_retencion_iva_formatoSecuencialBusqueda= new JButtonMe();
		this.jButtonnumero_retencion_iva_formatoSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_retencion_iva_formatoSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_retencion_iva_formatoSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_retencion_iva_formatoSecuencialBusqueda.setText("U");
		this.jButtonnumero_retencion_iva_formatoSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_retencion_iva_formatoSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_retencion_iva_formatoSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_retencion_iva_formatoSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_retencion_iva_formatoSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_retencion_iva_formatoSecuencialBusqueda"));

		if(this.secuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_retencion_iva_formatoSecuencialBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysSecuencial() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaSecuencial = new JLabelMe();
		this.jLabelid_empresaSecuencial.setText(""+SecuencialConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaSecuencial.setToolTipText("Empresa");
		this.jLabelid_empresaSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaSecuencial.setToolTipText(SecuencialConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutSecuencial = new GridBagLayout();
		this.jPanelid_empresaSecuencial.setLayout(this.gridaBagLayoutSecuencial);


		jComboBoxid_empresaSecuencial= new JComboBoxMe();
		jComboBoxid_empresaSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaSecuencial.setEnabled(false);

		this.jButtonid_empresaSecuencial= new JButtonMe();
		this.jButtonid_empresaSecuencial.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSecuencial.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSecuencial.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSecuencial.setText("Buscar");
		this.jButtonid_empresaSecuencial.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaSecuencial.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSecuencial,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSecuencial"));

		this.jButtonid_empresaSecuencialBusqueda= new JButtonMe();
		this.jButtonid_empresaSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSecuencialBusqueda.setText("U");
		this.jButtonid_empresaSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSecuencialBusqueda"));

		if(this.secuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaSecuencialBusqueda.setVisible(false);		}

		this.jButtonid_empresaSecuencialUpdate= new JButtonMe();
		this.jButtonid_empresaSecuencialUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSecuencialUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSecuencialUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSecuencialUpdate.setText("U");
		this.jButtonid_empresaSecuencialUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaSecuencialUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSecuencialUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSecuencialUpdate"));



					
		this.jLabelid_sucursalSecuencial = new JLabelMe();
		this.jLabelid_sucursalSecuencial.setText(""+SecuencialConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalSecuencial.setToolTipText("Sucursal");
		this.jLabelid_sucursalSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalSecuencial.setToolTipText(SecuencialConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutSecuencial = new GridBagLayout();
		this.jPanelid_sucursalSecuencial.setLayout(this.gridaBagLayoutSecuencial);


		jComboBoxid_sucursalSecuencial= new JComboBoxMe();
		jComboBoxid_sucursalSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalSecuencial.setEnabled(false);

		this.jButtonid_sucursalSecuencial= new JButtonMe();
		this.jButtonid_sucursalSecuencial.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalSecuencial.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalSecuencial.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalSecuencial.setText("Buscar");
		this.jButtonid_sucursalSecuencial.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalSecuencial.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalSecuencial,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalSecuencial"));

		this.jButtonid_sucursalSecuencialBusqueda= new JButtonMe();
		this.jButtonid_sucursalSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalSecuencialBusqueda.setText("U");
		this.jButtonid_sucursalSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalSecuencialBusqueda"));

		if(this.secuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalSecuencialBusqueda.setVisible(false);		}

		this.jButtonid_sucursalSecuencialUpdate= new JButtonMe();
		this.jButtonid_sucursalSecuencialUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSecuencialUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSecuencialUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalSecuencialUpdate.setText("U");
		this.jButtonid_sucursalSecuencialUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalSecuencialUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalSecuencialUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalSecuencialUpdate"));



					
		this.jLabelid_ejercicioSecuencial = new JLabelMe();
		this.jLabelid_ejercicioSecuencial.setText(""+SecuencialConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioSecuencial.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioSecuencial.setToolTipText(SecuencialConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutSecuencial = new GridBagLayout();
		this.jPanelid_ejercicioSecuencial.setLayout(this.gridaBagLayoutSecuencial);


		jComboBoxid_ejercicioSecuencial= new JComboBoxMe();
		jComboBoxid_ejercicioSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ejercicioSecuencial= new JButtonMe();
		this.jButtonid_ejercicioSecuencial.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioSecuencial.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioSecuencial.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioSecuencial.setText("Buscar");
		this.jButtonid_ejercicioSecuencial.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioSecuencial.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioSecuencial,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioSecuencial"));

		this.jButtonid_ejercicioSecuencialBusqueda= new JButtonMe();
		this.jButtonid_ejercicioSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioSecuencialBusqueda.setText("U");
		this.jButtonid_ejercicioSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioSecuencialBusqueda"));

		if(this.secuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioSecuencialBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioSecuencialUpdate= new JButtonMe();
		this.jButtonid_ejercicioSecuencialUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioSecuencialUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioSecuencialUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioSecuencialUpdate.setText("U");
		this.jButtonid_ejercicioSecuencialUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioSecuencialUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioSecuencialUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioSecuencialUpdate"));



					
		this.jLabelid_periodoSecuencial = new JLabelMe();
		this.jLabelid_periodoSecuencial.setText(""+SecuencialConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoSecuencial.setToolTipText("Periodo");
		this.jLabelid_periodoSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoSecuencial.setToolTipText(SecuencialConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutSecuencial = new GridBagLayout();
		this.jPanelid_periodoSecuencial.setLayout(this.gridaBagLayoutSecuencial);


		jComboBoxid_periodoSecuencial= new JComboBoxMe();
		jComboBoxid_periodoSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_periodoSecuencial= new JButtonMe();
		this.jButtonid_periodoSecuencial.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoSecuencial.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoSecuencial.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoSecuencial.setText("Buscar");
		this.jButtonid_periodoSecuencial.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoSecuencial.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoSecuencial,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoSecuencial"));

		this.jButtonid_periodoSecuencialBusqueda= new JButtonMe();
		this.jButtonid_periodoSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoSecuencialBusqueda.setText("U");
		this.jButtonid_periodoSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoSecuencialBusqueda"));

		if(this.secuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoSecuencialBusqueda.setVisible(false);		}

		this.jButtonid_periodoSecuencialUpdate= new JButtonMe();
		this.jButtonid_periodoSecuencialUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoSecuencialUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoSecuencialUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoSecuencialUpdate.setText("U");
		this.jButtonid_periodoSecuencialUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoSecuencialUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoSecuencialUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoSecuencialUpdate"));



					
		this.jLabelid_anioSecuencial = new JLabelMe();
		this.jLabelid_anioSecuencial.setText(""+SecuencialConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioSecuencial.setToolTipText("Anio");
		this.jLabelid_anioSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioSecuencial.setToolTipText(SecuencialConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutSecuencial = new GridBagLayout();
		this.jPanelid_anioSecuencial.setLayout(this.gridaBagLayoutSecuencial);


		jComboBoxid_anioSecuencial= new JComboBoxMe();
		jComboBoxid_anioSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioSecuencial.setEnabled(false);

		this.jButtonid_anioSecuencial= new JButtonMe();
		this.jButtonid_anioSecuencial.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioSecuencial.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioSecuencial.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioSecuencial.setText("Buscar");
		this.jButtonid_anioSecuencial.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioSecuencial.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioSecuencial,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioSecuencial"));

		this.jButtonid_anioSecuencialBusqueda= new JButtonMe();
		this.jButtonid_anioSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioSecuencialBusqueda.setText("U");
		this.jButtonid_anioSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioSecuencialBusqueda"));

		if(this.secuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioSecuencialBusqueda.setVisible(false);		}

		this.jButtonid_anioSecuencialUpdate= new JButtonMe();
		this.jButtonid_anioSecuencialUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioSecuencialUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioSecuencialUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioSecuencialUpdate.setText("U");
		this.jButtonid_anioSecuencialUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioSecuencialUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioSecuencialUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioSecuencialUpdate"));



					
		this.jLabelid_mesSecuencial = new JLabelMe();
		this.jLabelid_mesSecuencial.setText(""+SecuencialConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesSecuencial.setToolTipText("Mes");
		this.jLabelid_mesSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesSecuencial.setToolTipText(SecuencialConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutSecuencial = new GridBagLayout();
		this.jPanelid_mesSecuencial.setLayout(this.gridaBagLayoutSecuencial);


		jComboBoxid_mesSecuencial= new JComboBoxMe();
		jComboBoxid_mesSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesSecuencial.setEnabled(false);

		this.jButtonid_mesSecuencial= new JButtonMe();
		this.jButtonid_mesSecuencial.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesSecuencial.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesSecuencial.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesSecuencial.setText("Buscar");
		this.jButtonid_mesSecuencial.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesSecuencial.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesSecuencial,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesSecuencial"));

		this.jButtonid_mesSecuencialBusqueda= new JButtonMe();
		this.jButtonid_mesSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesSecuencialBusqueda.setText("U");
		this.jButtonid_mesSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesSecuencialBusqueda"));

		if(this.secuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesSecuencialBusqueda.setVisible(false);		}

		this.jButtonid_mesSecuencialUpdate= new JButtonMe();
		this.jButtonid_mesSecuencialUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesSecuencialUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesSecuencialUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesSecuencialUpdate.setText("U");
		this.jButtonid_mesSecuencialUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesSecuencialUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesSecuencialUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesSecuencialUpdate"));



					
		this.jLabelid_moduloSecuencial = new JLabelMe();
		this.jLabelid_moduloSecuencial.setText(""+SecuencialConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloSecuencial.setToolTipText("Modulo");
		this.jLabelid_moduloSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloSecuencial.setToolTipText(SecuencialConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutSecuencial = new GridBagLayout();
		this.jPanelid_moduloSecuencial.setLayout(this.gridaBagLayoutSecuencial);


		jComboBoxid_moduloSecuencial= new JComboBoxMe();
		jComboBoxid_moduloSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_moduloSecuencial= new JButtonMe();
		this.jButtonid_moduloSecuencial.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloSecuencial.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloSecuencial.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloSecuencial.setText("Buscar");
		this.jButtonid_moduloSecuencial.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloSecuencial.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloSecuencial,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloSecuencial"));

		this.jButtonid_moduloSecuencialBusqueda= new JButtonMe();
		this.jButtonid_moduloSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloSecuencialBusqueda.setText("U");
		this.jButtonid_moduloSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloSecuencialBusqueda"));

		if(this.secuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloSecuencialBusqueda.setVisible(false);		}

		this.jButtonid_moduloSecuencialUpdate= new JButtonMe();
		this.jButtonid_moduloSecuencialUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloSecuencialUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloSecuencialUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloSecuencialUpdate.setText("U");
		this.jButtonid_moduloSecuencialUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloSecuencialUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloSecuencialUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloSecuencialUpdate"));



					
		this.jLabelid_tipo_movimiento_moduloSecuencial = new JLabelMe();
		this.jLabelid_tipo_movimiento_moduloSecuencial.setText(""+SecuencialConstantesFunciones.LABEL_IDTIPOMOVIMIENTOMODULO+" : *");
		this.jLabelid_tipo_movimiento_moduloSecuencial.setToolTipText("Tipo Movimiento Modulo");
		this.jLabelid_tipo_movimiento_moduloSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_movimiento_moduloSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_movimiento_moduloSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimiento_moduloSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_movimiento_moduloSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_movimiento_moduloSecuencial.setToolTipText(SecuencialConstantesFunciones.LABEL_IDTIPOMOVIMIENTOMODULO);
		this.gridaBagLayoutSecuencial = new GridBagLayout();
		this.jPanelid_tipo_movimiento_moduloSecuencial.setLayout(this.gridaBagLayoutSecuencial);


		jComboBoxid_tipo_movimiento_moduloSecuencial= new JComboBoxMe();
		jComboBoxid_tipo_movimiento_moduloSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimiento_moduloSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimiento_moduloSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimiento_moduloSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_movimiento_moduloSecuencial.setEnabled(false);

		this.jButtonid_tipo_movimiento_moduloSecuencial= new JButtonMe();
		this.jButtonid_tipo_movimiento_moduloSecuencial.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimiento_moduloSecuencial.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimiento_moduloSecuencial.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimiento_moduloSecuencial.setText("Buscar");
		this.jButtonid_tipo_movimiento_moduloSecuencial.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_movimiento_moduloSecuencial.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimiento_moduloSecuencial,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_movimiento_moduloSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimiento_moduloSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimiento_moduloSecuencial"));

		this.jButtonid_tipo_movimiento_moduloSecuencialBusqueda= new JButtonMe();
		this.jButtonid_tipo_movimiento_moduloSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimiento_moduloSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimiento_moduloSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimiento_moduloSecuencialBusqueda.setText("U");
		this.jButtonid_tipo_movimiento_moduloSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_movimiento_moduloSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimiento_moduloSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_movimiento_moduloSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimiento_moduloSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimiento_moduloSecuencialBusqueda"));

		if(this.secuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_movimiento_moduloSecuencialBusqueda.setVisible(false);		}

		this.jButtonid_tipo_movimiento_moduloSecuencialUpdate= new JButtonMe();
		this.jButtonid_tipo_movimiento_moduloSecuencialUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimiento_moduloSecuencialUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimiento_moduloSecuencialUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimiento_moduloSecuencialUpdate.setText("U");
		this.jButtonid_tipo_movimiento_moduloSecuencialUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_movimiento_moduloSecuencialUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimiento_moduloSecuencialUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_movimiento_moduloSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimiento_moduloSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimiento_moduloSecuencialUpdate"));



					
		this.jLabelid_tipo_documentoSecuencial = new JLabelMe();
		this.jLabelid_tipo_documentoSecuencial.setText(""+SecuencialConstantesFunciones.LABEL_IDTIPODOCUMENTO+" : *");
		this.jLabelid_tipo_documentoSecuencial.setToolTipText("Tipo Documento");
		this.jLabelid_tipo_documentoSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_documentoSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_documentoSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documentoSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_documentoSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_documentoSecuencial.setToolTipText(SecuencialConstantesFunciones.LABEL_IDTIPODOCUMENTO);
		this.gridaBagLayoutSecuencial = new GridBagLayout();
		this.jPanelid_tipo_documentoSecuencial.setLayout(this.gridaBagLayoutSecuencial);


		jComboBoxid_tipo_documentoSecuencial= new JComboBoxMe();
		jComboBoxid_tipo_documentoSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documentoSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_documentoSecuencial= new JButtonMe();
		this.jButtonid_tipo_documentoSecuencial.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documentoSecuencial.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documentoSecuencial.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documentoSecuencial.setText("Buscar");
		this.jButtonid_tipo_documentoSecuencial.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_documentoSecuencial.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documentoSecuencial,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_documentoSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documentoSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documentoSecuencial"));

		this.jButtonid_tipo_documentoSecuencialBusqueda= new JButtonMe();
		this.jButtonid_tipo_documentoSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documentoSecuencialBusqueda.setText("U");
		this.jButtonid_tipo_documentoSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_documentoSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documentoSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_documentoSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documentoSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documentoSecuencialBusqueda"));

		if(this.secuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_documentoSecuencialBusqueda.setVisible(false);		}

		this.jButtonid_tipo_documentoSecuencialUpdate= new JButtonMe();
		this.jButtonid_tipo_documentoSecuencialUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoSecuencialUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoSecuencialUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documentoSecuencialUpdate.setText("U");
		this.jButtonid_tipo_documentoSecuencialUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_documentoSecuencialUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documentoSecuencialUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_documentoSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documentoSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documentoSecuencialUpdate"));



					
		this.jLabelid_tipo_movimientoSecuencial = new JLabelMe();
		this.jLabelid_tipo_movimientoSecuencial.setText(""+SecuencialConstantesFunciones.LABEL_IDTIPOMOVIMIENTO+" : *");
		this.jLabelid_tipo_movimientoSecuencial.setToolTipText("Tipo Movimiento");
		this.jLabelid_tipo_movimientoSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_movimientoSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_movimientoSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimientoSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_movimientoSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_movimientoSecuencial.setToolTipText(SecuencialConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
		this.gridaBagLayoutSecuencial = new GridBagLayout();
		this.jPanelid_tipo_movimientoSecuencial.setLayout(this.gridaBagLayoutSecuencial);


		jComboBoxid_tipo_movimientoSecuencial= new JComboBoxMe();
		jComboBoxid_tipo_movimientoSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimientoSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_movimientoSecuencial= new JButtonMe();
		this.jButtonid_tipo_movimientoSecuencial.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoSecuencial.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoSecuencial.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoSecuencial.setText("Buscar");
		this.jButtonid_tipo_movimientoSecuencial.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_movimientoSecuencial.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoSecuencial,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_movimientoSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoSecuencial"));

		this.jButtonid_tipo_movimientoSecuencialBusqueda= new JButtonMe();
		this.jButtonid_tipo_movimientoSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoSecuencialBusqueda.setText("U");
		this.jButtonid_tipo_movimientoSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_movimientoSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_movimientoSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoSecuencialBusqueda"));

		if(this.secuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_movimientoSecuencialBusqueda.setVisible(false);		}

		this.jButtonid_tipo_movimientoSecuencialUpdate= new JButtonMe();
		this.jButtonid_tipo_movimientoSecuencialUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoSecuencialUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoSecuencialUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoSecuencialUpdate.setText("U");
		this.jButtonid_tipo_movimientoSecuencialUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_movimientoSecuencialUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoSecuencialUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_movimientoSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoSecuencialUpdate"));



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
		//this.jInternalFrameDetalleSecuencial = new SecuencialBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Secuencial DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSecuencial= new GridBagLayout();
		

		
		String sToolTipSecuencial="";
		sToolTipSecuencial=SecuencialConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSecuencial+="(Contabilidad.Secuencial)";
		}
		
		if(!this.secuencialSessionBean.getEsGuardarRelacionado()) {
			sToolTipSecuencial+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoSecuencial = new JButtonMe();
		this.jButtonModificarSecuencial = new JButtonMe();
        this.jButtonActualizarSecuencial = new JButtonMe();
        this.jButtonEliminarSecuencial = new JButtonMe();
        this.jButtonCancelarSecuencial = new JButtonMe();
        this.jButtonGuardarCambiosSecuencial = new JButtonMe();
		this.jButtonGuardarCambiosTablaSecuencial = new JButtonMe();
		this.jButtonCerrarSecuencial = new JButtonMe();
		
		this.jScrollPanelDatosSecuencial = new JScrollPane();   
        this.jScrollPanelDatosEdicionSecuencial = new JScrollPane();
		this.jScrollPanelDatosGeneralSecuencial = new JScrollPane();
				
		
		
		this.jPanelCamposSecuencial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosSecuencial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesSecuencial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioSecuencial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		this.jTabbedPaneCamposSecuencial=new JTabbedPane();
		
		
		this.jTabbedPaneCamposSecuencial.setBorder(javax.swing.BorderFactory.createEmptyBorder());//javax.swing.BorderFactory.createTitledBorder("Campos")
		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneCamposSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralSecuencial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciosecuencialSecuencial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioformatoSecuencial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Secuencial";
		
		if(!this.secuencialSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Secuenciales" + this.sPath));
		} else {
			this.jScrollPanelDatosSecuencial.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposSecuencial.setName("jPanelCamposSecuencial"); 

		this.jPanelCamposOcultosSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosSecuencial.setName("jPanelCamposOcultosSecuencial"); 

        this.jPanelAccionesSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSecuencial.setToolTipText("Acciones");
        this.jPanelAccionesSecuencial.setName("Acciones"); 

		this.jPanelAccionesFormularioSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioSecuencial.setToolTipText("Acciones");
        this.jPanelAccionesFormularioSecuencial.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralSecuencial.setName("jPanelCamposFingeneralSecuencial");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciosecuencialSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Secuencial"));
		this.jPanelCamposIniciosecuencialSecuencial.setName("jPanelCamposFinsecuencialSecuencial");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciosecuencialSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioformatoSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Formato"));
		this.jPanelCamposInicioformatoSecuencial.setName("jPanelCamposFinformatoSecuencial");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioformatoSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoSecuencial.setText("Nuevo");
		this.jButtonModificarSecuencial.setText("Editar");
        this.jButtonActualizarSecuencial.setText("Actualizar");
        this.jButtonEliminarSecuencial.setText("Eliminar");
        this.jButtonCancelarSecuencial.setText("Cancelar");
        this.jButtonGuardarCambiosSecuencial.setText("Guardar");
		this.jButtonGuardarCambiosTablaSecuencial.setText("Guardar");
		this.jButtonCerrarSecuencial.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSecuencial,"nuevo_button","Nuevo",this.secuencialSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarSecuencial,"modificar_button","Editar",this.secuencialSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarSecuencial,"actualizar_button","Actualizar",this.secuencialSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarSecuencial,"eliminar_button","Eliminar",this.secuencialSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarSecuencial,"cancelar_button","Cancelar",this.secuencialSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosSecuencial,"guardarcambios_button","Guardar",this.secuencialSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSecuencial,"guardarcambiostabla_button","Guardar",this.secuencialSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSecuencial,"cerrar_button","Salir",this.secuencialSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoSecuencial.setToolTipText("Nuevo"+" "+SecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarSecuencial.setToolTipText("Editar"+" "+SecuencialConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarSecuencial.setToolTipText("Actualizar"+" "+SecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarSecuencial.setToolTipText("Eliminar)"+" "+SecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarSecuencial.setToolTipText("Cancelar"+" "+SecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosSecuencial.setToolTipText("Guardar"+" "+SecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaSecuencial.setToolTipText("Guardar"+" "+SecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSecuencial.setToolTipText("Salir"+" "+SecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSecuencial";
		inputMap = this.jButtonNuevoSecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSecuencial.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSecuencial"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarSecuencial";
		inputMap = this.jButtonActualizarSecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarSecuencial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarSecuencial"));
		
		//ELIMINAR
		sMapKey = "EliminarSecuencial";
		inputMap = this.jButtonEliminarSecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarSecuencial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarSecuencial"));
		
		//CANCELAR	
		sMapKey = "CancelarSecuencial";
		inputMap = this.jButtonCancelarSecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarSecuencial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarSecuencial"));
		
		//CERRAR		
		sMapKey = "CerrarSecuencial";
		inputMap = this.jButtonCerrarSecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSecuencial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSecuencial"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSecuencial";
		inputMap = this.jButtonGuardarCambiosTablaSecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSecuencial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSecuencial"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoSecuencial = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoSecuencial.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoSecuencial.setToolTipText("Nuevo Secuencial");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarSecuencial = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarSecuencial.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarSecuencial.setToolTipText("Sin Cerrar Ventana Secuencial");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeSecuencial = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeSecuencial.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeSecuencial.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesSecuencial = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSecuencial.setText("Accion");
		this.jComboBoxTiposAccionesSecuencial.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioSecuencial = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioSecuencial.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioSecuencial.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesSecuencial = new JLabelMe();
		
		this.jLabelAccionesSecuencial.setText("Acciones");		
		this.jLabelAccionesSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposSecuencial();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysSecuencial();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesSecuencial=new JTabbedPane();
		this.jTabbedPaneRelacionesSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesSecuencial.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSecuencial.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSecuencial.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioSecuencial.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSecuencial.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSecuencial.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposSecuencial = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosSecuencial = new GridBagLayout();
		
		this.jPanelCamposSecuencial.setLayout(gridaBagLayoutCamposSecuencial);
		this.jPanelCamposOcultosSecuencial.setLayout(gridaBagLayoutCamposOcultosSecuencial);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralSecuencial= new GridBagLayout();
		this.jPanelCamposIniciogeneralSecuencial.setLayout(gridaBagLayoutCamposIniciogeneralSecuencial);

		GridBagLayout gridaBagLayoutCamposIniciosecuencialSecuencial= new GridBagLayout();
		this.jPanelCamposIniciosecuencialSecuencial.setLayout(gridaBagLayoutCamposIniciosecuencialSecuencial);

		GridBagLayout gridaBagLayoutCamposInicioformatoSecuencial= new GridBagLayout();
		this.jPanelCamposInicioformatoSecuencial.setLayout(gridaBagLayoutCamposInicioformatoSecuencial);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 0;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidSecuencial.add(jLabelIdSecuencial, this.gridBagConstraintsSecuencial);



	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 1;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidSecuencial.add(jLabelidSecuencial, this.gridBagConstraintsSecuencial);


	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 0;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaSecuencial.add(jLabelid_empresaSecuencial, this.gridBagConstraintsSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencial.gridy = 0;
		this.gridBagConstraintsSecuencial.gridx = 2;
		this.gridBagConstraintsSecuencial.ipadx = 0;
		this.gridBagConstraintsSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSecuencial.add(jButtonid_empresaSecuencialBusqueda, this.gridBagConstraintsSecuencial);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencial.gridy = 0;
		this.gridBagConstraintsSecuencial.gridx = 3;
		this.gridBagConstraintsSecuencial.ipadx = 0;
		this.gridBagConstraintsSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSecuencial.add(jButtonid_empresaSecuencialUpdate, this.gridBagConstraintsSecuencial);
	}

	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 1;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaSecuencial.add(jComboBoxid_empresaSecuencial, this.gridBagConstraintsSecuencial);


	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 0;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalSecuencial.add(jLabelid_sucursalSecuencial, this.gridBagConstraintsSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencial.gridy = 0;
		this.gridBagConstraintsSecuencial.gridx = 2;
		this.gridBagConstraintsSecuencial.ipadx = 0;
		this.gridBagConstraintsSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalSecuencial.add(jButtonid_sucursalSecuencialBusqueda, this.gridBagConstraintsSecuencial);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencial.gridy = 0;
		this.gridBagConstraintsSecuencial.gridx = 3;
		this.gridBagConstraintsSecuencial.ipadx = 0;
		this.gridBagConstraintsSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalSecuencial.add(jButtonid_sucursalSecuencialUpdate, this.gridBagConstraintsSecuencial);
	}

	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 1;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalSecuencial.add(jComboBoxid_sucursalSecuencial, this.gridBagConstraintsSecuencial);


	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 0;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioSecuencial.add(jLabelid_ejercicioSecuencial, this.gridBagConstraintsSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencial.gridy = 0;
		this.gridBagConstraintsSecuencial.gridx = 2;
		this.gridBagConstraintsSecuencial.ipadx = 0;
		this.gridBagConstraintsSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioSecuencial.add(jButtonid_ejercicioSecuencialBusqueda, this.gridBagConstraintsSecuencial);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencial.gridy = 0;
		this.gridBagConstraintsSecuencial.gridx = 3;
		this.gridBagConstraintsSecuencial.ipadx = 0;
		this.gridBagConstraintsSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioSecuencial.add(jButtonid_ejercicioSecuencialUpdate, this.gridBagConstraintsSecuencial);
	}

	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 1;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioSecuencial.add(jComboBoxid_ejercicioSecuencial, this.gridBagConstraintsSecuencial);


	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 0;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoSecuencial.add(jLabelid_periodoSecuencial, this.gridBagConstraintsSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencial.gridy = 0;
		this.gridBagConstraintsSecuencial.gridx = 2;
		this.gridBagConstraintsSecuencial.ipadx = 0;
		this.gridBagConstraintsSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoSecuencial.add(jButtonid_periodoSecuencialBusqueda, this.gridBagConstraintsSecuencial);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencial.gridy = 0;
		this.gridBagConstraintsSecuencial.gridx = 3;
		this.gridBagConstraintsSecuencial.ipadx = 0;
		this.gridBagConstraintsSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoSecuencial.add(jButtonid_periodoSecuencialUpdate, this.gridBagConstraintsSecuencial);
	}

	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 1;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoSecuencial.add(jComboBoxid_periodoSecuencial, this.gridBagConstraintsSecuencial);


	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 0;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioSecuencial.add(jLabelid_anioSecuencial, this.gridBagConstraintsSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencial.gridy = 0;
		this.gridBagConstraintsSecuencial.gridx = 2;
		this.gridBagConstraintsSecuencial.ipadx = 0;
		this.gridBagConstraintsSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioSecuencial.add(jButtonid_anioSecuencialBusqueda, this.gridBagConstraintsSecuencial);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencial.gridy = 0;
		this.gridBagConstraintsSecuencial.gridx = 3;
		this.gridBagConstraintsSecuencial.ipadx = 0;
		this.gridBagConstraintsSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioSecuencial.add(jButtonid_anioSecuencialUpdate, this.gridBagConstraintsSecuencial);
	}

	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 1;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioSecuencial.add(jComboBoxid_anioSecuencial, this.gridBagConstraintsSecuencial);


	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 0;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesSecuencial.add(jLabelid_mesSecuencial, this.gridBagConstraintsSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencial.gridy = 0;
		this.gridBagConstraintsSecuencial.gridx = 2;
		this.gridBagConstraintsSecuencial.ipadx = 0;
		this.gridBagConstraintsSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesSecuencial.add(jButtonid_mesSecuencialBusqueda, this.gridBagConstraintsSecuencial);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencial.gridy = 0;
		this.gridBagConstraintsSecuencial.gridx = 3;
		this.gridBagConstraintsSecuencial.ipadx = 0;
		this.gridBagConstraintsSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesSecuencial.add(jButtonid_mesSecuencialUpdate, this.gridBagConstraintsSecuencial);
	}

	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 1;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesSecuencial.add(jComboBoxid_mesSecuencial, this.gridBagConstraintsSecuencial);


	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 0;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloSecuencial.add(jLabelid_moduloSecuencial, this.gridBagConstraintsSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencial.gridy = 0;
		this.gridBagConstraintsSecuencial.gridx = 2;
		this.gridBagConstraintsSecuencial.ipadx = 0;
		this.gridBagConstraintsSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloSecuencial.add(jButtonid_moduloSecuencialBusqueda, this.gridBagConstraintsSecuencial);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencial.gridy = 0;
		this.gridBagConstraintsSecuencial.gridx = 3;
		this.gridBagConstraintsSecuencial.ipadx = 0;
		this.gridBagConstraintsSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloSecuencial.add(jButtonid_moduloSecuencialUpdate, this.gridBagConstraintsSecuencial);
	}

	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 1;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloSecuencial.add(jComboBoxid_moduloSecuencial, this.gridBagConstraintsSecuencial);


	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 0;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_movimiento_moduloSecuencial.add(jLabelid_tipo_movimiento_moduloSecuencial, this.gridBagConstraintsSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencial.gridy = 0;
		this.gridBagConstraintsSecuencial.gridx = 2;
		this.gridBagConstraintsSecuencial.ipadx = 0;
		this.gridBagConstraintsSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimiento_moduloSecuencial.add(jButtonid_tipo_movimiento_moduloSecuencialBusqueda, this.gridBagConstraintsSecuencial);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencial.gridy = 0;
		this.gridBagConstraintsSecuencial.gridx = 3;
		this.gridBagConstraintsSecuencial.ipadx = 0;
		this.gridBagConstraintsSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimiento_moduloSecuencial.add(jButtonid_tipo_movimiento_moduloSecuencialUpdate, this.gridBagConstraintsSecuencial);
	}

	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 1;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_movimiento_moduloSecuencial.add(jComboBoxid_tipo_movimiento_moduloSecuencial, this.gridBagConstraintsSecuencial);


	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 0;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_documentoSecuencial.add(jLabelid_tipo_documentoSecuencial, this.gridBagConstraintsSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencial.gridy = 0;
		this.gridBagConstraintsSecuencial.gridx = 2;
		this.gridBagConstraintsSecuencial.ipadx = 0;
		this.gridBagConstraintsSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documentoSecuencial.add(jButtonid_tipo_documentoSecuencialBusqueda, this.gridBagConstraintsSecuencial);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencial.gridy = 0;
		this.gridBagConstraintsSecuencial.gridx = 3;
		this.gridBagConstraintsSecuencial.ipadx = 0;
		this.gridBagConstraintsSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documentoSecuencial.add(jButtonid_tipo_documentoSecuencialUpdate, this.gridBagConstraintsSecuencial);
	}

	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 1;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_documentoSecuencial.add(jComboBoxid_tipo_documentoSecuencial, this.gridBagConstraintsSecuencial);


	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 0;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_movimientoSecuencial.add(jLabelid_tipo_movimientoSecuencial, this.gridBagConstraintsSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencial.gridy = 0;
		this.gridBagConstraintsSecuencial.gridx = 2;
		this.gridBagConstraintsSecuencial.ipadx = 0;
		this.gridBagConstraintsSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoSecuencial.add(jButtonid_tipo_movimientoSecuencialBusqueda, this.gridBagConstraintsSecuencial);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencial.gridy = 0;
		this.gridBagConstraintsSecuencial.gridx = 3;
		this.gridBagConstraintsSecuencial.ipadx = 0;
		this.gridBagConstraintsSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoSecuencial.add(jButtonid_tipo_movimientoSecuencialUpdate, this.gridBagConstraintsSecuencial);
	}

	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 1;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_movimientoSecuencial.add(jComboBoxid_tipo_movimientoSecuencial, this.gridBagConstraintsSecuencial);


	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 0;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_asientoSecuencial.add(jLabelnumero_asientoSecuencial, this.gridBagConstraintsSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencial.gridy = 0;
		this.gridBagConstraintsSecuencial.gridx = 2;
		this.gridBagConstraintsSecuencial.ipadx = 0;
		this.gridBagConstraintsSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_asientoSecuencial.add(jButtonnumero_asientoSecuencialBusqueda, this.gridBagConstraintsSecuencial);
	}

	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 1;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_asientoSecuencial.add(jTextFieldnumero_asientoSecuencial, this.gridBagConstraintsSecuencial);


	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 0;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_ingresoSecuencial.add(jLabelnumero_ingresoSecuencial, this.gridBagConstraintsSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencial.gridy = 0;
		this.gridBagConstraintsSecuencial.gridx = 2;
		this.gridBagConstraintsSecuencial.ipadx = 0;
		this.gridBagConstraintsSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_ingresoSecuencial.add(jButtonnumero_ingresoSecuencialBusqueda, this.gridBagConstraintsSecuencial);
	}

	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 1;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_ingresoSecuencial.add(jTextFieldnumero_ingresoSecuencial, this.gridBagConstraintsSecuencial);


	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 0;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_egresoSecuencial.add(jLabelnumero_egresoSecuencial, this.gridBagConstraintsSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencial.gridy = 0;
		this.gridBagConstraintsSecuencial.gridx = 2;
		this.gridBagConstraintsSecuencial.ipadx = 0;
		this.gridBagConstraintsSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_egresoSecuencial.add(jButtonnumero_egresoSecuencialBusqueda, this.gridBagConstraintsSecuencial);
	}

	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 1;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_egresoSecuencial.add(jTextFieldnumero_egresoSecuencial, this.gridBagConstraintsSecuencial);


	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 0;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_diarioSecuencial.add(jLabelnumero_diarioSecuencial, this.gridBagConstraintsSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencial.gridy = 0;
		this.gridBagConstraintsSecuencial.gridx = 2;
		this.gridBagConstraintsSecuencial.ipadx = 0;
		this.gridBagConstraintsSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_diarioSecuencial.add(jButtonnumero_diarioSecuencialBusqueda, this.gridBagConstraintsSecuencial);
	}

	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 1;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_diarioSecuencial.add(jTextFieldnumero_diarioSecuencial, this.gridBagConstraintsSecuencial);


	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 0;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_retencion_ivaSecuencial.add(jLabelnumero_retencion_ivaSecuencial, this.gridBagConstraintsSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencial.gridy = 0;
		this.gridBagConstraintsSecuencial.gridx = 2;
		this.gridBagConstraintsSecuencial.ipadx = 0;
		this.gridBagConstraintsSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_retencion_ivaSecuencial.add(jButtonnumero_retencion_ivaSecuencialBusqueda, this.gridBagConstraintsSecuencial);
	}

	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 1;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_retencion_ivaSecuencial.add(jTextFieldnumero_retencion_ivaSecuencial, this.gridBagConstraintsSecuencial);


	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 0;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_retencion_fuenteSecuencial.add(jLabelnumero_retencion_fuenteSecuencial, this.gridBagConstraintsSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencial.gridy = 0;
		this.gridBagConstraintsSecuencial.gridx = 2;
		this.gridBagConstraintsSecuencial.ipadx = 0;
		this.gridBagConstraintsSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_retencion_fuenteSecuencial.add(jButtonnumero_retencion_fuenteSecuencialBusqueda, this.gridBagConstraintsSecuencial);
	}

	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 1;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_retencion_fuenteSecuencial.add(jTextFieldnumero_retencion_fuenteSecuencial, this.gridBagConstraintsSecuencial);


	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 0;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_asiento_formatoSecuencial.add(jLabelnumero_asiento_formatoSecuencial, this.gridBagConstraintsSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencial.gridy = 0;
		this.gridBagConstraintsSecuencial.gridx = 2;
		this.gridBagConstraintsSecuencial.ipadx = 0;
		this.gridBagConstraintsSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_asiento_formatoSecuencial.add(jButtonnumero_asiento_formatoSecuencialBusqueda, this.gridBagConstraintsSecuencial);
	}

	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 1;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_asiento_formatoSecuencial.add(jTextFieldnumero_asiento_formatoSecuencial, this.gridBagConstraintsSecuencial);


	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 0;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_ingreso_formatoSecuencial.add(jLabelnumero_ingreso_formatoSecuencial, this.gridBagConstraintsSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencial.gridy = 0;
		this.gridBagConstraintsSecuencial.gridx = 2;
		this.gridBagConstraintsSecuencial.ipadx = 0;
		this.gridBagConstraintsSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_ingreso_formatoSecuencial.add(jButtonnumero_ingreso_formatoSecuencialBusqueda, this.gridBagConstraintsSecuencial);
	}

	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 1;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_ingreso_formatoSecuencial.add(jTextFieldnumero_ingreso_formatoSecuencial, this.gridBagConstraintsSecuencial);


	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 0;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_egreso_formatoSecuencial.add(jLabelnumero_egreso_formatoSecuencial, this.gridBagConstraintsSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencial.gridy = 0;
		this.gridBagConstraintsSecuencial.gridx = 2;
		this.gridBagConstraintsSecuencial.ipadx = 0;
		this.gridBagConstraintsSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_egreso_formatoSecuencial.add(jButtonnumero_egreso_formatoSecuencialBusqueda, this.gridBagConstraintsSecuencial);
	}

	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 1;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_egreso_formatoSecuencial.add(jTextFieldnumero_egreso_formatoSecuencial, this.gridBagConstraintsSecuencial);


	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 0;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_diario_formatoSecuencial.add(jLabelnumero_diario_formatoSecuencial, this.gridBagConstraintsSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencial.gridy = 0;
		this.gridBagConstraintsSecuencial.gridx = 2;
		this.gridBagConstraintsSecuencial.ipadx = 0;
		this.gridBagConstraintsSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_diario_formatoSecuencial.add(jButtonnumero_diario_formatoSecuencialBusqueda, this.gridBagConstraintsSecuencial);
	}

	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 1;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_diario_formatoSecuencial.add(jTextFieldnumero_diario_formatoSecuencial, this.gridBagConstraintsSecuencial);


	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 0;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_retencion_fuente_formatoSecuencial.add(jLabelnumero_retencion_fuente_formatoSecuencial, this.gridBagConstraintsSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencial.gridy = 0;
		this.gridBagConstraintsSecuencial.gridx = 2;
		this.gridBagConstraintsSecuencial.ipadx = 0;
		this.gridBagConstraintsSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_retencion_fuente_formatoSecuencial.add(jButtonnumero_retencion_fuente_formatoSecuencialBusqueda, this.gridBagConstraintsSecuencial);
	}

	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 1;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_retencion_fuente_formatoSecuencial.add(jTextFieldnumero_retencion_fuente_formatoSecuencial, this.gridBagConstraintsSecuencial);


	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 0;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_retencion_iva_formatoSecuencial.add(jLabelnumero_retencion_iva_formatoSecuencial, this.gridBagConstraintsSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencial.gridy = 0;
		this.gridBagConstraintsSecuencial.gridx = 2;
		this.gridBagConstraintsSecuencial.ipadx = 0;
		this.gridBagConstraintsSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_retencion_iva_formatoSecuencial.add(jButtonnumero_retencion_iva_formatoSecuencialBusqueda, this.gridBagConstraintsSecuencial);
	}

	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencial.gridy = 0;
	this.gridBagConstraintsSecuencial.gridx = 1;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_retencion_iva_formatoSecuencial.add(jTextFieldnumero_retencion_iva_formatoSecuencial, this.gridBagConstraintsSecuencial);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSecuencial.gridy = iYPanelCamposOcultosSecuencial;
	this.gridBagConstraintsSecuencial.gridx = iXPanelCamposOcultosSecuencial++;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSecuencial.add(this.jPanelid_empresaSecuencial, this.gridBagConstraintsSecuencial);



	if(iXPanelCamposOcultosSecuencial % 1==0) {
		iXPanelCamposOcultosSecuencial=0;
		iYPanelCamposOcultosSecuencial++;
	}
	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSecuencial.gridy = iYPanelCamposOcultosSecuencial;
	this.gridBagConstraintsSecuencial.gridx = iXPanelCamposOcultosSecuencial++;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSecuencial.add(this.jPanelid_sucursalSecuencial, this.gridBagConstraintsSecuencial);



	if(iXPanelCamposOcultosSecuencial % 1==0) {
		iXPanelCamposOcultosSecuencial=0;
		iYPanelCamposOcultosSecuencial++;
	}
	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSecuencial.gridy = iYPanelCamposOcultosSecuencial;
	this.gridBagConstraintsSecuencial.gridx = iXPanelCamposOcultosSecuencial++;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSecuencial.add(this.jPanelid_anioSecuencial, this.gridBagConstraintsSecuencial);



	if(iXPanelCamposOcultosSecuencial % 1==0) {
		iXPanelCamposOcultosSecuencial=0;
		iYPanelCamposOcultosSecuencial++;
	}
	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSecuencial.gridy = iYPanelCamposOcultosSecuencial;
	this.gridBagConstraintsSecuencial.gridx = iXPanelCamposOcultosSecuencial++;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSecuencial.add(this.jPanelid_mesSecuencial, this.gridBagConstraintsSecuencial);



	if(iXPanelCamposOcultosSecuencial % 1==0) {
		iXPanelCamposOcultosSecuencial=0;
		iYPanelCamposOcultosSecuencial++;
	}
	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSecuencial.gridy = iYPanelCamposOcultosSecuencial;
	this.gridBagConstraintsSecuencial.gridx = iXPanelCamposOcultosSecuencial++;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSecuencial.add(this.jPanelid_tipo_movimiento_moduloSecuencial, this.gridBagConstraintsSecuencial);



	if(iXPanelCamposOcultosSecuencial % 1==0) {
		iXPanelCamposOcultosSecuencial=0;
		iYPanelCamposOcultosSecuencial++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSecuencial.gridy = iYPanelCamposIniciogeneralSecuencial;
	this.gridBagConstraintsSecuencial.gridx = iXPanelCamposIniciogeneralSecuencial++;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralSecuencial.add(this.jPanelidSecuencial, this.gridBagConstraintsSecuencial);



	if(iXPanelCamposIniciogeneralSecuencial % 1==0) {
		iXPanelCamposIniciogeneralSecuencial=0;
		iYPanelCamposIniciogeneralSecuencial++;
	}
	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSecuencial.gridy = iYPanelCamposIniciogeneralSecuencial;
	this.gridBagConstraintsSecuencial.gridx = iXPanelCamposIniciogeneralSecuencial++;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralSecuencial.add(this.jPanelid_ejercicioSecuencial, this.gridBagConstraintsSecuencial);



	if(iXPanelCamposIniciogeneralSecuencial % 1==0) {
		iXPanelCamposIniciogeneralSecuencial=0;
		iYPanelCamposIniciogeneralSecuencial++;
	}
	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSecuencial.gridy = iYPanelCamposIniciogeneralSecuencial;
	this.gridBagConstraintsSecuencial.gridx = iXPanelCamposIniciogeneralSecuencial++;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralSecuencial.add(this.jPanelid_periodoSecuencial, this.gridBagConstraintsSecuencial);



	if(iXPanelCamposIniciogeneralSecuencial % 1==0) {
		iXPanelCamposIniciogeneralSecuencial=0;
		iYPanelCamposIniciogeneralSecuencial++;
	}
	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSecuencial.gridy = iYPanelCamposIniciogeneralSecuencial;
	this.gridBagConstraintsSecuencial.gridx = iXPanelCamposIniciogeneralSecuencial++;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralSecuencial.add(this.jPanelid_moduloSecuencial, this.gridBagConstraintsSecuencial);



	if(iXPanelCamposIniciogeneralSecuencial % 1==0) {
		iXPanelCamposIniciogeneralSecuencial=0;
		iYPanelCamposIniciogeneralSecuencial++;
	}
	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSecuencial.gridy = iYPanelCamposIniciogeneralSecuencial;
	this.gridBagConstraintsSecuencial.gridx = iXPanelCamposIniciogeneralSecuencial++;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralSecuencial.add(this.jPanelid_tipo_documentoSecuencial, this.gridBagConstraintsSecuencial);



	if(iXPanelCamposIniciogeneralSecuencial % 1==0) {
		iXPanelCamposIniciogeneralSecuencial=0;
		iYPanelCamposIniciogeneralSecuencial++;
	}
	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSecuencial.gridy = iYPanelCamposIniciogeneralSecuencial;
	this.gridBagConstraintsSecuencial.gridx = iXPanelCamposIniciogeneralSecuencial++;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralSecuencial.add(this.jPanelid_tipo_movimientoSecuencial, this.gridBagConstraintsSecuencial);



	if(iXPanelCamposIniciogeneralSecuencial % 1==0) {
		iXPanelCamposIniciogeneralSecuencial=0;
		iYPanelCamposIniciogeneralSecuencial++;
	}
	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSecuencial.gridy = iYPanelCamposIniciosecuencialSecuencial;
	this.gridBagConstraintsSecuencial.gridx = iXPanelCamposIniciosecuencialSecuencial++;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciosecuencialSecuencial.add(this.jPanelnumero_asientoSecuencial, this.gridBagConstraintsSecuencial);



	if(iXPanelCamposIniciosecuencialSecuencial % 1==0) {
		iXPanelCamposIniciosecuencialSecuencial=0;
		iYPanelCamposIniciosecuencialSecuencial++;
	}
	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSecuencial.gridy = iYPanelCamposIniciosecuencialSecuencial;
	this.gridBagConstraintsSecuencial.gridx = iXPanelCamposIniciosecuencialSecuencial++;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciosecuencialSecuencial.add(this.jPanelnumero_ingresoSecuencial, this.gridBagConstraintsSecuencial);



	if(iXPanelCamposIniciosecuencialSecuencial % 1==0) {
		iXPanelCamposIniciosecuencialSecuencial=0;
		iYPanelCamposIniciosecuencialSecuencial++;
	}
	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSecuencial.gridy = iYPanelCamposIniciosecuencialSecuencial;
	this.gridBagConstraintsSecuencial.gridx = iXPanelCamposIniciosecuencialSecuencial++;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciosecuencialSecuencial.add(this.jPanelnumero_egresoSecuencial, this.gridBagConstraintsSecuencial);



	if(iXPanelCamposIniciosecuencialSecuencial % 1==0) {
		iXPanelCamposIniciosecuencialSecuencial=0;
		iYPanelCamposIniciosecuencialSecuencial++;
	}
	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSecuencial.gridy = iYPanelCamposIniciosecuencialSecuencial;
	this.gridBagConstraintsSecuencial.gridx = iXPanelCamposIniciosecuencialSecuencial++;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciosecuencialSecuencial.add(this.jPanelnumero_diarioSecuencial, this.gridBagConstraintsSecuencial);



	if(iXPanelCamposIniciosecuencialSecuencial % 1==0) {
		iXPanelCamposIniciosecuencialSecuencial=0;
		iYPanelCamposIniciosecuencialSecuencial++;
	}
	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSecuencial.gridy = iYPanelCamposIniciosecuencialSecuencial;
	this.gridBagConstraintsSecuencial.gridx = iXPanelCamposIniciosecuencialSecuencial++;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciosecuencialSecuencial.add(this.jPanelnumero_retencion_ivaSecuencial, this.gridBagConstraintsSecuencial);



	if(iXPanelCamposIniciosecuencialSecuencial % 1==0) {
		iXPanelCamposIniciosecuencialSecuencial=0;
		iYPanelCamposIniciosecuencialSecuencial++;
	}
	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSecuencial.gridy = iYPanelCamposIniciosecuencialSecuencial;
	this.gridBagConstraintsSecuencial.gridx = iXPanelCamposIniciosecuencialSecuencial++;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciosecuencialSecuencial.add(this.jPanelnumero_retencion_fuenteSecuencial, this.gridBagConstraintsSecuencial);



	if(iXPanelCamposIniciosecuencialSecuencial % 1==0) {
		iXPanelCamposIniciosecuencialSecuencial=0;
		iYPanelCamposIniciosecuencialSecuencial++;
	}
	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSecuencial.gridy = iYPanelCamposInicioformatoSecuencial;
	this.gridBagConstraintsSecuencial.gridx = iXPanelCamposInicioformatoSecuencial++;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioformatoSecuencial.add(this.jPanelnumero_asiento_formatoSecuencial, this.gridBagConstraintsSecuencial);



	if(iXPanelCamposInicioformatoSecuencial % 1==0) {
		iXPanelCamposInicioformatoSecuencial=0;
		iYPanelCamposInicioformatoSecuencial++;
	}
	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSecuencial.gridy = iYPanelCamposInicioformatoSecuencial;
	this.gridBagConstraintsSecuencial.gridx = iXPanelCamposInicioformatoSecuencial++;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioformatoSecuencial.add(this.jPanelnumero_ingreso_formatoSecuencial, this.gridBagConstraintsSecuencial);



	if(iXPanelCamposInicioformatoSecuencial % 1==0) {
		iXPanelCamposInicioformatoSecuencial=0;
		iYPanelCamposInicioformatoSecuencial++;
	}
	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSecuencial.gridy = iYPanelCamposInicioformatoSecuencial;
	this.gridBagConstraintsSecuencial.gridx = iXPanelCamposInicioformatoSecuencial++;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioformatoSecuencial.add(this.jPanelnumero_egreso_formatoSecuencial, this.gridBagConstraintsSecuencial);



	if(iXPanelCamposInicioformatoSecuencial % 1==0) {
		iXPanelCamposInicioformatoSecuencial=0;
		iYPanelCamposInicioformatoSecuencial++;
	}
	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSecuencial.gridy = iYPanelCamposInicioformatoSecuencial;
	this.gridBagConstraintsSecuencial.gridx = iXPanelCamposInicioformatoSecuencial++;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioformatoSecuencial.add(this.jPanelnumero_diario_formatoSecuencial, this.gridBagConstraintsSecuencial);



	if(iXPanelCamposInicioformatoSecuencial % 1==0) {
		iXPanelCamposInicioformatoSecuencial=0;
		iYPanelCamposInicioformatoSecuencial++;
	}
	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSecuencial.gridy = iYPanelCamposInicioformatoSecuencial;
	this.gridBagConstraintsSecuencial.gridx = iXPanelCamposInicioformatoSecuencial++;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioformatoSecuencial.add(this.jPanelnumero_retencion_fuente_formatoSecuencial, this.gridBagConstraintsSecuencial);



	if(iXPanelCamposInicioformatoSecuencial % 1==0) {
		iXPanelCamposInicioformatoSecuencial=0;
		iYPanelCamposInicioformatoSecuencial++;
	}
	this.gridBagConstraintsSecuencial = new GridBagConstraints();
	this.gridBagConstraintsSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSecuencial.gridy = iYPanelCamposInicioformatoSecuencial;
	this.gridBagConstraintsSecuencial.gridx = iXPanelCamposInicioformatoSecuencial++;
	this.gridBagConstraintsSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioformatoSecuencial.add(this.jPanelnumero_retencion_iva_formatoSecuencial, this.gridBagConstraintsSecuencial);



	if(iXPanelCamposInicioformatoSecuencial % 1==0) {
		iXPanelCamposInicioformatoSecuencial=0;
		iYPanelCamposInicioformatoSecuencial++;
	}
		
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
			
		GridBagLayout gridaBagLayoutAccionesSecuencial= new GridBagLayout();
		this.jPanelAccionesSecuencial.setLayout(gridaBagLayoutAccionesSecuencial);
		
		GridBagLayout gridaBagLayoutAccionesFormularioSecuencial= new GridBagLayout();
		this.jPanelAccionesFormularioSecuencial.setLayout(gridaBagLayoutAccionesFormularioSecuencial);
		
		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		this.gridBagConstraintsSecuencial.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSecuencial.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSecuencial.add(this.jComboBoxTiposAccionesFormularioSecuencial, this.gridBagConstraintsSecuencial);

		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		this.gridBagConstraintsSecuencial.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSecuencial.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSecuencial.add(this.jCheckBoxPostAccionNuevoSecuencial, this.gridBagConstraintsSecuencial);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.secuencialSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
			this.gridBagConstraintsSecuencial.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSecuencial.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSecuencial.add(this.jCheckBoxPostAccionSinCerrarSecuencial, this.gridBagConstraintsSecuencial);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.secuencialSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.secuencialSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
			this.gridBagConstraintsSecuencial.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSecuencial.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSecuencial.add(this.jCheckBoxPostAccionSinMensajeSecuencial, this.gridBagConstraintsSecuencial);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		this.gridBagConstraintsSecuencial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSecuencial.gridy = 0;
		this.gridBagConstraintsSecuencial.gridx = iPosXAccion++;
			
		this.jPanelAccionesSecuencial.add(this.jButtonModificarSecuencial, this.gridBagConstraintsSecuencial);							

		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		this.gridBagConstraintsSecuencial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSecuencial.gridy = 0;
		this.gridBagConstraintsSecuencial.gridx =iPosXAccion++;
			
		this.jPanelAccionesSecuencial.add(this.jButtonEliminarSecuencial, this.gridBagConstraintsSecuencial);
		
			
		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		this.gridBagConstraintsSecuencial.gridy = 0;		
		this.gridBagConstraintsSecuencial.gridx = iPosXAccion++;
		
		this.jPanelAccionesSecuencial.add(this.jButtonActualizarSecuencial, this.gridBagConstraintsSecuencial);


		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		this.gridBagConstraintsSecuencial.gridy = 0;		
		this.gridBagConstraintsSecuencial.gridx = iPosXAccion++;
		
		this.jPanelAccionesSecuencial.add(this.jButtonGuardarCambiosSecuencial, this.gridBagConstraintsSecuencial);	
		
		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		this.gridBagConstraintsSecuencial.gridy = 0;		
		this.gridBagConstraintsSecuencial.gridx =iPosXAccion++;
		
		this.jPanelAccionesSecuencial.add(this.jButtonCancelarSecuencial, this.gridBagConstraintsSecuencial);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSecuencial = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSecuencial);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.secuencialSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSecuencial = new GridBagConstraints();						
			this.gridBagConstraintsSecuencial.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSecuencial.gridx = 0;		
			//this.gridBagConstraintsSecuencial.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSecuencial.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		this.gridBagConstraintsSecuencial.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSecuencial.gridx =0;
		this.gridBagConstraintsSecuencial.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSecuencial.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSecuencial, this.gridBagConstraintsSecuencial);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(SecuencialJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleSecuencial = new SecuencialBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Secuencial DATOS");
			
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
			
	        //this.setTitle("[FOR] - Secuencial DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Secuencial Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			SecuencialModel secuencialModel=new SecuencialModel(this);
			
			//SI USARA CLASE INTERNA
			//SecuencialModel.SecuencialFocusTraversalPolicy secuencialFocusTraversalPolicy = secuencialModel.new SecuencialFocusTraversalPolicy(this);
			
			//secuencialFocusTraversalPolicy.setsecuencialJInternalFrame(this);
			
			this.setFocusTraversalPolicy(secuencialModel);
			
			
			this.jContentPaneDetalleSecuencial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleSecuencial = new GridBagLayout();	
			this.jContentPaneDetalleSecuencial.setLayout(gridaBagLayoutDetalleSecuencial);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSecuencial = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsSecuencial = new GridBagConstraints();
				this.gridBagConstraintsSecuencial.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsSecuencial.gridx = 0;
					
				
				this.jContentPaneDetalleSecuencial.add(jTtoolBarDetalleSecuencial, gridBagConstraintsSecuencial);								
				
}
			
			this.jScrollPanelDatosEdicionSecuencial=   new JScrollPane(jContentPaneDetalleSecuencial,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSecuencial.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSecuencial.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSecuencial.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralSecuencial=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSecuencial.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSecuencial.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSecuencial.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
			
			
			
			
			
		this.jTabbedPaneCamposSecuencial.add("General",this.jPanelCamposIniciogeneralSecuencial);
		this.jTabbedPaneCamposSecuencial.add("Secuencial",this.jPanelCamposIniciosecuencialSecuencial);
		this.jTabbedPaneCamposSecuencial.add("Formato",this.jPanelCamposInicioformatoSecuencial);
			
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
						
			this.gridBagConstraintsSecuencial.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsSecuencial.gridx = 0;
	        
			this.jContentPaneDetalleSecuencial.add(jTabbedPaneCamposSecuencial, gridBagConstraintsSecuencial);
			
			
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
						&& secuencialSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.secuencialSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsSecuencial= new GridBagConstraints();
						this.gridBagConstraintsSecuencial.gridy = iGridyRelaciones++;
						this.gridBagConstraintsSecuencial.gridx = 0;
						this.jContentPaneDetalleSecuencial.add(this.jTabbedPaneRelacionesSecuencial, this.gridBagConstraintsSecuencial);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesSecuencial.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosSecuencial.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsSecuencial = new GridBagConstraints();
					this.gridBagConstraintsSecuencial.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsSecuencial.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsSecuencial.gridx = 0;
					
				
					this.jContentPaneDetalleSecuencial.add(jPanelCamposOcultosSecuencial, gridBagConstraintsSecuencial);
				
					this.jPanelCamposOcultosSecuencial.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
			this.gridBagConstraintsSecuencial.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsSecuencial.gridx = 0;
	        this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleSecuencial.add(this.jPanelAccionesFormularioSecuencial, this.gridBagConstraintsSecuencial);							
			
			
			
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
	        this.gridBagConstraintsSecuencial.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsSecuencial.gridx = 0;
	        
			
			this.jContentPaneDetalleSecuencial.add(this.jPanelAccionesSecuencial, this.gridBagConstraintsSecuencial);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionSecuencial);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionSecuencial=   new JScrollPane(this.jPanelCamposSecuencial,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSecuencial.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSecuencial.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSecuencial.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
			this.gridBagConstraintsSecuencial.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsSecuencial.gridx = 0;
			this.gridBagConstraintsSecuencial.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsSecuencial.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionSecuencial, this.gridBagConstraintsSecuencial);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
			this.gridBagConstraintsSecuencial.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSecuencial.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioSecuencial, this.gridBagConstraintsSecuencial);			
			
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
			this.gridBagConstraintsSecuencial.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSecuencial.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesSecuencial, this.gridBagConstraintsSecuencial);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		this.gridBagConstraintsSecuencial.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSecuencial.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSecuencial, this.gridBagConstraintsSecuencial);
			
			
		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		this.gridBagConstraintsSecuencial.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSecuencial.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSecuencial, this.gridBagConstraintsSecuencial);
		
			
		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		this.gridBagConstraintsSecuencial.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSecuencial.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSecuencial, this.gridBagConstraintsSecuencial);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralSecuencial;//jContentPane;
		
		return jScrollPanelDatosEdicionSecuencial;
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
