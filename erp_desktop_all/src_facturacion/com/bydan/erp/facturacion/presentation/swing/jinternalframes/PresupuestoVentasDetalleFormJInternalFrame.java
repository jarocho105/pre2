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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.PresupuestoVentasConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class PresupuestoVentasDetalleFormJInternalFrame extends PresupuestoVentasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePresupuestoVentas;
	
	protected JMenuBar jmenuBarDetallePresupuestoVentas;
	
	protected JMenu jmenuDetallePresupuestoVentas;
	protected JMenu jmenuDetalleArchivoPresupuestoVentas;
	protected JMenu jmenuDetalleAccionesPresupuestoVentas;
	protected JMenu jmenuDetalleDatosPresupuestoVentas;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePresupuestoVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPresupuestoVentas;	
	protected GridBagConstraints gridBagConstraintsPresupuestoVentas;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PresupuestoVentasBeanSwingJInternalFrameAdditional jInternalFrameDetallePresupuestoVentas;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";

	protected ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_zona="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";
	
	public PresupuestoVentasSessionBean presupuestoventasSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	public ZonaSessionBean zonaSessionBean;
	public ProductoSessionBean productoSessionBean;	
	
	public PresupuestoVentasLogic presupuestoventasLogic;
	
	public JScrollPane jScrollPanelDatosPresupuestoVentas;
	public JScrollPane jScrollPanelDatosEdicionPresupuestoVentas;
	public JScrollPane jScrollPanelDatosGeneralPresupuestoVentas;
	
	protected JPanel jPanelCamposPresupuestoVentas;    
	protected JPanel jPanelCamposOcultosPresupuestoVentas;    	
	protected JPanel jPanelAccionesPresupuestoVentas;
	protected JPanel jPanelAccionesFormularioPresupuestoVentas;
    
	
	
	protected Integer iXPanelCamposPresupuestoVentas=0;
	protected Integer iYPanelCamposPresupuestoVentas=0;
	
	protected Integer iXPanelCamposOcultosPresupuestoVentas=0;
	protected Integer iYPanelCamposOcultosPresupuestoVentas=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPresupuestoVentas;
	public JButton jButtonModificarPresupuestoVentas;
	public JButton jButtonActualizarPresupuestoVentas;
    public JButton jButtonEliminarPresupuestoVentas;
	public JButton jButtonCancelarPresupuestoVentas;
    public JButton jButtonGuardarCambiosPresupuestoVentas;
	public JButton jButtonGuardarCambiosTablaPresupuestoVentas;
	protected JButton jButtonCerrarPresupuestoVentas;
	
	
	protected JButton jButtonProcesarInformacionPresupuestoVentas;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPresupuestoVentas;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPresupuestoVentas;
	protected JCheckBox jCheckBoxPostAccionSinMensajePresupuestoVentas;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPresupuestoVentas;
	protected JButton jButtonModificarToolBarPresupuestoVentas;
	protected JButton jButtonActualizarToolBarPresupuestoVentas;
    protected JButton jButtonEliminarToolBarPresupuestoVentas;
	protected JButton jButtonCancelarToolBarPresupuestoVentas;
    protected JButton jButtonGuardarCambiosToolBarPresupuestoVentas;
	protected JButton jButtonGuardarCambiosTablaToolBarPresupuestoVentas;
	protected JButton jButtonMostrarOcultarTablaToolBarPresupuestoVentas;
	protected JButton jButtonCerrarToolBarPresupuestoVentas;
	
	protected JButton jButtonProcesarInformacionToolBarPresupuestoVentas;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPresupuestoVentas;
	protected JMenuItem jMenuItemModificarPresupuestoVentas;
	protected JMenuItem jMenuItemActualizarPresupuestoVentas;
    protected JMenuItem jMenuItemEliminarPresupuestoVentas;
	protected JMenuItem jMenuItemCancelarPresupuestoVentas;
    protected JMenuItem jMenuItemGuardarCambiosPresupuestoVentas;
	protected JMenuItem jMenuItemGuardarCambiosTablaPresupuestoVentas;
	protected JMenuItem jMenuItemCerrarPresupuestoVentas;
	protected JMenuItem jMenuItemDetalleCerrarPresupuestoVentas;
	protected JMenuItem jMenuItemDetalleMostarOcultarPresupuestoVentas;
	
	protected JMenuItem jMenuItemProcesarInformacionPresupuestoVentas;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPresupuestoVentas;
	protected JMenuItem jMenuItemMostrarOcultarPresupuestoVentas;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPresupuestoVentas;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPresupuestoVentas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPresupuestoVentas;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPresupuestoVentas;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPresupuestoVentas;
	public JLabel jLabelIdPresupuestoVentas;
	public JLabel jLabelidPresupuestoVentas;
	public JButton jButtonidPresupuestoVentasBusqueda= new JButtonMe();

	public JPanel jPanelprecioPresupuestoVentas;
	public JLabel jLabelprecioPresupuestoVentas;
	public JTextField jTextFieldprecioPresupuestoVentas;
	public JButton jButtonprecioPresupuestoVentasBusqueda= new JButtonMe();

	public JPanel jPanelcantidadPresupuestoVentas;
	public JLabel jLabelcantidadPresupuestoVentas;
	public JTextField jTextFieldcantidadPresupuestoVentas;
	public JButton jButtoncantidadPresupuestoVentasBusqueda= new JButtonMe();

	public JPanel jPanelvalorPresupuestoVentas;
	public JLabel jLabelvalorPresupuestoVentas;
	public JTextField jTextFieldvalorPresupuestoVentas;
	public JButton jButtonvalorPresupuestoVentasBusqueda= new JButtonMe();

	public JPanel jPanelporcentajePresupuestoVentas;
	public JLabel jLabelporcentajePresupuestoVentas;
	public JTextField jTextFieldporcentajePresupuestoVentas;
	public JButton jButtonporcentajePresupuestoVentasBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_totalPresupuestoVentas;
	public JLabel jLabelcantidad_totalPresupuestoVentas;
	public JTextField jTextFieldcantidad_totalPresupuestoVentas;
	public JButton jButtoncantidad_totalPresupuestoVentasBusqueda= new JButtonMe();

	public JPanel jPanelvalor_totalPresupuestoVentas;
	public JLabel jLabelvalor_totalPresupuestoVentas;
	public JTextField jTextFieldvalor_totalPresupuestoVentas;
	public JButton jButtonvalor_totalPresupuestoVentasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPresupuestoVentas;
	public JLabel jLabelid_empresaPresupuestoVentas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPresupuestoVentas;
	public JButton jButtonid_empresaPresupuestoVentas= new JButtonMe();
	public JButton jButtonid_empresaPresupuestoVentasUpdate= new JButtonMe();
	public JButton jButtonid_empresaPresupuestoVentasBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalPresupuestoVentas;
	public JLabel jLabelid_sucursalPresupuestoVentas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalPresupuestoVentas;
	public JButton jButtonid_sucursalPresupuestoVentas= new JButtonMe();
	public JButton jButtonid_sucursalPresupuestoVentasUpdate= new JButtonMe();
	public JButton jButtonid_sucursalPresupuestoVentasBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioPresupuestoVentas;
	public JLabel jLabelid_ejercicioPresupuestoVentas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioPresupuestoVentas;
	public JButton jButtonid_ejercicioPresupuestoVentas= new JButtonMe();
	public JButton jButtonid_ejercicioPresupuestoVentasUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioPresupuestoVentasBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoPresupuestoVentas;
	public JLabel jLabelid_periodoPresupuestoVentas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoPresupuestoVentas;
	public JButton jButtonid_periodoPresupuestoVentas= new JButtonMe();
	public JButton jButtonid_periodoPresupuestoVentasUpdate= new JButtonMe();
	public JButton jButtonid_periodoPresupuestoVentasBusqueda= new JButtonMe();

	public JPanel jPanelid_vendedorPresupuestoVentas;
	public JLabel jLabelid_vendedorPresupuestoVentas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorPresupuestoVentas;
	public JButton jButtonid_vendedorPresupuestoVentas= new JButtonMe();
	public JButton jButtonid_vendedorPresupuestoVentasUpdate= new JButtonMe();
	public JButton jButtonid_vendedorPresupuestoVentasBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorPresupuestoVentasArbol= new JButtonMe();

	public JPanel jPanelid_paisPresupuestoVentas;
	public JLabel jLabelid_paisPresupuestoVentas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisPresupuestoVentas;
	public JButton jButtonid_paisPresupuestoVentas= new JButtonMe();
	public JButton jButtonid_paisPresupuestoVentasUpdate= new JButtonMe();
	public JButton jButtonid_paisPresupuestoVentasBusqueda= new JButtonMe();

	public JPanel jPanelid_ciudadPresupuestoVentas;
	public JLabel jLabelid_ciudadPresupuestoVentas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadPresupuestoVentas;
	public JButton jButtonid_ciudadPresupuestoVentas= new JButtonMe();
	public JButton jButtonid_ciudadPresupuestoVentasUpdate= new JButtonMe();
	public JButton jButtonid_ciudadPresupuestoVentasBusqueda= new JButtonMe();

	public JPanel jPanelid_zonaPresupuestoVentas;
	public JLabel jLabelid_zonaPresupuestoVentas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_zonaPresupuestoVentas;
	public JButton jButtonid_zonaPresupuestoVentas= new JButtonMe();
	public JButton jButtonid_zonaPresupuestoVentasUpdate= new JButtonMe();
	public JButton jButtonid_zonaPresupuestoVentasBusqueda= new JButtonMe();

	public JPanel jPanelid_productoPresupuestoVentas;
	public JLabel jLabelid_productoPresupuestoVentas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoPresupuestoVentas;
	public JButton jButtonid_productoPresupuestoVentas= new JButtonMe();
	public JButton jButtonid_productoPresupuestoVentasUpdate= new JButtonMe();
	public JButton jButtonid_productoPresupuestoVentasBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPresupuestoVentas;
	
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
		
	public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PresupuestoVentasDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPresupuestoVentas=new JPanel();
				this.jPanelAccionesFormularioPresupuestoVentas=new JPanel();
				this.jmenuBarDetallePresupuestoVentas=new JMenuBar();
				this.jTtoolBarDetallePresupuestoVentas=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoVentasDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PresupuestoVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PresupuestoVentasDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PresupuestoVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoVentasDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresupuestoVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoVentasDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresupuestoVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoVentasDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PresupuestoVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPresupuestoVentas() {
		return this.jButtonActualizarToolBarPresupuestoVentas;
	}
	
	public JButton getjButtonEliminarToolBarPresupuestoVentas() {
		return this.jButtonEliminarToolBarPresupuestoVentas;
	}
	
	public JButton getjButtonCancelarToolBarPresupuestoVentas() {
		return this.jButtonCancelarToolBarPresupuestoVentas;
	}		
	
	public JButton getjButtonProcesarInformacionPresupuestoVentas() {
		return this.jButtonProcesarInformacionPresupuestoVentas;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPresupuestoVentas)	{
		this.jButtonProcesarInformacionPresupuestoVentas = jButtonProcesarInformacionPresupuestoVentas;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPresupuestoVentas() {
		return this.jComboBoxTiposAccionesPresupuestoVentas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPresupuestoVentas(
			JComboBox jComboBoxTiposRelacionesPresupuestoVentas) {
		this.jComboBoxTiposRelacionesPresupuestoVentas = jComboBoxTiposRelacionesPresupuestoVentas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPresupuestoVentas(
			JComboBox jComboBoxTiposAccionesPresupuestoVentas) {
		this.jComboBoxTiposAccionesPresupuestoVentas = jComboBoxTiposAccionesPresupuestoVentas;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPresupuestoVentas() {
		return this.jComboBoxTiposAccionesFormularioPresupuestoVentas;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPresupuestoVentas(
			JComboBox jComboBoxTiposAccionesFormularioPresupuestoVentas) {
		this.jComboBoxTiposAccionesFormularioPresupuestoVentas = jComboBoxTiposAccionesFormularioPresupuestoVentas;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.presupuestoventasSessionBean=new PresupuestoVentasSessionBean();
		
		this.presupuestoventasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presupuestoventasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.presupuestoventasSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PresupuestoVentasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PresupuestoVentasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PresupuestoVentasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Presupuesto Ventas MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {
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
	
		PresupuestoVentasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePresupuestoVentas= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPresupuestoVentas=new JButtonMe();
				this.jButtonModificarToolBarPresupuestoVentas=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPresupuestoVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPresupuestoVentas,this.jTtoolBarDetallePresupuestoVentas,
							"actualizar","actualizar","Actualizar"+" "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPresupuestoVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPresupuestoVentas,this.jTtoolBarDetallePresupuestoVentas,
							"eliminar","eliminar","Eliminar"+" "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPresupuestoVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPresupuestoVentas,this.jTtoolBarDetallePresupuestoVentas,
							"cancelar","cancelar","Cancelar"+" "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPresupuestoVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPresupuestoVentas,this.jTtoolBarDetallePresupuestoVentas,
							"guardarcambios","guardarcambios","Guardar"+" "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePresupuestoVentas=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePresupuestoVentas=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPresupuestoVentas=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPresupuestoVentas=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPresupuestoVentas=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPresupuestoVentas= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPresupuestoVentas.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPresupuestoVentas,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPresupuestoVentas= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPresupuestoVentas.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPresupuestoVentas,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPresupuestoVentas= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPresupuestoVentas.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPresupuestoVentas,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPresupuestoVentas= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPresupuestoVentas.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPresupuestoVentas,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPresupuestoVentas= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPresupuestoVentas.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPresupuestoVentas,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPresupuestoVentas= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPresupuestoVentas.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPresupuestoVentas,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPresupuestoVentas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPresupuestoVentas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPresupuestoVentas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPresupuestoVentas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPresupuestoVentas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPresupuestoVentas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPresupuestoVentas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPresupuestoVentas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPresupuestoVentas,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPresupuestoVentas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPresupuestoVentas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPresupuestoVentas,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPresupuestoVentas.add(this.jMenuItemDetalleCerrarPresupuestoVentas);
		
		this.jmenuDetalleAccionesPresupuestoVentas.add(this.jMenuItemActualizarPresupuestoVentas);
		this.jmenuDetalleAccionesPresupuestoVentas.add(this.jMenuItemEliminarPresupuestoVentas);
		this.jmenuDetalleAccionesPresupuestoVentas.add(this.jMenuItemCancelarPresupuestoVentas);		
		
		//this.jmenuDetalleDatosPresupuestoVentas.add(this.jMenuItemDetalleAbrirOrderByPresupuestoVentas);				
		this.jmenuDetalleDatosPresupuestoVentas.add(this.jMenuItemDetalleMostarOcultarPresupuestoVentas);				
				
		//this.jmenuDetalleAccionesPresupuestoVentas.add(this.jMenuItemGuardarCambiosPresupuestoVentas);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePresupuestoVentas.add(this.jmenuDetalleArchivoPresupuestoVentas);		
		this.jmenuBarDetallePresupuestoVentas.add(this.jmenuDetalleAccionesPresupuestoVentas);		
		this.jmenuBarDetallePresupuestoVentas.add(this.jmenuDetalleDatosPresupuestoVentas);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePresupuestoVentas);				
	}
	
	
	public void inicializarElementosCamposPresupuestoVentas() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPresupuestoVentas = new JLabelMe();
		jLabelIdPresupuestoVentas.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPresupuestoVentas = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPresupuestoVentas.setToolTipText(PresupuestoVentasConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPresupuestoVentas= new GridBagLayout();

		this.jPanelidPresupuestoVentas.setLayout(this.gridaBagLayoutPresupuestoVentas);

		jLabelidPresupuestoVentas = new JLabel();
		jLabelidPresupuestoVentas.setText("Id");

		jLabelidPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelprecioPresupuestoVentas = new JLabelMe();
		this.jLabelprecioPresupuestoVentas.setText(""+PresupuestoVentasConstantesFunciones.LABEL_PRECIO+" : *");
		this.jLabelprecioPresupuestoVentas.setToolTipText("Precio");
		this.jLabelprecioPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecioPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecioPresupuestoVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecioPresupuestoVentas.setToolTipText(PresupuestoVentasConstantesFunciones.LABEL_PRECIO);
		this.gridaBagLayoutPresupuestoVentas = new GridBagLayout();
		this.jPanelprecioPresupuestoVentas.setLayout(this.gridaBagLayoutPresupuestoVentas);


		jTextFieldprecioPresupuestoVentas= new JTextFieldMe();
		jTextFieldprecioPresupuestoVentas.setEnabled(false);
		jTextFieldprecioPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecioPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecioPresupuestoVentas.setText("0.0");

		this.jButtonprecioPresupuestoVentasBusqueda= new JButtonMe();
		this.jButtonprecioPresupuestoVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioPresupuestoVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioPresupuestoVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecioPresupuestoVentasBusqueda.setText("U");
		this.jButtonprecioPresupuestoVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecioPresupuestoVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecioPresupuestoVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecioPresupuestoVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecioPresupuestoVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precioPresupuestoVentasBusqueda"));

		if(this.presupuestoventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecioPresupuestoVentasBusqueda.setVisible(false);		}


					
		this.jLabelcantidadPresupuestoVentas = new JLabelMe();
		this.jLabelcantidadPresupuestoVentas.setText(""+PresupuestoVentasConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadPresupuestoVentas.setToolTipText("Cantidad");
		this.jLabelcantidadPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadPresupuestoVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadPresupuestoVentas.setToolTipText(PresupuestoVentasConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutPresupuestoVentas = new GridBagLayout();
		this.jPanelcantidadPresupuestoVentas.setLayout(this.gridaBagLayoutPresupuestoVentas);


		jTextFieldcantidadPresupuestoVentas= new JTextFieldMe();
		jTextFieldcantidadPresupuestoVentas.setEnabled(false);
		jTextFieldcantidadPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadPresupuestoVentas.setText("0");

		this.jButtoncantidadPresupuestoVentasBusqueda= new JButtonMe();
		this.jButtoncantidadPresupuestoVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadPresupuestoVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadPresupuestoVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadPresupuestoVentasBusqueda.setText("U");
		this.jButtoncantidadPresupuestoVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadPresupuestoVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadPresupuestoVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadPresupuestoVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadPresupuestoVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadPresupuestoVentasBusqueda"));

		if(this.presupuestoventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadPresupuestoVentasBusqueda.setVisible(false);		}


					
		this.jLabelvalorPresupuestoVentas = new JLabelMe();
		this.jLabelvalorPresupuestoVentas.setText(""+PresupuestoVentasConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorPresupuestoVentas.setToolTipText("Valor");
		this.jLabelvalorPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorPresupuestoVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorPresupuestoVentas.setToolTipText(PresupuestoVentasConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutPresupuestoVentas = new GridBagLayout();
		this.jPanelvalorPresupuestoVentas.setLayout(this.gridaBagLayoutPresupuestoVentas);


		jTextFieldvalorPresupuestoVentas= new JTextFieldMe();
		jTextFieldvalorPresupuestoVentas.setEnabled(false);
		jTextFieldvalorPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorPresupuestoVentas.setText("0.0");

		this.jButtonvalorPresupuestoVentasBusqueda= new JButtonMe();
		this.jButtonvalorPresupuestoVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorPresupuestoVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorPresupuestoVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorPresupuestoVentasBusqueda.setText("U");
		this.jButtonvalorPresupuestoVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorPresupuestoVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorPresupuestoVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorPresupuestoVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorPresupuestoVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorPresupuestoVentasBusqueda"));

		if(this.presupuestoventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorPresupuestoVentasBusqueda.setVisible(false);		}


					
		this.jLabelporcentajePresupuestoVentas = new JLabelMe();
		this.jLabelporcentajePresupuestoVentas.setText(""+PresupuestoVentasConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajePresupuestoVentas.setToolTipText("Porcentaje");
		this.jLabelporcentajePresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajePresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajePresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajePresupuestoVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajePresupuestoVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajePresupuestoVentas.setToolTipText(PresupuestoVentasConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutPresupuestoVentas = new GridBagLayout();
		this.jPanelporcentajePresupuestoVentas.setLayout(this.gridaBagLayoutPresupuestoVentas);


		jTextFieldporcentajePresupuestoVentas= new JTextFieldMe();
		jTextFieldporcentajePresupuestoVentas.setEnabled(false);
		jTextFieldporcentajePresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajePresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajePresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajePresupuestoVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajePresupuestoVentas.setText("0.0");

		this.jButtonporcentajePresupuestoVentasBusqueda= new JButtonMe();
		this.jButtonporcentajePresupuestoVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajePresupuestoVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajePresupuestoVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajePresupuestoVentasBusqueda.setText("U");
		this.jButtonporcentajePresupuestoVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajePresupuestoVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajePresupuestoVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajePresupuestoVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajePresupuestoVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajePresupuestoVentasBusqueda"));

		if(this.presupuestoventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajePresupuestoVentasBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_totalPresupuestoVentas = new JLabelMe();
		this.jLabelcantidad_totalPresupuestoVentas.setText(""+PresupuestoVentasConstantesFunciones.LABEL_CANTIDADTOTAL+" : *");
		this.jLabelcantidad_totalPresupuestoVentas.setToolTipText("Cantidad Total");
		this.jLabelcantidad_totalPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidad_totalPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidad_totalPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_totalPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_totalPresupuestoVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_totalPresupuestoVentas.setToolTipText(PresupuestoVentasConstantesFunciones.LABEL_CANTIDADTOTAL);
		this.gridaBagLayoutPresupuestoVentas = new GridBagLayout();
		this.jPanelcantidad_totalPresupuestoVentas.setLayout(this.gridaBagLayoutPresupuestoVentas);


		jTextFieldcantidad_totalPresupuestoVentas= new JTextFieldMe();
		jTextFieldcantidad_totalPresupuestoVentas.setEnabled(false);
		jTextFieldcantidad_totalPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_totalPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_totalPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_totalPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_totalPresupuestoVentas.setText("0");

		this.jButtoncantidad_totalPresupuestoVentasBusqueda= new JButtonMe();
		this.jButtoncantidad_totalPresupuestoVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_totalPresupuestoVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_totalPresupuestoVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_totalPresupuestoVentasBusqueda.setText("U");
		this.jButtoncantidad_totalPresupuestoVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_totalPresupuestoVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_totalPresupuestoVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_totalPresupuestoVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_totalPresupuestoVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_totalPresupuestoVentasBusqueda"));

		if(this.presupuestoventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_totalPresupuestoVentasBusqueda.setVisible(false);		}


					
		this.jLabelvalor_totalPresupuestoVentas = new JLabelMe();
		this.jLabelvalor_totalPresupuestoVentas.setText(""+PresupuestoVentasConstantesFunciones.LABEL_VALORTOTAL+" : *");
		this.jLabelvalor_totalPresupuestoVentas.setToolTipText("Valor Total");
		this.jLabelvalor_totalPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_totalPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_totalPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_totalPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_totalPresupuestoVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_totalPresupuestoVentas.setToolTipText(PresupuestoVentasConstantesFunciones.LABEL_VALORTOTAL);
		this.gridaBagLayoutPresupuestoVentas = new GridBagLayout();
		this.jPanelvalor_totalPresupuestoVentas.setLayout(this.gridaBagLayoutPresupuestoVentas);


		jTextFieldvalor_totalPresupuestoVentas= new JTextFieldMe();
		jTextFieldvalor_totalPresupuestoVentas.setEnabled(false);
		jTextFieldvalor_totalPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_totalPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_totalPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_totalPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_totalPresupuestoVentas.setText("0.0");

		this.jButtonvalor_totalPresupuestoVentasBusqueda= new JButtonMe();
		this.jButtonvalor_totalPresupuestoVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_totalPresupuestoVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_totalPresupuestoVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_totalPresupuestoVentasBusqueda.setText("U");
		this.jButtonvalor_totalPresupuestoVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_totalPresupuestoVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_totalPresupuestoVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_totalPresupuestoVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_totalPresupuestoVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_totalPresupuestoVentasBusqueda"));

		if(this.presupuestoventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_totalPresupuestoVentasBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPresupuestoVentas() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPresupuestoVentas = new JLabelMe();
		this.jLabelid_empresaPresupuestoVentas.setText(""+PresupuestoVentasConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPresupuestoVentas.setToolTipText("Empresa");
		this.jLabelid_empresaPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPresupuestoVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPresupuestoVentas.setToolTipText(PresupuestoVentasConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPresupuestoVentas = new GridBagLayout();
		this.jPanelid_empresaPresupuestoVentas.setLayout(this.gridaBagLayoutPresupuestoVentas);


		jComboBoxid_empresaPresupuestoVentas= new JComboBoxMe();
		jComboBoxid_empresaPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPresupuestoVentas.setEnabled(false);

		this.jButtonid_empresaPresupuestoVentas= new JButtonMe();
		this.jButtonid_empresaPresupuestoVentas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPresupuestoVentas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPresupuestoVentas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPresupuestoVentas.setText("Buscar");
		this.jButtonid_empresaPresupuestoVentas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPresupuestoVentas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPresupuestoVentas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPresupuestoVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPresupuestoVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPresupuestoVentas"));

		this.jButtonid_empresaPresupuestoVentasBusqueda= new JButtonMe();
		this.jButtonid_empresaPresupuestoVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresupuestoVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresupuestoVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPresupuestoVentasBusqueda.setText("U");
		this.jButtonid_empresaPresupuestoVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPresupuestoVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPresupuestoVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPresupuestoVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPresupuestoVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPresupuestoVentasBusqueda"));

		if(this.presupuestoventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPresupuestoVentasBusqueda.setVisible(false);		}

		this.jButtonid_empresaPresupuestoVentasUpdate= new JButtonMe();
		this.jButtonid_empresaPresupuestoVentasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresupuestoVentasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresupuestoVentasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPresupuestoVentasUpdate.setText("U");
		this.jButtonid_empresaPresupuestoVentasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPresupuestoVentasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPresupuestoVentasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPresupuestoVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPresupuestoVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPresupuestoVentasUpdate"));



					
		this.jLabelid_sucursalPresupuestoVentas = new JLabelMe();
		this.jLabelid_sucursalPresupuestoVentas.setText(""+PresupuestoVentasConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalPresupuestoVentas.setToolTipText("Sucursal");
		this.jLabelid_sucursalPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalPresupuestoVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalPresupuestoVentas.setToolTipText(PresupuestoVentasConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutPresupuestoVentas = new GridBagLayout();
		this.jPanelid_sucursalPresupuestoVentas.setLayout(this.gridaBagLayoutPresupuestoVentas);


		jComboBoxid_sucursalPresupuestoVentas= new JComboBoxMe();
		jComboBoxid_sucursalPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalPresupuestoVentas.setEnabled(false);

		this.jButtonid_sucursalPresupuestoVentas= new JButtonMe();
		this.jButtonid_sucursalPresupuestoVentas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPresupuestoVentas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPresupuestoVentas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPresupuestoVentas.setText("Buscar");
		this.jButtonid_sucursalPresupuestoVentas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalPresupuestoVentas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPresupuestoVentas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalPresupuestoVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPresupuestoVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPresupuestoVentas"));

		this.jButtonid_sucursalPresupuestoVentasBusqueda= new JButtonMe();
		this.jButtonid_sucursalPresupuestoVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPresupuestoVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPresupuestoVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPresupuestoVentasBusqueda.setText("U");
		this.jButtonid_sucursalPresupuestoVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalPresupuestoVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPresupuestoVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalPresupuestoVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPresupuestoVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPresupuestoVentasBusqueda"));

		if(this.presupuestoventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalPresupuestoVentasBusqueda.setVisible(false);		}

		this.jButtonid_sucursalPresupuestoVentasUpdate= new JButtonMe();
		this.jButtonid_sucursalPresupuestoVentasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPresupuestoVentasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPresupuestoVentasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPresupuestoVentasUpdate.setText("U");
		this.jButtonid_sucursalPresupuestoVentasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalPresupuestoVentasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPresupuestoVentasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalPresupuestoVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPresupuestoVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPresupuestoVentasUpdate"));



					
		this.jLabelid_ejercicioPresupuestoVentas = new JLabelMe();
		this.jLabelid_ejercicioPresupuestoVentas.setText(""+PresupuestoVentasConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioPresupuestoVentas.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioPresupuestoVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioPresupuestoVentas.setToolTipText(PresupuestoVentasConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutPresupuestoVentas = new GridBagLayout();
		this.jPanelid_ejercicioPresupuestoVentas.setLayout(this.gridaBagLayoutPresupuestoVentas);


		jComboBoxid_ejercicioPresupuestoVentas= new JComboBoxMe();
		jComboBoxid_ejercicioPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioPresupuestoVentas.setEnabled(false);

		this.jButtonid_ejercicioPresupuestoVentas= new JButtonMe();
		this.jButtonid_ejercicioPresupuestoVentas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPresupuestoVentas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPresupuestoVentas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPresupuestoVentas.setText("Buscar");
		this.jButtonid_ejercicioPresupuestoVentas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioPresupuestoVentas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPresupuestoVentas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioPresupuestoVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPresupuestoVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPresupuestoVentas"));

		this.jButtonid_ejercicioPresupuestoVentasBusqueda= new JButtonMe();
		this.jButtonid_ejercicioPresupuestoVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPresupuestoVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPresupuestoVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPresupuestoVentasBusqueda.setText("U");
		this.jButtonid_ejercicioPresupuestoVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioPresupuestoVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPresupuestoVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioPresupuestoVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPresupuestoVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPresupuestoVentasBusqueda"));

		if(this.presupuestoventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioPresupuestoVentasBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioPresupuestoVentasUpdate= new JButtonMe();
		this.jButtonid_ejercicioPresupuestoVentasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPresupuestoVentasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPresupuestoVentasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPresupuestoVentasUpdate.setText("U");
		this.jButtonid_ejercicioPresupuestoVentasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioPresupuestoVentasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPresupuestoVentasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioPresupuestoVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPresupuestoVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPresupuestoVentasUpdate"));



					
		this.jLabelid_periodoPresupuestoVentas = new JLabelMe();
		this.jLabelid_periodoPresupuestoVentas.setText(""+PresupuestoVentasConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoPresupuestoVentas.setToolTipText("Periodo");
		this.jLabelid_periodoPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoPresupuestoVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoPresupuestoVentas.setToolTipText(PresupuestoVentasConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutPresupuestoVentas = new GridBagLayout();
		this.jPanelid_periodoPresupuestoVentas.setLayout(this.gridaBagLayoutPresupuestoVentas);


		jComboBoxid_periodoPresupuestoVentas= new JComboBoxMe();
		jComboBoxid_periodoPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoPresupuestoVentas.setEnabled(false);

		this.jButtonid_periodoPresupuestoVentas= new JButtonMe();
		this.jButtonid_periodoPresupuestoVentas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPresupuestoVentas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPresupuestoVentas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPresupuestoVentas.setText("Buscar");
		this.jButtonid_periodoPresupuestoVentas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoPresupuestoVentas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPresupuestoVentas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoPresupuestoVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPresupuestoVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPresupuestoVentas"));

		this.jButtonid_periodoPresupuestoVentasBusqueda= new JButtonMe();
		this.jButtonid_periodoPresupuestoVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPresupuestoVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPresupuestoVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoPresupuestoVentasBusqueda.setText("U");
		this.jButtonid_periodoPresupuestoVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoPresupuestoVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPresupuestoVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoPresupuestoVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPresupuestoVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPresupuestoVentasBusqueda"));

		if(this.presupuestoventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoPresupuestoVentasBusqueda.setVisible(false);		}

		this.jButtonid_periodoPresupuestoVentasUpdate= new JButtonMe();
		this.jButtonid_periodoPresupuestoVentasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPresupuestoVentasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPresupuestoVentasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoPresupuestoVentasUpdate.setText("U");
		this.jButtonid_periodoPresupuestoVentasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoPresupuestoVentasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPresupuestoVentasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoPresupuestoVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPresupuestoVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPresupuestoVentasUpdate"));



					
		this.jLabelid_vendedorPresupuestoVentas = new JLabelMe();
		this.jLabelid_vendedorPresupuestoVentas.setText(""+PresupuestoVentasConstantesFunciones.LABEL_IDVENDEDOR+" : *");
		this.jLabelid_vendedorPresupuestoVentas.setToolTipText("Vendedor");
		this.jLabelid_vendedorPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_vendedorPresupuestoVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_vendedorPresupuestoVentas.setToolTipText(PresupuestoVentasConstantesFunciones.LABEL_IDVENDEDOR);
		this.gridaBagLayoutPresupuestoVentas = new GridBagLayout();
		this.jPanelid_vendedorPresupuestoVentas.setLayout(this.gridaBagLayoutPresupuestoVentas);


		jComboBoxid_vendedorPresupuestoVentas= new JComboBoxMe();
		jComboBoxid_vendedorPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_vendedorPresupuestoVentas= new JButtonMe();
		this.jButtonid_vendedorPresupuestoVentas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorPresupuestoVentas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorPresupuestoVentas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorPresupuestoVentas.setText("Buscar");
		this.jButtonid_vendedorPresupuestoVentas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_vendedorPresupuestoVentas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorPresupuestoVentas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_vendedorPresupuestoVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorPresupuestoVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorPresupuestoVentas"));

		this.jButtonid_vendedorPresupuestoVentasBusqueda= new JButtonMe();
		this.jButtonid_vendedorPresupuestoVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorPresupuestoVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorPresupuestoVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorPresupuestoVentasBusqueda.setText("U");
		this.jButtonid_vendedorPresupuestoVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_vendedorPresupuestoVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorPresupuestoVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_vendedorPresupuestoVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorPresupuestoVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorPresupuestoVentasBusqueda"));

		if(this.presupuestoventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_vendedorPresupuestoVentasBusqueda.setVisible(false);		}

		this.jButtonid_vendedorPresupuestoVentasUpdate= new JButtonMe();
		this.jButtonid_vendedorPresupuestoVentasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorPresupuestoVentasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorPresupuestoVentasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorPresupuestoVentasUpdate.setText("U");
		this.jButtonid_vendedorPresupuestoVentasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_vendedorPresupuestoVentasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorPresupuestoVentasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_vendedorPresupuestoVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorPresupuestoVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorPresupuestoVentasUpdate"));


		jButtonid_vendedorPresupuestoVentasArbol= new JButtonMe();
		jButtonid_vendedorPresupuestoVentasArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorPresupuestoVentasArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorPresupuestoVentasArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorPresupuestoVentasArbol.setText("Arbol");
		jButtonid_vendedorPresupuestoVentasArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_vendedorPresupuestoVentasArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorPresupuestoVentasArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_vendedorPresupuestoVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorPresupuestoVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorPresupuestoVentasArbol"));



					
		this.jLabelid_paisPresupuestoVentas = new JLabelMe();
		this.jLabelid_paisPresupuestoVentas.setText(""+PresupuestoVentasConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisPresupuestoVentas.setToolTipText("Pais");
		this.jLabelid_paisPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisPresupuestoVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisPresupuestoVentas.setToolTipText(PresupuestoVentasConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutPresupuestoVentas = new GridBagLayout();
		this.jPanelid_paisPresupuestoVentas.setLayout(this.gridaBagLayoutPresupuestoVentas);


		jComboBoxid_paisPresupuestoVentas= new JComboBoxMe();
		jComboBoxid_paisPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisPresupuestoVentas= new JButtonMe();
		this.jButtonid_paisPresupuestoVentas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisPresupuestoVentas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisPresupuestoVentas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisPresupuestoVentas.setText("Buscar");
		this.jButtonid_paisPresupuestoVentas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisPresupuestoVentas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisPresupuestoVentas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisPresupuestoVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisPresupuestoVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisPresupuestoVentas"));

		this.jButtonid_paisPresupuestoVentasBusqueda= new JButtonMe();
		this.jButtonid_paisPresupuestoVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisPresupuestoVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisPresupuestoVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisPresupuestoVentasBusqueda.setText("U");
		this.jButtonid_paisPresupuestoVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisPresupuestoVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisPresupuestoVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisPresupuestoVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisPresupuestoVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisPresupuestoVentasBusqueda"));

		if(this.presupuestoventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisPresupuestoVentasBusqueda.setVisible(false);		}

		this.jButtonid_paisPresupuestoVentasUpdate= new JButtonMe();
		this.jButtonid_paisPresupuestoVentasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisPresupuestoVentasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisPresupuestoVentasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisPresupuestoVentasUpdate.setText("U");
		this.jButtonid_paisPresupuestoVentasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisPresupuestoVentasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisPresupuestoVentasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisPresupuestoVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisPresupuestoVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisPresupuestoVentasUpdate"));



					
		this.jLabelid_ciudadPresupuestoVentas = new JLabelMe();
		this.jLabelid_ciudadPresupuestoVentas.setText(""+PresupuestoVentasConstantesFunciones.LABEL_IDCIUDAD+" : *");
		this.jLabelid_ciudadPresupuestoVentas.setToolTipText("Ciudad");
		this.jLabelid_ciudadPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ciudadPresupuestoVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ciudadPresupuestoVentas.setToolTipText(PresupuestoVentasConstantesFunciones.LABEL_IDCIUDAD);
		this.gridaBagLayoutPresupuestoVentas = new GridBagLayout();
		this.jPanelid_ciudadPresupuestoVentas.setLayout(this.gridaBagLayoutPresupuestoVentas);


		jComboBoxid_ciudadPresupuestoVentas= new JComboBoxMe();
		jComboBoxid_ciudadPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ciudadPresupuestoVentas= new JButtonMe();
		this.jButtonid_ciudadPresupuestoVentas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadPresupuestoVentas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadPresupuestoVentas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadPresupuestoVentas.setText("Buscar");
		this.jButtonid_ciudadPresupuestoVentas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ciudadPresupuestoVentas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadPresupuestoVentas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ciudadPresupuestoVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadPresupuestoVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadPresupuestoVentas"));

		this.jButtonid_ciudadPresupuestoVentasBusqueda= new JButtonMe();
		this.jButtonid_ciudadPresupuestoVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadPresupuestoVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadPresupuestoVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadPresupuestoVentasBusqueda.setText("U");
		this.jButtonid_ciudadPresupuestoVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ciudadPresupuestoVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadPresupuestoVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ciudadPresupuestoVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadPresupuestoVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadPresupuestoVentasBusqueda"));

		if(this.presupuestoventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ciudadPresupuestoVentasBusqueda.setVisible(false);		}

		this.jButtonid_ciudadPresupuestoVentasUpdate= new JButtonMe();
		this.jButtonid_ciudadPresupuestoVentasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadPresupuestoVentasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadPresupuestoVentasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadPresupuestoVentasUpdate.setText("U");
		this.jButtonid_ciudadPresupuestoVentasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ciudadPresupuestoVentasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadPresupuestoVentasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ciudadPresupuestoVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadPresupuestoVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadPresupuestoVentasUpdate"));



					
		this.jLabelid_zonaPresupuestoVentas = new JLabelMe();
		this.jLabelid_zonaPresupuestoVentas.setText(""+PresupuestoVentasConstantesFunciones.LABEL_IDZONA+" :");
		this.jLabelid_zonaPresupuestoVentas.setToolTipText("Zona");
		this.jLabelid_zonaPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_zonaPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_zonaPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_zonaPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_zonaPresupuestoVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_zonaPresupuestoVentas.setToolTipText(PresupuestoVentasConstantesFunciones.LABEL_IDZONA);
		this.gridaBagLayoutPresupuestoVentas = new GridBagLayout();
		this.jPanelid_zonaPresupuestoVentas.setLayout(this.gridaBagLayoutPresupuestoVentas);


		jComboBoxid_zonaPresupuestoVentas= new JComboBoxMe();
		jComboBoxid_zonaPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_zonaPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_zonaPresupuestoVentas= new JButtonMe();
		this.jButtonid_zonaPresupuestoVentas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaPresupuestoVentas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaPresupuestoVentas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaPresupuestoVentas.setText("Buscar");
		this.jButtonid_zonaPresupuestoVentas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_zonaPresupuestoVentas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaPresupuestoVentas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_zonaPresupuestoVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaPresupuestoVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaPresupuestoVentas"));

		this.jButtonid_zonaPresupuestoVentasBusqueda= new JButtonMe();
		this.jButtonid_zonaPresupuestoVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaPresupuestoVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaPresupuestoVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_zonaPresupuestoVentasBusqueda.setText("U");
		this.jButtonid_zonaPresupuestoVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_zonaPresupuestoVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaPresupuestoVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_zonaPresupuestoVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaPresupuestoVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaPresupuestoVentasBusqueda"));

		if(this.presupuestoventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_zonaPresupuestoVentasBusqueda.setVisible(false);		}

		this.jButtonid_zonaPresupuestoVentasUpdate= new JButtonMe();
		this.jButtonid_zonaPresupuestoVentasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaPresupuestoVentasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaPresupuestoVentasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_zonaPresupuestoVentasUpdate.setText("U");
		this.jButtonid_zonaPresupuestoVentasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_zonaPresupuestoVentasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaPresupuestoVentasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_zonaPresupuestoVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaPresupuestoVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaPresupuestoVentasUpdate"));



					
		this.jLabelid_productoPresupuestoVentas = new JLabelMe();
		this.jLabelid_productoPresupuestoVentas.setText(""+PresupuestoVentasConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoPresupuestoVentas.setToolTipText("Producto");
		this.jLabelid_productoPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoPresupuestoVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoPresupuestoVentas.setToolTipText(PresupuestoVentasConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutPresupuestoVentas = new GridBagLayout();
		this.jPanelid_productoPresupuestoVentas.setLayout(this.gridaBagLayoutPresupuestoVentas);


		jComboBoxid_productoPresupuestoVentas= new JComboBoxMe();
		jComboBoxid_productoPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoPresupuestoVentas= new JButtonMe();
		this.jButtonid_productoPresupuestoVentas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoPresupuestoVentas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoPresupuestoVentas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoPresupuestoVentas.setText("Buscar");
		this.jButtonid_productoPresupuestoVentas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoPresupuestoVentas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoPresupuestoVentas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoPresupuestoVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoPresupuestoVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoPresupuestoVentas"));

		this.jButtonid_productoPresupuestoVentasBusqueda= new JButtonMe();
		this.jButtonid_productoPresupuestoVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoPresupuestoVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoPresupuestoVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoPresupuestoVentasBusqueda.setText("U");
		this.jButtonid_productoPresupuestoVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoPresupuestoVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoPresupuestoVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoPresupuestoVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoPresupuestoVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoPresupuestoVentasBusqueda"));

		if(this.presupuestoventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoPresupuestoVentasBusqueda.setVisible(false);		}

		this.jButtonid_productoPresupuestoVentasUpdate= new JButtonMe();
		this.jButtonid_productoPresupuestoVentasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoPresupuestoVentasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoPresupuestoVentasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoPresupuestoVentasUpdate.setText("U");
		this.jButtonid_productoPresupuestoVentasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoPresupuestoVentasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoPresupuestoVentasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoPresupuestoVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoPresupuestoVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoPresupuestoVentasUpdate"));



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
		//this.jInternalFrameDetallePresupuestoVentas = new PresupuestoVentasBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Presupuesto Ventas DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPresupuestoVentas= new GridBagLayout();
		

		
		String sToolTipPresupuestoVentas="";
		sToolTipPresupuestoVentas=PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPresupuestoVentas+="(Facturacion.PresupuestoVentas)";
		}
		
		if(!this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {
			sToolTipPresupuestoVentas+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPresupuestoVentas = new JButtonMe();
		this.jButtonModificarPresupuestoVentas = new JButtonMe();
        this.jButtonActualizarPresupuestoVentas = new JButtonMe();
        this.jButtonEliminarPresupuestoVentas = new JButtonMe();
        this.jButtonCancelarPresupuestoVentas = new JButtonMe();
        this.jButtonGuardarCambiosPresupuestoVentas = new JButtonMe();
		this.jButtonGuardarCambiosTablaPresupuestoVentas = new JButtonMe();
		this.jButtonCerrarPresupuestoVentas = new JButtonMe();
		
		this.jScrollPanelDatosPresupuestoVentas = new JScrollPane();   
        this.jScrollPanelDatosEdicionPresupuestoVentas = new JScrollPane();
		this.jScrollPanelDatosGeneralPresupuestoVentas = new JScrollPane();
				
		
		
		this.jPanelCamposPresupuestoVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPresupuestoVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPresupuestoVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPresupuestoVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Presupuesto Ventas";
		
		if(!this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPresupuestoVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Ventases" + this.sPath));
		} else {
			this.jScrollPanelDatosPresupuestoVentas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPresupuestoVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPresupuestoVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPresupuestoVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPresupuestoVentas.setName("jPanelCamposPresupuestoVentas"); 

		this.jPanelCamposOcultosPresupuestoVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPresupuestoVentas.setName("jPanelCamposOcultosPresupuestoVentas"); 

        this.jPanelAccionesPresupuestoVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPresupuestoVentas.setToolTipText("Acciones");
        this.jPanelAccionesPresupuestoVentas.setName("Acciones"); 

		this.jPanelAccionesFormularioPresupuestoVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPresupuestoVentas.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPresupuestoVentas.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPresupuestoVentas.setText("Nuevo");
		this.jButtonModificarPresupuestoVentas.setText("Editar");
        this.jButtonActualizarPresupuestoVentas.setText("Actualizar");
        this.jButtonEliminarPresupuestoVentas.setText("Eliminar");
        this.jButtonCancelarPresupuestoVentas.setText("Cancelar");
        this.jButtonGuardarCambiosPresupuestoVentas.setText("Guardar");
		this.jButtonGuardarCambiosTablaPresupuestoVentas.setText("Guardar");
		this.jButtonCerrarPresupuestoVentas.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPresupuestoVentas,"nuevo_button","Nuevo",this.presupuestoventasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPresupuestoVentas,"modificar_button","Editar",this.presupuestoventasSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPresupuestoVentas,"actualizar_button","Actualizar",this.presupuestoventasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPresupuestoVentas,"eliminar_button","Eliminar",this.presupuestoventasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPresupuestoVentas,"cancelar_button","Cancelar",this.presupuestoventasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPresupuestoVentas,"guardarcambios_button","Guardar",this.presupuestoventasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPresupuestoVentas,"guardarcambiostabla_button","Guardar",this.presupuestoventasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPresupuestoVentas,"cerrar_button","Salir",this.presupuestoventasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPresupuestoVentas.setToolTipText("Nuevo"+" "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPresupuestoVentas.setToolTipText("Editar"+" "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPresupuestoVentas.setToolTipText("Actualizar"+" "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPresupuestoVentas.setToolTipText("Eliminar)"+" "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPresupuestoVentas.setToolTipText("Cancelar"+" "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPresupuestoVentas.setToolTipText("Guardar"+" "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPresupuestoVentas.setToolTipText("Guardar"+" "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPresupuestoVentas.setToolTipText("Salir"+" "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPresupuestoVentas";
		inputMap = this.jButtonNuevoPresupuestoVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPresupuestoVentas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPresupuestoVentas"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPresupuestoVentas";
		inputMap = this.jButtonActualizarPresupuestoVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPresupuestoVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPresupuestoVentas"));
		
		//ELIMINAR
		sMapKey = "EliminarPresupuestoVentas";
		inputMap = this.jButtonEliminarPresupuestoVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPresupuestoVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPresupuestoVentas"));
		
		//CANCELAR	
		sMapKey = "CancelarPresupuestoVentas";
		inputMap = this.jButtonCancelarPresupuestoVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPresupuestoVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPresupuestoVentas"));
		
		//CERRAR		
		sMapKey = "CerrarPresupuestoVentas";
		inputMap = this.jButtonCerrarPresupuestoVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPresupuestoVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPresupuestoVentas"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPresupuestoVentas";
		inputMap = this.jButtonGuardarCambiosTablaPresupuestoVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPresupuestoVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPresupuestoVentas"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPresupuestoVentas = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPresupuestoVentas.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPresupuestoVentas.setToolTipText("Nuevo PresupuestoVentas");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPresupuestoVentas = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPresupuestoVentas.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPresupuestoVentas.setToolTipText("Sin Cerrar Ventana PresupuestoVentas");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePresupuestoVentas = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePresupuestoVentas.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePresupuestoVentas.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePresupuestoVentas, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPresupuestoVentas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPresupuestoVentas.setText("Accion");
		this.jComboBoxTiposAccionesPresupuestoVentas.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPresupuestoVentas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPresupuestoVentas.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPresupuestoVentas.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPresupuestoVentas = new JLabelMe();
		
		this.jLabelAccionesPresupuestoVentas.setText("Acciones");		
		this.jLabelAccionesPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPresupuestoVentas();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPresupuestoVentas();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPresupuestoVentas=new JTabbedPane();
		this.jTabbedPaneRelacionesPresupuestoVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPresupuestoVentas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresupuestoVentas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresupuestoVentas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPresupuestoVentas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPresupuestoVentas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPresupuestoVentas.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPresupuestoVentas = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPresupuestoVentas = new GridBagLayout();
		
		this.jPanelCamposPresupuestoVentas.setLayout(gridaBagLayoutCamposPresupuestoVentas);
		this.jPanelCamposOcultosPresupuestoVentas.setLayout(gridaBagLayoutCamposOcultosPresupuestoVentas);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentas.gridx = 0;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPresupuestoVentas.add(jLabelIdPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);



	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentas.gridx = 1;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPresupuestoVentas.add(jLabelidPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);


	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentas.gridx = 0;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPresupuestoVentas.add(jLabelid_empresaPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentas.gridx = 2;
		this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPresupuestoVentas.add(jButtonid_empresaPresupuestoVentasBusqueda, this.gridBagConstraintsPresupuestoVentas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentas.gridx = 3;
		this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPresupuestoVentas.add(jButtonid_empresaPresupuestoVentasUpdate, this.gridBagConstraintsPresupuestoVentas);
	}

	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentas.gridx = 1;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPresupuestoVentas.add(jComboBoxid_empresaPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);


	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentas.gridx = 0;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalPresupuestoVentas.add(jLabelid_sucursalPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentas.gridx = 2;
		this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPresupuestoVentas.add(jButtonid_sucursalPresupuestoVentasBusqueda, this.gridBagConstraintsPresupuestoVentas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentas.gridx = 3;
		this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPresupuestoVentas.add(jButtonid_sucursalPresupuestoVentasUpdate, this.gridBagConstraintsPresupuestoVentas);
	}

	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentas.gridx = 1;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalPresupuestoVentas.add(jComboBoxid_sucursalPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);


	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentas.gridx = 0;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioPresupuestoVentas.add(jLabelid_ejercicioPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentas.gridx = 2;
		this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPresupuestoVentas.add(jButtonid_ejercicioPresupuestoVentasBusqueda, this.gridBagConstraintsPresupuestoVentas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentas.gridx = 3;
		this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPresupuestoVentas.add(jButtonid_ejercicioPresupuestoVentasUpdate, this.gridBagConstraintsPresupuestoVentas);
	}

	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentas.gridx = 1;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioPresupuestoVentas.add(jComboBoxid_ejercicioPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);


	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentas.gridx = 0;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoPresupuestoVentas.add(jLabelid_periodoPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentas.gridx = 2;
		this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoPresupuestoVentas.add(jButtonid_periodoPresupuestoVentasBusqueda, this.gridBagConstraintsPresupuestoVentas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentas.gridx = 3;
		this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoPresupuestoVentas.add(jButtonid_periodoPresupuestoVentasUpdate, this.gridBagConstraintsPresupuestoVentas);
	}

	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentas.gridx = 1;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoPresupuestoVentas.add(jComboBoxid_periodoPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);


	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentas.gridx = 0;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_vendedorPresupuestoVentas.add(jLabelid_vendedorPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentas.gridx = 2;
		this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorPresupuestoVentas.add(jButtonid_vendedorPresupuestoVentasBusqueda, this.gridBagConstraintsPresupuestoVentas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentas.gridx = 3;
		this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorPresupuestoVentas.add(jButtonid_vendedorPresupuestoVentasUpdate, this.gridBagConstraintsPresupuestoVentas);
	}

	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentas.gridx = 1;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_vendedorPresupuestoVentas.add(jComboBoxid_vendedorPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);


	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentas.gridx = 0;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisPresupuestoVentas.add(jLabelid_paisPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentas.gridx = 2;
		this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisPresupuestoVentas.add(jButtonid_paisPresupuestoVentasBusqueda, this.gridBagConstraintsPresupuestoVentas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentas.gridx = 3;
		this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisPresupuestoVentas.add(jButtonid_paisPresupuestoVentasUpdate, this.gridBagConstraintsPresupuestoVentas);
	}

	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentas.gridx = 1;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisPresupuestoVentas.add(jComboBoxid_paisPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);


	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentas.gridx = 0;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ciudadPresupuestoVentas.add(jLabelid_ciudadPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentas.gridx = 2;
		this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadPresupuestoVentas.add(jButtonid_ciudadPresupuestoVentasBusqueda, this.gridBagConstraintsPresupuestoVentas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentas.gridx = 3;
		this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadPresupuestoVentas.add(jButtonid_ciudadPresupuestoVentasUpdate, this.gridBagConstraintsPresupuestoVentas);
	}

	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentas.gridx = 1;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ciudadPresupuestoVentas.add(jComboBoxid_ciudadPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);


	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentas.gridx = 0;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_zonaPresupuestoVentas.add(jLabelid_zonaPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentas.gridx = 2;
		this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_zonaPresupuestoVentas.add(jButtonid_zonaPresupuestoVentasBusqueda, this.gridBagConstraintsPresupuestoVentas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentas.gridx = 3;
		this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_zonaPresupuestoVentas.add(jButtonid_zonaPresupuestoVentasUpdate, this.gridBagConstraintsPresupuestoVentas);
	}

	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentas.gridx = 1;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_zonaPresupuestoVentas.add(jComboBoxid_zonaPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);


	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentas.gridx = 0;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoPresupuestoVentas.add(jLabelid_productoPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	//this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentas.gridx = 2;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoPresupuestoVentas.add(jButtonid_productoPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentas.gridx = 3;
		this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoPresupuestoVentas.add(jButtonid_productoPresupuestoVentasBusqueda, this.gridBagConstraintsPresupuestoVentas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentas.gridx = 4;
		this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoPresupuestoVentas.add(jButtonid_productoPresupuestoVentasUpdate, this.gridBagConstraintsPresupuestoVentas);
	}

	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentas.gridx = 1;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoPresupuestoVentas.add(jComboBoxid_productoPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);


	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentas.gridx = 0;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecioPresupuestoVentas.add(jLabelprecioPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentas.gridx = 2;
		this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecioPresupuestoVentas.add(jButtonprecioPresupuestoVentasBusqueda, this.gridBagConstraintsPresupuestoVentas);
	}

	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentas.gridx = 1;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecioPresupuestoVentas.add(jTextFieldprecioPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);


	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentas.gridx = 0;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadPresupuestoVentas.add(jLabelcantidadPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentas.gridx = 2;
		this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadPresupuestoVentas.add(jButtoncantidadPresupuestoVentasBusqueda, this.gridBagConstraintsPresupuestoVentas);
	}

	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentas.gridx = 1;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadPresupuestoVentas.add(jTextFieldcantidadPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);


	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentas.gridx = 0;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorPresupuestoVentas.add(jLabelvalorPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentas.gridx = 2;
		this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorPresupuestoVentas.add(jButtonvalorPresupuestoVentasBusqueda, this.gridBagConstraintsPresupuestoVentas);
	}

	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentas.gridx = 1;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorPresupuestoVentas.add(jTextFieldvalorPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);


	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentas.gridx = 0;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajePresupuestoVentas.add(jLabelporcentajePresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentas.gridx = 2;
		this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajePresupuestoVentas.add(jButtonporcentajePresupuestoVentasBusqueda, this.gridBagConstraintsPresupuestoVentas);
	}

	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentas.gridx = 1;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajePresupuestoVentas.add(jTextFieldporcentajePresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);


	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentas.gridx = 0;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_totalPresupuestoVentas.add(jLabelcantidad_totalPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentas.gridx = 2;
		this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_totalPresupuestoVentas.add(jButtoncantidad_totalPresupuestoVentasBusqueda, this.gridBagConstraintsPresupuestoVentas);
	}

	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentas.gridx = 1;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_totalPresupuestoVentas.add(jTextFieldcantidad_totalPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);


	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentas.gridx = 0;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_totalPresupuestoVentas.add(jLabelvalor_totalPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentas.gridx = 2;
		this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_totalPresupuestoVentas.add(jButtonvalor_totalPresupuestoVentasBusqueda, this.gridBagConstraintsPresupuestoVentas);
	}

	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentas.gridx = 1;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_totalPresupuestoVentas.add(jTextFieldvalor_totalPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentas.gridy = iYPanelCamposPresupuestoVentas;
	this.gridBagConstraintsPresupuestoVentas.gridx = iXPanelCamposPresupuestoVentas++;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoVentas.add(this.jPanelidPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);



	if(iXPanelCamposPresupuestoVentas % 1==0) {
		iXPanelCamposPresupuestoVentas=0;
		iYPanelCamposPresupuestoVentas++;
	}
	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentas.gridy = iYPanelCamposPresupuestoVentas;
	this.gridBagConstraintsPresupuestoVentas.gridx = iXPanelCamposPresupuestoVentas++;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoVentas.add(this.jPanelid_vendedorPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);



	if(iXPanelCamposPresupuestoVentas % 1==0) {
		iXPanelCamposPresupuestoVentas=0;
		iYPanelCamposPresupuestoVentas++;
	}
	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentas.gridy = iYPanelCamposPresupuestoVentas;
	this.gridBagConstraintsPresupuestoVentas.gridx = iXPanelCamposPresupuestoVentas++;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoVentas.add(this.jPanelid_paisPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);



	if(iXPanelCamposPresupuestoVentas % 1==0) {
		iXPanelCamposPresupuestoVentas=0;
		iYPanelCamposPresupuestoVentas++;
	}
	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentas.gridy = iYPanelCamposPresupuestoVentas;
	this.gridBagConstraintsPresupuestoVentas.gridx = iXPanelCamposPresupuestoVentas++;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoVentas.add(this.jPanelid_ciudadPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);



	if(iXPanelCamposPresupuestoVentas % 1==0) {
		iXPanelCamposPresupuestoVentas=0;
		iYPanelCamposPresupuestoVentas++;
	}
	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentas.gridy = iYPanelCamposPresupuestoVentas;
	this.gridBagConstraintsPresupuestoVentas.gridx = iXPanelCamposPresupuestoVentas++;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoVentas.add(this.jPanelid_zonaPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);



	if(iXPanelCamposPresupuestoVentas % 1==0) {
		iXPanelCamposPresupuestoVentas=0;
		iYPanelCamposPresupuestoVentas++;
	}
	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentas.gridy = iYPanelCamposPresupuestoVentas;
	this.gridBagConstraintsPresupuestoVentas.gridx = iXPanelCamposPresupuestoVentas++;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoVentas.add(this.jPanelid_productoPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);



	if(iXPanelCamposPresupuestoVentas % 1==0) {
		iXPanelCamposPresupuestoVentas=0;
		iYPanelCamposPresupuestoVentas++;
	}
	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentas.gridy = iYPanelCamposPresupuestoVentas;
	this.gridBagConstraintsPresupuestoVentas.gridx = iXPanelCamposPresupuestoVentas++;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoVentas.add(this.jPanelprecioPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);



	if(iXPanelCamposPresupuestoVentas % 1==0) {
		iXPanelCamposPresupuestoVentas=0;
		iYPanelCamposPresupuestoVentas++;
	}
	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentas.gridy = iYPanelCamposPresupuestoVentas;
	this.gridBagConstraintsPresupuestoVentas.gridx = iXPanelCamposPresupuestoVentas++;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoVentas.add(this.jPanelcantidadPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);



	if(iXPanelCamposPresupuestoVentas % 1==0) {
		iXPanelCamposPresupuestoVentas=0;
		iYPanelCamposPresupuestoVentas++;
	}
	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentas.gridy = iYPanelCamposPresupuestoVentas;
	this.gridBagConstraintsPresupuestoVentas.gridx = iXPanelCamposPresupuestoVentas++;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoVentas.add(this.jPanelvalorPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);



	if(iXPanelCamposPresupuestoVentas % 1==0) {
		iXPanelCamposPresupuestoVentas=0;
		iYPanelCamposPresupuestoVentas++;
	}
	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentas.gridy = iYPanelCamposPresupuestoVentas;
	this.gridBagConstraintsPresupuestoVentas.gridx = iXPanelCamposPresupuestoVentas++;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoVentas.add(this.jPanelporcentajePresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);



	if(iXPanelCamposPresupuestoVentas % 1==0) {
		iXPanelCamposPresupuestoVentas=0;
		iYPanelCamposPresupuestoVentas++;
	}
	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentas.gridy = iYPanelCamposPresupuestoVentas;
	this.gridBagConstraintsPresupuestoVentas.gridx = iXPanelCamposPresupuestoVentas++;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoVentas.add(this.jPanelcantidad_totalPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);



	if(iXPanelCamposPresupuestoVentas % 1==0) {
		iXPanelCamposPresupuestoVentas=0;
		iYPanelCamposPresupuestoVentas++;
	}
	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentas.gridy = iYPanelCamposPresupuestoVentas;
	this.gridBagConstraintsPresupuestoVentas.gridx = iXPanelCamposPresupuestoVentas++;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoVentas.add(this.jPanelvalor_totalPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);



	if(iXPanelCamposPresupuestoVentas % 1==0) {
		iXPanelCamposPresupuestoVentas=0;
		iYPanelCamposPresupuestoVentas++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentas.gridy = iYPanelCamposOcultosPresupuestoVentas;
	this.gridBagConstraintsPresupuestoVentas.gridx = iXPanelCamposOcultosPresupuestoVentas++;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPresupuestoVentas.add(this.jPanelid_empresaPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);



	if(iXPanelCamposOcultosPresupuestoVentas % 1==0) {
		iXPanelCamposOcultosPresupuestoVentas=0;
		iYPanelCamposOcultosPresupuestoVentas++;
	}
	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentas.gridy = iYPanelCamposOcultosPresupuestoVentas;
	this.gridBagConstraintsPresupuestoVentas.gridx = iXPanelCamposOcultosPresupuestoVentas++;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPresupuestoVentas.add(this.jPanelid_sucursalPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);



	if(iXPanelCamposOcultosPresupuestoVentas % 1==0) {
		iXPanelCamposOcultosPresupuestoVentas=0;
		iYPanelCamposOcultosPresupuestoVentas++;
	}
	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentas.gridy = iYPanelCamposOcultosPresupuestoVentas;
	this.gridBagConstraintsPresupuestoVentas.gridx = iXPanelCamposOcultosPresupuestoVentas++;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPresupuestoVentas.add(this.jPanelid_ejercicioPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);



	if(iXPanelCamposOcultosPresupuestoVentas % 1==0) {
		iXPanelCamposOcultosPresupuestoVentas=0;
		iYPanelCamposOcultosPresupuestoVentas++;
	}
	this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentas.gridy = iYPanelCamposOcultosPresupuestoVentas;
	this.gridBagConstraintsPresupuestoVentas.gridx = iXPanelCamposOcultosPresupuestoVentas++;
	this.gridBagConstraintsPresupuestoVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPresupuestoVentas.add(this.jPanelid_periodoPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);



	if(iXPanelCamposOcultosPresupuestoVentas % 1==0) {
		iXPanelCamposOcultosPresupuestoVentas=0;
		iYPanelCamposOcultosPresupuestoVentas++;
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
			
		GridBagLayout gridaBagLayoutAccionesPresupuestoVentas= new GridBagLayout();
		this.jPanelAccionesPresupuestoVentas.setLayout(gridaBagLayoutAccionesPresupuestoVentas);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPresupuestoVentas= new GridBagLayout();
		this.jPanelAccionesFormularioPresupuestoVentas.setLayout(gridaBagLayoutAccionesFormularioPresupuestoVentas);
		
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPresupuestoVentas.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPresupuestoVentas.add(this.jComboBoxTiposAccionesFormularioPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);

		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPresupuestoVentas.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPresupuestoVentas.add(this.jCheckBoxPostAccionNuevoPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.presupuestoventasSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPresupuestoVentas.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPresupuestoVentas.add(this.jCheckBoxPostAccionSinCerrarPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.presupuestoventasSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.presupuestoventasSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPresupuestoVentas.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPresupuestoVentas.add(this.jCheckBoxPostAccionSinMensajePresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentas.gridx = iPosXAccion++;
			
		this.jPanelAccionesPresupuestoVentas.add(this.jButtonModificarPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);							

		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentas.gridx =iPosXAccion++;
			
		this.jPanelAccionesPresupuestoVentas.add(this.jButtonEliminarPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
		
			
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.gridy = 0;		
		this.gridBagConstraintsPresupuestoVentas.gridx = iPosXAccion++;
		
		this.jPanelAccionesPresupuestoVentas.add(this.jButtonActualizarPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);


		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.gridy = 0;		
		this.gridBagConstraintsPresupuestoVentas.gridx = iPosXAccion++;
		
		this.jPanelAccionesPresupuestoVentas.add(this.jButtonGuardarCambiosPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);	
		
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.gridy = 0;		
		this.gridBagConstraintsPresupuestoVentas.gridx =iPosXAccion++;
		
		this.jPanelAccionesPresupuestoVentas.add(this.jButtonCancelarPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPresupuestoVentas = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPresupuestoVentas);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();						
			this.gridBagConstraintsPresupuestoVentas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresupuestoVentas.gridx = 0;		
			//this.gridBagConstraintsPresupuestoVentas.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPresupuestoVentas.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPresupuestoVentas.gridx =0;
		this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPresupuestoVentas.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PresupuestoVentasJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePresupuestoVentas = new PresupuestoVentasBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Presupuesto Ventas DATOS");
			
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
		    
			PresupuestoVentasModel presupuestoventasModel=new PresupuestoVentasModel(this);
			
			//SI USARA CLASE INTERNA
			//PresupuestoVentasModel.PresupuestoVentasFocusTraversalPolicy presupuestoventasFocusTraversalPolicy = presupuestoventasModel.new PresupuestoVentasFocusTraversalPolicy(this);
			
			//presupuestoventasFocusTraversalPolicy.setpresupuestoventasJInternalFrame(this);
			
			this.setFocusTraversalPolicy(presupuestoventasModel);
			
			
			this.jContentPaneDetallePresupuestoVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePresupuestoVentas = new GridBagLayout();	
			this.jContentPaneDetallePresupuestoVentas.setLayout(gridaBagLayoutDetallePresupuestoVentas);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPresupuestoVentas = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
				this.gridBagConstraintsPresupuestoVentas.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPresupuestoVentas.gridx = 0;
					
				
				this.jContentPaneDetallePresupuestoVentas.add(jTtoolBarDetallePresupuestoVentas, gridBagConstraintsPresupuestoVentas);								
				
}
			
			this.jScrollPanelDatosEdicionPresupuestoVentas=   new JScrollPane(jContentPaneDetallePresupuestoVentas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPresupuestoVentas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresupuestoVentas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresupuestoVentas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPresupuestoVentas=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPresupuestoVentas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresupuestoVentas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresupuestoVentas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPresupuestoVentas.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPresupuestoVentas.gridx = 0;
	        
			this.jContentPaneDetallePresupuestoVentas.add(jPanelCamposPresupuestoVentas, gridBagConstraintsPresupuestoVentas);
			
			
			
			
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
						&& presupuestoventasSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.presupuestoventasSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPresupuestoVentas= new GridBagConstraints();
						this.gridBagConstraintsPresupuestoVentas.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPresupuestoVentas.gridx = 0;
						this.jContentPaneDetallePresupuestoVentas.add(this.jTabbedPaneRelacionesPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPresupuestoVentas.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPresupuestoVentas.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
					this.gridBagConstraintsPresupuestoVentas.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPresupuestoVentas.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPresupuestoVentas.gridx = 0;
					
				
					this.jContentPaneDetallePresupuestoVentas.add(jPanelCamposOcultosPresupuestoVentas, gridBagConstraintsPresupuestoVentas);
				
					this.jPanelCamposOcultosPresupuestoVentas.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPresupuestoVentas.gridx = 0;
	        this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePresupuestoVentas.add(this.jPanelAccionesFormularioPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);							
			
			
			
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
	        this.gridBagConstraintsPresupuestoVentas.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPresupuestoVentas.gridx = 0;
	        
			
			this.jContentPaneDetallePresupuestoVentas.add(this.jPanelAccionesPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPresupuestoVentas);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPresupuestoVentas=   new JScrollPane(this.jPanelCamposPresupuestoVentas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPresupuestoVentas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresupuestoVentas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresupuestoVentas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPresupuestoVentas.gridx = 0;
			this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPresupuestoVentas.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPresupuestoVentas.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);			
			
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPresupuestoVentas.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoVentas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
			
			
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoVentas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
		
			
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoVentas.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPresupuestoVentas;//jContentPane;
		
		return jScrollPanelDatosEdicionPresupuestoVentas;
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
