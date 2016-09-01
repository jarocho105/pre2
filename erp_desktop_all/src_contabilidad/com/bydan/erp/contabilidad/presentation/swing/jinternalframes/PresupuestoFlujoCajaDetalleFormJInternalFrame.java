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
import com.bydan.erp.contabilidad.util.PresupuestoFlujoCajaConstantesFunciones;

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
public class PresupuestoFlujoCajaDetalleFormJInternalFrame extends PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePresupuestoFlujoCaja;
	
	protected JMenuBar jmenuBarDetallePresupuestoFlujoCaja;
	
	protected JMenu jmenuDetallePresupuestoFlujoCaja;
	protected JMenu jmenuDetalleArchivoPresupuestoFlujoCaja;
	protected JMenu jmenuDetalleAccionesPresupuestoFlujoCaja;
	protected JMenu jmenuDetalleDatosPresupuestoFlujoCaja;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePresupuestoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPresupuestoFlujoCaja;	
	protected GridBagConstraints gridBagConstraintsPresupuestoFlujoCaja;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional jInternalFrameDetallePresupuestoFlujoCaja;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public PresupuestoFlujoCajaSessionBean presupuestoflujocajaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;	
	
	public PresupuestoFlujoCajaLogic presupuestoflujocajaLogic;
	
	public JScrollPane jScrollPanelDatosPresupuestoFlujoCaja;
	public JScrollPane jScrollPanelDatosEdicionPresupuestoFlujoCaja;
	public JScrollPane jScrollPanelDatosGeneralPresupuestoFlujoCaja;
	
	protected JPanel jPanelCamposPresupuestoFlujoCaja;    
	protected JPanel jPanelCamposOcultosPresupuestoFlujoCaja;    	
	protected JPanel jPanelAccionesPresupuestoFlujoCaja;
	protected JPanel jPanelAccionesFormularioPresupuestoFlujoCaja;
    
	
	
	protected Integer iXPanelCamposPresupuestoFlujoCaja=0;
	protected Integer iYPanelCamposPresupuestoFlujoCaja=0;
	
	protected Integer iXPanelCamposOcultosPresupuestoFlujoCaja=0;
	protected Integer iYPanelCamposOcultosPresupuestoFlujoCaja=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPresupuestoFlujoCaja;
	public JButton jButtonModificarPresupuestoFlujoCaja;
	public JButton jButtonActualizarPresupuestoFlujoCaja;
    public JButton jButtonEliminarPresupuestoFlujoCaja;
	public JButton jButtonCancelarPresupuestoFlujoCaja;
    public JButton jButtonGuardarCambiosPresupuestoFlujoCaja;
	public JButton jButtonGuardarCambiosTablaPresupuestoFlujoCaja;
	protected JButton jButtonCerrarPresupuestoFlujoCaja;
	
	
	protected JButton jButtonProcesarInformacionPresupuestoFlujoCaja;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPresupuestoFlujoCaja;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPresupuestoFlujoCaja;
	protected JCheckBox jCheckBoxPostAccionSinMensajePresupuestoFlujoCaja;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPresupuestoFlujoCaja;
	protected JButton jButtonModificarToolBarPresupuestoFlujoCaja;
	protected JButton jButtonActualizarToolBarPresupuestoFlujoCaja;
    protected JButton jButtonEliminarToolBarPresupuestoFlujoCaja;
	protected JButton jButtonCancelarToolBarPresupuestoFlujoCaja;
    protected JButton jButtonGuardarCambiosToolBarPresupuestoFlujoCaja;
	protected JButton jButtonGuardarCambiosTablaToolBarPresupuestoFlujoCaja;
	protected JButton jButtonMostrarOcultarTablaToolBarPresupuestoFlujoCaja;
	protected JButton jButtonCerrarToolBarPresupuestoFlujoCaja;
	
	protected JButton jButtonProcesarInformacionToolBarPresupuestoFlujoCaja;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPresupuestoFlujoCaja;
	protected JMenuItem jMenuItemModificarPresupuestoFlujoCaja;
	protected JMenuItem jMenuItemActualizarPresupuestoFlujoCaja;
    protected JMenuItem jMenuItemEliminarPresupuestoFlujoCaja;
	protected JMenuItem jMenuItemCancelarPresupuestoFlujoCaja;
    protected JMenuItem jMenuItemGuardarCambiosPresupuestoFlujoCaja;
	protected JMenuItem jMenuItemGuardarCambiosTablaPresupuestoFlujoCaja;
	protected JMenuItem jMenuItemCerrarPresupuestoFlujoCaja;
	protected JMenuItem jMenuItemDetalleCerrarPresupuestoFlujoCaja;
	protected JMenuItem jMenuItemDetalleMostarOcultarPresupuestoFlujoCaja;
	
	protected JMenuItem jMenuItemProcesarInformacionPresupuestoFlujoCaja;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPresupuestoFlujoCaja;
	protected JMenuItem jMenuItemMostrarOcultarPresupuestoFlujoCaja;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPresupuestoFlujoCaja;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPresupuestoFlujoCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPresupuestoFlujoCaja;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPresupuestoFlujoCaja;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPresupuestoFlujoCaja;
	public JLabel jLabelIdPresupuestoFlujoCaja;
	public JLabel jLabelidPresupuestoFlujoCaja;
	public JButton jButtonidPresupuestoFlujoCajaBusqueda= new JButtonMe();

	public JPanel jPanelvalorPresupuestoFlujoCaja;
	public JLabel jLabelvalorPresupuestoFlujoCaja;
	public JTextField jTextFieldvalorPresupuestoFlujoCaja;
	public JButton jButtonvalorPresupuestoFlujoCajaBusqueda= new JButtonMe();

	public JPanel jPanelvalor_efectivoPresupuestoFlujoCaja;
	public JLabel jLabelvalor_efectivoPresupuestoFlujoCaja;
	public JTextField jTextFieldvalor_efectivoPresupuestoFlujoCaja;
	public JButton jButtonvalor_efectivoPresupuestoFlujoCajaBusqueda= new JButtonMe();

	public JPanel jPanelporcentajePresupuestoFlujoCaja;
	public JLabel jLabelporcentajePresupuestoFlujoCaja;
	public JTextField jTextFieldporcentajePresupuestoFlujoCaja;
	public JButton jButtonporcentajePresupuestoFlujoCajaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_presupuestoPresupuestoFlujoCaja;
	public JLabel jLabelfecha_presupuestoPresupuestoFlujoCaja;
	//public JFormattedTextField jDateChooserfecha_presupuestoPresupuestoFlujoCaja;

	public JDateChooser jDateChooserfecha_presupuestoPresupuestoFlujoCaja;
	public JButton jButtonfecha_presupuestoPresupuestoFlujoCajaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_procesoPresupuestoFlujoCaja;
	public JLabel jLabelfecha_procesoPresupuestoFlujoCaja;
	//public JFormattedTextField jDateChooserfecha_procesoPresupuestoFlujoCaja;

	public JDateChooser jDateChooserfecha_procesoPresupuestoFlujoCaja;
	public JButton jButtonfecha_procesoPresupuestoFlujoCajaBusqueda= new JButtonMe();

	public JPanel jPanelobservacionPresupuestoFlujoCaja;
	public JLabel jLabelobservacionPresupuestoFlujoCaja;
	public JTextArea jTextAreaobservacionPresupuestoFlujoCaja;
	public JScrollPane jscrollPaneobservacionPresupuestoFlujoCaja;
	public JButton jButtonobservacionPresupuestoFlujoCajaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPresupuestoFlujoCaja;
	public JLabel jLabelid_empresaPresupuestoFlujoCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPresupuestoFlujoCaja;
	public JButton jButtonid_empresaPresupuestoFlujoCaja= new JButtonMe();
	public JButton jButtonid_empresaPresupuestoFlujoCajaUpdate= new JButtonMe();
	public JButton jButtonid_empresaPresupuestoFlujoCajaBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contablePresupuestoFlujoCaja;
	public JLabel jLabelid_cuenta_contablePresupuestoFlujoCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contablePresupuestoFlujoCaja;
	public JButton jButtonid_cuenta_contablePresupuestoFlujoCaja= new JButtonMe();
	public JButton jButtonid_cuenta_contablePresupuestoFlujoCajaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contablePresupuestoFlujoCajaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contablePresupuestoFlujoCajaArbol= new JButtonMe();

	public JPanel jPanelid_ejercicioPresupuestoFlujoCaja;
	public JLabel jLabelid_ejercicioPresupuestoFlujoCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioPresupuestoFlujoCaja;
	public JButton jButtonid_ejercicioPresupuestoFlujoCaja= new JButtonMe();
	public JButton jButtonid_ejercicioPresupuestoFlujoCajaUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioPresupuestoFlujoCajaBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoPresupuestoFlujoCaja;
	public JLabel jLabelid_periodoPresupuestoFlujoCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoPresupuestoFlujoCaja;
	public JButton jButtonid_periodoPresupuestoFlujoCaja= new JButtonMe();
	public JButton jButtonid_periodoPresupuestoFlujoCajaUpdate= new JButtonMe();
	public JButton jButtonid_periodoPresupuestoFlujoCajaBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_costoPresupuestoFlujoCaja;
	public JLabel jLabelid_centro_costoPresupuestoFlujoCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoPresupuestoFlujoCaja;
	public JButton jButtonid_centro_costoPresupuestoFlujoCaja= new JButtonMe();
	public JButton jButtonid_centro_costoPresupuestoFlujoCajaUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoPresupuestoFlujoCajaBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoPresupuestoFlujoCajaArbol= new JButtonMe();

	public JPanel jPanelid_anioPresupuestoFlujoCaja;
	public JLabel jLabelid_anioPresupuestoFlujoCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioPresupuestoFlujoCaja;
	public JButton jButtonid_anioPresupuestoFlujoCaja= new JButtonMe();
	public JButton jButtonid_anioPresupuestoFlujoCajaUpdate= new JButtonMe();
	public JButton jButtonid_anioPresupuestoFlujoCajaBusqueda= new JButtonMe();

	public JPanel jPanelid_mesPresupuestoFlujoCaja;
	public JLabel jLabelid_mesPresupuestoFlujoCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesPresupuestoFlujoCaja;
	public JButton jButtonid_mesPresupuestoFlujoCaja= new JButtonMe();
	public JButton jButtonid_mesPresupuestoFlujoCajaUpdate= new JButtonMe();
	public JButton jButtonid_mesPresupuestoFlujoCajaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPresupuestoFlujoCaja;
	
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
		
	public int iWidthFormulario=880;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=352;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PresupuestoFlujoCajaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPresupuestoFlujoCaja=new JPanel();
				this.jPanelAccionesFormularioPresupuestoFlujoCaja=new JPanel();
				this.jmenuBarDetallePresupuestoFlujoCaja=new JMenuBar();
				this.jTtoolBarDetallePresupuestoFlujoCaja=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoFlujoCajaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PresupuestoFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PresupuestoFlujoCajaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PresupuestoFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoFlujoCajaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresupuestoFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoFlujoCajaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresupuestoFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoFlujoCajaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PresupuestoFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPresupuestoFlujoCaja() {
		return this.jButtonActualizarToolBarPresupuestoFlujoCaja;
	}
	
	public JButton getjButtonEliminarToolBarPresupuestoFlujoCaja() {
		return this.jButtonEliminarToolBarPresupuestoFlujoCaja;
	}
	
	public JButton getjButtonCancelarToolBarPresupuestoFlujoCaja() {
		return this.jButtonCancelarToolBarPresupuestoFlujoCaja;
	}		
	
	public JButton getjButtonProcesarInformacionPresupuestoFlujoCaja() {
		return this.jButtonProcesarInformacionPresupuestoFlujoCaja;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPresupuestoFlujoCaja)	{
		this.jButtonProcesarInformacionPresupuestoFlujoCaja = jButtonProcesarInformacionPresupuestoFlujoCaja;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPresupuestoFlujoCaja() {
		return this.jComboBoxTiposAccionesPresupuestoFlujoCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPresupuestoFlujoCaja(
			JComboBox jComboBoxTiposRelacionesPresupuestoFlujoCaja) {
		this.jComboBoxTiposRelacionesPresupuestoFlujoCaja = jComboBoxTiposRelacionesPresupuestoFlujoCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPresupuestoFlujoCaja(
			JComboBox jComboBoxTiposAccionesPresupuestoFlujoCaja) {
		this.jComboBoxTiposAccionesPresupuestoFlujoCaja = jComboBoxTiposAccionesPresupuestoFlujoCaja;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPresupuestoFlujoCaja() {
		return this.jComboBoxTiposAccionesFormularioPresupuestoFlujoCaja;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPresupuestoFlujoCaja(
			JComboBox jComboBoxTiposAccionesFormularioPresupuestoFlujoCaja) {
		this.jComboBoxTiposAccionesFormularioPresupuestoFlujoCaja = jComboBoxTiposAccionesFormularioPresupuestoFlujoCaja;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.presupuestoflujocajaSessionBean=new PresupuestoFlujoCajaSessionBean();
		
		this.presupuestoflujocajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presupuestoflujocajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PresupuestoFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PresupuestoFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PresupuestoFlujoCajaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Presupuesto Flujo Caja MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {
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
	
		PresupuestoFlujoCajaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePresupuestoFlujoCaja= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPresupuestoFlujoCaja=new JButtonMe();
				this.jButtonModificarToolBarPresupuestoFlujoCaja=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPresupuestoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPresupuestoFlujoCaja,this.jTtoolBarDetallePresupuestoFlujoCaja,
							"actualizar","actualizar","Actualizar"+" "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPresupuestoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPresupuestoFlujoCaja,this.jTtoolBarDetallePresupuestoFlujoCaja,
							"eliminar","eliminar","Eliminar"+" "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPresupuestoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPresupuestoFlujoCaja,this.jTtoolBarDetallePresupuestoFlujoCaja,
							"cancelar","cancelar","Cancelar"+" "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPresupuestoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPresupuestoFlujoCaja,this.jTtoolBarDetallePresupuestoFlujoCaja,
							"guardarcambios","guardarcambios","Guardar"+" "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPresupuestoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPresupuestoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPresupuestoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePresupuestoFlujoCaja=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePresupuestoFlujoCaja=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPresupuestoFlujoCaja=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPresupuestoFlujoCaja=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPresupuestoFlujoCaja=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPresupuestoFlujoCaja= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPresupuestoFlujoCaja.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPresupuestoFlujoCaja,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPresupuestoFlujoCaja= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPresupuestoFlujoCaja.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPresupuestoFlujoCaja,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPresupuestoFlujoCaja= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPresupuestoFlujoCaja.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPresupuestoFlujoCaja,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPresupuestoFlujoCaja= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPresupuestoFlujoCaja.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPresupuestoFlujoCaja,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPresupuestoFlujoCaja= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPresupuestoFlujoCaja.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPresupuestoFlujoCaja,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPresupuestoFlujoCaja= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPresupuestoFlujoCaja.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPresupuestoFlujoCaja,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPresupuestoFlujoCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPresupuestoFlujoCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPresupuestoFlujoCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPresupuestoFlujoCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPresupuestoFlujoCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPresupuestoFlujoCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPresupuestoFlujoCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPresupuestoFlujoCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPresupuestoFlujoCaja,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPresupuestoFlujoCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPresupuestoFlujoCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPresupuestoFlujoCaja,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPresupuestoFlujoCaja.add(this.jMenuItemDetalleCerrarPresupuestoFlujoCaja);
		
		this.jmenuDetalleAccionesPresupuestoFlujoCaja.add(this.jMenuItemActualizarPresupuestoFlujoCaja);
		this.jmenuDetalleAccionesPresupuestoFlujoCaja.add(this.jMenuItemEliminarPresupuestoFlujoCaja);
		this.jmenuDetalleAccionesPresupuestoFlujoCaja.add(this.jMenuItemCancelarPresupuestoFlujoCaja);		
		
		//this.jmenuDetalleDatosPresupuestoFlujoCaja.add(this.jMenuItemDetalleAbrirOrderByPresupuestoFlujoCaja);				
		this.jmenuDetalleDatosPresupuestoFlujoCaja.add(this.jMenuItemDetalleMostarOcultarPresupuestoFlujoCaja);				
				
		//this.jmenuDetalleAccionesPresupuestoFlujoCaja.add(this.jMenuItemGuardarCambiosPresupuestoFlujoCaja);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePresupuestoFlujoCaja.add(this.jmenuDetalleArchivoPresupuestoFlujoCaja);		
		this.jmenuBarDetallePresupuestoFlujoCaja.add(this.jmenuDetalleAccionesPresupuestoFlujoCaja);		
		this.jmenuBarDetallePresupuestoFlujoCaja.add(this.jmenuDetalleDatosPresupuestoFlujoCaja);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePresupuestoFlujoCaja);				
	}
	
	
	public void inicializarElementosCamposPresupuestoFlujoCaja() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPresupuestoFlujoCaja = new JLabelMe();
		jLabelIdPresupuestoFlujoCaja.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPresupuestoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPresupuestoFlujoCaja = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPresupuestoFlujoCaja.setToolTipText(PresupuestoFlujoCajaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPresupuestoFlujoCaja= new GridBagLayout();

		this.jPanelidPresupuestoFlujoCaja.setLayout(this.gridaBagLayoutPresupuestoFlujoCaja);

		jLabelidPresupuestoFlujoCaja = new JLabel();
		jLabelidPresupuestoFlujoCaja.setText("Id");

		jLabelidPresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelvalorPresupuestoFlujoCaja = new JLabelMe();
		this.jLabelvalorPresupuestoFlujoCaja.setText(""+PresupuestoFlujoCajaConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorPresupuestoFlujoCaja.setToolTipText("Valor");
		this.jLabelvalorPresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorPresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorPresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorPresupuestoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorPresupuestoFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorPresupuestoFlujoCaja.setToolTipText(PresupuestoFlujoCajaConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutPresupuestoFlujoCaja = new GridBagLayout();
		this.jPanelvalorPresupuestoFlujoCaja.setLayout(this.gridaBagLayoutPresupuestoFlujoCaja);


		jTextFieldvalorPresupuestoFlujoCaja= new JTextFieldMe();
		jTextFieldvalorPresupuestoFlujoCaja.setEnabled(false);
		jTextFieldvalorPresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorPresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorPresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorPresupuestoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorPresupuestoFlujoCaja.setText("0.0");

		this.jButtonvalorPresupuestoFlujoCajaBusqueda= new JButtonMe();
		this.jButtonvalorPresupuestoFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorPresupuestoFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorPresupuestoFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorPresupuestoFlujoCajaBusqueda.setText("U");
		this.jButtonvalorPresupuestoFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorPresupuestoFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorPresupuestoFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorPresupuestoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorPresupuestoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorPresupuestoFlujoCajaBusqueda"));

		if(this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorPresupuestoFlujoCajaBusqueda.setVisible(false);		}


					
		this.jLabelvalor_efectivoPresupuestoFlujoCaja = new JLabelMe();
		this.jLabelvalor_efectivoPresupuestoFlujoCaja.setText(""+PresupuestoFlujoCajaConstantesFunciones.LABEL_VALOREFECTIVO+" : *");
		this.jLabelvalor_efectivoPresupuestoFlujoCaja.setToolTipText("Valor Efectivo");
		this.jLabelvalor_efectivoPresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_efectivoPresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_efectivoPresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_efectivoPresupuestoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_efectivoPresupuestoFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_efectivoPresupuestoFlujoCaja.setToolTipText(PresupuestoFlujoCajaConstantesFunciones.LABEL_VALOREFECTIVO);
		this.gridaBagLayoutPresupuestoFlujoCaja = new GridBagLayout();
		this.jPanelvalor_efectivoPresupuestoFlujoCaja.setLayout(this.gridaBagLayoutPresupuestoFlujoCaja);


		jTextFieldvalor_efectivoPresupuestoFlujoCaja= new JTextFieldMe();
		jTextFieldvalor_efectivoPresupuestoFlujoCaja.setEnabled(false);
		jTextFieldvalor_efectivoPresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_efectivoPresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_efectivoPresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_efectivoPresupuestoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_efectivoPresupuestoFlujoCaja.setText("0.0");

		this.jButtonvalor_efectivoPresupuestoFlujoCajaBusqueda= new JButtonMe();
		this.jButtonvalor_efectivoPresupuestoFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_efectivoPresupuestoFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_efectivoPresupuestoFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_efectivoPresupuestoFlujoCajaBusqueda.setText("U");
		this.jButtonvalor_efectivoPresupuestoFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_efectivoPresupuestoFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_efectivoPresupuestoFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_efectivoPresupuestoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_efectivoPresupuestoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_efectivoPresupuestoFlujoCajaBusqueda"));

		if(this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_efectivoPresupuestoFlujoCajaBusqueda.setVisible(false);		}


					
		this.jLabelporcentajePresupuestoFlujoCaja = new JLabelMe();
		this.jLabelporcentajePresupuestoFlujoCaja.setText(""+PresupuestoFlujoCajaConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajePresupuestoFlujoCaja.setToolTipText("Porcentaje");
		this.jLabelporcentajePresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajePresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajePresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajePresupuestoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajePresupuestoFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajePresupuestoFlujoCaja.setToolTipText(PresupuestoFlujoCajaConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutPresupuestoFlujoCaja = new GridBagLayout();
		this.jPanelporcentajePresupuestoFlujoCaja.setLayout(this.gridaBagLayoutPresupuestoFlujoCaja);


		jTextFieldporcentajePresupuestoFlujoCaja= new JTextFieldMe();
		jTextFieldporcentajePresupuestoFlujoCaja.setEnabled(false);
		jTextFieldporcentajePresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajePresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajePresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajePresupuestoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajePresupuestoFlujoCaja.setText("0.0");

		this.jButtonporcentajePresupuestoFlujoCajaBusqueda= new JButtonMe();
		this.jButtonporcentajePresupuestoFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajePresupuestoFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajePresupuestoFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajePresupuestoFlujoCajaBusqueda.setText("U");
		this.jButtonporcentajePresupuestoFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajePresupuestoFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajePresupuestoFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajePresupuestoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajePresupuestoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajePresupuestoFlujoCajaBusqueda"));

		if(this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajePresupuestoFlujoCajaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_presupuestoPresupuestoFlujoCaja = new JLabelMe();
		this.jLabelfecha_presupuestoPresupuestoFlujoCaja.setText(""+PresupuestoFlujoCajaConstantesFunciones.LABEL_FECHAPRESUPUESTO+" : *");
		this.jLabelfecha_presupuestoPresupuestoFlujoCaja.setToolTipText("Fecha Presupuesto");
		this.jLabelfecha_presupuestoPresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_presupuestoPresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_presupuestoPresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_presupuestoPresupuestoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_presupuestoPresupuestoFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_presupuestoPresupuestoFlujoCaja.setToolTipText(PresupuestoFlujoCajaConstantesFunciones.LABEL_FECHAPRESUPUESTO);
		this.gridaBagLayoutPresupuestoFlujoCaja = new GridBagLayout();
		this.jPanelfecha_presupuestoPresupuestoFlujoCaja.setLayout(this.gridaBagLayoutPresupuestoFlujoCaja);


		//jFormattedTextFieldfecha_presupuestoPresupuestoFlujoCaja= new JFormattedTextFieldMe();

		jDateChooserfecha_presupuestoPresupuestoFlujoCaja= new JDateChooser();
		jDateChooserfecha_presupuestoPresupuestoFlujoCaja.setEnabled(false);
		jDateChooserfecha_presupuestoPresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_presupuestoPresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_presupuestoPresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_presupuestoPresupuestoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_presupuestoPresupuestoFlujoCaja.setDate(new Date());
		jDateChooserfecha_presupuestoPresupuestoFlujoCaja.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_presupuestoPresupuestoFlujoCaja.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_presupuestoPresupuestoFlujoCajaBusqueda= new JButtonMe();
		this.jButtonfecha_presupuestoPresupuestoFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_presupuestoPresupuestoFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_presupuestoPresupuestoFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_presupuestoPresupuestoFlujoCajaBusqueda.setText("U");
		this.jButtonfecha_presupuestoPresupuestoFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_presupuestoPresupuestoFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_presupuestoPresupuestoFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_presupuestoPresupuestoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_presupuestoPresupuestoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_presupuestoPresupuestoFlujoCajaBusqueda"));

		if(this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_presupuestoPresupuestoFlujoCajaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_procesoPresupuestoFlujoCaja = new JLabelMe();
		this.jLabelfecha_procesoPresupuestoFlujoCaja.setText(""+PresupuestoFlujoCajaConstantesFunciones.LABEL_FECHAPROCESO+" : *");
		this.jLabelfecha_procesoPresupuestoFlujoCaja.setToolTipText("Fecha Proceso");
		this.jLabelfecha_procesoPresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_procesoPresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_procesoPresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_procesoPresupuestoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_procesoPresupuestoFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_procesoPresupuestoFlujoCaja.setToolTipText(PresupuestoFlujoCajaConstantesFunciones.LABEL_FECHAPROCESO);
		this.gridaBagLayoutPresupuestoFlujoCaja = new GridBagLayout();
		this.jPanelfecha_procesoPresupuestoFlujoCaja.setLayout(this.gridaBagLayoutPresupuestoFlujoCaja);


		//jFormattedTextFieldfecha_procesoPresupuestoFlujoCaja= new JFormattedTextFieldMe();

		jDateChooserfecha_procesoPresupuestoFlujoCaja= new JDateChooser();
		jDateChooserfecha_procesoPresupuestoFlujoCaja.setEnabled(false);
		jDateChooserfecha_procesoPresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_procesoPresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_procesoPresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_procesoPresupuestoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_procesoPresupuestoFlujoCaja.setDate(new Date());
		jDateChooserfecha_procesoPresupuestoFlujoCaja.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_procesoPresupuestoFlujoCaja.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_procesoPresupuestoFlujoCajaBusqueda= new JButtonMe();
		this.jButtonfecha_procesoPresupuestoFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_procesoPresupuestoFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_procesoPresupuestoFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_procesoPresupuestoFlujoCajaBusqueda.setText("U");
		this.jButtonfecha_procesoPresupuestoFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_procesoPresupuestoFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_procesoPresupuestoFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_procesoPresupuestoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_procesoPresupuestoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_procesoPresupuestoFlujoCajaBusqueda"));

		if(this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_procesoPresupuestoFlujoCajaBusqueda.setVisible(false);		}


					
		this.jLabelobservacionPresupuestoFlujoCaja = new JLabelMe();
		this.jLabelobservacionPresupuestoFlujoCaja.setText(""+PresupuestoFlujoCajaConstantesFunciones.LABEL_OBSERVACION+" : *");
		this.jLabelobservacionPresupuestoFlujoCaja.setToolTipText("Observacion");
		this.jLabelobservacionPresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacionPresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacionPresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelobservacionPresupuestoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelobservacionPresupuestoFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelobservacionPresupuestoFlujoCaja.setToolTipText(PresupuestoFlujoCajaConstantesFunciones.LABEL_OBSERVACION);
		this.gridaBagLayoutPresupuestoFlujoCaja = new GridBagLayout();
		this.jPanelobservacionPresupuestoFlujoCaja.setLayout(this.gridaBagLayoutPresupuestoFlujoCaja);


		jTextAreaobservacionPresupuestoFlujoCaja= new JTextAreaMe();
		jTextAreaobservacionPresupuestoFlujoCaja.setEnabled(false);
		jTextAreaobservacionPresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionPresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionPresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionPresupuestoFlujoCaja.setLineWrap(true);
		jTextAreaobservacionPresupuestoFlujoCaja.setWrapStyleWord(true);
		jTextAreaobservacionPresupuestoFlujoCaja.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaobservacionPresupuestoFlujoCaja.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreaobservacionPresupuestoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneobservacionPresupuestoFlujoCaja = new JScrollPane(jTextAreaobservacionPresupuestoFlujoCaja);
		jscrollPaneobservacionPresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneobservacionPresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneobservacionPresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonobservacionPresupuestoFlujoCajaBusqueda= new JButtonMe();
		this.jButtonobservacionPresupuestoFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacionPresupuestoFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacionPresupuestoFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonobservacionPresupuestoFlujoCajaBusqueda.setText("U");
		this.jButtonobservacionPresupuestoFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonobservacionPresupuestoFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonobservacionPresupuestoFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaobservacionPresupuestoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaobservacionPresupuestoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"observacionPresupuestoFlujoCajaBusqueda"));

		if(this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonobservacionPresupuestoFlujoCajaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPresupuestoFlujoCaja() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPresupuestoFlujoCaja = new JLabelMe();
		this.jLabelid_empresaPresupuestoFlujoCaja.setText(""+PresupuestoFlujoCajaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPresupuestoFlujoCaja.setToolTipText("Empresa");
		this.jLabelid_empresaPresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPresupuestoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPresupuestoFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPresupuestoFlujoCaja.setToolTipText(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPresupuestoFlujoCaja = new GridBagLayout();
		this.jPanelid_empresaPresupuestoFlujoCaja.setLayout(this.gridaBagLayoutPresupuestoFlujoCaja);


		jComboBoxid_empresaPresupuestoFlujoCaja= new JComboBoxMe();
		jComboBoxid_empresaPresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPresupuestoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPresupuestoFlujoCaja.setEnabled(false);

		this.jButtonid_empresaPresupuestoFlujoCaja= new JButtonMe();
		this.jButtonid_empresaPresupuestoFlujoCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPresupuestoFlujoCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPresupuestoFlujoCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPresupuestoFlujoCaja.setText("Buscar");
		this.jButtonid_empresaPresupuestoFlujoCaja.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPresupuestoFlujoCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPresupuestoFlujoCaja,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPresupuestoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPresupuestoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPresupuestoFlujoCaja"));

		this.jButtonid_empresaPresupuestoFlujoCajaBusqueda= new JButtonMe();
		this.jButtonid_empresaPresupuestoFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresupuestoFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresupuestoFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPresupuestoFlujoCajaBusqueda.setText("U");
		this.jButtonid_empresaPresupuestoFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPresupuestoFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPresupuestoFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPresupuestoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPresupuestoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPresupuestoFlujoCajaBusqueda"));

		if(this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPresupuestoFlujoCajaBusqueda.setVisible(false);		}

		this.jButtonid_empresaPresupuestoFlujoCajaUpdate= new JButtonMe();
		this.jButtonid_empresaPresupuestoFlujoCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresupuestoFlujoCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresupuestoFlujoCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPresupuestoFlujoCajaUpdate.setText("U");
		this.jButtonid_empresaPresupuestoFlujoCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPresupuestoFlujoCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPresupuestoFlujoCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPresupuestoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPresupuestoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPresupuestoFlujoCajaUpdate"));



					
		this.jLabelid_cuenta_contablePresupuestoFlujoCaja = new JLabelMe();
		this.jLabelid_cuenta_contablePresupuestoFlujoCaja.setText(""+PresupuestoFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contablePresupuestoFlujoCaja.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contablePresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contablePresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contablePresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contablePresupuestoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contablePresupuestoFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contablePresupuestoFlujoCaja.setToolTipText(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutPresupuestoFlujoCaja = new GridBagLayout();
		this.jPanelid_cuenta_contablePresupuestoFlujoCaja.setLayout(this.gridaBagLayoutPresupuestoFlujoCaja);


		jComboBoxid_cuenta_contablePresupuestoFlujoCaja= new JComboBoxMe();
		jComboBoxid_cuenta_contablePresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contablePresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contablePresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contablePresupuestoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contablePresupuestoFlujoCaja= new JButtonMe();
		this.jButtonid_cuenta_contablePresupuestoFlujoCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contablePresupuestoFlujoCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contablePresupuestoFlujoCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contablePresupuestoFlujoCaja.setText("Buscar");
		this.jButtonid_cuenta_contablePresupuestoFlujoCaja.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contablePresupuestoFlujoCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contablePresupuestoFlujoCaja,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contablePresupuestoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contablePresupuestoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contablePresupuestoFlujoCaja"));

		this.jButtonid_cuenta_contablePresupuestoFlujoCajaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contablePresupuestoFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contablePresupuestoFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contablePresupuestoFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contablePresupuestoFlujoCajaBusqueda.setText("U");
		this.jButtonid_cuenta_contablePresupuestoFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contablePresupuestoFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contablePresupuestoFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contablePresupuestoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contablePresupuestoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contablePresupuestoFlujoCajaBusqueda"));

		if(this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contablePresupuestoFlujoCajaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contablePresupuestoFlujoCajaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contablePresupuestoFlujoCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contablePresupuestoFlujoCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contablePresupuestoFlujoCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contablePresupuestoFlujoCajaUpdate.setText("U");
		this.jButtonid_cuenta_contablePresupuestoFlujoCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contablePresupuestoFlujoCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contablePresupuestoFlujoCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contablePresupuestoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contablePresupuestoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contablePresupuestoFlujoCajaUpdate"));


		jButtonid_cuenta_contablePresupuestoFlujoCajaArbol= new JButtonMe();
		jButtonid_cuenta_contablePresupuestoFlujoCajaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contablePresupuestoFlujoCajaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contablePresupuestoFlujoCajaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contablePresupuestoFlujoCajaArbol.setText("Arbol");
		jButtonid_cuenta_contablePresupuestoFlujoCajaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contablePresupuestoFlujoCajaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contablePresupuestoFlujoCajaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contablePresupuestoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contablePresupuestoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contablePresupuestoFlujoCajaArbol"));



					
		this.jLabelid_ejercicioPresupuestoFlujoCaja = new JLabelMe();
		this.jLabelid_ejercicioPresupuestoFlujoCaja.setText(""+PresupuestoFlujoCajaConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioPresupuestoFlujoCaja.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioPresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioPresupuestoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioPresupuestoFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioPresupuestoFlujoCaja.setToolTipText(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutPresupuestoFlujoCaja = new GridBagLayout();
		this.jPanelid_ejercicioPresupuestoFlujoCaja.setLayout(this.gridaBagLayoutPresupuestoFlujoCaja);


		jComboBoxid_ejercicioPresupuestoFlujoCaja= new JComboBoxMe();
		jComboBoxid_ejercicioPresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioPresupuestoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioPresupuestoFlujoCaja.setEnabled(false);

		this.jButtonid_ejercicioPresupuestoFlujoCaja= new JButtonMe();
		this.jButtonid_ejercicioPresupuestoFlujoCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPresupuestoFlujoCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPresupuestoFlujoCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPresupuestoFlujoCaja.setText("Buscar");
		this.jButtonid_ejercicioPresupuestoFlujoCaja.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioPresupuestoFlujoCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPresupuestoFlujoCaja,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioPresupuestoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPresupuestoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPresupuestoFlujoCaja"));

		this.jButtonid_ejercicioPresupuestoFlujoCajaBusqueda= new JButtonMe();
		this.jButtonid_ejercicioPresupuestoFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPresupuestoFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPresupuestoFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPresupuestoFlujoCajaBusqueda.setText("U");
		this.jButtonid_ejercicioPresupuestoFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioPresupuestoFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPresupuestoFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioPresupuestoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPresupuestoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPresupuestoFlujoCajaBusqueda"));

		if(this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioPresupuestoFlujoCajaBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioPresupuestoFlujoCajaUpdate= new JButtonMe();
		this.jButtonid_ejercicioPresupuestoFlujoCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPresupuestoFlujoCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPresupuestoFlujoCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPresupuestoFlujoCajaUpdate.setText("U");
		this.jButtonid_ejercicioPresupuestoFlujoCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioPresupuestoFlujoCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPresupuestoFlujoCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioPresupuestoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPresupuestoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPresupuestoFlujoCajaUpdate"));



					
		this.jLabelid_periodoPresupuestoFlujoCaja = new JLabelMe();
		this.jLabelid_periodoPresupuestoFlujoCaja.setText(""+PresupuestoFlujoCajaConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoPresupuestoFlujoCaja.setToolTipText("Periodo");
		this.jLabelid_periodoPresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoPresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoPresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoPresupuestoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoPresupuestoFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoPresupuestoFlujoCaja.setToolTipText(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutPresupuestoFlujoCaja = new GridBagLayout();
		this.jPanelid_periodoPresupuestoFlujoCaja.setLayout(this.gridaBagLayoutPresupuestoFlujoCaja);


		jComboBoxid_periodoPresupuestoFlujoCaja= new JComboBoxMe();
		jComboBoxid_periodoPresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoPresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoPresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoPresupuestoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoPresupuestoFlujoCaja.setEnabled(false);

		this.jButtonid_periodoPresupuestoFlujoCaja= new JButtonMe();
		this.jButtonid_periodoPresupuestoFlujoCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPresupuestoFlujoCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPresupuestoFlujoCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPresupuestoFlujoCaja.setText("Buscar");
		this.jButtonid_periodoPresupuestoFlujoCaja.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoPresupuestoFlujoCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPresupuestoFlujoCaja,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoPresupuestoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPresupuestoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPresupuestoFlujoCaja"));

		this.jButtonid_periodoPresupuestoFlujoCajaBusqueda= new JButtonMe();
		this.jButtonid_periodoPresupuestoFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPresupuestoFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPresupuestoFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoPresupuestoFlujoCajaBusqueda.setText("U");
		this.jButtonid_periodoPresupuestoFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoPresupuestoFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPresupuestoFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoPresupuestoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPresupuestoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPresupuestoFlujoCajaBusqueda"));

		if(this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoPresupuestoFlujoCajaBusqueda.setVisible(false);		}

		this.jButtonid_periodoPresupuestoFlujoCajaUpdate= new JButtonMe();
		this.jButtonid_periodoPresupuestoFlujoCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPresupuestoFlujoCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPresupuestoFlujoCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoPresupuestoFlujoCajaUpdate.setText("U");
		this.jButtonid_periodoPresupuestoFlujoCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoPresupuestoFlujoCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPresupuestoFlujoCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoPresupuestoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPresupuestoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPresupuestoFlujoCajaUpdate"));



					
		this.jLabelid_centro_costoPresupuestoFlujoCaja = new JLabelMe();
		this.jLabelid_centro_costoPresupuestoFlujoCaja.setText(""+PresupuestoFlujoCajaConstantesFunciones.LABEL_IDCENTROCOSTO+" : *");
		this.jLabelid_centro_costoPresupuestoFlujoCaja.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoPresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoPresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoPresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoPresupuestoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoPresupuestoFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoPresupuestoFlujoCaja.setToolTipText(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutPresupuestoFlujoCaja = new GridBagLayout();
		this.jPanelid_centro_costoPresupuestoFlujoCaja.setLayout(this.gridaBagLayoutPresupuestoFlujoCaja);


		jComboBoxid_centro_costoPresupuestoFlujoCaja= new JComboBoxMe();
		jComboBoxid_centro_costoPresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoPresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoPresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoPresupuestoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_costoPresupuestoFlujoCaja= new JButtonMe();
		this.jButtonid_centro_costoPresupuestoFlujoCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoPresupuestoFlujoCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoPresupuestoFlujoCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoPresupuestoFlujoCaja.setText("Buscar");
		this.jButtonid_centro_costoPresupuestoFlujoCaja.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoPresupuestoFlujoCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoPresupuestoFlujoCaja,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoPresupuestoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoPresupuestoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoPresupuestoFlujoCaja"));

		this.jButtonid_centro_costoPresupuestoFlujoCajaBusqueda= new JButtonMe();
		this.jButtonid_centro_costoPresupuestoFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoPresupuestoFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoPresupuestoFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoPresupuestoFlujoCajaBusqueda.setText("U");
		this.jButtonid_centro_costoPresupuestoFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoPresupuestoFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoPresupuestoFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoPresupuestoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoPresupuestoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoPresupuestoFlujoCajaBusqueda"));

		if(this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoPresupuestoFlujoCajaBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoPresupuestoFlujoCajaUpdate= new JButtonMe();
		this.jButtonid_centro_costoPresupuestoFlujoCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoPresupuestoFlujoCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoPresupuestoFlujoCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoPresupuestoFlujoCajaUpdate.setText("U");
		this.jButtonid_centro_costoPresupuestoFlujoCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoPresupuestoFlujoCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoPresupuestoFlujoCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoPresupuestoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoPresupuestoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoPresupuestoFlujoCajaUpdate"));


		jButtonid_centro_costoPresupuestoFlujoCajaArbol= new JButtonMe();
		jButtonid_centro_costoPresupuestoFlujoCajaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoPresupuestoFlujoCajaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoPresupuestoFlujoCajaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoPresupuestoFlujoCajaArbol.setText("Arbol");
		jButtonid_centro_costoPresupuestoFlujoCajaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoPresupuestoFlujoCajaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoPresupuestoFlujoCajaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoPresupuestoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoPresupuestoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoPresupuestoFlujoCajaArbol"));



					
		this.jLabelid_anioPresupuestoFlujoCaja = new JLabelMe();
		this.jLabelid_anioPresupuestoFlujoCaja.setText(""+PresupuestoFlujoCajaConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioPresupuestoFlujoCaja.setToolTipText("Anio");
		this.jLabelid_anioPresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioPresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioPresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioPresupuestoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioPresupuestoFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioPresupuestoFlujoCaja.setToolTipText(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutPresupuestoFlujoCaja = new GridBagLayout();
		this.jPanelid_anioPresupuestoFlujoCaja.setLayout(this.gridaBagLayoutPresupuestoFlujoCaja);


		jComboBoxid_anioPresupuestoFlujoCaja= new JComboBoxMe();
		jComboBoxid_anioPresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioPresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioPresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioPresupuestoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioPresupuestoFlujoCaja.setEnabled(false);

		this.jButtonid_anioPresupuestoFlujoCaja= new JButtonMe();
		this.jButtonid_anioPresupuestoFlujoCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioPresupuestoFlujoCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioPresupuestoFlujoCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioPresupuestoFlujoCaja.setText("Buscar");
		this.jButtonid_anioPresupuestoFlujoCaja.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioPresupuestoFlujoCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioPresupuestoFlujoCaja,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioPresupuestoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioPresupuestoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioPresupuestoFlujoCaja"));

		this.jButtonid_anioPresupuestoFlujoCajaBusqueda= new JButtonMe();
		this.jButtonid_anioPresupuestoFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPresupuestoFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPresupuestoFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioPresupuestoFlujoCajaBusqueda.setText("U");
		this.jButtonid_anioPresupuestoFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioPresupuestoFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioPresupuestoFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioPresupuestoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioPresupuestoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioPresupuestoFlujoCajaBusqueda"));

		if(this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioPresupuestoFlujoCajaBusqueda.setVisible(false);		}

		this.jButtonid_anioPresupuestoFlujoCajaUpdate= new JButtonMe();
		this.jButtonid_anioPresupuestoFlujoCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPresupuestoFlujoCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPresupuestoFlujoCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioPresupuestoFlujoCajaUpdate.setText("U");
		this.jButtonid_anioPresupuestoFlujoCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioPresupuestoFlujoCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioPresupuestoFlujoCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioPresupuestoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioPresupuestoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioPresupuestoFlujoCajaUpdate"));



					
		this.jLabelid_mesPresupuestoFlujoCaja = new JLabelMe();
		this.jLabelid_mesPresupuestoFlujoCaja.setText(""+PresupuestoFlujoCajaConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesPresupuestoFlujoCaja.setToolTipText("Mes");
		this.jLabelid_mesPresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesPresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesPresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesPresupuestoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesPresupuestoFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesPresupuestoFlujoCaja.setToolTipText(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutPresupuestoFlujoCaja = new GridBagLayout();
		this.jPanelid_mesPresupuestoFlujoCaja.setLayout(this.gridaBagLayoutPresupuestoFlujoCaja);


		jComboBoxid_mesPresupuestoFlujoCaja= new JComboBoxMe();
		jComboBoxid_mesPresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesPresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesPresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesPresupuestoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesPresupuestoFlujoCaja.setEnabled(false);

		this.jButtonid_mesPresupuestoFlujoCaja= new JButtonMe();
		this.jButtonid_mesPresupuestoFlujoCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesPresupuestoFlujoCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesPresupuestoFlujoCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesPresupuestoFlujoCaja.setText("Buscar");
		this.jButtonid_mesPresupuestoFlujoCaja.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesPresupuestoFlujoCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesPresupuestoFlujoCaja,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesPresupuestoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesPresupuestoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesPresupuestoFlujoCaja"));

		this.jButtonid_mesPresupuestoFlujoCajaBusqueda= new JButtonMe();
		this.jButtonid_mesPresupuestoFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPresupuestoFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPresupuestoFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesPresupuestoFlujoCajaBusqueda.setText("U");
		this.jButtonid_mesPresupuestoFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesPresupuestoFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesPresupuestoFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesPresupuestoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesPresupuestoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesPresupuestoFlujoCajaBusqueda"));

		if(this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesPresupuestoFlujoCajaBusqueda.setVisible(false);		}

		this.jButtonid_mesPresupuestoFlujoCajaUpdate= new JButtonMe();
		this.jButtonid_mesPresupuestoFlujoCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPresupuestoFlujoCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPresupuestoFlujoCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesPresupuestoFlujoCajaUpdate.setText("U");
		this.jButtonid_mesPresupuestoFlujoCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesPresupuestoFlujoCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesPresupuestoFlujoCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesPresupuestoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesPresupuestoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesPresupuestoFlujoCajaUpdate"));



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
		//this.jInternalFrameDetallePresupuestoFlujoCaja = new PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Presupuesto Flujo Caja DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPresupuestoFlujoCaja= new GridBagLayout();
		

		
		String sToolTipPresupuestoFlujoCaja="";
		sToolTipPresupuestoFlujoCaja=PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPresupuestoFlujoCaja+="(Contabilidad.PresupuestoFlujoCaja)";
		}
		
		if(!this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {
			sToolTipPresupuestoFlujoCaja+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPresupuestoFlujoCaja = new JButtonMe();
		this.jButtonModificarPresupuestoFlujoCaja = new JButtonMe();
        this.jButtonActualizarPresupuestoFlujoCaja = new JButtonMe();
        this.jButtonEliminarPresupuestoFlujoCaja = new JButtonMe();
        this.jButtonCancelarPresupuestoFlujoCaja = new JButtonMe();
        this.jButtonGuardarCambiosPresupuestoFlujoCaja = new JButtonMe();
		this.jButtonGuardarCambiosTablaPresupuestoFlujoCaja = new JButtonMe();
		this.jButtonCerrarPresupuestoFlujoCaja = new JButtonMe();
		
		this.jScrollPanelDatosPresupuestoFlujoCaja = new JScrollPane();   
        this.jScrollPanelDatosEdicionPresupuestoFlujoCaja = new JScrollPane();
		this.jScrollPanelDatosGeneralPresupuestoFlujoCaja = new JScrollPane();
				
		
		
		this.jPanelCamposPresupuestoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPresupuestoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPresupuestoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPresupuestoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Presupuesto Flujo Caja";
		
		if(!this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPresupuestoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Flujo Cajas" + this.sPath));
		} else {
			this.jScrollPanelDatosPresupuestoFlujoCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPresupuestoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPresupuestoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPresupuestoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPresupuestoFlujoCaja.setName("jPanelCamposPresupuestoFlujoCaja"); 

		this.jPanelCamposOcultosPresupuestoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPresupuestoFlujoCaja.setName("jPanelCamposOcultosPresupuestoFlujoCaja"); 

        this.jPanelAccionesPresupuestoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPresupuestoFlujoCaja.setToolTipText("Acciones");
        this.jPanelAccionesPresupuestoFlujoCaja.setName("Acciones"); 

		this.jPanelAccionesFormularioPresupuestoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPresupuestoFlujoCaja.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPresupuestoFlujoCaja.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPresupuestoFlujoCaja.setText("Nuevo");
		this.jButtonModificarPresupuestoFlujoCaja.setText("Editar");
        this.jButtonActualizarPresupuestoFlujoCaja.setText("Actualizar");
        this.jButtonEliminarPresupuestoFlujoCaja.setText("Eliminar");
        this.jButtonCancelarPresupuestoFlujoCaja.setText("Cancelar");
        this.jButtonGuardarCambiosPresupuestoFlujoCaja.setText("Guardar");
		this.jButtonGuardarCambiosTablaPresupuestoFlujoCaja.setText("Guardar");
		this.jButtonCerrarPresupuestoFlujoCaja.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPresupuestoFlujoCaja,"nuevo_button","Nuevo",this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPresupuestoFlujoCaja,"modificar_button","Editar",this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPresupuestoFlujoCaja,"actualizar_button","Actualizar",this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPresupuestoFlujoCaja,"eliminar_button","Eliminar",this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPresupuestoFlujoCaja,"cancelar_button","Cancelar",this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPresupuestoFlujoCaja,"guardarcambios_button","Guardar",this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPresupuestoFlujoCaja,"guardarcambiostabla_button","Guardar",this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPresupuestoFlujoCaja,"cerrar_button","Salir",this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPresupuestoFlujoCaja.setToolTipText("Nuevo"+" "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPresupuestoFlujoCaja.setToolTipText("Editar"+" "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPresupuestoFlujoCaja.setToolTipText("Actualizar"+" "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPresupuestoFlujoCaja.setToolTipText("Eliminar)"+" "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPresupuestoFlujoCaja.setToolTipText("Cancelar"+" "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPresupuestoFlujoCaja.setToolTipText("Guardar"+" "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPresupuestoFlujoCaja.setToolTipText("Guardar"+" "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPresupuestoFlujoCaja.setToolTipText("Salir"+" "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPresupuestoFlujoCaja";
		inputMap = this.jButtonNuevoPresupuestoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPresupuestoFlujoCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPresupuestoFlujoCaja"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPresupuestoFlujoCaja";
		inputMap = this.jButtonActualizarPresupuestoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPresupuestoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPresupuestoFlujoCaja"));
		
		//ELIMINAR
		sMapKey = "EliminarPresupuestoFlujoCaja";
		inputMap = this.jButtonEliminarPresupuestoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPresupuestoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPresupuestoFlujoCaja"));
		
		//CANCELAR	
		sMapKey = "CancelarPresupuestoFlujoCaja";
		inputMap = this.jButtonCancelarPresupuestoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPresupuestoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPresupuestoFlujoCaja"));
		
		//CERRAR		
		sMapKey = "CerrarPresupuestoFlujoCaja";
		inputMap = this.jButtonCerrarPresupuestoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPresupuestoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPresupuestoFlujoCaja"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPresupuestoFlujoCaja";
		inputMap = this.jButtonGuardarCambiosTablaPresupuestoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPresupuestoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPresupuestoFlujoCaja"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPresupuestoFlujoCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPresupuestoFlujoCaja.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPresupuestoFlujoCaja.setToolTipText("Nuevo PresupuestoFlujoCaja");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPresupuestoFlujoCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPresupuestoFlujoCaja.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPresupuestoFlujoCaja.setToolTipText("Sin Cerrar Ventana PresupuestoFlujoCaja");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePresupuestoFlujoCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePresupuestoFlujoCaja.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePresupuestoFlujoCaja.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPresupuestoFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPresupuestoFlujoCaja.setText("Accion");
		this.jComboBoxTiposAccionesPresupuestoFlujoCaja.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPresupuestoFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPresupuestoFlujoCaja.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPresupuestoFlujoCaja.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPresupuestoFlujoCaja = new JLabelMe();
		
		this.jLabelAccionesPresupuestoFlujoCaja.setText("Acciones");		
		this.jLabelAccionesPresupuestoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresupuestoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresupuestoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPresupuestoFlujoCaja();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPresupuestoFlujoCaja();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPresupuestoFlujoCaja=new JTabbedPane();
		this.jTabbedPaneRelacionesPresupuestoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPresupuestoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPresupuestoFlujoCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresupuestoFlujoCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresupuestoFlujoCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPresupuestoFlujoCaja.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPresupuestoFlujoCaja.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPresupuestoFlujoCaja.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPresupuestoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPresupuestoFlujoCaja = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPresupuestoFlujoCaja = new GridBagLayout();
		
		this.jPanelCamposPresupuestoFlujoCaja.setLayout(gridaBagLayoutCamposPresupuestoFlujoCaja);
		this.jPanelCamposOcultosPresupuestoFlujoCaja.setLayout(gridaBagLayoutCamposOcultosPresupuestoFlujoCaja);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPresupuestoFlujoCaja.add(jLabelIdPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);



	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 1;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPresupuestoFlujoCaja.add(jLabelidPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);


	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPresupuestoFlujoCaja.add(jLabelid_empresaPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 2;
		this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPresupuestoFlujoCaja.add(jButtonid_empresaPresupuestoFlujoCajaBusqueda, this.gridBagConstraintsPresupuestoFlujoCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 3;
		this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPresupuestoFlujoCaja.add(jButtonid_empresaPresupuestoFlujoCajaUpdate, this.gridBagConstraintsPresupuestoFlujoCaja);
	}

	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 1;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPresupuestoFlujoCaja.add(jComboBoxid_empresaPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);


	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contablePresupuestoFlujoCaja.add(jLabelid_cuenta_contablePresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	//this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 2;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contablePresupuestoFlujoCaja.add(jButtonid_cuenta_contablePresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	//this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 3;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contablePresupuestoFlujoCaja.add(jButtonid_cuenta_contablePresupuestoFlujoCajaArbol, this.gridBagConstraintsPresupuestoFlujoCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 4;
		this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contablePresupuestoFlujoCaja.add(jButtonid_cuenta_contablePresupuestoFlujoCajaBusqueda, this.gridBagConstraintsPresupuestoFlujoCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 5;
		this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contablePresupuestoFlujoCaja.add(jButtonid_cuenta_contablePresupuestoFlujoCajaUpdate, this.gridBagConstraintsPresupuestoFlujoCaja);
	}

	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 1;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contablePresupuestoFlujoCaja.add(jComboBoxid_cuenta_contablePresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);


	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioPresupuestoFlujoCaja.add(jLabelid_ejercicioPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 2;
		this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPresupuestoFlujoCaja.add(jButtonid_ejercicioPresupuestoFlujoCajaBusqueda, this.gridBagConstraintsPresupuestoFlujoCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 3;
		this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPresupuestoFlujoCaja.add(jButtonid_ejercicioPresupuestoFlujoCajaUpdate, this.gridBagConstraintsPresupuestoFlujoCaja);
	}

	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 1;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioPresupuestoFlujoCaja.add(jComboBoxid_ejercicioPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);


	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoPresupuestoFlujoCaja.add(jLabelid_periodoPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 2;
		this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoPresupuestoFlujoCaja.add(jButtonid_periodoPresupuestoFlujoCajaBusqueda, this.gridBagConstraintsPresupuestoFlujoCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 3;
		this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoPresupuestoFlujoCaja.add(jButtonid_periodoPresupuestoFlujoCajaUpdate, this.gridBagConstraintsPresupuestoFlujoCaja);
	}

	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 1;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoPresupuestoFlujoCaja.add(jComboBoxid_periodoPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);


	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_costoPresupuestoFlujoCaja.add(jLabelid_centro_costoPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 2;
		this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoPresupuestoFlujoCaja.add(jButtonid_centro_costoPresupuestoFlujoCajaBusqueda, this.gridBagConstraintsPresupuestoFlujoCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 3;
		this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoPresupuestoFlujoCaja.add(jButtonid_centro_costoPresupuestoFlujoCajaUpdate, this.gridBagConstraintsPresupuestoFlujoCaja);
	}

	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 1;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_costoPresupuestoFlujoCaja.add(jComboBoxid_centro_costoPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);


	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorPresupuestoFlujoCaja.add(jLabelvalorPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 2;
		this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorPresupuestoFlujoCaja.add(jButtonvalorPresupuestoFlujoCajaBusqueda, this.gridBagConstraintsPresupuestoFlujoCaja);
	}

	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 1;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorPresupuestoFlujoCaja.add(jTextFieldvalorPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);


	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_efectivoPresupuestoFlujoCaja.add(jLabelvalor_efectivoPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 2;
		this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_efectivoPresupuestoFlujoCaja.add(jButtonvalor_efectivoPresupuestoFlujoCajaBusqueda, this.gridBagConstraintsPresupuestoFlujoCaja);
	}

	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 1;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_efectivoPresupuestoFlujoCaja.add(jTextFieldvalor_efectivoPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);


	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajePresupuestoFlujoCaja.add(jLabelporcentajePresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 2;
		this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajePresupuestoFlujoCaja.add(jButtonporcentajePresupuestoFlujoCajaBusqueda, this.gridBagConstraintsPresupuestoFlujoCaja);
	}

	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 1;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajePresupuestoFlujoCaja.add(jTextFieldporcentajePresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);


	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_presupuestoPresupuestoFlujoCaja.add(jLabelfecha_presupuestoPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 2;
		this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_presupuestoPresupuestoFlujoCaja.add(jButtonfecha_presupuestoPresupuestoFlujoCajaBusqueda, this.gridBagConstraintsPresupuestoFlujoCaja);
	}

	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 1;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_presupuestoPresupuestoFlujoCaja.add(jDateChooserfecha_presupuestoPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);


	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_procesoPresupuestoFlujoCaja.add(jLabelfecha_procesoPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 2;
		this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_procesoPresupuestoFlujoCaja.add(jButtonfecha_procesoPresupuestoFlujoCajaBusqueda, this.gridBagConstraintsPresupuestoFlujoCaja);
	}

	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 1;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_procesoPresupuestoFlujoCaja.add(jDateChooserfecha_procesoPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);


	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelobservacionPresupuestoFlujoCaja.add(jLabelobservacionPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 2;
		this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelobservacionPresupuestoFlujoCaja.add(jButtonobservacionPresupuestoFlujoCajaBusqueda, this.gridBagConstraintsPresupuestoFlujoCaja);
	}

	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 1;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelobservacionPresupuestoFlujoCaja.add(jscrollPaneobservacionPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);


	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioPresupuestoFlujoCaja.add(jLabelid_anioPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 2;
		this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioPresupuestoFlujoCaja.add(jButtonid_anioPresupuestoFlujoCajaBusqueda, this.gridBagConstraintsPresupuestoFlujoCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 3;
		this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioPresupuestoFlujoCaja.add(jButtonid_anioPresupuestoFlujoCajaUpdate, this.gridBagConstraintsPresupuestoFlujoCaja);
	}

	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 1;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioPresupuestoFlujoCaja.add(jComboBoxid_anioPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);


	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesPresupuestoFlujoCaja.add(jLabelid_mesPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 2;
		this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesPresupuestoFlujoCaja.add(jButtonid_mesPresupuestoFlujoCajaBusqueda, this.gridBagConstraintsPresupuestoFlujoCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 3;
		this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesPresupuestoFlujoCaja.add(jButtonid_mesPresupuestoFlujoCajaUpdate, this.gridBagConstraintsPresupuestoFlujoCaja);
	}

	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 1;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesPresupuestoFlujoCaja.add(jComboBoxid_mesPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iYPanelCamposPresupuestoFlujoCaja;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iXPanelCamposPresupuestoFlujoCaja++;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoFlujoCaja.add(this.jPanelidPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);



	if(iXPanelCamposPresupuestoFlujoCaja % 2==0) {
		iXPanelCamposPresupuestoFlujoCaja=0;
		iYPanelCamposPresupuestoFlujoCaja++;
	}
	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iYPanelCamposPresupuestoFlujoCaja;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iXPanelCamposPresupuestoFlujoCaja++;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoFlujoCaja.add(this.jPanelid_cuenta_contablePresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);



	if(iXPanelCamposPresupuestoFlujoCaja % 2==0) {
		iXPanelCamposPresupuestoFlujoCaja=0;
		iYPanelCamposPresupuestoFlujoCaja++;
	}
	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iYPanelCamposPresupuestoFlujoCaja;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iXPanelCamposPresupuestoFlujoCaja++;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoFlujoCaja.add(this.jPanelid_centro_costoPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);



	if(iXPanelCamposPresupuestoFlujoCaja % 2==0) {
		iXPanelCamposPresupuestoFlujoCaja=0;
		iYPanelCamposPresupuestoFlujoCaja++;
	}
	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iYPanelCamposPresupuestoFlujoCaja;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iXPanelCamposPresupuestoFlujoCaja++;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoFlujoCaja.add(this.jPanelvalorPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);



	if(iXPanelCamposPresupuestoFlujoCaja % 2==0) {
		iXPanelCamposPresupuestoFlujoCaja=0;
		iYPanelCamposPresupuestoFlujoCaja++;
	}
	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iYPanelCamposPresupuestoFlujoCaja;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iXPanelCamposPresupuestoFlujoCaja++;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoFlujoCaja.add(this.jPanelvalor_efectivoPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);



	if(iXPanelCamposPresupuestoFlujoCaja % 2==0) {
		iXPanelCamposPresupuestoFlujoCaja=0;
		iYPanelCamposPresupuestoFlujoCaja++;
	}
	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iYPanelCamposPresupuestoFlujoCaja;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iXPanelCamposPresupuestoFlujoCaja++;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoFlujoCaja.add(this.jPanelporcentajePresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);



	if(iXPanelCamposPresupuestoFlujoCaja % 2==0) {
		iXPanelCamposPresupuestoFlujoCaja=0;
		iYPanelCamposPresupuestoFlujoCaja++;
	}
	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iYPanelCamposPresupuestoFlujoCaja;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iXPanelCamposPresupuestoFlujoCaja++;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoFlujoCaja.add(this.jPanelfecha_presupuestoPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);



	if(iXPanelCamposPresupuestoFlujoCaja % 2==0) {
		iXPanelCamposPresupuestoFlujoCaja=0;
		iYPanelCamposPresupuestoFlujoCaja++;
	}
	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iYPanelCamposPresupuestoFlujoCaja;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iXPanelCamposPresupuestoFlujoCaja++;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoFlujoCaja.add(this.jPanelfecha_procesoPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);



	if(iXPanelCamposPresupuestoFlujoCaja % 2==0) {
		iXPanelCamposPresupuestoFlujoCaja=0;
		iYPanelCamposPresupuestoFlujoCaja++;
	}
	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iYPanelCamposPresupuestoFlujoCaja;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iXPanelCamposPresupuestoFlujoCaja++;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoFlujoCaja.add(this.jPanelobservacionPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);



	if(iXPanelCamposPresupuestoFlujoCaja % 2==0) {
		iXPanelCamposPresupuestoFlujoCaja=0;
		iYPanelCamposPresupuestoFlujoCaja++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iYPanelCamposOcultosPresupuestoFlujoCaja;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iXPanelCamposOcultosPresupuestoFlujoCaja++;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPresupuestoFlujoCaja.add(this.jPanelid_empresaPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);



	if(iXPanelCamposOcultosPresupuestoFlujoCaja % 2==0) {
		iXPanelCamposOcultosPresupuestoFlujoCaja=0;
		iYPanelCamposOcultosPresupuestoFlujoCaja++;
	}
	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iYPanelCamposOcultosPresupuestoFlujoCaja;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iXPanelCamposOcultosPresupuestoFlujoCaja++;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPresupuestoFlujoCaja.add(this.jPanelid_ejercicioPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);



	if(iXPanelCamposOcultosPresupuestoFlujoCaja % 2==0) {
		iXPanelCamposOcultosPresupuestoFlujoCaja=0;
		iYPanelCamposOcultosPresupuestoFlujoCaja++;
	}
	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iYPanelCamposOcultosPresupuestoFlujoCaja;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iXPanelCamposOcultosPresupuestoFlujoCaja++;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPresupuestoFlujoCaja.add(this.jPanelid_periodoPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);



	if(iXPanelCamposOcultosPresupuestoFlujoCaja % 2==0) {
		iXPanelCamposOcultosPresupuestoFlujoCaja=0;
		iYPanelCamposOcultosPresupuestoFlujoCaja++;
	}
	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iYPanelCamposOcultosPresupuestoFlujoCaja;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iXPanelCamposOcultosPresupuestoFlujoCaja++;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPresupuestoFlujoCaja.add(this.jPanelid_anioPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);



	if(iXPanelCamposOcultosPresupuestoFlujoCaja % 2==0) {
		iXPanelCamposOcultosPresupuestoFlujoCaja=0;
		iYPanelCamposOcultosPresupuestoFlujoCaja++;
	}
	this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iYPanelCamposOcultosPresupuestoFlujoCaja;
	this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iXPanelCamposOcultosPresupuestoFlujoCaja++;
	this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPresupuestoFlujoCaja.add(this.jPanelid_mesPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);



	if(iXPanelCamposOcultosPresupuestoFlujoCaja % 2==0) {
		iXPanelCamposOcultosPresupuestoFlujoCaja=0;
		iYPanelCamposOcultosPresupuestoFlujoCaja++;
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
			
		GridBagLayout gridaBagLayoutAccionesPresupuestoFlujoCaja= new GridBagLayout();
		this.jPanelAccionesPresupuestoFlujoCaja.setLayout(gridaBagLayoutAccionesPresupuestoFlujoCaja);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPresupuestoFlujoCaja= new GridBagLayout();
		this.jPanelAccionesFormularioPresupuestoFlujoCaja.setLayout(gridaBagLayoutAccionesFormularioPresupuestoFlujoCaja);
		
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPresupuestoFlujoCaja.add(this.jComboBoxTiposAccionesFormularioPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);

		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPresupuestoFlujoCaja.add(this.jCheckBoxPostAccionNuevoPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.presupuestoflujocajaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPresupuestoFlujoCaja.add(this.jCheckBoxPostAccionSinCerrarPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.presupuestoflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPresupuestoFlujoCaja.add(this.jCheckBoxPostAccionSinMensajePresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iPosXAccion++;
			
		this.jPanelAccionesPresupuestoFlujoCaja.add(this.jButtonModificarPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);							

		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx =iPosXAccion++;
			
		this.jPanelAccionesPresupuestoFlujoCaja.add(this.jButtonEliminarPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
		
			
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;		
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iPosXAccion++;
		
		this.jPanelAccionesPresupuestoFlujoCaja.add(this.jButtonActualizarPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);


		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;		
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = iPosXAccion++;
		
		this.jPanelAccionesPresupuestoFlujoCaja.add(this.jButtonGuardarCambiosPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);	
		
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = 0;		
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx =iPosXAccion++;
		
		this.jPanelAccionesPresupuestoFlujoCaja.add(this.jButtonCancelarPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPresupuestoFlujoCaja = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPresupuestoFlujoCaja);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();						
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;		
			//this.gridBagConstraintsPresupuestoFlujoCaja.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPresupuestoFlujoCaja.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx =0;
		this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPresupuestoFlujoCaja.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PresupuestoFlujoCajaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePresupuestoFlujoCaja = new PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Presupuesto Flujo Caja DATOS");
			
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
		    
			PresupuestoFlujoCajaModel presupuestoflujocajaModel=new PresupuestoFlujoCajaModel(this);
			
			//SI USARA CLASE INTERNA
			//PresupuestoFlujoCajaModel.PresupuestoFlujoCajaFocusTraversalPolicy presupuestoflujocajaFocusTraversalPolicy = presupuestoflujocajaModel.new PresupuestoFlujoCajaFocusTraversalPolicy(this);
			
			//presupuestoflujocajaFocusTraversalPolicy.setpresupuestoflujocajaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(presupuestoflujocajaModel);
			
			
			this.jContentPaneDetallePresupuestoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePresupuestoFlujoCaja = new GridBagLayout();	
			this.jContentPaneDetallePresupuestoFlujoCaja.setLayout(gridaBagLayoutDetallePresupuestoFlujoCaja);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPresupuestoFlujoCaja = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
				this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;
					
				
				this.jContentPaneDetallePresupuestoFlujoCaja.add(jTtoolBarDetallePresupuestoFlujoCaja, gridBagConstraintsPresupuestoFlujoCaja);								
				
}
			
			this.jScrollPanelDatosEdicionPresupuestoFlujoCaja=   new JScrollPane(jContentPaneDetallePresupuestoFlujoCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPresupuestoFlujoCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresupuestoFlujoCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresupuestoFlujoCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPresupuestoFlujoCaja=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPresupuestoFlujoCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresupuestoFlujoCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresupuestoFlujoCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;
	        
			this.jContentPaneDetallePresupuestoFlujoCaja.add(jPanelCamposPresupuestoFlujoCaja, gridBagConstraintsPresupuestoFlujoCaja);
			
			
			
			
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
						&& presupuestoflujocajaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.presupuestoflujocajaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPresupuestoFlujoCaja= new GridBagConstraints();
						this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;
						this.jContentPaneDetallePresupuestoFlujoCaja.add(this.jTabbedPaneRelacionesPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPresupuestoFlujoCaja.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPresupuestoFlujoCaja.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
					this.gridBagConstraintsPresupuestoFlujoCaja.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;
					
				
					this.jContentPaneDetallePresupuestoFlujoCaja.add(jPanelCamposOcultosPresupuestoFlujoCaja, gridBagConstraintsPresupuestoFlujoCaja);
				
					this.jPanelCamposOcultosPresupuestoFlujoCaja.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;
	        this.gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePresupuestoFlujoCaja.add(this.jPanelAccionesFormularioPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);							
			
			
			
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
	        this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;
	        
			
			this.jContentPaneDetallePresupuestoFlujoCaja.add(this.jPanelAccionesPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPresupuestoFlujoCaja);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPresupuestoFlujoCaja=   new JScrollPane(this.jPanelCamposPresupuestoFlujoCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPresupuestoFlujoCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresupuestoFlujoCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresupuestoFlujoCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;
			this.gridBagConstraintsPresupuestoFlujoCaja.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPresupuestoFlujoCaja.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPresupuestoFlujoCaja.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);			
			
			this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCaja.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
			
			
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
		
			
		this.gridBagConstraintsPresupuestoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCaja.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoFlujoCaja.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPresupuestoFlujoCaja, this.gridBagConstraintsPresupuestoFlujoCaja);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPresupuestoFlujoCaja;//jContentPane;
		
		return jScrollPanelDatosEdicionPresupuestoFlujoCaja;
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
