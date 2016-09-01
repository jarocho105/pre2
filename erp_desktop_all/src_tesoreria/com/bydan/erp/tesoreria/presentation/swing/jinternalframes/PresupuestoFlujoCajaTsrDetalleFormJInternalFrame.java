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

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.tesoreria.util.PresupuestoFlujoCajaTsrConstantesFunciones;

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
public class PresupuestoFlujoCajaTsrDetalleFormJInternalFrame extends PresupuestoFlujoCajaTsrBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePresupuestoFlujoCajaTsr;
	
	protected JMenuBar jmenuBarDetallePresupuestoFlujoCajaTsr;
	
	protected JMenu jmenuDetallePresupuestoFlujoCajaTsr;
	protected JMenu jmenuDetalleArchivoPresupuestoFlujoCajaTsr;
	protected JMenu jmenuDetalleAccionesPresupuestoFlujoCajaTsr;
	protected JMenu jmenuDetalleDatosPresupuestoFlujoCajaTsr;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePresupuestoFlujoCajaTsr = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPresupuestoFlujoCajaTsr;	
	protected GridBagConstraints gridBagConstraintsPresupuestoFlujoCajaTsr;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PresupuestoFlujoCajaTsrBeanSwingJInternalFrameAdditional jInternalFrameDetallePresupuestoFlujoCajaTsr;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";

	protected CentroActividadBeanSwingJInternalFrame centroactividadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centroactividad="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";
	
	public PresupuestoFlujoCajaTsrSessionBean presupuestoflujocajatsrSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;
	public CentroActividadSessionBean centroactividadSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;	
	
	public PresupuestoFlujoCajaTsrLogic presupuestoflujocajatsrLogic;
	
	public JScrollPane jScrollPanelDatosPresupuestoFlujoCajaTsr;
	public JScrollPane jScrollPanelDatosEdicionPresupuestoFlujoCajaTsr;
	public JScrollPane jScrollPanelDatosGeneralPresupuestoFlujoCajaTsr;
	
	protected JPanel jPanelCamposPresupuestoFlujoCajaTsr;    
	protected JPanel jPanelCamposOcultosPresupuestoFlujoCajaTsr;    	
	protected JPanel jPanelAccionesPresupuestoFlujoCajaTsr;
	protected JPanel jPanelAccionesFormularioPresupuestoFlujoCajaTsr;
    
	
	
	protected Integer iXPanelCamposPresupuestoFlujoCajaTsr=0;
	protected Integer iYPanelCamposPresupuestoFlujoCajaTsr=0;
	
	protected Integer iXPanelCamposOcultosPresupuestoFlujoCajaTsr=0;
	protected Integer iYPanelCamposOcultosPresupuestoFlujoCajaTsr=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPresupuestoFlujoCajaTsr;
	public JButton jButtonModificarPresupuestoFlujoCajaTsr;
	public JButton jButtonActualizarPresupuestoFlujoCajaTsr;
    public JButton jButtonEliminarPresupuestoFlujoCajaTsr;
	public JButton jButtonCancelarPresupuestoFlujoCajaTsr;
    public JButton jButtonGuardarCambiosPresupuestoFlujoCajaTsr;
	public JButton jButtonGuardarCambiosTablaPresupuestoFlujoCajaTsr;
	protected JButton jButtonCerrarPresupuestoFlujoCajaTsr;
	
	
	protected JButton jButtonProcesarInformacionPresupuestoFlujoCajaTsr;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPresupuestoFlujoCajaTsr;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPresupuestoFlujoCajaTsr;
	protected JCheckBox jCheckBoxPostAccionSinMensajePresupuestoFlujoCajaTsr;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPresupuestoFlujoCajaTsr;
	protected JButton jButtonModificarToolBarPresupuestoFlujoCajaTsr;
	protected JButton jButtonActualizarToolBarPresupuestoFlujoCajaTsr;
    protected JButton jButtonEliminarToolBarPresupuestoFlujoCajaTsr;
	protected JButton jButtonCancelarToolBarPresupuestoFlujoCajaTsr;
    protected JButton jButtonGuardarCambiosToolBarPresupuestoFlujoCajaTsr;
	protected JButton jButtonGuardarCambiosTablaToolBarPresupuestoFlujoCajaTsr;
	protected JButton jButtonMostrarOcultarTablaToolBarPresupuestoFlujoCajaTsr;
	protected JButton jButtonCerrarToolBarPresupuestoFlujoCajaTsr;
	
	protected JButton jButtonProcesarInformacionToolBarPresupuestoFlujoCajaTsr;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPresupuestoFlujoCajaTsr;
	protected JMenuItem jMenuItemModificarPresupuestoFlujoCajaTsr;
	protected JMenuItem jMenuItemActualizarPresupuestoFlujoCajaTsr;
    protected JMenuItem jMenuItemEliminarPresupuestoFlujoCajaTsr;
	protected JMenuItem jMenuItemCancelarPresupuestoFlujoCajaTsr;
    protected JMenuItem jMenuItemGuardarCambiosPresupuestoFlujoCajaTsr;
	protected JMenuItem jMenuItemGuardarCambiosTablaPresupuestoFlujoCajaTsr;
	protected JMenuItem jMenuItemCerrarPresupuestoFlujoCajaTsr;
	protected JMenuItem jMenuItemDetalleCerrarPresupuestoFlujoCajaTsr;
	protected JMenuItem jMenuItemDetalleMostarOcultarPresupuestoFlujoCajaTsr;
	
	protected JMenuItem jMenuItemProcesarInformacionPresupuestoFlujoCajaTsr;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPresupuestoFlujoCajaTsr;
	protected JMenuItem jMenuItemMostrarOcultarPresupuestoFlujoCajaTsr;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPresupuestoFlujoCajaTsr;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPresupuestoFlujoCajaTsr;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPresupuestoFlujoCajaTsr;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPresupuestoFlujoCajaTsr;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPresupuestoFlujoCajaTsr;
	public JLabel jLabelIdPresupuestoFlujoCajaTsr;
	public JLabel jLabelidPresupuestoFlujoCajaTsr;
	public JButton jButtonidPresupuestoFlujoCajaTsrBusqueda= new JButtonMe();

	public JPanel jPanelcodigoPresupuestoFlujoCajaTsr;
	public JLabel jLabelcodigoPresupuestoFlujoCajaTsr;
	public JTextField jTextFieldcodigoPresupuestoFlujoCajaTsr;
	public JButton jButtoncodigoPresupuestoFlujoCajaTsrBusqueda= new JButtonMe();

	public JPanel jPanelnombrePresupuestoFlujoCajaTsr;
	public JLabel jLabelnombrePresupuestoFlujoCajaTsr;
	public JTextArea jTextAreanombrePresupuestoFlujoCajaTsr;
	public JScrollPane jscrollPanenombrePresupuestoFlujoCajaTsr;
	public JButton jButtonnombrePresupuestoFlujoCajaTsrBusqueda= new JButtonMe();

	public JPanel jPanelfechaPresupuestoFlujoCajaTsr;
	public JLabel jLabelfechaPresupuestoFlujoCajaTsr;
	//public JFormattedTextField jDateChooserfechaPresupuestoFlujoCajaTsr;

	public JDateChooser jDateChooserfechaPresupuestoFlujoCajaTsr;
	public JButton jButtonfechaPresupuestoFlujoCajaTsrBusqueda= new JButtonMe();

	public JPanel jPanelfecha_presupuestoPresupuestoFlujoCajaTsr;
	public JLabel jLabelfecha_presupuestoPresupuestoFlujoCajaTsr;
	//public JFormattedTextField jDateChooserfecha_presupuestoPresupuestoFlujoCajaTsr;

	public JDateChooser jDateChooserfecha_presupuestoPresupuestoFlujoCajaTsr;
	public JButton jButtonfecha_presupuestoPresupuestoFlujoCajaTsrBusqueda= new JButtonMe();

	public JPanel jPanelvalorPresupuestoFlujoCajaTsr;
	public JLabel jLabelvalorPresupuestoFlujoCajaTsr;
	public JTextField jTextFieldvalorPresupuestoFlujoCajaTsr;
	public JButton jButtonvalorPresupuestoFlujoCajaTsrBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionPresupuestoFlujoCajaTsr;
	public JLabel jLabeldescripcionPresupuestoFlujoCajaTsr;
	public JTextArea jTextAreadescripcionPresupuestoFlujoCajaTsr;
	public JScrollPane jscrollPanedescripcionPresupuestoFlujoCajaTsr;
	public JButton jButtondescripcionPresupuestoFlujoCajaTsrBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPresupuestoFlujoCajaTsr;
	public JLabel jLabelid_empresaPresupuestoFlujoCajaTsr;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPresupuestoFlujoCajaTsr;
	public JButton jButtonid_empresaPresupuestoFlujoCajaTsr= new JButtonMe();
	public JButton jButtonid_empresaPresupuestoFlujoCajaTsrUpdate= new JButtonMe();
	public JButton jButtonid_empresaPresupuestoFlujoCajaTsrBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalPresupuestoFlujoCajaTsr;
	public JLabel jLabelid_sucursalPresupuestoFlujoCajaTsr;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalPresupuestoFlujoCajaTsr;
	public JButton jButtonid_sucursalPresupuestoFlujoCajaTsr= new JButtonMe();
	public JButton jButtonid_sucursalPresupuestoFlujoCajaTsrUpdate= new JButtonMe();
	public JButton jButtonid_sucursalPresupuestoFlujoCajaTsrBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioPresupuestoFlujoCajaTsr;
	public JLabel jLabelid_ejercicioPresupuestoFlujoCajaTsr;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioPresupuestoFlujoCajaTsr;
	public JButton jButtonid_ejercicioPresupuestoFlujoCajaTsr= new JButtonMe();
	public JButton jButtonid_ejercicioPresupuestoFlujoCajaTsrUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioPresupuestoFlujoCajaTsrBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoPresupuestoFlujoCajaTsr;
	public JLabel jLabelid_periodoPresupuestoFlujoCajaTsr;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoPresupuestoFlujoCajaTsr;
	public JButton jButtonid_periodoPresupuestoFlujoCajaTsr= new JButtonMe();
	public JButton jButtonid_periodoPresupuestoFlujoCajaTsrUpdate= new JButtonMe();
	public JButton jButtonid_periodoPresupuestoFlujoCajaTsrBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioPresupuestoFlujoCajaTsr;
	public JLabel jLabelid_usuarioPresupuestoFlujoCajaTsr;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioPresupuestoFlujoCajaTsr;
	public JButton jButtonid_usuarioPresupuestoFlujoCajaTsr= new JButtonMe();
	public JButton jButtonid_usuarioPresupuestoFlujoCajaTsrUpdate= new JButtonMe();
	public JButton jButtonid_usuarioPresupuestoFlujoCajaTsrBusqueda= new JButtonMe();

	public JPanel jPanelid_anioPresupuestoFlujoCajaTsr;
	public JLabel jLabelid_anioPresupuestoFlujoCajaTsr;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioPresupuestoFlujoCajaTsr;
	public JButton jButtonid_anioPresupuestoFlujoCajaTsr= new JButtonMe();
	public JButton jButtonid_anioPresupuestoFlujoCajaTsrUpdate= new JButtonMe();
	public JButton jButtonid_anioPresupuestoFlujoCajaTsrBusqueda= new JButtonMe();

	public JPanel jPanelid_mesPresupuestoFlujoCajaTsr;
	public JLabel jLabelid_mesPresupuestoFlujoCajaTsr;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesPresupuestoFlujoCajaTsr;
	public JButton jButtonid_mesPresupuestoFlujoCajaTsr= new JButtonMe();
	public JButton jButtonid_mesPresupuestoFlujoCajaTsrUpdate= new JButtonMe();
	public JButton jButtonid_mesPresupuestoFlujoCajaTsrBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_movimientoPresupuestoFlujoCajaTsr;
	public JLabel jLabelid_tipo_movimientoPresupuestoFlujoCajaTsr;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimientoPresupuestoFlujoCajaTsr;
	public JButton jButtonid_tipo_movimientoPresupuestoFlujoCajaTsr= new JButtonMe();
	public JButton jButtonid_tipo_movimientoPresupuestoFlujoCajaTsrUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimientoPresupuestoFlujoCajaTsrBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_actividadPresupuestoFlujoCajaTsr;
	public JLabel jLabelid_centro_actividadPresupuestoFlujoCajaTsr;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_actividadPresupuestoFlujoCajaTsr;
	public JButton jButtonid_centro_actividadPresupuestoFlujoCajaTsr= new JButtonMe();
	public JButton jButtonid_centro_actividadPresupuestoFlujoCajaTsrUpdate= new JButtonMe();
	public JButton jButtonid_centro_actividadPresupuestoFlujoCajaTsrBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contablePresupuestoFlujoCajaTsr;
	public JLabel jLabelid_cuenta_contablePresupuestoFlujoCajaTsr;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contablePresupuestoFlujoCajaTsr;
	public JButton jButtonid_cuenta_contablePresupuestoFlujoCajaTsr= new JButtonMe();
	public JButton jButtonid_cuenta_contablePresupuestoFlujoCajaTsrUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contablePresupuestoFlujoCajaTsrBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contablePresupuestoFlujoCajaTsrArbol= new JButtonMe();

	public JPanel jPanelid_centro_costoPresupuestoFlujoCajaTsr;
	public JLabel jLabelid_centro_costoPresupuestoFlujoCajaTsr;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoPresupuestoFlujoCajaTsr;
	public JButton jButtonid_centro_costoPresupuestoFlujoCajaTsr= new JButtonMe();
	public JButton jButtonid_centro_costoPresupuestoFlujoCajaTsrUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoPresupuestoFlujoCajaTsrBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoPresupuestoFlujoCajaTsrArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPresupuestoFlujoCajaTsr;
	
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
	public int iHeightFormulario=858;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PresupuestoFlujoCajaTsrDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPresupuestoFlujoCajaTsr=new JPanel();
				this.jPanelAccionesFormularioPresupuestoFlujoCajaTsr=new JPanel();
				this.jmenuBarDetallePresupuestoFlujoCajaTsr=new JMenuBar();
				this.jTtoolBarDetallePresupuestoFlujoCajaTsr=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoFlujoCajaTsrDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PresupuestoFlujoCajaTsr No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PresupuestoFlujoCajaTsrDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PresupuestoFlujoCajaTsr No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoFlujoCajaTsrDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresupuestoFlujoCajaTsr No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoFlujoCajaTsrDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresupuestoFlujoCajaTsr No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoFlujoCajaTsrDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PresupuestoFlujoCajaTsr No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPresupuestoFlujoCajaTsr() {
		return this.jButtonActualizarToolBarPresupuestoFlujoCajaTsr;
	}
	
	public JButton getjButtonEliminarToolBarPresupuestoFlujoCajaTsr() {
		return this.jButtonEliminarToolBarPresupuestoFlujoCajaTsr;
	}
	
	public JButton getjButtonCancelarToolBarPresupuestoFlujoCajaTsr() {
		return this.jButtonCancelarToolBarPresupuestoFlujoCajaTsr;
	}		
	
	public JButton getjButtonProcesarInformacionPresupuestoFlujoCajaTsr() {
		return this.jButtonProcesarInformacionPresupuestoFlujoCajaTsr;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPresupuestoFlujoCajaTsr)	{
		this.jButtonProcesarInformacionPresupuestoFlujoCajaTsr = jButtonProcesarInformacionPresupuestoFlujoCajaTsr;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPresupuestoFlujoCajaTsr() {
		return this.jComboBoxTiposAccionesPresupuestoFlujoCajaTsr;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPresupuestoFlujoCajaTsr(
			JComboBox jComboBoxTiposRelacionesPresupuestoFlujoCajaTsr) {
		this.jComboBoxTiposRelacionesPresupuestoFlujoCajaTsr = jComboBoxTiposRelacionesPresupuestoFlujoCajaTsr;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPresupuestoFlujoCajaTsr(
			JComboBox jComboBoxTiposAccionesPresupuestoFlujoCajaTsr) {
		this.jComboBoxTiposAccionesPresupuestoFlujoCajaTsr = jComboBoxTiposAccionesPresupuestoFlujoCajaTsr;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPresupuestoFlujoCajaTsr() {
		return this.jComboBoxTiposAccionesFormularioPresupuestoFlujoCajaTsr;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPresupuestoFlujoCajaTsr(
			JComboBox jComboBoxTiposAccionesFormularioPresupuestoFlujoCajaTsr) {
		this.jComboBoxTiposAccionesFormularioPresupuestoFlujoCajaTsr = jComboBoxTiposAccionesFormularioPresupuestoFlujoCajaTsr;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.presupuestoflujocajatsrSessionBean=new PresupuestoFlujoCajaTsrSessionBean();
		
		this.presupuestoflujocajatsrSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presupuestoflujocajatsrSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PresupuestoFlujoCajaTsrJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PresupuestoFlujoCajaTsrJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PresupuestoFlujoCajaTsrJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Presupuesto Flujo Caja MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado()) {
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
	
		PresupuestoFlujoCajaTsrJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePresupuestoFlujoCajaTsr= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPresupuestoFlujoCajaTsr=new JButtonMe();
				this.jButtonModificarToolBarPresupuestoFlujoCajaTsr=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPresupuestoFlujoCajaTsr=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPresupuestoFlujoCajaTsr,this.jTtoolBarDetallePresupuestoFlujoCajaTsr,
							"actualizar","actualizar","Actualizar"+" "+PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPresupuestoFlujoCajaTsr=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPresupuestoFlujoCajaTsr,this.jTtoolBarDetallePresupuestoFlujoCajaTsr,
							"eliminar","eliminar","Eliminar"+" "+PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPresupuestoFlujoCajaTsr=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPresupuestoFlujoCajaTsr,this.jTtoolBarDetallePresupuestoFlujoCajaTsr,
							"cancelar","cancelar","Cancelar"+" "+PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPresupuestoFlujoCajaTsr=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPresupuestoFlujoCajaTsr,this.jTtoolBarDetallePresupuestoFlujoCajaTsr,
							"guardarcambios","guardarcambios","Guardar"+" "+PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePresupuestoFlujoCajaTsr=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePresupuestoFlujoCajaTsr=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPresupuestoFlujoCajaTsr=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPresupuestoFlujoCajaTsr=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPresupuestoFlujoCajaTsr=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPresupuestoFlujoCajaTsr= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPresupuestoFlujoCajaTsr.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPresupuestoFlujoCajaTsr,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPresupuestoFlujoCajaTsr= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPresupuestoFlujoCajaTsr.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPresupuestoFlujoCajaTsr,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPresupuestoFlujoCajaTsr= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPresupuestoFlujoCajaTsr.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPresupuestoFlujoCajaTsr,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPresupuestoFlujoCajaTsr= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPresupuestoFlujoCajaTsr.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPresupuestoFlujoCajaTsr,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPresupuestoFlujoCajaTsr= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPresupuestoFlujoCajaTsr.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPresupuestoFlujoCajaTsr,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPresupuestoFlujoCajaTsr= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPresupuestoFlujoCajaTsr.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPresupuestoFlujoCajaTsr,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPresupuestoFlujoCajaTsr= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPresupuestoFlujoCajaTsr.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPresupuestoFlujoCajaTsr,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPresupuestoFlujoCajaTsr= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPresupuestoFlujoCajaTsr.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPresupuestoFlujoCajaTsr,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPresupuestoFlujoCajaTsr= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPresupuestoFlujoCajaTsr.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPresupuestoFlujoCajaTsr,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPresupuestoFlujoCajaTsr= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPresupuestoFlujoCajaTsr.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPresupuestoFlujoCajaTsr,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPresupuestoFlujoCajaTsr.add(this.jMenuItemDetalleCerrarPresupuestoFlujoCajaTsr);
		
		this.jmenuDetalleAccionesPresupuestoFlujoCajaTsr.add(this.jMenuItemActualizarPresupuestoFlujoCajaTsr);
		this.jmenuDetalleAccionesPresupuestoFlujoCajaTsr.add(this.jMenuItemEliminarPresupuestoFlujoCajaTsr);
		this.jmenuDetalleAccionesPresupuestoFlujoCajaTsr.add(this.jMenuItemCancelarPresupuestoFlujoCajaTsr);		
		
		//this.jmenuDetalleDatosPresupuestoFlujoCajaTsr.add(this.jMenuItemDetalleAbrirOrderByPresupuestoFlujoCajaTsr);				
		this.jmenuDetalleDatosPresupuestoFlujoCajaTsr.add(this.jMenuItemDetalleMostarOcultarPresupuestoFlujoCajaTsr);				
				
		//this.jmenuDetalleAccionesPresupuestoFlujoCajaTsr.add(this.jMenuItemGuardarCambiosPresupuestoFlujoCajaTsr);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePresupuestoFlujoCajaTsr.add(this.jmenuDetalleArchivoPresupuestoFlujoCajaTsr);		
		this.jmenuBarDetallePresupuestoFlujoCajaTsr.add(this.jmenuDetalleAccionesPresupuestoFlujoCajaTsr);		
		this.jmenuBarDetallePresupuestoFlujoCajaTsr.add(this.jmenuDetalleDatosPresupuestoFlujoCajaTsr);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePresupuestoFlujoCajaTsr);				
	}
	
	
	public void inicializarElementosCamposPresupuestoFlujoCajaTsr() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPresupuestoFlujoCajaTsr = new JLabelMe();
		jLabelIdPresupuestoFlujoCajaTsr.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPresupuestoFlujoCajaTsr = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPresupuestoFlujoCajaTsr.setToolTipText(PresupuestoFlujoCajaTsrConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPresupuestoFlujoCajaTsr= new GridBagLayout();

		this.jPanelidPresupuestoFlujoCajaTsr.setLayout(this.gridaBagLayoutPresupuestoFlujoCajaTsr);

		jLabelidPresupuestoFlujoCajaTsr = new JLabel();
		jLabelidPresupuestoFlujoCajaTsr.setText("Id");

		jLabelidPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoPresupuestoFlujoCajaTsr = new JLabelMe();
		this.jLabelcodigoPresupuestoFlujoCajaTsr.setText(""+PresupuestoFlujoCajaTsrConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoPresupuestoFlujoCajaTsr.setToolTipText("Codigo");
		this.jLabelcodigoPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoPresupuestoFlujoCajaTsr=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoPresupuestoFlujoCajaTsr.setToolTipText(PresupuestoFlujoCajaTsrConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutPresupuestoFlujoCajaTsr = new GridBagLayout();
		this.jPanelcodigoPresupuestoFlujoCajaTsr.setLayout(this.gridaBagLayoutPresupuestoFlujoCajaTsr);


		jTextFieldcodigoPresupuestoFlujoCajaTsr= new JTextFieldMe();

		jTextFieldcodigoPresupuestoFlujoCajaTsr.setEnabled(false);
		jTextFieldcodigoPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoPresupuestoFlujoCajaTsrBusqueda= new JButtonMe();
		this.jButtoncodigoPresupuestoFlujoCajaTsrBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoPresupuestoFlujoCajaTsrBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoPresupuestoFlujoCajaTsrBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoPresupuestoFlujoCajaTsrBusqueda.setText("U");
		this.jButtoncodigoPresupuestoFlujoCajaTsrBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoPresupuestoFlujoCajaTsrBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoPresupuestoFlujoCajaTsrBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoPresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoPresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoPresupuestoFlujoCajaTsrBusqueda"));

		if(this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoPresupuestoFlujoCajaTsrBusqueda.setVisible(false);		}


					
		this.jLabelnombrePresupuestoFlujoCajaTsr = new JLabelMe();
		this.jLabelnombrePresupuestoFlujoCajaTsr.setText(""+PresupuestoFlujoCajaTsrConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombrePresupuestoFlujoCajaTsr.setToolTipText("Nombre");
		this.jLabelnombrePresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrePresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrePresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombrePresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombrePresupuestoFlujoCajaTsr=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombrePresupuestoFlujoCajaTsr.setToolTipText(PresupuestoFlujoCajaTsrConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutPresupuestoFlujoCajaTsr = new GridBagLayout();
		this.jPanelnombrePresupuestoFlujoCajaTsr.setLayout(this.gridaBagLayoutPresupuestoFlujoCajaTsr);


		jTextAreanombrePresupuestoFlujoCajaTsr= new JTextAreaMe();
		jTextAreanombrePresupuestoFlujoCajaTsr.setEnabled(false);
		jTextAreanombrePresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePresupuestoFlujoCajaTsr.setLineWrap(true);
		jTextAreanombrePresupuestoFlujoCajaTsr.setWrapStyleWord(true);
		jTextAreanombrePresupuestoFlujoCajaTsr.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombrePresupuestoFlujoCajaTsr.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombrePresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombrePresupuestoFlujoCajaTsr = new JScrollPane(jTextAreanombrePresupuestoFlujoCajaTsr);
		jscrollPanenombrePresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombrePresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombrePresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombrePresupuestoFlujoCajaTsrBusqueda= new JButtonMe();
		this.jButtonnombrePresupuestoFlujoCajaTsrBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrePresupuestoFlujoCajaTsrBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrePresupuestoFlujoCajaTsrBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombrePresupuestoFlujoCajaTsrBusqueda.setText("U");
		this.jButtonnombrePresupuestoFlujoCajaTsrBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombrePresupuestoFlujoCajaTsrBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombrePresupuestoFlujoCajaTsrBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombrePresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombrePresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombrePresupuestoFlujoCajaTsrBusqueda"));

		if(this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombrePresupuestoFlujoCajaTsrBusqueda.setVisible(false);		}


					
		this.jLabelfechaPresupuestoFlujoCajaTsr = new JLabelMe();
		this.jLabelfechaPresupuestoFlujoCajaTsr.setText(""+PresupuestoFlujoCajaTsrConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaPresupuestoFlujoCajaTsr.setToolTipText("Fecha");
		this.jLabelfechaPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaPresupuestoFlujoCajaTsr=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaPresupuestoFlujoCajaTsr.setToolTipText(PresupuestoFlujoCajaTsrConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutPresupuestoFlujoCajaTsr = new GridBagLayout();
		this.jPanelfechaPresupuestoFlujoCajaTsr.setLayout(this.gridaBagLayoutPresupuestoFlujoCajaTsr);


		//jFormattedTextFieldfechaPresupuestoFlujoCajaTsr= new JFormattedTextFieldMe();

		jDateChooserfechaPresupuestoFlujoCajaTsr= new JDateChooser();
		jDateChooserfechaPresupuestoFlujoCajaTsr.setEnabled(false);
		jDateChooserfechaPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaPresupuestoFlujoCajaTsr.setDate(new Date());
		jDateChooserfechaPresupuestoFlujoCajaTsr.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaPresupuestoFlujoCajaTsr.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaPresupuestoFlujoCajaTsrBusqueda= new JButtonMe();
		this.jButtonfechaPresupuestoFlujoCajaTsrBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaPresupuestoFlujoCajaTsrBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaPresupuestoFlujoCajaTsrBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaPresupuestoFlujoCajaTsrBusqueda.setText("U");
		this.jButtonfechaPresupuestoFlujoCajaTsrBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaPresupuestoFlujoCajaTsrBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaPresupuestoFlujoCajaTsrBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaPresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaPresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaPresupuestoFlujoCajaTsrBusqueda"));

		if(this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaPresupuestoFlujoCajaTsrBusqueda.setVisible(false);		}


					
		this.jLabelfecha_presupuestoPresupuestoFlujoCajaTsr = new JLabelMe();
		this.jLabelfecha_presupuestoPresupuestoFlujoCajaTsr.setText(""+PresupuestoFlujoCajaTsrConstantesFunciones.LABEL_FECHAPRESUPUESTO+" : *");
		this.jLabelfecha_presupuestoPresupuestoFlujoCajaTsr.setToolTipText("F. Presupuesto");
		this.jLabelfecha_presupuestoPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_presupuestoPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_presupuestoPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_presupuestoPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_presupuestoPresupuestoFlujoCajaTsr=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_presupuestoPresupuestoFlujoCajaTsr.setToolTipText(PresupuestoFlujoCajaTsrConstantesFunciones.LABEL_FECHAPRESUPUESTO);
		this.gridaBagLayoutPresupuestoFlujoCajaTsr = new GridBagLayout();
		this.jPanelfecha_presupuestoPresupuestoFlujoCajaTsr.setLayout(this.gridaBagLayoutPresupuestoFlujoCajaTsr);


		//jFormattedTextFieldfecha_presupuestoPresupuestoFlujoCajaTsr= new JFormattedTextFieldMe();

		jDateChooserfecha_presupuestoPresupuestoFlujoCajaTsr= new JDateChooser();
		jDateChooserfecha_presupuestoPresupuestoFlujoCajaTsr.setEnabled(false);
		jDateChooserfecha_presupuestoPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_presupuestoPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_presupuestoPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_presupuestoPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_presupuestoPresupuestoFlujoCajaTsr.setDate(new Date());
		jDateChooserfecha_presupuestoPresupuestoFlujoCajaTsr.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_presupuestoPresupuestoFlujoCajaTsr.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_presupuestoPresupuestoFlujoCajaTsrBusqueda= new JButtonMe();
		this.jButtonfecha_presupuestoPresupuestoFlujoCajaTsrBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_presupuestoPresupuestoFlujoCajaTsrBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_presupuestoPresupuestoFlujoCajaTsrBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_presupuestoPresupuestoFlujoCajaTsrBusqueda.setText("U");
		this.jButtonfecha_presupuestoPresupuestoFlujoCajaTsrBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_presupuestoPresupuestoFlujoCajaTsrBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_presupuestoPresupuestoFlujoCajaTsrBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_presupuestoPresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_presupuestoPresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_presupuestoPresupuestoFlujoCajaTsrBusqueda"));

		if(this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_presupuestoPresupuestoFlujoCajaTsrBusqueda.setVisible(false);		}


					
		this.jLabelvalorPresupuestoFlujoCajaTsr = new JLabelMe();
		this.jLabelvalorPresupuestoFlujoCajaTsr.setText(""+PresupuestoFlujoCajaTsrConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorPresupuestoFlujoCajaTsr.setToolTipText("Valor");
		this.jLabelvalorPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorPresupuestoFlujoCajaTsr=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorPresupuestoFlujoCajaTsr.setToolTipText(PresupuestoFlujoCajaTsrConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutPresupuestoFlujoCajaTsr = new GridBagLayout();
		this.jPanelvalorPresupuestoFlujoCajaTsr.setLayout(this.gridaBagLayoutPresupuestoFlujoCajaTsr);


		jTextFieldvalorPresupuestoFlujoCajaTsr= new JTextFieldMe();
		jTextFieldvalorPresupuestoFlujoCajaTsr.setEnabled(false);
		jTextFieldvalorPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorPresupuestoFlujoCajaTsr.setText("0.0");

		this.jButtonvalorPresupuestoFlujoCajaTsrBusqueda= new JButtonMe();
		this.jButtonvalorPresupuestoFlujoCajaTsrBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorPresupuestoFlujoCajaTsrBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorPresupuestoFlujoCajaTsrBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorPresupuestoFlujoCajaTsrBusqueda.setText("U");
		this.jButtonvalorPresupuestoFlujoCajaTsrBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorPresupuestoFlujoCajaTsrBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorPresupuestoFlujoCajaTsrBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorPresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorPresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorPresupuestoFlujoCajaTsrBusqueda"));

		if(this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorPresupuestoFlujoCajaTsrBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionPresupuestoFlujoCajaTsr = new JLabelMe();
		this.jLabeldescripcionPresupuestoFlujoCajaTsr.setText(""+PresupuestoFlujoCajaTsrConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionPresupuestoFlujoCajaTsr.setToolTipText("Descripcion");
		this.jLabeldescripcionPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionPresupuestoFlujoCajaTsr=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionPresupuestoFlujoCajaTsr.setToolTipText(PresupuestoFlujoCajaTsrConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutPresupuestoFlujoCajaTsr = new GridBagLayout();
		this.jPaneldescripcionPresupuestoFlujoCajaTsr.setLayout(this.gridaBagLayoutPresupuestoFlujoCajaTsr);


		jTextAreadescripcionPresupuestoFlujoCajaTsr= new JTextAreaMe();
		jTextAreadescripcionPresupuestoFlujoCajaTsr.setEnabled(false);
		jTextAreadescripcionPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPresupuestoFlujoCajaTsr.setLineWrap(true);
		jTextAreadescripcionPresupuestoFlujoCajaTsr.setWrapStyleWord(true);
		jTextAreadescripcionPresupuestoFlujoCajaTsr.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionPresupuestoFlujoCajaTsr.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionPresupuestoFlujoCajaTsr = new JScrollPane(jTextAreadescripcionPresupuestoFlujoCajaTsr);
		jscrollPanedescripcionPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionPresupuestoFlujoCajaTsrBusqueda= new JButtonMe();
		this.jButtondescripcionPresupuestoFlujoCajaTsrBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPresupuestoFlujoCajaTsrBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPresupuestoFlujoCajaTsrBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionPresupuestoFlujoCajaTsrBusqueda.setText("U");
		this.jButtondescripcionPresupuestoFlujoCajaTsrBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionPresupuestoFlujoCajaTsrBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionPresupuestoFlujoCajaTsrBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionPresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionPresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionPresupuestoFlujoCajaTsrBusqueda"));

		if(this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionPresupuestoFlujoCajaTsrBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPresupuestoFlujoCajaTsr() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPresupuestoFlujoCajaTsr = new JLabelMe();
		this.jLabelid_empresaPresupuestoFlujoCajaTsr.setText(""+PresupuestoFlujoCajaTsrConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPresupuestoFlujoCajaTsr.setToolTipText("Empresa");
		this.jLabelid_empresaPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPresupuestoFlujoCajaTsr=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPresupuestoFlujoCajaTsr.setToolTipText(PresupuestoFlujoCajaTsrConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPresupuestoFlujoCajaTsr = new GridBagLayout();
		this.jPanelid_empresaPresupuestoFlujoCajaTsr.setLayout(this.gridaBagLayoutPresupuestoFlujoCajaTsr);


		jComboBoxid_empresaPresupuestoFlujoCajaTsr= new JComboBoxMe();
		jComboBoxid_empresaPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPresupuestoFlujoCajaTsr.setEnabled(false);

		this.jButtonid_empresaPresupuestoFlujoCajaTsr= new JButtonMe();
		this.jButtonid_empresaPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPresupuestoFlujoCajaTsr.setText("Buscar");
		this.jButtonid_empresaPresupuestoFlujoCajaTsr.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPresupuestoFlujoCajaTsr.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPresupuestoFlujoCajaTsr,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPresupuestoFlujoCajaTsr"));

		this.jButtonid_empresaPresupuestoFlujoCajaTsrBusqueda= new JButtonMe();
		this.jButtonid_empresaPresupuestoFlujoCajaTsrBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresupuestoFlujoCajaTsrBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresupuestoFlujoCajaTsrBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPresupuestoFlujoCajaTsrBusqueda.setText("U");
		this.jButtonid_empresaPresupuestoFlujoCajaTsrBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPresupuestoFlujoCajaTsrBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPresupuestoFlujoCajaTsrBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPresupuestoFlujoCajaTsrBusqueda"));

		if(this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPresupuestoFlujoCajaTsrBusqueda.setVisible(false);		}

		this.jButtonid_empresaPresupuestoFlujoCajaTsrUpdate= new JButtonMe();
		this.jButtonid_empresaPresupuestoFlujoCajaTsrUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresupuestoFlujoCajaTsrUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresupuestoFlujoCajaTsrUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPresupuestoFlujoCajaTsrUpdate.setText("U");
		this.jButtonid_empresaPresupuestoFlujoCajaTsrUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPresupuestoFlujoCajaTsrUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPresupuestoFlujoCajaTsrUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPresupuestoFlujoCajaTsrUpdate"));



					
		this.jLabelid_sucursalPresupuestoFlujoCajaTsr = new JLabelMe();
		this.jLabelid_sucursalPresupuestoFlujoCajaTsr.setText(""+PresupuestoFlujoCajaTsrConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalPresupuestoFlujoCajaTsr.setToolTipText("Sucursal");
		this.jLabelid_sucursalPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalPresupuestoFlujoCajaTsr=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalPresupuestoFlujoCajaTsr.setToolTipText(PresupuestoFlujoCajaTsrConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutPresupuestoFlujoCajaTsr = new GridBagLayout();
		this.jPanelid_sucursalPresupuestoFlujoCajaTsr.setLayout(this.gridaBagLayoutPresupuestoFlujoCajaTsr);


		jComboBoxid_sucursalPresupuestoFlujoCajaTsr= new JComboBoxMe();
		jComboBoxid_sucursalPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalPresupuestoFlujoCajaTsr.setEnabled(false);

		this.jButtonid_sucursalPresupuestoFlujoCajaTsr= new JButtonMe();
		this.jButtonid_sucursalPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPresupuestoFlujoCajaTsr.setText("Buscar");
		this.jButtonid_sucursalPresupuestoFlujoCajaTsr.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalPresupuestoFlujoCajaTsr.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPresupuestoFlujoCajaTsr,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalPresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPresupuestoFlujoCajaTsr"));

		this.jButtonid_sucursalPresupuestoFlujoCajaTsrBusqueda= new JButtonMe();
		this.jButtonid_sucursalPresupuestoFlujoCajaTsrBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPresupuestoFlujoCajaTsrBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPresupuestoFlujoCajaTsrBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPresupuestoFlujoCajaTsrBusqueda.setText("U");
		this.jButtonid_sucursalPresupuestoFlujoCajaTsrBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalPresupuestoFlujoCajaTsrBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPresupuestoFlujoCajaTsrBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalPresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPresupuestoFlujoCajaTsrBusqueda"));

		if(this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalPresupuestoFlujoCajaTsrBusqueda.setVisible(false);		}

		this.jButtonid_sucursalPresupuestoFlujoCajaTsrUpdate= new JButtonMe();
		this.jButtonid_sucursalPresupuestoFlujoCajaTsrUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPresupuestoFlujoCajaTsrUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPresupuestoFlujoCajaTsrUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPresupuestoFlujoCajaTsrUpdate.setText("U");
		this.jButtonid_sucursalPresupuestoFlujoCajaTsrUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalPresupuestoFlujoCajaTsrUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPresupuestoFlujoCajaTsrUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalPresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPresupuestoFlujoCajaTsrUpdate"));



					
		this.jLabelid_ejercicioPresupuestoFlujoCajaTsr = new JLabelMe();
		this.jLabelid_ejercicioPresupuestoFlujoCajaTsr.setText(""+PresupuestoFlujoCajaTsrConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioPresupuestoFlujoCajaTsr.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioPresupuestoFlujoCajaTsr=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioPresupuestoFlujoCajaTsr.setToolTipText(PresupuestoFlujoCajaTsrConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutPresupuestoFlujoCajaTsr = new GridBagLayout();
		this.jPanelid_ejercicioPresupuestoFlujoCajaTsr.setLayout(this.gridaBagLayoutPresupuestoFlujoCajaTsr);


		jComboBoxid_ejercicioPresupuestoFlujoCajaTsr= new JComboBoxMe();
		jComboBoxid_ejercicioPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioPresupuestoFlujoCajaTsr.setEnabled(false);

		this.jButtonid_ejercicioPresupuestoFlujoCajaTsr= new JButtonMe();
		this.jButtonid_ejercicioPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPresupuestoFlujoCajaTsr.setText("Buscar");
		this.jButtonid_ejercicioPresupuestoFlujoCajaTsr.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioPresupuestoFlujoCajaTsr.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPresupuestoFlujoCajaTsr,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioPresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPresupuestoFlujoCajaTsr"));

		this.jButtonid_ejercicioPresupuestoFlujoCajaTsrBusqueda= new JButtonMe();
		this.jButtonid_ejercicioPresupuestoFlujoCajaTsrBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPresupuestoFlujoCajaTsrBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPresupuestoFlujoCajaTsrBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPresupuestoFlujoCajaTsrBusqueda.setText("U");
		this.jButtonid_ejercicioPresupuestoFlujoCajaTsrBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioPresupuestoFlujoCajaTsrBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPresupuestoFlujoCajaTsrBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioPresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPresupuestoFlujoCajaTsrBusqueda"));

		if(this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioPresupuestoFlujoCajaTsrBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioPresupuestoFlujoCajaTsrUpdate= new JButtonMe();
		this.jButtonid_ejercicioPresupuestoFlujoCajaTsrUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPresupuestoFlujoCajaTsrUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPresupuestoFlujoCajaTsrUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPresupuestoFlujoCajaTsrUpdate.setText("U");
		this.jButtonid_ejercicioPresupuestoFlujoCajaTsrUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioPresupuestoFlujoCajaTsrUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPresupuestoFlujoCajaTsrUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioPresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPresupuestoFlujoCajaTsrUpdate"));



					
		this.jLabelid_periodoPresupuestoFlujoCajaTsr = new JLabelMe();
		this.jLabelid_periodoPresupuestoFlujoCajaTsr.setText(""+PresupuestoFlujoCajaTsrConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoPresupuestoFlujoCajaTsr.setToolTipText("Periodo");
		this.jLabelid_periodoPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoPresupuestoFlujoCajaTsr=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoPresupuestoFlujoCajaTsr.setToolTipText(PresupuestoFlujoCajaTsrConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutPresupuestoFlujoCajaTsr = new GridBagLayout();
		this.jPanelid_periodoPresupuestoFlujoCajaTsr.setLayout(this.gridaBagLayoutPresupuestoFlujoCajaTsr);


		jComboBoxid_periodoPresupuestoFlujoCajaTsr= new JComboBoxMe();
		jComboBoxid_periodoPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoPresupuestoFlujoCajaTsr.setEnabled(false);

		this.jButtonid_periodoPresupuestoFlujoCajaTsr= new JButtonMe();
		this.jButtonid_periodoPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPresupuestoFlujoCajaTsr.setText("Buscar");
		this.jButtonid_periodoPresupuestoFlujoCajaTsr.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoPresupuestoFlujoCajaTsr.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPresupuestoFlujoCajaTsr,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoPresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPresupuestoFlujoCajaTsr"));

		this.jButtonid_periodoPresupuestoFlujoCajaTsrBusqueda= new JButtonMe();
		this.jButtonid_periodoPresupuestoFlujoCajaTsrBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPresupuestoFlujoCajaTsrBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPresupuestoFlujoCajaTsrBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoPresupuestoFlujoCajaTsrBusqueda.setText("U");
		this.jButtonid_periodoPresupuestoFlujoCajaTsrBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoPresupuestoFlujoCajaTsrBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPresupuestoFlujoCajaTsrBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoPresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPresupuestoFlujoCajaTsrBusqueda"));

		if(this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoPresupuestoFlujoCajaTsrBusqueda.setVisible(false);		}

		this.jButtonid_periodoPresupuestoFlujoCajaTsrUpdate= new JButtonMe();
		this.jButtonid_periodoPresupuestoFlujoCajaTsrUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPresupuestoFlujoCajaTsrUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPresupuestoFlujoCajaTsrUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoPresupuestoFlujoCajaTsrUpdate.setText("U");
		this.jButtonid_periodoPresupuestoFlujoCajaTsrUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoPresupuestoFlujoCajaTsrUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPresupuestoFlujoCajaTsrUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoPresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPresupuestoFlujoCajaTsrUpdate"));



					
		this.jLabelid_usuarioPresupuestoFlujoCajaTsr = new JLabelMe();
		this.jLabelid_usuarioPresupuestoFlujoCajaTsr.setText(""+PresupuestoFlujoCajaTsrConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioPresupuestoFlujoCajaTsr.setToolTipText("Usuario");
		this.jLabelid_usuarioPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioPresupuestoFlujoCajaTsr=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioPresupuestoFlujoCajaTsr.setToolTipText(PresupuestoFlujoCajaTsrConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutPresupuestoFlujoCajaTsr = new GridBagLayout();
		this.jPanelid_usuarioPresupuestoFlujoCajaTsr.setLayout(this.gridaBagLayoutPresupuestoFlujoCajaTsr);


		jComboBoxid_usuarioPresupuestoFlujoCajaTsr= new JComboBoxMe();
		jComboBoxid_usuarioPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioPresupuestoFlujoCajaTsr.setEnabled(false);

		this.jButtonid_usuarioPresupuestoFlujoCajaTsr= new JButtonMe();
		this.jButtonid_usuarioPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioPresupuestoFlujoCajaTsr.setText("Buscar");
		this.jButtonid_usuarioPresupuestoFlujoCajaTsr.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioPresupuestoFlujoCajaTsr.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioPresupuestoFlujoCajaTsr,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioPresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioPresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioPresupuestoFlujoCajaTsr"));

		this.jButtonid_usuarioPresupuestoFlujoCajaTsrBusqueda= new JButtonMe();
		this.jButtonid_usuarioPresupuestoFlujoCajaTsrBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioPresupuestoFlujoCajaTsrBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioPresupuestoFlujoCajaTsrBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioPresupuestoFlujoCajaTsrBusqueda.setText("U");
		this.jButtonid_usuarioPresupuestoFlujoCajaTsrBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioPresupuestoFlujoCajaTsrBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioPresupuestoFlujoCajaTsrBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioPresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioPresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioPresupuestoFlujoCajaTsrBusqueda"));

		if(this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioPresupuestoFlujoCajaTsrBusqueda.setVisible(false);		}

		this.jButtonid_usuarioPresupuestoFlujoCajaTsrUpdate= new JButtonMe();
		this.jButtonid_usuarioPresupuestoFlujoCajaTsrUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioPresupuestoFlujoCajaTsrUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioPresupuestoFlujoCajaTsrUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioPresupuestoFlujoCajaTsrUpdate.setText("U");
		this.jButtonid_usuarioPresupuestoFlujoCajaTsrUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioPresupuestoFlujoCajaTsrUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioPresupuestoFlujoCajaTsrUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioPresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioPresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioPresupuestoFlujoCajaTsrUpdate"));



					
		this.jLabelid_anioPresupuestoFlujoCajaTsr = new JLabelMe();
		this.jLabelid_anioPresupuestoFlujoCajaTsr.setText(""+PresupuestoFlujoCajaTsrConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioPresupuestoFlujoCajaTsr.setToolTipText("Anio");
		this.jLabelid_anioPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioPresupuestoFlujoCajaTsr=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioPresupuestoFlujoCajaTsr.setToolTipText(PresupuestoFlujoCajaTsrConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutPresupuestoFlujoCajaTsr = new GridBagLayout();
		this.jPanelid_anioPresupuestoFlujoCajaTsr.setLayout(this.gridaBagLayoutPresupuestoFlujoCajaTsr);


		jComboBoxid_anioPresupuestoFlujoCajaTsr= new JComboBoxMe();
		jComboBoxid_anioPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioPresupuestoFlujoCajaTsr.setEnabled(false);

		this.jButtonid_anioPresupuestoFlujoCajaTsr= new JButtonMe();
		this.jButtonid_anioPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioPresupuestoFlujoCajaTsr.setText("Buscar");
		this.jButtonid_anioPresupuestoFlujoCajaTsr.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioPresupuestoFlujoCajaTsr.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioPresupuestoFlujoCajaTsr,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioPresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioPresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioPresupuestoFlujoCajaTsr"));

		this.jButtonid_anioPresupuestoFlujoCajaTsrBusqueda= new JButtonMe();
		this.jButtonid_anioPresupuestoFlujoCajaTsrBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPresupuestoFlujoCajaTsrBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPresupuestoFlujoCajaTsrBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioPresupuestoFlujoCajaTsrBusqueda.setText("U");
		this.jButtonid_anioPresupuestoFlujoCajaTsrBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioPresupuestoFlujoCajaTsrBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioPresupuestoFlujoCajaTsrBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioPresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioPresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioPresupuestoFlujoCajaTsrBusqueda"));

		if(this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioPresupuestoFlujoCajaTsrBusqueda.setVisible(false);		}

		this.jButtonid_anioPresupuestoFlujoCajaTsrUpdate= new JButtonMe();
		this.jButtonid_anioPresupuestoFlujoCajaTsrUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPresupuestoFlujoCajaTsrUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPresupuestoFlujoCajaTsrUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioPresupuestoFlujoCajaTsrUpdate.setText("U");
		this.jButtonid_anioPresupuestoFlujoCajaTsrUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioPresupuestoFlujoCajaTsrUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioPresupuestoFlujoCajaTsrUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioPresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioPresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioPresupuestoFlujoCajaTsrUpdate"));



					
		this.jLabelid_mesPresupuestoFlujoCajaTsr = new JLabelMe();
		this.jLabelid_mesPresupuestoFlujoCajaTsr.setText(""+PresupuestoFlujoCajaTsrConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesPresupuestoFlujoCajaTsr.setToolTipText("Mes");
		this.jLabelid_mesPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesPresupuestoFlujoCajaTsr=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesPresupuestoFlujoCajaTsr.setToolTipText(PresupuestoFlujoCajaTsrConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutPresupuestoFlujoCajaTsr = new GridBagLayout();
		this.jPanelid_mesPresupuestoFlujoCajaTsr.setLayout(this.gridaBagLayoutPresupuestoFlujoCajaTsr);


		jComboBoxid_mesPresupuestoFlujoCajaTsr= new JComboBoxMe();
		jComboBoxid_mesPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesPresupuestoFlujoCajaTsr.setEnabled(false);

		this.jButtonid_mesPresupuestoFlujoCajaTsr= new JButtonMe();
		this.jButtonid_mesPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesPresupuestoFlujoCajaTsr.setText("Buscar");
		this.jButtonid_mesPresupuestoFlujoCajaTsr.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesPresupuestoFlujoCajaTsr.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesPresupuestoFlujoCajaTsr,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesPresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesPresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesPresupuestoFlujoCajaTsr"));

		this.jButtonid_mesPresupuestoFlujoCajaTsrBusqueda= new JButtonMe();
		this.jButtonid_mesPresupuestoFlujoCajaTsrBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPresupuestoFlujoCajaTsrBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPresupuestoFlujoCajaTsrBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesPresupuestoFlujoCajaTsrBusqueda.setText("U");
		this.jButtonid_mesPresupuestoFlujoCajaTsrBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesPresupuestoFlujoCajaTsrBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesPresupuestoFlujoCajaTsrBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesPresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesPresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesPresupuestoFlujoCajaTsrBusqueda"));

		if(this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesPresupuestoFlujoCajaTsrBusqueda.setVisible(false);		}

		this.jButtonid_mesPresupuestoFlujoCajaTsrUpdate= new JButtonMe();
		this.jButtonid_mesPresupuestoFlujoCajaTsrUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPresupuestoFlujoCajaTsrUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPresupuestoFlujoCajaTsrUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesPresupuestoFlujoCajaTsrUpdate.setText("U");
		this.jButtonid_mesPresupuestoFlujoCajaTsrUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesPresupuestoFlujoCajaTsrUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesPresupuestoFlujoCajaTsrUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesPresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesPresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesPresupuestoFlujoCajaTsrUpdate"));



					
		this.jLabelid_tipo_movimientoPresupuestoFlujoCajaTsr = new JLabelMe();
		this.jLabelid_tipo_movimientoPresupuestoFlujoCajaTsr.setText(""+PresupuestoFlujoCajaTsrConstantesFunciones.LABEL_IDTIPOMOVIMIENTO+" : *");
		this.jLabelid_tipo_movimientoPresupuestoFlujoCajaTsr.setToolTipText("Tipo Movimiento");
		this.jLabelid_tipo_movimientoPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_movimientoPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_movimientoPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimientoPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_movimientoPresupuestoFlujoCajaTsr=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_movimientoPresupuestoFlujoCajaTsr.setToolTipText(PresupuestoFlujoCajaTsrConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
		this.gridaBagLayoutPresupuestoFlujoCajaTsr = new GridBagLayout();
		this.jPanelid_tipo_movimientoPresupuestoFlujoCajaTsr.setLayout(this.gridaBagLayoutPresupuestoFlujoCajaTsr);


		jComboBoxid_tipo_movimientoPresupuestoFlujoCajaTsr= new JComboBoxMe();
		jComboBoxid_tipo_movimientoPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimientoPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_movimientoPresupuestoFlujoCajaTsr= new JButtonMe();
		this.jButtonid_tipo_movimientoPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoPresupuestoFlujoCajaTsr.setText("Buscar");
		this.jButtonid_tipo_movimientoPresupuestoFlujoCajaTsr.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_movimientoPresupuestoFlujoCajaTsr.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoPresupuestoFlujoCajaTsr,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_movimientoPresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoPresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoPresupuestoFlujoCajaTsr"));

		this.jButtonid_tipo_movimientoPresupuestoFlujoCajaTsrBusqueda= new JButtonMe();
		this.jButtonid_tipo_movimientoPresupuestoFlujoCajaTsrBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoPresupuestoFlujoCajaTsrBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoPresupuestoFlujoCajaTsrBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoPresupuestoFlujoCajaTsrBusqueda.setText("U");
		this.jButtonid_tipo_movimientoPresupuestoFlujoCajaTsrBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_movimientoPresupuestoFlujoCajaTsrBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoPresupuestoFlujoCajaTsrBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_movimientoPresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoPresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoPresupuestoFlujoCajaTsrBusqueda"));

		if(this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_movimientoPresupuestoFlujoCajaTsrBusqueda.setVisible(false);		}

		this.jButtonid_tipo_movimientoPresupuestoFlujoCajaTsrUpdate= new JButtonMe();
		this.jButtonid_tipo_movimientoPresupuestoFlujoCajaTsrUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoPresupuestoFlujoCajaTsrUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoPresupuestoFlujoCajaTsrUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoPresupuestoFlujoCajaTsrUpdate.setText("U");
		this.jButtonid_tipo_movimientoPresupuestoFlujoCajaTsrUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_movimientoPresupuestoFlujoCajaTsrUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoPresupuestoFlujoCajaTsrUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_movimientoPresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoPresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoPresupuestoFlujoCajaTsrUpdate"));



					
		this.jLabelid_centro_actividadPresupuestoFlujoCajaTsr = new JLabelMe();
		this.jLabelid_centro_actividadPresupuestoFlujoCajaTsr.setText(""+PresupuestoFlujoCajaTsrConstantesFunciones.LABEL_IDCENTROACTIVIDAD+" : *");
		this.jLabelid_centro_actividadPresupuestoFlujoCajaTsr.setToolTipText("Centro Activad");
		this.jLabelid_centro_actividadPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_actividadPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_actividadPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_actividadPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_actividadPresupuestoFlujoCajaTsr=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_actividadPresupuestoFlujoCajaTsr.setToolTipText(PresupuestoFlujoCajaTsrConstantesFunciones.LABEL_IDCENTROACTIVIDAD);
		this.gridaBagLayoutPresupuestoFlujoCajaTsr = new GridBagLayout();
		this.jPanelid_centro_actividadPresupuestoFlujoCajaTsr.setLayout(this.gridaBagLayoutPresupuestoFlujoCajaTsr);


		jComboBoxid_centro_actividadPresupuestoFlujoCajaTsr= new JComboBoxMe();
		jComboBoxid_centro_actividadPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_actividadPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_actividadPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_actividadPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_actividadPresupuestoFlujoCajaTsr= new JButtonMe();
		this.jButtonid_centro_actividadPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_actividadPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_actividadPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_actividadPresupuestoFlujoCajaTsr.setText("Buscar");
		this.jButtonid_centro_actividadPresupuestoFlujoCajaTsr.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_actividadPresupuestoFlujoCajaTsr.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_actividadPresupuestoFlujoCajaTsr,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_actividadPresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_actividadPresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_actividadPresupuestoFlujoCajaTsr"));

		this.jButtonid_centro_actividadPresupuestoFlujoCajaTsrBusqueda= new JButtonMe();
		this.jButtonid_centro_actividadPresupuestoFlujoCajaTsrBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_actividadPresupuestoFlujoCajaTsrBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_actividadPresupuestoFlujoCajaTsrBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_actividadPresupuestoFlujoCajaTsrBusqueda.setText("U");
		this.jButtonid_centro_actividadPresupuestoFlujoCajaTsrBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_actividadPresupuestoFlujoCajaTsrBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_actividadPresupuestoFlujoCajaTsrBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_actividadPresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_actividadPresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_actividadPresupuestoFlujoCajaTsrBusqueda"));

		if(this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_actividadPresupuestoFlujoCajaTsrBusqueda.setVisible(false);		}

		this.jButtonid_centro_actividadPresupuestoFlujoCajaTsrUpdate= new JButtonMe();
		this.jButtonid_centro_actividadPresupuestoFlujoCajaTsrUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_actividadPresupuestoFlujoCajaTsrUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_actividadPresupuestoFlujoCajaTsrUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_actividadPresupuestoFlujoCajaTsrUpdate.setText("U");
		this.jButtonid_centro_actividadPresupuestoFlujoCajaTsrUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_actividadPresupuestoFlujoCajaTsrUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_actividadPresupuestoFlujoCajaTsrUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_actividadPresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_actividadPresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_actividadPresupuestoFlujoCajaTsrUpdate"));



					
		this.jLabelid_cuenta_contablePresupuestoFlujoCajaTsr = new JLabelMe();
		this.jLabelid_cuenta_contablePresupuestoFlujoCajaTsr.setText(""+PresupuestoFlujoCajaTsrConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contablePresupuestoFlujoCajaTsr.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contablePresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contablePresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contablePresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contablePresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contablePresupuestoFlujoCajaTsr=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contablePresupuestoFlujoCajaTsr.setToolTipText(PresupuestoFlujoCajaTsrConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutPresupuestoFlujoCajaTsr = new GridBagLayout();
		this.jPanelid_cuenta_contablePresupuestoFlujoCajaTsr.setLayout(this.gridaBagLayoutPresupuestoFlujoCajaTsr);


		jComboBoxid_cuenta_contablePresupuestoFlujoCajaTsr= new JComboBoxMe();
		jComboBoxid_cuenta_contablePresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contablePresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contablePresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contablePresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contablePresupuestoFlujoCajaTsr= new JButtonMe();
		this.jButtonid_cuenta_contablePresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contablePresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contablePresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contablePresupuestoFlujoCajaTsr.setText("Buscar");
		this.jButtonid_cuenta_contablePresupuestoFlujoCajaTsr.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contablePresupuestoFlujoCajaTsr.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contablePresupuestoFlujoCajaTsr,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contablePresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contablePresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contablePresupuestoFlujoCajaTsr"));

		this.jButtonid_cuenta_contablePresupuestoFlujoCajaTsrBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contablePresupuestoFlujoCajaTsrBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contablePresupuestoFlujoCajaTsrBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contablePresupuestoFlujoCajaTsrBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contablePresupuestoFlujoCajaTsrBusqueda.setText("U");
		this.jButtonid_cuenta_contablePresupuestoFlujoCajaTsrBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contablePresupuestoFlujoCajaTsrBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contablePresupuestoFlujoCajaTsrBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contablePresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contablePresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contablePresupuestoFlujoCajaTsrBusqueda"));

		if(this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contablePresupuestoFlujoCajaTsrBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contablePresupuestoFlujoCajaTsrUpdate= new JButtonMe();
		this.jButtonid_cuenta_contablePresupuestoFlujoCajaTsrUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contablePresupuestoFlujoCajaTsrUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contablePresupuestoFlujoCajaTsrUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contablePresupuestoFlujoCajaTsrUpdate.setText("U");
		this.jButtonid_cuenta_contablePresupuestoFlujoCajaTsrUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contablePresupuestoFlujoCajaTsrUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contablePresupuestoFlujoCajaTsrUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contablePresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contablePresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contablePresupuestoFlujoCajaTsrUpdate"));


		jButtonid_cuenta_contablePresupuestoFlujoCajaTsrArbol= new JButtonMe();
		jButtonid_cuenta_contablePresupuestoFlujoCajaTsrArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contablePresupuestoFlujoCajaTsrArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contablePresupuestoFlujoCajaTsrArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contablePresupuestoFlujoCajaTsrArbol.setText("Arbol");
		jButtonid_cuenta_contablePresupuestoFlujoCajaTsrArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contablePresupuestoFlujoCajaTsrArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contablePresupuestoFlujoCajaTsrArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contablePresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contablePresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contablePresupuestoFlujoCajaTsrArbol"));



					
		this.jLabelid_centro_costoPresupuestoFlujoCajaTsr = new JLabelMe();
		this.jLabelid_centro_costoPresupuestoFlujoCajaTsr.setText(""+PresupuestoFlujoCajaTsrConstantesFunciones.LABEL_IDCENTROCOSTO+" :");
		this.jLabelid_centro_costoPresupuestoFlujoCajaTsr.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoPresupuestoFlujoCajaTsr=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoPresupuestoFlujoCajaTsr.setToolTipText(PresupuestoFlujoCajaTsrConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutPresupuestoFlujoCajaTsr = new GridBagLayout();
		this.jPanelid_centro_costoPresupuestoFlujoCajaTsr.setLayout(this.gridaBagLayoutPresupuestoFlujoCajaTsr);


		jComboBoxid_centro_costoPresupuestoFlujoCajaTsr= new JComboBoxMe();
		jComboBoxid_centro_costoPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_costoPresupuestoFlujoCajaTsr= new JButtonMe();
		this.jButtonid_centro_costoPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoPresupuestoFlujoCajaTsr.setText("Buscar");
		this.jButtonid_centro_costoPresupuestoFlujoCajaTsr.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoPresupuestoFlujoCajaTsr.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoPresupuestoFlujoCajaTsr,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoPresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoPresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoPresupuestoFlujoCajaTsr"));

		this.jButtonid_centro_costoPresupuestoFlujoCajaTsrBusqueda= new JButtonMe();
		this.jButtonid_centro_costoPresupuestoFlujoCajaTsrBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoPresupuestoFlujoCajaTsrBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoPresupuestoFlujoCajaTsrBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoPresupuestoFlujoCajaTsrBusqueda.setText("U");
		this.jButtonid_centro_costoPresupuestoFlujoCajaTsrBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoPresupuestoFlujoCajaTsrBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoPresupuestoFlujoCajaTsrBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoPresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoPresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoPresupuestoFlujoCajaTsrBusqueda"));

		if(this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoPresupuestoFlujoCajaTsrBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoPresupuestoFlujoCajaTsrUpdate= new JButtonMe();
		this.jButtonid_centro_costoPresupuestoFlujoCajaTsrUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoPresupuestoFlujoCajaTsrUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoPresupuestoFlujoCajaTsrUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoPresupuestoFlujoCajaTsrUpdate.setText("U");
		this.jButtonid_centro_costoPresupuestoFlujoCajaTsrUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoPresupuestoFlujoCajaTsrUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoPresupuestoFlujoCajaTsrUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoPresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoPresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoPresupuestoFlujoCajaTsrUpdate"));


		jButtonid_centro_costoPresupuestoFlujoCajaTsrArbol= new JButtonMe();
		jButtonid_centro_costoPresupuestoFlujoCajaTsrArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoPresupuestoFlujoCajaTsrArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoPresupuestoFlujoCajaTsrArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoPresupuestoFlujoCajaTsrArbol.setText("Arbol");
		jButtonid_centro_costoPresupuestoFlujoCajaTsrArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoPresupuestoFlujoCajaTsrArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoPresupuestoFlujoCajaTsrArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoPresupuestoFlujoCajaTsr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoPresupuestoFlujoCajaTsr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoPresupuestoFlujoCajaTsrArbol"));



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
		//this.jInternalFrameDetallePresupuestoFlujoCajaTsr = new PresupuestoFlujoCajaTsrBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Presupuesto Flujo Caja DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPresupuestoFlujoCajaTsr= new GridBagLayout();
		

		
		String sToolTipPresupuestoFlujoCajaTsr="";
		sToolTipPresupuestoFlujoCajaTsr=PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPresupuestoFlujoCajaTsr+="(Tesoreria.PresupuestoFlujoCajaTsr)";
		}
		
		if(!this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado()) {
			sToolTipPresupuestoFlujoCajaTsr+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPresupuestoFlujoCajaTsr = new JButtonMe();
		this.jButtonModificarPresupuestoFlujoCajaTsr = new JButtonMe();
        this.jButtonActualizarPresupuestoFlujoCajaTsr = new JButtonMe();
        this.jButtonEliminarPresupuestoFlujoCajaTsr = new JButtonMe();
        this.jButtonCancelarPresupuestoFlujoCajaTsr = new JButtonMe();
        this.jButtonGuardarCambiosPresupuestoFlujoCajaTsr = new JButtonMe();
		this.jButtonGuardarCambiosTablaPresupuestoFlujoCajaTsr = new JButtonMe();
		this.jButtonCerrarPresupuestoFlujoCajaTsr = new JButtonMe();
		
		this.jScrollPanelDatosPresupuestoFlujoCajaTsr = new JScrollPane();   
        this.jScrollPanelDatosEdicionPresupuestoFlujoCajaTsr = new JScrollPane();
		this.jScrollPanelDatosGeneralPresupuestoFlujoCajaTsr = new JScrollPane();
				
		
		
		this.jPanelCamposPresupuestoFlujoCajaTsr = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPresupuestoFlujoCajaTsr = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPresupuestoFlujoCajaTsr = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPresupuestoFlujoCajaTsr = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Presupuesto Flujo Caja";
		
		if(!this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPresupuestoFlujoCajaTsr.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Flujo Cajas" + this.sPath));
		} else {
			this.jScrollPanelDatosPresupuestoFlujoCajaTsr.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPresupuestoFlujoCajaTsr.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPresupuestoFlujoCajaTsr.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPresupuestoFlujoCajaTsr.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPresupuestoFlujoCajaTsr.setName("jPanelCamposPresupuestoFlujoCajaTsr"); 

		this.jPanelCamposOcultosPresupuestoFlujoCajaTsr.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPresupuestoFlujoCajaTsr.setName("jPanelCamposOcultosPresupuestoFlujoCajaTsr"); 

        this.jPanelAccionesPresupuestoFlujoCajaTsr.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPresupuestoFlujoCajaTsr.setToolTipText("Acciones");
        this.jPanelAccionesPresupuestoFlujoCajaTsr.setName("Acciones"); 

		this.jPanelAccionesFormularioPresupuestoFlujoCajaTsr.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPresupuestoFlujoCajaTsr.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPresupuestoFlujoCajaTsr.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPresupuestoFlujoCajaTsr.setText("Nuevo");
		this.jButtonModificarPresupuestoFlujoCajaTsr.setText("Editar");
        this.jButtonActualizarPresupuestoFlujoCajaTsr.setText("Actualizar");
        this.jButtonEliminarPresupuestoFlujoCajaTsr.setText("Eliminar");
        this.jButtonCancelarPresupuestoFlujoCajaTsr.setText("Cancelar");
        this.jButtonGuardarCambiosPresupuestoFlujoCajaTsr.setText("Guardar");
		this.jButtonGuardarCambiosTablaPresupuestoFlujoCajaTsr.setText("Guardar");
		this.jButtonCerrarPresupuestoFlujoCajaTsr.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPresupuestoFlujoCajaTsr,"nuevo_button","Nuevo",this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPresupuestoFlujoCajaTsr,"modificar_button","Editar",this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPresupuestoFlujoCajaTsr,"actualizar_button","Actualizar",this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPresupuestoFlujoCajaTsr,"eliminar_button","Eliminar",this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPresupuestoFlujoCajaTsr,"cancelar_button","Cancelar",this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPresupuestoFlujoCajaTsr,"guardarcambios_button","Guardar",this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPresupuestoFlujoCajaTsr,"guardarcambiostabla_button","Guardar",this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPresupuestoFlujoCajaTsr,"cerrar_button","Salir",this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPresupuestoFlujoCajaTsr.setToolTipText("Nuevo"+" "+PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPresupuestoFlujoCajaTsr.setToolTipText("Editar"+" "+PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPresupuestoFlujoCajaTsr.setToolTipText("Actualizar"+" "+PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPresupuestoFlujoCajaTsr.setToolTipText("Eliminar)"+" "+PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPresupuestoFlujoCajaTsr.setToolTipText("Cancelar"+" "+PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPresupuestoFlujoCajaTsr.setToolTipText("Guardar"+" "+PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPresupuestoFlujoCajaTsr.setToolTipText("Guardar"+" "+PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPresupuestoFlujoCajaTsr.setToolTipText("Salir"+" "+PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPresupuestoFlujoCajaTsr";
		inputMap = this.jButtonNuevoPresupuestoFlujoCajaTsr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPresupuestoFlujoCajaTsr.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPresupuestoFlujoCajaTsr"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPresupuestoFlujoCajaTsr";
		inputMap = this.jButtonActualizarPresupuestoFlujoCajaTsr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPresupuestoFlujoCajaTsr.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPresupuestoFlujoCajaTsr"));
		
		//ELIMINAR
		sMapKey = "EliminarPresupuestoFlujoCajaTsr";
		inputMap = this.jButtonEliminarPresupuestoFlujoCajaTsr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPresupuestoFlujoCajaTsr.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPresupuestoFlujoCajaTsr"));
		
		//CANCELAR	
		sMapKey = "CancelarPresupuestoFlujoCajaTsr";
		inputMap = this.jButtonCancelarPresupuestoFlujoCajaTsr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPresupuestoFlujoCajaTsr.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPresupuestoFlujoCajaTsr"));
		
		//CERRAR		
		sMapKey = "CerrarPresupuestoFlujoCajaTsr";
		inputMap = this.jButtonCerrarPresupuestoFlujoCajaTsr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPresupuestoFlujoCajaTsr.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPresupuestoFlujoCajaTsr"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPresupuestoFlujoCajaTsr";
		inputMap = this.jButtonGuardarCambiosTablaPresupuestoFlujoCajaTsr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPresupuestoFlujoCajaTsr.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPresupuestoFlujoCajaTsr"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPresupuestoFlujoCajaTsr = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPresupuestoFlujoCajaTsr.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPresupuestoFlujoCajaTsr.setToolTipText("Nuevo PresupuestoFlujoCajaTsr");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPresupuestoFlujoCajaTsr = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPresupuestoFlujoCajaTsr.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPresupuestoFlujoCajaTsr.setToolTipText("Sin Cerrar Ventana PresupuestoFlujoCajaTsr");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePresupuestoFlujoCajaTsr = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePresupuestoFlujoCajaTsr.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePresupuestoFlujoCajaTsr.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPresupuestoFlujoCajaTsr = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPresupuestoFlujoCajaTsr.setText("Accion");
		this.jComboBoxTiposAccionesPresupuestoFlujoCajaTsr.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPresupuestoFlujoCajaTsr = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPresupuestoFlujoCajaTsr.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPresupuestoFlujoCajaTsr.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPresupuestoFlujoCajaTsr = new JLabelMe();
		
		this.jLabelAccionesPresupuestoFlujoCajaTsr.setText("Acciones");		
		this.jLabelAccionesPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPresupuestoFlujoCajaTsr();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPresupuestoFlujoCajaTsr();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPresupuestoFlujoCajaTsr=new JTabbedPane();
		this.jTabbedPaneRelacionesPresupuestoFlujoCajaTsr.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPresupuestoFlujoCajaTsr = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPresupuestoFlujoCajaTsr = new GridBagLayout();
		
		this.jPanelCamposPresupuestoFlujoCajaTsr.setLayout(gridaBagLayoutCamposPresupuestoFlujoCajaTsr);
		this.jPanelCamposOcultosPresupuestoFlujoCajaTsr.setLayout(gridaBagLayoutCamposOcultosPresupuestoFlujoCajaTsr);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPresupuestoFlujoCajaTsr.add(jLabelIdPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);



	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 1;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPresupuestoFlujoCajaTsr.add(jLabelidPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);


	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPresupuestoFlujoCajaTsr.add(jLabelid_empresaPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 2;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPresupuestoFlujoCajaTsr.add(jButtonid_empresaPresupuestoFlujoCajaTsrBusqueda, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 3;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPresupuestoFlujoCajaTsr.add(jButtonid_empresaPresupuestoFlujoCajaTsrUpdate, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
	}

	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 1;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPresupuestoFlujoCajaTsr.add(jComboBoxid_empresaPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);


	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalPresupuestoFlujoCajaTsr.add(jLabelid_sucursalPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 2;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPresupuestoFlujoCajaTsr.add(jButtonid_sucursalPresupuestoFlujoCajaTsrBusqueda, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 3;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPresupuestoFlujoCajaTsr.add(jButtonid_sucursalPresupuestoFlujoCajaTsrUpdate, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
	}

	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 1;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalPresupuestoFlujoCajaTsr.add(jComboBoxid_sucursalPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);


	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioPresupuestoFlujoCajaTsr.add(jLabelid_ejercicioPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 2;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPresupuestoFlujoCajaTsr.add(jButtonid_ejercicioPresupuestoFlujoCajaTsrBusqueda, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 3;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPresupuestoFlujoCajaTsr.add(jButtonid_ejercicioPresupuestoFlujoCajaTsrUpdate, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
	}

	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 1;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioPresupuestoFlujoCajaTsr.add(jComboBoxid_ejercicioPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);


	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoPresupuestoFlujoCajaTsr.add(jLabelid_periodoPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 2;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoPresupuestoFlujoCajaTsr.add(jButtonid_periodoPresupuestoFlujoCajaTsrBusqueda, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 3;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoPresupuestoFlujoCajaTsr.add(jButtonid_periodoPresupuestoFlujoCajaTsrUpdate, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
	}

	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 1;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoPresupuestoFlujoCajaTsr.add(jComboBoxid_periodoPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);


	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioPresupuestoFlujoCajaTsr.add(jLabelid_usuarioPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 2;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioPresupuestoFlujoCajaTsr.add(jButtonid_usuarioPresupuestoFlujoCajaTsrBusqueda, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 3;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioPresupuestoFlujoCajaTsr.add(jButtonid_usuarioPresupuestoFlujoCajaTsrUpdate, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
	}

	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 1;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioPresupuestoFlujoCajaTsr.add(jComboBoxid_usuarioPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);


	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioPresupuestoFlujoCajaTsr.add(jLabelid_anioPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 2;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioPresupuestoFlujoCajaTsr.add(jButtonid_anioPresupuestoFlujoCajaTsrBusqueda, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 3;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioPresupuestoFlujoCajaTsr.add(jButtonid_anioPresupuestoFlujoCajaTsrUpdate, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
	}

	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 1;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioPresupuestoFlujoCajaTsr.add(jComboBoxid_anioPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);


	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesPresupuestoFlujoCajaTsr.add(jLabelid_mesPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 2;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesPresupuestoFlujoCajaTsr.add(jButtonid_mesPresupuestoFlujoCajaTsrBusqueda, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 3;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesPresupuestoFlujoCajaTsr.add(jButtonid_mesPresupuestoFlujoCajaTsrUpdate, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
	}

	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 1;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesPresupuestoFlujoCajaTsr.add(jComboBoxid_mesPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);


	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_movimientoPresupuestoFlujoCajaTsr.add(jLabelid_tipo_movimientoPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 2;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoPresupuestoFlujoCajaTsr.add(jButtonid_tipo_movimientoPresupuestoFlujoCajaTsrBusqueda, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 3;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoPresupuestoFlujoCajaTsr.add(jButtonid_tipo_movimientoPresupuestoFlujoCajaTsrUpdate, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
	}

	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 1;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_movimientoPresupuestoFlujoCajaTsr.add(jComboBoxid_tipo_movimientoPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);


	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_actividadPresupuestoFlujoCajaTsr.add(jLabelid_centro_actividadPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 2;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_actividadPresupuestoFlujoCajaTsr.add(jButtonid_centro_actividadPresupuestoFlujoCajaTsrBusqueda, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 3;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_actividadPresupuestoFlujoCajaTsr.add(jButtonid_centro_actividadPresupuestoFlujoCajaTsrUpdate, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
	}

	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 1;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_actividadPresupuestoFlujoCajaTsr.add(jComboBoxid_centro_actividadPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);


	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoPresupuestoFlujoCajaTsr.add(jLabelcodigoPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 2;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoPresupuestoFlujoCajaTsr.add(jButtoncodigoPresupuestoFlujoCajaTsrBusqueda, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
	}

	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 1;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoPresupuestoFlujoCajaTsr.add(jTextFieldcodigoPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);


	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombrePresupuestoFlujoCajaTsr.add(jLabelnombrePresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 2;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombrePresupuestoFlujoCajaTsr.add(jButtonnombrePresupuestoFlujoCajaTsrBusqueda, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
	}

	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 1;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombrePresupuestoFlujoCajaTsr.add(jscrollPanenombrePresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);


	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaPresupuestoFlujoCajaTsr.add(jLabelfechaPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 2;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaPresupuestoFlujoCajaTsr.add(jButtonfechaPresupuestoFlujoCajaTsrBusqueda, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
	}

	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 1;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaPresupuestoFlujoCajaTsr.add(jDateChooserfechaPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);


	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_presupuestoPresupuestoFlujoCajaTsr.add(jLabelfecha_presupuestoPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 2;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_presupuestoPresupuestoFlujoCajaTsr.add(jButtonfecha_presupuestoPresupuestoFlujoCajaTsrBusqueda, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
	}

	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 1;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_presupuestoPresupuestoFlujoCajaTsr.add(jDateChooserfecha_presupuestoPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);


	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorPresupuestoFlujoCajaTsr.add(jLabelvalorPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 2;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorPresupuestoFlujoCajaTsr.add(jButtonvalorPresupuestoFlujoCajaTsrBusqueda, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
	}

	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 1;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorPresupuestoFlujoCajaTsr.add(jTextFieldvalorPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);


	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contablePresupuestoFlujoCajaTsr.add(jLabelid_cuenta_contablePresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	//this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 2;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contablePresupuestoFlujoCajaTsr.add(jButtonid_cuenta_contablePresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	//this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 3;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contablePresupuestoFlujoCajaTsr.add(jButtonid_cuenta_contablePresupuestoFlujoCajaTsrArbol, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 4;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contablePresupuestoFlujoCajaTsr.add(jButtonid_cuenta_contablePresupuestoFlujoCajaTsrBusqueda, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 5;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contablePresupuestoFlujoCajaTsr.add(jButtonid_cuenta_contablePresupuestoFlujoCajaTsrUpdate, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
	}

	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 1;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contablePresupuestoFlujoCajaTsr.add(jComboBoxid_cuenta_contablePresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);


	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_costoPresupuestoFlujoCajaTsr.add(jLabelid_centro_costoPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	//this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 2;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoPresupuestoFlujoCajaTsr.add(jButtonid_centro_costoPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	//this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 3;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoPresupuestoFlujoCajaTsr.add(jButtonid_centro_costoPresupuestoFlujoCajaTsrArbol, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 4;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoPresupuestoFlujoCajaTsr.add(jButtonid_centro_costoPresupuestoFlujoCajaTsrBusqueda, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 5;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoPresupuestoFlujoCajaTsr.add(jButtonid_centro_costoPresupuestoFlujoCajaTsrUpdate, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
	}

	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 1;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_costoPresupuestoFlujoCajaTsr.add(jComboBoxid_centro_costoPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);


	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionPresupuestoFlujoCajaTsr.add(jLabeldescripcionPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 2;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionPresupuestoFlujoCajaTsr.add(jButtondescripcionPresupuestoFlujoCajaTsrBusqueda, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
	}

	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 1;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionPresupuestoFlujoCajaTsr.add(jscrollPanedescripcionPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iYPanelCamposPresupuestoFlujoCajaTsr;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iXPanelCamposPresupuestoFlujoCajaTsr++;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoFlujoCajaTsr.add(this.jPanelidPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);



	if(iXPanelCamposPresupuestoFlujoCajaTsr % 1==0) {
		iXPanelCamposPresupuestoFlujoCajaTsr=0;
		iYPanelCamposPresupuestoFlujoCajaTsr++;
	}
	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iYPanelCamposPresupuestoFlujoCajaTsr;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iXPanelCamposPresupuestoFlujoCajaTsr++;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoFlujoCajaTsr.add(this.jPanelid_tipo_movimientoPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);



	if(iXPanelCamposPresupuestoFlujoCajaTsr % 1==0) {
		iXPanelCamposPresupuestoFlujoCajaTsr=0;
		iYPanelCamposPresupuestoFlujoCajaTsr++;
	}
	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iYPanelCamposPresupuestoFlujoCajaTsr;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iXPanelCamposPresupuestoFlujoCajaTsr++;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoFlujoCajaTsr.add(this.jPanelid_centro_actividadPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);



	if(iXPanelCamposPresupuestoFlujoCajaTsr % 1==0) {
		iXPanelCamposPresupuestoFlujoCajaTsr=0;
		iYPanelCamposPresupuestoFlujoCajaTsr++;
	}
	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iYPanelCamposPresupuestoFlujoCajaTsr;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iXPanelCamposPresupuestoFlujoCajaTsr++;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoFlujoCajaTsr.add(this.jPanelcodigoPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);



	if(iXPanelCamposPresupuestoFlujoCajaTsr % 1==0) {
		iXPanelCamposPresupuestoFlujoCajaTsr=0;
		iYPanelCamposPresupuestoFlujoCajaTsr++;
	}
	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iYPanelCamposPresupuestoFlujoCajaTsr;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iXPanelCamposPresupuestoFlujoCajaTsr++;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoFlujoCajaTsr.add(this.jPanelnombrePresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);



	if(iXPanelCamposPresupuestoFlujoCajaTsr % 1==0) {
		iXPanelCamposPresupuestoFlujoCajaTsr=0;
		iYPanelCamposPresupuestoFlujoCajaTsr++;
	}
	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iYPanelCamposPresupuestoFlujoCajaTsr;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iXPanelCamposPresupuestoFlujoCajaTsr++;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoFlujoCajaTsr.add(this.jPanelfechaPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);



	if(iXPanelCamposPresupuestoFlujoCajaTsr % 1==0) {
		iXPanelCamposPresupuestoFlujoCajaTsr=0;
		iYPanelCamposPresupuestoFlujoCajaTsr++;
	}
	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iYPanelCamposPresupuestoFlujoCajaTsr;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iXPanelCamposPresupuestoFlujoCajaTsr++;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoFlujoCajaTsr.add(this.jPanelfecha_presupuestoPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);



	if(iXPanelCamposPresupuestoFlujoCajaTsr % 1==0) {
		iXPanelCamposPresupuestoFlujoCajaTsr=0;
		iYPanelCamposPresupuestoFlujoCajaTsr++;
	}
	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iYPanelCamposPresupuestoFlujoCajaTsr;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iXPanelCamposPresupuestoFlujoCajaTsr++;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoFlujoCajaTsr.add(this.jPanelvalorPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);



	if(iXPanelCamposPresupuestoFlujoCajaTsr % 1==0) {
		iXPanelCamposPresupuestoFlujoCajaTsr=0;
		iYPanelCamposPresupuestoFlujoCajaTsr++;
	}
	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iYPanelCamposPresupuestoFlujoCajaTsr;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iXPanelCamposPresupuestoFlujoCajaTsr++;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoFlujoCajaTsr.add(this.jPanelid_cuenta_contablePresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);



	if(iXPanelCamposPresupuestoFlujoCajaTsr % 1==0) {
		iXPanelCamposPresupuestoFlujoCajaTsr=0;
		iYPanelCamposPresupuestoFlujoCajaTsr++;
	}
	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iYPanelCamposPresupuestoFlujoCajaTsr;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iXPanelCamposPresupuestoFlujoCajaTsr++;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoFlujoCajaTsr.add(this.jPanelid_centro_costoPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);



	if(iXPanelCamposPresupuestoFlujoCajaTsr % 1==0) {
		iXPanelCamposPresupuestoFlujoCajaTsr=0;
		iYPanelCamposPresupuestoFlujoCajaTsr++;
	}
	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iYPanelCamposPresupuestoFlujoCajaTsr;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iXPanelCamposPresupuestoFlujoCajaTsr++;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoFlujoCajaTsr.add(this.jPaneldescripcionPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);



	if(iXPanelCamposPresupuestoFlujoCajaTsr % 1==0) {
		iXPanelCamposPresupuestoFlujoCajaTsr=0;
		iYPanelCamposPresupuestoFlujoCajaTsr++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iYPanelCamposOcultosPresupuestoFlujoCajaTsr;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iXPanelCamposOcultosPresupuestoFlujoCajaTsr++;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPresupuestoFlujoCajaTsr.add(this.jPanelid_empresaPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);



	if(iXPanelCamposOcultosPresupuestoFlujoCajaTsr % 1==0) {
		iXPanelCamposOcultosPresupuestoFlujoCajaTsr=0;
		iYPanelCamposOcultosPresupuestoFlujoCajaTsr++;
	}
	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iYPanelCamposOcultosPresupuestoFlujoCajaTsr;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iXPanelCamposOcultosPresupuestoFlujoCajaTsr++;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPresupuestoFlujoCajaTsr.add(this.jPanelid_sucursalPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);



	if(iXPanelCamposOcultosPresupuestoFlujoCajaTsr % 1==0) {
		iXPanelCamposOcultosPresupuestoFlujoCajaTsr=0;
		iYPanelCamposOcultosPresupuestoFlujoCajaTsr++;
	}
	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iYPanelCamposOcultosPresupuestoFlujoCajaTsr;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iXPanelCamposOcultosPresupuestoFlujoCajaTsr++;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPresupuestoFlujoCajaTsr.add(this.jPanelid_ejercicioPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);



	if(iXPanelCamposOcultosPresupuestoFlujoCajaTsr % 1==0) {
		iXPanelCamposOcultosPresupuestoFlujoCajaTsr=0;
		iYPanelCamposOcultosPresupuestoFlujoCajaTsr++;
	}
	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iYPanelCamposOcultosPresupuestoFlujoCajaTsr;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iXPanelCamposOcultosPresupuestoFlujoCajaTsr++;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPresupuestoFlujoCajaTsr.add(this.jPanelid_periodoPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);



	if(iXPanelCamposOcultosPresupuestoFlujoCajaTsr % 1==0) {
		iXPanelCamposOcultosPresupuestoFlujoCajaTsr=0;
		iYPanelCamposOcultosPresupuestoFlujoCajaTsr++;
	}
	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iYPanelCamposOcultosPresupuestoFlujoCajaTsr;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iXPanelCamposOcultosPresupuestoFlujoCajaTsr++;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPresupuestoFlujoCajaTsr.add(this.jPanelid_usuarioPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);



	if(iXPanelCamposOcultosPresupuestoFlujoCajaTsr % 1==0) {
		iXPanelCamposOcultosPresupuestoFlujoCajaTsr=0;
		iYPanelCamposOcultosPresupuestoFlujoCajaTsr++;
	}
	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iYPanelCamposOcultosPresupuestoFlujoCajaTsr;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iXPanelCamposOcultosPresupuestoFlujoCajaTsr++;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPresupuestoFlujoCajaTsr.add(this.jPanelid_anioPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);



	if(iXPanelCamposOcultosPresupuestoFlujoCajaTsr % 1==0) {
		iXPanelCamposOcultosPresupuestoFlujoCajaTsr=0;
		iYPanelCamposOcultosPresupuestoFlujoCajaTsr++;
	}
	this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iYPanelCamposOcultosPresupuestoFlujoCajaTsr;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iXPanelCamposOcultosPresupuestoFlujoCajaTsr++;
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoFlujoCajaTsr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPresupuestoFlujoCajaTsr.add(this.jPanelid_mesPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);



	if(iXPanelCamposOcultosPresupuestoFlujoCajaTsr % 1==0) {
		iXPanelCamposOcultosPresupuestoFlujoCajaTsr=0;
		iYPanelCamposOcultosPresupuestoFlujoCajaTsr++;
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
			
		GridBagLayout gridaBagLayoutAccionesPresupuestoFlujoCajaTsr= new GridBagLayout();
		this.jPanelAccionesPresupuestoFlujoCajaTsr.setLayout(gridaBagLayoutAccionesPresupuestoFlujoCajaTsr);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPresupuestoFlujoCajaTsr= new GridBagLayout();
		this.jPanelAccionesFormularioPresupuestoFlujoCajaTsr.setLayout(gridaBagLayoutAccionesFormularioPresupuestoFlujoCajaTsr);
		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPresupuestoFlujoCajaTsr.add(this.jComboBoxTiposAccionesFormularioPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);

		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPresupuestoFlujoCajaTsr.add(this.jCheckBoxPostAccionNuevoPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.presupuestoflujocajatsrSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPresupuestoFlujoCajaTsr.add(this.jCheckBoxPostAccionSinCerrarPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.presupuestoflujocajatsrSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPresupuestoFlujoCajaTsr.add(this.jCheckBoxPostAccionSinMensajePresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iPosXAccion++;
			
		this.jPanelAccionesPresupuestoFlujoCajaTsr.add(this.jButtonModificarPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);							

		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx =iPosXAccion++;
			
		this.jPanelAccionesPresupuestoFlujoCajaTsr.add(this.jButtonEliminarPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
		
			
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iPosXAccion++;
		
		this.jPanelAccionesPresupuestoFlujoCajaTsr.add(this.jButtonActualizarPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);


		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iPosXAccion++;
		
		this.jPanelAccionesPresupuestoFlujoCajaTsr.add(this.jButtonGuardarCambiosPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);	
		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx =iPosXAccion++;
		
		this.jPanelAccionesPresupuestoFlujoCajaTsr.add(this.jButtonCancelarPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPresupuestoFlujoCajaTsr = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPresupuestoFlujoCajaTsr);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();						
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;		
			//this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx =0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PresupuestoFlujoCajaTsrJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePresupuestoFlujoCajaTsr = new PresupuestoFlujoCajaTsrBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Presupuesto Flujo Caja DATOS");
			
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
			
	        //this.setTitle("[FOR] - Presupuesto Flujo Caja DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Presupuesto Flujo Caja Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PresupuestoFlujoCajaTsrModel presupuestoflujocajatsrModel=new PresupuestoFlujoCajaTsrModel(this);
			
			//SI USARA CLASE INTERNA
			//PresupuestoFlujoCajaTsrModel.PresupuestoFlujoCajaTsrFocusTraversalPolicy presupuestoflujocajatsrFocusTraversalPolicy = presupuestoflujocajatsrModel.new PresupuestoFlujoCajaTsrFocusTraversalPolicy(this);
			
			//presupuestoflujocajatsrFocusTraversalPolicy.setpresupuestoflujocajatsrJInternalFrame(this);
			
			this.setFocusTraversalPolicy(presupuestoflujocajatsrModel);
			
			
			this.jContentPaneDetallePresupuestoFlujoCajaTsr = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePresupuestoFlujoCajaTsr = new GridBagLayout();	
			this.jContentPaneDetallePresupuestoFlujoCajaTsr.setLayout(gridaBagLayoutDetallePresupuestoFlujoCajaTsr);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPresupuestoFlujoCajaTsr = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
				this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
					
				
				this.jContentPaneDetallePresupuestoFlujoCajaTsr.add(jTtoolBarDetallePresupuestoFlujoCajaTsr, gridBagConstraintsPresupuestoFlujoCajaTsr);								
				
}
			
			this.jScrollPanelDatosEdicionPresupuestoFlujoCajaTsr=   new JScrollPane(jContentPaneDetallePresupuestoFlujoCajaTsr,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPresupuestoFlujoCajaTsr=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
	        
			this.jContentPaneDetallePresupuestoFlujoCajaTsr.add(jPanelCamposPresupuestoFlujoCajaTsr, gridBagConstraintsPresupuestoFlujoCajaTsr);
			
			
			
			
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
						&& presupuestoflujocajatsrSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.presupuestoflujocajatsrSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPresupuestoFlujoCajaTsr= new GridBagConstraints();
						this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
						this.jContentPaneDetallePresupuestoFlujoCajaTsr.add(this.jTabbedPaneRelacionesPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPresupuestoFlujoCajaTsr.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPresupuestoFlujoCajaTsr.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
					this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
					
				
					this.jContentPaneDetallePresupuestoFlujoCajaTsr.add(jPanelCamposOcultosPresupuestoFlujoCajaTsr, gridBagConstraintsPresupuestoFlujoCajaTsr);
				
					this.jPanelCamposOcultosPresupuestoFlujoCajaTsr.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
	        this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePresupuestoFlujoCajaTsr.add(this.jPanelAccionesFormularioPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);							
			
			
			
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
	        this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
	        
			
			this.jContentPaneDetallePresupuestoFlujoCajaTsr.add(this.jPanelAccionesPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPresupuestoFlujoCajaTsr);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPresupuestoFlujoCajaTsr=   new JScrollPane(this.jPanelCamposPresupuestoFlujoCajaTsr,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);			
			
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
			
			
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
		
			
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPresupuestoFlujoCajaTsr;//jContentPane;
		
		return jScrollPanelDatosEdicionPresupuestoFlujoCajaTsr;
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
