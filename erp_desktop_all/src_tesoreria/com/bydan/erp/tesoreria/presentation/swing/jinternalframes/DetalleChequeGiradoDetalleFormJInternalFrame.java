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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
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
import com.bydan.erp.tesoreria.util.DetalleChequeGiradoConstantesFunciones;

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
public class DetalleChequeGiradoDetalleFormJInternalFrame extends DetalleChequeGiradoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetalleChequeGirado;
	
	protected JMenuBar jmenuBarDetalleDetalleChequeGirado;
	
	protected JMenu jmenuDetalleDetalleChequeGirado;
	protected JMenu jmenuDetalleArchivoDetalleChequeGirado;
	protected JMenu jmenuDetalleAccionesDetalleChequeGirado;
	protected JMenu jmenuDetalleDatosDetalleChequeGirado;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleChequeGirado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleChequeGirado;	
	protected GridBagConstraints gridBagConstraintsDetalleChequeGirado;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleChequeGiradoBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleChequeGirado;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected CuentaBancoBeanSwingJInternalFrame cuentabancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentabanco="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public DetalleChequeGiradoSessionBean detallechequegiradoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public CuentaBancoSessionBean cuentabancoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;	
	
	public DetalleChequeGiradoLogic detallechequegiradoLogic;
	
	public JScrollPane jScrollPanelDatosDetalleChequeGirado;
	public JScrollPane jScrollPanelDatosEdicionDetalleChequeGirado;
	public JScrollPane jScrollPanelDatosGeneralDetalleChequeGirado;
	
	protected JPanel jPanelCamposDetalleChequeGirado;    
	protected JPanel jPanelCamposOcultosDetalleChequeGirado;    	
	protected JPanel jPanelAccionesDetalleChequeGirado;
	protected JPanel jPanelAccionesFormularioDetalleChequeGirado;
    
	
	
	protected Integer iXPanelCamposDetalleChequeGirado=0;
	protected Integer iYPanelCamposDetalleChequeGirado=0;
	
	protected Integer iXPanelCamposOcultosDetalleChequeGirado=0;
	protected Integer iYPanelCamposOcultosDetalleChequeGirado=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleChequeGirado;
	public JButton jButtonModificarDetalleChequeGirado;
	public JButton jButtonActualizarDetalleChequeGirado;
    public JButton jButtonEliminarDetalleChequeGirado;
	public JButton jButtonCancelarDetalleChequeGirado;
    public JButton jButtonGuardarCambiosDetalleChequeGirado;
	public JButton jButtonGuardarCambiosTablaDetalleChequeGirado;
	protected JButton jButtonCerrarDetalleChequeGirado;
	
	
	protected JButton jButtonProcesarInformacionDetalleChequeGirado;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleChequeGirado;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleChequeGirado;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleChequeGirado;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleChequeGirado;
	protected JButton jButtonModificarToolBarDetalleChequeGirado;
	protected JButton jButtonActualizarToolBarDetalleChequeGirado;
    protected JButton jButtonEliminarToolBarDetalleChequeGirado;
	protected JButton jButtonCancelarToolBarDetalleChequeGirado;
    protected JButton jButtonGuardarCambiosToolBarDetalleChequeGirado;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleChequeGirado;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleChequeGirado;
	protected JButton jButtonCerrarToolBarDetalleChequeGirado;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleChequeGirado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleChequeGirado;
	protected JMenuItem jMenuItemModificarDetalleChequeGirado;
	protected JMenuItem jMenuItemActualizarDetalleChequeGirado;
    protected JMenuItem jMenuItemEliminarDetalleChequeGirado;
	protected JMenuItem jMenuItemCancelarDetalleChequeGirado;
    protected JMenuItem jMenuItemGuardarCambiosDetalleChequeGirado;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleChequeGirado;
	protected JMenuItem jMenuItemCerrarDetalleChequeGirado;
	protected JMenuItem jMenuItemDetalleCerrarDetalleChequeGirado;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleChequeGirado;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleChequeGirado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleChequeGirado;
	protected JMenuItem jMenuItemMostrarOcultarDetalleChequeGirado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleChequeGirado;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleChequeGirado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleChequeGirado;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleChequeGirado;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleChequeGirado;
	public JLabel jLabelIdDetalleChequeGirado;
	public JLabel jLabelidDetalleChequeGirado;
	public JButton jButtonidDetalleChequeGiradoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_chequeDetalleChequeGirado;
	public JLabel jLabelnumero_chequeDetalleChequeGirado;
	public JTextField jTextFieldnumero_chequeDetalleChequeGirado;
	public JButton jButtonnumero_chequeDetalleChequeGiradoBusqueda= new JButtonMe();

	public JPanel jPanelvalorDetalleChequeGirado;
	public JLabel jLabelvalorDetalleChequeGirado;
	public JTextField jTextFieldvalorDetalleChequeGirado;
	public JButton jButtonvalorDetalleChequeGiradoBusqueda= new JButtonMe();

	public JPanel jPanelcuentaDetalleChequeGirado;
	public JLabel jLabelcuentaDetalleChequeGirado;
	public JTextField jTextFieldcuentaDetalleChequeGirado;
	public JButton jButtoncuentaDetalleChequeGiradoBusqueda= new JButtonMe();

	public JPanel jPanelfechaDetalleChequeGirado;
	public JLabel jLabelfechaDetalleChequeGirado;
	//public JFormattedTextField jDateChooserfechaDetalleChequeGirado;

	public JDateChooser jDateChooserfechaDetalleChequeGirado;
	public JButton jButtonfechaDetalleChequeGiradoBusqueda= new JButtonMe();

	public JPanel jPanelconDetalleChequeGirado;
	public JLabel jLabelconDetalleChequeGirado;
	public JCheckBox jCheckBoxconDetalleChequeGirado;
	public JButton jButtonconDetalleChequeGiradoBusqueda= new JButtonMe();

	public JPanel jPanelbeneficiarioDetalleChequeGirado;
	public JLabel jLabelbeneficiarioDetalleChequeGirado;
	public JTextArea jTextAreabeneficiarioDetalleChequeGirado;
	public JScrollPane jscrollPanebeneficiarioDetalleChequeGirado;
	public JButton jButtonbeneficiarioDetalleChequeGiradoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoDetalleChequeGirado;
	public JLabel jLabelcodigoDetalleChequeGirado;
	public JTextField jTextFieldcodigoDetalleChequeGirado;
	public JButton jButtoncodigoDetalleChequeGiradoBusqueda= new JButtonMe();

	public JPanel jPanelnombre_bancoDetalleChequeGirado;
	public JLabel jLabelnombre_bancoDetalleChequeGirado;
	public JTextArea jTextAreanombre_bancoDetalleChequeGirado;
	public JScrollPane jscrollPanenombre_bancoDetalleChequeGirado;
	public JButton jButtonnombre_bancoDetalleChequeGiradoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDetalleChequeGirado;
	public JLabel jLabelid_empresaDetalleChequeGirado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetalleChequeGirado;
	public JButton jButtonid_empresaDetalleChequeGirado= new JButtonMe();
	public JButton jButtonid_empresaDetalleChequeGiradoUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetalleChequeGiradoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetalleChequeGirado;
	public JLabel jLabelid_sucursalDetalleChequeGirado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetalleChequeGirado;
	public JButton jButtonid_sucursalDetalleChequeGirado= new JButtonMe();
	public JButton jButtonid_sucursalDetalleChequeGiradoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetalleChequeGiradoBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioDetalleChequeGirado;
	public JLabel jLabelid_ejercicioDetalleChequeGirado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioDetalleChequeGirado;
	public JButton jButtonid_ejercicioDetalleChequeGirado= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleChequeGiradoUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleChequeGiradoBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoDetalleChequeGirado;
	public JLabel jLabelid_periodoDetalleChequeGirado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoDetalleChequeGirado;
	public JButton jButtonid_periodoDetalleChequeGirado= new JButtonMe();
	public JButton jButtonid_periodoDetalleChequeGiradoUpdate= new JButtonMe();
	public JButton jButtonid_periodoDetalleChequeGiradoBusqueda= new JButtonMe();

	public JPanel jPanelid_asiento_contableDetalleChequeGirado;
	public JLabel jLabelid_asiento_contableDetalleChequeGirado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableDetalleChequeGirado;
	public JButton jButtonid_asiento_contableDetalleChequeGirado= new JButtonMe();
	public JButton jButtonid_asiento_contableDetalleChequeGiradoUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableDetalleChequeGiradoBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoDetalleChequeGirado;
	public JLabel jLabelid_empleadoDetalleChequeGirado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoDetalleChequeGirado;
	public JButton jButtonid_empleadoDetalleChequeGirado= new JButtonMe();
	public JButton jButtonid_empleadoDetalleChequeGiradoUpdate= new JButtonMe();
	public JButton jButtonid_empleadoDetalleChequeGiradoBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_bancoDetalleChequeGirado;
	public JLabel jLabelid_cuenta_bancoDetalleChequeGirado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_bancoDetalleChequeGirado;
	public JButton jButtonid_cuenta_bancoDetalleChequeGirado= new JButtonMe();
	public JButton jButtonid_cuenta_bancoDetalleChequeGiradoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_bancoDetalleChequeGiradoBusqueda= new JButtonMe();

	public JPanel jPanelid_anioDetalleChequeGirado;
	public JLabel jLabelid_anioDetalleChequeGirado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioDetalleChequeGirado;
	public JButton jButtonid_anioDetalleChequeGirado= new JButtonMe();
	public JButton jButtonid_anioDetalleChequeGiradoUpdate= new JButtonMe();
	public JButton jButtonid_anioDetalleChequeGiradoBusqueda= new JButtonMe();

	public JPanel jPanelid_mesDetalleChequeGirado;
	public JLabel jLabelid_mesDetalleChequeGirado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesDetalleChequeGirado;
	public JButton jButtonid_mesDetalleChequeGirado= new JButtonMe();
	public JButton jButtonid_mesDetalleChequeGiradoUpdate= new JButtonMe();
	public JButton jButtonid_mesDetalleChequeGiradoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleChequeGirado;
	
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
	public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetalleChequeGiradoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleChequeGirado=new JPanel();
				this.jPanelAccionesFormularioDetalleChequeGirado=new JPanel();
				this.jmenuBarDetalleDetalleChequeGirado=new JMenuBar();
				this.jTtoolBarDetalleDetalleChequeGirado=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleChequeGiradoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleChequeGirado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleChequeGiradoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleChequeGirado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleChequeGiradoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleChequeGirado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleChequeGiradoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleChequeGirado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleChequeGiradoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleChequeGirado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetalleChequeGirado() {
		return this.jButtonActualizarToolBarDetalleChequeGirado;
	}
	
	public JButton getjButtonEliminarToolBarDetalleChequeGirado() {
		return this.jButtonEliminarToolBarDetalleChequeGirado;
	}
	
	public JButton getjButtonCancelarToolBarDetalleChequeGirado() {
		return this.jButtonCancelarToolBarDetalleChequeGirado;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleChequeGirado() {
		return this.jButtonProcesarInformacionDetalleChequeGirado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleChequeGirado)	{
		this.jButtonProcesarInformacionDetalleChequeGirado = jButtonProcesarInformacionDetalleChequeGirado;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleChequeGirado() {
		return this.jComboBoxTiposAccionesDetalleChequeGirado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleChequeGirado(
			JComboBox jComboBoxTiposRelacionesDetalleChequeGirado) {
		this.jComboBoxTiposRelacionesDetalleChequeGirado = jComboBoxTiposRelacionesDetalleChequeGirado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleChequeGirado(
			JComboBox jComboBoxTiposAccionesDetalleChequeGirado) {
		this.jComboBoxTiposAccionesDetalleChequeGirado = jComboBoxTiposAccionesDetalleChequeGirado;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleChequeGirado() {
		return this.jComboBoxTiposAccionesFormularioDetalleChequeGirado;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleChequeGirado(
			JComboBox jComboBoxTiposAccionesFormularioDetalleChequeGirado) {
		this.jComboBoxTiposAccionesFormularioDetalleChequeGirado = jComboBoxTiposAccionesFormularioDetalleChequeGirado;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detallechequegiradoSessionBean=new DetalleChequeGiradoSessionBean();
		
		this.detallechequegiradoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallechequegiradoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallechequegiradoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleChequeGiradoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleChequeGiradoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleChequeGiradoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Cheque Girado MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleChequeGiradoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleChequeGirado= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleChequeGirado=new JButtonMe();
				this.jButtonModificarToolBarDetalleChequeGirado=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleChequeGirado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleChequeGirado,this.jTtoolBarDetalleDetalleChequeGirado,
							"actualizar","actualizar","Actualizar"+" "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleChequeGirado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleChequeGirado,this.jTtoolBarDetalleDetalleChequeGirado,
							"eliminar","eliminar","Eliminar"+" "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleChequeGirado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleChequeGirado,this.jTtoolBarDetalleDetalleChequeGirado,
							"cancelar","cancelar","Cancelar"+" "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleChequeGirado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleChequeGirado,this.jTtoolBarDetalleDetalleChequeGirado,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleChequeGirado=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleChequeGirado=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleChequeGirado=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleChequeGirado=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleChequeGirado=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleChequeGirado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleChequeGirado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleChequeGirado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleChequeGirado= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleChequeGirado.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleChequeGirado,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleChequeGirado= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleChequeGirado.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleChequeGirado,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleChequeGirado= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleChequeGirado.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleChequeGirado,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleChequeGirado= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleChequeGirado.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleChequeGirado,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleChequeGirado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleChequeGirado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleChequeGirado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleChequeGirado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleChequeGirado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleChequeGirado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleChequeGirado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleChequeGirado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleChequeGirado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleChequeGirado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleChequeGirado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleChequeGirado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleChequeGirado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleChequeGirado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleChequeGirado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleChequeGirado.add(this.jMenuItemDetalleCerrarDetalleChequeGirado);
		
		this.jmenuDetalleAccionesDetalleChequeGirado.add(this.jMenuItemActualizarDetalleChequeGirado);
		this.jmenuDetalleAccionesDetalleChequeGirado.add(this.jMenuItemEliminarDetalleChequeGirado);
		this.jmenuDetalleAccionesDetalleChequeGirado.add(this.jMenuItemCancelarDetalleChequeGirado);		
		
		//this.jmenuDetalleDatosDetalleChequeGirado.add(this.jMenuItemDetalleAbrirOrderByDetalleChequeGirado);				
		this.jmenuDetalleDatosDetalleChequeGirado.add(this.jMenuItemDetalleMostarOcultarDetalleChequeGirado);				
				
		//this.jmenuDetalleAccionesDetalleChequeGirado.add(this.jMenuItemGuardarCambiosDetalleChequeGirado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleChequeGirado.add(this.jmenuDetalleArchivoDetalleChequeGirado);		
		this.jmenuBarDetalleDetalleChequeGirado.add(this.jmenuDetalleAccionesDetalleChequeGirado);		
		this.jmenuBarDetalleDetalleChequeGirado.add(this.jmenuDetalleDatosDetalleChequeGirado);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleChequeGirado);				
	}
	
	
	public void inicializarElementosCamposDetalleChequeGirado() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleChequeGirado = new JLabelMe();
		jLabelIdDetalleChequeGirado.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleChequeGirado = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleChequeGirado.setToolTipText(DetalleChequeGiradoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleChequeGirado= new GridBagLayout();

		this.jPanelidDetalleChequeGirado.setLayout(this.gridaBagLayoutDetalleChequeGirado);

		jLabelidDetalleChequeGirado = new JLabel();
		jLabelidDetalleChequeGirado.setText("Id");

		jLabelidDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_chequeDetalleChequeGirado = new JLabelMe();
		this.jLabelnumero_chequeDetalleChequeGirado.setText(""+DetalleChequeGiradoConstantesFunciones.LABEL_NUMEROCHEQUE+" : *");
		this.jLabelnumero_chequeDetalleChequeGirado.setToolTipText("Numero Cheque");
		this.jLabelnumero_chequeDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_chequeDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_chequeDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_chequeDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_chequeDetalleChequeGirado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_chequeDetalleChequeGirado.setToolTipText(DetalleChequeGiradoConstantesFunciones.LABEL_NUMEROCHEQUE);
		this.gridaBagLayoutDetalleChequeGirado = new GridBagLayout();
		this.jPanelnumero_chequeDetalleChequeGirado.setLayout(this.gridaBagLayoutDetalleChequeGirado);


		jTextFieldnumero_chequeDetalleChequeGirado= new JTextFieldMe();

		jTextFieldnumero_chequeDetalleChequeGirado.setEnabled(false);
		jTextFieldnumero_chequeDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_chequeDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_chequeDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_chequeDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_chequeDetalleChequeGiradoBusqueda= new JButtonMe();
		this.jButtonnumero_chequeDetalleChequeGiradoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_chequeDetalleChequeGiradoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_chequeDetalleChequeGiradoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_chequeDetalleChequeGiradoBusqueda.setText("U");
		this.jButtonnumero_chequeDetalleChequeGiradoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_chequeDetalleChequeGiradoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_chequeDetalleChequeGiradoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_chequeDetalleChequeGirado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_chequeDetalleChequeGirado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_chequeDetalleChequeGiradoBusqueda"));

		if(this.detallechequegiradoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_chequeDetalleChequeGiradoBusqueda.setVisible(false);		}


					
		this.jLabelvalorDetalleChequeGirado = new JLabelMe();
		this.jLabelvalorDetalleChequeGirado.setText(""+DetalleChequeGiradoConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorDetalleChequeGirado.setToolTipText("Valor");
		this.jLabelvalorDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorDetalleChequeGirado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorDetalleChequeGirado.setToolTipText(DetalleChequeGiradoConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutDetalleChequeGirado = new GridBagLayout();
		this.jPanelvalorDetalleChequeGirado.setLayout(this.gridaBagLayoutDetalleChequeGirado);


		jTextFieldvalorDetalleChequeGirado= new JTextFieldMe();
		jTextFieldvalorDetalleChequeGirado.setEnabled(false);
		jTextFieldvalorDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorDetalleChequeGirado.setText("0.0");

		this.jButtonvalorDetalleChequeGiradoBusqueda= new JButtonMe();
		this.jButtonvalorDetalleChequeGiradoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorDetalleChequeGiradoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorDetalleChequeGiradoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorDetalleChequeGiradoBusqueda.setText("U");
		this.jButtonvalorDetalleChequeGiradoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorDetalleChequeGiradoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorDetalleChequeGiradoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorDetalleChequeGirado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorDetalleChequeGirado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorDetalleChequeGiradoBusqueda"));

		if(this.detallechequegiradoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorDetalleChequeGiradoBusqueda.setVisible(false);		}


					
		this.jLabelcuentaDetalleChequeGirado = new JLabelMe();
		this.jLabelcuentaDetalleChequeGirado.setText(""+DetalleChequeGiradoConstantesFunciones.LABEL_CUENTA+" : *");
		this.jLabelcuentaDetalleChequeGirado.setToolTipText("Cuenta");
		this.jLabelcuentaDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcuentaDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcuentaDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcuentaDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcuentaDetalleChequeGirado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcuentaDetalleChequeGirado.setToolTipText(DetalleChequeGiradoConstantesFunciones.LABEL_CUENTA);
		this.gridaBagLayoutDetalleChequeGirado = new GridBagLayout();
		this.jPanelcuentaDetalleChequeGirado.setLayout(this.gridaBagLayoutDetalleChequeGirado);


		jTextFieldcuentaDetalleChequeGirado= new JTextFieldMe();

		jTextFieldcuentaDetalleChequeGirado.setEnabled(false);
		jTextFieldcuentaDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcuentaDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcuentaDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcuentaDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncuentaDetalleChequeGiradoBusqueda= new JButtonMe();
		this.jButtoncuentaDetalleChequeGiradoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncuentaDetalleChequeGiradoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncuentaDetalleChequeGiradoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncuentaDetalleChequeGiradoBusqueda.setText("U");
		this.jButtoncuentaDetalleChequeGiradoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncuentaDetalleChequeGiradoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncuentaDetalleChequeGiradoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcuentaDetalleChequeGirado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcuentaDetalleChequeGirado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cuentaDetalleChequeGiradoBusqueda"));

		if(this.detallechequegiradoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncuentaDetalleChequeGiradoBusqueda.setVisible(false);		}


					
		this.jLabelfechaDetalleChequeGirado = new JLabelMe();
		this.jLabelfechaDetalleChequeGirado.setText(""+DetalleChequeGiradoConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaDetalleChequeGirado.setToolTipText("Fecha");
		this.jLabelfechaDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaDetalleChequeGirado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaDetalleChequeGirado.setToolTipText(DetalleChequeGiradoConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutDetalleChequeGirado = new GridBagLayout();
		this.jPanelfechaDetalleChequeGirado.setLayout(this.gridaBagLayoutDetalleChequeGirado);


		//jFormattedTextFieldfechaDetalleChequeGirado= new JFormattedTextFieldMe();

		jDateChooserfechaDetalleChequeGirado= new JDateChooser();
		jDateChooserfechaDetalleChequeGirado.setEnabled(false);
		jDateChooserfechaDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaDetalleChequeGirado.setDate(new Date());
		jDateChooserfechaDetalleChequeGirado.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaDetalleChequeGirado.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaDetalleChequeGiradoBusqueda= new JButtonMe();
		this.jButtonfechaDetalleChequeGiradoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaDetalleChequeGiradoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaDetalleChequeGiradoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaDetalleChequeGiradoBusqueda.setText("U");
		this.jButtonfechaDetalleChequeGiradoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaDetalleChequeGiradoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaDetalleChequeGiradoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaDetalleChequeGirado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaDetalleChequeGirado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaDetalleChequeGiradoBusqueda"));

		if(this.detallechequegiradoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaDetalleChequeGiradoBusqueda.setVisible(false);		}


					
		this.jLabelconDetalleChequeGirado = new JLabelMe();
		this.jLabelconDetalleChequeGirado.setText(""+DetalleChequeGiradoConstantesFunciones.LABEL_CON+" : *");
		this.jLabelconDetalleChequeGirado.setToolTipText("Con");
		this.jLabelconDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelconDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelconDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelconDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelconDetalleChequeGirado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelconDetalleChequeGirado.setToolTipText(DetalleChequeGiradoConstantesFunciones.LABEL_CON);
		this.gridaBagLayoutDetalleChequeGirado = new GridBagLayout();
		this.jPanelconDetalleChequeGirado.setLayout(this.gridaBagLayoutDetalleChequeGirado);


		jCheckBoxconDetalleChequeGirado= new JCheckBoxMe();
		jCheckBoxconDetalleChequeGirado.setEnabled(false);

		jCheckBoxconDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxconDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxconDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxconDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonconDetalleChequeGiradoBusqueda= new JButtonMe();
		this.jButtonconDetalleChequeGiradoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonconDetalleChequeGiradoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonconDetalleChequeGiradoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonconDetalleChequeGiradoBusqueda.setText("U");
		this.jButtonconDetalleChequeGiradoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonconDetalleChequeGiradoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonconDetalleChequeGiradoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxconDetalleChequeGirado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxconDetalleChequeGirado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"conDetalleChequeGiradoBusqueda"));

		if(this.detallechequegiradoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonconDetalleChequeGiradoBusqueda.setVisible(false);		}


					
		this.jLabelbeneficiarioDetalleChequeGirado = new JLabelMe();
		this.jLabelbeneficiarioDetalleChequeGirado.setText(""+DetalleChequeGiradoConstantesFunciones.LABEL_BENEFICIARIO+" : *");
		this.jLabelbeneficiarioDetalleChequeGirado.setToolTipText("Beneficiario");
		this.jLabelbeneficiarioDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbeneficiarioDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbeneficiarioDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbeneficiarioDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbeneficiarioDetalleChequeGirado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbeneficiarioDetalleChequeGirado.setToolTipText(DetalleChequeGiradoConstantesFunciones.LABEL_BENEFICIARIO);
		this.gridaBagLayoutDetalleChequeGirado = new GridBagLayout();
		this.jPanelbeneficiarioDetalleChequeGirado.setLayout(this.gridaBagLayoutDetalleChequeGirado);


		jTextAreabeneficiarioDetalleChequeGirado= new JTextAreaMe();
		jTextAreabeneficiarioDetalleChequeGirado.setEnabled(false);
		jTextAreabeneficiarioDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioDetalleChequeGirado.setLineWrap(true);
		jTextAreabeneficiarioDetalleChequeGirado.setWrapStyleWord(true);
		jTextAreabeneficiarioDetalleChequeGirado.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreabeneficiarioDetalleChequeGirado.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreabeneficiarioDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanebeneficiarioDetalleChequeGirado = new JScrollPane(jTextAreabeneficiarioDetalleChequeGirado);
		jscrollPanebeneficiarioDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanebeneficiarioDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanebeneficiarioDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonbeneficiarioDetalleChequeGiradoBusqueda= new JButtonMe();
		this.jButtonbeneficiarioDetalleChequeGiradoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbeneficiarioDetalleChequeGiradoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbeneficiarioDetalleChequeGiradoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbeneficiarioDetalleChequeGiradoBusqueda.setText("U");
		this.jButtonbeneficiarioDetalleChequeGiradoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbeneficiarioDetalleChequeGiradoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbeneficiarioDetalleChequeGiradoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreabeneficiarioDetalleChequeGirado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreabeneficiarioDetalleChequeGirado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"beneficiarioDetalleChequeGiradoBusqueda"));

		if(this.detallechequegiradoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbeneficiarioDetalleChequeGiradoBusqueda.setVisible(false);		}


					
		this.jLabelcodigoDetalleChequeGirado = new JLabelMe();
		this.jLabelcodigoDetalleChequeGirado.setText(""+DetalleChequeGiradoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoDetalleChequeGirado.setToolTipText("Codigo");
		this.jLabelcodigoDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoDetalleChequeGirado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoDetalleChequeGirado.setToolTipText(DetalleChequeGiradoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutDetalleChequeGirado = new GridBagLayout();
		this.jPanelcodigoDetalleChequeGirado.setLayout(this.gridaBagLayoutDetalleChequeGirado);


		jTextFieldcodigoDetalleChequeGirado= new JTextFieldMe();

		jTextFieldcodigoDetalleChequeGirado.setEnabled(false);
		jTextFieldcodigoDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoDetalleChequeGiradoBusqueda= new JButtonMe();
		this.jButtoncodigoDetalleChequeGiradoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoDetalleChequeGiradoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoDetalleChequeGiradoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoDetalleChequeGiradoBusqueda.setText("U");
		this.jButtoncodigoDetalleChequeGiradoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoDetalleChequeGiradoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoDetalleChequeGiradoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoDetalleChequeGirado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoDetalleChequeGirado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoDetalleChequeGiradoBusqueda"));

		if(this.detallechequegiradoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoDetalleChequeGiradoBusqueda.setVisible(false);		}


					
		this.jLabelnombre_bancoDetalleChequeGirado = new JLabelMe();
		this.jLabelnombre_bancoDetalleChequeGirado.setText(""+DetalleChequeGiradoConstantesFunciones.LABEL_NOMBREBANCO+" : *");
		this.jLabelnombre_bancoDetalleChequeGirado.setToolTipText("Nombre Banco");
		this.jLabelnombre_bancoDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bancoDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bancoDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_bancoDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_bancoDetalleChequeGirado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_bancoDetalleChequeGirado.setToolTipText(DetalleChequeGiradoConstantesFunciones.LABEL_NOMBREBANCO);
		this.gridaBagLayoutDetalleChequeGirado = new GridBagLayout();
		this.jPanelnombre_bancoDetalleChequeGirado.setLayout(this.gridaBagLayoutDetalleChequeGirado);


		jTextAreanombre_bancoDetalleChequeGirado= new JTextAreaMe();
		jTextAreanombre_bancoDetalleChequeGirado.setEnabled(false);
		jTextAreanombre_bancoDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bancoDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bancoDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bancoDetalleChequeGirado.setLineWrap(true);
		jTextAreanombre_bancoDetalleChequeGirado.setWrapStyleWord(true);
		jTextAreanombre_bancoDetalleChequeGirado.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_bancoDetalleChequeGirado.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_bancoDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_bancoDetalleChequeGirado = new JScrollPane(jTextAreanombre_bancoDetalleChequeGirado);
		jscrollPanenombre_bancoDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_bancoDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_bancoDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_bancoDetalleChequeGiradoBusqueda= new JButtonMe();
		this.jButtonnombre_bancoDetalleChequeGiradoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bancoDetalleChequeGiradoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bancoDetalleChequeGiradoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_bancoDetalleChequeGiradoBusqueda.setText("U");
		this.jButtonnombre_bancoDetalleChequeGiradoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_bancoDetalleChequeGiradoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_bancoDetalleChequeGiradoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_bancoDetalleChequeGirado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_bancoDetalleChequeGirado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_bancoDetalleChequeGiradoBusqueda"));

		if(this.detallechequegiradoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_bancoDetalleChequeGiradoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleChequeGirado() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDetalleChequeGirado = new JLabelMe();
		this.jLabelid_empresaDetalleChequeGirado.setText(""+DetalleChequeGiradoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetalleChequeGirado.setToolTipText("Empresa");
		this.jLabelid_empresaDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetalleChequeGirado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetalleChequeGirado.setToolTipText(DetalleChequeGiradoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetalleChequeGirado = new GridBagLayout();
		this.jPanelid_empresaDetalleChequeGirado.setLayout(this.gridaBagLayoutDetalleChequeGirado);


		jComboBoxid_empresaDetalleChequeGirado= new JComboBoxMe();
		jComboBoxid_empresaDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetalleChequeGirado.setEnabled(false);

		this.jButtonid_empresaDetalleChequeGirado= new JButtonMe();
		this.jButtonid_empresaDetalleChequeGirado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleChequeGirado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleChequeGirado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleChequeGirado.setText("Buscar");
		this.jButtonid_empresaDetalleChequeGirado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetalleChequeGirado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleChequeGirado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetalleChequeGirado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleChequeGirado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleChequeGirado"));

		this.jButtonid_empresaDetalleChequeGiradoBusqueda= new JButtonMe();
		this.jButtonid_empresaDetalleChequeGiradoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleChequeGiradoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleChequeGiradoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleChequeGiradoBusqueda.setText("U");
		this.jButtonid_empresaDetalleChequeGiradoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetalleChequeGiradoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleChequeGiradoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetalleChequeGirado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleChequeGirado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleChequeGiradoBusqueda"));

		if(this.detallechequegiradoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetalleChequeGiradoBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetalleChequeGiradoUpdate= new JButtonMe();
		this.jButtonid_empresaDetalleChequeGiradoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleChequeGiradoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleChequeGiradoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleChequeGiradoUpdate.setText("U");
		this.jButtonid_empresaDetalleChequeGiradoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetalleChequeGiradoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleChequeGiradoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetalleChequeGirado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleChequeGirado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleChequeGiradoUpdate"));



					
		this.jLabelid_sucursalDetalleChequeGirado = new JLabelMe();
		this.jLabelid_sucursalDetalleChequeGirado.setText(""+DetalleChequeGiradoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetalleChequeGirado.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetalleChequeGirado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetalleChequeGirado.setToolTipText(DetalleChequeGiradoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetalleChequeGirado = new GridBagLayout();
		this.jPanelid_sucursalDetalleChequeGirado.setLayout(this.gridaBagLayoutDetalleChequeGirado);


		jComboBoxid_sucursalDetalleChequeGirado= new JComboBoxMe();
		jComboBoxid_sucursalDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetalleChequeGirado.setEnabled(false);

		this.jButtonid_sucursalDetalleChequeGirado= new JButtonMe();
		this.jButtonid_sucursalDetalleChequeGirado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleChequeGirado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleChequeGirado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleChequeGirado.setText("Buscar");
		this.jButtonid_sucursalDetalleChequeGirado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetalleChequeGirado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleChequeGirado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetalleChequeGirado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleChequeGirado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleChequeGirado"));

		this.jButtonid_sucursalDetalleChequeGiradoBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetalleChequeGiradoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleChequeGiradoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleChequeGiradoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleChequeGiradoBusqueda.setText("U");
		this.jButtonid_sucursalDetalleChequeGiradoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetalleChequeGiradoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleChequeGiradoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetalleChequeGirado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleChequeGirado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleChequeGiradoBusqueda"));

		if(this.detallechequegiradoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetalleChequeGiradoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetalleChequeGiradoUpdate= new JButtonMe();
		this.jButtonid_sucursalDetalleChequeGiradoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleChequeGiradoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleChequeGiradoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleChequeGiradoUpdate.setText("U");
		this.jButtonid_sucursalDetalleChequeGiradoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetalleChequeGiradoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleChequeGiradoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetalleChequeGirado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleChequeGirado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleChequeGiradoUpdate"));



					
		this.jLabelid_ejercicioDetalleChequeGirado = new JLabelMe();
		this.jLabelid_ejercicioDetalleChequeGirado.setText(""+DetalleChequeGiradoConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioDetalleChequeGirado.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioDetalleChequeGirado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioDetalleChequeGirado.setToolTipText(DetalleChequeGiradoConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutDetalleChequeGirado = new GridBagLayout();
		this.jPanelid_ejercicioDetalleChequeGirado.setLayout(this.gridaBagLayoutDetalleChequeGirado);


		jComboBoxid_ejercicioDetalleChequeGirado= new JComboBoxMe();
		jComboBoxid_ejercicioDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioDetalleChequeGirado.setEnabled(false);

		this.jButtonid_ejercicioDetalleChequeGirado= new JButtonMe();
		this.jButtonid_ejercicioDetalleChequeGirado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleChequeGirado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleChequeGirado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleChequeGirado.setText("Buscar");
		this.jButtonid_ejercicioDetalleChequeGirado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioDetalleChequeGirado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleChequeGirado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioDetalleChequeGirado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleChequeGirado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleChequeGirado"));

		this.jButtonid_ejercicioDetalleChequeGiradoBusqueda= new JButtonMe();
		this.jButtonid_ejercicioDetalleChequeGiradoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleChequeGiradoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleChequeGiradoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleChequeGiradoBusqueda.setText("U");
		this.jButtonid_ejercicioDetalleChequeGiradoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioDetalleChequeGiradoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleChequeGiradoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioDetalleChequeGirado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleChequeGirado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleChequeGiradoBusqueda"));

		if(this.detallechequegiradoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioDetalleChequeGiradoBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioDetalleChequeGiradoUpdate= new JButtonMe();
		this.jButtonid_ejercicioDetalleChequeGiradoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleChequeGiradoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleChequeGiradoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleChequeGiradoUpdate.setText("U");
		this.jButtonid_ejercicioDetalleChequeGiradoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioDetalleChequeGiradoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleChequeGiradoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioDetalleChequeGirado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleChequeGirado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleChequeGiradoUpdate"));



					
		this.jLabelid_periodoDetalleChequeGirado = new JLabelMe();
		this.jLabelid_periodoDetalleChequeGirado.setText(""+DetalleChequeGiradoConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoDetalleChequeGirado.setToolTipText("Periodo");
		this.jLabelid_periodoDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoDetalleChequeGirado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoDetalleChequeGirado.setToolTipText(DetalleChequeGiradoConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutDetalleChequeGirado = new GridBagLayout();
		this.jPanelid_periodoDetalleChequeGirado.setLayout(this.gridaBagLayoutDetalleChequeGirado);


		jComboBoxid_periodoDetalleChequeGirado= new JComboBoxMe();
		jComboBoxid_periodoDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoDetalleChequeGirado.setEnabled(false);

		this.jButtonid_periodoDetalleChequeGirado= new JButtonMe();
		this.jButtonid_periodoDetalleChequeGirado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleChequeGirado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleChequeGirado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleChequeGirado.setText("Buscar");
		this.jButtonid_periodoDetalleChequeGirado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoDetalleChequeGirado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleChequeGirado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoDetalleChequeGirado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleChequeGirado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleChequeGirado"));

		this.jButtonid_periodoDetalleChequeGiradoBusqueda= new JButtonMe();
		this.jButtonid_periodoDetalleChequeGiradoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleChequeGiradoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleChequeGiradoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleChequeGiradoBusqueda.setText("U");
		this.jButtonid_periodoDetalleChequeGiradoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoDetalleChequeGiradoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleChequeGiradoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoDetalleChequeGirado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleChequeGirado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleChequeGiradoBusqueda"));

		if(this.detallechequegiradoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoDetalleChequeGiradoBusqueda.setVisible(false);		}

		this.jButtonid_periodoDetalleChequeGiradoUpdate= new JButtonMe();
		this.jButtonid_periodoDetalleChequeGiradoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleChequeGiradoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleChequeGiradoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleChequeGiradoUpdate.setText("U");
		this.jButtonid_periodoDetalleChequeGiradoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoDetalleChequeGiradoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleChequeGiradoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoDetalleChequeGirado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleChequeGirado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleChequeGiradoUpdate"));



					
		this.jLabelid_asiento_contableDetalleChequeGirado = new JLabelMe();
		this.jLabelid_asiento_contableDetalleChequeGirado.setText(""+DetalleChequeGiradoConstantesFunciones.LABEL_IDASIENTOCONTABLE+" : *");
		this.jLabelid_asiento_contableDetalleChequeGirado.setToolTipText("Asiento Contable");
		this.jLabelid_asiento_contableDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_asiento_contableDetalleChequeGirado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_asiento_contableDetalleChequeGirado.setToolTipText(DetalleChequeGiradoConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		this.gridaBagLayoutDetalleChequeGirado = new GridBagLayout();
		this.jPanelid_asiento_contableDetalleChequeGirado.setLayout(this.gridaBagLayoutDetalleChequeGirado);


		jComboBoxid_asiento_contableDetalleChequeGirado= new JComboBoxMe();
		jComboBoxid_asiento_contableDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_asiento_contableDetalleChequeGirado= new JButtonMe();
		this.jButtonid_asiento_contableDetalleChequeGirado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableDetalleChequeGirado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableDetalleChequeGirado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableDetalleChequeGirado.setText("Buscar");
		this.jButtonid_asiento_contableDetalleChequeGirado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_asiento_contableDetalleChequeGirado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableDetalleChequeGirado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_asiento_contableDetalleChequeGirado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableDetalleChequeGirado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableDetalleChequeGirado"));

		this.jButtonid_asiento_contableDetalleChequeGiradoBusqueda= new JButtonMe();
		this.jButtonid_asiento_contableDetalleChequeGiradoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDetalleChequeGiradoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDetalleChequeGiradoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableDetalleChequeGiradoBusqueda.setText("U");
		this.jButtonid_asiento_contableDetalleChequeGiradoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_asiento_contableDetalleChequeGiradoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableDetalleChequeGiradoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_asiento_contableDetalleChequeGirado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableDetalleChequeGirado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableDetalleChequeGiradoBusqueda"));

		if(this.detallechequegiradoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_asiento_contableDetalleChequeGiradoBusqueda.setVisible(false);		}

		this.jButtonid_asiento_contableDetalleChequeGiradoUpdate= new JButtonMe();
		this.jButtonid_asiento_contableDetalleChequeGiradoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDetalleChequeGiradoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDetalleChequeGiradoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableDetalleChequeGiradoUpdate.setText("U");
		this.jButtonid_asiento_contableDetalleChequeGiradoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_asiento_contableDetalleChequeGiradoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableDetalleChequeGiradoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_asiento_contableDetalleChequeGirado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableDetalleChequeGirado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableDetalleChequeGiradoUpdate"));



					
		this.jLabelid_empleadoDetalleChequeGirado = new JLabelMe();
		this.jLabelid_empleadoDetalleChequeGirado.setText(""+DetalleChequeGiradoConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoDetalleChequeGirado.setToolTipText("Empleado");
		this.jLabelid_empleadoDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoDetalleChequeGirado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoDetalleChequeGirado.setToolTipText(DetalleChequeGiradoConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutDetalleChequeGirado = new GridBagLayout();
		this.jPanelid_empleadoDetalleChequeGirado.setLayout(this.gridaBagLayoutDetalleChequeGirado);


		jComboBoxid_empleadoDetalleChequeGirado= new JComboBoxMe();
		jComboBoxid_empleadoDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoDetalleChequeGirado= new JButtonMe();
		this.jButtonid_empleadoDetalleChequeGirado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoDetalleChequeGirado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoDetalleChequeGirado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoDetalleChequeGirado.setText("Buscar");
		this.jButtonid_empleadoDetalleChequeGirado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoDetalleChequeGirado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoDetalleChequeGirado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoDetalleChequeGirado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoDetalleChequeGirado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoDetalleChequeGirado"));

		this.jButtonid_empleadoDetalleChequeGiradoBusqueda= new JButtonMe();
		this.jButtonid_empleadoDetalleChequeGiradoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoDetalleChequeGiradoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoDetalleChequeGiradoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoDetalleChequeGiradoBusqueda.setText("U");
		this.jButtonid_empleadoDetalleChequeGiradoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoDetalleChequeGiradoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoDetalleChequeGiradoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoDetalleChequeGirado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoDetalleChequeGirado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoDetalleChequeGiradoBusqueda"));

		if(this.detallechequegiradoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoDetalleChequeGiradoBusqueda.setVisible(false);		}

		this.jButtonid_empleadoDetalleChequeGiradoUpdate= new JButtonMe();
		this.jButtonid_empleadoDetalleChequeGiradoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoDetalleChequeGiradoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoDetalleChequeGiradoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoDetalleChequeGiradoUpdate.setText("U");
		this.jButtonid_empleadoDetalleChequeGiradoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoDetalleChequeGiradoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoDetalleChequeGiradoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoDetalleChequeGirado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoDetalleChequeGirado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoDetalleChequeGiradoUpdate"));



					
		this.jLabelid_cuenta_bancoDetalleChequeGirado = new JLabelMe();
		this.jLabelid_cuenta_bancoDetalleChequeGirado.setText(""+DetalleChequeGiradoConstantesFunciones.LABEL_IDCUENTABANCO+" : *");
		this.jLabelid_cuenta_bancoDetalleChequeGirado.setToolTipText("Cuenta Banco");
		this.jLabelid_cuenta_bancoDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_bancoDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_bancoDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_bancoDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_bancoDetalleChequeGirado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_bancoDetalleChequeGirado.setToolTipText(DetalleChequeGiradoConstantesFunciones.LABEL_IDCUENTABANCO);
		this.gridaBagLayoutDetalleChequeGirado = new GridBagLayout();
		this.jPanelid_cuenta_bancoDetalleChequeGirado.setLayout(this.gridaBagLayoutDetalleChequeGirado);


		jComboBoxid_cuenta_bancoDetalleChequeGirado= new JComboBoxMe();
		jComboBoxid_cuenta_bancoDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_bancoDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_bancoDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_bancoDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_bancoDetalleChequeGirado= new JButtonMe();
		this.jButtonid_cuenta_bancoDetalleChequeGirado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_bancoDetalleChequeGirado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_bancoDetalleChequeGirado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_bancoDetalleChequeGirado.setText("Buscar");
		this.jButtonid_cuenta_bancoDetalleChequeGirado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_bancoDetalleChequeGirado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_bancoDetalleChequeGirado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_bancoDetalleChequeGirado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_bancoDetalleChequeGirado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_bancoDetalleChequeGirado"));

		this.jButtonid_cuenta_bancoDetalleChequeGiradoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_bancoDetalleChequeGiradoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_bancoDetalleChequeGiradoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_bancoDetalleChequeGiradoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_bancoDetalleChequeGiradoBusqueda.setText("U");
		this.jButtonid_cuenta_bancoDetalleChequeGiradoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_bancoDetalleChequeGiradoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_bancoDetalleChequeGiradoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_bancoDetalleChequeGirado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_bancoDetalleChequeGirado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_bancoDetalleChequeGiradoBusqueda"));

		if(this.detallechequegiradoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_bancoDetalleChequeGiradoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_bancoDetalleChequeGiradoUpdate= new JButtonMe();
		this.jButtonid_cuenta_bancoDetalleChequeGiradoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_bancoDetalleChequeGiradoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_bancoDetalleChequeGiradoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_bancoDetalleChequeGiradoUpdate.setText("U");
		this.jButtonid_cuenta_bancoDetalleChequeGiradoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_bancoDetalleChequeGiradoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_bancoDetalleChequeGiradoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_bancoDetalleChequeGirado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_bancoDetalleChequeGirado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_bancoDetalleChequeGiradoUpdate"));



					
		this.jLabelid_anioDetalleChequeGirado = new JLabelMe();
		this.jLabelid_anioDetalleChequeGirado.setText(""+DetalleChequeGiradoConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioDetalleChequeGirado.setToolTipText("Anio");
		this.jLabelid_anioDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioDetalleChequeGirado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioDetalleChequeGirado.setToolTipText(DetalleChequeGiradoConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutDetalleChequeGirado = new GridBagLayout();
		this.jPanelid_anioDetalleChequeGirado.setLayout(this.gridaBagLayoutDetalleChequeGirado);


		jComboBoxid_anioDetalleChequeGirado= new JComboBoxMe();
		jComboBoxid_anioDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioDetalleChequeGirado.setEnabled(false);

		this.jButtonid_anioDetalleChequeGirado= new JButtonMe();
		this.jButtonid_anioDetalleChequeGirado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleChequeGirado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleChequeGirado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleChequeGirado.setText("Buscar");
		this.jButtonid_anioDetalleChequeGirado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioDetalleChequeGirado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleChequeGirado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioDetalleChequeGirado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleChequeGirado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleChequeGirado"));

		this.jButtonid_anioDetalleChequeGiradoBusqueda= new JButtonMe();
		this.jButtonid_anioDetalleChequeGiradoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleChequeGiradoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleChequeGiradoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetalleChequeGiradoBusqueda.setText("U");
		this.jButtonid_anioDetalleChequeGiradoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioDetalleChequeGiradoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleChequeGiradoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioDetalleChequeGirado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleChequeGirado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleChequeGiradoBusqueda"));

		if(this.detallechequegiradoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioDetalleChequeGiradoBusqueda.setVisible(false);		}

		this.jButtonid_anioDetalleChequeGiradoUpdate= new JButtonMe();
		this.jButtonid_anioDetalleChequeGiradoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleChequeGiradoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleChequeGiradoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetalleChequeGiradoUpdate.setText("U");
		this.jButtonid_anioDetalleChequeGiradoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioDetalleChequeGiradoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleChequeGiradoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioDetalleChequeGirado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleChequeGirado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleChequeGiradoUpdate"));



					
		this.jLabelid_mesDetalleChequeGirado = new JLabelMe();
		this.jLabelid_mesDetalleChequeGirado.setText(""+DetalleChequeGiradoConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesDetalleChequeGirado.setToolTipText("Mes");
		this.jLabelid_mesDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesDetalleChequeGirado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesDetalleChequeGirado.setToolTipText(DetalleChequeGiradoConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutDetalleChequeGirado = new GridBagLayout();
		this.jPanelid_mesDetalleChequeGirado.setLayout(this.gridaBagLayoutDetalleChequeGirado);


		jComboBoxid_mesDetalleChequeGirado= new JComboBoxMe();
		jComboBoxid_mesDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesDetalleChequeGirado.setEnabled(false);

		this.jButtonid_mesDetalleChequeGirado= new JButtonMe();
		this.jButtonid_mesDetalleChequeGirado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleChequeGirado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleChequeGirado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleChequeGirado.setText("Buscar");
		this.jButtonid_mesDetalleChequeGirado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesDetalleChequeGirado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleChequeGirado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesDetalleChequeGirado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleChequeGirado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleChequeGirado"));

		this.jButtonid_mesDetalleChequeGiradoBusqueda= new JButtonMe();
		this.jButtonid_mesDetalleChequeGiradoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleChequeGiradoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleChequeGiradoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetalleChequeGiradoBusqueda.setText("U");
		this.jButtonid_mesDetalleChequeGiradoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesDetalleChequeGiradoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleChequeGiradoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesDetalleChequeGirado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleChequeGirado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleChequeGiradoBusqueda"));

		if(this.detallechequegiradoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesDetalleChequeGiradoBusqueda.setVisible(false);		}

		this.jButtonid_mesDetalleChequeGiradoUpdate= new JButtonMe();
		this.jButtonid_mesDetalleChequeGiradoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleChequeGiradoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleChequeGiradoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetalleChequeGiradoUpdate.setText("U");
		this.jButtonid_mesDetalleChequeGiradoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesDetalleChequeGiradoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleChequeGiradoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesDetalleChequeGirado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleChequeGirado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleChequeGiradoUpdate"));



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
		//this.jInternalFrameDetalleDetalleChequeGirado = new DetalleChequeGiradoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Cheque Girado DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleChequeGirado= new GridBagLayout();
		

		
		String sToolTipDetalleChequeGirado="";
		sToolTipDetalleChequeGirado=DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleChequeGirado+="(Tesoreria.DetalleChequeGirado)";
		}
		
		if(!this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleChequeGirado+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleChequeGirado = new JButtonMe();
		this.jButtonModificarDetalleChequeGirado = new JButtonMe();
        this.jButtonActualizarDetalleChequeGirado = new JButtonMe();
        this.jButtonEliminarDetalleChequeGirado = new JButtonMe();
        this.jButtonCancelarDetalleChequeGirado = new JButtonMe();
        this.jButtonGuardarCambiosDetalleChequeGirado = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleChequeGirado = new JButtonMe();
		this.jButtonCerrarDetalleChequeGirado = new JButtonMe();
		
		this.jScrollPanelDatosDetalleChequeGirado = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleChequeGirado = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleChequeGirado = new JScrollPane();
				
		
		
		this.jPanelCamposDetalleChequeGirado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleChequeGirado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleChequeGirado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleChequeGirado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Cheque Girado";
		
		if(!this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleChequeGirado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Cheque Girados" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleChequeGirado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleChequeGirado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleChequeGirado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDetalleChequeGirado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleChequeGirado.setName("jPanelCamposDetalleChequeGirado"); 

		this.jPanelCamposOcultosDetalleChequeGirado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleChequeGirado.setName("jPanelCamposOcultosDetalleChequeGirado"); 

        this.jPanelAccionesDetalleChequeGirado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleChequeGirado.setToolTipText("Acciones");
        this.jPanelAccionesDetalleChequeGirado.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleChequeGirado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleChequeGirado.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleChequeGirado.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleChequeGirado.setText("Nuevo");
		this.jButtonModificarDetalleChequeGirado.setText("Editar");
        this.jButtonActualizarDetalleChequeGirado.setText("Actualizar");
        this.jButtonEliminarDetalleChequeGirado.setText("Eliminar");
        this.jButtonCancelarDetalleChequeGirado.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleChequeGirado.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleChequeGirado.setText("Guardar");
		this.jButtonCerrarDetalleChequeGirado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleChequeGirado,"nuevo_button","Nuevo",this.detallechequegiradoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleChequeGirado,"modificar_button","Editar",this.detallechequegiradoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleChequeGirado,"actualizar_button","Actualizar",this.detallechequegiradoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleChequeGirado,"eliminar_button","Eliminar",this.detallechequegiradoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleChequeGirado,"cancelar_button","Cancelar",this.detallechequegiradoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleChequeGirado,"guardarcambios_button","Guardar",this.detallechequegiradoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleChequeGirado,"guardarcambiostabla_button","Guardar",this.detallechequegiradoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleChequeGirado,"cerrar_button","Salir",this.detallechequegiradoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleChequeGirado.setToolTipText("Nuevo"+" "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleChequeGirado.setToolTipText("Editar"+" "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleChequeGirado.setToolTipText("Actualizar"+" "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleChequeGirado.setToolTipText("Eliminar)"+" "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleChequeGirado.setToolTipText("Cancelar"+" "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleChequeGirado.setToolTipText("Guardar"+" "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleChequeGirado.setToolTipText("Guardar"+" "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleChequeGirado.setToolTipText("Salir"+" "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleChequeGirado";
		inputMap = this.jButtonNuevoDetalleChequeGirado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleChequeGirado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleChequeGirado"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleChequeGirado";
		inputMap = this.jButtonActualizarDetalleChequeGirado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleChequeGirado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleChequeGirado"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleChequeGirado";
		inputMap = this.jButtonEliminarDetalleChequeGirado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleChequeGirado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleChequeGirado"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleChequeGirado";
		inputMap = this.jButtonCancelarDetalleChequeGirado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleChequeGirado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleChequeGirado"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleChequeGirado";
		inputMap = this.jButtonCerrarDetalleChequeGirado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleChequeGirado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleChequeGirado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleChequeGirado";
		inputMap = this.jButtonGuardarCambiosTablaDetalleChequeGirado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleChequeGirado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleChequeGirado"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleChequeGirado = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleChequeGirado.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleChequeGirado.setToolTipText("Nuevo DetalleChequeGirado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleChequeGirado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleChequeGirado.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleChequeGirado.setToolTipText("Sin Cerrar Ventana DetalleChequeGirado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleChequeGirado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleChequeGirado.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleChequeGirado.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetalleChequeGirado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleChequeGirado.setText("Accion");
		this.jComboBoxTiposAccionesDetalleChequeGirado.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetalleChequeGirado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleChequeGirado.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleChequeGirado.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleChequeGirado = new JLabelMe();
		
		this.jLabelAccionesDetalleChequeGirado.setText("Acciones");		
		this.jLabelAccionesDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleChequeGirado();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleChequeGirado();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleChequeGirado=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleChequeGirado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetalleChequeGirado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleChequeGirado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleChequeGirado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetalleChequeGirado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleChequeGirado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleChequeGirado.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleChequeGirado = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleChequeGirado = new GridBagLayout();
		
		this.jPanelCamposDetalleChequeGirado.setLayout(gridaBagLayoutCamposDetalleChequeGirado);
		this.jPanelCamposOcultosDetalleChequeGirado.setLayout(gridaBagLayoutCamposOcultosDetalleChequeGirado);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
	this.gridBagConstraintsDetalleChequeGirado.gridx = 0;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetalleChequeGirado.add(jLabelIdDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);



	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
	this.gridBagConstraintsDetalleChequeGirado.gridx = 1;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetalleChequeGirado.add(jLabelidDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);


	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
	this.gridBagConstraintsDetalleChequeGirado.gridx = 0;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetalleChequeGirado.add(jLabelid_empresaDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		//this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
		this.gridBagConstraintsDetalleChequeGirado.gridx = 2;
		this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
		this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleChequeGirado.add(jButtonid_empresaDetalleChequeGiradoBusqueda, this.gridBagConstraintsDetalleChequeGirado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		//this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
		this.gridBagConstraintsDetalleChequeGirado.gridx = 3;
		this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
		this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleChequeGirado.add(jButtonid_empresaDetalleChequeGiradoUpdate, this.gridBagConstraintsDetalleChequeGirado);
	}

	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
	this.gridBagConstraintsDetalleChequeGirado.gridx = 1;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetalleChequeGirado.add(jComboBoxid_empresaDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);


	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
	this.gridBagConstraintsDetalleChequeGirado.gridx = 0;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDetalleChequeGirado.add(jLabelid_sucursalDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		//this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
		this.gridBagConstraintsDetalleChequeGirado.gridx = 2;
		this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
		this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleChequeGirado.add(jButtonid_sucursalDetalleChequeGiradoBusqueda, this.gridBagConstraintsDetalleChequeGirado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		//this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
		this.gridBagConstraintsDetalleChequeGirado.gridx = 3;
		this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
		this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleChequeGirado.add(jButtonid_sucursalDetalleChequeGiradoUpdate, this.gridBagConstraintsDetalleChequeGirado);
	}

	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
	this.gridBagConstraintsDetalleChequeGirado.gridx = 1;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDetalleChequeGirado.add(jComboBoxid_sucursalDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);


	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
	this.gridBagConstraintsDetalleChequeGirado.gridx = 0;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioDetalleChequeGirado.add(jLabelid_ejercicioDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		//this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
		this.gridBagConstraintsDetalleChequeGirado.gridx = 2;
		this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
		this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleChequeGirado.add(jButtonid_ejercicioDetalleChequeGiradoBusqueda, this.gridBagConstraintsDetalleChequeGirado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		//this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
		this.gridBagConstraintsDetalleChequeGirado.gridx = 3;
		this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
		this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleChequeGirado.add(jButtonid_ejercicioDetalleChequeGiradoUpdate, this.gridBagConstraintsDetalleChequeGirado);
	}

	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
	this.gridBagConstraintsDetalleChequeGirado.gridx = 1;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioDetalleChequeGirado.add(jComboBoxid_ejercicioDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);


	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
	this.gridBagConstraintsDetalleChequeGirado.gridx = 0;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoDetalleChequeGirado.add(jLabelid_periodoDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		//this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
		this.gridBagConstraintsDetalleChequeGirado.gridx = 2;
		this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
		this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleChequeGirado.add(jButtonid_periodoDetalleChequeGiradoBusqueda, this.gridBagConstraintsDetalleChequeGirado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		//this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
		this.gridBagConstraintsDetalleChequeGirado.gridx = 3;
		this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
		this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleChequeGirado.add(jButtonid_periodoDetalleChequeGiradoUpdate, this.gridBagConstraintsDetalleChequeGirado);
	}

	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
	this.gridBagConstraintsDetalleChequeGirado.gridx = 1;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoDetalleChequeGirado.add(jComboBoxid_periodoDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);


	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
	this.gridBagConstraintsDetalleChequeGirado.gridx = 0;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_asiento_contableDetalleChequeGirado.add(jLabelid_asiento_contableDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	//this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
	this.gridBagConstraintsDetalleChequeGirado.gridx = 2;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_asiento_contableDetalleChequeGirado.add(jButtonid_asiento_contableDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		//this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
		this.gridBagConstraintsDetalleChequeGirado.gridx = 3;
		this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
		this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableDetalleChequeGirado.add(jButtonid_asiento_contableDetalleChequeGiradoBusqueda, this.gridBagConstraintsDetalleChequeGirado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		//this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
		this.gridBagConstraintsDetalleChequeGirado.gridx = 4;
		this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
		this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableDetalleChequeGirado.add(jButtonid_asiento_contableDetalleChequeGiradoUpdate, this.gridBagConstraintsDetalleChequeGirado);
	}

	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
	this.gridBagConstraintsDetalleChequeGirado.gridx = 1;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_asiento_contableDetalleChequeGirado.add(jComboBoxid_asiento_contableDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);


	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
	this.gridBagConstraintsDetalleChequeGirado.gridx = 0;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoDetalleChequeGirado.add(jLabelid_empleadoDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	//this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
	this.gridBagConstraintsDetalleChequeGirado.gridx = 2;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoDetalleChequeGirado.add(jButtonid_empleadoDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		//this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
		this.gridBagConstraintsDetalleChequeGirado.gridx = 3;
		this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
		this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoDetalleChequeGirado.add(jButtonid_empleadoDetalleChequeGiradoBusqueda, this.gridBagConstraintsDetalleChequeGirado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		//this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
		this.gridBagConstraintsDetalleChequeGirado.gridx = 4;
		this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
		this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoDetalleChequeGirado.add(jButtonid_empleadoDetalleChequeGiradoUpdate, this.gridBagConstraintsDetalleChequeGirado);
	}

	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
	this.gridBagConstraintsDetalleChequeGirado.gridx = 1;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoDetalleChequeGirado.add(jComboBoxid_empleadoDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);


	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
	this.gridBagConstraintsDetalleChequeGirado.gridx = 0;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_bancoDetalleChequeGirado.add(jLabelid_cuenta_bancoDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		//this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
		this.gridBagConstraintsDetalleChequeGirado.gridx = 2;
		this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
		this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_bancoDetalleChequeGirado.add(jButtonid_cuenta_bancoDetalleChequeGiradoBusqueda, this.gridBagConstraintsDetalleChequeGirado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		//this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
		this.gridBagConstraintsDetalleChequeGirado.gridx = 3;
		this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
		this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_bancoDetalleChequeGirado.add(jButtonid_cuenta_bancoDetalleChequeGiradoUpdate, this.gridBagConstraintsDetalleChequeGirado);
	}

	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
	this.gridBagConstraintsDetalleChequeGirado.gridx = 1;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_bancoDetalleChequeGirado.add(jComboBoxid_cuenta_bancoDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);


	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
	this.gridBagConstraintsDetalleChequeGirado.gridx = 0;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_chequeDetalleChequeGirado.add(jLabelnumero_chequeDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		//this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
		this.gridBagConstraintsDetalleChequeGirado.gridx = 2;
		this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
		this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_chequeDetalleChequeGirado.add(jButtonnumero_chequeDetalleChequeGiradoBusqueda, this.gridBagConstraintsDetalleChequeGirado);
	}

	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
	this.gridBagConstraintsDetalleChequeGirado.gridx = 1;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_chequeDetalleChequeGirado.add(jTextFieldnumero_chequeDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);


	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
	this.gridBagConstraintsDetalleChequeGirado.gridx = 0;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorDetalleChequeGirado.add(jLabelvalorDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		//this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
		this.gridBagConstraintsDetalleChequeGirado.gridx = 2;
		this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
		this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorDetalleChequeGirado.add(jButtonvalorDetalleChequeGiradoBusqueda, this.gridBagConstraintsDetalleChequeGirado);
	}

	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
	this.gridBagConstraintsDetalleChequeGirado.gridx = 1;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorDetalleChequeGirado.add(jTextFieldvalorDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);


	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
	this.gridBagConstraintsDetalleChequeGirado.gridx = 0;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcuentaDetalleChequeGirado.add(jLabelcuentaDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		//this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
		this.gridBagConstraintsDetalleChequeGirado.gridx = 2;
		this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
		this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(0, 0, 0, 0);
		this.jPanelcuentaDetalleChequeGirado.add(jButtoncuentaDetalleChequeGiradoBusqueda, this.gridBagConstraintsDetalleChequeGirado);
	}

	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
	this.gridBagConstraintsDetalleChequeGirado.gridx = 1;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcuentaDetalleChequeGirado.add(jTextFieldcuentaDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);


	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
	this.gridBagConstraintsDetalleChequeGirado.gridx = 0;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaDetalleChequeGirado.add(jLabelfechaDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		//this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
		this.gridBagConstraintsDetalleChequeGirado.gridx = 2;
		this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
		this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaDetalleChequeGirado.add(jButtonfechaDetalleChequeGiradoBusqueda, this.gridBagConstraintsDetalleChequeGirado);
	}

	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
	this.gridBagConstraintsDetalleChequeGirado.gridx = 1;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaDetalleChequeGirado.add(jDateChooserfechaDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);


	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
	this.gridBagConstraintsDetalleChequeGirado.gridx = 0;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelconDetalleChequeGirado.add(jLabelconDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		//this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
		this.gridBagConstraintsDetalleChequeGirado.gridx = 2;
		this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
		this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(0, 0, 0, 0);
		this.jPanelconDetalleChequeGirado.add(jButtonconDetalleChequeGiradoBusqueda, this.gridBagConstraintsDetalleChequeGirado);
	}

	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
	this.gridBagConstraintsDetalleChequeGirado.gridx = 1;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelconDetalleChequeGirado.add(jCheckBoxconDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);


	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
	this.gridBagConstraintsDetalleChequeGirado.gridx = 0;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelbeneficiarioDetalleChequeGirado.add(jLabelbeneficiarioDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		//this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
		this.gridBagConstraintsDetalleChequeGirado.gridx = 2;
		this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
		this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(0, 0, 0, 0);
		this.jPanelbeneficiarioDetalleChequeGirado.add(jButtonbeneficiarioDetalleChequeGiradoBusqueda, this.gridBagConstraintsDetalleChequeGirado);
	}

	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
	this.gridBagConstraintsDetalleChequeGirado.gridx = 1;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelbeneficiarioDetalleChequeGirado.add(jscrollPanebeneficiarioDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);


	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
	this.gridBagConstraintsDetalleChequeGirado.gridx = 0;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoDetalleChequeGirado.add(jLabelcodigoDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		//this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
		this.gridBagConstraintsDetalleChequeGirado.gridx = 2;
		this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
		this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoDetalleChequeGirado.add(jButtoncodigoDetalleChequeGiradoBusqueda, this.gridBagConstraintsDetalleChequeGirado);
	}

	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
	this.gridBagConstraintsDetalleChequeGirado.gridx = 1;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoDetalleChequeGirado.add(jTextFieldcodigoDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);


	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
	this.gridBagConstraintsDetalleChequeGirado.gridx = 0;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_bancoDetalleChequeGirado.add(jLabelnombre_bancoDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		//this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
		this.gridBagConstraintsDetalleChequeGirado.gridx = 2;
		this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
		this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_bancoDetalleChequeGirado.add(jButtonnombre_bancoDetalleChequeGiradoBusqueda, this.gridBagConstraintsDetalleChequeGirado);
	}

	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
	this.gridBagConstraintsDetalleChequeGirado.gridx = 1;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_bancoDetalleChequeGirado.add(jscrollPanenombre_bancoDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);


	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
	this.gridBagConstraintsDetalleChequeGirado.gridx = 0;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioDetalleChequeGirado.add(jLabelid_anioDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		//this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
		this.gridBagConstraintsDetalleChequeGirado.gridx = 2;
		this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
		this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetalleChequeGirado.add(jButtonid_anioDetalleChequeGiradoBusqueda, this.gridBagConstraintsDetalleChequeGirado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		//this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
		this.gridBagConstraintsDetalleChequeGirado.gridx = 3;
		this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
		this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetalleChequeGirado.add(jButtonid_anioDetalleChequeGiradoUpdate, this.gridBagConstraintsDetalleChequeGirado);
	}

	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
	this.gridBagConstraintsDetalleChequeGirado.gridx = 1;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioDetalleChequeGirado.add(jComboBoxid_anioDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);


	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
	this.gridBagConstraintsDetalleChequeGirado.gridx = 0;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesDetalleChequeGirado.add(jLabelid_mesDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		//this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
		this.gridBagConstraintsDetalleChequeGirado.gridx = 2;
		this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
		this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetalleChequeGirado.add(jButtonid_mesDetalleChequeGiradoBusqueda, this.gridBagConstraintsDetalleChequeGirado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		//this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
		this.gridBagConstraintsDetalleChequeGirado.gridx = 3;
		this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
		this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetalleChequeGirado.add(jButtonid_mesDetalleChequeGiradoUpdate, this.gridBagConstraintsDetalleChequeGirado);
	}

	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
	this.gridBagConstraintsDetalleChequeGirado.gridx = 1;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesDetalleChequeGirado.add(jComboBoxid_mesDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleChequeGirado.gridy = iYPanelCamposDetalleChequeGirado;
	this.gridBagConstraintsDetalleChequeGirado.gridx = iXPanelCamposDetalleChequeGirado++;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleChequeGirado.add(this.jPanelidDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);



	if(iXPanelCamposDetalleChequeGirado % 2==0) {
		iXPanelCamposDetalleChequeGirado=0;
		iYPanelCamposDetalleChequeGirado++;
	}
	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleChequeGirado.gridy = iYPanelCamposDetalleChequeGirado;
	this.gridBagConstraintsDetalleChequeGirado.gridx = iXPanelCamposDetalleChequeGirado++;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleChequeGirado.add(this.jPanelid_asiento_contableDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);



	if(iXPanelCamposDetalleChequeGirado % 2==0) {
		iXPanelCamposDetalleChequeGirado=0;
		iYPanelCamposDetalleChequeGirado++;
	}
	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleChequeGirado.gridy = iYPanelCamposDetalleChequeGirado;
	this.gridBagConstraintsDetalleChequeGirado.gridx = iXPanelCamposDetalleChequeGirado++;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleChequeGirado.add(this.jPanelid_empleadoDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);



	if(iXPanelCamposDetalleChequeGirado % 2==0) {
		iXPanelCamposDetalleChequeGirado=0;
		iYPanelCamposDetalleChequeGirado++;
	}
	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleChequeGirado.gridy = iYPanelCamposDetalleChequeGirado;
	this.gridBagConstraintsDetalleChequeGirado.gridx = iXPanelCamposDetalleChequeGirado++;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleChequeGirado.add(this.jPanelid_cuenta_bancoDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);



	if(iXPanelCamposDetalleChequeGirado % 2==0) {
		iXPanelCamposDetalleChequeGirado=0;
		iYPanelCamposDetalleChequeGirado++;
	}
	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleChequeGirado.gridy = iYPanelCamposDetalleChequeGirado;
	this.gridBagConstraintsDetalleChequeGirado.gridx = iXPanelCamposDetalleChequeGirado++;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleChequeGirado.add(this.jPanelnumero_chequeDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);



	if(iXPanelCamposDetalleChequeGirado % 2==0) {
		iXPanelCamposDetalleChequeGirado=0;
		iYPanelCamposDetalleChequeGirado++;
	}
	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleChequeGirado.gridy = iYPanelCamposDetalleChequeGirado;
	this.gridBagConstraintsDetalleChequeGirado.gridx = iXPanelCamposDetalleChequeGirado++;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleChequeGirado.add(this.jPanelvalorDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);



	if(iXPanelCamposDetalleChequeGirado % 2==0) {
		iXPanelCamposDetalleChequeGirado=0;
		iYPanelCamposDetalleChequeGirado++;
	}
	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleChequeGirado.gridy = iYPanelCamposDetalleChequeGirado;
	this.gridBagConstraintsDetalleChequeGirado.gridx = iXPanelCamposDetalleChequeGirado++;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleChequeGirado.add(this.jPanelcuentaDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);



	if(iXPanelCamposDetalleChequeGirado % 2==0) {
		iXPanelCamposDetalleChequeGirado=0;
		iYPanelCamposDetalleChequeGirado++;
	}
	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleChequeGirado.gridy = iYPanelCamposDetalleChequeGirado;
	this.gridBagConstraintsDetalleChequeGirado.gridx = iXPanelCamposDetalleChequeGirado++;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleChequeGirado.add(this.jPanelfechaDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);



	if(iXPanelCamposDetalleChequeGirado % 2==0) {
		iXPanelCamposDetalleChequeGirado=0;
		iYPanelCamposDetalleChequeGirado++;
	}
	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleChequeGirado.gridy = iYPanelCamposDetalleChequeGirado;
	this.gridBagConstraintsDetalleChequeGirado.gridx = iXPanelCamposDetalleChequeGirado++;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleChequeGirado.add(this.jPanelconDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);



	if(iXPanelCamposDetalleChequeGirado % 2==0) {
		iXPanelCamposDetalleChequeGirado=0;
		iYPanelCamposDetalleChequeGirado++;
	}
	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleChequeGirado.gridy = iYPanelCamposDetalleChequeGirado;
	this.gridBagConstraintsDetalleChequeGirado.gridx = iXPanelCamposDetalleChequeGirado++;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleChequeGirado.add(this.jPanelbeneficiarioDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);



	if(iXPanelCamposDetalleChequeGirado % 2==0) {
		iXPanelCamposDetalleChequeGirado=0;
		iYPanelCamposDetalleChequeGirado++;
	}
	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleChequeGirado.gridy = iYPanelCamposDetalleChequeGirado;
	this.gridBagConstraintsDetalleChequeGirado.gridx = iXPanelCamposDetalleChequeGirado++;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleChequeGirado.add(this.jPanelcodigoDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);



	if(iXPanelCamposDetalleChequeGirado % 2==0) {
		iXPanelCamposDetalleChequeGirado=0;
		iYPanelCamposDetalleChequeGirado++;
	}
	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleChequeGirado.gridy = iYPanelCamposDetalleChequeGirado;
	this.gridBagConstraintsDetalleChequeGirado.gridx = iXPanelCamposDetalleChequeGirado++;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleChequeGirado.add(this.jPanelnombre_bancoDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);



	if(iXPanelCamposDetalleChequeGirado % 2==0) {
		iXPanelCamposDetalleChequeGirado=0;
		iYPanelCamposDetalleChequeGirado++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleChequeGirado.gridy = iYPanelCamposOcultosDetalleChequeGirado;
	this.gridBagConstraintsDetalleChequeGirado.gridx = iXPanelCamposOcultosDetalleChequeGirado++;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleChequeGirado.add(this.jPanelid_empresaDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);



	if(iXPanelCamposOcultosDetalleChequeGirado % 2==0) {
		iXPanelCamposOcultosDetalleChequeGirado=0;
		iYPanelCamposOcultosDetalleChequeGirado++;
	}
	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleChequeGirado.gridy = iYPanelCamposOcultosDetalleChequeGirado;
	this.gridBagConstraintsDetalleChequeGirado.gridx = iXPanelCamposOcultosDetalleChequeGirado++;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleChequeGirado.add(this.jPanelid_sucursalDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);



	if(iXPanelCamposOcultosDetalleChequeGirado % 2==0) {
		iXPanelCamposOcultosDetalleChequeGirado=0;
		iYPanelCamposOcultosDetalleChequeGirado++;
	}
	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleChequeGirado.gridy = iYPanelCamposOcultosDetalleChequeGirado;
	this.gridBagConstraintsDetalleChequeGirado.gridx = iXPanelCamposOcultosDetalleChequeGirado++;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleChequeGirado.add(this.jPanelid_ejercicioDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);



	if(iXPanelCamposOcultosDetalleChequeGirado % 2==0) {
		iXPanelCamposOcultosDetalleChequeGirado=0;
		iYPanelCamposOcultosDetalleChequeGirado++;
	}
	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleChequeGirado.gridy = iYPanelCamposOcultosDetalleChequeGirado;
	this.gridBagConstraintsDetalleChequeGirado.gridx = iXPanelCamposOcultosDetalleChequeGirado++;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleChequeGirado.add(this.jPanelid_periodoDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);



	if(iXPanelCamposOcultosDetalleChequeGirado % 2==0) {
		iXPanelCamposOcultosDetalleChequeGirado=0;
		iYPanelCamposOcultosDetalleChequeGirado++;
	}
	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleChequeGirado.gridy = iYPanelCamposOcultosDetalleChequeGirado;
	this.gridBagConstraintsDetalleChequeGirado.gridx = iXPanelCamposOcultosDetalleChequeGirado++;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleChequeGirado.add(this.jPanelid_anioDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);



	if(iXPanelCamposOcultosDetalleChequeGirado % 2==0) {
		iXPanelCamposOcultosDetalleChequeGirado=0;
		iYPanelCamposOcultosDetalleChequeGirado++;
	}
	this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleChequeGirado.gridy = iYPanelCamposOcultosDetalleChequeGirado;
	this.gridBagConstraintsDetalleChequeGirado.gridx = iXPanelCamposOcultosDetalleChequeGirado++;
	this.gridBagConstraintsDetalleChequeGirado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleChequeGirado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleChequeGirado.add(this.jPanelid_mesDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);



	if(iXPanelCamposOcultosDetalleChequeGirado % 2==0) {
		iXPanelCamposOcultosDetalleChequeGirado=0;
		iYPanelCamposOcultosDetalleChequeGirado++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleChequeGirado= new GridBagLayout();
		this.jPanelAccionesDetalleChequeGirado.setLayout(gridaBagLayoutAccionesDetalleChequeGirado);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleChequeGirado= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleChequeGirado.setLayout(gridaBagLayoutAccionesFormularioDetalleChequeGirado);
		
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleChequeGirado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleChequeGirado.add(this.jComboBoxTiposAccionesFormularioDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);

		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleChequeGirado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleChequeGirado.add(this.jCheckBoxPostAccionNuevoDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detallechequegiradoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleChequeGirado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleChequeGirado.add(this.jCheckBoxPostAccionSinCerrarDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detallechequegiradoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detallechequegiradoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleChequeGirado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleChequeGirado.add(this.jCheckBoxPostAccionSinMensajeDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
		this.gridBagConstraintsDetalleChequeGirado.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleChequeGirado.add(this.jButtonModificarDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);							

		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
		this.gridBagConstraintsDetalleChequeGirado.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleChequeGirado.add(this.jButtonEliminarDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
		
			
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.gridy = 0;		
		this.gridBagConstraintsDetalleChequeGirado.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleChequeGirado.add(this.jButtonActualizarDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);


		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.gridy = 0;		
		this.gridBagConstraintsDetalleChequeGirado.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleChequeGirado.add(this.jButtonGuardarCambiosDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);	
		
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.gridy = 0;		
		this.gridBagConstraintsDetalleChequeGirado.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleChequeGirado.add(this.jButtonCancelarDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleChequeGirado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleChequeGirado);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();						
			this.gridBagConstraintsDetalleChequeGirado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleChequeGirado.gridx = 0;		
			//this.gridBagConstraintsDetalleChequeGirado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleChequeGirado.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleChequeGirado.gridx =0;
		this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleChequeGirado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleChequeGiradoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleChequeGirado = new DetalleChequeGiradoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Cheque Girado DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Cheque Girado DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Cheque Girado Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleChequeGiradoModel detallechequegiradoModel=new DetalleChequeGiradoModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleChequeGiradoModel.DetalleChequeGiradoFocusTraversalPolicy detallechequegiradoFocusTraversalPolicy = detallechequegiradoModel.new DetalleChequeGiradoFocusTraversalPolicy(this);
			
			//detallechequegiradoFocusTraversalPolicy.setdetallechequegiradoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detallechequegiradoModel);
			
			
			this.jContentPaneDetalleDetalleChequeGirado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleChequeGirado = new GridBagLayout();	
			this.jContentPaneDetalleDetalleChequeGirado.setLayout(gridaBagLayoutDetalleDetalleChequeGirado);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleChequeGirado = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
				this.gridBagConstraintsDetalleChequeGirado.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleChequeGirado.gridx = 0;
					
				
				this.jContentPaneDetalleDetalleChequeGirado.add(jTtoolBarDetalleDetalleChequeGirado, gridBagConstraintsDetalleChequeGirado);								
				
}
			
			this.jScrollPanelDatosEdicionDetalleChequeGirado=   new JScrollPane(jContentPaneDetalleDetalleChequeGirado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleChequeGirado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleChequeGirado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleChequeGirado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleChequeGirado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleChequeGirado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleChequeGirado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleChequeGirado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetalleChequeGirado.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetalleChequeGirado.gridx = 0;
	        
			this.jContentPaneDetalleDetalleChequeGirado.add(jPanelCamposDetalleChequeGirado, gridBagConstraintsDetalleChequeGirado);
			
			
			
			
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
						&& detallechequegiradoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detallechequegiradoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleChequeGirado= new GridBagConstraints();
						this.gridBagConstraintsDetalleChequeGirado.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleChequeGirado.gridx = 0;
						this.jContentPaneDetalleDetalleChequeGirado.add(this.jTabbedPaneRelacionesDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleChequeGirado.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleChequeGirado.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
					this.gridBagConstraintsDetalleChequeGirado.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleChequeGirado.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleChequeGirado.gridx = 0;
					
				
					this.jContentPaneDetalleDetalleChequeGirado.add(jPanelCamposOcultosDetalleChequeGirado, gridBagConstraintsDetalleChequeGirado);
				
					this.jPanelCamposOcultosDetalleChequeGirado.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetalleChequeGirado.gridx = 0;
	        this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetalleChequeGirado.add(this.jPanelAccionesFormularioDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);							
			
			
			
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
	        this.gridBagConstraintsDetalleChequeGirado.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetalleChequeGirado.gridx = 0;
	        
			
			this.jContentPaneDetalleDetalleChequeGirado.add(this.jPanelAccionesDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleChequeGirado);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleChequeGirado=   new JScrollPane(this.jPanelCamposDetalleChequeGirado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleChequeGirado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleChequeGirado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleChequeGirado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleChequeGirado.gridx = 0;
			this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleChequeGirado.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleChequeGirado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);			
			
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleChequeGirado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleChequeGirado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
			
			
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleChequeGirado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
		
			
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleChequeGirado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleChequeGirado;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleChequeGirado;
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
