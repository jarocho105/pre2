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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.PresupuestoVentasPunVenConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class PresupuestoVentasPunVenDetalleFormJInternalFrame extends PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePresupuestoVentasPunVen;
	
	protected JMenuBar jmenuBarDetallePresupuestoVentasPunVen;
	
	protected JMenu jmenuDetallePresupuestoVentasPunVen;
	protected JMenu jmenuDetalleArchivoPresupuestoVentasPunVen;
	protected JMenu jmenuDetalleAccionesPresupuestoVentasPunVen;
	protected JMenu jmenuDetalleDatosPresupuestoVentasPunVen;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePresupuestoVentasPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPresupuestoVentasPunVen;	
	protected GridBagConstraints gridBagConstraintsPresupuestoVentasPunVen;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional jInternalFrameDetallePresupuestoVentasPunVen;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_caja="";
	
	public PresupuestoVentasPunVenSessionBean presupuestoventaspunvenSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public CajaSessionBean cajaSessionBean;	
	
	public PresupuestoVentasPunVenLogic presupuestoventaspunvenLogic;
	
	public JScrollPane jScrollPanelDatosPresupuestoVentasPunVen;
	public JScrollPane jScrollPanelDatosEdicionPresupuestoVentasPunVen;
	public JScrollPane jScrollPanelDatosGeneralPresupuestoVentasPunVen;
	
	protected JPanel jPanelCamposPresupuestoVentasPunVen;    
	protected JPanel jPanelCamposOcultosPresupuestoVentasPunVen;    	
	protected JPanel jPanelAccionesPresupuestoVentasPunVen;
	protected JPanel jPanelAccionesFormularioPresupuestoVentasPunVen;
    
	
	
	protected Integer iXPanelCamposPresupuestoVentasPunVen=0;
	protected Integer iYPanelCamposPresupuestoVentasPunVen=0;
	
	protected Integer iXPanelCamposOcultosPresupuestoVentasPunVen=0;
	protected Integer iYPanelCamposOcultosPresupuestoVentasPunVen=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPresupuestoVentasPunVen;
	public JButton jButtonModificarPresupuestoVentasPunVen;
	public JButton jButtonActualizarPresupuestoVentasPunVen;
    public JButton jButtonEliminarPresupuestoVentasPunVen;
	public JButton jButtonCancelarPresupuestoVentasPunVen;
    public JButton jButtonGuardarCambiosPresupuestoVentasPunVen;
	public JButton jButtonGuardarCambiosTablaPresupuestoVentasPunVen;
	protected JButton jButtonCerrarPresupuestoVentasPunVen;
	
	
	protected JButton jButtonProcesarInformacionPresupuestoVentasPunVen;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPresupuestoVentasPunVen;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPresupuestoVentasPunVen;
	protected JCheckBox jCheckBoxPostAccionSinMensajePresupuestoVentasPunVen;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPresupuestoVentasPunVen;
	protected JButton jButtonModificarToolBarPresupuestoVentasPunVen;
	protected JButton jButtonActualizarToolBarPresupuestoVentasPunVen;
    protected JButton jButtonEliminarToolBarPresupuestoVentasPunVen;
	protected JButton jButtonCancelarToolBarPresupuestoVentasPunVen;
    protected JButton jButtonGuardarCambiosToolBarPresupuestoVentasPunVen;
	protected JButton jButtonGuardarCambiosTablaToolBarPresupuestoVentasPunVen;
	protected JButton jButtonMostrarOcultarTablaToolBarPresupuestoVentasPunVen;
	protected JButton jButtonCerrarToolBarPresupuestoVentasPunVen;
	
	protected JButton jButtonProcesarInformacionToolBarPresupuestoVentasPunVen;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPresupuestoVentasPunVen;
	protected JMenuItem jMenuItemModificarPresupuestoVentasPunVen;
	protected JMenuItem jMenuItemActualizarPresupuestoVentasPunVen;
    protected JMenuItem jMenuItemEliminarPresupuestoVentasPunVen;
	protected JMenuItem jMenuItemCancelarPresupuestoVentasPunVen;
    protected JMenuItem jMenuItemGuardarCambiosPresupuestoVentasPunVen;
	protected JMenuItem jMenuItemGuardarCambiosTablaPresupuestoVentasPunVen;
	protected JMenuItem jMenuItemCerrarPresupuestoVentasPunVen;
	protected JMenuItem jMenuItemDetalleCerrarPresupuestoVentasPunVen;
	protected JMenuItem jMenuItemDetalleMostarOcultarPresupuestoVentasPunVen;
	
	protected JMenuItem jMenuItemProcesarInformacionPresupuestoVentasPunVen;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPresupuestoVentasPunVen;
	protected JMenuItem jMenuItemMostrarOcultarPresupuestoVentasPunVen;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPresupuestoVentasPunVen;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPresupuestoVentasPunVen;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPresupuestoVentasPunVen;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPresupuestoVentasPunVen;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPresupuestoVentasPunVen;
	public JLabel jLabelIdPresupuestoVentasPunVen;
	public JLabel jLabelidPresupuestoVentasPunVen;
	public JButton jButtonidPresupuestoVentasPunVenBusqueda= new JButtonMe();

	public JPanel jPanelvalorPresupuestoVentasPunVen;
	public JLabel jLabelvalorPresupuestoVentasPunVen;
	public JTextField jTextFieldvalorPresupuestoVentasPunVen;
	public JButton jButtonvalorPresupuestoVentasPunVenBusqueda= new JButtonMe();

	public JPanel jPanelcantidadPresupuestoVentasPunVen;
	public JLabel jLabelcantidadPresupuestoVentasPunVen;
	public JTextField jTextFieldcantidadPresupuestoVentasPunVen;
	public JButton jButtoncantidadPresupuestoVentasPunVenBusqueda= new JButtonMe();

	public JPanel jPanelporcentajePresupuestoVentasPunVen;
	public JLabel jLabelporcentajePresupuestoVentasPunVen;
	public JTextField jTextFieldporcentajePresupuestoVentasPunVen;
	public JButton jButtonporcentajePresupuestoVentasPunVenBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_totalPresupuestoVentasPunVen;
	public JLabel jLabelcantidad_totalPresupuestoVentasPunVen;
	public JTextField jTextFieldcantidad_totalPresupuestoVentasPunVen;
	public JButton jButtoncantidad_totalPresupuestoVentasPunVenBusqueda= new JButtonMe();

	public JPanel jPanelvalor_totalPresupuestoVentasPunVen;
	public JLabel jLabelvalor_totalPresupuestoVentasPunVen;
	public JTextField jTextFieldvalor_totalPresupuestoVentasPunVen;
	public JButton jButtonvalor_totalPresupuestoVentasPunVenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPresupuestoVentasPunVen;
	public JLabel jLabelid_empresaPresupuestoVentasPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPresupuestoVentasPunVen;
	public JButton jButtonid_empresaPresupuestoVentasPunVen= new JButtonMe();
	public JButton jButtonid_empresaPresupuestoVentasPunVenUpdate= new JButtonMe();
	public JButton jButtonid_empresaPresupuestoVentasPunVenBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalPresupuestoVentasPunVen;
	public JLabel jLabelid_sucursalPresupuestoVentasPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalPresupuestoVentasPunVen;
	public JButton jButtonid_sucursalPresupuestoVentasPunVen= new JButtonMe();
	public JButton jButtonid_sucursalPresupuestoVentasPunVenUpdate= new JButtonMe();
	public JButton jButtonid_sucursalPresupuestoVentasPunVenBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioPresupuestoVentasPunVen;
	public JLabel jLabelid_ejercicioPresupuestoVentasPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioPresupuestoVentasPunVen;
	public JButton jButtonid_ejercicioPresupuestoVentasPunVen= new JButtonMe();
	public JButton jButtonid_ejercicioPresupuestoVentasPunVenUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioPresupuestoVentasPunVenBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoPresupuestoVentasPunVen;
	public JLabel jLabelid_periodoPresupuestoVentasPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoPresupuestoVentasPunVen;
	public JButton jButtonid_periodoPresupuestoVentasPunVen= new JButtonMe();
	public JButton jButtonid_periodoPresupuestoVentasPunVenUpdate= new JButtonMe();
	public JButton jButtonid_periodoPresupuestoVentasPunVenBusqueda= new JButtonMe();

	public JPanel jPanelid_cajaPresupuestoVentasPunVen;
	public JLabel jLabelid_cajaPresupuestoVentasPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cajaPresupuestoVentasPunVen;
	public JButton jButtonid_cajaPresupuestoVentasPunVen= new JButtonMe();
	public JButton jButtonid_cajaPresupuestoVentasPunVenUpdate= new JButtonMe();
	public JButton jButtonid_cajaPresupuestoVentasPunVenBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPresupuestoVentasPunVen;
	
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
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PresupuestoVentasPunVenDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPresupuestoVentasPunVen=new JPanel();
				this.jPanelAccionesFormularioPresupuestoVentasPunVen=new JPanel();
				this.jmenuBarDetallePresupuestoVentasPunVen=new JMenuBar();
				this.jTtoolBarDetallePresupuestoVentasPunVen=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoVentasPunVenDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PresupuestoVentasPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PresupuestoVentasPunVenDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PresupuestoVentasPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoVentasPunVenDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresupuestoVentasPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoVentasPunVenDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresupuestoVentasPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoVentasPunVenDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PresupuestoVentasPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPresupuestoVentasPunVen() {
		return this.jButtonActualizarToolBarPresupuestoVentasPunVen;
	}
	
	public JButton getjButtonEliminarToolBarPresupuestoVentasPunVen() {
		return this.jButtonEliminarToolBarPresupuestoVentasPunVen;
	}
	
	public JButton getjButtonCancelarToolBarPresupuestoVentasPunVen() {
		return this.jButtonCancelarToolBarPresupuestoVentasPunVen;
	}		
	
	public JButton getjButtonProcesarInformacionPresupuestoVentasPunVen() {
		return this.jButtonProcesarInformacionPresupuestoVentasPunVen;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPresupuestoVentasPunVen)	{
		this.jButtonProcesarInformacionPresupuestoVentasPunVen = jButtonProcesarInformacionPresupuestoVentasPunVen;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPresupuestoVentasPunVen() {
		return this.jComboBoxTiposAccionesPresupuestoVentasPunVen;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPresupuestoVentasPunVen(
			JComboBox jComboBoxTiposRelacionesPresupuestoVentasPunVen) {
		this.jComboBoxTiposRelacionesPresupuestoVentasPunVen = jComboBoxTiposRelacionesPresupuestoVentasPunVen;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPresupuestoVentasPunVen(
			JComboBox jComboBoxTiposAccionesPresupuestoVentasPunVen) {
		this.jComboBoxTiposAccionesPresupuestoVentasPunVen = jComboBoxTiposAccionesPresupuestoVentasPunVen;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPresupuestoVentasPunVen() {
		return this.jComboBoxTiposAccionesFormularioPresupuestoVentasPunVen;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPresupuestoVentasPunVen(
			JComboBox jComboBoxTiposAccionesFormularioPresupuestoVentasPunVen) {
		this.jComboBoxTiposAccionesFormularioPresupuestoVentasPunVen = jComboBoxTiposAccionesFormularioPresupuestoVentasPunVen;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.presupuestoventaspunvenSessionBean=new PresupuestoVentasPunVenSessionBean();
		
		this.presupuestoventaspunvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presupuestoventaspunvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PresupuestoVentasPunVenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PresupuestoVentasPunVenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PresupuestoVentasPunVenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Presupuesto Ventas MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {
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
	
		PresupuestoVentasPunVenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePresupuestoVentasPunVen= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPresupuestoVentasPunVen=new JButtonMe();
				this.jButtonModificarToolBarPresupuestoVentasPunVen=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPresupuestoVentasPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPresupuestoVentasPunVen,this.jTtoolBarDetallePresupuestoVentasPunVen,
							"actualizar","actualizar","Actualizar"+" "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPresupuestoVentasPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPresupuestoVentasPunVen,this.jTtoolBarDetallePresupuestoVentasPunVen,
							"eliminar","eliminar","Eliminar"+" "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPresupuestoVentasPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPresupuestoVentasPunVen,this.jTtoolBarDetallePresupuestoVentasPunVen,
							"cancelar","cancelar","Cancelar"+" "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPresupuestoVentasPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPresupuestoVentasPunVen,this.jTtoolBarDetallePresupuestoVentasPunVen,
							"guardarcambios","guardarcambios","Guardar"+" "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPresupuestoVentasPunVen,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPresupuestoVentasPunVen,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPresupuestoVentasPunVen,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePresupuestoVentasPunVen=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePresupuestoVentasPunVen=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPresupuestoVentasPunVen=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPresupuestoVentasPunVen=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPresupuestoVentasPunVen=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPresupuestoVentasPunVen= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPresupuestoVentasPunVen.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPresupuestoVentasPunVen,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPresupuestoVentasPunVen= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPresupuestoVentasPunVen.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPresupuestoVentasPunVen,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPresupuestoVentasPunVen= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPresupuestoVentasPunVen.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPresupuestoVentasPunVen,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPresupuestoVentasPunVen= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPresupuestoVentasPunVen.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPresupuestoVentasPunVen,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPresupuestoVentasPunVen= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPresupuestoVentasPunVen.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPresupuestoVentasPunVen,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPresupuestoVentasPunVen= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPresupuestoVentasPunVen.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPresupuestoVentasPunVen,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPresupuestoVentasPunVen= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPresupuestoVentasPunVen.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPresupuestoVentasPunVen,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPresupuestoVentasPunVen= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPresupuestoVentasPunVen.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPresupuestoVentasPunVen,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPresupuestoVentasPunVen= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPresupuestoVentasPunVen.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPresupuestoVentasPunVen,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPresupuestoVentasPunVen= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPresupuestoVentasPunVen.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPresupuestoVentasPunVen,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPresupuestoVentasPunVen.add(this.jMenuItemDetalleCerrarPresupuestoVentasPunVen);
		
		this.jmenuDetalleAccionesPresupuestoVentasPunVen.add(this.jMenuItemActualizarPresupuestoVentasPunVen);
		this.jmenuDetalleAccionesPresupuestoVentasPunVen.add(this.jMenuItemEliminarPresupuestoVentasPunVen);
		this.jmenuDetalleAccionesPresupuestoVentasPunVen.add(this.jMenuItemCancelarPresupuestoVentasPunVen);		
		
		//this.jmenuDetalleDatosPresupuestoVentasPunVen.add(this.jMenuItemDetalleAbrirOrderByPresupuestoVentasPunVen);				
		this.jmenuDetalleDatosPresupuestoVentasPunVen.add(this.jMenuItemDetalleMostarOcultarPresupuestoVentasPunVen);				
				
		//this.jmenuDetalleAccionesPresupuestoVentasPunVen.add(this.jMenuItemGuardarCambiosPresupuestoVentasPunVen);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePresupuestoVentasPunVen.add(this.jmenuDetalleArchivoPresupuestoVentasPunVen);		
		this.jmenuBarDetallePresupuestoVentasPunVen.add(this.jmenuDetalleAccionesPresupuestoVentasPunVen);		
		this.jmenuBarDetallePresupuestoVentasPunVen.add(this.jmenuDetalleDatosPresupuestoVentasPunVen);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePresupuestoVentasPunVen);				
	}
	
	
	public void inicializarElementosCamposPresupuestoVentasPunVen() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPresupuestoVentasPunVen = new JLabelMe();
		jLabelIdPresupuestoVentasPunVen.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPresupuestoVentasPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPresupuestoVentasPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPresupuestoVentasPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPresupuestoVentasPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPresupuestoVentasPunVen = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPresupuestoVentasPunVen.setToolTipText(PresupuestoVentasPunVenConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPresupuestoVentasPunVen= new GridBagLayout();

		this.jPanelidPresupuestoVentasPunVen.setLayout(this.gridaBagLayoutPresupuestoVentasPunVen);

		jLabelidPresupuestoVentasPunVen = new JLabel();
		jLabelidPresupuestoVentasPunVen.setText("Id");

		jLabelidPresupuestoVentasPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPresupuestoVentasPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPresupuestoVentasPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelvalorPresupuestoVentasPunVen = new JLabelMe();
		this.jLabelvalorPresupuestoVentasPunVen.setText(""+PresupuestoVentasPunVenConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorPresupuestoVentasPunVen.setToolTipText("Valor");
		this.jLabelvalorPresupuestoVentasPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorPresupuestoVentasPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorPresupuestoVentasPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorPresupuestoVentasPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorPresupuestoVentasPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorPresupuestoVentasPunVen.setToolTipText(PresupuestoVentasPunVenConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutPresupuestoVentasPunVen = new GridBagLayout();
		this.jPanelvalorPresupuestoVentasPunVen.setLayout(this.gridaBagLayoutPresupuestoVentasPunVen);


		jTextFieldvalorPresupuestoVentasPunVen= new JTextFieldMe();
		jTextFieldvalorPresupuestoVentasPunVen.setEnabled(false);
		jTextFieldvalorPresupuestoVentasPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorPresupuestoVentasPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorPresupuestoVentasPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorPresupuestoVentasPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorPresupuestoVentasPunVen.setText("0.0");

		this.jButtonvalorPresupuestoVentasPunVenBusqueda= new JButtonMe();
		this.jButtonvalorPresupuestoVentasPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorPresupuestoVentasPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorPresupuestoVentasPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorPresupuestoVentasPunVenBusqueda.setText("U");
		this.jButtonvalorPresupuestoVentasPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorPresupuestoVentasPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorPresupuestoVentasPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorPresupuestoVentasPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorPresupuestoVentasPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorPresupuestoVentasPunVenBusqueda"));

		if(this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorPresupuestoVentasPunVenBusqueda.setVisible(false);		}


					
		this.jLabelcantidadPresupuestoVentasPunVen = new JLabelMe();
		this.jLabelcantidadPresupuestoVentasPunVen.setText(""+PresupuestoVentasPunVenConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadPresupuestoVentasPunVen.setToolTipText("Cantad");
		this.jLabelcantidadPresupuestoVentasPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadPresupuestoVentasPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadPresupuestoVentasPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadPresupuestoVentasPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadPresupuestoVentasPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadPresupuestoVentasPunVen.setToolTipText(PresupuestoVentasPunVenConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutPresupuestoVentasPunVen = new GridBagLayout();
		this.jPanelcantidadPresupuestoVentasPunVen.setLayout(this.gridaBagLayoutPresupuestoVentasPunVen);


		jTextFieldcantidadPresupuestoVentasPunVen= new JTextFieldMe();
		jTextFieldcantidadPresupuestoVentasPunVen.setEnabled(false);
		jTextFieldcantidadPresupuestoVentasPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadPresupuestoVentasPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadPresupuestoVentasPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadPresupuestoVentasPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadPresupuestoVentasPunVen.setText("0");

		this.jButtoncantidadPresupuestoVentasPunVenBusqueda= new JButtonMe();
		this.jButtoncantidadPresupuestoVentasPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadPresupuestoVentasPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadPresupuestoVentasPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadPresupuestoVentasPunVenBusqueda.setText("U");
		this.jButtoncantidadPresupuestoVentasPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadPresupuestoVentasPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadPresupuestoVentasPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadPresupuestoVentasPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadPresupuestoVentasPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadPresupuestoVentasPunVenBusqueda"));

		if(this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadPresupuestoVentasPunVenBusqueda.setVisible(false);		}


					
		this.jLabelporcentajePresupuestoVentasPunVen = new JLabelMe();
		this.jLabelporcentajePresupuestoVentasPunVen.setText(""+PresupuestoVentasPunVenConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajePresupuestoVentasPunVen.setToolTipText("Porcentaje");
		this.jLabelporcentajePresupuestoVentasPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajePresupuestoVentasPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajePresupuestoVentasPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajePresupuestoVentasPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajePresupuestoVentasPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajePresupuestoVentasPunVen.setToolTipText(PresupuestoVentasPunVenConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutPresupuestoVentasPunVen = new GridBagLayout();
		this.jPanelporcentajePresupuestoVentasPunVen.setLayout(this.gridaBagLayoutPresupuestoVentasPunVen);


		jTextFieldporcentajePresupuestoVentasPunVen= new JTextFieldMe();
		jTextFieldporcentajePresupuestoVentasPunVen.setEnabled(false);
		jTextFieldporcentajePresupuestoVentasPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajePresupuestoVentasPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajePresupuestoVentasPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajePresupuestoVentasPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajePresupuestoVentasPunVen.setText("0.0");

		this.jButtonporcentajePresupuestoVentasPunVenBusqueda= new JButtonMe();
		this.jButtonporcentajePresupuestoVentasPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajePresupuestoVentasPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajePresupuestoVentasPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajePresupuestoVentasPunVenBusqueda.setText("U");
		this.jButtonporcentajePresupuestoVentasPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajePresupuestoVentasPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajePresupuestoVentasPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajePresupuestoVentasPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajePresupuestoVentasPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajePresupuestoVentasPunVenBusqueda"));

		if(this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajePresupuestoVentasPunVenBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_totalPresupuestoVentasPunVen = new JLabelMe();
		this.jLabelcantidad_totalPresupuestoVentasPunVen.setText(""+PresupuestoVentasPunVenConstantesFunciones.LABEL_CANTIDADTOTAL+" : *");
		this.jLabelcantidad_totalPresupuestoVentasPunVen.setToolTipText("Cantad Total");
		this.jLabelcantidad_totalPresupuestoVentasPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidad_totalPresupuestoVentasPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidad_totalPresupuestoVentasPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_totalPresupuestoVentasPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_totalPresupuestoVentasPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_totalPresupuestoVentasPunVen.setToolTipText(PresupuestoVentasPunVenConstantesFunciones.LABEL_CANTIDADTOTAL);
		this.gridaBagLayoutPresupuestoVentasPunVen = new GridBagLayout();
		this.jPanelcantidad_totalPresupuestoVentasPunVen.setLayout(this.gridaBagLayoutPresupuestoVentasPunVen);


		jTextFieldcantidad_totalPresupuestoVentasPunVen= new JTextFieldMe();
		jTextFieldcantidad_totalPresupuestoVentasPunVen.setEnabled(false);
		jTextFieldcantidad_totalPresupuestoVentasPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_totalPresupuestoVentasPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_totalPresupuestoVentasPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_totalPresupuestoVentasPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_totalPresupuestoVentasPunVen.setText("0");

		this.jButtoncantidad_totalPresupuestoVentasPunVenBusqueda= new JButtonMe();
		this.jButtoncantidad_totalPresupuestoVentasPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_totalPresupuestoVentasPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_totalPresupuestoVentasPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_totalPresupuestoVentasPunVenBusqueda.setText("U");
		this.jButtoncantidad_totalPresupuestoVentasPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_totalPresupuestoVentasPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_totalPresupuestoVentasPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_totalPresupuestoVentasPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_totalPresupuestoVentasPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_totalPresupuestoVentasPunVenBusqueda"));

		if(this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_totalPresupuestoVentasPunVenBusqueda.setVisible(false);		}


					
		this.jLabelvalor_totalPresupuestoVentasPunVen = new JLabelMe();
		this.jLabelvalor_totalPresupuestoVentasPunVen.setText(""+PresupuestoVentasPunVenConstantesFunciones.LABEL_VALORTOTAL+" : *");
		this.jLabelvalor_totalPresupuestoVentasPunVen.setToolTipText("Valor Total");
		this.jLabelvalor_totalPresupuestoVentasPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_totalPresupuestoVentasPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_totalPresupuestoVentasPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_totalPresupuestoVentasPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_totalPresupuestoVentasPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_totalPresupuestoVentasPunVen.setToolTipText(PresupuestoVentasPunVenConstantesFunciones.LABEL_VALORTOTAL);
		this.gridaBagLayoutPresupuestoVentasPunVen = new GridBagLayout();
		this.jPanelvalor_totalPresupuestoVentasPunVen.setLayout(this.gridaBagLayoutPresupuestoVentasPunVen);


		jTextFieldvalor_totalPresupuestoVentasPunVen= new JTextFieldMe();
		jTextFieldvalor_totalPresupuestoVentasPunVen.setEnabled(false);
		jTextFieldvalor_totalPresupuestoVentasPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_totalPresupuestoVentasPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_totalPresupuestoVentasPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_totalPresupuestoVentasPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_totalPresupuestoVentasPunVen.setText("0.0");

		this.jButtonvalor_totalPresupuestoVentasPunVenBusqueda= new JButtonMe();
		this.jButtonvalor_totalPresupuestoVentasPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_totalPresupuestoVentasPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_totalPresupuestoVentasPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_totalPresupuestoVentasPunVenBusqueda.setText("U");
		this.jButtonvalor_totalPresupuestoVentasPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_totalPresupuestoVentasPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_totalPresupuestoVentasPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_totalPresupuestoVentasPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_totalPresupuestoVentasPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_totalPresupuestoVentasPunVenBusqueda"));

		if(this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_totalPresupuestoVentasPunVenBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPresupuestoVentasPunVen() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPresupuestoVentasPunVen = new JLabelMe();
		this.jLabelid_empresaPresupuestoVentasPunVen.setText(""+PresupuestoVentasPunVenConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPresupuestoVentasPunVen.setToolTipText("Empresa");
		this.jLabelid_empresaPresupuestoVentasPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPresupuestoVentasPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPresupuestoVentasPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPresupuestoVentasPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPresupuestoVentasPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPresupuestoVentasPunVen.setToolTipText(PresupuestoVentasPunVenConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPresupuestoVentasPunVen = new GridBagLayout();
		this.jPanelid_empresaPresupuestoVentasPunVen.setLayout(this.gridaBagLayoutPresupuestoVentasPunVen);


		jComboBoxid_empresaPresupuestoVentasPunVen= new JComboBoxMe();
		jComboBoxid_empresaPresupuestoVentasPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPresupuestoVentasPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPresupuestoVentasPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPresupuestoVentasPunVen,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPresupuestoVentasPunVen.setEnabled(false);

		this.jButtonid_empresaPresupuestoVentasPunVen= new JButtonMe();
		this.jButtonid_empresaPresupuestoVentasPunVen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPresupuestoVentasPunVen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPresupuestoVentasPunVen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPresupuestoVentasPunVen.setText("Buscar");
		this.jButtonid_empresaPresupuestoVentasPunVen.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPresupuestoVentasPunVen.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPresupuestoVentasPunVen,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPresupuestoVentasPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPresupuestoVentasPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPresupuestoVentasPunVen"));

		this.jButtonid_empresaPresupuestoVentasPunVenBusqueda= new JButtonMe();
		this.jButtonid_empresaPresupuestoVentasPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresupuestoVentasPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresupuestoVentasPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPresupuestoVentasPunVenBusqueda.setText("U");
		this.jButtonid_empresaPresupuestoVentasPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPresupuestoVentasPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPresupuestoVentasPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPresupuestoVentasPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPresupuestoVentasPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPresupuestoVentasPunVenBusqueda"));

		if(this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPresupuestoVentasPunVenBusqueda.setVisible(false);		}

		this.jButtonid_empresaPresupuestoVentasPunVenUpdate= new JButtonMe();
		this.jButtonid_empresaPresupuestoVentasPunVenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresupuestoVentasPunVenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresupuestoVentasPunVenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPresupuestoVentasPunVenUpdate.setText("U");
		this.jButtonid_empresaPresupuestoVentasPunVenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPresupuestoVentasPunVenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPresupuestoVentasPunVenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPresupuestoVentasPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPresupuestoVentasPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPresupuestoVentasPunVenUpdate"));



					
		this.jLabelid_sucursalPresupuestoVentasPunVen = new JLabelMe();
		this.jLabelid_sucursalPresupuestoVentasPunVen.setText(""+PresupuestoVentasPunVenConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalPresupuestoVentasPunVen.setToolTipText("Sucursal");
		this.jLabelid_sucursalPresupuestoVentasPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPresupuestoVentasPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPresupuestoVentasPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalPresupuestoVentasPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalPresupuestoVentasPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalPresupuestoVentasPunVen.setToolTipText(PresupuestoVentasPunVenConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutPresupuestoVentasPunVen = new GridBagLayout();
		this.jPanelid_sucursalPresupuestoVentasPunVen.setLayout(this.gridaBagLayoutPresupuestoVentasPunVen);


		jComboBoxid_sucursalPresupuestoVentasPunVen= new JComboBoxMe();
		jComboBoxid_sucursalPresupuestoVentasPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPresupuestoVentasPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPresupuestoVentasPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalPresupuestoVentasPunVen,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalPresupuestoVentasPunVen.setEnabled(false);

		this.jButtonid_sucursalPresupuestoVentasPunVen= new JButtonMe();
		this.jButtonid_sucursalPresupuestoVentasPunVen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPresupuestoVentasPunVen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPresupuestoVentasPunVen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPresupuestoVentasPunVen.setText("Buscar");
		this.jButtonid_sucursalPresupuestoVentasPunVen.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalPresupuestoVentasPunVen.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPresupuestoVentasPunVen,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalPresupuestoVentasPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPresupuestoVentasPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPresupuestoVentasPunVen"));

		this.jButtonid_sucursalPresupuestoVentasPunVenBusqueda= new JButtonMe();
		this.jButtonid_sucursalPresupuestoVentasPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPresupuestoVentasPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPresupuestoVentasPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPresupuestoVentasPunVenBusqueda.setText("U");
		this.jButtonid_sucursalPresupuestoVentasPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalPresupuestoVentasPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPresupuestoVentasPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalPresupuestoVentasPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPresupuestoVentasPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPresupuestoVentasPunVenBusqueda"));

		if(this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalPresupuestoVentasPunVenBusqueda.setVisible(false);		}

		this.jButtonid_sucursalPresupuestoVentasPunVenUpdate= new JButtonMe();
		this.jButtonid_sucursalPresupuestoVentasPunVenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPresupuestoVentasPunVenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPresupuestoVentasPunVenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPresupuestoVentasPunVenUpdate.setText("U");
		this.jButtonid_sucursalPresupuestoVentasPunVenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalPresupuestoVentasPunVenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPresupuestoVentasPunVenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalPresupuestoVentasPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPresupuestoVentasPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPresupuestoVentasPunVenUpdate"));



					
		this.jLabelid_ejercicioPresupuestoVentasPunVen = new JLabelMe();
		this.jLabelid_ejercicioPresupuestoVentasPunVen.setText(""+PresupuestoVentasPunVenConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioPresupuestoVentasPunVen.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioPresupuestoVentasPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPresupuestoVentasPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPresupuestoVentasPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioPresupuestoVentasPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioPresupuestoVentasPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioPresupuestoVentasPunVen.setToolTipText(PresupuestoVentasPunVenConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutPresupuestoVentasPunVen = new GridBagLayout();
		this.jPanelid_ejercicioPresupuestoVentasPunVen.setLayout(this.gridaBagLayoutPresupuestoVentasPunVen);


		jComboBoxid_ejercicioPresupuestoVentasPunVen= new JComboBoxMe();
		jComboBoxid_ejercicioPresupuestoVentasPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPresupuestoVentasPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPresupuestoVentasPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioPresupuestoVentasPunVen,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioPresupuestoVentasPunVen.setEnabled(false);

		this.jButtonid_ejercicioPresupuestoVentasPunVen= new JButtonMe();
		this.jButtonid_ejercicioPresupuestoVentasPunVen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPresupuestoVentasPunVen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPresupuestoVentasPunVen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPresupuestoVentasPunVen.setText("Buscar");
		this.jButtonid_ejercicioPresupuestoVentasPunVen.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioPresupuestoVentasPunVen.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPresupuestoVentasPunVen,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioPresupuestoVentasPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPresupuestoVentasPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPresupuestoVentasPunVen"));

		this.jButtonid_ejercicioPresupuestoVentasPunVenBusqueda= new JButtonMe();
		this.jButtonid_ejercicioPresupuestoVentasPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPresupuestoVentasPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPresupuestoVentasPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPresupuestoVentasPunVenBusqueda.setText("U");
		this.jButtonid_ejercicioPresupuestoVentasPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioPresupuestoVentasPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPresupuestoVentasPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioPresupuestoVentasPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPresupuestoVentasPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPresupuestoVentasPunVenBusqueda"));

		if(this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioPresupuestoVentasPunVenBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioPresupuestoVentasPunVenUpdate= new JButtonMe();
		this.jButtonid_ejercicioPresupuestoVentasPunVenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPresupuestoVentasPunVenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPresupuestoVentasPunVenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPresupuestoVentasPunVenUpdate.setText("U");
		this.jButtonid_ejercicioPresupuestoVentasPunVenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioPresupuestoVentasPunVenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPresupuestoVentasPunVenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioPresupuestoVentasPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPresupuestoVentasPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPresupuestoVentasPunVenUpdate"));



					
		this.jLabelid_periodoPresupuestoVentasPunVen = new JLabelMe();
		this.jLabelid_periodoPresupuestoVentasPunVen.setText(""+PresupuestoVentasPunVenConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoPresupuestoVentasPunVen.setToolTipText("Periodo");
		this.jLabelid_periodoPresupuestoVentasPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoPresupuestoVentasPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoPresupuestoVentasPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoPresupuestoVentasPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoPresupuestoVentasPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoPresupuestoVentasPunVen.setToolTipText(PresupuestoVentasPunVenConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutPresupuestoVentasPunVen = new GridBagLayout();
		this.jPanelid_periodoPresupuestoVentasPunVen.setLayout(this.gridaBagLayoutPresupuestoVentasPunVen);


		jComboBoxid_periodoPresupuestoVentasPunVen= new JComboBoxMe();
		jComboBoxid_periodoPresupuestoVentasPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoPresupuestoVentasPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoPresupuestoVentasPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoPresupuestoVentasPunVen,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoPresupuestoVentasPunVen.setEnabled(false);

		this.jButtonid_periodoPresupuestoVentasPunVen= new JButtonMe();
		this.jButtonid_periodoPresupuestoVentasPunVen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPresupuestoVentasPunVen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPresupuestoVentasPunVen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPresupuestoVentasPunVen.setText("Buscar");
		this.jButtonid_periodoPresupuestoVentasPunVen.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoPresupuestoVentasPunVen.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPresupuestoVentasPunVen,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoPresupuestoVentasPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPresupuestoVentasPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPresupuestoVentasPunVen"));

		this.jButtonid_periodoPresupuestoVentasPunVenBusqueda= new JButtonMe();
		this.jButtonid_periodoPresupuestoVentasPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPresupuestoVentasPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPresupuestoVentasPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoPresupuestoVentasPunVenBusqueda.setText("U");
		this.jButtonid_periodoPresupuestoVentasPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoPresupuestoVentasPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPresupuestoVentasPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoPresupuestoVentasPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPresupuestoVentasPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPresupuestoVentasPunVenBusqueda"));

		if(this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoPresupuestoVentasPunVenBusqueda.setVisible(false);		}

		this.jButtonid_periodoPresupuestoVentasPunVenUpdate= new JButtonMe();
		this.jButtonid_periodoPresupuestoVentasPunVenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPresupuestoVentasPunVenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPresupuestoVentasPunVenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoPresupuestoVentasPunVenUpdate.setText("U");
		this.jButtonid_periodoPresupuestoVentasPunVenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoPresupuestoVentasPunVenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPresupuestoVentasPunVenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoPresupuestoVentasPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPresupuestoVentasPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPresupuestoVentasPunVenUpdate"));



					
		this.jLabelid_cajaPresupuestoVentasPunVen = new JLabelMe();
		this.jLabelid_cajaPresupuestoVentasPunVen.setText(""+PresupuestoVentasPunVenConstantesFunciones.LABEL_IDCAJA+" : *");
		this.jLabelid_cajaPresupuestoVentasPunVen.setToolTipText("Caja");
		this.jLabelid_cajaPresupuestoVentasPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cajaPresupuestoVentasPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cajaPresupuestoVentasPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cajaPresupuestoVentasPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cajaPresupuestoVentasPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cajaPresupuestoVentasPunVen.setToolTipText(PresupuestoVentasPunVenConstantesFunciones.LABEL_IDCAJA);
		this.gridaBagLayoutPresupuestoVentasPunVen = new GridBagLayout();
		this.jPanelid_cajaPresupuestoVentasPunVen.setLayout(this.gridaBagLayoutPresupuestoVentasPunVen);


		jComboBoxid_cajaPresupuestoVentasPunVen= new JComboBoxMe();
		jComboBoxid_cajaPresupuestoVentasPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaPresupuestoVentasPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaPresupuestoVentasPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cajaPresupuestoVentasPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cajaPresupuestoVentasPunVen= new JButtonMe();
		this.jButtonid_cajaPresupuestoVentasPunVen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaPresupuestoVentasPunVen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaPresupuestoVentasPunVen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaPresupuestoVentasPunVen.setText("Buscar");
		this.jButtonid_cajaPresupuestoVentasPunVen.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cajaPresupuestoVentasPunVen.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaPresupuestoVentasPunVen,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cajaPresupuestoVentasPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaPresupuestoVentasPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaPresupuestoVentasPunVen"));

		this.jButtonid_cajaPresupuestoVentasPunVenBusqueda= new JButtonMe();
		this.jButtonid_cajaPresupuestoVentasPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaPresupuestoVentasPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaPresupuestoVentasPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cajaPresupuestoVentasPunVenBusqueda.setText("U");
		this.jButtonid_cajaPresupuestoVentasPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cajaPresupuestoVentasPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaPresupuestoVentasPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cajaPresupuestoVentasPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaPresupuestoVentasPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaPresupuestoVentasPunVenBusqueda"));

		if(this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cajaPresupuestoVentasPunVenBusqueda.setVisible(false);		}

		this.jButtonid_cajaPresupuestoVentasPunVenUpdate= new JButtonMe();
		this.jButtonid_cajaPresupuestoVentasPunVenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaPresupuestoVentasPunVenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaPresupuestoVentasPunVenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cajaPresupuestoVentasPunVenUpdate.setText("U");
		this.jButtonid_cajaPresupuestoVentasPunVenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cajaPresupuestoVentasPunVenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaPresupuestoVentasPunVenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cajaPresupuestoVentasPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaPresupuestoVentasPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaPresupuestoVentasPunVenUpdate"));



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
		//this.jInternalFrameDetallePresupuestoVentasPunVen = new PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Presupuesto Ventas DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPresupuestoVentasPunVen= new GridBagLayout();
		

		
		String sToolTipPresupuestoVentasPunVen="";
		sToolTipPresupuestoVentasPunVen=PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPresupuestoVentasPunVen+="(PuntoVenta.PresupuestoVentasPunVen)";
		}
		
		if(!this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {
			sToolTipPresupuestoVentasPunVen+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPresupuestoVentasPunVen = new JButtonMe();
		this.jButtonModificarPresupuestoVentasPunVen = new JButtonMe();
        this.jButtonActualizarPresupuestoVentasPunVen = new JButtonMe();
        this.jButtonEliminarPresupuestoVentasPunVen = new JButtonMe();
        this.jButtonCancelarPresupuestoVentasPunVen = new JButtonMe();
        this.jButtonGuardarCambiosPresupuestoVentasPunVen = new JButtonMe();
		this.jButtonGuardarCambiosTablaPresupuestoVentasPunVen = new JButtonMe();
		this.jButtonCerrarPresupuestoVentasPunVen = new JButtonMe();
		
		this.jScrollPanelDatosPresupuestoVentasPunVen = new JScrollPane();   
        this.jScrollPanelDatosEdicionPresupuestoVentasPunVen = new JScrollPane();
		this.jScrollPanelDatosGeneralPresupuestoVentasPunVen = new JScrollPane();
				
		
		
		this.jPanelCamposPresupuestoVentasPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPresupuestoVentasPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPresupuestoVentasPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPresupuestoVentasPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Presupuesto Ventas";
		
		if(!this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPresupuestoVentasPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Ventases" + this.sPath));
		} else {
			this.jScrollPanelDatosPresupuestoVentasPunVen.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPresupuestoVentasPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPresupuestoVentasPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPresupuestoVentasPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPresupuestoVentasPunVen.setName("jPanelCamposPresupuestoVentasPunVen"); 

		this.jPanelCamposOcultosPresupuestoVentasPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPresupuestoVentasPunVen.setName("jPanelCamposOcultosPresupuestoVentasPunVen"); 

        this.jPanelAccionesPresupuestoVentasPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPresupuestoVentasPunVen.setToolTipText("Acciones");
        this.jPanelAccionesPresupuestoVentasPunVen.setName("Acciones"); 

		this.jPanelAccionesFormularioPresupuestoVentasPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPresupuestoVentasPunVen.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPresupuestoVentasPunVen.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPresupuestoVentasPunVen.setText("Nuevo");
		this.jButtonModificarPresupuestoVentasPunVen.setText("Editar");
        this.jButtonActualizarPresupuestoVentasPunVen.setText("Actualizar");
        this.jButtonEliminarPresupuestoVentasPunVen.setText("Eliminar");
        this.jButtonCancelarPresupuestoVentasPunVen.setText("Cancelar");
        this.jButtonGuardarCambiosPresupuestoVentasPunVen.setText("Guardar");
		this.jButtonGuardarCambiosTablaPresupuestoVentasPunVen.setText("Guardar");
		this.jButtonCerrarPresupuestoVentasPunVen.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPresupuestoVentasPunVen,"nuevo_button","Nuevo",this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPresupuestoVentasPunVen,"modificar_button","Editar",this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPresupuestoVentasPunVen,"actualizar_button","Actualizar",this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPresupuestoVentasPunVen,"eliminar_button","Eliminar",this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPresupuestoVentasPunVen,"cancelar_button","Cancelar",this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPresupuestoVentasPunVen,"guardarcambios_button","Guardar",this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPresupuestoVentasPunVen,"guardarcambiostabla_button","Guardar",this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPresupuestoVentasPunVen,"cerrar_button","Salir",this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPresupuestoVentasPunVen.setToolTipText("Nuevo"+" "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPresupuestoVentasPunVen.setToolTipText("Editar"+" "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPresupuestoVentasPunVen.setToolTipText("Actualizar"+" "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPresupuestoVentasPunVen.setToolTipText("Eliminar)"+" "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPresupuestoVentasPunVen.setToolTipText("Cancelar"+" "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPresupuestoVentasPunVen.setToolTipText("Guardar"+" "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPresupuestoVentasPunVen.setToolTipText("Guardar"+" "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPresupuestoVentasPunVen.setToolTipText("Salir"+" "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPresupuestoVentasPunVen";
		inputMap = this.jButtonNuevoPresupuestoVentasPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPresupuestoVentasPunVen.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPresupuestoVentasPunVen"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPresupuestoVentasPunVen";
		inputMap = this.jButtonActualizarPresupuestoVentasPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPresupuestoVentasPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPresupuestoVentasPunVen"));
		
		//ELIMINAR
		sMapKey = "EliminarPresupuestoVentasPunVen";
		inputMap = this.jButtonEliminarPresupuestoVentasPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPresupuestoVentasPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPresupuestoVentasPunVen"));
		
		//CANCELAR	
		sMapKey = "CancelarPresupuestoVentasPunVen";
		inputMap = this.jButtonCancelarPresupuestoVentasPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPresupuestoVentasPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPresupuestoVentasPunVen"));
		
		//CERRAR		
		sMapKey = "CerrarPresupuestoVentasPunVen";
		inputMap = this.jButtonCerrarPresupuestoVentasPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPresupuestoVentasPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPresupuestoVentasPunVen"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPresupuestoVentasPunVen";
		inputMap = this.jButtonGuardarCambiosTablaPresupuestoVentasPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPresupuestoVentasPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPresupuestoVentasPunVen"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPresupuestoVentasPunVen = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPresupuestoVentasPunVen.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPresupuestoVentasPunVen.setToolTipText("Nuevo PresupuestoVentasPunVen");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPresupuestoVentasPunVen = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPresupuestoVentasPunVen.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPresupuestoVentasPunVen.setToolTipText("Sin Cerrar Ventana PresupuestoVentasPunVen");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePresupuestoVentasPunVen = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePresupuestoVentasPunVen.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePresupuestoVentasPunVen.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPresupuestoVentasPunVen = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPresupuestoVentasPunVen.setText("Accion");
		this.jComboBoxTiposAccionesPresupuestoVentasPunVen.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPresupuestoVentasPunVen = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPresupuestoVentasPunVen.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPresupuestoVentasPunVen.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPresupuestoVentasPunVen = new JLabelMe();
		
		this.jLabelAccionesPresupuestoVentasPunVen.setText("Acciones");		
		this.jLabelAccionesPresupuestoVentasPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresupuestoVentasPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresupuestoVentasPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPresupuestoVentasPunVen();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPresupuestoVentasPunVen();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPresupuestoVentasPunVen=new JTabbedPane();
		this.jTabbedPaneRelacionesPresupuestoVentasPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPresupuestoVentasPunVen,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPresupuestoVentasPunVen.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresupuestoVentasPunVen.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresupuestoVentasPunVen.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPresupuestoVentasPunVen.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPresupuestoVentasPunVen.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPresupuestoVentasPunVen.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPresupuestoVentasPunVen = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPresupuestoVentasPunVen = new GridBagLayout();
		
		this.jPanelCamposPresupuestoVentasPunVen.setLayout(gridaBagLayoutCamposPresupuestoVentasPunVen);
		this.jPanelCamposOcultosPresupuestoVentasPunVen.setLayout(gridaBagLayoutCamposOcultosPresupuestoVentasPunVen);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPresupuestoVentasPunVen.add(jLabelIdPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);



	this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 1;
	this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPresupuestoVentasPunVen.add(jLabelidPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);


	this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPresupuestoVentasPunVen.add(jLabelid_empresaPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 2;
		this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPresupuestoVentasPunVen.add(jButtonid_empresaPresupuestoVentasPunVenBusqueda, this.gridBagConstraintsPresupuestoVentasPunVen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 3;
		this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPresupuestoVentasPunVen.add(jButtonid_empresaPresupuestoVentasPunVenUpdate, this.gridBagConstraintsPresupuestoVentasPunVen);
	}

	this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 1;
	this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPresupuestoVentasPunVen.add(jComboBoxid_empresaPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);


	this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalPresupuestoVentasPunVen.add(jLabelid_sucursalPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 2;
		this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPresupuestoVentasPunVen.add(jButtonid_sucursalPresupuestoVentasPunVenBusqueda, this.gridBagConstraintsPresupuestoVentasPunVen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 3;
		this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPresupuestoVentasPunVen.add(jButtonid_sucursalPresupuestoVentasPunVenUpdate, this.gridBagConstraintsPresupuestoVentasPunVen);
	}

	this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 1;
	this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalPresupuestoVentasPunVen.add(jComboBoxid_sucursalPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);


	this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioPresupuestoVentasPunVen.add(jLabelid_ejercicioPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 2;
		this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPresupuestoVentasPunVen.add(jButtonid_ejercicioPresupuestoVentasPunVenBusqueda, this.gridBagConstraintsPresupuestoVentasPunVen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 3;
		this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPresupuestoVentasPunVen.add(jButtonid_ejercicioPresupuestoVentasPunVenUpdate, this.gridBagConstraintsPresupuestoVentasPunVen);
	}

	this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 1;
	this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioPresupuestoVentasPunVen.add(jComboBoxid_ejercicioPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);


	this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoPresupuestoVentasPunVen.add(jLabelid_periodoPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 2;
		this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoPresupuestoVentasPunVen.add(jButtonid_periodoPresupuestoVentasPunVenBusqueda, this.gridBagConstraintsPresupuestoVentasPunVen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 3;
		this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoPresupuestoVentasPunVen.add(jButtonid_periodoPresupuestoVentasPunVenUpdate, this.gridBagConstraintsPresupuestoVentasPunVen);
	}

	this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 1;
	this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoPresupuestoVentasPunVen.add(jComboBoxid_periodoPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);


	this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cajaPresupuestoVentasPunVen.add(jLabelid_cajaPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 2;
		this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cajaPresupuestoVentasPunVen.add(jButtonid_cajaPresupuestoVentasPunVenBusqueda, this.gridBagConstraintsPresupuestoVentasPunVen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 3;
		this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cajaPresupuestoVentasPunVen.add(jButtonid_cajaPresupuestoVentasPunVenUpdate, this.gridBagConstraintsPresupuestoVentasPunVen);
	}

	this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 1;
	this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cajaPresupuestoVentasPunVen.add(jComboBoxid_cajaPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);


	this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorPresupuestoVentasPunVen.add(jLabelvalorPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 2;
		this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorPresupuestoVentasPunVen.add(jButtonvalorPresupuestoVentasPunVenBusqueda, this.gridBagConstraintsPresupuestoVentasPunVen);
	}

	this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 1;
	this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorPresupuestoVentasPunVen.add(jTextFieldvalorPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);


	this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadPresupuestoVentasPunVen.add(jLabelcantidadPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 2;
		this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadPresupuestoVentasPunVen.add(jButtoncantidadPresupuestoVentasPunVenBusqueda, this.gridBagConstraintsPresupuestoVentasPunVen);
	}

	this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 1;
	this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadPresupuestoVentasPunVen.add(jTextFieldcantidadPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);


	this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajePresupuestoVentasPunVen.add(jLabelporcentajePresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 2;
		this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajePresupuestoVentasPunVen.add(jButtonporcentajePresupuestoVentasPunVenBusqueda, this.gridBagConstraintsPresupuestoVentasPunVen);
	}

	this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 1;
	this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajePresupuestoVentasPunVen.add(jTextFieldporcentajePresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);


	this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_totalPresupuestoVentasPunVen.add(jLabelcantidad_totalPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 2;
		this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_totalPresupuestoVentasPunVen.add(jButtoncantidad_totalPresupuestoVentasPunVenBusqueda, this.gridBagConstraintsPresupuestoVentasPunVen);
	}

	this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 1;
	this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_totalPresupuestoVentasPunVen.add(jTextFieldcantidad_totalPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);


	this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_totalPresupuestoVentasPunVen.add(jLabelvalor_totalPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 2;
		this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_totalPresupuestoVentasPunVen.add(jButtonvalor_totalPresupuestoVentasPunVenBusqueda, this.gridBagConstraintsPresupuestoVentasPunVen);
	}

	this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 1;
	this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_totalPresupuestoVentasPunVen.add(jTextFieldvalor_totalPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentasPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iYPanelCamposPresupuestoVentasPunVen;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iXPanelCamposPresupuestoVentasPunVen++;
	this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoVentasPunVen.add(this.jPanelidPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);



	if(iXPanelCamposPresupuestoVentasPunVen % 1==0) {
		iXPanelCamposPresupuestoVentasPunVen=0;
		iYPanelCamposPresupuestoVentasPunVen++;
	}
	this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentasPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iYPanelCamposPresupuestoVentasPunVen;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iXPanelCamposPresupuestoVentasPunVen++;
	this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoVentasPunVen.add(this.jPanelid_cajaPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);



	if(iXPanelCamposPresupuestoVentasPunVen % 1==0) {
		iXPanelCamposPresupuestoVentasPunVen=0;
		iYPanelCamposPresupuestoVentasPunVen++;
	}
	this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentasPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iYPanelCamposPresupuestoVentasPunVen;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iXPanelCamposPresupuestoVentasPunVen++;
	this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoVentasPunVen.add(this.jPanelvalorPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);



	if(iXPanelCamposPresupuestoVentasPunVen % 1==0) {
		iXPanelCamposPresupuestoVentasPunVen=0;
		iYPanelCamposPresupuestoVentasPunVen++;
	}
	this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentasPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iYPanelCamposPresupuestoVentasPunVen;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iXPanelCamposPresupuestoVentasPunVen++;
	this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoVentasPunVen.add(this.jPanelcantidadPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);



	if(iXPanelCamposPresupuestoVentasPunVen % 1==0) {
		iXPanelCamposPresupuestoVentasPunVen=0;
		iYPanelCamposPresupuestoVentasPunVen++;
	}
	this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentasPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iYPanelCamposPresupuestoVentasPunVen;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iXPanelCamposPresupuestoVentasPunVen++;
	this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoVentasPunVen.add(this.jPanelporcentajePresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);



	if(iXPanelCamposPresupuestoVentasPunVen % 1==0) {
		iXPanelCamposPresupuestoVentasPunVen=0;
		iYPanelCamposPresupuestoVentasPunVen++;
	}
	this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentasPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iYPanelCamposPresupuestoVentasPunVen;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iXPanelCamposPresupuestoVentasPunVen++;
	this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoVentasPunVen.add(this.jPanelcantidad_totalPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);



	if(iXPanelCamposPresupuestoVentasPunVen % 1==0) {
		iXPanelCamposPresupuestoVentasPunVen=0;
		iYPanelCamposPresupuestoVentasPunVen++;
	}
	this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentasPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iYPanelCamposPresupuestoVentasPunVen;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iXPanelCamposPresupuestoVentasPunVen++;
	this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoVentasPunVen.add(this.jPanelvalor_totalPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);



	if(iXPanelCamposPresupuestoVentasPunVen % 1==0) {
		iXPanelCamposPresupuestoVentasPunVen=0;
		iYPanelCamposPresupuestoVentasPunVen++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentasPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iYPanelCamposOcultosPresupuestoVentasPunVen;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iXPanelCamposOcultosPresupuestoVentasPunVen++;
	this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPresupuestoVentasPunVen.add(this.jPanelid_empresaPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);



	if(iXPanelCamposOcultosPresupuestoVentasPunVen % 1==0) {
		iXPanelCamposOcultosPresupuestoVentasPunVen=0;
		iYPanelCamposOcultosPresupuestoVentasPunVen++;
	}
	this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentasPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iYPanelCamposOcultosPresupuestoVentasPunVen;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iXPanelCamposOcultosPresupuestoVentasPunVen++;
	this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPresupuestoVentasPunVen.add(this.jPanelid_sucursalPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);



	if(iXPanelCamposOcultosPresupuestoVentasPunVen % 1==0) {
		iXPanelCamposOcultosPresupuestoVentasPunVen=0;
		iYPanelCamposOcultosPresupuestoVentasPunVen++;
	}
	this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentasPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iYPanelCamposOcultosPresupuestoVentasPunVen;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iXPanelCamposOcultosPresupuestoVentasPunVen++;
	this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPresupuestoVentasPunVen.add(this.jPanelid_ejercicioPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);



	if(iXPanelCamposOcultosPresupuestoVentasPunVen % 1==0) {
		iXPanelCamposOcultosPresupuestoVentasPunVen=0;
		iYPanelCamposOcultosPresupuestoVentasPunVen++;
	}
	this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentasPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iYPanelCamposOcultosPresupuestoVentasPunVen;
	this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iXPanelCamposOcultosPresupuestoVentasPunVen++;
	this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentasPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPresupuestoVentasPunVen.add(this.jPanelid_periodoPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);



	if(iXPanelCamposOcultosPresupuestoVentasPunVen % 1==0) {
		iXPanelCamposOcultosPresupuestoVentasPunVen=0;
		iYPanelCamposOcultosPresupuestoVentasPunVen++;
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
			
		GridBagLayout gridaBagLayoutAccionesPresupuestoVentasPunVen= new GridBagLayout();
		this.jPanelAccionesPresupuestoVentasPunVen.setLayout(gridaBagLayoutAccionesPresupuestoVentasPunVen);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPresupuestoVentasPunVen= new GridBagLayout();
		this.jPanelAccionesFormularioPresupuestoVentasPunVen.setLayout(gridaBagLayoutAccionesFormularioPresupuestoVentasPunVen);
		
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPresupuestoVentasPunVen.add(this.jComboBoxTiposAccionesFormularioPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);

		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPresupuestoVentasPunVen.add(this.jCheckBoxPostAccionNuevoPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.presupuestoventaspunvenSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPresupuestoVentasPunVen.add(this.jCheckBoxPostAccionSinCerrarPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.presupuestoventaspunvenSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPresupuestoVentasPunVen.add(this.jCheckBoxPostAccionSinMensajePresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iPosXAccion++;
			
		this.jPanelAccionesPresupuestoVentasPunVen.add(this.jButtonModificarPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);							

		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx =iPosXAccion++;
			
		this.jPanelAccionesPresupuestoVentasPunVen.add(this.jButtonEliminarPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
		
			
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;		
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iPosXAccion++;
		
		this.jPanelAccionesPresupuestoVentasPunVen.add(this.jButtonActualizarPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);


		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;		
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iPosXAccion++;
		
		this.jPanelAccionesPresupuestoVentasPunVen.add(this.jButtonGuardarCambiosPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);	
		
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;		
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx =iPosXAccion++;
		
		this.jPanelAccionesPresupuestoVentasPunVen.add(this.jButtonCancelarPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPresupuestoVentasPunVen = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPresupuestoVentasPunVen);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();						
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 0;		
			//this.gridBagConstraintsPresupuestoVentasPunVen.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasPunVen.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx =0;
		this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPresupuestoVentasPunVen.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PresupuestoVentasPunVenJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePresupuestoVentasPunVen = new PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Presupuesto Ventas DATOS");
			
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
			
	        //this.setTitle("[FOR] - Presupuesto Ventas DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Presupuesto Ventas Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PresupuestoVentasPunVenModel presupuestoventaspunvenModel=new PresupuestoVentasPunVenModel(this);
			
			//SI USARA CLASE INTERNA
			//PresupuestoVentasPunVenModel.PresupuestoVentasPunVenFocusTraversalPolicy presupuestoventaspunvenFocusTraversalPolicy = presupuestoventaspunvenModel.new PresupuestoVentasPunVenFocusTraversalPolicy(this);
			
			//presupuestoventaspunvenFocusTraversalPolicy.setpresupuestoventaspunvenJInternalFrame(this);
			
			this.setFocusTraversalPolicy(presupuestoventaspunvenModel);
			
			
			this.jContentPaneDetallePresupuestoVentasPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePresupuestoVentasPunVen = new GridBagLayout();	
			this.jContentPaneDetallePresupuestoVentasPunVen.setLayout(gridaBagLayoutDetallePresupuestoVentasPunVen);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPresupuestoVentasPunVen = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
				this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 0;
					
				
				this.jContentPaneDetallePresupuestoVentasPunVen.add(jTtoolBarDetallePresupuestoVentasPunVen, gridBagConstraintsPresupuestoVentasPunVen);								
				
}
			
			this.jScrollPanelDatosEdicionPresupuestoVentasPunVen=   new JScrollPane(jContentPaneDetallePresupuestoVentasPunVen,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPresupuestoVentasPunVen.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresupuestoVentasPunVen.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresupuestoVentasPunVen.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPresupuestoVentasPunVen=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPresupuestoVentasPunVen.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresupuestoVentasPunVen.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresupuestoVentasPunVen.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 0;
	        
			this.jContentPaneDetallePresupuestoVentasPunVen.add(jPanelCamposPresupuestoVentasPunVen, gridBagConstraintsPresupuestoVentasPunVen);
			
			
			
			
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
						&& presupuestoventaspunvenSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.presupuestoventaspunvenSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPresupuestoVentasPunVen= new GridBagConstraints();
						this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 0;
						this.jContentPaneDetallePresupuestoVentasPunVen.add(this.jTabbedPaneRelacionesPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPresupuestoVentasPunVen.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPresupuestoVentasPunVen.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
					this.gridBagConstraintsPresupuestoVentasPunVen.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPresupuestoVentasPunVen.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 0;
					
				
					this.jContentPaneDetallePresupuestoVentasPunVen.add(jPanelCamposOcultosPresupuestoVentasPunVen, gridBagConstraintsPresupuestoVentasPunVen);
				
					this.jPanelCamposOcultosPresupuestoVentasPunVen.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 0;
	        this.gridBagConstraintsPresupuestoVentasPunVen.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePresupuestoVentasPunVen.add(this.jPanelAccionesFormularioPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);							
			
			
			
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
	        this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 0;
	        
			
			this.jContentPaneDetallePresupuestoVentasPunVen.add(this.jPanelAccionesPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPresupuestoVentasPunVen);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPresupuestoVentasPunVen=   new JScrollPane(this.jPanelCamposPresupuestoVentasPunVen,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPresupuestoVentasPunVen.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresupuestoVentasPunVen.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresupuestoVentasPunVen.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 0;
			this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPresupuestoVentasPunVen.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPresupuestoVentasPunVen.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);			
			
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
			
			
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
		
			
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPresupuestoVentasPunVen;//jContentPane;
		
		return jScrollPanelDatosEdicionPresupuestoVentasPunVen;
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
